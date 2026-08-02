package h1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import e1.InterfaceC4141h;
import e1.Z;
import h1.InterfaceC4411g;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* renamed from: h1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4414j implements InterfaceC4141h {

    /* renamed from: e, reason: collision with root package name */
    public static final Ra.t f47543e = Ra.u.a(new Ra.t() { // from class: h1.h
        @Override // Ra.t
        public final Object get() {
            Ta.q b10;
            b10 = Ta.r.b(Executors.newSingleThreadExecutor());
            return b10;
        }
    });

    /* renamed from: a, reason: collision with root package name */
    public final Ta.q f47544a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4411g.a f47545b;

    /* renamed from: c, reason: collision with root package name */
    public final BitmapFactory.Options f47546c;

    /* renamed from: d, reason: collision with root package name */
    public final int f47547d;

    public C4414j(Ta.q qVar, InterfaceC4411g.a aVar, BitmapFactory.Options options, int i10) {
        this.f47544a = qVar;
        this.f47545b = aVar;
        this.f47546c = options;
        this.f47547d = i10;
    }

    public static Bitmap e(InterfaceC4411g interfaceC4411g, Uri uri, BitmapFactory.Options options, int i10) {
        try {
            interfaceC4411g.b(new C4418n(uri));
            byte[] b10 = AbstractC4417m.b(interfaceC4411g);
            return AbstractC4407c.a(b10, b10.length, options, i10);
        } finally {
            interfaceC4411g.close();
        }
    }

    @Override // e1.InterfaceC4141h
    public boolean a(String str) {
        return Z.M0(str);
    }

    @Override // e1.InterfaceC4141h
    public Ta.o b(final Uri uri) {
        return this.f47544a.submit(new Callable() { // from class: h1.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap e10;
                e10 = C4414j.e(r0.f47545b.a(), uri, r0.f47546c, C4414j.this.f47547d);
                return e10;
            }
        });
    }
}

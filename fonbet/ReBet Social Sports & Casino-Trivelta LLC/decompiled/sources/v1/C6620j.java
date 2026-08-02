package v1;

import android.content.Context;
import android.os.Build;
import b1.AbstractC2335D;
import e1.AbstractC4156x;
import e1.Z;
import v1.C6613c;
import v1.InterfaceC6627q;
import v1.Q;

/* renamed from: v1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6620j implements InterfaceC6627q.b {

    /* renamed from: b, reason: collision with root package name */
    public final Context f66966b;

    /* renamed from: c, reason: collision with root package name */
    public final Ra.t f66967c;

    /* renamed from: d, reason: collision with root package name */
    public final Ra.t f66968d;

    /* renamed from: e, reason: collision with root package name */
    public int f66969e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f66970f;

    public C6620j() {
        this.f66969e = 0;
        this.f66970f = false;
        this.f66966b = null;
        this.f66967c = null;
        this.f66968d = null;
    }

    @Override // v1.InterfaceC6627q.b
    public InterfaceC6627q b(InterfaceC6627q.a aVar) {
        Ra.t tVar;
        int i10 = this.f66969e;
        if (i10 != 1 && (i10 != 0 || !d())) {
            return new Q.b().b(aVar);
        }
        int k10 = AbstractC2335D.k(aVar.f66978c.f20543o);
        AbstractC4156x.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + Z.z0(k10));
        Ra.t tVar2 = this.f66967c;
        C6613c.b bVar = (tVar2 == null || (tVar = this.f66968d) == null) ? new C6613c.b(k10) : new C6613c.b(tVar2, tVar);
        bVar.f(this.f66970f);
        return bVar.b(aVar);
    }

    public C6620j c() {
        this.f66969e = 1;
        return this;
    }

    public final boolean d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return true;
        }
        Context context = this.f66966b;
        return context != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    public C6620j(Context context) {
        this(context, null, null);
    }

    public C6620j(Context context, Ra.t tVar, Ra.t tVar2) {
        this.f66966b = context;
        this.f66969e = 0;
        this.f66970f = false;
        this.f66967c = tVar;
        this.f66968d = tVar2;
    }
}

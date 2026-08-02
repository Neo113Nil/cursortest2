package w7;

import G6.h;
import H7.f;
import H7.k;
import H7.o;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.impl.d;
import java.util.ArrayList;
import java.util.List;
import v7.C6650e;
import v7.InterfaceC6646a;
import v7.InterfaceC6648c;
import z7.AbstractC6940d;

/* renamed from: w7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6720e implements InterfaceC6719d {

    /* renamed from: e, reason: collision with root package name */
    public static InterfaceC6718c f67488e = g("com.facebook.animated.gif.GifImage");

    /* renamed from: f, reason: collision with root package name */
    public static InterfaceC6718c f67489f = g("com.facebook.animated.webp.WebPImage");

    /* renamed from: a, reason: collision with root package name */
    public final com.facebook.imagepipeline.animated.impl.b f67490a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC6940d f67491b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f67492c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f67493d;

    public C6720e(com.facebook.imagepipeline.animated.impl.b bVar, AbstractC6940d abstractC6940d, boolean z10) {
        this(bVar, abstractC6940d, z10, true);
    }

    public static InterfaceC6718c g(String str) {
        try {
            return (InterfaceC6718c) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // w7.InterfaceC6719d
    public H7.e a(k kVar, B7.d dVar, Bitmap.Config config) {
        if (f67489f == null) {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
        H6.a J10 = kVar.J();
        D6.k.g(J10);
        try {
            h hVar = (h) J10.z0();
            H7.e f10 = f(kVar.T1(), dVar, hVar.j() != null ? f67489f.e(hVar.j(), dVar) : f67489f.f(hVar.u(), hVar.size(), dVar), config);
            H6.a.U(J10);
            return f10;
        } catch (Throwable th2) {
            H6.a.U(J10);
            throw th2;
        }
    }

    @Override // w7.InterfaceC6719d
    public H7.e b(k kVar, B7.d dVar, Bitmap.Config config) {
        if (f67488e == null) {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
        H6.a J10 = kVar.J();
        D6.k.g(J10);
        try {
            h hVar = (h) J10.z0();
            H7.e f10 = f(kVar.T1(), dVar, hVar.j() != null ? f67488e.e(hVar.j(), dVar) : f67488e.f(hVar.u(), hVar.size(), dVar), config);
            H6.a.U(J10);
            return f10;
        } catch (Throwable th2) {
            H6.a.U(J10);
            throw th2;
        }
    }

    public final H6.a c(int i10, int i11, Bitmap.Config config) {
        H6.a d10 = this.f67491b.d(i10, i11, config);
        ((Bitmap) d10.z0()).eraseColor(0);
        ((Bitmap) d10.z0()).setHasAlpha(true);
        return d10;
    }

    public final H6.a d(InterfaceC6648c interfaceC6648c, Bitmap.Config config, int i10) {
        H6.a c10 = c(interfaceC6648c.getWidth(), interfaceC6648c.getHeight(), config);
        new com.facebook.imagepipeline.animated.impl.d(this.f67490a.a(C6650e.b(interfaceC6648c), null), this.f67492c, new a()).h(i10, (Bitmap) c10.z0());
        return c10;
    }

    public final List e(InterfaceC6648c interfaceC6648c, Bitmap.Config config) {
        InterfaceC6646a a10 = this.f67490a.a(C6650e.b(interfaceC6648c), null);
        ArrayList arrayList = new ArrayList(a10.a());
        com.facebook.imagepipeline.animated.impl.d dVar = new com.facebook.imagepipeline.animated.impl.d(a10, this.f67492c, new b(arrayList));
        for (int i10 = 0; i10 < a10.a(); i10++) {
            H6.a c10 = c(a10.getWidth(), a10.getHeight(), config);
            dVar.h(i10, (Bitmap) c10.z0());
            arrayList.add(c10);
        }
        return arrayList;
    }

    public final H7.e f(String str, B7.d dVar, InterfaceC6648c interfaceC6648c, Bitmap.Config config) {
        List list;
        H6.a aVar;
        H6.a aVar2 = null;
        try {
            int a10 = dVar.f822d ? interfaceC6648c.a() - 1 : 0;
            if (dVar.f825g) {
                f V10 = f.V(d(interfaceC6648c, config, a10), o.f4868d, 0);
                H6.a.U(null);
                H6.a.w0(null);
                return V10;
            }
            if (dVar.f824f) {
                list = e(interfaceC6648c, config);
                try {
                    aVar = H6.a.B((H6.a) list.get(a10));
                } catch (Throwable th2) {
                    th = th2;
                    H6.a.U(aVar2);
                    H6.a.w0(list);
                    throw th;
                }
            } else {
                list = null;
                aVar = null;
            }
            try {
                if (dVar.f821c && aVar == null) {
                    aVar = d(interfaceC6648c, config, a10);
                }
                H7.c cVar = new H7.c(C6650e.f(interfaceC6648c).k(aVar).j(a10).i(list).h(null).l(str).a(), this.f67493d);
                H6.a.U(aVar);
                H6.a.w0(list);
                return cVar;
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                H6.a.U(aVar2);
                H6.a.w0(list);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            list = null;
        }
    }

    public C6720e(com.facebook.imagepipeline.animated.impl.b bVar, AbstractC6940d abstractC6940d, boolean z10, boolean z11) {
        this.f67490a = bVar;
        this.f67491b = abstractC6940d;
        this.f67492c = z10;
        this.f67493d = z11;
    }

    /* renamed from: w7.e$a */
    public class a implements d.b {
        public a() {
        }

        @Override // com.facebook.imagepipeline.animated.impl.d.b
        public H6.a b(int i10) {
            return null;
        }

        @Override // com.facebook.imagepipeline.animated.impl.d.b
        public void a(int i10, Bitmap bitmap) {
        }
    }

    /* renamed from: w7.e$b */
    public class b implements d.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f67495a;

        public b(List list) {
            this.f67495a = list;
        }

        @Override // com.facebook.imagepipeline.animated.impl.d.b
        public H6.a b(int i10) {
            return H6.a.B((H6.a) this.f67495a.get(i10));
        }

        @Override // com.facebook.imagepipeline.animated.impl.d.b
        public void a(int i10, Bitmap bitmap) {
        }
    }
}

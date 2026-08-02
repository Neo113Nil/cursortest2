package F7;

import D6.n;
import H7.k;
import H7.o;
import H7.p;
import android.graphics.ColorSpace;
import java.io.InputStream;
import java.util.Map;
import u7.C6528b;

/* loaded from: classes2.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f3573a;

    /* renamed from: b, reason: collision with root package name */
    public final c f3574b;

    /* renamed from: c, reason: collision with root package name */
    public final c f3575c;

    /* renamed from: d, reason: collision with root package name */
    public final L7.d f3576d;

    /* renamed from: e, reason: collision with root package name */
    public final n f3577e;

    /* renamed from: f, reason: collision with root package name */
    public final c f3578f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f3579g;

    public class a implements c {
        public a() {
        }

        @Override // F7.c
        public H7.e a(k kVar, int i10, p pVar, B7.d dVar) {
            ColorSpace colorSpace;
            u7.c A02 = kVar.A0();
            if (((Boolean) b.this.f3577e.get()).booleanValue()) {
                colorSpace = dVar.f829k;
                if (colorSpace == null) {
                    colorSpace = kVar.w0();
                }
            } else {
                colorSpace = dVar.f829k;
            }
            ColorSpace colorSpace2 = colorSpace;
            if (A02 == C6528b.f66196b) {
                return b.this.f(kVar, i10, pVar, dVar, colorSpace2);
            }
            if (A02 == C6528b.f66198d) {
                return b.this.e(kVar, i10, pVar, dVar);
            }
            if (A02 == C6528b.f66205k) {
                return b.this.d(kVar, i10, pVar, dVar);
            }
            if (A02 == C6528b.f66208n) {
                return b.this.h(kVar, i10, pVar, dVar);
            }
            if (A02 != u7.c.f66212d) {
                return b.this.g(kVar, dVar);
            }
            throw new F7.a("unknown image format", kVar);
        }
    }

    public b(c cVar, c cVar2, c cVar3, L7.d dVar) {
        this(cVar, cVar2, cVar3, dVar, null);
    }

    @Override // F7.c
    public H7.e a(k kVar, int i10, p pVar, B7.d dVar) {
        InputStream D02;
        c cVar;
        c cVar2 = dVar.f828j;
        if (cVar2 != null) {
            return cVar2.a(kVar, i10, pVar, dVar);
        }
        u7.c A02 = kVar.A0();
        if ((A02 == null || A02 == u7.c.f66212d) && (D02 = kVar.D0()) != null) {
            A02 = u7.e.d(D02);
            kVar.j2(A02);
        }
        Map map = this.f3579g;
        return (map == null || (cVar = (c) map.get(A02)) == null) ? this.f3578f.a(kVar, i10, pVar, dVar) : cVar.a(kVar, i10, pVar, dVar);
    }

    public H7.e d(k kVar, int i10, p pVar, B7.d dVar) {
        c cVar;
        return (dVar.f825g || (cVar = this.f3574b) == null) ? g(kVar, dVar) : cVar.a(kVar, i10, pVar, dVar);
    }

    public H7.e e(k kVar, int i10, p pVar, B7.d dVar) {
        c cVar;
        if (kVar.getWidth() == -1 || kVar.getHeight() == -1) {
            throw new F7.a("image width or height is incorrect", kVar);
        }
        return (dVar.f825g || (cVar = this.f3573a) == null) ? g(kVar, dVar) : cVar.a(kVar, i10, pVar, dVar);
    }

    public H7.f f(k kVar, int i10, p pVar, B7.d dVar, ColorSpace colorSpace) {
        H6.a b10 = this.f3576d.b(kVar, dVar.f826h, null, i10, colorSpace);
        try {
            P7.b.a(null, b10);
            D6.k.g(b10);
            H7.f S02 = H7.f.S0(b10, pVar, kVar.Y0(), kVar.K0());
            S02.U("is_rounded", false);
            return S02;
        } finally {
            H6.a.U(b10);
        }
    }

    public H7.f g(k kVar, B7.d dVar) {
        H6.a a10 = this.f3576d.a(kVar, dVar.f826h, null, dVar.f829k);
        try {
            P7.b.a(null, a10);
            D6.k.g(a10);
            H7.f S02 = H7.f.S0(a10, o.f4868d, kVar.Y0(), kVar.K0());
            S02.U("is_rounded", false);
            return S02;
        } finally {
            H6.a.U(a10);
        }
    }

    public final H7.e h(k kVar, int i10, p pVar, B7.d dVar) {
        c cVar = this.f3575c;
        if (cVar != null) {
            return cVar.a(kVar, i10, pVar, dVar);
        }
        return null;
    }

    public b(c cVar, c cVar2, c cVar3, L7.d dVar, Map map) {
        this(cVar, cVar2, cVar3, dVar, map, D6.o.f2570b);
    }

    public b(c cVar, c cVar2, c cVar3, L7.d dVar, Map map, n nVar) {
        this.f3578f = new a();
        this.f3573a = cVar;
        this.f3574b = cVar2;
        this.f3575c = cVar3;
        this.f3576d = dVar;
        this.f3579g = map;
        this.f3577e = nVar;
    }
}

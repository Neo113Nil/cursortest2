package k2;

import j2.C7241a;
import j2.f;
import java.util.Iterator;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7468a extends j2.d {

    /* renamed from: n0, reason: collision with root package name */
    private float f70294n0;

    public C7468a(j2.f fVar) {
        super(fVar, f.d.ALIGN_VERTICALLY);
        this.f70294n0 = 0.5f;
    }

    @Override // j2.d, j2.C7241a, j2.e
    public final void apply() {
        Iterator<Object> it = this.f68890m0.iterator();
        while (it.hasNext()) {
            C7241a c11 = this.f68888k0.c(it.next());
            c11.k();
            Object obj = this.f68815N;
            if (obj != null) {
                c11.D(obj);
            } else {
                Object obj2 = this.f68816O;
                if (obj2 != null) {
                    c11.C(obj2);
                } else {
                    c11.D(0);
                }
            }
            Object obj3 = this.f68817P;
            if (obj3 != null) {
                c11.n(obj3);
            } else {
                Object obj4 = this.f68818Q;
                if (obj4 != null) {
                    c11.m(obj4);
                } else {
                    c11.m(0);
                }
            }
            float f7 = this.f70294n0;
            if (f7 != 0.5f) {
                c11.r(f7);
            }
        }
    }
}

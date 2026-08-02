package J1;

import com.google.common.collect.AbstractC3445z;
import com.google.common.collect.m0;
import e1.J;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3445z f5920a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5921b;

    public f(int i10, AbstractC3445z abstractC3445z) {
        this.f5921b = i10;
        this.f5920a = abstractC3445z;
    }

    public static a a(int i10, int i11, J j10) {
        switch (i10) {
            case 1718776947:
                return g.d(i11, j10);
            case 1751742049:
                return c.b(j10);
            case 1752331379:
                return d.c(j10);
            case 1852994675:
                return h.a(j10);
            default:
                return null;
        }
    }

    public static f c(int i10, J j10) {
        AbstractC3445z.a aVar = new AbstractC3445z.a();
        int j11 = j10.j();
        int i11 = -2;
        while (j10.a() > 8) {
            int z10 = j10.z();
            int g10 = j10.g() + j10.z();
            j10.a0(g10);
            a c10 = z10 == 1414744396 ? c(j10.z(), j10) : a(z10, i11, j10);
            if (c10 != null) {
                if (c10.getType() == 1752331379) {
                    i11 = ((d) c10).b();
                }
                aVar.a(c10);
            }
            j10.b0(g10);
            j10.a0(j11);
        }
        return new f(i10, aVar.m());
    }

    public a b(Class cls) {
        m0 it = this.f5920a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // J1.a
    public int getType() {
        return this.f5921b;
    }
}

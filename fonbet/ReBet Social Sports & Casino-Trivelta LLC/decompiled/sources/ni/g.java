package ni;

import net.time4j.Y;
import net.time4j.a0;
import oi.o;

/* loaded from: classes5.dex */
public class g extends e {
    private static final long serialVersionUID = -84764920511581480L;

    /* renamed from: h, reason: collision with root package name */
    public final transient a0 f58578h;

    public g(Class cls, a0 a0Var) {
        super("DAY_OF_WEEK", cls, Y.class, 'E');
        this.f58578h = a0Var;
    }

    @Override // oi.p
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public Y c() {
        return this.f58578h.f().d(6);
    }

    @Override // oi.p
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public Y d0() {
        return this.f58578h.f();
    }

    @Override // ni.e
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public int G(Y y10) {
        return y10.c(this.f58578h);
    }

    @Override // oi.AbstractC5909e, java.util.Comparator
    /* renamed from: q */
    public int compare(o oVar, o oVar2) {
        int c10 = ((Y) oVar.j(this)).c(this.f58578h);
        int c11 = ((Y) oVar2.j(this)).c(this.f58578h);
        if (c10 < c11) {
            return -1;
        }
        return c10 == c11 ? 0 : 1;
    }
}

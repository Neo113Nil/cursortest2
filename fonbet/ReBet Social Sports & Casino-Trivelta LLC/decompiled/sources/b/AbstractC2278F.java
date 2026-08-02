package b;

/* renamed from: b.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2278F extends w0 {

    /* renamed from: d, reason: collision with root package name */
    public final C2307e0 f24062d;

    /* renamed from: f, reason: collision with root package name */
    public final C2290S f24063f;

    /* renamed from: g, reason: collision with root package name */
    public final w0 f24064g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24065h;

    /* renamed from: i, reason: collision with root package name */
    public final w0 f24066i;

    public AbstractC2278F(C2307e0 c2307e0, C2290S c2290s, w0 w0Var, int i10, w0 w0Var2) {
        this.f24062d = c2307e0;
        this.f24063f = c2290s;
        this.f24064g = w0Var;
        this.f24065h = j(i10);
        this.f24066i = k(i10, w0Var2);
    }

    public static int j(int i10) {
        if (i10 >= 0 && i10 <= 2) {
            return i10;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i10);
    }

    public static w0 k(int i10, w0 w0Var) {
        if (i10 != 1) {
            if (i10 == 2 && !AbstractC2311h.class.isInstance(w0Var)) {
                throw new IllegalStateException("unexpected object: ".concat(w0Var.getClass().getName()));
            }
        } else if (!k0.class.isInstance(w0Var)) {
            throw new IllegalStateException("unexpected object: ".concat(w0Var.getClass().getName()));
        }
        return w0Var;
    }

    public static w0 l(AbstractC2312i abstractC2312i) {
        int i10 = abstractC2312i.f24116f;
        if (i10 != 128) {
            throw new IllegalStateException("Expected CONTEXT tag but found ".concat(i10 != 64 ? i10 != 128 ? i10 != 192 ? "UNIVERSAL" : "PRIVATE" : "CONTEXT" : "APPLICATION"));
        }
        int i11 = abstractC2312i.f24117g;
        if (i11 == 0) {
            if (!abstractC2312i.m()) {
                throw new IllegalStateException("object implicit - explicit expected.");
            }
            InterfaceC2323t interfaceC2323t = abstractC2312i.f24118h;
            w0 d10 = interfaceC2323t instanceof w0 ? (w0) interfaceC2323t : interfaceC2323t.d();
            d10.getClass();
            return d10;
        }
        if (i11 == 1) {
            return (k0) k0.f24130d.a(abstractC2312i);
        }
        if (i11 == 2) {
            return (AbstractC2311h) AbstractC2311h.f24113d.a(abstractC2312i);
        }
        throw new IllegalArgumentException("invalid tag: " + AbstractC2324u.a(abstractC2312i.f24116f, abstractC2312i.f24117g));
    }

    public static w0 m(F0 f02, int i10) {
        if (f02.m() > i10) {
            return f02.j(i10).d();
        }
        throw new IllegalArgumentException("too few objects in input sequence");
    }

    @Override // b.w0
    public final int a(boolean z10) {
        return n().a(z10);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.k(z10, 40);
        n().b(q0Var, false);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        C2290S c2290s;
        C2290S c2290s2;
        w0 w0Var2;
        w0 w0Var3;
        if (this == w0Var) {
            return true;
        }
        if (!(w0Var instanceof AbstractC2278F)) {
            return false;
        }
        AbstractC2278F abstractC2278F = (AbstractC2278F) w0Var;
        C2307e0 c2307e0 = this.f24062d;
        C2307e0 c2307e02 = abstractC2278F.f24062d;
        if ((c2307e0 == c2307e02 || (c2307e0 != null && c2307e02 != null && c2307e0.equals(c2307e02))) && (((c2290s = this.f24063f) == (c2290s2 = abstractC2278F.f24063f) || (c2290s != null && c2290s2 != null && c2290s.equals(c2290s2))) && (((w0Var2 = this.f24064g) == (w0Var3 = abstractC2278F.f24064g) || (w0Var2 != null && w0Var3 != null && w0Var2.equals(w0Var3))) && this.f24065h == abstractC2278F.f24065h))) {
            w0 w0Var4 = this.f24066i;
            w0 w0Var5 = abstractC2278F.f24066i;
            if (w0Var4 == w0Var5) {
                w0Var4.getClass();
            } else if (w0Var4.c(w0Var5)) {
            }
            return true;
        }
        return false;
    }

    @Override // b.w0
    public final boolean f() {
        return true;
    }

    @Override // b.w0
    public w0 h() {
        return new r0(this.f24062d, this.f24063f, this.f24064g, this.f24065h, this.f24066i);
    }

    @Override // b.w0
    public final int hashCode() {
        C2307e0 c2307e0 = this.f24062d;
        int hashCode = c2307e0 == null ? 0 : c2307e0.hashCode();
        C2290S c2290s = this.f24063f;
        int hashCode2 = hashCode ^ (c2290s == null ? 0 : c2290s.hashCode());
        w0 w0Var = this.f24064g;
        return ((hashCode2 ^ (w0Var != null ? w0Var.hashCode() : 0)) ^ this.f24065h) ^ this.f24066i.hashCode();
    }

    public abstract F0 n();

    public AbstractC2278F(F0 f02) {
        int i10 = 0;
        w0 m10 = m(f02, 0);
        if (m10 instanceof C2307e0) {
            this.f24062d = (C2307e0) m10;
            m10 = m(f02, 1);
            i10 = 1;
        }
        if (m10 instanceof C2290S) {
            this.f24063f = (C2290S) m10;
            i10++;
            m10 = m(f02, i10);
        }
        if (!(m10 instanceof AbstractC2312i)) {
            this.f24064g = m10;
            i10++;
            m10 = m(f02, i10);
        }
        if (f02.m() != i10 + 1) {
            throw new IllegalArgumentException("input sequence too large");
        }
        if (!(m10 instanceof AbstractC2312i)) {
            throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
        }
        AbstractC2312i abstractC2312i = (AbstractC2312i) m10;
        this.f24065h = j(abstractC2312i.l());
        this.f24066i = l(abstractC2312i);
    }
}

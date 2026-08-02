package Ra;

/* loaded from: classes3.dex */
public final class q extends k {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object f10147a;

    public q(Object obj) {
        this.f10147a = obj;
    }

    @Override // Ra.k
    public Object b() {
        return this.f10147a;
    }

    @Override // Ra.k
    public boolean c() {
        return true;
    }

    @Override // Ra.k
    public Object e(Object obj) {
        n.l(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.f10147a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f10147a.equals(((q) obj).f10147a);
        }
        return false;
    }

    public int hashCode() {
        return this.f10147a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f10147a + ")";
    }
}

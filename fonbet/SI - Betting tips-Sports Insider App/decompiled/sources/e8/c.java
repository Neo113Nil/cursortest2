package e8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends b {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object f8773a;

    public c(Object obj) {
        this.f8773a = obj;
    }

    @Override // e8.b
    public final Object a() {
        return this.f8773a;
    }

    @Override // e8.b
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f8773a.equals(((c) obj).f8773a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8773a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8773a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }
}

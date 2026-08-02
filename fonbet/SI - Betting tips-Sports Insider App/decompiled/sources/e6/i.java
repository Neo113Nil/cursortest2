package e6;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8714a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8715b;

    public i(Object obj, String str) {
        this.f8714a = obj;
        this.f8715b = str;
    }

    public final String a() {
        int identityHashCode = System.identityHashCode(this.f8714a);
        String str = this.f8715b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(identityHashCode).length());
        sb2.append(str);
        sb2.append("@");
        sb2.append(identityHashCode);
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f8714a == iVar.f8714a && this.f8715b.equals(iVar.f8715b);
    }

    public final int hashCode() {
        return this.f8715b.hashCode() + (System.identityHashCode(this.f8714a) * 31);
    }
}

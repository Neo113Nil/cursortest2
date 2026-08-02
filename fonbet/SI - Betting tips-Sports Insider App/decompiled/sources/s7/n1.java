package s7;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public enum n1 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* renamed from: a, reason: collision with root package name */
    public final String f22916a;

    n1(String str) {
        this.f22916a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f22916a;
    }
}

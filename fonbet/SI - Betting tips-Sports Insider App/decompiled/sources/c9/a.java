package c9;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f3698a;

    /* renamed from: b, reason: collision with root package name */
    public int f3699b;

    /* renamed from: c, reason: collision with root package name */
    public String f3700c;

    /* renamed from: d, reason: collision with root package name */
    public String f3701d;

    /* renamed from: e, reason: collision with root package name */
    public long f3702e;

    /* renamed from: f, reason: collision with root package name */
    public long f3703f;

    /* renamed from: g, reason: collision with root package name */
    public String f3704g;

    /* renamed from: h, reason: collision with root package name */
    public byte f3705h;

    public final b a() {
        if (this.f3705h == 3 && this.f3699b != 0) {
            return new b(this.f3698a, this.f3699b, this.f3700c, this.f3701d, this.f3702e, this.f3703f, this.f3704g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f3699b == 0) {
            sb2.append(" registrationStatus");
        }
        if ((this.f3705h & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((this.f3705h & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
    }
}

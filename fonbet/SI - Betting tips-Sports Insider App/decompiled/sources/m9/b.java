package m9;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f20508a;

    /* renamed from: b, reason: collision with root package name */
    public String f20509b;

    /* renamed from: c, reason: collision with root package name */
    public String f20510c;

    /* renamed from: d, reason: collision with root package name */
    public String f20511d;

    /* renamed from: e, reason: collision with root package name */
    public long f20512e;

    /* renamed from: f, reason: collision with root package name */
    public byte f20513f;

    public final c a() {
        if (this.f20513f == 1 && this.f20508a != null && this.f20509b != null && this.f20510c != null && this.f20511d != null) {
            return new c(this.f20508a, this.f20509b, this.f20510c, this.f20511d, this.f20512e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f20508a == null) {
            sb2.append(" rolloutId");
        }
        if (this.f20509b == null) {
            sb2.append(" variantId");
        }
        if (this.f20510c == null) {
            sb2.append(" parameterKey");
        }
        if (this.f20511d == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f20513f) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
    }
}

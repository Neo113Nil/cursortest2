package w8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements t8.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25018a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25019b = false;

    /* renamed from: c, reason: collision with root package name */
    public t8.c f25020c;

    /* renamed from: d, reason: collision with root package name */
    public final f f25021d;

    public h(f fVar) {
        this.f25021d = fVar;
    }

    @Override // t8.g
    public final t8.g c(String str) {
        if (this.f25018a) {
            throw new t8.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f25018a = true;
        this.f25021d.d(this.f25020c, str, this.f25019b);
        return this;
    }

    @Override // t8.g
    public final t8.g d(boolean z5) {
        if (this.f25018a) {
            throw new t8.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f25018a = true;
        this.f25021d.c(this.f25020c, z5 ? 1 : 0, this.f25019b);
        return this;
    }
}

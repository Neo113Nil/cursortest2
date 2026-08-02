package f9;

/* loaded from: classes9.dex */
final class e extends AbstractC6467a {

    /* renamed from: a, reason: collision with root package name */
    private final String f63000a;

    /* renamed from: b, reason: collision with root package name */
    private final String f63001b;

    /* renamed from: c, reason: collision with root package name */
    private final String f63002c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f63003d;

    /* synthetic */ e(String str, String str2, String str3, boolean z11) {
        this.f63000a = str;
        this.f63001b = str2;
        this.f63002c = str3;
        this.f63003d = z11;
    }

    @Override // f9.AbstractC6467a
    final String b() {
        return this.f63000a;
    }

    @Override // f9.AbstractC6467a
    final String c() {
        return this.f63002c;
    }

    @Override // f9.AbstractC6467a
    final String d() {
        return this.f63001b;
    }

    @Override // f9.AbstractC6467a
    final boolean e() {
        return this.f63003d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6467a)) {
            return false;
        }
        AbstractC6467a abstractC6467a = (AbstractC6467a) obj;
        return this.f63000a.equals(abstractC6467a.b()) && this.f63001b.equals(abstractC6467a.d()) && this.f63002c.equals(abstractC6467a.c()) && this.f63003d == abstractC6467a.e();
    }

    public final int hashCode() {
        return ((((((this.f63000a.hashCode() ^ 1000003) * 1000003) ^ this.f63001b.hashCode()) * 1000003) ^ this.f63002c.hashCode()) * 1000003) ^ (true != this.f63003d ? 1237 : 1231);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VkpTextRecognizerOptions{configLabel=");
        sb2.append(this.f63000a);
        sb2.append(", modelDir=");
        sb2.append(this.f63001b);
        sb2.append(", languageHint=");
        sb2.append(this.f63002c);
        sb2.append(", enableLowLatencyInBackground=");
        return Pk0.a.a("}", sb2, this.f63003d);
    }
}

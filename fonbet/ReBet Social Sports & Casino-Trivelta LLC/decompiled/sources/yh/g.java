package yh;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f68423a;

    /* renamed from: b, reason: collision with root package name */
    public String f68424b;

    /* renamed from: c, reason: collision with root package name */
    public String f68425c;

    /* renamed from: d, reason: collision with root package name */
    public oh.g f68426d;

    public g(String str) {
        this.f68423a = str;
    }

    public AbstractC6897f a() {
        String str = this.f68423a;
        String str2 = this.f68424b;
        String str3 = this.f68425c;
        oh.g gVar = this.f68426d;
        if (gVar == null) {
            gVar = oh.g.empty();
        }
        return AbstractC6897f.c(str, str2, str3, gVar);
    }

    public g b(oh.g gVar) {
        this.f68426d = gVar;
        return this;
    }

    public g c(String str) {
        this.f68425c = str;
        return this;
    }

    public g d(String str) {
        this.f68424b = str;
        return this;
    }
}

package io.sentry;

/* loaded from: classes3.dex */
public final class l4 {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f52173a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f52174b;

    /* renamed from: c, reason: collision with root package name */
    public final Double f52175c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f52176d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f52177e;

    public l4(Boolean bool) {
        this(bool, null);
    }

    public Double a() {
        return this.f52177e;
    }

    public Boolean b() {
        return this.f52176d;
    }

    public Double c() {
        return this.f52175c;
    }

    public Double d() {
        return this.f52174b;
    }

    public Boolean e() {
        return this.f52173a;
    }

    public l4(Boolean bool, Double d10) {
        this(bool, d10, null, Boolean.FALSE, null);
    }

    public l4(Boolean bool, Double d10, Double d11) {
        this(bool, d10, d11, Boolean.FALSE, null);
    }

    public l4(Boolean bool, Double d10, Boolean bool2, Double d11) {
        this(bool, d10, null, bool2, d11);
    }

    public l4(Boolean bool, Double d10, Double d11, Boolean bool2, Double d12) {
        this.f52173a = bool;
        this.f52174b = d10;
        this.f52175c = d11;
        this.f52176d = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f52177e = d12;
    }
}

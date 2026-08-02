package d8;

import java.util.Arrays;

/* loaded from: classes2.dex */
public enum n {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    NATIVE_ONLY(true, true, false, false, false, true, true),
    KATANA_ONLY(false, true, false, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false, false),
    DIALOG_ONLY(false, true, true, false, true, true, true),
    DEVICE_AUTH(false, false, false, true, false, false, false);


    /* renamed from: a, reason: collision with root package name */
    public final boolean f45089a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f45090b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f45091c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f45092d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f45093e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f45094f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f45095g;

    n(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f45089a = z10;
        this.f45090b = z11;
        this.f45091c = z12;
        this.f45092d = z13;
        this.f45093e = z14;
        this.f45094f = z15;
        this.f45095g = z16;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static n[] valuesCustom() {
        n[] valuesCustom = values();
        return (n[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final boolean b() {
        return this.f45093e;
    }

    public final boolean c() {
        return this.f45092d;
    }

    public final boolean d() {
        return this.f45089a;
    }

    public final boolean e() {
        return this.f45095g;
    }

    public final boolean f() {
        return this.f45090b;
    }

    public final boolean g() {
        return this.f45091c;
    }
}

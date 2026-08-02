package vf0;

import B0.C2454a;
import G.g;
import Kk.C3532b;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qf0.c;

/* renamed from: vf0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10315a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f102876a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f102877b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f102878c;

    /* renamed from: d, reason: collision with root package name */
    private final int f102879d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f102880e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f102881f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f102882g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<String> f102883h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final c f102884i;

    /* renamed from: j, reason: collision with root package name */
    private final int f102885j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f102886k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f102887l;

    public C10315a(@NotNull String whiteDomain, boolean z11, @NotNull String grayDomain, int i11, boolean z12, boolean z13, boolean z14, @NotNull List<String> pingExtraDomains, @NotNull c pingProtocol, int i12, boolean z15, boolean z16) {
        Intrinsics.checkNotNullParameter(whiteDomain, "whiteDomain");
        Intrinsics.checkNotNullParameter(grayDomain, "grayDomain");
        Intrinsics.checkNotNullParameter(pingExtraDomains, "pingExtraDomains");
        Intrinsics.checkNotNullParameter(pingProtocol, "pingProtocol");
        this.f102876a = whiteDomain;
        this.f102877b = z11;
        this.f102878c = grayDomain;
        this.f102879d = i11;
        this.f102880e = z12;
        this.f102881f = z13;
        this.f102882g = z14;
        this.f102883h = pingExtraDomains;
        this.f102884i = pingProtocol;
        this.f102885j = i12;
        this.f102886k = z15;
        this.f102887l = z16;
    }

    public final int a() {
        return this.f102885j;
    }

    @NotNull
    public final String b() {
        return this.f102878c;
    }

    @NotNull
    public final List<String> c() {
        return this.f102883h;
    }

    public final int d() {
        return this.f102879d;
    }

    @NotNull
    public final c e() {
        return this.f102884i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10315a)) {
            return false;
        }
        C10315a c10315a = (C10315a) obj;
        return Intrinsics.d(this.f102876a, c10315a.f102876a) && this.f102877b == c10315a.f102877b && Intrinsics.d(this.f102878c, c10315a.f102878c) && this.f102879d == c10315a.f102879d && this.f102880e == c10315a.f102880e && this.f102881f == c10315a.f102881f && this.f102882g == c10315a.f102882g && Intrinsics.d(this.f102883h, c10315a.f102883h) && Intrinsics.d(this.f102884i, c10315a.f102884i) && this.f102885j == c10315a.f102885j && this.f102886k == c10315a.f102886k && this.f102887l == c10315a.f102887l;
    }

    @NotNull
    public final String f() {
        return this.f102876a;
    }

    public final boolean g() {
        return this.f102880e;
    }

    public final boolean h() {
        return this.f102877b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f102887l) + C3532b.a(C2454a.a(this.f102885j, (this.f102884i.hashCode() + g.b(C3532b.a(C3532b.a(C3532b.a(C2454a.a(this.f102879d, g.a(C3532b.a(this.f102876a.hashCode() * 31, 31, this.f102877b), 31, this.f102878c), 31), 31, this.f102880e), 31, this.f102881f), 31, this.f102882g), 31, this.f102883h)) * 31, 31), 31, this.f102886k);
    }

    public final boolean i() {
        return this.f102882g;
    }

    public final boolean j() {
        return this.f102886k;
    }

    public final boolean k() {
        return this.f102881f;
    }

    public final boolean l() {
        return this.f102887l;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitelistingConfiguration(whiteDomain=");
        sb2.append(this.f102876a);
        sb2.append(", isEnabled=");
        sb2.append(this.f102877b);
        sb2.append(", grayDomain=");
        sb2.append(this.f102878c);
        sb2.append(", pingIntervalInSeconds=");
        sb2.append(this.f102879d);
        sb2.append(", isAnalyticsEnabled=");
        sb2.append(this.f102880e);
        sb2.append(", isOnlyCellularNetworkMode=");
        sb2.append(this.f102881f);
        sb2.append(", isForcePingEnabled=");
        sb2.append(this.f102882g);
        sb2.append(", pingExtraDomains=");
        sb2.append(this.f102883h);
        sb2.append(", pingProtocol=");
        sb2.append(this.f102884i);
        sb2.append(", extraDomainsOnAppStartDelayMs=");
        sb2.append(this.f102885j);
        sb2.append(", isGrayDomainAnalyticsEnabled=");
        sb2.append(this.f102886k);
        sb2.append(", isWhiteDomainAnalyticsEnabled=");
        return Pk0.a.a(")", sb2, this.f102887l);
    }

    public C10315a() {
        this("", false, "google.com", 120, false, true, false, K.f71697a, c.b.f82072b, 0, false, false);
    }
}

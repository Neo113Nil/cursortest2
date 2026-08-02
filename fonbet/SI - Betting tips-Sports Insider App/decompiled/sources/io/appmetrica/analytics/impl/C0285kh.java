package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.kh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285kh extends N5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f14125d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14126e;

    /* renamed from: f, reason: collision with root package name */
    public int f14127f;

    /* renamed from: g, reason: collision with root package name */
    public int f14128g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14129h;

    /* renamed from: i, reason: collision with root package name */
    public int f14130i;
    public Boolean j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0208hh f14131k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0259jh f14132l;

    /* renamed from: m, reason: collision with root package name */
    public String f14133m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f14134n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f14135o;

    /* renamed from: p, reason: collision with root package name */
    public String f14136p;
    public List q;

    /* renamed from: r, reason: collision with root package name */
    public int f14137r;

    /* renamed from: s, reason: collision with root package name */
    public long f14138s;

    /* renamed from: t, reason: collision with root package name */
    public long f14139t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14140u;

    /* renamed from: v, reason: collision with root package name */
    public long f14141v;

    /* renamed from: w, reason: collision with root package name */
    public List f14142w;

    /* renamed from: x, reason: collision with root package name */
    public Set f14143x = new HashSet();

    public C0285kh(X4 x42) {
        this.f14132l = x42;
    }

    public final void a(int i5) {
        this.f14137r = i5;
    }

    public final void b(List<String> list) {
        this.q = list;
    }

    public final String c() {
        return this.f14133m;
    }

    public final void d(boolean z5) {
        this.f14125d = z5;
    }

    public final void e(boolean z5) {
        this.f14129h = z5;
    }

    public final void f(boolean z5) {
        this.f14134n = z5;
    }

    public final boolean g() {
        return this.f14140u;
    }

    @NonNull
    public final String h() {
        return (String) WrapUtils.getOrDefault(this.f14136p, "");
    }

    public final boolean i() {
        return this.f14131k.a(this.j);
    }

    public final int j() {
        return this.f14128g;
    }

    public final long k() {
        return this.f14141v;
    }

    public final int l() {
        return this.f14130i;
    }

    public final long m() {
        return this.f14138s;
    }

    public final long n() {
        return this.f14139t;
    }

    public final List<String> o() {
        return this.q;
    }

    public final int p() {
        return this.f14127f;
    }

    public final boolean q() {
        return this.f14135o;
    }

    public final boolean r() {
        return this.f14126e;
    }

    public final boolean s() {
        return this.f14125d;
    }

    public final boolean t() {
        return this.f14134n;
    }

    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f14125d + ", mFirstActivationAsUpdate=" + this.f14126e + ", mSessionTimeout=" + this.f14127f + ", mDispatchPeriod=" + this.f14128g + ", mLogEnabled=" + this.f14129h + ", mMaxReportsCount=" + this.f14130i + ", dataSendingEnabledFromArguments=" + this.j + ", dataSendingStrategy=" + this.f14131k + ", mPreloadInfoSendingStrategy=" + this.f14132l + ", mApiKey='" + this.f14133m + "', mPermissionsCollectingEnabled=" + this.f14134n + ", mFeaturesCollectingEnabled=" + this.f14135o + ", mClidsFromStartupResponse='" + this.f14136p + "', mReportHosts=" + this.q + ", mAttributionId=" + this.f14137r + ", mPermissionsCollectingIntervalSeconds=" + this.f14138s + ", mPermissionsForceSendIntervalSeconds=" + this.f14139t + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f14140u + ", mMaxReportsInDbCount=" + this.f14141v + ", mCertificates=" + this.f14142w + "} " + super.toString();
    }

    public final boolean u() {
        return isIdentifiersValid() && !lo.a((Collection) this.q) && this.f14140u;
    }

    public final boolean v() {
        return ((X4) this.f14132l).B();
    }

    public final void a(long j) {
        this.f14141v = j;
    }

    public final void b(long j) {
        this.f14138s = j;
    }

    public final void c(long j) {
        this.f14139t = j;
    }

    public final void d(int i5) {
        this.f14127f = i5;
    }

    @NonNull
    public final Set<String> e() {
        return this.f14143x;
    }

    public final List<String> f() {
        return this.f14142w;
    }

    public final void a(@NonNull List<String> list) {
        this.f14142w = list;
    }

    public final void b(boolean z5) {
        this.f14135o = z5;
    }

    public final void c(boolean z5) {
        this.f14126e = z5;
    }

    public final int d() {
        return this.f14137r;
    }

    public final void a(Boolean bool, @NonNull InterfaceC0208hh interfaceC0208hh) {
        this.j = bool;
        this.f14131k = interfaceC0208hh;
    }

    public final void b(int i5) {
        this.f14128g = i5;
    }

    public final void c(int i5) {
        this.f14130i = i5;
    }

    public final void a(boolean z5) {
        this.f14140u = z5;
    }

    public final void a(@NonNull Set<String> set) {
        this.f14143x = set;
    }
}

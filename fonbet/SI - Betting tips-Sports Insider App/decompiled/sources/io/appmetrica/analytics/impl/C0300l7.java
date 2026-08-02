package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.l7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300l7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14174a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14175b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14176c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14177d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14178e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14179f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14180g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14181h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14182i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f14183k;

    /* renamed from: l, reason: collision with root package name */
    public final String f14184l;

    /* renamed from: m, reason: collision with root package name */
    public final String f14185m;

    /* renamed from: n, reason: collision with root package name */
    public final String f14186n;

    public C0300l7(C0150fb c0150fb) {
        this.f14174a = c0150fb.b("dId");
        this.f14175b = c0150fb.b("uId");
        this.f14176c = c0150fb.b("analyticsSdkVersionName");
        this.f14177d = c0150fb.b("kitBuildNumber");
        this.f14178e = c0150fb.b("kitBuildType");
        this.f14179f = c0150fb.b("appVer");
        this.f14180g = c0150fb.optString("app_debuggable", CommonUrlParts.Values.FALSE_INTEGER);
        this.f14181h = c0150fb.b("appBuild");
        this.f14182i = c0150fb.b("osVer");
        this.f14183k = c0150fb.b("lang");
        this.f14184l = c0150fb.b("root");
        this.f14185m = c0150fb.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int optInt = c0150fb.optInt("osApiLev", -1);
        this.j = optInt == -1 ? null : String.valueOf(optInt);
        int optInt2 = c0150fb.optInt("attribution_id", 0);
        this.f14186n = optInt2 > 0 ? String.valueOf(optInt2) : null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DbNetworkTaskConfig{deviceId='");
        sb2.append(this.f14174a);
        sb2.append("', uuid='");
        sb2.append(this.f14175b);
        sb2.append("', analyticsSdkVersionName='");
        sb2.append(this.f14176c);
        sb2.append("', kitBuildNumber='");
        sb2.append(this.f14177d);
        sb2.append("', kitBuildType='");
        sb2.append(this.f14178e);
        sb2.append("', appVersion='");
        sb2.append(this.f14179f);
        sb2.append("', appDebuggable='");
        sb2.append(this.f14180g);
        sb2.append("', appBuildNumber='");
        sb2.append(this.f14181h);
        sb2.append("', osVersion='");
        sb2.append(this.f14182i);
        sb2.append("', osApiLevel='");
        sb2.append(this.j);
        sb2.append("', locale='");
        sb2.append(this.f14183k);
        sb2.append("', deviceRootStatus='");
        sb2.append(this.f14184l);
        sb2.append("', appFramework='");
        sb2.append(this.f14185m);
        sb2.append("', attributionId='");
        return d9.e.l(sb2, this.f14186n, "'}");
    }

    public C0300l7() {
        this.f14174a = null;
        this.f14175b = null;
        this.f14176c = null;
        this.f14177d = null;
        this.f14178e = null;
        this.f14179f = null;
        this.f14180g = null;
        this.f14181h = null;
        this.f14182i = null;
        this.j = null;
        this.f14183k = null;
        this.f14184l = null;
        this.f14185m = null;
        this.f14186n = null;
    }
}

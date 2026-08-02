package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.jm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264jm {
    public final Map A;
    public final B9 B;

    /* renamed from: a, reason: collision with root package name */
    public final String f14056a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14057b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14058c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14059d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14060e;

    /* renamed from: f, reason: collision with root package name */
    public final List f14061f;

    /* renamed from: g, reason: collision with root package name */
    public final List f14062g;

    /* renamed from: h, reason: collision with root package name */
    public final List f14063h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f14064i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final String f14065k;

    /* renamed from: l, reason: collision with root package name */
    public final String f14066l;

    /* renamed from: m, reason: collision with root package name */
    public final C0297l4 f14067m;

    /* renamed from: n, reason: collision with root package name */
    public final long f14068n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f14069o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f14070p;
    public final String q;

    /* renamed from: r, reason: collision with root package name */
    public final Gm f14071r;

    /* renamed from: s, reason: collision with root package name */
    public final C0606xe f14072s;

    /* renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f14073t;

    /* renamed from: u, reason: collision with root package name */
    public final long f14074u;

    /* renamed from: v, reason: collision with root package name */
    public final long f14075v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f14076w;

    /* renamed from: x, reason: collision with root package name */
    public final C0091d3 f14077x;

    /* renamed from: y, reason: collision with root package name */
    public final C0320m2 f14078y;

    /* renamed from: z, reason: collision with root package name */
    public final Cm f14079z;

    public C0264jm(C0238im c0238im) {
        String str;
        long j;
        long j6;
        Cm cm;
        Map map;
        B9 b92;
        this.f14056a = c0238im.f13956a;
        List list = c0238im.f13957b;
        this.f14057b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.f14058c = c0238im.f13958c;
        this.f14059d = c0238im.f13959d;
        this.f14060e = c0238im.f13960e;
        List list2 = c0238im.f13961f;
        this.f14061f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c0238im.f13962g;
        this.f14062g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c0238im.f13963h;
        this.f14063h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map2 = c0238im.f13964i;
        this.f14064i = map2 != null ? CollectionUtils.unmodifiableMapCopy(map2) : null;
        this.j = c0238im.j;
        this.f14065k = c0238im.f13965k;
        this.f14067m = c0238im.f13967m;
        this.f14072s = c0238im.f13968n;
        this.f14068n = c0238im.f13969o;
        this.f14069o = c0238im.f13970p;
        this.f14066l = c0238im.f13966l;
        this.f14070p = c0238im.q;
        str = c0238im.f13971r;
        this.q = str;
        this.f14071r = c0238im.f13972s;
        j = c0238im.f13973t;
        this.f14074u = j;
        j6 = c0238im.f13974u;
        this.f14075v = j6;
        this.f14076w = c0238im.f13975v;
        RetryPolicyConfig retryPolicyConfig = c0238im.f13976w;
        if (retryPolicyConfig == null) {
            C0589wm c0589wm = new C0589wm();
            this.f14073t = new RetryPolicyConfig(c0589wm.f14872w, c0589wm.f14873x);
        } else {
            this.f14073t = retryPolicyConfig;
        }
        this.f14077x = c0238im.f13977x;
        this.f14078y = c0238im.f13978y;
        cm = c0238im.f13979z;
        this.f14079z = cm == null ? new Cm(I7.f12374b.f14755a) : c0238im.f13979z;
        map = c0238im.A;
        this.A = map == null ? Collections.EMPTY_MAP : c0238im.A;
        b92 = c0238im.B;
        this.B = b92;
    }

    public final C0238im a(C0297l4 c0297l4) {
        C0238im c0238im = new C0238im(c0297l4);
        c0238im.f13956a = this.f14056a;
        c0238im.f13961f = this.f14061f;
        c0238im.f13962g = this.f14062g;
        c0238im.j = this.j;
        c0238im.f13957b = this.f14057b;
        c0238im.f13958c = this.f14058c;
        c0238im.f13959d = this.f14059d;
        c0238im.f13960e = this.f14060e;
        c0238im.f13963h = this.f14063h;
        c0238im.f13964i = this.f14064i;
        c0238im.f13965k = this.f14065k;
        c0238im.f13966l = this.f14066l;
        c0238im.q = this.f14070p;
        c0238im.f13969o = this.f14068n;
        c0238im.f13970p = this.f14069o;
        c0238im.f13971r = this.q;
        c0238im.f13968n = this.f14072s;
        c0238im.f13973t = this.f14074u;
        c0238im.f13974u = this.f14075v;
        c0238im.f13972s = this.f14071r;
        c0238im.f13975v = this.f14076w;
        c0238im.f13976w = this.f14073t;
        c0238im.f13977x = this.f14077x;
        c0238im.f13978y = this.f14078y;
        c0238im.f13979z = this.f14079z;
        c0238im.A = this.A;
        c0238im.B = this.B;
        return c0238im;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f14056a + "', reportUrls=" + this.f14057b + ", getAdUrl='" + this.f14058c + "', reportAdUrl='" + this.f14059d + "', certificateUrl='" + this.f14060e + "', hostUrlsFromStartup=" + this.f14061f + ", hostUrlsFromClient=" + this.f14062g + ", diagnosticUrls=" + this.f14063h + ", customSdkHosts=" + this.f14064i + ", encodedClidsFromResponse='" + this.j + "', lastClientClidsForStartupRequest='" + this.f14065k + "', lastChosenForRequestClids='" + this.f14066l + "', collectingFlags=" + this.f14067m + ", obtainTime=" + this.f14068n + ", hadFirstStartup=" + this.f14069o + ", startupDidNotOverrideClids=" + this.f14070p + ", countryInit='" + this.q + "', statSending=" + this.f14071r + ", permissionsCollectingConfig=" + this.f14072s + ", retryPolicyConfig=" + this.f14073t + ", obtainServerTime=" + this.f14074u + ", firstStartupServerTime=" + this.f14075v + ", outdated=" + this.f14076w + ", cacheControl=" + this.f14077x + ", attributionConfig=" + this.f14078y + ", startupUpdateConfig=" + this.f14079z + ", modulesRemoteConfigs=" + this.A + ", externalAttributionConfig=" + this.B + '}';
    }
}

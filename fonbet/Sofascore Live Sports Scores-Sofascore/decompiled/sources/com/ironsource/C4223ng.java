package com.ironsource;

import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import defpackage.ljg;
import defpackage.lnb;
import defpackage.x5n;
import java.util.HashMap;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.ng, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4223ng {
    private final E0 a;

    public C4223ng(E0 e0) {
        this.a = e0;
    }

    public void a(@NonNull LevelPlayAdInfo levelPlayAdInfo, @NonNull LevelPlayAdInfo levelPlayAdInfo2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "oldAdNetwork=%s;oldInstanceId=%s;oldRevenue=%.3f;oldPrecision=%s;newAdNetwork=%s;newInstanceId=%s;newRevenue=%.3f;newPrecision=%s;delta=%.3f", levelPlayAdInfo.getAdNetwork(), levelPlayAdInfo.getInstanceId(), Double.valueOf(levelPlayAdInfo.getRevenue()), levelPlayAdInfo.getPrecision(), levelPlayAdInfo2.getAdNetwork(), levelPlayAdInfo2.getInstanceId(), Double.valueOf(levelPlayAdInfo2.getRevenue()), levelPlayAdInfo2.getPrecision(), Double.valueOf(levelPlayAdInfo2.getRevenue() - levelPlayAdInfo.getRevenue())));
        this.a.a(B0.TROUBLESHOOT_AD_INFO_CHANGED, hashMap);
    }

    public void b(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", str);
        this.a.a(B0.TROUBLESHOOT_LOAD_FAILED, hashMap);
    }

    public void c(String str) {
        this.a.a(B0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, com.appsflyer.internal.i.l("reason", str));
    }

    public void d(String str) {
        this.a.a(B0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, com.appsflyer.internal.i.l("reason", str));
    }

    public void e(String str) {
        this.a.a(B0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, com.appsflyer.internal.i.l("reason", str));
    }

    public void f(@NotNull String str) {
        this.a.a(B0.TROUBLESHOOT_ILLEGAL_STATE, com.appsflyer.internal.i.l("reason", str));
    }

    public void g(String str) {
        this.a.a(B0.TROUBLESHOOT_INTERNAL_ERROR, com.appsflyer.internal.i.l("reason", str));
    }

    public void h(@NotNull String str) {
        this.a.a(B0.TROUBLESHOOT_LOAD_SKIPPED, com.appsflyer.internal.i.l("reason", str));
    }

    public void i(String str) {
        this.a.a(B0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, com.appsflyer.internal.i.l("reason", str));
    }

    public void j(String str) {
        this.a.a(B0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, com.appsflyer.internal.i.l("reason", str));
    }

    public void k(String str) {
        this.a.a(B0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, com.appsflyer.internal.i.l("reason", str));
    }

    public void l(String str) {
        this.a.a(B0.TROUBLESHOOT_UNEXPECTED_CLOSED, com.appsflyer.internal.i.l("reason", str));
    }

    public void m(String str) {
        this.a.a(B0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, com.appsflyer.internal.i.l("reason", str));
    }

    public void n(String str) {
        this.a.a(B0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, com.appsflyer.internal.i.l("reason", str));
    }

    public void o(String str) {
        this.a.a(B0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, com.appsflyer.internal.i.l("reason", str));
    }

    public void p(String str) {
        this.a.a(B0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, com.appsflyer.internal.i.l("reason", str));
    }

    public void q(String str) {
        this.a.a(B0.TROUBLESHOOT_UNEXPECTED_OPENED, com.appsflyer.internal.i.l("reason", str));
    }

    public void r(String str) {
        this.a.a(B0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, com.appsflyer.internal.i.l("reason", str));
    }

    public void s(String str) {
        this.a.a(B0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, com.appsflyer.internal.i.l("reason", str));
    }

    public void t(String str) {
        this.a.a(B0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, com.appsflyer.internal.i.l("reason", str));
    }

    public void u(String str) {
        this.a.a(B0.TROUBLESHOOT_UNEXPECTED_TIMEOUT, com.appsflyer.internal.i.l("reason", str));
    }

    public void v(String str) {
        this.a.a(B0.TROUBLESHOOT_WATERFALL_OVERHEAD, com.appsflyer.internal.i.l("reason", str));
    }

    public void c() {
        this.a.a(B0.TROUBLESHOOT_SHOW, null);
    }

    public void d() {
        this.a.a(B0.TROUBLESHOOT_SHOW_SUCCESS, null);
    }

    public void b() {
        this.a.a(B0.TROUBLESHOOT_LOAD_SUCCESS, null);
    }

    public void b(String str) {
        this.a.a(B0.TROUBLESHOOT_IMPRESSION_TIMEOUT, com.appsflyer.internal.i.l("reason", str));
    }

    public void a() {
        this.a.a(B0.TROUBLESHOOT_LOAD, null);
    }

    public void a(Long l) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, l);
        this.a.a(B0.TROUBLESHOOT_LOAD_WHILE_LOADED, hashMap);
    }

    public void a(LevelPlayAdError levelPlayAdError) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(levelPlayAdError.getErrorCode()));
        hashMap.put("reason", levelPlayAdError.getErrorMessage());
        this.a.a(B0.TROUBLESHOOT_SHOW_FAILED, hashMap);
    }

    public void a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", str);
        this.a.a(B0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, hashMap);
    }

    public void a(String str) {
        this.a.a(B0.TROUBLESHOOT_AD_EXPIRED, com.appsflyer.internal.i.l("reason", str));
    }

    public void a(@NotNull String str, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, x5n.m(j, "expirationDuration=", new StringBuilder(str.isEmpty() ? "" : lnb.o("provider=", str, ";"))));
        this.a.a(B0.TROUBLESHOOT_AD_EXPIRED, hashMap);
    }

    public void a(boolean z, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, "isAnimated:" + (z ? 1 : 0));
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.a.a(B0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION, hashMap);
    }

    public void a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.a.a(B0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED, hashMap);
    }

    public void a(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        this.a.a(B0.TROUBLESHOOT_NOTIFICATION_ERROR, hashMap);
    }

    public void a(String str, Long l) {
        HashMap l2 = com.appsflyer.internal.i.l("reason", str);
        if (l != null) {
            l2.put(IronSourceConstants.EVENTS_EXT1, "expirationDurationMs=" + l);
        }
        this.a.a(B0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, l2);
    }

    public void a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, "prev=" + z);
        this.a.a(B0.TROUBLESHOOT_ILR_SUBSCRIBE, hashMap);
    }

    public void a(String str, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, "src=" + str + ",prev=" + z);
        this.a.a(B0.TROUBLESHOOT_ILR_UNSUBSCRIBE, hashMap);
    }

    public void a(LevelPlayImpressionData levelPlayImpressionData) {
        HashMap hashMap = new HashMap();
        Double revenue = levelPlayImpressionData.getRevenue();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "revenue=%.3f,auctionId=%s", Double.valueOf(revenue == null ? -1.0d : revenue.doubleValue()), levelPlayImpressionData.getAuctionId()));
        this.a.a(B0.TROUBLESHOOT_ILR_REVENUE_INSTANCE, hashMap);
    }

    public void a(V8 v8) {
        HashMap hashMap = new HashMap();
        double o = v8.o();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "revenue=%.3f,auctionId=%s", Double.valueOf(o), v8.e()));
        this.a.a(B0.TROUBLESHOOT_ILR_REVENUE, hashMap);
    }

    public void a(Md md) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, md.b());
        this.a.a(B0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, hashMap);
    }

    public void a(long j, long j2, @NotNull String str) {
        HashMap hashMap = new HashMap();
        Locale locale = Locale.ENGLISH;
        StringBuilder o = ljg.o("refreshDuration=", j, ";notVisibleDuration=");
        o.append(j2);
        o.append(";reason=");
        o.append(str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, o.toString());
        this.a.a(B0.TROUBLESHOOT_RELOAD, hashMap);
    }
}

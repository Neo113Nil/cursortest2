package com.ironsource;

import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.HashMap;
import java.util.Locale;
import xsna.dez0;
import xsna.fp;
import xsna.zr;

/* renamed from: com.ironsource.qg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4518qg {
    private final F0 a;

    public C4518qg(F0 f0) {
        this.a = f0;
    }

    public void a(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i));
        hashMap.put("reason", str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        this.a.a(C0.TROUBLESHOOT_NOTIFICATION_ERROR, hashMap);
    }

    public void b(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i));
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_LOAD_FAILED, hashMap);
    }

    public void c() {
        this.a.a(C0.TROUBLESHOOT_LOAD_SUCCESS, null);
    }

    public void d() {
        this.a.a(C0.TROUBLESHOOT_SHOW, null);
    }

    public void e() {
        this.a.a(C0.TROUBLESHOOT_SHOW_SUCCESS, null);
    }

    public void f(String str) {
        this.a.a(C0.TROUBLESHOOT_ILLEGAL_STATE, dez0.a("reason", str));
    }

    public void g(String str) {
        this.a.a(C0.TROUBLESHOOT_INTERNAL_ERROR, dez0.a("reason", str));
    }

    public void h(String str) {
        this.a.a(C0.TROUBLESHOOT_LOAD_SKIPPED, dez0.a("reason", str));
    }

    public void i(String str) {
        this.a.a(C0.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, dez0.a("reason", str));
    }

    public void j(String str) {
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, dez0.a("reason", str));
    }

    public void k(String str) {
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, dez0.a("reason", str));
    }

    public void l(String str) {
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_CLOSED, dez0.a("reason", str));
    }

    public void m(String str) {
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, dez0.a("reason", str));
    }

    public void n(String str) {
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, dez0.a("reason", str));
    }

    public void o(String str) {
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, dez0.a("reason", str));
    }

    public void p(String str) {
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, dez0.a("reason", str));
    }

    public void q(String str) {
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_OPENED, dez0.a("reason", str));
    }

    public void r(String str) {
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, dez0.a("reason", str));
    }

    public void s(String str) {
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, dez0.a("reason", str));
    }

    public void t(String str) {
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, dez0.a("reason", str));
    }

    public void u(String str) {
        this.a.a(C0.TROUBLESHOOT_UNEXPECTED_TIMEOUT, dez0.a("reason", str));
    }

    public void v(String str) {
        this.a.a(C0.TROUBLESHOOT_WATERFALL_OVERHEAD, dez0.a("reason", str));
    }

    public void c(String str) {
        this.a.a(C0.TROUBLESHOOT_BN_RELOAD_EXCEPTION, dez0.a("reason", str));
    }

    public void d(String str) {
        this.a.a(C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, dez0.a("reason", str));
    }

    public void e(String str) {
        this.a.a(C0.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, dez0.a("reason", str));
    }

    public void b() {
        this.a.a(C0.TROUBLESHOOT_LOAD, null);
    }

    public void a(Long l) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", l);
        this.a.a(C0.TROUBLESHOOT_LOAD_WHILE_LOADED, hashMap);
    }

    public void b(String str) {
        this.a.a(C0.TROUBLESHOOT_IMPRESSION_TIMEOUT, dez0.a("reason", str));
    }

    public void a(LevelPlayAdError levelPlayAdError) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(levelPlayAdError.getErrorCode()));
        hashMap.put("reason", levelPlayAdError.getErrorMessage());
        this.a.a(C0.TROUBLESHOOT_SHOW_FAILED, hashMap);
    }

    public void a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i));
        hashMap.put("reason", str);
        this.a.a(C0.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, hashMap);
    }

    public void a(String str) {
        this.a.a(C0.TROUBLESHOOT_AD_EXPIRED, dez0.a("reason", str));
    }

    public void a(String str, long j) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(str.isEmpty() ? "" : zr.a("provider=", str, ";"));
        sb.append("expirationDuration=");
        sb.append(j);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
        this.a.a(C0.TROUBLESHOOT_AD_EXPIRED, hashMap);
    }

    public void a(boolean z, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, "isAnimated:" + (z ? 1 : 0));
        hashMap.put("duration", Long.valueOf(j));
        this.a.a(C0.TROUBLESHOOT_BANNER_REFRESH_TRANSITION, hashMap);
    }

    public void a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        this.a.a(C0.TROUBLESHOOT_BANNER_REFRESH_ANIMATED, hashMap);
    }

    public void a(@NonNull LevelPlayAdInfo levelPlayAdInfo, @NonNull LevelPlayAdInfo levelPlayAdInfo2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "oldAdNetwork=%s;oldInstanceId=%s;oldRevenue=%.3f;oldPrecision=%s;newAdNetwork=%s;newInstanceId=%s;newRevenue=%.3f;newPrecision=%s;delta=%.3f", levelPlayAdInfo.getAdNetwork(), levelPlayAdInfo.getInstanceId(), Double.valueOf(levelPlayAdInfo.getRevenue()), levelPlayAdInfo.getPrecision(), levelPlayAdInfo2.getAdNetwork(), levelPlayAdInfo2.getInstanceId(), Double.valueOf(levelPlayAdInfo2.getRevenue()), levelPlayAdInfo2.getPrecision(), Double.valueOf(levelPlayAdInfo2.getRevenue() - levelPlayAdInfo.getRevenue())));
        this.a.a(C0.TROUBLESHOOT_AD_INFO_CHANGED, hashMap);
    }

    public void a() {
        this.a.a(C0.TROUBLESHOOT_DESTROY_INSTANCES_READY_TO_SHOW, null);
    }

    public void a(W8 w8) {
        HashMap hashMap = new HashMap();
        double o = w8.o();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "revenue=%.3f,auctionId=%s", Double.valueOf(o), w8.e()));
        this.a.a(C0.TROUBLESHOOT_ILR_REVENUE, hashMap);
    }

    public void a(Nd nd) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, nd.b());
        this.a.a(C0.TROUBLESHOOT_SHOW_RECOVERY_INITIATED, hashMap);
    }

    public void a(long j, long j2, String str) {
        HashMap hashMap = new HashMap();
        Locale locale = Locale.ENGLISH;
        StringBuilder b = fp.b(j, "refreshDuration=", ";notVisibleDuration=");
        b.append(j2);
        b.append(";reason=");
        b.append(str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, b.toString());
        this.a.a(C0.TROUBLESHOOT_RELOAD, hashMap);
    }
}

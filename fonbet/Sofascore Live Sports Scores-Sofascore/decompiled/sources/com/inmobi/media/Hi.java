package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import com.appsflyer.sdk_base.referrer.Payload;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.BuildConfig;
import defpackage.dmi;
import defpackage.ku3;
import defpackage.tub;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Hi {
    public final Bi a;
    public long b;
    public long c;
    public int d;
    public int e;
    public final AtomicInteger f;
    public final AtomicBoolean g;
    public long h;

    public Hi(Bi bi) {
        bi.getClass();
        this.a = bi;
        TelemetryConfig telemetryConfig = (TelemetryConfig) AbstractC3435g4.a.a(TelemetryConfig.class);
        Gi gi = bi.k;
        this.f = new AtomicInteger(gi != null ? gi.a : telemetryConfig.getMaxTemplateEvents());
        this.g = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (new org.json.JSONObject(r9).length() == 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, String str2) {
        String str3;
        str.getClass();
        if (this.g.get()) {
            return;
        }
        if (this.f.decrementAndGet() <= 0) {
            this.g.set(true);
            Map a = a();
            long j = this.c;
            ku3 ku3Var = Hl.a;
            a.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("TemplateEventDropped", a, EnumC3943zk.SDK);
            return;
        }
        if (str2 != null) {
            try {
            } catch (JSONException e) {
                C3839vk c3839vk2 = C3839vk.a;
                e.toString();
            }
        }
        Bi bi = this.a;
        str3 = bi.l;
        if (str3 == null) {
            str3 = "";
        }
        Pair pair = new Pair("trigger", str3);
        Pair pair2 = new Pair("plType", String.valueOf(bi.a.f));
        Bi bi2 = this.a;
        LinkedHashMap i = tub.i(pair, pair2, new Pair("impressionId", bi2.c), new Pair("markupType", bi2.b), new Pair("networkType", F5.g()));
        if (str2 != null) {
            i.put("payload", str2);
        }
        if (this.a.d.length() > 0) {
            i.put("metadataBlob", this.a.d);
        }
        C3839vk.b(str, i, EnumC3943zk.TEMPLATE);
        str2 = null;
        Bi bi3 = this.a;
        str3 = bi3.l;
        if (str3 == null) {
        }
        Pair pair3 = new Pair("trigger", str3);
        Pair pair22 = new Pair("plType", String.valueOf(bi3.a.f));
        Bi bi22 = this.a;
        LinkedHashMap i2 = tub.i(pair3, pair22, new Pair("impressionId", bi22.c), new Pair("markupType", bi22.b), new Pair("networkType", F5.g()));
        if (str2 != null) {
        }
        if (this.a.d.length() > 0) {
        }
        C3839vk.b(str, i2, EnumC3943zk.TEMPLATE);
    }

    public final void b() {
        String a = a("WebViewLoadCalled");
        this.c = SystemClock.elapsedRealtime();
        Map a2 = a();
        if (Intrinsics.c(a, "CompanionWebViewLoadCalled")) {
            long j = this.b;
            ku3 ku3Var = Hl.a;
            a2.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
        } else {
            C3716r1 c3716r1 = this.a.j;
            if (c3716r1 != null) {
                long j2 = c3716r1.a.c;
                ku3 ku3Var2 = Hl.a;
                a2.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j2));
            }
        }
        a2.put("creativeId", this.a.g);
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b(a, a2, EnumC3943zk.SDK);
    }

    public final void a(int i) {
        short s;
        Context context = AbstractC3424fj.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            Qa a = Pa.a(context, "im_telemetry_prefs");
            String str = E1.c;
            if (str == null) {
                str = "unknown";
            }
            if (Intrinsics.c(a.a.getString("last_app_version", null), str)) {
                return;
            }
            Map a2 = a();
            switch (i) {
                case 8800:
                    s = 2365;
                    break;
                case 8801:
                default:
                    s = (short) i;
                    break;
                case 8802:
                    s = 2366;
                    break;
                case 8803:
                    s = 2367;
                    break;
                case 8804:
                    s = 2368;
                    break;
            }
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("VideoPlayerNotSupported", a2, EnumC3943zk.SDK);
            a.a("last_app_version", str, false);
        }
    }

    public final void a(boolean z, short s) {
        String a = a("WebViewRenderProcessGoneEvent");
        String str = this.a.l;
        if (str == null) {
            str = "";
        }
        Pair pair = new Pair("trigger", str);
        long j = this.c;
        ku3 ku3Var = Hl.a;
        LinkedHashMap i = tub.i(pair, new Pair(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j)), new Pair("source", dmi.q("render_view_", this.a.a.e)), new Pair("isCrashed", Boolean.valueOf(z)), new Pair("creativeId", this.a.g), new Pair(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s)));
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b(a, i, EnumC3943zk.SDK);
    }

    public final void a(long j, Short sh) {
        Map a = a();
        ku3 ku3Var = Hl.a;
        a.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
        if (sh != null) {
            a.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(sh.shortValue()));
        }
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("HtmlUrlPrefetchCompleted", a, EnumC3943zk.SDK);
    }

    public final Map a() {
        Bi bi = this.a;
        String str = bi.l;
        if (str == null) {
            str = "";
        }
        Pair pair = new Pair("trigger", str);
        Pair pair2 = new Pair("plType", String.valueOf(bi.a.f));
        Pair pair3 = new Pair("plId", String.valueOf(this.a.a.a));
        Pair pair4 = new Pair("adType", String.valueOf(this.a.a.e));
        Pair pair5 = new Pair("markupType", this.a.b);
        Pair pair6 = new Pair("networkType", F5.g());
        Pair pair7 = new Pair("retryCount", String.valueOf(this.a.e));
        Bi bi2 = this.a;
        LinkedHashMap i = tub.i(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("creativeType", bi2.f), new Pair("adPosition", String.valueOf(bi2.i)), new Pair("isRewarded", String.valueOf(this.a.h)), new Pair("impressionId", this.a.c));
        if (this.a.d.length() > 0) {
            i.put("metadataBlob", this.a.d);
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final String a(String str) {
        if (!Intrinsics.c(this.a.l, BuildConfig.FLAVOR)) {
            switch (str.hashCode()) {
                case -1395724590:
                    if (str.equals("PageStarted")) {
                        return "CompanionWebViewPageStarted";
                    }
                    break;
                case -81019210:
                    if (str.equals("FireAdFailed")) {
                        return "CompanionFireAdFailed";
                    }
                    break;
                case 147127306:
                    if (str.equals("FireAdReady")) {
                        return "CompanionFireAdReady";
                    }
                    break;
                case 260281564:
                    if (str.equals("WebViewLoadCalled")) {
                        return "CompanionWebViewLoadCalled";
                    }
                    break;
                case 520950289:
                    if (str.equals("WebViewLoadFinished")) {
                        return "CompanionWebViewLoadFinished";
                    }
                    break;
                case 570988141:
                    if (str.equals("RenderProcessResponsive")) {
                        return "RenderProcessResponsive";
                    }
                    break;
                case 1001819046:
                    if (str.equals("RenderProcessUnResponsive")) {
                        return "CompanionRenderProcessUnResponsive";
                    }
                    break;
            }
        }
        return str;
    }
}

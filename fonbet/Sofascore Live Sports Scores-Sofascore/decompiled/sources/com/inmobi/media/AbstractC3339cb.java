package com.inmobi.media;

import android.os.SystemClock;
import com.appsflyer.sdk_base.referrer.Payload;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.ku3;
import defpackage.tub;
import defpackage.xw3;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.cb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3339cb {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, C3571lb c3571lb, String str2, Long l) {
        Integer num;
        int i;
        str.getClass();
        if (c3571lb != null) {
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -1519854342:
                        if (str2.equals("PAGE_COMMIT_VISIBLE")) {
                            i = 2404;
                            break;
                        }
                        i = 0;
                        break;
                    case -404561643:
                        if (str2.equals("LOADER_TIMEOUT")) {
                            i = 2405;
                            break;
                        }
                        i = 0;
                        break;
                    case -229348854:
                        if (str2.equals("RECEIVED_ERROR")) {
                            i = 2403;
                            break;
                        }
                        i = 0;
                        break;
                    case 433141802:
                        if (str2.equals("UNKNOWN")) {
                            i = 2407;
                            break;
                        }
                        i = 0;
                        break;
                    case 1893734552:
                        if (str2.equals("RENDER_PROCESS_GONE")) {
                            i = 2401;
                            break;
                        }
                        i = 0;
                        break;
                    case 2032004239:
                        if (str2.equals("RECEIVED_HTTP_ERROR")) {
                            i = 2402;
                            break;
                        }
                        i = 0;
                        break;
                    case 2109630258:
                        if (str2.equals("ACTIVITY_STOP")) {
                            i = 2406;
                            break;
                        }
                        i = 0;
                        break;
                    default:
                        i = 0;
                        break;
                }
                num = Integer.valueOf(i);
            } else {
                num = null;
            }
            LinkedHashMap a = a(c3571lb, num);
            if (l != null) {
                a.put(Payload.LATENCY, Long.valueOf(l.longValue()));
            }
            xw3.L(L9.c, null, null, new C3313bb(a, str, null), 3);
        }
    }

    public static void a(Za za, C3571lb c3571lb, Integer num, Function2 function2) {
        za.getClass();
        if (c3571lb == null || za.c <= c3571lb.e) {
            return;
        }
        LinkedHashMap a = a(c3571lb, num);
        long j = c3571lb.d;
        if (j != 0) {
            ku3 ku3Var = Hl.a;
            a.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
        }
        c3571lb.e = za.c;
        xw3.L(L9.c, null, null, new C3287ab(a, za, null), 3);
        if (c3571lb.c > ((TelemetryConfig) AbstractC3435g4.a.a(TelemetryConfig.class)).getLpConfig().getMaxFunnelsToTrackPerAd() || function2 == null) {
            return;
        }
        String str = za.b;
        String str2 = c3571lb.f;
        if (str2 == null) {
            str2 = c3571lb.a.i;
        }
        function2.invoke(str, tub.h(new Pair("$OPENMODE", str2), new Pair("$URLTYPE", c3571lb.b)));
    }

    public static String a(String str) {
        if (str == null || str.length() == 0 || !StringsKt.J(str, "://", false)) {
            return "invalid";
        }
        if (kotlin.text.c.v(str, "inmobideeplink://", true)) {
            return "inmobideeplink";
        }
        if (kotlin.text.c.v(str, "inmobinativebrowser://", true)) {
            return "inmobinativebrowser";
        }
        if (kotlin.text.c.v(str, "https://", true)) {
            return HttpRequest.DEFAULT_SCHEME;
        }
        if (kotlin.text.c.v(str, "http://", true)) {
            return "http";
        }
        return kotlin.text.c.v(str, "market://", true) ? "market" : "deeplink";
    }

    public static LinkedHashMap a(C3571lb c3571lb, Integer num) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("plType", c3571lb.a.c);
        linkedHashMap.put("impressionId", c3571lb.a.b);
        linkedHashMap.put("plId", Long.valueOf(c3571lb.a.a));
        linkedHashMap.put("adType", c3571lb.a.d);
        linkedHashMap.put("markupType", c3571lb.a.e);
        linkedHashMap.put("creativeType", c3571lb.a.f);
        linkedHashMap.put("metadataBlob", c3571lb.a.g);
        linkedHashMap.put("isRewarded", Boolean.valueOf(c3571lb.a.h));
        String str = c3571lb.f;
        if (str == null) {
            str = c3571lb.a.i;
        }
        linkedHashMap.put("trigger", str);
        linkedHashMap.put("urlType", c3571lb.b);
        if (num != null) {
            linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, num);
        }
        return linkedHashMap;
    }
}

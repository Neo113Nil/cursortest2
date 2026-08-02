package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.joa;
import defpackage.w5m;
import defpackage.wel;
import defpackage.ypa;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.mh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3603mh {
    public static String a;
    public static Ah b;
    public static int c;
    public static final joa d = ypa.b(new wel(27));

    public static final Unit a(C3629nh c3629nh) {
        Qa qa;
        c = 2;
        if (c3629nh == null) {
            Ah ah = b;
            if (ah != null) {
                ah.a = null;
                BillingClient billingClient = ah.b;
                if (billingClient != null) {
                    billingClient.endConnection();
                }
            }
            b = null;
            return Unit.a;
        }
        c3629nh.toString();
        JSONObject jSONObject = new JSONObject();
        int i = c3629nh.a;
        if (i > 0) {
            jSONObject.put(TtmlNode.TAG_P, i);
        }
        int i2 = c3629nh.b;
        if (i2 > 0) {
            jSONObject.put("s", i2);
        }
        String jSONObject2 = jSONObject.length() == 0 ? null : jSONObject.toString();
        if (jSONObject2 != null) {
            a = jSONObject2;
            Context context = AbstractC3424fj.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                qa = Pa.a(context, "purchase_store");
            } else {
                qa = null;
            }
            if (qa != null) {
                ConcurrentHashMap concurrentHashMap2 = Qa.b;
                qa.a("purchase_pref", jSONObject2, false);
            }
        }
        Ah ah2 = b;
        if (ah2 != null) {
            ah2.a = null;
            BillingClient billingClient2 = ah2.b;
            if (billingClient2 != null) {
                billingClient2.endConnection();
            }
        }
        b = null;
        return Unit.a;
    }

    public static boolean b(Context context) {
        context.getClass();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            applicationInfo.getClass();
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            boolean R = CollectionsKt.R(((SignalsConfig) AbstractC3435g4.a.a(SignalsConfig.class)).getPurchases().getVersionList(), string);
            if (!R) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (string == null) {
                    string = "";
                }
                linkedHashMap.put("trigger", string);
                C3839vk c3839vk = C3839vk.a;
                C3839vk.b("BillingClientNotCompatible", linkedHashMap, EnumC3943zk.SDK);
            }
            return R;
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3286aa.a(new Q2(e));
            e.getMessage();
            return false;
        }
    }

    public static final boolean c() {
        return true;
    }

    public static void b() {
        try {
            Context context = AbstractC3424fj.a;
            if (context != null && ((SignalsConfig) AbstractC3435g4.a.a(SignalsConfig.class)).getPurchases().getInapp()) {
                a();
                if (a(context)) {
                    c = 1;
                    Ah ah = new Ah();
                    b = ah;
                    ah.a(context, new w5m(20));
                }
            }
        } catch (Exception e) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3286aa.a(new Q2(e));
            e.getMessage();
        }
    }

    public static void a() {
        Qa qa;
        Context context = AbstractC3424fj.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            qa = Pa.a(context, "purchase_store");
        } else {
            qa = null;
        }
        String string = qa != null ? qa.a.getString("purchase_pref", null) : null;
        if (string != null) {
            a = string;
        }
    }

    public static boolean a(Context context) {
        context.getClass();
        F5.a.getClass();
        if (!F5.x()) {
            return false;
        }
        if (!((Boolean) d.getValue()).booleanValue()) {
            AbstractC3758sh.a(new C3681ph((short) 2230));
            return false;
        }
        if (!b(context)) {
            return false;
        }
        int i = c;
        if (i != 1 && i != 2) {
            return true;
        }
        AbstractC3758sh.a(new C3681ph(i != 1 ? i != 2 ? (short) 0 : (short) 2232 : (short) 2231));
        return false;
    }
}

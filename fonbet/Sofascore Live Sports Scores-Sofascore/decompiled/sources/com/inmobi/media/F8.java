package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.RootConfig;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class F8 {
    public static String a;

    static {
        a(G9.a());
        G9.a();
    }

    public static String a() {
        boolean booleanValue;
        Boolean bool = AbstractC3551kh.b;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            Context context = AbstractC3424fj.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                AbstractC3551kh.b = Boolean.valueOf(Pa.a(context, "user_info_store").a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = AbstractC3551kh.b;
            booleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (booleanValue) {
            return null;
        }
        C3694q4 c3694q4 = AbstractC3435g4.a;
        if (CollectionsKt.R(((RootConfig) c3694q4.a(RootConfig.class)).getIPAddrTPSupport(), AbstractC3450gj.b)) {
            return a;
        }
        Objects.toString(((RootConfig) c3694q4.a(RootConfig.class)).getIPAddrTPSupport());
        return null;
    }

    public static void a(String str) {
        boolean booleanValue;
        Boolean bool = AbstractC3551kh.b;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            Context context = AbstractC3424fj.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                AbstractC3551kh.b = Boolean.valueOf(Pa.a(context, "user_info_store").a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = AbstractC3551kh.b;
            booleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (!booleanValue) {
            a = str;
            G9.a(str);
        } else {
            a = null;
            G9.a(null);
        }
    }
}

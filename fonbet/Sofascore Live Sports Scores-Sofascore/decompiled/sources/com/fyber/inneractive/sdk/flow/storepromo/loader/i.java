package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.bf3;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i {
    public static final String a = b("app_screen_%d");
    public static final String b = "document.getElementById(\"app_screen_%d\").src = app_screen_%d;\n";
    public static final String c = b("app_video_url_%d");
    public static final String d = "document.getElementById(\"app_video_url_%d\").src = app_video_url_%d;\n";
    public static final String e = b("app_icon");
    public static final String f = "document.getElementById(\"app_icon\").src = app_icon;\n";
    public static final String g = b("app_name");
    public static final String h = a("app_name");
    public static final String i = b("app_pub_name");
    public static final String j = a("app_pub_name");
    public static final String k = b("app_label");
    public static final String l = a("app_label");
    public static final String m = b(CampaignEx.JSON_KEY_APP_SIZE);
    public static final String n = a(CampaignEx.JSON_KEY_APP_SIZE);
    public static final String o = b("app_rating");
    public static final String p = a("app_rating");
    public static final String q = b("app_rating_icon");
    public static final String r = "document.getElementById(\"app_rating_icon\").src = app_rating_icon;\n";

    public static String a(boolean z, String str) {
        return mz1.o(wt3.q("document.getElementById(\"", str, "\").style.display = "), z ? "'block'" : "'none'", ";\n");
    }

    public static String b(String str) {
        return lnb.o("var ", str, " = `%s`;\n");
    }

    public static String a(String str) {
        return bf3.k("document.getElementById(\"", str, "\").innerHTML = `${", str, "}`;\n");
    }
}

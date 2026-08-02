package com.vk.external.miniapp.net.app;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.external.miniapp.net.app.WebAppPlaceholderInfo;
import com.vk.external.miniapp.net.app.WebCatalogBanner;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.brm0;
import xsna.c5g;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.gwd0;
import xsna.ms9;
import xsna.nr;
import xsna.rl3;
import xsna.sn;
import xsna.z23;

/* compiled from: WebApiApplication.kt */
/* loaded from: classes18.dex */
public final class WebApiApplication implements Parcelable {
    public static final Parcelable.Creator<WebApiApplication> CREATOR = new b();
    public static final int[] f0 = {75, 139, 150, 278, 560, 1120};
    public static final bpn0 g0 = new bpn0(new gwd0(19));
    public final boolean A;
    public final boolean B;
    public final String C;
    public String D;
    public final String E;
    public final Integer F;
    public final WebCatalogBanner G;
    public final boolean H;
    public final int I;
    public final boolean J;
    public final List<AdvertisementType> K;
    public final WebFriendsUseApp L;
    public final boolean M;
    public final boolean N;
    public final WebAppSplashScreen O;
    public final boolean P;
    public final boolean Q;
    public Boolean R;
    public Boolean S;
    public final WebAppPlaceholderInfo T;
    public final boolean U;
    public final WebAdConfig V;
    public final int W;
    public final boolean X;
    public final String Y;
    public final boolean Z;
    public final boolean a0;
    public final long b;
    public final String b0;
    public final String c;
    public final WebLegalInfo c0;
    public final WebPhoto d;
    public final List<WebRights> d0;
    public final String e;
    public final List<WebPhoto> e0;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final String k;
    public final String l;
    public final int m;
    public final String n;
    public final String o;
    public final boolean p;
    public final long q;
    public boolean r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public int v;
    public final String w;
    public final String x;
    public int y;
    public final long z;

    /* compiled from: WebApiApplication.kt */
    public static final class a {
        public static List a() {
            return (List) WebApiApplication.g0.getValue();
        }

        public static int b(String str) {
            if (brm0.B(str, "#", false) && str.length() == 4) {
                str = z23.c("#([0-9a-fA-F])([0-9a-fA-F])([0-9a-fA-F])", str, "#$1$1$2$2$3$3");
            }
            return Color.parseColor(str);
        }

        /* JADX WARN: Removed duplicated region for block: B:109:0x0457  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x04af  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x044d  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x03e8  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x03a7  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x038a  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x036c  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0334  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0306  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x02f3  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x02d3  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x029d  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0230  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x02bb  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x02e8  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x02fd  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x030f  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0343  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0383  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x03a0  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x03b1  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x03f2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static WebApiApplication c(JSONObject jSONObject) {
            WebCatalogBanner webCatalogBanner;
            int a;
            int a2;
            int a3;
            String optString;
            JSONObject optJSONObject;
            String str;
            JSONArray optJSONArray;
            boolean z;
            int i;
            ArrayList arrayList;
            JSONObject optJSONObject2;
            ArrayList arrayList2;
            String str2;
            WebPhoto webPhoto;
            long j;
            WebFriendsUseApp webFriendsUseApp;
            JSONObject optJSONObject3;
            WebAppPlaceholderInfo webAppPlaceholderInfo;
            JSONObject optJSONObject4;
            WebLegalInfo webLegalInfo;
            JSONArray optJSONArray2;
            ArrayList arrayList3;
            JSONArray optJSONArray3;
            ArrayList arrayList4;
            WebImageSize webImageSize;
            JSONArray jSONArray;
            WebFriendsUseApp webFriendsUseApp2;
            Boolean bool;
            String str3;
            ArrayList arrayList5;
            int i2;
            long j2;
            int[] iArr = WebApiApplication.f0;
            ArrayList arrayList6 = new ArrayList(6);
            for (int i3 = 0; i3 < 6; i3++) {
                int i4 = iArr[i3];
                arrayList6.add(new WebImageSize(jSONObject.optString("icon_" + i4), i4, i4, (char) 0, false, null, 56, null));
            }
            WebPhoto webPhoto2 = new WebPhoto(new WebImage(arrayList6));
            int length = jSONObject.has("friends") ? jSONObject.getJSONArray("friends").length() : 0;
            Integer valueOf = jSONObject.has("background_loader_color") ? Integer.valueOf(b(jSONObject.getString("background_loader_color"))) : null;
            long j3 = jSONObject.getLong("id");
            String string = jSONObject.getString("title");
            String str4 = "description";
            String optString2 = jSONObject.optString("description");
            String optString3 = jSONObject.optString("short_description", null);
            if (optString3 == null) {
                optString3 = jSONObject.optString("description");
                if (optString3 == null) {
                    optString3 = null;
                } else {
                    char[] cArr = {JwtParser.SEPARATOR_CHAR, '!', '?', ';'};
                    int length2 = optString3.length();
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i5 >= length2) {
                            break;
                        }
                        if (rl3.F(cArr, optString3.charAt(i5))) {
                            i6++;
                        }
                        int i7 = i6;
                        if (i7 >= 1) {
                            optString3 = optString3.substring(0, i5 + 1);
                            break;
                        }
                        i5++;
                        i6 = i7;
                    }
                }
            }
            String str5 = optString3;
            String optString4 = jSONObject.optString("type");
            String optString5 = jSONObject.optString("platform_id");
            boolean z2 = jSONObject.optInt("is_new") == 1;
            int optInt = jSONObject.optInt("members_count");
            String optString6 = jSONObject.optString("banner_560");
            String optString7 = jSONObject.optString("banner_1120");
            String optString8 = jSONObject.optString("genre");
            int optInt2 = jSONObject.optInt("genre_id", 0);
            String optString9 = jSONObject.optString("badge");
            String optString10 = jSONObject.optString("notification_badge_type");
            long optLong = jSONObject.optLong("author_owner_id", 0L);
            boolean optBoolean = jSONObject.optBoolean("is_installed");
            boolean optBoolean2 = jSONObject.optBoolean("are_notifications_enabled");
            boolean optBoolean3 = jSONObject.optBoolean("is_install_screen");
            boolean optBoolean4 = jSONObject.optBoolean("is_favorite", false);
            int optInt3 = jSONObject.optInt("screen_orientation");
            String optString11 = jSONObject.optString("track_code");
            int optInt4 = jSONObject.optInt("mobile_controls_type", 1);
            boolean z3 = jSONObject.optInt("hide_tabbar", 0) == 1;
            boolean optBoolean5 = jSONObject.optBoolean("is_vkui_internal", false);
            String optString12 = jSONObject.optString("webview_url");
            String optString13 = jSONObject.optString("share_url");
            String optString14 = jSONObject.optString("loader_icon");
            JSONObject optJSONObject5 = jSONObject.optJSONObject("catalog_banner");
            if (optJSONObject5 != null) {
                try {
                    a = WebCatalogBanner.a.a("background_color", optJSONObject5);
                    a2 = WebCatalogBanner.a.a("title_color", optJSONObject5);
                    a3 = WebCatalogBanner.a.a("description_color", optJSONObject5);
                    optString = optJSONObject5.optString("description");
                    optJSONObject = optJSONObject5.optJSONObject("images");
                } catch (Throwable th) {
                    Log.e("WebCatalogBanner", "Error", th);
                }
                if (optJSONObject != null) {
                    try {
                        String string2 = optJSONObject.getString("banner_960");
                        if (string2 == null && (string2 = optJSONObject.getString("banner_480")) == null) {
                            string2 = optJSONObject.getString("banner_240");
                        }
                        str = string2;
                    } catch (JSONException e) {
                        Log.e("WebCatalogBanner", "Error", e);
                    }
                    webCatalogBanner = new WebCatalogBanner(a, a2, a3, optString, str);
                    boolean optBoolean6 = jSONObject.optBoolean("need_policy_confirmation");
                    int optInt5 = jSONObject.optInt("leaderboard_type");
                    boolean optBoolean7 = jSONObject.optBoolean("need_show_bottom_menu_tooltip_on_close");
                    optJSONArray = jSONObject.optJSONArray("preload_ad_types");
                    if (optJSONArray != null) {
                        ArrayList arrayList7 = new ArrayList();
                        z = optBoolean6;
                        int length3 = optJSONArray.length();
                        i = optInt5;
                        int i8 = 0;
                        while (i8 < length3) {
                            Object obj = optJSONArray.get(i8);
                            int i9 = length3;
                            if (obj != null) {
                                arrayList7.add(obj.toString());
                            }
                            i8++;
                            length3 = i9;
                        }
                        arrayList = new ArrayList(c5g.u(arrayList7, 10));
                        Iterator it = arrayList7.iterator();
                        while (it.hasNext()) {
                            String str6 = (String) it.next();
                            AdvertisementType.Companion.getClass();
                            arrayList.add(AdvertisementType.valueOf(str6.toUpperCase(Locale.ROOT)));
                        }
                    } else {
                        z = optBoolean6;
                        i = optInt5;
                        arrayList = null;
                    }
                    optJSONObject2 = jSONObject.optJSONObject("friends_use_app");
                    if (optJSONObject2 != null) {
                        String string3 = optJSONObject2.getString("description");
                        JSONArray jSONArray2 = optJSONObject2.getJSONArray("items");
                        arrayList2 = arrayList;
                        if (jSONArray2 != null) {
                            str2 = string;
                            arrayList5 = new ArrayList(jSONArray2.length());
                            int length4 = jSONArray2.length();
                            webPhoto = webPhoto2;
                            int i10 = 0;
                            while (i10 < length4) {
                                int i11 = length4;
                                JSONObject optJSONObject6 = jSONArray2.optJSONObject(i10);
                                JSONArray jSONArray3 = jSONArray2;
                                if (optJSONObject6 != null) {
                                    i2 = i10;
                                    j2 = optLong;
                                    long j4 = optJSONObject6.getLong("object_id");
                                    WebImage.a aVar = WebImage.CREATOR;
                                    JSONArray jSONArray4 = optJSONObject6.getJSONArray("items");
                                    aVar.getClass();
                                    arrayList5.add(new ProfileItem(j4, WebImage.a.a(jSONArray4)));
                                } else {
                                    i2 = i10;
                                    j2 = optLong;
                                }
                                i10 = i2 + 1;
                                length4 = i11;
                                jSONArray2 = jSONArray3;
                                optLong = j2;
                            }
                        } else {
                            str2 = string;
                            webPhoto = webPhoto2;
                            arrayList5 = null;
                        }
                        j = optLong;
                        List list = arrayList5;
                        if (arrayList5 == null) {
                            list = EmptyList.b;
                        }
                        webFriendsUseApp = new WebFriendsUseApp(string3, list);
                    } else {
                        arrayList2 = arrayList;
                        str2 = string;
                        webPhoto = webPhoto2;
                        j = optLong;
                        webFriendsUseApp = null;
                    }
                    boolean optBoolean8 = jSONObject.optBoolean("can_cache", false);
                    boolean optBoolean9 = jSONObject.optBoolean("has_vk_connect", false);
                    JSONObject optJSONObject7 = jSONObject.optJSONObject("splash_screen");
                    WebAppSplashScreen webAppSplashScreen = optJSONObject7 != null ? new WebAppSplashScreen(optJSONObject7.optString("url", ""), optJSONObject7.optString("background_color", ""), optJSONObject7.optBoolean("is_animated", false)) : null;
                    boolean optBoolean10 = jSONObject.optBoolean("is_vk_pay_disabled", false);
                    boolean optBoolean11 = jSONObject.optBoolean("is_debug", false);
                    Boolean valueOf2 = jSONObject.has("is_badge_allowed") ? Boolean.valueOf(jSONObject.getBoolean("is_badge_allowed")) : null;
                    Boolean valueOf3 = jSONObject.has("is_recommended") ? Boolean.valueOf(jSONObject.getBoolean("is_recommended")) : null;
                    optJSONObject3 = jSONObject.optJSONObject("placeholder_info");
                    if (optJSONObject3 != null) {
                        WebAppPlaceholderInfo.CREATOR.getClass();
                        String optString15 = optJSONObject3.optString("title");
                        String optString16 = optJSONObject3.optString("subtitle");
                        int optInt6 = optJSONObject3.optInt("reason", 0);
                        WebAppPlaceholderInfo.Reason.Companion.getClass();
                        webAppPlaceholderInfo = new WebAppPlaceholderInfo(optString15, optString16, WebAppPlaceholderInfo.Reason.a.a(optInt6));
                    } else {
                        webAppPlaceholderInfo = null;
                    }
                    boolean optBoolean12 = jSONObject.optBoolean("is_im_actions_supported");
                    JSONObject optJSONObject8 = jSONObject.optJSONObject("ad_config");
                    WebAdConfig webAdConfig = optJSONObject8 != null ? new WebAdConfig(optJSONObject8.optInt("id", 0), optJSONObject8.optInt("ads_external_id", 0), optJSONObject8.optBoolean("test_mode", false), optJSONObject8.optBoolean("mob_web_enabled", false), optJSONObject8.optBoolean("splash_ad_enabled", false), optJSONObject8.optBoolean("closing_ad_enabled", false)) : null;
                    int optInt7 = jSONObject.optInt("app_status");
                    boolean optBoolean13 = jSONObject.optBoolean("need_show_unverified_screen");
                    String string4 = jSONObject.has("slogan") ? jSONObject.getString("slogan") : null;
                    boolean optBoolean14 = jSONObject.optBoolean("is_calls_available");
                    boolean optBoolean15 = jSONObject.optBoolean("is_trusted");
                    String string5 = jSONObject.has("support_url") ? jSONObject.getString("support_url") : null;
                    optJSONObject4 = jSONObject.optJSONObject("legal_info");
                    if (optJSONObject4 != null) {
                        String string6 = optJSONObject4.getString("company_name");
                        String string7 = optJSONObject4.getString("legal_address");
                        JSONObject jSONObject2 = optJSONObject4.getJSONObject("policies");
                        webLegalInfo = new WebLegalInfo(string6, string7, new WebPolicies(jSONObject2.getString("privacy_policy"), jSONObject2.getString("terms")), optJSONObject4.getString("inn"), optJSONObject4.getString("support_text"));
                    } else {
                        webLegalInfo = null;
                    }
                    optJSONArray2 = jSONObject.optJSONArray("rights");
                    if (optJSONArray2 != null) {
                        arrayList3 = new ArrayList(optJSONArray2.length());
                        int length5 = optJSONArray2.length();
                        int i12 = 0;
                        while (i12 < length5) {
                            JSONObject optJSONObject9 = optJSONArray2.optJSONObject(i12);
                            boolean z4 = optBoolean8;
                            if (optJSONObject9 != null) {
                                jSONArray = optJSONArray2;
                                webFriendsUseApp2 = webFriendsUseApp;
                                bool = valueOf3;
                                str3 = str4;
                                arrayList3.add(new WebRights(optJSONObject9.getString("name"), optJSONObject9.getString("header"), optJSONObject9.getString(str4), optJSONObject9.getInt("mask")));
                            } else {
                                jSONArray = optJSONArray2;
                                webFriendsUseApp2 = webFriendsUseApp;
                                bool = valueOf3;
                                str3 = str4;
                            }
                            i12++;
                            optBoolean8 = z4;
                            optJSONArray2 = jSONArray;
                            webFriendsUseApp = webFriendsUseApp2;
                            valueOf3 = bool;
                            str4 = str3;
                        }
                    } else {
                        arrayList3 = null;
                    }
                    boolean z5 = optBoolean8;
                    WebFriendsUseApp webFriendsUseApp3 = webFriendsUseApp;
                    Boolean bool2 = valueOf3;
                    optJSONArray3 = jSONObject.optJSONArray("screenshots");
                    if (optJSONArray3 != null) {
                        ArrayList arrayList8 = new ArrayList(optJSONArray3.length());
                        int length6 = optJSONArray3.length();
                        for (int i13 = 0; i13 < length6; i13++) {
                            JSONObject optJSONObject10 = optJSONArray3.optJSONObject(i13);
                            if (optJSONObject10 != null) {
                                Parcelable.Creator<WebApiApplication> creator = WebApiApplication.CREATOR;
                                JSONArray jSONArray5 = optJSONObject10.getJSONArray("sizes");
                                ArrayList arrayList9 = new ArrayList(jSONArray5.length());
                                int length7 = jSONArray5.length();
                                for (int i14 = 0; i14 < length7; i14++) {
                                    JSONObject jSONObject3 = jSONArray5.getJSONObject(i14);
                                    try {
                                        WebImageSize.CREATOR.getClass();
                                        webImageSize = WebImageSize.a.b(jSONObject3);
                                    } catch (Exception unused) {
                                        webImageSize = null;
                                    }
                                    if (webImageSize != null) {
                                        arrayList9.add(webImageSize);
                                    }
                                }
                                arrayList8.add(new WebPhoto(new WebImage(arrayList9)));
                            }
                        }
                        arrayList4 = arrayList8;
                    } else {
                        arrayList4 = null;
                    }
                    return new WebApiApplication(j3, str2, webPhoto, optString6, optString7, optString2, str5, optInt, length, optString5, optString8, optInt2, optString9, optString10, z2, j, optBoolean, optBoolean2, optBoolean3, optBoolean4, optInt3, optString11, optString4, optInt4, 0L, z3, optBoolean5, optString13, optString12, optString14, valueOf, webCatalogBanner, z, i, optBoolean7, arrayList2, webFriendsUseApp3, z5, optBoolean9, webAppSplashScreen, optBoolean10, optBoolean11, valueOf2, bool2, webAppPlaceholderInfo, optBoolean12, webAdConfig, optInt7, optBoolean13, string4, optBoolean14, optBoolean15, string5, webLegalInfo, arrayList3, arrayList4);
                }
                str = null;
                webCatalogBanner = new WebCatalogBanner(a, a2, a3, optString, str);
                boolean optBoolean62 = jSONObject.optBoolean("need_policy_confirmation");
                int optInt52 = jSONObject.optInt("leaderboard_type");
                boolean optBoolean72 = jSONObject.optBoolean("need_show_bottom_menu_tooltip_on_close");
                optJSONArray = jSONObject.optJSONArray("preload_ad_types");
                if (optJSONArray != null) {
                }
                optJSONObject2 = jSONObject.optJSONObject("friends_use_app");
                if (optJSONObject2 != null) {
                }
                boolean optBoolean82 = jSONObject.optBoolean("can_cache", false);
                boolean optBoolean92 = jSONObject.optBoolean("has_vk_connect", false);
                JSONObject optJSONObject72 = jSONObject.optJSONObject("splash_screen");
                if (optJSONObject72 != null) {
                }
                boolean optBoolean102 = jSONObject.optBoolean("is_vk_pay_disabled", false);
                boolean optBoolean112 = jSONObject.optBoolean("is_debug", false);
                if (jSONObject.has("is_badge_allowed")) {
                }
                if (jSONObject.has("is_recommended")) {
                }
                optJSONObject3 = jSONObject.optJSONObject("placeholder_info");
                if (optJSONObject3 != null) {
                }
                boolean optBoolean122 = jSONObject.optBoolean("is_im_actions_supported");
                JSONObject optJSONObject82 = jSONObject.optJSONObject("ad_config");
                if (optJSONObject82 != null) {
                }
                int optInt72 = jSONObject.optInt("app_status");
                boolean optBoolean132 = jSONObject.optBoolean("need_show_unverified_screen");
                if (jSONObject.has("slogan")) {
                }
                boolean optBoolean142 = jSONObject.optBoolean("is_calls_available");
                boolean optBoolean152 = jSONObject.optBoolean("is_trusted");
                if (jSONObject.has("support_url")) {
                }
                optJSONObject4 = jSONObject.optJSONObject("legal_info");
                if (optJSONObject4 != null) {
                }
                optJSONArray2 = jSONObject.optJSONArray("rights");
                if (optJSONArray2 != null) {
                }
                boolean z52 = optBoolean82;
                WebFriendsUseApp webFriendsUseApp32 = webFriendsUseApp;
                Boolean bool22 = valueOf3;
                optJSONArray3 = jSONObject.optJSONArray("screenshots");
                if (optJSONArray3 != null) {
                }
                return new WebApiApplication(j3, str2, webPhoto, optString6, optString7, optString2, str5, optInt, length, optString5, optString8, optInt2, optString9, optString10, z2, j, optBoolean, optBoolean2, optBoolean3, optBoolean4, optInt3, optString11, optString4, optInt4, 0L, z3, optBoolean5, optString13, optString12, optString14, valueOf, webCatalogBanner, z, i, optBoolean72, arrayList2, webFriendsUseApp32, z52, optBoolean92, webAppSplashScreen, optBoolean102, optBoolean112, valueOf2, bool22, webAppPlaceholderInfo, optBoolean122, webAdConfig, optInt72, optBoolean132, string4, optBoolean142, optBoolean152, string5, webLegalInfo, arrayList3, arrayList4);
            }
            webCatalogBanner = null;
            boolean optBoolean622 = jSONObject.optBoolean("need_policy_confirmation");
            int optInt522 = jSONObject.optInt("leaderboard_type");
            boolean optBoolean722 = jSONObject.optBoolean("need_show_bottom_menu_tooltip_on_close");
            optJSONArray = jSONObject.optJSONArray("preload_ad_types");
            if (optJSONArray != null) {
            }
            optJSONObject2 = jSONObject.optJSONObject("friends_use_app");
            if (optJSONObject2 != null) {
            }
            boolean optBoolean822 = jSONObject.optBoolean("can_cache", false);
            boolean optBoolean922 = jSONObject.optBoolean("has_vk_connect", false);
            JSONObject optJSONObject722 = jSONObject.optJSONObject("splash_screen");
            if (optJSONObject722 != null) {
            }
            boolean optBoolean1022 = jSONObject.optBoolean("is_vk_pay_disabled", false);
            boolean optBoolean1122 = jSONObject.optBoolean("is_debug", false);
            if (jSONObject.has("is_badge_allowed")) {
            }
            if (jSONObject.has("is_recommended")) {
            }
            optJSONObject3 = jSONObject.optJSONObject("placeholder_info");
            if (optJSONObject3 != null) {
            }
            boolean optBoolean1222 = jSONObject.optBoolean("is_im_actions_supported");
            JSONObject optJSONObject822 = jSONObject.optJSONObject("ad_config");
            if (optJSONObject822 != null) {
            }
            int optInt722 = jSONObject.optInt("app_status");
            boolean optBoolean1322 = jSONObject.optBoolean("need_show_unverified_screen");
            if (jSONObject.has("slogan")) {
            }
            boolean optBoolean1422 = jSONObject.optBoolean("is_calls_available");
            boolean optBoolean1522 = jSONObject.optBoolean("is_trusted");
            if (jSONObject.has("support_url")) {
            }
            optJSONObject4 = jSONObject.optJSONObject("legal_info");
            if (optJSONObject4 != null) {
            }
            optJSONArray2 = jSONObject.optJSONArray("rights");
            if (optJSONArray2 != null) {
            }
            boolean z522 = optBoolean822;
            WebFriendsUseApp webFriendsUseApp322 = webFriendsUseApp;
            Boolean bool222 = valueOf3;
            optJSONArray3 = jSONObject.optJSONArray("screenshots");
            if (optJSONArray3 != null) {
            }
            return new WebApiApplication(j3, str2, webPhoto, optString6, optString7, optString2, str5, optInt, length, optString5, optString8, optInt2, optString9, optString10, z2, j, optBoolean, optBoolean2, optBoolean3, optBoolean4, optInt3, optString11, optString4, optInt4, 0L, z3, optBoolean5, optString13, optString12, optString14, valueOf, webCatalogBanner, z, i, optBoolean722, arrayList2, webFriendsUseApp322, z522, optBoolean922, webAppSplashScreen, optBoolean1022, optBoolean1122, valueOf2, bool222, webAppPlaceholderInfo, optBoolean1222, webAdConfig, optInt722, optBoolean1322, string4, optBoolean1422, optBoolean1522, string5, webLegalInfo, arrayList3, arrayList4);
        }
    }

    /* compiled from: WebApiApplication.kt */
    public static final class b implements Parcelable.Creator<WebApiApplication> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v24, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r1v25 */
        /* JADX WARN: Type inference failed for: r1v30 */
        /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r55v3 */
        /* JADX WARN: Type inference failed for: r55v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r55v5 */
        @Override // android.os.Parcelable.Creator
        public final WebApiApplication createFromParcel(Parcel parcel) {
            long j;
            boolean z;
            long j2;
            boolean z2;
            long j3;
            boolean z3;
            long j4;
            boolean z4;
            long j5;
            boolean z5;
            long j6;
            boolean z6;
            long j7;
            Integer num;
            boolean z7;
            WebCatalogBanner webCatalogBanner;
            ArrayList arrayList;
            String str;
            WebFriendsUseApp webFriendsUseApp;
            WebAppSplashScreen createFromParcel;
            boolean z8;
            String str2;
            boolean z9;
            Boolean valueOf;
            Boolean valueOf2;
            boolean z10;
            WebPhoto webPhoto;
            Boolean bool;
            boolean z11;
            WebLegalInfo webLegalInfo;
            WebAppPlaceholderInfo webAppPlaceholderInfo;
            Boolean bool2;
            WebAdConfig webAdConfig;
            long j8;
            boolean z12;
            int i;
            WebLegalInfo webLegalInfo2;
            ?? r55;
            long j9;
            WebLegalInfo createFromParcel2;
            WebLegalInfo webLegalInfo3;
            ?? arrayList2;
            String str3;
            List arrayList3;
            List list;
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            WebPhoto createFromParcel3 = WebPhoto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            int readInt3 = parcel.readInt();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            long readLong2 = parcel.readLong();
            if (parcel.readInt() != 0) {
                j = readLong;
                z = true;
            } else {
                j = readLong;
                z = false;
            }
            if (parcel.readInt() != 0) {
                j2 = j;
                z2 = true;
            } else {
                j2 = j;
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                j3 = j2;
                z3 = true;
            } else {
                j3 = j2;
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                j4 = j3;
                z4 = true;
            } else {
                j4 = j3;
                z4 = false;
            }
            int readInt4 = parcel.readInt();
            long j10 = j4;
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            int readInt5 = parcel.readInt();
            long readLong3 = parcel.readLong();
            if (parcel.readInt() != 0) {
                j5 = j10;
                z5 = true;
            } else {
                j5 = j10;
                z5 = false;
            }
            if (parcel.readInt() != 0) {
                j6 = j5;
                z6 = true;
            } else {
                j6 = j5;
                z6 = false;
            }
            String readString12 = parcel.readString();
            long j11 = j6;
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            WebCatalogBanner createFromParcel4 = parcel.readInt() == 0 ? null : WebCatalogBanner.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                j7 = j11;
                num = valueOf3;
                z7 = true;
            } else {
                j7 = j11;
                num = valueOf3;
                z7 = false;
            }
            int readInt6 = parcel.readInt();
            boolean z14 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                webCatalogBanner = createFromParcel4;
                str = readString;
                arrayList = null;
            } else {
                int readInt7 = parcel.readInt();
                webCatalogBanner = createFromParcel4;
                arrayList = new ArrayList(readInt7);
                str = readString;
                int i2 = 0;
                while (i2 != readInt7) {
                    i2 = en.a(AdvertisementType.CREATOR, parcel, arrayList, i2, 1);
                    readInt7 = readInt7;
                    createFromParcel3 = createFromParcel3;
                }
            }
            WebPhoto webPhoto2 = createFromParcel3;
            WebFriendsUseApp createFromParcel5 = parcel.readInt() == 0 ? null : WebFriendsUseApp.CREATOR.createFromParcel(parcel);
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                webFriendsUseApp = createFromParcel5;
                createFromParcel = null;
            } else {
                webFriendsUseApp = createFromParcel5;
                createFromParcel = WebAppSplashScreen.CREATOR.createFromParcel(parcel);
            }
            WebAppSplashScreen webAppSplashScreen = createFromParcel;
            if (parcel.readInt() != 0) {
                z8 = z16;
                str2 = str;
                z9 = true;
            } else {
                z8 = z16;
                str2 = str;
                z9 = false;
            }
            long j12 = j7;
            WebFriendsUseApp webFriendsUseApp2 = webFriendsUseApp;
            boolean z17 = parcel.readInt() != 0;
            WebCatalogBanner webCatalogBanner2 = webCatalogBanner;
            ArrayList arrayList4 = arrayList;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            WebAppPlaceholderInfo webAppPlaceholderInfo2 = (WebAppPlaceholderInfo) parcel.readParcelable(WebApiApplication.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z10 = z15;
                webPhoto = webPhoto2;
                bool = valueOf;
                z11 = true;
            } else {
                z10 = z15;
                webPhoto = webPhoto2;
                bool = valueOf;
                z11 = false;
            }
            WebAdConfig createFromParcel6 = parcel.readInt() == 0 ? null : WebAdConfig.CREATOR.createFromParcel(parcel);
            boolean z18 = false;
            int readInt8 = parcel.readInt();
            if (parcel.readInt() != 0) {
                webLegalInfo = null;
                webAppPlaceholderInfo = webAppPlaceholderInfo2;
                bool2 = valueOf2;
                webAdConfig = createFromParcel6;
                j8 = j12;
                z12 = true;
            } else {
                webLegalInfo = null;
                webAppPlaceholderInfo = webAppPlaceholderInfo2;
                bool2 = valueOf2;
                webAdConfig = createFromParcel6;
                j8 = j12;
                z12 = false;
            }
            boolean z19 = z8;
            Boolean bool3 = bool2;
            String readString15 = parcel.readString();
            if (parcel.readInt() != 0) {
                i = 0;
                z18 = true;
            } else {
                i = 0;
            }
            if (parcel.readInt() != 0) {
                webLegalInfo2 = webLegalInfo;
                r55 = 1;
            } else {
                webLegalInfo2 = webLegalInfo;
                r55 = i;
            }
            String readString16 = parcel.readString();
            if (parcel.readInt() == 0) {
                j9 = j8;
                createFromParcel2 = webLegalInfo2;
            } else {
                j9 = j8;
                createFromParcel2 = WebLegalInfo.CREATOR.createFromParcel(parcel);
            }
            WebLegalInfo webLegalInfo4 = createFromParcel2;
            if (parcel.readInt() == 0) {
                webLegalInfo3 = webLegalInfo4;
                str3 = str2;
                arrayList2 = webLegalInfo2;
            } else {
                int readInt9 = parcel.readInt();
                webLegalInfo3 = webLegalInfo4;
                arrayList2 = new ArrayList(readInt9);
                str3 = str2;
                int i3 = i;
                while (i3 != readInt9) {
                    i3 = en.a(WebRights.CREATOR, parcel, arrayList2, i3, 1);
                    readInt9 = readInt9;
                    webPhoto = webPhoto;
                }
            }
            WebPhoto webPhoto3 = webPhoto;
            if (parcel.readInt() != 0) {
                int readInt10 = parcel.readInt();
                arrayList3 = new ArrayList(readInt10);
                int i4 = i;
                List list2 = arrayList2;
                while (true) {
                    list = list2;
                    if (i4 == readInt10) {
                        break;
                    }
                    i4 = en.a(WebPhoto.CREATOR, parcel, arrayList3, i4, 1);
                    readInt10 = readInt10;
                    list2 = list;
                }
            } else {
                arrayList3 = webLegalInfo2;
                list = arrayList2;
            }
            return new WebApiApplication(j9, str3, webPhoto3, readString2, readString3, readString4, readString5, readInt, readInt2, readString6, readString7, readInt3, readString8, readString9, z13, readLong2, z, z2, z3, z4, readInt4, readString10, readString11, readInt5, readLong3, z5, z6, readString12, readString13, readString14, num, webCatalogBanner2, z7, readInt6, z14, arrayList4, webFriendsUseApp2, z10, z19, webAppSplashScreen, z9, z17, bool, bool3, webAppPlaceholderInfo, z11, webAdConfig, readInt8, z12, readString15, z18, r55, readString16, webLegalInfo3, list, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final WebApiApplication[] newArray(int i) {
            return new WebApiApplication[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebApiApplication(long j, String str, WebPhoto webPhoto, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, int i3, String str8, String str9, boolean z, long j2, boolean z2, boolean z3, boolean z4, boolean z5, int i4, String str10, String str11, int i5, long j3, boolean z6, boolean z7, String str12, String str13, String str14, Integer num, WebCatalogBanner webCatalogBanner, boolean z8, int i6, boolean z9, List<? extends AdvertisementType> list, WebFriendsUseApp webFriendsUseApp, boolean z10, boolean z11, WebAppSplashScreen webAppSplashScreen, boolean z12, boolean z13, Boolean bool, Boolean bool2, WebAppPlaceholderInfo webAppPlaceholderInfo, boolean z14, WebAdConfig webAdConfig, int i7, boolean z15, String str15, boolean z16, boolean z17, String str16, WebLegalInfo webLegalInfo, List<WebRights> list2, List<WebPhoto> list3) {
        this.b = j;
        this.c = str;
        this.d = webPhoto;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = i;
        this.j = i2;
        this.k = str6;
        this.l = str7;
        this.m = i3;
        this.n = str8;
        this.o = str9;
        this.p = z;
        this.q = j2;
        this.r = z2;
        this.s = z3;
        this.t = z4;
        this.u = z5;
        this.v = i4;
        this.w = str10;
        this.x = str11;
        this.y = i5;
        this.z = j3;
        this.A = z6;
        this.B = z7;
        this.C = str12;
        this.D = str13;
        this.E = str14;
        this.F = num;
        this.G = webCatalogBanner;
        this.H = z8;
        this.I = i6;
        this.J = z9;
        this.K = list;
        this.L = webFriendsUseApp;
        this.M = z10;
        this.N = z11;
        this.O = webAppSplashScreen;
        this.P = z12;
        this.Q = z13;
        this.R = bool;
        this.S = bool2;
        this.T = webAppPlaceholderInfo;
        this.U = z14;
        this.V = webAdConfig;
        this.W = i7;
        this.X = z15;
        this.Y = str15;
        this.Z = z16;
        this.a0 = z17;
        this.b0 = str16;
        this.c0 = webLegalInfo;
        this.d0 = list2;
        this.e0 = list3;
    }

    public static WebApiApplication a(WebApiApplication webApiApplication, String str, String str2, String str3, String str4, long j, int i) {
        int i2;
        String str5;
        boolean z;
        long j2;
        long j3 = webApiApplication.b;
        String str6 = webApiApplication.c;
        WebPhoto webPhoto = webApiApplication.d;
        String str7 = (i & 8) != 0 ? webApiApplication.e : str;
        String str8 = (i & 16) != 0 ? webApiApplication.f : str2;
        String str9 = webApiApplication.g;
        String str10 = str8;
        String str11 = webApiApplication.h;
        int i3 = webApiApplication.i;
        int i4 = webApiApplication.j;
        String str12 = webApiApplication.k;
        String str13 = webApiApplication.l;
        int i5 = webApiApplication.m;
        String str14 = webApiApplication.n;
        String str15 = (i & 8192) != 0 ? webApiApplication.o : str3;
        boolean z2 = webApiApplication.p;
        String str16 = str7;
        long j4 = webApiApplication.q;
        boolean z3 = webApiApplication.r;
        boolean z4 = webApiApplication.s;
        boolean z5 = webApiApplication.t;
        boolean z6 = webApiApplication.u;
        int i6 = webApiApplication.v;
        if ((i & 2097152) != 0) {
            i2 = i6;
            str5 = webApiApplication.w;
        } else {
            i2 = i6;
            str5 = str4;
        }
        String str17 = webApiApplication.x;
        int i7 = webApiApplication.y;
        if ((i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0) {
            z = z4;
            j2 = webApiApplication.z;
        } else {
            z = z4;
            j2 = j;
        }
        boolean z7 = webApiApplication.A;
        boolean z8 = webApiApplication.B;
        String str18 = webApiApplication.C;
        String str19 = webApiApplication.D;
        String str20 = webApiApplication.E;
        Integer num = webApiApplication.F;
        WebCatalogBanner webCatalogBanner = webApiApplication.G;
        boolean z9 = webApiApplication.H;
        int i8 = webApiApplication.I;
        boolean z10 = webApiApplication.J;
        List<AdvertisementType> list = webApiApplication.K;
        WebFriendsUseApp webFriendsUseApp = webApiApplication.L;
        boolean z11 = webApiApplication.M;
        boolean z12 = webApiApplication.N;
        WebAppSplashScreen webAppSplashScreen = webApiApplication.O;
        boolean z13 = webApiApplication.P;
        boolean z14 = webApiApplication.Q;
        Boolean bool = webApiApplication.R;
        Boolean bool2 = webApiApplication.S;
        WebAppPlaceholderInfo webAppPlaceholderInfo = webApiApplication.T;
        boolean z15 = webApiApplication.U;
        WebAdConfig webAdConfig = webApiApplication.V;
        int i9 = webApiApplication.W;
        boolean z16 = webApiApplication.X;
        String str21 = webApiApplication.Y;
        boolean z17 = webApiApplication.Z;
        boolean z18 = webApiApplication.a0;
        String str22 = webApiApplication.b0;
        WebLegalInfo webLegalInfo = webApiApplication.c0;
        List<WebRights> list2 = webApiApplication.d0;
        List<WebPhoto> list3 = webApiApplication.e0;
        webApiApplication.getClass();
        return new WebApiApplication(j3, str6, webPhoto, str16, str10, str9, str11, i3, i4, str12, str13, i5, str14, str15, z2, j4, z3, z, z5, z6, i2, str5, str17, i7, j2, z7, z8, str18, str19, str20, num, webCatalogBanner, z9, i8, z10, list, webFriendsUseApp, z11, z12, webAppSplashScreen, z13, z14, bool, bool2, webAppPlaceholderInfo, z15, webAdConfig, i9, z16, str21, z17, z18, str22, webLegalInfo, list2, list3);
    }

    public final WebPhoto d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        String str = this.x;
        return "html5_game".equals(str) || "game".equals(str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WebApiApplication)) {
            return false;
        }
        WebApiApplication webApiApplication = (WebApiApplication) obj;
        return this.b == webApiApplication.b && this.r == webApiApplication.r && this.u == webApiApplication.u && epx.f(this.c, webApiApplication.c) && epx.f(this.d, webApiApplication.d) && epx.f(this.o, webApiApplication.o);
    }

    public final boolean f() {
        return "html5_game".equals(this.x);
    }

    public final boolean g() {
        return "mini_app".equals(this.x);
    }

    public final int hashCode() {
        return (int) this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebApiApplication(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", banner=");
        sb.append(this.e);
        sb.append(", bannerBig=");
        sb.append(this.f);
        sb.append(", description=");
        sb.append(this.g);
        sb.append(", shortDescription=");
        sb.append(this.h);
        sb.append(", members=");
        sb.append(this.i);
        sb.append(", friends=");
        sb.append(this.j);
        sb.append(", packageName=");
        sb.append(this.k);
        sb.append(", genre=");
        sb.append(this.l);
        sb.append(", genreId=");
        sb.append(this.m);
        sb.append(", badge=");
        sb.append(this.n);
        sb.append(", notificationBadgeType=");
        sb.append(this.o);
        sb.append(", isNew=");
        sb.append(this.p);
        sb.append(", authorOwnerId=");
        sb.append(this.q);
        sb.append(", installed=");
        sb.append(this.r);
        sb.append(", isNotificationsEnabled=");
        sb.append(this.s);
        sb.append(", hasInstallScreen=");
        sb.append(this.t);
        sb.append(", isFavorite=");
        sb.append(this.u);
        sb.append(", screenOrientation=");
        sb.append(this.v);
        sb.append(", trackCode=");
        sb.append(this.w);
        sb.append(", type=");
        sb.append(this.x);
        sb.append(", controlsType=");
        sb.append(this.y);
        sb.append(", communityId=");
        sb.append(this.z);
        sb.append(", hideTabbar=");
        sb.append(this.A);
        sb.append(", isInternalVkUi=");
        sb.append(this.B);
        sb.append(", shareUrl=");
        sb.append(this.C);
        sb.append(", webViewUrl=");
        sb.append(this.D);
        sb.append(", loaderIcon=");
        sb.append(this.E);
        sb.append(", backgroundLoaderColor=");
        sb.append(this.F);
        sb.append(", catalogBanner=");
        sb.append(this.G);
        sb.append(", needPolicyConfirmation=");
        sb.append(this.H);
        sb.append(", leaderboardType=");
        sb.append(this.I);
        sb.append(", needShowBottomMenuTooltipOnClose=");
        sb.append(this.J);
        sb.append(", preloadAd=");
        sb.append(this.K);
        sb.append(", friendsUseApp=");
        sb.append(this.L);
        sb.append(", canCache=");
        sb.append(this.M);
        sb.append(", hasVkConnect=");
        sb.append(this.N);
        sb.append(", splashScreen=");
        sb.append(this.O);
        sb.append(", isVkPayDisabled=");
        sb.append(this.P);
        sb.append(", isDebug=");
        sb.append(this.Q);
        sb.append(", isBadgesAllowed=");
        sb.append(this.R);
        sb.append(", isRecommended=");
        sb.append(this.S);
        sb.append(", placeholderInfo=");
        sb.append(this.T);
        sb.append(", isImActionsSupported=");
        sb.append(this.U);
        sb.append(", adConfig=");
        sb.append(this.V);
        sb.append(", appStatus=");
        sb.append(this.W);
        sb.append(", isShowUnverifiedScreen=");
        sb.append(this.X);
        sb.append(", slogan=");
        sb.append(this.Y);
        sb.append(", isCallsAvailable=");
        sb.append(this.Z);
        sb.append(", isTrusted=");
        sb.append(this.a0);
        sb.append(", supportUrl=");
        sb.append(this.b0);
        sb.append(", legalInfo=");
        sb.append(this.c0);
        sb.append(", rights=");
        sb.append(this.d0);
        sb.append(", screenshots=");
        return ms9.a(')', sb, this.e0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeLong(this.q);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeInt(this.y);
        parcel.writeLong(this.z);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        Integer num = this.F;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        WebCatalogBanner webCatalogBanner = this.G;
        if (webCatalogBanner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            webCatalogBanner.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.I);
        parcel.writeInt(this.J ? 1 : 0);
        List<AdvertisementType> list = this.K;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AdvertisementType) f.next()).writeToParcel(parcel, i);
            }
        }
        WebFriendsUseApp webFriendsUseApp = this.L;
        if (webFriendsUseApp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            webFriendsUseApp.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.M ? 1 : 0);
        parcel.writeInt(this.N ? 1 : 0);
        WebAppSplashScreen webAppSplashScreen = this.O;
        if (webAppSplashScreen == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            webAppSplashScreen.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.P ? 1 : 0);
        parcel.writeInt(this.Q ? 1 : 0);
        Boolean bool = this.R;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.S;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.T, i);
        parcel.writeInt(this.U ? 1 : 0);
        WebAdConfig webAdConfig = this.V;
        if (webAdConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            webAdConfig.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.W);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeString(this.Y);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.a0 ? 1 : 0);
        parcel.writeString(this.b0);
        WebLegalInfo webLegalInfo = this.c0;
        if (webLegalInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            webLegalInfo.writeToParcel(parcel, i);
        }
        List<WebRights> list2 = this.d0;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((WebRights) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<WebPhoto> list3 = this.e0;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            ((WebPhoto) f3.next()).writeToParcel(parcel, i);
        }
    }
}

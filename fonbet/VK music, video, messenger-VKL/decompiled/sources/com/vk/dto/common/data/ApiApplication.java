package com.vk.dto.common.data;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebAppPlaceholderInfo;
import com.vk.external.miniapp.net.app.WebAppSplashScreen;
import com.vk.external.miniapp.net.app.WebLegalInfo;
import com.vk.external.miniapp.net.app.WebPolicies;
import com.vk.external.miniapp.net.app.WebRights;
import com.vk.log.L;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.vu5;

/* loaded from: classes18.dex */
public class ApiApplication extends Serializer.StreamParcelableAdapter {
    public int A;
    public String B;
    public String C;
    public CatalogInfo D;
    public CatalogBanner E;
    public int F;

    @Nullable
    public String G;

    @Nullable
    public String H;
    public UserId I;
    public boolean J;
    public boolean K;
    public String L;
    public Integer M;
    public boolean N;
    public boolean O;
    public ArrayList P;

    @Nullable
    public FriendsUseApp Q;
    public boolean R;
    public boolean S;
    public WebAppSplashScreen T;
    public boolean U;
    public boolean V;

    @Nullable
    public Boolean W;

    @Nullable
    public Boolean X;
    public WebAppPlaceholderInfo Y;

    @Nullable
    public boolean Z;

    @Nullable
    public WebAdConfig a0;
    public UserId b;
    public int b0;
    public String c;

    @Nullable
    public Boolean c0;
    public Photo d;

    @Nullable
    public String d0;
    public String e;

    @Nullable
    public Boolean e0;
    public String f;

    @Nullable
    public Boolean f0;
    public String g;

    @Nullable
    public String g0;
    public String h;

    @Nullable
    public WebLegalInfo h0;
    public int i;

    @Nullable
    public List<WebRights> i0;
    public int j;
    public String k;
    public String l;
    public int m;
    public String n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public ArrayList<Photo> t;
    public UserId u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;
    public static final int[] j0 = {75, 139, 150, 278, 560, 1120};
    public static final Serializer.c<ApiApplication> CREATOR = new a();
    public static final b k0 = new b();

    public class a extends Serializer.c<ApiApplication> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ApiApplication a(@NonNull Serializer serializer) {
            ApiApplication apiApplication = new ApiApplication();
            UserId userId = UserId.d;
            apiApplication.b = userId;
            apiApplication.p = true;
            apiApplication.t = null;
            apiApplication.u = userId;
            apiApplication.v = false;
            apiApplication.w = false;
            apiApplication.x = false;
            apiApplication.y = 0;
            apiApplication.D = null;
            new ArrayList();
            apiApplication.E = null;
            apiApplication.F = 0;
            apiApplication.I = userId;
            apiApplication.J = false;
            apiApplication.K = false;
            apiApplication.N = false;
            apiApplication.O = false;
            apiApplication.W = null;
            apiApplication.X = null;
            apiApplication.a0 = null;
            apiApplication.b0 = 0;
            apiApplication.c0 = null;
            apiApplication.d0 = null;
            apiApplication.e0 = null;
            apiApplication.f0 = null;
            apiApplication.g0 = null;
            apiApplication.h0 = null;
            apiApplication.i0 = null;
            apiApplication.b = (UserId) serializer.A(UserId.class.getClassLoader());
            apiApplication.c = serializer.H();
            apiApplication.d = (Photo) serializer.G(Photo.class.getClassLoader());
            apiApplication.e = serializer.H();
            apiApplication.f = serializer.H();
            apiApplication.g = serializer.H();
            apiApplication.h = serializer.H();
            apiApplication.C = serializer.H();
            apiApplication.i = serializer.u();
            apiApplication.j = serializer.u();
            apiApplication.k = serializer.H();
            apiApplication.l = serializer.H();
            apiApplication.m = serializer.u();
            apiApplication.p = serializer.p() != 0;
            apiApplication.q = serializer.p() != 0;
            apiApplication.r = serializer.m();
            apiApplication.s = serializer.m();
            apiApplication.y = serializer.u();
            apiApplication.t = serializer.B(Photo.class.getClassLoader());
            apiApplication.u = (UserId) serializer.A(UserId.class.getClassLoader());
            apiApplication.v = serializer.p() != 0;
            apiApplication.D = (CatalogInfo) serializer.G(CatalogInfo.class.getClassLoader());
            apiApplication.w = serializer.p() != 0;
            apiApplication.x = serializer.p() != 0;
            apiApplication.z = serializer.u();
            apiApplication.A = serializer.u();
            apiApplication.B = serializer.H();
            apiApplication.F = serializer.u();
            apiApplication.G = serializer.H();
            apiApplication.H = serializer.H();
            apiApplication.I = (UserId) serializer.A(UserId.class.getClassLoader());
            apiApplication.J = serializer.m();
            apiApplication.K = serializer.m();
            apiApplication.n = serializer.H();
            apiApplication.o = serializer.H();
            apiApplication.L = serializer.H();
            apiApplication.M = serializer.v();
            apiApplication.N = serializer.m();
            apiApplication.O = serializer.m();
            apiApplication.P = serializer.l(ApiApplicationAdType.class.getClassLoader());
            apiApplication.Q = (FriendsUseApp) serializer.A(FriendsUseApp.class.getClassLoader());
            apiApplication.R = serializer.m();
            apiApplication.S = serializer.m();
            apiApplication.T = (WebAppSplashScreen) serializer.A(WebAppSplashScreen.class.getClassLoader());
            apiApplication.U = serializer.m();
            apiApplication.V = serializer.m();
            apiApplication.W = serializer.n();
            apiApplication.X = serializer.n();
            apiApplication.Y = (WebAppPlaceholderInfo) serializer.A(WebAppPlaceholderInfo.class.getClassLoader());
            apiApplication.a0 = (WebAdConfig) serializer.A(WebAdConfig.class.getClassLoader());
            apiApplication.b0 = serializer.u();
            apiApplication.c0 = serializer.n();
            apiApplication.e0 = serializer.n();
            apiApplication.f0 = serializer.n();
            apiApplication.g0 = serializer.H();
            apiApplication.h0 = (WebLegalInfo) serializer.A(WebLegalInfo.class.getClassLoader());
            apiApplication.i0 = serializer.B(WebRights.class.getClassLoader());
            return apiApplication;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApiApplication[i];
        }
    }

    public class b extends aay<ApiApplication> {
        @Override // xsna.aay
        public final ApiApplication a(JSONObject jSONObject) throws JSONException {
            return new ApiApplication(jSONObject);
        }
    }

    public ApiApplication() {
        UserId userId = UserId.d;
        this.b = userId;
        this.p = true;
        this.t = null;
        this.u = userId;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = 0;
        this.D = null;
        new ArrayList();
        this.E = null;
        this.F = 0;
        this.I = userId;
        this.J = false;
        this.K = false;
        this.N = false;
        this.O = false;
        this.W = null;
        this.X = null;
        this.a0 = null;
        this.b0 = 0;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.C);
        serializer.S(this.i);
        serializer.S(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.S(this.m);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
        serializer.L(this.q ? (byte) 1 : (byte) 0);
        serializer.L(this.r ? (byte) 1 : (byte) 0);
        serializer.L(this.s ? (byte) 1 : (byte) 0);
        serializer.S(this.y);
        serializer.f0(this.t);
        serializer.e0(this.u);
        serializer.L(this.v ? (byte) 1 : (byte) 0);
        serializer.i0(this.D);
        serializer.L(this.w ? (byte) 1 : (byte) 0);
        serializer.L(this.x ? (byte) 1 : (byte) 0);
        serializer.S(this.z);
        serializer.S(this.A);
        serializer.j0(this.B);
        serializer.S(this.F);
        serializer.j0(this.G);
        serializer.j0(this.H);
        serializer.e0(this.I);
        serializer.L(this.J ? (byte) 1 : (byte) 0);
        serializer.L(this.K ? (byte) 1 : (byte) 0);
        serializer.j0(this.n);
        serializer.j0(this.o);
        serializer.j0(this.L);
        serializer.V(this.M);
        serializer.L(this.N ? (byte) 1 : (byte) 0);
        serializer.L(this.O ? (byte) 1 : (byte) 0);
        serializer.W(this.P);
        serializer.e0(this.Q);
        serializer.L(this.R ? (byte) 1 : (byte) 0);
        serializer.L(this.S ? (byte) 1 : (byte) 0);
        serializer.e0(this.T);
        serializer.L(this.U ? (byte) 1 : (byte) 0);
        serializer.L(this.V ? (byte) 1 : (byte) 0);
        serializer.J(this.W);
        serializer.J(this.X);
        serializer.e0(this.Y);
        serializer.e0(this.a0);
        serializer.S(this.b0);
        serializer.J(this.c0);
        serializer.J(this.e0);
        serializer.J(this.f0);
        serializer.j0(this.g0);
        serializer.e0(this.h0);
        serializer.f0(this.i0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ApiApplication apiApplication = (ApiApplication) obj;
            if (Objects.equals(this.b, apiApplication.b) && this.v == apiApplication.v && this.x == apiApplication.x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Boolean.valueOf(this.v), Boolean.valueOf(this.x));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApiApplication_{id=");
        sb.append(this.b);
        sb.append(", title='");
        sb.append(this.c);
        sb.append("', description='");
        sb.append(this.g);
        sb.append("', packageName='");
        sb.append(this.k);
        sb.append("', members=");
        return vu5.b(sb, this.i, '}');
    }

    public final Boolean zb() {
        return Boolean.valueOf("html5_game".equals(this.C));
    }

    public ApiApplication(ApiApplication apiApplication) {
        UserId userId = UserId.d;
        this.b = userId;
        this.p = true;
        this.t = null;
        this.u = userId;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = 0;
        this.D = null;
        new ArrayList();
        this.E = null;
        this.F = 0;
        this.I = userId;
        this.J = false;
        this.K = false;
        this.N = false;
        this.O = false;
        this.W = null;
        this.X = null;
        this.a0 = null;
        this.b0 = 0;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.b = apiApplication.b;
        this.c = apiApplication.c;
        this.g = apiApplication.g;
        this.h = apiApplication.h;
        this.C = apiApplication.C;
        this.d = apiApplication.d;
        this.k = apiApplication.k;
        this.p = apiApplication.p;
        this.i = apiApplication.i;
        this.e = apiApplication.e;
        this.f = apiApplication.f;
        this.l = apiApplication.l;
        this.m = apiApplication.m;
        this.n = apiApplication.n;
        this.o = apiApplication.o;
        this.q = apiApplication.q;
        this.r = apiApplication.r;
        this.s = apiApplication.s;
        this.j = apiApplication.j;
        this.t = apiApplication.t;
        this.u = apiApplication.u;
        this.v = apiApplication.v;
        this.w = apiApplication.w;
        this.x = apiApplication.x;
        this.z = apiApplication.z;
        this.A = apiApplication.A;
        this.B = apiApplication.B;
        this.E = apiApplication.E;
        this.F = apiApplication.F;
        this.G = apiApplication.G;
        this.H = apiApplication.H;
        this.J = apiApplication.J;
        this.K = apiApplication.K;
        this.L = apiApplication.L;
        this.M = apiApplication.M;
        this.N = apiApplication.N;
        this.O = apiApplication.O;
        this.P = apiApplication.P;
        this.Q = apiApplication.Q;
        this.R = apiApplication.R;
        this.S = apiApplication.S;
        this.T = apiApplication.T;
        this.V = apiApplication.V;
        this.U = apiApplication.U;
        this.W = apiApplication.W;
        this.X = apiApplication.X;
        this.Z = apiApplication.Z;
        this.a0 = apiApplication.a0;
        this.b0 = apiApplication.b0;
        this.c0 = apiApplication.c0;
        this.d0 = apiApplication.d0;
        this.e0 = apiApplication.e0;
        this.f0 = apiApplication.f0;
        this.g0 = apiApplication.g0;
        this.h0 = apiApplication.h0;
        this.i0 = apiApplication.i0;
    }

    public ApiApplication(JSONObject jSONObject) {
        String str;
        UserId userId = UserId.d;
        this.b = userId;
        this.p = true;
        this.t = null;
        this.u = userId;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = 0;
        this.D = null;
        new ArrayList();
        this.E = null;
        this.F = 0;
        this.I = userId;
        this.J = false;
        this.K = false;
        this.N = false;
        this.O = false;
        this.W = null;
        this.X = null;
        this.a0 = null;
        this.b0 = 0;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        try {
            this.b = new UserId(jSONObject.getLong("id"));
            this.c = jSONObject.getString("title");
            this.g = jSONObject.optString("description");
            if (!jSONObject.has("short_description")) {
                str = this.g;
                if (str != null) {
                    char[] cArr = {JwtParser.SEPARATOR_CHAR, '!', '?', ';'};
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i >= str.length()) {
                            break;
                        }
                        char[] cArr2 = cArr;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 4) {
                                break;
                            }
                            int i4 = i3;
                            if (cArr2[i3] == str.charAt(i)) {
                                i2++;
                                break;
                            }
                            i3 = i4 + 1;
                        }
                        int i5 = i2;
                        if (i5 >= 1) {
                            str = str.substring(0, i + 1);
                            break;
                        } else {
                            i++;
                            i2 = i5;
                            cArr = cArr2;
                        }
                    }
                } else {
                    str = null;
                }
            } else {
                str = jSONObject.optString("short_description");
            }
            this.h = str;
            int[] iArr = j0;
            ArrayList arrayList = new ArrayList(6);
            this.C = jSONObject.optString("type");
            int i6 = 0;
            for (int i7 = 6; i6 < i7; i7 = 6) {
                int i8 = iArr[i6];
                arrayList.add(new ImageSize(jSONObject.optString("icon_" + i8), i8, i8, Boolean.FALSE, ImageSize.b.c(i8, i8)));
                i6++;
                iArr = iArr;
            }
            this.d = new Photo(new Image(arrayList));
            this.k = jSONObject.optString("platform_id");
            this.p = jSONObject.optInt("is_new") == 1;
            this.i = jSONObject.optInt("members_count");
            this.e = jSONObject.optString("banner_560");
            this.f = jSONObject.optString("banner_1120");
            this.l = jSONObject.optString("genre");
            this.m = jSONObject.optInt("genre_id", 0);
            this.n = jSONObject.optString("badge");
            this.o = jSONObject.optString("notification_badge_type");
            this.q = jSONObject.optInt("push_enabled") == 1;
            this.r = jSONObject.optBoolean("are_notifications_enabled");
            this.s = jSONObject.optBoolean("is_install_screen");
            if (jSONObject.has("friends")) {
                this.j = jSONObject.getJSONArray("friends").length();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("screenshots");
            if (optJSONArray != null) {
                this.t = new ArrayList<>(optJSONArray.length());
                for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                    this.t.add(new Photo(optJSONArray.getJSONObject(i9)));
                }
            }
            this.u = new UserId(jSONObject.optLong("author_owner_id", 0L));
            this.v = jSONObject.optBoolean("is_installed");
            this.w = jSONObject.optInt("is_in_catalog", 0) != 0;
            this.x = jSONObject.optBoolean("is_favorite", false);
            this.z = jSONObject.optInt("screen_orientation");
            this.A = jSONObject.optInt("leaderboard_type");
            this.B = jSONObject.optString("track_code");
            if (jSONObject.has("catalog_banner")) {
                this.E = CatalogBanner.a(jSONObject.getJSONObject("catalog_banner"));
            }
            this.F = jSONObject.optInt("mobile_controls_type", 1);
            this.G = jSONObject.optString("webview_url", null);
            this.H = jSONObject.optString("share_url", null);
            boolean z = true;
            if (jSONObject.optInt("hide_tabbar", 0) != 1) {
                z = false;
            }
            this.J = z;
            this.K = jSONObject.optBoolean("is_vkui_internal", false);
            this.L = jSONObject.optString("loader_icon");
            if (jSONObject.has("background_loader_color")) {
                String string = jSONObject.getString("background_loader_color");
                Parcelable.Creator<WebApiApplication> creator = WebApiApplication.CREATOR;
                this.M = Integer.valueOf(WebApiApplication.a.b(string));
            }
            this.N = jSONObject.optBoolean("need_policy_confirmation");
            this.O = jSONObject.optBoolean("need_show_bottom_menu_tooltip_on_close", false);
            JSONArray optJSONArray2 = jSONObject.optJSONArray("preload_ad_types");
            if (optJSONArray2 != null) {
                this.P = new ArrayList(optJSONArray2.length());
                for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                    ArrayList arrayList2 = this.P;
                    String string2 = optJSONArray2.getString(i10);
                    ApiApplicationAdType.Companion.getClass();
                    arrayList2.add(ApiApplicationAdType.valueOf(string2.toUpperCase(Locale.ROOT)));
                }
            }
            if (jSONObject.has("friends_use_app")) {
                this.Q = FriendsUseApp.a(jSONObject.getJSONObject("friends_use_app"));
            }
            this.R = jSONObject.optBoolean("can_cache", false);
            this.S = jSONObject.optBoolean("has_vk_connect", false);
            JSONObject optJSONObject = jSONObject.optJSONObject("splash_screen");
            if (optJSONObject != null) {
                this.T = new WebAppSplashScreen(optJSONObject.optString("url", ""), optJSONObject.optString("background_color", ""), optJSONObject.optBoolean("is_animated", false));
            }
            this.V = jSONObject.optBoolean("is_debug", false);
            this.U = jSONObject.optBoolean("is_vk_pay_disabled", false);
            if (jSONObject.has("is_badge_allowed")) {
                this.W = Boolean.valueOf(jSONObject.getBoolean("is_badge_allowed"));
            }
            if (jSONObject.has("is_recommended")) {
                this.X = Boolean.valueOf(jSONObject.getBoolean("is_recommended"));
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("placeholder_info");
            if (optJSONObject2 != null) {
                WebAppPlaceholderInfo.CREATOR.getClass();
                String optString = optJSONObject2.optString("title");
                String optString2 = optJSONObject2.optString("subtitle");
                int optInt = optJSONObject2.optInt("reason", 0);
                WebAppPlaceholderInfo.Reason.Companion.getClass();
                this.Y = new WebAppPlaceholderInfo(optString, optString2, WebAppPlaceholderInfo.Reason.a.a(optInt));
            }
            this.Z = jSONObject.optBoolean("is_im_actions_supported", false);
            JSONObject optJSONObject3 = jSONObject.optJSONObject("ad_config");
            if (optJSONObject3 != null) {
                this.a0 = new WebAdConfig(optJSONObject3.optInt("id", 0), optJSONObject3.optInt("ads_external_id", 0), optJSONObject3.optBoolean("test_mode", false), optJSONObject3.optBoolean("mob_web_enabled", false), optJSONObject3.optBoolean("splash_ad_enabled", false), optJSONObject3.optBoolean("closing_ad_enabled", false));
            }
            this.b0 = jSONObject.optInt("app_status", 0);
            this.c0 = Boolean.valueOf(jSONObject.optBoolean("need_show_unverified_screen", false));
            if (jSONObject.has("slogan")) {
                this.d0 = jSONObject.optString("slogan");
            }
            this.e0 = Boolean.valueOf(jSONObject.optBoolean("is_calls_available", false));
            this.f0 = Boolean.valueOf(jSONObject.optBoolean("is_trusted", false));
            if (jSONObject.has("support_url")) {
                this.g0 = jSONObject.optString("support_url");
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("legal_info");
            if (optJSONObject4 != null) {
                String string3 = optJSONObject4.getString("company_name");
                String string4 = optJSONObject4.getString("legal_address");
                JSONObject jSONObject2 = optJSONObject4.getJSONObject("policies");
                this.h0 = new WebLegalInfo(string3, string4, new WebPolicies(jSONObject2.getString("privacy_policy"), jSONObject2.getString("terms")), optJSONObject4.getString("inn"), optJSONObject4.getString("support_text"));
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("rights");
            if (optJSONArray3 != null) {
                this.i0 = new ArrayList(optJSONArray3.length());
                for (int i11 = 0; i11 < optJSONArray3.length(); i11++) {
                    List<WebRights> list = this.i0;
                    JSONObject jSONObject3 = optJSONArray3.getJSONObject(i11);
                    list.add(new WebRights(jSONObject3.getString("name"), jSONObject3.getString("header"), jSONObject3.getString("description"), jSONObject3.getInt("mask")));
                }
            }
        } catch (Exception e) {
            L.C("vk", e);
        }
    }
}

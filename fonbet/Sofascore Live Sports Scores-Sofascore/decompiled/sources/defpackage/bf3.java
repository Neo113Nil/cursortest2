package defpackage;

import android.os.Bundle;
import com.ironsource.U3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.reflect.KMutableProperty1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class bf3 {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return U3.i.X;
            case 2:
                return "event_time";
            case 3:
                return "event_name";
            case 4:
                return "content_ids";
            case 5:
                return "contents";
            case 6:
                return "content_type";
            case 7:
                return "description";
            case 8:
                return "level";
            case 9:
                return "max_rating_value";
            case 10:
                return "num_items";
            case 11:
                return "payment_info_available";
            case 12:
                return "registration_method";
            case 13:
                return "search_string";
            case 14:
                return "success";
            case 15:
                return "order_id";
            case 16:
                return "ad_type";
            case 17:
                return InAppPurchaseMetaData.KEY_CURRENCY;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String b(int i) {
        switch (i) {
            case 1:
                return "anon_id";
            case 2:
                return "fb_login_id";
            case 3:
                return "madid";
            case 4:
                return "page_id";
            case 5:
                return "page_scoped_user_id";
            case 6:
                return "ud";
            case 7:
                return "advertiser_tracking_enabled";
            case 8:
                return "application_tracking_enabled";
            case 9:
                return "consider_views";
            case 10:
                return "device_token";
            case 11:
                return "extInfo";
            case 12:
                return "include_dwell_data";
            case 13:
                return "include_video_data";
            case 14:
                return "install_referrer";
            case 15:
                return "installer_package";
            case 16:
                return "receipt_data";
            case 17:
                return "url_schemes";
            case 18:
                return "add_to_messaging_customer_base_for_whatsapp";
            default:
                throw null;
        }
    }

    public static int c(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    public static goa d(utc utcVar, float f, av8 av8Var, float f2, boolean z) {
        nq8.h(av8Var, bkh.p(utcVar, f));
        return new goa(f2, z);
    }

    public static xff e(mc4 mc4Var, int i) {
        return y65.b(new hc4(mc4Var, i, 1));
    }

    public static Bundle f(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static String g(float f, int i, av8 av8Var, av8 av8Var2, utc utcVar) {
        nq8.h(av8Var, bkh.e(utcVar, f));
        return oea.v(i, av8Var2);
    }

    public static String h(int i, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public static String i(int i, StringBuilder sb) {
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }

    public static String j(Exception exc, StringBuilder sb) {
        sb.append(exc.getMessage());
        return sb.toString();
    }

    public static String k(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String l(String str, String str2, boolean z) {
        return str + z + str2;
    }

    public static String m(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static String n(StringBuilder sb, Integer num, char c) {
        sb.append(num);
        sb.append(c);
        return sb.toString();
    }

    public static String o(StringBuilder sb, Throwable th) {
        sb.append(th.getMessage());
        return sb.toString();
    }

    public static StringBuilder p(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static KMutableProperty1 q(Class cls, String str, String str2, int i, fuf fufVar) {
        return fufVar.mutableProperty1(new t0d(cls, str, str2, i));
    }

    public static void r(float f, int i, av8 av8Var, av8 av8Var2, utc utcVar) {
        av8Var.d0(i);
        nq8.h(av8Var2, bkh.e(utcVar, f));
    }

    public static void s(int i, av8 av8Var, f50 f50Var, av8 av8Var2, ry ryVar) {
        waa.K(av8Var, Integer.valueOf(i), f50Var);
        waa.J(av8Var2, ryVar);
    }

    public static void t(av8 av8Var, boolean z, utc utcVar, float f, av8 av8Var2) {
        av8Var.s(z);
        nq8.h(av8Var2, bkh.e(utcVar, f));
    }

    public static void u(utc utcVar, float f, av8 av8Var, boolean z) {
        nq8.h(av8Var, bkh.p(utcVar, f));
        av8Var.s(z);
    }

    public static void v(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static xff w(mc4 mc4Var, int i) {
        return uhh.a(new hc4(mc4Var, i, 1));
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "CUSTOM_EVENTS" : "CUSTOM_DATA" : "APP_DATA" : "USER_DATA";
    }
}

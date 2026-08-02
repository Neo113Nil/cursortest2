package defpackage;

import com.facebook.b;
import com.facebook.internal.a0;
import com.facebook.internal.k0;
import com.facebook.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class ud0 {
    public static final Map a = tub.h(new Pair(od0.ANON_ID, new td0(1, 1)), new Pair(od0.APP_USER_ID, new td0(1, 2)), new Pair(od0.ADVERTISER_ID, new td0(1, 3)), new Pair(od0.PAGE_ID, new td0(1, 4)), new Pair(od0.PAGE_SCOPED_USER_ID, new td0(1, 5)), new Pair(od0.ADV_TE, new td0(2, 7)), new Pair(od0.APP_TE, new td0(2, 8)), new Pair(od0.CONSIDER_VIEWS, new td0(2, 9)), new Pair(od0.DEVICE_TOKEN, new td0(2, 10)), new Pair(od0.EXT_INFO, new td0(2, 11)), new Pair(od0.INCLUDE_DWELL_DATA, new td0(2, 12)), new Pair(od0.INCLUDE_VIDEO_DATA, new td0(2, 13)), new Pair(od0.INSTALL_REFERRER, new td0(2, 14)), new Pair(od0.INSTALLER_PACKAGE, new td0(2, 15)), new Pair(od0.RECEIPT_DATA, new td0(2, 16)), new Pair(od0.URL_SCHEMES, new td0(2, 17)), new Pair(od0.ADD_TO_MESSAGING_CUSTOMER_BASE_FOR_WHATSAPP, new td0(2, 18)), new Pair(od0.USER_DATA, new td0(1, 0)));
    public static final Map b = tub.h(new Pair(a94.EVENT_TIME, new sd0(0, 2)), new Pair(a94.EVENT_NAME, new sd0(0, 3)), new Pair(a94.VALUE_TO_SUM, new sd0(3, 1)), new Pair(a94.CONTENT_IDS, new sd0(3, 4)), new Pair(a94.CONTENTS, new sd0(3, 5)), new Pair(a94.CONTENT_TYPE, new sd0(3, 6)), new Pair(a94.CURRENCY, new sd0(3, 17)), new Pair(a94.DESCRIPTION, new sd0(3, 7)), new Pair(a94.LEVEL, new sd0(3, 8)), new Pair(a94.MAX_RATING_VALUE, new sd0(3, 9)), new Pair(a94.NUM_ITEMS, new sd0(3, 10)), new Pair(a94.PAYMENT_INFO_AVAILABLE, new sd0(3, 11)), new Pair(a94.REGISTRATION_METHOD, new sd0(3, 12)), new Pair(a94.SEARCH_STRING, new sd0(3, 13)), new Pair(a94.SUCCESS, new sd0(3, 14)), new Pair(a94.ORDER_ID, new sd0(3, 15)), new Pair(a94.AD_TYPE, new sd0(3, 16)));
    public static final Map c = tub.h(new Pair("fb_mobile_achievement_unlocked", os3.UNLOCKED_ACHIEVEMENT), new Pair("fb_mobile_activate_app", os3.ACTIVATED_APP), new Pair("fb_mobile_add_payment_info", os3.ADDED_PAYMENT_INFO), new Pair("fb_mobile_add_to_cart", os3.ADDED_TO_CART), new Pair("fb_mobile_add_to_wishlist", os3.ADDED_TO_WISHLIST), new Pair("fb_mobile_complete_registration", os3.COMPLETED_REGISTRATION), new Pair("fb_mobile_content_view", os3.VIEWED_CONTENT), new Pair("fb_mobile_initiated_checkout", os3.INITIATED_CHECKOUT), new Pair("fb_mobile_level_achieved", os3.ACHIEVED_LEVEL), new Pair("fb_mobile_purchase", os3.PURCHASED), new Pair("fb_mobile_rate", os3.RATED), new Pair("fb_mobile_search", os3.SEARCHED), new Pair("fb_mobile_spent_credits", os3.SPENT_CREDITS), new Pair("fb_mobile_tutorial_completion", os3.COMPLETED_TUTORIAL));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.HashMap] */
    public static final Object a(Object obj, String str) {
        int i = (str.equals("extInfo") || str.equals("url_schemes") || str.equals("fb_content_id") || str.equals("fb_content") || str.equals("data_processing_options")) ? 1 : (str.equals("advertiser_tracking_enabled") || str.equals("application_tracking_enabled")) ? 2 : str.equals("_logTime") ? 3 : 0;
        String str2 = obj instanceof String ? (String) obj : null;
        if (i == 0 || str2 == null) {
            return obj;
        }
        int C = wt3.C(i);
        if (C != 0) {
            if (C != 1) {
                if (C == 2) {
                    return StringsKt.toIntOrNull(obj.toString());
                }
                zzl.b();
                return null;
            }
            Integer intOrNull = StringsKt.toIntOrNull(str2.toString());
            if (intOrNull != null) {
                return Boolean.valueOf(intOrNull.intValue() != 0);
            }
            return null;
        }
        try {
            ArrayList f = k0.f(new JSONArray(str2));
            ArrayList arrayList = new ArrayList();
            Iterator it = f.iterator();
            while (it.hasNext()) {
                ?? r0 = (String) it.next();
                try {
                    try {
                        r0 = k0.g(new JSONObject((String) r0));
                    } catch (JSONException unused) {
                        r0 = k0.f(new JSONArray((String) r0));
                    }
                } catch (JSONException unused2) {
                }
                arrayList.add(r0);
            }
            return arrayList;
        } catch (JSONException unused3) {
            b bVar = a0.a;
            synchronized (w.b) {
                return Unit.a;
            }
        }
    }
}

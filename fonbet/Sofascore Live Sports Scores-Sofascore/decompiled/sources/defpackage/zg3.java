package defpackage;

import android.content.SharedPreferences;
import android.graphics.PathMeasure;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.webkit.WebSettings;
import com.ironsource.U3;
import com.sofascore.results.R;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.UUID;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zg3 extends xka implements Function0 {
    public static final zg3 A;
    public static final zg3 B;
    public static final zg3 C;
    public static final zg3 D;
    public static final zg3 E;
    public static final zg3 F;
    public static final zg3 G;
    public static final zg3 H;
    public static final zg3 I;
    public static final zg3 J;
    public static final zg3 K;
    public static final zg3 L;
    public static final zg3 M;
    public static final zg3 j;
    public static final zg3 k;
    public static final zg3 l;
    public static final zg3 m;
    public static final zg3 n;
    public static final zg3 o;
    public static final zg3 p;
    public static final zg3 q;
    public static final zg3 r;
    public static final zg3 s;
    public static final zg3 t;
    public static final zg3 u;
    public static final zg3 v;
    public static final zg3 w;
    public static final zg3 x;
    public static final zg3 y;
    public static final zg3 z;
    public final /* synthetic */ int i;

    static {
        int i = 0;
        j = new zg3(i, 0);
        k = new zg3(i, 1);
        l = new zg3(i, 2);
        m = new zg3(i, 3);
        n = new zg3(i, 4);
        o = new zg3(i, 5);
        p = new zg3(i, 6);
        q = new zg3(i, 7);
        r = new zg3(i, 8);
        s = new zg3(i, 9);
        t = new zg3(i, 10);
        u = new zg3(i, 11);
        v = new zg3(i, 12);
        w = new zg3(i, 13);
        x = new zg3(i, 14);
        y = new zg3(i, 15);
        z = new zg3(i, 16);
        A = new zg3(i, 17);
        B = new zg3(i, 18);
        C = new zg3(i, 19);
        D = new zg3(i, 20);
        E = new zg3(i, 21);
        F = new zg3(i, 22);
        G = new zg3(i, 23);
        H = new zg3(i, 24);
        I = new zg3(i, 25);
        J = new zg3(i, 26);
        K = new zg3(i, 27);
        L = new zg3(i, 28);
        M = new zg3(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg3(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object u2gVar;
        Object u2gVar2;
        Object u2gVar3;
        switch (this.i) {
            case 0:
                dh3.b("LocalWindowInfo");
                throw null;
            case 1:
                uhi uhiVar = uhi.a;
                return new q79(uhiVar, uhiVar, 1);
            case 2:
                return Executors.newSingleThreadExecutor(new u14(0));
            case 3:
                return new xg0(x0h.a, 2);
            case 4:
                return new xg0(u7k.a, 2);
            case 5:
                return Boolean.TRUE;
            case 6:
                return new qq3("exposureChange", pj6.INSTANCE, new Annotation[0]);
            case 7:
                return Boolean.FALSE;
            case 8:
                return new s75(0L);
            case 9:
                return Executors.newCachedThreadPool();
            case 10:
                return new q79(uhi.a, gz1.a, 1);
            case 11:
                return new jod();
            case 12:
                return null;
            case 13:
                uhi uhiVar2 = uhi.a;
                return new xg0(new q79(uhiVar2, new xg0(uhiVar2, 0), 1), 2);
            case 14:
                return Boolean.FALSE;
            case 15:
                return new wma(3);
            case 16:
                return new xg0(yh0.a, 0);
            case 17:
                String str = gcd.a;
                InputStream openRawResource = oie.a().getResources().openRawResource(R.raw.nimbus_omsdk_v1);
                openRawResource.getClass();
                xk0 I2 = f6a.I(openRawResource);
                lof lofVar = new lof(I2);
                try {
                    x52 x52Var = lofVar.b;
                    x52Var.M0(I2);
                    String E0 = x52Var.E0();
                    lofVar.close();
                    return E0;
                } finally {
                }
            case 18:
                return new d20(new PathMeasure());
            case 19:
                return null;
            case 20:
                iie iieVar = iie.a;
                iie.a();
                try {
                    p2g p2gVar = w2g.b;
                    Object string = iie.a().getString("Nimbus-Instance-Id", null);
                    u2gVar = string;
                    if (string == null) {
                        try {
                            String string2 = Settings.Secure.getString(oie.a().getContentResolver(), "android_id");
                            string2.getClass();
                            byte[] bytes = string2.getBytes(Charsets.UTF_8);
                            bytes.getClass();
                            u2gVar2 = UUID.nameUUIDFromBytes(bytes).toString();
                        } catch (Throwable th) {
                            p2g p2gVar2 = w2g.b;
                            u2gVar2 = new u2g(th);
                        }
                        Object uuid = UUID.randomUUID().toString();
                        uuid.getClass();
                        if (u2gVar2 instanceof u2g) {
                            u2gVar2 = uuid;
                        }
                        String str2 = (String) u2gVar2;
                        iie iieVar2 = iie.a;
                        SharedPreferences.Editor edit = iie.a().edit();
                        edit.putString("Nimbus-Instance-Id", str2);
                        edit.apply();
                        u2gVar = str2;
                    }
                } catch (Throwable th2) {
                    p2g p2gVar3 = w2g.b;
                    u2gVar = new u2g(th2);
                }
                String C2 = fc6.C();
                boolean z2 = u2gVar instanceof u2g;
                Object obj = u2gVar;
                if (z2) {
                    obj = C2;
                }
                return (String) obj;
            case 21:
                return PreferenceManager.getDefaultSharedPreferences(oie.a());
            case 22:
                return WebSettings.getDefaultUserAgent(oie.a());
            case 23:
                return null;
            case 24:
                return x9h.c("_currency", "_valueToSum", "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_ids", "fb_content_type", "fb_contents", "fb_country", "fb_currency", "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", "fb_num_items", "fb_order_id", "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_state_of_vehicle", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", U3.j.W, "_eventName", "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", "_logTime", "_session_id", "_ui", "_valueToUpdate", "_is_fb_codeless", "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", "anonymous_id", "campaign_ids", "add_to_messaging_customer_base_for_whatsapp", "fb_post_attachment", "receipt_data", "ad_type", "fb_content", "fb_content_id", "fb_description", "fb_level", "fb_max_rating_value", "fb_payment_info_available", "fb_registration_method", "fb_success", "pm", "_audiencePropertyIds", "cs_maca");
            case 25:
                return new htf(duf.a.getOrCreateKotlinClass(String.class), uhi.a);
            case 26:
                return new qq3("resize", x0g.INSTANCE, new Annotation[0]);
            case 27:
                uhi uhiVar3 = uhi.a;
                return new q79(uhiVar3, uhiVar3, 1);
            case 28:
                uhi uhiVar4 = uhi.a;
                return new q79(uhiVar4, uhiVar4, 1);
            default:
                int i = ydi.d;
                try {
                    p2g p2gVar4 = w2g.b;
                    u2gVar3 = Boolean.valueOf(y0l.b("WEB_MESSAGE_LISTENER"));
                } catch (Throwable th3) {
                    p2g p2gVar5 = w2g.b;
                    u2gVar3 = new u2g(th3);
                }
                Object obj2 = Boolean.FALSE;
                if (u2gVar3 instanceof u2g) {
                    u2gVar3 = obj2;
                }
                return (Boolean) u2gVar3;
        }
    }
}

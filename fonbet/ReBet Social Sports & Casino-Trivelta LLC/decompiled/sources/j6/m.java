package j6;

import com.appsflyer.AdRevenueScheme;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public enum m {
    EVENT_TIME("_logTime"),
    EVENT_NAME("_eventName"),
    VALUE_TO_SUM("_valueToSum"),
    CONTENT_IDS("fb_content_id"),
    CONTENTS("fb_content"),
    CONTENT_TYPE("fb_content_type"),
    DESCRIPTION("fb_description"),
    LEVEL("fb_level"),
    MAX_RATING_VALUE("fb_max_rating_value"),
    NUM_ITEMS("fb_num_items"),
    PAYMENT_INFO_AVAILABLE("fb_payment_info_available"),
    REGISTRATION_METHOD("fb_registration_method"),
    SEARCH_STRING("fb_search_string"),
    SUCCESS("fb_success"),
    ORDER_ID("fb_order_id"),
    AD_TYPE(AdRevenueScheme.AD_TYPE),
    CURRENCY("fb_currency");


    /* renamed from: b, reason: collision with root package name */
    public static final a f53779b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f53797a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a(String rawValue) {
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            for (m mVar : m.valuesCustom()) {
                if (Intrinsics.areEqual(mVar.b(), rawValue)) {
                    return mVar;
                }
            }
            return null;
        }

        public a() {
        }
    }

    m(String str) {
        this.f53797a = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static m[] valuesCustom() {
        m[] valuesCustom = values();
        return (m[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String b() {
        return this.f53797a;
    }
}

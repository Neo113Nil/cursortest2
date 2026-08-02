package j6;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC5095b {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER("install_referrer"),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA("receipt_data"),
    URL_SCHEMES("url_schemes");


    /* renamed from: b, reason: collision with root package name */
    public static final a f53671b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f53689a;

    /* renamed from: j6.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC5095b a(String rawValue) {
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            for (EnumC5095b enumC5095b : EnumC5095b.valuesCustom()) {
                if (Intrinsics.areEqual(enumC5095b.b(), rawValue)) {
                    return enumC5095b;
                }
            }
            return null;
        }

        public a() {
        }
    }

    EnumC5095b(String str) {
        this.f53689a = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5095b[] valuesCustom() {
        EnumC5095b[] valuesCustom = values();
        return (EnumC5095b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String b() {
        return this.f53689a;
    }
}

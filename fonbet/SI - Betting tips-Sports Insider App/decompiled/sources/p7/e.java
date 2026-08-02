package p7;

import com.google.android.gms.common.Feature;
import g6.v;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Feature f21526a;

    /* renamed from: b, reason: collision with root package name */
    public static final Feature f21527b;

    /* renamed from: c, reason: collision with root package name */
    public static final Feature[] f21528c;

    static {
        Feature feature = new Feature("name_ulr_private", 1L);
        Feature feature2 = new Feature("name_sleep_segment_request", 1L);
        Feature feature3 = new Feature("get_last_activity_feature_id", 1L);
        Feature feature4 = new Feature("support_context_feature_id", 1L);
        Feature feature5 = new Feature("get_current_location", 2L);
        Feature feature6 = new Feature("get_last_location_with_request", 1L);
        f21526a = feature6;
        Feature feature7 = new Feature("set_mock_mode_with_callback", 1L);
        Feature feature8 = new Feature("set_mock_location_with_callback", 1L);
        Feature feature9 = new Feature("inject_location_with_callback", 1L);
        Feature feature10 = new Feature("location_updates_with_callback", 1L);
        f21527b = feature10;
        f21528c = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9, feature10, new Feature("use_safe_parcelable_in_intents", 1L), new Feature("flp_debug_updates", 1L), new Feature("google_location_accuracy_enabled", 1L), new Feature("geofences_with_callback", 1L), new Feature("location_enabled", 1L)};
    }

    public static void a(int i5) {
        boolean z5;
        if (i5 != 100 && i5 != 102 && i5 != 104) {
            if (i5 != 105) {
                z5 = false;
                v.c(z5, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i5));
            }
            i5 = 105;
        }
        z5 = true;
        v.c(z5, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i5));
    }

    public static String b(int i5) {
        if (i5 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i5 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i5 == 104) {
            return "LOW_POWER";
        }
        if (i5 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }

    public static String c(int i5) {
        if (i5 == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i5 == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i5 == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }
}

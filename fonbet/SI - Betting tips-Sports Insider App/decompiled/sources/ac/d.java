package ac;

import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.profile.Attribute;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f126a = new d();

    public final void a(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.isEmpty()) {
            return;
        }
        UserProfile.Builder newBuilder = UserProfile.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        Object obj = map.get("BillingCountry");
        if (obj != null && (obj instanceof String)) {
            newBuilder.apply(Attribute.customString("BillingCountry").withValue((String) obj));
        }
        Object obj2 = map.get("liveActive");
        if (obj2 != null && (obj2 instanceof Boolean)) {
            newBuilder.apply(Attribute.customBoolean("liveActive").withValue(((Boolean) obj2).booleanValue()));
        }
        Object obj3 = map.get("premiumActive");
        if (obj3 != null && (obj3 instanceof Boolean)) {
            newBuilder.apply(Attribute.customBoolean("premiumActive").withValue(((Boolean) obj3).booleanValue()));
        }
        Object obj4 = map.get("expressActive");
        if (obj4 != null && (obj4 instanceof Boolean)) {
            newBuilder.apply(Attribute.customBoolean("expressActive").withValue(((Boolean) obj4).booleanValue()));
        }
        Object obj5 = map.get("diamondActive");
        if (obj5 != null && (obj5 instanceof Boolean)) {
            newBuilder.apply(Attribute.customBoolean("diamondActive").withValue(((Boolean) obj5).booleanValue()));
        }
        Object obj6 = map.get("notificationsEnabled");
        if (obj6 != null && (obj6 instanceof Boolean)) {
            newBuilder.apply(Attribute.notificationsEnabled().withValue(((Boolean) obj6).booleanValue()));
        }
        AppMetrica.reportUserProfile(newBuilder.build());
    }
}

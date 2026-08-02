package com.braze.reactbridge;

import android.os.Bundle;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.reactbridge.util.MapFactoryKt;
import com.facebook.react.bridge.WritableMap;
import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J \u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0002¨\u0006\u0011"}, d2 = {"Lcom/braze/reactbridge/PushPayloadMapper;", "", "<init>", "()V", "createPushNotificationMap", "Lcom/facebook/react/bridge/WritableMap;", EventKeys.PAYLOAD, "Lcom/braze/models/push/BrazeNotificationPayload;", "payloadType", "", "deepLinkOverride", "rawExtras", "Landroid/os/Bundle;", "bundleToMap", "bundle", "filteringKeys", "", "braze_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPushPayloadMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushPayloadMapper.kt\ncom/braze/reactbridge/PushPayloadMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1#2:97\n774#3:98\n865#3,2:99\n1869#3,2:101\n*S KotlinDebug\n*F\n+ 1 PushPayloadMapper.kt\ncom/braze/reactbridge/PushPayloadMapper\n*L\n88#1:98\n88#1:99,2\n89#1:101,2\n*E\n"})
/* loaded from: classes.dex */
public final class PushPayloadMapper {

    @NotNull
    public static final PushPayloadMapper INSTANCE = new PushPayloadMapper();

    private PushPayloadMapper() {
    }

    private final WritableMap bundleToMap(Bundle bundle, Set<String> filteringKeys) {
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        Set<String> keySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "keySet(...)");
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (!filteringKeys.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        for (String str : arrayList) {
            Intrinsics.checkNotNull(str);
            Object obj2 = bundle.get(str);
            mutableMap.putString(str, obj2 != null ? obj2.toString() : null);
        }
        return mutableMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WritableMap bundleToMap$default(PushPayloadMapper pushPayloadMapper, Bundle bundle, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = SetsKt.emptySet();
        }
        return pushPayloadMapper.bundleToMap(bundle, set);
    }

    @JvmStatic
    @NotNull
    public static final WritableMap createPushNotificationMap(@NotNull BrazeNotificationPayload payload, @NotNull String payloadType, @Nullable String deepLinkOverride, @Nullable Bundle rawExtras) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(payloadType, "payloadType");
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        mutableMap.putString(EventKeys.PAYLOAD_TYPE, payloadType);
        if (deepLinkOverride == null) {
            deepLinkOverride = payload.getDeeplink();
        }
        mutableMap.putString(EventKeys.URL, deepLinkOverride);
        mutableMap.putString("title", payload.getTitleText());
        mutableMap.putString("body", payload.getContentText());
        mutableMap.putString("summary_text", payload.getSummaryText());
        Integer notificationBadgeNumber = payload.getNotificationBadgeNumber();
        if (notificationBadgeNumber != null) {
            mutableMap.putInt("badge_count", notificationBadgeNumber.intValue());
        }
        Long valueOf = Long.valueOf(payload.getNotificationExtras().getLong("braze_push_received_timestamp"));
        if (valueOf.longValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            mutableMap.putDouble(EventKeys.TIMESTAMP, valueOf.longValue());
        }
        mutableMap.putBoolean("use_webview", Intrinsics.areEqual(payload.getNotificationExtras().getString("ab_use_webview"), "true"));
        mutableMap.putBoolean("is_silent", payload.getTitleText() == null && payload.getContentText() == null);
        mutableMap.putBoolean("is_braze_internal", payload.getIsUninstallTrackingPush() || payload.getShouldRefreshFeatureFlags());
        String bigImageUrl = payload.getBigImageUrl();
        if (bigImageUrl == null) {
            bigImageUrl = rawExtras != null ? rawExtras.getString("appboy_image_url") : null;
            if (bigImageUrl == null && (bigImageUrl = payload.getBrazeExtras().getString("appboy_image_url")) == null) {
                bigImageUrl = payload.getNotificationExtras().getString("appboy_image_url");
            }
        }
        mutableMap.putString("image_url", bigImageUrl);
        PushPayloadMapper pushPayloadMapper = INSTANCE;
        mutableMap.putMap(Constants.PLATFORM_ANDROID, bundleToMap$default(pushPayloadMapper, payload.getNotificationExtras(), null, 2, null));
        mutableMap.putMap("braze_properties", pushPayloadMapper.bundleToMap(payload.getBrazeExtras(), SetsKt.setOf("appboy_image_url")));
        return mutableMap;
    }

    public static /* synthetic */ WritableMap createPushNotificationMap$default(BrazeNotificationPayload brazeNotificationPayload, String str, String str2, Bundle bundle, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            bundle = null;
        }
        return createPushNotificationMap(brazeNotificationPayload, str, str2, bundle);
    }
}

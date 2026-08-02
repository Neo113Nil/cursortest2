package com.braze.reactbridge;

import android.os.Bundle;
import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.reactbridge.util.MapFactoryKt;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PushPayloadMapper.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J \u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0002¨\u0006\u0011"}, d2 = {"Lcom/braze/reactbridge/PushPayloadMapper;", "", "<init>", "()V", "createPushNotificationMap", "Lcom/facebook/react/bridge/WritableMap;", "payload", "Lcom/braze/models/push/BrazeNotificationPayload;", "payloadType", "", "deepLinkOverride", "rawExtras", "Landroid/os/Bundle;", "bundleToMap", "bundle", "filteringKeys", "", "braze_react-native-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PushPayloadMapper {
    public static final PushPayloadMapper INSTANCE = new PushPayloadMapper();

    private PushPayloadMapper() {
    }

    public static /* synthetic */ WritableMap createPushNotificationMap$default(BrazeNotificationPayload brazeNotificationPayload, String str, String str2, Bundle bundle, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            bundle = null;
        }
        return createPushNotificationMap(brazeNotificationPayload, str, str2, bundle);
    }

    @JvmStatic
    public static final WritableMap createPushNotificationMap(BrazeNotificationPayload payload, String payloadType, String deepLinkOverride, Bundle rawExtras) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(payloadType, "payloadType");
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        mutableMap.putString("payload_type", payloadType);
        if (deepLinkOverride == null) {
            deepLinkOverride = payload.getDeeplink();
        }
        mutableMap.putString("url", deepLinkOverride);
        mutableMap.putString("title", payload.getTitleText());
        mutableMap.putString("body", payload.getContentText());
        mutableMap.putString("summary_text", payload.getSummaryText());
        Integer notificationBadgeNumber = payload.getNotificationBadgeNumber();
        if (notificationBadgeNumber != null) {
            mutableMap.putInt("badge_count", notificationBadgeNumber.intValue());
        }
        Long valueOf = Long.valueOf(payload.getNotificationExtras().getLong(Constants.BRAZE_PUSH_RECEIVED_TIMESTAMP_MILLIS));
        if (valueOf.longValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            mutableMap.putDouble("timestamp", valueOf.longValue());
        }
        mutableMap.putBoolean(InAppMessageBase.OPEN_URI_IN_WEBVIEW, Intrinsics.areEqual(payload.getNotificationExtras().getString(Constants.BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY), "true"));
        boolean z = true;
        mutableMap.putBoolean("is_silent", payload.getTitleText() == null && payload.getContentText() == null);
        if (!payload.getIsUninstallTrackingPush() && !payload.getShouldRefreshFeatureFlags()) {
            z = false;
        }
        mutableMap.putBoolean("is_braze_internal", z);
        String bigImageUrl = payload.getBigImageUrl();
        if (bigImageUrl == null) {
            bigImageUrl = rawExtras != null ? rawExtras.getString(Constants.BRAZE_PUSH_BIG_IMAGE_URL_KEY) : null;
            if (bigImageUrl == null && (bigImageUrl = payload.getBrazeExtras().getString(Constants.BRAZE_PUSH_BIG_IMAGE_URL_KEY)) == null) {
                bigImageUrl = payload.getNotificationExtras().getString(Constants.BRAZE_PUSH_BIG_IMAGE_URL_KEY);
            }
        }
        mutableMap.putString("image_url", bigImageUrl);
        PushPayloadMapper pushPayloadMapper = INSTANCE;
        mutableMap.putMap("android", bundleToMap$default(pushPayloadMapper, payload.getNotificationExtras(), null, 2, null));
        mutableMap.putMap("braze_properties", pushPayloadMapper.bundleToMap(payload.getBrazeExtras(), SetsKt.setOf(Constants.BRAZE_PUSH_BIG_IMAGE_URL_KEY)));
        return mutableMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ WritableMap bundleToMap$default(PushPayloadMapper pushPayloadMapper, Bundle bundle, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = SetsKt.emptySet();
        }
        return pushPayloadMapper.bundleToMap(bundle, set);
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
}

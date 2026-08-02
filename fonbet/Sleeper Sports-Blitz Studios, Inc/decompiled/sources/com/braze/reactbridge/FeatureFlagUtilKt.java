package com.braze.reactbridge;

import com.braze.models.FeatureFlag;
import com.braze.reactbridge.util.MapFactoryKt;
import com.braze.support.BrazeLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: FeatureFlagUtil.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a \u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"FEATURE_FLAG_PROPERTIES_TYPE", "", "FEATURE_FLAG_PROPERTIES_VALUE", "TAG", "convertFeatureFlag", "Lcom/facebook/react/bridge/WritableMap;", "ff", "Lcom/braze/models/FeatureFlag;", "processFeatureFlagProperties", "Lcom/facebook/react/bridge/ReadableMap;", "createPropertyJson", SDKConstants.PARAM_KEY, "type", "braze_react-native-sdk_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureFlagUtilKt {
    public static final String FEATURE_FLAG_PROPERTIES_TYPE = "type";
    public static final String FEATURE_FLAG_PROPERTIES_VALUE = "value";
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("FeatureFlagUtil");

    public static final WritableMap convertFeatureFlag(FeatureFlag ff) {
        Intrinsics.checkNotNullParameter(ff, "ff");
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        mutableMap.putString("id", ff.getId());
        mutableMap.putBoolean("enabled", ff.getEnabled());
        mutableMap.putMap("properties", processFeatureFlagProperties(ff));
        return mutableMap;
    }

    private static final ReadableMap processFeatureFlagProperties(FeatureFlag featureFlag) {
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        Iterator<String> keys = featureFlag.getProperties().keys();
        while (keys.hasNext()) {
            final String next = keys.next();
            JSONObject optJSONObject = featureFlag.getProperties().optJSONObject(next);
            if (optJSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.reactbridge.FeatureFlagUtilKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String processFeatureFlagProperties$lambda$0;
                        processFeatureFlagProperties$lambda$0 = FeatureFlagUtilKt.processFeatureFlagProperties$lambda$0(next);
                        return processFeatureFlagProperties$lambda$0;
                    }
                }, 14, (Object) null);
            } else {
                String optString = optJSONObject.optString("type", "");
                String str = optString;
                if (str != null && !StringsKt.isBlank(str)) {
                    Intrinsics.checkNotNull(next);
                    mutableMap.putMap(next, createPropertyJson(featureFlag, next, optString));
                }
            }
        }
        return mutableMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processFeatureFlagProperties$lambda$0(String str) {
        return "Property for key " + str + " is null or not a JSONObject, skipping...";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static final WritableMap createPropertyJson(FeatureFlag featureFlag, String str, String str2) {
        Number numberProperty;
        String stringProperty;
        Boolean booleanProperty;
        String imageProperty;
        JSONObject jSONProperty;
        Long timestampProperty;
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        mutableMap.putString("type", str2);
        switch (str2.hashCode()) {
            case -1034364087:
                if (str2.equals("number") && (numberProperty = featureFlag.getNumberProperty(str)) != null) {
                    mutableMap.putDouble("value", numberProperty.doubleValue());
                }
                return mutableMap;
            case -891985903:
                if (str2.equals("string") && (stringProperty = featureFlag.getStringProperty(str)) != null) {
                    mutableMap.putString("value", stringProperty);
                    return mutableMap;
                }
                return mutableMap;
            case 64711720:
                if (str2.equals("boolean") && (booleanProperty = featureFlag.getBooleanProperty(str)) != null) {
                    mutableMap.putBoolean("value", booleanProperty.booleanValue());
                    return mutableMap;
                }
                return mutableMap;
            case 100313435:
                if (str2.equals("image") && (imageProperty = featureFlag.getImageProperty(str)) != null) {
                    mutableMap.putString("value", imageProperty);
                    return mutableMap;
                }
                return mutableMap;
            case 1236746791:
                if (str2.equals("jsonobject") && (jSONProperty = featureFlag.getJSONProperty(str)) != null) {
                    mutableMap.putMap("value", JsonUtilsKt.toNativeMap(jSONProperty));
                    return mutableMap;
                }
                return mutableMap;
            case 1793702779:
                if (str2.equals("datetime") && (timestampProperty = featureFlag.getTimestampProperty(str)) != null) {
                    mutableMap.putLong("value", timestampProperty.longValue());
                    return mutableMap;
                }
                return mutableMap;
            default:
                return mutableMap;
        }
    }
}

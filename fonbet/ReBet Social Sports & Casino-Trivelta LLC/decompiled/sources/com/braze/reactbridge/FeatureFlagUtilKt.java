package com.braze.reactbridge;

import com.braze.models.FeatureFlag;
import com.braze.reactbridge.FeatureFlagUtilKt;
import com.braze.reactbridge.util.MapFactoryKt;
import com.braze.support.BrazeLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/braze/models/FeatureFlag;", "ff", "Lcom/facebook/react/bridge/WritableMap;", "convertFeatureFlag", "(Lcom/braze/models/FeatureFlag;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/facebook/react/bridge/ReadableMap;", "processFeatureFlagProperties", "(Lcom/braze/models/FeatureFlag;)Lcom/facebook/react/bridge/ReadableMap;", "", "key", "type", "createPropertyJson", "(Lcom/braze/models/FeatureFlag;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;", "TAG", "Ljava/lang/String;", "braze_react-native-sdk_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class FeatureFlagUtilKt {

    @NotNull
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("FeatureFlagUtil");

    @NotNull
    public static final WritableMap convertFeatureFlag(@NotNull FeatureFlag ff2) {
        Intrinsics.checkNotNullParameter(ff2, "ff");
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        mutableMap.putString(StackTraceHelper.ID_KEY, ff2.getId());
        mutableMap.putBoolean(ViewProps.ENABLED, ff2.getEnabled());
        mutableMap.putMap("properties", processFeatureFlagProperties(ff2));
        return mutableMap;
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
                    mutableMap.putDouble(EventKeys.VALUE_KEY, numberProperty.doubleValue());
                }
                return mutableMap;
            case -891985903:
                if (str2.equals("string") && (stringProperty = featureFlag.getStringProperty(str)) != null) {
                    mutableMap.putString(EventKeys.VALUE_KEY, stringProperty);
                    return mutableMap;
                }
                return mutableMap;
            case 64711720:
                if (str2.equals("boolean") && (booleanProperty = featureFlag.getBooleanProperty(str)) != null) {
                    mutableMap.putBoolean(EventKeys.VALUE_KEY, booleanProperty.booleanValue());
                    return mutableMap;
                }
                return mutableMap;
            case 100313435:
                if (str2.equals("image") && (imageProperty = featureFlag.getImageProperty(str)) != null) {
                    mutableMap.putString(EventKeys.VALUE_KEY, imageProperty);
                    return mutableMap;
                }
                return mutableMap;
            case 1236746791:
                if (str2.equals("jsonobject") && (jSONProperty = featureFlag.getJSONProperty(str)) != null) {
                    mutableMap.putMap(EventKeys.VALUE_KEY, JsonUtilsKt.toNativeMap(jSONProperty));
                    return mutableMap;
                }
                return mutableMap;
            case 1793702779:
                if (str2.equals("datetime") && (timestampProperty = featureFlag.getTimestampProperty(str)) != null) {
                    mutableMap.putLong(EventKeys.VALUE_KEY, timestampProperty.longValue());
                    return mutableMap;
                }
                return mutableMap;
            default:
                return mutableMap;
        }
    }

    private static final ReadableMap processFeatureFlagProperties(FeatureFlag featureFlag) {
        WritableMap mutableMap = MapFactoryKt.getMutableMap();
        Iterator<String> keys = featureFlag.getProperties().keys();
        while (keys.hasNext()) {
            final String next = keys.next();
            JSONObject optJSONObject = featureFlag.getProperties().optJSONObject(next);
            if (optJSONObject == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: V3.s0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String processFeatureFlagProperties$lambda$0;
                        processFeatureFlagProperties$lambda$0 = FeatureFlagUtilKt.processFeatureFlagProperties$lambda$0(next);
                        return processFeatureFlagProperties$lambda$0;
                    }
                }, 14, (Object) null);
            } else {
                String optString = optJSONObject.optString("type", "");
                if (optString != null && !StringsKt.isBlank(optString)) {
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
}

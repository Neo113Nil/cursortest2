package com.braze.models;

import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jacoco.core.runtime.AgentOptions;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u0000 ?2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0002@AB-\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bB-\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\rBA\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\n\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0000H\u0000¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u0014J\u0010\u0010$\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0004\b&\u0010\u0014J:\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÀ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010\u0014J\u0010\u0010,\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\u0014R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b8\u00105\u001a\u0004\b7\u0010%R\u001a\u0010\b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\b\u00102\u0012\u0004\b9\u00105R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b;\u00105\u001a\u0004\b:\u0010\u0014R\u001b\u0010\f\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u001f¨\u0006B"}, d2 = {"Lcom/braze/models/FeatureFlag;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "Lcom/braze/models/IPropertiesObject;", "", "id", "", "enabled", "propertiesJson", "trackingString", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "properties", "(Ljava/lang/String;ZLorg/json/JSONObject;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component3", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", AgentOptions.OUTPUT, "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$android_sdk_base_release", "(Lcom/braze/models/FeatureFlag;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "forJsonPut", "()Lorg/json/JSONObject;", "deepcopy$android_sdk_base_release", "()Lcom/braze/models/FeatureFlag;", "deepcopy", "component1", "component2", "()Z", "component4$android_sdk_base_release", "component4", "copy$android_sdk_base_release", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/braze/models/FeatureFlag;", "copy", InAppPurchaseConstants.METHOD_TO_STRING, "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Z", "getEnabled", "getEnabled$annotations", "getPropertiesJson$annotations", "getTrackingString$android_sdk_base_release", "getTrackingString$android_sdk_base_release$annotations", "properties$delegate", "Lkotlin/Lazy;", "getProperties", "Companion", "com/braze/models/j", "com/braze/models/i", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class FeatureFlag implements IPutIntoJson<JSONObject>, IPropertiesObject {
    public static final j Companion = new j();
    public static final String ENABLED = "enabled";
    public static final String ID = "id";
    public static final String TRACKING_STRING = "fts";
    private final boolean enabled;
    private final String id;

    /* renamed from: properties$delegate, reason: from kotlin metadata */
    private final Lazy properties;
    private final String propertiesJson;
    private final String trackingString;

    public /* synthetic */ FeatureFlag(int i, String str, boolean z, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, i.f631a.getDescriptor());
        }
        this.id = str;
        this.enabled = z;
        this.propertiesJson = str2;
        if ((i & 8) == 0) {
            this.trackingString = null;
        } else {
            this.trackingString = str3;
        }
        this.properties = LazyKt.lazy(new Function0() { // from class: com.braze.models.FeatureFlag$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                JSONObject _init_$lambda$4;
                _init_$lambda$4 = FeatureFlag._init_$lambda$4(FeatureFlag.this);
                return _init_$lambda$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject _init_$lambda$4(final FeatureFlag featureFlag) {
        try {
            return StringsKt.isBlank(featureFlag.propertiesJson) ? new JSONObject() : new JSONObject(featureFlag.propertiesJson);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) featureFlag, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.FeatureFlag$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _init_$lambda$4$lambda$3;
                    _init_$lambda$4$lambda$3 = FeatureFlag._init_$lambda$4$lambda$3(FeatureFlag.this);
                    return _init_$lambda$4$lambda$3;
                }
            }, 4, (Object) null);
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$4$lambda$3(FeatureFlag featureFlag) {
        return "Failed to parse properties JSON: " + featureFlag.propertiesJson;
    }

    /* renamed from: component3, reason: from getter */
    private final String getPropertiesJson() {
        return this.propertiesJson;
    }

    public static /* synthetic */ FeatureFlag copy$android_sdk_base_release$default(FeatureFlag featureFlag, String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = featureFlag.id;
        }
        if ((i & 2) != 0) {
            z = featureFlag.enabled;
        }
        if ((i & 4) != 0) {
            str2 = featureFlag.propertiesJson;
        }
        if ((i & 8) != 0) {
            str3 = featureFlag.trackingString;
        }
        return featureFlag.copy$android_sdk_base_release(str, z, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$2() {
        return "Caught exception creating FeatureFlag Json.";
    }

    @SerialName("enabled")
    public static /* synthetic */ void getEnabled$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName("properties")
    private static /* synthetic */ void getPropertiesJson$annotations() {
    }

    @SerialName(TRACKING_STRING)
    public static /* synthetic */ void getTrackingString$android_sdk_base_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject properties_delegate$lambda$1(final FeatureFlag featureFlag) {
        try {
            return StringsKt.isBlank(featureFlag.propertiesJson) ? new JSONObject() : new JSONObject(featureFlag.propertiesJson);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) featureFlag, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.FeatureFlag$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String properties_delegate$lambda$1$lambda$0;
                    properties_delegate$lambda$1$lambda$0 = FeatureFlag.properties_delegate$lambda$1$lambda$0(FeatureFlag.this);
                    return properties_delegate$lambda$1$lambda$0;
                }
            }, 4, (Object) null);
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String properties_delegate$lambda$1$lambda$0(FeatureFlag featureFlag) {
        return "Failed to parse properties JSON: " + featureFlag.propertiesJson;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$android_sdk_base_release(FeatureFlag self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeBooleanElement(serialDesc, 1, self.enabled);
        output.encodeStringElement(serialDesc, 2, self.propertiesJson);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.trackingString == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.trackingString);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component4$android_sdk_base_release, reason: from getter */
    public final String getTrackingString() {
        return this.trackingString;
    }

    public final FeatureFlag copy$android_sdk_base_release(String id, boolean enabled, String propertiesJson, String trackingString) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(propertiesJson, "propertiesJson");
        return new FeatureFlag(id, enabled, propertiesJson, trackingString);
    }

    public final FeatureFlag deepcopy$android_sdk_base_release() {
        return new FeatureFlag(this.id, this.enabled, JsonUtils.deepcopy(getProperties()), this.trackingString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureFlag)) {
            return false;
        }
        FeatureFlag featureFlag = (FeatureFlag) other;
        return Intrinsics.areEqual(this.id, featureFlag.id) && this.enabled == featureFlag.enabled && Intrinsics.areEqual(this.propertiesJson, featureFlag.propertiesJson) && Intrinsics.areEqual(this.trackingString, featureFlag.trackingString);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getId() {
        return this.id;
    }

    @Override // com.braze.models.IPropertiesObject
    public JSONObject getProperties() {
        return (JSONObject) this.properties.getValue();
    }

    public final String getTrackingString$android_sdk_base_release() {
        return this.trackingString;
    }

    public int hashCode() {
        int hashCode = (this.propertiesJson.hashCode() + ((Boolean.hashCode(this.enabled) + (this.id.hashCode() * 31)) * 31)) * 31;
        String str = this.trackingString;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FeatureFlag(id=" + this.id + ", enabled=" + this.enabled + ", propertiesJson=" + this.propertiesJson + ", trackingString=" + this.trackingString + ")";
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getValue() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put("enabled", this.enabled);
            jSONObject.put("properties", getProperties());
            jSONObject.put(TRACKING_STRING, this.trackingString);
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.FeatureFlag$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String forJsonPut$lambda$2;
                    forJsonPut$lambda$2 = FeatureFlag.forJsonPut$lambda$2();
                    return forJsonPut$lambda$2;
                }
            }, 4, (Object) null);
            return jSONObject;
        }
    }

    public FeatureFlag(String id, boolean z, String propertiesJson, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(propertiesJson, "propertiesJson");
        this.id = id;
        this.enabled = z;
        this.propertiesJson = propertiesJson;
        this.trackingString = str;
        this.properties = LazyKt.lazy(new Function0() { // from class: com.braze.models.FeatureFlag$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                JSONObject properties_delegate$lambda$1;
                properties_delegate$lambda$1 = FeatureFlag.properties_delegate$lambda$1(FeatureFlag.this);
                return properties_delegate$lambda$1;
            }
        });
    }

    public /* synthetic */ FeatureFlag(String str, boolean z, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, str2, (i & 8) != 0 ? null : str3);
    }

    public /* synthetic */ FeatureFlag(String str, boolean z, JSONObject jSONObject, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, jSONObject, (i & 8) != 0 ? null : str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FeatureFlag(String id, boolean z, JSONObject properties, String str) {
        this(id, z, r4, str);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(properties, "properties");
        String jSONObject = properties.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
    }
}

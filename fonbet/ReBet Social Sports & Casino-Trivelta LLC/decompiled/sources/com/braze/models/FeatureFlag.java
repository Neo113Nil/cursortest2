package com.braze.models;

import Zh.n;
import bi.f;
import bo.app.y7;
import bo.app.z7;
import ci.d;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import di.F0;
import di.U0;
import di.Z0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@n
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u0000 72\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u000289B-\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bB-\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\rBA\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\n\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010 \u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\"R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b0\u0010,\u001a\u0004\b.\u0010/R\u001a\u0010\b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\b\u0010)\u0012\u0004\b1\u0010,R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u0010)\u0012\u0004\b3\u0010,\u001a\u0004\b2\u0010\"R\u001b\u0010\f\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001d¨\u0006:"}, d2 = {"Lcom/braze/models/FeatureFlag;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "Lcom/braze/models/IPropertiesObject;", "", StackTraceHelper.ID_KEY, "", ViewProps.ENABLED, "propertiesJson", "trackingString", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "properties", "(Ljava/lang/String;ZLorg/json/JSONObject;Ljava/lang/String;)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ldi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", "write$Self$android_sdk_base_release", "(Lcom/braze/models/FeatureFlag;Lci/d;Lbi/f;)V", "write$Self", "forJsonPut", "()Lorg/json/JSONObject;", "deepcopy$android_sdk_base_release", "()Lcom/braze/models/FeatureFlag;", "deepcopy", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Z", "getEnabled", "()Z", "getEnabled$annotations", "getPropertiesJson$annotations", "getTrackingString$android_sdk_base_release", "getTrackingString$android_sdk_base_release$annotations", "properties$delegate", "Lkotlin/Lazy;", "getProperties", "Companion", "bo/app/z7", "bo/app/y7", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FeatureFlag implements IPutIntoJson<JSONObject>, IPropertiesObject {
    public static final z7 Companion = new z7();
    private final boolean enabled;
    private final String id;

    /* renamed from: properties$delegate, reason: from kotlin metadata */
    private final Lazy properties;
    private final String propertiesJson;
    private final String trackingString;

    public /* synthetic */ FeatureFlag(int i10, String str, boolean z10, String str2, String str3, U0 u02) {
        if (7 != (i10 & 7)) {
            F0.a(i10, 7, y7.f26320a.getDescriptor());
        }
        this.id = str;
        this.enabled = z10;
        this.propertiesJson = str2;
        if ((i10 & 8) == 0) {
            this.trackingString = null;
        } else {
            this.trackingString = str3;
        }
        this.properties = LazyKt.lazy(new Function0() { // from class: O3.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                JSONObject _init_$lambda$0;
                _init_$lambda$0 = FeatureFlag._init_$lambda$0(FeatureFlag.this);
                return _init_$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject _init_$lambda$0(final FeatureFlag featureFlag) {
        try {
            return StringsKt.isBlank(featureFlag.propertiesJson) ? new JSONObject() : new JSONObject(featureFlag.propertiesJson);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) featureFlag, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: O3.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _init_$lambda$0$0;
                    _init_$lambda$0$0 = FeatureFlag._init_$lambda$0$0(FeatureFlag.this);
                    return _init_$lambda$0$0;
                }
            }, 4, (Object) null);
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0$0(FeatureFlag featureFlag) {
        return "Failed to parse properties JSON: " + featureFlag.propertiesJson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$0() {
        return "Caught exception creating FeatureFlag Json.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject properties_delegate$lambda$0(final FeatureFlag featureFlag) {
        try {
            return StringsKt.isBlank(featureFlag.propertiesJson) ? new JSONObject() : new JSONObject(featureFlag.propertiesJson);
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) featureFlag, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: O3.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String properties_delegate$lambda$0$0;
                    properties_delegate$lambda$0$0 = FeatureFlag.properties_delegate$lambda$0$0(FeatureFlag.this);
                    return properties_delegate$lambda$0$0;
                }
            }, 4, (Object) null);
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String properties_delegate$lambda$0$0(FeatureFlag featureFlag) {
        return "Failed to parse properties JSON: " + featureFlag.propertiesJson;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$android_sdk_base_release(FeatureFlag self, d output, f serialDesc) {
        output.G(serialDesc, 0, self.id);
        output.F(serialDesc, 1, self.enabled);
        output.G(serialDesc, 2, self.propertiesJson);
        if (!output.m(serialDesc, 3) && self.trackingString == null) {
            return;
        }
        output.C(serialDesc, 3, Z0.f45341a, self.trackingString);
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

    /* renamed from: getTrackingString$android_sdk_base_release, reason: from getter */
    public final String getTrackingString() {
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
    public JSONObject getPropertiesJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(StackTraceHelper.ID_KEY, this.id);
            jSONObject.put(ViewProps.ENABLED, this.enabled);
            jSONObject.put("properties", getProperties());
            jSONObject.put("fts", this.trackingString);
            return jSONObject;
        } catch (JSONException e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: O3.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String forJsonPut$lambda$0;
                    forJsonPut$lambda$0 = FeatureFlag.forJsonPut$lambda$0();
                    return forJsonPut$lambda$0;
                }
            }, 4, (Object) null);
            return jSONObject;
        }
    }

    public FeatureFlag(String id2, boolean z10, String propertiesJson, String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(propertiesJson, "propertiesJson");
        this.id = id2;
        this.enabled = z10;
        this.propertiesJson = propertiesJson;
        this.trackingString = str;
        this.properties = LazyKt.lazy(new Function0() { // from class: O3.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                JSONObject properties_delegate$lambda$0;
                properties_delegate$lambda$0 = FeatureFlag.properties_delegate$lambda$0(FeatureFlag.this);
                return properties_delegate$lambda$0;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FeatureFlag(String id2, boolean z10, JSONObject properties, String str) {
        this(id2, z10, r4, str);
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(properties, "properties");
        String jSONObject = properties.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
    }
}

package com.braze.models;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001f\b\u0007\u0018\u0000 '2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0001(BA\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\t\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\f\u0010\u0016R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010\u0011R$\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/braze/models/Banner;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "Lcom/braze/models/IPropertiesObject;", "", "trackingId", "placementId", Banner.HTML, "", "isControl", "", "expirationTimestampSeconds", "isTestSend", "properties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJZLorg/json/JSONObject;)V", "forJsonPut", "()Lorg/json/JSONObject;", "deepcopy$android_sdk_base_release", "()Lcom/braze/models/Banner;", "deepcopy", "isExpired", "()Z", InAppPurchaseConstants.METHOD_TO_STRING, "()Ljava/lang/String;", "Ljava/lang/String;", "getTrackingId", "getPlacementId", "getHtml", "Z", "J", "getExpirationTimestampSeconds", "()J", "Lorg/json/JSONObject;", "getProperties", "userId", "getUserId", "setUserId", "(Ljava/lang/String;)V", "Companion", "com/braze/models/a", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Banner implements IPutIntoJson<JSONObject>, IPropertiesObject {
    public static final String BANNER_KEY = "banner";
    public static final a Companion = new a();
    public static final String EXPIRATION = "expires_at";
    public static final String HTML = "html";
    public static final String IS_CONTROL = "is_control";
    public static final String IS_TEST_SEND = "is_test_send";
    public static final String PLACEMENT_ID = "placement_id";
    public static final String TRACKING_ID = "id";
    private final long expirationTimestampSeconds;
    private final String html;
    private final boolean isControl;
    private final boolean isTestSend;
    private final String placementId;
    private final JSONObject properties;
    private final String trackingId;
    private String userId;

    public Banner(String trackingId, String placementId, String html, boolean z, long j, boolean z2, JSONObject properties) {
        Intrinsics.checkNotNullParameter(trackingId, "trackingId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.trackingId = trackingId;
        this.placementId = placementId;
        this.html = html;
        this.isControl = z;
        this.expirationTimestampSeconds = j;
        this.isTestSend = z2;
        this.properties = properties;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$0() {
        return "Caught exception creating Banner Json.";
    }

    public final Banner deepcopy$android_sdk_base_release() {
        return new Banner(this.trackingId, this.placementId, this.html, this.isControl, this.expirationTimestampSeconds, this.isTestSend, getProperties());
    }

    public final long getExpirationTimestampSeconds() {
        return this.expirationTimestampSeconds;
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    @Override // com.braze.models.IPropertiesObject
    public JSONObject getProperties() {
        return this.properties;
    }

    public final String getTrackingId() {
        return this.trackingId;
    }

    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: isControl, reason: from getter */
    public final boolean getIsControl() {
        return this.isControl;
    }

    public final boolean isExpired() {
        long j = this.expirationTimestampSeconds;
        return j != -1 && j < DateTimeUtils.nowInSeconds();
    }

    /* renamed from: isTestSend, reason: from getter */
    public final boolean getIsTestSend() {
        return this.isTestSend;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        return StringsKt.trimIndent("\n            Banner{\n            trackingId='" + this.trackingId + "'\n            placementId='" + this.placementId + "'\n            html='" + this.html + "'\n            isControl=" + this.isControl + "\n            expirationTimestampSeconds=" + this.expirationTimestampSeconds + "\n            isTestSend=" + this.isTestSend + "\n            properties=" + getProperties() + "\n            }\n        ");
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getPropertiesJSONObject() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", this.trackingId);
            jSONObject2.put(PLACEMENT_ID, this.placementId);
            jSONObject2.put(HTML, this.html);
            jSONObject2.put("is_control", this.isControl);
            jSONObject2.put(EXPIRATION, this.expirationTimestampSeconds);
            jSONObject2.put("is_test_send", this.isTestSend);
            jSONObject2.put("properties", getProperties());
            jSONObject.put(BANNER_KEY, jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.models.Banner$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String forJsonPut$lambda$0;
                    forJsonPut$lambda$0 = Banner.forJsonPut$lambda$0();
                    return forJsonPut$lambda$0;
                }
            }, 4, (Object) null);
            return jSONObject;
        }
    }
}

package com.socure.docv.capturesdk.common.network.model.stepup;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlowResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/ConsentData;", "", SDKConstants.PARAM_KEY, "", "eventId", AnalyticsConstantsKt.CONSENT_SCREEN, "", "consentTimestamp", "consentExpiryTimestamp", "expiry", ApiConstant.CONSENT_ID, "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getConsent", "()Z", "getConsentExpiryTimestamp", "()Ljava/lang/String;", "getConsentId", "getConsentTimestamp", "getEventId", "getExpiry", "getKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ConsentData {
    public static final int $stable = 0;
    private final boolean consent;
    private final String consentExpiryTimestamp;
    private final String consentId;
    private final String consentTimestamp;
    private final String eventId;
    private final boolean expiry;
    private final String key;

    public static /* synthetic */ ConsentData copy$default(ConsentData consentData, String str, String str2, boolean z, String str3, String str4, boolean z2, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = consentData.key;
        }
        if ((i & 2) != 0) {
            str2 = consentData.eventId;
        }
        if ((i & 4) != 0) {
            z = consentData.consent;
        }
        if ((i & 8) != 0) {
            str3 = consentData.consentTimestamp;
        }
        if ((i & 16) != 0) {
            str4 = consentData.consentExpiryTimestamp;
        }
        if ((i & 32) != 0) {
            z2 = consentData.expiry;
        }
        if ((i & 64) != 0) {
            str5 = consentData.consentId;
        }
        boolean z3 = z2;
        String str6 = str5;
        String str7 = str4;
        boolean z4 = z;
        return consentData.copy(str, str2, z4, str3, str7, z3, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getConsent() {
        return this.consent;
    }

    /* renamed from: component4, reason: from getter */
    public final String getConsentTimestamp() {
        return this.consentTimestamp;
    }

    /* renamed from: component5, reason: from getter */
    public final String getConsentExpiryTimestamp() {
        return this.consentExpiryTimestamp;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getExpiry() {
        return this.expiry;
    }

    /* renamed from: component7, reason: from getter */
    public final String getConsentId() {
        return this.consentId;
    }

    public final ConsentData copy(String key, String eventId, boolean consent, String consentTimestamp, String consentExpiryTimestamp, boolean expiry, String consentId) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(consentTimestamp, "consentTimestamp");
        Intrinsics.checkNotNullParameter(consentExpiryTimestamp, "consentExpiryTimestamp");
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        return new ConsentData(key, eventId, consent, consentTimestamp, consentExpiryTimestamp, expiry, consentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentData)) {
            return false;
        }
        ConsentData consentData = (ConsentData) other;
        return Intrinsics.areEqual(this.key, consentData.key) && Intrinsics.areEqual(this.eventId, consentData.eventId) && this.consent == consentData.consent && Intrinsics.areEqual(this.consentTimestamp, consentData.consentTimestamp) && Intrinsics.areEqual(this.consentExpiryTimestamp, consentData.consentExpiryTimestamp) && this.expiry == consentData.expiry && Intrinsics.areEqual(this.consentId, consentData.consentId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.key.hashCode() * 31) + this.eventId.hashCode()) * 31;
        boolean z = this.consent;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((hashCode + i) * 31) + this.consentTimestamp.hashCode()) * 31) + this.consentExpiryTimestamp.hashCode()) * 31;
        boolean z2 = this.expiry;
        return ((hashCode2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.consentId.hashCode();
    }

    public String toString() {
        return "ConsentData(key=" + this.key + ", eventId=" + this.eventId + ", consent=" + this.consent + ", consentTimestamp=" + this.consentTimestamp + ", consentExpiryTimestamp=" + this.consentExpiryTimestamp + ", expiry=" + this.expiry + ", consentId=" + this.consentId + ")";
    }

    public ConsentData(String key, String eventId, boolean z, String consentTimestamp, String consentExpiryTimestamp, boolean z2, String consentId) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(consentTimestamp, "consentTimestamp");
        Intrinsics.checkNotNullParameter(consentExpiryTimestamp, "consentExpiryTimestamp");
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        this.key = key;
        this.eventId = eventId;
        this.consent = z;
        this.consentTimestamp = consentTimestamp;
        this.consentExpiryTimestamp = consentExpiryTimestamp;
        this.expiry = z2;
        this.consentId = consentId;
    }

    public final boolean getConsent() {
        return this.consent;
    }

    public final String getConsentExpiryTimestamp() {
        return this.consentExpiryTimestamp;
    }

    public final String getConsentId() {
        return this.consentId;
    }

    public final String getConsentTimestamp() {
        return this.consentTimestamp;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final boolean getExpiry() {
        return this.expiry;
    }

    public final String getKey() {
        return this.key;
    }
}

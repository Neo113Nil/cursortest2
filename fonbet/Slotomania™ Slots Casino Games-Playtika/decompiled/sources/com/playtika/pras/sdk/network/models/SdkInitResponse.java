package com.playtika.pras.sdk.network.models;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class SdkInitResponse implements Parcelable {
    public static final Parcelable.Creator<SdkInitResponse> CREATOR = new Parcelable.Creator<SdkInitResponse>() { // from class: com.playtika.pras.sdk.network.models.SdkInitResponse.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SdkInitResponse createFromParcel(Parcel parcel) {
            return new SdkInitResponse(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SdkInitResponse[] newArray(int i) {
            return new SdkInitResponse[i];
        }
    };
    private final boolean checkWidgetLoad;
    private final boolean dynamicConfigFlowEnabled;
    private final boolean enablePaymentFeaturePolicy;
    private final Boolean redirectPMUseInternalBrowser;
    private final RetryPolicy retryPolicySession;
    private final RetryPolicy retryPolicyWidget;
    private final String showCloseBtnTimeout;
    private final WidgetParams widgetParams;
    private final String widgetUrl;

    public SdkInitResponse(JSONObject jSONObject) {
        this.widgetUrl = jSONObject.getString("widgetUrl");
        this.showCloseBtnTimeout = jSONObject.getString("showCloseBtnTimeout");
        this.enablePaymentFeaturePolicy = jSONObject.getBoolean("enablePaymentFeaturePolicy");
        this.checkWidgetLoad = jSONObject.getBoolean("checkWidgetLoad");
        this.dynamicConfigFlowEnabled = jSONObject.getBoolean("dynamicConfigFlowEnabled");
        this.redirectPMUseInternalBrowser = jSONObject.has("redirectPMUseInternalBrowser") ? Boolean.valueOf(jSONObject.getBoolean("redirectPMUseInternalBrowser")) : null;
        this.retryPolicySession = new RetryPolicy(jSONObject.getJSONObject("retryPolicySession"));
        this.retryPolicyWidget = new RetryPolicy(jSONObject.getJSONObject("retryPolicyWidget"));
        this.widgetParams = new WidgetParams(jSONObject.getJSONObject("widgetParams"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RetryPolicy getRetryPolicySession() {
        return this.retryPolicySession;
    }

    public RetryPolicy getRetryPolicyWidget() {
        return this.retryPolicyWidget;
    }

    public String getShowCloseBtnTimeout() {
        return this.showCloseBtnTimeout;
    }

    public WidgetParams getWidgetParams() {
        return this.widgetParams;
    }

    public String getWidgetUrl() {
        return this.widgetUrl;
    }

    public boolean isCheckWidgetLoad() {
        return this.checkWidgetLoad;
    }

    public boolean isDynamicConfigFlowEnabled() {
        return this.dynamicConfigFlowEnabled;
    }

    public boolean isEnablePaymentFeaturePolicy() {
        return this.enablePaymentFeaturePolicy;
    }

    public Boolean isRedirectPMUseInternalBrowser() {
        return this.redirectPMUseInternalBrowser;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.widgetUrl);
        parcel.writeString(this.showCloseBtnTimeout);
        parcel.writeByte(this.enablePaymentFeaturePolicy ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.checkWidgetLoad ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.dynamicConfigFlowEnabled ? (byte) 1 : (byte) 0);
        Boolean bool = this.redirectPMUseInternalBrowser;
        parcel.writeByte((byte) (bool == null ? 2 : bool.booleanValue() ? 1 : 0));
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("maxAttempts", this.retryPolicySession.getMaxAttempts());
            jSONObject.put("initialInterval", this.retryPolicySession.getInitialInterval());
            jSONObject.put("maxInterval", this.retryPolicySession.getMaxInterval());
            jSONObject.put("initialTimeout", this.retryPolicySession.getInitialTimeout());
            jSONObject.put("maxTimeout", this.retryPolicySession.getMaxTimeout());
            jSONObject.put("backoffMultiplier", this.retryPolicySession.getBackoffMultiplier());
            bundle.putString("retryPolicySession", jSONObject.toString());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("maxAttempts", this.retryPolicyWidget.getMaxAttempts());
            jSONObject2.put("initialInterval", this.retryPolicyWidget.getInitialInterval());
            jSONObject2.put("maxInterval", this.retryPolicyWidget.getMaxInterval());
            jSONObject2.put("initialTimeout", this.retryPolicyWidget.getInitialTimeout());
            jSONObject2.put("maxTimeout", this.retryPolicyWidget.getMaxTimeout());
            jSONObject2.put("backoffMultiplier", this.retryPolicyWidget.getBackoffMultiplier());
            bundle.putString("retryPolicyWidget", jSONObject2.toString());
            JSONObject jSONObject3 = new JSONObject();
            if (this.widgetParams.getLockOrientation() != null) {
                jSONObject3.put("lockOrientation", this.widgetParams.getLockOrientation());
            }
            jSONObject3.put("fullScreen", this.widgetParams.isFullScreen());
            jSONObject3.put("generation", this.widgetParams.getGeneration());
            bundle.putString("widgetParams", jSONObject3.toString());
            parcel.writeBundle(bundle);
        } catch (JSONException e) {
            throw new RuntimeException("Failed to serialize SdkInitResponse", e);
        }
    }

    public SdkInitResponse(Parcel parcel) {
        Boolean valueOf;
        this.widgetUrl = parcel.readString();
        this.showCloseBtnTimeout = parcel.readString();
        this.enablePaymentFeaturePolicy = parcel.readByte() != 0;
        this.checkWidgetLoad = parcel.readByte() != 0;
        this.dynamicConfigFlowEnabled = parcel.readByte() != 0;
        byte readByte = parcel.readByte();
        if (readByte == 2) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(readByte != 0);
        }
        this.redirectPMUseInternalBrowser = valueOf;
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        if (readBundle != null) {
            try {
                String string = readBundle.getString("retryPolicySession");
                String string2 = readBundle.getString("retryPolicyWidget");
                String string3 = readBundle.getString("widgetParams");
                if (string != null && string2 != null && string3 != null) {
                    this.retryPolicySession = new RetryPolicy(new JSONObject(string));
                    this.retryPolicyWidget = new RetryPolicy(new JSONObject(string2));
                    this.widgetParams = new WidgetParams(new JSONObject(string3));
                    return;
                }
                throw new RuntimeException("Failed to deserialize SdkInitResponse: missing required fields");
            } catch (JSONException e) {
                throw new RuntimeException("Failed to deserialize SdkInitResponse", e);
            }
        }
        throw new RuntimeException("Failed to deserialize SdkInitResponse: bundle is null");
    }
}

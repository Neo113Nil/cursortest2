package com.playtika.pras.sdk.network.models;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.playtika.pras.sdk.network.ResponseDto;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class WebStage extends ResponseDto implements Parcelable, IValidatable {
    public static final Parcelable.Creator<WebStage> CREATOR = new Parcelable.Creator<WebStage>() { // from class: com.playtika.pras.sdk.network.models.WebStage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebStage createFromParcel(Parcel parcel) {
            return new WebStage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebStage[] newArray(int i) {
            return new WebStage[i];
        }
    };
    private JSONObject additionalParams;
    private final Boolean defaultGen6Widget;
    private final String gen4_cdnPath;
    private final String gen5_cdnPath;
    private final String gen6_cdnPath;

    public WebStage(JSONObject jSONObject) {
        this.gen4_cdnPath = getJsonString(jSONObject, "gen4_cdnPath");
        this.gen5_cdnPath = getJsonString(jSONObject, "gen5_cdnPath");
        this.gen6_cdnPath = getJsonString(jSONObject, "gen6_cdnPath");
        this.defaultGen6Widget = Boolean.valueOf(jSONObject.optBoolean("defaultGen6Widget"));
        this.additionalParams = getJsonObject(jSONObject, "additionalParams");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public JSONObject getAdditionalParams() {
        return this.additionalParams;
    }

    public Boolean getDefaultGen6Widget() {
        return this.defaultGen6Widget;
    }

    public String getGen4_cdnPath() {
        return this.gen4_cdnPath;
    }

    public String getGen5_cdnPath() {
        return this.gen5_cdnPath;
    }

    public String getGen6_cdnPath() {
        return this.gen6_cdnPath;
    }

    @Override // com.playtika.pras.sdk.network.models.IValidatable
    public void validate() {
        if (TextUtils.isEmpty(this.gen4_cdnPath)) {
            throw new ValidationException("StageConfig. gen4_cdnPath is empty");
        }
        if (TextUtils.isEmpty(this.gen5_cdnPath)) {
            throw new ValidationException("StageConfig. gen5_cdnPath is empty");
        }
        if (TextUtils.isEmpty(this.gen6_cdnPath)) {
            throw new ValidationException("StageConfig. gen6_cdnPath is empty");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.gen4_cdnPath);
        parcel.writeString(this.gen5_cdnPath);
        parcel.writeString(this.gen6_cdnPath);
        if (Build.VERSION.SDK_INT >= 29) {
            parcel.writeBoolean(this.defaultGen6Widget.booleanValue());
        } else {
            parcel.writeInt(this.defaultGen6Widget.booleanValue() ? 1 : 0);
        }
        JSONObject jSONObject = this.additionalParams;
        if (jSONObject != null) {
            parcel.writeString(jSONObject.toString());
        }
    }

    public WebStage(Parcel parcel) {
        this.gen4_cdnPath = parcel.readString();
        this.gen5_cdnPath = parcel.readString();
        this.gen6_cdnPath = parcel.readString();
        if (Build.VERSION.SDK_INT >= 29) {
            this.defaultGen6Widget = Boolean.valueOf(parcel.readBoolean());
        } else {
            this.defaultGen6Widget = Boolean.valueOf(parcel.readInt() == 1);
        }
        try {
            this.additionalParams = new JSONObject(parcel.readString());
        } catch (JSONException unused) {
        }
    }
}

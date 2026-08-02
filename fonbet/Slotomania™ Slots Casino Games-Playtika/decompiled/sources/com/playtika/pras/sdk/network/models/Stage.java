package com.playtika.pras.sdk.network.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.playtika.pras.sdk.network.ResponseDto;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Stage extends ResponseDto implements IValidatable, Parcelable {
    public static final Parcelable.Creator<Stage> CREATOR = new Parcelable.Creator<Stage>() { // from class: com.playtika.pras.sdk.network.models.Stage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Stage createFromParcel(Parcel parcel) {
            return new Stage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Stage[] newArray(int i) {
            return new Stage[i];
        }
    };
    private String name;
    private JSONObject sdkVersions;

    public Stage(JSONObject jSONObject) {
        this.name = getJsonString(jSONObject, "name");
        this.sdkVersions = getJsonObject(jSONObject, "sdkVersions");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public WebStage getWebStageByName(String str) {
        try {
            return new WebStage(this.sdkVersions.getJSONObject(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.playtika.pras.sdk.network.models.IValidatable
    public void validate() {
        if (TextUtils.isEmpty(this.name)) {
            throw new ValidationException("StageConfig. name is empty");
        }
        if (this.sdkVersions == null) {
            throw new ValidationException("StageConfig. sdkVersions is empty");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.sdkVersions.toString());
    }

    public Stage(Parcel parcel) {
        this.name = parcel.readString();
        try {
            this.sdkVersions = new JSONObject(parcel.readString());
        } catch (JSONException unused) {
        }
    }
}

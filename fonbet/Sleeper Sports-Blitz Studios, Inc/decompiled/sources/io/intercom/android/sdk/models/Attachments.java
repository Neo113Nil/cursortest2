package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.utilities.NullSafety;

/* loaded from: classes9.dex */
public abstract class Attachments implements Parcelable {
    public static final Parcelable.Creator<Attachments> CREATOR = new Parcelable.Creator<Attachments>() { // from class: io.intercom.android.sdk.models.Attachments.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Attachments createFromParcel(Parcel parcel) {
            return Attachments.create(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Attachments[] newArray(int i) {
            return new Attachments[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String getContentType();

    public abstract String getHumanFileSize();

    public abstract String getName();

    public abstract String getUrl();

    static Attachments create(String str, String str2, String str3, String str4) {
        return new AutoValue_Attachments(str, str2, str3, str4);
    }

    public static final class Builder {
        String content_type;
        String human_file_size;
        String name;
        String url;

        public Builder withName(String str) {
            this.name = str;
            return this;
        }

        public Attachments build() {
            return Attachments.create(NullSafety.valueOrEmpty(this.name), NullSafety.valueOrEmpty(this.url), NullSafety.valueOrEmpty(this.content_type), NullSafety.valueOrEmpty(this.human_file_size));
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getName());
        parcel.writeString(getUrl());
        parcel.writeString(getContentType());
        parcel.writeString(getHumanFileSize());
    }
}

package com.vk.photos.ui.editalbum.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.data.PrivacySetting;
import xsna.epx;
import xsna.ho8;

/* compiled from: EditAlbumState.kt */
/* loaded from: classes3.dex */
public final class PrivacySettingData implements Parcelable {
    public static final Parcelable.Creator<PrivacySettingData> CREATOR = new a();
    public final PrivacySetting b;
    public final String c;

    /* compiled from: EditAlbumState.kt */
    public static final class a implements Parcelable.Creator<PrivacySettingData> {
        @Override // android.os.Parcelable.Creator
        public final PrivacySettingData createFromParcel(Parcel parcel) {
            return new PrivacySettingData((PrivacySetting) parcel.readParcelable(PrivacySettingData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PrivacySettingData[] newArray(int i) {
            return new PrivacySettingData[i];
        }
    }

    public PrivacySettingData(PrivacySetting privacySetting, String str) {
        this.b = privacySetting;
        this.c = str;
    }

    public static PrivacySettingData a(PrivacySettingData privacySettingData, String str) {
        PrivacySetting privacySetting = privacySettingData.b;
        privacySettingData.getClass();
        return new PrivacySettingData(privacySetting, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySettingData)) {
            return false;
        }
        PrivacySettingData privacySettingData = (PrivacySettingData) obj;
        return epx.f(this.b, privacySettingData.b) && epx.f(this.c, privacySettingData.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrivacySettingData(setting=");
        sb.append(this.b);
        sb.append(", displayString=");
        return ho8.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
    }
}

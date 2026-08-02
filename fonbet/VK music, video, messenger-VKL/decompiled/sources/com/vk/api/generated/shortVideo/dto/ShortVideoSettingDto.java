package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoSettingDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoSettingDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoSettingDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("value")
    private final String value;

    /* compiled from: ShortVideoSettingDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoSettingDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoSettingDto createFromParcel(Parcel parcel) {
            return new ShortVideoSettingDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoSettingDto[] newArray(int i) {
            return new ShortVideoSettingDto[i];
        }
    }

    public ShortVideoSettingDto(String str, String str2) {
        this.id = str;
        this.value = str2;
    }

    public final String d() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoSettingDto)) {
            return false;
        }
        ShortVideoSettingDto shortVideoSettingDto = (ShortVideoSettingDto) obj;
        return epx.f(this.id, shortVideoSettingDto.id) && epx.f(this.value, shortVideoSettingDto.value);
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.value;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoSettingDto(id=");
        sb.append(this.id);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.value);
    }

    public /* synthetic */ ShortVideoSettingDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}

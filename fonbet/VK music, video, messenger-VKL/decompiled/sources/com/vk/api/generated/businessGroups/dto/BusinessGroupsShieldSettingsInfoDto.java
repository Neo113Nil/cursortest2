package com.vk.api.generated.businessGroups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BusinessGroupsShieldSettingsInfoDto.kt */
/* loaded from: classes14.dex */
public final class BusinessGroupsShieldSettingsInfoDto implements Parcelable {
    public static final Parcelable.Creator<BusinessGroupsShieldSettingsInfoDto> CREATOR = new a();

    @pmi0("link")
    private final String link;

    @pmi0("text")
    private final String text;

    /* compiled from: BusinessGroupsShieldSettingsInfoDto.kt */
    public static final class a implements Parcelable.Creator<BusinessGroupsShieldSettingsInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsShieldSettingsInfoDto createFromParcel(Parcel parcel) {
            return new BusinessGroupsShieldSettingsInfoDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsShieldSettingsInfoDto[] newArray(int i) {
            return new BusinessGroupsShieldSettingsInfoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BusinessGroupsShieldSettingsInfoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.link;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessGroupsShieldSettingsInfoDto)) {
            return false;
        }
        BusinessGroupsShieldSettingsInfoDto businessGroupsShieldSettingsInfoDto = (BusinessGroupsShieldSettingsInfoDto) obj;
        return epx.f(this.text, businessGroupsShieldSettingsInfoDto.text) && epx.f(this.link, businessGroupsShieldSettingsInfoDto.link);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.link;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BusinessGroupsShieldSettingsInfoDto(text=");
        sb.append(this.text);
        sb.append(", link=");
        return ho8.a(sb, this.link, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.link);
    }

    public BusinessGroupsShieldSettingsInfoDto(String str, String str2) {
        this.text = str;
        this.link = str2;
    }

    public /* synthetic */ BusinessGroupsShieldSettingsInfoDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}

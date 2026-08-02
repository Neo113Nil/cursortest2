package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UsersGiftsTooltipDto.kt */
/* loaded from: classes15.dex */
public final class UsersGiftsTooltipDto implements Parcelable {
    public static final Parcelable.Creator<UsersGiftsTooltipDto> CREATOR = new a();

    @pmi0("section")
    private final String section;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    /* compiled from: UsersGiftsTooltipDto.kt */
    public static final class a implements Parcelable.Creator<UsersGiftsTooltipDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersGiftsTooltipDto createFromParcel(Parcel parcel) {
            return new UsersGiftsTooltipDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersGiftsTooltipDto[] newArray(int i) {
            return new UsersGiftsTooltipDto[i];
        }
    }

    public UsersGiftsTooltipDto() {
        this(null, null, null, null, 15, null);
    }

    public final String d() {
        return this.section;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.subtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersGiftsTooltipDto)) {
            return false;
        }
        UsersGiftsTooltipDto usersGiftsTooltipDto = (UsersGiftsTooltipDto) obj;
        return epx.f(this.type, usersGiftsTooltipDto.type) && epx.f(this.title, usersGiftsTooltipDto.title) && epx.f(this.subtitle, usersGiftsTooltipDto.subtitle) && epx.f(this.section, usersGiftsTooltipDto.section);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.section;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersGiftsTooltipDto(type=");
        sb.append(this.type);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", section=");
        return ho8.a(sb, this.section, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.section);
    }

    public UsersGiftsTooltipDto(String str, String str2, String str3, String str4) {
        this.type = str;
        this.title = str2;
        this.subtitle = str3;
        this.section = str4;
    }

    public /* synthetic */ UsersGiftsTooltipDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}

package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsRecBlockButtonDto.kt */
/* loaded from: classes14.dex */
public final class FriendsRecBlockButtonDto implements Parcelable {
    public static final Parcelable.Creator<FriendsRecBlockButtonDto> CREATOR = new a();

    @pmi0("action")
    private final FriendsRecBlockButtonActionDto action;

    @pmi0("icon")
    private final String icon;

    @pmi0("type")
    private final String type;

    /* compiled from: FriendsRecBlockButtonDto.kt */
    public static final class a implements Parcelable.Creator<FriendsRecBlockButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsRecBlockButtonDto createFromParcel(Parcel parcel) {
            return new FriendsRecBlockButtonDto(parcel.readInt() == 0 ? null : FriendsRecBlockButtonActionDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsRecBlockButtonDto[] newArray(int i) {
            return new FriendsRecBlockButtonDto[i];
        }
    }

    public FriendsRecBlockButtonDto() {
        this(null, null, null, 7, null);
    }

    public final FriendsRecBlockButtonActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsRecBlockButtonDto)) {
            return false;
        }
        FriendsRecBlockButtonDto friendsRecBlockButtonDto = (FriendsRecBlockButtonDto) obj;
        return epx.f(this.action, friendsRecBlockButtonDto.action) && epx.f(this.icon, friendsRecBlockButtonDto.icon) && epx.f(this.type, friendsRecBlockButtonDto.type);
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        FriendsRecBlockButtonActionDto friendsRecBlockButtonActionDto = this.action;
        int hashCode = (friendsRecBlockButtonActionDto == null ? 0 : friendsRecBlockButtonActionDto.hashCode()) * 31;
        String str = this.icon;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsRecBlockButtonDto(action=");
        sb.append(this.action);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", type=");
        return ho8.a(sb, this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        FriendsRecBlockButtonActionDto friendsRecBlockButtonActionDto = this.action;
        if (friendsRecBlockButtonActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            friendsRecBlockButtonActionDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.icon);
        parcel.writeString(this.type);
    }

    public FriendsRecBlockButtonDto(FriendsRecBlockButtonActionDto friendsRecBlockButtonActionDto, String str, String str2) {
        this.action = friendsRecBlockButtonActionDto;
        this.icon = str;
        this.type = str2;
    }

    public /* synthetic */ FriendsRecBlockButtonDto(FriendsRecBlockButtonActionDto friendsRecBlockButtonActionDto, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : friendsRecBlockButtonActionDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}

package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsRecBlockFooterDto.kt */
/* loaded from: classes14.dex */
public final class FriendsRecBlockFooterDto implements Parcelable {
    public static final Parcelable.Creator<FriendsRecBlockFooterDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("icon")
    private final FriendsRecBlockFooterIconDto icon;

    @pmi0("text")
    private final String text;

    /* compiled from: FriendsRecBlockFooterDto.kt */
    public static final class a implements Parcelable.Creator<FriendsRecBlockFooterDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsRecBlockFooterDto createFromParcel(Parcel parcel) {
            return new FriendsRecBlockFooterDto((BaseLinkButtonActionDto) parcel.readParcelable(FriendsRecBlockFooterDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : FriendsRecBlockFooterIconDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsRecBlockFooterDto[] newArray(int i) {
            return new FriendsRecBlockFooterDto[i];
        }
    }

    public FriendsRecBlockFooterDto(BaseLinkButtonActionDto baseLinkButtonActionDto, String str, FriendsRecBlockFooterIconDto friendsRecBlockFooterIconDto) {
        this.action = baseLinkButtonActionDto;
        this.text = str;
        this.icon = friendsRecBlockFooterIconDto;
    }

    public final BaseLinkButtonActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final FriendsRecBlockFooterIconDto e() {
        return this.icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsRecBlockFooterDto)) {
            return false;
        }
        FriendsRecBlockFooterDto friendsRecBlockFooterDto = (FriendsRecBlockFooterDto) obj;
        return epx.f(this.action, friendsRecBlockFooterDto.action) && epx.f(this.text, friendsRecBlockFooterDto.text) && this.icon == friendsRecBlockFooterDto.icon;
    }

    public final String f() {
        return this.text;
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        FriendsRecBlockFooterIconDto friendsRecBlockFooterIconDto = this.icon;
        return hashCode2 + (friendsRecBlockFooterIconDto != null ? friendsRecBlockFooterIconDto.hashCode() : 0);
    }

    public final String toString() {
        return "FriendsRecBlockFooterDto(action=" + this.action + ", text=" + this.text + ", icon=" + this.icon + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.action, i);
        parcel.writeString(this.text);
        FriendsRecBlockFooterIconDto friendsRecBlockFooterIconDto = this.icon;
        if (friendsRecBlockFooterIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            friendsRecBlockFooterIconDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ FriendsRecBlockFooterDto(BaseLinkButtonActionDto baseLinkButtonActionDto, String str, FriendsRecBlockFooterIconDto friendsRecBlockFooterIconDto, int i, zcl zclVar) {
        this(baseLinkButtonActionDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : friendsRecBlockFooterIconDto);
    }
}

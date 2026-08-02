package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: FriendsEntrypointDto.kt */
/* loaded from: classes14.dex */
public final class FriendsEntrypointDto implements Parcelable {
    public static final Parcelable.Creator<FriendsEntrypointDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("icon")
    private final FriendsEntrypointIconDto icon;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: FriendsEntrypointDto.kt */
    public static final class a implements Parcelable.Creator<FriendsEntrypointDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsEntrypointDto createFromParcel(Parcel parcel) {
            return new FriendsEntrypointDto(FriendsEntrypointIconDto.CREATOR.createFromParcel(parcel), parcel.readString(), (BaseLinkButtonActionDto) parcel.readParcelable(FriendsEntrypointDto.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsEntrypointDto[] newArray(int i) {
            return new FriendsEntrypointDto[i];
        }
    }

    public FriendsEntrypointDto(FriendsEntrypointIconDto friendsEntrypointIconDto, String str, BaseLinkButtonActionDto baseLinkButtonActionDto, String str2, String str3) {
        this.icon = friendsEntrypointIconDto;
        this.title = str;
        this.action = baseLinkButtonActionDto;
        this.subtitle = str2;
        this.trackCode = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsEntrypointDto)) {
            return false;
        }
        FriendsEntrypointDto friendsEntrypointDto = (FriendsEntrypointDto) obj;
        return epx.f(this.icon, friendsEntrypointDto.icon) && epx.f(this.title, friendsEntrypointDto.title) && epx.f(this.action, friendsEntrypointDto.action) && epx.f(this.subtitle, friendsEntrypointDto.subtitle) && epx.f(this.trackCode, friendsEntrypointDto.trackCode);
    }

    public final int hashCode() {
        int hashCode = (this.action.hashCode() + urd0.a(this.icon.hashCode() * 31, 31, this.title)) * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackCode;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsEntrypointDto(icon=");
        sb.append(this.icon);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.icon.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.action, i);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ FriendsEntrypointDto(FriendsEntrypointIconDto friendsEntrypointIconDto, String str, BaseLinkButtonActionDto baseLinkButtonActionDto, String str2, String str3, int i, zcl zclVar) {
        this(friendsEntrypointIconDto, str, baseLinkButtonActionDto, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}

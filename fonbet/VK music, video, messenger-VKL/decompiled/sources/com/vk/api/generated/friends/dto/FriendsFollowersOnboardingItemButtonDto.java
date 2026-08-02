package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsFollowersOnboardingItemButtonDto.kt */
/* loaded from: classes14.dex */
public final class FriendsFollowersOnboardingItemButtonDto implements Parcelable {
    public static final Parcelable.Creator<FriendsFollowersOnboardingItemButtonDto> CREATOR = new a();

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("text")
    private final String text;

    /* compiled from: FriendsFollowersOnboardingItemButtonDto.kt */
    public static final class a implements Parcelable.Creator<FriendsFollowersOnboardingItemButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsFollowersOnboardingItemButtonDto createFromParcel(Parcel parcel) {
            return new FriendsFollowersOnboardingItemButtonDto(parcel.readString(), (BaseLinkButtonActionDto) parcel.readParcelable(FriendsFollowersOnboardingItemButtonDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsFollowersOnboardingItemButtonDto[] newArray(int i) {
            return new FriendsFollowersOnboardingItemButtonDto[i];
        }
    }

    public FriendsFollowersOnboardingItemButtonDto(String str, BaseLinkButtonActionDto baseLinkButtonActionDto) {
        this.text = str;
        this.action = baseLinkButtonActionDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsFollowersOnboardingItemButtonDto)) {
            return false;
        }
        FriendsFollowersOnboardingItemButtonDto friendsFollowersOnboardingItemButtonDto = (FriendsFollowersOnboardingItemButtonDto) obj;
        return epx.f(this.text, friendsFollowersOnboardingItemButtonDto.text) && epx.f(this.action, friendsFollowersOnboardingItemButtonDto.action);
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        return hashCode + (baseLinkButtonActionDto == null ? 0 : baseLinkButtonActionDto.hashCode());
    }

    public final String toString() {
        return "FriendsFollowersOnboardingItemButtonDto(text=" + this.text + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.action, i);
    }

    public /* synthetic */ FriendsFollowersOnboardingItemButtonDto(String str, BaseLinkButtonActionDto baseLinkButtonActionDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : baseLinkButtonActionDto);
    }
}

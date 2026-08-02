package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.generated.account.dto.AccountInfoDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UsersGetUserInfoResponseDto.kt */
/* loaded from: classes15.dex */
public final class UsersGetUserInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<UsersGetUserInfoResponseDto> CREATOR = new a();

    @pmi0("exchange_token")
    private final String exchangeToken;

    @pmi0("help_hints")
    private final UsersHelpHintsDto helpHints;

    @pmi0("info")
    private final AccountInfoDto info;

    @pmi0(NotificationCompat.CATEGORY_NAVIGATION)
    private final UsersNavigationDto navigation;

    @pmi0("navigation_tabbar")
    private final UsersNavigationTabbarDto navigationTabbar;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final UsersUserFullDto profile;

    @pmi0("special_events")
    private final UsersSpecialEventsDto specialEvents;

    /* compiled from: UsersGetUserInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<UsersGetUserInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersGetUserInfoResponseDto createFromParcel(Parcel parcel) {
            return new UsersGetUserInfoResponseDto(parcel.readString(), (UsersUserFullDto) parcel.readParcelable(UsersGetUserInfoResponseDto.class.getClassLoader()), (AccountInfoDto) parcel.readParcelable(UsersGetUserInfoResponseDto.class.getClassLoader()), parcel.readInt() == 0 ? null : UsersNavigationTabbarDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UsersHelpHintsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UsersSpecialEventsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UsersNavigationDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersGetUserInfoResponseDto[] newArray(int i) {
            return new UsersGetUserInfoResponseDto[i];
        }
    }

    public UsersGetUserInfoResponseDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersGetUserInfoResponseDto)) {
            return false;
        }
        UsersGetUserInfoResponseDto usersGetUserInfoResponseDto = (UsersGetUserInfoResponseDto) obj;
        return epx.f(this.exchangeToken, usersGetUserInfoResponseDto.exchangeToken) && epx.f(this.profile, usersGetUserInfoResponseDto.profile) && epx.f(this.info, usersGetUserInfoResponseDto.info) && epx.f(this.navigationTabbar, usersGetUserInfoResponseDto.navigationTabbar) && epx.f(this.helpHints, usersGetUserInfoResponseDto.helpHints) && epx.f(this.specialEvents, usersGetUserInfoResponseDto.specialEvents) && epx.f(this.navigation, usersGetUserInfoResponseDto.navigation);
    }

    public final int hashCode() {
        String str = this.exchangeToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UsersUserFullDto usersUserFullDto = this.profile;
        int hashCode2 = (hashCode + (usersUserFullDto == null ? 0 : usersUserFullDto.hashCode())) * 31;
        AccountInfoDto accountInfoDto = this.info;
        int hashCode3 = (hashCode2 + (accountInfoDto == null ? 0 : accountInfoDto.hashCode())) * 31;
        UsersNavigationTabbarDto usersNavigationTabbarDto = this.navigationTabbar;
        int hashCode4 = (hashCode3 + (usersNavigationTabbarDto == null ? 0 : usersNavigationTabbarDto.hashCode())) * 31;
        UsersHelpHintsDto usersHelpHintsDto = this.helpHints;
        int hashCode5 = (hashCode4 + (usersHelpHintsDto == null ? 0 : usersHelpHintsDto.hashCode())) * 31;
        UsersSpecialEventsDto usersSpecialEventsDto = this.specialEvents;
        int hashCode6 = (hashCode5 + (usersSpecialEventsDto == null ? 0 : usersSpecialEventsDto.hashCode())) * 31;
        UsersNavigationDto usersNavigationDto = this.navigation;
        return hashCode6 + (usersNavigationDto != null ? usersNavigationDto.hashCode() : 0);
    }

    public final String toString() {
        return "UsersGetUserInfoResponseDto(exchangeToken=" + this.exchangeToken + ", profile=" + this.profile + ", info=" + this.info + ", navigationTabbar=" + this.navigationTabbar + ", helpHints=" + this.helpHints + ", specialEvents=" + this.specialEvents + ", navigation=" + this.navigation + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.exchangeToken);
        parcel.writeParcelable(this.profile, i);
        parcel.writeParcelable(this.info, i);
        UsersNavigationTabbarDto usersNavigationTabbarDto = this.navigationTabbar;
        if (usersNavigationTabbarDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersNavigationTabbarDto.writeToParcel(parcel, i);
        }
        UsersHelpHintsDto usersHelpHintsDto = this.helpHints;
        if (usersHelpHintsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersHelpHintsDto.writeToParcel(parcel, i);
        }
        UsersSpecialEventsDto usersSpecialEventsDto = this.specialEvents;
        if (usersSpecialEventsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersSpecialEventsDto.writeToParcel(parcel, i);
        }
        UsersNavigationDto usersNavigationDto = this.navigation;
        if (usersNavigationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersNavigationDto.writeToParcel(parcel, i);
        }
    }

    public UsersGetUserInfoResponseDto(String str, UsersUserFullDto usersUserFullDto, AccountInfoDto accountInfoDto, UsersNavigationTabbarDto usersNavigationTabbarDto, UsersHelpHintsDto usersHelpHintsDto, UsersSpecialEventsDto usersSpecialEventsDto, UsersNavigationDto usersNavigationDto) {
        this.exchangeToken = str;
        this.profile = usersUserFullDto;
        this.info = accountInfoDto;
        this.navigationTabbar = usersNavigationTabbarDto;
        this.helpHints = usersHelpHintsDto;
        this.specialEvents = usersSpecialEventsDto;
        this.navigation = usersNavigationDto;
    }

    public /* synthetic */ UsersGetUserInfoResponseDto(String str, UsersUserFullDto usersUserFullDto, AccountInfoDto accountInfoDto, UsersNavigationTabbarDto usersNavigationTabbarDto, UsersHelpHintsDto usersHelpHintsDto, UsersSpecialEventsDto usersSpecialEventsDto, UsersNavigationDto usersNavigationDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : usersUserFullDto, (i & 4) != 0 ? null : accountInfoDto, (i & 8) != 0 ? null : usersNavigationTabbarDto, (i & 16) != 0 ? null : usersHelpHintsDto, (i & 32) != 0 ? null : usersSpecialEventsDto, (i & 64) != 0 ? null : usersNavigationDto);
    }
}

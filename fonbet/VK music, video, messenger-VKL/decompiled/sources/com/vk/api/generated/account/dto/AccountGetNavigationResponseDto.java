package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;

/* compiled from: AccountGetNavigationResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetNavigationResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountGetNavigationResponseDto> CREATOR = new a();

    @pmi0("side_menu")
    private final AccountSideMenuDto sideMenu;

    @pmi0("superapp_features")
    private final List<String> superappFeatures;

    @pmi0("tabbar")
    private final AccountTabbarDto tabbar;

    /* compiled from: AccountGetNavigationResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetNavigationResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetNavigationResponseDto createFromParcel(Parcel parcel) {
            return new AccountGetNavigationResponseDto(AccountSideMenuDto.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), AccountTabbarDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetNavigationResponseDto[] newArray(int i) {
            return new AccountGetNavigationResponseDto[i];
        }
    }

    public AccountGetNavigationResponseDto(AccountSideMenuDto accountSideMenuDto, List<String> list, AccountTabbarDto accountTabbarDto) {
        this.sideMenu = accountSideMenuDto;
        this.superappFeatures = list;
        this.tabbar = accountTabbarDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountGetNavigationResponseDto)) {
            return false;
        }
        AccountGetNavigationResponseDto accountGetNavigationResponseDto = (AccountGetNavigationResponseDto) obj;
        return epx.f(this.sideMenu, accountGetNavigationResponseDto.sideMenu) && epx.f(this.superappFeatures, accountGetNavigationResponseDto.superappFeatures) && epx.f(this.tabbar, accountGetNavigationResponseDto.tabbar);
    }

    public final int hashCode() {
        return this.tabbar.hashCode() + fw3.a(this.sideMenu.hashCode() * 31, 31, this.superappFeatures);
    }

    public final String toString() {
        return "AccountGetNavigationResponseDto(sideMenu=" + this.sideMenu + ", superappFeatures=" + this.superappFeatures + ", tabbar=" + this.tabbar + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.sideMenu.writeToParcel(parcel, i);
        parcel.writeStringList(this.superappFeatures);
        this.tabbar.writeToParcel(parcel, i);
    }
}

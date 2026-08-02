package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;

/* compiled from: AccountNavigationStateDto.kt */
/* loaded from: classes14.dex */
public final class AccountNavigationStateDto implements Parcelable {
    public static final Parcelable.Creator<AccountNavigationStateDto> CREATOR = new a();

    @pmi0("side_menu")
    private final AccountSideMenuDto sideMenu;

    @pmi0("superapp_features")
    private final List<String> superappFeatures;

    @pmi0("tabbar")
    private final AccountTabbarDto tabbar;

    /* compiled from: AccountNavigationStateDto.kt */
    public static final class a implements Parcelable.Creator<AccountNavigationStateDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountNavigationStateDto createFromParcel(Parcel parcel) {
            return new AccountNavigationStateDto(AccountSideMenuDto.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), AccountTabbarDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountNavigationStateDto[] newArray(int i) {
            return new AccountNavigationStateDto[i];
        }
    }

    public AccountNavigationStateDto(AccountSideMenuDto accountSideMenuDto, List<String> list, AccountTabbarDto accountTabbarDto) {
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
        if (!(obj instanceof AccountNavigationStateDto)) {
            return false;
        }
        AccountNavigationStateDto accountNavigationStateDto = (AccountNavigationStateDto) obj;
        return epx.f(this.sideMenu, accountNavigationStateDto.sideMenu) && epx.f(this.superappFeatures, accountNavigationStateDto.superappFeatures) && epx.f(this.tabbar, accountNavigationStateDto.tabbar);
    }

    public final int hashCode() {
        return this.tabbar.hashCode() + fw3.a(this.sideMenu.hashCode() * 31, 31, this.superappFeatures);
    }

    public final String toString() {
        return "AccountNavigationStateDto(sideMenu=" + this.sideMenu + ", superappFeatures=" + this.superappFeatures + ", tabbar=" + this.tabbar + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.sideMenu.writeToParcel(parcel, i);
        parcel.writeStringList(this.superappFeatures);
        this.tabbar.writeToParcel(parcel, i);
    }
}

package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: AccountShoppingParamsDto.kt */
/* loaded from: classes14.dex */
public final class AccountShoppingParamsDto implements Parcelable {
    public static final Parcelable.Creator<AccountShoppingParamsDto> CREATOR = new a();

    @pmi0("has_albums_v2_intro")
    private final Boolean hasAlbumsV2Intro;

    @pmi0("show_intro")
    private final boolean showIntro;

    @pmi0("show_market_onboarding")
    private final Boolean showMarketOnboarding;

    @pmi0("show_wishlist_onboarding")
    private final Boolean showWishlistOnboarding;

    /* compiled from: AccountShoppingParamsDto.kt */
    public static final class a implements Parcelable.Creator<AccountShoppingParamsDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountShoppingParamsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            boolean z = parcel.readInt() != 0;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AccountShoppingParamsDto(z, valueOf, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountShoppingParamsDto[] newArray(int i) {
            return new AccountShoppingParamsDto[i];
        }
    }

    public AccountShoppingParamsDto(boolean z, Boolean bool, Boolean bool2, Boolean bool3) {
        this.showIntro = z;
        this.showMarketOnboarding = bool;
        this.showWishlistOnboarding = bool2;
        this.hasAlbumsV2Intro = bool3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountShoppingParamsDto)) {
            return false;
        }
        AccountShoppingParamsDto accountShoppingParamsDto = (AccountShoppingParamsDto) obj;
        return this.showIntro == accountShoppingParamsDto.showIntro && epx.f(this.showMarketOnboarding, accountShoppingParamsDto.showMarketOnboarding) && epx.f(this.showWishlistOnboarding, accountShoppingParamsDto.showWishlistOnboarding) && epx.f(this.hasAlbumsV2Intro, accountShoppingParamsDto.hasAlbumsV2Intro);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.showIntro) * 31;
        Boolean bool = this.showMarketOnboarding;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showWishlistOnboarding;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasAlbumsV2Intro;
        return hashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountShoppingParamsDto(showIntro=");
        sb.append(this.showIntro);
        sb.append(", showMarketOnboarding=");
        sb.append(this.showMarketOnboarding);
        sb.append(", showWishlistOnboarding=");
        sb.append(this.showWishlistOnboarding);
        sb.append(", hasAlbumsV2Intro=");
        return tn.a(sb, this.hasAlbumsV2Intro, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.showIntro ? 1 : 0);
        Boolean bool = this.showMarketOnboarding;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.showWishlistOnboarding;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.hasAlbumsV2Intro;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public /* synthetic */ AccountShoppingParamsDto(boolean z, Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3);
    }
}

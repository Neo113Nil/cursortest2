package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthAppConfigDto.kt */
/* loaded from: classes14.dex */
public final class AuthAppConfigDto implements Parcelable {
    public static final Parcelable.Creator<AuthAppConfigDto> CREATOR = new a();

    @pmi0("agreements")
    private final AuthAppConfigAgreementsDto agreements;

    @pmi0(NotificationCompat.CATEGORY_PROMO)
    private final AuthAppConfigPromoDto promo;

    @pmi0("registration")
    private final AuthAppConfigRegistrationDto registration;

    @pmi0("vkc_auth_action")
    private final AuthAppConfigVkcAuthActionDto vkcAuthAction;

    @pmi0("vkc_behavior")
    private final AuthAppConfigVkcBehaviorDto vkcBehavior;

    @pmi0("vkc_brand")
    private final AuthAppConfigVkcBrandDto vkcBrand;

    @pmi0("vkc_display_mode")
    private final AuthAppConfigVkcDisplayModeDto vkcDisplayMode;

    /* compiled from: AuthAppConfigDto.kt */
    public static final class a implements Parcelable.Creator<AuthAppConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigDto createFromParcel(Parcel parcel) {
            return new AuthAppConfigDto(parcel.readInt() == 0 ? null : AuthAppConfigVkcAuthActionDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AuthAppConfigPromoDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AuthAppConfigVkcBehaviorDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AuthAppConfigVkcBrandDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AuthAppConfigVkcDisplayModeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AuthAppConfigRegistrationDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AuthAppConfigAgreementsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigDto[] newArray(int i) {
            return new AuthAppConfigDto[i];
        }
    }

    public AuthAppConfigDto() {
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
        if (!(obj instanceof AuthAppConfigDto)) {
            return false;
        }
        AuthAppConfigDto authAppConfigDto = (AuthAppConfigDto) obj;
        return epx.f(this.vkcAuthAction, authAppConfigDto.vkcAuthAction) && epx.f(this.promo, authAppConfigDto.promo) && epx.f(this.vkcBehavior, authAppConfigDto.vkcBehavior) && epx.f(this.vkcBrand, authAppConfigDto.vkcBrand) && epx.f(this.vkcDisplayMode, authAppConfigDto.vkcDisplayMode) && epx.f(this.registration, authAppConfigDto.registration) && epx.f(this.agreements, authAppConfigDto.agreements);
    }

    public final int hashCode() {
        AuthAppConfigVkcAuthActionDto authAppConfigVkcAuthActionDto = this.vkcAuthAction;
        int hashCode = (authAppConfigVkcAuthActionDto == null ? 0 : authAppConfigVkcAuthActionDto.hashCode()) * 31;
        AuthAppConfigPromoDto authAppConfigPromoDto = this.promo;
        int hashCode2 = (hashCode + (authAppConfigPromoDto == null ? 0 : authAppConfigPromoDto.hashCode())) * 31;
        AuthAppConfigVkcBehaviorDto authAppConfigVkcBehaviorDto = this.vkcBehavior;
        int hashCode3 = (hashCode2 + (authAppConfigVkcBehaviorDto == null ? 0 : authAppConfigVkcBehaviorDto.hashCode())) * 31;
        AuthAppConfigVkcBrandDto authAppConfigVkcBrandDto = this.vkcBrand;
        int hashCode4 = (hashCode3 + (authAppConfigVkcBrandDto == null ? 0 : authAppConfigVkcBrandDto.hashCode())) * 31;
        AuthAppConfigVkcDisplayModeDto authAppConfigVkcDisplayModeDto = this.vkcDisplayMode;
        int hashCode5 = (hashCode4 + (authAppConfigVkcDisplayModeDto == null ? 0 : authAppConfigVkcDisplayModeDto.hashCode())) * 31;
        AuthAppConfigRegistrationDto authAppConfigRegistrationDto = this.registration;
        int hashCode6 = (hashCode5 + (authAppConfigRegistrationDto == null ? 0 : authAppConfigRegistrationDto.hashCode())) * 31;
        AuthAppConfigAgreementsDto authAppConfigAgreementsDto = this.agreements;
        return hashCode6 + (authAppConfigAgreementsDto != null ? authAppConfigAgreementsDto.hashCode() : 0);
    }

    public final String toString() {
        return "AuthAppConfigDto(vkcAuthAction=" + this.vkcAuthAction + ", promo=" + this.promo + ", vkcBehavior=" + this.vkcBehavior + ", vkcBrand=" + this.vkcBrand + ", vkcDisplayMode=" + this.vkcDisplayMode + ", registration=" + this.registration + ", agreements=" + this.agreements + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AuthAppConfigVkcAuthActionDto authAppConfigVkcAuthActionDto = this.vkcAuthAction;
        if (authAppConfigVkcAuthActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authAppConfigVkcAuthActionDto.writeToParcel(parcel, i);
        }
        AuthAppConfigPromoDto authAppConfigPromoDto = this.promo;
        if (authAppConfigPromoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authAppConfigPromoDto.writeToParcel(parcel, i);
        }
        AuthAppConfigVkcBehaviorDto authAppConfigVkcBehaviorDto = this.vkcBehavior;
        if (authAppConfigVkcBehaviorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authAppConfigVkcBehaviorDto.writeToParcel(parcel, i);
        }
        AuthAppConfigVkcBrandDto authAppConfigVkcBrandDto = this.vkcBrand;
        if (authAppConfigVkcBrandDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authAppConfigVkcBrandDto.writeToParcel(parcel, i);
        }
        AuthAppConfigVkcDisplayModeDto authAppConfigVkcDisplayModeDto = this.vkcDisplayMode;
        if (authAppConfigVkcDisplayModeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authAppConfigVkcDisplayModeDto.writeToParcel(parcel, i);
        }
        AuthAppConfigRegistrationDto authAppConfigRegistrationDto = this.registration;
        if (authAppConfigRegistrationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authAppConfigRegistrationDto.writeToParcel(parcel, i);
        }
        AuthAppConfigAgreementsDto authAppConfigAgreementsDto = this.agreements;
        if (authAppConfigAgreementsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authAppConfigAgreementsDto.writeToParcel(parcel, i);
        }
    }

    public AuthAppConfigDto(AuthAppConfigVkcAuthActionDto authAppConfigVkcAuthActionDto, AuthAppConfigPromoDto authAppConfigPromoDto, AuthAppConfigVkcBehaviorDto authAppConfigVkcBehaviorDto, AuthAppConfigVkcBrandDto authAppConfigVkcBrandDto, AuthAppConfigVkcDisplayModeDto authAppConfigVkcDisplayModeDto, AuthAppConfigRegistrationDto authAppConfigRegistrationDto, AuthAppConfigAgreementsDto authAppConfigAgreementsDto) {
        this.vkcAuthAction = authAppConfigVkcAuthActionDto;
        this.promo = authAppConfigPromoDto;
        this.vkcBehavior = authAppConfigVkcBehaviorDto;
        this.vkcBrand = authAppConfigVkcBrandDto;
        this.vkcDisplayMode = authAppConfigVkcDisplayModeDto;
        this.registration = authAppConfigRegistrationDto;
        this.agreements = authAppConfigAgreementsDto;
    }

    public /* synthetic */ AuthAppConfigDto(AuthAppConfigVkcAuthActionDto authAppConfigVkcAuthActionDto, AuthAppConfigPromoDto authAppConfigPromoDto, AuthAppConfigVkcBehaviorDto authAppConfigVkcBehaviorDto, AuthAppConfigVkcBrandDto authAppConfigVkcBrandDto, AuthAppConfigVkcDisplayModeDto authAppConfigVkcDisplayModeDto, AuthAppConfigRegistrationDto authAppConfigRegistrationDto, AuthAppConfigAgreementsDto authAppConfigAgreementsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : authAppConfigVkcAuthActionDto, (i & 2) != 0 ? null : authAppConfigPromoDto, (i & 4) != 0 ? null : authAppConfigVkcBehaviorDto, (i & 8) != 0 ? null : authAppConfigVkcBrandDto, (i & 16) != 0 ? null : authAppConfigVkcDisplayModeDto, (i & 32) != 0 ? null : authAppConfigRegistrationDto, (i & 64) != 0 ? null : authAppConfigAgreementsDto);
    }
}

package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: ShortVideoGetUserSettingsResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetUserSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetUserSettingsResponseDto> CREATOR = new a();

    @pmi0("available_attaches")
    private final ShortVideoAvailableAttachesDto availableAttaches;

    @pmi0("can_attach_products")
    private final Boolean canAttachProducts;

    @pmi0("clips_app_onboarding_finished")
    private final Boolean clipsAppOnboardingFinished;

    @pmi0("license_agreement_2022_agree")
    private final Integer licenseAgreement2022Agree;

    @pmi0("owner_can_attach_link")
    private final Boolean ownerCanAttachLink;

    @pmi0("post_ad_banner_interval")
    private final Integer postAdBannerInterval;

    @pmi0("settings")
    private final List<ShortVideoSettingDto> settings;

    @pmi0("ugc_sounds_agreement_2022_agree")
    private final Integer ugcSoundsAgreement2022Agree;

    /* compiled from: ShortVideoGetUserSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetUserSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetUserSettingsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(ShortVideoSettingDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShortVideoGetUserSettingsResponseDto(arrayList, valueOf4, valueOf5, valueOf, valueOf2, valueOf3, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? ShortVideoAvailableAttachesDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetUserSettingsResponseDto[] newArray(int i) {
            return new ShortVideoGetUserSettingsResponseDto[i];
        }
    }

    public ShortVideoGetUserSettingsResponseDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final ShortVideoAvailableAttachesDto d() {
        return this.availableAttaches;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.canAttachProducts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoGetUserSettingsResponseDto)) {
            return false;
        }
        ShortVideoGetUserSettingsResponseDto shortVideoGetUserSettingsResponseDto = (ShortVideoGetUserSettingsResponseDto) obj;
        return epx.f(this.settings, shortVideoGetUserSettingsResponseDto.settings) && epx.f(this.licenseAgreement2022Agree, shortVideoGetUserSettingsResponseDto.licenseAgreement2022Agree) && epx.f(this.ugcSoundsAgreement2022Agree, shortVideoGetUserSettingsResponseDto.ugcSoundsAgreement2022Agree) && epx.f(this.ownerCanAttachLink, shortVideoGetUserSettingsResponseDto.ownerCanAttachLink) && epx.f(this.canAttachProducts, shortVideoGetUserSettingsResponseDto.canAttachProducts) && epx.f(this.clipsAppOnboardingFinished, shortVideoGetUserSettingsResponseDto.clipsAppOnboardingFinished) && epx.f(this.postAdBannerInterval, shortVideoGetUserSettingsResponseDto.postAdBannerInterval) && epx.f(this.availableAttaches, shortVideoGetUserSettingsResponseDto.availableAttaches);
    }

    public final Boolean f() {
        return this.ownerCanAttachLink;
    }

    public final Integer g() {
        return this.postAdBannerInterval;
    }

    public final int hashCode() {
        List<ShortVideoSettingDto> list = this.settings;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.licenseAgreement2022Agree;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.ugcSoundsAgreement2022Agree;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.ownerCanAttachLink;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canAttachProducts;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.clipsAppOnboardingFinished;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num3 = this.postAdBannerInterval;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        ShortVideoAvailableAttachesDto shortVideoAvailableAttachesDto = this.availableAttaches;
        return hashCode7 + (shortVideoAvailableAttachesDto != null ? shortVideoAvailableAttachesDto.hashCode() : 0);
    }

    public final List<ShortVideoSettingDto> i() {
        return this.settings;
    }

    public final String toString() {
        return "ShortVideoGetUserSettingsResponseDto(settings=" + this.settings + ", licenseAgreement2022Agree=" + this.licenseAgreement2022Agree + ", ugcSoundsAgreement2022Agree=" + this.ugcSoundsAgreement2022Agree + ", ownerCanAttachLink=" + this.ownerCanAttachLink + ", canAttachProducts=" + this.canAttachProducts + ", clipsAppOnboardingFinished=" + this.clipsAppOnboardingFinished + ", postAdBannerInterval=" + this.postAdBannerInterval + ", availableAttaches=" + this.availableAttaches + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<ShortVideoSettingDto> list = this.settings;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((ShortVideoSettingDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.licenseAgreement2022Agree;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.ugcSoundsAgreement2022Agree;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool = this.ownerCanAttachLink;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.canAttachProducts;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.clipsAppOnboardingFinished;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Integer num3 = this.postAdBannerInterval;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        ShortVideoAvailableAttachesDto shortVideoAvailableAttachesDto = this.availableAttaches;
        if (shortVideoAvailableAttachesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoAvailableAttachesDto.writeToParcel(parcel, i);
        }
    }

    public ShortVideoGetUserSettingsResponseDto(List<ShortVideoSettingDto> list, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Integer num3, ShortVideoAvailableAttachesDto shortVideoAvailableAttachesDto) {
        this.settings = list;
        this.licenseAgreement2022Agree = num;
        this.ugcSoundsAgreement2022Agree = num2;
        this.ownerCanAttachLink = bool;
        this.canAttachProducts = bool2;
        this.clipsAppOnboardingFinished = bool3;
        this.postAdBannerInterval = num3;
        this.availableAttaches = shortVideoAvailableAttachesDto;
    }

    public /* synthetic */ ShortVideoGetUserSettingsResponseDto(List list, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Integer num3, ShortVideoAvailableAttachesDto shortVideoAvailableAttachesDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : shortVideoAvailableAttachesDto);
    }
}

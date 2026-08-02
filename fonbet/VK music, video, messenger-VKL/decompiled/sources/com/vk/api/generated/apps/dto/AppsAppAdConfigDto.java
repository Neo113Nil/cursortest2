package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: AppsAppAdConfigDto.kt */
/* loaded from: classes14.dex */
public final class AppsAppAdConfigDto implements Parcelable {
    public static final Parcelable.Creator<AppsAppAdConfigDto> CREATOR = new a();

    @pmi0("ads_external_id")
    private final Integer adsExternalId;

    @pmi0("banner_portlet_enabled")
    private final Boolean bannerPortletEnabled;

    @pmi0("closing_ad_enabled")
    private final Boolean closingAdEnabled;

    @pmi0("id")
    private final Integer id;

    @pmi0("mob_web_enabled")
    private final Boolean mobWebEnabled;

    @pmi0("pause_ad_enabled")
    private final Boolean pauseAdEnabled;

    @pmi0("splash_ad_enabled")
    private final Boolean splashAdEnabled;

    @pmi0("test_mode")
    private final Boolean testMode;

    /* compiled from: AppsAppAdConfigDto.kt */
    public static final class a implements Parcelable.Creator<AppsAppAdConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAppAdConfigDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            Boolean valueOf5;
            Boolean bool = null;
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AppsAppAdConfigDto(valueOf6, valueOf, valueOf2, valueOf3, valueOf7, valueOf4, valueOf5, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAppAdConfigDto[] newArray(int i) {
            return new AppsAppAdConfigDto[i];
        }
    }

    public AppsAppAdConfigDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final Integer d() {
        return this.adsExternalId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.closingAdEnabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAppAdConfigDto)) {
            return false;
        }
        AppsAppAdConfigDto appsAppAdConfigDto = (AppsAppAdConfigDto) obj;
        return epx.f(this.id, appsAppAdConfigDto.id) && epx.f(this.bannerPortletEnabled, appsAppAdConfigDto.bannerPortletEnabled) && epx.f(this.testMode, appsAppAdConfigDto.testMode) && epx.f(this.mobWebEnabled, appsAppAdConfigDto.mobWebEnabled) && epx.f(this.adsExternalId, appsAppAdConfigDto.adsExternalId) && epx.f(this.splashAdEnabled, appsAppAdConfigDto.splashAdEnabled) && epx.f(this.closingAdEnabled, appsAppAdConfigDto.closingAdEnabled) && epx.f(this.pauseAdEnabled, appsAppAdConfigDto.pauseAdEnabled);
    }

    public final Integer f() {
        return this.id;
    }

    public final Boolean g() {
        return this.mobWebEnabled;
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.bannerPortletEnabled;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.testMode;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.mobWebEnabled;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.adsExternalId;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.splashAdEnabled;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.closingAdEnabled;
        int hashCode7 = (hashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.pauseAdEnabled;
        return hashCode7 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final Boolean i() {
        return this.splashAdEnabled;
    }

    public final Boolean j() {
        return this.testMode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsAppAdConfigDto(id=");
        sb.append(this.id);
        sb.append(", bannerPortletEnabled=");
        sb.append(this.bannerPortletEnabled);
        sb.append(", testMode=");
        sb.append(this.testMode);
        sb.append(", mobWebEnabled=");
        sb.append(this.mobWebEnabled);
        sb.append(", adsExternalId=");
        sb.append(this.adsExternalId);
        sb.append(", splashAdEnabled=");
        sb.append(this.splashAdEnabled);
        sb.append(", closingAdEnabled=");
        sb.append(this.closingAdEnabled);
        sb.append(", pauseAdEnabled=");
        return tn.a(sb, this.pauseAdEnabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.bannerPortletEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.testMode;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.mobWebEnabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Integer num2 = this.adsExternalId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool4 = this.splashAdEnabled;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.closingAdEnabled;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        Boolean bool6 = this.pauseAdEnabled;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool6);
        }
    }

    public AppsAppAdConfigDto(Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.id = num;
        this.bannerPortletEnabled = bool;
        this.testMode = bool2;
        this.mobWebEnabled = bool3;
        this.adsExternalId = num2;
        this.splashAdEnabled = bool4;
        this.closingAdEnabled = bool5;
        this.pauseAdEnabled = bool6;
    }

    public /* synthetic */ AppsAppAdConfigDto(Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : bool4, (i & 64) != 0 ? null : bool5, (i & 128) != 0 ? null : bool6);
    }
}

package com.vk.api.generated.leadForms.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.D1;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: LeadFormsLeadFormResultInfoDto.kt */
/* loaded from: classes14.dex */
public final class LeadFormsLeadFormResultInfoDto implements Parcelable {
    public static final Parcelable.Creator<LeadFormsLeadFormResultInfoDto> CREATOR = new a();

    @pmi0("cta_text")
    private final String ctaText;

    @pmi0("description")
    private final String description;

    @pmi0("phone")
    private final String phone;

    @pmi0("promo_code")
    private final String promoCode;

    @pmi0("site_url")
    private final String siteUrl;

    @pmi0("site_url_target")
    private final SiteUrlTargetDto siteUrlTarget;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LeadFormsLeadFormResultInfoDto.kt */
    public static final class SiteUrlTargetDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SiteUrlTargetDto[] $VALUES;
        public static final Parcelable.Creator<SiteUrlTargetDto> CREATOR;

        @pmi0(D1.e)
        public static final SiteUrlTargetDto EXTERNAL;

        @pmi0("internal")
        public static final SiteUrlTargetDto INTERNAL;

        @pmi0("internal_hidden")
        public static final SiteUrlTargetDto INTERNAL_HIDDEN;
        private final String value;

        /* compiled from: LeadFormsLeadFormResultInfoDto.kt */
        public static final class a implements Parcelable.Creator<SiteUrlTargetDto> {
            @Override // android.os.Parcelable.Creator
            public final SiteUrlTargetDto createFromParcel(Parcel parcel) {
                return SiteUrlTargetDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SiteUrlTargetDto[] newArray(int i) {
                return new SiteUrlTargetDto[i];
            }
        }

        static {
            SiteUrlTargetDto siteUrlTargetDto = new SiteUrlTargetDto("INTERNAL", 0, "internal");
            INTERNAL = siteUrlTargetDto;
            SiteUrlTargetDto siteUrlTargetDto2 = new SiteUrlTargetDto("EXTERNAL", 1, D1.e);
            EXTERNAL = siteUrlTargetDto2;
            SiteUrlTargetDto siteUrlTargetDto3 = new SiteUrlTargetDto("INTERNAL_HIDDEN", 2, "internal_hidden");
            INTERNAL_HIDDEN = siteUrlTargetDto3;
            SiteUrlTargetDto[] siteUrlTargetDtoArr = {siteUrlTargetDto, siteUrlTargetDto2, siteUrlTargetDto3};
            $VALUES = siteUrlTargetDtoArr;
            $ENTRIES = new asp(siteUrlTargetDtoArr);
            CREATOR = new a();
        }

        private SiteUrlTargetDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SiteUrlTargetDto valueOf(String str) {
            return (SiteUrlTargetDto) Enum.valueOf(SiteUrlTargetDto.class, str);
        }

        public static SiteUrlTargetDto[] values() {
            return (SiteUrlTargetDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: LeadFormsLeadFormResultInfoDto.kt */
    public static final class a implements Parcelable.Creator<LeadFormsLeadFormResultInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final LeadFormsLeadFormResultInfoDto createFromParcel(Parcel parcel) {
            return new LeadFormsLeadFormResultInfoDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SiteUrlTargetDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LeadFormsLeadFormResultInfoDto[] newArray(int i) {
            return new LeadFormsLeadFormResultInfoDto[i];
        }
    }

    public LeadFormsLeadFormResultInfoDto(String str, String str2, String str3, String str4, SiteUrlTargetDto siteUrlTargetDto, String str5, String str6) {
        this.title = str;
        this.ctaText = str2;
        this.description = str3;
        this.siteUrl = str4;
        this.siteUrlTarget = siteUrlTargetDto;
        this.phone = str5;
        this.promoCode = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsLeadFormResultInfoDto)) {
            return false;
        }
        LeadFormsLeadFormResultInfoDto leadFormsLeadFormResultInfoDto = (LeadFormsLeadFormResultInfoDto) obj;
        return epx.f(this.title, leadFormsLeadFormResultInfoDto.title) && epx.f(this.ctaText, leadFormsLeadFormResultInfoDto.ctaText) && epx.f(this.description, leadFormsLeadFormResultInfoDto.description) && epx.f(this.siteUrl, leadFormsLeadFormResultInfoDto.siteUrl) && this.siteUrlTarget == leadFormsLeadFormResultInfoDto.siteUrlTarget && epx.f(this.phone, leadFormsLeadFormResultInfoDto.phone) && epx.f(this.promoCode, leadFormsLeadFormResultInfoDto.promoCode);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.title.hashCode() * 31, 31, this.ctaText);
        String str = this.description;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.siteUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SiteUrlTargetDto siteUrlTargetDto = this.siteUrlTarget;
        int hashCode3 = (hashCode2 + (siteUrlTargetDto == null ? 0 : siteUrlTargetDto.hashCode())) * 31;
        String str3 = this.phone;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.promoCode;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeadFormsLeadFormResultInfoDto(title=");
        sb.append(this.title);
        sb.append(", ctaText=");
        sb.append(this.ctaText);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", siteUrl=");
        sb.append(this.siteUrl);
        sb.append(", siteUrlTarget=");
        sb.append(this.siteUrlTarget);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", promoCode=");
        return ho8.a(sb, this.promoCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.ctaText);
        parcel.writeString(this.description);
        parcel.writeString(this.siteUrl);
        SiteUrlTargetDto siteUrlTargetDto = this.siteUrlTarget;
        if (siteUrlTargetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            siteUrlTargetDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.phone);
        parcel.writeString(this.promoCode);
    }

    public /* synthetic */ LeadFormsLeadFormResultInfoDto(String str, String str2, String str3, String str4, SiteUrlTargetDto siteUrlTargetDto, String str5, String str6, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : siteUrlTargetDto, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}

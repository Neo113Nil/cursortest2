package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppWidgetVkTaxiRideSuggestionDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppWidgetVkTaxiRideSuggestionDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppWidgetVkTaxiRideSuggestionDto> CREATOR = new a();

    @pmi0("logo")
    private final LogoDto logo;

    @pmi0("name")
    private final String name;

    @pmi0("old_price")
    private final String oldPrice;

    @pmi0("point_from")
    private final String pointFrom;

    @pmi0("point_to")
    private final String pointTo;

    @pmi0("price")
    private final String price;

    @pmi0("travel_time")
    private final String travelTime;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppWidgetVkTaxiRideSuggestionDto.kt */
    public static final class LogoDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LogoDto[] $VALUES;
        public static final Parcelable.Creator<LogoDto> CREATOR;

        @pmi0("default_logo")
        public static final LogoDto DEFAULT_LOGO;

        @pmi0("home")
        public static final LogoDto HOME;

        @pmi0("work")
        public static final LogoDto WORK;
        private final String value;

        /* compiled from: SuperAppWidgetVkTaxiRideSuggestionDto.kt */
        public static final class a implements Parcelable.Creator<LogoDto> {
            @Override // android.os.Parcelable.Creator
            public final LogoDto createFromParcel(Parcel parcel) {
                return LogoDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LogoDto[] newArray(int i) {
                return new LogoDto[i];
            }
        }

        static {
            LogoDto logoDto = new LogoDto("HOME", 0, "home");
            HOME = logoDto;
            LogoDto logoDto2 = new LogoDto("WORK", 1, "work");
            WORK = logoDto2;
            LogoDto logoDto3 = new LogoDto("DEFAULT_LOGO", 2, "default_logo");
            DEFAULT_LOGO = logoDto3;
            LogoDto[] logoDtoArr = {logoDto, logoDto2, logoDto3};
            $VALUES = logoDtoArr;
            $ENTRIES = new asp(logoDtoArr);
            CREATOR = new a();
        }

        private LogoDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LogoDto valueOf(String str) {
            return (LogoDto) Enum.valueOf(LogoDto.class, str);
        }

        public static LogoDto[] values() {
            return (LogoDto[]) $VALUES.clone();
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

    /* compiled from: SuperAppWidgetVkTaxiRideSuggestionDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetVkTaxiRideSuggestionDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetVkTaxiRideSuggestionDto createFromParcel(Parcel parcel) {
            return new SuperAppWidgetVkTaxiRideSuggestionDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : LogoDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetVkTaxiRideSuggestionDto[] newArray(int i) {
            return new SuperAppWidgetVkTaxiRideSuggestionDto[i];
        }
    }

    public SuperAppWidgetVkTaxiRideSuggestionDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, LogoDto logoDto) {
        this.name = str;
        this.price = str2;
        this.pointFrom = str3;
        this.pointTo = str4;
        this.webviewUrl = str5;
        this.oldPrice = str6;
        this.travelTime = str7;
        this.logo = logoDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppWidgetVkTaxiRideSuggestionDto)) {
            return false;
        }
        SuperAppWidgetVkTaxiRideSuggestionDto superAppWidgetVkTaxiRideSuggestionDto = (SuperAppWidgetVkTaxiRideSuggestionDto) obj;
        return epx.f(this.name, superAppWidgetVkTaxiRideSuggestionDto.name) && epx.f(this.price, superAppWidgetVkTaxiRideSuggestionDto.price) && epx.f(this.pointFrom, superAppWidgetVkTaxiRideSuggestionDto.pointFrom) && epx.f(this.pointTo, superAppWidgetVkTaxiRideSuggestionDto.pointTo) && epx.f(this.webviewUrl, superAppWidgetVkTaxiRideSuggestionDto.webviewUrl) && epx.f(this.oldPrice, superAppWidgetVkTaxiRideSuggestionDto.oldPrice) && epx.f(this.travelTime, superAppWidgetVkTaxiRideSuggestionDto.travelTime) && this.logo == superAppWidgetVkTaxiRideSuggestionDto.logo;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(urd0.a(this.name.hashCode() * 31, 31, this.price), 31, this.pointFrom), 31, this.pointTo), 31, this.webviewUrl);
        String str = this.oldPrice;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.travelTime;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LogoDto logoDto = this.logo;
        return hashCode2 + (logoDto != null ? logoDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppWidgetVkTaxiRideSuggestionDto(name=" + this.name + ", price=" + this.price + ", pointFrom=" + this.pointFrom + ", pointTo=" + this.pointTo + ", webviewUrl=" + this.webviewUrl + ", oldPrice=" + this.oldPrice + ", travelTime=" + this.travelTime + ", logo=" + this.logo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.price);
        parcel.writeString(this.pointFrom);
        parcel.writeString(this.pointTo);
        parcel.writeString(this.webviewUrl);
        parcel.writeString(this.oldPrice);
        parcel.writeString(this.travelTime);
        LogoDto logoDto = this.logo;
        if (logoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            logoDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppWidgetVkTaxiRideSuggestionDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, LogoDto logoDto, int i, zcl zclVar) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : logoDto);
    }
}

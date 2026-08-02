package com.vk.api.generated.adsint.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AdsintEventDto.kt */
/* loaded from: classes14.dex */
public final class AdsintEventDto implements Parcelable {
    public static final Parcelable.Creator<AdsintEventDto> CREATOR = new a();

    @pmi0("ad_data")
    private final String adData;

    @pmi0("ad_data_impression")
    private final String adDataImpression;

    @pmi0("ads_device_id")
    private final String adsDeviceId;

    @pmi0("ads_tracking_disabled")
    private final AdsTrackingDisabledDto adsTrackingDisabled;

    @pmi0("end_view")
    private final String endView;

    @pmi0("event_type")
    private final AdsintEventTypeDto eventType;

    @pmi0("extra_data")
    private final AdsintExtraDataDto extraData;

    @pmi0(X3.i.L)
    private final Integer position;

    @pmi0("start_view")
    private final String startView;

    @pmi0("total_view_duration")
    private final String totalViewDuration;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsintEventDto.kt */
    public static final class AdsTrackingDisabledDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AdsTrackingDisabledDto[] $VALUES;
        public static final Parcelable.Creator<AdsTrackingDisabledDto> CREATOR;

        @pmi0("0")
        public static final AdsTrackingDisabledDto TYPE_0;

        @pmi0("1")
        public static final AdsTrackingDisabledDto TYPE_1;
        private final String value;

        /* compiled from: AdsintEventDto.kt */
        public static final class a implements Parcelable.Creator<AdsTrackingDisabledDto> {
            @Override // android.os.Parcelable.Creator
            public final AdsTrackingDisabledDto createFromParcel(Parcel parcel) {
                return AdsTrackingDisabledDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AdsTrackingDisabledDto[] newArray(int i) {
                return new AdsTrackingDisabledDto[i];
            }
        }

        static {
            AdsTrackingDisabledDto adsTrackingDisabledDto = new AdsTrackingDisabledDto("TYPE_0", 0, "0");
            TYPE_0 = adsTrackingDisabledDto;
            AdsTrackingDisabledDto adsTrackingDisabledDto2 = new AdsTrackingDisabledDto("TYPE_1", 1, "1");
            TYPE_1 = adsTrackingDisabledDto2;
            AdsTrackingDisabledDto[] adsTrackingDisabledDtoArr = {adsTrackingDisabledDto, adsTrackingDisabledDto2};
            $VALUES = adsTrackingDisabledDtoArr;
            $ENTRIES = new asp(adsTrackingDisabledDtoArr);
            CREATOR = new a();
        }

        private AdsTrackingDisabledDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static AdsTrackingDisabledDto valueOf(String str) {
            return (AdsTrackingDisabledDto) Enum.valueOf(AdsTrackingDisabledDto.class, str);
        }

        public static AdsTrackingDisabledDto[] values() {
            return (AdsTrackingDisabledDto[]) $VALUES.clone();
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

    /* compiled from: AdsintEventDto.kt */
    public static final class a implements Parcelable.Creator<AdsintEventDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsintEventDto createFromParcel(Parcel parcel) {
            return new AdsintEventDto(AdsintEventTypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : AdsTrackingDisabledDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : AdsintExtraDataDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AdsintEventDto[] newArray(int i) {
            return new AdsintEventDto[i];
        }
    }

    public AdsintEventDto(AdsintEventTypeDto adsintEventTypeDto, String str, AdsTrackingDisabledDto adsTrackingDisabledDto, String str2, String str3, String str4, String str5, String str6, Integer num, AdsintExtraDataDto adsintExtraDataDto) {
        this.eventType = adsintEventTypeDto;
        this.adsDeviceId = str;
        this.adsTrackingDisabled = adsTrackingDisabledDto;
        this.adDataImpression = str2;
        this.adData = str3;
        this.startView = str4;
        this.endView = str5;
        this.totalViewDuration = str6;
        this.position = num;
        this.extraData = adsintExtraDataDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsintEventDto)) {
            return false;
        }
        AdsintEventDto adsintEventDto = (AdsintEventDto) obj;
        return this.eventType == adsintEventDto.eventType && epx.f(this.adsDeviceId, adsintEventDto.adsDeviceId) && this.adsTrackingDisabled == adsintEventDto.adsTrackingDisabled && epx.f(this.adDataImpression, adsintEventDto.adDataImpression) && epx.f(this.adData, adsintEventDto.adData) && epx.f(this.startView, adsintEventDto.startView) && epx.f(this.endView, adsintEventDto.endView) && epx.f(this.totalViewDuration, adsintEventDto.totalViewDuration) && epx.f(this.position, adsintEventDto.position) && epx.f(this.extraData, adsintEventDto.extraData);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        String str = this.adsDeviceId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AdsTrackingDisabledDto adsTrackingDisabledDto = this.adsTrackingDisabled;
        int hashCode3 = (hashCode2 + (adsTrackingDisabledDto == null ? 0 : adsTrackingDisabledDto.hashCode())) * 31;
        String str2 = this.adDataImpression;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adData;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.startView;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.endView;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.totalViewDuration;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.position;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        AdsintExtraDataDto adsintExtraDataDto = this.extraData;
        return hashCode9 + (adsintExtraDataDto != null ? adsintExtraDataDto.hashCode() : 0);
    }

    public final String toString() {
        return "AdsintEventDto(eventType=" + this.eventType + ", adsDeviceId=" + this.adsDeviceId + ", adsTrackingDisabled=" + this.adsTrackingDisabled + ", adDataImpression=" + this.adDataImpression + ", adData=" + this.adData + ", startView=" + this.startView + ", endView=" + this.endView + ", totalViewDuration=" + this.totalViewDuration + ", position=" + this.position + ", extraData=" + this.extraData + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.eventType.writeToParcel(parcel, i);
        parcel.writeString(this.adsDeviceId);
        AdsTrackingDisabledDto adsTrackingDisabledDto = this.adsTrackingDisabled;
        if (adsTrackingDisabledDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsTrackingDisabledDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.adDataImpression);
        parcel.writeString(this.adData);
        parcel.writeString(this.startView);
        parcel.writeString(this.endView);
        parcel.writeString(this.totalViewDuration);
        Integer num = this.position;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        AdsintExtraDataDto adsintExtraDataDto = this.extraData;
        if (adsintExtraDataDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adsintExtraDataDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AdsintEventDto(AdsintEventTypeDto adsintEventTypeDto, String str, AdsTrackingDisabledDto adsTrackingDisabledDto, String str2, String str3, String str4, String str5, String str6, Integer num, AdsintExtraDataDto adsintExtraDataDto, int i, zcl zclVar) {
        this(adsintEventTypeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : adsTrackingDisabledDto, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : num, (i & 512) != 0 ? null : adsintExtraDataDto);
    }
}

package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsGetAutoPromotionLinkGoalDto.kt */
/* loaded from: classes14.dex */
public final class AdsGetAutoPromotionLinkGoalDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsGetAutoPromotionLinkGoalDto[] $VALUES;
    public static final Parcelable.Creator<AdsGetAutoPromotionLinkGoalDto> CREATOR;

    @pmi0("goods")
    public static final AdsGetAutoPromotionLinkGoalDto GOODS;

    @pmi0("services")
    public static final AdsGetAutoPromotionLinkGoalDto SERVICES;
    private final String value;

    /* compiled from: AdsGetAutoPromotionLinkGoalDto.kt */
    public static final class a implements Parcelable.Creator<AdsGetAutoPromotionLinkGoalDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsGetAutoPromotionLinkGoalDto createFromParcel(Parcel parcel) {
            return AdsGetAutoPromotionLinkGoalDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdsGetAutoPromotionLinkGoalDto[] newArray(int i) {
            return new AdsGetAutoPromotionLinkGoalDto[i];
        }
    }

    static {
        AdsGetAutoPromotionLinkGoalDto adsGetAutoPromotionLinkGoalDto = new AdsGetAutoPromotionLinkGoalDto("GOODS", 0, "goods");
        GOODS = adsGetAutoPromotionLinkGoalDto;
        AdsGetAutoPromotionLinkGoalDto adsGetAutoPromotionLinkGoalDto2 = new AdsGetAutoPromotionLinkGoalDto("SERVICES", 1, "services");
        SERVICES = adsGetAutoPromotionLinkGoalDto2;
        AdsGetAutoPromotionLinkGoalDto[] adsGetAutoPromotionLinkGoalDtoArr = {adsGetAutoPromotionLinkGoalDto, adsGetAutoPromotionLinkGoalDto2};
        $VALUES = adsGetAutoPromotionLinkGoalDtoArr;
        $ENTRIES = new asp(adsGetAutoPromotionLinkGoalDtoArr);
        CREATOR = new a();
    }

    private AdsGetAutoPromotionLinkGoalDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdsGetAutoPromotionLinkGoalDto valueOf(String str) {
        return (AdsGetAutoPromotionLinkGoalDto) Enum.valueOf(AdsGetAutoPromotionLinkGoalDto.class, str);
    }

    public static AdsGetAutoPromotionLinkGoalDto[] values() {
        return (AdsGetAutoPromotionLinkGoalDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}

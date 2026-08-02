package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioRestrictionDto.kt */
/* loaded from: classes14.dex */
public final class AudioRestrictionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioRestrictionDto[] $VALUES;

    @pmi0("9")
    public static final AudioRestrictionDto APP_UPDATE;

    @pmi0("1")
    public static final AudioRestrictionDto CLAIM;
    public static final Parcelable.Creator<AudioRestrictionDto> CREATOR;

    @pmi0("11")
    public static final AudioRestrictionDto DONUT_PODCAST;

    @pmi0("13")
    public static final AudioRestrictionDto ERROR;

    @pmi0("12")
    public static final AudioRestrictionDto EXPERIMENT;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final AudioRestrictionDto FUTURE;

    @pmi0("2")
    public static final AudioRestrictionDto GEO;

    @pmi0("14")
    public static final AudioRestrictionDto JAM_CLAIMED;

    @pmi0("24")
    public static final AudioRestrictionDto KIDS_SUBSCRIPTION;

    @pmi0("0")
    public static final AudioRestrictionDto NO;

    @pmi0("6")
    public static final AudioRestrictionDto OUTSIDE_HOSTING_COUNTRY;

    @pmi0("4")
    public static final AudioRestrictionDto REPLACEMENT_REQUIRED;

    @pmi0(Gc.e)
    public static final AudioRestrictionDto SITE_RULES_VIOLATION;

    @pmi0("22")
    public static final AudioRestrictionDto STORY_FREE;

    @pmi0("21")
    public static final AudioRestrictionDto STORY_NOT_AVAILABLE;

    @pmi0("23")
    public static final AudioRestrictionDto STORY_PAID;

    @pmi0("3")
    public static final AudioRestrictionDto SUBSCRIPTION;

    @pmi0("8")
    public static final AudioRestrictionDto SUBSCRIPTION_SUSPEND;

    @pmi0("10")
    public static final AudioRestrictionDto WARNER_NON_RETAIL_CLAIMED;
    private final int value;

    /* compiled from: AudioRestrictionDto.kt */
    public static final class a implements Parcelable.Creator<AudioRestrictionDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioRestrictionDto createFromParcel(Parcel parcel) {
            return AudioRestrictionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioRestrictionDto[] newArray(int i) {
            return new AudioRestrictionDto[i];
        }
    }

    static {
        AudioRestrictionDto audioRestrictionDto = new AudioRestrictionDto("NO", 0, 0);
        NO = audioRestrictionDto;
        AudioRestrictionDto audioRestrictionDto2 = new AudioRestrictionDto("CLAIM", 1, 1);
        CLAIM = audioRestrictionDto2;
        AudioRestrictionDto audioRestrictionDto3 = new AudioRestrictionDto("GEO", 2, 2);
        GEO = audioRestrictionDto3;
        AudioRestrictionDto audioRestrictionDto4 = new AudioRestrictionDto("SUBSCRIPTION", 3, 3);
        SUBSCRIPTION = audioRestrictionDto4;
        AudioRestrictionDto audioRestrictionDto5 = new AudioRestrictionDto("REPLACEMENT_REQUIRED", 4, 4);
        REPLACEMENT_REQUIRED = audioRestrictionDto5;
        AudioRestrictionDto audioRestrictionDto6 = new AudioRestrictionDto("FUTURE", 5, 5);
        FUTURE = audioRestrictionDto6;
        AudioRestrictionDto audioRestrictionDto7 = new AudioRestrictionDto("OUTSIDE_HOSTING_COUNTRY", 6, 6);
        OUTSIDE_HOSTING_COUNTRY = audioRestrictionDto7;
        AudioRestrictionDto audioRestrictionDto8 = new AudioRestrictionDto("SITE_RULES_VIOLATION", 7, 7);
        SITE_RULES_VIOLATION = audioRestrictionDto8;
        AudioRestrictionDto audioRestrictionDto9 = new AudioRestrictionDto("SUBSCRIPTION_SUSPEND", 8, 8);
        SUBSCRIPTION_SUSPEND = audioRestrictionDto9;
        AudioRestrictionDto audioRestrictionDto10 = new AudioRestrictionDto("APP_UPDATE", 9, 9);
        APP_UPDATE = audioRestrictionDto10;
        AudioRestrictionDto audioRestrictionDto11 = new AudioRestrictionDto("WARNER_NON_RETAIL_CLAIMED", 10, 10);
        WARNER_NON_RETAIL_CLAIMED = audioRestrictionDto11;
        AudioRestrictionDto audioRestrictionDto12 = new AudioRestrictionDto("DONUT_PODCAST", 11, 11);
        DONUT_PODCAST = audioRestrictionDto12;
        AudioRestrictionDto audioRestrictionDto13 = new AudioRestrictionDto("EXPERIMENT", 12, 12);
        EXPERIMENT = audioRestrictionDto13;
        AudioRestrictionDto audioRestrictionDto14 = new AudioRestrictionDto("ERROR", 13, 13);
        ERROR = audioRestrictionDto14;
        AudioRestrictionDto audioRestrictionDto15 = new AudioRestrictionDto("JAM_CLAIMED", 14, 14);
        JAM_CLAIMED = audioRestrictionDto15;
        AudioRestrictionDto audioRestrictionDto16 = new AudioRestrictionDto("STORY_NOT_AVAILABLE", 15, 21);
        STORY_NOT_AVAILABLE = audioRestrictionDto16;
        AudioRestrictionDto audioRestrictionDto17 = new AudioRestrictionDto("STORY_FREE", 16, 22);
        STORY_FREE = audioRestrictionDto17;
        AudioRestrictionDto audioRestrictionDto18 = new AudioRestrictionDto("STORY_PAID", 17, 23);
        STORY_PAID = audioRestrictionDto18;
        AudioRestrictionDto audioRestrictionDto19 = new AudioRestrictionDto("KIDS_SUBSCRIPTION", 18, 24);
        KIDS_SUBSCRIPTION = audioRestrictionDto19;
        AudioRestrictionDto[] audioRestrictionDtoArr = {audioRestrictionDto, audioRestrictionDto2, audioRestrictionDto3, audioRestrictionDto4, audioRestrictionDto5, audioRestrictionDto6, audioRestrictionDto7, audioRestrictionDto8, audioRestrictionDto9, audioRestrictionDto10, audioRestrictionDto11, audioRestrictionDto12, audioRestrictionDto13, audioRestrictionDto14, audioRestrictionDto15, audioRestrictionDto16, audioRestrictionDto17, audioRestrictionDto18, audioRestrictionDto19};
        $VALUES = audioRestrictionDtoArr;
        $ENTRIES = new asp(audioRestrictionDtoArr);
        CREATOR = new a();
    }

    private AudioRestrictionDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static zrp<AudioRestrictionDto> i() {
        return $ENTRIES;
    }

    public static AudioRestrictionDto valueOf(String str) {
        return (AudioRestrictionDto) Enum.valueOf(AudioRestrictionDto.class, str);
    }

    public static AudioRestrictionDto[] values() {
        return (AudioRestrictionDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int j() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}

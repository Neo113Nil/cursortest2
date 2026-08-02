package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoSendRecommendedFeedbackTypeDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoSendRecommendedFeedbackTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoSendRecommendedFeedbackTypeDto[] $VALUES;
    public static final Parcelable.Creator<ShortVideoSendRecommendedFeedbackTypeDto> CREATOR;

    @pmi0("0")
    public static final ShortVideoSendRecommendedFeedbackTypeDto TYPE_0;

    @pmi0("1")
    public static final ShortVideoSendRecommendedFeedbackTypeDto TYPE_1;

    @pmi0("2")
    public static final ShortVideoSendRecommendedFeedbackTypeDto TYPE_2;
    private final int value;

    /* compiled from: ShortVideoSendRecommendedFeedbackTypeDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoSendRecommendedFeedbackTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoSendRecommendedFeedbackTypeDto createFromParcel(Parcel parcel) {
            return ShortVideoSendRecommendedFeedbackTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoSendRecommendedFeedbackTypeDto[] newArray(int i) {
            return new ShortVideoSendRecommendedFeedbackTypeDto[i];
        }
    }

    static {
        ShortVideoSendRecommendedFeedbackTypeDto shortVideoSendRecommendedFeedbackTypeDto = new ShortVideoSendRecommendedFeedbackTypeDto("TYPE_0", 0, 0);
        TYPE_0 = shortVideoSendRecommendedFeedbackTypeDto;
        ShortVideoSendRecommendedFeedbackTypeDto shortVideoSendRecommendedFeedbackTypeDto2 = new ShortVideoSendRecommendedFeedbackTypeDto("TYPE_1", 1, 1);
        TYPE_1 = shortVideoSendRecommendedFeedbackTypeDto2;
        ShortVideoSendRecommendedFeedbackTypeDto shortVideoSendRecommendedFeedbackTypeDto3 = new ShortVideoSendRecommendedFeedbackTypeDto("TYPE_2", 2, 2);
        TYPE_2 = shortVideoSendRecommendedFeedbackTypeDto3;
        ShortVideoSendRecommendedFeedbackTypeDto[] shortVideoSendRecommendedFeedbackTypeDtoArr = {shortVideoSendRecommendedFeedbackTypeDto, shortVideoSendRecommendedFeedbackTypeDto2, shortVideoSendRecommendedFeedbackTypeDto3};
        $VALUES = shortVideoSendRecommendedFeedbackTypeDtoArr;
        $ENTRIES = new asp(shortVideoSendRecommendedFeedbackTypeDtoArr);
        CREATOR = new a();
    }

    private ShortVideoSendRecommendedFeedbackTypeDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static ShortVideoSendRecommendedFeedbackTypeDto valueOf(String str) {
        return (ShortVideoSendRecommendedFeedbackTypeDto) Enum.valueOf(ShortVideoSendRecommendedFeedbackTypeDto.class, str);
    }

    public static ShortVideoSendRecommendedFeedbackTypeDto[] values() {
        return (ShortVideoSendRecommendedFeedbackTypeDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}

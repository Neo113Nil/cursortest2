package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DonutCancelSubscriptionReasonDto.kt */
/* loaded from: classes14.dex */
public final class DonutCancelSubscriptionReasonDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DonutCancelSubscriptionReasonDto[] $VALUES;

    @pmi0("bad_price")
    public static final DonutCancelSubscriptionReasonDto BAD_PRICE;

    @pmi0("cancel_for_a_while")
    public static final DonutCancelSubscriptionReasonDto CANCEL_FOR_A_WHILE;
    public static final Parcelable.Creator<DonutCancelSubscriptionReasonDto> CREATOR;

    @pmi0("interests_changed")
    public static final DonutCancelSubscriptionReasonDto INTERESTS_CHANGED;

    @pmi0("other")
    public static final DonutCancelSubscriptionReasonDto OTHER;

    @pmi0("seen_everything_needed")
    public static final DonutCancelSubscriptionReasonDto SEEN_EVERYTHING_NEEDED;

    @pmi0("too_few_materials")
    public static final DonutCancelSubscriptionReasonDto TOO_FEW_MATERIALS;

    @pmi0("uninteresting")
    public static final DonutCancelSubscriptionReasonDto UNINTERESTING;
    private final String value;

    /* compiled from: DonutCancelSubscriptionReasonDto.kt */
    public static final class a implements Parcelable.Creator<DonutCancelSubscriptionReasonDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutCancelSubscriptionReasonDto createFromParcel(Parcel parcel) {
            return DonutCancelSubscriptionReasonDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutCancelSubscriptionReasonDto[] newArray(int i) {
            return new DonutCancelSubscriptionReasonDto[i];
        }
    }

    static {
        DonutCancelSubscriptionReasonDto donutCancelSubscriptionReasonDto = new DonutCancelSubscriptionReasonDto("BAD_PRICE", 0, "bad_price");
        BAD_PRICE = donutCancelSubscriptionReasonDto;
        DonutCancelSubscriptionReasonDto donutCancelSubscriptionReasonDto2 = new DonutCancelSubscriptionReasonDto("CANCEL_FOR_A_WHILE", 1, "cancel_for_a_while");
        CANCEL_FOR_A_WHILE = donutCancelSubscriptionReasonDto2;
        DonutCancelSubscriptionReasonDto donutCancelSubscriptionReasonDto3 = new DonutCancelSubscriptionReasonDto("INTERESTS_CHANGED", 2, "interests_changed");
        INTERESTS_CHANGED = donutCancelSubscriptionReasonDto3;
        DonutCancelSubscriptionReasonDto donutCancelSubscriptionReasonDto4 = new DonutCancelSubscriptionReasonDto(NativeAdContent.ViewTag.OTHER, 3, "other");
        OTHER = donutCancelSubscriptionReasonDto4;
        DonutCancelSubscriptionReasonDto donutCancelSubscriptionReasonDto5 = new DonutCancelSubscriptionReasonDto("SEEN_EVERYTHING_NEEDED", 4, "seen_everything_needed");
        SEEN_EVERYTHING_NEEDED = donutCancelSubscriptionReasonDto5;
        DonutCancelSubscriptionReasonDto donutCancelSubscriptionReasonDto6 = new DonutCancelSubscriptionReasonDto("TOO_FEW_MATERIALS", 5, "too_few_materials");
        TOO_FEW_MATERIALS = donutCancelSubscriptionReasonDto6;
        DonutCancelSubscriptionReasonDto donutCancelSubscriptionReasonDto7 = new DonutCancelSubscriptionReasonDto("UNINTERESTING", 6, "uninteresting");
        UNINTERESTING = donutCancelSubscriptionReasonDto7;
        DonutCancelSubscriptionReasonDto[] donutCancelSubscriptionReasonDtoArr = {donutCancelSubscriptionReasonDto, donutCancelSubscriptionReasonDto2, donutCancelSubscriptionReasonDto3, donutCancelSubscriptionReasonDto4, donutCancelSubscriptionReasonDto5, donutCancelSubscriptionReasonDto6, donutCancelSubscriptionReasonDto7};
        $VALUES = donutCancelSubscriptionReasonDtoArr;
        $ENTRIES = new asp(donutCancelSubscriptionReasonDtoArr);
        CREATOR = new a();
    }

    private DonutCancelSubscriptionReasonDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static DonutCancelSubscriptionReasonDto valueOf(String str) {
        return (DonutCancelSubscriptionReasonDto) Enum.valueOf(DonutCancelSubscriptionReasonDto.class, str);
    }

    public static DonutCancelSubscriptionReasonDto[] values() {
        return (DonutCancelSubscriptionReasonDto[]) $VALUES.clone();
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

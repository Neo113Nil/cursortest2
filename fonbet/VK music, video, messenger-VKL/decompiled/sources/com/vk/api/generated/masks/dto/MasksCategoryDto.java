package com.vk.api.generated.masks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MasksCategoryDto.kt */
/* loaded from: classes15.dex */
public final class MasksCategoryDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MasksCategoryDto[] $VALUES;
    public static final Parcelable.Creator<MasksCategoryDto> CREATOR;

    @pmi0("effects")
    public static final MasksCategoryDto EFFECTS;

    @pmi0("interactive")
    public static final MasksCategoryDto INTERACTIVE;

    @pmi0("mask")
    public static final MasksCategoryDto MASK;

    @pmi0("unknown")
    public static final MasksCategoryDto UNKNOWN;
    private final String value;

    /* compiled from: MasksCategoryDto.kt */
    public static final class a implements Parcelable.Creator<MasksCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final MasksCategoryDto createFromParcel(Parcel parcel) {
            return MasksCategoryDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MasksCategoryDto[] newArray(int i) {
            return new MasksCategoryDto[i];
        }
    }

    static {
        MasksCategoryDto masksCategoryDto = new MasksCategoryDto(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, "unknown");
        UNKNOWN = masksCategoryDto;
        MasksCategoryDto masksCategoryDto2 = new MasksCategoryDto("EFFECTS", 1, "effects");
        EFFECTS = masksCategoryDto2;
        MasksCategoryDto masksCategoryDto3 = new MasksCategoryDto("MASK", 2, "mask");
        MASK = masksCategoryDto3;
        MasksCategoryDto masksCategoryDto4 = new MasksCategoryDto("INTERACTIVE", 3, "interactive");
        INTERACTIVE = masksCategoryDto4;
        MasksCategoryDto[] masksCategoryDtoArr = {masksCategoryDto, masksCategoryDto2, masksCategoryDto3, masksCategoryDto4};
        $VALUES = masksCategoryDtoArr;
        $ENTRIES = new asp(masksCategoryDtoArr);
        CREATOR = new a();
    }

    private MasksCategoryDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MasksCategoryDto valueOf(String str) {
        return (MasksCategoryDto) Enum.valueOf(MasksCategoryDto.class, str);
    }

    public static MasksCategoryDto[] values() {
        return (MasksCategoryDto[]) $VALUES.clone();
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

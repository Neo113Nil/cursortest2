package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseSnackbarIconColorDto.kt */
/* loaded from: classes14.dex */
public final class BaseSnackbarIconColorDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BaseSnackbarIconColorDto[] $VALUES;
    public static final Parcelable.Creator<BaseSnackbarIconColorDto> CREATOR;

    @pmi0("icon_negative")
    public static final BaseSnackbarIconColorDto ICON_NEGATIVE;
    private final String value;

    /* compiled from: BaseSnackbarIconColorDto.kt */
    public static final class a implements Parcelable.Creator<BaseSnackbarIconColorDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseSnackbarIconColorDto createFromParcel(Parcel parcel) {
            return BaseSnackbarIconColorDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseSnackbarIconColorDto[] newArray(int i) {
            return new BaseSnackbarIconColorDto[i];
        }
    }

    static {
        BaseSnackbarIconColorDto baseSnackbarIconColorDto = new BaseSnackbarIconColorDto("ICON_NEGATIVE", 0, "icon_negative");
        ICON_NEGATIVE = baseSnackbarIconColorDto;
        BaseSnackbarIconColorDto[] baseSnackbarIconColorDtoArr = {baseSnackbarIconColorDto};
        $VALUES = baseSnackbarIconColorDtoArr;
        $ENTRIES = new asp(baseSnackbarIconColorDtoArr);
        CREATOR = new a();
    }

    private BaseSnackbarIconColorDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static BaseSnackbarIconColorDto valueOf(String str) {
        return (BaseSnackbarIconColorDto) Enum.valueOf(BaseSnackbarIconColorDto.class, str);
    }

    public static BaseSnackbarIconColorDto[] values() {
        return (BaseSnackbarIconColorDto[]) $VALUES.clone();
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

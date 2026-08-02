package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BaseSnackbarIconTypeDto.kt */
/* loaded from: classes14.dex */
public final class BaseSnackbarIconTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BaseSnackbarIconTypeDto[] $VALUES;
    public static final Parcelable.Creator<BaseSnackbarIconTypeDto> CREATOR;

    @pmi0("error_circle_outline")
    public static final BaseSnackbarIconTypeDto ERROR_CIRCLE_OUTLINE;
    private final String value;

    /* compiled from: BaseSnackbarIconTypeDto.kt */
    public static final class a implements Parcelable.Creator<BaseSnackbarIconTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseSnackbarIconTypeDto createFromParcel(Parcel parcel) {
            return BaseSnackbarIconTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseSnackbarIconTypeDto[] newArray(int i) {
            return new BaseSnackbarIconTypeDto[i];
        }
    }

    static {
        BaseSnackbarIconTypeDto baseSnackbarIconTypeDto = new BaseSnackbarIconTypeDto("ERROR_CIRCLE_OUTLINE", 0, "error_circle_outline");
        ERROR_CIRCLE_OUTLINE = baseSnackbarIconTypeDto;
        BaseSnackbarIconTypeDto[] baseSnackbarIconTypeDtoArr = {baseSnackbarIconTypeDto};
        $VALUES = baseSnackbarIconTypeDtoArr;
        $ENTRIES = new asp(baseSnackbarIconTypeDtoArr);
        CREATOR = new a();
    }

    private BaseSnackbarIconTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static BaseSnackbarIconTypeDto valueOf(String str) {
        return (BaseSnackbarIconTypeDto) Enum.valueOf(BaseSnackbarIconTypeDto.class, str);
    }

    public static BaseSnackbarIconTypeDto[] values() {
        return (BaseSnackbarIconTypeDto[]) $VALUES.clone();
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

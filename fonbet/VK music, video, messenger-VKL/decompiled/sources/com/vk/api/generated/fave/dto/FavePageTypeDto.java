package com.vk.api.generated.fave.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FavePageTypeDto.kt */
/* loaded from: classes14.dex */
public final class FavePageTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FavePageTypeDto[] $VALUES;
    public static final Parcelable.Creator<FavePageTypeDto> CREATOR;

    @pmi0("group")
    public static final FavePageTypeDto GROUP;

    @pmi0("hints")
    public static final FavePageTypeDto HINTS;

    @pmi0("user")
    public static final FavePageTypeDto USER;
    private final String value;

    /* compiled from: FavePageTypeDto.kt */
    public static final class a implements Parcelable.Creator<FavePageTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final FavePageTypeDto createFromParcel(Parcel parcel) {
            return FavePageTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FavePageTypeDto[] newArray(int i) {
            return new FavePageTypeDto[i];
        }
    }

    static {
        FavePageTypeDto favePageTypeDto = new FavePageTypeDto("USER", 0, "user");
        USER = favePageTypeDto;
        FavePageTypeDto favePageTypeDto2 = new FavePageTypeDto("GROUP", 1, "group");
        GROUP = favePageTypeDto2;
        FavePageTypeDto favePageTypeDto3 = new FavePageTypeDto("HINTS", 2, "hints");
        HINTS = favePageTypeDto3;
        FavePageTypeDto[] favePageTypeDtoArr = {favePageTypeDto, favePageTypeDto2, favePageTypeDto3};
        $VALUES = favePageTypeDtoArr;
        $ENTRIES = new asp(favePageTypeDtoArr);
        CREATOR = new a();
    }

    private FavePageTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FavePageTypeDto valueOf(String str) {
        return (FavePageTypeDto) Enum.valueOf(FavePageTypeDto.class, str);
    }

    public static FavePageTypeDto[] values() {
        return (FavePageTypeDto[]) $VALUES.clone();
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

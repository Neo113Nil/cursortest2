package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShortVideoMainTabStateDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoMainTabStateDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ShortVideoMainTabStateDto[] $VALUES;
    public static final Parcelable.Creator<ShortVideoMainTabStateDto> CREATOR;

    @pmi0("2")
    public static final ShortVideoMainTabStateDto NOT_ON_TAB;

    @pmi0("0")
    public static final ShortVideoMainTabStateDto NO_ACCESS;

    @pmi0("1")
    public static final ShortVideoMainTabStateDto ON_TAB;
    private final int value;

    /* compiled from: ShortVideoMainTabStateDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoMainTabStateDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoMainTabStateDto createFromParcel(Parcel parcel) {
            return ShortVideoMainTabStateDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoMainTabStateDto[] newArray(int i) {
            return new ShortVideoMainTabStateDto[i];
        }
    }

    static {
        ShortVideoMainTabStateDto shortVideoMainTabStateDto = new ShortVideoMainTabStateDto("NO_ACCESS", 0, 0);
        NO_ACCESS = shortVideoMainTabStateDto;
        ShortVideoMainTabStateDto shortVideoMainTabStateDto2 = new ShortVideoMainTabStateDto("ON_TAB", 1, 1);
        ON_TAB = shortVideoMainTabStateDto2;
        ShortVideoMainTabStateDto shortVideoMainTabStateDto3 = new ShortVideoMainTabStateDto("NOT_ON_TAB", 2, 2);
        NOT_ON_TAB = shortVideoMainTabStateDto3;
        ShortVideoMainTabStateDto[] shortVideoMainTabStateDtoArr = {shortVideoMainTabStateDto, shortVideoMainTabStateDto2, shortVideoMainTabStateDto3};
        $VALUES = shortVideoMainTabStateDtoArr;
        $ENTRIES = new asp(shortVideoMainTabStateDtoArr);
        CREATOR = new a();
    }

    private ShortVideoMainTabStateDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static ShortVideoMainTabStateDto valueOf(String str) {
        return (ShortVideoMainTabStateDto) Enum.valueOf(ShortVideoMainTabStateDto.class, str);
    }

    public static ShortVideoMainTabStateDto[] values() {
        return (ShortVideoMainTabStateDto[]) $VALUES.clone();
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

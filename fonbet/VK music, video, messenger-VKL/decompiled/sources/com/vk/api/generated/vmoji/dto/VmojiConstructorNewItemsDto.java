package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: VmojiConstructorNewItemsDto.kt */
/* loaded from: classes15.dex */
public final class VmojiConstructorNewItemsDto implements Parcelable {
    public static final Parcelable.Creator<VmojiConstructorNewItemsDto> CREATOR = new a();

    @pmi0("counter_color")
    private final CounterColorDto counterColor;

    @pmi0("counter_value")
    private final int counterValue;

    @pmi0("open_params")
    private final VmojiConstructorOpenParamsDto openParams;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VmojiConstructorNewItemsDto.kt */
    public static final class CounterColorDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CounterColorDto[] $VALUES;

        @pmi0("blue")
        public static final CounterColorDto BLUE;
        public static final Parcelable.Creator<CounterColorDto> CREATOR;

        @pmi0("gray")
        public static final CounterColorDto GRAY;

        @pmi0("red")
        public static final CounterColorDto RED;
        private final String value;

        /* compiled from: VmojiConstructorNewItemsDto.kt */
        public static final class a implements Parcelable.Creator<CounterColorDto> {
            @Override // android.os.Parcelable.Creator
            public final CounterColorDto createFromParcel(Parcel parcel) {
                return CounterColorDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CounterColorDto[] newArray(int i) {
                return new CounterColorDto[i];
            }
        }

        static {
            CounterColorDto counterColorDto = new CounterColorDto("BLUE", 0, "blue");
            BLUE = counterColorDto;
            CounterColorDto counterColorDto2 = new CounterColorDto("GRAY", 1, "gray");
            GRAY = counterColorDto2;
            CounterColorDto counterColorDto3 = new CounterColorDto("RED", 2, "red");
            RED = counterColorDto3;
            CounterColorDto[] counterColorDtoArr = {counterColorDto, counterColorDto2, counterColorDto3};
            $VALUES = counterColorDtoArr;
            $ENTRIES = new asp(counterColorDtoArr);
            CREATOR = new a();
        }

        private CounterColorDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static CounterColorDto valueOf(String str) {
            return (CounterColorDto) Enum.valueOf(CounterColorDto.class, str);
        }

        public static CounterColorDto[] values() {
            return (CounterColorDto[]) $VALUES.clone();
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

    /* compiled from: VmojiConstructorNewItemsDto.kt */
    public static final class a implements Parcelable.Creator<VmojiConstructorNewItemsDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiConstructorNewItemsDto createFromParcel(Parcel parcel) {
            return new VmojiConstructorNewItemsDto(parcel.readInt(), CounterColorDto.CREATOR.createFromParcel(parcel), VmojiConstructorOpenParamsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiConstructorNewItemsDto[] newArray(int i) {
            return new VmojiConstructorNewItemsDto[i];
        }
    }

    public VmojiConstructorNewItemsDto(int i, CounterColorDto counterColorDto, VmojiConstructorOpenParamsDto vmojiConstructorOpenParamsDto) {
        this.counterValue = i;
        this.counterColor = counterColorDto;
        this.openParams = vmojiConstructorOpenParamsDto;
    }

    public final CounterColorDto d() {
        return this.counterColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.counterValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiConstructorNewItemsDto)) {
            return false;
        }
        VmojiConstructorNewItemsDto vmojiConstructorNewItemsDto = (VmojiConstructorNewItemsDto) obj;
        return this.counterValue == vmojiConstructorNewItemsDto.counterValue && this.counterColor == vmojiConstructorNewItemsDto.counterColor && epx.f(this.openParams, vmojiConstructorNewItemsDto.openParams);
    }

    public final VmojiConstructorOpenParamsDto f() {
        return this.openParams;
    }

    public final int hashCode() {
        return this.openParams.hashCode() + ((this.counterColor.hashCode() + (Integer.hashCode(this.counterValue) * 31)) * 31);
    }

    public final String toString() {
        return "VmojiConstructorNewItemsDto(counterValue=" + this.counterValue + ", counterColor=" + this.counterColor + ", openParams=" + this.openParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.counterValue);
        this.counterColor.writeToParcel(parcel, i);
        this.openParams.writeToParcel(parcel, i);
    }
}

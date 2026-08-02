package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AtumVkuiCounterPropsDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiCounterPropsDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiCounterPropsDto> CREATOR = new a();

    @pmi0("appearance")
    private final AtumVkuiAppearanceDto appearance;

    @pmi0("count")
    private final int count;

    @pmi0(X3.a.t)
    private final ModeDto mode;

    @pmi0("size")
    private final SizeDto size;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumVkuiCounterPropsDto.kt */
    public static final class ModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ModeDto[] $VALUES;

        @pmi0("1")
        public static final ModeDto CONTRAST;
        public static final Parcelable.Creator<ModeDto> CREATOR;

        @pmi0("0")
        public static final ModeDto PRIMARY;

        @pmi0("2")
        public static final ModeDto TERTIARY;
        private final int value;

        /* compiled from: AtumVkuiCounterPropsDto.kt */
        public static final class a implements Parcelable.Creator<ModeDto> {
            @Override // android.os.Parcelable.Creator
            public final ModeDto createFromParcel(Parcel parcel) {
                return ModeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ModeDto[] newArray(int i) {
                return new ModeDto[i];
            }
        }

        static {
            ModeDto modeDto = new ModeDto("PRIMARY", 0, 0);
            PRIMARY = modeDto;
            ModeDto modeDto2 = new ModeDto("CONTRAST", 1, 1);
            CONTRAST = modeDto2;
            ModeDto modeDto3 = new ModeDto("TERTIARY", 2, 2);
            TERTIARY = modeDto3;
            ModeDto[] modeDtoArr = {modeDto, modeDto2, modeDto3};
            $VALUES = modeDtoArr;
            $ENTRIES = new asp(modeDtoArr);
            CREATOR = new a();
        }

        private ModeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static ModeDto valueOf(String str) {
            return (ModeDto) Enum.valueOf(ModeDto.class, str);
        }

        public static ModeDto[] values() {
            return (ModeDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumVkuiCounterPropsDto.kt */
    public static final class SizeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SizeDto[] $VALUES;
        public static final Parcelable.Creator<SizeDto> CREATOR;

        @pmi0("1")
        public static final SizeDto MEDIUM;

        @pmi0("0")
        public static final SizeDto SMALL;
        private final int value;

        /* compiled from: AtumVkuiCounterPropsDto.kt */
        public static final class a implements Parcelable.Creator<SizeDto> {
            @Override // android.os.Parcelable.Creator
            public final SizeDto createFromParcel(Parcel parcel) {
                return SizeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SizeDto[] newArray(int i) {
                return new SizeDto[i];
            }
        }

        static {
            SizeDto sizeDto = new SizeDto("SMALL", 0, 0);
            SMALL = sizeDto;
            SizeDto sizeDto2 = new SizeDto("MEDIUM", 1, 1);
            MEDIUM = sizeDto2;
            SizeDto[] sizeDtoArr = {sizeDto, sizeDto2};
            $VALUES = sizeDtoArr;
            $ENTRIES = new asp(sizeDtoArr);
            CREATOR = new a();
        }

        private SizeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static SizeDto valueOf(String str) {
            return (SizeDto) Enum.valueOf(SizeDto.class, str);
        }

        public static SizeDto[] values() {
            return (SizeDto[]) $VALUES.clone();
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

    /* compiled from: AtumVkuiCounterPropsDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiCounterPropsDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiCounterPropsDto createFromParcel(Parcel parcel) {
            return new AtumVkuiCounterPropsDto(parcel.readInt(), AtumVkuiAppearanceDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SizeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ModeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiCounterPropsDto[] newArray(int i) {
            return new AtumVkuiCounterPropsDto[i];
        }
    }

    public AtumVkuiCounterPropsDto(int i, AtumVkuiAppearanceDto atumVkuiAppearanceDto, SizeDto sizeDto, ModeDto modeDto) {
        this.count = i;
        this.appearance = atumVkuiAppearanceDto;
        this.size = sizeDto;
        this.mode = modeDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiCounterPropsDto)) {
            return false;
        }
        AtumVkuiCounterPropsDto atumVkuiCounterPropsDto = (AtumVkuiCounterPropsDto) obj;
        return this.count == atumVkuiCounterPropsDto.count && this.appearance == atumVkuiCounterPropsDto.appearance && this.size == atumVkuiCounterPropsDto.size && this.mode == atumVkuiCounterPropsDto.mode;
    }

    public final int hashCode() {
        int hashCode = (this.appearance.hashCode() + (Integer.hashCode(this.count) * 31)) * 31;
        SizeDto sizeDto = this.size;
        int hashCode2 = (hashCode + (sizeDto == null ? 0 : sizeDto.hashCode())) * 31;
        ModeDto modeDto = this.mode;
        return hashCode2 + (modeDto != null ? modeDto.hashCode() : 0);
    }

    public final String toString() {
        return "AtumVkuiCounterPropsDto(count=" + this.count + ", appearance=" + this.appearance + ", size=" + this.size + ", mode=" + this.mode + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        this.appearance.writeToParcel(parcel, i);
        SizeDto sizeDto = this.size;
        if (sizeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sizeDto.writeToParcel(parcel, i);
        }
        ModeDto modeDto = this.mode;
        if (modeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            modeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AtumVkuiCounterPropsDto(int i, AtumVkuiAppearanceDto atumVkuiAppearanceDto, SizeDto sizeDto, ModeDto modeDto, int i2, zcl zclVar) {
        this(i, atumVkuiAppearanceDto, (i2 & 4) != 0 ? null : sizeDto, (i2 & 8) != 0 ? null : modeDto);
    }
}

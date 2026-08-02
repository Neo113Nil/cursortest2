package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Ad;
import io.reactivex.rxjava3.subjects.b;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.so;
import xsna.zcl;
import xsna.zrp;

/* compiled from: WallWallpostAttachmentsMetaDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostAttachmentsMetaDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostAttachmentsMetaDto> CREATOR = new a();

    @pmi0("carousel_layout")
    private final CarouselLayoutDto carouselLayout;

    @pmi0("carousel_ratio")
    private final Float carouselRatio;

    @pmi0("primary_mode")
    private final PrimaryModeDto primaryMode;

    @pmi0("ratio")
    private final Float ratio;

    @pmi0("selected_index")
    private final Integer selectedIndex;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallWallpostAttachmentsMetaDto.kt */
    public static final class CarouselLayoutDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CarouselLayoutDto[] $VALUES;
        public static final Parcelable.Creator<CarouselLayoutDto> CREATOR;

        @pmi0("rounded")
        public static final CarouselLayoutDto ROUNDED;

        @pmi0("wide")
        public static final CarouselLayoutDto WIDE;
        private final String value;

        /* compiled from: WallWallpostAttachmentsMetaDto.kt */
        public static final class a implements Parcelable.Creator<CarouselLayoutDto> {
            @Override // android.os.Parcelable.Creator
            public final CarouselLayoutDto createFromParcel(Parcel parcel) {
                return CarouselLayoutDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CarouselLayoutDto[] newArray(int i) {
                return new CarouselLayoutDto[i];
            }
        }

        static {
            CarouselLayoutDto carouselLayoutDto = new CarouselLayoutDto("ROUNDED", 0, "rounded");
            ROUNDED = carouselLayoutDto;
            CarouselLayoutDto carouselLayoutDto2 = new CarouselLayoutDto("WIDE", 1, "wide");
            WIDE = carouselLayoutDto2;
            CarouselLayoutDto[] carouselLayoutDtoArr = {carouselLayoutDto, carouselLayoutDto2};
            $VALUES = carouselLayoutDtoArr;
            $ENTRIES = new asp(carouselLayoutDtoArr);
            CREATOR = new a();
        }

        private CarouselLayoutDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static CarouselLayoutDto valueOf(String str) {
            return (CarouselLayoutDto) Enum.valueOf(CarouselLayoutDto.class, str);
        }

        public static CarouselLayoutDto[] values() {
            return (CarouselLayoutDto[]) $VALUES.clone();
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
    /* compiled from: WallWallpostAttachmentsMetaDto.kt */
    public static final class PrimaryModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PrimaryModeDto[] $VALUES;

        @pmi0("carousel")
        public static final PrimaryModeDto CAROUSEL;
        public static final Parcelable.Creator<PrimaryModeDto> CREATOR;

        @pmi0("grid")
        public static final PrimaryModeDto GRID;

        @pmi0(Ad.d)
        public static final PrimaryModeDto SINGLE;
        private final String value;

        /* compiled from: WallWallpostAttachmentsMetaDto.kt */
        public static final class a implements Parcelable.Creator<PrimaryModeDto> {
            @Override // android.os.Parcelable.Creator
            public final PrimaryModeDto createFromParcel(Parcel parcel) {
                return PrimaryModeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PrimaryModeDto[] newArray(int i) {
                return new PrimaryModeDto[i];
            }
        }

        static {
            PrimaryModeDto primaryModeDto = new PrimaryModeDto("SINGLE", 0, Ad.d);
            SINGLE = primaryModeDto;
            PrimaryModeDto primaryModeDto2 = new PrimaryModeDto(SignalingProtocol.KEY_GRID, 1, "grid");
            GRID = primaryModeDto2;
            PrimaryModeDto primaryModeDto3 = new PrimaryModeDto("CAROUSEL", 2, "carousel");
            CAROUSEL = primaryModeDto3;
            PrimaryModeDto[] primaryModeDtoArr = {primaryModeDto, primaryModeDto2, primaryModeDto3};
            $VALUES = primaryModeDtoArr;
            $ENTRIES = new asp(primaryModeDtoArr);
            CREATOR = new a();
        }

        private PrimaryModeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static PrimaryModeDto valueOf(String str) {
            return (PrimaryModeDto) Enum.valueOf(PrimaryModeDto.class, str);
        }

        public static PrimaryModeDto[] values() {
            return (PrimaryModeDto[]) $VALUES.clone();
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

    /* compiled from: WallWallpostAttachmentsMetaDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostAttachmentsMetaDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentsMetaDto createFromParcel(Parcel parcel) {
            return new WallWallpostAttachmentsMetaDto(parcel.readInt() == 0 ? null : PrimaryModeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : CarouselLayoutDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentsMetaDto[] newArray(int i) {
            return new WallWallpostAttachmentsMetaDto[i];
        }
    }

    public WallWallpostAttachmentsMetaDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final CarouselLayoutDto d() {
        return this.carouselLayout;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Float e() {
        return this.carouselRatio;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallWallpostAttachmentsMetaDto)) {
            return false;
        }
        WallWallpostAttachmentsMetaDto wallWallpostAttachmentsMetaDto = (WallWallpostAttachmentsMetaDto) obj;
        return this.primaryMode == wallWallpostAttachmentsMetaDto.primaryMode && epx.f(this.carouselRatio, wallWallpostAttachmentsMetaDto.carouselRatio) && this.carouselLayout == wallWallpostAttachmentsMetaDto.carouselLayout && epx.f(this.selectedIndex, wallWallpostAttachmentsMetaDto.selectedIndex) && epx.f(this.ratio, wallWallpostAttachmentsMetaDto.ratio);
    }

    public final PrimaryModeDto f() {
        return this.primaryMode;
    }

    public final int hashCode() {
        PrimaryModeDto primaryModeDto = this.primaryMode;
        int hashCode = (primaryModeDto == null ? 0 : primaryModeDto.hashCode()) * 31;
        Float f = this.carouselRatio;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        CarouselLayoutDto carouselLayoutDto = this.carouselLayout;
        int hashCode3 = (hashCode2 + (carouselLayoutDto == null ? 0 : carouselLayoutDto.hashCode())) * 31;
        Integer num = this.selectedIndex;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Float f2 = this.ratio;
        return hashCode4 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallWallpostAttachmentsMetaDto(primaryMode=");
        sb.append(this.primaryMode);
        sb.append(", carouselRatio=");
        sb.append(this.carouselRatio);
        sb.append(", carouselLayout=");
        sb.append(this.carouselLayout);
        sb.append(", selectedIndex=");
        sb.append(this.selectedIndex);
        sb.append(", ratio=");
        return so.b(sb, this.ratio, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PrimaryModeDto primaryModeDto = this.primaryMode;
        if (primaryModeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            primaryModeDto.writeToParcel(parcel, i);
        }
        Float f = this.carouselRatio;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        CarouselLayoutDto carouselLayoutDto = this.carouselLayout;
        if (carouselLayoutDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            carouselLayoutDto.writeToParcel(parcel, i);
        }
        Integer num = this.selectedIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Float f2 = this.ratio;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
    }

    public WallWallpostAttachmentsMetaDto(PrimaryModeDto primaryModeDto, Float f, CarouselLayoutDto carouselLayoutDto, Integer num, Float f2) {
        this.primaryMode = primaryModeDto;
        this.carouselRatio = f;
        this.carouselLayout = carouselLayoutDto;
        this.selectedIndex = num;
        this.ratio = f2;
    }

    public /* synthetic */ WallWallpostAttachmentsMetaDto(PrimaryModeDto primaryModeDto, Float f, CarouselLayoutDto carouselLayoutDto, Integer num, Float f2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : primaryModeDto, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : carouselLayoutDto, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : f2);
    }
}

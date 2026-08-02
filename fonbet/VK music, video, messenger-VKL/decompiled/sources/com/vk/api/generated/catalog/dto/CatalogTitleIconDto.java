package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogTitleIconDto.kt */
/* loaded from: classes14.dex */
public final class CatalogTitleIconDto implements Parcelable {
    public static final Parcelable.Creator<CatalogTitleIconDto> CREATOR = new a();

    @pmi0(X3.i.L)
    private final PositionDto position;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogTitleIconDto.kt */
    public static final class PositionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PositionDto[] $VALUES;

        @pmi0("after")
        public static final PositionDto AFTER;

        @pmi0("before")
        public static final PositionDto BEFORE;
        public static final Parcelable.Creator<PositionDto> CREATOR;
        private final String value;

        /* compiled from: CatalogTitleIconDto.kt */
        public static final class a implements Parcelable.Creator<PositionDto> {
            @Override // android.os.Parcelable.Creator
            public final PositionDto createFromParcel(Parcel parcel) {
                return PositionDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PositionDto[] newArray(int i) {
                return new PositionDto[i];
            }
        }

        static {
            PositionDto positionDto = new PositionDto("BEFORE", 0, "before");
            BEFORE = positionDto;
            PositionDto positionDto2 = new PositionDto("AFTER", 1, "after");
            AFTER = positionDto2;
            PositionDto[] positionDtoArr = {positionDto, positionDto2};
            $VALUES = positionDtoArr;
            $ENTRIES = new asp(positionDtoArr);
            CREATOR = new a();
        }

        private PositionDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static PositionDto valueOf(String str) {
            return (PositionDto) Enum.valueOf(PositionDto.class, str);
        }

        public static PositionDto[] values() {
            return (PositionDto[]) $VALUES.clone();
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

    /* compiled from: CatalogTitleIconDto.kt */
    public static final class a implements Parcelable.Creator<CatalogTitleIconDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogTitleIconDto createFromParcel(Parcel parcel) {
            return new CatalogTitleIconDto(parcel.readInt() == 0 ? null : PositionDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogTitleIconDto[] newArray(int i) {
            return new CatalogTitleIconDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CatalogTitleIconDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogTitleIconDto)) {
            return false;
        }
        CatalogTitleIconDto catalogTitleIconDto = (CatalogTitleIconDto) obj;
        return this.position == catalogTitleIconDto.position && epx.f(this.url, catalogTitleIconDto.url);
    }

    public final int hashCode() {
        PositionDto positionDto = this.position;
        int hashCode = (positionDto == null ? 0 : positionDto.hashCode()) * 31;
        String str = this.url;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogTitleIconDto(position=");
        sb.append(this.position);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PositionDto positionDto = this.position;
        if (positionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            positionDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.url);
    }

    public CatalogTitleIconDto(PositionDto positionDto, String str) {
        this.position = positionDto;
        this.url = str;
    }

    public /* synthetic */ CatalogTitleIconDto(PositionDto positionDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : positionDto, (i & 2) != 0 ? null : str);
    }
}

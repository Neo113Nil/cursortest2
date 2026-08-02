package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.adapter.internal.CommonCode;
import io.reactivex.rxjava3.subjects.b;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketSearchSpellCheckResultDto.kt */
/* loaded from: classes15.dex */
public final class MarketSearchSpellCheckResultDto implements Parcelable {
    public static final Parcelable.Creator<MarketSearchSpellCheckResultDto> CREATOR = new a();

    @pmi0("confidence")
    private final Float confidence;

    @pmi0("fixed")
    private final MarketSearchSpellCheckQueryDto fixed;

    @pmi0("original")
    private final MarketSearchSpellCheckQueryDto original;

    @pmi0(CommonCode.MapKey.HAS_RESOLUTION)
    private final ResolutionDto resolution;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketSearchSpellCheckResultDto.kt */
    public static final class ResolutionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ResolutionDto[] $VALUES;

        @pmi0("0")
        public static final ResolutionDto CORRECT;
        public static final Parcelable.Creator<ResolutionDto> CREATOR;

        @pmi0("2")
        public static final ResolutionDto INCORRECT;

        @pmi0("1")
        public static final ResolutionDto PROBABLY_INCORRECT;
        private final int value;

        /* compiled from: MarketSearchSpellCheckResultDto.kt */
        public static final class a implements Parcelable.Creator<ResolutionDto> {
            @Override // android.os.Parcelable.Creator
            public final ResolutionDto createFromParcel(Parcel parcel) {
                return ResolutionDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ResolutionDto[] newArray(int i) {
                return new ResolutionDto[i];
            }
        }

        static {
            ResolutionDto resolutionDto = new ResolutionDto("CORRECT", 0, 0);
            CORRECT = resolutionDto;
            ResolutionDto resolutionDto2 = new ResolutionDto("PROBABLY_INCORRECT", 1, 1);
            PROBABLY_INCORRECT = resolutionDto2;
            ResolutionDto resolutionDto3 = new ResolutionDto("INCORRECT", 2, 2);
            INCORRECT = resolutionDto3;
            ResolutionDto[] resolutionDtoArr = {resolutionDto, resolutionDto2, resolutionDto3};
            $VALUES = resolutionDtoArr;
            $ENTRIES = new asp(resolutionDtoArr);
            CREATOR = new a();
        }

        private ResolutionDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static ResolutionDto valueOf(String str) {
            return (ResolutionDto) Enum.valueOf(ResolutionDto.class, str);
        }

        public static ResolutionDto[] values() {
            return (ResolutionDto[]) $VALUES.clone();
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

    /* compiled from: MarketSearchSpellCheckResultDto.kt */
    public static final class a implements Parcelable.Creator<MarketSearchSpellCheckResultDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSearchSpellCheckResultDto createFromParcel(Parcel parcel) {
            return new MarketSearchSpellCheckResultDto(ResolutionDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : MarketSearchSpellCheckQueryDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MarketSearchSpellCheckQueryDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSearchSpellCheckResultDto[] newArray(int i) {
            return new MarketSearchSpellCheckResultDto[i];
        }
    }

    public MarketSearchSpellCheckResultDto(ResolutionDto resolutionDto, Float f, MarketSearchSpellCheckQueryDto marketSearchSpellCheckQueryDto, MarketSearchSpellCheckQueryDto marketSearchSpellCheckQueryDto2) {
        this.resolution = resolutionDto;
        this.confidence = f;
        this.original = marketSearchSpellCheckQueryDto;
        this.fixed = marketSearchSpellCheckQueryDto2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketSearchSpellCheckResultDto)) {
            return false;
        }
        MarketSearchSpellCheckResultDto marketSearchSpellCheckResultDto = (MarketSearchSpellCheckResultDto) obj;
        return this.resolution == marketSearchSpellCheckResultDto.resolution && epx.f(this.confidence, marketSearchSpellCheckResultDto.confidence) && epx.f(this.original, marketSearchSpellCheckResultDto.original) && epx.f(this.fixed, marketSearchSpellCheckResultDto.fixed);
    }

    public final int hashCode() {
        int hashCode = this.resolution.hashCode() * 31;
        Float f = this.confidence;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        MarketSearchSpellCheckQueryDto marketSearchSpellCheckQueryDto = this.original;
        int hashCode3 = (hashCode2 + (marketSearchSpellCheckQueryDto == null ? 0 : marketSearchSpellCheckQueryDto.hashCode())) * 31;
        MarketSearchSpellCheckQueryDto marketSearchSpellCheckQueryDto2 = this.fixed;
        return hashCode3 + (marketSearchSpellCheckQueryDto2 != null ? marketSearchSpellCheckQueryDto2.hashCode() : 0);
    }

    public final String toString() {
        return "MarketSearchSpellCheckResultDto(resolution=" + this.resolution + ", confidence=" + this.confidence + ", original=" + this.original + ", fixed=" + this.fixed + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.resolution.writeToParcel(parcel, i);
        Float f = this.confidence;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        MarketSearchSpellCheckQueryDto marketSearchSpellCheckQueryDto = this.original;
        if (marketSearchSpellCheckQueryDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSearchSpellCheckQueryDto.writeToParcel(parcel, i);
        }
        MarketSearchSpellCheckQueryDto marketSearchSpellCheckQueryDto2 = this.fixed;
        if (marketSearchSpellCheckQueryDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketSearchSpellCheckQueryDto2.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketSearchSpellCheckResultDto(ResolutionDto resolutionDto, Float f, MarketSearchSpellCheckQueryDto marketSearchSpellCheckQueryDto, MarketSearchSpellCheckQueryDto marketSearchSpellCheckQueryDto2, int i, zcl zclVar) {
        this(resolutionDto, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : marketSearchSpellCheckQueryDto, (i & 8) != 0 ? null : marketSearchSpellCheckQueryDto2);
    }
}

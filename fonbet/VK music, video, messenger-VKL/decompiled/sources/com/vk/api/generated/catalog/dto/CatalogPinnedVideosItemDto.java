package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.jsonwebtoken.Claims;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CatalogPinnedVideosItemDto.kt */
/* loaded from: classes14.dex */
public final class CatalogPinnedVideosItemDto implements Parcelable {
    public static final Parcelable.Creator<CatalogPinnedVideosItemDto> CREATOR = new a();

    @pmi0("pin_type")
    private final PinTypeDto pinType;

    @pmi0("video_raw_id")
    private final String videoRawId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogPinnedVideosItemDto.kt */
    public static final class PinTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PinTypeDto[] $VALUES;

        @pmi0("all")
        public static final PinTypeDto ALL;

        @pmi0("clip")
        public static final PinTypeDto CLIP;
        public static final Parcelable.Creator<PinTypeDto> CREATOR;

        @pmi0("non_sub")
        public static final PinTypeDto NON_SUB;

        @pmi0(Claims.SUBJECT)
        public static final PinTypeDto SUB;
        private final String value;

        /* compiled from: CatalogPinnedVideosItemDto.kt */
        public static final class a implements Parcelable.Creator<PinTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final PinTypeDto createFromParcel(Parcel parcel) {
                return PinTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PinTypeDto[] newArray(int i) {
                return new PinTypeDto[i];
            }
        }

        static {
            PinTypeDto pinTypeDto = new PinTypeDto("ALL", 0, "all");
            ALL = pinTypeDto;
            PinTypeDto pinTypeDto2 = new PinTypeDto("SUB", 1, Claims.SUBJECT);
            SUB = pinTypeDto2;
            PinTypeDto pinTypeDto3 = new PinTypeDto("NON_SUB", 2, "non_sub");
            NON_SUB = pinTypeDto3;
            PinTypeDto pinTypeDto4 = new PinTypeDto("CLIP", 3, "clip");
            CLIP = pinTypeDto4;
            PinTypeDto[] pinTypeDtoArr = {pinTypeDto, pinTypeDto2, pinTypeDto3, pinTypeDto4};
            $VALUES = pinTypeDtoArr;
            $ENTRIES = new asp(pinTypeDtoArr);
            CREATOR = new a();
        }

        private PinTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static PinTypeDto valueOf(String str) {
            return (PinTypeDto) Enum.valueOf(PinTypeDto.class, str);
        }

        public static PinTypeDto[] values() {
            return (PinTypeDto[]) $VALUES.clone();
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

    /* compiled from: CatalogPinnedVideosItemDto.kt */
    public static final class a implements Parcelable.Creator<CatalogPinnedVideosItemDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogPinnedVideosItemDto createFromParcel(Parcel parcel) {
            return new CatalogPinnedVideosItemDto(parcel.readString(), PinTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogPinnedVideosItemDto[] newArray(int i) {
            return new CatalogPinnedVideosItemDto[i];
        }
    }

    public CatalogPinnedVideosItemDto(String str, PinTypeDto pinTypeDto) {
        this.videoRawId = str;
        this.pinType = pinTypeDto;
    }

    public final PinTypeDto d() {
        return this.pinType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.videoRawId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogPinnedVideosItemDto)) {
            return false;
        }
        CatalogPinnedVideosItemDto catalogPinnedVideosItemDto = (CatalogPinnedVideosItemDto) obj;
        return epx.f(this.videoRawId, catalogPinnedVideosItemDto.videoRawId) && this.pinType == catalogPinnedVideosItemDto.pinType;
    }

    public final int hashCode() {
        return this.pinType.hashCode() + (this.videoRawId.hashCode() * 31);
    }

    public final String toString() {
        return "CatalogPinnedVideosItemDto(videoRawId=" + this.videoRawId + ", pinType=" + this.pinType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoRawId);
        this.pinType.writeToParcel(parcel, i);
    }
}

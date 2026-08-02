package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AtumAnyLayerDto.kt */
/* loaded from: classes14.dex */
public final class AtumAnyLayerDto implements Parcelable {
    public static final Parcelable.Creator<AtumAnyLayerDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_KIND)
    private final KindDto kind;

    @pmi0("obj_id")
    private final AtumIdentityPropsDto objId;

    @pmi0("transform")
    private final AtumAnyLayerTransformStateDto transform;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumAnyLayerDto.kt */
    public static final class KindDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ KindDto[] $VALUES;

        @pmi0("AnyLayer")
        public static final KindDto ANYLAYER;
        public static final Parcelable.Creator<KindDto> CREATOR;
        private final String value;

        /* compiled from: AtumAnyLayerDto.kt */
        public static final class a implements Parcelable.Creator<KindDto> {
            @Override // android.os.Parcelable.Creator
            public final KindDto createFromParcel(Parcel parcel) {
                return KindDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final KindDto[] newArray(int i) {
                return new KindDto[i];
            }
        }

        static {
            KindDto kindDto = new KindDto("ANYLAYER", 0, "AnyLayer");
            ANYLAYER = kindDto;
            KindDto[] kindDtoArr = {kindDto};
            $VALUES = kindDtoArr;
            $ENTRIES = new asp(kindDtoArr);
            CREATOR = new a();
        }

        private KindDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static KindDto valueOf(String str) {
            return (KindDto) Enum.valueOf(KindDto.class, str);
        }

        public static KindDto[] values() {
            return (KindDto[]) $VALUES.clone();
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

    /* compiled from: AtumAnyLayerDto.kt */
    public static final class a implements Parcelable.Creator<AtumAnyLayerDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumAnyLayerDto createFromParcel(Parcel parcel) {
            return new AtumAnyLayerDto(KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumIdentityPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumAnyLayerTransformStateDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumAnyLayerDto[] newArray(int i) {
            return new AtumAnyLayerDto[i];
        }
    }

    public AtumAnyLayerDto(KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, AtumAnyLayerTransformStateDto atumAnyLayerTransformStateDto) {
        this.kind = kindDto;
        this.objId = atumIdentityPropsDto;
        this.transform = atumAnyLayerTransformStateDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumAnyLayerDto)) {
            return false;
        }
        AtumAnyLayerDto atumAnyLayerDto = (AtumAnyLayerDto) obj;
        return this.kind == atumAnyLayerDto.kind && epx.f(this.objId, atumAnyLayerDto.objId) && epx.f(this.transform, atumAnyLayerDto.transform);
    }

    public final int hashCode() {
        int hashCode = this.kind.hashCode() * 31;
        AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
        int hashCode2 = (hashCode + (atumIdentityPropsDto == null ? 0 : atumIdentityPropsDto.hashCode())) * 31;
        AtumAnyLayerTransformStateDto atumAnyLayerTransformStateDto = this.transform;
        return hashCode2 + (atumAnyLayerTransformStateDto != null ? atumAnyLayerTransformStateDto.hashCode() : 0);
    }

    public final String toString() {
        return "AtumAnyLayerDto(kind=" + this.kind + ", objId=" + this.objId + ", transform=" + this.transform + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.kind.writeToParcel(parcel, i);
        AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
        if (atumIdentityPropsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumIdentityPropsDto.writeToParcel(parcel, i);
        }
        AtumAnyLayerTransformStateDto atumAnyLayerTransformStateDto = this.transform;
        if (atumAnyLayerTransformStateDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumAnyLayerTransformStateDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AtumAnyLayerDto(KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, AtumAnyLayerTransformStateDto atumAnyLayerTransformStateDto, int i, zcl zclVar) {
        this(kindDto, (i & 2) != 0 ? null : atumIdentityPropsDto, (i & 4) != 0 ? null : atumAnyLayerTransformStateDto);
    }
}

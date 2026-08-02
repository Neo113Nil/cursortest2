package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AtumLayerDto.kt */
/* loaded from: classes14.dex */
public final class AtumLayerDto implements Parcelable {
    public static final Parcelable.Creator<AtumLayerDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_KIND)
    private final KindDto kind;

    @pmi0("layer_props")
    private final AtumLayerPropsDto layerProps;

    @pmi0("layer_repo_refs")
    private final AtumLayerRepoRefsDto layerRepoRefs;

    @pmi0("obj_id")
    private final AtumIdentityPropsDto objId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumLayerDto.kt */
    public static final class KindDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ KindDto[] $VALUES;
        public static final Parcelable.Creator<KindDto> CREATOR;

        @pmi0("Layer")
        public static final KindDto LAYER;
        private final String value;

        /* compiled from: AtumLayerDto.kt */
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
            KindDto kindDto = new KindDto("LAYER", 0, "Layer");
            LAYER = kindDto;
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

    /* compiled from: AtumLayerDto.kt */
    public static final class a implements Parcelable.Creator<AtumLayerDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumLayerDto createFromParcel(Parcel parcel) {
            return new AtumLayerDto(KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumIdentityPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumLayerPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumLayerRepoRefsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumLayerDto[] newArray(int i) {
            return new AtumLayerDto[i];
        }
    }

    public AtumLayerDto(KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, AtumLayerPropsDto atumLayerPropsDto, AtumLayerRepoRefsDto atumLayerRepoRefsDto) {
        this.kind = kindDto;
        this.objId = atumIdentityPropsDto;
        this.layerProps = atumLayerPropsDto;
        this.layerRepoRefs = atumLayerRepoRefsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumLayerDto)) {
            return false;
        }
        AtumLayerDto atumLayerDto = (AtumLayerDto) obj;
        return this.kind == atumLayerDto.kind && epx.f(this.objId, atumLayerDto.objId) && epx.f(this.layerProps, atumLayerDto.layerProps) && epx.f(this.layerRepoRefs, atumLayerDto.layerRepoRefs);
    }

    public final int hashCode() {
        int hashCode = this.kind.hashCode() * 31;
        AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
        int hashCode2 = (hashCode + (atumIdentityPropsDto == null ? 0 : atumIdentityPropsDto.hashCode())) * 31;
        AtumLayerPropsDto atumLayerPropsDto = this.layerProps;
        int hashCode3 = (hashCode2 + (atumLayerPropsDto == null ? 0 : atumLayerPropsDto.hashCode())) * 31;
        AtumLayerRepoRefsDto atumLayerRepoRefsDto = this.layerRepoRefs;
        return hashCode3 + (atumLayerRepoRefsDto != null ? atumLayerRepoRefsDto.hashCode() : 0);
    }

    public final String toString() {
        return "AtumLayerDto(kind=" + this.kind + ", objId=" + this.objId + ", layerProps=" + this.layerProps + ", layerRepoRefs=" + this.layerRepoRefs + ')';
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
        AtumLayerPropsDto atumLayerPropsDto = this.layerProps;
        if (atumLayerPropsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumLayerPropsDto.writeToParcel(parcel, i);
        }
        AtumLayerRepoRefsDto atumLayerRepoRefsDto = this.layerRepoRefs;
        if (atumLayerRepoRefsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumLayerRepoRefsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AtumLayerDto(KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, AtumLayerPropsDto atumLayerPropsDto, AtumLayerRepoRefsDto atumLayerRepoRefsDto, int i, zcl zclVar) {
        this(kindDto, (i & 2) != 0 ? null : atumIdentityPropsDto, (i & 4) != 0 ? null : atumLayerPropsDto, (i & 8) != 0 ? null : atumLayerRepoRefsDto);
    }
}

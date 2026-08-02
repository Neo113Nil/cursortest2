package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.yoga.dto.YogaLayoutPropsDto;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.epx;
import xsna.er;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AtumYogaLayoutDto.kt */
/* loaded from: classes14.dex */
public final class AtumYogaLayoutDto implements Parcelable {
    public static final Parcelable.Creator<AtumYogaLayoutDto> CREATOR = new a();

    @pmi0(RTCStatsConstants.KEY_KIND)
    private final KindDto kind;

    @pmi0("obj_id")
    private final AtumIdentityPropsDto objId;

    @pmi0("yoga_layout_props")
    private final YogaLayoutPropsDto yogaLayoutProps;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumYogaLayoutDto.kt */
    public static final class KindDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ KindDto[] $VALUES;
        public static final Parcelable.Creator<KindDto> CREATOR;

        @pmi0("YogaLayout")
        public static final KindDto YOGALAYOUT;
        private final String value;

        /* compiled from: AtumYogaLayoutDto.kt */
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
            KindDto kindDto = new KindDto("YOGALAYOUT", 0, "YogaLayout");
            YOGALAYOUT = kindDto;
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

    /* compiled from: AtumYogaLayoutDto.kt */
    public static final class a implements Parcelable.Creator<AtumYogaLayoutDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumYogaLayoutDto createFromParcel(Parcel parcel) {
            return new AtumYogaLayoutDto(KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : YogaLayoutPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumIdentityPropsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumYogaLayoutDto[] newArray(int i) {
            return new AtumYogaLayoutDto[i];
        }
    }

    public AtumYogaLayoutDto(KindDto kindDto, YogaLayoutPropsDto yogaLayoutPropsDto, AtumIdentityPropsDto atumIdentityPropsDto) {
        this.kind = kindDto;
        this.yogaLayoutProps = yogaLayoutPropsDto;
        this.objId = atumIdentityPropsDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumYogaLayoutDto)) {
            return false;
        }
        AtumYogaLayoutDto atumYogaLayoutDto = (AtumYogaLayoutDto) obj;
        return this.kind == atumYogaLayoutDto.kind && epx.f(this.yogaLayoutProps, atumYogaLayoutDto.yogaLayoutProps) && epx.f(this.objId, atumYogaLayoutDto.objId);
    }

    public final int hashCode() {
        int hashCode = this.kind.hashCode() * 31;
        YogaLayoutPropsDto yogaLayoutPropsDto = this.yogaLayoutProps;
        int hashCode2 = (hashCode + (yogaLayoutPropsDto == null ? 0 : yogaLayoutPropsDto.hashCode())) * 31;
        AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
        return hashCode2 + (atumIdentityPropsDto != null ? atumIdentityPropsDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumYogaLayoutDto(kind=");
        sb.append(this.kind);
        sb.append(", yogaLayoutProps=");
        sb.append(this.yogaLayoutProps);
        sb.append(", objId=");
        return er.c(sb, this.objId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.kind.writeToParcel(parcel, i);
        YogaLayoutPropsDto yogaLayoutPropsDto = this.yogaLayoutProps;
        if (yogaLayoutPropsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yogaLayoutPropsDto.writeToParcel(parcel, i);
        }
        AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
        if (atumIdentityPropsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            atumIdentityPropsDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AtumYogaLayoutDto(KindDto kindDto, YogaLayoutPropsDto yogaLayoutPropsDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
        this(kindDto, (i & 2) != 0 ? null : yogaLayoutPropsDto, (i & 4) != 0 ? null : atumIdentityPropsDto);
    }
}

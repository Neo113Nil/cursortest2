package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.er;
import xsna.go9;
import xsna.pmi0;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AtumAnyViewDto.kt */
/* loaded from: classes.dex */
public abstract class AtumAnyViewDto implements Parcelable {

    /* compiled from: AtumAnyViewDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumButtonDto extends AtumAnyViewDto implements Parcelable {
        public static final Parcelable.Creator<AtumButtonDto> CREATOR = new a();

        @pmi0("any_layer")
        private final AtumAnyLayerDto anyLayer;

        @pmi0("button_props")
        private final AtumButtonPropsDto buttonProps;

        @pmi0("container_view_props")
        private final AtumContainerViewPropsDto containerViewProps;

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0(AdRevenueConstants.LAYER_KEY)
        private final AtumLayerDto layer;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("yoga_layout")
        private final AtumYogaLayoutDto yogaLayout;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyViewDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;

            @pmi0("Button")
            public static final KindDto BUTTON;
            public static final Parcelable.Creator<KindDto> CREATOR;
            private final String value;

            /* compiled from: AtumAnyViewDto.kt */
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
                KindDto kindDto = new KindDto("BUTTON", 0, "Button");
                BUTTON = kindDto;
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

        /* compiled from: AtumAnyViewDto.kt */
        public static final class a implements Parcelable.Creator<AtumButtonDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumButtonDto createFromParcel(Parcel parcel) {
                return new AtumButtonDto(KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumIdentityPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumAnyLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumYogaLayoutDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumContainerViewPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumButtonPropsDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumButtonDto[] newArray(int i) {
                return new AtumButtonDto[i];
            }
        }

        public /* synthetic */ AtumButtonDto(KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, AtumLayerDto atumLayerDto, AtumAnyLayerDto atumAnyLayerDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumContainerViewPropsDto atumContainerViewPropsDto, AtumButtonPropsDto atumButtonPropsDto, int i, zcl zclVar) {
            this(kindDto, (i & 2) != 0 ? null : atumIdentityPropsDto, (i & 4) != 0 ? null : atumLayerDto, (i & 8) != 0 ? null : atumAnyLayerDto, (i & 16) != 0 ? null : atumYogaLayoutDto, (i & 32) != 0 ? null : atumContainerViewPropsDto, (i & 64) != 0 ? null : atumButtonPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumButtonDto)) {
                return false;
            }
            AtumButtonDto atumButtonDto = (AtumButtonDto) obj;
            return this.kind == atumButtonDto.kind && epx.f(this.objId, atumButtonDto.objId) && epx.f(this.layer, atumButtonDto.layer) && epx.f(this.anyLayer, atumButtonDto.anyLayer) && epx.f(this.yogaLayout, atumButtonDto.yogaLayout) && epx.f(this.containerViewProps, atumButtonDto.containerViewProps) && epx.f(this.buttonProps, atumButtonDto.buttonProps);
        }

        public final int hashCode() {
            int hashCode = this.kind.hashCode() * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            int hashCode2 = (hashCode + (atumIdentityPropsDto == null ? 0 : atumIdentityPropsDto.hashCode())) * 31;
            AtumLayerDto atumLayerDto = this.layer;
            int hashCode3 = (hashCode2 + (atumLayerDto == null ? 0 : atumLayerDto.hashCode())) * 31;
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            int hashCode4 = (hashCode3 + (atumAnyLayerDto == null ? 0 : atumAnyLayerDto.hashCode())) * 31;
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            int hashCode5 = (hashCode4 + (atumYogaLayoutDto == null ? 0 : atumYogaLayoutDto.hashCode())) * 31;
            AtumContainerViewPropsDto atumContainerViewPropsDto = this.containerViewProps;
            int hashCode6 = (hashCode5 + (atumContainerViewPropsDto == null ? 0 : atumContainerViewPropsDto.hashCode())) * 31;
            AtumButtonPropsDto atumButtonPropsDto = this.buttonProps;
            return hashCode6 + (atumButtonPropsDto != null ? atumButtonPropsDto.hashCode() : 0);
        }

        public final String toString() {
            return "AtumButtonDto(kind=" + this.kind + ", objId=" + this.objId + ", layer=" + this.layer + ", anyLayer=" + this.anyLayer + ", yogaLayout=" + this.yogaLayout + ", containerViewProps=" + this.containerViewProps + ", buttonProps=" + this.buttonProps + ')';
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
            AtumLayerDto atumLayerDto = this.layer;
            if (atumLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumLayerDto.writeToParcel(parcel, i);
            }
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            if (atumAnyLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumAnyLayerDto.writeToParcel(parcel, i);
            }
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            if (atumYogaLayoutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumYogaLayoutDto.writeToParcel(parcel, i);
            }
            AtumContainerViewPropsDto atumContainerViewPropsDto = this.containerViewProps;
            if (atumContainerViewPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumContainerViewPropsDto.writeToParcel(parcel, i);
            }
            AtumButtonPropsDto atumButtonPropsDto = this.buttonProps;
            if (atumButtonPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumButtonPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumButtonDto(KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, AtumLayerDto atumLayerDto, AtumAnyLayerDto atumAnyLayerDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumContainerViewPropsDto atumContainerViewPropsDto, AtumButtonPropsDto atumButtonPropsDto) {
            super(null);
            this.kind = kindDto;
            this.objId = atumIdentityPropsDto;
            this.layer = atumLayerDto;
            this.anyLayer = atumAnyLayerDto;
            this.yogaLayout = atumYogaLayoutDto;
            this.containerViewProps = atumContainerViewPropsDto;
            this.buttonProps = atumButtonPropsDto;
        }
    }

    /* compiled from: AtumAnyViewDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumImageViewDto extends AtumAnyViewDto implements Parcelable {
        public static final Parcelable.Creator<AtumImageViewDto> CREATOR = new a();

        @pmi0("any_layer")
        private final AtumAnyLayerDto anyLayer;

        @pmi0("image_view_props")
        private final AtumImageViewPropsDto imageViewProps;

        @pmi0("image_view_repo_refs")
        private final AtumImageViewRepoRefsDto imageViewRepoRefs;

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0(AdRevenueConstants.LAYER_KEY)
        private final AtumLayerDto layer;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("yoga_layout")
        private final AtumYogaLayoutDto yogaLayout;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyViewDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;
            public static final Parcelable.Creator<KindDto> CREATOR;

            @pmi0("ImageView")
            public static final KindDto IMAGEVIEW;
            private final String value;

            /* compiled from: AtumAnyViewDto.kt */
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
                KindDto kindDto = new KindDto("IMAGEVIEW", 0, "ImageView");
                IMAGEVIEW = kindDto;
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

        /* compiled from: AtumAnyViewDto.kt */
        public static final class a implements Parcelable.Creator<AtumImageViewDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumImageViewDto createFromParcel(Parcel parcel) {
                return new AtumImageViewDto(KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumIdentityPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumAnyLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumYogaLayoutDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumImageViewPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumImageViewRepoRefsDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumImageViewDto[] newArray(int i) {
                return new AtumImageViewDto[i];
            }
        }

        public /* synthetic */ AtumImageViewDto(KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, AtumLayerDto atumLayerDto, AtumAnyLayerDto atumAnyLayerDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumImageViewPropsDto atumImageViewPropsDto, AtumImageViewRepoRefsDto atumImageViewRepoRefsDto, int i, zcl zclVar) {
            this(kindDto, (i & 2) != 0 ? null : atumIdentityPropsDto, (i & 4) != 0 ? null : atumLayerDto, (i & 8) != 0 ? null : atumAnyLayerDto, (i & 16) != 0 ? null : atumYogaLayoutDto, (i & 32) != 0 ? null : atumImageViewPropsDto, (i & 64) != 0 ? null : atumImageViewRepoRefsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumImageViewDto)) {
                return false;
            }
            AtumImageViewDto atumImageViewDto = (AtumImageViewDto) obj;
            return this.kind == atumImageViewDto.kind && epx.f(this.objId, atumImageViewDto.objId) && epx.f(this.layer, atumImageViewDto.layer) && epx.f(this.anyLayer, atumImageViewDto.anyLayer) && epx.f(this.yogaLayout, atumImageViewDto.yogaLayout) && epx.f(this.imageViewProps, atumImageViewDto.imageViewProps) && epx.f(this.imageViewRepoRefs, atumImageViewDto.imageViewRepoRefs);
        }

        public final int hashCode() {
            int hashCode = this.kind.hashCode() * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            int hashCode2 = (hashCode + (atumIdentityPropsDto == null ? 0 : atumIdentityPropsDto.hashCode())) * 31;
            AtumLayerDto atumLayerDto = this.layer;
            int hashCode3 = (hashCode2 + (atumLayerDto == null ? 0 : atumLayerDto.hashCode())) * 31;
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            int hashCode4 = (hashCode3 + (atumAnyLayerDto == null ? 0 : atumAnyLayerDto.hashCode())) * 31;
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            int hashCode5 = (hashCode4 + (atumYogaLayoutDto == null ? 0 : atumYogaLayoutDto.hashCode())) * 31;
            AtumImageViewPropsDto atumImageViewPropsDto = this.imageViewProps;
            int hashCode6 = (hashCode5 + (atumImageViewPropsDto == null ? 0 : atumImageViewPropsDto.hashCode())) * 31;
            AtumImageViewRepoRefsDto atumImageViewRepoRefsDto = this.imageViewRepoRefs;
            return hashCode6 + (atumImageViewRepoRefsDto != null ? atumImageViewRepoRefsDto.hashCode() : 0);
        }

        public final String toString() {
            return "AtumImageViewDto(kind=" + this.kind + ", objId=" + this.objId + ", layer=" + this.layer + ", anyLayer=" + this.anyLayer + ", yogaLayout=" + this.yogaLayout + ", imageViewProps=" + this.imageViewProps + ", imageViewRepoRefs=" + this.imageViewRepoRefs + ')';
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
            AtumLayerDto atumLayerDto = this.layer;
            if (atumLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumLayerDto.writeToParcel(parcel, i);
            }
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            if (atumAnyLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumAnyLayerDto.writeToParcel(parcel, i);
            }
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            if (atumYogaLayoutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumYogaLayoutDto.writeToParcel(parcel, i);
            }
            AtumImageViewPropsDto atumImageViewPropsDto = this.imageViewProps;
            if (atumImageViewPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumImageViewPropsDto.writeToParcel(parcel, i);
            }
            AtumImageViewRepoRefsDto atumImageViewRepoRefsDto = this.imageViewRepoRefs;
            if (atumImageViewRepoRefsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumImageViewRepoRefsDto.writeToParcel(parcel, i);
            }
        }

        public AtumImageViewDto(KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, AtumLayerDto atumLayerDto, AtumAnyLayerDto atumAnyLayerDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumImageViewPropsDto atumImageViewPropsDto, AtumImageViewRepoRefsDto atumImageViewRepoRefsDto) {
            super(null);
            this.kind = kindDto;
            this.objId = atumIdentityPropsDto;
            this.layer = atumLayerDto;
            this.anyLayer = atumAnyLayerDto;
            this.yogaLayout = atumYogaLayoutDto;
            this.imageViewProps = atumImageViewPropsDto;
            this.imageViewRepoRefs = atumImageViewRepoRefsDto;
        }
    }

    /* compiled from: AtumAnyViewDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumLabelDto extends AtumAnyViewDto implements Parcelable {
        public static final Parcelable.Creator<AtumLabelDto> CREATOR = new a();

        @pmi0("any_layer")
        private final AtumAnyLayerDto anyLayer;

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("label_props")
        private final AtumLabelPropsDto labelProps;

        @pmi0("label_repo_refs")
        private final AtumLabelRepoRefsDto labelRepoRefs;

        @pmi0(AdRevenueConstants.LAYER_KEY)
        private final AtumLayerDto layer;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("yoga_layout")
        private final AtumYogaLayoutDto yogaLayout;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyViewDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;
            public static final Parcelable.Creator<KindDto> CREATOR;

            @pmi0("Label")
            public static final KindDto LABEL;
            private final String value;

            /* compiled from: AtumAnyViewDto.kt */
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
                KindDto kindDto = new KindDto("LABEL", 0, "Label");
                LABEL = kindDto;
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

        /* compiled from: AtumAnyViewDto.kt */
        public static final class a implements Parcelable.Creator<AtumLabelDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumLabelDto createFromParcel(Parcel parcel) {
                return new AtumLabelDto(KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumIdentityPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumAnyLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumYogaLayoutDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumLabelPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumLabelRepoRefsDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumLabelDto[] newArray(int i) {
                return new AtumLabelDto[i];
            }
        }

        public /* synthetic */ AtumLabelDto(KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, AtumLayerDto atumLayerDto, AtumAnyLayerDto atumAnyLayerDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumLabelPropsDto atumLabelPropsDto, AtumLabelRepoRefsDto atumLabelRepoRefsDto, int i, zcl zclVar) {
            this(kindDto, (i & 2) != 0 ? null : atumIdentityPropsDto, (i & 4) != 0 ? null : atumLayerDto, (i & 8) != 0 ? null : atumAnyLayerDto, (i & 16) != 0 ? null : atumYogaLayoutDto, (i & 32) != 0 ? null : atumLabelPropsDto, (i & 64) != 0 ? null : atumLabelRepoRefsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumLabelDto)) {
                return false;
            }
            AtumLabelDto atumLabelDto = (AtumLabelDto) obj;
            return this.kind == atumLabelDto.kind && epx.f(this.objId, atumLabelDto.objId) && epx.f(this.layer, atumLabelDto.layer) && epx.f(this.anyLayer, atumLabelDto.anyLayer) && epx.f(this.yogaLayout, atumLabelDto.yogaLayout) && epx.f(this.labelProps, atumLabelDto.labelProps) && epx.f(this.labelRepoRefs, atumLabelDto.labelRepoRefs);
        }

        public final int hashCode() {
            int hashCode = this.kind.hashCode() * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            int hashCode2 = (hashCode + (atumIdentityPropsDto == null ? 0 : atumIdentityPropsDto.hashCode())) * 31;
            AtumLayerDto atumLayerDto = this.layer;
            int hashCode3 = (hashCode2 + (atumLayerDto == null ? 0 : atumLayerDto.hashCode())) * 31;
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            int hashCode4 = (hashCode3 + (atumAnyLayerDto == null ? 0 : atumAnyLayerDto.hashCode())) * 31;
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            int hashCode5 = (hashCode4 + (atumYogaLayoutDto == null ? 0 : atumYogaLayoutDto.hashCode())) * 31;
            AtumLabelPropsDto atumLabelPropsDto = this.labelProps;
            int hashCode6 = (hashCode5 + (atumLabelPropsDto == null ? 0 : atumLabelPropsDto.hashCode())) * 31;
            AtumLabelRepoRefsDto atumLabelRepoRefsDto = this.labelRepoRefs;
            return hashCode6 + (atumLabelRepoRefsDto != null ? atumLabelRepoRefsDto.hashCode() : 0);
        }

        public final String toString() {
            return "AtumLabelDto(kind=" + this.kind + ", objId=" + this.objId + ", layer=" + this.layer + ", anyLayer=" + this.anyLayer + ", yogaLayout=" + this.yogaLayout + ", labelProps=" + this.labelProps + ", labelRepoRefs=" + this.labelRepoRefs + ')';
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
            AtumLayerDto atumLayerDto = this.layer;
            if (atumLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumLayerDto.writeToParcel(parcel, i);
            }
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            if (atumAnyLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumAnyLayerDto.writeToParcel(parcel, i);
            }
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            if (atumYogaLayoutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumYogaLayoutDto.writeToParcel(parcel, i);
            }
            AtumLabelPropsDto atumLabelPropsDto = this.labelProps;
            if (atumLabelPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumLabelPropsDto.writeToParcel(parcel, i);
            }
            AtumLabelRepoRefsDto atumLabelRepoRefsDto = this.labelRepoRefs;
            if (atumLabelRepoRefsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumLabelRepoRefsDto.writeToParcel(parcel, i);
            }
        }

        public AtumLabelDto(KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, AtumLayerDto atumLayerDto, AtumAnyLayerDto atumAnyLayerDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumLabelPropsDto atumLabelPropsDto, AtumLabelRepoRefsDto atumLabelRepoRefsDto) {
            super(null);
            this.kind = kindDto;
            this.objId = atumIdentityPropsDto;
            this.layer = atumLayerDto;
            this.anyLayer = atumAnyLayerDto;
            this.yogaLayout = atumYogaLayoutDto;
            this.labelProps = atumLabelPropsDto;
            this.labelRepoRefs = atumLabelRepoRefsDto;
        }
    }

    /* compiled from: AtumAnyViewDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumViewDto extends AtumAnyViewDto implements Parcelable {
        public static final Parcelable.Creator<AtumViewDto> CREATOR = new a();

        @pmi0("any_layer")
        private final AtumAnyLayerDto anyLayer;

        @pmi0("container_view_props")
        private final AtumContainerViewPropsDto containerViewProps;

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0(AdRevenueConstants.LAYER_KEY)
        private final AtumLayerDto layer;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("yoga_layout")
        private final AtumYogaLayoutDto yogaLayout;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyViewDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;
            public static final Parcelable.Creator<KindDto> CREATOR;

            @pmi0("View")
            public static final KindDto VIEW;
            private final String value;

            /* compiled from: AtumAnyViewDto.kt */
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
                KindDto kindDto = new KindDto("VIEW", 0, "View");
                VIEW = kindDto;
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

        /* compiled from: AtumAnyViewDto.kt */
        public static final class a implements Parcelable.Creator<AtumViewDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumViewDto createFromParcel(Parcel parcel) {
                return new AtumViewDto(KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumIdentityPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumAnyLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumYogaLayoutDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumContainerViewPropsDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumViewDto[] newArray(int i) {
                return new AtumViewDto[i];
            }
        }

        public /* synthetic */ AtumViewDto(KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, AtumLayerDto atumLayerDto, AtumAnyLayerDto atumAnyLayerDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumContainerViewPropsDto atumContainerViewPropsDto, int i, zcl zclVar) {
            this(kindDto, (i & 2) != 0 ? null : atumIdentityPropsDto, (i & 4) != 0 ? null : atumLayerDto, (i & 8) != 0 ? null : atumAnyLayerDto, (i & 16) != 0 ? null : atumYogaLayoutDto, (i & 32) != 0 ? null : atumContainerViewPropsDto);
        }

        public final AtumContainerViewPropsDto d() {
            return this.containerViewProps;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumViewDto)) {
                return false;
            }
            AtumViewDto atumViewDto = (AtumViewDto) obj;
            return this.kind == atumViewDto.kind && epx.f(this.objId, atumViewDto.objId) && epx.f(this.layer, atumViewDto.layer) && epx.f(this.anyLayer, atumViewDto.anyLayer) && epx.f(this.yogaLayout, atumViewDto.yogaLayout) && epx.f(this.containerViewProps, atumViewDto.containerViewProps);
        }

        public final int hashCode() {
            int hashCode = this.kind.hashCode() * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            int hashCode2 = (hashCode + (atumIdentityPropsDto == null ? 0 : atumIdentityPropsDto.hashCode())) * 31;
            AtumLayerDto atumLayerDto = this.layer;
            int hashCode3 = (hashCode2 + (atumLayerDto == null ? 0 : atumLayerDto.hashCode())) * 31;
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            int hashCode4 = (hashCode3 + (atumAnyLayerDto == null ? 0 : atumAnyLayerDto.hashCode())) * 31;
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            int hashCode5 = (hashCode4 + (atumYogaLayoutDto == null ? 0 : atumYogaLayoutDto.hashCode())) * 31;
            AtumContainerViewPropsDto atumContainerViewPropsDto = this.containerViewProps;
            return hashCode5 + (atumContainerViewPropsDto != null ? atumContainerViewPropsDto.hashCode() : 0);
        }

        public final String toString() {
            return "AtumViewDto(kind=" + this.kind + ", objId=" + this.objId + ", layer=" + this.layer + ", anyLayer=" + this.anyLayer + ", yogaLayout=" + this.yogaLayout + ", containerViewProps=" + this.containerViewProps + ')';
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
            AtumLayerDto atumLayerDto = this.layer;
            if (atumLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumLayerDto.writeToParcel(parcel, i);
            }
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            if (atumAnyLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumAnyLayerDto.writeToParcel(parcel, i);
            }
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            if (atumYogaLayoutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumYogaLayoutDto.writeToParcel(parcel, i);
            }
            AtumContainerViewPropsDto atumContainerViewPropsDto = this.containerViewProps;
            if (atumContainerViewPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumContainerViewPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumViewDto(KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, AtumLayerDto atumLayerDto, AtumAnyLayerDto atumAnyLayerDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumContainerViewPropsDto atumContainerViewPropsDto) {
            super(null);
            this.kind = kindDto;
            this.objId = atumIdentityPropsDto;
            this.layer = atumLayerDto;
            this.anyLayer = atumAnyLayerDto;
            this.yogaLayout = atumYogaLayoutDto;
            this.containerViewProps = atumContainerViewPropsDto;
        }
    }

    /* compiled from: AtumAnyViewDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiAvatarUniversalDto extends AtumAnyViewDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiAvatarUniversalDto> CREATOR = new a();

        @pmi0("any_layer")
        private final AtumAnyLayerDto anyLayer;

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("props")
        private final AtumVkuiAvatarPropsDto props;

        @pmi0("yoga_layout")
        private final AtumYogaLayoutDto yogaLayout;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyViewDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;

            @pmi0("AtumVKUIAvatar")
            public static final KindDto ATUMVKUIAVATAR;
            public static final Parcelable.Creator<KindDto> CREATOR;
            private final String value;

            /* compiled from: AtumAnyViewDto.kt */
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
                KindDto kindDto = new KindDto("ATUMVKUIAVATAR", 0, "AtumVKUIAvatar");
                ATUMVKUIAVATAR = kindDto;
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

        /* compiled from: AtumAnyViewDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiAvatarUniversalDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiAvatarUniversalDto createFromParcel(Parcel parcel) {
                return new AtumVkuiAvatarUniversalDto(KindDto.CREATOR.createFromParcel(parcel), AtumVkuiAvatarPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumYogaLayoutDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumAnyLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumIdentityPropsDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiAvatarUniversalDto[] newArray(int i) {
                return new AtumVkuiAvatarUniversalDto[i];
            }
        }

        public /* synthetic */ AtumVkuiAvatarUniversalDto(KindDto kindDto, AtumVkuiAvatarPropsDto atumVkuiAvatarPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(kindDto, atumVkuiAvatarPropsDto, (i & 4) != 0 ? null : atumYogaLayoutDto, (i & 8) != 0 ? null : atumAnyLayerDto, (i & 16) != 0 ? null : atumIdentityPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiAvatarUniversalDto)) {
                return false;
            }
            AtumVkuiAvatarUniversalDto atumVkuiAvatarUniversalDto = (AtumVkuiAvatarUniversalDto) obj;
            return this.kind == atumVkuiAvatarUniversalDto.kind && epx.f(this.props, atumVkuiAvatarUniversalDto.props) && epx.f(this.yogaLayout, atumVkuiAvatarUniversalDto.yogaLayout) && epx.f(this.anyLayer, atumVkuiAvatarUniversalDto.anyLayer) && epx.f(this.objId, atumVkuiAvatarUniversalDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.props.hashCode() + (this.kind.hashCode() * 31)) * 31;
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            int hashCode2 = (hashCode + (atumYogaLayoutDto == null ? 0 : atumYogaLayoutDto.hashCode())) * 31;
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            int hashCode3 = (hashCode2 + (atumAnyLayerDto == null ? 0 : atumAnyLayerDto.hashCode())) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode3 + (atumIdentityPropsDto != null ? atumIdentityPropsDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiAvatarUniversalDto(kind=");
            sb.append(this.kind);
            sb.append(", props=");
            sb.append(this.props);
            sb.append(", yogaLayout=");
            sb.append(this.yogaLayout);
            sb.append(", anyLayer=");
            sb.append(this.anyLayer);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.kind.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            if (atumYogaLayoutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumYogaLayoutDto.writeToParcel(parcel, i);
            }
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            if (atumAnyLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumAnyLayerDto.writeToParcel(parcel, i);
            }
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiAvatarUniversalDto(KindDto kindDto, AtumVkuiAvatarPropsDto atumVkuiAvatarPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.kind = kindDto;
            this.props = atumVkuiAvatarPropsDto;
            this.yogaLayout = atumYogaLayoutDto;
            this.anyLayer = atumAnyLayerDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyViewDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiBadgeUniversalDto extends AtumAnyViewDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiBadgeUniversalDto> CREATOR = new a();

        @pmi0("any_layer")
        private final AtumAnyLayerDto anyLayer;

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("props")
        private final AtumVkuiBadgePropsDto props;

        @pmi0("yoga_layout")
        private final AtumYogaLayoutDto yogaLayout;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyViewDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;

            @pmi0("AtumVKUIBadge")
            public static final KindDto ATUMVKUIBADGE;
            public static final Parcelable.Creator<KindDto> CREATOR;
            private final String value;

            /* compiled from: AtumAnyViewDto.kt */
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
                KindDto kindDto = new KindDto("ATUMVKUIBADGE", 0, "AtumVKUIBadge");
                ATUMVKUIBADGE = kindDto;
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

        /* compiled from: AtumAnyViewDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiBadgeUniversalDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiBadgeUniversalDto createFromParcel(Parcel parcel) {
                return new AtumVkuiBadgeUniversalDto(KindDto.CREATOR.createFromParcel(parcel), AtumVkuiBadgePropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumYogaLayoutDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumAnyLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumIdentityPropsDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiBadgeUniversalDto[] newArray(int i) {
                return new AtumVkuiBadgeUniversalDto[i];
            }
        }

        public /* synthetic */ AtumVkuiBadgeUniversalDto(KindDto kindDto, AtumVkuiBadgePropsDto atumVkuiBadgePropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(kindDto, atumVkuiBadgePropsDto, (i & 4) != 0 ? null : atumYogaLayoutDto, (i & 8) != 0 ? null : atumAnyLayerDto, (i & 16) != 0 ? null : atumIdentityPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiBadgeUniversalDto)) {
                return false;
            }
            AtumVkuiBadgeUniversalDto atumVkuiBadgeUniversalDto = (AtumVkuiBadgeUniversalDto) obj;
            return this.kind == atumVkuiBadgeUniversalDto.kind && epx.f(this.props, atumVkuiBadgeUniversalDto.props) && epx.f(this.yogaLayout, atumVkuiBadgeUniversalDto.yogaLayout) && epx.f(this.anyLayer, atumVkuiBadgeUniversalDto.anyLayer) && epx.f(this.objId, atumVkuiBadgeUniversalDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.props.hashCode() + (this.kind.hashCode() * 31)) * 31;
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            int hashCode2 = (hashCode + (atumYogaLayoutDto == null ? 0 : atumYogaLayoutDto.hashCode())) * 31;
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            int hashCode3 = (hashCode2 + (atumAnyLayerDto == null ? 0 : atumAnyLayerDto.hashCode())) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode3 + (atumIdentityPropsDto != null ? atumIdentityPropsDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiBadgeUniversalDto(kind=");
            sb.append(this.kind);
            sb.append(", props=");
            sb.append(this.props);
            sb.append(", yogaLayout=");
            sb.append(this.yogaLayout);
            sb.append(", anyLayer=");
            sb.append(this.anyLayer);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.kind.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            if (atumYogaLayoutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumYogaLayoutDto.writeToParcel(parcel, i);
            }
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            if (atumAnyLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumAnyLayerDto.writeToParcel(parcel, i);
            }
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiBadgeUniversalDto(KindDto kindDto, AtumVkuiBadgePropsDto atumVkuiBadgePropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.kind = kindDto;
            this.props = atumVkuiBadgePropsDto;
            this.yogaLayout = atumYogaLayoutDto;
            this.anyLayer = atumAnyLayerDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyViewDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiButtonUniversalDto extends AtumAnyViewDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiButtonUniversalDto> CREATOR = new a();

        @pmi0("any_layer")
        private final AtumAnyLayerDto anyLayer;

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("props")
        private final AtumVkuiButtonPropsDto props;

        @pmi0("yoga_layout")
        private final AtumYogaLayoutDto yogaLayout;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyViewDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;

            @pmi0("AtumVKUIButton")
            public static final KindDto ATUMVKUIBUTTON;
            public static final Parcelable.Creator<KindDto> CREATOR;
            private final String value;

            /* compiled from: AtumAnyViewDto.kt */
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
                KindDto kindDto = new KindDto("ATUMVKUIBUTTON", 0, "AtumVKUIButton");
                ATUMVKUIBUTTON = kindDto;
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

        /* compiled from: AtumAnyViewDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiButtonUniversalDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiButtonUniversalDto createFromParcel(Parcel parcel) {
                return new AtumVkuiButtonUniversalDto(KindDto.CREATOR.createFromParcel(parcel), AtumVkuiButtonPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumYogaLayoutDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumAnyLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumIdentityPropsDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiButtonUniversalDto[] newArray(int i) {
                return new AtumVkuiButtonUniversalDto[i];
            }
        }

        public /* synthetic */ AtumVkuiButtonUniversalDto(KindDto kindDto, AtumVkuiButtonPropsDto atumVkuiButtonPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(kindDto, atumVkuiButtonPropsDto, (i & 4) != 0 ? null : atumYogaLayoutDto, (i & 8) != 0 ? null : atumAnyLayerDto, (i & 16) != 0 ? null : atumIdentityPropsDto);
        }

        public final AtumVkuiButtonPropsDto d() {
            return this.props;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiButtonUniversalDto)) {
                return false;
            }
            AtumVkuiButtonUniversalDto atumVkuiButtonUniversalDto = (AtumVkuiButtonUniversalDto) obj;
            return this.kind == atumVkuiButtonUniversalDto.kind && epx.f(this.props, atumVkuiButtonUniversalDto.props) && epx.f(this.yogaLayout, atumVkuiButtonUniversalDto.yogaLayout) && epx.f(this.anyLayer, atumVkuiButtonUniversalDto.anyLayer) && epx.f(this.objId, atumVkuiButtonUniversalDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.props.hashCode() + (this.kind.hashCode() * 31)) * 31;
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            int hashCode2 = (hashCode + (atumYogaLayoutDto == null ? 0 : atumYogaLayoutDto.hashCode())) * 31;
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            int hashCode3 = (hashCode2 + (atumAnyLayerDto == null ? 0 : atumAnyLayerDto.hashCode())) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode3 + (atumIdentityPropsDto != null ? atumIdentityPropsDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiButtonUniversalDto(kind=");
            sb.append(this.kind);
            sb.append(", props=");
            sb.append(this.props);
            sb.append(", yogaLayout=");
            sb.append(this.yogaLayout);
            sb.append(", anyLayer=");
            sb.append(this.anyLayer);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.kind.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            if (atumYogaLayoutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumYogaLayoutDto.writeToParcel(parcel, i);
            }
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            if (atumAnyLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumAnyLayerDto.writeToParcel(parcel, i);
            }
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiButtonUniversalDto(KindDto kindDto, AtumVkuiButtonPropsDto atumVkuiButtonPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.kind = kindDto;
            this.props = atumVkuiButtonPropsDto;
            this.yogaLayout = atumYogaLayoutDto;
            this.anyLayer = atumAnyLayerDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyViewDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiContentBadgeUniversalDto extends AtumAnyViewDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiContentBadgeUniversalDto> CREATOR = new a();

        @pmi0("any_layer")
        private final AtumAnyLayerDto anyLayer;

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("props")
        private final AtumVkuiContentBadgePropsDto props;

        @pmi0("yoga_layout")
        private final AtumYogaLayoutDto yogaLayout;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyViewDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;

            @pmi0("AtumVKUIContentBadge")
            public static final KindDto ATUMVKUICONTENTBADGE;
            public static final Parcelable.Creator<KindDto> CREATOR;
            private final String value;

            /* compiled from: AtumAnyViewDto.kt */
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
                KindDto kindDto = new KindDto("ATUMVKUICONTENTBADGE", 0, "AtumVKUIContentBadge");
                ATUMVKUICONTENTBADGE = kindDto;
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

        /* compiled from: AtumAnyViewDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiContentBadgeUniversalDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiContentBadgeUniversalDto createFromParcel(Parcel parcel) {
                return new AtumVkuiContentBadgeUniversalDto(KindDto.CREATOR.createFromParcel(parcel), AtumVkuiContentBadgePropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumYogaLayoutDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumAnyLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumIdentityPropsDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiContentBadgeUniversalDto[] newArray(int i) {
                return new AtumVkuiContentBadgeUniversalDto[i];
            }
        }

        public /* synthetic */ AtumVkuiContentBadgeUniversalDto(KindDto kindDto, AtumVkuiContentBadgePropsDto atumVkuiContentBadgePropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(kindDto, atumVkuiContentBadgePropsDto, (i & 4) != 0 ? null : atumYogaLayoutDto, (i & 8) != 0 ? null : atumAnyLayerDto, (i & 16) != 0 ? null : atumIdentityPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiContentBadgeUniversalDto)) {
                return false;
            }
            AtumVkuiContentBadgeUniversalDto atumVkuiContentBadgeUniversalDto = (AtumVkuiContentBadgeUniversalDto) obj;
            return this.kind == atumVkuiContentBadgeUniversalDto.kind && epx.f(this.props, atumVkuiContentBadgeUniversalDto.props) && epx.f(this.yogaLayout, atumVkuiContentBadgeUniversalDto.yogaLayout) && epx.f(this.anyLayer, atumVkuiContentBadgeUniversalDto.anyLayer) && epx.f(this.objId, atumVkuiContentBadgeUniversalDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.props.hashCode() + (this.kind.hashCode() * 31)) * 31;
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            int hashCode2 = (hashCode + (atumYogaLayoutDto == null ? 0 : atumYogaLayoutDto.hashCode())) * 31;
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            int hashCode3 = (hashCode2 + (atumAnyLayerDto == null ? 0 : atumAnyLayerDto.hashCode())) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode3 + (atumIdentityPropsDto != null ? atumIdentityPropsDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiContentBadgeUniversalDto(kind=");
            sb.append(this.kind);
            sb.append(", props=");
            sb.append(this.props);
            sb.append(", yogaLayout=");
            sb.append(this.yogaLayout);
            sb.append(", anyLayer=");
            sb.append(this.anyLayer);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.kind.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            if (atumYogaLayoutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumYogaLayoutDto.writeToParcel(parcel, i);
            }
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            if (atumAnyLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumAnyLayerDto.writeToParcel(parcel, i);
            }
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiContentBadgeUniversalDto(KindDto kindDto, AtumVkuiContentBadgePropsDto atumVkuiContentBadgePropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.kind = kindDto;
            this.props = atumVkuiContentBadgePropsDto;
            this.yogaLayout = atumYogaLayoutDto;
            this.anyLayer = atumAnyLayerDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyViewDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiCounterUniversalDto extends AtumAnyViewDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiCounterUniversalDto> CREATOR = new a();

        @pmi0("any_layer")
        private final AtumAnyLayerDto anyLayer;

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("props")
        private final AtumVkuiCounterPropsDto props;

        @pmi0("yoga_layout")
        private final AtumYogaLayoutDto yogaLayout;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyViewDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;

            @pmi0("AtumVKUICounter")
            public static final KindDto ATUMVKUICOUNTER;
            public static final Parcelable.Creator<KindDto> CREATOR;
            private final String value;

            /* compiled from: AtumAnyViewDto.kt */
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
                KindDto kindDto = new KindDto("ATUMVKUICOUNTER", 0, "AtumVKUICounter");
                ATUMVKUICOUNTER = kindDto;
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

        /* compiled from: AtumAnyViewDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiCounterUniversalDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiCounterUniversalDto createFromParcel(Parcel parcel) {
                return new AtumVkuiCounterUniversalDto(KindDto.CREATOR.createFromParcel(parcel), AtumVkuiCounterPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumYogaLayoutDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumAnyLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumIdentityPropsDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiCounterUniversalDto[] newArray(int i) {
                return new AtumVkuiCounterUniversalDto[i];
            }
        }

        public /* synthetic */ AtumVkuiCounterUniversalDto(KindDto kindDto, AtumVkuiCounterPropsDto atumVkuiCounterPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(kindDto, atumVkuiCounterPropsDto, (i & 4) != 0 ? null : atumYogaLayoutDto, (i & 8) != 0 ? null : atumAnyLayerDto, (i & 16) != 0 ? null : atumIdentityPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiCounterUniversalDto)) {
                return false;
            }
            AtumVkuiCounterUniversalDto atumVkuiCounterUniversalDto = (AtumVkuiCounterUniversalDto) obj;
            return this.kind == atumVkuiCounterUniversalDto.kind && epx.f(this.props, atumVkuiCounterUniversalDto.props) && epx.f(this.yogaLayout, atumVkuiCounterUniversalDto.yogaLayout) && epx.f(this.anyLayer, atumVkuiCounterUniversalDto.anyLayer) && epx.f(this.objId, atumVkuiCounterUniversalDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.props.hashCode() + (this.kind.hashCode() * 31)) * 31;
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            int hashCode2 = (hashCode + (atumYogaLayoutDto == null ? 0 : atumYogaLayoutDto.hashCode())) * 31;
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            int hashCode3 = (hashCode2 + (atumAnyLayerDto == null ? 0 : atumAnyLayerDto.hashCode())) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode3 + (atumIdentityPropsDto != null ? atumIdentityPropsDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiCounterUniversalDto(kind=");
            sb.append(this.kind);
            sb.append(", props=");
            sb.append(this.props);
            sb.append(", yogaLayout=");
            sb.append(this.yogaLayout);
            sb.append(", anyLayer=");
            sb.append(this.anyLayer);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.kind.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            if (atumYogaLayoutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumYogaLayoutDto.writeToParcel(parcel, i);
            }
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            if (atumAnyLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumAnyLayerDto.writeToParcel(parcel, i);
            }
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiCounterUniversalDto(KindDto kindDto, AtumVkuiCounterPropsDto atumVkuiCounterPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.kind = kindDto;
            this.props = atumVkuiCounterPropsDto;
            this.yogaLayout = atumYogaLayoutDto;
            this.anyLayer = atumAnyLayerDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyViewDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiHeaderUniversalDto extends AtumAnyViewDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiHeaderUniversalDto> CREATOR = new a();

        @pmi0("any_layer")
        private final AtumAnyLayerDto anyLayer;

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("props")
        private final AtumVkuiHeaderPropsDto props;

        @pmi0("yoga_layout")
        private final AtumYogaLayoutDto yogaLayout;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyViewDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;

            @pmi0("AtumVKUIHeader")
            public static final KindDto ATUMVKUIHEADER;
            public static final Parcelable.Creator<KindDto> CREATOR;
            private final String value;

            /* compiled from: AtumAnyViewDto.kt */
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
                KindDto kindDto = new KindDto("ATUMVKUIHEADER", 0, "AtumVKUIHeader");
                ATUMVKUIHEADER = kindDto;
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

        /* compiled from: AtumAnyViewDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiHeaderUniversalDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiHeaderUniversalDto createFromParcel(Parcel parcel) {
                return new AtumVkuiHeaderUniversalDto(KindDto.CREATOR.createFromParcel(parcel), AtumVkuiHeaderPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumYogaLayoutDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumAnyLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumIdentityPropsDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiHeaderUniversalDto[] newArray(int i) {
                return new AtumVkuiHeaderUniversalDto[i];
            }
        }

        public /* synthetic */ AtumVkuiHeaderUniversalDto(KindDto kindDto, AtumVkuiHeaderPropsDto atumVkuiHeaderPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(kindDto, atumVkuiHeaderPropsDto, (i & 4) != 0 ? null : atumYogaLayoutDto, (i & 8) != 0 ? null : atumAnyLayerDto, (i & 16) != 0 ? null : atumIdentityPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiHeaderUniversalDto)) {
                return false;
            }
            AtumVkuiHeaderUniversalDto atumVkuiHeaderUniversalDto = (AtumVkuiHeaderUniversalDto) obj;
            return this.kind == atumVkuiHeaderUniversalDto.kind && epx.f(this.props, atumVkuiHeaderUniversalDto.props) && epx.f(this.yogaLayout, atumVkuiHeaderUniversalDto.yogaLayout) && epx.f(this.anyLayer, atumVkuiHeaderUniversalDto.anyLayer) && epx.f(this.objId, atumVkuiHeaderUniversalDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.props.hashCode() + (this.kind.hashCode() * 31)) * 31;
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            int hashCode2 = (hashCode + (atumYogaLayoutDto == null ? 0 : atumYogaLayoutDto.hashCode())) * 31;
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            int hashCode3 = (hashCode2 + (atumAnyLayerDto == null ? 0 : atumAnyLayerDto.hashCode())) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode3 + (atumIdentityPropsDto != null ? atumIdentityPropsDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiHeaderUniversalDto(kind=");
            sb.append(this.kind);
            sb.append(", props=");
            sb.append(this.props);
            sb.append(", yogaLayout=");
            sb.append(this.yogaLayout);
            sb.append(", anyLayer=");
            sb.append(this.anyLayer);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.kind.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            if (atumYogaLayoutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumYogaLayoutDto.writeToParcel(parcel, i);
            }
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            if (atumAnyLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumAnyLayerDto.writeToParcel(parcel, i);
            }
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiHeaderUniversalDto(KindDto kindDto, AtumVkuiHeaderPropsDto atumVkuiHeaderPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.kind = kindDto;
            this.props = atumVkuiHeaderPropsDto;
            this.yogaLayout = atumYogaLayoutDto;
            this.anyLayer = atumAnyLayerDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyViewDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiIconButtonUniversalDto extends AtumAnyViewDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiIconButtonUniversalDto> CREATOR = new a();

        @pmi0("any_layer")
        private final AtumAnyLayerDto anyLayer;

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("props")
        private final AtumVkuiIconButtonPropsDto props;

        @pmi0("yoga_layout")
        private final AtumYogaLayoutDto yogaLayout;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyViewDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;

            @pmi0("AtumVKUIIconButton")
            public static final KindDto ATUMVKUIICONBUTTON;
            public static final Parcelable.Creator<KindDto> CREATOR;
            private final String value;

            /* compiled from: AtumAnyViewDto.kt */
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
                KindDto kindDto = new KindDto("ATUMVKUIICONBUTTON", 0, "AtumVKUIIconButton");
                ATUMVKUIICONBUTTON = kindDto;
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

        /* compiled from: AtumAnyViewDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiIconButtonUniversalDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiIconButtonUniversalDto createFromParcel(Parcel parcel) {
                return new AtumVkuiIconButtonUniversalDto(KindDto.CREATOR.createFromParcel(parcel), AtumVkuiIconButtonPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumYogaLayoutDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumAnyLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumIdentityPropsDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiIconButtonUniversalDto[] newArray(int i) {
                return new AtumVkuiIconButtonUniversalDto[i];
            }
        }

        public /* synthetic */ AtumVkuiIconButtonUniversalDto(KindDto kindDto, AtumVkuiIconButtonPropsDto atumVkuiIconButtonPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(kindDto, atumVkuiIconButtonPropsDto, (i & 4) != 0 ? null : atumYogaLayoutDto, (i & 8) != 0 ? null : atumAnyLayerDto, (i & 16) != 0 ? null : atumIdentityPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiIconButtonUniversalDto)) {
                return false;
            }
            AtumVkuiIconButtonUniversalDto atumVkuiIconButtonUniversalDto = (AtumVkuiIconButtonUniversalDto) obj;
            return this.kind == atumVkuiIconButtonUniversalDto.kind && epx.f(this.props, atumVkuiIconButtonUniversalDto.props) && epx.f(this.yogaLayout, atumVkuiIconButtonUniversalDto.yogaLayout) && epx.f(this.anyLayer, atumVkuiIconButtonUniversalDto.anyLayer) && epx.f(this.objId, atumVkuiIconButtonUniversalDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.props.hashCode() + (this.kind.hashCode() * 31)) * 31;
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            int hashCode2 = (hashCode + (atumYogaLayoutDto == null ? 0 : atumYogaLayoutDto.hashCode())) * 31;
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            int hashCode3 = (hashCode2 + (atumAnyLayerDto == null ? 0 : atumAnyLayerDto.hashCode())) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode3 + (atumIdentityPropsDto != null ? atumIdentityPropsDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiIconButtonUniversalDto(kind=");
            sb.append(this.kind);
            sb.append(", props=");
            sb.append(this.props);
            sb.append(", yogaLayout=");
            sb.append(this.yogaLayout);
            sb.append(", anyLayer=");
            sb.append(this.anyLayer);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.kind.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            if (atumYogaLayoutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumYogaLayoutDto.writeToParcel(parcel, i);
            }
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            if (atumAnyLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumAnyLayerDto.writeToParcel(parcel, i);
            }
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiIconButtonUniversalDto(KindDto kindDto, AtumVkuiIconButtonPropsDto atumVkuiIconButtonPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.kind = kindDto;
            this.props = atumVkuiIconButtonPropsDto;
            this.yogaLayout = atumYogaLayoutDto;
            this.anyLayer = atumAnyLayerDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyViewDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiImageViewUniversalDto extends AtumAnyViewDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiImageViewUniversalDto> CREATOR = new a();

        @pmi0("any_layer")
        private final AtumAnyLayerDto anyLayer;

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("props")
        private final AtumVkuiImageViewPropsDto props;

        @pmi0("yoga_layout")
        private final AtumYogaLayoutDto yogaLayout;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyViewDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;

            @pmi0("AtumVKUIImage")
            public static final KindDto ATUMVKUIIMAGE;
            public static final Parcelable.Creator<KindDto> CREATOR;
            private final String value;

            /* compiled from: AtumAnyViewDto.kt */
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
                KindDto kindDto = new KindDto("ATUMVKUIIMAGE", 0, "AtumVKUIImage");
                ATUMVKUIIMAGE = kindDto;
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

        /* compiled from: AtumAnyViewDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiImageViewUniversalDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiImageViewUniversalDto createFromParcel(Parcel parcel) {
                return new AtumVkuiImageViewUniversalDto(KindDto.CREATOR.createFromParcel(parcel), AtumVkuiImageViewPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumYogaLayoutDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumAnyLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumIdentityPropsDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiImageViewUniversalDto[] newArray(int i) {
                return new AtumVkuiImageViewUniversalDto[i];
            }
        }

        public /* synthetic */ AtumVkuiImageViewUniversalDto(KindDto kindDto, AtumVkuiImageViewPropsDto atumVkuiImageViewPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(kindDto, atumVkuiImageViewPropsDto, (i & 4) != 0 ? null : atumYogaLayoutDto, (i & 8) != 0 ? null : atumAnyLayerDto, (i & 16) != 0 ? null : atumIdentityPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiImageViewUniversalDto)) {
                return false;
            }
            AtumVkuiImageViewUniversalDto atumVkuiImageViewUniversalDto = (AtumVkuiImageViewUniversalDto) obj;
            return this.kind == atumVkuiImageViewUniversalDto.kind && epx.f(this.props, atumVkuiImageViewUniversalDto.props) && epx.f(this.yogaLayout, atumVkuiImageViewUniversalDto.yogaLayout) && epx.f(this.anyLayer, atumVkuiImageViewUniversalDto.anyLayer) && epx.f(this.objId, atumVkuiImageViewUniversalDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.props.hashCode() + (this.kind.hashCode() * 31)) * 31;
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            int hashCode2 = (hashCode + (atumYogaLayoutDto == null ? 0 : atumYogaLayoutDto.hashCode())) * 31;
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            int hashCode3 = (hashCode2 + (atumAnyLayerDto == null ? 0 : atumAnyLayerDto.hashCode())) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode3 + (atumIdentityPropsDto != null ? atumIdentityPropsDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiImageViewUniversalDto(kind=");
            sb.append(this.kind);
            sb.append(", props=");
            sb.append(this.props);
            sb.append(", yogaLayout=");
            sb.append(this.yogaLayout);
            sb.append(", anyLayer=");
            sb.append(this.anyLayer);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.kind.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            if (atumYogaLayoutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumYogaLayoutDto.writeToParcel(parcel, i);
            }
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            if (atumAnyLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumAnyLayerDto.writeToParcel(parcel, i);
            }
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiImageViewUniversalDto(KindDto kindDto, AtumVkuiImageViewPropsDto atumVkuiImageViewPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.kind = kindDto;
            this.props = atumVkuiImageViewPropsDto;
            this.yogaLayout = atumYogaLayoutDto;
            this.anyLayer = atumAnyLayerDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyViewDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiLabelUniversalDto extends AtumAnyViewDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiLabelUniversalDto> CREATOR = new a();

        @pmi0("any_layer")
        private final AtumAnyLayerDto anyLayer;

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("props")
        private final AtumVkuiLabelPropsDto props;

        @pmi0("yoga_layout")
        private final AtumYogaLayoutDto yogaLayout;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyViewDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;

            @pmi0("AtumVKUILabel")
            public static final KindDto ATUMVKUILABEL;
            public static final Parcelable.Creator<KindDto> CREATOR;
            private final String value;

            /* compiled from: AtumAnyViewDto.kt */
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
                KindDto kindDto = new KindDto("ATUMVKUILABEL", 0, "AtumVKUILabel");
                ATUMVKUILABEL = kindDto;
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

        /* compiled from: AtumAnyViewDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiLabelUniversalDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiLabelUniversalDto createFromParcel(Parcel parcel) {
                return new AtumVkuiLabelUniversalDto(KindDto.CREATOR.createFromParcel(parcel), AtumVkuiLabelPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumYogaLayoutDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumAnyLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumIdentityPropsDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiLabelUniversalDto[] newArray(int i) {
                return new AtumVkuiLabelUniversalDto[i];
            }
        }

        public /* synthetic */ AtumVkuiLabelUniversalDto(KindDto kindDto, AtumVkuiLabelPropsDto atumVkuiLabelPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(kindDto, atumVkuiLabelPropsDto, (i & 4) != 0 ? null : atumYogaLayoutDto, (i & 8) != 0 ? null : atumAnyLayerDto, (i & 16) != 0 ? null : atumIdentityPropsDto);
        }

        public final AtumVkuiLabelPropsDto d() {
            return this.props;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiLabelUniversalDto)) {
                return false;
            }
            AtumVkuiLabelUniversalDto atumVkuiLabelUniversalDto = (AtumVkuiLabelUniversalDto) obj;
            return this.kind == atumVkuiLabelUniversalDto.kind && epx.f(this.props, atumVkuiLabelUniversalDto.props) && epx.f(this.yogaLayout, atumVkuiLabelUniversalDto.yogaLayout) && epx.f(this.anyLayer, atumVkuiLabelUniversalDto.anyLayer) && epx.f(this.objId, atumVkuiLabelUniversalDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.props.hashCode() + (this.kind.hashCode() * 31)) * 31;
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            int hashCode2 = (hashCode + (atumYogaLayoutDto == null ? 0 : atumYogaLayoutDto.hashCode())) * 31;
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            int hashCode3 = (hashCode2 + (atumAnyLayerDto == null ? 0 : atumAnyLayerDto.hashCode())) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode3 + (atumIdentityPropsDto != null ? atumIdentityPropsDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiLabelUniversalDto(kind=");
            sb.append(this.kind);
            sb.append(", props=");
            sb.append(this.props);
            sb.append(", yogaLayout=");
            sb.append(this.yogaLayout);
            sb.append(", anyLayer=");
            sb.append(this.anyLayer);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.kind.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            if (atumYogaLayoutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumYogaLayoutDto.writeToParcel(parcel, i);
            }
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            if (atumAnyLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumAnyLayerDto.writeToParcel(parcel, i);
            }
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiLabelUniversalDto(KindDto kindDto, AtumVkuiLabelPropsDto atumVkuiLabelPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.kind = kindDto;
            this.props = atumVkuiLabelPropsDto;
            this.yogaLayout = atumYogaLayoutDto;
            this.anyLayer = atumAnyLayerDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyViewDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiPictureUniversalDto extends AtumAnyViewDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiPictureUniversalDto> CREATOR = new a();

        @pmi0("any_layer")
        private final AtumAnyLayerDto anyLayer;

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("props")
        private final AtumVkuiPicturePropsDto props;

        @pmi0("yoga_layout")
        private final AtumYogaLayoutDto yogaLayout;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyViewDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;

            @pmi0("AtumVKUIPicture")
            public static final KindDto ATUMVKUIPICTURE;
            public static final Parcelable.Creator<KindDto> CREATOR;
            private final String value;

            /* compiled from: AtumAnyViewDto.kt */
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
                KindDto kindDto = new KindDto("ATUMVKUIPICTURE", 0, "AtumVKUIPicture");
                ATUMVKUIPICTURE = kindDto;
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

        /* compiled from: AtumAnyViewDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiPictureUniversalDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiPictureUniversalDto createFromParcel(Parcel parcel) {
                return new AtumVkuiPictureUniversalDto(KindDto.CREATOR.createFromParcel(parcel), AtumVkuiPicturePropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumYogaLayoutDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumAnyLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumIdentityPropsDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiPictureUniversalDto[] newArray(int i) {
                return new AtumVkuiPictureUniversalDto[i];
            }
        }

        public /* synthetic */ AtumVkuiPictureUniversalDto(KindDto kindDto, AtumVkuiPicturePropsDto atumVkuiPicturePropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(kindDto, atumVkuiPicturePropsDto, (i & 4) != 0 ? null : atumYogaLayoutDto, (i & 8) != 0 ? null : atumAnyLayerDto, (i & 16) != 0 ? null : atumIdentityPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiPictureUniversalDto)) {
                return false;
            }
            AtumVkuiPictureUniversalDto atumVkuiPictureUniversalDto = (AtumVkuiPictureUniversalDto) obj;
            return this.kind == atumVkuiPictureUniversalDto.kind && epx.f(this.props, atumVkuiPictureUniversalDto.props) && epx.f(this.yogaLayout, atumVkuiPictureUniversalDto.yogaLayout) && epx.f(this.anyLayer, atumVkuiPictureUniversalDto.anyLayer) && epx.f(this.objId, atumVkuiPictureUniversalDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.props.hashCode() + (this.kind.hashCode() * 31)) * 31;
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            int hashCode2 = (hashCode + (atumYogaLayoutDto == null ? 0 : atumYogaLayoutDto.hashCode())) * 31;
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            int hashCode3 = (hashCode2 + (atumAnyLayerDto == null ? 0 : atumAnyLayerDto.hashCode())) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode3 + (atumIdentityPropsDto != null ? atumIdentityPropsDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiPictureUniversalDto(kind=");
            sb.append(this.kind);
            sb.append(", props=");
            sb.append(this.props);
            sb.append(", yogaLayout=");
            sb.append(this.yogaLayout);
            sb.append(", anyLayer=");
            sb.append(this.anyLayer);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.kind.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            if (atumYogaLayoutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumYogaLayoutDto.writeToParcel(parcel, i);
            }
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            if (atumAnyLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumAnyLayerDto.writeToParcel(parcel, i);
            }
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiPictureUniversalDto(KindDto kindDto, AtumVkuiPicturePropsDto atumVkuiPicturePropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.kind = kindDto;
            this.props = atumVkuiPicturePropsDto;
            this.yogaLayout = atumYogaLayoutDto;
            this.anyLayer = atumAnyLayerDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyViewDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiRemoteImageViewUniversalDto extends AtumAnyViewDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiRemoteImageViewUniversalDto> CREATOR = new a();

        @pmi0("any_layer")
        private final AtumAnyLayerDto anyLayer;

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("props")
        private final AtumVkuiRemoteImageViewPropsDto props;

        @pmi0("yoga_layout")
        private final AtumYogaLayoutDto yogaLayout;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyViewDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;

            @pmi0("AtumVKUIRemoteImage")
            public static final KindDto ATUMVKUIREMOTEIMAGE;
            public static final Parcelable.Creator<KindDto> CREATOR;
            private final String value;

            /* compiled from: AtumAnyViewDto.kt */
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
                KindDto kindDto = new KindDto("ATUMVKUIREMOTEIMAGE", 0, "AtumVKUIRemoteImage");
                ATUMVKUIREMOTEIMAGE = kindDto;
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

        /* compiled from: AtumAnyViewDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiRemoteImageViewUniversalDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiRemoteImageViewUniversalDto createFromParcel(Parcel parcel) {
                return new AtumVkuiRemoteImageViewUniversalDto(KindDto.CREATOR.createFromParcel(parcel), AtumVkuiRemoteImageViewPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumYogaLayoutDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumAnyLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumIdentityPropsDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiRemoteImageViewUniversalDto[] newArray(int i) {
                return new AtumVkuiRemoteImageViewUniversalDto[i];
            }
        }

        public /* synthetic */ AtumVkuiRemoteImageViewUniversalDto(KindDto kindDto, AtumVkuiRemoteImageViewPropsDto atumVkuiRemoteImageViewPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(kindDto, atumVkuiRemoteImageViewPropsDto, (i & 4) != 0 ? null : atumYogaLayoutDto, (i & 8) != 0 ? null : atumAnyLayerDto, (i & 16) != 0 ? null : atumIdentityPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiRemoteImageViewUniversalDto)) {
                return false;
            }
            AtumVkuiRemoteImageViewUniversalDto atumVkuiRemoteImageViewUniversalDto = (AtumVkuiRemoteImageViewUniversalDto) obj;
            return this.kind == atumVkuiRemoteImageViewUniversalDto.kind && epx.f(this.props, atumVkuiRemoteImageViewUniversalDto.props) && epx.f(this.yogaLayout, atumVkuiRemoteImageViewUniversalDto.yogaLayout) && epx.f(this.anyLayer, atumVkuiRemoteImageViewUniversalDto.anyLayer) && epx.f(this.objId, atumVkuiRemoteImageViewUniversalDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.props.hashCode() + (this.kind.hashCode() * 31)) * 31;
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            int hashCode2 = (hashCode + (atumYogaLayoutDto == null ? 0 : atumYogaLayoutDto.hashCode())) * 31;
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            int hashCode3 = (hashCode2 + (atumAnyLayerDto == null ? 0 : atumAnyLayerDto.hashCode())) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode3 + (atumIdentityPropsDto != null ? atumIdentityPropsDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiRemoteImageViewUniversalDto(kind=");
            sb.append(this.kind);
            sb.append(", props=");
            sb.append(this.props);
            sb.append(", yogaLayout=");
            sb.append(this.yogaLayout);
            sb.append(", anyLayer=");
            sb.append(this.anyLayer);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.kind.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            if (atumYogaLayoutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumYogaLayoutDto.writeToParcel(parcel, i);
            }
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            if (atumAnyLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumAnyLayerDto.writeToParcel(parcel, i);
            }
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiRemoteImageViewUniversalDto(KindDto kindDto, AtumVkuiRemoteImageViewPropsDto atumVkuiRemoteImageViewPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.kind = kindDto;
            this.props = atumVkuiRemoteImageViewPropsDto;
            this.yogaLayout = atumYogaLayoutDto;
            this.anyLayer = atumAnyLayerDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyViewDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiSeparatorUniversalDto extends AtumAnyViewDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiSeparatorUniversalDto> CREATOR = new a();

        @pmi0("any_layer")
        private final AtumAnyLayerDto anyLayer;

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("props")
        private final AtumVkuiSeparatorPropsDto props;

        @pmi0("yoga_layout")
        private final AtumYogaLayoutDto yogaLayout;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyViewDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;

            @pmi0("AtumVKUISeparator")
            public static final KindDto ATUMVKUISEPARATOR;
            public static final Parcelable.Creator<KindDto> CREATOR;
            private final String value;

            /* compiled from: AtumAnyViewDto.kt */
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
                KindDto kindDto = new KindDto("ATUMVKUISEPARATOR", 0, "AtumVKUISeparator");
                ATUMVKUISEPARATOR = kindDto;
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

        /* compiled from: AtumAnyViewDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiSeparatorUniversalDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSeparatorUniversalDto createFromParcel(Parcel parcel) {
                return new AtumVkuiSeparatorUniversalDto(KindDto.CREATOR.createFromParcel(parcel), AtumVkuiSeparatorPropsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumYogaLayoutDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumAnyLayerDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumIdentityPropsDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSeparatorUniversalDto[] newArray(int i) {
                return new AtumVkuiSeparatorUniversalDto[i];
            }
        }

        public /* synthetic */ AtumVkuiSeparatorUniversalDto(KindDto kindDto, AtumVkuiSeparatorPropsDto atumVkuiSeparatorPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(kindDto, atumVkuiSeparatorPropsDto, (i & 4) != 0 ? null : atumYogaLayoutDto, (i & 8) != 0 ? null : atumAnyLayerDto, (i & 16) != 0 ? null : atumIdentityPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiSeparatorUniversalDto)) {
                return false;
            }
            AtumVkuiSeparatorUniversalDto atumVkuiSeparatorUniversalDto = (AtumVkuiSeparatorUniversalDto) obj;
            return this.kind == atumVkuiSeparatorUniversalDto.kind && epx.f(this.props, atumVkuiSeparatorUniversalDto.props) && epx.f(this.yogaLayout, atumVkuiSeparatorUniversalDto.yogaLayout) && epx.f(this.anyLayer, atumVkuiSeparatorUniversalDto.anyLayer) && epx.f(this.objId, atumVkuiSeparatorUniversalDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.props.hashCode() + (this.kind.hashCode() * 31)) * 31;
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            int hashCode2 = (hashCode + (atumYogaLayoutDto == null ? 0 : atumYogaLayoutDto.hashCode())) * 31;
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            int hashCode3 = (hashCode2 + (atumAnyLayerDto == null ? 0 : atumAnyLayerDto.hashCode())) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode3 + (atumIdentityPropsDto != null ? atumIdentityPropsDto.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiSeparatorUniversalDto(kind=");
            sb.append(this.kind);
            sb.append(", props=");
            sb.append(this.props);
            sb.append(", yogaLayout=");
            sb.append(this.yogaLayout);
            sb.append(", anyLayer=");
            sb.append(this.anyLayer);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.kind.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
            AtumYogaLayoutDto atumYogaLayoutDto = this.yogaLayout;
            if (atumYogaLayoutDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumYogaLayoutDto.writeToParcel(parcel, i);
            }
            AtumAnyLayerDto atumAnyLayerDto = this.anyLayer;
            if (atumAnyLayerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumAnyLayerDto.writeToParcel(parcel, i);
            }
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiSeparatorUniversalDto(KindDto kindDto, AtumVkuiSeparatorPropsDto atumVkuiSeparatorPropsDto, AtumYogaLayoutDto atumYogaLayoutDto, AtumAnyLayerDto atumAnyLayerDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.kind = kindDto;
            this.props = atumVkuiSeparatorPropsDto;
            this.yogaLayout = atumYogaLayoutDto;
            this.anyLayer = atumAnyLayerDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyViewDto.kt */
    public static final class Deserializer implements a9y<AtumAnyViewDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, RTCStatsConstants.KEY_KIND);
            if (f != null) {
                switch (f.hashCode()) {
                    case -2041332354:
                        if (f.equals("AtumVKUIContentBadge")) {
                            return (AtumAnyViewDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiContentBadgeUniversalDto.class);
                        }
                        break;
                    case -797943585:
                        if (f.equals("AtumVKUIIconButton")) {
                            return (AtumAnyViewDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiIconButtonUniversalDto.class);
                        }
                        break;
                    case -656871583:
                        if (f.equals("AtumVKUIRemoteImage")) {
                            return (AtumAnyViewDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiRemoteImageViewUniversalDto.class);
                        }
                        break;
                    case -537210067:
                        if (f.equals("AtumVKUIAvatar")) {
                            return (AtumAnyViewDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiAvatarUniversalDto.class);
                        }
                        break;
                    case -508937978:
                        if (f.equals("AtumVKUIButton")) {
                            return (AtumAnyViewDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiButtonUniversalDto.class);
                        }
                        break;
                    case -352521119:
                        if (f.equals("AtumVKUIHeader")) {
                            return (AtumAnyViewDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiHeaderUniversalDto.class);
                        }
                        break;
                    case 2666181:
                        if (f.equals("View")) {
                            return (AtumAnyViewDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumViewDto.class);
                        }
                        break;
                    case 73174740:
                        if (f.equals("Label")) {
                            return (AtumAnyViewDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumLabelDto.class);
                        }
                        break;
                    case 583697834:
                        if (f.equals("AtumVKUIPicture")) {
                            return (AtumAnyViewDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiPictureUniversalDto.class);
                        }
                        break;
                    case 1125864064:
                        if (f.equals("ImageView")) {
                            return (AtumAnyViewDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumImageViewDto.class);
                        }
                        break;
                    case 1184600209:
                        if (f.equals("AtumVKUISeparator")) {
                            return (AtumAnyViewDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiSeparatorUniversalDto.class);
                        }
                        break;
                    case 1784086351:
                        if (f.equals("AtumVKUIBadge")) {
                            return (AtumAnyViewDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiBadgeUniversalDto.class);
                        }
                        break;
                    case 1790905607:
                        if (f.equals("AtumVKUIImage")) {
                            return (AtumAnyViewDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiImageViewUniversalDto.class);
                        }
                        break;
                    case 1793319584:
                        if (f.equals("AtumVKUILabel")) {
                            return (AtumAnyViewDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiLabelUniversalDto.class);
                        }
                        break;
                    case 2001146706:
                        if (f.equals("Button")) {
                            return (AtumAnyViewDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumButtonDto.class);
                        }
                        break;
                    case 2119270056:
                        if (f.equals("AtumVKUICounter")) {
                            return (AtumAnyViewDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiCounterUniversalDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    public /* synthetic */ AtumAnyViewDto(zcl zclVar) {
        this();
    }

    private AtumAnyViewDto() {
    }
}

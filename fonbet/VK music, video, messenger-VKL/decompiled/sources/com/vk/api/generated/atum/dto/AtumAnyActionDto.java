package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
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

/* compiled from: AtumAnyActionDto.kt */
/* loaded from: classes.dex */
public abstract class AtumAnyActionDto implements Parcelable {

    /* compiled from: AtumAnyActionDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumAlertActionDto extends AtumAnyActionDto implements Parcelable {
        public static final Parcelable.Creator<AtumAlertActionDto> CREATOR = new a();

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("params")
        private final AtumAlertActionParametersDto params;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyActionDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;

            @pmi0("AlertAction")
            public static final KindDto ALERTACTION;
            public static final Parcelable.Creator<KindDto> CREATOR;
            private final String value;

            /* compiled from: AtumAnyActionDto.kt */
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
                KindDto kindDto = new KindDto("ALERTACTION", 0, "AlertAction");
                ALERTACTION = kindDto;
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

        /* compiled from: AtumAnyActionDto.kt */
        public static final class a implements Parcelable.Creator<AtumAlertActionDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumAlertActionDto createFromParcel(Parcel parcel) {
                return new AtumAlertActionDto(AtumAlertActionParametersDto.CREATOR.createFromParcel(parcel), KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumIdentityPropsDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumAlertActionDto[] newArray(int i) {
                return new AtumAlertActionDto[i];
            }
        }

        public /* synthetic */ AtumAlertActionDto(AtumAlertActionParametersDto atumAlertActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(atumAlertActionParametersDto, kindDto, (i & 4) != 0 ? null : atumIdentityPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumAlertActionDto)) {
                return false;
            }
            AtumAlertActionDto atumAlertActionDto = (AtumAlertActionDto) obj;
            return epx.f(this.params, atumAlertActionDto.params) && this.kind == atumAlertActionDto.kind && epx.f(this.objId, atumAlertActionDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.kind.hashCode() + (this.params.hashCode() * 31)) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode + (atumIdentityPropsDto == null ? 0 : atumIdentityPropsDto.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumAlertActionDto(params=");
            sb.append(this.params);
            sb.append(", kind=");
            sb.append(this.kind);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.params.writeToParcel(parcel, i);
            this.kind.writeToParcel(parcel, i);
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumAlertActionDto(AtumAlertActionParametersDto atumAlertActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.params = atumAlertActionParametersDto;
            this.kind = kindDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyActionDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumNavigationActionDto extends AtumAnyActionDto implements Parcelable {
        public static final Parcelable.Creator<AtumNavigationActionDto> CREATOR = new a();

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("params")
        private final AtumNavigationActionParametersDto params;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyActionDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;
            public static final Parcelable.Creator<KindDto> CREATOR;

            @pmi0("NavigationAction")
            public static final KindDto NAVIGATIONACTION;
            private final String value;

            /* compiled from: AtumAnyActionDto.kt */
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
                KindDto kindDto = new KindDto("NAVIGATIONACTION", 0, "NavigationAction");
                NAVIGATIONACTION = kindDto;
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

        /* compiled from: AtumAnyActionDto.kt */
        public static final class a implements Parcelable.Creator<AtumNavigationActionDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumNavigationActionDto createFromParcel(Parcel parcel) {
                return new AtumNavigationActionDto(AtumNavigationActionParametersDto.CREATOR.createFromParcel(parcel), KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumIdentityPropsDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumNavigationActionDto[] newArray(int i) {
                return new AtumNavigationActionDto[i];
            }
        }

        public /* synthetic */ AtumNavigationActionDto(AtumNavigationActionParametersDto atumNavigationActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(atumNavigationActionParametersDto, kindDto, (i & 4) != 0 ? null : atumIdentityPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumNavigationActionDto)) {
                return false;
            }
            AtumNavigationActionDto atumNavigationActionDto = (AtumNavigationActionDto) obj;
            return epx.f(this.params, atumNavigationActionDto.params) && this.kind == atumNavigationActionDto.kind && epx.f(this.objId, atumNavigationActionDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.kind.hashCode() + (this.params.hashCode() * 31)) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode + (atumIdentityPropsDto == null ? 0 : atumIdentityPropsDto.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumNavigationActionDto(params=");
            sb.append(this.params);
            sb.append(", kind=");
            sb.append(this.kind);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.params.writeToParcel(parcel, i);
            this.kind.writeToParcel(parcel, i);
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumNavigationActionDto(AtumNavigationActionParametersDto atumNavigationActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.params = atumNavigationActionParametersDto;
            this.kind = kindDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyActionDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumOpenUrlActionDto extends AtumAnyActionDto implements Parcelable {
        public static final Parcelable.Creator<AtumOpenUrlActionDto> CREATOR = new a();

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("params")
        private final AtumOpenUrlActionParametersDto params;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyActionDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;
            public static final Parcelable.Creator<KindDto> CREATOR;

            @pmi0("OpenUrlAction")
            public static final KindDto OPENURLACTION;
            private final String value;

            /* compiled from: AtumAnyActionDto.kt */
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
                KindDto kindDto = new KindDto("OPENURLACTION", 0, "OpenUrlAction");
                OPENURLACTION = kindDto;
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

        /* compiled from: AtumAnyActionDto.kt */
        public static final class a implements Parcelable.Creator<AtumOpenUrlActionDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumOpenUrlActionDto createFromParcel(Parcel parcel) {
                return new AtumOpenUrlActionDto(AtumOpenUrlActionParametersDto.CREATOR.createFromParcel(parcel), KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumIdentityPropsDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumOpenUrlActionDto[] newArray(int i) {
                return new AtumOpenUrlActionDto[i];
            }
        }

        public /* synthetic */ AtumOpenUrlActionDto(AtumOpenUrlActionParametersDto atumOpenUrlActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(atumOpenUrlActionParametersDto, kindDto, (i & 4) != 0 ? null : atumIdentityPropsDto);
        }

        public final AtumOpenUrlActionParametersDto d() {
            return this.params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumOpenUrlActionDto)) {
                return false;
            }
            AtumOpenUrlActionDto atumOpenUrlActionDto = (AtumOpenUrlActionDto) obj;
            return epx.f(this.params, atumOpenUrlActionDto.params) && this.kind == atumOpenUrlActionDto.kind && epx.f(this.objId, atumOpenUrlActionDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.kind.hashCode() + (this.params.hashCode() * 31)) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode + (atumIdentityPropsDto == null ? 0 : atumIdentityPropsDto.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumOpenUrlActionDto(params=");
            sb.append(this.params);
            sb.append(", kind=");
            sb.append(this.kind);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.params.writeToParcel(parcel, i);
            this.kind.writeToParcel(parcel, i);
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumOpenUrlActionDto(AtumOpenUrlActionParametersDto atumOpenUrlActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.params = atumOpenUrlActionParametersDto;
            this.kind = kindDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyActionDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumRepositoryUpdateActionDto extends AtumAnyActionDto implements Parcelable {
        public static final Parcelable.Creator<AtumRepositoryUpdateActionDto> CREATOR = new a();

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("params")
        private final AtumRepositoryUpdateActionParametersDto params;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyActionDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;
            public static final Parcelable.Creator<KindDto> CREATOR;

            @pmi0("RepositoryUpdateAction")
            public static final KindDto REPOSITORYUPDATEACTION;
            private final String value;

            /* compiled from: AtumAnyActionDto.kt */
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
                KindDto kindDto = new KindDto("REPOSITORYUPDATEACTION", 0, "RepositoryUpdateAction");
                REPOSITORYUPDATEACTION = kindDto;
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

        /* compiled from: AtumAnyActionDto.kt */
        public static final class a implements Parcelable.Creator<AtumRepositoryUpdateActionDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumRepositoryUpdateActionDto createFromParcel(Parcel parcel) {
                return new AtumRepositoryUpdateActionDto(AtumRepositoryUpdateActionParametersDto.CREATOR.createFromParcel(parcel), KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumIdentityPropsDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumRepositoryUpdateActionDto[] newArray(int i) {
                return new AtumRepositoryUpdateActionDto[i];
            }
        }

        public /* synthetic */ AtumRepositoryUpdateActionDto(AtumRepositoryUpdateActionParametersDto atumRepositoryUpdateActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(atumRepositoryUpdateActionParametersDto, kindDto, (i & 4) != 0 ? null : atumIdentityPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumRepositoryUpdateActionDto)) {
                return false;
            }
            AtumRepositoryUpdateActionDto atumRepositoryUpdateActionDto = (AtumRepositoryUpdateActionDto) obj;
            return epx.f(this.params, atumRepositoryUpdateActionDto.params) && this.kind == atumRepositoryUpdateActionDto.kind && epx.f(this.objId, atumRepositoryUpdateActionDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.kind.hashCode() + (this.params.hashCode() * 31)) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode + (atumIdentityPropsDto == null ? 0 : atumIdentityPropsDto.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumRepositoryUpdateActionDto(params=");
            sb.append(this.params);
            sb.append(", kind=");
            sb.append(this.kind);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.params.writeToParcel(parcel, i);
            this.kind.writeToParcel(parcel, i);
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumRepositoryUpdateActionDto(AtumRepositoryUpdateActionParametersDto atumRepositoryUpdateActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.params = atumRepositoryUpdateActionParametersDto;
            this.kind = kindDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyActionDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumTypeActionActionDto extends AtumAnyActionDto implements Parcelable {
        public static final Parcelable.Creator<AtumTypeActionActionDto> CREATOR = new a();

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("params")
        private final AtumTypeActionActionParametersDto params;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyActionDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;
            public static final Parcelable.Creator<KindDto> CREATOR;

            @pmi0("TypeActionAction")
            public static final KindDto TYPEACTIONACTION;
            private final String value;

            /* compiled from: AtumAnyActionDto.kt */
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
                KindDto kindDto = new KindDto("TYPEACTIONACTION", 0, "TypeActionAction");
                TYPEACTIONACTION = kindDto;
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

        /* compiled from: AtumAnyActionDto.kt */
        public static final class a implements Parcelable.Creator<AtumTypeActionActionDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumTypeActionActionDto createFromParcel(Parcel parcel) {
                return new AtumTypeActionActionDto(AtumTypeActionActionParametersDto.CREATOR.createFromParcel(parcel), KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumIdentityPropsDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumTypeActionActionDto[] newArray(int i) {
                return new AtumTypeActionActionDto[i];
            }
        }

        public /* synthetic */ AtumTypeActionActionDto(AtumTypeActionActionParametersDto atumTypeActionActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(atumTypeActionActionParametersDto, kindDto, (i & 4) != 0 ? null : atumIdentityPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumTypeActionActionDto)) {
                return false;
            }
            AtumTypeActionActionDto atumTypeActionActionDto = (AtumTypeActionActionDto) obj;
            return epx.f(this.params, atumTypeActionActionDto.params) && this.kind == atumTypeActionActionDto.kind && epx.f(this.objId, atumTypeActionActionDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.kind.hashCode() + (this.params.hashCode() * 31)) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode + (atumIdentityPropsDto == null ? 0 : atumIdentityPropsDto.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumTypeActionActionDto(params=");
            sb.append(this.params);
            sb.append(", kind=");
            sb.append(this.kind);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.params.writeToParcel(parcel, i);
            this.kind.writeToParcel(parcel, i);
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumTypeActionActionDto(AtumTypeActionActionParametersDto atumTypeActionActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.params = atumTypeActionActionParametersDto;
            this.kind = kindDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyActionDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumTypeClickActionDto extends AtumAnyActionDto implements Parcelable {
        public static final Parcelable.Creator<AtumTypeClickActionDto> CREATOR = new a();

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("params")
        private final AtumTypeClickActionParametersDto params;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyActionDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;
            public static final Parcelable.Creator<KindDto> CREATOR;

            @pmi0("TypeClickAction")
            public static final KindDto TYPECLICKACTION;
            private final String value;

            /* compiled from: AtumAnyActionDto.kt */
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
                KindDto kindDto = new KindDto("TYPECLICKACTION", 0, "TypeClickAction");
                TYPECLICKACTION = kindDto;
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

        /* compiled from: AtumAnyActionDto.kt */
        public static final class a implements Parcelable.Creator<AtumTypeClickActionDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumTypeClickActionDto createFromParcel(Parcel parcel) {
                return new AtumTypeClickActionDto(AtumTypeClickActionParametersDto.CREATOR.createFromParcel(parcel), KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumIdentityPropsDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumTypeClickActionDto[] newArray(int i) {
                return new AtumTypeClickActionDto[i];
            }
        }

        public /* synthetic */ AtumTypeClickActionDto(AtumTypeClickActionParametersDto atumTypeClickActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(atumTypeClickActionParametersDto, kindDto, (i & 4) != 0 ? null : atumIdentityPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumTypeClickActionDto)) {
                return false;
            }
            AtumTypeClickActionDto atumTypeClickActionDto = (AtumTypeClickActionDto) obj;
            return epx.f(this.params, atumTypeClickActionDto.params) && this.kind == atumTypeClickActionDto.kind && epx.f(this.objId, atumTypeClickActionDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.kind.hashCode() + (this.params.hashCode() * 31)) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode + (atumIdentityPropsDto == null ? 0 : atumIdentityPropsDto.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumTypeClickActionDto(params=");
            sb.append(this.params);
            sb.append(", kind=");
            sb.append(this.kind);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.params.writeToParcel(parcel, i);
            this.kind.writeToParcel(parcel, i);
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumTypeClickActionDto(AtumTypeClickActionParametersDto atumTypeClickActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.params = atumTypeClickActionParametersDto;
            this.kind = kindDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyActionDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkApiRequestActionDto extends AtumAnyActionDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkApiRequestActionDto> CREATOR = new a();

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("params")
        private final AtumVkApiRequestActionParametersDto params;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyActionDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;
            public static final Parcelable.Creator<KindDto> CREATOR;

            @pmi0("VKAPIRequestAction")
            public static final KindDto VKAPIREQUESTACTION;
            private final String value;

            /* compiled from: AtumAnyActionDto.kt */
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
                KindDto kindDto = new KindDto("VKAPIREQUESTACTION", 0, "VKAPIRequestAction");
                VKAPIREQUESTACTION = kindDto;
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

        /* compiled from: AtumAnyActionDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkApiRequestActionDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkApiRequestActionDto createFromParcel(Parcel parcel) {
                return new AtumVkApiRequestActionDto(AtumVkApiRequestActionParametersDto.CREATOR.createFromParcel(parcel), KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumIdentityPropsDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkApiRequestActionDto[] newArray(int i) {
                return new AtumVkApiRequestActionDto[i];
            }
        }

        public /* synthetic */ AtumVkApiRequestActionDto(AtumVkApiRequestActionParametersDto atumVkApiRequestActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(atumVkApiRequestActionParametersDto, kindDto, (i & 4) != 0 ? null : atumIdentityPropsDto);
        }

        public final AtumVkApiRequestActionParametersDto d() {
            return this.params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkApiRequestActionDto)) {
                return false;
            }
            AtumVkApiRequestActionDto atumVkApiRequestActionDto = (AtumVkApiRequestActionDto) obj;
            return epx.f(this.params, atumVkApiRequestActionDto.params) && this.kind == atumVkApiRequestActionDto.kind && epx.f(this.objId, atumVkApiRequestActionDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.kind.hashCode() + (this.params.hashCode() * 31)) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode + (atumIdentityPropsDto == null ? 0 : atumIdentityPropsDto.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkApiRequestActionDto(params=");
            sb.append(this.params);
            sb.append(", kind=");
            sb.append(this.kind);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.params.writeToParcel(parcel, i);
            this.kind.writeToParcel(parcel, i);
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkApiRequestActionDto(AtumVkApiRequestActionParametersDto atumVkApiRequestActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.params = atumVkApiRequestActionParametersDto;
            this.kind = kindDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyActionDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiSnackbarActionDto extends AtumAnyActionDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiSnackbarActionDto> CREATOR = new a();

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("params")
        private final AtumVkuiSnackbarActionParametersDto params;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyActionDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;
            public static final Parcelable.Creator<KindDto> CREATOR;

            @pmi0("VKUISnackbarAction")
            public static final KindDto VKUISNACKBARACTION;
            private final String value;

            /* compiled from: AtumAnyActionDto.kt */
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
                KindDto kindDto = new KindDto("VKUISNACKBARACTION", 0, "VKUISnackbarAction");
                VKUISNACKBARACTION = kindDto;
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

        /* compiled from: AtumAnyActionDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiSnackbarActionDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSnackbarActionDto createFromParcel(Parcel parcel) {
                return new AtumVkuiSnackbarActionDto(AtumVkuiSnackbarActionParametersDto.CREATOR.createFromParcel(parcel), KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumIdentityPropsDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSnackbarActionDto[] newArray(int i) {
                return new AtumVkuiSnackbarActionDto[i];
            }
        }

        public /* synthetic */ AtumVkuiSnackbarActionDto(AtumVkuiSnackbarActionParametersDto atumVkuiSnackbarActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(atumVkuiSnackbarActionParametersDto, kindDto, (i & 4) != 0 ? null : atumIdentityPropsDto);
        }

        public final AtumVkuiSnackbarActionParametersDto d() {
            return this.params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiSnackbarActionDto)) {
                return false;
            }
            AtumVkuiSnackbarActionDto atumVkuiSnackbarActionDto = (AtumVkuiSnackbarActionDto) obj;
            return epx.f(this.params, atumVkuiSnackbarActionDto.params) && this.kind == atumVkuiSnackbarActionDto.kind && epx.f(this.objId, atumVkuiSnackbarActionDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.kind.hashCode() + (this.params.hashCode() * 31)) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode + (atumIdentityPropsDto == null ? 0 : atumIdentityPropsDto.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiSnackbarActionDto(params=");
            sb.append(this.params);
            sb.append(", kind=");
            sb.append(this.kind);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.params.writeToParcel(parcel, i);
            this.kind.writeToParcel(parcel, i);
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiSnackbarActionDto(AtumVkuiSnackbarActionParametersDto atumVkuiSnackbarActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.params = atumVkuiSnackbarActionParametersDto;
            this.kind = kindDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyActionDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiSuperAppHideActionDto extends AtumAnyActionDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiSuperAppHideActionDto> CREATOR = new a();

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("params")
        private final AtumVkuiSuperAppHideActionParametersDto params;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyActionDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;
            public static final Parcelable.Creator<KindDto> CREATOR;

            @pmi0("VKUISuperAppHideAction")
            public static final KindDto VKUISUPERAPPHIDEACTION;
            private final String value;

            /* compiled from: AtumAnyActionDto.kt */
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
                KindDto kindDto = new KindDto("VKUISUPERAPPHIDEACTION", 0, "VKUISuperAppHideAction");
                VKUISUPERAPPHIDEACTION = kindDto;
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

        /* compiled from: AtumAnyActionDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiSuperAppHideActionDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSuperAppHideActionDto createFromParcel(Parcel parcel) {
                return new AtumVkuiSuperAppHideActionDto(AtumVkuiSuperAppHideActionParametersDto.CREATOR.createFromParcel(parcel), KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumIdentityPropsDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSuperAppHideActionDto[] newArray(int i) {
                return new AtumVkuiSuperAppHideActionDto[i];
            }
        }

        public /* synthetic */ AtumVkuiSuperAppHideActionDto(AtumVkuiSuperAppHideActionParametersDto atumVkuiSuperAppHideActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(atumVkuiSuperAppHideActionParametersDto, kindDto, (i & 4) != 0 ? null : atumIdentityPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiSuperAppHideActionDto)) {
                return false;
            }
            AtumVkuiSuperAppHideActionDto atumVkuiSuperAppHideActionDto = (AtumVkuiSuperAppHideActionDto) obj;
            return epx.f(this.params, atumVkuiSuperAppHideActionDto.params) && this.kind == atumVkuiSuperAppHideActionDto.kind && epx.f(this.objId, atumVkuiSuperAppHideActionDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.kind.hashCode() + (this.params.hashCode() * 31)) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode + (atumIdentityPropsDto == null ? 0 : atumIdentityPropsDto.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiSuperAppHideActionDto(params=");
            sb.append(this.params);
            sb.append(", kind=");
            sb.append(this.kind);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.params.writeToParcel(parcel, i);
            this.kind.writeToParcel(parcel, i);
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiSuperAppHideActionDto(AtumVkuiSuperAppHideActionParametersDto atumVkuiSuperAppHideActionParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.params = atumVkuiSuperAppHideActionParametersDto;
            this.kind = kindDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyActionDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiSuperAppTypeClickActionDto extends AtumAnyActionDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiSuperAppTypeClickActionDto> CREATOR = new a();

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("params")
        private final AtumVkuiSuperAppTypeStatsParametersDto params;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyActionDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;
            public static final Parcelable.Creator<KindDto> CREATOR;

            @pmi0("VKUISuperAppTypeClickAction")
            public static final KindDto VKUISUPERAPPTYPECLICKACTION;
            private final String value;

            /* compiled from: AtumAnyActionDto.kt */
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
                KindDto kindDto = new KindDto("VKUISUPERAPPTYPECLICKACTION", 0, "VKUISuperAppTypeClickAction");
                VKUISUPERAPPTYPECLICKACTION = kindDto;
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

        /* compiled from: AtumAnyActionDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiSuperAppTypeClickActionDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSuperAppTypeClickActionDto createFromParcel(Parcel parcel) {
                return new AtumVkuiSuperAppTypeClickActionDto(AtumVkuiSuperAppTypeStatsParametersDto.CREATOR.createFromParcel(parcel), KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumIdentityPropsDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSuperAppTypeClickActionDto[] newArray(int i) {
                return new AtumVkuiSuperAppTypeClickActionDto[i];
            }
        }

        public /* synthetic */ AtumVkuiSuperAppTypeClickActionDto(AtumVkuiSuperAppTypeStatsParametersDto atumVkuiSuperAppTypeStatsParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(atumVkuiSuperAppTypeStatsParametersDto, kindDto, (i & 4) != 0 ? null : atumIdentityPropsDto);
        }

        public final AtumVkuiSuperAppTypeStatsParametersDto d() {
            return this.params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiSuperAppTypeClickActionDto)) {
                return false;
            }
            AtumVkuiSuperAppTypeClickActionDto atumVkuiSuperAppTypeClickActionDto = (AtumVkuiSuperAppTypeClickActionDto) obj;
            return epx.f(this.params, atumVkuiSuperAppTypeClickActionDto.params) && this.kind == atumVkuiSuperAppTypeClickActionDto.kind && epx.f(this.objId, atumVkuiSuperAppTypeClickActionDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.kind.hashCode() + (this.params.hashCode() * 31)) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode + (atumIdentityPropsDto == null ? 0 : atumIdentityPropsDto.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiSuperAppTypeClickActionDto(params=");
            sb.append(this.params);
            sb.append(", kind=");
            sb.append(this.kind);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.params.writeToParcel(parcel, i);
            this.kind.writeToParcel(parcel, i);
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiSuperAppTypeClickActionDto(AtumVkuiSuperAppTypeStatsParametersDto atumVkuiSuperAppTypeStatsParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.params = atumVkuiSuperAppTypeStatsParametersDto;
            this.kind = kindDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyActionDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiSuperAppTypeNavgoActionDto extends AtumAnyActionDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiSuperAppTypeNavgoActionDto> CREATOR = new a();

        @pmi0(RTCStatsConstants.KEY_KIND)
        private final KindDto kind;

        @pmi0("obj_id")
        private final AtumIdentityPropsDto objId;

        @pmi0("params")
        private final AtumVkuiSuperAppTypeStatsParametersDto params;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumAnyActionDto.kt */
        public static final class KindDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ KindDto[] $VALUES;
            public static final Parcelable.Creator<KindDto> CREATOR;

            @pmi0("VKUISuperAppTypeNavGoAction")
            public static final KindDto VKUISUPERAPPTYPENAVGOACTION;
            private final String value;

            /* compiled from: AtumAnyActionDto.kt */
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
                KindDto kindDto = new KindDto("VKUISUPERAPPTYPENAVGOACTION", 0, "VKUISuperAppTypeNavGoAction");
                VKUISUPERAPPTYPENAVGOACTION = kindDto;
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

        /* compiled from: AtumAnyActionDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiSuperAppTypeNavgoActionDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSuperAppTypeNavgoActionDto createFromParcel(Parcel parcel) {
                return new AtumVkuiSuperAppTypeNavgoActionDto(AtumVkuiSuperAppTypeStatsParametersDto.CREATOR.createFromParcel(parcel), KindDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumIdentityPropsDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSuperAppTypeNavgoActionDto[] newArray(int i) {
                return new AtumVkuiSuperAppTypeNavgoActionDto[i];
            }
        }

        public /* synthetic */ AtumVkuiSuperAppTypeNavgoActionDto(AtumVkuiSuperAppTypeStatsParametersDto atumVkuiSuperAppTypeStatsParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto, int i, zcl zclVar) {
            this(atumVkuiSuperAppTypeStatsParametersDto, kindDto, (i & 4) != 0 ? null : atumIdentityPropsDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiSuperAppTypeNavgoActionDto)) {
                return false;
            }
            AtumVkuiSuperAppTypeNavgoActionDto atumVkuiSuperAppTypeNavgoActionDto = (AtumVkuiSuperAppTypeNavgoActionDto) obj;
            return epx.f(this.params, atumVkuiSuperAppTypeNavgoActionDto.params) && this.kind == atumVkuiSuperAppTypeNavgoActionDto.kind && epx.f(this.objId, atumVkuiSuperAppTypeNavgoActionDto.objId);
        }

        public final int hashCode() {
            int hashCode = (this.kind.hashCode() + (this.params.hashCode() * 31)) * 31;
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            return hashCode + (atumIdentityPropsDto == null ? 0 : atumIdentityPropsDto.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiSuperAppTypeNavgoActionDto(params=");
            sb.append(this.params);
            sb.append(", kind=");
            sb.append(this.kind);
            sb.append(", objId=");
            return er.c(sb, this.objId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.params.writeToParcel(parcel, i);
            this.kind.writeToParcel(parcel, i);
            AtumIdentityPropsDto atumIdentityPropsDto = this.objId;
            if (atumIdentityPropsDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumIdentityPropsDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiSuperAppTypeNavgoActionDto(AtumVkuiSuperAppTypeStatsParametersDto atumVkuiSuperAppTypeStatsParametersDto, KindDto kindDto, AtumIdentityPropsDto atumIdentityPropsDto) {
            super(null);
            this.params = atumVkuiSuperAppTypeStatsParametersDto;
            this.kind = kindDto;
            this.objId = atumIdentityPropsDto;
        }
    }

    /* compiled from: AtumAnyActionDto.kt */
    public static final class Deserializer implements a9y<AtumAnyActionDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, RTCStatsConstants.KEY_KIND);
            if (f != null) {
                switch (f.hashCode()) {
                    case -1920225256:
                        if (f.equals("VKUISuperAppTypeNavGoAction")) {
                            return (AtumAnyActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiSuperAppTypeNavgoActionDto.class);
                        }
                        break;
                    case -1576173564:
                        if (f.equals("VKUISnackbarAction")) {
                            return (AtumAnyActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiSnackbarActionDto.class);
                        }
                        break;
                    case -1469172107:
                        if (f.equals("VKUISuperAppTypeClickAction")) {
                            return (AtumAnyActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiSuperAppTypeClickActionDto.class);
                        }
                        break;
                    case -1420490618:
                        if (f.equals("TypeActionAction")) {
                            return (AtumAnyActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumTypeActionActionDto.class);
                        }
                        break;
                    case -784388480:
                        if (f.equals("VKAPIRequestAction")) {
                            return (AtumAnyActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkApiRequestActionDto.class);
                        }
                        break;
                    case -257639109:
                        if (f.equals("OpenUrlAction")) {
                            return (AtumAnyActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumOpenUrlActionDto.class);
                        }
                        break;
                    case -181675638:
                        if (f.equals("NavigationAction")) {
                            return (AtumAnyActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumNavigationActionDto.class);
                        }
                        break;
                    case 188360338:
                        if (f.equals("AlertAction")) {
                            return (AtumAnyActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumAlertActionDto.class);
                        }
                        break;
                    case 622421225:
                        if (f.equals("RepositoryUpdateAction")) {
                            return (AtumAnyActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumRepositoryUpdateActionDto.class);
                        }
                        break;
                    case 872927780:
                        if (f.equals("TypeClickAction")) {
                            return (AtumAnyActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumTypeClickActionDto.class);
                        }
                        break;
                    case 1044846407:
                        if (f.equals("VKUISuperAppHideAction")) {
                            return (AtumAnyActionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiSuperAppHideActionDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    public /* synthetic */ AtumAnyActionDto(zcl zclVar) {
        this();
    }

    private AtumAnyActionDto() {
    }
}

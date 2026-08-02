package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetActionDto;
import io.appmetrica.analytics.impl.L2;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;
import xsna.zyk0;

/* compiled from: SuperAppShowcaseTileDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppShowcaseTileDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppShowcaseTileDto> CREATOR = new a();

    @pmi0("action")
    private final SuperAppUniversalWidgetActionDto action;

    @pmi0(L2.g)
    private final SuperAppShowcaseTileBackgroundDto background;

    @pmi0("badge_info")
    private final SuperAppShowcaseBadgeDto badgeInfo;

    @pmi0("foreground")
    private final List<SuperAppShowcaseTileForegroundDto> foreground;

    @pmi0("inner_type")
    private final InnerTypeDto innerType;

    @pmi0("is_enabled")
    private final Boolean isEnabled;

    @pmi0("is_unremovable")
    private final Boolean isUnremovable;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("uid")
    private final String uid;

    @pmi0("weight")
    private final float weight;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppShowcaseTileDto.kt */
    public static final class InnerTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InnerTypeDto[] $VALUES;
        public static final Parcelable.Creator<InnerTypeDto> CREATOR;

        @pmi0("tile")
        public static final InnerTypeDto TILE;
        private final String value;

        /* compiled from: SuperAppShowcaseTileDto.kt */
        public static final class a implements Parcelable.Creator<InnerTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto createFromParcel(Parcel parcel) {
                return InnerTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto[] newArray(int i) {
                return new InnerTypeDto[i];
            }
        }

        static {
            InnerTypeDto innerTypeDto = new InnerTypeDto("TILE", 0, "tile");
            TILE = innerTypeDto;
            InnerTypeDto[] innerTypeDtoArr = {innerTypeDto};
            $VALUES = innerTypeDtoArr;
            $ENTRIES = new asp(innerTypeDtoArr);
            CREATOR = new a();
        }

        private InnerTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static InnerTypeDto valueOf(String str) {
            return (InnerTypeDto) Enum.valueOf(InnerTypeDto.class, str);
        }

        public static InnerTypeDto[] values() {
            return (InnerTypeDto[]) $VALUES.clone();
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
    /* compiled from: SuperAppShowcaseTileDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("tile")
        public static final TypeDto TILE;
        private final String value;

        /* compiled from: SuperAppShowcaseTileDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("TILE", 0, "tile");
            TILE = typeDto;
            TypeDto[] typeDtoArr = {typeDto};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
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

    /* compiled from: SuperAppShowcaseTileDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseTileDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseTileDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            InnerTypeDto createFromParcel2 = InnerTypeDto.CREATOR.createFromParcel(parcel);
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseTileDto.class.getClassLoader());
            SuperAppShowcaseTileBackgroundDto superAppShowcaseTileBackgroundDto = (SuperAppShowcaseTileBackgroundDto) parcel.readParcelable(SuperAppShowcaseTileDto.class.getClassLoader());
            String readString = parcel.readString();
            float readFloat = parcel.readFloat();
            String readString2 = parcel.readString();
            int i = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = bo.b(SuperAppShowcaseTileDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new SuperAppShowcaseTileDto(createFromParcel, createFromParcel2, superAppUniversalWidgetActionDto, superAppShowcaseTileBackgroundDto, readString, readFloat, readString2, valueOf, valueOf2, arrayList, (SuperAppShowcaseBadgeDto) parcel.readParcelable(SuperAppShowcaseTileDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseTileDto[] newArray(int i) {
            return new SuperAppShowcaseTileDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppShowcaseTileDto(TypeDto typeDto, InnerTypeDto innerTypeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseTileBackgroundDto superAppShowcaseTileBackgroundDto, String str, float f, String str2, Boolean bool, Boolean bool2, List<? extends SuperAppShowcaseTileForegroundDto> list, SuperAppShowcaseBadgeDto superAppShowcaseBadgeDto) {
        this.type = typeDto;
        this.innerType = innerTypeDto;
        this.action = superAppUniversalWidgetActionDto;
        this.background = superAppShowcaseTileBackgroundDto;
        this.trackCode = str;
        this.weight = f;
        this.uid = str2;
        this.isEnabled = bool;
        this.isUnremovable = bool2;
        this.foreground = list;
        this.badgeInfo = superAppShowcaseBadgeDto;
    }

    public final SuperAppUniversalWidgetActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final SuperAppShowcaseTileBackgroundDto e() {
        return this.background;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppShowcaseTileDto)) {
            return false;
        }
        SuperAppShowcaseTileDto superAppShowcaseTileDto = (SuperAppShowcaseTileDto) obj;
        return this.type == superAppShowcaseTileDto.type && this.innerType == superAppShowcaseTileDto.innerType && epx.f(this.action, superAppShowcaseTileDto.action) && epx.f(this.background, superAppShowcaseTileDto.background) && epx.f(this.trackCode, superAppShowcaseTileDto.trackCode) && Float.compare(this.weight, superAppShowcaseTileDto.weight) == 0 && epx.f(this.uid, superAppShowcaseTileDto.uid) && epx.f(this.isEnabled, superAppShowcaseTileDto.isEnabled) && epx.f(this.isUnremovable, superAppShowcaseTileDto.isUnremovable) && epx.f(this.foreground, superAppShowcaseTileDto.foreground) && epx.f(this.badgeInfo, superAppShowcaseTileDto.badgeInfo);
    }

    public final SuperAppShowcaseBadgeDto f() {
        return this.badgeInfo;
    }

    public final List<SuperAppShowcaseTileForegroundDto> g() {
        return this.foreground;
    }

    public final int hashCode() {
        int a2 = b.a(this.weight, urd0.a((this.background.hashCode() + zyk0.a(this.action, (this.innerType.hashCode() + (this.type.hashCode() * 31)) * 31, 31)) * 31, 31, this.trackCode), 31);
        String str = this.uid;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isUnremovable;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<SuperAppShowcaseTileForegroundDto> list = this.foreground;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        SuperAppShowcaseBadgeDto superAppShowcaseBadgeDto = this.badgeInfo;
        return hashCode4 + (superAppShowcaseBadgeDto != null ? superAppShowcaseBadgeDto.hashCode() : 0);
    }

    public final String i() {
        return this.uid;
    }

    public final float j() {
        return this.weight;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "SuperAppShowcaseTileDto(type=" + this.type + ", innerType=" + this.innerType + ", action=" + this.action + ", background=" + this.background + ", trackCode=" + this.trackCode + ", weight=" + this.weight + ", uid=" + this.uid + ", isEnabled=" + this.isEnabled + ", isUnremovable=" + this.isUnremovable + ", foreground=" + this.foreground + ", badgeInfo=" + this.badgeInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        this.innerType.writeToParcel(parcel, i);
        parcel.writeParcelable(this.action, i);
        parcel.writeParcelable(this.background, i);
        parcel.writeString(this.trackCode);
        parcel.writeFloat(this.weight);
        parcel.writeString(this.uid);
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isUnremovable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        List<SuperAppShowcaseTileForegroundDto> list = this.foreground;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.badgeInfo, i);
    }

    public /* synthetic */ SuperAppShowcaseTileDto(TypeDto typeDto, InnerTypeDto innerTypeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseTileBackgroundDto superAppShowcaseTileBackgroundDto, String str, float f, String str2, Boolean bool, Boolean bool2, List list, SuperAppShowcaseBadgeDto superAppShowcaseBadgeDto, int i, zcl zclVar) {
        this(typeDto, innerTypeDto, superAppUniversalWidgetActionDto, superAppShowcaseTileBackgroundDto, str, f, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : superAppShowcaseBadgeDto);
    }
}

package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetActionDto;
import io.reactivex.rxjava3.subjects.b;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;
import xsna.zyk0;

/* compiled from: SuperAppShowcaseHalfTileDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppShowcaseHalfTileDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppShowcaseHalfTileDto> CREATOR = new a();

    @pmi0("action")
    private final SuperAppUniversalWidgetActionDto action;

    @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
    private final SuperAppShowcaseHalfTileContentDto content;

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
    /* compiled from: SuperAppShowcaseHalfTileDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("half_tile")
        public static final TypeDto HALF_TILE;
        private final String value;

        /* compiled from: SuperAppShowcaseHalfTileDto.kt */
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
            TypeDto typeDto = new TypeDto("HALF_TILE", 0, "half_tile");
            HALF_TILE = typeDto;
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

    /* compiled from: SuperAppShowcaseHalfTileDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseHalfTileDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseHalfTileDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseHalfTileDto.class.getClassLoader());
            SuperAppShowcaseHalfTileContentDto superAppShowcaseHalfTileContentDto = (SuperAppShowcaseHalfTileContentDto) parcel.readParcelable(SuperAppShowcaseHalfTileDto.class.getClassLoader());
            String readString = parcel.readString();
            float readFloat = parcel.readFloat();
            String readString2 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SuperAppShowcaseHalfTileDto(createFromParcel, superAppUniversalWidgetActionDto, superAppShowcaseHalfTileContentDto, readString, readFloat, readString2, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseHalfTileDto[] newArray(int i) {
            return new SuperAppShowcaseHalfTileDto[i];
        }
    }

    public SuperAppShowcaseHalfTileDto(TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseHalfTileContentDto superAppShowcaseHalfTileContentDto, String str, float f, String str2, Boolean bool, Boolean bool2) {
        this.type = typeDto;
        this.action = superAppUniversalWidgetActionDto;
        this.content = superAppShowcaseHalfTileContentDto;
        this.trackCode = str;
        this.weight = f;
        this.uid = str2;
        this.isEnabled = bool;
        this.isUnremovable = bool2;
    }

    public final SuperAppUniversalWidgetActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final SuperAppShowcaseHalfTileContentDto e() {
        return this.content;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppShowcaseHalfTileDto)) {
            return false;
        }
        SuperAppShowcaseHalfTileDto superAppShowcaseHalfTileDto = (SuperAppShowcaseHalfTileDto) obj;
        return this.type == superAppShowcaseHalfTileDto.type && epx.f(this.action, superAppShowcaseHalfTileDto.action) && epx.f(this.content, superAppShowcaseHalfTileDto.content) && epx.f(this.trackCode, superAppShowcaseHalfTileDto.trackCode) && Float.compare(this.weight, superAppShowcaseHalfTileDto.weight) == 0 && epx.f(this.uid, superAppShowcaseHalfTileDto.uid) && epx.f(this.isEnabled, superAppShowcaseHalfTileDto.isEnabled) && epx.f(this.isUnremovable, superAppShowcaseHalfTileDto.isUnremovable);
    }

    public final String f() {
        return this.uid;
    }

    public final float g() {
        return this.weight;
    }

    public final int hashCode() {
        int a2 = b.a(this.weight, urd0.a((this.content.hashCode() + zyk0.a(this.action, this.type.hashCode() * 31, 31)) * 31, 31, this.trackCode), 31);
        String str = this.uid;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isUnremovable;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppShowcaseHalfTileDto(type=");
        sb.append(this.type);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", isUnremovable=");
        return tn.a(sb, this.isUnremovable, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.action, i);
        parcel.writeParcelable(this.content, i);
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
    }

    public /* synthetic */ SuperAppShowcaseHalfTileDto(TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseHalfTileContentDto superAppShowcaseHalfTileContentDto, String str, float f, String str2, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(typeDto, superAppUniversalWidgetActionDto, superAppShowcaseHalfTileContentDto, str, f, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2);
    }
}

package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetActionDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageBlockDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageItemDto;
import io.appmetrica.analytics.impl.L2;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.ho8;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;
import xsna.zyk0;

/* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppShowcaseSectionGridItemDto implements Parcelable {

    /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
    public static final class Deserializer implements a9y<SuperAppShowcaseSectionGridItemDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -1953904281:
                        if (f.equals("section_scroll")) {
                            return (SuperAppShowcaseSectionGridItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseSectionScrollDto.class);
                        }
                        break;
                    case -1665174726:
                        if (f.equals("half_tile")) {
                            return (SuperAppShowcaseSectionGridItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseHalfTileDto.class);
                        }
                        break;
                    case -907680051:
                        if (f.equals("scroll")) {
                            return (SuperAppShowcaseSectionGridItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseScrollDto.class);
                        }
                        break;
                    case 3560110:
                        if (f.equals("tile")) {
                            return (SuperAppShowcaseSectionGridItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseTileDto.class);
                        }
                        break;
                    case 106940687:
                        if (f.equals(NotificationCompat.CATEGORY_PROMO)) {
                            return (SuperAppShowcaseSectionGridItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcasePromoDto.class);
                        }
                        break;
                    case 1500114051:
                        if (f.equals("subscribe_tile")) {
                            return (SuperAppShowcaseSectionGridItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseSubscribeTileDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseHalfTileDto extends SuperAppShowcaseSectionGridItemDto implements Parcelable {
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
        /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("half_tile")
            public static final TypeDto HALF_TILE;
            private final String value;

            /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
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

        /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
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

        public /* synthetic */ SuperAppShowcaseHalfTileDto(TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseHalfTileContentDto superAppShowcaseHalfTileContentDto, String str, float f, String str2, Boolean bool, Boolean bool2, int i, zcl zclVar) {
            this(typeDto, superAppUniversalWidgetActionDto, superAppShowcaseHalfTileContentDto, str, f, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
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

        public final int hashCode() {
            int a2 = b.a(this.weight, urd0.a((this.content.hashCode() + zyk0.a(this.action, this.type.hashCode() * 31, 31)) * 31, 31, this.trackCode), 31);
            String str = this.uid;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isEnabled;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isUnremovable;
            return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
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

        public SuperAppShowcaseHalfTileDto(TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseHalfTileContentDto superAppShowcaseHalfTileContentDto, String str, float f, String str2, Boolean bool, Boolean bool2) {
            super(null);
            this.type = typeDto;
            this.action = superAppUniversalWidgetActionDto;
            this.content = superAppShowcaseHalfTileContentDto;
            this.trackCode = str;
            this.weight = f;
            this.uid = str2;
            this.isEnabled = bool;
            this.isUnremovable = bool2;
        }
    }

    /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcasePromoDto extends SuperAppShowcaseSectionGridItemDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcasePromoDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("image")
        private final SuperAppShowcasePromoCardImageDto image;

        @pmi0("inner_type")
        private final InnerTypeDto innerType;

        @pmi0("is_enabled")
        private final Boolean isEnabled;

        @pmi0("is_unremovable")
        private final Boolean isUnremovable;

        @pmi0("state")
        private final String state;

        @pmi0("subtype")
        private final SubtypeDto subtype;

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
        /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
        public static final class InnerTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InnerTypeDto[] $VALUES;
            public static final Parcelable.Creator<InnerTypeDto> CREATOR;

            @pmi0(NotificationCompat.CATEGORY_PROMO)
            public static final InnerTypeDto PROMO;
            private final String value;

            /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
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
                InnerTypeDto innerTypeDto = new InnerTypeDto("PROMO", 0, NotificationCompat.CATEGORY_PROMO);
                PROMO = innerTypeDto;
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
        /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
        public static final class SubtypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ SubtypeDto[] $VALUES;

            @pmi0("card")
            public static final SubtypeDto CARD;
            public static final Parcelable.Creator<SubtypeDto> CREATOR;
            private final String value;

            /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
            public static final class a implements Parcelable.Creator<SubtypeDto> {
                @Override // android.os.Parcelable.Creator
                public final SubtypeDto createFromParcel(Parcel parcel) {
                    return SubtypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final SubtypeDto[] newArray(int i) {
                    return new SubtypeDto[i];
                }
            }

            static {
                SubtypeDto subtypeDto = new SubtypeDto("CARD", 0, "card");
                CARD = subtypeDto;
                SubtypeDto[] subtypeDtoArr = {subtypeDto};
                $VALUES = subtypeDtoArr;
                $ENTRIES = new asp(subtypeDtoArr);
                CREATOR = new a();
            }

            private SubtypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static SubtypeDto valueOf(String str) {
                return (SubtypeDto) Enum.valueOf(SubtypeDto.class, str);
            }

            public static SubtypeDto[] values() {
                return (SubtypeDto[]) $VALUES.clone();
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
        /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0(NotificationCompat.CATEGORY_PROMO)
            public static final TypeDto PROMO;
            private final String value;

            /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
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
                TypeDto typeDto = new TypeDto("PROMO", 0, NotificationCompat.CATEGORY_PROMO);
                PROMO = typeDto;
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

        /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcasePromoDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcasePromoDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                InnerTypeDto createFromParcel2 = InnerTypeDto.CREATOR.createFromParcel(parcel);
                SubtypeDto createFromParcel3 = SubtypeDto.CREATOR.createFromParcel(parcel);
                SuperAppShowcasePromoCardImageDto createFromParcel4 = SuperAppShowcasePromoCardImageDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcasePromoDto.class.getClassLoader());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                float readFloat = parcel.readFloat();
                String readString3 = parcel.readString();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SuperAppShowcasePromoDto(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, superAppUniversalWidgetActionDto, readString, readString2, readFloat, readString3, valueOf, bool);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcasePromoDto[] newArray(int i) {
                return new SuperAppShowcasePromoDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcasePromoDto(TypeDto typeDto, InnerTypeDto innerTypeDto, SubtypeDto subtypeDto, SuperAppShowcasePromoCardImageDto superAppShowcasePromoCardImageDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str, String str2, float f, String str3, Boolean bool, Boolean bool2, int i, zcl zclVar) {
            this(typeDto, innerTypeDto, subtypeDto, superAppShowcasePromoCardImageDto, superAppUniversalWidgetActionDto, str, str2, f, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : bool2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcasePromoDto)) {
                return false;
            }
            SuperAppShowcasePromoDto superAppShowcasePromoDto = (SuperAppShowcasePromoDto) obj;
            return this.type == superAppShowcasePromoDto.type && this.innerType == superAppShowcasePromoDto.innerType && this.subtype == superAppShowcasePromoDto.subtype && epx.f(this.image, superAppShowcasePromoDto.image) && epx.f(this.action, superAppShowcasePromoDto.action) && epx.f(this.state, superAppShowcasePromoDto.state) && epx.f(this.trackCode, superAppShowcasePromoDto.trackCode) && Float.compare(this.weight, superAppShowcasePromoDto.weight) == 0 && epx.f(this.uid, superAppShowcasePromoDto.uid) && epx.f(this.isEnabled, superAppShowcasePromoDto.isEnabled) && epx.f(this.isUnremovable, superAppShowcasePromoDto.isUnremovable);
        }

        public final int hashCode() {
            int a2 = b.a(this.weight, urd0.a(urd0.a(zyk0.a(this.action, (this.image.hashCode() + ((this.subtype.hashCode() + ((this.innerType.hashCode() + (this.type.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31, this.state), 31, this.trackCode), 31);
            String str = this.uid;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isEnabled;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isUnremovable;
            return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcasePromoDto(type=");
            sb.append(this.type);
            sb.append(", innerType=");
            sb.append(this.innerType);
            sb.append(", subtype=");
            sb.append(this.subtype);
            sb.append(", image=");
            sb.append(this.image);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", state=");
            sb.append(this.state);
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
            this.innerType.writeToParcel(parcel, i);
            this.subtype.writeToParcel(parcel, i);
            this.image.writeToParcel(parcel, i);
            parcel.writeParcelable(this.action, i);
            parcel.writeString(this.state);
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

        public SuperAppShowcasePromoDto(TypeDto typeDto, InnerTypeDto innerTypeDto, SubtypeDto subtypeDto, SuperAppShowcasePromoCardImageDto superAppShowcasePromoCardImageDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str, String str2, float f, String str3, Boolean bool, Boolean bool2) {
            super(null);
            this.type = typeDto;
            this.innerType = innerTypeDto;
            this.subtype = subtypeDto;
            this.image = superAppShowcasePromoCardImageDto;
            this.action = superAppUniversalWidgetActionDto;
            this.state = str;
            this.trackCode = str2;
            this.weight = f;
            this.uid = str3;
            this.isEnabled = bool;
            this.isUnremovable = bool2;
        }
    }

    /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseScrollDto extends SuperAppShowcaseSectionGridItemDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseScrollDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("header_text")
        private final String headerText;

        @pmi0("items")
        private final List<SuperAppShowcaseScrollItemDto> items;

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
        /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("scroll")
            public static final TypeDto SCROLL;
            private final String value;

            /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
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
                TypeDto typeDto = new TypeDto("SCROLL", 0, "scroll");
                SCROLL = typeDto;
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

        /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseScrollDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseScrollDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppShowcaseScrollItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new SuperAppShowcaseScrollDto(createFromParcel, readString, arrayList, (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseScrollDto.class.getClassLoader()), parcel.readString(), parcel.readFloat(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseScrollDto[] newArray(int i) {
                return new SuperAppShowcaseScrollDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseScrollDto(TypeDto typeDto, String str, List list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str2, float f, String str3, int i, zcl zclVar) {
            this(typeDto, str, list, superAppUniversalWidgetActionDto, str2, f, (i & 64) != 0 ? null : str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseScrollDto)) {
                return false;
            }
            SuperAppShowcaseScrollDto superAppShowcaseScrollDto = (SuperAppShowcaseScrollDto) obj;
            return this.type == superAppShowcaseScrollDto.type && epx.f(this.headerText, superAppShowcaseScrollDto.headerText) && epx.f(this.items, superAppShowcaseScrollDto.items) && epx.f(this.action, superAppShowcaseScrollDto.action) && epx.f(this.trackCode, superAppShowcaseScrollDto.trackCode) && Float.compare(this.weight, superAppShowcaseScrollDto.weight) == 0 && epx.f(this.uid, superAppShowcaseScrollDto.uid);
        }

        public final int hashCode() {
            int a2 = b.a(this.weight, urd0.a(zyk0.a(this.action, fw3.a(urd0.a(this.type.hashCode() * 31, 31, this.headerText), 31, this.items), 31), 31, this.trackCode), 31);
            String str = this.uid;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseScrollDto(type=");
            sb.append(this.type);
            sb.append(", headerText=");
            sb.append(this.headerText);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", uid=");
            return ho8.a(sb, this.uid, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.headerText);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((SuperAppShowcaseScrollItemDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.action, i);
            parcel.writeString(this.trackCode);
            parcel.writeFloat(this.weight);
            parcel.writeString(this.uid);
        }

        public SuperAppShowcaseScrollDto(TypeDto typeDto, String str, List<SuperAppShowcaseScrollItemDto> list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str2, float f, String str3) {
            super(null);
            this.type = typeDto;
            this.headerText = str;
            this.items = list;
            this.action = superAppUniversalWidgetActionDto;
            this.trackCode = str2;
            this.weight = f;
            this.uid = str3;
        }
    }

    /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseSectionScrollDto extends SuperAppShowcaseSectionGridItemDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseSectionScrollDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("ad_info")
        private final SuperAppShowcaseSectionScrollAdInfoDto adInfo;

        @pmi0("items")
        private final List<SuperAppShowcaseSectionScrollItemDto> items;

        @pmi0("subtitle")
        private final String subtitle;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("weight")
        private final float weight;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("section_scroll")
            public static final TypeDto SECTION_SCROLL;
            private final String value;

            /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
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
                TypeDto typeDto = new TypeDto("SECTION_SCROLL", 0, "section_scroll");
                SECTION_SCROLL = typeDto;
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

        /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseSectionScrollDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseSectionScrollDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SuperAppShowcaseSectionScrollDto.class, parcel, arrayList, i, 1);
                }
                return new SuperAppShowcaseSectionScrollDto(createFromParcel, readString, arrayList, parcel.readString(), parcel.readFloat(), parcel.readString(), (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseSectionScrollDto.class.getClassLoader()), parcel.readInt() == 0 ? null : SuperAppShowcaseSectionScrollAdInfoDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseSectionScrollDto[] newArray(int i) {
                return new SuperAppShowcaseSectionScrollDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseSectionScrollDto(TypeDto typeDto, String str, List list, String str2, float f, String str3, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseSectionScrollAdInfoDto superAppShowcaseSectionScrollAdInfoDto, int i, zcl zclVar) {
            this(typeDto, str, list, str2, f, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : superAppUniversalWidgetActionDto, (i & 128) != 0 ? null : superAppShowcaseSectionScrollAdInfoDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseSectionScrollDto)) {
                return false;
            }
            SuperAppShowcaseSectionScrollDto superAppShowcaseSectionScrollDto = (SuperAppShowcaseSectionScrollDto) obj;
            return this.type == superAppShowcaseSectionScrollDto.type && epx.f(this.title, superAppShowcaseSectionScrollDto.title) && epx.f(this.items, superAppShowcaseSectionScrollDto.items) && epx.f(this.trackCode, superAppShowcaseSectionScrollDto.trackCode) && Float.compare(this.weight, superAppShowcaseSectionScrollDto.weight) == 0 && epx.f(this.subtitle, superAppShowcaseSectionScrollDto.subtitle) && epx.f(this.action, superAppShowcaseSectionScrollDto.action) && epx.f(this.adInfo, superAppShowcaseSectionScrollDto.adInfo);
        }

        public final int hashCode() {
            int a2 = b.a(this.weight, urd0.a(fw3.a(urd0.a(this.type.hashCode() * 31, 31, this.title), 31, this.items), 31, this.trackCode), 31);
            String str = this.subtitle;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
            int hashCode2 = (hashCode + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
            SuperAppShowcaseSectionScrollAdInfoDto superAppShowcaseSectionScrollAdInfoDto = this.adInfo;
            return hashCode2 + (superAppShowcaseSectionScrollAdInfoDto != null ? superAppShowcaseSectionScrollAdInfoDto.hashCode() : 0);
        }

        public final String toString() {
            return "SuperAppShowcaseSectionScrollDto(type=" + this.type + ", title=" + this.title + ", items=" + this.items + ", trackCode=" + this.trackCode + ", weight=" + this.weight + ", subtitle=" + this.subtitle + ", action=" + this.action + ", adInfo=" + this.adInfo + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.title);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeString(this.trackCode);
            parcel.writeFloat(this.weight);
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.action, i);
            SuperAppShowcaseSectionScrollAdInfoDto superAppShowcaseSectionScrollAdInfoDto = this.adInfo;
            if (superAppShowcaseSectionScrollAdInfoDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppShowcaseSectionScrollAdInfoDto.writeToParcel(parcel, i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppShowcaseSectionScrollDto(TypeDto typeDto, String str, List<? extends SuperAppShowcaseSectionScrollItemDto> list, String str2, float f, String str3, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseSectionScrollAdInfoDto superAppShowcaseSectionScrollAdInfoDto) {
            super(null);
            this.type = typeDto;
            this.title = str;
            this.items = list;
            this.trackCode = str2;
            this.weight = f;
            this.subtitle = str3;
            this.action = superAppUniversalWidgetActionDto;
            this.adInfo = superAppShowcaseSectionScrollAdInfoDto;
        }
    }

    /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseSubscribeTileDto extends SuperAppShowcaseSectionGridItemDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseSubscribeTileDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0(L2.g)
        private final List<SuperAppUniversalWidgetImageItemDto> background;

        @pmi0("button_action")
        private final SuperAppUniversalWidgetActionDto buttonAction;

        @pmi0("foreground")
        private final List<SuperAppShowcaseSubscribeTileForegroundDto> foreground;

        @pmi0("icon")
        private final SuperAppUniversalWidgetImageBlockDto icon;

        @pmi0("inner_type")
        private final InnerTypeDto innerType;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("uid")
        private final String uid;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
        public static final class InnerTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InnerTypeDto[] $VALUES;
            public static final Parcelable.Creator<InnerTypeDto> CREATOR;

            @pmi0("subscribe_tile")
            public static final InnerTypeDto SUBSCRIBE_TILE;
            private final String value;

            /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
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
                InnerTypeDto innerTypeDto = new InnerTypeDto("SUBSCRIBE_TILE", 0, "subscribe_tile");
                SUBSCRIBE_TILE = innerTypeDto;
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
        /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("subscribe_tile")
            public static final TypeDto SUBSCRIBE_TILE;
            private final String value;

            /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
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
                TypeDto typeDto = new TypeDto("SUBSCRIBE_TILE", 0, "subscribe_tile");
                SUBSCRIBE_TILE = typeDto;
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

        /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseSubscribeTileDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseSubscribeTileDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                InnerTypeDto createFromParcel2 = InnerTypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList2, i2, 1);
                }
                SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto = (SuperAppUniversalWidgetImageBlockDto) parcel.readParcelable(SuperAppShowcaseSubscribeTileDto.class.getClassLoader());
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseSubscribeTileDto.class.getClassLoader());
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto2 = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseSubscribeTileDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = bo.b(SuperAppShowcaseSubscribeTileDto.class, parcel, arrayList3, i, 1);
                    }
                    arrayList = arrayList3;
                }
                return new SuperAppShowcaseSubscribeTileDto(createFromParcel, createFromParcel2, readString, arrayList2, superAppUniversalWidgetImageBlockDto, superAppUniversalWidgetActionDto, superAppUniversalWidgetActionDto2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseSubscribeTileDto[] newArray(int i) {
                return new SuperAppShowcaseSubscribeTileDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseSubscribeTileDto(TypeDto typeDto, InnerTypeDto innerTypeDto, String str, List list, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto2, List list2, int i, zcl zclVar) {
            this(typeDto, innerTypeDto, str, list, superAppUniversalWidgetImageBlockDto, superAppUniversalWidgetActionDto, superAppUniversalWidgetActionDto2, (i & 128) != 0 ? null : list2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseSubscribeTileDto)) {
                return false;
            }
            SuperAppShowcaseSubscribeTileDto superAppShowcaseSubscribeTileDto = (SuperAppShowcaseSubscribeTileDto) obj;
            return this.type == superAppShowcaseSubscribeTileDto.type && this.innerType == superAppShowcaseSubscribeTileDto.innerType && epx.f(this.uid, superAppShowcaseSubscribeTileDto.uid) && epx.f(this.background, superAppShowcaseSubscribeTileDto.background) && epx.f(this.icon, superAppShowcaseSubscribeTileDto.icon) && epx.f(this.action, superAppShowcaseSubscribeTileDto.action) && epx.f(this.buttonAction, superAppShowcaseSubscribeTileDto.buttonAction) && epx.f(this.foreground, superAppShowcaseSubscribeTileDto.foreground);
        }

        public final int hashCode() {
            int a2 = zyk0.a(this.buttonAction, zyk0.a(this.action, (this.icon.hashCode() + fw3.a(urd0.a((this.innerType.hashCode() + (this.type.hashCode() * 31)) * 31, 31, this.uid), 31, this.background)) * 31, 31), 31);
            List<SuperAppShowcaseSubscribeTileForegroundDto> list = this.foreground;
            return a2 + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseSubscribeTileDto(type=");
            sb.append(this.type);
            sb.append(", innerType=");
            sb.append(this.innerType);
            sb.append(", uid=");
            sb.append(this.uid);
            sb.append(", background=");
            sb.append(this.background);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", buttonAction=");
            sb.append(this.buttonAction);
            sb.append(", foreground=");
            return ms9.a(')', sb, this.foreground);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.innerType.writeToParcel(parcel, i);
            parcel.writeString(this.uid);
            Iterator a2 = ao.a(parcel, this.background);
            while (a2.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.icon, i);
            parcel.writeParcelable(this.action, i);
            parcel.writeParcelable(this.buttonAction, i);
            List<SuperAppShowcaseSubscribeTileForegroundDto> list = this.foreground;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppShowcaseSubscribeTileDto(TypeDto typeDto, InnerTypeDto innerTypeDto, String str, List<SuperAppUniversalWidgetImageItemDto> list, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto2, List<? extends SuperAppShowcaseSubscribeTileForegroundDto> list2) {
            super(null);
            this.type = typeDto;
            this.innerType = innerTypeDto;
            this.uid = str;
            this.background = list;
            this.icon = superAppUniversalWidgetImageBlockDto;
            this.action = superAppUniversalWidgetActionDto;
            this.buttonAction = superAppUniversalWidgetActionDto2;
            this.foreground = list2;
        }
    }

    /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseTileDto extends SuperAppShowcaseSectionGridItemDto implements Parcelable {
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
        /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
        public static final class InnerTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InnerTypeDto[] $VALUES;
            public static final Parcelable.Creator<InnerTypeDto> CREATOR;

            @pmi0("tile")
            public static final InnerTypeDto TILE;
            private final String value;

            /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
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
        /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("tile")
            public static final TypeDto TILE;
            private final String value;

            /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
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

        /* compiled from: SuperAppShowcaseSectionGridItemDto.kt */
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

        public /* synthetic */ SuperAppShowcaseTileDto(TypeDto typeDto, InnerTypeDto innerTypeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseTileBackgroundDto superAppShowcaseTileBackgroundDto, String str, float f, String str2, Boolean bool, Boolean bool2, List list, SuperAppShowcaseBadgeDto superAppShowcaseBadgeDto, int i, zcl zclVar) {
            this(typeDto, innerTypeDto, superAppUniversalWidgetActionDto, superAppShowcaseTileBackgroundDto, str, f, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : superAppShowcaseBadgeDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
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

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppShowcaseTileDto(TypeDto typeDto, InnerTypeDto innerTypeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppShowcaseTileBackgroundDto superAppShowcaseTileBackgroundDto, String str, float f, String str2, Boolean bool, Boolean bool2, List<? extends SuperAppShowcaseTileForegroundDto> list, SuperAppShowcaseBadgeDto superAppShowcaseBadgeDto) {
            super(null);
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
    }

    public /* synthetic */ SuperAppShowcaseSectionGridItemDto(zcl zclVar) {
        this();
    }

    private SuperAppShowcaseSectionGridItemDto() {
    }
}

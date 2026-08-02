package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
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
import xsna.qoy;
import xsna.sn;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;
import xsna.zyk0;

/* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppShowcaseSectionScrollItemDto implements Parcelable {

    /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
    public static final class Deserializer implements a9y<SuperAppShowcaseSectionScrollItemDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case 3560110:
                        if (f.equals("tile")) {
                            return (SuperAppShowcaseSectionScrollItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseTileDto.class);
                        }
                        break;
                    case 285457617:
                        if (f.equals("market_tile")) {
                            return (SuperAppShowcaseSectionScrollItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseMarketTileDto.class);
                        }
                        break;
                    case 1500114051:
                        if (f.equals("subscribe_tile")) {
                            return (SuperAppShowcaseSectionScrollItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseSubscribeTileDto.class);
                        }
                        break;
                    case 1583742743:
                        if (f.equals("action_tile")) {
                            return (SuperAppShowcaseSectionScrollItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseActionTileDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseActionTileDto extends SuperAppShowcaseSectionScrollItemDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseActionTileDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

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
        /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("action_tile")
            public static final TypeDto ACTION_TILE;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
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
                TypeDto typeDto = new TypeDto("ACTION_TILE", 0, "action_tile");
                ACTION_TILE = typeDto;
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

        /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseActionTileDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseActionTileDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseActionTileDto(TypeDto.CREATOR.createFromParcel(parcel), (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseActionTileDto.class.getClassLoader()), parcel.readString(), parcel.readFloat(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseActionTileDto[] newArray(int i) {
                return new SuperAppShowcaseActionTileDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseActionTileDto(TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str, float f, String str2, int i, zcl zclVar) {
            this(typeDto, superAppUniversalWidgetActionDto, str, f, (i & 16) != 0 ? null : str2);
        }

        public final SuperAppUniversalWidgetActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final TypeDto e() {
            return this.type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseActionTileDto)) {
                return false;
            }
            SuperAppShowcaseActionTileDto superAppShowcaseActionTileDto = (SuperAppShowcaseActionTileDto) obj;
            return this.type == superAppShowcaseActionTileDto.type && epx.f(this.action, superAppShowcaseActionTileDto.action) && epx.f(this.trackCode, superAppShowcaseActionTileDto.trackCode) && Float.compare(this.weight, superAppShowcaseActionTileDto.weight) == 0 && epx.f(this.uid, superAppShowcaseActionTileDto.uid);
        }

        public final String f() {
            return this.uid;
        }

        public final float g() {
            return this.weight;
        }

        public final int hashCode() {
            int a2 = b.a(this.weight, urd0.a(zyk0.a(this.action, this.type.hashCode() * 31, 31), 31, this.trackCode), 31);
            String str = this.uid;
            return a2 + (str == null ? 0 : str.hashCode());
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseActionTileDto(type=");
            sb.append(this.type);
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
            parcel.writeParcelable(this.action, i);
            parcel.writeString(this.trackCode);
            parcel.writeFloat(this.weight);
            parcel.writeString(this.uid);
        }

        public SuperAppShowcaseActionTileDto(TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str, float f, String str2) {
            super(null);
            this.type = typeDto;
            this.action = superAppUniversalWidgetActionDto;
            this.trackCode = str;
            this.weight = f;
            this.uid = str2;
        }
    }

    /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseMarketTileDto extends SuperAppShowcaseSectionScrollItemDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseMarketTileDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0(L2.g)
        private final List<SuperAppUniversalWidgetImageItemDto> background;

        @pmi0("badge_prefix")
        private final String badgePrefix;

        @pmi0("foreground")
        private final List<SuperAppShowcaseMarketTileForegroundDto> foreground;

        @pmi0("is_adult")
        private final boolean isAdult;

        @pmi0("item_type")
        private final String itemType;

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
        /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("market_tile")
            public static final TypeDto MARKET_TILE;
            private final String value;

            /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
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
                TypeDto typeDto = new TypeDto("MARKET_TILE", 0, "market_tile");
                MARKET_TILE = typeDto;
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

        /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseMarketTileDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseMarketTileDto createFromParcel(Parcel parcel) {
                int i;
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseMarketTileDto.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                boolean z = false;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList2, i2, 1);
                }
                if (parcel.readInt() != 0) {
                    i = 0;
                    z = true;
                } else {
                    i = 0;
                }
                String readString = parcel.readString();
                float readFloat = parcel.readFloat();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = bo.b(SuperAppShowcaseMarketTileDto.class, parcel, arrayList3, i, 1);
                    }
                    arrayList = arrayList3;
                }
                return new SuperAppShowcaseMarketTileDto(createFromParcel, superAppUniversalWidgetActionDto, arrayList2, z, readString, readFloat, readString2, arrayList, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseMarketTileDto[] newArray(int i) {
                return new SuperAppShowcaseMarketTileDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseMarketTileDto(TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, List list, boolean z, String str, float f, String str2, List list2, String str3, String str4, int i, zcl zclVar) {
            this(typeDto, superAppUniversalWidgetActionDto, list, z, str, f, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : str4);
        }

        public final SuperAppUniversalWidgetActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<SuperAppUniversalWidgetImageItemDto> e() {
            return this.background;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseMarketTileDto)) {
                return false;
            }
            SuperAppShowcaseMarketTileDto superAppShowcaseMarketTileDto = (SuperAppShowcaseMarketTileDto) obj;
            return this.type == superAppShowcaseMarketTileDto.type && epx.f(this.action, superAppShowcaseMarketTileDto.action) && epx.f(this.background, superAppShowcaseMarketTileDto.background) && this.isAdult == superAppShowcaseMarketTileDto.isAdult && epx.f(this.trackCode, superAppShowcaseMarketTileDto.trackCode) && Float.compare(this.weight, superAppShowcaseMarketTileDto.weight) == 0 && epx.f(this.uid, superAppShowcaseMarketTileDto.uid) && epx.f(this.foreground, superAppShowcaseMarketTileDto.foreground) && epx.f(this.badgePrefix, superAppShowcaseMarketTileDto.badgePrefix) && epx.f(this.itemType, superAppShowcaseMarketTileDto.itemType);
        }

        public final String f() {
            return this.badgePrefix;
        }

        public final List<SuperAppShowcaseMarketTileForegroundDto> g() {
            return this.foreground;
        }

        public final int hashCode() {
            int a2 = b.a(this.weight, urd0.a(qoy.b(fw3.a(zyk0.a(this.action, this.type.hashCode() * 31, 31), 31, this.background), 31, this.isAdult), 31, this.trackCode), 31);
            String str = this.uid;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            List<SuperAppShowcaseMarketTileForegroundDto> list = this.foreground;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.badgePrefix;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.itemType;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String i() {
            return this.itemType;
        }

        public final TypeDto j() {
            return this.type;
        }

        public final String k() {
            return this.uid;
        }

        public final float l() {
            return this.weight;
        }

        public final boolean n() {
            return this.isAdult;
        }

        public final String r() {
            return this.trackCode;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseMarketTileDto(type=");
            sb.append(this.type);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", background=");
            sb.append(this.background);
            sb.append(", isAdult=");
            sb.append(this.isAdult);
            sb.append(", trackCode=");
            sb.append(this.trackCode);
            sb.append(", weight=");
            sb.append(this.weight);
            sb.append(", uid=");
            sb.append(this.uid);
            sb.append(", foreground=");
            sb.append(this.foreground);
            sb.append(", badgePrefix=");
            sb.append(this.badgePrefix);
            sb.append(", itemType=");
            return ho8.a(sb, this.itemType, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.action, i);
            Iterator a2 = ao.a(parcel, this.background);
            while (a2.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeInt(this.isAdult ? 1 : 0);
            parcel.writeString(this.trackCode);
            parcel.writeFloat(this.weight);
            parcel.writeString(this.uid);
            List<SuperAppShowcaseMarketTileForegroundDto> list = this.foreground;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            parcel.writeString(this.badgePrefix);
            parcel.writeString(this.itemType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppShowcaseMarketTileDto(TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, List<SuperAppUniversalWidgetImageItemDto> list, boolean z, String str, float f, String str2, List<? extends SuperAppShowcaseMarketTileForegroundDto> list2, String str3, String str4) {
            super(null);
            this.type = typeDto;
            this.action = superAppUniversalWidgetActionDto;
            this.background = list;
            this.isAdult = z;
            this.trackCode = str;
            this.weight = f;
            this.uid = str2;
            this.foreground = list2;
            this.badgePrefix = str3;
            this.itemType = str4;
        }
    }

    /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseSubscribeTileDto extends SuperAppShowcaseSectionScrollItemDto implements Parcelable {
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
        /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
        public static final class InnerTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InnerTypeDto[] $VALUES;
            public static final Parcelable.Creator<InnerTypeDto> CREATOR;

            @pmi0("subscribe_tile")
            public static final InnerTypeDto SUBSCRIBE_TILE;
            private final String value;

            /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
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
        /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("subscribe_tile")
            public static final TypeDto SUBSCRIBE_TILE;
            private final String value;

            /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
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

        /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
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

        public final SuperAppUniversalWidgetActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<SuperAppUniversalWidgetImageItemDto> e() {
            return this.background;
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

        public final SuperAppUniversalWidgetActionDto f() {
            return this.buttonAction;
        }

        public final List<SuperAppShowcaseSubscribeTileForegroundDto> g() {
            return this.foreground;
        }

        public final int hashCode() {
            int a2 = zyk0.a(this.buttonAction, zyk0.a(this.action, (this.icon.hashCode() + fw3.a(urd0.a((this.innerType.hashCode() + (this.type.hashCode() * 31)) * 31, 31, this.uid), 31, this.background)) * 31, 31), 31);
            List<SuperAppShowcaseSubscribeTileForegroundDto> list = this.foreground;
            return a2 + (list == null ? 0 : list.hashCode());
        }

        public final SuperAppUniversalWidgetImageBlockDto i() {
            return this.icon;
        }

        public final TypeDto j() {
            return this.type;
        }

        public final String k() {
            return this.uid;
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

    /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseTileDto extends SuperAppShowcaseSectionScrollItemDto implements Parcelable {
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
        /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
        public static final class InnerTypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ InnerTypeDto[] $VALUES;
            public static final Parcelable.Creator<InnerTypeDto> CREATOR;

            @pmi0("tile")
            public static final InnerTypeDto TILE;
            private final String value;

            /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
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
        /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("tile")
            public static final TypeDto TILE;
            private final String value;

            /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
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

        /* compiled from: SuperAppShowcaseSectionScrollItemDto.kt */
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

        public final TypeDto i() {
            return this.type;
        }

        public final String j() {
            return this.uid;
        }

        public final float k() {
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

    public /* synthetic */ SuperAppShowcaseSectionScrollItemDto(zcl zclVar) {
        this();
    }

    private SuperAppShowcaseSectionScrollItemDto() {
    }
}

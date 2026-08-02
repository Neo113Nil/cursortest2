package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import io.reactivex.rxjava3.subjects.b;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppShowcaseItemDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppShowcaseItemDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppShowcaseItemDto> CREATOR = new a();

    @pmi0("flags")
    private final Long flags;

    @pmi0("is_enabled")
    private final Boolean isEnabled;

    @pmi0("is_unremovable")
    private final Boolean isUnremovable;

    @pmi0("payload")
    private final SuperAppShowcaseItemPayloadDto payload;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("uid")
    private final String uid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppShowcaseItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("half_tile")
        public static final TypeDto HALF_TILE;

        @pmi0("mini_widgets")
        public static final TypeDto MINI_WIDGETS;

        @pmi0("onboarding_panel")
        public static final TypeDto ONBOARDING_PANEL;

        @pmi0(NotificationCompat.CATEGORY_PROMO)
        public static final TypeDto PROMO;

        @pmi0("scroll")
        public static final TypeDto SCROLL;

        @pmi0("section_grid")
        public static final TypeDto SECTION_GRID;

        @pmi0("section_poster")
        public static final TypeDto SECTION_POSTER;

        @pmi0("section_scroll")
        public static final TypeDto SECTION_SCROLL;

        @pmi0("section_video_banner")
        public static final TypeDto SECTION_VIDEO_BANNER;

        @pmi0("services_menu")
        public static final TypeDto SERVICES_MENU;

        @pmi0("showcase_menu")
        public static final TypeDto SHOWCASE_MENU;

        @pmi0("text")
        public static final TypeDto TEXT;

        @pmi0("tile")
        public static final TypeDto TILE;

        @pmi0("universal_full_width")
        public static final TypeDto UNIVERSAL_FULL_WIDTH;
        private final String value;

        /* compiled from: SuperAppShowcaseItemDto.kt */
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
            TypeDto typeDto = new TypeDto("SHOWCASE_MENU", 0, "showcase_menu");
            SHOWCASE_MENU = typeDto;
            TypeDto typeDto2 = new TypeDto("MINI_WIDGETS", 1, "mini_widgets");
            MINI_WIDGETS = typeDto2;
            TypeDto typeDto3 = new TypeDto("ONBOARDING_PANEL", 2, "onboarding_panel");
            ONBOARDING_PANEL = typeDto3;
            TypeDto typeDto4 = new TypeDto("SCROLL", 3, "scroll");
            SCROLL = typeDto4;
            TypeDto typeDto5 = new TypeDto("PROMO", 4, NotificationCompat.CATEGORY_PROMO);
            PROMO = typeDto5;
            TypeDto typeDto6 = new TypeDto("TILE", 5, "tile");
            TILE = typeDto6;
            TypeDto typeDto7 = new TypeDto("UNIVERSAL_FULL_WIDTH", 6, "universal_full_width");
            UNIVERSAL_FULL_WIDTH = typeDto7;
            TypeDto typeDto8 = new TypeDto("SECTION_GRID", 7, "section_grid");
            SECTION_GRID = typeDto8;
            TypeDto typeDto9 = new TypeDto("SECTION_SCROLL", 8, "section_scroll");
            SECTION_SCROLL = typeDto9;
            TypeDto typeDto10 = new TypeDto("SECTION_POSTER", 9, "section_poster");
            SECTION_POSTER = typeDto10;
            TypeDto typeDto11 = new TypeDto("SECTION_VIDEO_BANNER", 10, "section_video_banner");
            SECTION_VIDEO_BANNER = typeDto11;
            TypeDto typeDto12 = new TypeDto("SERVICES_MENU", 11, "services_menu");
            SERVICES_MENU = typeDto12;
            TypeDto typeDto13 = new TypeDto("HALF_TILE", 12, "half_tile");
            HALF_TILE = typeDto13;
            TypeDto typeDto14 = new TypeDto("TEXT", 13, "text");
            TEXT = typeDto14;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11, typeDto12, typeDto13, typeDto14};
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: SuperAppShowcaseItemDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseItemDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            SuperAppShowcaseItemPayloadDto superAppShowcaseItemPayloadDto = (SuperAppShowcaseItemPayloadDto) parcel.readParcelable(SuperAppShowcaseItemDto.class.getClassLoader());
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
            return new SuperAppShowcaseItemDto(createFromParcel, readString, superAppShowcaseItemPayloadDto, valueOf, valueOf2, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseItemDto[] newArray(int i) {
            return new SuperAppShowcaseItemDto[i];
        }
    }

    public SuperAppShowcaseItemDto(TypeDto typeDto, String str, SuperAppShowcaseItemPayloadDto superAppShowcaseItemPayloadDto, Boolean bool, Boolean bool2, Long l) {
        this.type = typeDto;
        this.uid = str;
        this.payload = superAppShowcaseItemPayloadDto;
        this.isEnabled = bool;
        this.isUnremovable = bool2;
        this.flags = l;
    }

    public final Long d() {
        return this.flags;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final SuperAppShowcaseItemPayloadDto e() {
        return this.payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppShowcaseItemDto)) {
            return false;
        }
        SuperAppShowcaseItemDto superAppShowcaseItemDto = (SuperAppShowcaseItemDto) obj;
        return this.type == superAppShowcaseItemDto.type && epx.f(this.uid, superAppShowcaseItemDto.uid) && epx.f(this.payload, superAppShowcaseItemDto.payload) && epx.f(this.isEnabled, superAppShowcaseItemDto.isEnabled) && epx.f(this.isUnremovable, superAppShowcaseItemDto.isUnremovable) && epx.f(this.flags, superAppShowcaseItemDto.flags);
    }

    public final TypeDto f() {
        return this.type;
    }

    public final String g() {
        return this.uid;
    }

    public final int hashCode() {
        int hashCode = (this.payload.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.uid)) * 31;
        Boolean bool = this.isEnabled;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isUnremovable;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l = this.flags;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final Boolean i() {
        return this.isEnabled;
    }

    public final Boolean j() {
        return this.isUnremovable;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppShowcaseItemDto(type=");
        sb.append(this.type);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", isUnremovable=");
        sb.append(this.isUnremovable);
        sb.append(", flags=");
        return iq.b(sb, this.flags, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.uid);
        parcel.writeParcelable(this.payload, i);
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
        Long l = this.flags;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
    }

    public /* synthetic */ SuperAppShowcaseItemDto(TypeDto typeDto, String str, SuperAppShowcaseItemPayloadDto superAppShowcaseItemPayloadDto, Boolean bool, Boolean bool2, Long l, int i, zcl zclVar) {
        this(typeDto, str, superAppShowcaseItemPayloadDto, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : l);
    }
}

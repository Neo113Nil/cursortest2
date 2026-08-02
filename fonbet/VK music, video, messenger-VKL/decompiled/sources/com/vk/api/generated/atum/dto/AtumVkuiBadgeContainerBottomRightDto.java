package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.pmi0;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
/* loaded from: classes.dex */
public abstract class AtumVkuiBadgeContainerBottomRightDto implements Parcelable {

    /* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiBadgeContainerBottomRightBadgeDto extends AtumVkuiBadgeContainerBottomRightDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiBadgeContainerBottomRightBadgeDto> CREATOR = new a();

        @pmi0("badge_image")
        private final AtumVkuiAnyImageDto badgeImage;

        @pmi0("outline_background_color")
        private final AtumVkuiColorNameDto outlineBackgroundColor;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("badge")
            public static final TypeDto BADGE;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
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
                TypeDto typeDto = new TypeDto("BADGE", 0, "badge");
                BADGE = typeDto;
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

        /* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiBadgeContainerBottomRightBadgeDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiBadgeContainerBottomRightBadgeDto createFromParcel(Parcel parcel) {
                return new AtumVkuiBadgeContainerBottomRightBadgeDto(TypeDto.CREATOR.createFromParcel(parcel), (AtumVkuiAnyImageDto) parcel.readParcelable(AtumVkuiBadgeContainerBottomRightBadgeDto.class.getClassLoader()), parcel.readInt() == 0 ? null : AtumVkuiColorNameDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiBadgeContainerBottomRightBadgeDto[] newArray(int i) {
                return new AtumVkuiBadgeContainerBottomRightBadgeDto[i];
            }
        }

        public /* synthetic */ AtumVkuiBadgeContainerBottomRightBadgeDto(TypeDto typeDto, AtumVkuiAnyImageDto atumVkuiAnyImageDto, AtumVkuiColorNameDto atumVkuiColorNameDto, int i, zcl zclVar) {
            this(typeDto, atumVkuiAnyImageDto, (i & 4) != 0 ? null : atumVkuiColorNameDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiBadgeContainerBottomRightBadgeDto)) {
                return false;
            }
            AtumVkuiBadgeContainerBottomRightBadgeDto atumVkuiBadgeContainerBottomRightBadgeDto = (AtumVkuiBadgeContainerBottomRightBadgeDto) obj;
            return this.type == atumVkuiBadgeContainerBottomRightBadgeDto.type && epx.f(this.badgeImage, atumVkuiBadgeContainerBottomRightBadgeDto.badgeImage) && this.outlineBackgroundColor == atumVkuiBadgeContainerBottomRightBadgeDto.outlineBackgroundColor;
        }

        public final int hashCode() {
            int hashCode = (this.badgeImage.hashCode() + (this.type.hashCode() * 31)) * 31;
            AtumVkuiColorNameDto atumVkuiColorNameDto = this.outlineBackgroundColor;
            return hashCode + (atumVkuiColorNameDto == null ? 0 : atumVkuiColorNameDto.hashCode());
        }

        public final String toString() {
            return "AtumVkuiBadgeContainerBottomRightBadgeDto(type=" + this.type + ", badgeImage=" + this.badgeImage + ", outlineBackgroundColor=" + this.outlineBackgroundColor + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.badgeImage, i);
            AtumVkuiColorNameDto atumVkuiColorNameDto = this.outlineBackgroundColor;
            if (atumVkuiColorNameDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumVkuiColorNameDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiBadgeContainerBottomRightBadgeDto(TypeDto typeDto, AtumVkuiAnyImageDto atumVkuiAnyImageDto, AtumVkuiColorNameDto atumVkuiColorNameDto) {
            super(null);
            this.type = typeDto;
            this.badgeImage = atumVkuiAnyImageDto;
            this.outlineBackgroundColor = atumVkuiColorNameDto;
        }
    }

    /* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiBadgeContainerBottomRightLiveDto extends AtumVkuiBadgeContainerBottomRightDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiBadgeContainerBottomRightLiveDto> CREATOR = new a();

        @pmi0("outline_background_color")
        private final AtumVkuiColorNameDto outlineBackgroundColor;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("live")
            public static final TypeDto LIVE;
            private final String value;

            /* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
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
                TypeDto typeDto = new TypeDto("LIVE", 0, "live");
                LIVE = typeDto;
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

        /* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiBadgeContainerBottomRightLiveDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiBadgeContainerBottomRightLiveDto createFromParcel(Parcel parcel) {
                return new AtumVkuiBadgeContainerBottomRightLiveDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumVkuiColorNameDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiBadgeContainerBottomRightLiveDto[] newArray(int i) {
                return new AtumVkuiBadgeContainerBottomRightLiveDto[i];
            }
        }

        public /* synthetic */ AtumVkuiBadgeContainerBottomRightLiveDto(TypeDto typeDto, AtumVkuiColorNameDto atumVkuiColorNameDto, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : atumVkuiColorNameDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiBadgeContainerBottomRightLiveDto)) {
                return false;
            }
            AtumVkuiBadgeContainerBottomRightLiveDto atumVkuiBadgeContainerBottomRightLiveDto = (AtumVkuiBadgeContainerBottomRightLiveDto) obj;
            return this.type == atumVkuiBadgeContainerBottomRightLiveDto.type && this.outlineBackgroundColor == atumVkuiBadgeContainerBottomRightLiveDto.outlineBackgroundColor;
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            AtumVkuiColorNameDto atumVkuiColorNameDto = this.outlineBackgroundColor;
            return hashCode + (atumVkuiColorNameDto == null ? 0 : atumVkuiColorNameDto.hashCode());
        }

        public final String toString() {
            return "AtumVkuiBadgeContainerBottomRightLiveDto(type=" + this.type + ", outlineBackgroundColor=" + this.outlineBackgroundColor + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            AtumVkuiColorNameDto atumVkuiColorNameDto = this.outlineBackgroundColor;
            if (atumVkuiColorNameDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumVkuiColorNameDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiBadgeContainerBottomRightLiveDto(TypeDto typeDto, AtumVkuiColorNameDto atumVkuiColorNameDto) {
            super(null);
            this.type = typeDto;
            this.outlineBackgroundColor = atumVkuiColorNameDto;
        }
    }

    /* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiBadgeContainerBottomRightMobileOnlineDto extends AtumVkuiBadgeContainerBottomRightDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiBadgeContainerBottomRightMobileOnlineDto> CREATOR = new a();

        @pmi0("outline_background_color")
        private final AtumVkuiColorNameDto outlineBackgroundColor;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("mobile_online")
            public static final TypeDto MOBILE_ONLINE;
            private final String value;

            /* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
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
                TypeDto typeDto = new TypeDto("MOBILE_ONLINE", 0, "mobile_online");
                MOBILE_ONLINE = typeDto;
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

        /* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiBadgeContainerBottomRightMobileOnlineDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiBadgeContainerBottomRightMobileOnlineDto createFromParcel(Parcel parcel) {
                return new AtumVkuiBadgeContainerBottomRightMobileOnlineDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumVkuiColorNameDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiBadgeContainerBottomRightMobileOnlineDto[] newArray(int i) {
                return new AtumVkuiBadgeContainerBottomRightMobileOnlineDto[i];
            }
        }

        public /* synthetic */ AtumVkuiBadgeContainerBottomRightMobileOnlineDto(TypeDto typeDto, AtumVkuiColorNameDto atumVkuiColorNameDto, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : atumVkuiColorNameDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiBadgeContainerBottomRightMobileOnlineDto)) {
                return false;
            }
            AtumVkuiBadgeContainerBottomRightMobileOnlineDto atumVkuiBadgeContainerBottomRightMobileOnlineDto = (AtumVkuiBadgeContainerBottomRightMobileOnlineDto) obj;
            return this.type == atumVkuiBadgeContainerBottomRightMobileOnlineDto.type && this.outlineBackgroundColor == atumVkuiBadgeContainerBottomRightMobileOnlineDto.outlineBackgroundColor;
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            AtumVkuiColorNameDto atumVkuiColorNameDto = this.outlineBackgroundColor;
            return hashCode + (atumVkuiColorNameDto == null ? 0 : atumVkuiColorNameDto.hashCode());
        }

        public final String toString() {
            return "AtumVkuiBadgeContainerBottomRightMobileOnlineDto(type=" + this.type + ", outlineBackgroundColor=" + this.outlineBackgroundColor + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            AtumVkuiColorNameDto atumVkuiColorNameDto = this.outlineBackgroundColor;
            if (atumVkuiColorNameDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumVkuiColorNameDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiBadgeContainerBottomRightMobileOnlineDto(TypeDto typeDto, AtumVkuiColorNameDto atumVkuiColorNameDto) {
            super(null);
            this.type = typeDto;
            this.outlineBackgroundColor = atumVkuiColorNameDto;
        }
    }

    /* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiBadgeContainerBottomRightWebOnlineDto extends AtumVkuiBadgeContainerBottomRightDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiBadgeContainerBottomRightWebOnlineDto> CREATOR = new a();

        @pmi0("outline_background_color")
        private final AtumVkuiColorNameDto outlineBackgroundColor;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("web_online")
            public static final TypeDto WEB_ONLINE;
            private final String value;

            /* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
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
                TypeDto typeDto = new TypeDto("WEB_ONLINE", 0, "web_online");
                WEB_ONLINE = typeDto;
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

        /* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiBadgeContainerBottomRightWebOnlineDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiBadgeContainerBottomRightWebOnlineDto createFromParcel(Parcel parcel) {
                return new AtumVkuiBadgeContainerBottomRightWebOnlineDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumVkuiColorNameDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiBadgeContainerBottomRightWebOnlineDto[] newArray(int i) {
                return new AtumVkuiBadgeContainerBottomRightWebOnlineDto[i];
            }
        }

        public /* synthetic */ AtumVkuiBadgeContainerBottomRightWebOnlineDto(TypeDto typeDto, AtumVkuiColorNameDto atumVkuiColorNameDto, int i, zcl zclVar) {
            this(typeDto, (i & 2) != 0 ? null : atumVkuiColorNameDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiBadgeContainerBottomRightWebOnlineDto)) {
                return false;
            }
            AtumVkuiBadgeContainerBottomRightWebOnlineDto atumVkuiBadgeContainerBottomRightWebOnlineDto = (AtumVkuiBadgeContainerBottomRightWebOnlineDto) obj;
            return this.type == atumVkuiBadgeContainerBottomRightWebOnlineDto.type && this.outlineBackgroundColor == atumVkuiBadgeContainerBottomRightWebOnlineDto.outlineBackgroundColor;
        }

        public final int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            AtumVkuiColorNameDto atumVkuiColorNameDto = this.outlineBackgroundColor;
            return hashCode + (atumVkuiColorNameDto == null ? 0 : atumVkuiColorNameDto.hashCode());
        }

        public final String toString() {
            return "AtumVkuiBadgeContainerBottomRightWebOnlineDto(type=" + this.type + ", outlineBackgroundColor=" + this.outlineBackgroundColor + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            AtumVkuiColorNameDto atumVkuiColorNameDto = this.outlineBackgroundColor;
            if (atumVkuiColorNameDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumVkuiColorNameDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiBadgeContainerBottomRightWebOnlineDto(TypeDto typeDto, AtumVkuiColorNameDto atumVkuiColorNameDto) {
            super(null);
            this.type = typeDto;
            this.outlineBackgroundColor = atumVkuiColorNameDto;
        }
    }

    /* compiled from: AtumVkuiBadgeContainerBottomRightDto.kt */
    public static final class Deserializer implements a9y<AtumVkuiBadgeContainerBottomRightDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case 3322092:
                        if (f.equals("live")) {
                            return (AtumVkuiBadgeContainerBottomRightDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiBadgeContainerBottomRightLiveDto.class);
                        }
                        break;
                    case 55347344:
                        if (f.equals("mobile_online")) {
                            return (AtumVkuiBadgeContainerBottomRightDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiBadgeContainerBottomRightMobileOnlineDto.class);
                        }
                        break;
                    case 93494179:
                        if (f.equals("badge")) {
                            return (AtumVkuiBadgeContainerBottomRightDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiBadgeContainerBottomRightBadgeDto.class);
                        }
                        break;
                    case 913392030:
                        if (f.equals("web_online")) {
                            return (AtumVkuiBadgeContainerBottomRightDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiBadgeContainerBottomRightWebOnlineDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    public /* synthetic */ AtumVkuiBadgeContainerBottomRightDto(zcl zclVar) {
        this();
    }

    private AtumVkuiBadgeContainerBottomRightDto() {
    }
}

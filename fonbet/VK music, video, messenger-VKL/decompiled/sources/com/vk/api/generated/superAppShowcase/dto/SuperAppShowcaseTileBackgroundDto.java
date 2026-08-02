package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageBlockDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.bo;
import xsna.epx;
import xsna.go9;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppShowcaseTileBackgroundDto implements Parcelable {

    /* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
    public static final class Deserializer implements a9y<SuperAppShowcaseTileBackgroundDto> {
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
                    case -1569617917:
                        if (f.equals("back_image")) {
                            return (SuperAppShowcaseTileBackgroundDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseTileBackgroundBackImageDto.class);
                        }
                        break;
                    case -1390810292:
                        if (f.equals("icon_grid")) {
                            return (SuperAppShowcaseTileBackgroundDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseTileBackgroundIconGridDto.class);
                        }
                        break;
                    case 3226745:
                        if (f.equals("icon")) {
                            return (SuperAppShowcaseTileBackgroundDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseTileBackgroundIconDto.class);
                        }
                        break;
                    case 2032284178:
                        if (f.equals("icon_overlaps")) {
                            return (SuperAppShowcaseTileBackgroundDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseTileBackgroundIconOverlapsDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseTileBackgroundBackImageDto extends SuperAppShowcaseTileBackgroundDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseTileBackgroundBackImageDto> CREATOR = new a();

        @pmi0("image")
        private final SuperAppUniversalWidgetImageBlockDto image;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("back_image")
            public static final TypeDto BACK_IMAGE;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
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
                TypeDto typeDto = new TypeDto("BACK_IMAGE", 0, "back_image");
                BACK_IMAGE = typeDto;
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

        /* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseTileBackgroundBackImageDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileBackgroundBackImageDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseTileBackgroundBackImageDto(TypeDto.CREATOR.createFromParcel(parcel), (SuperAppUniversalWidgetImageBlockDto) parcel.readParcelable(SuperAppShowcaseTileBackgroundBackImageDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileBackgroundBackImageDto[] newArray(int i) {
                return new SuperAppShowcaseTileBackgroundBackImageDto[i];
            }
        }

        public SuperAppShowcaseTileBackgroundBackImageDto(TypeDto typeDto, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto) {
            super(null);
            this.type = typeDto;
            this.image = superAppUniversalWidgetImageBlockDto;
        }

        public final SuperAppUniversalWidgetImageBlockDto d() {
            return this.image;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseTileBackgroundBackImageDto)) {
                return false;
            }
            SuperAppShowcaseTileBackgroundBackImageDto superAppShowcaseTileBackgroundBackImageDto = (SuperAppShowcaseTileBackgroundBackImageDto) obj;
            return this.type == superAppShowcaseTileBackgroundBackImageDto.type && epx.f(this.image, superAppShowcaseTileBackgroundBackImageDto.image);
        }

        public final int hashCode() {
            return this.image.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "SuperAppShowcaseTileBackgroundBackImageDto(type=" + this.type + ", image=" + this.image + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.image, i);
        }
    }

    /* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseTileBackgroundIconDto extends SuperAppShowcaseTileBackgroundDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseTileBackgroundIconDto> CREATOR = new a();

        @pmi0("icon")
        private final SuperAppUniversalWidgetImageBlockDto icon;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("icon")
            public static final TypeDto ICON;
            private final String value;

            /* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
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
                TypeDto typeDto = new TypeDto(NativeAdContent.ViewTag.AD_ICON, 0, "icon");
                ICON = typeDto;
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

        /* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseTileBackgroundIconDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileBackgroundIconDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseTileBackgroundIconDto(TypeDto.CREATOR.createFromParcel(parcel), (SuperAppUniversalWidgetImageBlockDto) parcel.readParcelable(SuperAppShowcaseTileBackgroundIconDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileBackgroundIconDto[] newArray(int i) {
                return new SuperAppShowcaseTileBackgroundIconDto[i];
            }
        }

        public SuperAppShowcaseTileBackgroundIconDto(TypeDto typeDto, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto) {
            super(null);
            this.type = typeDto;
            this.icon = superAppUniversalWidgetImageBlockDto;
        }

        public final SuperAppUniversalWidgetImageBlockDto d() {
            return this.icon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseTileBackgroundIconDto)) {
                return false;
            }
            SuperAppShowcaseTileBackgroundIconDto superAppShowcaseTileBackgroundIconDto = (SuperAppShowcaseTileBackgroundIconDto) obj;
            return this.type == superAppShowcaseTileBackgroundIconDto.type && epx.f(this.icon, superAppShowcaseTileBackgroundIconDto.icon);
        }

        public final int hashCode() {
            return this.icon.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "SuperAppShowcaseTileBackgroundIconDto(type=" + this.type + ", icon=" + this.icon + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.icon, i);
        }
    }

    /* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseTileBackgroundIconGridDto extends SuperAppShowcaseTileBackgroundDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseTileBackgroundIconGridDto> CREATOR = new a();

        @pmi0("images")
        private final List<SuperAppUniversalWidgetImageBlockDto> images;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("icon_grid")
            public static final TypeDto ICON_GRID;
            private final String value;

            /* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
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
                TypeDto typeDto = new TypeDto("ICON_GRID", 0, "icon_grid");
                ICON_GRID = typeDto;
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

        /* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseTileBackgroundIconGridDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileBackgroundIconGridDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SuperAppShowcaseTileBackgroundIconGridDto.class, parcel, arrayList, i, 1);
                }
                return new SuperAppShowcaseTileBackgroundIconGridDto(createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileBackgroundIconGridDto[] newArray(int i) {
                return new SuperAppShowcaseTileBackgroundIconGridDto[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppShowcaseTileBackgroundIconGridDto(TypeDto typeDto, List<? extends SuperAppUniversalWidgetImageBlockDto> list) {
            super(null);
            this.type = typeDto;
            this.images = list;
        }

        public final List<SuperAppUniversalWidgetImageBlockDto> d() {
            return this.images;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseTileBackgroundIconGridDto)) {
                return false;
            }
            SuperAppShowcaseTileBackgroundIconGridDto superAppShowcaseTileBackgroundIconGridDto = (SuperAppShowcaseTileBackgroundIconGridDto) obj;
            return this.type == superAppShowcaseTileBackgroundIconGridDto.type && epx.f(this.images, superAppShowcaseTileBackgroundIconGridDto.images);
        }

        public final int hashCode() {
            return this.images.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseTileBackgroundIconGridDto(type=");
            sb.append(this.type);
            sb.append(", images=");
            return ms9.a(')', sb, this.images);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.images);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
        }
    }

    /* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseTileBackgroundIconOverlapsDto extends SuperAppShowcaseTileBackgroundDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseTileBackgroundIconOverlapsDto> CREATOR = new a();

        @pmi0("is_right_above")
        private final Boolean isRightAbove;

        @pmi0(TtmlNode.LEFT)
        private final SuperAppUniversalWidgetImageBlockDto left;

        @pmi0(TtmlNode.RIGHT)
        private final SuperAppUniversalWidgetImageBlockDto right;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("icon_overlaps")
            public static final TypeDto ICON_OVERLAPS;
            private final String value;

            /* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
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
                TypeDto typeDto = new TypeDto("ICON_OVERLAPS", 0, "icon_overlaps");
                ICON_OVERLAPS = typeDto;
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

        /* compiled from: SuperAppShowcaseTileBackgroundDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseTileBackgroundIconOverlapsDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileBackgroundIconOverlapsDto createFromParcel(Parcel parcel) {
                Boolean valueOf;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto = (SuperAppUniversalWidgetImageBlockDto) parcel.readParcelable(SuperAppShowcaseTileBackgroundIconOverlapsDto.class.getClassLoader());
                SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto2 = (SuperAppUniversalWidgetImageBlockDto) parcel.readParcelable(SuperAppShowcaseTileBackgroundIconOverlapsDto.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SuperAppShowcaseTileBackgroundIconOverlapsDto(createFromParcel, superAppUniversalWidgetImageBlockDto, superAppUniversalWidgetImageBlockDto2, valueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileBackgroundIconOverlapsDto[] newArray(int i) {
                return new SuperAppShowcaseTileBackgroundIconOverlapsDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseTileBackgroundIconOverlapsDto(TypeDto typeDto, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto2, Boolean bool, int i, zcl zclVar) {
            this(typeDto, superAppUniversalWidgetImageBlockDto, superAppUniversalWidgetImageBlockDto2, (i & 8) != 0 ? null : bool);
        }

        public final SuperAppUniversalWidgetImageBlockDto d() {
            return this.left;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final SuperAppUniversalWidgetImageBlockDto e() {
            return this.right;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseTileBackgroundIconOverlapsDto)) {
                return false;
            }
            SuperAppShowcaseTileBackgroundIconOverlapsDto superAppShowcaseTileBackgroundIconOverlapsDto = (SuperAppShowcaseTileBackgroundIconOverlapsDto) obj;
            return this.type == superAppShowcaseTileBackgroundIconOverlapsDto.type && epx.f(this.left, superAppShowcaseTileBackgroundIconOverlapsDto.left) && epx.f(this.right, superAppShowcaseTileBackgroundIconOverlapsDto.right) && epx.f(this.isRightAbove, superAppShowcaseTileBackgroundIconOverlapsDto.isRightAbove);
        }

        public final Boolean f() {
            return this.isRightAbove;
        }

        public final int hashCode() {
            int hashCode = (this.right.hashCode() + ((this.left.hashCode() + (this.type.hashCode() * 31)) * 31)) * 31;
            Boolean bool = this.isRightAbove;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseTileBackgroundIconOverlapsDto(type=");
            sb.append(this.type);
            sb.append(", left=");
            sb.append(this.left);
            sb.append(", right=");
            sb.append(this.right);
            sb.append(", isRightAbove=");
            return tn.a(sb, this.isRightAbove, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.left, i);
            parcel.writeParcelable(this.right, i);
            Boolean bool = this.isRightAbove;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
        }

        public SuperAppShowcaseTileBackgroundIconOverlapsDto(TypeDto typeDto, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto, SuperAppUniversalWidgetImageBlockDto superAppUniversalWidgetImageBlockDto2, Boolean bool) {
            super(null);
            this.type = typeDto;
            this.left = superAppUniversalWidgetImageBlockDto;
            this.right = superAppUniversalWidgetImageBlockDto2;
            this.isRightAbove = bool;
        }
    }

    public /* synthetic */ SuperAppShowcaseTileBackgroundDto(zcl zclVar) {
        this();
    }

    private SuperAppShowcaseTileBackgroundDto() {
    }
}

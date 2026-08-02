package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.pmi0;
import xsna.shy;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppUniversalWidgetImageBlockDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppUniversalWidgetImageBlockDto implements Parcelable {

    /* compiled from: SuperAppUniversalWidgetImageBlockDto.kt */
    public static final class Deserializer implements a9y<SuperAppUniversalWidgetImageBlockDto> {
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
                    case -1359492551:
                        if (f.equals("mini_app")) {
                            return (SuperAppUniversalWidgetImageBlockDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetImageEntityDto.class);
                        }
                        break;
                    case -1183997287:
                        if (f.equals("inline")) {
                            return (SuperAppUniversalWidgetImageBlockDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetImageInlineDto.class);
                        }
                        break;
                    case -309425751:
                        if (f.equals(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)) {
                            return (SuperAppUniversalWidgetImageBlockDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetImageEntityDto.class);
                        }
                        break;
                    case 98629247:
                        if (f.equals("group")) {
                            return (SuperAppUniversalWidgetImageBlockDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetImageEntityDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppUniversalWidgetImageBlockDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetImageEntityDto extends SuperAppUniversalWidgetImageBlockDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetImageEntityDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("object_id")
        private final int objectId;

        @pmi0(TtmlNode.TAG_STYLE)
        private final SuperAppUniversalWidgetImageStyleDto style;

        @pmi0("subicon")
        private final SuperAppUniversalWidgetImageSubIconDto subicon;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetImageBlockDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("group")
            public static final TypeDto GROUP;

            @pmi0("mini_app")
            public static final TypeDto MINI_APP;

            @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
            public static final TypeDto PROFILE;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetImageBlockDto.kt */
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
                TypeDto typeDto = new TypeDto("MINI_APP", 0, "mini_app");
                MINI_APP = typeDto;
                TypeDto typeDto2 = new TypeDto("PROFILE", 1, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
                PROFILE = typeDto2;
                TypeDto typeDto3 = new TypeDto("GROUP", 2, "group");
                GROUP = typeDto3;
                TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
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

        /* compiled from: SuperAppUniversalWidgetImageBlockDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetImageEntityDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetImageEntityDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetImageEntityDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt(), (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetImageEntityDto.class.getClassLoader()), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetImageStyleDto.CREATOR.createFromParcel(parcel), (SuperAppUniversalWidgetImageSubIconDto) parcel.readParcelable(SuperAppUniversalWidgetImageEntityDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetImageEntityDto[] newArray(int i) {
                return new SuperAppUniversalWidgetImageEntityDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetImageEntityDto(TypeDto typeDto, int i, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto, SuperAppUniversalWidgetImageSubIconDto superAppUniversalWidgetImageSubIconDto, int i2, zcl zclVar) {
            this(typeDto, i, (i2 & 4) != 0 ? null : superAppUniversalWidgetActionDto, (i2 & 8) != 0 ? null : superAppUniversalWidgetImageStyleDto, (i2 & 16) != 0 ? null : superAppUniversalWidgetImageSubIconDto);
        }

        public final SuperAppUniversalWidgetActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int e() {
            return this.objectId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetImageEntityDto)) {
                return false;
            }
            SuperAppUniversalWidgetImageEntityDto superAppUniversalWidgetImageEntityDto = (SuperAppUniversalWidgetImageEntityDto) obj;
            return this.type == superAppUniversalWidgetImageEntityDto.type && this.objectId == superAppUniversalWidgetImageEntityDto.objectId && epx.f(this.action, superAppUniversalWidgetImageEntityDto.action) && epx.f(this.style, superAppUniversalWidgetImageEntityDto.style) && epx.f(this.subicon, superAppUniversalWidgetImageEntityDto.subicon);
        }

        public final SuperAppUniversalWidgetImageStyleDto f() {
            return this.style;
        }

        public final SuperAppUniversalWidgetImageSubIconDto g() {
            return this.subicon;
        }

        public final int hashCode() {
            int a2 = shy.a(this.objectId, this.type.hashCode() * 31, 31);
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
            int hashCode = (a2 + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
            SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto = this.style;
            int hashCode2 = (hashCode + (superAppUniversalWidgetImageStyleDto == null ? 0 : superAppUniversalWidgetImageStyleDto.hashCode())) * 31;
            SuperAppUniversalWidgetImageSubIconDto superAppUniversalWidgetImageSubIconDto = this.subicon;
            return hashCode2 + (superAppUniversalWidgetImageSubIconDto != null ? superAppUniversalWidgetImageSubIconDto.hashCode() : 0);
        }

        public final TypeDto i() {
            return this.type;
        }

        public final String toString() {
            return "SuperAppUniversalWidgetImageEntityDto(type=" + this.type + ", objectId=" + this.objectId + ", action=" + this.action + ", style=" + this.style + ", subicon=" + this.subicon + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeInt(this.objectId);
            parcel.writeParcelable(this.action, i);
            SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto = this.style;
            if (superAppUniversalWidgetImageStyleDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetImageStyleDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.subicon, i);
        }

        public SuperAppUniversalWidgetImageEntityDto(TypeDto typeDto, int i, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto, SuperAppUniversalWidgetImageSubIconDto superAppUniversalWidgetImageSubIconDto) {
            super(null);
            this.type = typeDto;
            this.objectId = i;
            this.action = superAppUniversalWidgetActionDto;
            this.style = superAppUniversalWidgetImageStyleDto;
            this.subicon = superAppUniversalWidgetImageSubIconDto;
        }
    }

    /* compiled from: SuperAppUniversalWidgetImageBlockDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetImageInlineDto extends SuperAppUniversalWidgetImageBlockDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetImageInlineDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("items")
        private final List<SuperAppUniversalWidgetImageItemDto> items;

        @pmi0("overlay_text")
        private final String overlayText;

        @pmi0(TtmlNode.TAG_STYLE)
        private final SuperAppUniversalWidgetImageStyleDto style;

        @pmi0("subicon")
        private final SuperAppUniversalWidgetImageSubIconDto subicon;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetImageBlockDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("inline")
            public static final TypeDto INLINE;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetImageBlockDto.kt */
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
                TypeDto typeDto = new TypeDto("INLINE", 0, "inline");
                INLINE = typeDto;
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

        /* compiled from: SuperAppUniversalWidgetImageBlockDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetImageInlineDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetImageInlineDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new SuperAppUniversalWidgetImageInlineDto(createFromParcel, arrayList, (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetImageInlineDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetImageStyleDto.CREATOR.createFromParcel(parcel), (SuperAppUniversalWidgetImageSubIconDto) parcel.readParcelable(SuperAppUniversalWidgetImageInlineDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetImageInlineDto[] newArray(int i) {
                return new SuperAppUniversalWidgetImageInlineDto[i];
            }
        }

        public /* synthetic */ SuperAppUniversalWidgetImageInlineDto(TypeDto typeDto, List list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str, SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto, SuperAppUniversalWidgetImageSubIconDto superAppUniversalWidgetImageSubIconDto, int i, zcl zclVar) {
            this(typeDto, list, (i & 4) != 0 ? null : superAppUniversalWidgetActionDto, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : superAppUniversalWidgetImageStyleDto, (i & 32) != 0 ? null : superAppUniversalWidgetImageSubIconDto);
        }

        public final SuperAppUniversalWidgetActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<SuperAppUniversalWidgetImageItemDto> e() {
            return this.items;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetImageInlineDto)) {
                return false;
            }
            SuperAppUniversalWidgetImageInlineDto superAppUniversalWidgetImageInlineDto = (SuperAppUniversalWidgetImageInlineDto) obj;
            return this.type == superAppUniversalWidgetImageInlineDto.type && epx.f(this.items, superAppUniversalWidgetImageInlineDto.items) && epx.f(this.action, superAppUniversalWidgetImageInlineDto.action) && epx.f(this.overlayText, superAppUniversalWidgetImageInlineDto.overlayText) && epx.f(this.style, superAppUniversalWidgetImageInlineDto.style) && epx.f(this.subicon, superAppUniversalWidgetImageInlineDto.subicon);
        }

        public final String f() {
            return this.overlayText;
        }

        public final SuperAppUniversalWidgetImageStyleDto g() {
            return this.style;
        }

        public final int hashCode() {
            int a2 = fw3.a(this.type.hashCode() * 31, 31, this.items);
            SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
            int hashCode = (a2 + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
            String str = this.overlayText;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto = this.style;
            int hashCode3 = (hashCode2 + (superAppUniversalWidgetImageStyleDto == null ? 0 : superAppUniversalWidgetImageStyleDto.hashCode())) * 31;
            SuperAppUniversalWidgetImageSubIconDto superAppUniversalWidgetImageSubIconDto = this.subicon;
            return hashCode3 + (superAppUniversalWidgetImageSubIconDto != null ? superAppUniversalWidgetImageSubIconDto.hashCode() : 0);
        }

        public final SuperAppUniversalWidgetImageSubIconDto i() {
            return this.subicon;
        }

        public final String toString() {
            return "SuperAppUniversalWidgetImageInlineDto(type=" + this.type + ", items=" + this.items + ", action=" + this.action + ", overlayText=" + this.overlayText + ", style=" + this.style + ", subicon=" + this.subicon + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) a2.next()).writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.action, i);
            parcel.writeString(this.overlayText);
            SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto = this.style;
            if (superAppUniversalWidgetImageStyleDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                superAppUniversalWidgetImageStyleDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.subicon, i);
        }

        public SuperAppUniversalWidgetImageInlineDto(TypeDto typeDto, List<SuperAppUniversalWidgetImageItemDto> list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str, SuperAppUniversalWidgetImageStyleDto superAppUniversalWidgetImageStyleDto, SuperAppUniversalWidgetImageSubIconDto superAppUniversalWidgetImageSubIconDto) {
            super(null);
            this.type = typeDto;
            this.items = list;
            this.action = superAppUniversalWidgetActionDto;
            this.overlayText = str;
            this.style = superAppUniversalWidgetImageStyleDto;
            this.subicon = superAppUniversalWidgetImageSubIconDto;
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetImageBlockDto(zcl zclVar) {
        this();
    }

    private SuperAppUniversalWidgetImageBlockDto() {
    }
}

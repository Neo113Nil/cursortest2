package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.en;
import xsna.epx;
import xsna.go9;
import xsna.ho8;
import xsna.ms9;
import xsna.pmi0;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppUniversalWidgetImageSubIconDto implements Parcelable {

    /* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
    public static final class Deserializer implements a9y<SuperAppUniversalWidgetImageSubIconDto> {
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
                    case -1994383672:
                        if (f.equals("verified")) {
                            return (SuperAppUniversalWidgetImageSubIconDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetImageSubIconVerifiedDto.class);
                        }
                        break;
                    case -1618089424:
                        if (f.equals("video_live")) {
                            return (SuperAppUniversalWidgetImageSubIconDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetImageSubIconVideoLiveDto.class);
                        }
                        break;
                    case -1034364087:
                        if (f.equals("number")) {
                            return (SuperAppUniversalWidgetImageSubIconDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetImageSubIconNumberDto.class);
                        }
                        break;
                    case 3226745:
                        if (f.equals("icon")) {
                            return (SuperAppUniversalWidgetImageSubIconDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppUniversalWidgetImageSubIconIconDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetImageSubIconIconDto extends SuperAppUniversalWidgetImageSubIconDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetImageSubIconIconDto> CREATOR = new a();

        @pmi0("icon")
        private final List<SuperAppUniversalWidgetImageItemDto> icon;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("icon")
            public static final TypeDto ICON;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
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

        /* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetImageSubIconIconDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetImageSubIconIconDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new SuperAppUniversalWidgetImageSubIconIconDto(createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetImageSubIconIconDto[] newArray(int i) {
                return new SuperAppUniversalWidgetImageSubIconIconDto[i];
            }
        }

        public SuperAppUniversalWidgetImageSubIconIconDto(TypeDto typeDto, List<SuperAppUniversalWidgetImageItemDto> list) {
            super(null);
            this.type = typeDto;
            this.icon = list;
        }

        public final List<SuperAppUniversalWidgetImageItemDto> d() {
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
            if (!(obj instanceof SuperAppUniversalWidgetImageSubIconIconDto)) {
                return false;
            }
            SuperAppUniversalWidgetImageSubIconIconDto superAppUniversalWidgetImageSubIconIconDto = (SuperAppUniversalWidgetImageSubIconIconDto) obj;
            return this.type == superAppUniversalWidgetImageSubIconIconDto.type && epx.f(this.icon, superAppUniversalWidgetImageSubIconIconDto.icon);
        }

        public final int hashCode() {
            return this.icon.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetImageSubIconIconDto(type=");
            sb.append(this.type);
            sb.append(", icon=");
            return ms9.a(')', sb, this.icon);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.icon);
            while (a2.hasNext()) {
                ((SuperAppUniversalWidgetImageItemDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetImageSubIconNumberDto extends SuperAppUniversalWidgetImageSubIconDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetImageSubIconNumberDto> CREATOR = new a();

        @pmi0("background_color")
        private final String backgroundColor;

        @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
        private final String content;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("number")
            public static final TypeDto NUMBER;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
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
                TypeDto typeDto = new TypeDto("NUMBER", 0, "number");
                NUMBER = typeDto;
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

        /* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetImageSubIconNumberDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetImageSubIconNumberDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetImageSubIconNumberDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetImageSubIconNumberDto[] newArray(int i) {
                return new SuperAppUniversalWidgetImageSubIconNumberDto[i];
            }
        }

        public SuperAppUniversalWidgetImageSubIconNumberDto(TypeDto typeDto, String str, String str2) {
            super(null);
            this.type = typeDto;
            this.content = str;
            this.backgroundColor = str2;
        }

        public final String d() {
            return this.backgroundColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.content;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppUniversalWidgetImageSubIconNumberDto)) {
                return false;
            }
            SuperAppUniversalWidgetImageSubIconNumberDto superAppUniversalWidgetImageSubIconNumberDto = (SuperAppUniversalWidgetImageSubIconNumberDto) obj;
            return this.type == superAppUniversalWidgetImageSubIconNumberDto.type && epx.f(this.content, superAppUniversalWidgetImageSubIconNumberDto.content) && epx.f(this.backgroundColor, superAppUniversalWidgetImageSubIconNumberDto.backgroundColor);
        }

        public final int hashCode() {
            return this.backgroundColor.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.content);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetImageSubIconNumberDto(type=");
            sb.append(this.type);
            sb.append(", content=");
            sb.append(this.content);
            sb.append(", backgroundColor=");
            return ho8.a(sb, this.backgroundColor, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.content);
            parcel.writeString(this.backgroundColor);
        }
    }

    /* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetImageSubIconVerifiedDto extends SuperAppUniversalWidgetImageSubIconDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetImageSubIconVerifiedDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("verified")
            public static final TypeDto VERIFIED;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
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
                TypeDto typeDto = new TypeDto("VERIFIED", 0, "verified");
                VERIFIED = typeDto;
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

        /* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetImageSubIconVerifiedDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetImageSubIconVerifiedDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetImageSubIconVerifiedDto(TypeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetImageSubIconVerifiedDto[] newArray(int i) {
                return new SuperAppUniversalWidgetImageSubIconVerifiedDto[i];
            }
        }

        public SuperAppUniversalWidgetImageSubIconVerifiedDto(TypeDto typeDto) {
            super(null);
            this.type = typeDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuperAppUniversalWidgetImageSubIconVerifiedDto) && this.type == ((SuperAppUniversalWidgetImageSubIconVerifiedDto) obj).type;
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final String toString() {
            return "SuperAppUniversalWidgetImageSubIconVerifiedDto(type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
        }
    }

    /* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppUniversalWidgetImageSubIconVideoLiveDto extends SuperAppUniversalWidgetImageSubIconDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppUniversalWidgetImageSubIconVideoLiveDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("video_live")
            public static final TypeDto VIDEO_LIVE;
            private final String value;

            /* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
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
                TypeDto typeDto = new TypeDto("VIDEO_LIVE", 0, "video_live");
                VIDEO_LIVE = typeDto;
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

        /* compiled from: SuperAppUniversalWidgetImageSubIconDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetImageSubIconVideoLiveDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetImageSubIconVideoLiveDto createFromParcel(Parcel parcel) {
                return new SuperAppUniversalWidgetImageSubIconVideoLiveDto(TypeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppUniversalWidgetImageSubIconVideoLiveDto[] newArray(int i) {
                return new SuperAppUniversalWidgetImageSubIconVideoLiveDto[i];
            }
        }

        public SuperAppUniversalWidgetImageSubIconVideoLiveDto(TypeDto typeDto) {
            super(null);
            this.type = typeDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuperAppUniversalWidgetImageSubIconVideoLiveDto) && this.type == ((SuperAppUniversalWidgetImageSubIconVideoLiveDto) obj).type;
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final String toString() {
            return "SuperAppUniversalWidgetImageSubIconVideoLiveDto(type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetImageSubIconDto(zcl zclVar) {
        this();
    }

    private SuperAppUniversalWidgetImageSubIconDto() {
    }
}

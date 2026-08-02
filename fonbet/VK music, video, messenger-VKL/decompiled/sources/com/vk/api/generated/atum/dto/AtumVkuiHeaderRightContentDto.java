package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dn;
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

/* compiled from: AtumVkuiHeaderRightContentDto.kt */
/* loaded from: classes.dex */
public abstract class AtumVkuiHeaderRightContentDto implements Parcelable {

    /* compiled from: AtumVkuiHeaderRightContentDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiButtonDto extends AtumVkuiHeaderRightContentDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiButtonDto> CREATOR = new a();

        @pmi0("props")
        private final AtumVkuiButtonPropsDto props;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiHeaderRightContentDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("button")
            public static final TypeDto BUTTON;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AtumVkuiHeaderRightContentDto.kt */
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
                TypeDto typeDto = new TypeDto("BUTTON", 0, "button");
                BUTTON = typeDto;
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

        /* compiled from: AtumVkuiHeaderRightContentDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiButtonDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiButtonDto createFromParcel(Parcel parcel) {
                return new AtumVkuiButtonDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiButtonPropsDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiButtonDto[] newArray(int i) {
                return new AtumVkuiButtonDto[i];
            }
        }

        public AtumVkuiButtonDto(TypeDto typeDto, AtumVkuiButtonPropsDto atumVkuiButtonPropsDto) {
            super(null);
            this.type = typeDto;
            this.props = atumVkuiButtonPropsDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiButtonDto)) {
                return false;
            }
            AtumVkuiButtonDto atumVkuiButtonDto = (AtumVkuiButtonDto) obj;
            return this.type == atumVkuiButtonDto.type && epx.f(this.props, atumVkuiButtonDto.props);
        }

        public final int hashCode() {
            return this.props.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "AtumVkuiButtonDto(type=" + this.type + ", props=" + this.props + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.props.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AtumVkuiHeaderRightContentDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiDropdownDto extends AtumVkuiHeaderRightContentDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiDropdownDto> CREATOR = new a();

        @pmi0("actions")
        private final List<AtumVkuiAnyActionDto> actions;

        @pmi0("appearance")
        private final AppearanceDto appearance;

        @pmi0("title")
        private final String title;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiHeaderRightContentDto.kt */
        public static final class AppearanceDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ AppearanceDto[] $VALUES;

            @pmi0("accent")
            public static final AppearanceDto ACCENT;
            public static final Parcelable.Creator<AppearanceDto> CREATOR;

            @pmi0("neutral")
            public static final AppearanceDto NEUTRAL;
            private final String value;

            /* compiled from: AtumVkuiHeaderRightContentDto.kt */
            public static final class a implements Parcelable.Creator<AppearanceDto> {
                @Override // android.os.Parcelable.Creator
                public final AppearanceDto createFromParcel(Parcel parcel) {
                    return AppearanceDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AppearanceDto[] newArray(int i) {
                    return new AppearanceDto[i];
                }
            }

            static {
                AppearanceDto appearanceDto = new AppearanceDto("ACCENT", 0, "accent");
                ACCENT = appearanceDto;
                AppearanceDto appearanceDto2 = new AppearanceDto("NEUTRAL", 1, "neutral");
                NEUTRAL = appearanceDto2;
                AppearanceDto[] appearanceDtoArr = {appearanceDto, appearanceDto2};
                $VALUES = appearanceDtoArr;
                $ENTRIES = new asp(appearanceDtoArr);
                CREATOR = new a();
            }

            private AppearanceDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static AppearanceDto valueOf(String str) {
                return (AppearanceDto) Enum.valueOf(AppearanceDto.class, str);
            }

            public static AppearanceDto[] values() {
                return (AppearanceDto[]) $VALUES.clone();
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
        /* compiled from: AtumVkuiHeaderRightContentDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("dropdown")
            public static final TypeDto DROPDOWN;
            private final String value;

            /* compiled from: AtumVkuiHeaderRightContentDto.kt */
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
                TypeDto typeDto = new TypeDto("DROPDOWN", 0, "dropdown");
                DROPDOWN = typeDto;
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

        /* compiled from: AtumVkuiHeaderRightContentDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiDropdownDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiDropdownDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                ArrayList arrayList = null;
                AppearanceDto createFromParcel2 = parcel.readInt() == 0 ? null : AppearanceDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(AtumVkuiAnyActionDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new AtumVkuiDropdownDto(createFromParcel, readString, createFromParcel2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiDropdownDto[] newArray(int i) {
                return new AtumVkuiDropdownDto[i];
            }
        }

        public /* synthetic */ AtumVkuiDropdownDto(TypeDto typeDto, String str, AppearanceDto appearanceDto, List list, int i, zcl zclVar) {
            this(typeDto, str, (i & 4) != 0 ? null : appearanceDto, (i & 8) != 0 ? null : list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiDropdownDto)) {
                return false;
            }
            AtumVkuiDropdownDto atumVkuiDropdownDto = (AtumVkuiDropdownDto) obj;
            return this.type == atumVkuiDropdownDto.type && epx.f(this.title, atumVkuiDropdownDto.title) && this.appearance == atumVkuiDropdownDto.appearance && epx.f(this.actions, atumVkuiDropdownDto.actions);
        }

        public final int hashCode() {
            int a2 = urd0.a(this.type.hashCode() * 31, 31, this.title);
            AppearanceDto appearanceDto = this.appearance;
            int hashCode = (a2 + (appearanceDto == null ? 0 : appearanceDto.hashCode())) * 31;
            List<AtumVkuiAnyActionDto> list = this.actions;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiDropdownDto(type=");
            sb.append(this.type);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", appearance=");
            sb.append(this.appearance);
            sb.append(", actions=");
            return ms9.a(')', sb, this.actions);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.title);
            AppearanceDto appearanceDto = this.appearance;
            if (appearanceDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                appearanceDto.writeToParcel(parcel, i);
            }
            List<AtumVkuiAnyActionDto> list = this.actions;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AtumVkuiAnyActionDto) f.next()).writeToParcel(parcel, i);
            }
        }

        public AtumVkuiDropdownDto(TypeDto typeDto, String str, AppearanceDto appearanceDto, List<AtumVkuiAnyActionDto> list) {
            super(null);
            this.type = typeDto;
            this.title = str;
            this.appearance = appearanceDto;
            this.actions = list;
        }
    }

    /* compiled from: AtumVkuiHeaderRightContentDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiHeaderRightContentDetailDto extends AtumVkuiHeaderRightContentDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiHeaderRightContentDetailDto> CREATOR = new a();

        @pmi0("text")
        private final String text;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiHeaderRightContentDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("detail")
            public static final TypeDto DETAIL;
            private final String value;

            /* compiled from: AtumVkuiHeaderRightContentDto.kt */
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
                TypeDto typeDto = new TypeDto("DETAIL", 0, "detail");
                DETAIL = typeDto;
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

        /* compiled from: AtumVkuiHeaderRightContentDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiHeaderRightContentDetailDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiHeaderRightContentDetailDto createFromParcel(Parcel parcel) {
                return new AtumVkuiHeaderRightContentDetailDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiHeaderRightContentDetailDto[] newArray(int i) {
                return new AtumVkuiHeaderRightContentDetailDto[i];
            }
        }

        public AtumVkuiHeaderRightContentDetailDto(TypeDto typeDto, String str) {
            super(null);
            this.type = typeDto;
            this.text = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiHeaderRightContentDetailDto)) {
                return false;
            }
            AtumVkuiHeaderRightContentDetailDto atumVkuiHeaderRightContentDetailDto = (AtumVkuiHeaderRightContentDetailDto) obj;
            return this.type == atumVkuiHeaderRightContentDetailDto.type && epx.f(this.text, atumVkuiHeaderRightContentDetailDto.text);
        }

        public final int hashCode() {
            return this.text.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiHeaderRightContentDetailDto(type=");
            sb.append(this.type);
            sb.append(", text=");
            return ho8.a(sb, this.text, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.text);
        }
    }

    /* compiled from: AtumVkuiHeaderRightContentDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiHeaderRightContentMoreDto extends AtumVkuiHeaderRightContentDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiHeaderRightContentMoreDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiHeaderRightContentDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("more")
            public static final TypeDto MORE;
            private final String value;

            /* compiled from: AtumVkuiHeaderRightContentDto.kt */
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
                TypeDto typeDto = new TypeDto("MORE", 0, "more");
                MORE = typeDto;
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

        /* compiled from: AtumVkuiHeaderRightContentDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiHeaderRightContentMoreDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiHeaderRightContentMoreDto createFromParcel(Parcel parcel) {
                return new AtumVkuiHeaderRightContentMoreDto(TypeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiHeaderRightContentMoreDto[] newArray(int i) {
                return new AtumVkuiHeaderRightContentMoreDto[i];
            }
        }

        public AtumVkuiHeaderRightContentMoreDto(TypeDto typeDto) {
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
            return (obj instanceof AtumVkuiHeaderRightContentMoreDto) && this.type == ((AtumVkuiHeaderRightContentMoreDto) obj).type;
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final String toString() {
            return "AtumVkuiHeaderRightContentMoreDto(type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AtumVkuiHeaderRightContentDto.kt */
    public static final class Deserializer implements a9y<AtumVkuiHeaderRightContentDto> {
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
                    case -1377687758:
                        if (f.equals("button")) {
                            return (AtumVkuiHeaderRightContentDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiButtonDto.class);
                        }
                        break;
                    case -1335224239:
                        if (f.equals("detail")) {
                            return (AtumVkuiHeaderRightContentDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiHeaderRightContentDetailDto.class);
                        }
                        break;
                    case -432061423:
                        if (f.equals("dropdown")) {
                            return (AtumVkuiHeaderRightContentDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiDropdownDto.class);
                        }
                        break;
                    case 3357525:
                        if (f.equals("more")) {
                            return (AtumVkuiHeaderRightContentDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiHeaderRightContentMoreDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    public /* synthetic */ AtumVkuiHeaderRightContentDto(zcl zclVar) {
        this();
    }

    private AtumVkuiHeaderRightContentDto() {
    }
}

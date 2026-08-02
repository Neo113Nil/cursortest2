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
import xsna.ms9;
import xsna.pmi0;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
/* loaded from: classes.dex */
public abstract class AtumVkuiSnackbarAccessoryDto implements Parcelable {

    /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiSnackbarAccessoryAvatarDto extends AtumVkuiSnackbarAccessoryDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiSnackbarAccessoryAvatarDto> CREATOR = new a();

        @pmi0("image")
        private final AtumVkuiLocalImageDto image;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("avatar")
            public static final TypeDto AVATAR;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
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
                TypeDto typeDto = new TypeDto("AVATAR", 0, "avatar");
                AVATAR = typeDto;
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

        /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiSnackbarAccessoryAvatarDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSnackbarAccessoryAvatarDto createFromParcel(Parcel parcel) {
                return new AtumVkuiSnackbarAccessoryAvatarDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiLocalImageDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSnackbarAccessoryAvatarDto[] newArray(int i) {
                return new AtumVkuiSnackbarAccessoryAvatarDto[i];
            }
        }

        public AtumVkuiSnackbarAccessoryAvatarDto(TypeDto typeDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto) {
            super(null);
            this.type = typeDto;
            this.image = atumVkuiLocalImageDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiSnackbarAccessoryAvatarDto)) {
                return false;
            }
            AtumVkuiSnackbarAccessoryAvatarDto atumVkuiSnackbarAccessoryAvatarDto = (AtumVkuiSnackbarAccessoryAvatarDto) obj;
            return this.type == atumVkuiSnackbarAccessoryAvatarDto.type && this.image == atumVkuiSnackbarAccessoryAvatarDto.image;
        }

        public final int hashCode() {
            return this.image.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "AtumVkuiSnackbarAccessoryAvatarDto(type=" + this.type + ", image=" + this.image + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.image.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiSnackbarAccessoryButtonIconDto extends AtumVkuiSnackbarAccessoryDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiSnackbarAccessoryButtonIconDto> CREATOR = new a();

        @pmi0("actions")
        private final List<AtumVkuiAnyActionDto> actions;

        @pmi0("image")
        private final AtumVkuiLocalImageDto image;

        @pmi0("tint_color")
        private final AtumImageTintDto tintColor;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("button_icon")
            public static final TypeDto BUTTON_ICON;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
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
                TypeDto typeDto = new TypeDto("BUTTON_ICON", 0, "button_icon");
                BUTTON_ICON = typeDto;
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

        /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiSnackbarAccessoryButtonIconDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSnackbarAccessoryButtonIconDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                AtumVkuiLocalImageDto createFromParcel2 = AtumVkuiLocalImageDto.CREATOR.createFromParcel(parcel);
                AtumImageTintDto createFromParcel3 = AtumImageTintDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(AtumVkuiAnyActionDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new AtumVkuiSnackbarAccessoryButtonIconDto(createFromParcel, createFromParcel2, createFromParcel3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSnackbarAccessoryButtonIconDto[] newArray(int i) {
                return new AtumVkuiSnackbarAccessoryButtonIconDto[i];
            }
        }

        public /* synthetic */ AtumVkuiSnackbarAccessoryButtonIconDto(TypeDto typeDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto, AtumImageTintDto atumImageTintDto, List list, int i, zcl zclVar) {
            this(typeDto, atumVkuiLocalImageDto, atumImageTintDto, (i & 8) != 0 ? null : list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiSnackbarAccessoryButtonIconDto)) {
                return false;
            }
            AtumVkuiSnackbarAccessoryButtonIconDto atumVkuiSnackbarAccessoryButtonIconDto = (AtumVkuiSnackbarAccessoryButtonIconDto) obj;
            return this.type == atumVkuiSnackbarAccessoryButtonIconDto.type && this.image == atumVkuiSnackbarAccessoryButtonIconDto.image && this.tintColor == atumVkuiSnackbarAccessoryButtonIconDto.tintColor && epx.f(this.actions, atumVkuiSnackbarAccessoryButtonIconDto.actions);
        }

        public final int hashCode() {
            int hashCode = (this.tintColor.hashCode() + ((this.image.hashCode() + (this.type.hashCode() * 31)) * 31)) * 31;
            List<AtumVkuiAnyActionDto> list = this.actions;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiSnackbarAccessoryButtonIconDto(type=");
            sb.append(this.type);
            sb.append(", image=");
            sb.append(this.image);
            sb.append(", tintColor=");
            sb.append(this.tintColor);
            sb.append(", actions=");
            return ms9.a(')', sb, this.actions);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.image.writeToParcel(parcel, i);
            this.tintColor.writeToParcel(parcel, i);
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

        public AtumVkuiSnackbarAccessoryButtonIconDto(TypeDto typeDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto, AtumImageTintDto atumImageTintDto, List<AtumVkuiAnyActionDto> list) {
            super(null);
            this.type = typeDto;
            this.image = atumVkuiLocalImageDto;
            this.tintColor = atumImageTintDto;
            this.actions = list;
        }
    }

    /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiSnackbarAccessoryButtonTextDto extends AtumVkuiSnackbarAccessoryDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiSnackbarAccessoryButtonTextDto> CREATOR = new a();

        @pmi0("actions")
        private final List<AtumVkuiAnyActionDto> actions;

        @pmi0("text")
        private final String text;

        @pmi0("tint_color")
        private final AtumStyledColorDto tintColor;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("button_text")
            public static final TypeDto BUTTON_TEXT;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
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
                TypeDto typeDto = new TypeDto("BUTTON_TEXT", 0, "button_text");
                BUTTON_TEXT = typeDto;
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

        /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiSnackbarAccessoryButtonTextDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSnackbarAccessoryButtonTextDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                ArrayList arrayList = null;
                AtumStyledColorDto createFromParcel2 = parcel.readInt() == 0 ? null : AtumStyledColorDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(AtumVkuiAnyActionDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new AtumVkuiSnackbarAccessoryButtonTextDto(createFromParcel, readString, createFromParcel2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSnackbarAccessoryButtonTextDto[] newArray(int i) {
                return new AtumVkuiSnackbarAccessoryButtonTextDto[i];
            }
        }

        public /* synthetic */ AtumVkuiSnackbarAccessoryButtonTextDto(TypeDto typeDto, String str, AtumStyledColorDto atumStyledColorDto, List list, int i, zcl zclVar) {
            this(typeDto, str, (i & 4) != 0 ? null : atumStyledColorDto, (i & 8) != 0 ? null : list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiSnackbarAccessoryButtonTextDto)) {
                return false;
            }
            AtumVkuiSnackbarAccessoryButtonTextDto atumVkuiSnackbarAccessoryButtonTextDto = (AtumVkuiSnackbarAccessoryButtonTextDto) obj;
            return this.type == atumVkuiSnackbarAccessoryButtonTextDto.type && epx.f(this.text, atumVkuiSnackbarAccessoryButtonTextDto.text) && epx.f(this.tintColor, atumVkuiSnackbarAccessoryButtonTextDto.tintColor) && epx.f(this.actions, atumVkuiSnackbarAccessoryButtonTextDto.actions);
        }

        public final int hashCode() {
            int a2 = urd0.a(this.type.hashCode() * 31, 31, this.text);
            AtumStyledColorDto atumStyledColorDto = this.tintColor;
            int hashCode = (a2 + (atumStyledColorDto == null ? 0 : atumStyledColorDto.hashCode())) * 31;
            List<AtumVkuiAnyActionDto> list = this.actions;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AtumVkuiSnackbarAccessoryButtonTextDto(type=");
            sb.append(this.type);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", tintColor=");
            sb.append(this.tintColor);
            sb.append(", actions=");
            return ms9.a(')', sb, this.actions);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.text);
            AtumStyledColorDto atumStyledColorDto = this.tintColor;
            if (atumStyledColorDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumStyledColorDto.writeToParcel(parcel, i);
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

        public AtumVkuiSnackbarAccessoryButtonTextDto(TypeDto typeDto, String str, AtumStyledColorDto atumStyledColorDto, List<AtumVkuiAnyActionDto> list) {
            super(null);
            this.type = typeDto;
            this.text = str;
            this.tintColor = atumStyledColorDto;
            this.actions = list;
        }
    }

    /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiSnackbarAccessoryErrorDto extends AtumVkuiSnackbarAccessoryDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiSnackbarAccessoryErrorDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("error")
            public static final TypeDto ERROR;
            private final String value;

            /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
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
                TypeDto typeDto = new TypeDto("ERROR", 0, "error");
                ERROR = typeDto;
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

        /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiSnackbarAccessoryErrorDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSnackbarAccessoryErrorDto createFromParcel(Parcel parcel) {
                return new AtumVkuiSnackbarAccessoryErrorDto(TypeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSnackbarAccessoryErrorDto[] newArray(int i) {
                return new AtumVkuiSnackbarAccessoryErrorDto[i];
            }
        }

        public AtumVkuiSnackbarAccessoryErrorDto(TypeDto typeDto) {
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
            return (obj instanceof AtumVkuiSnackbarAccessoryErrorDto) && this.type == ((AtumVkuiSnackbarAccessoryErrorDto) obj).type;
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final String toString() {
            return "AtumVkuiSnackbarAccessoryErrorDto(type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiSnackbarAccessoryIconDto extends AtumVkuiSnackbarAccessoryDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiSnackbarAccessoryIconDto> CREATOR = new a();

        @pmi0("image")
        private final AtumVkuiLocalImageDto image;

        @pmi0("sys_tint_color")
        private final AtumImageTintDto sysTintColor;

        @pmi0("tint_color")
        private final AtumStyledColorDto tintColor;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("avatar")
            public static final TypeDto AVATAR;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
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
                TypeDto typeDto = new TypeDto("AVATAR", 0, "avatar");
                AVATAR = typeDto;
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

        /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiSnackbarAccessoryIconDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSnackbarAccessoryIconDto createFromParcel(Parcel parcel) {
                return new AtumVkuiSnackbarAccessoryIconDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiLocalImageDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AtumImageTintDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AtumStyledColorDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSnackbarAccessoryIconDto[] newArray(int i) {
                return new AtumVkuiSnackbarAccessoryIconDto[i];
            }
        }

        public /* synthetic */ AtumVkuiSnackbarAccessoryIconDto(TypeDto typeDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto, AtumImageTintDto atumImageTintDto, AtumStyledColorDto atumStyledColorDto, int i, zcl zclVar) {
            this(typeDto, atumVkuiLocalImageDto, (i & 4) != 0 ? null : atumImageTintDto, (i & 8) != 0 ? null : atumStyledColorDto);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiSnackbarAccessoryIconDto)) {
                return false;
            }
            AtumVkuiSnackbarAccessoryIconDto atumVkuiSnackbarAccessoryIconDto = (AtumVkuiSnackbarAccessoryIconDto) obj;
            return this.type == atumVkuiSnackbarAccessoryIconDto.type && this.image == atumVkuiSnackbarAccessoryIconDto.image && this.sysTintColor == atumVkuiSnackbarAccessoryIconDto.sysTintColor && epx.f(this.tintColor, atumVkuiSnackbarAccessoryIconDto.tintColor);
        }

        public final int hashCode() {
            int hashCode = (this.image.hashCode() + (this.type.hashCode() * 31)) * 31;
            AtumImageTintDto atumImageTintDto = this.sysTintColor;
            int hashCode2 = (hashCode + (atumImageTintDto == null ? 0 : atumImageTintDto.hashCode())) * 31;
            AtumStyledColorDto atumStyledColorDto = this.tintColor;
            return hashCode2 + (atumStyledColorDto != null ? atumStyledColorDto.hashCode() : 0);
        }

        public final String toString() {
            return "AtumVkuiSnackbarAccessoryIconDto(type=" + this.type + ", image=" + this.image + ", sysTintColor=" + this.sysTintColor + ", tintColor=" + this.tintColor + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.image.writeToParcel(parcel, i);
            AtumImageTintDto atumImageTintDto = this.sysTintColor;
            if (atumImageTintDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumImageTintDto.writeToParcel(parcel, i);
            }
            AtumStyledColorDto atumStyledColorDto = this.tintColor;
            if (atumStyledColorDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                atumStyledColorDto.writeToParcel(parcel, i);
            }
        }

        public AtumVkuiSnackbarAccessoryIconDto(TypeDto typeDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto, AtumImageTintDto atumImageTintDto, AtumStyledColorDto atumStyledColorDto) {
            super(null);
            this.type = typeDto;
            this.image = atumVkuiLocalImageDto;
            this.sysTintColor = atumImageTintDto;
            this.tintColor = atumStyledColorDto;
        }
    }

    /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiSnackbarAccessoryImageDto extends AtumVkuiSnackbarAccessoryDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiSnackbarAccessoryImageDto> CREATOR = new a();

        @pmi0("image")
        private final AtumVkuiLocalImageDto image;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("image")
            public static final TypeDto IMAGE;
            private final String value;

            /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
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
                TypeDto typeDto = new TypeDto("IMAGE", 0, "image");
                IMAGE = typeDto;
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

        /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiSnackbarAccessoryImageDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSnackbarAccessoryImageDto createFromParcel(Parcel parcel) {
                return new AtumVkuiSnackbarAccessoryImageDto(TypeDto.CREATOR.createFromParcel(parcel), AtumVkuiLocalImageDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSnackbarAccessoryImageDto[] newArray(int i) {
                return new AtumVkuiSnackbarAccessoryImageDto[i];
            }
        }

        public AtumVkuiSnackbarAccessoryImageDto(TypeDto typeDto, AtumVkuiLocalImageDto atumVkuiLocalImageDto) {
            super(null);
            this.type = typeDto;
            this.image = atumVkuiLocalImageDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AtumVkuiSnackbarAccessoryImageDto)) {
                return false;
            }
            AtumVkuiSnackbarAccessoryImageDto atumVkuiSnackbarAccessoryImageDto = (AtumVkuiSnackbarAccessoryImageDto) obj;
            return this.type == atumVkuiSnackbarAccessoryImageDto.type && this.image == atumVkuiSnackbarAccessoryImageDto.image;
        }

        public final int hashCode() {
            return this.image.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "AtumVkuiSnackbarAccessoryImageDto(type=" + this.type + ", image=" + this.image + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.image.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
    /* loaded from: classes14.dex */
    public static final class AtumVkuiSnackbarAccessorySuccessDto extends AtumVkuiSnackbarAccessoryDto implements Parcelable {
        public static final Parcelable.Creator<AtumVkuiSnackbarAccessorySuccessDto> CREATOR = new a();

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("success")
            public static final TypeDto SUCCESS;
            private final String value;

            /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
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
                TypeDto typeDto = new TypeDto("SUCCESS", 0, "success");
                SUCCESS = typeDto;
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

        /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
        public static final class a implements Parcelable.Creator<AtumVkuiSnackbarAccessorySuccessDto> {
            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSnackbarAccessorySuccessDto createFromParcel(Parcel parcel) {
                return new AtumVkuiSnackbarAccessorySuccessDto(TypeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AtumVkuiSnackbarAccessorySuccessDto[] newArray(int i) {
                return new AtumVkuiSnackbarAccessorySuccessDto[i];
            }
        }

        public AtumVkuiSnackbarAccessorySuccessDto(TypeDto typeDto) {
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
            return (obj instanceof AtumVkuiSnackbarAccessorySuccessDto) && this.type == ((AtumVkuiSnackbarAccessorySuccessDto) obj).type;
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final String toString() {
            return "AtumVkuiSnackbarAccessorySuccessDto(type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
        }
    }

    /* compiled from: AtumVkuiSnackbarAccessoryDto.kt */
    public static final class Deserializer implements a9y<AtumVkuiSnackbarAccessoryDto> {
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
                    case -1867169789:
                        if (f.equals("success")) {
                            return (AtumVkuiSnackbarAccessoryDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiSnackbarAccessorySuccessDto.class);
                        }
                        break;
                    case -1759740570:
                        if (f.equals("button_icon")) {
                            return (AtumVkuiSnackbarAccessoryDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiSnackbarAccessoryButtonIconDto.class);
                        }
                        break;
                    case -1759410662:
                        if (f.equals("button_text")) {
                            return (AtumVkuiSnackbarAccessoryDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiSnackbarAccessoryButtonTextDto.class);
                        }
                        break;
                    case -1405959847:
                        if (f.equals("avatar")) {
                            return (AtumVkuiSnackbarAccessoryDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiSnackbarAccessoryAvatarDto.class);
                        }
                        break;
                    case 3226745:
                        if (f.equals("icon")) {
                            return (AtumVkuiSnackbarAccessoryDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiSnackbarAccessoryIconDto.class);
                        }
                        break;
                    case 96784904:
                        if (f.equals("error")) {
                            return (AtumVkuiSnackbarAccessoryDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiSnackbarAccessoryErrorDto.class);
                        }
                        break;
                    case 100313435:
                        if (f.equals("image")) {
                            return (AtumVkuiSnackbarAccessoryDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, AtumVkuiSnackbarAccessoryImageDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    public /* synthetic */ AtumVkuiSnackbarAccessoryDto(zcl zclVar) {
        this();
    }

    private AtumVkuiSnackbarAccessoryDto() {
    }
}

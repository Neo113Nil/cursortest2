package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetActionDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageBlockDto;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageItemDto;
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
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;
import xsna.zyk0;

/* compiled from: SuperAppShowcaseTileForegroundDto.kt */
/* loaded from: classes.dex */
public abstract class SuperAppShowcaseTileForegroundDto implements Parcelable {

    /* compiled from: SuperAppShowcaseTileForegroundDto.kt */
    public static final class Deserializer implements a9y<SuperAppShowcaseTileForegroundDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                int hashCode = f.hashCode();
                if (hashCode != -1377687758) {
                    if (hashCode != 3556653) {
                        if (hashCode == 1934806292 && f.equals("user_stack")) {
                            return (SuperAppShowcaseTileForegroundDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseTileForegroundUserStackDto.class);
                        }
                    } else if (f.equals("text")) {
                        return (SuperAppShowcaseTileForegroundDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseTileForegroundTextDto.class);
                    }
                } else if (f.equals("button")) {
                    return (SuperAppShowcaseTileForegroundDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SuperAppShowcaseTileForegroundButtonDto.class);
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SuperAppShowcaseTileForegroundDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseTileForegroundButtonDto extends SuperAppShowcaseTileForegroundDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseTileForegroundButtonDto> CREATOR = new a();

        @pmi0("action")
        private final SuperAppUniversalWidgetActionDto action;

        @pmi0("icon")
        private final List<SuperAppUniversalWidgetImageItemDto> icon;

        @pmi0("is_icon_right")
        private final Boolean isIconRight;

        @pmi0("text")
        private final String text;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("use_tint")
        private final Boolean useTint;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseTileForegroundDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("button")
            public static final TypeDto BUTTON;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: SuperAppShowcaseTileForegroundDto.kt */
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

        /* compiled from: SuperAppShowcaseTileForegroundDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseTileForegroundButtonDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileForegroundButtonDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Boolean valueOf;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppShowcaseTileForegroundButtonDto.class.getClassLoader());
                String readString = parcel.readString();
                Boolean bool = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
                    }
                }
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SuperAppShowcaseTileForegroundButtonDto(createFromParcel, superAppUniversalWidgetActionDto, readString, arrayList, valueOf, bool);
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileForegroundButtonDto[] newArray(int i) {
                return new SuperAppShowcaseTileForegroundButtonDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseTileForegroundButtonDto(TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str, List list, Boolean bool, Boolean bool2, int i, zcl zclVar) {
            this(typeDto, superAppUniversalWidgetActionDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2);
        }

        public final SuperAppUniversalWidgetActionDto d() {
            return this.action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<SuperAppUniversalWidgetImageItemDto> e() {
            return this.icon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseTileForegroundButtonDto)) {
                return false;
            }
            SuperAppShowcaseTileForegroundButtonDto superAppShowcaseTileForegroundButtonDto = (SuperAppShowcaseTileForegroundButtonDto) obj;
            return this.type == superAppShowcaseTileForegroundButtonDto.type && epx.f(this.action, superAppShowcaseTileForegroundButtonDto.action) && epx.f(this.text, superAppShowcaseTileForegroundButtonDto.text) && epx.f(this.icon, superAppShowcaseTileForegroundButtonDto.icon) && epx.f(this.useTint, superAppShowcaseTileForegroundButtonDto.useTint) && epx.f(this.isIconRight, superAppShowcaseTileForegroundButtonDto.isIconRight);
        }

        public final String f() {
            return this.text;
        }

        public final Boolean g() {
            return this.useTint;
        }

        public final int hashCode() {
            int a2 = zyk0.a(this.action, this.type.hashCode() * 31, 31);
            String str = this.text;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            List<SuperAppUniversalWidgetImageItemDto> list = this.icon;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.useTint;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isIconRight;
            return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final Boolean i() {
            return this.isIconRight;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseTileForegroundButtonDto(type=");
            sb.append(this.type);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", text=");
            sb.append(this.text);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", useTint=");
            sb.append(this.useTint);
            sb.append(", isIconRight=");
            return tn.a(sb, this.isIconRight, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.action, i);
            parcel.writeString(this.text);
            List<SuperAppUniversalWidgetImageItemDto> list = this.icon;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    ((SuperAppUniversalWidgetImageItemDto) f.next()).writeToParcel(parcel, i);
                }
            }
            Boolean bool = this.useTint;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool);
            }
            Boolean bool2 = this.isIconRight;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                sn.f(parcel, 1, bool2);
            }
        }

        public SuperAppShowcaseTileForegroundButtonDto(TypeDto typeDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str, List<SuperAppUniversalWidgetImageItemDto> list, Boolean bool, Boolean bool2) {
            super(null);
            this.type = typeDto;
            this.action = superAppUniversalWidgetActionDto;
            this.text = str;
            this.icon = list;
            this.useTint = bool;
            this.isIconRight = bool2;
        }
    }

    /* compiled from: SuperAppShowcaseTileForegroundDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseTileForegroundTextDto extends SuperAppShowcaseTileForegroundDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseTileForegroundTextDto> CREATOR = new a();

        @pmi0(TtmlNode.TAG_STYLE)
        private final StyleDto style;

        @pmi0("text")
        private final String text;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseTileForegroundDto.kt */
        public static final class StyleDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ StyleDto[] $VALUES;
            public static final Parcelable.Creator<StyleDto> CREATOR;

            @pmi0("primary")
            public static final StyleDto PRIMARY;

            @pmi0(X3.i.Y)
            public static final StyleDto SECONDARY;
            private final String value;

            /* compiled from: SuperAppShowcaseTileForegroundDto.kt */
            public static final class a implements Parcelable.Creator<StyleDto> {
                @Override // android.os.Parcelable.Creator
                public final StyleDto createFromParcel(Parcel parcel) {
                    return StyleDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final StyleDto[] newArray(int i) {
                    return new StyleDto[i];
                }
            }

            static {
                StyleDto styleDto = new StyleDto("PRIMARY", 0, "primary");
                PRIMARY = styleDto;
                StyleDto styleDto2 = new StyleDto("SECONDARY", 1, X3.i.Y);
                SECONDARY = styleDto2;
                StyleDto[] styleDtoArr = {styleDto, styleDto2};
                $VALUES = styleDtoArr;
                $ENTRIES = new asp(styleDtoArr);
                CREATOR = new a();
            }

            private StyleDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static StyleDto valueOf(String str) {
                return (StyleDto) Enum.valueOf(StyleDto.class, str);
            }

            public static StyleDto[] values() {
                return (StyleDto[]) $VALUES.clone();
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
        /* compiled from: SuperAppShowcaseTileForegroundDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("text")
            public static final TypeDto TEXT;
            private final String value;

            /* compiled from: SuperAppShowcaseTileForegroundDto.kt */
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
                TypeDto typeDto = new TypeDto("TEXT", 0, "text");
                TEXT = typeDto;
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

        /* compiled from: SuperAppShowcaseTileForegroundDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseTileForegroundTextDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileForegroundTextDto createFromParcel(Parcel parcel) {
                return new SuperAppShowcaseTileForegroundTextDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), StyleDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileForegroundTextDto[] newArray(int i) {
                return new SuperAppShowcaseTileForegroundTextDto[i];
            }
        }

        public SuperAppShowcaseTileForegroundTextDto(TypeDto typeDto, String str, StyleDto styleDto) {
            super(null);
            this.type = typeDto;
            this.text = str;
            this.style = styleDto;
        }

        public final StyleDto d() {
            return this.style;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseTileForegroundTextDto)) {
                return false;
            }
            SuperAppShowcaseTileForegroundTextDto superAppShowcaseTileForegroundTextDto = (SuperAppShowcaseTileForegroundTextDto) obj;
            return this.type == superAppShowcaseTileForegroundTextDto.type && epx.f(this.text, superAppShowcaseTileForegroundTextDto.text) && this.style == superAppShowcaseTileForegroundTextDto.style;
        }

        public final int hashCode() {
            return this.style.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.text);
        }

        public final String toString() {
            return "SuperAppShowcaseTileForegroundTextDto(type=" + this.type + ", text=" + this.text + ", style=" + this.style + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.text);
            this.style.writeToParcel(parcel, i);
        }
    }

    /* compiled from: SuperAppShowcaseTileForegroundDto.kt */
    /* loaded from: classes15.dex */
    public static final class SuperAppShowcaseTileForegroundUserStackDto extends SuperAppShowcaseTileForegroundDto implements Parcelable {
        public static final Parcelable.Creator<SuperAppShowcaseTileForegroundUserStackDto> CREATOR = new a();

        @pmi0("count")
        private final Integer count;

        @pmi0("items")
        private final List<SuperAppUniversalWidgetImageBlockDto> items;

        @pmi0("text")
        private final String text;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SuperAppShowcaseTileForegroundDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("user_stack")
            public static final TypeDto USER_STACK;
            private final String value;

            /* compiled from: SuperAppShowcaseTileForegroundDto.kt */
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
                TypeDto typeDto = new TypeDto("USER_STACK", 0, "user_stack");
                USER_STACK = typeDto;
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

        /* compiled from: SuperAppShowcaseTileForegroundDto.kt */
        public static final class a implements Parcelable.Creator<SuperAppShowcaseTileForegroundUserStackDto> {
            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileForegroundUserStackDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SuperAppShowcaseTileForegroundUserStackDto.class, parcel, arrayList, i, 1);
                }
                return new SuperAppShowcaseTileForegroundUserStackDto(createFromParcel, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SuperAppShowcaseTileForegroundUserStackDto[] newArray(int i) {
                return new SuperAppShowcaseTileForegroundUserStackDto[i];
            }
        }

        public /* synthetic */ SuperAppShowcaseTileForegroundUserStackDto(TypeDto typeDto, List list, Integer num, String str, int i, zcl zclVar) {
            this(typeDto, list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
        }

        public final List<SuperAppUniversalWidgetImageBlockDto> d() {
            return this.items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuperAppShowcaseTileForegroundUserStackDto)) {
                return false;
            }
            SuperAppShowcaseTileForegroundUserStackDto superAppShowcaseTileForegroundUserStackDto = (SuperAppShowcaseTileForegroundUserStackDto) obj;
            return this.type == superAppShowcaseTileForegroundUserStackDto.type && epx.f(this.items, superAppShowcaseTileForegroundUserStackDto.items) && epx.f(this.count, superAppShowcaseTileForegroundUserStackDto.count) && epx.f(this.text, superAppShowcaseTileForegroundUserStackDto.text);
        }

        public final int hashCode() {
            int a2 = fw3.a(this.type.hashCode() * 31, 31, this.items);
            Integer num = this.count;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.text;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuperAppShowcaseTileForegroundUserStackDto(type=");
            sb.append(this.type);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", count=");
            sb.append(this.count);
            sb.append(", text=");
            return ho8.a(sb, this.text, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.items);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            Integer num = this.count;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            parcel.writeString(this.text);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuperAppShowcaseTileForegroundUserStackDto(TypeDto typeDto, List<? extends SuperAppUniversalWidgetImageBlockDto> list, Integer num, String str) {
            super(null);
            this.type = typeDto;
            this.items = list;
            this.count = num;
            this.text = str;
        }
    }

    public /* synthetic */ SuperAppShowcaseTileForegroundDto(zcl zclVar) {
        this();
    }

    private SuperAppShowcaseTileForegroundDto() {
    }
}

package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
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
import xsna.go9;
import xsna.ms9;
import xsna.pmi0;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShortVideoQuestionnaireQuestionDto.kt */
/* loaded from: classes15.dex */
public abstract class ShortVideoQuestionnaireQuestionDto implements Parcelable {

    /* compiled from: ShortVideoQuestionnaireQuestionDto.kt */
    public static final class Deserializer implements a9y<ShortVideoQuestionnaireQuestionDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -1745765694:
                        if (f.equals("multi_select")) {
                            return (ShortVideoQuestionnaireQuestionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoQuestionnaireQuestionWithValuesDto.class);
                        }
                        break;
                    case -906021636:
                        if (f.equals("select")) {
                            return (ShortVideoQuestionnaireQuestionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoQuestionnaireQuestionWithValuesDto.class);
                        }
                        break;
                    case 3556653:
                        if (f.equals("text")) {
                            return (ShortVideoQuestionnaireQuestionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoQuestionnaireQuestionBaseDto.class);
                        }
                        break;
                    case 109757537:
                        if (f.equals("stars")) {
                            return (ShortVideoQuestionnaireQuestionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoQuestionnaireQuestionBaseDto.class);
                        }
                        break;
                    case 583276348:
                        if (f.equals("select_inline")) {
                            return (ShortVideoQuestionnaireQuestionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoQuestionnaireQuestionWithValuesDto.class);
                        }
                        break;
                    case 1813179459:
                        if (f.equals("more_less")) {
                            return (ShortVideoQuestionnaireQuestionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoQuestionnaireQuestionBaseDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: ShortVideoQuestionnaireQuestionDto.kt */
    public static final class ShortVideoQuestionnaireQuestionBaseDto extends ShortVideoQuestionnaireQuestionDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoQuestionnaireQuestionBaseDto> CREATOR = new a();

        @pmi0("code")
        private final String code;

        @pmi0(TtmlNode.TAG_LAYOUT)
        private final ShortVideoQuestionnaireQuestionLayoutDto layout;

        @pmi0("targets")
        private final List<ShortVideoQuestionnaireQuestionTargetDto> targets;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoQuestionnaireQuestionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("more_less")
            public static final TypeDto MORE_LESS;

            @pmi0("multi_select")
            public static final TypeDto MULTI_SELECT;

            @pmi0("select")
            public static final TypeDto SELECT;

            @pmi0("select_inline")
            public static final TypeDto SELECT_INLINE;

            @pmi0("stars")
            public static final TypeDto STARS;

            @pmi0("text")
            public static final TypeDto TEXT;
            private final String value;

            /* compiled from: ShortVideoQuestionnaireQuestionDto.kt */
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
                TypeDto typeDto = new TypeDto("STARS", 0, "stars");
                STARS = typeDto;
                TypeDto typeDto2 = new TypeDto("TEXT", 1, "text");
                TEXT = typeDto2;
                TypeDto typeDto3 = new TypeDto("MORE_LESS", 2, "more_less");
                MORE_LESS = typeDto3;
                TypeDto typeDto4 = new TypeDto("SELECT", 3, "select");
                SELECT = typeDto4;
                TypeDto typeDto5 = new TypeDto("MULTI_SELECT", 4, "multi_select");
                MULTI_SELECT = typeDto5;
                TypeDto typeDto6 = new TypeDto("SELECT_INLINE", 5, "select_inline");
                SELECT_INLINE = typeDto6;
                TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6};
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

        /* compiled from: ShortVideoQuestionnaireQuestionDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoQuestionnaireQuestionBaseDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoQuestionnaireQuestionBaseDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                ShortVideoQuestionnaireQuestionLayoutDto createFromParcel2 = ShortVideoQuestionnaireQuestionLayoutDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(ShortVideoQuestionnaireQuestionTargetDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new ShortVideoQuestionnaireQuestionBaseDto(createFromParcel, readString, createFromParcel2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoQuestionnaireQuestionBaseDto[] newArray(int i) {
                return new ShortVideoQuestionnaireQuestionBaseDto[i];
            }
        }

        public ShortVideoQuestionnaireQuestionBaseDto(TypeDto typeDto, String str, ShortVideoQuestionnaireQuestionLayoutDto shortVideoQuestionnaireQuestionLayoutDto, List<ShortVideoQuestionnaireQuestionTargetDto> list) {
            super(null);
            this.type = typeDto;
            this.code = str;
            this.layout = shortVideoQuestionnaireQuestionLayoutDto;
            this.targets = list;
        }

        public final String d() {
            return this.code;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final ShortVideoQuestionnaireQuestionLayoutDto e() {
            return this.layout;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoQuestionnaireQuestionBaseDto)) {
                return false;
            }
            ShortVideoQuestionnaireQuestionBaseDto shortVideoQuestionnaireQuestionBaseDto = (ShortVideoQuestionnaireQuestionBaseDto) obj;
            return this.type == shortVideoQuestionnaireQuestionBaseDto.type && epx.f(this.code, shortVideoQuestionnaireQuestionBaseDto.code) && epx.f(this.layout, shortVideoQuestionnaireQuestionBaseDto.layout) && epx.f(this.targets, shortVideoQuestionnaireQuestionBaseDto.targets);
        }

        public final List<ShortVideoQuestionnaireQuestionTargetDto> f() {
            return this.targets;
        }

        public final TypeDto g() {
            return this.type;
        }

        public final int hashCode() {
            return this.targets.hashCode() + ((this.layout.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.code)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShortVideoQuestionnaireQuestionBaseDto(type=");
            sb.append(this.type);
            sb.append(", code=");
            sb.append(this.code);
            sb.append(", layout=");
            sb.append(this.layout);
            sb.append(", targets=");
            return ms9.a(')', sb, this.targets);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.code);
            this.layout.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.targets);
            while (a2.hasNext()) {
                ((ShortVideoQuestionnaireQuestionTargetDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: ShortVideoQuestionnaireQuestionDto.kt */
    public static final class ShortVideoQuestionnaireQuestionWithValuesDto extends ShortVideoQuestionnaireQuestionDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoQuestionnaireQuestionWithValuesDto> CREATOR = new a();

        @pmi0("code")
        private final String code;

        @pmi0(TtmlNode.TAG_LAYOUT)
        private final ShortVideoQuestionnaireQuestionLayoutDto layout;

        @pmi0("targets")
        private final List<ShortVideoQuestionnaireQuestionTargetDto> targets;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("values")
        private final List<ShortVideoQuestionnaireQuestionValuesDto> values;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoQuestionnaireQuestionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("more_less")
            public static final TypeDto MORE_LESS;

            @pmi0("multi_select")
            public static final TypeDto MULTI_SELECT;

            @pmi0("select")
            public static final TypeDto SELECT;

            @pmi0("select_inline")
            public static final TypeDto SELECT_INLINE;

            @pmi0("stars")
            public static final TypeDto STARS;

            @pmi0("text")
            public static final TypeDto TEXT;
            private final String value;

            /* compiled from: ShortVideoQuestionnaireQuestionDto.kt */
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
                TypeDto typeDto = new TypeDto("STARS", 0, "stars");
                STARS = typeDto;
                TypeDto typeDto2 = new TypeDto("TEXT", 1, "text");
                TEXT = typeDto2;
                TypeDto typeDto3 = new TypeDto("MORE_LESS", 2, "more_less");
                MORE_LESS = typeDto3;
                TypeDto typeDto4 = new TypeDto("SELECT", 3, "select");
                SELECT = typeDto4;
                TypeDto typeDto5 = new TypeDto("MULTI_SELECT", 4, "multi_select");
                MULTI_SELECT = typeDto5;
                TypeDto typeDto6 = new TypeDto("SELECT_INLINE", 5, "select_inline");
                SELECT_INLINE = typeDto6;
                TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6};
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

        /* compiled from: ShortVideoQuestionnaireQuestionDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoQuestionnaireQuestionWithValuesDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoQuestionnaireQuestionWithValuesDto createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(ShortVideoQuestionnaireQuestionValuesDto.CREATOR, parcel, arrayList, i2, 1);
                }
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                ShortVideoQuestionnaireQuestionLayoutDto createFromParcel2 = ShortVideoQuestionnaireQuestionLayoutDto.CREATOR.createFromParcel(parcel);
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(ShortVideoQuestionnaireQuestionTargetDto.CREATOR, parcel, arrayList2, i, 1);
                }
                return new ShortVideoQuestionnaireQuestionWithValuesDto(arrayList, createFromParcel, readString, createFromParcel2, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoQuestionnaireQuestionWithValuesDto[] newArray(int i) {
                return new ShortVideoQuestionnaireQuestionWithValuesDto[i];
            }
        }

        public ShortVideoQuestionnaireQuestionWithValuesDto(List<ShortVideoQuestionnaireQuestionValuesDto> list, TypeDto typeDto, String str, ShortVideoQuestionnaireQuestionLayoutDto shortVideoQuestionnaireQuestionLayoutDto, List<ShortVideoQuestionnaireQuestionTargetDto> list2) {
            super(null);
            this.values = list;
            this.type = typeDto;
            this.code = str;
            this.layout = shortVideoQuestionnaireQuestionLayoutDto;
            this.targets = list2;
        }

        public final String d() {
            return this.code;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final ShortVideoQuestionnaireQuestionLayoutDto e() {
            return this.layout;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoQuestionnaireQuestionWithValuesDto)) {
                return false;
            }
            ShortVideoQuestionnaireQuestionWithValuesDto shortVideoQuestionnaireQuestionWithValuesDto = (ShortVideoQuestionnaireQuestionWithValuesDto) obj;
            return epx.f(this.values, shortVideoQuestionnaireQuestionWithValuesDto.values) && this.type == shortVideoQuestionnaireQuestionWithValuesDto.type && epx.f(this.code, shortVideoQuestionnaireQuestionWithValuesDto.code) && epx.f(this.layout, shortVideoQuestionnaireQuestionWithValuesDto.layout) && epx.f(this.targets, shortVideoQuestionnaireQuestionWithValuesDto.targets);
        }

        public final List<ShortVideoQuestionnaireQuestionTargetDto> f() {
            return this.targets;
        }

        public final TypeDto g() {
            return this.type;
        }

        public final int hashCode() {
            return this.targets.hashCode() + ((this.layout.hashCode() + urd0.a((this.type.hashCode() + (this.values.hashCode() * 31)) * 31, 31, this.code)) * 31);
        }

        public final List<ShortVideoQuestionnaireQuestionValuesDto> i() {
            return this.values;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShortVideoQuestionnaireQuestionWithValuesDto(values=");
            sb.append(this.values);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", code=");
            sb.append(this.code);
            sb.append(", layout=");
            sb.append(this.layout);
            sb.append(", targets=");
            return ms9.a(')', sb, this.targets);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Iterator a2 = ao.a(parcel, this.values);
            while (a2.hasNext()) {
                ((ShortVideoQuestionnaireQuestionValuesDto) a2.next()).writeToParcel(parcel, i);
            }
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.code);
            this.layout.writeToParcel(parcel, i);
            Iterator a3 = ao.a(parcel, this.targets);
            while (a3.hasNext()) {
                ((ShortVideoQuestionnaireQuestionTargetDto) a3.next()).writeToParcel(parcel, i);
            }
        }
    }

    public /* synthetic */ ShortVideoQuestionnaireQuestionDto(zcl zclVar) {
        this();
    }

    private ShortVideoQuestionnaireQuestionDto() {
    }
}

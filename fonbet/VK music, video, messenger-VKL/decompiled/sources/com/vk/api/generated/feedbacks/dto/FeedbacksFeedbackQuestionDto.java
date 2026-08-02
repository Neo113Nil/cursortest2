package com.vk.api.generated.feedbacks.dto;

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

/* compiled from: FeedbacksFeedbackQuestionDto.kt */
/* loaded from: classes14.dex */
public abstract class FeedbacksFeedbackQuestionDto implements Parcelable {

    /* compiled from: FeedbacksFeedbackQuestionDto.kt */
    public static final class Deserializer implements a9y<FeedbacksFeedbackQuestionDto> {
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
                            return (FeedbacksFeedbackQuestionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, FeedbacksFeedbackQuestionWithValuesDto.class);
                        }
                        break;
                    case -906021636:
                        if (f.equals("select")) {
                            return (FeedbacksFeedbackQuestionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, FeedbacksFeedbackQuestionWithValuesDto.class);
                        }
                        break;
                    case 3556653:
                        if (f.equals("text")) {
                            return (FeedbacksFeedbackQuestionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, FeedbacksFeedbackQuestionBaseDto.class);
                        }
                        break;
                    case 109757537:
                        if (f.equals("stars")) {
                            return (FeedbacksFeedbackQuestionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, FeedbacksFeedbackQuestionStarsDto.class);
                        }
                        break;
                    case 1813179459:
                        if (f.equals("more_less")) {
                            return (FeedbacksFeedbackQuestionDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, FeedbacksFeedbackQuestionBaseDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: FeedbacksFeedbackQuestionDto.kt */
    public static final class FeedbacksFeedbackQuestionBaseDto extends FeedbacksFeedbackQuestionDto implements Parcelable {
        public static final Parcelable.Creator<FeedbacksFeedbackQuestionBaseDto> CREATOR = new a();

        @pmi0("code")
        private final String code;

        @pmi0(TtmlNode.TAG_LAYOUT)
        private final FeedbacksFeedbackQuestionLayoutDto layout;

        @pmi0("targets")
        private final List<FeedbacksFeedbackQuestionTargetDto> targets;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: FeedbacksFeedbackQuestionDto.kt */
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

            @pmi0("stars")
            public static final TypeDto STARS;

            @pmi0("text")
            public static final TypeDto TEXT;
            private final String value;

            /* compiled from: FeedbacksFeedbackQuestionDto.kt */
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
                TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5};
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

        /* compiled from: FeedbacksFeedbackQuestionDto.kt */
        public static final class a implements Parcelable.Creator<FeedbacksFeedbackQuestionBaseDto> {
            @Override // android.os.Parcelable.Creator
            public final FeedbacksFeedbackQuestionBaseDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                FeedbacksFeedbackQuestionLayoutDto createFromParcel2 = FeedbacksFeedbackQuestionLayoutDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(FeedbacksFeedbackQuestionTargetDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new FeedbacksFeedbackQuestionBaseDto(createFromParcel, readString, createFromParcel2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final FeedbacksFeedbackQuestionBaseDto[] newArray(int i) {
                return new FeedbacksFeedbackQuestionBaseDto[i];
            }
        }

        public /* synthetic */ FeedbacksFeedbackQuestionBaseDto(TypeDto typeDto, String str, FeedbacksFeedbackQuestionLayoutDto feedbacksFeedbackQuestionLayoutDto, List list, int i, zcl zclVar) {
            this(typeDto, str, feedbacksFeedbackQuestionLayoutDto, (i & 8) != 0 ? null : list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeedbacksFeedbackQuestionBaseDto)) {
                return false;
            }
            FeedbacksFeedbackQuestionBaseDto feedbacksFeedbackQuestionBaseDto = (FeedbacksFeedbackQuestionBaseDto) obj;
            return this.type == feedbacksFeedbackQuestionBaseDto.type && epx.f(this.code, feedbacksFeedbackQuestionBaseDto.code) && epx.f(this.layout, feedbacksFeedbackQuestionBaseDto.layout) && epx.f(this.targets, feedbacksFeedbackQuestionBaseDto.targets);
        }

        public final int hashCode() {
            int hashCode = (this.layout.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.code)) * 31;
            List<FeedbacksFeedbackQuestionTargetDto> list = this.targets;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FeedbacksFeedbackQuestionBaseDto(type=");
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
            List<FeedbacksFeedbackQuestionTargetDto> list = this.targets;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((FeedbacksFeedbackQuestionTargetDto) f.next()).writeToParcel(parcel, i);
            }
        }

        public FeedbacksFeedbackQuestionBaseDto(TypeDto typeDto, String str, FeedbacksFeedbackQuestionLayoutDto feedbacksFeedbackQuestionLayoutDto, List<FeedbacksFeedbackQuestionTargetDto> list) {
            super(null);
            this.type = typeDto;
            this.code = str;
            this.layout = feedbacksFeedbackQuestionLayoutDto;
            this.targets = list;
        }
    }

    /* compiled from: FeedbacksFeedbackQuestionDto.kt */
    public static final class FeedbacksFeedbackQuestionStarsDto extends FeedbacksFeedbackQuestionDto implements Parcelable {
        public static final Parcelable.Creator<FeedbacksFeedbackQuestionStarsDto> CREATOR = new a();

        @pmi0("code")
        private final String code;

        @pmi0(TtmlNode.TAG_LAYOUT)
        private final FeedbacksFeedbackQuestionStarsLayoutDto layout;

        @pmi0("targets")
        private final List<FeedbacksFeedbackQuestionTargetDto> targets;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: FeedbacksFeedbackQuestionDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("stars")
            public static final TypeDto STARS;
            private final String value;

            /* compiled from: FeedbacksFeedbackQuestionDto.kt */
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

        /* compiled from: FeedbacksFeedbackQuestionDto.kt */
        public static final class a implements Parcelable.Creator<FeedbacksFeedbackQuestionStarsDto> {
            @Override // android.os.Parcelable.Creator
            public final FeedbacksFeedbackQuestionStarsDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                FeedbacksFeedbackQuestionStarsLayoutDto createFromParcel2 = FeedbacksFeedbackQuestionStarsLayoutDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = en.a(FeedbacksFeedbackQuestionTargetDto.CREATOR, parcel, arrayList2, i, 1);
                    }
                    arrayList = arrayList2;
                }
                return new FeedbacksFeedbackQuestionStarsDto(createFromParcel, readString, createFromParcel2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final FeedbacksFeedbackQuestionStarsDto[] newArray(int i) {
                return new FeedbacksFeedbackQuestionStarsDto[i];
            }
        }

        public /* synthetic */ FeedbacksFeedbackQuestionStarsDto(TypeDto typeDto, String str, FeedbacksFeedbackQuestionStarsLayoutDto feedbacksFeedbackQuestionStarsLayoutDto, List list, int i, zcl zclVar) {
            this(typeDto, str, feedbacksFeedbackQuestionStarsLayoutDto, (i & 8) != 0 ? null : list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeedbacksFeedbackQuestionStarsDto)) {
                return false;
            }
            FeedbacksFeedbackQuestionStarsDto feedbacksFeedbackQuestionStarsDto = (FeedbacksFeedbackQuestionStarsDto) obj;
            return this.type == feedbacksFeedbackQuestionStarsDto.type && epx.f(this.code, feedbacksFeedbackQuestionStarsDto.code) && epx.f(this.layout, feedbacksFeedbackQuestionStarsDto.layout) && epx.f(this.targets, feedbacksFeedbackQuestionStarsDto.targets);
        }

        public final int hashCode() {
            int hashCode = (this.layout.hashCode() + urd0.a(this.type.hashCode() * 31, 31, this.code)) * 31;
            List<FeedbacksFeedbackQuestionTargetDto> list = this.targets;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FeedbacksFeedbackQuestionStarsDto(type=");
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
            List<FeedbacksFeedbackQuestionTargetDto> list = this.targets;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((FeedbacksFeedbackQuestionTargetDto) f.next()).writeToParcel(parcel, i);
            }
        }

        public FeedbacksFeedbackQuestionStarsDto(TypeDto typeDto, String str, FeedbacksFeedbackQuestionStarsLayoutDto feedbacksFeedbackQuestionStarsLayoutDto, List<FeedbacksFeedbackQuestionTargetDto> list) {
            super(null);
            this.type = typeDto;
            this.code = str;
            this.layout = feedbacksFeedbackQuestionStarsLayoutDto;
            this.targets = list;
        }
    }

    /* compiled from: FeedbacksFeedbackQuestionDto.kt */
    public static final class FeedbacksFeedbackQuestionWithValuesDto extends FeedbacksFeedbackQuestionDto implements Parcelable {
        public static final Parcelable.Creator<FeedbacksFeedbackQuestionWithValuesDto> CREATOR = new a();

        @pmi0("code")
        private final String code;

        @pmi0(TtmlNode.TAG_LAYOUT)
        private final FeedbacksFeedbackQuestionLayoutDto layout;

        @pmi0("targets")
        private final List<FeedbacksFeedbackQuestionTargetDto> targets;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("values")
        private final List<FeedbacksFeedbackQuestionValuesDto> values;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: FeedbacksFeedbackQuestionDto.kt */
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

            @pmi0("stars")
            public static final TypeDto STARS;

            @pmi0("text")
            public static final TypeDto TEXT;
            private final String value;

            /* compiled from: FeedbacksFeedbackQuestionDto.kt */
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
                TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5};
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

        /* compiled from: FeedbacksFeedbackQuestionDto.kt */
        public static final class a implements Parcelable.Creator<FeedbacksFeedbackQuestionWithValuesDto> {
            @Override // android.os.Parcelable.Creator
            public final FeedbacksFeedbackQuestionWithValuesDto createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(FeedbacksFeedbackQuestionValuesDto.CREATOR, parcel, arrayList2, i2, 1);
                }
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                FeedbacksFeedbackQuestionLayoutDto createFromParcel2 = FeedbacksFeedbackQuestionLayoutDto.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = en.a(FeedbacksFeedbackQuestionTargetDto.CREATOR, parcel, arrayList3, i, 1);
                    }
                    arrayList = arrayList3;
                }
                return new FeedbacksFeedbackQuestionWithValuesDto(arrayList2, createFromParcel, readString, createFromParcel2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final FeedbacksFeedbackQuestionWithValuesDto[] newArray(int i) {
                return new FeedbacksFeedbackQuestionWithValuesDto[i];
            }
        }

        public /* synthetic */ FeedbacksFeedbackQuestionWithValuesDto(List list, TypeDto typeDto, String str, FeedbacksFeedbackQuestionLayoutDto feedbacksFeedbackQuestionLayoutDto, List list2, int i, zcl zclVar) {
            this(list, typeDto, str, feedbacksFeedbackQuestionLayoutDto, (i & 16) != 0 ? null : list2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeedbacksFeedbackQuestionWithValuesDto)) {
                return false;
            }
            FeedbacksFeedbackQuestionWithValuesDto feedbacksFeedbackQuestionWithValuesDto = (FeedbacksFeedbackQuestionWithValuesDto) obj;
            return epx.f(this.values, feedbacksFeedbackQuestionWithValuesDto.values) && this.type == feedbacksFeedbackQuestionWithValuesDto.type && epx.f(this.code, feedbacksFeedbackQuestionWithValuesDto.code) && epx.f(this.layout, feedbacksFeedbackQuestionWithValuesDto.layout) && epx.f(this.targets, feedbacksFeedbackQuestionWithValuesDto.targets);
        }

        public final int hashCode() {
            int hashCode = (this.layout.hashCode() + urd0.a((this.type.hashCode() + (this.values.hashCode() * 31)) * 31, 31, this.code)) * 31;
            List<FeedbacksFeedbackQuestionTargetDto> list = this.targets;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FeedbacksFeedbackQuestionWithValuesDto(values=");
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
                ((FeedbacksFeedbackQuestionValuesDto) a2.next()).writeToParcel(parcel, i);
            }
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.code);
            this.layout.writeToParcel(parcel, i);
            List<FeedbacksFeedbackQuestionTargetDto> list = this.targets;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((FeedbacksFeedbackQuestionTargetDto) f.next()).writeToParcel(parcel, i);
            }
        }

        public FeedbacksFeedbackQuestionWithValuesDto(List<FeedbacksFeedbackQuestionValuesDto> list, TypeDto typeDto, String str, FeedbacksFeedbackQuestionLayoutDto feedbacksFeedbackQuestionLayoutDto, List<FeedbacksFeedbackQuestionTargetDto> list2) {
            super(null);
            this.values = list;
            this.type = typeDto;
            this.code = str;
            this.layout = feedbacksFeedbackQuestionLayoutDto;
            this.targets = list2;
        }
    }

    public /* synthetic */ FeedbacksFeedbackQuestionDto(zcl zclVar) {
        this();
    }

    private FeedbacksFeedbackQuestionDto() {
    }
}

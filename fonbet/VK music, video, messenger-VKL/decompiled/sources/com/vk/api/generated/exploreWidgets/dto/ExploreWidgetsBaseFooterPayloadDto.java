package com.vk.api.generated.exploreWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.nr;
import xsna.pmi0;
import xsna.up;
import xsna.uqi;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ExploreWidgetsBaseFooterPayloadDto.kt */
/* loaded from: classes.dex */
public abstract class ExploreWidgetsBaseFooterPayloadDto implements Parcelable {

    /* compiled from: ExploreWidgetsBaseFooterPayloadDto.kt */
    public static final class Deserializer implements a9y<ExploreWidgetsBaseFooterPayloadDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "user_stack")) {
                return (ExploreWidgetsBaseFooterPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ExploreWidgetsUserStackDto.class);
            }
            if (epx.f(f, "accent_button")) {
                return (ExploreWidgetsBaseFooterPayloadDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ExploreWidgetsAccentButtonDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: ExploreWidgetsBaseFooterPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class ExploreWidgetsAccentButtonDto extends ExploreWidgetsBaseFooterPayloadDto implements Parcelable {
        public static final Parcelable.Creator<ExploreWidgetsAccentButtonDto> CREATOR = new a();

        @pmi0("action")
        private final ExploreWidgetsBaseActionDto action;

        @pmi0("title")
        private final ExploreWidgetsBaseTextDto title;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ExploreWidgetsBaseFooterPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("accent_button")
            public static final TypeDto ACCENT_BUTTON;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: ExploreWidgetsBaseFooterPayloadDto.kt */
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
                TypeDto typeDto = new TypeDto("ACCENT_BUTTON", 0, "accent_button");
                ACCENT_BUTTON = typeDto;
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

        /* compiled from: ExploreWidgetsBaseFooterPayloadDto.kt */
        public static final class a implements Parcelable.Creator<ExploreWidgetsAccentButtonDto> {
            @Override // android.os.Parcelable.Creator
            public final ExploreWidgetsAccentButtonDto createFromParcel(Parcel parcel) {
                return new ExploreWidgetsAccentButtonDto(TypeDto.CREATOR.createFromParcel(parcel), ExploreWidgetsBaseTextDto.CREATOR.createFromParcel(parcel), (ExploreWidgetsBaseActionDto) parcel.readParcelable(ExploreWidgetsAccentButtonDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ExploreWidgetsAccentButtonDto[] newArray(int i) {
                return new ExploreWidgetsAccentButtonDto[i];
            }
        }

        public ExploreWidgetsAccentButtonDto(TypeDto typeDto, ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto, ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto) {
            super(null);
            this.type = typeDto;
            this.title = exploreWidgetsBaseTextDto;
            this.action = exploreWidgetsBaseActionDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExploreWidgetsAccentButtonDto)) {
                return false;
            }
            ExploreWidgetsAccentButtonDto exploreWidgetsAccentButtonDto = (ExploreWidgetsAccentButtonDto) obj;
            return this.type == exploreWidgetsAccentButtonDto.type && epx.f(this.title, exploreWidgetsAccentButtonDto.title) && epx.f(this.action, exploreWidgetsAccentButtonDto.action);
        }

        public final int hashCode() {
            return this.action.hashCode() + ((this.title.hashCode() + (this.type.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ExploreWidgetsAccentButtonDto(type=" + this.type + ", title=" + this.title + ", action=" + this.action + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.title.writeToParcel(parcel, i);
            parcel.writeParcelable(this.action, i);
        }
    }

    /* compiled from: ExploreWidgetsBaseFooterPayloadDto.kt */
    /* loaded from: classes14.dex */
    public static final class ExploreWidgetsUserStackDto extends ExploreWidgetsBaseFooterPayloadDto implements Parcelable {
        public static final Parcelable.Creator<ExploreWidgetsUserStackDto> CREATOR = new a();

        @pmi0("count")
        private final Integer count;

        @pmi0("description")
        private final String description;

        @pmi0("items")
        private final List<ExploreWidgetsBaseImageContainerDto> items;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ExploreWidgetsBaseFooterPayloadDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("user_stack")
            public static final TypeDto USER_STACK;
            private final String value;

            /* compiled from: ExploreWidgetsBaseFooterPayloadDto.kt */
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

        /* compiled from: ExploreWidgetsBaseFooterPayloadDto.kt */
        public static final class a implements Parcelable.Creator<ExploreWidgetsUserStackDto> {
            @Override // android.os.Parcelable.Creator
            public final ExploreWidgetsUserStackDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(ExploreWidgetsUserStackDto.class, parcel, arrayList, i, 1);
                }
                return new ExploreWidgetsUserStackDto(createFromParcel, readString, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final ExploreWidgetsUserStackDto[] newArray(int i) {
                return new ExploreWidgetsUserStackDto[i];
            }
        }

        public /* synthetic */ ExploreWidgetsUserStackDto(TypeDto typeDto, String str, List list, Integer num, int i, zcl zclVar) {
            this(typeDto, str, list, (i & 8) != 0 ? null : num);
        }

        public final List<ExploreWidgetsBaseImageContainerDto> d() {
            return this.items;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExploreWidgetsUserStackDto)) {
                return false;
            }
            ExploreWidgetsUserStackDto exploreWidgetsUserStackDto = (ExploreWidgetsUserStackDto) obj;
            return this.type == exploreWidgetsUserStackDto.type && epx.f(this.description, exploreWidgetsUserStackDto.description) && epx.f(this.items, exploreWidgetsUserStackDto.items) && epx.f(this.count, exploreWidgetsUserStackDto.count);
        }

        public final String getDescription() {
            return this.description;
        }

        public final int hashCode() {
            int a2 = fw3.a(urd0.a(this.type.hashCode() * 31, 31, this.description), 31, this.items);
            Integer num = this.count;
            return a2 + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExploreWidgetsUserStackDto(type=");
            sb.append(this.type);
            sb.append(", description=");
            sb.append(this.description);
            sb.append(", items=");
            sb.append(this.items);
            sb.append(", count=");
            return uqi.b(sb, this.count, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.description);
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
        }

        public ExploreWidgetsUserStackDto(TypeDto typeDto, String str, List<ExploreWidgetsBaseImageContainerDto> list, Integer num) {
            super(null);
            this.type = typeDto;
            this.description = str;
            this.items = list;
            this.count = num;
        }
    }

    public /* synthetic */ ExploreWidgetsBaseFooterPayloadDto(zcl zclVar) {
        this();
    }

    private ExploreWidgetsBaseFooterPayloadDto() {
    }
}

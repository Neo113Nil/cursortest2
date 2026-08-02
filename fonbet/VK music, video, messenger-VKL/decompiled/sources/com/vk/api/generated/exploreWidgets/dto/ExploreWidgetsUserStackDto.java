package com.vk.api.generated.exploreWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ExploreWidgetsUserStackDto.kt */
/* loaded from: classes14.dex */
public final class ExploreWidgetsUserStackDto implements Parcelable {
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
    /* compiled from: ExploreWidgetsUserStackDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("user_stack")
        public static final TypeDto USER_STACK;
        private final String value;

        /* compiled from: ExploreWidgetsUserStackDto.kt */
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

    /* compiled from: ExploreWidgetsUserStackDto.kt */
    public static final class a implements Parcelable.Creator<ExploreWidgetsUserStackDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsUserStackDto createFromParcel(Parcel parcel) {
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ExploreWidgetsBaseImageContainerDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ExploreWidgetsUserStackDto(createFromParcel, readString, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsUserStackDto[] newArray(int i) {
            return new ExploreWidgetsUserStackDto[i];
        }
    }

    public ExploreWidgetsUserStackDto(TypeDto typeDto, String str, List<ExploreWidgetsBaseImageContainerDto> list, Integer num) {
        this.type = typeDto;
        this.description = str;
        this.items = list;
        this.count = num;
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
            ((ExploreWidgetsBaseImageContainerDto) a2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ ExploreWidgetsUserStackDto(TypeDto typeDto, String str, List list, Integer num, int i, zcl zclVar) {
        this(typeDto, str, list, (i & 8) != 0 ? null : num);
    }
}

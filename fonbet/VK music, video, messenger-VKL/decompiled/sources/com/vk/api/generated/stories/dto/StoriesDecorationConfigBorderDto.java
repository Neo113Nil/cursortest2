package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StoriesDecorationConfigBorderDto.kt */
/* loaded from: classes15.dex */
public final class StoriesDecorationConfigBorderDto implements Parcelable {
    public static final Parcelable.Creator<StoriesDecorationConfigBorderDto> CREATOR = new a();

    @pmi0("angle")
    private final Float angle;

    @pmi0("colors")
    private final List<String> colors;

    @pmi0("positions")
    private final List<Float> positions;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoriesDecorationConfigBorderDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("conic")
        public static final TypeDto CONIC;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("linear")
        public static final TypeDto LINEAR;

        @pmi0("radial")
        public static final TypeDto RADIAL;

        @pmi0("solid")
        public static final TypeDto SOLID;
        private final String value;

        /* compiled from: StoriesDecorationConfigBorderDto.kt */
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
            TypeDto typeDto = new TypeDto("SOLID", 0, "solid");
            SOLID = typeDto;
            TypeDto typeDto2 = new TypeDto("LINEAR", 1, "linear");
            LINEAR = typeDto2;
            TypeDto typeDto3 = new TypeDto("CONIC", 2, "conic");
            CONIC = typeDto3;
            TypeDto typeDto4 = new TypeDto("RADIAL", 3, "radial");
            RADIAL = typeDto4;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4};
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

    /* compiled from: StoriesDecorationConfigBorderDto.kt */
    public static final class a implements Parcelable.Creator<StoriesDecorationConfigBorderDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesDecorationConfigBorderDto createFromParcel(Parcel parcel) {
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList arrayList = null;
            Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(Float.valueOf(parcel.readFloat()));
                }
                arrayList = arrayList2;
            }
            return new StoriesDecorationConfigBorderDto(createFromParcel, createStringArrayList, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesDecorationConfigBorderDto[] newArray(int i) {
            return new StoriesDecorationConfigBorderDto[i];
        }
    }

    public StoriesDecorationConfigBorderDto(TypeDto typeDto, List<String> list, Float f, List<Float> list2) {
        this.type = typeDto;
        this.colors = list;
        this.angle = f;
        this.positions = list2;
    }

    public final Float d() {
        return this.angle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.colors;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesDecorationConfigBorderDto)) {
            return false;
        }
        StoriesDecorationConfigBorderDto storiesDecorationConfigBorderDto = (StoriesDecorationConfigBorderDto) obj;
        return this.type == storiesDecorationConfigBorderDto.type && epx.f(this.colors, storiesDecorationConfigBorderDto.colors) && epx.f(this.angle, storiesDecorationConfigBorderDto.angle) && epx.f(this.positions, storiesDecorationConfigBorderDto.positions);
    }

    public final List<Float> f() {
        return this.positions;
    }

    public final TypeDto g() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = fw3.a(this.type.hashCode() * 31, 31, this.colors);
        Float f = this.angle;
        int hashCode = (a2 + (f == null ? 0 : f.hashCode())) * 31;
        List<Float> list = this.positions;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesDecorationConfigBorderDto(type=");
        sb.append(this.type);
        sb.append(", colors=");
        sb.append(this.colors);
        sb.append(", angle=");
        sb.append(this.angle);
        sb.append(", positions=");
        return ms9.a(')', sb, this.positions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeStringList(this.colors);
        Float f = this.angle;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        List<Float> list = this.positions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list, 1);
        while (f2.hasNext()) {
            parcel.writeFloat(((Number) f2.next()).floatValue());
        }
    }

    public /* synthetic */ StoriesDecorationConfigBorderDto(TypeDto typeDto, List list, Float f, List list2, int i, zcl zclVar) {
        this(typeDto, list, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : list2);
    }
}

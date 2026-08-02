package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AtumVkuiHeaderCircleIconDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiHeaderCircleIconDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiHeaderCircleIconDto> CREATOR = new a();

    @pmi0("actions")
    private final List<AtumVkuiAnyActionDto> actions;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AtumVkuiHeaderCircleIconDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("chevron")
        public static final TypeDto CHEVRON;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("dismiss")
        public static final TypeDto DISMISS;
        private final String value;

        /* compiled from: AtumVkuiHeaderCircleIconDto.kt */
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
            TypeDto typeDto = new TypeDto("CHEVRON", 0, "chevron");
            CHEVRON = typeDto;
            TypeDto typeDto2 = new TypeDto("DISMISS", 1, "dismiss");
            DISMISS = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
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

    /* compiled from: AtumVkuiHeaderCircleIconDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiHeaderCircleIconDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiHeaderCircleIconDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
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
            return new AtumVkuiHeaderCircleIconDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiHeaderCircleIconDto[] newArray(int i) {
            return new AtumVkuiHeaderCircleIconDto[i];
        }
    }

    public AtumVkuiHeaderCircleIconDto(TypeDto typeDto, List<AtumVkuiAnyActionDto> list) {
        this.type = typeDto;
        this.actions = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiHeaderCircleIconDto)) {
            return false;
        }
        AtumVkuiHeaderCircleIconDto atumVkuiHeaderCircleIconDto = (AtumVkuiHeaderCircleIconDto) obj;
        return this.type == atumVkuiHeaderCircleIconDto.type && epx.f(this.actions, atumVkuiHeaderCircleIconDto.actions);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        List<AtumVkuiAnyActionDto> list = this.actions;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumVkuiHeaderCircleIconDto(type=");
        sb.append(this.type);
        sb.append(", actions=");
        return ms9.a(')', sb, this.actions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
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

    public /* synthetic */ AtumVkuiHeaderCircleIconDto(TypeDto typeDto, List list, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : list);
    }
}

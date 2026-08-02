package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: WallGetSubscriptionsResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallGetSubscriptionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallGetSubscriptionsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UserId> items;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallGetSubscriptionsResponseDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("base")
        public static final TypeDto BASE;
        public static final Parcelable.Creator<TypeDto> CREATOR;
        private final String value;

        /* compiled from: WallGetSubscriptionsResponseDto.kt */
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
            TypeDto typeDto = new TypeDto("BASE", 0, "base");
            BASE = typeDto;
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

    /* compiled from: WallGetSubscriptionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallGetSubscriptionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGetSubscriptionsResponseDto createFromParcel(Parcel parcel) {
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(WallGetSubscriptionsResponseDto.class, parcel, arrayList, i, 1);
            }
            return new WallGetSubscriptionsResponseDto(createFromParcel, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final WallGetSubscriptionsResponseDto[] newArray(int i) {
            return new WallGetSubscriptionsResponseDto[i];
        }
    }

    public WallGetSubscriptionsResponseDto(TypeDto typeDto, List<UserId> list, int i) {
        this.type = typeDto;
        this.items = list;
        this.count = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetSubscriptionsResponseDto)) {
            return false;
        }
        WallGetSubscriptionsResponseDto wallGetSubscriptionsResponseDto = (WallGetSubscriptionsResponseDto) obj;
        return this.type == wallGetSubscriptionsResponseDto.type && epx.f(this.items, wallGetSubscriptionsResponseDto.items) && this.count == wallGetSubscriptionsResponseDto.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count) + fw3.a(this.type.hashCode() * 31, 31, this.items);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallGetSubscriptionsResponseDto(type=");
        sb.append(this.type);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", count=");
        return vu5.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.count);
    }
}

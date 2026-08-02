package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersSubscriptionsItemDto;
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

/* compiled from: WallGetSubscriptionsExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallGetSubscriptionsExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallGetSubscriptionsExtendedResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UsersSubscriptionsItemDto> items;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WallGetSubscriptionsExtendedResponseDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("extended")
        public static final TypeDto EXTENDED;
        private final String value;

        /* compiled from: WallGetSubscriptionsExtendedResponseDto.kt */
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
            TypeDto typeDto = new TypeDto("EXTENDED", 0, "extended");
            EXTENDED = typeDto;
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

    /* compiled from: WallGetSubscriptionsExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallGetSubscriptionsExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGetSubscriptionsExtendedResponseDto createFromParcel(Parcel parcel) {
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(WallGetSubscriptionsExtendedResponseDto.class, parcel, arrayList, i, 1);
            }
            return new WallGetSubscriptionsExtendedResponseDto(createFromParcel, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final WallGetSubscriptionsExtendedResponseDto[] newArray(int i) {
            return new WallGetSubscriptionsExtendedResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallGetSubscriptionsExtendedResponseDto(TypeDto typeDto, List<? extends UsersSubscriptionsItemDto> list, int i) {
        this.type = typeDto;
        this.items = list;
        this.count = i;
    }

    public final List<UsersSubscriptionsItemDto> d() {
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
        if (!(obj instanceof WallGetSubscriptionsExtendedResponseDto)) {
            return false;
        }
        WallGetSubscriptionsExtendedResponseDto wallGetSubscriptionsExtendedResponseDto = (WallGetSubscriptionsExtendedResponseDto) obj;
        return this.type == wallGetSubscriptionsExtendedResponseDto.type && epx.f(this.items, wallGetSubscriptionsExtendedResponseDto.items) && this.count == wallGetSubscriptionsExtendedResponseDto.count;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count) + fw3.a(this.type.hashCode() * 31, 31, this.items);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallGetSubscriptionsExtendedResponseDto(type=");
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

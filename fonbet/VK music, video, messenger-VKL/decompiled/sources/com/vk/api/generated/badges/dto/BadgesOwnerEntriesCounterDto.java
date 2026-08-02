package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BadgesOwnerEntriesCounterDto.kt */
/* loaded from: classes14.dex */
public final class BadgesOwnerEntriesCounterDto implements Parcelable {
    public static final Parcelable.Creator<BadgesOwnerEntriesCounterDto> CREATOR = new a();

    @pmi0("badge_id")
    private final Integer badgeId;

    @pmi0("donut_sum")
    private final String donutSum;

    @pmi0("recent_sender_ids")
    private final List<UserId> recentSenderIds;

    @pmi0("senders_count")
    private final Integer sendersCount;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("value")
    private final int value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BadgesOwnerEntriesCounterDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("badge")
        public static final TypeDto BADGE;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0(X3.i.l)
        public static final TypeDto TOTAL;
        private final String value;

        /* compiled from: BadgesOwnerEntriesCounterDto.kt */
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
            TypeDto typeDto = new TypeDto("BADGE", 0, "badge");
            BADGE = typeDto;
            TypeDto typeDto2 = new TypeDto("TOTAL", 1, X3.i.l);
            TOTAL = typeDto2;
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

    /* compiled from: BadgesOwnerEntriesCounterDto.kt */
    public static final class a implements Parcelable.Creator<BadgesOwnerEntriesCounterDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesOwnerEntriesCounterDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            TypeDto createFromParcel = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(BadgesOwnerEntriesCounterDto.class, parcel, arrayList, i, 1);
                }
            }
            return new BadgesOwnerEntriesCounterDto(readInt, createFromParcel, valueOf, valueOf2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesOwnerEntriesCounterDto[] newArray(int i) {
            return new BadgesOwnerEntriesCounterDto[i];
        }
    }

    public BadgesOwnerEntriesCounterDto(int i, TypeDto typeDto, Integer num, Integer num2, List<UserId> list, String str) {
        this.value = i;
        this.type = typeDto;
        this.badgeId = num;
        this.sendersCount = num2;
        this.recentSenderIds = list;
        this.donutSum = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesOwnerEntriesCounterDto)) {
            return false;
        }
        BadgesOwnerEntriesCounterDto badgesOwnerEntriesCounterDto = (BadgesOwnerEntriesCounterDto) obj;
        return this.value == badgesOwnerEntriesCounterDto.value && this.type == badgesOwnerEntriesCounterDto.type && epx.f(this.badgeId, badgesOwnerEntriesCounterDto.badgeId) && epx.f(this.sendersCount, badgesOwnerEntriesCounterDto.sendersCount) && epx.f(this.recentSenderIds, badgesOwnerEntriesCounterDto.recentSenderIds) && epx.f(this.donutSum, badgesOwnerEntriesCounterDto.donutSum);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.value) * 31;
        TypeDto typeDto = this.type;
        int hashCode2 = (hashCode + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        Integer num = this.badgeId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.sendersCount;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<UserId> list = this.recentSenderIds;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.donutSum;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesOwnerEntriesCounterDto(value=");
        sb.append(this.value);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", badgeId=");
        sb.append(this.badgeId);
        sb.append(", sendersCount=");
        sb.append(this.sendersCount);
        sb.append(", recentSenderIds=");
        sb.append(this.recentSenderIds);
        sb.append(", donutSum=");
        return ho8.a(sb, this.donutSum, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.value);
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        Integer num = this.badgeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.sendersCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<UserId> list = this.recentSenderIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.donutSum);
    }

    public /* synthetic */ BadgesOwnerEntriesCounterDto(int i, TypeDto typeDto, Integer num, Integer num2, List list, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : typeDto, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : str);
    }
}

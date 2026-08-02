package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BadgesObjectEntriesCounterDto.kt */
/* loaded from: classes14.dex */
public final class BadgesObjectEntriesCounterDto implements Parcelable {
    public static final Parcelable.Creator<BadgesObjectEntriesCounterDto> CREATOR = new a();

    @pmi0("badge_id")
    private final Integer badgeId;

    @pmi0("donut_sum")
    private final String donutSum;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("value")
    private final int value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BadgesObjectEntriesCounterDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("badge")
        public static final TypeDto BADGE;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("friends")
        public static final TypeDto FRIENDS;

        @pmi0(X3.i.l)
        public static final TypeDto TOTAL;
        private final String value;

        /* compiled from: BadgesObjectEntriesCounterDto.kt */
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
            TypeDto typeDto3 = new TypeDto(Privacy.FRIENDS, 2, "friends");
            FRIENDS = typeDto3;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
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

    /* compiled from: BadgesObjectEntriesCounterDto.kt */
    public static final class a implements Parcelable.Creator<BadgesObjectEntriesCounterDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesObjectEntriesCounterDto createFromParcel(Parcel parcel) {
            return new BadgesObjectEntriesCounterDto(parcel.readInt(), parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesObjectEntriesCounterDto[] newArray(int i) {
            return new BadgesObjectEntriesCounterDto[i];
        }
    }

    public BadgesObjectEntriesCounterDto(int i, TypeDto typeDto, Integer num, String str) {
        this.value = i;
        this.type = typeDto;
        this.badgeId = num;
        this.donutSum = str;
    }

    public final Integer d() {
        return this.badgeId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final TypeDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesObjectEntriesCounterDto)) {
            return false;
        }
        BadgesObjectEntriesCounterDto badgesObjectEntriesCounterDto = (BadgesObjectEntriesCounterDto) obj;
        return this.value == badgesObjectEntriesCounterDto.value && this.type == badgesObjectEntriesCounterDto.type && epx.f(this.badgeId, badgesObjectEntriesCounterDto.badgeId) && epx.f(this.donutSum, badgesObjectEntriesCounterDto.donutSum);
    }

    public final int f() {
        return this.value;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.value) * 31;
        TypeDto typeDto = this.type;
        int hashCode2 = (hashCode + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        Integer num = this.badgeId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.donutSum;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesObjectEntriesCounterDto(value=");
        sb.append(this.value);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", badgeId=");
        sb.append(this.badgeId);
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
        parcel.writeString(this.donutSum);
    }

    public /* synthetic */ BadgesObjectEntriesCounterDto(int i, TypeDto typeDto, Integer num, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : typeDto, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str);
    }
}

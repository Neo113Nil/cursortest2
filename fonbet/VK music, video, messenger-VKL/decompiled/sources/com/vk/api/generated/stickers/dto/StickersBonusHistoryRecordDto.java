package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StickersBonusHistoryRecordDto.kt */
/* loaded from: classes15.dex */
public final class StickersBonusHistoryRecordDto implements Parcelable {
    public static final Parcelable.Creator<StickersBonusHistoryRecordDto> CREATOR = new a();

    @pmi0("balance")
    private final Integer balance;

    @pmi0("description")
    private final String description;

    @pmi0("expire_timestamp")
    private final Integer expireTimestamp;

    @pmi0("gift_id")
    private final Integer giftId;

    @pmi0("icon")
    private final List<BaseImageDto> icon;

    @pmi0("id")
    private final int id;

    @pmi0("product_id")
    private final Integer productId;

    @pmi0("product_title")
    private final String productTitle;

    @pmi0("source")
    private final SourceDto source;

    @pmi0("timestamp")
    private final int timestamp;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("value")
    private final int value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StickersBonusHistoryRecordDto.kt */
    public static final class SourceDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SourceDto[] $VALUES;

        @pmi0("4")
        public static final SourceDto AUTOTESTS;
        public static final Parcelable.Creator<SourceDto> CREATOR;

        @pmi0("3")
        public static final SourceDto GIFT;

        @pmi0("2")
        public static final SourceDto STICKERS_GIFT;

        @pmi0("1")
        public static final SourceDto STICKERS_PURCHASE;
        private final int value;

        /* compiled from: StickersBonusHistoryRecordDto.kt */
        public static final class a implements Parcelable.Creator<SourceDto> {
            @Override // android.os.Parcelable.Creator
            public final SourceDto createFromParcel(Parcel parcel) {
                return SourceDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SourceDto[] newArray(int i) {
                return new SourceDto[i];
            }
        }

        static {
            SourceDto sourceDto = new SourceDto("STICKERS_PURCHASE", 0, 1);
            STICKERS_PURCHASE = sourceDto;
            SourceDto sourceDto2 = new SourceDto("STICKERS_GIFT", 1, 2);
            STICKERS_GIFT = sourceDto2;
            SourceDto sourceDto3 = new SourceDto("GIFT", 2, 3);
            GIFT = sourceDto3;
            SourceDto sourceDto4 = new SourceDto("AUTOTESTS", 3, 4);
            AUTOTESTS = sourceDto4;
            SourceDto[] sourceDtoArr = {sourceDto, sourceDto2, sourceDto3, sourceDto4};
            $VALUES = sourceDtoArr;
            $ENTRIES = new asp(sourceDtoArr);
            CREATOR = new a();
        }

        private SourceDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static SourceDto valueOf(String str) {
            return (SourceDto) Enum.valueOf(SourceDto.class, str);
        }

        public static SourceDto[] values() {
            return (SourceDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StickersBonusHistoryRecordDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("1")
        public static final TypeDto ADDITION;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("2")
        public static final TypeDto EXPIRATION;

        @pmi0("3")
        public static final TypeDto WITHDRAWAL;
        private final int value;

        /* compiled from: StickersBonusHistoryRecordDto.kt */
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
            TypeDto typeDto = new TypeDto("ADDITION", 0, 1);
            ADDITION = typeDto;
            TypeDto typeDto2 = new TypeDto("EXPIRATION", 1, 2);
            EXPIRATION = typeDto2;
            TypeDto typeDto3 = new TypeDto("WITHDRAWAL", 2, 3);
            WITHDRAWAL = typeDto3;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, int i2) {
            this.value = i2;
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

        public final int i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: StickersBonusHistoryRecordDto.kt */
    public static final class a implements Parcelable.Creator<StickersBonusHistoryRecordDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersBonusHistoryRecordDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList = new ArrayList(readInt4);
                int i = 0;
                while (i != readInt4) {
                    i = bo.b(StickersBonusHistoryRecordDto.class, parcel, arrayList, i, 1);
                }
            }
            return new StickersBonusHistoryRecordDto(readInt, createFromParcel, readInt2, readInt3, readString, readString2, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : SourceDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersBonusHistoryRecordDto[] newArray(int i) {
            return new StickersBonusHistoryRecordDto[i];
        }
    }

    public StickersBonusHistoryRecordDto(int i, TypeDto typeDto, int i2, int i3, String str, String str2, List<BaseImageDto> list, Integer num, SourceDto sourceDto, Integer num2, Integer num3, String str3, Integer num4) {
        this.id = i;
        this.type = typeDto;
        this.timestamp = i2;
        this.value = i3;
        this.title = str;
        this.description = str2;
        this.icon = list;
        this.expireTimestamp = num;
        this.source = sourceDto;
        this.balance = num2;
        this.productId = num3;
        this.productTitle = str3;
        this.giftId = num4;
    }

    public final List<BaseImageDto> d() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.timestamp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersBonusHistoryRecordDto)) {
            return false;
        }
        StickersBonusHistoryRecordDto stickersBonusHistoryRecordDto = (StickersBonusHistoryRecordDto) obj;
        return this.id == stickersBonusHistoryRecordDto.id && this.type == stickersBonusHistoryRecordDto.type && this.timestamp == stickersBonusHistoryRecordDto.timestamp && this.value == stickersBonusHistoryRecordDto.value && epx.f(this.title, stickersBonusHistoryRecordDto.title) && epx.f(this.description, stickersBonusHistoryRecordDto.description) && epx.f(this.icon, stickersBonusHistoryRecordDto.icon) && epx.f(this.expireTimestamp, stickersBonusHistoryRecordDto.expireTimestamp) && this.source == stickersBonusHistoryRecordDto.source && epx.f(this.balance, stickersBonusHistoryRecordDto.balance) && epx.f(this.productId, stickersBonusHistoryRecordDto.productId) && epx.f(this.productTitle, stickersBonusHistoryRecordDto.productTitle) && epx.f(this.giftId, stickersBonusHistoryRecordDto.giftId);
    }

    public final TypeDto f() {
        return this.type;
    }

    public final int g() {
        return this.value;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = shy.a(this.value, shy.a(this.timestamp, (this.type.hashCode() + (Integer.hashCode(this.id) * 31)) * 31, 31), 31);
        String str = this.title;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseImageDto> list = this.icon;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.expireTimestamp;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        SourceDto sourceDto = this.source;
        int hashCode5 = (hashCode4 + (sourceDto == null ? 0 : sourceDto.hashCode())) * 31;
        Integer num2 = this.balance;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.productId;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.productTitle;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.giftId;
        return hashCode8 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersBonusHistoryRecordDto(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", expireTimestamp=");
        sb.append(this.expireTimestamp);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", productId=");
        sb.append(this.productId);
        sb.append(", productTitle=");
        sb.append(this.productTitle);
        sb.append(", giftId=");
        return uqi.b(sb, this.giftId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        this.type.writeToParcel(parcel, i);
        parcel.writeInt(this.timestamp);
        parcel.writeInt(this.value);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        List<BaseImageDto> list = this.icon;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num = this.expireTimestamp;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        SourceDto sourceDto = this.source;
        if (sourceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sourceDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.balance;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.productId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.productTitle);
        Integer num4 = this.giftId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public /* synthetic */ StickersBonusHistoryRecordDto(int i, TypeDto typeDto, int i2, int i3, String str, String str2, List list, Integer num, SourceDto sourceDto, Integer num2, Integer num3, String str3, Integer num4, int i4, zcl zclVar) {
        this(i, typeDto, i2, i3, (i4 & 16) != 0 ? null : str, (i4 & 32) != 0 ? null : str2, (i4 & 64) != 0 ? null : list, (i4 & 128) != 0 ? null : num, (i4 & 256) != 0 ? null : sourceDto, (i4 & 512) != 0 ? null : num2, (i4 & 1024) != 0 ? null : num3, (i4 & 2048) != 0 ? null : str3, (i4 & 4096) != 0 ? null : num4);
    }
}

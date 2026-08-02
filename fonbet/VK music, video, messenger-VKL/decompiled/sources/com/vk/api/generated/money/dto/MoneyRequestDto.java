package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.wp;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MoneyRequestDto.kt */
/* loaded from: classes15.dex */
public final class MoneyRequestDto implements Parcelable {
    public static final Parcelable.Creator<MoneyRequestDto> CREATOR = new a();

    @pmi0("amount")
    private final MarketPriceDto amount;

    @pmi0("from_id")
    private final UserId fromId;

    @pmi0("held_amount")
    private final MarketPriceDto heldAmount;

    @pmi0("id")
    private final int id;

    @pmi0("init_url")
    private final String initUrl;

    @pmi0("is_accept_vkpay_only")
    private final BaseBoolIntDto isAcceptVkpayOnly;

    @pmi0("processed")
    private final BaseBoolIntDto processed;

    @pmi0("receive_method")
    private final ReceiveMethodDto receiveMethod;

    @pmi0("to_id")
    private final UserId toId;

    @pmi0("total_amount")
    private final MarketPriceDto totalAmount;

    @pmi0("transfer_id")
    private final Integer transferId;

    @pmi0("transferred_amount")
    private final MarketPriceDto transferredAmount;

    @pmi0("user_is_owner")
    private final BaseBoolIntDto userIsOwner;

    @pmi0("user_sent")
    private final BaseBoolIntDto userSent;

    @pmi0("users")
    private final List<UsersUserFullDto> users;

    @pmi0("users_count")
    private final Integer usersCount;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MoneyRequestDto.kt */
    public static final class ReceiveMethodDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ReceiveMethodDto[] $VALUES;

        @pmi0("card")
        public static final ReceiveMethodDto CARD;
        public static final Parcelable.Creator<ReceiveMethodDto> CREATOR;

        @pmi0("vkpay")
        public static final ReceiveMethodDto VKPAY;
        private final String value;

        /* compiled from: MoneyRequestDto.kt */
        public static final class a implements Parcelable.Creator<ReceiveMethodDto> {
            @Override // android.os.Parcelable.Creator
            public final ReceiveMethodDto createFromParcel(Parcel parcel) {
                return ReceiveMethodDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ReceiveMethodDto[] newArray(int i) {
                return new ReceiveMethodDto[i];
            }
        }

        static {
            ReceiveMethodDto receiveMethodDto = new ReceiveMethodDto("CARD", 0, "card");
            CARD = receiveMethodDto;
            ReceiveMethodDto receiveMethodDto2 = new ReceiveMethodDto("VKPAY", 1, "vkpay");
            VKPAY = receiveMethodDto2;
            ReceiveMethodDto[] receiveMethodDtoArr = {receiveMethodDto, receiveMethodDto2};
            $VALUES = receiveMethodDtoArr;
            $ENTRIES = new asp(receiveMethodDtoArr);
            CREATOR = new a();
        }

        private ReceiveMethodDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ReceiveMethodDto valueOf(String str) {
            return (ReceiveMethodDto) Enum.valueOf(ReceiveMethodDto.class, str);
        }

        public static ReceiveMethodDto[] values() {
            return (ReceiveMethodDto[]) $VALUES.clone();
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

    /* compiled from: MoneyRequestDto.kt */
    public static final class a implements Parcelable.Creator<MoneyRequestDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyRequestDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i;
            UserId userId;
            int readInt = parcel.readInt();
            UserId userId2 = (UserId) parcel.readParcelable(MoneyRequestDto.class.getClassLoader());
            UserId userId3 = (UserId) parcel.readParcelable(MoneyRequestDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(MoneyRequestDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(MoneyRequestDto.class.getClassLoader());
            MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(MoneyRequestDto.class.getClassLoader());
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            MarketPriceDto marketPriceDto2 = (MarketPriceDto) parcel.readParcelable(MoneyRequestDto.class.getClassLoader());
            MarketPriceDto marketPriceDto3 = (MarketPriceDto) parcel.readParcelable(MoneyRequestDto.class.getClassLoader());
            MarketPriceDto marketPriceDto4 = (MarketPriceDto) parcel.readParcelable(MoneyRequestDto.class.getClassLoader());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                i = readInt;
                int i2 = 0;
                while (true) {
                    userId = userId2;
                    if (i2 == readInt2) {
                        break;
                    }
                    i2 = bo.b(MoneyRequestDto.class, parcel, arrayList, i2, 1);
                    userId2 = userId;
                }
            } else {
                i = readInt;
                arrayList = null;
                userId = userId2;
            }
            return new MoneyRequestDto(i, userId, userId3, baseBoolIntDto, baseBoolIntDto2, marketPriceDto, valueOf, readString, marketPriceDto2, marketPriceDto3, marketPriceDto4, valueOf2, arrayList, (BaseBoolIntDto) parcel.readParcelable(MoneyRequestDto.class.getClassLoader()), (BaseBoolIntDto) parcel.readParcelable(MoneyRequestDto.class.getClassLoader()), parcel.readInt() == 0 ? null : ReceiveMethodDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyRequestDto[] newArray(int i) {
            return new MoneyRequestDto[i];
        }
    }

    public MoneyRequestDto(int i, UserId userId, UserId userId2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, MarketPriceDto marketPriceDto, Integer num, String str, MarketPriceDto marketPriceDto2, MarketPriceDto marketPriceDto3, MarketPriceDto marketPriceDto4, Integer num2, List<UsersUserFullDto> list, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, ReceiveMethodDto receiveMethodDto) {
        this.id = i;
        this.fromId = userId;
        this.toId = userId2;
        this.processed = baseBoolIntDto;
        this.userIsOwner = baseBoolIntDto2;
        this.amount = marketPriceDto;
        this.transferId = num;
        this.initUrl = str;
        this.totalAmount = marketPriceDto2;
        this.transferredAmount = marketPriceDto3;
        this.heldAmount = marketPriceDto4;
        this.usersCount = num2;
        this.users = list;
        this.userSent = baseBoolIntDto3;
        this.isAcceptVkpayOnly = baseBoolIntDto4;
        this.receiveMethod = receiveMethodDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyRequestDto)) {
            return false;
        }
        MoneyRequestDto moneyRequestDto = (MoneyRequestDto) obj;
        return this.id == moneyRequestDto.id && epx.f(this.fromId, moneyRequestDto.fromId) && epx.f(this.toId, moneyRequestDto.toId) && this.processed == moneyRequestDto.processed && this.userIsOwner == moneyRequestDto.userIsOwner && epx.f(this.amount, moneyRequestDto.amount) && epx.f(this.transferId, moneyRequestDto.transferId) && epx.f(this.initUrl, moneyRequestDto.initUrl) && epx.f(this.totalAmount, moneyRequestDto.totalAmount) && epx.f(this.transferredAmount, moneyRequestDto.transferredAmount) && epx.f(this.heldAmount, moneyRequestDto.heldAmount) && epx.f(this.usersCount, moneyRequestDto.usersCount) && epx.f(this.users, moneyRequestDto.users) && this.userSent == moneyRequestDto.userSent && this.isAcceptVkpayOnly == moneyRequestDto.isAcceptVkpayOnly && this.receiveMethod == moneyRequestDto.receiveMethod;
    }

    public final int hashCode() {
        int hashCode = (this.amount.hashCode() + wp.b(this.userIsOwner, wp.b(this.processed, bh10.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.fromId.b), 31, this.toId.b), 31), 31)) * 31;
        Integer num = this.transferId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.initUrl;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.totalAmount;
        int hashCode4 = (hashCode3 + (marketPriceDto == null ? 0 : marketPriceDto.hashCode())) * 31;
        MarketPriceDto marketPriceDto2 = this.transferredAmount;
        int hashCode5 = (hashCode4 + (marketPriceDto2 == null ? 0 : marketPriceDto2.hashCode())) * 31;
        MarketPriceDto marketPriceDto3 = this.heldAmount;
        int hashCode6 = (hashCode5 + (marketPriceDto3 == null ? 0 : marketPriceDto3.hashCode())) * 31;
        Integer num2 = this.usersCount;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<UsersUserFullDto> list = this.users;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.userSent;
        int hashCode9 = (hashCode8 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.isAcceptVkpayOnly;
        int hashCode10 = (hashCode9 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        ReceiveMethodDto receiveMethodDto = this.receiveMethod;
        return hashCode10 + (receiveMethodDto != null ? receiveMethodDto.hashCode() : 0);
    }

    public final String toString() {
        return "MoneyRequestDto(id=" + this.id + ", fromId=" + this.fromId + ", toId=" + this.toId + ", processed=" + this.processed + ", userIsOwner=" + this.userIsOwner + ", amount=" + this.amount + ", transferId=" + this.transferId + ", initUrl=" + this.initUrl + ", totalAmount=" + this.totalAmount + ", transferredAmount=" + this.transferredAmount + ", heldAmount=" + this.heldAmount + ", usersCount=" + this.usersCount + ", users=" + this.users + ", userSent=" + this.userSent + ", isAcceptVkpayOnly=" + this.isAcceptVkpayOnly + ", receiveMethod=" + this.receiveMethod + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.fromId, i);
        parcel.writeParcelable(this.toId, i);
        parcel.writeParcelable(this.processed, i);
        parcel.writeParcelable(this.userIsOwner, i);
        parcel.writeParcelable(this.amount, i);
        Integer num = this.transferId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.initUrl);
        parcel.writeParcelable(this.totalAmount, i);
        parcel.writeParcelable(this.transferredAmount, i);
        parcel.writeParcelable(this.heldAmount, i);
        Integer num2 = this.usersCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<UsersUserFullDto> list = this.users;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.userSent, i);
        parcel.writeParcelable(this.isAcceptVkpayOnly, i);
        ReceiveMethodDto receiveMethodDto = this.receiveMethod;
        if (receiveMethodDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            receiveMethodDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MoneyRequestDto(int i, UserId userId, UserId userId2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, MarketPriceDto marketPriceDto, Integer num, String str, MarketPriceDto marketPriceDto2, MarketPriceDto marketPriceDto3, MarketPriceDto marketPriceDto4, Integer num2, List list, BaseBoolIntDto baseBoolIntDto3, BaseBoolIntDto baseBoolIntDto4, ReceiveMethodDto receiveMethodDto, int i2, zcl zclVar) {
        this(i, userId, userId2, baseBoolIntDto, baseBoolIntDto2, marketPriceDto, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : str, (i2 & 256) != 0 ? null : marketPriceDto2, (i2 & 512) != 0 ? null : marketPriceDto3, (i2 & 1024) != 0 ? null : marketPriceDto4, (i2 & 2048) != 0 ? null : num2, (i2 & 4096) != 0 ? null : list, (i2 & 8192) != 0 ? null : baseBoolIntDto3, (i2 & 16384) != 0 ? null : baseBoolIntDto4, (i2 & 32768) != 0 ? null : receiveMethodDto);
    }
}

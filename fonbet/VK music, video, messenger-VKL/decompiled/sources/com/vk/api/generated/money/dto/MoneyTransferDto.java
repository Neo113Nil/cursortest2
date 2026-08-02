package com.vk.api.generated.money.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.market.dto.MarketPriceDto;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MoneyTransferDto.kt */
/* loaded from: classes15.dex */
public final class MoneyTransferDto implements Parcelable {
    public static final Parcelable.Creator<MoneyTransferDto> CREATOR = new a();

    @pmi0("accept_url")
    private final String acceptUrl;

    @pmi0("amount")
    private final MarketPriceDto amount;

    @pmi0("by_phone")
    private final Boolean byPhone;

    @pmi0("comment")
    private final String comment;

    @pmi0("date")
    private final int date;

    @pmi0("from_access_key")
    private final String fromAccessKey;

    @pmi0("from_id")
    private final int fromId;

    @pmi0("id")
    private final int id;

    @pmi0("is_anonymous")
    private final Boolean isAnonymous;

    @pmi0("is_vkpay")
    private final Boolean isVkpay;

    @pmi0("status")
    private final int status;

    @pmi0("to_access_key")
    private final String toAccessKey;

    @pmi0("to_id")
    private final int toId;

    /* compiled from: MoneyTransferDto.kt */
    public static final class a implements Parcelable.Creator<MoneyTransferDto> {
        @Override // android.os.Parcelable.Creator
        public final MoneyTransferDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            MarketPriceDto marketPriceDto = (MarketPriceDto) parcel.readParcelable(MoneyTransferDto.class.getClassLoader());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MoneyTransferDto(readInt, readInt2, readInt3, readInt4, readInt5, readString, readString2, marketPriceDto, readString3, readString4, valueOf, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MoneyTransferDto[] newArray(int i) {
            return new MoneyTransferDto[i];
        }
    }

    public MoneyTransferDto(int i, int i2, int i3, int i4, int i5, String str, String str2, MarketPriceDto marketPriceDto, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3) {
        this.id = i;
        this.fromId = i2;
        this.toId = i3;
        this.status = i4;
        this.date = i5;
        this.fromAccessKey = str;
        this.toAccessKey = str2;
        this.amount = marketPriceDto;
        this.comment = str3;
        this.acceptUrl = str4;
        this.isAnonymous = bool;
        this.isVkpay = bool2;
        this.byPhone = bool3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyTransferDto)) {
            return false;
        }
        MoneyTransferDto moneyTransferDto = (MoneyTransferDto) obj;
        return this.id == moneyTransferDto.id && this.fromId == moneyTransferDto.fromId && this.toId == moneyTransferDto.toId && this.status == moneyTransferDto.status && this.date == moneyTransferDto.date && epx.f(this.fromAccessKey, moneyTransferDto.fromAccessKey) && epx.f(this.toAccessKey, moneyTransferDto.toAccessKey) && epx.f(this.amount, moneyTransferDto.amount) && epx.f(this.comment, moneyTransferDto.comment) && epx.f(this.acceptUrl, moneyTransferDto.acceptUrl) && epx.f(this.isAnonymous, moneyTransferDto.isAnonymous) && epx.f(this.isVkpay, moneyTransferDto.isVkpay) && epx.f(this.byPhone, moneyTransferDto.byPhone);
    }

    public final int hashCode() {
        int a2 = shy.a(this.date, shy.a(this.status, shy.a(this.toId, shy.a(this.fromId, Integer.hashCode(this.id) * 31, 31), 31), 31), 31);
        String str = this.fromAccessKey;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.toAccessKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MarketPriceDto marketPriceDto = this.amount;
        int hashCode3 = (hashCode2 + (marketPriceDto == null ? 0 : marketPriceDto.hashCode())) * 31;
        String str3 = this.comment;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.acceptUrl;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isAnonymous;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isVkpay;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.byPhone;
        return hashCode7 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyTransferDto(id=");
        sb.append(this.id);
        sb.append(", fromId=");
        sb.append(this.fromId);
        sb.append(", toId=");
        sb.append(this.toId);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", fromAccessKey=");
        sb.append(this.fromAccessKey);
        sb.append(", toAccessKey=");
        sb.append(this.toAccessKey);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", comment=");
        sb.append(this.comment);
        sb.append(", acceptUrl=");
        sb.append(this.acceptUrl);
        sb.append(", isAnonymous=");
        sb.append(this.isAnonymous);
        sb.append(", isVkpay=");
        sb.append(this.isVkpay);
        sb.append(", byPhone=");
        return tn.a(sb, this.byPhone, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.fromId);
        parcel.writeInt(this.toId);
        parcel.writeInt(this.status);
        parcel.writeInt(this.date);
        parcel.writeString(this.fromAccessKey);
        parcel.writeString(this.toAccessKey);
        parcel.writeParcelable(this.amount, i);
        parcel.writeString(this.comment);
        parcel.writeString(this.acceptUrl);
        Boolean bool = this.isAnonymous;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isVkpay;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.byPhone;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public /* synthetic */ MoneyTransferDto(int i, int i2, int i3, int i4, int i5, String str, String str2, MarketPriceDto marketPriceDto, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, int i6, zcl zclVar) {
        this(i, i2, i3, i4, i5, (i6 & 32) != 0 ? null : str, (i6 & 64) != 0 ? null : str2, (i6 & 128) != 0 ? null : marketPriceDto, (i6 & 256) != 0 ? null : str3, (i6 & 512) != 0 ? null : str4, (i6 & 1024) != 0 ? null : bool, (i6 & 2048) != 0 ? null : bool2, (i6 & 4096) != 0 ? null : bool3);
    }
}

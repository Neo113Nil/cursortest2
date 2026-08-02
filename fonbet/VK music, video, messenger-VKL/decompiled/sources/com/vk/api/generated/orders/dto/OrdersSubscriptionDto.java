package com.vk.api.generated.orders.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: OrdersSubscriptionDto.kt */
/* loaded from: classes15.dex */
public final class OrdersSubscriptionDto implements Parcelable {
    public static final Parcelable.Creator<OrdersSubscriptionDto> CREATOR = new a();

    @pmi0("app_id")
    private final Integer appId;

    @pmi0("application_name")
    private final String applicationName;

    @pmi0("cancel_reason")
    private final String cancelReason;

    @pmi0("create_time")
    private final int createTime;

    @pmi0("expire_time")
    private final Integer expireTime;

    @pmi0("id")
    private final int id;

    @pmi0("is_game")
    private final Boolean isGame;

    @pmi0("item_id")
    private final String itemId;

    @pmi0("merchant")
    private final String merchant;

    @pmi0("next_bill_time")
    private final Integer nextBillTime;

    @pmi0("pending_cancel")
    private final Boolean pendingCancel;

    @pmi0("period")
    private final int period;

    @pmi0("period_start_time")
    private final int periodStartTime;

    @pmi0("photo_url")
    private final String photoUrl;

    @pmi0("platform")
    private final String platform;

    @pmi0("price")
    private final int price;

    @pmi0("status")
    private final String status;

    @pmi0("test_mode")
    private final Boolean testMode;

    @pmi0("title")
    private final String title;

    @pmi0("trial_expire_time")
    private final Integer trialExpireTime;

    @pmi0("update_time")
    private final int updateTime;

    /* compiled from: OrdersSubscriptionDto.kt */
    public static final class a implements Parcelable.Creator<OrdersSubscriptionDto> {
        @Override // android.os.Parcelable.Creator
        public final OrdersSubscriptionDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            String readString2 = parcel.readString();
            int readInt6 = parcel.readInt();
            String readString3 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString4 = parcel.readString();
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString5 = parcel.readString();
            Boolean bool = null;
            Integer num = valueOf4;
            Boolean bool2 = valueOf;
            String readString6 = parcel.readString();
            boolean z = false;
            Integer num2 = valueOf5;
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return new OrdersSubscriptionDto(readInt, readInt2, readString, readInt3, readInt4, readInt5, readString2, readInt6, readString3, valueOf3, num, bool2, readString4, num2, readString5, readString6, readString7, readString8, valueOf2, valueOf6, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final OrdersSubscriptionDto[] newArray(int i) {
            return new OrdersSubscriptionDto[i];
        }
    }

    public OrdersSubscriptionDto(int i, int i2, String str, int i3, int i4, int i5, String str2, int i6, String str3, Integer num, Integer num2, Boolean bool, String str4, Integer num3, String str5, String str6, String str7, String str8, Boolean bool2, Integer num4, Boolean bool3) {
        this.createTime = i;
        this.id = i2;
        this.itemId = str;
        this.period = i3;
        this.periodStartTime = i4;
        this.price = i5;
        this.status = str2;
        this.updateTime = i6;
        this.cancelReason = str3;
        this.nextBillTime = num;
        this.expireTime = num2;
        this.pendingCancel = bool;
        this.title = str4;
        this.appId = num3;
        this.applicationName = str5;
        this.photoUrl = str6;
        this.merchant = str7;
        this.platform = str8;
        this.testMode = bool2;
        this.trialExpireTime = num4;
        this.isGame = bool3;
    }

    public final Integer B() {
        return this.trialExpireTime;
    }

    public final int C() {
        return this.updateTime;
    }

    public final Boolean D() {
        return this.isGame;
    }

    public final Integer d() {
        return this.appId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.applicationName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersSubscriptionDto)) {
            return false;
        }
        OrdersSubscriptionDto ordersSubscriptionDto = (OrdersSubscriptionDto) obj;
        return this.createTime == ordersSubscriptionDto.createTime && this.id == ordersSubscriptionDto.id && epx.f(this.itemId, ordersSubscriptionDto.itemId) && this.period == ordersSubscriptionDto.period && this.periodStartTime == ordersSubscriptionDto.periodStartTime && this.price == ordersSubscriptionDto.price && epx.f(this.status, ordersSubscriptionDto.status) && this.updateTime == ordersSubscriptionDto.updateTime && epx.f(this.cancelReason, ordersSubscriptionDto.cancelReason) && epx.f(this.nextBillTime, ordersSubscriptionDto.nextBillTime) && epx.f(this.expireTime, ordersSubscriptionDto.expireTime) && epx.f(this.pendingCancel, ordersSubscriptionDto.pendingCancel) && epx.f(this.title, ordersSubscriptionDto.title) && epx.f(this.appId, ordersSubscriptionDto.appId) && epx.f(this.applicationName, ordersSubscriptionDto.applicationName) && epx.f(this.photoUrl, ordersSubscriptionDto.photoUrl) && epx.f(this.merchant, ordersSubscriptionDto.merchant) && epx.f(this.platform, ordersSubscriptionDto.platform) && epx.f(this.testMode, ordersSubscriptionDto.testMode) && epx.f(this.trialExpireTime, ordersSubscriptionDto.trialExpireTime) && epx.f(this.isGame, ordersSubscriptionDto.isGame);
    }

    public final String f() {
        return this.cancelReason;
    }

    public final int g() {
        return this.createTime;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = shy.a(this.updateTime, urd0.a(shy.a(this.price, shy.a(this.periodStartTime, shy.a(this.period, urd0.a(shy.a(this.id, Integer.hashCode(this.createTime) * 31, 31), 31, this.itemId), 31), 31), 31), 31, this.status), 31);
        String str = this.cancelReason;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.nextBillTime;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.expireTime;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.pendingCancel;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.title;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.appId;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.applicationName;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photoUrl;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.merchant;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.platform;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool2 = this.testMode;
        int hashCode11 = (hashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num4 = this.trialExpireTime;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool3 = this.isGame;
        return hashCode12 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final Integer i() {
        return this.expireTime;
    }

    public final String j() {
        return this.itemId;
    }

    public final Integer k() {
        return this.nextBillTime;
    }

    public final int l() {
        return this.period;
    }

    public final int n() {
        return this.periodStartTime;
    }

    public final String o() {
        return this.photoUrl;
    }

    public final int p() {
        return this.price;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrdersSubscriptionDto(createTime=");
        sb.append(this.createTime);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", period=");
        sb.append(this.period);
        sb.append(", periodStartTime=");
        sb.append(this.periodStartTime);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", cancelReason=");
        sb.append(this.cancelReason);
        sb.append(", nextBillTime=");
        sb.append(this.nextBillTime);
        sb.append(", expireTime=");
        sb.append(this.expireTime);
        sb.append(", pendingCancel=");
        sb.append(this.pendingCancel);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", applicationName=");
        sb.append(this.applicationName);
        sb.append(", photoUrl=");
        sb.append(this.photoUrl);
        sb.append(", merchant=");
        sb.append(this.merchant);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", testMode=");
        sb.append(this.testMode);
        sb.append(", trialExpireTime=");
        sb.append(this.trialExpireTime);
        sb.append(", isGame=");
        return tn.a(sb, this.isGame, ')');
    }

    public final String u() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.createTime);
        parcel.writeInt(this.id);
        parcel.writeString(this.itemId);
        parcel.writeInt(this.period);
        parcel.writeInt(this.periodStartTime);
        parcel.writeInt(this.price);
        parcel.writeString(this.status);
        parcel.writeInt(this.updateTime);
        parcel.writeString(this.cancelReason);
        Integer num = this.nextBillTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.expireTime;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool = this.pendingCancel;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.title);
        Integer num3 = this.appId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.applicationName);
        parcel.writeString(this.photoUrl);
        parcel.writeString(this.merchant);
        parcel.writeString(this.platform);
        Boolean bool2 = this.testMode;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num4 = this.trialExpireTime;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Boolean bool3 = this.isGame;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public /* synthetic */ OrdersSubscriptionDto(int i, int i2, String str, int i3, int i4, int i5, String str2, int i6, String str3, Integer num, Integer num2, Boolean bool, String str4, Integer num3, String str5, String str6, String str7, String str8, Boolean bool2, Integer num4, Boolean bool3, int i7, zcl zclVar) {
        this(i, i2, str, i3, i4, i5, str2, i6, (i7 & 256) != 0 ? null : str3, (i7 & 512) != 0 ? null : num, (i7 & 1024) != 0 ? null : num2, (i7 & 2048) != 0 ? null : bool, (i7 & 4096) != 0 ? null : str4, (i7 & 8192) != 0 ? null : num3, (i7 & 16384) != 0 ? null : str5, (32768 & i7) != 0 ? null : str6, (65536 & i7) != 0 ? null : str7, (131072 & i7) != 0 ? null : str8, (262144 & i7) != 0 ? null : bool2, (524288 & i7) != 0 ? null : num4, (i7 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : bool3);
    }
}

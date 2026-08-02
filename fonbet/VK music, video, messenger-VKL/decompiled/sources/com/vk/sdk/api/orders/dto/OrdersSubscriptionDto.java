package com.vk.sdk.api.orders.dto;

import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.cgn;
import xsna.epx;
import xsna.kr;
import xsna.n6j;
import xsna.nyh0;
import xsna.odj;
import xsna.pmi0;
import xsna.rq;
import xsna.shy;
import xsna.urd0;
import xsna.xq;
import xsna.zcl;

/* compiled from: OrdersSubscriptionDto.kt */
/* loaded from: classes5.dex */
public final class OrdersSubscriptionDto {

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

    public OrdersSubscriptionDto(int i, int i2, String str, int i3, int i4, int i5, String str2, int i6, String str3, Integer num, Integer num2, Boolean bool, String str4, Integer num3, String str5, String str6, Boolean bool2, Integer num4, Boolean bool3) {
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
        this.testMode = bool2;
        this.trialExpireTime = num4;
        this.isGame = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersSubscriptionDto)) {
            return false;
        }
        OrdersSubscriptionDto ordersSubscriptionDto = (OrdersSubscriptionDto) obj;
        return this.createTime == ordersSubscriptionDto.createTime && this.id == ordersSubscriptionDto.id && epx.f(this.itemId, ordersSubscriptionDto.itemId) && this.period == ordersSubscriptionDto.period && this.periodStartTime == ordersSubscriptionDto.periodStartTime && this.price == ordersSubscriptionDto.price && epx.f(this.status, ordersSubscriptionDto.status) && this.updateTime == ordersSubscriptionDto.updateTime && epx.f(this.cancelReason, ordersSubscriptionDto.cancelReason) && epx.f(this.nextBillTime, ordersSubscriptionDto.nextBillTime) && epx.f(this.expireTime, ordersSubscriptionDto.expireTime) && epx.f(this.pendingCancel, ordersSubscriptionDto.pendingCancel) && epx.f(this.title, ordersSubscriptionDto.title) && epx.f(this.appId, ordersSubscriptionDto.appId) && epx.f(this.applicationName, ordersSubscriptionDto.applicationName) && epx.f(this.photoUrl, ordersSubscriptionDto.photoUrl) && epx.f(this.testMode, ordersSubscriptionDto.testMode) && epx.f(this.trialExpireTime, ordersSubscriptionDto.trialExpireTime) && epx.f(this.isGame, ordersSubscriptionDto.isGame);
    }

    public final int hashCode() {
        int a = shy.a(this.updateTime, urd0.a(shy.a(this.price, shy.a(this.periodStartTime, shy.a(this.period, urd0.a(shy.a(this.id, Integer.hashCode(this.createTime) * 31, 31), 31, this.itemId), 31), 31), 31), 31, this.status), 31);
        String str = this.cancelReason;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
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
        Boolean bool2 = this.testMode;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num4 = this.trialExpireTime;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool3 = this.isGame;
        return hashCode10 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        int i = this.createTime;
        int i2 = this.id;
        String str = this.itemId;
        int i3 = this.period;
        int i4 = this.periodStartTime;
        int i5 = this.price;
        String str2 = this.status;
        int i6 = this.updateTime;
        String str3 = this.cancelReason;
        Integer num = this.nextBillTime;
        Integer num2 = this.expireTime;
        Boolean bool = this.pendingCancel;
        String str4 = this.title;
        Integer num3 = this.appId;
        String str5 = this.applicationName;
        String str6 = this.photoUrl;
        Boolean bool2 = this.testMode;
        Integer num4 = this.trialExpireTime;
        Boolean bool3 = this.isGame;
        StringBuilder a = odj.a(i, i2, "OrdersSubscriptionDto(createTime=", ", id=", ", itemId=");
        nyh0.a(i3, str, ", period=", ", periodStartTime=", a);
        cgn.a(i4, i5, ", price=", ", status=", a);
        nyh0.a(i6, str2, ", updateTime=", ", cancelReason=", a);
        kr.b(num, str3, ", nextBillTime=", ", expireTime=", a);
        rq.h(a, num2, ", pendingCancel=", bool, ", title=");
        kr.b(num3, str4, ", appId=", ", applicationName=", a);
        n6j.b(a, str5, ", photoUrl=", str6, ", testMode=");
        a.append(bool2);
        a.append(", trialExpireTime=");
        a.append(num4);
        a.append(", isGame=");
        return xq.d(a, bool3, ")");
    }

    public /* synthetic */ OrdersSubscriptionDto(int i, int i2, String str, int i3, int i4, int i5, String str2, int i6, String str3, Integer num, Integer num2, Boolean bool, String str4, Integer num3, String str5, String str6, Boolean bool2, Integer num4, Boolean bool3, int i7, zcl zclVar) {
        this(i, i2, str, i3, i4, i5, str2, i6, (i7 & 256) != 0 ? null : str3, (i7 & 512) != 0 ? null : num, (i7 & 1024) != 0 ? null : num2, (i7 & 2048) != 0 ? null : bool, (i7 & 4096) != 0 ? null : str4, (i7 & 8192) != 0 ? null : num3, (i7 & 16384) != 0 ? null : str5, (32768 & i7) != 0 ? null : str6, (65536 & i7) != 0 ? null : bool2, (131072 & i7) != 0 ? null : num4, (i7 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : bool3);
    }
}

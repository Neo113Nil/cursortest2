package com.vk.superapp.common.js.bridge.api.events;

import androidx.core.app.NotificationCompat;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: RetargetingPixel.kt */
/* loaded from: classes6.dex */
public final class RetargetingPixel$Parameters implements ad6 {

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final String event;

    @pmi0("pixel_code")
    private final String pixelCode;

    @pmi0("price_list_id")
    private final Integer priceListId;

    @pmi0("products_event")
    private final String productsEvent;

    @pmi0("products_params")
    private final String productsParams;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("target_group_id")
    private final Integer targetGroupId;

    public RetargetingPixel$Parameters(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5) {
        this.pixelCode = str;
        this.requestId = str2;
        this.event = str3;
        this.targetGroupId = num;
        this.priceListId = num2;
        this.productsEvent = str4;
        this.productsParams = str5;
    }

    public static final RetargetingPixel$Parameters a(RetargetingPixel$Parameters retargetingPixel$Parameters) {
        return retargetingPixel$Parameters.requestId == null ? new RetargetingPixel$Parameters(retargetingPixel$Parameters.pixelCode, "default_request_id", retargetingPixel$Parameters.event, retargetingPixel$Parameters.targetGroupId, retargetingPixel$Parameters.priceListId, retargetingPixel$Parameters.productsEvent, retargetingPixel$Parameters.productsParams) : retargetingPixel$Parameters;
    }

    public static final void b(RetargetingPixel$Parameters retargetingPixel$Parameters) {
        Integer num = retargetingPixel$Parameters.priceListId;
        if (num != null && num.intValue() < 0) {
            throw new IllegalArgumentException("Value priceListId cannot be less than 0");
        }
    }

    public static final void c(RetargetingPixel$Parameters retargetingPixel$Parameters) {
        Integer num = retargetingPixel$Parameters.targetGroupId;
        if (num != null && num.intValue() < 0) {
            throw new IllegalArgumentException("Value targetGroupId cannot be less than 0");
        }
    }

    public static final void d(RetargetingPixel$Parameters retargetingPixel$Parameters) {
        if (retargetingPixel$Parameters.pixelCode == null) {
            throw new IllegalArgumentException("Value of non-nullable member pixelCode cannot be\n                        null");
        }
        if (retargetingPixel$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String e() {
        return this.event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetargetingPixel$Parameters)) {
            return false;
        }
        RetargetingPixel$Parameters retargetingPixel$Parameters = (RetargetingPixel$Parameters) obj;
        return epx.f(this.pixelCode, retargetingPixel$Parameters.pixelCode) && epx.f(this.requestId, retargetingPixel$Parameters.requestId) && epx.f(this.event, retargetingPixel$Parameters.event) && epx.f(this.targetGroupId, retargetingPixel$Parameters.targetGroupId) && epx.f(this.priceListId, retargetingPixel$Parameters.priceListId) && epx.f(this.productsEvent, retargetingPixel$Parameters.productsEvent) && epx.f(this.productsParams, retargetingPixel$Parameters.productsParams);
    }

    public final String f() {
        return this.pixelCode;
    }

    public final Integer g() {
        return this.priceListId;
    }

    public final String h() {
        return this.productsEvent;
    }

    public final int hashCode() {
        int a = urd0.a(this.pixelCode.hashCode() * 31, 31, this.requestId);
        String str = this.event;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.targetGroupId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.priceListId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.productsEvent;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productsParams;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.productsParams;
    }

    public final String j() {
        return this.requestId;
    }

    public final Integer k() {
        return this.targetGroupId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(pixelCode=");
        sb.append(this.pixelCode);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", event=");
        sb.append(this.event);
        sb.append(", targetGroupId=");
        sb.append(this.targetGroupId);
        sb.append(", priceListId=");
        sb.append(this.priceListId);
        sb.append(", productsEvent=");
        sb.append(this.productsEvent);
        sb.append(", productsParams=");
        return ho8.a(sb, this.productsParams, ')');
    }

    public /* synthetic */ RetargetingPixel$Parameters(String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
    }
}

package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: OpenReportForm.kt */
/* loaded from: classes6.dex */
public final class OpenReportForm$Parameters implements ad6 {

    @pmi0("ad_data")
    private final String adData;

    @pmi0("app_id")
    private final Long appId;

    @pmi0("group_id")
    private final Long groupId;

    @pmi0("item_id")
    private final String itemId;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    @pmi0("user_id")
    private final Long userId;

    public OpenReportForm$Parameters(String str, String str2, Long l, Long l2, Long l3, Long l4, String str3, String str4) {
        this.type = str;
        this.requestId = str2;
        this.userId = l;
        this.groupId = l2;
        this.ownerId = l3;
        this.appId = l4;
        this.adData = str3;
        this.itemId = str4;
    }

    public static final OpenReportForm$Parameters a(OpenReportForm$Parameters openReportForm$Parameters) {
        return openReportForm$Parameters.requestId == null ? new OpenReportForm$Parameters(openReportForm$Parameters.type, "default_request_id", openReportForm$Parameters.userId, openReportForm$Parameters.groupId, openReportForm$Parameters.ownerId, openReportForm$Parameters.appId, openReportForm$Parameters.adData, openReportForm$Parameters.itemId) : openReportForm$Parameters;
    }

    public static final void b(OpenReportForm$Parameters openReportForm$Parameters) {
        if (openReportForm$Parameters.type == null) {
            throw new IllegalArgumentException("Value of non-nullable member type cannot be\n                        null");
        }
        if (openReportForm$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.adData;
    }

    public final Long d() {
        return this.appId;
    }

    public final Long e() {
        return this.groupId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenReportForm$Parameters)) {
            return false;
        }
        OpenReportForm$Parameters openReportForm$Parameters = (OpenReportForm$Parameters) obj;
        return epx.f(this.type, openReportForm$Parameters.type) && epx.f(this.requestId, openReportForm$Parameters.requestId) && epx.f(this.userId, openReportForm$Parameters.userId) && epx.f(this.groupId, openReportForm$Parameters.groupId) && epx.f(this.ownerId, openReportForm$Parameters.ownerId) && epx.f(this.appId, openReportForm$Parameters.appId) && epx.f(this.adData, openReportForm$Parameters.adData) && epx.f(this.itemId, openReportForm$Parameters.itemId);
    }

    public final String f() {
        return this.itemId;
    }

    public final Long g() {
        return this.ownerId;
    }

    public final String h() {
        return this.requestId;
    }

    public final int hashCode() {
        int a = urd0.a(this.type.hashCode() * 31, 31, this.requestId);
        Long l = this.userId;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.groupId;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.ownerId;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.appId;
        int hashCode4 = (hashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str = this.adData;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.itemId;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String i() {
        return this.type;
    }

    public final Long j() {
        return this.userId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(type=");
        sb.append(this.type);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", adData=");
        sb.append(this.adData);
        sb.append(", itemId=");
        return ho8.a(sb, this.itemId, ')');
    }

    public /* synthetic */ OpenReportForm$Parameters(String str, String str2, Long l, Long l2, Long l3, Long l4, String str3, String str4, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : l3, (i & 32) != 0 ? null : l4, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4);
    }
}

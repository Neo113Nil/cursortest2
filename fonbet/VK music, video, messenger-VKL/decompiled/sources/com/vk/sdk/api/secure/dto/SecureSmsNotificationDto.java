package com.vk.sdk.api.secure.dto;

import xsna.epx;
import xsna.i5s;
import xsna.n6j;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: SecureSmsNotificationDto.kt */
/* loaded from: classes5.dex */
public final class SecureSmsNotificationDto {

    @pmi0("app_id")
    private final String appId;

    @pmi0("date")
    private final String date;

    @pmi0("id")
    private final String id;

    @pmi0("message")
    private final String message;

    @pmi0("user_id")
    private final String userId;

    public SecureSmsNotificationDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecureSmsNotificationDto)) {
            return false;
        }
        SecureSmsNotificationDto secureSmsNotificationDto = (SecureSmsNotificationDto) obj;
        return epx.f(this.appId, secureSmsNotificationDto.appId) && epx.f(this.date, secureSmsNotificationDto.date) && epx.f(this.id, secureSmsNotificationDto.id) && epx.f(this.message, secureSmsNotificationDto.message) && epx.f(this.userId, secureSmsNotificationDto.userId);
    }

    public final int hashCode() {
        String str = this.appId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.date;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.id;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.message;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userId;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.appId;
        String str2 = this.date;
        String str3 = this.id;
        String str4 = this.message;
        String str5 = this.userId;
        StringBuilder a = xe9.a("SecureSmsNotificationDto(appId=", str, ", date=", str2, ", id=");
        n6j.b(a, str3, ", message=", str4, ", userId=");
        return i5s.a(a, str5, ")");
    }

    public SecureSmsNotificationDto(String str, String str2, String str3, String str4, String str5) {
        this.appId = str;
        this.date = str2;
        this.id = str3;
        this.message = str4;
        this.userId = str5;
    }

    public /* synthetic */ SecureSmsNotificationDto(String str, String str2, String str3, String str4, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}

package com.vk.sdk.api.secure.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.wr;
import xsna.zcl;

/* compiled from: SecureTokenCheckedDto.kt */
/* loaded from: classes5.dex */
public final class SecureTokenCheckedDto {

    @pmi0("date")
    private final Integer date;

    @pmi0("expire")
    private final Integer expire;

    @pmi0("success")
    private final Integer success;

    @pmi0("user_id")
    private final UserId userId;

    public SecureTokenCheckedDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecureTokenCheckedDto)) {
            return false;
        }
        SecureTokenCheckedDto secureTokenCheckedDto = (SecureTokenCheckedDto) obj;
        return epx.f(this.date, secureTokenCheckedDto.date) && epx.f(this.expire, secureTokenCheckedDto.expire) && epx.f(this.success, secureTokenCheckedDto.success) && epx.f(this.userId, secureTokenCheckedDto.userId);
    }

    public final int hashCode() {
        Integer num = this.date;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.expire;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.success;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        UserId userId = this.userId;
        return hashCode3 + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final String toString() {
        Integer num = this.date;
        Integer num2 = this.expire;
        Integer num3 = this.success;
        UserId userId = this.userId;
        StringBuilder a = wr.a(num, "SecureTokenCheckedDto(date=", num2, ", expire=", ", success=");
        a.append(num3);
        a.append(", userId=");
        a.append(userId);
        a.append(")");
        return a.toString();
    }

    public SecureTokenCheckedDto(Integer num, Integer num2, Integer num3, UserId userId) {
        this.date = num;
        this.expire = num2;
        this.success = num3;
        this.userId = userId;
    }

    public /* synthetic */ SecureTokenCheckedDto(Integer num, Integer num2, Integer num3, UserId userId, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : userId);
    }
}

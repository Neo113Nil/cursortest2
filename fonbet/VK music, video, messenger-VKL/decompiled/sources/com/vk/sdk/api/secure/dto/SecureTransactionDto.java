package com.vk.sdk.api.secure.dto;

import xsna.epx;
import xsna.oq;
import xsna.pmi0;
import xsna.sq;
import xsna.wr;
import xsna.zcl;

/* compiled from: SecureTransactionDto.kt */
/* loaded from: classes5.dex */
public final class SecureTransactionDto {

    @pmi0("date")
    private final Integer date;

    @pmi0("id")
    private final Integer id;

    @pmi0("uid_from")
    private final Integer uidFrom;

    @pmi0("uid_to")
    private final Integer uidTo;

    @pmi0("votes")
    private final Integer votes;

    public SecureTransactionDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecureTransactionDto)) {
            return false;
        }
        SecureTransactionDto secureTransactionDto = (SecureTransactionDto) obj;
        return epx.f(this.date, secureTransactionDto.date) && epx.f(this.id, secureTransactionDto.id) && epx.f(this.uidFrom, secureTransactionDto.uidFrom) && epx.f(this.uidTo, secureTransactionDto.uidTo) && epx.f(this.votes, secureTransactionDto.votes);
    }

    public final int hashCode() {
        Integer num = this.date;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.id;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.uidFrom;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.uidTo;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.votes;
        return hashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.date;
        Integer num2 = this.id;
        Integer num3 = this.uidFrom;
        Integer num4 = this.uidTo;
        Integer num5 = this.votes;
        StringBuilder a = wr.a(num, "SecureTransactionDto(date=", num2, ", id=", ", uidFrom=");
        sq.b(a, num3, ", uidTo=", num4, ", votes=");
        return oq.b(a, num5, ")");
    }

    public SecureTransactionDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.date = num;
        this.id = num2;
        this.uidFrom = num3;
        this.uidTo = num4;
        this.votes = num5;
    }

    public /* synthetic */ SecureTransactionDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5);
    }
}

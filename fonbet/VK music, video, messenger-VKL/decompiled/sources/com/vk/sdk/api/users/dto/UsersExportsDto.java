package com.vk.sdk.api.users.dto;

import xsna.epx;
import xsna.oq;
import xsna.pmi0;
import xsna.wr;
import xsna.zcl;

/* compiled from: UsersExportsDto.kt */
/* loaded from: classes5.dex */
public final class UsersExportsDto {

    @pmi0("facebook")
    private final Integer facebook;

    @pmi0("livejournal")
    private final Integer livejournal;

    @pmi0("twitter")
    private final Integer twitter;

    public UsersExportsDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersExportsDto)) {
            return false;
        }
        UsersExportsDto usersExportsDto = (UsersExportsDto) obj;
        return epx.f(this.facebook, usersExportsDto.facebook) && epx.f(this.livejournal, usersExportsDto.livejournal) && epx.f(this.twitter, usersExportsDto.twitter);
    }

    public final int hashCode() {
        Integer num = this.facebook;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.livejournal;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.twitter;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.facebook;
        Integer num2 = this.livejournal;
        return oq.b(wr.a(num, "UsersExportsDto(facebook=", num2, ", livejournal=", ", twitter="), this.twitter, ")");
    }

    public UsersExportsDto(Integer num, Integer num2, Integer num3) {
        this.facebook = num;
        this.livejournal = num2;
        this.twitter = num3;
    }

    public /* synthetic */ UsersExportsDto(Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}

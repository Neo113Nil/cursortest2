package com.vk.sdk.api.users.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.kr;
import xsna.pmi0;
import xsna.uq;
import xsna.xq;
import xsna.zcl;

/* compiled from: UsersUserMinDto.kt */
/* loaded from: classes5.dex */
public final class UsersUserMinDto {

    @pmi0("can_access_closed")
    private final Boolean canAccessClosed;

    @pmi0("deactivated")
    private final String deactivated;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("hidden")
    private final Integer hidden;

    @pmi0("id")
    private final UserId id;

    @pmi0("is_closed")
    private final Boolean isClosed;

    @pmi0("last_name")
    private final String lastName;

    public UsersUserMinDto(UserId userId, String str, String str2, Integer num, String str3, Boolean bool, Boolean bool2) {
        this.id = userId;
        this.deactivated = str;
        this.firstName = str2;
        this.hidden = num;
        this.lastName = str3;
        this.canAccessClosed = bool;
        this.isClosed = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserMinDto)) {
            return false;
        }
        UsersUserMinDto usersUserMinDto = (UsersUserMinDto) obj;
        return epx.f(this.id, usersUserMinDto.id) && epx.f(this.deactivated, usersUserMinDto.deactivated) && epx.f(this.firstName, usersUserMinDto.firstName) && epx.f(this.hidden, usersUserMinDto.hidden) && epx.f(this.lastName, usersUserMinDto.lastName) && epx.f(this.canAccessClosed, usersUserMinDto.canAccessClosed) && epx.f(this.isClosed, usersUserMinDto.isClosed);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id.b) * 31;
        String str = this.deactivated;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.hidden;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.lastName;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.canAccessClosed;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isClosed;
        return hashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.id;
        String str = this.deactivated;
        String str2 = this.firstName;
        Integer num = this.hidden;
        String str3 = this.lastName;
        Boolean bool = this.canAccessClosed;
        Boolean bool2 = this.isClosed;
        StringBuilder sb = new StringBuilder("UsersUserMinDto(id=");
        sb.append(userId);
        sb.append(", deactivated=");
        sb.append(str);
        sb.append(", firstName=");
        kr.b(num, str2, ", hidden=", ", lastName=", sb);
        uq.c(bool, str3, ", canAccessClosed=", ", isClosed=", sb);
        return xq.d(sb, bool2, ")");
    }

    public /* synthetic */ UsersUserMinDto(UserId userId, String str, String str2, Integer num, String str3, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2);
    }
}

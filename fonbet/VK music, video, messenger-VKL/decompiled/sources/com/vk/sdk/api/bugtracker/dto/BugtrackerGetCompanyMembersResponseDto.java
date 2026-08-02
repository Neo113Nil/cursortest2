package com.vk.sdk.api.bugtracker.dto;

import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.vp;
import xsna.zcl;

/* compiled from: BugtrackerGetCompanyMembersResponseDto.kt */
/* loaded from: classes5.dex */
public final class BugtrackerGetCompanyMembersResponseDto {

    @pmi0("company_members")
    private final List<BugtrackerCompanyMemberDto> companyMembers;

    @pmi0("count")
    private final int count;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    public BugtrackerGetCompanyMembersResponseDto(List<BugtrackerCompanyMemberDto> list, int i, List<UsersUserFullDto> list2) {
        this.companyMembers = list;
        this.count = i;
        this.profiles = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BugtrackerGetCompanyMembersResponseDto)) {
            return false;
        }
        BugtrackerGetCompanyMembersResponseDto bugtrackerGetCompanyMembersResponseDto = (BugtrackerGetCompanyMembersResponseDto) obj;
        return epx.f(this.companyMembers, bugtrackerGetCompanyMembersResponseDto.companyMembers) && this.count == bugtrackerGetCompanyMembersResponseDto.count && epx.f(this.profiles, bugtrackerGetCompanyMembersResponseDto.profiles);
    }

    public final int hashCode() {
        int a = shy.a(this.count, this.companyMembers.hashCode() * 31, 31);
        List<UsersUserFullDto> list = this.profiles;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        List<BugtrackerCompanyMemberDto> list = this.companyMembers;
        int i = this.count;
        List<UsersUserFullDto> list2 = this.profiles;
        StringBuilder sb = new StringBuilder("BugtrackerGetCompanyMembersResponseDto(companyMembers=");
        sb.append(list);
        sb.append(", count=");
        sb.append(i);
        sb.append(", profiles=");
        return vp.b(")", sb, list2);
    }

    public /* synthetic */ BugtrackerGetCompanyMembersResponseDto(List list, int i, List list2, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : list2);
    }
}

package com.vk.sdk.api.bugtracker.dto;

import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.n;
import java.util.List;
import xsna.cgn;
import xsna.epx;
import xsna.jax0;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: BugtrackerCompanyMemberDto.kt */
/* loaded from: classes5.dex */
public final class BugtrackerCompanyMemberDto {

    @pmi0("company_id")
    private final int companyId;

    @pmi0("groups")
    private final List<Integer> groups;

    @pmi0("groups_count")
    private final int groupsCount;

    @pmi0("products")
    private final List<BugtrackerCompanyMemberProductDto> products;

    @pmi0("products_count")
    private final int productsCount;

    @pmi0("reporter_url")
    private final String reporterUrl;

    @pmi0("role")
    private final int role;

    @pmi0("role_name")
    private final String roleName;

    @pmi0("ts")
    private final int ts;

    @pmi0("user_id")
    private final UserId userId;

    public BugtrackerCompanyMemberDto(UserId userId, int i, int i2, String str, int i3, int i4, int i5, String str2, List<Integer> list, List<BugtrackerCompanyMemberProductDto> list2) {
        this.userId = userId;
        this.companyId = i;
        this.role = i2;
        this.roleName = str;
        this.ts = i3;
        this.groupsCount = i4;
        this.productsCount = i5;
        this.reporterUrl = str2;
        this.groups = list;
        this.products = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BugtrackerCompanyMemberDto)) {
            return false;
        }
        BugtrackerCompanyMemberDto bugtrackerCompanyMemberDto = (BugtrackerCompanyMemberDto) obj;
        return epx.f(this.userId, bugtrackerCompanyMemberDto.userId) && this.companyId == bugtrackerCompanyMemberDto.companyId && this.role == bugtrackerCompanyMemberDto.role && epx.f(this.roleName, bugtrackerCompanyMemberDto.roleName) && this.ts == bugtrackerCompanyMemberDto.ts && this.groupsCount == bugtrackerCompanyMemberDto.groupsCount && this.productsCount == bugtrackerCompanyMemberDto.productsCount && epx.f(this.reporterUrl, bugtrackerCompanyMemberDto.reporterUrl) && epx.f(this.groups, bugtrackerCompanyMemberDto.groups) && epx.f(this.products, bugtrackerCompanyMemberDto.products);
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.productsCount, shy.a(this.groupsCount, shy.a(this.ts, urd0.a(shy.a(this.role, shy.a(this.companyId, Long.hashCode(this.userId.b) * 31, 31), 31), 31, this.roleName), 31), 31), 31), 31, this.reporterUrl);
        List<Integer> list = this.groups;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        List<BugtrackerCompanyMemberProductDto> list2 = this.products;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.userId;
        int i = this.companyId;
        int i2 = this.role;
        String str = this.roleName;
        int i3 = this.ts;
        int i4 = this.groupsCount;
        int i5 = this.productsCount;
        String str2 = this.reporterUrl;
        List<Integer> list = this.groups;
        List<BugtrackerCompanyMemberProductDto> list2 = this.products;
        StringBuilder sb = new StringBuilder("BugtrackerCompanyMemberDto(userId=");
        sb.append(userId);
        sb.append(", companyId=");
        sb.append(i);
        sb.append(", role=");
        jax0.a(i2, ", roleName=", str, ", ts=", sb);
        cgn.a(i3, i4, ", groupsCount=", ", productsCount=", sb);
        jax0.a(i5, ", reporterUrl=", str2, ", groups=", sb);
        return n.b(sb, list, ", products=", list2, ")");
    }

    public /* synthetic */ BugtrackerCompanyMemberDto(UserId userId, int i, int i2, String str, int i3, int i4, int i5, String str2, List list, List list2, int i6, zcl zclVar) {
        this(userId, i, i2, str, i3, i4, i5, str2, (i6 & 256) != 0 ? null : list, (i6 & 512) != 0 ? null : list2);
    }
}

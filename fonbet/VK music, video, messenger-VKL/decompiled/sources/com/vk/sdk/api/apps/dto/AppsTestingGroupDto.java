package com.vk.sdk.api.apps.dto;

import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;

/* compiled from: AppsTestingGroupDto.kt */
/* loaded from: classes5.dex */
public final class AppsTestingGroupDto {

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("name")
    private final String name;

    @pmi0("platforms")
    private final List<String> platforms;

    @pmi0("user_ids")
    private final List<UserId> userIds;

    @pmi0(X3.i.K)
    private final String webview;

    public AppsTestingGroupDto(List<UserId> list, UserId userId, String str, String str2, List<String> list2) {
        this.userIds = list;
        this.groupId = userId;
        this.name = str;
        this.webview = str2;
        this.platforms = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsTestingGroupDto)) {
            return false;
        }
        AppsTestingGroupDto appsTestingGroupDto = (AppsTestingGroupDto) obj;
        return epx.f(this.userIds, appsTestingGroupDto.userIds) && epx.f(this.groupId, appsTestingGroupDto.groupId) && epx.f(this.name, appsTestingGroupDto.name) && epx.f(this.webview, appsTestingGroupDto.webview) && epx.f(this.platforms, appsTestingGroupDto.platforms);
    }

    public final int hashCode() {
        int a = bh10.a(this.userIds.hashCode() * 31, 31, this.groupId.b);
        String str = this.name;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.webview;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.platforms;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        List<UserId> list = this.userIds;
        UserId userId = this.groupId;
        String str = this.name;
        String str2 = this.webview;
        List<String> list2 = this.platforms;
        StringBuilder sb = new StringBuilder("AppsTestingGroupDto(userIds=");
        sb.append(list);
        sb.append(", groupId=");
        sb.append(userId);
        sb.append(", name=");
        n6j.b(sb, str, ", webview=", str2, ", platforms=");
        return vp.b(")", sb, list2);
    }

    public /* synthetic */ AppsTestingGroupDto(List list, UserId userId, String str, String str2, List list2, int i, zcl zclVar) {
        this(list, userId, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : list2);
    }
}

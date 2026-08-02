package com.vk.sdk.api.apps.dto;

import com.vk.sdk.api.users.dto.UsersUserDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;
import xsna.zn;

/* compiled from: AppsGetLeaderboardExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class AppsGetLeaderboardExtendedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<AppsLeaderboardDto> items;

    @pmi0("profiles")
    private final List<UsersUserDto> profiles;

    public AppsGetLeaderboardExtendedResponseDto(int i, List<AppsLeaderboardDto> list, List<UsersUserDto> list2) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetLeaderboardExtendedResponseDto)) {
            return false;
        }
        AppsGetLeaderboardExtendedResponseDto appsGetLeaderboardExtendedResponseDto = (AppsGetLeaderboardExtendedResponseDto) obj;
        return this.count == appsGetLeaderboardExtendedResponseDto.count && epx.f(this.items, appsGetLeaderboardExtendedResponseDto.items) && epx.f(this.profiles, appsGetLeaderboardExtendedResponseDto.profiles);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersUserDto> list = this.profiles;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        int i = this.count;
        List<AppsLeaderboardDto> list = this.items;
        return vp.b(")", zn.c(i, "AppsGetLeaderboardExtendedResponseDto(count=", ", items=", ", profiles=", list), this.profiles);
    }

    public /* synthetic */ AppsGetLeaderboardExtendedResponseDto(int i, List list, List list2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2);
    }
}

package com.vk.sdk.api.apps.dto;

import com.vk.sdk.api.users.dto.UsersUserMinDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;
import xsna.zn;

/* compiled from: AppsCatalogListDto.kt */
/* loaded from: classes5.dex */
public final class AppsCatalogListDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<AppsAppDto> items;

    @pmi0("profiles")
    private final List<UsersUserMinDto> profiles;

    public AppsCatalogListDto(int i, List<AppsAppDto> list, List<UsersUserMinDto> list2) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsCatalogListDto)) {
            return false;
        }
        AppsCatalogListDto appsCatalogListDto = (AppsCatalogListDto) obj;
        return this.count == appsCatalogListDto.count && epx.f(this.items, appsCatalogListDto.items) && epx.f(this.profiles, appsCatalogListDto.profiles);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersUserMinDto> list = this.profiles;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        int i = this.count;
        List<AppsAppDto> list = this.items;
        return vp.b(")", zn.c(i, "AppsCatalogListDto(count=", ", items=", ", profiles=", list), this.profiles);
    }

    public /* synthetic */ AppsCatalogListDto(int i, List list, List list2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2);
    }
}

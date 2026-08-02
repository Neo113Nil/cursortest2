package com.vk.sdk.api.groups.dto;

import com.vk.dto.hints.HintCategories;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGetCatalogInfoResponseDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGetCatalogInfoResponseDto {

    @pmi0(HintCategories.PARAM_NAME)
    private final List<GroupsGroupCategoryDto> categories;

    @pmi0("enabled")
    private final BaseBoolIntDto enabled;

    public GroupsGetCatalogInfoResponseDto(BaseBoolIntDto baseBoolIntDto, List<GroupsGroupCategoryDto> list) {
        this.enabled = baseBoolIntDto;
        this.categories = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetCatalogInfoResponseDto)) {
            return false;
        }
        GroupsGetCatalogInfoResponseDto groupsGetCatalogInfoResponseDto = (GroupsGetCatalogInfoResponseDto) obj;
        return this.enabled == groupsGetCatalogInfoResponseDto.enabled && epx.f(this.categories, groupsGetCatalogInfoResponseDto.categories);
    }

    public final int hashCode() {
        int hashCode = this.enabled.hashCode() * 31;
        List<GroupsGroupCategoryDto> list = this.categories;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "GroupsGetCatalogInfoResponseDto(enabled=" + this.enabled + ", categories=" + this.categories + ")";
    }

    public /* synthetic */ GroupsGetCatalogInfoResponseDto(BaseBoolIntDto baseBoolIntDto, List list, int i, zcl zclVar) {
        this(baseBoolIntDto, (i & 2) != 0 ? null : list);
    }
}

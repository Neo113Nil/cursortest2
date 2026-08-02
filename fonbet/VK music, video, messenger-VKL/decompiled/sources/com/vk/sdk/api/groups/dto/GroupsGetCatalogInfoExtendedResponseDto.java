package com.vk.sdk.api.groups.dto;

import com.vk.dto.hints.HintCategories;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GroupsGetCatalogInfoExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGetCatalogInfoExtendedResponseDto {

    @pmi0(HintCategories.PARAM_NAME)
    private final List<GroupsGroupCategoryFullDto> categories;

    @pmi0("enabled")
    private final BaseBoolIntDto enabled;

    public GroupsGetCatalogInfoExtendedResponseDto(BaseBoolIntDto baseBoolIntDto, List<GroupsGroupCategoryFullDto> list) {
        this.enabled = baseBoolIntDto;
        this.categories = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetCatalogInfoExtendedResponseDto)) {
            return false;
        }
        GroupsGetCatalogInfoExtendedResponseDto groupsGetCatalogInfoExtendedResponseDto = (GroupsGetCatalogInfoExtendedResponseDto) obj;
        return this.enabled == groupsGetCatalogInfoExtendedResponseDto.enabled && epx.f(this.categories, groupsGetCatalogInfoExtendedResponseDto.categories);
    }

    public final int hashCode() {
        int hashCode = this.enabled.hashCode() * 31;
        List<GroupsGroupCategoryFullDto> list = this.categories;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "GroupsGetCatalogInfoExtendedResponseDto(enabled=" + this.enabled + ", categories=" + this.categories + ")";
    }

    public /* synthetic */ GroupsGetCatalogInfoExtendedResponseDto(BaseBoolIntDto baseBoolIntDto, List list, int i, zcl zclVar) {
        this(baseBoolIntDto, (i & 2) != 0 ? null : list);
    }
}

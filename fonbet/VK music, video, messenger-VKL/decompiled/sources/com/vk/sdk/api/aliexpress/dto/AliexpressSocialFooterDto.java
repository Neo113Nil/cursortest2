package com.vk.sdk.api.aliexpress.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseLinkButtonActionDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AliexpressSocialFooterDto.kt */
/* loaded from: classes5.dex */
public final class AliexpressSocialFooterDto {

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final String type;

    @pmi0("user_ids")
    private final List<UserId> userIds;

    public AliexpressSocialFooterDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AliexpressSocialFooterDto)) {
            return false;
        }
        AliexpressSocialFooterDto aliexpressSocialFooterDto = (AliexpressSocialFooterDto) obj;
        return epx.f(this.type, aliexpressSocialFooterDto.type) && epx.f(this.action, aliexpressSocialFooterDto.action) && epx.f(this.text, aliexpressSocialFooterDto.text) && epx.f(this.userIds, aliexpressSocialFooterDto.userIds);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        int hashCode2 = (hashCode + (baseLinkButtonActionDto == null ? 0 : baseLinkButtonActionDto.hashCode())) * 31;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<UserId> list = this.userIds;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "AliexpressSocialFooterDto(type=" + this.type + ", action=" + this.action + ", text=" + this.text + ", userIds=" + this.userIds + ")";
    }

    public AliexpressSocialFooterDto(String str, BaseLinkButtonActionDto baseLinkButtonActionDto, String str2, List<UserId> list) {
        this.type = str;
        this.action = baseLinkButtonActionDto;
        this.text = str2;
        this.userIds = list;
    }

    public /* synthetic */ AliexpressSocialFooterDto(String str, BaseLinkButtonActionDto baseLinkButtonActionDto, String str2, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : baseLinkButtonActionDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list);
    }
}

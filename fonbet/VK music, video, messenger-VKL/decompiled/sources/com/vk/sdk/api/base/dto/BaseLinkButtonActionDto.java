package com.vk.sdk.api.base.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseLinkButtonActionDto.kt */
/* loaded from: classes5.dex */
public final class BaseLinkButtonActionDto {

    @pmi0("consume_reason")
    private final String consumeReason;

    @pmi0("type")
    private final BaseLinkButtonActionTypeDto type;

    @pmi0("url")
    private final String url;

    public BaseLinkButtonActionDto(BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto, String str, String str2) {
        this.type = baseLinkButtonActionTypeDto;
        this.url = str;
        this.consumeReason = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkButtonActionDto)) {
            return false;
        }
        BaseLinkButtonActionDto baseLinkButtonActionDto = (BaseLinkButtonActionDto) obj;
        return this.type == baseLinkButtonActionDto.type && epx.f(this.url, baseLinkButtonActionDto.url) && epx.f(this.consumeReason, baseLinkButtonActionDto.consumeReason);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.consumeReason;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto = this.type;
        String str = this.url;
        String str2 = this.consumeReason;
        StringBuilder sb = new StringBuilder("BaseLinkButtonActionDto(type=");
        sb.append(baseLinkButtonActionTypeDto);
        sb.append(", url=");
        sb.append(str);
        sb.append(", consumeReason=");
        return i5s.a(sb, str2, ")");
    }

    public /* synthetic */ BaseLinkButtonActionDto(BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto, String str, String str2, int i, zcl zclVar) {
        this(baseLinkButtonActionTypeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}

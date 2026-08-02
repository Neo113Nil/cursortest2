package com.vk.sdk.api.ads.dto;

import com.vk.sdk.api.base.dto.BaseLinkButtonActionDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AdsHtml5GameInappActionDto.kt */
/* loaded from: classes5.dex */
public final class AdsHtml5GameInappActionDto {

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("name")
    private final String name;

    public AdsHtml5GameInappActionDto(String str, BaseLinkButtonActionDto baseLinkButtonActionDto) {
        this.name = str;
        this.action = baseLinkButtonActionDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsHtml5GameInappActionDto)) {
            return false;
        }
        AdsHtml5GameInappActionDto adsHtml5GameInappActionDto = (AdsHtml5GameInappActionDto) obj;
        return epx.f(this.name, adsHtml5GameInappActionDto.name) && epx.f(this.action, adsHtml5GameInappActionDto.action);
    }

    public final int hashCode() {
        return this.action.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return "AdsHtml5GameInappActionDto(name=" + this.name + ", action=" + this.action + ")";
    }
}

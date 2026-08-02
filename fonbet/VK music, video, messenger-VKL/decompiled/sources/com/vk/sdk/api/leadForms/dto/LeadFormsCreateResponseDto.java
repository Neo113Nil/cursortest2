package com.vk.sdk.api.leadForms.dto;

import xsna.epx;
import xsna.gq;
import xsna.pmi0;

/* compiled from: LeadFormsCreateResponseDto.kt */
/* loaded from: classes5.dex */
public final class LeadFormsCreateResponseDto {

    @pmi0("form_id")
    private final int formId;

    @pmi0("url")
    private final String url;

    public LeadFormsCreateResponseDto(int i, String str) {
        this.formId = i;
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsCreateResponseDto)) {
            return false;
        }
        LeadFormsCreateResponseDto leadFormsCreateResponseDto = (LeadFormsCreateResponseDto) obj;
        return this.formId == leadFormsCreateResponseDto.formId && epx.f(this.url, leadFormsCreateResponseDto.url);
    }

    public final int hashCode() {
        return this.url.hashCode() + (Integer.hashCode(this.formId) * 31);
    }

    public final String toString() {
        return gq.b(this.formId, "LeadFormsCreateResponseDto(formId=", ", url=", this.url, ")");
    }
}

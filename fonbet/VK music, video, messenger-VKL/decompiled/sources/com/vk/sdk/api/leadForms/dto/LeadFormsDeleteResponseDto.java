package com.vk.sdk.api.leadForms.dto;

import xsna.pmi0;
import xsna.tgw;

/* compiled from: LeadFormsDeleteResponseDto.kt */
/* loaded from: classes5.dex */
public final class LeadFormsDeleteResponseDto {

    @pmi0("form_id")
    private final int formId;

    public LeadFormsDeleteResponseDto(int i) {
        this.formId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LeadFormsDeleteResponseDto) && this.formId == ((LeadFormsDeleteResponseDto) obj).formId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.formId);
    }

    public final String toString() {
        return tgw.b(this.formId, "LeadFormsDeleteResponseDto(formId=", ")");
    }
}

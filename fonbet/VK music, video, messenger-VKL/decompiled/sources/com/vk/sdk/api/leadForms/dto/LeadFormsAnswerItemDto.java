package com.vk.sdk.api.leadForms.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.ss9;
import xsna.zcl;

/* compiled from: LeadFormsAnswerItemDto.kt */
/* loaded from: classes5.dex */
public final class LeadFormsAnswerItemDto {

    @pmi0("key")
    private final String key;

    @pmi0("value")
    private final String value;

    public LeadFormsAnswerItemDto(String str, String str2) {
        this.value = str;
        this.key = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsAnswerItemDto)) {
            return false;
        }
        LeadFormsAnswerItemDto leadFormsAnswerItemDto = (LeadFormsAnswerItemDto) obj;
        return epx.f(this.value, leadFormsAnswerItemDto.value) && epx.f(this.key, leadFormsAnswerItemDto.key);
    }

    public final int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        String str = this.key;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ss9.a("LeadFormsAnswerItemDto(value=", this.value, ", key=", this.key, ")");
    }

    public /* synthetic */ LeadFormsAnswerItemDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}

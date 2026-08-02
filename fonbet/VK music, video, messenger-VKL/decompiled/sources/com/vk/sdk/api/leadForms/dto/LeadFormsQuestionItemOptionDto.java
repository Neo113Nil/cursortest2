package com.vk.sdk.api.leadForms.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.ss9;
import xsna.zcl;

/* compiled from: LeadFormsQuestionItemOptionDto.kt */
/* loaded from: classes5.dex */
public final class LeadFormsQuestionItemOptionDto {

    @pmi0("key")
    private final String key;

    @pmi0("label")
    private final String label;

    public LeadFormsQuestionItemOptionDto(String str, String str2) {
        this.label = str;
        this.key = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsQuestionItemOptionDto)) {
            return false;
        }
        LeadFormsQuestionItemOptionDto leadFormsQuestionItemOptionDto = (LeadFormsQuestionItemOptionDto) obj;
        return epx.f(this.label, leadFormsQuestionItemOptionDto.label) && epx.f(this.key, leadFormsQuestionItemOptionDto.key);
    }

    public final int hashCode() {
        int hashCode = this.label.hashCode() * 31;
        String str = this.key;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ss9.a("LeadFormsQuestionItemOptionDto(label=", this.label, ", key=", this.key, ")");
    }

    public /* synthetic */ LeadFormsQuestionItemOptionDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}

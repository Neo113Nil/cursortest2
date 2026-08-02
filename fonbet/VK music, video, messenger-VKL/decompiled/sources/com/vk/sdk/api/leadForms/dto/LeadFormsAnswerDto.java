package com.vk.sdk.api.leadForms.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;

/* compiled from: LeadFormsAnswerDto.kt */
/* loaded from: classes5.dex */
public final class LeadFormsAnswerDto {

    @pmi0("answer")
    private final List<LeadFormsAnswerItemDto> answer;

    @pmi0("key")
    private final String key;

    public LeadFormsAnswerDto(String str, List<LeadFormsAnswerItemDto> list) {
        this.key = str;
        this.answer = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsAnswerDto)) {
            return false;
        }
        LeadFormsAnswerDto leadFormsAnswerDto = (LeadFormsAnswerDto) obj;
        return epx.f(this.key, leadFormsAnswerDto.key) && epx.f(this.answer, leadFormsAnswerDto.answer);
    }

    public final int hashCode() {
        return this.answer.hashCode() + (this.key.hashCode() * 31);
    }

    public final String toString() {
        return "LeadFormsAnswerDto(key=" + this.key + ", answer=" + this.answer + ")";
    }
}

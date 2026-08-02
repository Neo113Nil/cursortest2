package com.vk.sdk.api.leadForms.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: LeadFormsGetLeadsResponseDto.kt */
/* loaded from: classes5.dex */
public final class LeadFormsGetLeadsResponseDto {

    @pmi0("leads")
    private final List<LeadFormsLeadDto> leads;

    @pmi0("next_page_token")
    private final String nextPageToken;

    public LeadFormsGetLeadsResponseDto(List<LeadFormsLeadDto> list, String str) {
        this.leads = list;
        this.nextPageToken = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsGetLeadsResponseDto)) {
            return false;
        }
        LeadFormsGetLeadsResponseDto leadFormsGetLeadsResponseDto = (LeadFormsGetLeadsResponseDto) obj;
        return epx.f(this.leads, leadFormsGetLeadsResponseDto.leads) && epx.f(this.nextPageToken, leadFormsGetLeadsResponseDto.nextPageToken);
    }

    public final int hashCode() {
        int hashCode = this.leads.hashCode() * 31;
        String str = this.nextPageToken;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "LeadFormsGetLeadsResponseDto(leads=" + this.leads + ", nextPageToken=" + this.nextPageToken + ")";
    }

    public /* synthetic */ LeadFormsGetLeadsResponseDto(List list, String str, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str);
    }
}

package com.vk.sdk.api.leadForms.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.fw3;
import xsna.oq;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: LeadFormsLeadDto.kt */
/* loaded from: classes5.dex */
public final class LeadFormsLeadDto {

    @pmi0("ad_id")
    private final Integer adId;

    @pmi0("answers")
    private final List<LeadFormsAnswerDto> answers;

    @pmi0("date")
    private final int date;

    @pmi0("lead_id")
    private final int leadId;

    @pmi0("user_id")
    private final UserId userId;

    public LeadFormsLeadDto(int i, UserId userId, int i2, List<LeadFormsAnswerDto> list, Integer num) {
        this.leadId = i;
        this.userId = userId;
        this.date = i2;
        this.answers = list;
        this.adId = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsLeadDto)) {
            return false;
        }
        LeadFormsLeadDto leadFormsLeadDto = (LeadFormsLeadDto) obj;
        return this.leadId == leadFormsLeadDto.leadId && epx.f(this.userId, leadFormsLeadDto.userId) && this.date == leadFormsLeadDto.date && epx.f(this.answers, leadFormsLeadDto.answers) && epx.f(this.adId, leadFormsLeadDto.adId);
    }

    public final int hashCode() {
        int a = fw3.a(shy.a(this.date, bh10.a(Integer.hashCode(this.leadId) * 31, 31, this.userId.b), 31), 31, this.answers);
        Integer num = this.adId;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        int i = this.leadId;
        UserId userId = this.userId;
        int i2 = this.date;
        List<LeadFormsAnswerDto> list = this.answers;
        Integer num = this.adId;
        StringBuilder sb = new StringBuilder("LeadFormsLeadDto(leadId=");
        sb.append(i);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", date=");
        sb.append(i2);
        sb.append(", answers=");
        sb.append(list);
        sb.append(", adId=");
        return oq.b(sb, num, ")");
    }

    public /* synthetic */ LeadFormsLeadDto(int i, UserId userId, int i2, List list, Integer num, int i3, zcl zclVar) {
        this(i, userId, i2, list, (i3 & 16) != 0 ? null : num);
    }
}

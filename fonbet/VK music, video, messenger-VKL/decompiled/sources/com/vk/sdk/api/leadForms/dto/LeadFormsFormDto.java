package com.vk.sdk.api.leadForms.dto;

import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.history.b;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bh10;
import xsna.epx;
import xsna.i5s;
import xsna.jax0;
import xsna.mq;
import xsna.n6j;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: LeadFormsFormDto.kt */
/* loaded from: classes5.dex */
public final class LeadFormsFormDto {

    @pmi0(SignalingProtocol.KEY_ACTIVE)
    private final BaseBoolIntDto active;

    @pmi0("confirmation")
    private final String confirmation;

    @pmi0("description")
    private final String description;

    @pmi0("form_id")
    private final int formId;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("leads_count")
    private final int leadsCount;

    @pmi0("name")
    private final String name;

    @pmi0("notify_admins")
    private final String notifyAdmins;

    @pmi0("notify_emails")
    private final String notifyEmails;

    @pmi0("once_per_user")
    private final Integer oncePerUser;

    @pmi0("photo")
    private final String photo;

    @pmi0("pixel_code")
    private final String pixelCode;

    @pmi0("policy_link_url")
    private final String policyLinkUrl;

    @pmi0("questions")
    private final List<LeadFormsQuestionItemDto> questions;

    @pmi0("site_link_url")
    private final String siteLinkUrl;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    public LeadFormsFormDto(int i, UserId userId, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<LeadFormsQuestionItemDto> list, BaseBoolIntDto baseBoolIntDto, String str9, Integer num, String str10, String str11) {
        this.formId = i;
        this.groupId = userId;
        this.leadsCount = i2;
        this.url = str;
        this.photo = str2;
        this.name = str3;
        this.title = str4;
        this.description = str5;
        this.confirmation = str6;
        this.siteLinkUrl = str7;
        this.policyLinkUrl = str8;
        this.questions = list;
        this.active = baseBoolIntDto;
        this.pixelCode = str9;
        this.oncePerUser = num;
        this.notifyAdmins = str10;
        this.notifyEmails = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeadFormsFormDto)) {
            return false;
        }
        LeadFormsFormDto leadFormsFormDto = (LeadFormsFormDto) obj;
        return this.formId == leadFormsFormDto.formId && epx.f(this.groupId, leadFormsFormDto.groupId) && this.leadsCount == leadFormsFormDto.leadsCount && epx.f(this.url, leadFormsFormDto.url) && epx.f(this.photo, leadFormsFormDto.photo) && epx.f(this.name, leadFormsFormDto.name) && epx.f(this.title, leadFormsFormDto.title) && epx.f(this.description, leadFormsFormDto.description) && epx.f(this.confirmation, leadFormsFormDto.confirmation) && epx.f(this.siteLinkUrl, leadFormsFormDto.siteLinkUrl) && epx.f(this.policyLinkUrl, leadFormsFormDto.policyLinkUrl) && epx.f(this.questions, leadFormsFormDto.questions) && this.active == leadFormsFormDto.active && epx.f(this.pixelCode, leadFormsFormDto.pixelCode) && epx.f(this.oncePerUser, leadFormsFormDto.oncePerUser) && epx.f(this.notifyAdmins, leadFormsFormDto.notifyAdmins) && epx.f(this.notifyEmails, leadFormsFormDto.notifyEmails);
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.leadsCount, bh10.a(Integer.hashCode(this.formId) * 31, 31, this.groupId.b), 31), 31, this.url);
        String str = this.photo;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.confirmation;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.siteLinkUrl;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.policyLinkUrl;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<LeadFormsQuestionItemDto> list = this.questions;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.active;
        int hashCode9 = (hashCode8 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        String str8 = this.pixelCode;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.oncePerUser;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.notifyAdmins;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.notifyEmails;
        return hashCode12 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        int i = this.formId;
        UserId userId = this.groupId;
        int i2 = this.leadsCount;
        String str = this.url;
        String str2 = this.photo;
        String str3 = this.name;
        String str4 = this.title;
        String str5 = this.description;
        String str6 = this.confirmation;
        String str7 = this.siteLinkUrl;
        String str8 = this.policyLinkUrl;
        List<LeadFormsQuestionItemDto> list = this.questions;
        BaseBoolIntDto baseBoolIntDto = this.active;
        String str9 = this.pixelCode;
        Integer num = this.oncePerUser;
        String str10 = this.notifyAdmins;
        String str11 = this.notifyEmails;
        StringBuilder sb = new StringBuilder("LeadFormsFormDto(formId=");
        sb.append(i);
        sb.append(", groupId=");
        sb.append(userId);
        sb.append(", leadsCount=");
        jax0.a(i2, ", url=", str, ", photo=", sb);
        n6j.b(sb, str2, ", name=", str3, ", title=");
        n6j.b(sb, str4, ", description=", str5, ", confirmation=");
        n6j.b(sb, str6, ", siteLinkUrl=", str7, ", policyLinkUrl=");
        b.c(str8, ", questions=", ", active=", sb, list);
        sb.append(baseBoolIntDto);
        sb.append(", pixelCode=");
        sb.append(str9);
        sb.append(", oncePerUser=");
        mq.b(num, ", notifyAdmins=", str10, ", notifyEmails=", sb);
        return i5s.a(sb, str11, ")");
    }

    public /* synthetic */ LeadFormsFormDto(int i, UserId userId, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, BaseBoolIntDto baseBoolIntDto, String str9, Integer num, String str10, String str11, int i3, zcl zclVar) {
        this(i, userId, i2, str, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : str5, (i3 & 256) != 0 ? null : str6, (i3 & 512) != 0 ? null : str7, (i3 & 1024) != 0 ? null : str8, (i3 & 2048) != 0 ? null : list, (i3 & 4096) != 0 ? null : baseBoolIntDto, (i3 & 8192) != 0 ? null : str9, (i3 & 16384) != 0 ? null : num, (32768 & i3) != 0 ? null : str10, (i3 & 65536) != 0 ? null : str11);
    }
}

package com.vk.sdk.api.pages.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.mq;
import xsna.nyh0;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PagesWikipageDto.kt */
/* loaded from: classes5.dex */
public final class PagesWikipageDto {

    @pmi0("creator_id")
    private final Integer creatorId;

    @pmi0("creator_name")
    private final String creatorName;

    @pmi0("editor_id")
    private final Integer editorId;

    @pmi0("editor_name")
    private final String editorName;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    @pmi0("views")
    private final int views;

    @pmi0("who_can_edit")
    private final PagesPrivacySettingsDto whoCanEdit;

    @pmi0("who_can_view")
    private final PagesPrivacySettingsDto whoCanView;

    public PagesWikipageDto(UserId userId, int i, String str, int i2, PagesPrivacySettingsDto pagesPrivacySettingsDto, PagesPrivacySettingsDto pagesPrivacySettingsDto2, Integer num, String str2, Integer num2, String str3) {
        this.groupId = userId;
        this.id = i;
        this.title = str;
        this.views = i2;
        this.whoCanEdit = pagesPrivacySettingsDto;
        this.whoCanView = pagesPrivacySettingsDto2;
        this.creatorId = num;
        this.creatorName = str2;
        this.editorId = num2;
        this.editorName = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagesWikipageDto)) {
            return false;
        }
        PagesWikipageDto pagesWikipageDto = (PagesWikipageDto) obj;
        return epx.f(this.groupId, pagesWikipageDto.groupId) && this.id == pagesWikipageDto.id && epx.f(this.title, pagesWikipageDto.title) && this.views == pagesWikipageDto.views && this.whoCanEdit == pagesWikipageDto.whoCanEdit && this.whoCanView == pagesWikipageDto.whoCanView && epx.f(this.creatorId, pagesWikipageDto.creatorId) && epx.f(this.creatorName, pagesWikipageDto.creatorName) && epx.f(this.editorId, pagesWikipageDto.editorId) && epx.f(this.editorName, pagesWikipageDto.editorName);
    }

    public final int hashCode() {
        int hashCode = (this.whoCanView.hashCode() + ((this.whoCanEdit.hashCode() + shy.a(this.views, urd0.a(shy.a(this.id, Long.hashCode(this.groupId.b) * 31, 31), 31, this.title), 31)) * 31)) * 31;
        Integer num = this.creatorId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.creatorName;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.editorId;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.editorName;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.groupId;
        int i = this.id;
        String str = this.title;
        int i2 = this.views;
        PagesPrivacySettingsDto pagesPrivacySettingsDto = this.whoCanEdit;
        PagesPrivacySettingsDto pagesPrivacySettingsDto2 = this.whoCanView;
        Integer num = this.creatorId;
        String str2 = this.creatorName;
        Integer num2 = this.editorId;
        String str3 = this.editorName;
        StringBuilder sb = new StringBuilder("PagesWikipageDto(groupId=");
        sb.append(userId);
        sb.append(", id=");
        sb.append(i);
        sb.append(", title=");
        nyh0.a(i2, str, ", views=", ", whoCanEdit=", sb);
        sb.append(pagesPrivacySettingsDto);
        sb.append(", whoCanView=");
        sb.append(pagesPrivacySettingsDto2);
        sb.append(", creatorId=");
        mq.b(num, ", creatorName=", str2, ", editorId=", sb);
        sb.append(num2);
        sb.append(", editorName=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ PagesWikipageDto(UserId userId, int i, String str, int i2, PagesPrivacySettingsDto pagesPrivacySettingsDto, PagesPrivacySettingsDto pagesPrivacySettingsDto2, Integer num, String str2, Integer num2, String str3, int i3, zcl zclVar) {
        this(userId, i, str, i2, pagesPrivacySettingsDto, pagesPrivacySettingsDto2, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : str2, (i3 & 256) != 0 ? null : num2, (i3 & 512) != 0 ? null : str3);
    }
}

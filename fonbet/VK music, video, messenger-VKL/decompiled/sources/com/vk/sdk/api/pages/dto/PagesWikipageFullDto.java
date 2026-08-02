package com.vk.sdk.api.pages.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.bh10;
import xsna.epx;
import xsna.n6j;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.to;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PagesWikipageFullDto.kt */
/* loaded from: classes5.dex */
public final class PagesWikipageFullDto {

    @pmi0("created")
    private final int created;

    @pmi0("creator_id")
    private final UserId creatorId;

    @pmi0("current_user_can_edit")
    private final BaseBoolIntDto currentUserCanEdit;

    @pmi0("current_user_can_edit_access")
    private final BaseBoolIntDto currentUserCanEditAccess;

    @pmi0("edited")
    private final int edited;

    @pmi0("editor_id")
    private final UserId editorId;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("html")
    private final String html;

    @pmi0("id")
    private final int id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("parent")
    private final String parent;

    @pmi0("parent2")
    private final String parent2;

    @pmi0("source")
    private final String source;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    @pmi0("view_url")
    private final String viewUrl;

    @pmi0("views")
    private final int views;

    @pmi0("who_can_edit")
    private final PagesPrivacySettingsDto whoCanEdit;

    @pmi0("who_can_view")
    private final PagesPrivacySettingsDto whoCanView;

    public PagesWikipageFullDto(int i, int i2, UserId userId, int i3, String str, String str2, int i4, PagesPrivacySettingsDto pagesPrivacySettingsDto, PagesPrivacySettingsDto pagesPrivacySettingsDto2, UserId userId2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, UserId userId3, String str3, String str4, String str5, String str6, String str7, UserId userId4) {
        this.created = i;
        this.edited = i2;
        this.groupId = userId;
        this.id = i3;
        this.title = str;
        this.viewUrl = str2;
        this.views = i4;
        this.whoCanEdit = pagesPrivacySettingsDto;
        this.whoCanView = pagesPrivacySettingsDto2;
        this.creatorId = userId2;
        this.currentUserCanEdit = baseBoolIntDto;
        this.currentUserCanEditAccess = baseBoolIntDto2;
        this.editorId = userId3;
        this.html = str3;
        this.source = str4;
        this.url = str5;
        this.parent = str6;
        this.parent2 = str7;
        this.ownerId = userId4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagesWikipageFullDto)) {
            return false;
        }
        PagesWikipageFullDto pagesWikipageFullDto = (PagesWikipageFullDto) obj;
        return this.created == pagesWikipageFullDto.created && this.edited == pagesWikipageFullDto.edited && epx.f(this.groupId, pagesWikipageFullDto.groupId) && this.id == pagesWikipageFullDto.id && epx.f(this.title, pagesWikipageFullDto.title) && epx.f(this.viewUrl, pagesWikipageFullDto.viewUrl) && this.views == pagesWikipageFullDto.views && this.whoCanEdit == pagesWikipageFullDto.whoCanEdit && this.whoCanView == pagesWikipageFullDto.whoCanView && epx.f(this.creatorId, pagesWikipageFullDto.creatorId) && this.currentUserCanEdit == pagesWikipageFullDto.currentUserCanEdit && this.currentUserCanEditAccess == pagesWikipageFullDto.currentUserCanEditAccess && epx.f(this.editorId, pagesWikipageFullDto.editorId) && epx.f(this.html, pagesWikipageFullDto.html) && epx.f(this.source, pagesWikipageFullDto.source) && epx.f(this.url, pagesWikipageFullDto.url) && epx.f(this.parent, pagesWikipageFullDto.parent) && epx.f(this.parent2, pagesWikipageFullDto.parent2) && epx.f(this.ownerId, pagesWikipageFullDto.ownerId);
    }

    public final int hashCode() {
        int hashCode = (this.whoCanView.hashCode() + ((this.whoCanEdit.hashCode() + shy.a(this.views, urd0.a(urd0.a(shy.a(this.id, bh10.a(shy.a(this.edited, Integer.hashCode(this.created) * 31, 31), 31, this.groupId.b), 31), 31, this.title), 31, this.viewUrl), 31)) * 31)) * 31;
        UserId userId = this.creatorId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        BaseBoolIntDto baseBoolIntDto = this.currentUserCanEdit;
        int hashCode3 = (hashCode2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.currentUserCanEditAccess;
        int hashCode4 = (hashCode3 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        UserId userId2 = this.editorId;
        int hashCode5 = (hashCode4 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        String str = this.html;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.parent;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.parent2;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        UserId userId3 = this.ownerId;
        return hashCode10 + (userId3 != null ? Long.hashCode(userId3.b) : 0);
    }

    public final String toString() {
        int i = this.created;
        int i2 = this.edited;
        UserId userId = this.groupId;
        int i3 = this.id;
        String str = this.title;
        String str2 = this.viewUrl;
        int i4 = this.views;
        PagesPrivacySettingsDto pagesPrivacySettingsDto = this.whoCanEdit;
        PagesPrivacySettingsDto pagesPrivacySettingsDto2 = this.whoCanView;
        UserId userId2 = this.creatorId;
        BaseBoolIntDto baseBoolIntDto = this.currentUserCanEdit;
        BaseBoolIntDto baseBoolIntDto2 = this.currentUserCanEditAccess;
        UserId userId3 = this.editorId;
        String str3 = this.html;
        String str4 = this.source;
        String str5 = this.url;
        String str6 = this.parent;
        String str7 = this.parent2;
        UserId userId4 = this.ownerId;
        StringBuilder a = odj.a(i, i2, "PagesWikipageFullDto(created=", ", edited=", ", groupId=");
        a.append(userId);
        a.append(", id=");
        a.append(i3);
        a.append(", title=");
        n6j.b(a, str, ", viewUrl=", str2, ", views=");
        a.append(i4);
        a.append(", whoCanEdit=");
        a.append(pagesPrivacySettingsDto);
        a.append(", whoCanView=");
        a.append(pagesPrivacySettingsDto2);
        a.append(", creatorId=");
        a.append(userId2);
        a.append(", currentUserCanEdit=");
        to.b(a, baseBoolIntDto, ", currentUserCanEditAccess=", baseBoolIntDto2, ", editorId=");
        a.append(userId3);
        a.append(", html=");
        a.append(str3);
        a.append(", source=");
        n6j.b(a, str4, ", url=", str5, ", parent=");
        n6j.b(a, str6, ", parent2=", str7, ", ownerId=");
        a.append(userId4);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ PagesWikipageFullDto(int i, int i2, UserId userId, int i3, String str, String str2, int i4, PagesPrivacySettingsDto pagesPrivacySettingsDto, PagesPrivacySettingsDto pagesPrivacySettingsDto2, UserId userId2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, UserId userId3, String str3, String str4, String str5, String str6, String str7, UserId userId4, int i5, zcl zclVar) {
        this(i, i2, userId, i3, str, str2, i4, pagesPrivacySettingsDto, pagesPrivacySettingsDto2, (i5 & 512) != 0 ? null : userId2, (i5 & 1024) != 0 ? null : baseBoolIntDto, (i5 & 2048) != 0 ? null : baseBoolIntDto2, (i5 & 4096) != 0 ? null : userId3, (i5 & 8192) != 0 ? null : str3, (i5 & 16384) != 0 ? null : str4, (32768 & i5) != 0 ? null : str5, (65536 & i5) != 0 ? null : str6, (131072 & i5) != 0 ? null : str7, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : userId4);
    }
}

package com.vk.api.generated.pages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.bh10;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PagesWikipageFullDto.kt */
/* loaded from: classes15.dex */
public final class PagesWikipageFullDto implements Parcelable {
    public static final Parcelable.Creator<PagesWikipageFullDto> CREATOR = new a();

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

    /* compiled from: PagesWikipageFullDto.kt */
    public static final class a implements Parcelable.Creator<PagesWikipageFullDto> {
        @Override // android.os.Parcelable.Creator
        public final PagesWikipageFullDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(PagesWikipageFullDto.class.getClassLoader());
            int readInt3 = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt4 = parcel.readInt();
            Parcelable.Creator<PagesPrivacySettingsDto> creator = PagesPrivacySettingsDto.CREATOR;
            return new PagesWikipageFullDto(readInt, readInt2, userId, readInt3, readString, readString2, readInt4, creator.createFromParcel(parcel), creator.createFromParcel(parcel), (UserId) parcel.readParcelable(PagesWikipageFullDto.class.getClassLoader()), parcel.readInt() == 0 ? null : BaseBoolIntDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BaseBoolIntDto.CREATOR.createFromParcel(parcel) : null, (UserId) parcel.readParcelable(PagesWikipageFullDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (UserId) parcel.readParcelable(PagesWikipageFullDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PagesWikipageFullDto[] newArray(int i) {
            return new PagesWikipageFullDto[i];
        }
    }

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

    public final UserId d() {
        return this.groupId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.viewUrl;
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

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
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
        StringBuilder sb = new StringBuilder("PagesWikipageFullDto(created=");
        sb.append(this.created);
        sb.append(", edited=");
        sb.append(this.edited);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", viewUrl=");
        sb.append(this.viewUrl);
        sb.append(", views=");
        sb.append(this.views);
        sb.append(", whoCanEdit=");
        sb.append(this.whoCanEdit);
        sb.append(", whoCanView=");
        sb.append(this.whoCanView);
        sb.append(", creatorId=");
        sb.append(this.creatorId);
        sb.append(", currentUserCanEdit=");
        sb.append(this.currentUserCanEdit);
        sb.append(", currentUserCanEditAccess=");
        sb.append(this.currentUserCanEditAccess);
        sb.append(", editorId=");
        sb.append(this.editorId);
        sb.append(", html=");
        sb.append(this.html);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", parent=");
        sb.append(this.parent);
        sb.append(", parent2=");
        sb.append(this.parent2);
        sb.append(", ownerId=");
        return gp.b(sb, this.ownerId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.created);
        parcel.writeInt(this.edited);
        parcel.writeParcelable(this.groupId, i);
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.viewUrl);
        parcel.writeInt(this.views);
        this.whoCanEdit.writeToParcel(parcel, i);
        this.whoCanView.writeToParcel(parcel, i);
        parcel.writeParcelable(this.creatorId, i);
        BaseBoolIntDto baseBoolIntDto = this.currentUserCanEdit;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
        BaseBoolIntDto baseBoolIntDto2 = this.currentUserCanEditAccess;
        if (baseBoolIntDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto2.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.editorId, i);
        parcel.writeString(this.html);
        parcel.writeString(this.source);
        parcel.writeString(this.url);
        parcel.writeString(this.parent);
        parcel.writeString(this.parent2);
        parcel.writeParcelable(this.ownerId, i);
    }

    public /* synthetic */ PagesWikipageFullDto(int i, int i2, UserId userId, int i3, String str, String str2, int i4, PagesPrivacySettingsDto pagesPrivacySettingsDto, PagesPrivacySettingsDto pagesPrivacySettingsDto2, UserId userId2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, UserId userId3, String str3, String str4, String str5, String str6, String str7, UserId userId4, int i5, zcl zclVar) {
        this(i, i2, userId, i3, str, str2, i4, pagesPrivacySettingsDto, pagesPrivacySettingsDto2, (i5 & 512) != 0 ? null : userId2, (i5 & 1024) != 0 ? null : baseBoolIntDto, (i5 & 2048) != 0 ? null : baseBoolIntDto2, (i5 & 4096) != 0 ? null : userId3, (i5 & 8192) != 0 ? null : str3, (i5 & 16384) != 0 ? null : str4, (32768 & i5) != 0 ? null : str5, (65536 & i5) != 0 ? null : str6, (131072 & i5) != 0 ? null : str7, (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : userId4);
    }
}

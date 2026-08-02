package com.vk.sdk.api.wall.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.jax0;
import xsna.n6j;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.vq;
import xsna.zcl;

/* compiled from: WallAttachedNoteDto.kt */
/* loaded from: classes5.dex */
public final class WallAttachedNoteDto {

    @pmi0("can_comment")
    private final Integer canComment;

    @pmi0("comments")
    private final int comments;

    @pmi0("date")
    private final int date;

    @pmi0("id")
    private final int id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("privacy_comment")
    private final List<String> privacyComment;

    @pmi0("privacy_view")
    private final List<String> privacyView;

    @pmi0("read_comments")
    private final int readComments;

    @pmi0("text")
    private final String text;

    @pmi0("text_wiki")
    private final String textWiki;

    @pmi0("title")
    private final String title;

    @pmi0("view_url")
    private final String viewUrl;

    public WallAttachedNoteDto(int i, int i2, int i3, UserId userId, int i4, String str, String str2, String str3, List<String> list, List<String> list2, Integer num, String str4) {
        this.comments = i;
        this.date = i2;
        this.id = i3;
        this.ownerId = userId;
        this.readComments = i4;
        this.title = str;
        this.viewUrl = str2;
        this.text = str3;
        this.privacyView = list;
        this.privacyComment = list2;
        this.canComment = num;
        this.textWiki = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallAttachedNoteDto)) {
            return false;
        }
        WallAttachedNoteDto wallAttachedNoteDto = (WallAttachedNoteDto) obj;
        return this.comments == wallAttachedNoteDto.comments && this.date == wallAttachedNoteDto.date && this.id == wallAttachedNoteDto.id && epx.f(this.ownerId, wallAttachedNoteDto.ownerId) && this.readComments == wallAttachedNoteDto.readComments && epx.f(this.title, wallAttachedNoteDto.title) && epx.f(this.viewUrl, wallAttachedNoteDto.viewUrl) && epx.f(this.text, wallAttachedNoteDto.text) && epx.f(this.privacyView, wallAttachedNoteDto.privacyView) && epx.f(this.privacyComment, wallAttachedNoteDto.privacyComment) && epx.f(this.canComment, wallAttachedNoteDto.canComment) && epx.f(this.textWiki, wallAttachedNoteDto.textWiki);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(shy.a(this.readComments, bh10.a(shy.a(this.id, shy.a(this.date, Integer.hashCode(this.comments) * 31, 31), 31), 31, this.ownerId.b), 31), 31, this.title), 31, this.viewUrl);
        String str = this.text;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.privacyView;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.privacyComment;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.canComment;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.textWiki;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.comments;
        int i2 = this.date;
        int i3 = this.id;
        UserId userId = this.ownerId;
        int i4 = this.readComments;
        String str = this.title;
        String str2 = this.viewUrl;
        String str3 = this.text;
        List<String> list = this.privacyView;
        List<String> list2 = this.privacyComment;
        Integer num = this.canComment;
        String str4 = this.textWiki;
        StringBuilder a = odj.a(i, i2, "WallAttachedNoteDto(comments=", ", date=", ", id=");
        a.append(i3);
        a.append(", ownerId=");
        a.append(userId);
        a.append(", readComments=");
        jax0.a(i4, ", title=", str, ", viewUrl=", a);
        n6j.b(a, str2, ", text=", str3, ", privacyView=");
        vq.d(a, list, ", privacyComment=", list2, ", canComment=");
        a.append(num);
        a.append(", textWiki=");
        a.append(str4);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ WallAttachedNoteDto(int i, int i2, int i3, UserId userId, int i4, String str, String str2, String str3, List list, List list2, Integer num, String str4, int i5, zcl zclVar) {
        this(i, i2, i3, userId, i4, str, str2, (i5 & 128) != 0 ? null : str3, (i5 & 256) != 0 ? null : list, (i5 & 512) != 0 ? null : list2, (i5 & 1024) != 0 ? null : num, (i5 & 2048) != 0 ? null : str4);
    }
}

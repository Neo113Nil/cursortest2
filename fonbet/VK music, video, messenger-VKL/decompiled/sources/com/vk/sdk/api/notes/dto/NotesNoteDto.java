package com.vk.sdk.api.notes.dto;

import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.n;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.n6j;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: NotesNoteDto.kt */
/* loaded from: classes5.dex */
public final class NotesNoteDto {

    @pmi0("can_comment")
    private final BaseBoolIntDto canComment;

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
    private final Integer readComments;

    @pmi0("text")
    private final String text;

    @pmi0("text_wiki")
    private final String textWiki;

    @pmi0("title")
    private final String title;

    @pmi0("view_url")
    private final String viewUrl;

    public NotesNoteDto(int i, int i2, int i3, UserId userId, String str, String str2, Integer num, BaseBoolIntDto baseBoolIntDto, String str3, String str4, List<String> list, List<String> list2) {
        this.comments = i;
        this.date = i2;
        this.id = i3;
        this.ownerId = userId;
        this.title = str;
        this.viewUrl = str2;
        this.readComments = num;
        this.canComment = baseBoolIntDto;
        this.text = str3;
        this.textWiki = str4;
        this.privacyView = list;
        this.privacyComment = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotesNoteDto)) {
            return false;
        }
        NotesNoteDto notesNoteDto = (NotesNoteDto) obj;
        return this.comments == notesNoteDto.comments && this.date == notesNoteDto.date && this.id == notesNoteDto.id && epx.f(this.ownerId, notesNoteDto.ownerId) && epx.f(this.title, notesNoteDto.title) && epx.f(this.viewUrl, notesNoteDto.viewUrl) && epx.f(this.readComments, notesNoteDto.readComments) && this.canComment == notesNoteDto.canComment && epx.f(this.text, notesNoteDto.text) && epx.f(this.textWiki, notesNoteDto.textWiki) && epx.f(this.privacyView, notesNoteDto.privacyView) && epx.f(this.privacyComment, notesNoteDto.privacyComment);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(bh10.a(shy.a(this.id, shy.a(this.date, Integer.hashCode(this.comments) * 31, 31), 31), 31, this.ownerId.b), 31, this.title), 31, this.viewUrl);
        Integer num = this.readComments;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.canComment;
        int hashCode2 = (hashCode + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        String str = this.text;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textWiki;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.privacyView;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.privacyComment;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.comments;
        int i2 = this.date;
        int i3 = this.id;
        UserId userId = this.ownerId;
        String str = this.title;
        String str2 = this.viewUrl;
        Integer num = this.readComments;
        BaseBoolIntDto baseBoolIntDto = this.canComment;
        String str3 = this.text;
        String str4 = this.textWiki;
        List<String> list = this.privacyView;
        List<String> list2 = this.privacyComment;
        StringBuilder a = odj.a(i, i2, "NotesNoteDto(comments=", ", date=", ", id=");
        a.append(i3);
        a.append(", ownerId=");
        a.append(userId);
        a.append(", title=");
        n6j.b(a, str, ", viewUrl=", str2, ", readComments=");
        a.append(num);
        a.append(", canComment=");
        a.append(baseBoolIntDto);
        a.append(", text=");
        n6j.b(a, str3, ", textWiki=", str4, ", privacyView=");
        return n.b(a, list, ", privacyComment=", list2, ")");
    }

    public /* synthetic */ NotesNoteDto(int i, int i2, int i3, UserId userId, String str, String str2, Integer num, BaseBoolIntDto baseBoolIntDto, String str3, String str4, List list, List list2, int i4, zcl zclVar) {
        this(i, i2, i3, userId, str, str2, (i4 & 64) != 0 ? null : num, (i4 & 128) != 0 ? null : baseBoolIntDto, (i4 & 256) != 0 ? null : str3, (i4 & 512) != 0 ? null : str4, (i4 & 1024) != 0 ? null : list, (i4 & 2048) != 0 ? null : list2);
    }
}

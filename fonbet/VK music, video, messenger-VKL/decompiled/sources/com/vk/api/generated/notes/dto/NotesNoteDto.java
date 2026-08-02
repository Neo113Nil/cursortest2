package com.vk.api.generated.notes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: NotesNoteDto.kt */
/* loaded from: classes15.dex */
public final class NotesNoteDto implements Parcelable {
    public static final Parcelable.Creator<NotesNoteDto> CREATOR = new a();

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

    /* compiled from: NotesNoteDto.kt */
    public static final class a implements Parcelable.Creator<NotesNoteDto> {
        @Override // android.os.Parcelable.Creator
        public final NotesNoteDto createFromParcel(Parcel parcel) {
            return new NotesNoteDto(parcel.readInt(), parcel.readInt(), parcel.readInt(), (UserId) parcel.readParcelable(NotesNoteDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (BaseBoolIntDto) parcel.readParcelable(NotesNoteDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final NotesNoteDto[] newArray(int i) {
            return new NotesNoteDto[i];
        }
    }

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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(bh10.a(shy.a(this.id, shy.a(this.date, Integer.hashCode(this.comments) * 31, 31), 31), 31, this.ownerId.b), 31, this.title), 31, this.viewUrl);
        Integer num = this.readComments;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
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

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotesNoteDto(comments=");
        sb.append(this.comments);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", viewUrl=");
        sb.append(this.viewUrl);
        sb.append(", readComments=");
        sb.append(this.readComments);
        sb.append(", canComment=");
        sb.append(this.canComment);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", textWiki=");
        sb.append(this.textWiki);
        sb.append(", privacyView=");
        sb.append(this.privacyView);
        sb.append(", privacyComment=");
        return ms9.a(')', sb, this.privacyComment);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.comments);
        parcel.writeInt(this.date);
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
        parcel.writeString(this.viewUrl);
        Integer num = this.readComments;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.canComment, i);
        parcel.writeString(this.text);
        parcel.writeString(this.textWiki);
        parcel.writeStringList(this.privacyView);
        parcel.writeStringList(this.privacyComment);
    }

    public /* synthetic */ NotesNoteDto(int i, int i2, int i3, UserId userId, String str, String str2, Integer num, BaseBoolIntDto baseBoolIntDto, String str3, String str4, List list, List list2, int i4, zcl zclVar) {
        this(i, i2, i3, userId, str, str2, (i4 & 64) != 0 ? null : num, (i4 & 128) != 0 ? null : baseBoolIntDto, (i4 & 256) != 0 ? null : str3, (i4 & 512) != 0 ? null : str4, (i4 & 1024) != 0 ? null : list, (i4 & 2048) != 0 ? null : list2);
    }
}

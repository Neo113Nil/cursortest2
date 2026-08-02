package com.vk.sdk.api.notes.dto;

import xsna.cgn;
import xsna.epx;
import xsna.nyh0;
import xsna.odj;
import xsna.oq;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: NotesNoteCommentDto.kt */
/* loaded from: classes5.dex */
public final class NotesNoteCommentDto {

    @pmi0("date")
    private final int date;

    @pmi0("id")
    private final int id;

    @pmi0("message")
    private final String message;

    @pmi0("nid")
    private final int nid;

    @pmi0("oid")
    private final int oid;

    @pmi0("reply_to")
    private final Integer replyTo;

    @pmi0("uid")
    private final int uid;

    public NotesNoteCommentDto(int i, int i2, String str, int i3, int i4, int i5, Integer num) {
        this.date = i;
        this.id = i2;
        this.message = str;
        this.nid = i3;
        this.oid = i4;
        this.uid = i5;
        this.replyTo = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotesNoteCommentDto)) {
            return false;
        }
        NotesNoteCommentDto notesNoteCommentDto = (NotesNoteCommentDto) obj;
        return this.date == notesNoteCommentDto.date && this.id == notesNoteCommentDto.id && epx.f(this.message, notesNoteCommentDto.message) && this.nid == notesNoteCommentDto.nid && this.oid == notesNoteCommentDto.oid && this.uid == notesNoteCommentDto.uid && epx.f(this.replyTo, notesNoteCommentDto.replyTo);
    }

    public final int hashCode() {
        int a = shy.a(this.uid, shy.a(this.oid, shy.a(this.nid, urd0.a(shy.a(this.id, Integer.hashCode(this.date) * 31, 31), 31, this.message), 31), 31), 31);
        Integer num = this.replyTo;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        int i = this.date;
        int i2 = this.id;
        String str = this.message;
        int i3 = this.nid;
        int i4 = this.oid;
        int i5 = this.uid;
        Integer num = this.replyTo;
        StringBuilder a = odj.a(i, i2, "NotesNoteCommentDto(date=", ", id=", ", message=");
        nyh0.a(i3, str, ", nid=", ", oid=", a);
        cgn.a(i4, i5, ", uid=", ", replyTo=", a);
        return oq.b(a, num, ")");
    }

    public /* synthetic */ NotesNoteCommentDto(int i, int i2, String str, int i3, int i4, int i5, Integer num, int i6, zcl zclVar) {
        this(i, i2, str, i3, i4, i5, (i6 & 64) != 0 ? null : num);
    }
}

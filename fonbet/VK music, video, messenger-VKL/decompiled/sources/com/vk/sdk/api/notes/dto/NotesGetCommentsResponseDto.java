package com.vk.sdk.api.notes.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: NotesGetCommentsResponseDto.kt */
/* loaded from: classes5.dex */
public final class NotesGetCommentsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<NotesNoteCommentDto> items;

    public NotesGetCommentsResponseDto(int i, List<NotesNoteCommentDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotesGetCommentsResponseDto)) {
            return false;
        }
        NotesGetCommentsResponseDto notesGetCommentsResponseDto = (NotesGetCommentsResponseDto) obj;
        return this.count == notesGetCommentsResponseDto.count && epx.f(this.items, notesGetCommentsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "NotesGetCommentsResponseDto(count=", ", items=", ")", this.items);
    }
}

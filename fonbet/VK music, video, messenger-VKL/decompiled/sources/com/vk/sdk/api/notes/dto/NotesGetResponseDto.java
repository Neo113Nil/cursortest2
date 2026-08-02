package com.vk.sdk.api.notes.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: NotesGetResponseDto.kt */
/* loaded from: classes5.dex */
public final class NotesGetResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<NotesNoteDto> items;

    public NotesGetResponseDto(int i, List<NotesNoteDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotesGetResponseDto)) {
            return false;
        }
        NotesGetResponseDto notesGetResponseDto = (NotesGetResponseDto) obj;
        return this.count == notesGetResponseDto.count && epx.f(this.items, notesGetResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "NotesGetResponseDto(count=", ", items=", ")", this.items);
    }
}

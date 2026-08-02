package com.vk.sdk.api.notes.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotesGetCommentsSortDto.kt */
/* loaded from: classes5.dex */
public final class NotesGetCommentsSortDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotesGetCommentsSortDto[] $VALUES;

    @pmi0("0")
    public static final NotesGetCommentsSortDto TYPE_0;

    @pmi0("1")
    public static final NotesGetCommentsSortDto TYPE_1;
    private final int value;

    static {
        NotesGetCommentsSortDto notesGetCommentsSortDto = new NotesGetCommentsSortDto("TYPE_0", 0, 0);
        TYPE_0 = notesGetCommentsSortDto;
        NotesGetCommentsSortDto notesGetCommentsSortDto2 = new NotesGetCommentsSortDto("TYPE_1", 1, 1);
        TYPE_1 = notesGetCommentsSortDto2;
        NotesGetCommentsSortDto[] notesGetCommentsSortDtoArr = {notesGetCommentsSortDto, notesGetCommentsSortDto2};
        $VALUES = notesGetCommentsSortDtoArr;
        $ENTRIES = new asp(notesGetCommentsSortDtoArr);
    }

    private NotesGetCommentsSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static NotesGetCommentsSortDto valueOf(String str) {
        return (NotesGetCommentsSortDto) Enum.valueOf(NotesGetCommentsSortDto.class, str);
    }

    public static NotesGetCommentsSortDto[] values() {
        return (NotesGetCommentsSortDto[]) $VALUES.clone();
    }
}

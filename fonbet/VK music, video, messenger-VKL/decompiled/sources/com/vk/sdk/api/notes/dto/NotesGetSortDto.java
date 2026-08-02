package com.vk.sdk.api.notes.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotesGetSortDto.kt */
/* loaded from: classes5.dex */
public final class NotesGetSortDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotesGetSortDto[] $VALUES;

    @pmi0("0")
    public static final NotesGetSortDto TYPE_0;

    @pmi0("1")
    public static final NotesGetSortDto TYPE_1;
    private final int value;

    static {
        NotesGetSortDto notesGetSortDto = new NotesGetSortDto("TYPE_0", 0, 0);
        TYPE_0 = notesGetSortDto;
        NotesGetSortDto notesGetSortDto2 = new NotesGetSortDto("TYPE_1", 1, 1);
        TYPE_1 = notesGetSortDto2;
        NotesGetSortDto[] notesGetSortDtoArr = {notesGetSortDto, notesGetSortDto2};
        $VALUES = notesGetSortDtoArr;
        $ENTRIES = new asp(notesGetSortDtoArr);
    }

    private NotesGetSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static NotesGetSortDto valueOf(String str) {
        return (NotesGetSortDto) Enum.valueOf(NotesGetSortDto.class, str);
    }

    public static NotesGetSortDto[] values() {
        return (NotesGetSortDto[]) $VALUES.clone();
    }
}

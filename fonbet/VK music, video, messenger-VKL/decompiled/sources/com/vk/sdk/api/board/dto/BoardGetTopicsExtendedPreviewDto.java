package com.vk.sdk.api.board.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BoardGetTopicsExtendedPreviewDto.kt */
/* loaded from: classes5.dex */
public final class BoardGetTopicsExtendedPreviewDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BoardGetTopicsExtendedPreviewDto[] $VALUES;

    @pmi0("1")
    public static final BoardGetTopicsExtendedPreviewDto FIRST;

    @pmi0("2")
    public static final BoardGetTopicsExtendedPreviewDto LAST;

    @pmi0("0")
    public static final BoardGetTopicsExtendedPreviewDto NONE;
    private final int value;

    static {
        BoardGetTopicsExtendedPreviewDto boardGetTopicsExtendedPreviewDto = new BoardGetTopicsExtendedPreviewDto("FIRST", 0, 1);
        FIRST = boardGetTopicsExtendedPreviewDto;
        BoardGetTopicsExtendedPreviewDto boardGetTopicsExtendedPreviewDto2 = new BoardGetTopicsExtendedPreviewDto("LAST", 1, 2);
        LAST = boardGetTopicsExtendedPreviewDto2;
        BoardGetTopicsExtendedPreviewDto boardGetTopicsExtendedPreviewDto3 = new BoardGetTopicsExtendedPreviewDto("NONE", 2, 0);
        NONE = boardGetTopicsExtendedPreviewDto3;
        BoardGetTopicsExtendedPreviewDto[] boardGetTopicsExtendedPreviewDtoArr = {boardGetTopicsExtendedPreviewDto, boardGetTopicsExtendedPreviewDto2, boardGetTopicsExtendedPreviewDto3};
        $VALUES = boardGetTopicsExtendedPreviewDtoArr;
        $ENTRIES = new asp(boardGetTopicsExtendedPreviewDtoArr);
    }

    private BoardGetTopicsExtendedPreviewDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static BoardGetTopicsExtendedPreviewDto valueOf(String str) {
        return (BoardGetTopicsExtendedPreviewDto) Enum.valueOf(BoardGetTopicsExtendedPreviewDto.class, str);
    }

    public static BoardGetTopicsExtendedPreviewDto[] values() {
        return (BoardGetTopicsExtendedPreviewDto[]) $VALUES.clone();
    }
}

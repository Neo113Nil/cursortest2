package com.vk.sdk.api.board.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BoardGetTopicsPreviewDto.kt */
/* loaded from: classes5.dex */
public final class BoardGetTopicsPreviewDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BoardGetTopicsPreviewDto[] $VALUES;

    @pmi0("1")
    public static final BoardGetTopicsPreviewDto FIRST;

    @pmi0("2")
    public static final BoardGetTopicsPreviewDto LAST;

    @pmi0("0")
    public static final BoardGetTopicsPreviewDto NONE;
    private final int value;

    static {
        BoardGetTopicsPreviewDto boardGetTopicsPreviewDto = new BoardGetTopicsPreviewDto("FIRST", 0, 1);
        FIRST = boardGetTopicsPreviewDto;
        BoardGetTopicsPreviewDto boardGetTopicsPreviewDto2 = new BoardGetTopicsPreviewDto("LAST", 1, 2);
        LAST = boardGetTopicsPreviewDto2;
        BoardGetTopicsPreviewDto boardGetTopicsPreviewDto3 = new BoardGetTopicsPreviewDto("NONE", 2, 0);
        NONE = boardGetTopicsPreviewDto3;
        BoardGetTopicsPreviewDto[] boardGetTopicsPreviewDtoArr = {boardGetTopicsPreviewDto, boardGetTopicsPreviewDto2, boardGetTopicsPreviewDto3};
        $VALUES = boardGetTopicsPreviewDtoArr;
        $ENTRIES = new asp(boardGetTopicsPreviewDtoArr);
    }

    private BoardGetTopicsPreviewDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static BoardGetTopicsPreviewDto valueOf(String str) {
        return (BoardGetTopicsPreviewDto) Enum.valueOf(BoardGetTopicsPreviewDto.class, str);
    }

    public static BoardGetTopicsPreviewDto[] values() {
        return (BoardGetTopicsPreviewDto[]) $VALUES.clone();
    }
}

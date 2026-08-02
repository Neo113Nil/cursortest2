package com.vk.sdk.api.board.dto;

import com.ironsource.C4217a2;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BoardDefaultOrderDto.kt */
/* loaded from: classes5.dex */
public final class BoardDefaultOrderDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BoardDefaultOrderDto[] $VALUES;

    @pmi0("-2")
    public static final BoardDefaultOrderDto ASC_CREATED;

    @pmi0(C4217a2.f)
    public static final BoardDefaultOrderDto ASC_UPDATED;

    @pmi0("2")
    public static final BoardDefaultOrderDto DESC_CREATED;

    @pmi0("1")
    public static final BoardDefaultOrderDto DESC_UPDATED;
    private final int value;

    static {
        BoardDefaultOrderDto boardDefaultOrderDto = new BoardDefaultOrderDto("DESC_UPDATED", 0, 1);
        DESC_UPDATED = boardDefaultOrderDto;
        BoardDefaultOrderDto boardDefaultOrderDto2 = new BoardDefaultOrderDto("DESC_CREATED", 1, 2);
        DESC_CREATED = boardDefaultOrderDto2;
        BoardDefaultOrderDto boardDefaultOrderDto3 = new BoardDefaultOrderDto("ASC_UPDATED", 2, -1);
        ASC_UPDATED = boardDefaultOrderDto3;
        BoardDefaultOrderDto boardDefaultOrderDto4 = new BoardDefaultOrderDto("ASC_CREATED", 3, -2);
        ASC_CREATED = boardDefaultOrderDto4;
        BoardDefaultOrderDto[] boardDefaultOrderDtoArr = {boardDefaultOrderDto, boardDefaultOrderDto2, boardDefaultOrderDto3, boardDefaultOrderDto4};
        $VALUES = boardDefaultOrderDtoArr;
        $ENTRIES = new asp(boardDefaultOrderDtoArr);
    }

    private BoardDefaultOrderDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static BoardDefaultOrderDto valueOf(String str) {
        return (BoardDefaultOrderDto) Enum.valueOf(BoardDefaultOrderDto.class, str);
    }

    public static BoardDefaultOrderDto[] values() {
        return (BoardDefaultOrderDto[]) $VALUES.clone();
    }
}

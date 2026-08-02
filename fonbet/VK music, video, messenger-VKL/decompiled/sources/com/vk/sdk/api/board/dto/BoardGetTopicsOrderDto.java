package com.vk.sdk.api.board.dto;

import com.ironsource.C4217a2;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BoardGetTopicsOrderDto.kt */
/* loaded from: classes5.dex */
public final class BoardGetTopicsOrderDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BoardGetTopicsOrderDto[] $VALUES;

    @pmi0("0")
    public static final BoardGetTopicsOrderDto AS_BY_ADMINISTRATOR;

    @pmi0("-2")
    public static final BoardGetTopicsOrderDto CREATED_ASC;

    @pmi0("2")
    public static final BoardGetTopicsOrderDto CREATED_DESC;

    @pmi0(C4217a2.f)
    public static final BoardGetTopicsOrderDto UPDATED_ASC;

    @pmi0("1")
    public static final BoardGetTopicsOrderDto UPDATED_DESC;
    private final int value;

    static {
        BoardGetTopicsOrderDto boardGetTopicsOrderDto = new BoardGetTopicsOrderDto("UPDATED_DESC", 0, 1);
        UPDATED_DESC = boardGetTopicsOrderDto;
        BoardGetTopicsOrderDto boardGetTopicsOrderDto2 = new BoardGetTopicsOrderDto("CREATED_DESC", 1, 2);
        CREATED_DESC = boardGetTopicsOrderDto2;
        BoardGetTopicsOrderDto boardGetTopicsOrderDto3 = new BoardGetTopicsOrderDto("UPDATED_ASC", 2, -1);
        UPDATED_ASC = boardGetTopicsOrderDto3;
        BoardGetTopicsOrderDto boardGetTopicsOrderDto4 = new BoardGetTopicsOrderDto("CREATED_ASC", 3, -2);
        CREATED_ASC = boardGetTopicsOrderDto4;
        BoardGetTopicsOrderDto boardGetTopicsOrderDto5 = new BoardGetTopicsOrderDto("AS_BY_ADMINISTRATOR", 4, 0);
        AS_BY_ADMINISTRATOR = boardGetTopicsOrderDto5;
        BoardGetTopicsOrderDto[] boardGetTopicsOrderDtoArr = {boardGetTopicsOrderDto, boardGetTopicsOrderDto2, boardGetTopicsOrderDto3, boardGetTopicsOrderDto4, boardGetTopicsOrderDto5};
        $VALUES = boardGetTopicsOrderDtoArr;
        $ENTRIES = new asp(boardGetTopicsOrderDtoArr);
    }

    private BoardGetTopicsOrderDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static BoardGetTopicsOrderDto valueOf(String str) {
        return (BoardGetTopicsOrderDto) Enum.valueOf(BoardGetTopicsOrderDto.class, str);
    }

    public static BoardGetTopicsOrderDto[] values() {
        return (BoardGetTopicsOrderDto[]) $VALUES.clone();
    }
}

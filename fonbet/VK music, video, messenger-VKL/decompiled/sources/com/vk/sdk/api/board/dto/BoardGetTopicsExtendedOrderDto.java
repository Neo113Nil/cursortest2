package com.vk.sdk.api.board.dto;

import com.ironsource.C4217a2;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BoardGetTopicsExtendedOrderDto.kt */
/* loaded from: classes5.dex */
public final class BoardGetTopicsExtendedOrderDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BoardGetTopicsExtendedOrderDto[] $VALUES;

    @pmi0("0")
    public static final BoardGetTopicsExtendedOrderDto AS_BY_ADMINISTRATOR;

    @pmi0("-2")
    public static final BoardGetTopicsExtendedOrderDto CREATED_ASC;

    @pmi0("2")
    public static final BoardGetTopicsExtendedOrderDto CREATED_DESC;

    @pmi0(C4217a2.f)
    public static final BoardGetTopicsExtendedOrderDto UPDATED_ASC;

    @pmi0("1")
    public static final BoardGetTopicsExtendedOrderDto UPDATED_DESC;
    private final int value;

    static {
        BoardGetTopicsExtendedOrderDto boardGetTopicsExtendedOrderDto = new BoardGetTopicsExtendedOrderDto("UPDATED_DESC", 0, 1);
        UPDATED_DESC = boardGetTopicsExtendedOrderDto;
        BoardGetTopicsExtendedOrderDto boardGetTopicsExtendedOrderDto2 = new BoardGetTopicsExtendedOrderDto("CREATED_DESC", 1, 2);
        CREATED_DESC = boardGetTopicsExtendedOrderDto2;
        BoardGetTopicsExtendedOrderDto boardGetTopicsExtendedOrderDto3 = new BoardGetTopicsExtendedOrderDto("UPDATED_ASC", 2, -1);
        UPDATED_ASC = boardGetTopicsExtendedOrderDto3;
        BoardGetTopicsExtendedOrderDto boardGetTopicsExtendedOrderDto4 = new BoardGetTopicsExtendedOrderDto("CREATED_ASC", 3, -2);
        CREATED_ASC = boardGetTopicsExtendedOrderDto4;
        BoardGetTopicsExtendedOrderDto boardGetTopicsExtendedOrderDto5 = new BoardGetTopicsExtendedOrderDto("AS_BY_ADMINISTRATOR", 4, 0);
        AS_BY_ADMINISTRATOR = boardGetTopicsExtendedOrderDto5;
        BoardGetTopicsExtendedOrderDto[] boardGetTopicsExtendedOrderDtoArr = {boardGetTopicsExtendedOrderDto, boardGetTopicsExtendedOrderDto2, boardGetTopicsExtendedOrderDto3, boardGetTopicsExtendedOrderDto4, boardGetTopicsExtendedOrderDto5};
        $VALUES = boardGetTopicsExtendedOrderDtoArr;
        $ENTRIES = new asp(boardGetTopicsExtendedOrderDtoArr);
    }

    private BoardGetTopicsExtendedOrderDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static BoardGetTopicsExtendedOrderDto valueOf(String str) {
        return (BoardGetTopicsExtendedOrderDto) Enum.valueOf(BoardGetTopicsExtendedOrderDto.class, str);
    }

    public static BoardGetTopicsExtendedOrderDto[] values() {
        return (BoardGetTopicsExtendedOrderDto[]) $VALUES.clone();
    }
}

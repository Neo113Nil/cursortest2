package com.vk.sdk.api.board.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BoardGetCommentsSortDto.kt */
/* loaded from: classes5.dex */
public final class BoardGetCommentsSortDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BoardGetCommentsSortDto[] $VALUES;

    @pmi0("asc")
    public static final BoardGetCommentsSortDto CHRONOLOGICAL;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final BoardGetCommentsSortDto REVERSE_CHRONOLOGICAL;
    private final String value;

    static {
        BoardGetCommentsSortDto boardGetCommentsSortDto = new BoardGetCommentsSortDto("CHRONOLOGICAL", 0, "asc");
        CHRONOLOGICAL = boardGetCommentsSortDto;
        BoardGetCommentsSortDto boardGetCommentsSortDto2 = new BoardGetCommentsSortDto("REVERSE_CHRONOLOGICAL", 1, CampaignEx.JSON_KEY_DESC);
        REVERSE_CHRONOLOGICAL = boardGetCommentsSortDto2;
        BoardGetCommentsSortDto[] boardGetCommentsSortDtoArr = {boardGetCommentsSortDto, boardGetCommentsSortDto2};
        $VALUES = boardGetCommentsSortDtoArr;
        $ENTRIES = new asp(boardGetCommentsSortDtoArr);
    }

    private BoardGetCommentsSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static BoardGetCommentsSortDto valueOf(String str) {
        return (BoardGetCommentsSortDto) Enum.valueOf(BoardGetCommentsSortDto.class, str);
    }

    public static BoardGetCommentsSortDto[] values() {
        return (BoardGetCommentsSortDto[]) $VALUES.clone();
    }
}

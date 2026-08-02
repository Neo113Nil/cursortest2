package com.vk.api.generated.board.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BoardGetCommentsSortDto.kt */
/* loaded from: classes14.dex */
public final class BoardGetCommentsSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BoardGetCommentsSortDto[] $VALUES;

    @pmi0("asc")
    public static final BoardGetCommentsSortDto CHRONOLOGICAL;
    public static final Parcelable.Creator<BoardGetCommentsSortDto> CREATOR;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final BoardGetCommentsSortDto REVERSE_CHRONOLOGICAL;
    private final String value;

    /* compiled from: BoardGetCommentsSortDto.kt */
    public static final class a implements Parcelable.Creator<BoardGetCommentsSortDto> {
        @Override // android.os.Parcelable.Creator
        public final BoardGetCommentsSortDto createFromParcel(Parcel parcel) {
            return BoardGetCommentsSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BoardGetCommentsSortDto[] newArray(int i) {
            return new BoardGetCommentsSortDto[i];
        }
    }

    static {
        BoardGetCommentsSortDto boardGetCommentsSortDto = new BoardGetCommentsSortDto("CHRONOLOGICAL", 0, "asc");
        CHRONOLOGICAL = boardGetCommentsSortDto;
        BoardGetCommentsSortDto boardGetCommentsSortDto2 = new BoardGetCommentsSortDto("REVERSE_CHRONOLOGICAL", 1, CampaignEx.JSON_KEY_DESC);
        REVERSE_CHRONOLOGICAL = boardGetCommentsSortDto2;
        BoardGetCommentsSortDto[] boardGetCommentsSortDtoArr = {boardGetCommentsSortDto, boardGetCommentsSortDto2};
        $VALUES = boardGetCommentsSortDtoArr;
        $ENTRIES = new asp(boardGetCommentsSortDtoArr);
        CREATOR = new a();
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}

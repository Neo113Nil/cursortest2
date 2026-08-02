package com.vk.api.generated.board.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BoardGetCommentsExtendedSortDto.kt */
/* loaded from: classes14.dex */
public final class BoardGetCommentsExtendedSortDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BoardGetCommentsExtendedSortDto[] $VALUES;

    @pmi0("asc")
    public static final BoardGetCommentsExtendedSortDto CHRONOLOGICAL;
    public static final Parcelable.Creator<BoardGetCommentsExtendedSortDto> CREATOR;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final BoardGetCommentsExtendedSortDto REVERSE_CHRONOLOGICAL;
    private final String value;

    /* compiled from: BoardGetCommentsExtendedSortDto.kt */
    public static final class a implements Parcelable.Creator<BoardGetCommentsExtendedSortDto> {
        @Override // android.os.Parcelable.Creator
        public final BoardGetCommentsExtendedSortDto createFromParcel(Parcel parcel) {
            return BoardGetCommentsExtendedSortDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BoardGetCommentsExtendedSortDto[] newArray(int i) {
            return new BoardGetCommentsExtendedSortDto[i];
        }
    }

    static {
        BoardGetCommentsExtendedSortDto boardGetCommentsExtendedSortDto = new BoardGetCommentsExtendedSortDto("CHRONOLOGICAL", 0, "asc");
        CHRONOLOGICAL = boardGetCommentsExtendedSortDto;
        BoardGetCommentsExtendedSortDto boardGetCommentsExtendedSortDto2 = new BoardGetCommentsExtendedSortDto("REVERSE_CHRONOLOGICAL", 1, CampaignEx.JSON_KEY_DESC);
        REVERSE_CHRONOLOGICAL = boardGetCommentsExtendedSortDto2;
        BoardGetCommentsExtendedSortDto[] boardGetCommentsExtendedSortDtoArr = {boardGetCommentsExtendedSortDto, boardGetCommentsExtendedSortDto2};
        $VALUES = boardGetCommentsExtendedSortDtoArr;
        $ENTRIES = new asp(boardGetCommentsExtendedSortDtoArr);
        CREATOR = new a();
    }

    private BoardGetCommentsExtendedSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static BoardGetCommentsExtendedSortDto valueOf(String str) {
        return (BoardGetCommentsExtendedSortDto) Enum.valueOf(BoardGetCommentsExtendedSortDto.class, str);
    }

    public static BoardGetCommentsExtendedSortDto[] values() {
        return (BoardGetCommentsExtendedSortDto[]) $VALUES.clone();
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

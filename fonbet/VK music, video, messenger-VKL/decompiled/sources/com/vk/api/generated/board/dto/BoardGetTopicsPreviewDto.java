package com.vk.api.generated.board.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BoardGetTopicsPreviewDto.kt */
/* loaded from: classes14.dex */
public final class BoardGetTopicsPreviewDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BoardGetTopicsPreviewDto[] $VALUES;
    public static final Parcelable.Creator<BoardGetTopicsPreviewDto> CREATOR;

    @pmi0("1")
    public static final BoardGetTopicsPreviewDto FIRST;

    @pmi0("2")
    public static final BoardGetTopicsPreviewDto LAST;

    @pmi0("0")
    public static final BoardGetTopicsPreviewDto NONE;
    private final int value;

    /* compiled from: BoardGetTopicsPreviewDto.kt */
    public static final class a implements Parcelable.Creator<BoardGetTopicsPreviewDto> {
        @Override // android.os.Parcelable.Creator
        public final BoardGetTopicsPreviewDto createFromParcel(Parcel parcel) {
            return BoardGetTopicsPreviewDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BoardGetTopicsPreviewDto[] newArray(int i) {
            return new BoardGetTopicsPreviewDto[i];
        }
    }

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
        CREATOR = new a();
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}

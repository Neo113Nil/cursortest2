package com.vk.api.generated.board.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BoardGetTopicsExtendedPreviewDto.kt */
/* loaded from: classes14.dex */
public final class BoardGetTopicsExtendedPreviewDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BoardGetTopicsExtendedPreviewDto[] $VALUES;
    public static final Parcelable.Creator<BoardGetTopicsExtendedPreviewDto> CREATOR;

    @pmi0("1")
    public static final BoardGetTopicsExtendedPreviewDto FIRST;

    @pmi0("2")
    public static final BoardGetTopicsExtendedPreviewDto LAST;

    @pmi0("0")
    public static final BoardGetTopicsExtendedPreviewDto NONE;
    private final int value;

    /* compiled from: BoardGetTopicsExtendedPreviewDto.kt */
    public static final class a implements Parcelable.Creator<BoardGetTopicsExtendedPreviewDto> {
        @Override // android.os.Parcelable.Creator
        public final BoardGetTopicsExtendedPreviewDto createFromParcel(Parcel parcel) {
            return BoardGetTopicsExtendedPreviewDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BoardGetTopicsExtendedPreviewDto[] newArray(int i) {
            return new BoardGetTopicsExtendedPreviewDto[i];
        }
    }

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
        CREATOR = new a();
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}

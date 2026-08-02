package com.vk.api.generated.board.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BoardDefaultOrderDto.kt */
/* loaded from: classes14.dex */
public final class BoardDefaultOrderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BoardDefaultOrderDto[] $VALUES;

    @pmi0("-2")
    public static final BoardDefaultOrderDto ASC_CREATED;

    @pmi0(C4217a2.f)
    public static final BoardDefaultOrderDto ASC_UPDATED;
    public static final Parcelable.Creator<BoardDefaultOrderDto> CREATOR;

    @pmi0("2")
    public static final BoardDefaultOrderDto DESC_CREATED;

    @pmi0("1")
    public static final BoardDefaultOrderDto DESC_UPDATED;
    private final int value;

    /* compiled from: BoardDefaultOrderDto.kt */
    public static final class a implements Parcelable.Creator<BoardDefaultOrderDto> {
        @Override // android.os.Parcelable.Creator
        public final BoardDefaultOrderDto createFromParcel(Parcel parcel) {
            return BoardDefaultOrderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BoardDefaultOrderDto[] newArray(int i) {
            return new BoardDefaultOrderDto[i];
        }
    }

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
        CREATOR = new a();
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

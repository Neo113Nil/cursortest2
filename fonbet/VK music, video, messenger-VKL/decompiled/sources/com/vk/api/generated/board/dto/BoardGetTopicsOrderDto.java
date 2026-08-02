package com.vk.api.generated.board.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BoardGetTopicsOrderDto.kt */
/* loaded from: classes14.dex */
public final class BoardGetTopicsOrderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BoardGetTopicsOrderDto[] $VALUES;

    @pmi0("0")
    public static final BoardGetTopicsOrderDto AS_BY_ADMINISTRATOR;

    @pmi0("-2")
    public static final BoardGetTopicsOrderDto CREATED_ASC;

    @pmi0("2")
    public static final BoardGetTopicsOrderDto CREATED_DESC;
    public static final Parcelable.Creator<BoardGetTopicsOrderDto> CREATOR;

    @pmi0(C4217a2.f)
    public static final BoardGetTopicsOrderDto UPDATED_ASC;

    @pmi0("1")
    public static final BoardGetTopicsOrderDto UPDATED_DESC;
    private final int value;

    /* compiled from: BoardGetTopicsOrderDto.kt */
    public static final class a implements Parcelable.Creator<BoardGetTopicsOrderDto> {
        @Override // android.os.Parcelable.Creator
        public final BoardGetTopicsOrderDto createFromParcel(Parcel parcel) {
            return BoardGetTopicsOrderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BoardGetTopicsOrderDto[] newArray(int i) {
            return new BoardGetTopicsOrderDto[i];
        }
    }

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
        CREATOR = new a();
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}

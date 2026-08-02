package com.vk.api.generated.board.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;

/* compiled from: BoardGetTopicsResponseDto.kt */
/* loaded from: classes14.dex */
public final class BoardGetTopicsResponseDto implements Parcelable {
    public static final Parcelable.Creator<BoardGetTopicsResponseDto> CREATOR = new a();

    @pmi0("can_add_topics")
    private final BaseBoolIntDto canAddTopics;

    @pmi0("count")
    private final int count;

    @pmi0("default_order")
    private final BoardDefaultOrderDto defaultOrder;

    @pmi0("items")
    private final List<BoardTopicDto> items;

    /* compiled from: BoardGetTopicsResponseDto.kt */
    public static final class a implements Parcelable.Creator<BoardGetTopicsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final BoardGetTopicsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(BoardTopicDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new BoardGetTopicsResponseDto(readInt, arrayList, BoardDefaultOrderDto.CREATOR.createFromParcel(parcel), (BaseBoolIntDto) parcel.readParcelable(BoardGetTopicsResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BoardGetTopicsResponseDto[] newArray(int i) {
            return new BoardGetTopicsResponseDto[i];
        }
    }

    public BoardGetTopicsResponseDto(int i, List<BoardTopicDto> list, BoardDefaultOrderDto boardDefaultOrderDto, BaseBoolIntDto baseBoolIntDto) {
        this.count = i;
        this.items = list;
        this.defaultOrder = boardDefaultOrderDto;
        this.canAddTopics = baseBoolIntDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardGetTopicsResponseDto)) {
            return false;
        }
        BoardGetTopicsResponseDto boardGetTopicsResponseDto = (BoardGetTopicsResponseDto) obj;
        return this.count == boardGetTopicsResponseDto.count && epx.f(this.items, boardGetTopicsResponseDto.items) && this.defaultOrder == boardGetTopicsResponseDto.defaultOrder && this.canAddTopics == boardGetTopicsResponseDto.canAddTopics;
    }

    public final int hashCode() {
        return this.canAddTopics.hashCode() + ((this.defaultOrder.hashCode() + fw3.a(Integer.hashCode(this.count) * 31, 31, this.items)) * 31);
    }

    public final String toString() {
        return "BoardGetTopicsResponseDto(count=" + this.count + ", items=" + this.items + ", defaultOrder=" + this.defaultOrder + ", canAddTopics=" + this.canAddTopics + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((BoardTopicDto) a2.next()).writeToParcel(parcel, i);
        }
        this.defaultOrder.writeToParcel(parcel, i);
        parcel.writeParcelable(this.canAddTopics, i);
    }
}

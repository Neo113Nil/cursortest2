package com.vk.api.generated.board.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.polls.dto.PollsPollDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: BoardGetCommentsResponseDto.kt */
/* loaded from: classes14.dex */
public final class BoardGetCommentsResponseDto implements Parcelable {
    public static final Parcelable.Creator<BoardGetCommentsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<BoardTopicCommentDto> items;

    @pmi0("poll")
    private final PollsPollDto poll;

    @pmi0("real_offset")
    private final Integer realOffset;

    /* compiled from: BoardGetCommentsResponseDto.kt */
    public static final class a implements Parcelable.Creator<BoardGetCommentsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final BoardGetCommentsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(BoardTopicCommentDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new BoardGetCommentsResponseDto(readInt, arrayList, (PollsPollDto) parcel.readParcelable(BoardGetCommentsResponseDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final BoardGetCommentsResponseDto[] newArray(int i) {
            return new BoardGetCommentsResponseDto[i];
        }
    }

    public BoardGetCommentsResponseDto(int i, List<BoardTopicCommentDto> list, PollsPollDto pollsPollDto, Integer num) {
        this.count = i;
        this.items = list;
        this.poll = pollsPollDto;
        this.realOffset = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardGetCommentsResponseDto)) {
            return false;
        }
        BoardGetCommentsResponseDto boardGetCommentsResponseDto = (BoardGetCommentsResponseDto) obj;
        return this.count == boardGetCommentsResponseDto.count && epx.f(this.items, boardGetCommentsResponseDto.items) && epx.f(this.poll, boardGetCommentsResponseDto.poll) && epx.f(this.realOffset, boardGetCommentsResponseDto.realOffset);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        PollsPollDto pollsPollDto = this.poll;
        int hashCode = (a2 + (pollsPollDto == null ? 0 : pollsPollDto.hashCode())) * 31;
        Integer num = this.realOffset;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoardGetCommentsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", poll=");
        sb.append(this.poll);
        sb.append(", realOffset=");
        return uqi.b(sb, this.realOffset, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((BoardTopicCommentDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.poll, i);
        Integer num = this.realOffset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ BoardGetCommentsResponseDto(int i, List list, PollsPollDto pollsPollDto, Integer num, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : pollsPollDto, (i2 & 8) != 0 ? null : num);
    }
}

package com.vk.api.generated.board.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.polls.dto.PollsPollDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: BoardGetCommentsExtendedResponseDto.kt */
/* loaded from: classes14.dex */
public final class BoardGetCommentsExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<BoardGetCommentsExtendedResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<BoardTopicCommentDto> items;

    @pmi0("poll")
    private final PollsPollDto poll;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("real_offset")
    private final Integer realOffset;

    /* compiled from: BoardGetCommentsExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<BoardGetCommentsExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final BoardGetCommentsExtendedResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(BoardTopicCommentDto.CREATOR, parcel, arrayList, i, 1);
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            int i2 = 0;
            while (i2 != readInt3) {
                i2 = bo.b(BoardGetCommentsExtendedResponseDto.class, parcel, arrayList2, i2, 1);
            }
            int readInt4 = parcel.readInt();
            int i3 = 0;
            ArrayList arrayList3 = new ArrayList(readInt4);
            while (i3 != readInt4) {
                i3 = bo.b(BoardGetCommentsExtendedResponseDto.class, parcel, arrayList3, i3, 1);
            }
            return new BoardGetCommentsExtendedResponseDto(readInt, arrayList, arrayList2, arrayList3, (PollsPollDto) parcel.readParcelable(BoardGetCommentsExtendedResponseDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final BoardGetCommentsExtendedResponseDto[] newArray(int i) {
            return new BoardGetCommentsExtendedResponseDto[i];
        }
    }

    public BoardGetCommentsExtendedResponseDto(int i, List<BoardTopicCommentDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, PollsPollDto pollsPollDto, Integer num) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
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
        if (!(obj instanceof BoardGetCommentsExtendedResponseDto)) {
            return false;
        }
        BoardGetCommentsExtendedResponseDto boardGetCommentsExtendedResponseDto = (BoardGetCommentsExtendedResponseDto) obj;
        return this.count == boardGetCommentsExtendedResponseDto.count && epx.f(this.items, boardGetCommentsExtendedResponseDto.items) && epx.f(this.profiles, boardGetCommentsExtendedResponseDto.profiles) && epx.f(this.groups, boardGetCommentsExtendedResponseDto.groups) && epx.f(this.poll, boardGetCommentsExtendedResponseDto.poll) && epx.f(this.realOffset, boardGetCommentsExtendedResponseDto.realOffset);
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.profiles), 31, this.groups);
        PollsPollDto pollsPollDto = this.poll;
        int hashCode = (a2 + (pollsPollDto == null ? 0 : pollsPollDto.hashCode())) * 31;
        Integer num = this.realOffset;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoardGetCommentsExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
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
        Iterator a3 = ao.a(parcel, this.profiles);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        Iterator a4 = ao.a(parcel, this.groups);
        while (a4.hasNext()) {
            parcel.writeParcelable((Parcelable) a4.next(), i);
        }
        parcel.writeParcelable(this.poll, i);
        Integer num = this.realOffset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ BoardGetCommentsExtendedResponseDto(int i, List list, List list2, List list3, PollsPollDto pollsPollDto, Integer num, int i2, zcl zclVar) {
        this(i, list, list2, list3, (i2 & 16) != 0 ? null : pollsPollDto, (i2 & 32) != 0 ? null : num);
    }
}

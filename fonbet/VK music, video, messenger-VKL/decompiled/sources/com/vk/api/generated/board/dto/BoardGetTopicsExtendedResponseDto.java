package com.vk.api.generated.board.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.wp;

/* compiled from: BoardGetTopicsExtendedResponseDto.kt */
/* loaded from: classes14.dex */
public final class BoardGetTopicsExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<BoardGetTopicsExtendedResponseDto> CREATOR = new a();

    @pmi0("can_add_topics")
    private final BaseBoolIntDto canAddTopics;

    @pmi0("count")
    private final int count;

    @pmi0("default_order")
    private final BoardDefaultOrderDto defaultOrder;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<BoardTopicDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: BoardGetTopicsExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<BoardGetTopicsExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final BoardGetTopicsExtendedResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(BoardTopicDto.CREATOR, parcel, arrayList, i2, 1);
            }
            BoardDefaultOrderDto createFromParcel = BoardDefaultOrderDto.CREATOR.createFromParcel(parcel);
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(BoardGetTopicsExtendedResponseDto.class.getClassLoader());
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            int i3 = 0;
            while (i3 != readInt3) {
                i3 = bo.b(BoardGetTopicsExtendedResponseDto.class, parcel, arrayList2, i3, 1);
            }
            int readInt4 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt4);
            while (i != readInt4) {
                i = bo.b(BoardGetTopicsExtendedResponseDto.class, parcel, arrayList3, i, 1);
            }
            return new BoardGetTopicsExtendedResponseDto(readInt, arrayList, createFromParcel, baseBoolIntDto, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final BoardGetTopicsExtendedResponseDto[] newArray(int i) {
            return new BoardGetTopicsExtendedResponseDto[i];
        }
    }

    public BoardGetTopicsExtendedResponseDto(int i, List<BoardTopicDto> list, BoardDefaultOrderDto boardDefaultOrderDto, BaseBoolIntDto baseBoolIntDto, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.count = i;
        this.items = list;
        this.defaultOrder = boardDefaultOrderDto;
        this.canAddTopics = baseBoolIntDto;
        this.profiles = list2;
        this.groups = list3;
    }

    public final BaseBoolIntDto d() {
        return this.canAddTopics;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BoardDefaultOrderDto e() {
        return this.defaultOrder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoardGetTopicsExtendedResponseDto)) {
            return false;
        }
        BoardGetTopicsExtendedResponseDto boardGetTopicsExtendedResponseDto = (BoardGetTopicsExtendedResponseDto) obj;
        return this.count == boardGetTopicsExtendedResponseDto.count && epx.f(this.items, boardGetTopicsExtendedResponseDto.items) && this.defaultOrder == boardGetTopicsExtendedResponseDto.defaultOrder && this.canAddTopics == boardGetTopicsExtendedResponseDto.canAddTopics && epx.f(this.profiles, boardGetTopicsExtendedResponseDto.profiles) && epx.f(this.groups, boardGetTopicsExtendedResponseDto.groups);
    }

    public final List<GroupsGroupFullDto> f() {
        return this.groups;
    }

    public final List<BoardTopicDto> g() {
        return this.items;
    }

    public final int hashCode() {
        return this.groups.hashCode() + fw3.a(wp.b(this.canAddTopics, (this.defaultOrder.hashCode() + fw3.a(Integer.hashCode(this.count) * 31, 31, this.items)) * 31, 31), 31, this.profiles);
    }

    public final List<UsersUserFullDto> i() {
        return this.profiles;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoardGetTopicsExtendedResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", defaultOrder=");
        sb.append(this.defaultOrder);
        sb.append(", canAddTopics=");
        sb.append(this.canAddTopics);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
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
        Iterator a3 = ao.a(parcel, this.profiles);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        Iterator a4 = ao.a(parcel, this.groups);
        while (a4.hasNext()) {
            parcel.writeParcelable((Parcelable) a4.next(), i);
        }
    }
}

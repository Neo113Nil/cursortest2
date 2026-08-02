package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.messages.dto.MessagesConversationWithMessageDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SpacesCreateRoomResponseDto.kt */
/* loaded from: classes15.dex */
public final class SpacesCreateRoomResponseDto implements Parcelable {
    public static final Parcelable.Creator<SpacesCreateRoomResponseDto> CREATOR = new a();

    @pmi0("calls")
    private final List<SpacesCallDataDto> calls;

    @pmi0("conversations")
    private final List<MessagesConversationWithMessageDto> conversations;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0(SignalingProtocol.KEY_ROOM)
    private final SpacesRoomDto room;

    @pmi0("tribunes")
    private final List<SpacesTribuneDataDto> tribunes;

    /* compiled from: SpacesCreateRoomResponseDto.kt */
    public static final class a implements Parcelable.Creator<SpacesCreateRoomResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesCreateRoomResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            SpacesRoomDto createFromParcel = SpacesRoomDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            ArrayList arrayList5 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(MessagesConversationWithMessageDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(SpacesCallDataDto.CREATOR, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = en.a(SpacesTribuneDataDto.CREATOR, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = bo.b(SpacesCreateRoomResponseDto.class, parcel, arrayList4, i5, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                while (i != readInt5) {
                    i = bo.b(SpacesCreateRoomResponseDto.class, parcel, arrayList5, i, 1);
                }
            }
            return new SpacesCreateRoomResponseDto(createFromParcel, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesCreateRoomResponseDto[] newArray(int i) {
            return new SpacesCreateRoomResponseDto[i];
        }
    }

    public SpacesCreateRoomResponseDto(SpacesRoomDto spacesRoomDto, List<MessagesConversationWithMessageDto> list, List<SpacesCallDataDto> list2, List<SpacesTribuneDataDto> list3, List<GroupsGroupFullDto> list4, List<UsersUserFullDto> list5) {
        this.room = spacesRoomDto;
        this.conversations = list;
        this.calls = list2;
        this.tribunes = list3;
        this.groups = list4;
        this.profiles = list5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesCreateRoomResponseDto)) {
            return false;
        }
        SpacesCreateRoomResponseDto spacesCreateRoomResponseDto = (SpacesCreateRoomResponseDto) obj;
        return epx.f(this.room, spacesCreateRoomResponseDto.room) && epx.f(this.conversations, spacesCreateRoomResponseDto.conversations) && epx.f(this.calls, spacesCreateRoomResponseDto.calls) && epx.f(this.tribunes, spacesCreateRoomResponseDto.tribunes) && epx.f(this.groups, spacesCreateRoomResponseDto.groups) && epx.f(this.profiles, spacesCreateRoomResponseDto.profiles);
    }

    public final int hashCode() {
        int hashCode = this.room.hashCode() * 31;
        List<MessagesConversationWithMessageDto> list = this.conversations;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<SpacesCallDataDto> list2 = this.calls;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<SpacesTribuneDataDto> list3 = this.tribunes;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<GroupsGroupFullDto> list4 = this.groups;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<UsersUserFullDto> list5 = this.profiles;
        return hashCode5 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesCreateRoomResponseDto(room=");
        sb.append(this.room);
        sb.append(", conversations=");
        sb.append(this.conversations);
        sb.append(", calls=");
        sb.append(this.calls);
        sb.append(", tribunes=");
        sb.append(this.tribunes);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.room.writeToParcel(parcel, i);
        List<MessagesConversationWithMessageDto> list = this.conversations;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MessagesConversationWithMessageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<SpacesCallDataDto> list2 = this.calls;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((SpacesCallDataDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<SpacesTribuneDataDto> list3 = this.tribunes;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((SpacesTribuneDataDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        List<GroupsGroupFullDto> list4 = this.groups;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                parcel.writeParcelable((Parcelable) f4.next(), i);
            }
        }
        List<UsersUserFullDto> list5 = this.profiles;
        if (list5 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f5 = dn.f(parcel, list5, 1);
        while (f5.hasNext()) {
            parcel.writeParcelable((Parcelable) f5.next(), i);
        }
    }

    public /* synthetic */ SpacesCreateRoomResponseDto(SpacesRoomDto spacesRoomDto, List list, List list2, List list3, List list4, List list5, int i, zcl zclVar) {
        this(spacesRoomDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4, (i & 32) != 0 ? null : list5);
    }
}

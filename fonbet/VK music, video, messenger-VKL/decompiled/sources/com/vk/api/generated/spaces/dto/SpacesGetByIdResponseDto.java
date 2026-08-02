package com.vk.api.generated.spaces.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.messages.dto.MessagesConversationWithMessageDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SpacesGetByIdResponseDto.kt */
/* loaded from: classes15.dex */
public final class SpacesGetByIdResponseDto implements Parcelable {
    public static final Parcelable.Creator<SpacesGetByIdResponseDto> CREATOR = new a();

    @pmi0("calls")
    private final List<SpacesCallDataDto> calls;

    @pmi0("conversations")
    private final List<MessagesConversationWithMessageDto> conversations;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<SpacesSpaceFullDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("tribunes")
    private final List<SpacesTribuneDataDto> tribunes;

    /* compiled from: SpacesGetByIdResponseDto.kt */
    public static final class a implements Parcelable.Creator<SpacesGetByIdResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesGetByIdResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            int readInt = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(SpacesSpaceFullDto.CREATOR, parcel, arrayList5, i2, 1);
            }
            ArrayList arrayList6 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(MessagesConversationWithMessageDto.CREATOR, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = en.a(SpacesCallDataDto.CREATOR, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList3 = new ArrayList(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = en.a(SpacesTribuneDataDto.CREATOR, parcel, arrayList3, i5, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList4 = new ArrayList(readInt5);
                int i6 = 0;
                while (i6 != readInt5) {
                    i6 = bo.b(SpacesGetByIdResponseDto.class, parcel, arrayList4, i6, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                arrayList6 = new ArrayList(readInt6);
                while (i != readInt6) {
                    i = bo.b(SpacesGetByIdResponseDto.class, parcel, arrayList6, i, 1);
                }
            }
            return new SpacesGetByIdResponseDto(arrayList5, arrayList, arrayList2, arrayList3, arrayList4, arrayList6);
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesGetByIdResponseDto[] newArray(int i) {
            return new SpacesGetByIdResponseDto[i];
        }
    }

    public SpacesGetByIdResponseDto(List<SpacesSpaceFullDto> list, List<MessagesConversationWithMessageDto> list2, List<SpacesCallDataDto> list3, List<SpacesTribuneDataDto> list4, List<GroupsGroupFullDto> list5, List<UsersUserFullDto> list6) {
        this.items = list;
        this.conversations = list2;
        this.calls = list3;
        this.tribunes = list4;
        this.groups = list5;
        this.profiles = list6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesGetByIdResponseDto)) {
            return false;
        }
        SpacesGetByIdResponseDto spacesGetByIdResponseDto = (SpacesGetByIdResponseDto) obj;
        return epx.f(this.items, spacesGetByIdResponseDto.items) && epx.f(this.conversations, spacesGetByIdResponseDto.conversations) && epx.f(this.calls, spacesGetByIdResponseDto.calls) && epx.f(this.tribunes, spacesGetByIdResponseDto.tribunes) && epx.f(this.groups, spacesGetByIdResponseDto.groups) && epx.f(this.profiles, spacesGetByIdResponseDto.profiles);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
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
        StringBuilder sb = new StringBuilder("SpacesGetByIdResponseDto(items=");
        sb.append(this.items);
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
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((SpacesSpaceFullDto) a2.next()).writeToParcel(parcel, i);
        }
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

    public /* synthetic */ SpacesGetByIdResponseDto(List list, List list2, List list3, List list4, List list5, List list6, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5, (i & 32) != 0 ? null : list6);
    }
}

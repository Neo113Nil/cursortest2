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
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;

/* compiled from: SpacesGetLongPollHistoryResponseDto.kt */
/* loaded from: classes15.dex */
public final class SpacesGetLongPollHistoryResponseDto implements Parcelable {
    public static final Parcelable.Creator<SpacesGetLongPollHistoryResponseDto> CREATOR = new a();

    @pmi0("calls")
    private final List<SpacesCallDataDto> calls;

    @pmi0("conversations")
    private final List<MessagesConversationWithMessageDto> conversations;

    @pmi0("credentials")
    private final SpacesLongpollCredentialsDto credentials;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("has_more")
    private final boolean hasMore;

    @pmi0("history")
    private final List<List<String>> history;

    @pmi0("new_ts")
    private final int newTs;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("spaces")
    private final List<SpacesSpaceFullDto> spaces;

    @pmi0("tribunes")
    private final List<SpacesTribuneDataDto> tribunes;

    /* compiled from: SpacesGetLongPollHistoryResponseDto.kt */
    public static final class a implements Parcelable.Creator<SpacesGetLongPollHistoryResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SpacesGetLongPollHistoryResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            SpacesLongpollCredentialsDto createFromParcel = SpacesLongpollCredentialsDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            int i = 0;
            boolean z = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList6.add(parcel.createStringArrayList());
            }
            ArrayList arrayList7 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(SpacesSpaceFullDto.CREATOR, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                arrayList2 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = en.a(MessagesConversationWithMessageDto.CREATOR, parcel, arrayList2, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList3 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = en.a(SpacesCallDataDto.CREATOR, parcel, arrayList3, i5, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList4 = new ArrayList(readInt6);
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = en.a(SpacesTribuneDataDto.CREATOR, parcel, arrayList4, i6, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList5 = new ArrayList(readInt7);
                int i7 = 0;
                while (i7 != readInt7) {
                    i7 = bo.b(SpacesGetLongPollHistoryResponseDto.class, parcel, arrayList5, i7, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt8 = parcel.readInt();
                arrayList7 = new ArrayList(readInt8);
                while (i != readInt8) {
                    i = bo.b(SpacesGetLongPollHistoryResponseDto.class, parcel, arrayList7, i, 1);
                }
            }
            return new SpacesGetLongPollHistoryResponseDto(createFromParcel, readInt, z, arrayList6, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList7);
        }

        @Override // android.os.Parcelable.Creator
        public final SpacesGetLongPollHistoryResponseDto[] newArray(int i) {
            return new SpacesGetLongPollHistoryResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SpacesGetLongPollHistoryResponseDto(SpacesLongpollCredentialsDto spacesLongpollCredentialsDto, int i, boolean z, List<? extends List<String>> list, List<SpacesSpaceFullDto> list2, List<MessagesConversationWithMessageDto> list3, List<SpacesCallDataDto> list4, List<SpacesTribuneDataDto> list5, List<GroupsGroupFullDto> list6, List<UsersUserFullDto> list7) {
        this.credentials = spacesLongpollCredentialsDto;
        this.newTs = i;
        this.hasMore = z;
        this.history = list;
        this.spaces = list2;
        this.conversations = list3;
        this.calls = list4;
        this.tribunes = list5;
        this.groups = list6;
        this.profiles = list7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpacesGetLongPollHistoryResponseDto)) {
            return false;
        }
        SpacesGetLongPollHistoryResponseDto spacesGetLongPollHistoryResponseDto = (SpacesGetLongPollHistoryResponseDto) obj;
        return epx.f(this.credentials, spacesGetLongPollHistoryResponseDto.credentials) && this.newTs == spacesGetLongPollHistoryResponseDto.newTs && this.hasMore == spacesGetLongPollHistoryResponseDto.hasMore && epx.f(this.history, spacesGetLongPollHistoryResponseDto.history) && epx.f(this.spaces, spacesGetLongPollHistoryResponseDto.spaces) && epx.f(this.conversations, spacesGetLongPollHistoryResponseDto.conversations) && epx.f(this.calls, spacesGetLongPollHistoryResponseDto.calls) && epx.f(this.tribunes, spacesGetLongPollHistoryResponseDto.tribunes) && epx.f(this.groups, spacesGetLongPollHistoryResponseDto.groups) && epx.f(this.profiles, spacesGetLongPollHistoryResponseDto.profiles);
    }

    public final int hashCode() {
        int a2 = fw3.a(qoy.b(shy.a(this.newTs, this.credentials.hashCode() * 31, 31), 31, this.hasMore), 31, this.history);
        List<SpacesSpaceFullDto> list = this.spaces;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<MessagesConversationWithMessageDto> list2 = this.conversations;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<SpacesCallDataDto> list3 = this.calls;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<SpacesTribuneDataDto> list4 = this.tribunes;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<GroupsGroupFullDto> list5 = this.groups;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<UsersUserFullDto> list6 = this.profiles;
        return hashCode5 + (list6 != null ? list6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpacesGetLongPollHistoryResponseDto(credentials=");
        sb.append(this.credentials);
        sb.append(", newTs=");
        sb.append(this.newTs);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", history=");
        sb.append(this.history);
        sb.append(", spaces=");
        sb.append(this.spaces);
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
        this.credentials.writeToParcel(parcel, i);
        parcel.writeInt(this.newTs);
        parcel.writeInt(this.hasMore ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.history);
        while (a2.hasNext()) {
            parcel.writeStringList((List) a2.next());
        }
        List<SpacesSpaceFullDto> list = this.spaces;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((SpacesSpaceFullDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<MessagesConversationWithMessageDto> list2 = this.conversations;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MessagesConversationWithMessageDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<SpacesCallDataDto> list3 = this.calls;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((SpacesCallDataDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        List<SpacesTribuneDataDto> list4 = this.tribunes;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((SpacesTribuneDataDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        List<GroupsGroupFullDto> list5 = this.groups;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                parcel.writeParcelable((Parcelable) f5.next(), i);
            }
        }
        List<UsersUserFullDto> list6 = this.profiles;
        if (list6 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f6 = dn.f(parcel, list6, 1);
        while (f6.hasNext()) {
            parcel.writeParcelable((Parcelable) f6.next(), i);
        }
    }

    public /* synthetic */ SpacesGetLongPollHistoryResponseDto(SpacesLongpollCredentialsDto spacesLongpollCredentialsDto, int i, boolean z, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i2, zcl zclVar) {
        this(spacesLongpollCredentialsDto, i, z, list, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? null : list3, (i2 & 64) != 0 ? null : list4, (i2 & 128) != 0 ? null : list5, (i2 & 256) != 0 ? null : list6, (i2 & 512) != 0 ? null : list7);
    }
}

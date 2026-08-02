package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesGetRankedSharingPeersResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetRankedSharingPeersResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetRankedSharingPeersResponseDto> CREATOR = new a();

    @pmi0("all")
    private final List<UserId> all;

    @pmi0("channel_message")
    private final List<UserId> channelMessage;

    @pmi0("clip")
    private final List<UserId> clip;

    @pmi0("wall")
    private final List<UserId> wall;

    /* compiled from: MessagesGetRankedSharingPeersResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetRankedSharingPeersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetRankedSharingPeersResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int i = 0;
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(MessagesGetRankedSharingPeersResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(MessagesGetRankedSharingPeersResponseDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = bo.b(MessagesGetRankedSharingPeersResponseDto.class, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = bo.b(MessagesGetRankedSharingPeersResponseDto.class, parcel, arrayList4, i, 1);
                }
            }
            return new MessagesGetRankedSharingPeersResponseDto(arrayList, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetRankedSharingPeersResponseDto[] newArray(int i) {
            return new MessagesGetRankedSharingPeersResponseDto[i];
        }
    }

    public MessagesGetRankedSharingPeersResponseDto() {
        this(null, null, null, null, 15, null);
    }

    public final List<UserId> d() {
        return this.all;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<UserId> e() {
        return this.channelMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetRankedSharingPeersResponseDto)) {
            return false;
        }
        MessagesGetRankedSharingPeersResponseDto messagesGetRankedSharingPeersResponseDto = (MessagesGetRankedSharingPeersResponseDto) obj;
        return epx.f(this.wall, messagesGetRankedSharingPeersResponseDto.wall) && epx.f(this.channelMessage, messagesGetRankedSharingPeersResponseDto.channelMessage) && epx.f(this.clip, messagesGetRankedSharingPeersResponseDto.clip) && epx.f(this.all, messagesGetRankedSharingPeersResponseDto.all);
    }

    public final List<UserId> f() {
        return this.clip;
    }

    public final List<UserId> g() {
        return this.wall;
    }

    public final int hashCode() {
        List<UserId> list = this.wall;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UserId> list2 = this.channelMessage;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UserId> list3 = this.clip;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<UserId> list4 = this.all;
        return hashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetRankedSharingPeersResponseDto(wall=");
        sb.append(this.wall);
        sb.append(", channelMessage=");
        sb.append(this.channelMessage);
        sb.append(", clip=");
        sb.append(this.clip);
        sb.append(", all=");
        return ms9.a(')', sb, this.all);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<UserId> list = this.wall;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<UserId> list2 = this.channelMessage;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<UserId> list3 = this.clip;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        List<UserId> list4 = this.all;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f4 = dn.f(parcel, list4, 1);
        while (f4.hasNext()) {
            parcel.writeParcelable((Parcelable) f4.next(), i);
        }
    }

    public MessagesGetRankedSharingPeersResponseDto(List<UserId> list, List<UserId> list2, List<UserId> list3, List<UserId> list4) {
        this.wall = list;
        this.channelMessage = list2;
        this.clip = list3;
        this.all = list4;
    }

    public /* synthetic */ MessagesGetRankedSharingPeersResponseDto(List list, List list2, List list3, List list4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }
}

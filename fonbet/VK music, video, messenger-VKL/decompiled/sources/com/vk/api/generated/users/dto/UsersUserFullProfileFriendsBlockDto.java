package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UsersUserFullProfileFriendsBlockDto.kt */
/* loaded from: classes15.dex */
public final class UsersUserFullProfileFriendsBlockDto implements Parcelable {
    public static final Parcelable.Creator<UsersUserFullProfileFriendsBlockDto> CREATOR = new a();

    @pmi0("friends")
    private final List<UsersUserFullDto> friends;

    @pmi0(SignalingProtocol.KEY_OFFSET)
    private final Integer offset;

    /* compiled from: UsersUserFullProfileFriendsBlockDto.kt */
    public static final class a implements Parcelable.Creator<UsersUserFullProfileFriendsBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersUserFullProfileFriendsBlockDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(UsersUserFullProfileFriendsBlockDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new UsersUserFullProfileFriendsBlockDto(valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UsersUserFullProfileFriendsBlockDto[] newArray(int i) {
            return new UsersUserFullProfileFriendsBlockDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UsersUserFullProfileFriendsBlockDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final List<UsersUserFullDto> d() {
        return this.friends;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.offset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserFullProfileFriendsBlockDto)) {
            return false;
        }
        UsersUserFullProfileFriendsBlockDto usersUserFullProfileFriendsBlockDto = (UsersUserFullProfileFriendsBlockDto) obj;
        return epx.f(this.offset, usersUserFullProfileFriendsBlockDto.offset) && epx.f(this.friends, usersUserFullProfileFriendsBlockDto.friends);
    }

    public final int hashCode() {
        Integer num = this.offset;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<UsersUserFullDto> list = this.friends;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersUserFullProfileFriendsBlockDto(offset=");
        sb.append(this.offset);
        sb.append(", friends=");
        return ms9.a(')', sb, this.friends);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.offset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<UsersUserFullDto> list = this.friends;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public UsersUserFullProfileFriendsBlockDto(Integer num, List<UsersUserFullDto> list) {
        this.offset = num;
        this.friends = list;
    }

    public /* synthetic */ UsersUserFullProfileFriendsBlockDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}

package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseUserIdDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedItemFriendFriendsDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemFriendFriendsDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemFriendFriendsDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<BaseUserIdDto> items;

    /* compiled from: NewsfeedItemFriendFriendsDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemFriendFriendsDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemFriendFriendsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BaseUserIdDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new NewsfeedItemFriendFriendsDto(valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemFriendFriendsDto[] newArray(int i) {
            return new NewsfeedItemFriendFriendsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedItemFriendFriendsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemFriendFriendsDto)) {
            return false;
        }
        NewsfeedItemFriendFriendsDto newsfeedItemFriendFriendsDto = (NewsfeedItemFriendFriendsDto) obj;
        return epx.f(this.count, newsfeedItemFriendFriendsDto.count) && epx.f(this.items, newsfeedItemFriendFriendsDto.items);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<BaseUserIdDto> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemFriendFriendsDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<BaseUserIdDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((BaseUserIdDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public NewsfeedItemFriendFriendsDto(Integer num, List<BaseUserIdDto> list) {
        this.count = num;
        this.items = list;
    }

    public /* synthetic */ NewsfeedItemFriendFriendsDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}

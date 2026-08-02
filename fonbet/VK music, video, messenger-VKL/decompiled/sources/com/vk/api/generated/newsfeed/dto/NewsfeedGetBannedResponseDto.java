package com.vk.api.generated.newsfeed.dto;

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
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedGetBannedResponseDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetBannedResponseDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedGetBannedResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<UserId> groups;

    @pmi0("members")
    private final List<UserId> members;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("total_count")
    private final Integer totalCount;

    /* compiled from: NewsfeedGetBannedResponseDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetBannedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBannedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2 = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(NewsfeedGetBannedResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(NewsfeedGetBannedResponseDto.class, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new NewsfeedGetBannedResponseDto(valueOf, readString, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetBannedResponseDto[] newArray(int i) {
            return new NewsfeedGetBannedResponseDto[i];
        }
    }

    public NewsfeedGetBannedResponseDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetBannedResponseDto)) {
            return false;
        }
        NewsfeedGetBannedResponseDto newsfeedGetBannedResponseDto = (NewsfeedGetBannedResponseDto) obj;
        return epx.f(this.totalCount, newsfeedGetBannedResponseDto.totalCount) && epx.f(this.nextFrom, newsfeedGetBannedResponseDto.nextFrom) && epx.f(this.groups, newsfeedGetBannedResponseDto.groups) && epx.f(this.members, newsfeedGetBannedResponseDto.members);
    }

    public final int hashCode() {
        Integer num = this.totalCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.nextFrom;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<UserId> list = this.groups;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<UserId> list2 = this.members;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedGetBannedResponseDto(totalCount=");
        sb.append(this.totalCount);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", members=");
        return ms9.a(')', sb, this.members);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.totalCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.nextFrom);
        List<UserId> list = this.groups;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<UserId> list2 = this.members;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public NewsfeedGetBannedResponseDto(Integer num, String str, List<UserId> list, List<UserId> list2) {
        this.totalCount = num;
        this.nextFrom = str;
        this.groups = list;
        this.members = list2;
    }

    public /* synthetic */ NewsfeedGetBannedResponseDto(Integer num, String str, List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}

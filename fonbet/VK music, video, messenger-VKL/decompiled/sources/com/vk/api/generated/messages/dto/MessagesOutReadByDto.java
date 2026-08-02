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
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesOutReadByDto.kt */
/* loaded from: classes15.dex */
public final class MessagesOutReadByDto implements Parcelable {
    public static final Parcelable.Creator<MessagesOutReadByDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("member_ids")
    private final List<UserId> memberIds;

    /* compiled from: MessagesOutReadByDto.kt */
    public static final class a implements Parcelable.Creator<MessagesOutReadByDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesOutReadByDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MessagesOutReadByDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MessagesOutReadByDto(valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesOutReadByDto[] newArray(int i) {
            return new MessagesOutReadByDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesOutReadByDto() {
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
        if (!(obj instanceof MessagesOutReadByDto)) {
            return false;
        }
        MessagesOutReadByDto messagesOutReadByDto = (MessagesOutReadByDto) obj;
        return epx.f(this.count, messagesOutReadByDto.count) && epx.f(this.memberIds, messagesOutReadByDto.memberIds);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<UserId> list = this.memberIds;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesOutReadByDto(count=");
        sb.append(this.count);
        sb.append(", memberIds=");
        return ms9.a(')', sb, this.memberIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<UserId> list = this.memberIds;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public MessagesOutReadByDto(Integer num, List<UserId> list) {
        this.count = num;
        this.memberIds = list;
    }

    public /* synthetic */ MessagesOutReadByDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}

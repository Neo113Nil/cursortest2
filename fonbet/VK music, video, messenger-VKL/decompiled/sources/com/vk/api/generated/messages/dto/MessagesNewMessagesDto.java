package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.k73;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesNewMessagesDto.kt */
/* loaded from: classes15.dex */
public final class MessagesNewMessagesDto implements Parcelable {
    public static final Parcelable.Creator<MessagesNewMessagesDto> CREATOR = new a();

    @pmi0("cmids")
    private final List<Long> cmids;

    @pmi0("expired_cmids")
    private final List<Long> expiredCmids;

    @pmi0("mention_cmids")
    private final List<Long> mentionCmids;

    /* compiled from: MessagesNewMessagesDto.kt */
    public static final class a implements Parcelable.Creator<MessagesNewMessagesDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesNewMessagesDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int i = 0;
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = k73.b(parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = k73.b(parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = k73.b(parcel, arrayList3, i, 1);
                }
            }
            return new MessagesNewMessagesDto(arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesNewMessagesDto[] newArray(int i) {
            return new MessagesNewMessagesDto[i];
        }
    }

    public MessagesNewMessagesDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesNewMessagesDto)) {
            return false;
        }
        MessagesNewMessagesDto messagesNewMessagesDto = (MessagesNewMessagesDto) obj;
        return epx.f(this.cmids, messagesNewMessagesDto.cmids) && epx.f(this.mentionCmids, messagesNewMessagesDto.mentionCmids) && epx.f(this.expiredCmids, messagesNewMessagesDto.expiredCmids);
    }

    public final int hashCode() {
        List<Long> list = this.cmids;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Long> list2 = this.mentionCmids;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Long> list3 = this.expiredCmids;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesNewMessagesDto(cmids=");
        sb.append(this.cmids);
        sb.append(", mentionCmids=");
        sb.append(this.mentionCmids);
        sb.append(", expiredCmids=");
        return ms9.a(')', sb, this.expiredCmids);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<Long> list = this.cmids;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeLong(((Number) f.next()).longValue());
            }
        }
        List<Long> list2 = this.mentionCmids;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeLong(((Number) f2.next()).longValue());
            }
        }
        List<Long> list3 = this.expiredCmids;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            parcel.writeLong(((Number) f3.next()).longValue());
        }
    }

    public MessagesNewMessagesDto(List<Long> list, List<Long> list2, List<Long> list3) {
        this.cmids = list;
        this.mentionCmids = list2;
        this.expiredCmids = list3;
    }

    public /* synthetic */ MessagesNewMessagesDto(List list, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}

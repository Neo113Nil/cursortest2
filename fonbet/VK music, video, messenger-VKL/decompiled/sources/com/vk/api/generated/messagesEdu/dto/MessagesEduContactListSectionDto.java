package com.vk.api.generated.messagesEdu.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.fw3;
import xsna.iq;
import xsna.k73;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesEduContactListSectionDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEduContactListSectionDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEduContactListSectionDto> CREATOR = new a();

    @pmi0("organization_id")
    private final Long organizationId;

    @pmi0("peers")
    private final List<Long> peers;

    @pmi0("title")
    private final String title;

    /* compiled from: MessagesEduContactListSectionDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEduContactListSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEduContactListSectionDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = k73.b(parcel, arrayList, i, 1);
            }
            return new MessagesEduContactListSectionDto(readString, arrayList, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEduContactListSectionDto[] newArray(int i) {
            return new MessagesEduContactListSectionDto[i];
        }
    }

    public MessagesEduContactListSectionDto(String str, List<Long> list, Long l) {
        this.title = str;
        this.peers = list;
        this.organizationId = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesEduContactListSectionDto)) {
            return false;
        }
        MessagesEduContactListSectionDto messagesEduContactListSectionDto = (MessagesEduContactListSectionDto) obj;
        return epx.f(this.title, messagesEduContactListSectionDto.title) && epx.f(this.peers, messagesEduContactListSectionDto.peers) && epx.f(this.organizationId, messagesEduContactListSectionDto.organizationId);
    }

    public final int hashCode() {
        int a2 = fw3.a(this.title.hashCode() * 31, 31, this.peers);
        Long l = this.organizationId;
        return a2 + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEduContactListSectionDto(title=");
        sb.append(this.title);
        sb.append(", peers=");
        sb.append(this.peers);
        sb.append(", organizationId=");
        return iq.b(sb, this.organizationId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.peers);
        while (a2.hasNext()) {
            parcel.writeLong(((Number) a2.next()).longValue());
        }
        Long l = this.organizationId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
    }

    public /* synthetic */ MessagesEduContactListSectionDto(String str, List list, Long l, int i, zcl zclVar) {
        this(str, list, (i & 4) != 0 ? null : l);
    }
}

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
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesFolderDto.kt */
/* loaded from: classes15.dex */
public final class MessagesFolderDto implements Parcelable {
    public static final Parcelable.Creator<MessagesFolderDto> CREATOR = new a();

    @pmi0("flags")
    private final int flags;

    @pmi0("id")
    private final int id;

    @pmi0("included_lists")
    private final List<String> includedLists;

    @pmi0("included_peer_ids")
    private final List<UserId> includedPeerIds;

    @pmi0("name")
    private final String name;

    @pmi0("random_id")
    private final Integer randomId;

    @pmi0("type")
    private final String type;

    /* compiled from: MessagesFolderDto.kt */
    public static final class a implements Parcelable.Creator<MessagesFolderDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesFolderDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = bo.b(MessagesFolderDto.class, parcel, arrayList, i, 1);
                }
            }
            return new MessagesFolderDto(readInt, readString, readString2, readInt2, valueOf, arrayList, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesFolderDto[] newArray(int i) {
            return new MessagesFolderDto[i];
        }
    }

    public MessagesFolderDto(int i, String str, String str2, int i2, Integer num, List<UserId> list, List<String> list2) {
        this.id = i;
        this.name = str;
        this.type = str2;
        this.flags = i2;
        this.randomId = num;
        this.includedPeerIds = list;
        this.includedLists = list2;
    }

    public final int d() {
        return this.flags;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<String> e() {
        return this.includedLists;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesFolderDto)) {
            return false;
        }
        MessagesFolderDto messagesFolderDto = (MessagesFolderDto) obj;
        return this.id == messagesFolderDto.id && epx.f(this.name, messagesFolderDto.name) && epx.f(this.type, messagesFolderDto.type) && this.flags == messagesFolderDto.flags && epx.f(this.randomId, messagesFolderDto.randomId) && epx.f(this.includedPeerIds, messagesFolderDto.includedPeerIds) && epx.f(this.includedLists, messagesFolderDto.includedLists);
    }

    public final List<UserId> f() {
        return this.includedPeerIds;
    }

    public final String g() {
        return this.name;
    }

    public final int getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = shy.a(this.flags, urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.type), 31);
        Integer num = this.randomId;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        List<UserId> list = this.includedPeerIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.includedLists;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesFolderDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", flags=");
        sb.append(this.flags);
        sb.append(", randomId=");
        sb.append(this.randomId);
        sb.append(", includedPeerIds=");
        sb.append(this.includedPeerIds);
        sb.append(", includedLists=");
        return ms9.a(')', sb, this.includedLists);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        parcel.writeInt(this.flags);
        Integer num = this.randomId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        List<UserId> list = this.includedPeerIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeStringList(this.includedLists);
    }

    public /* synthetic */ MessagesFolderDto(int i, String str, String str2, int i2, Integer num, List list, List list2, int i3, zcl zclVar) {
        this(i, str, str2, i2, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : list, (i3 & 64) != 0 ? null : list2);
    }
}

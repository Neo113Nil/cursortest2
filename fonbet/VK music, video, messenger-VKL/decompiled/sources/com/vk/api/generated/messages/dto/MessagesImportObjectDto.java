package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesImportObjectDto.kt */
/* loaded from: classes15.dex */
public final class MessagesImportObjectDto implements Parcelable {
    public static final Parcelable.Creator<MessagesImportObjectDto> CREATOR = new a();

    @pmi0("deleted")
    private final List<UserId> deleted;

    @pmi0("existing")
    private final List<UserId> existing;

    @pmi0("has_my_phone_number")
    private final Boolean hasMyPhoneNumber;

    @pmi0("synced")
    private final List<UserId> synced;

    /* compiled from: MessagesImportObjectDto.kt */
    public static final class a implements Parcelable.Creator<MessagesImportObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesImportObjectDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(MessagesImportObjectDto.class, parcel, arrayList2, i, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(MessagesImportObjectDto.class, parcel, arrayList3, i2, 1);
            }
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(MessagesImportObjectDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesImportObjectDto(arrayList2, arrayList3, arrayList, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesImportObjectDto[] newArray(int i) {
            return new MessagesImportObjectDto[i];
        }
    }

    public MessagesImportObjectDto(List<UserId> list, List<UserId> list2, List<UserId> list3, Boolean bool) {
        this.deleted = list;
        this.synced = list2;
        this.existing = list3;
        this.hasMyPhoneNumber = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesImportObjectDto)) {
            return false;
        }
        MessagesImportObjectDto messagesImportObjectDto = (MessagesImportObjectDto) obj;
        return epx.f(this.deleted, messagesImportObjectDto.deleted) && epx.f(this.synced, messagesImportObjectDto.synced) && epx.f(this.existing, messagesImportObjectDto.existing) && epx.f(this.hasMyPhoneNumber, messagesImportObjectDto.hasMyPhoneNumber);
    }

    public final int hashCode() {
        int a2 = fw3.a(this.deleted.hashCode() * 31, 31, this.synced);
        List<UserId> list = this.existing;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.hasMyPhoneNumber;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesImportObjectDto(deleted=");
        sb.append(this.deleted);
        sb.append(", synced=");
        sb.append(this.synced);
        sb.append(", existing=");
        sb.append(this.existing);
        sb.append(", hasMyPhoneNumber=");
        return tn.a(sb, this.hasMyPhoneNumber, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.deleted);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.synced);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        List<UserId> list = this.existing;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Boolean bool = this.hasMyPhoneNumber;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MessagesImportObjectDto(List list, List list2, List list3, Boolean bool, int i, zcl zclVar) {
        this(list, list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : bool);
    }
}

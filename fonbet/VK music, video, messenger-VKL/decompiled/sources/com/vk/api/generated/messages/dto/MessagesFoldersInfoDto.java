package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: MessagesFoldersInfoDto.kt */
/* loaded from: classes15.dex */
public final class MessagesFoldersInfoDto implements Parcelable {
    public static final Parcelable.Creator<MessagesFoldersInfoDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("included_lists_info")
    private final List<MessagesSublistInfoDto> includedListsInfo;

    @pmi0("items")
    private final List<MessagesFolderDto> items;

    /* compiled from: MessagesFoldersInfoDto.kt */
    public static final class a implements Parcelable.Creator<MessagesFoldersInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesFoldersInfoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(MessagesFolderDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            int readInt2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(MessagesSublistInfoDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new MessagesFoldersInfoDto(arrayList2, readInt2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesFoldersInfoDto[] newArray(int i) {
            return new MessagesFoldersInfoDto[i];
        }
    }

    public MessagesFoldersInfoDto(List<MessagesFolderDto> list, int i, List<MessagesSublistInfoDto> list2) {
        this.items = list;
        this.count = i;
        this.includedListsInfo = list2;
    }

    public final List<MessagesSublistInfoDto> d() {
        return this.includedListsInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MessagesFolderDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesFoldersInfoDto)) {
            return false;
        }
        MessagesFoldersInfoDto messagesFoldersInfoDto = (MessagesFoldersInfoDto) obj;
        return epx.f(this.items, messagesFoldersInfoDto.items) && this.count == messagesFoldersInfoDto.count && epx.f(this.includedListsInfo, messagesFoldersInfoDto.includedListsInfo);
    }

    public final int hashCode() {
        int a2 = shy.a(this.count, this.items.hashCode() * 31, 31);
        List<MessagesSublistInfoDto> list = this.includedListsInfo;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesFoldersInfoDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", includedListsInfo=");
        return ms9.a(')', sb, this.includedListsInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MessagesFolderDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.count);
        List<MessagesSublistInfoDto> list = this.includedListsInfo;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MessagesSublistInfoDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesFoldersInfoDto(List list, int i, List list2, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : list2);
    }
}

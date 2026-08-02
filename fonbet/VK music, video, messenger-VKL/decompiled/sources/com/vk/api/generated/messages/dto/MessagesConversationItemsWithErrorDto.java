package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesConversationItemsWithErrorDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationItemsWithErrorDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationItemsWithErrorDto> CREATOR = new a();

    @pmi0("has_error")
    private final Boolean hasError;

    @pmi0("items")
    private final List<MessagesConversationWithMessageDto> items;

    @pmi0("total_count")
    private final Integer totalCount;

    /* compiled from: MessagesConversationItemsWithErrorDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationItemsWithErrorDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationItemsWithErrorDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MessagesConversationWithMessageDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesConversationItemsWithErrorDto(arrayList, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationItemsWithErrorDto[] newArray(int i) {
            return new MessagesConversationItemsWithErrorDto[i];
        }
    }

    public MessagesConversationItemsWithErrorDto() {
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
        if (!(obj instanceof MessagesConversationItemsWithErrorDto)) {
            return false;
        }
        MessagesConversationItemsWithErrorDto messagesConversationItemsWithErrorDto = (MessagesConversationItemsWithErrorDto) obj;
        return epx.f(this.items, messagesConversationItemsWithErrorDto.items) && epx.f(this.totalCount, messagesConversationItemsWithErrorDto.totalCount) && epx.f(this.hasError, messagesConversationItemsWithErrorDto.hasError);
    }

    public final int hashCode() {
        List<MessagesConversationWithMessageDto> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.totalCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.hasError;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationItemsWithErrorDto(items=");
        sb.append(this.items);
        sb.append(", totalCount=");
        sb.append(this.totalCount);
        sb.append(", hasError=");
        return tn.a(sb, this.hasError, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MessagesConversationWithMessageDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MessagesConversationWithMessageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.totalCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.hasError;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public MessagesConversationItemsWithErrorDto(List<MessagesConversationWithMessageDto> list, Integer num, Boolean bool) {
        this.items = list;
        this.totalCount = num;
        this.hasError = bool;
    }

    public /* synthetic */ MessagesConversationItemsWithErrorDto(List list, Integer num, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool);
    }
}

package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesTransitionDataDto.kt */
/* loaded from: classes15.dex */
public final class MessagesTransitionDataDto implements Parcelable {
    public static final Parcelable.Creator<MessagesTransitionDataDto> CREATOR = new a();

    @pmi0("link")
    private final String link;

    @pmi0("user_ids")
    private final List<Integer> userIds;

    /* compiled from: MessagesTransitionDataDto.kt */
    public static final class a implements Parcelable.Creator<MessagesTransitionDataDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesTransitionDataDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MessagesTransitionDataDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesTransitionDataDto[] newArray(int i) {
            return new MessagesTransitionDataDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesTransitionDataDto() {
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
        if (!(obj instanceof MessagesTransitionDataDto)) {
            return false;
        }
        MessagesTransitionDataDto messagesTransitionDataDto = (MessagesTransitionDataDto) obj;
        return epx.f(this.userIds, messagesTransitionDataDto.userIds) && epx.f(this.link, messagesTransitionDataDto.link);
    }

    public final int hashCode() {
        List<Integer> list = this.userIds;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.link;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesTransitionDataDto(userIds=");
        sb.append(this.userIds);
        sb.append(", link=");
        return ho8.a(sb, this.link, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<Integer> list = this.userIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        parcel.writeString(this.link);
    }

    public MessagesTransitionDataDto(List<Integer> list, String str) {
        this.userIds = list;
        this.link = str;
    }

    public /* synthetic */ MessagesTransitionDataDto(List list, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}

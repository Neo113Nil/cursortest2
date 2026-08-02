package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesFeatureblocksEnabledDto.kt */
/* loaded from: classes15.dex */
public final class MessagesFeatureblocksEnabledDto implements Parcelable {
    public static final Parcelable.Creator<MessagesFeatureblocksEnabledDto> CREATOR = new a();

    @pmi0("enabled_items")
    private final List<Integer> enabledItems;

    /* compiled from: MessagesFeatureblocksEnabledDto.kt */
    public static final class a implements Parcelable.Creator<MessagesFeatureblocksEnabledDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesFeatureblocksEnabledDto createFromParcel(Parcel parcel) {
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
            return new MessagesFeatureblocksEnabledDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesFeatureblocksEnabledDto[] newArray(int i) {
            return new MessagesFeatureblocksEnabledDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesFeatureblocksEnabledDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesFeatureblocksEnabledDto) && epx.f(this.enabledItems, ((MessagesFeatureblocksEnabledDto) obj).enabledItems);
    }

    public final int hashCode() {
        List<Integer> list = this.enabledItems;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MessagesFeatureblocksEnabledDto(enabledItems="), this.enabledItems);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<Integer> list = this.enabledItems;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeInt(((Number) f.next()).intValue());
        }
    }

    public MessagesFeatureblocksEnabledDto(List<Integer> list) {
        this.enabledItems = list;
    }

    public /* synthetic */ MessagesFeatureblocksEnabledDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}

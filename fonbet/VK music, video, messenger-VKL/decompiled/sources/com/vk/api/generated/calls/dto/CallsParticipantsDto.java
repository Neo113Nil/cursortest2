package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.k73;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: CallsParticipantsDto.kt */
/* loaded from: classes14.dex */
public final class CallsParticipantsDto implements Parcelable {
    public static final Parcelable.Creator<CallsParticipantsDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("list")
    private final List<Long> list;

    /* compiled from: CallsParticipantsDto.kt */
    public static final class a implements Parcelable.Creator<CallsParticipantsDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsParticipantsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = k73.b(parcel, arrayList, i, 1);
                }
            }
            return new CallsParticipantsDto(arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CallsParticipantsDto[] newArray(int i) {
            return new CallsParticipantsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallsParticipantsDto() {
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
        if (!(obj instanceof CallsParticipantsDto)) {
            return false;
        }
        CallsParticipantsDto callsParticipantsDto = (CallsParticipantsDto) obj;
        return epx.f(this.list, callsParticipantsDto.list) && epx.f(this.count, callsParticipantsDto.count);
    }

    public final int hashCode() {
        List<Long> list = this.list;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.count;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsParticipantsDto(list=");
        sb.append(this.list);
        sb.append(", count=");
        return uqi.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<Long> list = this.list;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeLong(((Number) f.next()).longValue());
            }
        }
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public CallsParticipantsDto(List<Long> list, Integer num) {
        this.list = list;
        this.count = num;
    }

    public /* synthetic */ CallsParticipantsDto(List list, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num);
    }
}

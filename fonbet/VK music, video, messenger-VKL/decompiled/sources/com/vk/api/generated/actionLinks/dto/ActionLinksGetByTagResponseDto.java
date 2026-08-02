package com.vk.api.generated.actionLinks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;

/* compiled from: ActionLinksGetByTagResponseDto.kt */
/* loaded from: classes14.dex */
public final class ActionLinksGetByTagResponseDto implements Parcelable {
    public static final Parcelable.Creator<ActionLinksGetByTagResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<ActionLinksActionDto> items;

    @pmi0(SignalingProtocol.KEY_LIMIT)
    private final int limit;

    /* compiled from: ActionLinksGetByTagResponseDto.kt */
    public static final class a implements Parcelable.Creator<ActionLinksGetByTagResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ActionLinksGetByTagResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = bo.b(ActionLinksGetByTagResponseDto.class, parcel, arrayList, i, 1);
            }
            return new ActionLinksGetByTagResponseDto(readInt, readInt2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ActionLinksGetByTagResponseDto[] newArray(int i) {
            return new ActionLinksGetByTagResponseDto[i];
        }
    }

    public ActionLinksGetByTagResponseDto(int i, int i2, List<ActionLinksActionDto> list) {
        this.limit = i;
        this.count = i2;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionLinksGetByTagResponseDto)) {
            return false;
        }
        ActionLinksGetByTagResponseDto actionLinksGetByTagResponseDto = (ActionLinksGetByTagResponseDto) obj;
        return this.limit == actionLinksGetByTagResponseDto.limit && this.count == actionLinksGetByTagResponseDto.count && epx.f(this.items, actionLinksGetByTagResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + shy.a(this.count, Integer.hashCode(this.limit) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionLinksGetByTagResponseDto(limit=");
        sb.append(this.limit);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.limit);
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}

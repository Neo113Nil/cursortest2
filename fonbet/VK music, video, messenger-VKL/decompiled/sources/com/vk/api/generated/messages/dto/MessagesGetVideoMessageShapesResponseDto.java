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
import xsna.fw3;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesGetVideoMessageShapesResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetVideoMessageShapesResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetVideoMessageShapesResponseDto> CREATOR = new a();

    @pmi0("shape_orders")
    private final List<Integer> shapeOrders;

    @pmi0("shapes")
    private final List<MessagesVideoMessageShapeResponseItemDto> shapes;

    @pmi0("version")
    private final int version;

    /* compiled from: MessagesGetVideoMessageShapesResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetVideoMessageShapesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetVideoMessageShapesResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(MessagesVideoMessageShapeResponseItemDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = pm0.b(parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new MessagesGetVideoMessageShapesResponseDto(readInt, arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetVideoMessageShapesResponseDto[] newArray(int i) {
            return new MessagesGetVideoMessageShapesResponseDto[i];
        }
    }

    public MessagesGetVideoMessageShapesResponseDto(int i, List<MessagesVideoMessageShapeResponseItemDto> list, List<Integer> list2) {
        this.version = i;
        this.shapes = list;
        this.shapeOrders = list2;
    }

    public final List<Integer> d() {
        return this.shapeOrders;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MessagesVideoMessageShapeResponseItemDto> e() {
        return this.shapes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetVideoMessageShapesResponseDto)) {
            return false;
        }
        MessagesGetVideoMessageShapesResponseDto messagesGetVideoMessageShapesResponseDto = (MessagesGetVideoMessageShapesResponseDto) obj;
        return this.version == messagesGetVideoMessageShapesResponseDto.version && epx.f(this.shapes, messagesGetVideoMessageShapesResponseDto.shapes) && epx.f(this.shapeOrders, messagesGetVideoMessageShapesResponseDto.shapeOrders);
    }

    public final int f() {
        return this.version;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.version) * 31, 31, this.shapes);
        List<Integer> list = this.shapeOrders;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetVideoMessageShapesResponseDto(version=");
        sb.append(this.version);
        sb.append(", shapes=");
        sb.append(this.shapes);
        sb.append(", shapeOrders=");
        return ms9.a(')', sb, this.shapeOrders);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.version);
        Iterator a2 = ao.a(parcel, this.shapes);
        while (a2.hasNext()) {
            ((MessagesVideoMessageShapeResponseItemDto) a2.next()).writeToParcel(parcel, i);
        }
        List<Integer> list = this.shapeOrders;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeInt(((Number) f.next()).intValue());
        }
    }

    public /* synthetic */ MessagesGetVideoMessageShapesResponseDto(int i, List list, List list2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2);
    }
}

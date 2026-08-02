package com.vk.api.generated.vkCharity.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.pm0;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: VkCharityGetSubscribedFoundationGroupIdsResponseDto.kt */
/* loaded from: classes15.dex */
public final class VkCharityGetSubscribedFoundationGroupIdsResponseDto implements Parcelable {
    public static final Parcelable.Creator<VkCharityGetSubscribedFoundationGroupIdsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<Integer> items;

    /* compiled from: VkCharityGetSubscribedFoundationGroupIdsResponseDto.kt */
    public static final class a implements Parcelable.Creator<VkCharityGetSubscribedFoundationGroupIdsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VkCharityGetSubscribedFoundationGroupIdsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new VkCharityGetSubscribedFoundationGroupIdsResponseDto(arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VkCharityGetSubscribedFoundationGroupIdsResponseDto[] newArray(int i) {
            return new VkCharityGetSubscribedFoundationGroupIdsResponseDto[i];
        }
    }

    public VkCharityGetSubscribedFoundationGroupIdsResponseDto(List<Integer> list, int i) {
        this.items = list;
        this.count = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkCharityGetSubscribedFoundationGroupIdsResponseDto)) {
            return false;
        }
        VkCharityGetSubscribedFoundationGroupIdsResponseDto vkCharityGetSubscribedFoundationGroupIdsResponseDto = (VkCharityGetSubscribedFoundationGroupIdsResponseDto) obj;
        return epx.f(this.items, vkCharityGetSubscribedFoundationGroupIdsResponseDto.items) && this.count == vkCharityGetSubscribedFoundationGroupIdsResponseDto.count;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count) + (this.items.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkCharityGetSubscribedFoundationGroupIdsResponseDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        return vu5.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        parcel.writeInt(this.count);
    }
}

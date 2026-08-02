package com.vk.api.generated.stickers.dto;

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

/* compiled from: StickersStoriesFreeStickersPromoConfigDto.kt */
/* loaded from: classes15.dex */
public final class StickersStoriesFreeStickersPromoConfigDto implements Parcelable {
    public static final Parcelable.Creator<StickersStoriesFreeStickersPromoConfigDto> CREATOR = new a();

    @pmi0("exclude_pack_ids")
    private final List<Integer> excludePackIds;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    /* compiled from: StickersStoriesFreeStickersPromoConfigDto.kt */
    public static final class a implements Parcelable.Creator<StickersStoriesFreeStickersPromoConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersStoriesFreeStickersPromoConfigDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 0;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new StickersStoriesFreeStickersPromoConfigDto(z, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersStoriesFreeStickersPromoConfigDto[] newArray(int i) {
            return new StickersStoriesFreeStickersPromoConfigDto[i];
        }
    }

    public StickersStoriesFreeStickersPromoConfigDto(boolean z, List<Integer> list) {
        this.isEnabled = z;
        this.excludePackIds = list;
    }

    public final List<Integer> d() {
        return this.excludePackIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.isEnabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersStoriesFreeStickersPromoConfigDto)) {
            return false;
        }
        StickersStoriesFreeStickersPromoConfigDto stickersStoriesFreeStickersPromoConfigDto = (StickersStoriesFreeStickersPromoConfigDto) obj;
        return this.isEnabled == stickersStoriesFreeStickersPromoConfigDto.isEnabled && epx.f(this.excludePackIds, stickersStoriesFreeStickersPromoConfigDto.excludePackIds);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        List<Integer> list = this.excludePackIds;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersStoriesFreeStickersPromoConfigDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", excludePackIds=");
        return ms9.a(')', sb, this.excludePackIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        List<Integer> list = this.excludePackIds;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeInt(((Number) f.next()).intValue());
        }
    }

    public /* synthetic */ StickersStoriesFreeStickersPromoConfigDto(boolean z, List list, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : list);
    }
}

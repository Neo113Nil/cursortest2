package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: StickersImageConfigDto.kt */
/* loaded from: classes15.dex */
public final class StickersImageConfigDto implements Parcelable {
    public static final Parcelable.Creator<StickersImageConfigDto> CREATOR = new a();

    @pmi0("default_id")
    private final int defaultId;

    @pmi0("hash")
    private final String hash;

    @pmi0("items")
    private final List<StickersImageConfigItemDto> items;

    /* compiled from: StickersImageConfigDto.kt */
    public static final class a implements Parcelable.Creator<StickersImageConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersImageConfigDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(StickersImageConfigItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StickersImageConfigDto(readInt, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersImageConfigDto[] newArray(int i) {
            return new StickersImageConfigDto[i];
        }
    }

    public StickersImageConfigDto(int i, String str, List<StickersImageConfigItemDto> list) {
        this.defaultId = i;
        this.hash = str;
        this.items = list;
    }

    public final int d() {
        return this.defaultId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.hash;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersImageConfigDto)) {
            return false;
        }
        StickersImageConfigDto stickersImageConfigDto = (StickersImageConfigDto) obj;
        return this.defaultId == stickersImageConfigDto.defaultId && epx.f(this.hash, stickersImageConfigDto.hash) && epx.f(this.items, stickersImageConfigDto.items);
    }

    public final List<StickersImageConfigItemDto> f() {
        return this.items;
    }

    public final int hashCode() {
        return this.items.hashCode() + urd0.a(Integer.hashCode(this.defaultId) * 31, 31, this.hash);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersImageConfigDto(defaultId=");
        sb.append(this.defaultId);
        sb.append(", hash=");
        sb.append(this.hash);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.defaultId);
        parcel.writeString(this.hash);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((StickersImageConfigItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}

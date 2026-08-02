package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallAttachmentsConfigExceptionDto.kt */
/* loaded from: classes15.dex */
public final class WallAttachmentsConfigExceptionDto implements Parcelable {
    public static final Parcelable.Creator<WallAttachmentsConfigExceptionDto> CREATOR = new a();

    @pmi0("items")
    private final List<WallAttachmentsConfigExceptionItemDto> items;

    /* compiled from: WallAttachmentsConfigExceptionDto.kt */
    public static final class a implements Parcelable.Creator<WallAttachmentsConfigExceptionDto> {
        @Override // android.os.Parcelable.Creator
        public final WallAttachmentsConfigExceptionDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(WallAttachmentsConfigExceptionItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new WallAttachmentsConfigExceptionDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final WallAttachmentsConfigExceptionDto[] newArray(int i) {
            return new WallAttachmentsConfigExceptionDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallAttachmentsConfigExceptionDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<WallAttachmentsConfigExceptionItemDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallAttachmentsConfigExceptionDto) && epx.f(this.items, ((WallAttachmentsConfigExceptionDto) obj).items);
    }

    public final int hashCode() {
        List<WallAttachmentsConfigExceptionItemDto> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("WallAttachmentsConfigExceptionDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<WallAttachmentsConfigExceptionItemDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((WallAttachmentsConfigExceptionItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public WallAttachmentsConfigExceptionDto(List<WallAttachmentsConfigExceptionItemDto> list) {
        this.items = list;
    }

    public /* synthetic */ WallAttachmentsConfigExceptionDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}

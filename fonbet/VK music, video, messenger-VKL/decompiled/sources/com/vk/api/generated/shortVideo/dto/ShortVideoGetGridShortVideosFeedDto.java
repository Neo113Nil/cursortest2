package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoGetGridShortVideosFeedDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetGridShortVideosFeedDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetGridShortVideosFeedDto> CREATOR = new a();

    @pmi0("items")
    private final List<ShortVideoGetGridShortVideosFeedItemDto> items;

    @pmi0("page_anchor")
    private final String pageAnchor;

    /* compiled from: ShortVideoGetGridShortVideosFeedDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetGridShortVideosFeedDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetGridShortVideosFeedDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(ShortVideoGetGridShortVideosFeedDto.class, parcel, arrayList, i, 1);
            }
            return new ShortVideoGetGridShortVideosFeedDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetGridShortVideosFeedDto[] newArray(int i) {
            return new ShortVideoGetGridShortVideosFeedDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoGetGridShortVideosFeedDto(List<? extends ShortVideoGetGridShortVideosFeedItemDto> list, String str) {
        this.items = list;
        this.pageAnchor = str;
    }

    public final List<ShortVideoGetGridShortVideosFeedItemDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.pageAnchor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoGetGridShortVideosFeedDto)) {
            return false;
        }
        ShortVideoGetGridShortVideosFeedDto shortVideoGetGridShortVideosFeedDto = (ShortVideoGetGridShortVideosFeedDto) obj;
        return epx.f(this.items, shortVideoGetGridShortVideosFeedDto.items) && epx.f(this.pageAnchor, shortVideoGetGridShortVideosFeedDto.pageAnchor);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        String str = this.pageAnchor;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoGetGridShortVideosFeedDto(items=");
        sb.append(this.items);
        sb.append(", pageAnchor=");
        return ho8.a(sb, this.pageAnchor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.pageAnchor);
    }

    public /* synthetic */ ShortVideoGetGridShortVideosFeedDto(List list, String str, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str);
    }
}

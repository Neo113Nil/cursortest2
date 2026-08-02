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

/* compiled from: ShortVideoRecomFeedDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoRecomFeedDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoRecomFeedDto> CREATOR = new a();

    @pmi0("items")
    private final List<ShortVideoRecomFeedItemDto> items;

    @pmi0("page_anchor")
    private final String pageAnchor;

    /* compiled from: ShortVideoRecomFeedDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoRecomFeedDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoRecomFeedDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(ShortVideoRecomFeedDto.class, parcel, arrayList, i, 1);
            }
            return new ShortVideoRecomFeedDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoRecomFeedDto[] newArray(int i) {
            return new ShortVideoRecomFeedDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoRecomFeedDto(List<? extends ShortVideoRecomFeedItemDto> list, String str) {
        this.items = list;
        this.pageAnchor = str;
    }

    public final List<ShortVideoRecomFeedItemDto> d() {
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
        if (!(obj instanceof ShortVideoRecomFeedDto)) {
            return false;
        }
        ShortVideoRecomFeedDto shortVideoRecomFeedDto = (ShortVideoRecomFeedDto) obj;
        return epx.f(this.items, shortVideoRecomFeedDto.items) && epx.f(this.pageAnchor, shortVideoRecomFeedDto.pageAnchor);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        String str = this.pageAnchor;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoRecomFeedDto(items=");
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

    public /* synthetic */ ShortVideoRecomFeedDto(List list, String str, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str);
    }
}

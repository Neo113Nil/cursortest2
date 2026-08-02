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

/* compiled from: ShortVideoGetSubscriptionsShortVideosFeedDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetSubscriptionsShortVideosFeedDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetSubscriptionsShortVideosFeedDto> CREATOR = new a();

    @pmi0("items")
    private final List<ShortVideoGetSubscriptionsShortVideosFeedItemDto> items;

    @pmi0("page_anchor")
    private final String pageAnchor;

    /* compiled from: ShortVideoGetSubscriptionsShortVideosFeedDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetSubscriptionsShortVideosFeedDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetSubscriptionsShortVideosFeedDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(ShortVideoGetSubscriptionsShortVideosFeedDto.class, parcel, arrayList, i, 1);
            }
            return new ShortVideoGetSubscriptionsShortVideosFeedDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetSubscriptionsShortVideosFeedDto[] newArray(int i) {
            return new ShortVideoGetSubscriptionsShortVideosFeedDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoGetSubscriptionsShortVideosFeedDto(List<? extends ShortVideoGetSubscriptionsShortVideosFeedItemDto> list, String str) {
        this.items = list;
        this.pageAnchor = str;
    }

    public final List<ShortVideoGetSubscriptionsShortVideosFeedItemDto> d() {
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
        if (!(obj instanceof ShortVideoGetSubscriptionsShortVideosFeedDto)) {
            return false;
        }
        ShortVideoGetSubscriptionsShortVideosFeedDto shortVideoGetSubscriptionsShortVideosFeedDto = (ShortVideoGetSubscriptionsShortVideosFeedDto) obj;
        return epx.f(this.items, shortVideoGetSubscriptionsShortVideosFeedDto.items) && epx.f(this.pageAnchor, shortVideoGetSubscriptionsShortVideosFeedDto.pageAnchor);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        String str = this.pageAnchor;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoGetSubscriptionsShortVideosFeedDto(items=");
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

    public /* synthetic */ ShortVideoGetSubscriptionsShortVideosFeedDto(List list, String str, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str);
    }
}

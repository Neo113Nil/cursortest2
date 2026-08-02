package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MarketItemsForAttachGroupDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemsForAttachGroupDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemsForAttachGroupDto> CREATOR = new a();

    @pmi0("id")
    private final UserId id;

    @pmi0("is_selected")
    private final boolean isSelected;

    @pmi0("photo")
    private final List<BaseImageDto> photo;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketItemsForAttachGroupDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemsForAttachGroupDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemsForAttachGroupDto createFromParcel(Parcel parcel) {
            UserId userId = (UserId) parcel.readParcelable(MarketItemsForAttachGroupDto.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(MarketItemsForAttachGroupDto.class, parcel, arrayList, i, 1);
            }
            return new MarketItemsForAttachGroupDto(userId, arrayList, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemsForAttachGroupDto[] newArray(int i) {
            return new MarketItemsForAttachGroupDto[i];
        }
    }

    public MarketItemsForAttachGroupDto(UserId userId, List<BaseImageDto> list, String str, boolean z) {
        this.id = userId;
        this.photo = list;
        this.title = str;
        this.isSelected = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemsForAttachGroupDto)) {
            return false;
        }
        MarketItemsForAttachGroupDto marketItemsForAttachGroupDto = (MarketItemsForAttachGroupDto) obj;
        return epx.f(this.id, marketItemsForAttachGroupDto.id) && epx.f(this.photo, marketItemsForAttachGroupDto.photo) && epx.f(this.title, marketItemsForAttachGroupDto.title) && this.isSelected == marketItemsForAttachGroupDto.isSelected;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSelected) + urd0.a(fw3.a(Long.hashCode(this.id.b) * 31, 31, this.photo), 31, this.title);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemsForAttachGroupDto(id=");
        sb.append(this.id);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", isSelected=");
        return q0.a(sb, this.isSelected, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        Iterator a2 = ao.a(parcel, this.photo);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.title);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }
}

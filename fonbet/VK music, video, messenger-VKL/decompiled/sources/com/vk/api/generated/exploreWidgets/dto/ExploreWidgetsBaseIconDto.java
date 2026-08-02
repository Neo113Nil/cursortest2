package com.vk.api.generated.exploreWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.exploreStyles.dto.ExploreStylesStyleBaseIconDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ExploreWidgetsBaseIconDto.kt */
/* loaded from: classes14.dex */
public final class ExploreWidgetsBaseIconDto implements Parcelable {
    public static final Parcelable.Creator<ExploreWidgetsBaseIconDto> CREATOR = new a();

    @pmi0("items")
    private final List<BaseImageDto> items;

    @pmi0(TtmlNode.TAG_STYLE)
    private final ExploreStylesStyleBaseIconDto style;

    /* compiled from: ExploreWidgetsBaseIconDto.kt */
    public static final class a implements Parcelable.Creator<ExploreWidgetsBaseIconDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseIconDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(ExploreWidgetsBaseIconDto.class, parcel, arrayList, i, 1);
            }
            return new ExploreWidgetsBaseIconDto(arrayList, parcel.readInt() == 0 ? null : ExploreStylesStyleBaseIconDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseIconDto[] newArray(int i) {
            return new ExploreWidgetsBaseIconDto[i];
        }
    }

    public ExploreWidgetsBaseIconDto(List<BaseImageDto> list, ExploreStylesStyleBaseIconDto exploreStylesStyleBaseIconDto) {
        this.items = list;
        this.style = exploreStylesStyleBaseIconDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreWidgetsBaseIconDto)) {
            return false;
        }
        ExploreWidgetsBaseIconDto exploreWidgetsBaseIconDto = (ExploreWidgetsBaseIconDto) obj;
        return epx.f(this.items, exploreWidgetsBaseIconDto.items) && epx.f(this.style, exploreWidgetsBaseIconDto.style);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        ExploreStylesStyleBaseIconDto exploreStylesStyleBaseIconDto = this.style;
        return hashCode + (exploreStylesStyleBaseIconDto == null ? 0 : exploreStylesStyleBaseIconDto.hashCode());
    }

    public final String toString() {
        return "ExploreWidgetsBaseIconDto(items=" + this.items + ", style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        ExploreStylesStyleBaseIconDto exploreStylesStyleBaseIconDto = this.style;
        if (exploreStylesStyleBaseIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreStylesStyleBaseIconDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ExploreWidgetsBaseIconDto(List list, ExploreStylesStyleBaseIconDto exploreStylesStyleBaseIconDto, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : exploreStylesStyleBaseIconDto);
    }
}

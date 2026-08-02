package com.vk.api.generated.discover.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DiscoverCarouselItemDto.kt */
/* loaded from: classes14.dex */
public final class DiscoverCarouselItemDto implements Parcelable {
    public static final Parcelable.Creator<DiscoverCarouselItemDto> CREATOR = new a();

    @pmi0("button")
    private final DiscoverCarouselButtonDto button;

    @pmi0("description")
    private final DiscoverCarouselItemDescriptionDto description;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("title")
    private final String title;

    /* compiled from: DiscoverCarouselItemDto.kt */
    public static final class a implements Parcelable.Creator<DiscoverCarouselItemDto> {
        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            DiscoverCarouselButtonDto createFromParcel = DiscoverCarouselButtonDto.CREATOR.createFromParcel(parcel);
            DiscoverCarouselItemDescriptionDto createFromParcel2 = DiscoverCarouselItemDescriptionDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(DiscoverCarouselItemDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new DiscoverCarouselItemDto(createFromParcel, createFromParcel2, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselItemDto[] newArray(int i) {
            return new DiscoverCarouselItemDto[i];
        }
    }

    public DiscoverCarouselItemDto(DiscoverCarouselButtonDto discoverCarouselButtonDto, DiscoverCarouselItemDescriptionDto discoverCarouselItemDescriptionDto, String str, List<BaseImageDto> list) {
        this.button = discoverCarouselButtonDto;
        this.description = discoverCarouselItemDescriptionDto;
        this.title = str;
        this.images = list;
    }

    public final DiscoverCarouselButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final DiscoverCarouselItemDescriptionDto e() {
        return this.description;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverCarouselItemDto)) {
            return false;
        }
        DiscoverCarouselItemDto discoverCarouselItemDto = (DiscoverCarouselItemDto) obj;
        return epx.f(this.button, discoverCarouselItemDto.button) && epx.f(this.description, discoverCarouselItemDto.description) && epx.f(this.title, discoverCarouselItemDto.title) && epx.f(this.images, discoverCarouselItemDto.images);
    }

    public final List<BaseImageDto> f() {
        return this.images;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a((this.description.hashCode() + (this.button.hashCode() * 31)) * 31, 31, this.title);
        List<BaseImageDto> list = this.images;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverCarouselItemDto(button=");
        sb.append(this.button);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", images=");
        return ms9.a(')', sb, this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.button.writeToParcel(parcel, i);
        this.description.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ DiscoverCarouselItemDto(DiscoverCarouselButtonDto discoverCarouselButtonDto, DiscoverCarouselItemDescriptionDto discoverCarouselItemDescriptionDto, String str, List list, int i, zcl zclVar) {
        this(discoverCarouselButtonDto, discoverCarouselItemDescriptionDto, str, (i & 8) != 0 ? null : list);
    }
}

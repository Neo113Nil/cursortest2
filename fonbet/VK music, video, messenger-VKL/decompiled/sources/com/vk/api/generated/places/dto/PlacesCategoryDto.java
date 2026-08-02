package com.vk.api.generated.places.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;

/* compiled from: PlacesCategoryDto.kt */
/* loaded from: classes15.dex */
public final class PlacesCategoryDto implements Parcelable {
    public static final Parcelable.Creator<PlacesCategoryDto> CREATOR = new a();

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    /* compiled from: PlacesCategoryDto.kt */
    public static final class a implements Parcelable.Creator<PlacesCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final PlacesCategoryDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(BaseImageDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new PlacesCategoryDto(arrayList, parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PlacesCategoryDto[] newArray(int i) {
            return new PlacesCategoryDto[i];
        }
    }

    public PlacesCategoryDto(List<BaseImageDto> list, int i, String str) {
        this.icons = list;
        this.id = i;
        this.title = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacesCategoryDto)) {
            return false;
        }
        PlacesCategoryDto placesCategoryDto = (PlacesCategoryDto) obj;
        return epx.f(this.icons, placesCategoryDto.icons) && this.id == placesCategoryDto.id && epx.f(this.title, placesCategoryDto.title);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.title.hashCode() + shy.a(this.id, this.icons.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacesCategoryDto(icons=");
        sb.append(this.icons);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.icons);
        while (a2.hasNext()) {
            ((BaseImageDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
    }
}

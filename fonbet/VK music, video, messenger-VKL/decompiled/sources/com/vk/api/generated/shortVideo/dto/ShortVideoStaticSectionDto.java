package com.vk.api.generated.shortVideo.dto;

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

/* compiled from: ShortVideoStaticSectionDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoStaticSectionDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoStaticSectionDto> CREATOR = new a();

    @pmi0("items")
    private final List<ShortVideoStaticSectionItemsDto> items;

    @pmi0("section_key")
    private final String sectionKey;

    /* compiled from: ShortVideoStaticSectionDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoStaticSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoStaticSectionDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ShortVideoStaticSectionItemsDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ShortVideoStaticSectionDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoStaticSectionDto[] newArray(int i) {
            return new ShortVideoStaticSectionDto[i];
        }
    }

    public ShortVideoStaticSectionDto(String str, List<ShortVideoStaticSectionItemsDto> list) {
        this.sectionKey = str;
        this.items = list;
    }

    public final List<ShortVideoStaticSectionItemsDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.sectionKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoStaticSectionDto)) {
            return false;
        }
        ShortVideoStaticSectionDto shortVideoStaticSectionDto = (ShortVideoStaticSectionDto) obj;
        return epx.f(this.sectionKey, shortVideoStaticSectionDto.sectionKey) && epx.f(this.items, shortVideoStaticSectionDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.sectionKey.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoStaticSectionDto(sectionKey=");
        sb.append(this.sectionKey);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sectionKey);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ShortVideoStaticSectionItemsDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}

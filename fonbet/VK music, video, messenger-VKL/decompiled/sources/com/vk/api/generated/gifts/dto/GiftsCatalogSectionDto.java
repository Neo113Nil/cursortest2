package com.vk.api.generated.gifts.dto;

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

/* compiled from: GiftsCatalogSectionDto.kt */
/* loaded from: classes14.dex */
public final class GiftsCatalogSectionDto implements Parcelable {
    public static final Parcelable.Creator<GiftsCatalogSectionDto> CREATOR = new a();

    @pmi0("items")
    private final List<GiftsCatalogGiftDto> items;

    @pmi0("name")
    private final String name;

    @pmi0("title")
    private final String title;

    /* compiled from: GiftsCatalogSectionDto.kt */
    public static final class a implements Parcelable.Creator<GiftsCatalogSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsCatalogSectionDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(GiftsCatalogGiftDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new GiftsCatalogSectionDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsCatalogSectionDto[] newArray(int i) {
            return new GiftsCatalogSectionDto[i];
        }
    }

    public GiftsCatalogSectionDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsCatalogSectionDto)) {
            return false;
        }
        GiftsCatalogSectionDto giftsCatalogSectionDto = (GiftsCatalogSectionDto) obj;
        return epx.f(this.name, giftsCatalogSectionDto.name) && epx.f(this.title, giftsCatalogSectionDto.title) && epx.f(this.items, giftsCatalogSectionDto.items);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<GiftsCatalogGiftDto> list = this.items;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftsCatalogSectionDto(name=");
        sb.append(this.name);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        List<GiftsCatalogGiftDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((GiftsCatalogGiftDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public GiftsCatalogSectionDto(String str, String str2, List<GiftsCatalogGiftDto> list) {
        this.name = str;
        this.title = str2;
        this.items = list;
    }

    public /* synthetic */ GiftsCatalogSectionDto(String str, String str2, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}

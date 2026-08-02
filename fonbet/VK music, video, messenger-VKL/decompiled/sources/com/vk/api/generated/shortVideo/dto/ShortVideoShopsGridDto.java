package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoShopsGridDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShopsGridDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShopsGridDto> CREATOR = new a();

    @pmi0("items")
    private final List<ShortVideoShortVideoFullDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: ShortVideoShopsGridDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShopsGridDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShopsGridDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ShortVideoShortVideoFullDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ShortVideoShopsGridDto(arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShopsGridDto[] newArray(int i) {
            return new ShortVideoShopsGridDto[i];
        }
    }

    public ShortVideoShopsGridDto(List<ShortVideoShortVideoFullDto> list, String str, String str2) {
        this.items = list;
        this.nextFrom = str;
        this.trackCode = str2;
    }

    public final List<ShortVideoShortVideoFullDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.nextFrom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShopsGridDto)) {
            return false;
        }
        ShortVideoShopsGridDto shortVideoShopsGridDto = (ShortVideoShopsGridDto) obj;
        return epx.f(this.items, shortVideoShopsGridDto.items) && epx.f(this.nextFrom, shortVideoShopsGridDto.nextFrom) && epx.f(this.trackCode, shortVideoShopsGridDto.trackCode);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        String str = this.nextFrom;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackCode;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShopsGridDto(items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((ShortVideoShortVideoFullDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextFrom);
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ ShortVideoShopsGridDto(List list, String str, String str2, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}

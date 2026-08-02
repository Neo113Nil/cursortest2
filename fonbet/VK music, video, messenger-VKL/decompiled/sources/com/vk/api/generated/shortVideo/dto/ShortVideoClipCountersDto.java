package com.vk.api.generated.shortVideo.dto;

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

/* compiled from: ShortVideoClipCountersDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoClipCountersDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoClipCountersDto> CREATOR = new a();

    @pmi0("audios")
    private final List<ShortVideoClipCounterDto> audios;

    @pmi0("compilations")
    private final List<ShortVideoClipCounterDto> compilations;

    @pmi0("masks")
    private final List<ShortVideoClipCounterDto> masks;

    @pmi0("places")
    private final List<ShortVideoClipCounterDto> places;

    @pmi0("tags")
    private final List<ShortVideoClipCounterDto> tags;

    /* compiled from: ShortVideoClipCountersDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoClipCountersDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoClipCountersDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            int i = 0;
            ArrayList arrayList5 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(ShortVideoClipCounterDto.CREATOR, parcel, arrayList6, i2, 1);
                }
                arrayList = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(ShortVideoClipCounterDto.CREATOR, parcel, arrayList7, i3, 1);
                }
                arrayList2 = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = en.a(ShortVideoClipCounterDto.CREATOR, parcel, arrayList8, i4, 1);
                }
                arrayList3 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = en.a(ShortVideoClipCounterDto.CREATOR, parcel, arrayList9, i5, 1);
                }
                arrayList4 = arrayList9;
            }
            if (parcel.readInt() != 0) {
                int readInt5 = parcel.readInt();
                arrayList5 = new ArrayList(readInt5);
                while (i != readInt5) {
                    i = en.a(ShortVideoClipCounterDto.CREATOR, parcel, arrayList5, i, 1);
                }
            }
            return new ShortVideoClipCountersDto(arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoClipCountersDto[] newArray(int i) {
            return new ShortVideoClipCountersDto[i];
        }
    }

    public ShortVideoClipCountersDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final List<ShortVideoClipCounterDto> H2() {
        return this.masks;
    }

    public final List<ShortVideoClipCounterDto> H4() {
        return this.compilations;
    }

    public final List<ShortVideoClipCounterDto> d() {
        return this.audios;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<ShortVideoClipCounterDto> e() {
        return this.places;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoClipCountersDto)) {
            return false;
        }
        ShortVideoClipCountersDto shortVideoClipCountersDto = (ShortVideoClipCountersDto) obj;
        return epx.f(this.tags, shortVideoClipCountersDto.tags) && epx.f(this.audios, shortVideoClipCountersDto.audios) && epx.f(this.places, shortVideoClipCountersDto.places) && epx.f(this.masks, shortVideoClipCountersDto.masks) && epx.f(this.compilations, shortVideoClipCountersDto.compilations);
    }

    public final List<ShortVideoClipCounterDto> f() {
        return this.tags;
    }

    public final int hashCode() {
        List<ShortVideoClipCounterDto> list = this.tags;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ShortVideoClipCounterDto> list2 = this.audios;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ShortVideoClipCounterDto> list3 = this.places;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ShortVideoClipCounterDto> list4 = this.masks;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<ShortVideoClipCounterDto> list5 = this.compilations;
        return hashCode4 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoClipCountersDto(tags=");
        sb.append(this.tags);
        sb.append(", audios=");
        sb.append(this.audios);
        sb.append(", places=");
        sb.append(this.places);
        sb.append(", masks=");
        sb.append(this.masks);
        sb.append(", compilations=");
        return ms9.a(')', sb, this.compilations);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<ShortVideoClipCounterDto> list = this.tags;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((ShortVideoClipCounterDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<ShortVideoClipCounterDto> list2 = this.audios;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((ShortVideoClipCounterDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<ShortVideoClipCounterDto> list3 = this.places;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((ShortVideoClipCounterDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        List<ShortVideoClipCounterDto> list4 = this.masks;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((ShortVideoClipCounterDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        List<ShortVideoClipCounterDto> list5 = this.compilations;
        if (list5 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f5 = dn.f(parcel, list5, 1);
        while (f5.hasNext()) {
            ((ShortVideoClipCounterDto) f5.next()).writeToParcel(parcel, i);
        }
    }

    public ShortVideoClipCountersDto(List<ShortVideoClipCounterDto> list, List<ShortVideoClipCounterDto> list2, List<ShortVideoClipCounterDto> list3, List<ShortVideoClipCounterDto> list4, List<ShortVideoClipCounterDto> list5) {
        this.tags = list;
        this.audios = list2;
        this.places = list3;
        this.masks = list4;
        this.compilations = list5;
    }

    public /* synthetic */ ShortVideoClipCountersDto(List list, List list2, List list3, List list4, List list5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5);
    }
}

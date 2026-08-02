package com.vk.api.generated.stories.dto;

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

/* compiled from: StoriesGetBackgroundsResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetBackgroundsResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetBackgroundsResponseDto> CREATOR = new a();

    @pmi0("advice_gradients")
    private final List<StoriesBackgroundDto> adviceGradients;

    @pmi0("animated")
    private final List<StoriesBackgroundAnimatedDto> animated;

    @pmi0("colors")
    private final List<StoriesBackgroundDto> colors;

    @pmi0("emojies")
    private final List<StoriesBackgroundDto> emojies;

    @pmi0("gradients")
    private final List<StoriesBackgroundDto> gradients;

    @pmi0("marusia")
    private final List<StoriesBackgroundDto> marusia;

    /* compiled from: StoriesGetBackgroundsResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetBackgroundsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetBackgroundsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            int i = 0;
            ArrayList arrayList6 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(StoriesBackgroundDto.CREATOR, parcel, arrayList7, i2, 1);
                }
                arrayList = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(StoriesBackgroundDto.CREATOR, parcel, arrayList8, i3, 1);
                }
                arrayList2 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = en.a(StoriesBackgroundDto.CREATOR, parcel, arrayList9, i4, 1);
                }
                arrayList3 = arrayList9;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(readInt4);
                int i5 = 0;
                while (i5 != readInt4) {
                    i5 = en.a(StoriesBackgroundDto.CREATOR, parcel, arrayList10, i5, 1);
                }
                arrayList4 = arrayList10;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList11 = new ArrayList(readInt5);
                int i6 = 0;
                while (i6 != readInt5) {
                    i6 = en.a(StoriesBackgroundAnimatedDto.CREATOR, parcel, arrayList11, i6, 1);
                }
                arrayList5 = arrayList11;
            }
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                arrayList6 = new ArrayList(readInt6);
                while (i != readInt6) {
                    i = en.a(StoriesBackgroundDto.CREATOR, parcel, arrayList6, i, 1);
                }
            }
            return new StoriesGetBackgroundsResponseDto(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetBackgroundsResponseDto[] newArray(int i) {
            return new StoriesGetBackgroundsResponseDto[i];
        }
    }

    public StoriesGetBackgroundsResponseDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final List<StoriesBackgroundDto> d() {
        return this.adviceGradients;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<StoriesBackgroundAnimatedDto> e() {
        return this.animated;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetBackgroundsResponseDto)) {
            return false;
        }
        StoriesGetBackgroundsResponseDto storiesGetBackgroundsResponseDto = (StoriesGetBackgroundsResponseDto) obj;
        return epx.f(this.emojies, storiesGetBackgroundsResponseDto.emojies) && epx.f(this.gradients, storiesGetBackgroundsResponseDto.gradients) && epx.f(this.adviceGradients, storiesGetBackgroundsResponseDto.adviceGradients) && epx.f(this.colors, storiesGetBackgroundsResponseDto.colors) && epx.f(this.animated, storiesGetBackgroundsResponseDto.animated) && epx.f(this.marusia, storiesGetBackgroundsResponseDto.marusia);
    }

    public final List<StoriesBackgroundDto> f() {
        return this.colors;
    }

    public final List<StoriesBackgroundDto> g() {
        return this.emojies;
    }

    public final int hashCode() {
        List<StoriesBackgroundDto> list = this.emojies;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<StoriesBackgroundDto> list2 = this.gradients;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<StoriesBackgroundDto> list3 = this.adviceGradients;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<StoriesBackgroundDto> list4 = this.colors;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<StoriesBackgroundAnimatedDto> list5 = this.animated;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<StoriesBackgroundDto> list6 = this.marusia;
        return hashCode5 + (list6 != null ? list6.hashCode() : 0);
    }

    public final List<StoriesBackgroundDto> i() {
        return this.gradients;
    }

    public final List<StoriesBackgroundDto> j() {
        return this.marusia;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesGetBackgroundsResponseDto(emojies=");
        sb.append(this.emojies);
        sb.append(", gradients=");
        sb.append(this.gradients);
        sb.append(", adviceGradients=");
        sb.append(this.adviceGradients);
        sb.append(", colors=");
        sb.append(this.colors);
        sb.append(", animated=");
        sb.append(this.animated);
        sb.append(", marusia=");
        return ms9.a(')', sb, this.marusia);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<StoriesBackgroundDto> list = this.emojies;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((StoriesBackgroundDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<StoriesBackgroundDto> list2 = this.gradients;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((StoriesBackgroundDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<StoriesBackgroundDto> list3 = this.adviceGradients;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((StoriesBackgroundDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        List<StoriesBackgroundDto> list4 = this.colors;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((StoriesBackgroundDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        List<StoriesBackgroundAnimatedDto> list5 = this.animated;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((StoriesBackgroundAnimatedDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        List<StoriesBackgroundDto> list6 = this.marusia;
        if (list6 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f6 = dn.f(parcel, list6, 1);
        while (f6.hasNext()) {
            ((StoriesBackgroundDto) f6.next()).writeToParcel(parcel, i);
        }
    }

    public StoriesGetBackgroundsResponseDto(List<StoriesBackgroundDto> list, List<StoriesBackgroundDto> list2, List<StoriesBackgroundDto> list3, List<StoriesBackgroundDto> list4, List<StoriesBackgroundAnimatedDto> list5, List<StoriesBackgroundDto> list6) {
        this.emojies = list;
        this.gradients = list2;
        this.adviceGradients = list3;
        this.colors = list4;
        this.animated = list5;
        this.marusia = list6;
    }

    public /* synthetic */ StoriesGetBackgroundsResponseDto(List list, List list2, List list3, List list4, List list5, List list6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5, (i & 32) != 0 ? null : list6);
    }
}

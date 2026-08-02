package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallGetAttachmentsConfigResponseDto.kt */
/* loaded from: classes15.dex */
public final class WallGetAttachmentsConfigResponseDto implements Parcelable {
    public static final Parcelable.Creator<WallGetAttachmentsConfigResponseDto> CREATOR = new a();

    @pmi0("carousel")
    private final WallAttachmentsConfigCarouselDto carousel;

    /* renamed from: default, reason: not valid java name */
    @pmi0(BuildConfig.FLAVOR)
    private final List<WallAttachmentsConfigDefaultItemDto> f27default;

    @pmi0("exceptions")
    private final List<WallAttachmentsConfigExceptionDto> exceptions;

    @pmi0("grid")
    private final List<String> grid;

    /* compiled from: WallGetAttachmentsConfigResponseDto.kt */
    public static final class a implements Parcelable.Creator<WallGetAttachmentsConfigResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final WallGetAttachmentsConfigResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(WallAttachmentsConfigExceptionDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(WallAttachmentsConfigDefaultItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new WallGetAttachmentsConfigResponseDto(arrayList, createStringArrayList, arrayList2, parcel.readInt() != 0 ? WallAttachmentsConfigCarouselDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final WallGetAttachmentsConfigResponseDto[] newArray(int i) {
            return new WallGetAttachmentsConfigResponseDto[i];
        }
    }

    public WallGetAttachmentsConfigResponseDto() {
        this(null, null, null, null, 15, null);
    }

    public final WallAttachmentsConfigCarouselDto d() {
        return this.carousel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<WallAttachmentsConfigDefaultItemDto> e() {
        return this.f27default;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetAttachmentsConfigResponseDto)) {
            return false;
        }
        WallGetAttachmentsConfigResponseDto wallGetAttachmentsConfigResponseDto = (WallGetAttachmentsConfigResponseDto) obj;
        return epx.f(this.exceptions, wallGetAttachmentsConfigResponseDto.exceptions) && epx.f(this.grid, wallGetAttachmentsConfigResponseDto.grid) && epx.f(this.f27default, wallGetAttachmentsConfigResponseDto.f27default) && epx.f(this.carousel, wallGetAttachmentsConfigResponseDto.carousel);
    }

    public final List<WallAttachmentsConfigExceptionDto> f() {
        return this.exceptions;
    }

    public final List<String> g() {
        return this.grid;
    }

    public final int hashCode() {
        List<WallAttachmentsConfigExceptionDto> list = this.exceptions;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.grid;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<WallAttachmentsConfigDefaultItemDto> list3 = this.f27default;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        WallAttachmentsConfigCarouselDto wallAttachmentsConfigCarouselDto = this.carousel;
        return hashCode3 + (wallAttachmentsConfigCarouselDto != null ? wallAttachmentsConfigCarouselDto.hashCode() : 0);
    }

    public final String toString() {
        return "WallGetAttachmentsConfigResponseDto(exceptions=" + this.exceptions + ", grid=" + this.grid + ", default=" + this.f27default + ", carousel=" + this.carousel + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<WallAttachmentsConfigExceptionDto> list = this.exceptions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((WallAttachmentsConfigExceptionDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.grid);
        List<WallAttachmentsConfigDefaultItemDto> list2 = this.f27default;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((WallAttachmentsConfigDefaultItemDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        WallAttachmentsConfigCarouselDto wallAttachmentsConfigCarouselDto = this.carousel;
        if (wallAttachmentsConfigCarouselDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wallAttachmentsConfigCarouselDto.writeToParcel(parcel, i);
        }
    }

    public WallGetAttachmentsConfigResponseDto(List<WallAttachmentsConfigExceptionDto> list, List<String> list2, List<WallAttachmentsConfigDefaultItemDto> list3, WallAttachmentsConfigCarouselDto wallAttachmentsConfigCarouselDto) {
        this.exceptions = list;
        this.grid = list2;
        this.f27default = list3;
        this.carousel = wallAttachmentsConfigCarouselDto;
    }

    public /* synthetic */ WallGetAttachmentsConfigResponseDto(List list, List list2, List list3, WallAttachmentsConfigCarouselDto wallAttachmentsConfigCarouselDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : wallAttachmentsConfigCarouselDto);
    }
}

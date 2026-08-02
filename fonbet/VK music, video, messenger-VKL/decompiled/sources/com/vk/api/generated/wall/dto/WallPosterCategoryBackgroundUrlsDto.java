package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallPosterCategoryBackgroundUrlsDto.kt */
/* loaded from: classes15.dex */
public final class WallPosterCategoryBackgroundUrlsDto implements Parcelable {
    public static final Parcelable.Creator<WallPosterCategoryBackgroundUrlsDto> CREATOR = new a();

    @pmi0("back")
    private final List<BaseImageDto> back;

    @pmi0("front")
    private final List<BaseImageDto> front;

    @pmi0(X3.i.Z)
    private final List<BaseImageDto> main;

    /* compiled from: WallPosterCategoryBackgroundUrlsDto.kt */
    public static final class a implements Parcelable.Creator<WallPosterCategoryBackgroundUrlsDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPosterCategoryBackgroundUrlsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int i = 0;
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(WallPosterCategoryBackgroundUrlsDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(WallPosterCategoryBackgroundUrlsDto.class, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(WallPosterCategoryBackgroundUrlsDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new WallPosterCategoryBackgroundUrlsDto(arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final WallPosterCategoryBackgroundUrlsDto[] newArray(int i) {
            return new WallPosterCategoryBackgroundUrlsDto[i];
        }
    }

    public WallPosterCategoryBackgroundUrlsDto() {
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
        if (!(obj instanceof WallPosterCategoryBackgroundUrlsDto)) {
            return false;
        }
        WallPosterCategoryBackgroundUrlsDto wallPosterCategoryBackgroundUrlsDto = (WallPosterCategoryBackgroundUrlsDto) obj;
        return epx.f(this.front, wallPosterCategoryBackgroundUrlsDto.front) && epx.f(this.back, wallPosterCategoryBackgroundUrlsDto.back) && epx.f(this.main, wallPosterCategoryBackgroundUrlsDto.main);
    }

    public final int hashCode() {
        List<BaseImageDto> list = this.front;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<BaseImageDto> list2 = this.back;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BaseImageDto> list3 = this.main;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPosterCategoryBackgroundUrlsDto(front=");
        sb.append(this.front);
        sb.append(", back=");
        sb.append(this.back);
        sb.append(", main=");
        return ms9.a(')', sb, this.main);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<BaseImageDto> list = this.front;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<BaseImageDto> list2 = this.back;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        List<BaseImageDto> list3 = this.main;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            parcel.writeParcelable((Parcelable) f3.next(), i);
        }
    }

    public WallPosterCategoryBackgroundUrlsDto(List<BaseImageDto> list, List<BaseImageDto> list2, List<BaseImageDto> list3) {
        this.front = list;
        this.back = list2;
        this.main = list3;
    }

    public /* synthetic */ WallPosterCategoryBackgroundUrlsDto(List list, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}

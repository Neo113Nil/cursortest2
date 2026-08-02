package com.vk.api.generated.shortVideo.dto;

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
import xsna.zcl;

/* compiled from: ShortVideoGetAnonUserInfoResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetAnonUserInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetAnonUserInfoResponseDto> CREATOR = new a();

    @pmi0("image")
    private final List<BaseImageDto> image;

    /* compiled from: ShortVideoGetAnonUserInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetAnonUserInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetAnonUserInfoResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(ShortVideoGetAnonUserInfoResponseDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new ShortVideoGetAnonUserInfoResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetAnonUserInfoResponseDto[] newArray(int i) {
            return new ShortVideoGetAnonUserInfoResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoGetAnonUserInfoResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final List<BaseImageDto> d() {
        return this.image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortVideoGetAnonUserInfoResponseDto) && epx.f(this.image, ((ShortVideoGetAnonUserInfoResponseDto) obj).image);
    }

    public final int hashCode() {
        List<BaseImageDto> list = this.image;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ShortVideoGetAnonUserInfoResponseDto(image="), this.image);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<BaseImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public ShortVideoGetAnonUserInfoResponseDto(List<BaseImageDto> list) {
        this.image = list;
    }

    public /* synthetic */ ShortVideoGetAnonUserInfoResponseDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}

package com.vk.api.generated.stickers.dto;

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
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StickersImageSetDto.kt */
/* loaded from: classes15.dex */
public final class StickersImageSetDto implements Parcelable {
    public static final Parcelable.Creator<StickersImageSetDto> CREATOR = new a();

    @pmi0("base_url")
    private final String baseUrl;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("version")
    private final Integer version;

    /* compiled from: StickersImageSetDto.kt */
    public static final class a implements Parcelable.Creator<StickersImageSetDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersImageSetDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(StickersImageSetDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new StickersImageSetDto(readString, valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersImageSetDto[] newArray(int i) {
            return new StickersImageSetDto[i];
        }
    }

    public StickersImageSetDto(String str, Integer num, List<BaseImageDto> list) {
        this.baseUrl = str;
        this.version = num;
        this.images = list;
    }

    public final String d() {
        return this.baseUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.images;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersImageSetDto)) {
            return false;
        }
        StickersImageSetDto stickersImageSetDto = (StickersImageSetDto) obj;
        return epx.f(this.baseUrl, stickersImageSetDto.baseUrl) && epx.f(this.version, stickersImageSetDto.version) && epx.f(this.images, stickersImageSetDto.images);
    }

    public final int hashCode() {
        int hashCode = this.baseUrl.hashCode() * 31;
        Integer num = this.version;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersImageSetDto(baseUrl=");
        sb.append(this.baseUrl);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", images=");
        return ms9.a(')', sb, this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.baseUrl);
        Integer num = this.version;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
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

    public /* synthetic */ StickersImageSetDto(String str, Integer num, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list);
    }
}

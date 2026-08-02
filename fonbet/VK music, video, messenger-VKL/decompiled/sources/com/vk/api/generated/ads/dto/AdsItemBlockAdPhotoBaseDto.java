package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
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

/* compiled from: AdsItemBlockAdPhotoBaseDto.kt */
/* loaded from: classes14.dex */
public final class AdsItemBlockAdPhotoBaseDto implements Parcelable {
    public static final Parcelable.Creator<AdsItemBlockAdPhotoBaseDto> CREATOR = new a();

    @pmi0("height")
    private final Integer height;

    @pmi0("tags")
    private final List<AdsItemBlockAdPhotoBaseTagDto> tags;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final Integer width;

    /* compiled from: AdsItemBlockAdPhotoBaseDto.kt */
    public static final class a implements Parcelable.Creator<AdsItemBlockAdPhotoBaseDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdPhotoBaseDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AdsItemBlockAdPhotoBaseDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AdsItemBlockAdPhotoBaseDto(readString, valueOf, valueOf2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdPhotoBaseDto[] newArray(int i) {
            return new AdsItemBlockAdPhotoBaseDto[i];
        }
    }

    public AdsItemBlockAdPhotoBaseDto() {
        this(null, null, null, null, 15, null);
    }

    public final Integer d() {
        return this.height;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.width;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsItemBlockAdPhotoBaseDto)) {
            return false;
        }
        AdsItemBlockAdPhotoBaseDto adsItemBlockAdPhotoBaseDto = (AdsItemBlockAdPhotoBaseDto) obj;
        return epx.f(this.url, adsItemBlockAdPhotoBaseDto.url) && epx.f(this.width, adsItemBlockAdPhotoBaseDto.width) && epx.f(this.height, adsItemBlockAdPhotoBaseDto.height) && epx.f(this.tags, adsItemBlockAdPhotoBaseDto.tags);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.width;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<AdsItemBlockAdPhotoBaseTagDto> list = this.tags;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsItemBlockAdPhotoBaseDto(url=");
        sb.append(this.url);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", tags=");
        return ms9.a(')', sb, this.tags);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        Integer num = this.width;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.height;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        List<AdsItemBlockAdPhotoBaseTagDto> list = this.tags;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public AdsItemBlockAdPhotoBaseDto(String str, Integer num, Integer num2, List<AdsItemBlockAdPhotoBaseTagDto> list) {
        this.url = str;
        this.width = num;
        this.height = num2;
        this.tags = list;
    }

    public /* synthetic */ AdsItemBlockAdPhotoBaseDto(String str, Integer num, Integer num2, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : list);
    }
}

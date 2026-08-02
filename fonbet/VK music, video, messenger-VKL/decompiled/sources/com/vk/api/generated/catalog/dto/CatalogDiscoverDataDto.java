package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.uxpolls.dto.UxpollsPollDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: CatalogDiscoverDataDto.kt */
/* loaded from: classes14.dex */
public final class CatalogDiscoverDataDto implements Parcelable {
    public static final Parcelable.Creator<CatalogDiscoverDataDto> CREATOR = new a();

    @pmi0("can_show_ad_banner")
    private final Boolean canShowAdBanner;

    @pmi0("payload")
    private final String payload;

    @pmi0("pools")
    private final List<UxpollsPollDto> pools;

    /* compiled from: CatalogDiscoverDataDto.kt */
    public static final class a implements Parcelable.Creator<CatalogDiscoverDataDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogDiscoverDataDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int i = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (i != readInt) {
                    i = bo.b(CatalogDiscoverDataDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new CatalogDiscoverDataDto(valueOf, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogDiscoverDataDto[] newArray(int i) {
            return new CatalogDiscoverDataDto[i];
        }
    }

    public CatalogDiscoverDataDto() {
        this(null, null, null, 7, null);
    }

    public final Boolean d() {
        return this.canShowAdBanner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogDiscoverDataDto)) {
            return false;
        }
        CatalogDiscoverDataDto catalogDiscoverDataDto = (CatalogDiscoverDataDto) obj;
        return epx.f(this.canShowAdBanner, catalogDiscoverDataDto.canShowAdBanner) && epx.f(this.payload, catalogDiscoverDataDto.payload) && epx.f(this.pools, catalogDiscoverDataDto.pools);
    }

    public final List<UxpollsPollDto> f() {
        return this.pools;
    }

    public final int hashCode() {
        Boolean bool = this.canShowAdBanner;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.payload;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<UxpollsPollDto> list = this.pools;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogDiscoverDataDto(canShowAdBanner=");
        sb.append(this.canShowAdBanner);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", pools=");
        return ms9.a(')', sb, this.pools);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.canShowAdBanner;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.payload);
        List<UxpollsPollDto> list = this.pools;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public CatalogDiscoverDataDto(Boolean bool, String str, List<UxpollsPollDto> list) {
        this.canShowAdBanner = bool;
        this.payload = str;
        this.pools = list;
    }

    public /* synthetic */ CatalogDiscoverDataDto(Boolean bool, String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}

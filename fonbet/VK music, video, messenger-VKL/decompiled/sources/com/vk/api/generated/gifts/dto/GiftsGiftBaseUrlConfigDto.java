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
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GiftsGiftBaseUrlConfigDto.kt */
/* loaded from: classes14.dex */
public final class GiftsGiftBaseUrlConfigDto implements Parcelable {
    public static final Parcelable.Creator<GiftsGiftBaseUrlConfigDto> CREATOR = new a();

    @pmi0("additional_layouts")
    private final List<GiftsGiftBaseUrlConfigAdditionalLayoutDto> additionalLayouts;

    @pmi0("additional_themes")
    private final List<GiftsGiftBaseUrlConfigAdditionalThemeDto> additionalThemes;

    @pmi0("base_url")
    private final String baseUrl;

    @pmi0("version")
    private final Integer version;

    /* compiled from: GiftsGiftBaseUrlConfigDto.kt */
    public static final class a implements Parcelable.Creator<GiftsGiftBaseUrlConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsGiftBaseUrlConfigDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            ArrayList arrayList2 = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(GiftsGiftBaseUrlConfigAdditionalLayoutDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(GiftsGiftBaseUrlConfigAdditionalThemeDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList2 = arrayList3;
            }
            return new GiftsGiftBaseUrlConfigDto(readString, valueOf, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsGiftBaseUrlConfigDto[] newArray(int i) {
            return new GiftsGiftBaseUrlConfigDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GiftsGiftBaseUrlConfigDto(String str, Integer num, List<? extends GiftsGiftBaseUrlConfigAdditionalLayoutDto> list, List<? extends GiftsGiftBaseUrlConfigAdditionalThemeDto> list2) {
        this.baseUrl = str;
        this.version = num;
        this.additionalLayouts = list;
        this.additionalThemes = list2;
    }

    public final List<GiftsGiftBaseUrlConfigAdditionalLayoutDto> d() {
        return this.additionalLayouts;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<GiftsGiftBaseUrlConfigAdditionalThemeDto> e() {
        return this.additionalThemes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsGiftBaseUrlConfigDto)) {
            return false;
        }
        GiftsGiftBaseUrlConfigDto giftsGiftBaseUrlConfigDto = (GiftsGiftBaseUrlConfigDto) obj;
        return epx.f(this.baseUrl, giftsGiftBaseUrlConfigDto.baseUrl) && epx.f(this.version, giftsGiftBaseUrlConfigDto.version) && epx.f(this.additionalLayouts, giftsGiftBaseUrlConfigDto.additionalLayouts) && epx.f(this.additionalThemes, giftsGiftBaseUrlConfigDto.additionalThemes);
    }

    public final String f() {
        return this.baseUrl;
    }

    public final Integer g() {
        return this.version;
    }

    public final int hashCode() {
        int hashCode = this.baseUrl.hashCode() * 31;
        Integer num = this.version;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<GiftsGiftBaseUrlConfigAdditionalLayoutDto> list = this.additionalLayouts;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GiftsGiftBaseUrlConfigAdditionalThemeDto> list2 = this.additionalThemes;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftsGiftBaseUrlConfigDto(baseUrl=");
        sb.append(this.baseUrl);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", additionalLayouts=");
        sb.append(this.additionalLayouts);
        sb.append(", additionalThemes=");
        return ms9.a(')', sb, this.additionalThemes);
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
        List<GiftsGiftBaseUrlConfigAdditionalLayoutDto> list = this.additionalLayouts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((GiftsGiftBaseUrlConfigAdditionalLayoutDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<GiftsGiftBaseUrlConfigAdditionalThemeDto> list2 = this.additionalThemes;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((GiftsGiftBaseUrlConfigAdditionalThemeDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ GiftsGiftBaseUrlConfigDto(String str, Integer num, List list, List list2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}

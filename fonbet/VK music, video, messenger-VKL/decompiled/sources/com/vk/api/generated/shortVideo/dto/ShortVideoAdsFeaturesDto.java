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

/* compiled from: ShortVideoAdsFeaturesDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoAdsFeaturesDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoAdsFeaturesDto> CREATOR = new a();

    @pmi0("ads_flags")
    private final List<ShortVideoShortVideoAdsFlagDto> adsFlags;

    @pmi0("articles")
    private final String articles;

    @pmi0("wb_item_id")
    private final List<String> wbItemId;

    /* compiled from: ShortVideoAdsFeaturesDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoAdsFeaturesDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoAdsFeaturesDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(ShortVideoShortVideoAdsFlagDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new ShortVideoAdsFeaturesDto(readString, createStringArrayList, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoAdsFeaturesDto[] newArray(int i) {
            return new ShortVideoAdsFeaturesDto[i];
        }
    }

    public ShortVideoAdsFeaturesDto() {
        this(null, null, null, 7, null);
    }

    public final List<ShortVideoShortVideoAdsFlagDto> d() {
        return this.adsFlags;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.articles;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoAdsFeaturesDto)) {
            return false;
        }
        ShortVideoAdsFeaturesDto shortVideoAdsFeaturesDto = (ShortVideoAdsFeaturesDto) obj;
        return epx.f(this.articles, shortVideoAdsFeaturesDto.articles) && epx.f(this.wbItemId, shortVideoAdsFeaturesDto.wbItemId) && epx.f(this.adsFlags, shortVideoAdsFeaturesDto.adsFlags);
    }

    public final List<String> f() {
        return this.wbItemId;
    }

    public final int hashCode() {
        String str = this.articles;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.wbItemId;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ShortVideoShortVideoAdsFlagDto> list2 = this.adsFlags;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoAdsFeaturesDto(articles=");
        sb.append(this.articles);
        sb.append(", wbItemId=");
        sb.append(this.wbItemId);
        sb.append(", adsFlags=");
        return ms9.a(')', sb, this.adsFlags);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.articles);
        parcel.writeStringList(this.wbItemId);
        List<ShortVideoShortVideoAdsFlagDto> list = this.adsFlags;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((ShortVideoShortVideoAdsFlagDto) f.next()).writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoAdsFeaturesDto(String str, List<String> list, List<? extends ShortVideoShortVideoAdsFlagDto> list2) {
        this.articles = str;
        this.wbItemId = list;
        this.adsFlags = list2;
    }

    public /* synthetic */ ShortVideoAdsFeaturesDto(String str, List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}

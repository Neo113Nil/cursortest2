package com.vk.api.generated.marusia.dto;

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
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarusiaWidgetHeaderDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaWidgetHeaderDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaWidgetHeaderDto> CREATOR = new a();

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    /* compiled from: MarusiaWidgetHeaderDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaWidgetHeaderDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaWidgetHeaderDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MarusiaWidgetHeaderDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarusiaWidgetHeaderDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaWidgetHeaderDto[] newArray(int i) {
            return new MarusiaWidgetHeaderDto[i];
        }
    }

    public MarusiaWidgetHeaderDto(String str, String str2, List<BaseImageDto> list) {
        this.title = str;
        this.url = str2;
        this.icons = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaWidgetHeaderDto)) {
            return false;
        }
        MarusiaWidgetHeaderDto marusiaWidgetHeaderDto = (MarusiaWidgetHeaderDto) obj;
        return epx.f(this.title, marusiaWidgetHeaderDto.title) && epx.f(this.url, marusiaWidgetHeaderDto.url) && epx.f(this.icons, marusiaWidgetHeaderDto.icons);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.title.hashCode() * 31, 31, this.url);
        List<BaseImageDto> list = this.icons;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarusiaWidgetHeaderDto(title=");
        sb.append(this.title);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", icons=");
        return ms9.a(')', sb, this.icons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        List<BaseImageDto> list = this.icons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ MarusiaWidgetHeaderDto(String str, String str2, List list, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : list);
    }
}

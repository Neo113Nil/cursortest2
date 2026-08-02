package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketTextWithTitleDto.kt */
/* loaded from: classes15.dex */
public final class MarketTextWithTitleDto implements Parcelable {
    public static final Parcelable.Creator<MarketTextWithTitleDto> CREATOR = new a();

    @pmi0("integration_icon")
    private final List<BaseImageDto> integrationIcon;

    @pmi0("on_empty_text")
    private final String onEmptyText;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketTextWithTitleDto.kt */
    public static final class a implements Parcelable.Creator<MarketTextWithTitleDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketTextWithTitleDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BaseImageDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketTextWithTitleDto(readString, readString2, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketTextWithTitleDto[] newArray(int i) {
            return new MarketTextWithTitleDto[i];
        }
    }

    public MarketTextWithTitleDto(String str, String str2, String str3, List<BaseImageDto> list) {
        this.title = str;
        this.text = str2;
        this.onEmptyText = str3;
        this.integrationIcon = list;
    }

    public final List<BaseImageDto> d() {
        return this.integrationIcon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.onEmptyText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketTextWithTitleDto)) {
            return false;
        }
        MarketTextWithTitleDto marketTextWithTitleDto = (MarketTextWithTitleDto) obj;
        return epx.f(this.title, marketTextWithTitleDto.title) && epx.f(this.text, marketTextWithTitleDto.text) && epx.f(this.onEmptyText, marketTextWithTitleDto.onEmptyText) && epx.f(this.integrationIcon, marketTextWithTitleDto.integrationIcon);
    }

    public final String f() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.text), 31, this.onEmptyText);
        List<BaseImageDto> list = this.integrationIcon;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketTextWithTitleDto(title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", onEmptyText=");
        sb.append(this.onEmptyText);
        sb.append(", integrationIcon=");
        return ms9.a(')', sb, this.integrationIcon);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.onEmptyText);
        List<BaseImageDto> list = this.integrationIcon;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((BaseImageDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketTextWithTitleDto(String str, String str2, String str3, List list, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : list);
    }
}

package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketServiceRatingWarningDto.kt */
/* loaded from: classes15.dex */
public final class MarketServiceRatingWarningDto implements Parcelable {
    public static final Parcelable.Creator<MarketServiceRatingWarningDto> CREATOR = new a();

    @pmi0("buttons")
    private final List<MarketServiceRatingWarningButtonDto> buttons;

    @pmi0("description")
    private final String description;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    /* compiled from: MarketServiceRatingWarningDto.kt */
    public static final class a implements Parcelable.Creator<MarketServiceRatingWarningDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingWarningDto createFromParcel(Parcel parcel) {
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
                    i = en.a(MarketServiceRatingWarningButtonDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MarketServiceRatingWarningDto(readString, readString2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketServiceRatingWarningDto[] newArray(int i) {
            return new MarketServiceRatingWarningDto[i];
        }
    }

    public MarketServiceRatingWarningDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketServiceRatingWarningDto)) {
            return false;
        }
        MarketServiceRatingWarningDto marketServiceRatingWarningDto = (MarketServiceRatingWarningDto) obj;
        return epx.f(this.title, marketServiceRatingWarningDto.title) && epx.f(this.description, marketServiceRatingWarningDto.description) && epx.f(this.buttons, marketServiceRatingWarningDto.buttons) && epx.f(this.type, marketServiceRatingWarningDto.type);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<MarketServiceRatingWarningButtonDto> list = this.buttons;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.type;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketServiceRatingWarningDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", buttons=");
        sb.append(this.buttons);
        sb.append(", type=");
        return ho8.a(sb, this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        List<MarketServiceRatingWarningButtonDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketServiceRatingWarningButtonDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.type);
    }

    public MarketServiceRatingWarningDto(String str, String str2, List<MarketServiceRatingWarningButtonDto> list, String str3) {
        this.title = str;
        this.description = str2;
        this.buttons = list;
        this.type = str3;
    }

    public /* synthetic */ MarketServiceRatingWarningDto(String str, String str2, List list, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str3);
    }
}

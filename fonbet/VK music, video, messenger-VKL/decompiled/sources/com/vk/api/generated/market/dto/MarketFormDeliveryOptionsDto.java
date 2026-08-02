package com.vk.api.generated.market.dto;

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
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketFormDeliveryOptionsDto.kt */
/* loaded from: classes15.dex */
public final class MarketFormDeliveryOptionsDto implements Parcelable {
    public static final Parcelable.Creator<MarketFormDeliveryOptionsDto> CREATOR = new a();

    @pmi0("blocks")
    private final List<MarketCheckoutOrderSettingsFormControlDto> blocks;

    @pmi0("default_message")
    private final String defaultMessage;

    @pmi0("info")
    private final String info;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    /* compiled from: MarketFormDeliveryOptionsDto.kt */
    public static final class a implements Parcelable.Creator<MarketFormDeliveryOptionsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketFormDeliveryOptionsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MarketCheckoutOrderSettingsFormControlDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new MarketFormDeliveryOptionsDto(readString, readString2, readString3, readString4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketFormDeliveryOptionsDto[] newArray(int i) {
            return new MarketFormDeliveryOptionsDto[i];
        }
    }

    public MarketFormDeliveryOptionsDto(String str, String str2, String str3, String str4, List<MarketCheckoutOrderSettingsFormControlDto> list) {
        this.type = str;
        this.title = str2;
        this.defaultMessage = str3;
        this.info = str4;
        this.blocks = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketFormDeliveryOptionsDto)) {
            return false;
        }
        MarketFormDeliveryOptionsDto marketFormDeliveryOptionsDto = (MarketFormDeliveryOptionsDto) obj;
        return epx.f(this.type, marketFormDeliveryOptionsDto.type) && epx.f(this.title, marketFormDeliveryOptionsDto.title) && epx.f(this.defaultMessage, marketFormDeliveryOptionsDto.defaultMessage) && epx.f(this.info, marketFormDeliveryOptionsDto.info) && epx.f(this.blocks, marketFormDeliveryOptionsDto.blocks);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.title), 31, this.defaultMessage);
        String str = this.info;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<MarketCheckoutOrderSettingsFormControlDto> list = this.blocks;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketFormDeliveryOptionsDto(type=");
        sb.append(this.type);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", defaultMessage=");
        sb.append(this.defaultMessage);
        sb.append(", info=");
        sb.append(this.info);
        sb.append(", blocks=");
        return ms9.a(')', sb, this.blocks);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        parcel.writeString(this.defaultMessage);
        parcel.writeString(this.info);
        List<MarketCheckoutOrderSettingsFormControlDto> list = this.blocks;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((MarketCheckoutOrderSettingsFormControlDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketFormDeliveryOptionsDto(String str, String str2, String str3, String str4, List list, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list);
    }
}

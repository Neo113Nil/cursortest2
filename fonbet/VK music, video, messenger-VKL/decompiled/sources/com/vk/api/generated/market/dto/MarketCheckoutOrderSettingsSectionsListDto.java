package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4572u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketCheckoutOrderSettingsSectionsListDto.kt */
/* loaded from: classes15.dex */
public final class MarketCheckoutOrderSettingsSectionsListDto implements Parcelable {
    public static final Parcelable.Creator<MarketCheckoutOrderSettingsSectionsListDto> CREATOR = new a();

    @pmi0("comment")
    private final List<MarketCheckoutOrderSettingsSectionDto> comment;

    @pmi0(C4572u.g)
    private final List<MarketCheckoutOrderSettingsSectionDto> delivery;

    @pmi0("payment")
    private final List<MarketCheckoutOrderSettingsSectionDto> payment;

    @pmi0("recipient")
    private final List<MarketCheckoutOrderSettingsSectionDto> recipient;

    /* compiled from: MarketCheckoutOrderSettingsSectionsListDto.kt */
    public static final class a implements Parcelable.Creator<MarketCheckoutOrderSettingsSectionsListDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutOrderSettingsSectionsListDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int i = 0;
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(MarketCheckoutOrderSettingsSectionDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(MarketCheckoutOrderSettingsSectionDto.CREATOR, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i4 = 0;
                while (i4 != readInt3) {
                    i4 = en.a(MarketCheckoutOrderSettingsSectionDto.CREATOR, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList4 = new ArrayList(readInt4);
                while (i != readInt4) {
                    i = en.a(MarketCheckoutOrderSettingsSectionDto.CREATOR, parcel, arrayList4, i, 1);
                }
            }
            return new MarketCheckoutOrderSettingsSectionsListDto(arrayList, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutOrderSettingsSectionsListDto[] newArray(int i) {
            return new MarketCheckoutOrderSettingsSectionsListDto[i];
        }
    }

    public MarketCheckoutOrderSettingsSectionsListDto() {
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
        if (!(obj instanceof MarketCheckoutOrderSettingsSectionsListDto)) {
            return false;
        }
        MarketCheckoutOrderSettingsSectionsListDto marketCheckoutOrderSettingsSectionsListDto = (MarketCheckoutOrderSettingsSectionsListDto) obj;
        return epx.f(this.delivery, marketCheckoutOrderSettingsSectionsListDto.delivery) && epx.f(this.recipient, marketCheckoutOrderSettingsSectionsListDto.recipient) && epx.f(this.comment, marketCheckoutOrderSettingsSectionsListDto.comment) && epx.f(this.payment, marketCheckoutOrderSettingsSectionsListDto.payment);
    }

    public final int hashCode() {
        List<MarketCheckoutOrderSettingsSectionDto> list = this.delivery;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<MarketCheckoutOrderSettingsSectionDto> list2 = this.recipient;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MarketCheckoutOrderSettingsSectionDto> list3 = this.comment;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MarketCheckoutOrderSettingsSectionDto> list4 = this.payment;
        return hashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCheckoutOrderSettingsSectionsListDto(delivery=");
        sb.append(this.delivery);
        sb.append(", recipient=");
        sb.append(this.recipient);
        sb.append(", comment=");
        sb.append(this.comment);
        sb.append(", payment=");
        return ms9.a(')', sb, this.payment);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<MarketCheckoutOrderSettingsSectionDto> list = this.delivery;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketCheckoutOrderSettingsSectionDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketCheckoutOrderSettingsSectionDto> list2 = this.recipient;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MarketCheckoutOrderSettingsSectionDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketCheckoutOrderSettingsSectionDto> list3 = this.comment;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((MarketCheckoutOrderSettingsSectionDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketCheckoutOrderSettingsSectionDto> list4 = this.payment;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f4 = dn.f(parcel, list4, 1);
        while (f4.hasNext()) {
            ((MarketCheckoutOrderSettingsSectionDto) f4.next()).writeToParcel(parcel, i);
        }
    }

    public MarketCheckoutOrderSettingsSectionsListDto(List<MarketCheckoutOrderSettingsSectionDto> list, List<MarketCheckoutOrderSettingsSectionDto> list2, List<MarketCheckoutOrderSettingsSectionDto> list3, List<MarketCheckoutOrderSettingsSectionDto> list4) {
        this.delivery = list;
        this.recipient = list2;
        this.comment = list3;
        this.payment = list4;
    }

    public /* synthetic */ MarketCheckoutOrderSettingsSectionsListDto(List list, List list2, List list3, List list4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4);
    }
}

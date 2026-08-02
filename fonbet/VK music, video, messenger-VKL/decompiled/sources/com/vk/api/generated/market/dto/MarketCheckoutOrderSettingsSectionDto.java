package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: MarketCheckoutOrderSettingsSectionDto.kt */
/* loaded from: classes15.dex */
public final class MarketCheckoutOrderSettingsSectionDto implements Parcelable {
    public static final Parcelable.Creator<MarketCheckoutOrderSettingsSectionDto> CREATOR = new a();

    @pmi0("form")
    private final List<MarketCheckoutOrderSettingsFormControlDto> form;

    @pmi0("id")
    private final String id;

    /* compiled from: MarketCheckoutOrderSettingsSectionDto.kt */
    public static final class a implements Parcelable.Creator<MarketCheckoutOrderSettingsSectionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutOrderSettingsSectionDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MarketCheckoutOrderSettingsFormControlDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketCheckoutOrderSettingsSectionDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutOrderSettingsSectionDto[] newArray(int i) {
            return new MarketCheckoutOrderSettingsSectionDto[i];
        }
    }

    public MarketCheckoutOrderSettingsSectionDto(String str, List<MarketCheckoutOrderSettingsFormControlDto> list) {
        this.id = str;
        this.form = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCheckoutOrderSettingsSectionDto)) {
            return false;
        }
        MarketCheckoutOrderSettingsSectionDto marketCheckoutOrderSettingsSectionDto = (MarketCheckoutOrderSettingsSectionDto) obj;
        return epx.f(this.id, marketCheckoutOrderSettingsSectionDto.id) && epx.f(this.form, marketCheckoutOrderSettingsSectionDto.form);
    }

    public final int hashCode() {
        return this.form.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCheckoutOrderSettingsSectionDto(id=");
        sb.append(this.id);
        sb.append(", form=");
        return ms9.a(')', sb, this.form);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        Iterator a2 = ao.a(parcel, this.form);
        while (a2.hasNext()) {
            ((MarketCheckoutOrderSettingsFormControlDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}

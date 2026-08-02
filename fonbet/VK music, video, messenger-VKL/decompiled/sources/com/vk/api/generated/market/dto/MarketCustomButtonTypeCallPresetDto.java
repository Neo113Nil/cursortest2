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

/* compiled from: MarketCustomButtonTypeCallPresetDto.kt */
/* loaded from: classes15.dex */
public final class MarketCustomButtonTypeCallPresetDto implements Parcelable {
    public static final Parcelable.Creator<MarketCustomButtonTypeCallPresetDto> CREATOR = new a();

    @pmi0("timezones")
    private final List<MarketCustomButtonTypeCallPresetTimezoneDto> timezones;

    @pmi0("validation_regex")
    private final String validationRegex;

    @pmi0("validation_regex_error_msg")
    private final String validationRegexErrorMsg;

    @pmi0("weekdays")
    private final List<MarketCustomButtonTypeCallPresetWeekdayDto> weekdays;

    /* compiled from: MarketCustomButtonTypeCallPresetDto.kt */
    public static final class a implements Parcelable.Creator<MarketCustomButtonTypeCallPresetDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonTypeCallPresetDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(MarketCustomButtonTypeCallPresetTimezoneDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(MarketCustomButtonTypeCallPresetWeekdayDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new MarketCustomButtonTypeCallPresetDto(readString, readString2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCustomButtonTypeCallPresetDto[] newArray(int i) {
            return new MarketCustomButtonTypeCallPresetDto[i];
        }
    }

    public MarketCustomButtonTypeCallPresetDto(String str, String str2, List<MarketCustomButtonTypeCallPresetTimezoneDto> list, List<MarketCustomButtonTypeCallPresetWeekdayDto> list2) {
        this.validationRegex = str;
        this.validationRegexErrorMsg = str2;
        this.timezones = list;
        this.weekdays = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCustomButtonTypeCallPresetDto)) {
            return false;
        }
        MarketCustomButtonTypeCallPresetDto marketCustomButtonTypeCallPresetDto = (MarketCustomButtonTypeCallPresetDto) obj;
        return epx.f(this.validationRegex, marketCustomButtonTypeCallPresetDto.validationRegex) && epx.f(this.validationRegexErrorMsg, marketCustomButtonTypeCallPresetDto.validationRegexErrorMsg) && epx.f(this.timezones, marketCustomButtonTypeCallPresetDto.timezones) && epx.f(this.weekdays, marketCustomButtonTypeCallPresetDto.weekdays);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.validationRegex.hashCode() * 31, 31, this.validationRegexErrorMsg);
        List<MarketCustomButtonTypeCallPresetTimezoneDto> list = this.timezones;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<MarketCustomButtonTypeCallPresetWeekdayDto> list2 = this.weekdays;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCustomButtonTypeCallPresetDto(validationRegex=");
        sb.append(this.validationRegex);
        sb.append(", validationRegexErrorMsg=");
        sb.append(this.validationRegexErrorMsg);
        sb.append(", timezones=");
        sb.append(this.timezones);
        sb.append(", weekdays=");
        return ms9.a(')', sb, this.weekdays);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.validationRegex);
        parcel.writeString(this.validationRegexErrorMsg);
        List<MarketCustomButtonTypeCallPresetTimezoneDto> list = this.timezones;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketCustomButtonTypeCallPresetTimezoneDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketCustomButtonTypeCallPresetWeekdayDto> list2 = this.weekdays;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((MarketCustomButtonTypeCallPresetWeekdayDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketCustomButtonTypeCallPresetDto(String str, String str2, List list, List list2, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}

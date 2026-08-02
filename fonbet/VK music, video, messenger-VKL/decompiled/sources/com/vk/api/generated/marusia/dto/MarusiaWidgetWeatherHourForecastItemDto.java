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
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MarusiaWidgetWeatherHourForecastItemDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaWidgetWeatherHourForecastItemDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaWidgetWeatherHourForecastItemDto> CREATOR = new a();

    @pmi0("date")
    private final String date;

    @pmi0("hour")
    private final int hour;

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("temperature")
    private final int temperature;

    @pmi0("temperature_comf")
    private final Integer temperatureComf;

    /* compiled from: MarusiaWidgetWeatherHourForecastItemDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaWidgetWeatherHourForecastItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaWidgetWeatherHourForecastItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = bo.b(MarusiaWidgetWeatherHourForecastItemDto.class, parcel, arrayList, i, 1);
                }
            }
            return new MarusiaWidgetWeatherHourForecastItemDto(readString, readInt, readInt2, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaWidgetWeatherHourForecastItemDto[] newArray(int i) {
            return new MarusiaWidgetWeatherHourForecastItemDto[i];
        }
    }

    public MarusiaWidgetWeatherHourForecastItemDto(String str, int i, int i2, List<BaseImageDto> list, Integer num) {
        this.date = str;
        this.hour = i;
        this.temperature = i2;
        this.icons = list;
        this.temperatureComf = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaWidgetWeatherHourForecastItemDto)) {
            return false;
        }
        MarusiaWidgetWeatherHourForecastItemDto marusiaWidgetWeatherHourForecastItemDto = (MarusiaWidgetWeatherHourForecastItemDto) obj;
        return epx.f(this.date, marusiaWidgetWeatherHourForecastItemDto.date) && this.hour == marusiaWidgetWeatherHourForecastItemDto.hour && this.temperature == marusiaWidgetWeatherHourForecastItemDto.temperature && epx.f(this.icons, marusiaWidgetWeatherHourForecastItemDto.icons) && epx.f(this.temperatureComf, marusiaWidgetWeatherHourForecastItemDto.temperatureComf);
    }

    public final int hashCode() {
        int a2 = shy.a(this.temperature, shy.a(this.hour, this.date.hashCode() * 31, 31), 31);
        List<BaseImageDto> list = this.icons;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.temperatureComf;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarusiaWidgetWeatherHourForecastItemDto(date=");
        sb.append(this.date);
        sb.append(", hour=");
        sb.append(this.hour);
        sb.append(", temperature=");
        sb.append(this.temperature);
        sb.append(", icons=");
        sb.append(this.icons);
        sb.append(", temperatureComf=");
        return uqi.b(sb, this.temperatureComf, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.date);
        parcel.writeInt(this.hour);
        parcel.writeInt(this.temperature);
        List<BaseImageDto> list = this.icons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Integer num = this.temperatureComf;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ MarusiaWidgetWeatherHourForecastItemDto(String str, int i, int i2, List list, Integer num, int i3, zcl zclVar) {
        this(str, i, i2, (i3 & 8) != 0 ? null : list, (i3 & 16) != 0 ? null : num);
    }
}

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
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarusiaWidgetCurrentWeatherDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaWidgetCurrentWeatherDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaWidgetCurrentWeatherDto> CREATOR = new a();

    @pmi0("city_name")
    private final String cityName;

    @pmi0("description")
    private final String description;

    @pmi0("humidity")
    private final int humidity;

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("pressure")
    private final int pressure;

    @pmi0("temperature")
    private final int temperature;

    @pmi0("temperature_comf")
    private final int temperatureComf;

    @pmi0("wind_dir")
    private final String windDir;

    @pmi0("wind_speed")
    private final int windSpeed;

    /* compiled from: MarusiaWidgetCurrentWeatherDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaWidgetCurrentWeatherDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaWidgetCurrentWeatherDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            String readString = parcel.readString();
            int readInt5 = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList = new ArrayList(readInt6);
                int i = 0;
                while (i != readInt6) {
                    i = bo.b(MarusiaWidgetCurrentWeatherDto.class, parcel, arrayList, i, 1);
                }
            }
            return new MarusiaWidgetCurrentWeatherDto(readInt, readInt2, readInt3, readInt4, readString, readInt5, readString2, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaWidgetCurrentWeatherDto[] newArray(int i) {
            return new MarusiaWidgetCurrentWeatherDto[i];
        }
    }

    public MarusiaWidgetCurrentWeatherDto(int i, int i2, int i3, int i4, String str, int i5, String str2, String str3, List<BaseImageDto> list) {
        this.temperature = i;
        this.temperatureComf = i2;
        this.pressure = i3;
        this.humidity = i4;
        this.windDir = str;
        this.windSpeed = i5;
        this.description = str2;
        this.cityName = str3;
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
        if (!(obj instanceof MarusiaWidgetCurrentWeatherDto)) {
            return false;
        }
        MarusiaWidgetCurrentWeatherDto marusiaWidgetCurrentWeatherDto = (MarusiaWidgetCurrentWeatherDto) obj;
        return this.temperature == marusiaWidgetCurrentWeatherDto.temperature && this.temperatureComf == marusiaWidgetCurrentWeatherDto.temperatureComf && this.pressure == marusiaWidgetCurrentWeatherDto.pressure && this.humidity == marusiaWidgetCurrentWeatherDto.humidity && epx.f(this.windDir, marusiaWidgetCurrentWeatherDto.windDir) && this.windSpeed == marusiaWidgetCurrentWeatherDto.windSpeed && epx.f(this.description, marusiaWidgetCurrentWeatherDto.description) && epx.f(this.cityName, marusiaWidgetCurrentWeatherDto.cityName) && epx.f(this.icons, marusiaWidgetCurrentWeatherDto.icons);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(shy.a(this.windSpeed, urd0.a(shy.a(this.humidity, shy.a(this.pressure, shy.a(this.temperatureComf, Integer.hashCode(this.temperature) * 31, 31), 31), 31), 31, this.windDir), 31), 31, this.description), 31, this.cityName);
        List<BaseImageDto> list = this.icons;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarusiaWidgetCurrentWeatherDto(temperature=");
        sb.append(this.temperature);
        sb.append(", temperatureComf=");
        sb.append(this.temperatureComf);
        sb.append(", pressure=");
        sb.append(this.pressure);
        sb.append(", humidity=");
        sb.append(this.humidity);
        sb.append(", windDir=");
        sb.append(this.windDir);
        sb.append(", windSpeed=");
        sb.append(this.windSpeed);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", cityName=");
        sb.append(this.cityName);
        sb.append(", icons=");
        return ms9.a(')', sb, this.icons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.temperature);
        parcel.writeInt(this.temperatureComf);
        parcel.writeInt(this.pressure);
        parcel.writeInt(this.humidity);
        parcel.writeString(this.windDir);
        parcel.writeInt(this.windSpeed);
        parcel.writeString(this.description);
        parcel.writeString(this.cityName);
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

    public /* synthetic */ MarusiaWidgetCurrentWeatherDto(int i, int i2, int i3, int i4, String str, int i5, String str2, String str3, List list, int i6, zcl zclVar) {
        this(i, i2, i3, i4, str, i5, str2, str3, (i6 & 256) != 0 ? null : list);
    }
}

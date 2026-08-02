package com.vk.api.generated.superApp.dto;

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

/* compiled from: SuperAppWidgetDeliveryClubRestaurantDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppWidgetDeliveryClubRestaurantDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppWidgetDeliveryClubRestaurantDto> CREATOR = new a();

    @pmi0("delivery_time")
    private final String deliveryTime;

    @pmi0("logo")
    private final List<BaseImageDto> logo;

    @pmi0("name")
    private final String name;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* compiled from: SuperAppWidgetDeliveryClubRestaurantDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetDeliveryClubRestaurantDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetDeliveryClubRestaurantDto createFromParcel(Parcel parcel) {
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
                    i = bo.b(SuperAppWidgetDeliveryClubRestaurantDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new SuperAppWidgetDeliveryClubRestaurantDto(readString, readString2, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetDeliveryClubRestaurantDto[] newArray(int i) {
            return new SuperAppWidgetDeliveryClubRestaurantDto[i];
        }
    }

    public SuperAppWidgetDeliveryClubRestaurantDto(String str, String str2, String str3, List<BaseImageDto> list) {
        this.name = str;
        this.webviewUrl = str2;
        this.deliveryTime = str3;
        this.logo = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppWidgetDeliveryClubRestaurantDto)) {
            return false;
        }
        SuperAppWidgetDeliveryClubRestaurantDto superAppWidgetDeliveryClubRestaurantDto = (SuperAppWidgetDeliveryClubRestaurantDto) obj;
        return epx.f(this.name, superAppWidgetDeliveryClubRestaurantDto.name) && epx.f(this.webviewUrl, superAppWidgetDeliveryClubRestaurantDto.webviewUrl) && epx.f(this.deliveryTime, superAppWidgetDeliveryClubRestaurantDto.deliveryTime) && epx.f(this.logo, superAppWidgetDeliveryClubRestaurantDto.logo);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.name.hashCode() * 31, 31, this.webviewUrl);
        String str = this.deliveryTime;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseImageDto> list = this.logo;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppWidgetDeliveryClubRestaurantDto(name=");
        sb.append(this.name);
        sb.append(", webviewUrl=");
        sb.append(this.webviewUrl);
        sb.append(", deliveryTime=");
        sb.append(this.deliveryTime);
        sb.append(", logo=");
        return ms9.a(')', sb, this.logo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.webviewUrl);
        parcel.writeString(this.deliveryTime);
        List<BaseImageDto> list = this.logo;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ SuperAppWidgetDeliveryClubRestaurantDto(String str, String str2, String str3, List list, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list);
    }
}

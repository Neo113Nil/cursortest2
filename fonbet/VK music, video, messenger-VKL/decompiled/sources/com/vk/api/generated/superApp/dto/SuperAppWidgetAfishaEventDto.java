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
import xsna.zcl;

/* compiled from: SuperAppWidgetAfishaEventDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppWidgetAfishaEventDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppWidgetAfishaEventDto> CREATOR = new a();

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("start_time")
    private final String startTime;

    @pmi0("title")
    private final String title;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* compiled from: SuperAppWidgetAfishaEventDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetAfishaEventDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetAfishaEventDto createFromParcel(Parcel parcel) {
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
                    i = bo.b(SuperAppWidgetAfishaEventDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new SuperAppWidgetAfishaEventDto(readString, readString2, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetAfishaEventDto[] newArray(int i) {
            return new SuperAppWidgetAfishaEventDto[i];
        }
    }

    public SuperAppWidgetAfishaEventDto(String str, String str2, String str3, List<BaseImageDto> list) {
        this.title = str;
        this.startTime = str2;
        this.webviewUrl = str3;
        this.image = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppWidgetAfishaEventDto)) {
            return false;
        }
        SuperAppWidgetAfishaEventDto superAppWidgetAfishaEventDto = (SuperAppWidgetAfishaEventDto) obj;
        return epx.f(this.title, superAppWidgetAfishaEventDto.title) && epx.f(this.startTime, superAppWidgetAfishaEventDto.startTime) && epx.f(this.webviewUrl, superAppWidgetAfishaEventDto.webviewUrl) && epx.f(this.image, superAppWidgetAfishaEventDto.image);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.startTime;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.webviewUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseImageDto> list = this.image;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppWidgetAfishaEventDto(title=");
        sb.append(this.title);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", webviewUrl=");
        sb.append(this.webviewUrl);
        sb.append(", image=");
        return ms9.a(')', sb, this.image);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.startTime);
        parcel.writeString(this.webviewUrl);
        List<BaseImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ SuperAppWidgetAfishaEventDto(String str, String str2, String str3, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list);
    }
}

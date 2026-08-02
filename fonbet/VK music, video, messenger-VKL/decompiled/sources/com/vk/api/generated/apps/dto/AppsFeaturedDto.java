package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AppsFeaturedDto.kt */
/* loaded from: classes14.dex */
public final class AppsFeaturedDto implements Parcelable {
    public static final Parcelable.Creator<AppsFeaturedDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("items")
    private final List<AppsAppDto> items;

    @pmi0("title")
    private final String title;

    /* compiled from: AppsFeaturedDto.kt */
    public static final class a implements Parcelable.Creator<AppsFeaturedDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsFeaturedDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(AppsFeaturedDto.class, parcel, arrayList, i, 1);
            }
            return new AppsFeaturedDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsFeaturedDto[] newArray(int i) {
            return new AppsFeaturedDto[i];
        }
    }

    public AppsFeaturedDto(String str, String str2, List<AppsAppDto> list) {
        this.title = str;
        this.description = str2;
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsFeaturedDto)) {
            return false;
        }
        AppsFeaturedDto appsFeaturedDto = (AppsFeaturedDto) obj;
        return epx.f(this.title, appsFeaturedDto.title) && epx.f(this.description, appsFeaturedDto.description) && epx.f(this.items, appsFeaturedDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.description);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsFeaturedDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}

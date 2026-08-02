package com.vk.api.generated.apps.dto;

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

/* compiled from: AppsGetActionMenuAppsResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetActionMenuAppsResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetActionMenuAppsResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<AppsHintAppItemDto> items;

    @pmi0("title")
    private final String title;

    /* compiled from: AppsGetActionMenuAppsResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetActionMenuAppsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetActionMenuAppsResponseDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AppsHintAppItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AppsGetActionMenuAppsResponseDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetActionMenuAppsResponseDto[] newArray(int i) {
            return new AppsGetActionMenuAppsResponseDto[i];
        }
    }

    public AppsGetActionMenuAppsResponseDto(String str, List<AppsHintAppItemDto> list) {
        this.title = str;
        this.items = list;
    }

    public final List<AppsHintAppItemDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetActionMenuAppsResponseDto)) {
            return false;
        }
        AppsGetActionMenuAppsResponseDto appsGetActionMenuAppsResponseDto = (AppsGetActionMenuAppsResponseDto) obj;
        return epx.f(this.title, appsGetActionMenuAppsResponseDto.title) && epx.f(this.items, appsGetActionMenuAppsResponseDto.items);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetActionMenuAppsResponseDto(title=");
        sb.append(this.title);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AppsHintAppItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}

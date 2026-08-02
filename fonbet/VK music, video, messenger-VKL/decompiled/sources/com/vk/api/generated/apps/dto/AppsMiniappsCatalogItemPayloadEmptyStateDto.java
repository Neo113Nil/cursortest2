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
import xsna.urd0;

/* compiled from: AppsMiniappsCatalogItemPayloadEmptyStateDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadEmptyStateDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadEmptyStateDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("recommended_apps")
    private final List<AppsMiniappsCatalogGameDto> recommendedApps;

    @pmi0("title")
    private final String title;

    /* compiled from: AppsMiniappsCatalogItemPayloadEmptyStateDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadEmptyStateDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadEmptyStateDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AppsMiniappsCatalogGameDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AppsMiniappsCatalogItemPayloadEmptyStateDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadEmptyStateDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadEmptyStateDto[i];
        }
    }

    public AppsMiniappsCatalogItemPayloadEmptyStateDto(String str, String str2, List<AppsMiniappsCatalogGameDto> list) {
        this.title = str;
        this.description = str2;
        this.recommendedApps = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsCatalogItemPayloadEmptyStateDto)) {
            return false;
        }
        AppsMiniappsCatalogItemPayloadEmptyStateDto appsMiniappsCatalogItemPayloadEmptyStateDto = (AppsMiniappsCatalogItemPayloadEmptyStateDto) obj;
        return epx.f(this.title, appsMiniappsCatalogItemPayloadEmptyStateDto.title) && epx.f(this.description, appsMiniappsCatalogItemPayloadEmptyStateDto.description) && epx.f(this.recommendedApps, appsMiniappsCatalogItemPayloadEmptyStateDto.recommendedApps);
    }

    public final int hashCode() {
        return this.recommendedApps.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.description);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadEmptyStateDto(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", recommendedApps=");
        return ms9.a(')', sb, this.recommendedApps);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Iterator a2 = ao.a(parcel, this.recommendedApps);
        while (a2.hasNext()) {
            ((AppsMiniappsCatalogGameDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}

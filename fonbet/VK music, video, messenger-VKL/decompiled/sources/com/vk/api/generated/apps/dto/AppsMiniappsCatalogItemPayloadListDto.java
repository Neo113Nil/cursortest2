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

/* compiled from: AppsMiniappsCatalogItemPayloadListDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadListDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadListDto> CREATOR = new a();

    @pmi0("items")
    private final List<AppsMiniappsCatalogItemPayloadListItemDto> items;

    @pmi0("type")
    private final AppsMiniappsCatalogItemPayloadListTypeDto type;

    /* compiled from: AppsMiniappsCatalogItemPayloadListDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadListDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadListDto createFromParcel(Parcel parcel) {
            AppsMiniappsCatalogItemPayloadListTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadListTypeDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AppsMiniappsCatalogItemPayloadListItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AppsMiniappsCatalogItemPayloadListDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadListDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadListDto[i];
        }
    }

    public AppsMiniappsCatalogItemPayloadListDto(AppsMiniappsCatalogItemPayloadListTypeDto appsMiniappsCatalogItemPayloadListTypeDto, List<AppsMiniappsCatalogItemPayloadListItemDto> list) {
        this.type = appsMiniappsCatalogItemPayloadListTypeDto;
        this.items = list;
    }

    public final List<AppsMiniappsCatalogItemPayloadListItemDto> d() {
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
        if (!(obj instanceof AppsMiniappsCatalogItemPayloadListDto)) {
            return false;
        }
        AppsMiniappsCatalogItemPayloadListDto appsMiniappsCatalogItemPayloadListDto = (AppsMiniappsCatalogItemPayloadListDto) obj;
        return this.type == appsMiniappsCatalogItemPayloadListDto.type && epx.f(this.items, appsMiniappsCatalogItemPayloadListDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadListDto(type=");
        sb.append(this.type);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AppsMiniappsCatalogItemPayloadListItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}

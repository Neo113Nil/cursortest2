package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsMiniappsCatalogItemPayloadAppsDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadAppsDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadAppsDto> CREATOR = new a();

    @pmi0("apps")
    private final List<AppsMiniappsCatalogAppDto> apps;

    @pmi0("section_id")
    private final String sectionId;

    @pmi0("type")
    private final AppsMiniappsCatalogItemPayloadAppsTypeDto type;

    /* compiled from: AppsMiniappsCatalogItemPayloadAppsDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadAppsDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadAppsDto createFromParcel(Parcel parcel) {
            AppsMiniappsCatalogItemPayloadAppsTypeDto createFromParcel = AppsMiniappsCatalogItemPayloadAppsTypeDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AppsMiniappsCatalogAppDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AppsMiniappsCatalogItemPayloadAppsDto(createFromParcel, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadAppsDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadAppsDto[i];
        }
    }

    public AppsMiniappsCatalogItemPayloadAppsDto(AppsMiniappsCatalogItemPayloadAppsTypeDto appsMiniappsCatalogItemPayloadAppsTypeDto, List<AppsMiniappsCatalogAppDto> list, String str) {
        this.type = appsMiniappsCatalogItemPayloadAppsTypeDto;
        this.apps = list;
        this.sectionId = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsCatalogItemPayloadAppsDto)) {
            return false;
        }
        AppsMiniappsCatalogItemPayloadAppsDto appsMiniappsCatalogItemPayloadAppsDto = (AppsMiniappsCatalogItemPayloadAppsDto) obj;
        return this.type == appsMiniappsCatalogItemPayloadAppsDto.type && epx.f(this.apps, appsMiniappsCatalogItemPayloadAppsDto.apps) && epx.f(this.sectionId, appsMiniappsCatalogItemPayloadAppsDto.sectionId);
    }

    public final int hashCode() {
        int a2 = fw3.a(this.type.hashCode() * 31, 31, this.apps);
        String str = this.sectionId;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMiniappsCatalogItemPayloadAppsDto(type=");
        sb.append(this.type);
        sb.append(", apps=");
        sb.append(this.apps);
        sb.append(", sectionId=");
        return ho8.a(sb, this.sectionId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.apps);
        while (a2.hasNext()) {
            ((AppsMiniappsCatalogAppDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.sectionId);
    }

    public /* synthetic */ AppsMiniappsCatalogItemPayloadAppsDto(AppsMiniappsCatalogItemPayloadAppsTypeDto appsMiniappsCatalogItemPayloadAppsTypeDto, List list, String str, int i, zcl zclVar) {
        this(appsMiniappsCatalogItemPayloadAppsTypeDto, list, (i & 4) != 0 ? null : str);
    }
}

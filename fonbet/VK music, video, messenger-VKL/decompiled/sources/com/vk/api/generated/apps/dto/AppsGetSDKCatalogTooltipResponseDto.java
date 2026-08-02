package com.vk.api.generated.apps.dto;

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

/* compiled from: AppsGetSDKCatalogTooltipResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetSDKCatalogTooltipResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetSDKCatalogTooltipResponseDto> CREATOR = new a();

    @pmi0("cover")
    private final List<BaseImageDto> cover;

    @pmi0("install_settings")
    private final List<String> installSettings;

    @pmi0("short_description")
    private final String shortDescription;

    @pmi0("title")
    private final String title;

    /* compiled from: AppsGetSDKCatalogTooltipResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetSDKCatalogTooltipResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetSDKCatalogTooltipResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AppsGetSDKCatalogTooltipResponseDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AppsGetSDKCatalogTooltipResponseDto(readString, readString2, arrayList, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetSDKCatalogTooltipResponseDto[] newArray(int i) {
            return new AppsGetSDKCatalogTooltipResponseDto[i];
        }
    }

    public AppsGetSDKCatalogTooltipResponseDto(String str, String str2, List<BaseImageDto> list, List<String> list2) {
        this.title = str;
        this.shortDescription = str2;
        this.cover = list;
        this.installSettings = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetSDKCatalogTooltipResponseDto)) {
            return false;
        }
        AppsGetSDKCatalogTooltipResponseDto appsGetSDKCatalogTooltipResponseDto = (AppsGetSDKCatalogTooltipResponseDto) obj;
        return epx.f(this.title, appsGetSDKCatalogTooltipResponseDto.title) && epx.f(this.shortDescription, appsGetSDKCatalogTooltipResponseDto.shortDescription) && epx.f(this.cover, appsGetSDKCatalogTooltipResponseDto.cover) && epx.f(this.installSettings, appsGetSDKCatalogTooltipResponseDto.installSettings);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.shortDescription;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseImageDto> list = this.cover;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.installSettings;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetSDKCatalogTooltipResponseDto(title=");
        sb.append(this.title);
        sb.append(", shortDescription=");
        sb.append(this.shortDescription);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", installSettings=");
        return ms9.a(')', sb, this.installSettings);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.shortDescription);
        List<BaseImageDto> list = this.cover;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeStringList(this.installSettings);
    }

    public /* synthetic */ AppsGetSDKCatalogTooltipResponseDto(String str, String str2, List list, List list2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}

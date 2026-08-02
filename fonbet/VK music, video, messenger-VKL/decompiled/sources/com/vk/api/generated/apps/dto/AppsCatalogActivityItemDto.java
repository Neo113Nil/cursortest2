package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsCatalogActivityItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsCatalogActivityItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsCatalogActivityItemDto> CREATOR = new a();

    @pmi0("activity_id")
    private final String activityId;

    @pmi0("app_id")
    private final Integer appId;

    @pmi0("badge")
    private final String badge;

    @pmi0("icon")
    private final List<BaseImageDto> icon;

    @pmi0("name")
    private final String name;

    /* compiled from: AppsCatalogActivityItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsCatalogActivityItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsCatalogActivityItemDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(AppsCatalogActivityItemDto.class, parcel, arrayList, i, 1);
            }
            return new AppsCatalogActivityItemDto(readString, readString2, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsCatalogActivityItemDto[] newArray(int i) {
            return new AppsCatalogActivityItemDto[i];
        }
    }

    public AppsCatalogActivityItemDto(String str, String str2, List<BaseImageDto> list, String str3, Integer num) {
        this.activityId = str;
        this.name = str2;
        this.icon = list;
        this.badge = str3;
        this.appId = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsCatalogActivityItemDto)) {
            return false;
        }
        AppsCatalogActivityItemDto appsCatalogActivityItemDto = (AppsCatalogActivityItemDto) obj;
        return epx.f(this.activityId, appsCatalogActivityItemDto.activityId) && epx.f(this.name, appsCatalogActivityItemDto.name) && epx.f(this.icon, appsCatalogActivityItemDto.icon) && epx.f(this.badge, appsCatalogActivityItemDto.badge) && epx.f(this.appId, appsCatalogActivityItemDto.appId);
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(this.activityId.hashCode() * 31, 31, this.name), 31, this.icon);
        String str = this.badge;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.appId;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsCatalogActivityItemDto(activityId=");
        sb.append(this.activityId);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", badge=");
        sb.append(this.badge);
        sb.append(", appId=");
        return uqi.b(sb, this.appId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.activityId);
        parcel.writeString(this.name);
        Iterator a2 = ao.a(parcel, this.icon);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.badge);
        Integer num = this.appId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ AppsCatalogActivityItemDto(String str, String str2, List list, String str3, Integer num, int i, zcl zclVar) {
        this(str, str2, list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num);
    }
}

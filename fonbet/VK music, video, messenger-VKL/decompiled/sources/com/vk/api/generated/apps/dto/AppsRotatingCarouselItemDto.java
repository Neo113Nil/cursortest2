package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AppsRotatingCarouselItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsRotatingCarouselItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsRotatingCarouselItemDto> CREATOR = new a();

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsMiniappsCatalogAppDto f69app;

    @pmi0("image")
    private final List<BaseImageDto> image;

    /* compiled from: AppsRotatingCarouselItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsRotatingCarouselItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsRotatingCarouselItemDto createFromParcel(Parcel parcel) {
            AppsMiniappsCatalogAppDto createFromParcel = AppsMiniappsCatalogAppDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(AppsRotatingCarouselItemDto.class, parcel, arrayList, i, 1);
            }
            return new AppsRotatingCarouselItemDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsRotatingCarouselItemDto[] newArray(int i) {
            return new AppsRotatingCarouselItemDto[i];
        }
    }

    public AppsRotatingCarouselItemDto(AppsMiniappsCatalogAppDto appsMiniappsCatalogAppDto, List<BaseImageDto> list) {
        this.f69app = appsMiniappsCatalogAppDto;
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
        if (!(obj instanceof AppsRotatingCarouselItemDto)) {
            return false;
        }
        AppsRotatingCarouselItemDto appsRotatingCarouselItemDto = (AppsRotatingCarouselItemDto) obj;
        return epx.f(this.f69app, appsRotatingCarouselItemDto.f69app) && epx.f(this.image, appsRotatingCarouselItemDto.image);
    }

    public final int hashCode() {
        return this.image.hashCode() + (this.f69app.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsRotatingCarouselItemDto(app=");
        sb.append(this.f69app);
        sb.append(", image=");
        return ms9.a(')', sb, this.image);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f69app.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.image);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}

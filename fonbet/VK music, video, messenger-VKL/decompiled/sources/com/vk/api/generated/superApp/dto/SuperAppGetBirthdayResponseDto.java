package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppGetBirthdayResponseDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppGetBirthdayResponseDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppGetBirthdayResponseDto> CREATOR = new a();

    @pmi0("backgroung_lottie_url")
    private final String backgroungLottieUrl;

    @pmi0("button")
    private final SuperAppUniversalWidgetButtonDto button;

    @pmi0("coupons")
    private final List<SuperAppBirthdayItemDto> coupons;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("items")
    private final List<SuperAppBirthdayItemDto> items;

    @pmi0("miniapp")
    private final AppsAppMinDto miniapp;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: SuperAppGetBirthdayResponseDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppGetBirthdayResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppGetBirthdayResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String readString = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(SuperAppGetBirthdayResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            String readString2 = parcel.readString();
            AppsAppMinDto appsAppMinDto = (AppsAppMinDto) parcel.readParcelable(SuperAppGetBirthdayResponseDto.class.getClassLoader());
            ArrayList arrayList3 = null;
            String readString3 = parcel.readString();
            SuperAppUniversalWidgetButtonDto createFromParcel = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetButtonDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(SuperAppBirthdayItemDto.CREATOR, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(SuperAppBirthdayItemDto.CREATOR, parcel, arrayList4, i, 1);
                }
                arrayList3 = arrayList4;
            }
            return new SuperAppGetBirthdayResponseDto(readString, arrayList, readString2, appsAppMinDto, readString3, createFromParcel, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppGetBirthdayResponseDto[] newArray(int i) {
            return new SuperAppGetBirthdayResponseDto[i];
        }
    }

    public SuperAppGetBirthdayResponseDto(String str, List<BaseImageDto> list, String str2, AppsAppMinDto appsAppMinDto, String str3, SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto, List<SuperAppBirthdayItemDto> list2, List<SuperAppBirthdayItemDto> list3) {
        this.title = str;
        this.image = list;
        this.subtitle = str2;
        this.miniapp = appsAppMinDto;
        this.backgroungLottieUrl = str3;
        this.button = superAppUniversalWidgetButtonDto;
        this.coupons = list2;
        this.items = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppGetBirthdayResponseDto)) {
            return false;
        }
        SuperAppGetBirthdayResponseDto superAppGetBirthdayResponseDto = (SuperAppGetBirthdayResponseDto) obj;
        return epx.f(this.title, superAppGetBirthdayResponseDto.title) && epx.f(this.image, superAppGetBirthdayResponseDto.image) && epx.f(this.subtitle, superAppGetBirthdayResponseDto.subtitle) && epx.f(this.miniapp, superAppGetBirthdayResponseDto.miniapp) && epx.f(this.backgroungLottieUrl, superAppGetBirthdayResponseDto.backgroungLottieUrl) && epx.f(this.button, superAppGetBirthdayResponseDto.button) && epx.f(this.coupons, superAppGetBirthdayResponseDto.coupons) && epx.f(this.items, superAppGetBirthdayResponseDto.items);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        List<BaseImageDto> list = this.image;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.subtitle;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AppsAppMinDto appsAppMinDto = this.miniapp;
        int hashCode4 = (hashCode3 + (appsAppMinDto == null ? 0 : appsAppMinDto.hashCode())) * 31;
        String str2 = this.backgroungLottieUrl;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto = this.button;
        int hashCode6 = (hashCode5 + (superAppUniversalWidgetButtonDto == null ? 0 : superAppUniversalWidgetButtonDto.hashCode())) * 31;
        List<SuperAppBirthdayItemDto> list2 = this.coupons;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<SuperAppBirthdayItemDto> list3 = this.items;
        return hashCode7 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppGetBirthdayResponseDto(title=");
        sb.append(this.title);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", miniapp=");
        sb.append(this.miniapp);
        sb.append(", backgroungLottieUrl=");
        sb.append(this.backgroungLottieUrl);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", coupons=");
        sb.append(this.coupons);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        List<BaseImageDto> list = this.image;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.miniapp, i);
        parcel.writeString(this.backgroungLottieUrl);
        SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto = this.button;
        if (superAppUniversalWidgetButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetButtonDto.writeToParcel(parcel, i);
        }
        List<SuperAppBirthdayItemDto> list2 = this.coupons;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((SuperAppBirthdayItemDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<SuperAppBirthdayItemDto> list3 = this.items;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            ((SuperAppBirthdayItemDto) f3.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppGetBirthdayResponseDto(String str, List list, String str2, AppsAppMinDto appsAppMinDto, String str3, SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto, List list2, List list3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : appsAppMinDto, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : superAppUniversalWidgetButtonDto, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : list3);
    }
}

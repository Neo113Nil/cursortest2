package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: SuperAppMiniWidgetSettingDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppMiniWidgetSettingDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppMiniWidgetSettingDto> CREATOR = new a();

    @pmi0("image")
    private final List<SuperAppUniversalWidgetImageItemDto> image;

    @pmi0("text")
    private final String text;

    @pmi0("widget")
    private final SuperAppMiniWidgetItemDto widget;

    /* compiled from: SuperAppMiniWidgetSettingDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppMiniWidgetSettingDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppMiniWidgetSettingDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(SuperAppMiniWidgetSettingDto.class, parcel, arrayList, i, 1);
            }
            return new SuperAppMiniWidgetSettingDto(arrayList, parcel.readString(), (SuperAppMiniWidgetItemDto) parcel.readParcelable(SuperAppMiniWidgetSettingDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppMiniWidgetSettingDto[] newArray(int i) {
            return new SuperAppMiniWidgetSettingDto[i];
        }
    }

    public SuperAppMiniWidgetSettingDto(List<SuperAppUniversalWidgetImageItemDto> list, String str, SuperAppMiniWidgetItemDto superAppMiniWidgetItemDto) {
        this.image = list;
        this.text = str;
        this.widget = superAppMiniWidgetItemDto;
    }

    public final List<SuperAppUniversalWidgetImageItemDto> d() {
        return this.image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppMiniWidgetSettingDto)) {
            return false;
        }
        SuperAppMiniWidgetSettingDto superAppMiniWidgetSettingDto = (SuperAppMiniWidgetSettingDto) obj;
        return epx.f(this.image, superAppMiniWidgetSettingDto.image) && epx.f(this.text, superAppMiniWidgetSettingDto.text) && epx.f(this.widget, superAppMiniWidgetSettingDto.widget);
    }

    public final SuperAppMiniWidgetItemDto f() {
        return this.widget;
    }

    public final int hashCode() {
        return this.widget.hashCode() + urd0.a(this.image.hashCode() * 31, 31, this.text);
    }

    public final String toString() {
        return "SuperAppMiniWidgetSettingDto(image=" + this.image + ", text=" + this.text + ", widget=" + this.widget + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.image);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.text);
        parcel.writeParcelable(this.widget, i);
    }
}

package com.vk.api.generated.superAppShowcase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.superApp.dto.SuperAppUniversalWidgetImageBlockDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: SuperAppShowcaseSectionPosterUserStackDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppShowcaseSectionPosterUserStackDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppShowcaseSectionPosterUserStackDto> CREATOR = new a();

    @pmi0("items")
    private final List<SuperAppUniversalWidgetImageBlockDto> items;

    @pmi0("text")
    private final String text;

    /* compiled from: SuperAppShowcaseSectionPosterUserStackDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppShowcaseSectionPosterUserStackDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseSectionPosterUserStackDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(SuperAppShowcaseSectionPosterUserStackDto.class, parcel, arrayList, i, 1);
            }
            return new SuperAppShowcaseSectionPosterUserStackDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppShowcaseSectionPosterUserStackDto[] newArray(int i) {
            return new SuperAppShowcaseSectionPosterUserStackDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppShowcaseSectionPosterUserStackDto(String str, List<? extends SuperAppUniversalWidgetImageBlockDto> list) {
        this.text = str;
        this.items = list;
    }

    public final List<SuperAppUniversalWidgetImageBlockDto> d() {
        return this.items;
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
        if (!(obj instanceof SuperAppShowcaseSectionPosterUserStackDto)) {
            return false;
        }
        SuperAppShowcaseSectionPosterUserStackDto superAppShowcaseSectionPosterUserStackDto = (SuperAppShowcaseSectionPosterUserStackDto) obj;
        return epx.f(this.text, superAppShowcaseSectionPosterUserStackDto.text) && epx.f(this.items, superAppShowcaseSectionPosterUserStackDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppShowcaseSectionPosterUserStackDto(text=");
        sb.append(this.text);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}

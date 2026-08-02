package com.vk.superapp.api.dto.app.catalog.section;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.app.catalog.SectionHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.urd0;

/* compiled from: AppsCategoriesSection.kt */
/* loaded from: classes6.dex */
public final class AppsCategoriesSection extends AppsCatalogSection {
    public static final Parcelable.Creator<AppsCategoriesSection> CREATOR = new a();
    public final int g;
    public final String h;
    public final SectionHeader i;
    public final List<AppsCategory> j;

    /* compiled from: AppsCategoriesSection.kt */
    public static final class a implements Parcelable.Creator<AppsCategoriesSection> {
        @Override // android.os.Parcelable.Creator
        public final AppsCategoriesSection createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            SectionHeader createFromParcel = parcel.readInt() == 0 ? null : SectionHeader.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(AppsCategory.CREATOR, parcel, arrayList, i, 1);
            }
            return new AppsCategoriesSection(readInt, readString, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsCategoriesSection[] newArray(int i) {
            return new AppsCategoriesSection[i];
        }
    }

    public AppsCategoriesSection(int i, String str, SectionHeader sectionHeader, List<AppsCategory> list) {
        super("categories_vertical_list", i, str, sectionHeader, null);
        this.g = i;
        this.h = str;
        this.i = sectionHeader;
        this.j = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection
    public final SectionHeader e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsCategoriesSection)) {
            return false;
        }
        AppsCategoriesSection appsCategoriesSection = (AppsCategoriesSection) obj;
        return this.g == appsCategoriesSection.g && epx.f(this.h, appsCategoriesSection.h) && epx.f(this.i, appsCategoriesSection.i) && epx.f(this.j, appsCategoriesSection.j);
    }

    @Override // com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection
    public final int getId() {
        return this.g;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.g) * 31, 31, this.h);
        SectionHeader sectionHeader = this.i;
        return this.j.hashCode() + ((a2 + (sectionHeader == null ? 0 : sectionHeader.hashCode())) * 31);
    }

    @Override // com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection
    public final String r() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsCategoriesSection(id=");
        sb.append(this.g);
        sb.append(", trackCode=");
        sb.append(this.h);
        sb.append(", header=");
        sb.append(this.i);
        sb.append(", categories=");
        return ms9.a(')', sb, this.j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        SectionHeader sectionHeader = this.i;
        if (sectionHeader == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sectionHeader.writeToParcel(parcel, i);
        }
        Iterator a2 = ao.a(parcel, this.j);
        while (a2.hasNext()) {
            ((AppsCategory) a2.next()).writeToParcel(parcel, i);
        }
    }
}

package com.vk.superapp.api.dto.app.catalog.section;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.app.catalog.SectionAppItem;
import com.vk.superapp.api.dto.app.catalog.SectionHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.urd0;

/* compiled from: AppsHorizontalCellListSection.kt */
/* loaded from: classes6.dex */
public final class AppsHorizontalCellListSection extends AppsCatalogSection {
    public static final Parcelable.Creator<AppsHorizontalCellListSection> CREATOR = new a();
    public final int g;
    public final String h;
    public final SectionHeader i;
    public final List<SectionAppItem> j;
    public final String k;

    /* compiled from: AppsHorizontalCellListSection.kt */
    public static final class a implements Parcelable.Creator<AppsHorizontalCellListSection> {
        @Override // android.os.Parcelable.Creator
        public final AppsHorizontalCellListSection createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            SectionHeader createFromParcel = parcel.readInt() == 0 ? null : SectionHeader.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(SectionAppItem.CREATOR, parcel, arrayList, i, 1);
            }
            return new AppsHorizontalCellListSection(readInt, readString, createFromParcel, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsHorizontalCellListSection[] newArray(int i) {
            return new AppsHorizontalCellListSection[i];
        }
    }

    public AppsHorizontalCellListSection(int i, String str, SectionHeader sectionHeader, List<SectionAppItem> list, String str2) {
        super("apps_horizontal_cell_list", i, str, sectionHeader, null);
        this.g = i;
        this.h = str;
        this.i = sectionHeader;
        this.j = list;
        this.k = str2;
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
        if (!(obj instanceof AppsHorizontalCellListSection)) {
            return false;
        }
        AppsHorizontalCellListSection appsHorizontalCellListSection = (AppsHorizontalCellListSection) obj;
        return this.g == appsHorizontalCellListSection.g && epx.f(this.h, appsHorizontalCellListSection.h) && epx.f(this.i, appsHorizontalCellListSection.i) && epx.f(this.j, appsHorizontalCellListSection.j) && epx.f(this.k, appsHorizontalCellListSection.k);
    }

    @Override // com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection
    public final String f() {
        return this.k;
    }

    @Override // com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection
    public final int getId() {
        return this.g;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.g) * 31, 31, this.h);
        SectionHeader sectionHeader = this.i;
        int a3 = fw3.a((a2 + (sectionHeader == null ? 0 : sectionHeader.hashCode())) * 31, 31, this.j);
        String str = this.k;
        return a3 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection
    public final String r() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsHorizontalCellListSection(id=");
        sb.append(this.g);
        sb.append(", trackCode=");
        sb.append(this.h);
        sb.append(", header=");
        sb.append(this.i);
        sb.append(", apps=");
        sb.append(this.j);
        sb.append(", sectionId=");
        return ho8.a(sb, this.k, ')');
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
            ((SectionAppItem) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.k);
    }
}

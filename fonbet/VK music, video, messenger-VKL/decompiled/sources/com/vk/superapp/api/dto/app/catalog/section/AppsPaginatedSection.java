package com.vk.superapp.api.dto.app.catalog.section;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.app.catalog.CustomItem;
import com.vk.superapp.api.dto.app.catalog.SectionHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;

/* compiled from: AppsPaginatedSection.kt */
/* loaded from: classes6.dex */
public final class AppsPaginatedSection extends AppsCatalogSection {
    public static final Parcelable.Creator<AppsPaginatedSection> CREATOR = new a();
    public final int g;
    public final String h;
    public final SectionHeader i;
    public final int j;
    public final List<CustomItem> k;
    public final String l;

    /* compiled from: AppsPaginatedSection.kt */
    public static final class a implements Parcelable.Creator<AppsPaginatedSection> {
        @Override // android.os.Parcelable.Creator
        public final AppsPaginatedSection createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            SectionHeader createFromParcel = parcel.readInt() == 0 ? null : SectionHeader.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = en.a(CustomItem.CREATOR, parcel, arrayList, i, 1);
            }
            return new AppsPaginatedSection(readInt, readString, createFromParcel, readInt2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsPaginatedSection[] newArray(int i) {
            return new AppsPaginatedSection[i];
        }
    }

    public AppsPaginatedSection(int i, String str, SectionHeader sectionHeader, int i2, List<CustomItem> list, String str2) {
        super("apps_paginated", i, str, sectionHeader, null);
        this.g = i;
        this.h = str;
        this.i = sectionHeader;
        this.j = i2;
        this.k = list;
        this.l = str2;
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
        if (!(obj instanceof AppsPaginatedSection)) {
            return false;
        }
        AppsPaginatedSection appsPaginatedSection = (AppsPaginatedSection) obj;
        return this.g == appsPaginatedSection.g && epx.f(this.h, appsPaginatedSection.h) && epx.f(this.i, appsPaginatedSection.i) && this.j == appsPaginatedSection.j && epx.f(this.k, appsPaginatedSection.k) && epx.f(this.l, appsPaginatedSection.l);
    }

    @Override // com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection
    public final String f() {
        return this.l;
    }

    @Override // com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection
    public final int getId() {
        return this.g;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.g) * 31, 31, this.h);
        SectionHeader sectionHeader = this.i;
        int a3 = fw3.a(shy.a(this.j, (a2 + (sectionHeader == null ? 0 : sectionHeader.hashCode())) * 31, 31), 31, this.k);
        String str = this.l;
        return a3 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection
    public final String r() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsPaginatedSection(id=");
        sb.append(this.g);
        sb.append(", trackCode=");
        sb.append(this.h);
        sb.append(", header=");
        sb.append(this.i);
        sb.append(", rowsCount=");
        sb.append(this.j);
        sb.append(", items=");
        sb.append(this.k);
        sb.append(", sectionId=");
        return ho8.a(sb, this.l, ')');
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
        parcel.writeInt(this.j);
        Iterator a2 = ao.a(parcel, this.k);
        while (a2.hasNext()) {
            ((CustomItem) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.l);
    }
}

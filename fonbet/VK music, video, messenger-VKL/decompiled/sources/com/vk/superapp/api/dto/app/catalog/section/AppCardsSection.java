package com.vk.superapp.api.dto.app.catalog.section;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.app.catalog.SectionHeader;
import com.vk.superapp.api.dto.app.catalog.footer.SectionFooter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;

/* compiled from: AppCardsSection.kt */
/* loaded from: classes6.dex */
public final class AppCardsSection extends AppsCatalogSection {
    public static final Parcelable.Creator<AppCardsSection> CREATOR = new a();
    public final int g;
    public final String h;
    public final SectionHeader i;
    public final SectionFooter j;
    public final List<AppCard> k;

    /* compiled from: AppCardsSection.kt */
    public static final class a implements Parcelable.Creator<AppCardsSection> {
        @Override // android.os.Parcelable.Creator
        public final AppCardsSection createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            SectionHeader createFromParcel = parcel.readInt() == 0 ? null : SectionHeader.CREATOR.createFromParcel(parcel);
            SectionFooter sectionFooter = (SectionFooter) parcel.readParcelable(AppCardsSection.class.getClassLoader());
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(AppCard.CREATOR, parcel, arrayList, i, 1);
            }
            return new AppCardsSection(readInt, readString, createFromParcel, sectionFooter, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppCardsSection[] newArray(int i) {
            return new AppCardsSection[i];
        }
    }

    public AppCardsSection(int i, String str, SectionHeader sectionHeader, SectionFooter sectionFooter, List<AppCard> list) {
        super("app_cards_horizontal_list", i, str, sectionHeader, sectionFooter);
        this.g = i;
        this.h = str;
        this.i = sectionHeader;
        this.j = sectionFooter;
        this.k = list;
    }

    @Override // com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection
    public final SectionFooter d() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection
    public final SectionHeader e() {
        return this.i;
    }

    @Override // com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection
    public final int getId() {
        return this.g;
    }

    @Override // com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection
    public final String r() {
        return this.h;
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
        parcel.writeParcelable(this.j, i);
        Iterator a2 = ao.a(parcel, this.k);
        while (a2.hasNext()) {
            ((AppCard) a2.next()).writeToParcel(parcel, i);
        }
    }
}

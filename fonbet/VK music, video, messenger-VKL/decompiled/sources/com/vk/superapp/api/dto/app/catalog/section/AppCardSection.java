package com.vk.superapp.api.dto.app.catalog.section;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.app.catalog.SectionHeader;
import com.vk.superapp.api.dto.app.catalog.footer.SectionFooter;
import xsna.epx;
import xsna.urd0;

/* compiled from: AppCardSection.kt */
/* loaded from: classes6.dex */
public final class AppCardSection extends AppsCatalogSection {
    public static final Parcelable.Creator<AppCardSection> CREATOR = new a();
    public final int g;
    public final String h;
    public final SectionHeader i;
    public final SectionFooter j;
    public final AppCard k;

    /* compiled from: AppCardSection.kt */
    public static final class a implements Parcelable.Creator<AppCardSection> {
        @Override // android.os.Parcelable.Creator
        public final AppCardSection createFromParcel(Parcel parcel) {
            return new AppCardSection(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : SectionHeader.CREATOR.createFromParcel(parcel), (SectionFooter) parcel.readParcelable(AppCardSection.class.getClassLoader()), AppCard.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppCardSection[] newArray(int i) {
            return new AppCardSection[i];
        }
    }

    public AppCardSection(int i, String str, SectionHeader sectionHeader, SectionFooter sectionFooter, AppCard appCard) {
        super("app_card", i, str, sectionHeader, sectionFooter);
        this.g = i;
        this.h = str;
        this.i = sectionHeader;
        this.j = sectionFooter;
        this.k = appCard;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppCardSection)) {
            return false;
        }
        AppCardSection appCardSection = (AppCardSection) obj;
        return this.g == appCardSection.g && epx.f(this.h, appCardSection.h) && epx.f(this.i, appCardSection.i) && epx.f(this.j, appCardSection.j) && epx.f(this.k, appCardSection.k);
    }

    @Override // com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection
    public final int getId() {
        return this.g;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.g) * 31, 31, this.h);
        SectionHeader sectionHeader = this.i;
        int hashCode = (a2 + (sectionHeader == null ? 0 : sectionHeader.hashCode())) * 31;
        SectionFooter sectionFooter = this.j;
        return this.k.hashCode() + ((hashCode + (sectionFooter != null ? sectionFooter.hashCode() : 0)) * 31);
    }

    @Override // com.vk.superapp.api.dto.app.catalog.section.AppsCatalogSection
    public final String r() {
        return this.h;
    }

    public final String toString() {
        return "AppCardSection(id=" + this.g + ", trackCode=" + this.h + ", header=" + this.i + ", footer=" + this.j + ", appCard=" + this.k + ')';
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
        this.k.writeToParcel(parcel, i);
    }
}

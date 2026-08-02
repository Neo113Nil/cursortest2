package com.vk.superapp.api.dto.app.catalog;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;

/* compiled from: SectionHeader.kt */
/* loaded from: classes6.dex */
public final class SectionHeader implements Parcelable {
    public static final Parcelable.Creator<SectionHeader> CREATOR = new a();
    public final SectionTitle b;
    public final SectionTitle c;
    public final SectionButton d;

    /* compiled from: SectionHeader.kt */
    public static final class a implements Parcelable.Creator<SectionHeader> {
        @Override // android.os.Parcelable.Creator
        public final SectionHeader createFromParcel(Parcel parcel) {
            Parcelable.Creator<SectionTitle> creator = SectionTitle.CREATOR;
            return new SectionHeader(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? SectionButton.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SectionHeader[] newArray(int i) {
            return new SectionHeader[i];
        }
    }

    public SectionHeader(SectionTitle sectionTitle, SectionTitle sectionTitle2, SectionButton sectionButton) {
        this.b = sectionTitle;
        this.c = sectionTitle2;
        this.d = sectionButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionHeader)) {
            return false;
        }
        SectionHeader sectionHeader = (SectionHeader) obj;
        return epx.f(this.b, sectionHeader.b) && epx.f(this.c, sectionHeader.c) && epx.f(this.d, sectionHeader.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        SectionTitle sectionTitle = this.c;
        int hashCode2 = (hashCode + (sectionTitle == null ? 0 : sectionTitle.hashCode())) * 31;
        SectionButton sectionButton = this.d;
        return hashCode2 + (sectionButton != null ? sectionButton.hashCode() : 0);
    }

    public final String toString() {
        return "SectionHeader(title=" + this.b + ", subtitle=" + this.c + ", button=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        SectionTitle sectionTitle = this.c;
        if (sectionTitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sectionTitle.writeToParcel(parcel, i);
        }
        SectionButton sectionButton = this.d;
        if (sectionButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sectionButton.writeToParcel(parcel, i);
        }
    }
}

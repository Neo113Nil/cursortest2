package com.vk.superapp.api.dto.app.catalog.section;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.superapp.api.dto.app.catalog.SectionAppItem;
import com.vk.superapp.api.dto.app.catalog.SectionTitle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.ms9;
import xsna.pm0;

/* compiled from: AppCard.kt */
/* loaded from: classes6.dex */
public final class AppCard implements Parcelable {
    public static final Parcelable.Creator<AppCard> CREATOR = new a();
    public final SectionAppItem b;
    public final WebImage c;
    public final List<Integer> d;
    public final SectionTitle e;
    public final SectionTitle f;
    public final Panel g;
    public final String h;

    /* compiled from: AppCard.kt */
    public static final class Panel implements Parcelable {
        public static final Parcelable.Creator<Panel> CREATOR = new a();
        public final SectionTitle b;
        public final SectionTitle c;
        public final List<Integer> d;
        public final List<Integer> e;

        /* compiled from: AppCard.kt */
        public static final class a implements Parcelable.Creator<Panel> {
            @Override // android.os.Parcelable.Creator
            public final Panel createFromParcel(Parcel parcel) {
                Parcelable.Creator<SectionTitle> creator = SectionTitle.CREATOR;
                SectionTitle createFromParcel = creator.createFromParcel(parcel);
                SectionTitle createFromParcel2 = creator.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = pm0.b(parcel, arrayList, i2, 1);
                }
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                return new Panel(createFromParcel, createFromParcel2, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Panel[] newArray(int i) {
                return new Panel[i];
            }
        }

        public Panel(SectionTitle sectionTitle, SectionTitle sectionTitle2, List<Integer> list, List<Integer> list2) {
            this.b = sectionTitle;
            this.c = sectionTitle2;
            this.d = list;
            this.e = list2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Panel)) {
                return false;
            }
            Panel panel = (Panel) obj;
            return epx.f(this.b, panel.b) && epx.f(this.c, panel.c) && epx.f(this.d, panel.d) && epx.f(this.e, panel.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + fw3.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Panel(title=");
            sb.append(this.b);
            sb.append(", subtitle=");
            sb.append(this.c);
            sb.append(", backgroundColor=");
            sb.append(this.d);
            sb.append(", arrowColor=");
            return ms9.a(')', sb, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            this.c.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.d);
            while (a2.hasNext()) {
                parcel.writeInt(((Number) a2.next()).intValue());
            }
            Iterator a3 = ao.a(parcel, this.e);
            while (a3.hasNext()) {
                parcel.writeInt(((Number) a3.next()).intValue());
            }
        }
    }

    /* compiled from: AppCard.kt */
    public static final class a implements Parcelable.Creator<AppCard> {
        @Override // android.os.Parcelable.Creator
        public final AppCard createFromParcel(Parcel parcel) {
            SectionAppItem createFromParcel = SectionAppItem.CREATOR.createFromParcel(parcel);
            WebImage webImage = (WebImage) parcel.readParcelable(AppCard.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new AppCard(createFromParcel, webImage, arrayList, parcel.readInt() == 0 ? null : SectionTitle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SectionTitle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Panel.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppCard[] newArray(int i) {
            return new AppCard[i];
        }
    }

    public AppCard(SectionAppItem sectionAppItem, WebImage webImage, List<Integer> list, SectionTitle sectionTitle, SectionTitle sectionTitle2, Panel panel, String str) {
        this.b = sectionAppItem;
        this.c = webImage;
        this.d = list;
        this.e = sectionTitle;
        this.f = sectionTitle2;
        this.g = panel;
        this.h = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppCard)) {
            return false;
        }
        AppCard appCard = (AppCard) obj;
        return epx.f(this.b, appCard.b) && epx.f(this.c, appCard.c) && epx.f(this.d, appCard.d) && epx.f(this.e, appCard.e) && epx.f(this.f, appCard.f) && epx.f(this.g, appCard.g) && epx.f(this.h, appCard.h);
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(this.b.hashCode() * 31, 31, this.c.b), 31, this.d);
        SectionTitle sectionTitle = this.e;
        int hashCode = (a2 + (sectionTitle == null ? 0 : sectionTitle.hashCode())) * 31;
        SectionTitle sectionTitle2 = this.f;
        int hashCode2 = (hashCode + (sectionTitle2 == null ? 0 : sectionTitle2.hashCode())) * 31;
        Panel panel = this.g;
        return this.h.hashCode() + ((hashCode2 + (panel != null ? panel.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppCard(app=");
        sb.append(this.b);
        sb.append(", backgroundImage=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", subtitle=");
        sb.append(this.f);
        sb.append(", panel=");
        sb.append(this.g);
        sb.append(", sectionTrackCode=");
        return ho8.a(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, i);
        Iterator a2 = ao.a(parcel, this.d);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
        SectionTitle sectionTitle = this.e;
        if (sectionTitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sectionTitle.writeToParcel(parcel, i);
        }
        SectionTitle sectionTitle2 = this.f;
        if (sectionTitle2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sectionTitle2.writeToParcel(parcel, i);
        }
        Panel panel = this.g;
        if (panel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            panel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.h);
    }
}

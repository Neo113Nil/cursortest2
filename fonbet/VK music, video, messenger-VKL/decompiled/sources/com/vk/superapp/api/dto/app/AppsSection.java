package com.vk.superapp.api.dto.app;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebApiApplication;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.shy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: AppsSection.kt */
/* loaded from: classes6.dex */
public final class AppsSection implements Parcelable {
    public static final Parcelable.Creator<AppsSection> CREATOR = new a();
    public final String b;
    public final List<WebApiApplication> c;
    public final String d;
    public final int e;
    public final ViewType f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsSection.kt */
    public static final class ViewType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType CAROUSEL;
        public static final ViewType CAROUSEL_BANNER_COLOR;
        public static final ViewType CAROUSEL_BANNER_IMAGE;
        public static final ViewType LIST_CAROUSEL;
        public static final ViewType LIST_SIMPLE;

        static {
            ViewType viewType = new ViewType("LIST_SIMPLE", 0);
            LIST_SIMPLE = viewType;
            ViewType viewType2 = new ViewType("CAROUSEL", 1);
            CAROUSEL = viewType2;
            ViewType viewType3 = new ViewType("LIST_CAROUSEL", 2);
            LIST_CAROUSEL = viewType3;
            ViewType viewType4 = new ViewType("CAROUSEL_BANNER_COLOR", 3);
            CAROUSEL_BANNER_COLOR = viewType4;
            ViewType viewType5 = new ViewType("CAROUSEL_BANNER_IMAGE", 4);
            CAROUSEL_BANNER_IMAGE = viewType5;
            ViewType[] viewTypeArr = {viewType, viewType2, viewType3, viewType4, viewType5};
            $VALUES = viewTypeArr;
            $ENTRIES = new asp(viewTypeArr);
        }

        public ViewType() {
            throw null;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    /* compiled from: AppsSection.kt */
    public static final class a implements Parcelable.Creator<AppsSection> {
        @Override // android.os.Parcelable.Creator
        public final AppsSection createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(AppsSection.class, parcel, arrayList, i, 1);
            }
            return new AppsSection(readString, arrayList, parcel.readString(), parcel.readInt(), ViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsSection[] newArray(int i) {
            return new AppsSection[i];
        }
    }

    public AppsSection(String str, List<WebApiApplication> list, String str2, int i, ViewType viewType) {
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = i;
        this.f = viewType;
    }

    public final boolean d() {
        return this.c.size() != this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AppsSection.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AppsSection appsSection = (AppsSection) obj;
        return epx.f(this.b, appsSection.b) && epx.f(this.d, appsSection.d) && d() == appsSection.d();
    }

    public final int hashCode() {
        return this.f.hashCode() + shy.a(this.e, urd0.a(fw3.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        return "AppsSection(id=" + this.b + ", items=" + this.c + ", title=" + this.d + ", count=" + this.e + ", viewType=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        Iterator a2 = ao.a(parcel, this.c);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f.name());
    }
}

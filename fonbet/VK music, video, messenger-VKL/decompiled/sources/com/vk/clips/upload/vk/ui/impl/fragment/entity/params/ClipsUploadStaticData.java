package com.vk.clips.upload.vk.ui.impl.fragment.entity.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.upload.ui.api.entities.TrendingHashtag;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.HideableFeature;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.type.HideableSwitch;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.stories.entities.OrdData;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;

/* compiled from: ClipsUploadStaticData.kt */
/* loaded from: classes17.dex */
public final class ClipsUploadStaticData implements Parcelable {
    public static final Parcelable.Creator<ClipsUploadStaticData> CREATOR = new a();
    public final String b;
    public final List<TrendingHashtag> c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final HideableSwitch g;
    public final ClipsPreviewData h;
    public final OrdData i;
    public final GeoLocation j;
    public final TooltipsData k;
    public final HideableFeature<ProductsData> l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    /* compiled from: ClipsUploadStaticData.kt */
    public static final class a implements Parcelable.Creator<ClipsUploadStaticData> {
        @Override // android.os.Parcelable.Creator
        public final ClipsUploadStaticData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            ClipsPreviewData clipsPreviewData;
            TooltipsData tooltipsData;
            boolean z5;
            boolean z6;
            OrdData ordData;
            HideableFeature<?> hideableFeature;
            boolean z7;
            boolean z8;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            boolean z9 = false;
            int i = 0;
            while (i != readInt) {
                i = bo.b(ClipsUploadStaticData.class, parcel, arrayList2, i, 1);
            }
            if (parcel.readInt() != 0) {
                arrayList = arrayList2;
                z = true;
            } else {
                arrayList = arrayList2;
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = false;
                z9 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
                z2 = true;
            } else {
                z3 = z2;
            }
            HideableSwitch createFromParcel = HideableSwitch.CREATOR.createFromParcel(parcel);
            ClipsPreviewData createFromParcel2 = ClipsPreviewData.CREATOR.createFromParcel(parcel);
            OrdData ordData2 = (OrdData) parcel.readParcelable(ClipsUploadStaticData.class.getClassLoader());
            GeoLocation geoLocation = (GeoLocation) parcel.readParcelable(ClipsUploadStaticData.class.getClassLoader());
            TooltipsData createFromParcel3 = TooltipsData.CREATOR.createFromParcel(parcel);
            HideableFeature<?> createFromParcel4 = HideableFeature.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z4 = true;
                clipsPreviewData = createFromParcel2;
                tooltipsData = createFromParcel3;
                z5 = true;
            } else {
                z4 = true;
                clipsPreviewData = createFromParcel2;
                tooltipsData = createFromParcel3;
                z5 = z3;
            }
            if (parcel.readInt() != 0) {
                z6 = z3;
                ordData = ordData2;
                hideableFeature = createFromParcel4;
                z7 = z4;
            } else {
                z6 = z3;
                ordData = ordData2;
                hideableFeature = createFromParcel4;
                z7 = z6;
            }
            if (parcel.readInt() != 0) {
                z8 = z4;
            } else {
                z8 = z4;
                z4 = z6;
            }
            if (parcel.readInt() != 0) {
                z6 = z8;
            }
            return new ClipsUploadStaticData(readString, arrayList, z, z9, z2, createFromParcel, clipsPreviewData, ordData, geoLocation, tooltipsData, hideableFeature, z5, z7, z4, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsUploadStaticData[] newArray(int i) {
            return new ClipsUploadStaticData[i];
        }
    }

    public ClipsUploadStaticData(String str, List<TrendingHashtag> list, boolean z, boolean z2, boolean z3, HideableSwitch hideableSwitch, ClipsPreviewData clipsPreviewData, OrdData ordData, GeoLocation geoLocation, TooltipsData tooltipsData, HideableFeature<ProductsData> hideableFeature, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.b = str;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = hideableSwitch;
        this.h = clipsPreviewData;
        this.i = ordData;
        this.j = geoLocation;
        this.k = tooltipsData;
        this.l = hideableFeature;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
    }

    public static ClipsUploadStaticData a(ClipsUploadStaticData clipsUploadStaticData, String str, ArrayList arrayList, boolean z, boolean z2, HideableSwitch hideableSwitch, ClipsPreviewData clipsPreviewData, OrdData ordData, GeoLocation geoLocation, TooltipsData tooltipsData, HideableFeature hideableFeature, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        String str2 = (i & 1) != 0 ? clipsUploadStaticData.b : str;
        List<TrendingHashtag> list = (i & 2) != 0 ? clipsUploadStaticData.c : arrayList;
        boolean z7 = (i & 4) != 0 ? clipsUploadStaticData.d : z;
        boolean z8 = (i & 8) != 0 ? clipsUploadStaticData.e : z2;
        boolean z9 = (i & 16) != 0 ? clipsUploadStaticData.f : true;
        HideableSwitch hideableSwitch2 = (i & 32) != 0 ? clipsUploadStaticData.g : hideableSwitch;
        ClipsPreviewData clipsPreviewData2 = (i & 64) != 0 ? clipsUploadStaticData.h : clipsPreviewData;
        OrdData ordData2 = (i & 128) != 0 ? clipsUploadStaticData.i : ordData;
        GeoLocation geoLocation2 = (i & 256) != 0 ? clipsUploadStaticData.j : geoLocation;
        TooltipsData tooltipsData2 = (i & 512) != 0 ? clipsUploadStaticData.k : tooltipsData;
        HideableFeature hideableFeature2 = (i & 1024) != 0 ? clipsUploadStaticData.l : hideableFeature;
        boolean z10 = (i & 2048) != 0 ? clipsUploadStaticData.m : z3;
        boolean z11 = (i & 4096) != 0 ? clipsUploadStaticData.n : z4;
        boolean z12 = (i & 8192) != 0 ? clipsUploadStaticData.o : z5;
        boolean z13 = (i & 16384) != 0 ? clipsUploadStaticData.p : z6;
        clipsUploadStaticData.getClass();
        return new ClipsUploadStaticData(str2, list, z7, z8, z9, hideableSwitch2, clipsPreviewData2, ordData2, geoLocation2, tooltipsData2, hideableFeature2, z10, z11, z12, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsUploadStaticData)) {
            return false;
        }
        ClipsUploadStaticData clipsUploadStaticData = (ClipsUploadStaticData) obj;
        return epx.f(this.b, clipsUploadStaticData.b) && epx.f(this.c, clipsUploadStaticData.c) && this.d == clipsUploadStaticData.d && this.e == clipsUploadStaticData.e && this.f == clipsUploadStaticData.f && epx.f(this.g, clipsUploadStaticData.g) && epx.f(this.h, clipsUploadStaticData.h) && epx.f(this.i, clipsUploadStaticData.i) && epx.f(this.j, clipsUploadStaticData.j) && epx.f(this.k, clipsUploadStaticData.k) && epx.f(this.l, clipsUploadStaticData.l) && this.m == clipsUploadStaticData.m && this.n == clipsUploadStaticData.n && this.o == clipsUploadStaticData.o && this.p == clipsUploadStaticData.p;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (this.h.hashCode() + ((this.g.hashCode() + qoy.b(qoy.b(qoy.b(fw3.a((str == null ? 0 : str.hashCode()) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31;
        OrdData ordData = this.i;
        int hashCode2 = (hashCode + (ordData == null ? 0 : ordData.hashCode())) * 31;
        GeoLocation geoLocation = this.j;
        return Boolean.hashCode(this.p) + qoy.b(qoy.b(qoy.b((this.l.hashCode() + ((this.k.hashCode() + ((hashCode2 + (geoLocation != null ? geoLocation.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsUploadStaticData(description=");
        sb.append(this.b);
        sb.append(", trendingHashtags=");
        sb.append(this.c);
        sb.append(", allowDuets=");
        sb.append(this.d);
        sb.append(", allowComments=");
        sb.append(this.e);
        sb.append(", clipsLicenseShown=");
        sb.append(this.f);
        sb.append(", userTemplatesAllowed=");
        sb.append(this.g);
        sb.append(", preview=");
        sb.append(this.h);
        sb.append(", ordData=");
        sb.append(this.i);
        sb.append(", location=");
        sb.append(this.j);
        sb.append(", tooltipsData=");
        sb.append(this.k);
        sb.append(", productsAttachment=");
        sb.append(this.l);
        sb.append(", isOpenChannelButtonOnboardingAvailable=");
        sb.append(this.m);
        sb.append(", isOpenModalChannelButtonOnboardingAvailable=");
        sb.append(this.n);
        sb.append(", isMarketAttachOnboardingAvailable=");
        sb.append(this.o);
        sb.append(", isTicketActionButtonTooltipAvailable=");
        return q0.a(sb, this.p, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        Iterator a2 = ao.a(parcel, this.c);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        this.g.writeToParcel(parcel, i);
        this.h.writeToParcel(parcel, i);
        parcel.writeParcelable(this.i, i);
        parcel.writeParcelable(this.j, i);
        this.k.writeToParcel(parcel, i);
        this.l.writeToParcel(parcel, i);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.p ? 1 : 0);
    }
}

package com.vk.catalog.mvi.section.screen.impl.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.section.domain.CatalogButtonDo;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.bea;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.lm50;
import xsna.mm50;
import xsna.urd0;
import xsna.yda;
import xsna.zcl;

/* compiled from: CatalogSectionScreenState.kt */
/* loaded from: classes16.dex */
public final class CatalogSectionScreenState implements lm50, Parcelable {
    public static final Parcelable.Creator<CatalogSectionScreenState> CREATOR = new a();
    public final CatalogSectionState b;
    public final String c;
    public final List<CatalogButtonDo> d;
    public final Throwable e;
    public final mm50<CatalogSectionState, yda, bea> f;

    /* compiled from: CatalogSectionScreenState.kt */
    public static final class a implements Parcelable.Creator<CatalogSectionScreenState> {
        @Override // android.os.Parcelable.Creator
        public final CatalogSectionScreenState createFromParcel(Parcel parcel) {
            CatalogSectionState catalogSectionState = (CatalogSectionState) parcel.readParcelable(CatalogSectionScreenState.class.getClassLoader());
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(CatalogSectionScreenState.class, parcel, arrayList, i, 1);
            }
            return new CatalogSectionScreenState(catalogSectionState, readString, arrayList, (Throwable) parcel.readSerializable(), null, 16, null);
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogSectionScreenState[] newArray(int i) {
            return new CatalogSectionScreenState[i];
        }
    }

    public CatalogSectionScreenState() {
        this(null, null, null, null, null, 31, null);
    }

    public static CatalogSectionScreenState a(CatalogSectionScreenState catalogSectionScreenState, CatalogSectionState catalogSectionState, String str, List list, Throwable th, mm50 mm50Var, int i) {
        if ((i & 1) != 0) {
            catalogSectionState = catalogSectionScreenState.b;
        }
        CatalogSectionState catalogSectionState2 = catalogSectionState;
        if ((i & 2) != 0) {
            str = catalogSectionScreenState.c;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            list = catalogSectionScreenState.d;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            th = catalogSectionScreenState.e;
        }
        Throwable th2 = th;
        if ((i & 16) != 0) {
            mm50Var = catalogSectionScreenState.f;
        }
        catalogSectionScreenState.getClass();
        return new CatalogSectionScreenState(catalogSectionState2, str2, list2, th2, mm50Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSectionScreenState)) {
            return false;
        }
        CatalogSectionScreenState catalogSectionScreenState = (CatalogSectionScreenState) obj;
        return epx.f(this.b, catalogSectionScreenState.b) && epx.f(this.c, catalogSectionScreenState.c) && epx.f(this.d, catalogSectionScreenState.d) && epx.f(this.e, catalogSectionScreenState.e) && epx.f(this.f, catalogSectionScreenState.f);
    }

    public final int hashCode() {
        CatalogSectionState catalogSectionState = this.b;
        int a2 = fw3.a(urd0.a((catalogSectionState == null ? 0 : catalogSectionState.hashCode()) * 31, 31, this.c), 31, this.d);
        Throwable th = this.e;
        int hashCode = (a2 + (th == null ? 0 : th.hashCode())) * 31;
        mm50<CatalogSectionState, yda, bea> mm50Var = this.f;
        return hashCode + (mm50Var != null ? mm50Var.hashCode() : 0);
    }

    public final String toString() {
        return "CatalogSectionScreenState(sectionState=" + this.b + ", title=" + this.c + ", actions=" + this.d + ", initialContentLoadingError=" + this.e + ", sectionStore=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        Iterator a2 = ao.a(parcel, this.d);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeSerializable(this.e);
    }

    public CatalogSectionScreenState(CatalogSectionState catalogSectionState, String str, List<CatalogButtonDo> list, Throwable th, mm50<CatalogSectionState, yda, bea> mm50Var) {
        this.b = catalogSectionState;
        this.c = str;
        this.d = list;
        this.e = th;
        this.f = mm50Var;
    }

    public CatalogSectionScreenState(CatalogSectionState catalogSectionState, String str, List list, Throwable th, mm50 mm50Var, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : catalogSectionState, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? EmptyList.b : list, (i & 8) != 0 ? null : th, (i & 16) != 0 ? null : mm50Var);
    }
}

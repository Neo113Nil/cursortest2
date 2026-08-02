package com.vk.catalog.mvi.section.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.domain.CatalogExtraDo;
import com.vk.catalog.mvi.section.domain.CatalogReorderData;
import com.vk.catalog.mvi.section.domain.CatalogSectionDo;
import com.vk.catalog.mvi.section.ui.utils.ParcelableLazyListState;
import com.vk.catalog.mvi.section.ui.utils.ParcelableLazyState;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.bo;
import xsna.c5g;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.izi0;
import xsna.j5g;
import xsna.lm50;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogSectionState.kt */
/* loaded from: classes16.dex */
public final class CatalogSectionState implements lm50, Parcelable {
    public static final Parcelable.Creator<CatalogSectionState> CREATOR = new a();
    public final boolean b;
    public final String c;
    public final List<CatalogBlockData> d;
    public final ParcelableLazyState e;
    public final boolean f;
    public final boolean g;
    public final Throwable h;
    public final Throwable i;
    public final boolean j;
    public final List<CatalogBlockData> k;
    public final List<CatalogReorderData> l;
    public final CatalogExtraDo m;
    public final ScrollScreenType n;

    /* compiled from: CatalogSectionState.kt */
    public static final class a implements Parcelable.Creator<CatalogSectionState> {
        @Override // android.os.Parcelable.Creator
        public final CatalogSectionState createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ParcelableLazyState parcelableLazyState;
            boolean z = parcel.readInt() != 0;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(CatalogSectionState.class, parcel, arrayList2, i, 1);
            }
            ParcelableLazyState parcelableLazyState2 = (ParcelableLazyState) parcel.readParcelable(CatalogSectionState.class.getClassLoader());
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            Throwable th = (Throwable) parcel.readSerializable();
            Throwable th2 = (Throwable) parcel.readSerializable();
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = bo.b(CatalogSectionState.class, parcel, arrayList, i2, 1);
                }
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList3 = arrayList;
            ArrayList arrayList4 = new ArrayList(readInt3);
            int i3 = 0;
            while (true) {
                parcelableLazyState = parcelableLazyState2;
                if (i3 == readInt3) {
                    break;
                }
                i3 = en.a(CatalogReorderData.CREATOR, parcel, arrayList4, i3, 1);
                parcelableLazyState2 = parcelableLazyState;
            }
            return new CatalogSectionState(z, readString, arrayList2, parcelableLazyState, z2, z3, th, th2, z4, arrayList3, arrayList4, (CatalogExtraDo) parcel.readParcelable(CatalogSectionState.class.getClassLoader()), parcel.readInt() == 0 ? null : ScrollScreenType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogSectionState[] newArray(int i) {
            return new CatalogSectionState[i];
        }
    }

    public CatalogSectionState(boolean z, String str, List<CatalogBlockData> list, ParcelableLazyState parcelableLazyState, boolean z2, boolean z3, Throwable th, Throwable th2, boolean z4, List<CatalogBlockData> list2, List<CatalogReorderData> list3, CatalogExtraDo catalogExtraDo, ScrollScreenType scrollScreenType) {
        this.b = z;
        this.c = str;
        this.d = list;
        this.e = parcelableLazyState;
        this.f = z2;
        this.g = z3;
        this.h = th;
        this.i = th2;
        this.j = z4;
        this.k = list2;
        this.l = list3;
        this.m = catalogExtraDo;
        this.n = scrollScreenType;
    }

    public static CatalogSectionState a(CatalogSectionState catalogSectionState, List list, boolean z, boolean z2, Throwable th, Throwable th2, boolean z3, ArrayList arrayList, List list2, CatalogExtraDo catalogExtraDo, ScrollScreenType scrollScreenType, int i) {
        boolean z4 = catalogSectionState.b;
        String str = catalogSectionState.c;
        List list3 = (i & 4) != 0 ? catalogSectionState.d : list;
        ParcelableLazyState parcelableLazyState = catalogSectionState.e;
        boolean z5 = (i & 16) != 0 ? catalogSectionState.f : z;
        boolean z6 = (i & 32) != 0 ? catalogSectionState.g : z2;
        Throwable th3 = (i & 64) != 0 ? catalogSectionState.h : th;
        Throwable th4 = (i & 128) != 0 ? catalogSectionState.i : th2;
        boolean z7 = (i & 256) != 0 ? catalogSectionState.j : z3;
        List<CatalogBlockData> list4 = (i & 512) != 0 ? catalogSectionState.k : arrayList;
        List list5 = (i & 1024) != 0 ? catalogSectionState.l : list2;
        CatalogExtraDo catalogExtraDo2 = (i & 2048) != 0 ? catalogSectionState.m : catalogExtraDo;
        ScrollScreenType scrollScreenType2 = (i & 4096) != 0 ? catalogSectionState.n : scrollScreenType;
        catalogSectionState.getClass();
        return new CatalogSectionState(z4, str, list3, parcelableLazyState, z5, z6, th3, th4, z7, list4, list5, catalogExtraDo2, scrollScreenType2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSectionState)) {
            return false;
        }
        CatalogSectionState catalogSectionState = (CatalogSectionState) obj;
        return this.b == catalogSectionState.b && epx.f(this.c, catalogSectionState.c) && epx.f(this.d, catalogSectionState.d) && epx.f(this.e, catalogSectionState.e) && this.f == catalogSectionState.f && this.g == catalogSectionState.g && epx.f(this.h, catalogSectionState.h) && epx.f(this.i, catalogSectionState.i) && this.j == catalogSectionState.j && epx.f(this.k, catalogSectionState.k) && epx.f(this.l, catalogSectionState.l) && epx.f(this.m, catalogSectionState.m) && this.n == catalogSectionState.n;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b((this.e.hashCode() + fw3.a(urd0.a(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g);
        Throwable th = this.h;
        int hashCode = (b + (th == null ? 0 : th.hashCode())) * 31;
        Throwable th2 = this.i;
        int b2 = qoy.b((hashCode + (th2 == null ? 0 : th2.hashCode())) * 31, 31, this.j);
        List<CatalogBlockData> list = this.k;
        int hashCode2 = (this.m.hashCode() + fw3.a((b2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.l)) * 31;
        ScrollScreenType scrollScreenType = this.n;
        return hashCode2 + (scrollScreenType != null ? scrollScreenType.hashCode() : 0);
    }

    public final CatalogSectionState j(CatalogSectionDo catalogSectionDo) {
        List<CatalogBlockData> list = this.d;
        List<CatalogBlockState> list2 = catalogSectionDo.c;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new CatalogBlockData((CatalogBlockState) it.next()));
        }
        ArrayList u0 = j5g.u0(arrayList, list);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = u0.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((CatalogBlockState) ((CatalogBlockData) next).b.getValue()).w())) {
                arrayList2.add(next);
            }
        }
        CatalogExtraDo catalogExtraDo = catalogSectionDo.d;
        CatalogExtraDo catalogExtraDo2 = this.m;
        catalogExtraDo2.getClass();
        return a(this, arrayList2, false, false, null, null, false, null, null, new CatalogExtraDo(catalogExtraDo.b, CatalogExtraDo.a(catalogExtraDo2.c, catalogExtraDo.c), izi0.j(catalogExtraDo2.d, catalogExtraDo.d)), null, 6139);
    }

    public final String toString() {
        return "CatalogSectionState(isPTREnabled=" + this.b + ", sectionId=" + this.c + ", blockList=" + this.d + ", lazyState=" + this.e + ", isContentLoading=" + this.f + ", isNextContentLoading=" + this.g + ", contentLoadingError=" + this.h + ", nextContentLoadingError=" + this.i + ", isReorderEnabled=" + this.j + ", reorderedBlockList=" + this.k + ", reorderData=" + this.l + ", sectionExtra=" + this.m + ", scrollScreenType=" + this.n + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        Iterator a2 = ao.a(parcel, this.d);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeSerializable(this.h);
        parcel.writeSerializable(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        List<CatalogBlockData> list = this.k;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Iterator a3 = ao.a(parcel, this.l);
        while (a3.hasNext()) {
            ((CatalogReorderData) a3.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.m, i);
        ScrollScreenType scrollScreenType = this.n;
        if (scrollScreenType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(scrollScreenType.name());
        }
    }

    public CatalogSectionState(boolean z, String str, List list, ParcelableLazyState parcelableLazyState, boolean z2, boolean z3, Throwable th, Throwable th2, boolean z4, List list2, List list3, CatalogExtraDo catalogExtraDo, ScrollScreenType scrollScreenType, int i, zcl zclVar) {
        this((i & 1) != 0 ? true : z, str, (i & 4) != 0 ? EmptyList.b : list, (i & 8) != 0 ? new ParcelableLazyListState(ParcelableLazyListState.d()) : parcelableLazyState, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? null : th, (i & 128) != 0 ? null : th2, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? null : list2, (i & 1024) != 0 ? EmptyList.b : list3, (i & 2048) != 0 ? new CatalogExtraDo(null, null, null, 7, null) : catalogExtraDo, (i & 4096) != 0 ? null : scrollScreenType);
    }
}

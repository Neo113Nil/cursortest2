package com.vk.catalog.mvi.block.video.impl.movies.detail.info;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import defpackage.q0;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.nr;
import xsna.qoy;

/* compiled from: MovieInfoView.kt */
/* loaded from: classes.dex */
public final class MovieInfoView$MovieInfoBlockState implements CatalogBlockState {
    public static final Parcelable.Creator<MovieInfoView$MovieInfoBlockState> CREATOR = new a();
    public final BlockId b;
    public final CatalogBlockVariant c;
    public final List<String> d;
    public final List<String> e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final List<String> i;
    public final String j;
    public final String k;
    public final List<String> l;
    public final List<String> m;
    public final List<String> n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    /* compiled from: MovieInfoView.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<MovieInfoView$MovieInfoBlockState> {
        @Override // android.os.Parcelable.Creator
        public final MovieInfoView$MovieInfoBlockState createFromParcel(Parcel parcel) {
            boolean z;
            Integer num;
            Integer num2;
            BlockId blockId = (BlockId) parcel.readParcelable(MovieInfoView$MovieInfoBlockState.class.getClassLoader());
            CatalogBlockVariant valueOf = CatalogBlockVariant.valueOf(parcel.readString());
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList5 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList6 = parcel.createStringArrayList();
            boolean z2 = false;
            boolean z3 = true;
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                Integer num3 = valueOf3;
                num = valueOf4;
                num2 = num3;
            } else {
                Integer num4 = valueOf3;
                num = valueOf4;
                num2 = num4;
                z3 = z;
            }
            return new MovieInfoView$MovieInfoBlockState(blockId, valueOf, createStringArrayList, createStringArrayList2, valueOf2, num2, num, createStringArrayList3, readString, readString2, createStringArrayList4, createStringArrayList5, createStringArrayList6, z4, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final MovieInfoView$MovieInfoBlockState[] newArray(int i) {
            return new MovieInfoView$MovieInfoBlockState[i];
        }
    }

    public MovieInfoView$MovieInfoBlockState(BlockId blockId, CatalogBlockVariant catalogBlockVariant, List<String> list, List<String> list2, Integer num, Integer num2, Integer num3, List<String> list3, String str, String str2, List<String> list4, List<String> list5, List<String> list6, boolean z, boolean z2, boolean z3) {
        this.b = blockId;
        this.c = catalogBlockVariant;
        this.d = list;
        this.e = list2;
        this.f = num;
        this.g = num2;
        this.h = num3;
        this.i = list3;
        this.j = str;
        this.k = str2;
        this.l = list4;
        this.m = list5;
        this.n = list6;
        this.o = z;
        this.p = z2;
        this.q = z3;
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final CatalogBlockVariant M7() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieInfoView$MovieInfoBlockState)) {
            return false;
        }
        MovieInfoView$MovieInfoBlockState movieInfoView$MovieInfoBlockState = (MovieInfoView$MovieInfoBlockState) obj;
        return epx.f(this.b, movieInfoView$MovieInfoBlockState.b) && this.c == movieInfoView$MovieInfoBlockState.c && epx.f(this.d, movieInfoView$MovieInfoBlockState.d) && epx.f(this.e, movieInfoView$MovieInfoBlockState.e) && epx.f(this.f, movieInfoView$MovieInfoBlockState.f) && epx.f(this.g, movieInfoView$MovieInfoBlockState.g) && epx.f(this.h, movieInfoView$MovieInfoBlockState.h) && epx.f(this.i, movieInfoView$MovieInfoBlockState.i) && epx.f(this.j, movieInfoView$MovieInfoBlockState.j) && epx.f(this.k, movieInfoView$MovieInfoBlockState.k) && epx.f(this.l, movieInfoView$MovieInfoBlockState.l) && epx.f(this.m, movieInfoView$MovieInfoBlockState.m) && epx.f(this.n, movieInfoView$MovieInfoBlockState.n) && this.o == movieInfoView$MovieInfoBlockState.o && this.p == movieInfoView$MovieInfoBlockState.p && this.q == movieInfoView$MovieInfoBlockState.q;
    }

    public final int hashCode() {
        int b = b.b(this.c, this.b.hashCode() * 31, 31);
        List<String> list = this.d;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.e;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.f;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.h;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<String> list3 = this.i;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.j;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list4 = this.l;
        int hashCode9 = (hashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.m;
        int hashCode10 = (hashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<String> list6 = this.n;
        return Boolean.hashCode(this.q) + qoy.b(qoy.b((hashCode10 + (list6 != null ? list6.hashCode() : 0)) * 31, 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieInfoBlockState(blockId=");
        sb.append(this.b);
        sb.append(", blockVariant=");
        sb.append(this.c);
        sb.append(", genres=");
        sb.append(this.d);
        sb.append(", countryNames=");
        sb.append(this.e);
        sb.append(", releaseYear=");
        sb.append(this.f);
        sb.append(", finishYear=");
        sb.append(this.g);
        sb.append(", durationMinutes=");
        sb.append(this.h);
        sb.append(", directorNames=");
        sb.append(this.i);
        sb.append(", worldPremiereDate=");
        sb.append(this.j);
        sb.append(", russiaPremiereDate=");
        sb.append(this.k);
        sb.append(", screenWriterNames=");
        sb.append(this.l);
        sb.append(", composerNames=");
        sb.append(this.m);
        sb.append(", operatorNames=");
        sb.append(this.n);
        sb.append(", isMovie=");
        sb.append(this.o);
        sb.append(", isExpanded=");
        sb.append(this.p);
        sb.append(", isExpandable=");
        return q0.a(sb, this.q, ')');
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final BlockId w() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
        parcel.writeStringList(this.d);
        parcel.writeStringList(this.e);
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.g;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.h;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeStringList(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
    }
}

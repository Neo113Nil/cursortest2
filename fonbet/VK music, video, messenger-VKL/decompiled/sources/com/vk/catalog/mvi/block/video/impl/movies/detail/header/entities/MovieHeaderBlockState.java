package com.vk.catalog.mvi.block.video.impl.movies.detail.header.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.nr;
import xsna.urd0;

/* compiled from: MovieHeaderBlockState.kt */
/* loaded from: classes.dex */
public final class MovieHeaderBlockState implements CatalogBlockState {
    public static final Parcelable.Creator<MovieHeaderBlockState> CREATOR = new a();
    public final BlockId b;
    public final CatalogBlockVariant c;
    public final String d;
    public final String e;
    public final Integer f;
    public final List<String> g;
    public final List<String> h;
    public final Integer i;
    public final Integer j;
    public final String k;

    /* compiled from: MovieHeaderBlockState.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<MovieHeaderBlockState> {
        @Override // android.os.Parcelable.Creator
        public final MovieHeaderBlockState createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer num;
            BlockId blockId = (BlockId) parcel.readParcelable(MovieHeaderBlockState.class.getClassLoader());
            CatalogBlockVariant valueOf2 = CatalogBlockVariant.valueOf(parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
                num = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                num = null;
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            Integer num2 = num;
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            Integer valueOf3 = parcel.readInt() == 0 ? num2 : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                num2 = Integer.valueOf(parcel.readInt());
            }
            return new MovieHeaderBlockState(blockId, valueOf2, readString, readString2, valueOf, createStringArrayList, createStringArrayList2, valueOf3, num2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MovieHeaderBlockState[] newArray(int i) {
            return new MovieHeaderBlockState[i];
        }
    }

    public MovieHeaderBlockState(BlockId blockId, CatalogBlockVariant catalogBlockVariant, String str, String str2, Integer num, List<String> list, List<String> list2, Integer num2, Integer num3, String str3) {
        this.b = blockId;
        this.c = catalogBlockVariant;
        this.d = str;
        this.e = str2;
        this.f = num;
        this.g = list;
        this.h = list2;
        this.i = num2;
        this.j = num3;
        this.k = str3;
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
        if (!(obj instanceof MovieHeaderBlockState)) {
            return false;
        }
        MovieHeaderBlockState movieHeaderBlockState = (MovieHeaderBlockState) obj;
        return epx.f(this.b, movieHeaderBlockState.b) && this.c == movieHeaderBlockState.c && epx.f(this.d, movieHeaderBlockState.d) && epx.f(this.e, movieHeaderBlockState.e) && epx.f(this.f, movieHeaderBlockState.f) && epx.f(this.g, movieHeaderBlockState.g) && epx.f(this.h, movieHeaderBlockState.h) && epx.f(this.i, movieHeaderBlockState.i) && epx.f(this.j, movieHeaderBlockState.j) && epx.f(this.k, movieHeaderBlockState.k);
    }

    public final int hashCode() {
        int a2 = urd0.a(b.b(this.c, this.b.hashCode() * 31, 31), 31, this.d);
        String str = this.e;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.g;
        int a3 = fw3.a((hashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.h);
        Integer num2 = this.i;
        int hashCode3 = (a3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.j;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.k;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieHeaderBlockState(blockId=");
        sb.append(this.b);
        sb.append(", blockVariant=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", originalTitle=");
        sb.append(this.e);
        sb.append(", releaseYear=");
        sb.append(this.f);
        sb.append(", genres=");
        sb.append(this.g);
        sb.append(", releaseCountries=");
        sb.append(this.h);
        sb.append(", durationMinutes=");
        sb.append(this.i);
        sb.append(", seasonsCount=");
        sb.append(this.j);
        sb.append(", formattedAgeRestriction=");
        return ho8.a(sb, this.k, ')');
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final BlockId w() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeStringList(this.g);
        parcel.writeStringList(this.h);
        Integer num2 = this.i;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.j;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.k);
    }
}

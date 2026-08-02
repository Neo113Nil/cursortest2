package com.vk.catalog.mvi.block;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.air;
import xsna.epx;
import xsna.ho8;
import xsna.vby;

/* compiled from: CatalogBlockEntity.kt */
/* loaded from: classes16.dex */
public interface BlockId extends Parcelable {

    /* compiled from: CatalogBlockEntity.kt */
    public static final class CompositeId implements BlockId {
        public static final Parcelable.Creator<CompositeId> CREATOR = new a();
        public final String b;
        public final String c;

        /* compiled from: CatalogBlockEntity.kt */
        public static final class a implements Parcelable.Creator<CompositeId> {
            @Override // android.os.Parcelable.Creator
            public final CompositeId createFromParcel(Parcel parcel) {
                return new CompositeId(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CompositeId[] newArray(int i) {
                return new CompositeId[i];
            }
        }

        public CompositeId(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CompositeId)) {
                return false;
            }
            CompositeId compositeId = (CompositeId) obj;
            return epx.f(this.b, compositeId.b) && epx.f(this.c, compositeId.c);
        }

        @Override // com.vk.catalog.mvi.block.BlockId
        public final String getId() {
            return this.b;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CompositeId(id=");
            sb.append(this.b);
            sb.append(", secondaryId=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
        }
    }

    /* compiled from: CatalogBlockEntity.kt */
    @vby
    public static final class Simple implements BlockId {
        public static final Parcelable.Creator<Simple> CREATOR = new a();
        public final String b;

        /* compiled from: CatalogBlockEntity.kt */
        public static final class a implements Parcelable.Creator<Simple> {
            @Override // android.os.Parcelable.Creator
            public final Simple createFromParcel(Parcel parcel) {
                return new Simple(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Simple[] newArray(int i) {
                return new Simple[i];
            }
        }

        public /* synthetic */ Simple(String str) {
            this.b = str;
        }

        public static final /* synthetic */ Simple a(String str) {
            return new Simple(str);
        }

        public static final boolean b(String str, String str2) {
            return epx.f(str, str2);
        }

        public static int d(String str) {
            return str.hashCode();
        }

        public static String e(String str) {
            return air.b(')', "Simple(id=", str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Simple) {
                return epx.f(this.b, ((Simple) obj).b);
            }
            return false;
        }

        @Override // com.vk.catalog.mvi.block.BlockId
        public final String getId() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return e(this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    /* compiled from: CatalogBlockEntity.kt */
    public static final class Unique implements BlockId {
        public static final Parcelable.Creator<Unique> CREATOR = new a();
        public final String b;

        /* compiled from: CatalogBlockEntity.kt */
        public static final class a implements Parcelable.Creator<Unique> {
            @Override // android.os.Parcelable.Creator
            public final Unique createFromParcel(Parcel parcel) {
                return new Unique(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Unique[] newArray(int i) {
                return new Unique[i];
            }
        }

        public Unique(String str) {
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.catalog.mvi.block.BlockId
        public final String getId() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
        }
    }

    String getId();
}

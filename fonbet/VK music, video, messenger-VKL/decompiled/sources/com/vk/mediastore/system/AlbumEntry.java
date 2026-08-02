package com.vk.mediastore.system;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AlbumEntry.kt */
/* loaded from: classes3.dex */
public final class AlbumEntry implements Parcelable {
    public static final Parcelable.Creator<AlbumEntry> CREATOR = new a();
    public final int b;
    public final String c;
    public final List<MediaStoreEntry> d;
    public final boolean e;
    public final int f;
    public final String g;

    /* compiled from: AlbumEntry.kt */
    public static final class a implements Parcelable.Creator<AlbumEntry> {
        @Override // android.os.Parcelable.Creator
        public final AlbumEntry createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(AlbumEntry.class, parcel, arrayList, i, 1);
            }
            return new AlbumEntry(readInt, readString, arrayList, parcel.readInt() != 0, parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumEntry[] newArray(int i) {
            return new AlbumEntry[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlbumEntry(int i, String str, List<? extends MediaStoreEntry> list, boolean z, int i2, String str2) {
        this.b = i;
        this.c = str;
        this.d = list;
        this.e = z;
        this.f = i2;
        this.g = str2;
    }

    public static AlbumEntry a(AlbumEntry albumEntry, List list, int i, int i2) {
        int i3 = albumEntry.b;
        String str = albumEntry.c;
        boolean z = albumEntry.e;
        if ((i2 & 16) != 0) {
            i = albumEntry.f;
        }
        String str2 = albumEntry.g;
        albumEntry.getClass();
        return new AlbumEntry(i3, str, list, z, i, str2);
    }

    public final int d() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlbumEntry)) {
            return false;
        }
        AlbumEntry albumEntry = (AlbumEntry) obj;
        return this.b == albumEntry.b && epx.f(this.c, albumEntry.c) && epx.f(this.d, albumEntry.d) && this.e == albumEntry.e && this.f == albumEntry.f && epx.f(this.g, albumEntry.g);
    }

    public final int hashCode() {
        int a2 = shy.a(this.f, qoy.b(fw3.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31);
        String str = this.g;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumEntry(bucketId=");
        sb.append(this.b);
        sb.append(", albumName=");
        sb.append(this.c);
        sb.append(", albumEntries=");
        sb.append(this.d);
        sb.append(", isCameraBucket=");
        sb.append(this.e);
        sb.append(", entriesCount=");
        sb.append(this.f);
        sb.append(", relativePath=");
        return ho8.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        Iterator a2 = ao.a(parcel, this.d);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
    }

    public AlbumEntry(int i, String str, List list, boolean z, int i2, String str2, int i3, zcl zclVar) {
        this(i, str, (i3 & 4) != 0 ? EmptyList.b : list, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : str2);
    }
}

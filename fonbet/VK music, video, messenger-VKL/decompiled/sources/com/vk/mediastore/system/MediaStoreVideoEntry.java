package com.vk.mediastore.system;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import xsna.bh10;
import xsna.epx;
import xsna.shy;
import xsna.vu5;

/* compiled from: MediaStoreEntry.kt */
/* loaded from: classes3.dex */
public final class MediaStoreVideoEntry extends MediaStoreEntry {
    public static final Parcelable.Creator<MediaStoreVideoEntry> CREATOR = new a();
    public final int j;
    public final Uri k;
    public final long l;
    public final int m;
    public final int n;
    public final long o;
    public final long p;
    public final long q;

    /* compiled from: MediaStoreEntry.kt */
    public static final class a implements Parcelable.Creator<MediaStoreVideoEntry> {
        @Override // android.os.Parcelable.Creator
        public final MediaStoreVideoEntry createFromParcel(Parcel parcel) {
            return new MediaStoreVideoEntry(parcel.readInt(), (Uri) parcel.readParcelable(MediaStoreVideoEntry.class.getClassLoader()), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final MediaStoreVideoEntry[] newArray(int i) {
            return new MediaStoreVideoEntry[i];
        }
    }

    public MediaStoreVideoEntry(int i, Uri uri, long j, int i2, int i3, long j2, long j3, long j4) {
        super(i, uri, j, i2, i3, j2, j3, null);
        this.j = i;
        this.k = uri;
        this.l = j;
        this.m = i2;
        this.n = i3;
        this.o = j2;
        this.p = j3;
        this.q = j4;
    }

    @Override // com.vk.mediastore.system.MediaStoreEntry
    public final long d() {
        return this.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.vk.mediastore.system.MediaStoreEntry
    public final long e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaStoreVideoEntry)) {
            return false;
        }
        MediaStoreVideoEntry mediaStoreVideoEntry = (MediaStoreVideoEntry) obj;
        return this.j == mediaStoreVideoEntry.j && epx.f(this.k, mediaStoreVideoEntry.k) && this.l == mediaStoreVideoEntry.l && this.m == mediaStoreVideoEntry.m && this.n == mediaStoreVideoEntry.n && this.o == mediaStoreVideoEntry.o && this.p == mediaStoreVideoEntry.p && this.q == mediaStoreVideoEntry.q;
    }

    @Override // com.vk.mediastore.system.MediaStoreEntry
    public final Uri f() {
        return this.k;
    }

    @Override // com.vk.mediastore.system.MediaStoreEntry
    public final long g() {
        return this.p;
    }

    @Override // com.vk.mediastore.system.MediaStoreEntry
    public final int getHeight() {
        return this.n;
    }

    @Override // com.vk.mediastore.system.MediaStoreEntry
    public final int getId() {
        return this.j;
    }

    @Override // com.vk.mediastore.system.MediaStoreEntry
    public final int getWidth() {
        return this.m;
    }

    public final int hashCode() {
        return Long.hashCode(this.q) + bh10.a(bh10.a(shy.a(this.n, shy.a(this.m, bh10.a((this.k.hashCode() + (Integer.hashCode(this.j) * 31)) * 31, 31, this.l), 31), 31), 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaStoreVideoEntry(id=");
        sb.append(this.j);
        sb.append(", pathUri=");
        sb.append(this.k);
        sb.append(", dateTaken=");
        sb.append(this.l);
        sb.append(", width=");
        sb.append(this.m);
        sb.append(", height=");
        sb.append(this.n);
        sb.append(", dateModified=");
        sb.append(this.o);
        sb.append(", size=");
        sb.append(this.p);
        sb.append(", durationMs=");
        return vu5.a(')', this.q, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.j);
        parcel.writeParcelable(this.k, i);
        parcel.writeLong(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
        parcel.writeLong(this.q);
    }
}

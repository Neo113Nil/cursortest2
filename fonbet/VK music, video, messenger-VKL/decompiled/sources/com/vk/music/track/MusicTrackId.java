package com.vk.music.track;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.c5g;
import xsna.epx;
import xsna.ho8;
import xsna.p4g;
import xsna.shy;

/* compiled from: MusicTrackId.kt */
/* loaded from: classes3.dex */
public final class MusicTrackId implements Parcelable {
    public static final Parcelable.Creator<MusicTrackId> CREATOR = new a();
    public final long b;
    public final int c;
    public final String d;

    /* compiled from: MusicTrackId.kt */
    public static final class a implements Parcelable.Creator<MusicTrackId> {
        @Override // android.os.Parcelable.Creator
        public final MusicTrackId createFromParcel(Parcel parcel) {
            return new MusicTrackId(parcel.readLong(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MusicTrackId[] newArray(int i) {
            return new MusicTrackId[i];
        }
    }

    public MusicTrackId(long j, int i, String str) {
        this.b = j;
        this.c = i;
        this.d = str;
    }

    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MusicTrack musicTrack = (MusicTrack) it.next();
            arrayList2.add(new MusicTrackId(musicTrack.c.b, musicTrack.b, musicTrack.r));
        }
        return p4g.q(arrayList2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicTrackId)) {
            return false;
        }
        MusicTrackId musicTrackId = (MusicTrackId) obj;
        return this.b == musicTrackId.b && this.c == musicTrackId.c && epx.f(this.d, musicTrackId.d);
    }

    public final int hashCode() {
        int a2 = shy.a(this.c, Long.hashCode(this.b) * 31, 31);
        String str = this.d;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicTrackId(ownerId=");
        sb.append(this.b);
        sb.append(", audioId=");
        sb.append(this.c);
        sb.append(", accessKey=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
    }
}

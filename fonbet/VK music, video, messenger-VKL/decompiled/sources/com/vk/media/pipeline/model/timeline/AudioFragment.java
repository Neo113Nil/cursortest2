package com.vk.media.pipeline.model.timeline;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.en;
import xsna.epx;
import xsna.vu5;

/* compiled from: Timeline.kt */
/* loaded from: classes3.dex */
public final class AudioFragment implements Fragment {
    public static final Parcelable.Creator<AudioFragment> CREATOR = new a();
    public final List<AudioFragmentItem> b;
    public final long c;
    public final long d;

    /* compiled from: Timeline.kt */
    public static final class a implements Parcelable.Creator<AudioFragment> {
        @Override // android.os.Parcelable.Creator
        public final AudioFragment createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AudioFragmentItem.CREATOR, parcel, arrayList, i, 1);
            }
            return new AudioFragment(arrayList, parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioFragment[] newArray(int i) {
            return new AudioFragment[i];
        }
    }

    public AudioFragment(List<AudioFragmentItem> list, long j, long j2) {
        this.b = list;
        this.c = j;
        this.d = j2;
    }

    @Override // com.vk.media.pipeline.model.timeline.Fragment
    public final long O0() {
        return this.c;
    }

    @Override // com.vk.media.pipeline.model.timeline.Fragment
    public final long W0() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioFragment)) {
            return false;
        }
        AudioFragment audioFragment = (AudioFragment) obj;
        return epx.f(this.b, audioFragment.b) && this.c == audioFragment.c && this.d == audioFragment.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + bh10.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFragment(items=");
        sb.append(this.b);
        sb.append(", startMcs=");
        sb.append(this.c);
        sb.append(", endMcs=");
        return vu5.a(')', this.d, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((AudioFragmentItem) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
    }
}

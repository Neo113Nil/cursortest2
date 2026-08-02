package com.vk.media.pipeline.model.timeline;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;

/* compiled from: Timeline.kt */
/* loaded from: classes3.dex */
public final class Timeline implements Parcelable {
    public static final Parcelable.Creator<Timeline> CREATOR = new a();
    public final List<VideoFragment> b;
    public final AudioFragment c;
    public final long d;

    /* compiled from: Timeline.kt */
    public static final class a implements Parcelable.Creator<Timeline> {
        @Override // android.os.Parcelable.Creator
        public final Timeline createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VideoFragment.CREATOR, parcel, arrayList, i, 1);
            }
            return new Timeline(arrayList, AudioFragment.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Timeline[] newArray(int i) {
            return new Timeline[i];
        }
    }

    public Timeline(List<VideoFragment> list, AudioFragment audioFragment) {
        this.b = list;
        this.c = audioFragment;
        Iterator<T> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((VideoFragment) it.next()).d();
        }
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        return epx.f(this.b, timeline.b) && epx.f(this.c, timeline.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Timeline(videoFragments=" + this.b + ", audioFragment=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((VideoFragment) a2.next()).writeToParcel(parcel, i);
        }
        this.c.writeToParcel(parcel, i);
    }
}

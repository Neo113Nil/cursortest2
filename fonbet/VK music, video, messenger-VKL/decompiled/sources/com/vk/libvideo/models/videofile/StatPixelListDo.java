package com.vk.libvideo.models.videofile;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;

/* compiled from: VideoFilePlaybackDo.kt */
/* loaded from: classes3.dex */
public final class StatPixelListDo implements Parcelable {
    public static final Parcelable.Creator<StatPixelListDo> CREATOR = new a();
    public final List<StatPixelDo> b;

    /* compiled from: VideoFilePlaybackDo.kt */
    public static final class a implements Parcelable.Creator<StatPixelListDo> {
        @Override // android.os.Parcelable.Creator
        public final StatPixelListDo createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(StatPixelDo.CREATOR, parcel, arrayList, i, 1);
            }
            return new StatPixelListDo(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StatPixelListDo[] newArray(int i) {
            return new StatPixelListDo[i];
        }
    }

    public StatPixelListDo(List<StatPixelDo> list) {
        this.b = list;
    }

    public final List<StatPixelDo> d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StatPixelListDo) && epx.f(this.b, ((StatPixelListDo) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("StatPixelListDo(list="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((StatPixelDo) a2.next()).writeToParcel(parcel, i);
        }
    }
}

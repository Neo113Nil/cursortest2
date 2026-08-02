package com.vk.libvideo;

import android.os.Parcel;
import com.vk.api.base.utils.Range;
import com.vk.core.serialize.Serializer;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.epx;
import xsna.j5g;
import xsna.zcl;

/* compiled from: RangeCollection.kt */
/* loaded from: classes17.dex */
public final class RangeCollection implements Serializer.StreamParcelable {
    public static final Serializer.c<RangeCollection> CREATOR = new a();
    public Range b;
    public final CopyOnWriteArrayList<Range> c;
    public final CopyOnWriteArrayList<String> d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<RangeCollection> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RangeCollection a(Serializer serializer) {
            Range range = (Range) serializer.G(Range.class.getClassLoader());
            ArrayList j = serializer.j(Range.CREATOR);
            CopyOnWriteArrayList copyOnWriteArrayList = j != null ? new CopyOnWriteArrayList(j) : new CopyOnWriteArrayList();
            ArrayList<String> h = serializer.h();
            return new RangeCollection(range, copyOnWriteArrayList, h != null ? new CopyOnWriteArrayList(j5g.V(h)) : new CopyOnWriteArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RangeCollection[i];
        }
    }

    public RangeCollection() {
        this(null, null, null, 7, null);
    }

    public static final void g(RangeCollection rangeCollection, RangeCollection rangeCollection2) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = rangeCollection.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            if (!rangeCollection2.d.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(arrayList);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.o0(this.c);
        serializer.l0(this.d);
    }

    public final void d() {
        ArrayList arrayList;
        Range range = this.b;
        if (range != null) {
            long j = range.c - range.b;
            CopyOnWriteArrayList<Range> copyOnWriteArrayList = this.c;
            if (j != 0) {
                copyOnWriteArrayList.add(range);
            }
            if (copyOnWriteArrayList.isEmpty()) {
                arrayList = new ArrayList(0);
            } else {
                if (copyOnWriteArrayList.size() == 1) {
                    arrayList = new ArrayList(copyOnWriteArrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList(copyOnWriteArrayList);
                    Collections.sort(arrayList2);
                    Range range2 = (Range) arrayList2.get(0);
                    long j2 = range2.b;
                    long j3 = range2.c;
                    ArrayList arrayList3 = new ArrayList();
                    for (int i = 1; i < arrayList2.size(); i++) {
                        Range range3 = (Range) arrayList2.get(i);
                        if (range3.b <= j3) {
                            j3 = Math.max(range3.c, j3);
                        } else {
                            arrayList3.add(new Range(j2, j3));
                            j2 = range3.b;
                            j3 = range3.c;
                        }
                    }
                    arrayList3.add(new Range(j2, j3));
                    arrayList = arrayList3;
                }
            }
            copyOnWriteArrayList.clear();
            copyOnWriteArrayList.addAll(arrayList);
        }
        this.b = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        CopyOnWriteArrayList<Range> copyOnWriteArrayList = this.c;
        boolean z = !copyOnWriteArrayList.isEmpty();
        if (!copyOnWriteArrayList.isEmpty()) {
            this.d.add(j5g.g0(this.c, StringUtils.COMMA, null, null, 0, null, 62));
            copyOnWriteArrayList.clear();
        }
        return z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RangeCollection)) {
            return false;
        }
        RangeCollection rangeCollection = (RangeCollection) obj;
        return epx.f(this.b, rangeCollection.b) && epx.f(this.c, rangeCollection.c) && epx.f(this.d, rangeCollection.d);
    }

    public final String f() {
        return (String) j5g.i0(this.d);
    }

    public final int hashCode() {
        Range range = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((range == null ? 0 : range.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "RangeCollection(currentRange=" + this.b + ", closedRanges=" + this.c + ", sentRanges=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public RangeCollection(Range range, CopyOnWriteArrayList<Range> copyOnWriteArrayList, CopyOnWriteArrayList<String> copyOnWriteArrayList2) {
        this.b = range;
        this.c = copyOnWriteArrayList;
        this.d = copyOnWriteArrayList2;
    }

    public /* synthetic */ RangeCollection(Range range, CopyOnWriteArrayList copyOnWriteArrayList, CopyOnWriteArrayList copyOnWriteArrayList2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : range, (i & 2) != 0 ? new CopyOnWriteArrayList() : copyOnWriteArrayList, (i & 4) != 0 ? new CopyOnWriteArrayList() : copyOnWriteArrayList2);
    }
}

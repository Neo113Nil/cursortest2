package com.vk.libvideo.storage;

import com.vk.api.base.utils.Range;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.RangeCollection;
import defpackage.q0;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.c5g;
import xsna.epx;
import xsna.qoy;
import xsna.shy;

/* compiled from: CachedVideoViewedSegments.kt */
/* loaded from: classes3.dex */
public final class CachedVideoViewedSegments extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CachedVideoViewedSegments> CREATOR = new a();
    public final UserId b;
    public final int c;
    public String d;
    public final RangeCollection e;
    public String f;
    public int g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public boolean p;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CachedVideoViewedSegments> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CachedVideoViewedSegments a(Serializer serializer) {
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            int u = serializer.u();
            String H = serializer.H();
            RangeCollection rangeCollection = (RangeCollection) serializer.G(RangeCollection.class.getClassLoader());
            if (rangeCollection == null) {
                rangeCollection = new RangeCollection(null, null, null, 7, null);
            }
            return new CachedVideoViewedSegments(userId, u, H, rangeCollection, serializer.H(), serializer.u(), serializer.H(), serializer.H(), serializer.H(), serializer.u(), serializer.H(), serializer.H(), serializer.H(), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CachedVideoViewedSegments[i];
        }
    }

    public CachedVideoViewedSegments(UserId userId, int i, String str, RangeCollection rangeCollection, String str2, int i2, String str3, String str4, String str5, int i3, String str6, String str7, String str8, boolean z, boolean z2) {
        this.b = userId;
        this.c = i;
        this.d = str;
        this.e = rangeCollection;
        this.f = str2;
        this.g = i2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = i3;
        this.l = str6;
        this.m = str7;
        this.n = str8;
        this.o = z;
        this.p = z2;
    }

    public final int Ab() {
        return this.g;
    }

    public final String Bb() {
        return this.f;
    }

    public final String C4() {
        return this.d;
    }

    public final String Cb() {
        return this.j;
    }

    public final String Db() {
        return this.n;
    }

    public final RangeCollection Eb() {
        return this.e;
    }

    public final int Fb() {
        return this.k;
    }

    public final String Gb() {
        return this.i;
    }

    public final String Hb() {
        return this.h;
    }

    public final int Ib() {
        return this.c;
    }

    public final boolean Jb() {
        return !this.e.d.isEmpty();
    }

    public final boolean Kb() {
        return this.p;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.S(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.j0(this.f);
        serializer.S(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.S(this.k);
        serializer.j0(this.l);
        serializer.j0(this.m);
        serializer.j0(this.n);
        serializer.L(this.o ? (byte) 1 : (byte) 0);
        serializer.L(this.p ? (byte) 1 : (byte) 0);
    }

    public final void Xa(boolean z) {
        this.o = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedVideoViewedSegments)) {
            return false;
        }
        CachedVideoViewedSegments cachedVideoViewedSegments = (CachedVideoViewedSegments) obj;
        return epx.f(this.b, cachedVideoViewedSegments.b) && this.c == cachedVideoViewedSegments.c && epx.f(this.d, cachedVideoViewedSegments.d) && epx.f(this.e, cachedVideoViewedSegments.e) && epx.f(this.f, cachedVideoViewedSegments.f) && this.g == cachedVideoViewedSegments.g && epx.f(this.h, cachedVideoViewedSegments.h) && epx.f(this.i, cachedVideoViewedSegments.i) && epx.f(this.j, cachedVideoViewedSegments.j) && this.k == cachedVideoViewedSegments.k && epx.f(this.l, cachedVideoViewedSegments.l) && epx.f(this.m, cachedVideoViewedSegments.m) && epx.f(this.n, cachedVideoViewedSegments.n) && this.o == cachedVideoViewedSegments.o && this.p == cachedVideoViewedSegments.p;
    }

    public final int hashCode() {
        int a2 = shy.a(this.c, Long.hashCode(this.b.b) * 31, 31);
        String str = this.d;
        int hashCode = (this.e.hashCode() + ((a2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f;
        int a3 = shy.a(this.g, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.h;
        int hashCode2 = (a3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int a4 = shy.a(this.k, (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.l;
        int hashCode4 = (a4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.m;
        int hashCode5 = (hashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.n;
        return Boolean.hashCode(this.p) + qoy.b((hashCode5 + (str8 != null ? str8.hashCode() : 0)) * 31, 31, this.o);
    }

    public final UserId q() {
        return this.b;
    }

    public final String r() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CachedVideoViewedSegments(ownerId=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        sb.append(", referrer=");
        sb.append(this.d);
        sb.append(", rangeCollection=");
        sb.append(this.e);
        sb.append(", context=");
        sb.append(this.f);
        sb.append(", autoplay=");
        sb.append(this.g);
        sb.append(", stateStart=");
        sb.append(this.h);
        sb.append(", stateEnd=");
        sb.append(this.i);
        sb.append(", endStreamReason=");
        sb.append(this.j);
        sb.append(", startTime=");
        sb.append(this.k);
        sb.append(", trackCode=");
        sb.append(this.l);
        sb.append(", prevTrackCode=");
        sb.append(this.m);
        sb.append(", prevVideoId=");
        sb.append(this.n);
        sb.append(", added=");
        sb.append(this.o);
        sb.append(", isMuted=");
        return q0.a(sb, this.p, ')');
    }

    public final CachedVideoViewedSegments zb() {
        Range range;
        RangeCollection rangeCollection = this.e;
        if (rangeCollection.b != null) {
            Range range2 = rangeCollection.b;
            range = new Range(range2.b, range2.c);
        } else {
            range = null;
        }
        CopyOnWriteArrayList<Range> copyOnWriteArrayList = rangeCollection.c;
        ArrayList arrayList = new ArrayList(c5g.u(copyOnWriteArrayList, 10));
        for (Range range3 : copyOnWriteArrayList) {
            arrayList.add(new Range(range3.b, range3.c));
        }
        RangeCollection rangeCollection2 = new RangeCollection(range, new CopyOnWriteArrayList(arrayList), new CopyOnWriteArrayList(rangeCollection.d));
        return new CachedVideoViewedSegments(this.b, this.c, this.d, rangeCollection2, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p);
    }

    public CachedVideoViewedSegments(UserId userId, int i) {
        this(userId, i, null, new RangeCollection(null, null, null, 7, null), null, 0, null, null, null, 0, null, null, null, false, false);
    }
}

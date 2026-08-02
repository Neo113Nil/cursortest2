package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingTimelineEvent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.jgp;
import xsna.ms9;
import xsna.v11;
import xsna.zcl;

/* compiled from: PostingTechMetrics.kt */
/* loaded from: classes4.dex */
public final class PostingTechMetrics implements Parcelable {
    public static final Parcelable.Creator<PostingTechMetrics> CREATOR = new a();
    public static final PostingTechMetrics k;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Map<MobileOfficialAppsFeedStat$PickerType, Long> h;
    public final Map<Integer, PostingFileStats> i;
    public final List<MobileOfficialAppsFeedStat$PostingTimelineEvent> j;

    /* compiled from: PostingTechMetrics.kt */
    public static final class a implements Parcelable.Creator<PostingTechMetrics> {
        @Override // android.os.Parcelable.Creator
        public final PostingTechMetrics createFromParcel(Parcel parcel) {
            return new PostingTechMetrics(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, null, null, null, 448, null);
        }

        @Override // android.os.Parcelable.Creator
        public final PostingTechMetrics[] newArray(int i) {
            return new PostingTechMetrics[i];
        }
    }

    static {
        jgp jgpVar = jgp.b;
        k = new PostingTechMetrics(null, null, null, null, null, null, jgpVar, jgpVar, EmptyList.b);
    }

    public PostingTechMetrics(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Map<MobileOfficialAppsFeedStat$PickerType, Long> map, Map<Integer, PostingFileStats> map2, List<MobileOfficialAppsFeedStat$PostingTimelineEvent> list) {
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = l5;
        this.g = l6;
        this.h = map;
        this.i = map2;
        this.j = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PostingTechMetrics a(PostingTechMetrics postingTechMetrics, Long l, Long l2, Long l3, Long l4, Long l5, LinkedHashMap linkedHashMap, Map map, List list, int i) {
        if ((i & 1) != 0) {
            l = postingTechMetrics.b;
        }
        Long l6 = l;
        if ((i & 2) != 0) {
            l2 = postingTechMetrics.c;
        }
        Long l7 = l2;
        if ((i & 4) != 0) {
            l3 = postingTechMetrics.d;
        }
        Long l8 = l3;
        if ((i & 8) != 0) {
            l4 = postingTechMetrics.e;
        }
        Long l9 = l4;
        if ((i & 16) != 0) {
            l5 = postingTechMetrics.f;
        }
        Long l10 = l5;
        Long l11 = postingTechMetrics.g;
        Map map2 = (i & 64) != 0 ? postingTechMetrics.h : linkedHashMap;
        Map map3 = (i & 128) != 0 ? postingTechMetrics.i : map;
        List list2 = (i & 256) != 0 ? postingTechMetrics.j : list;
        postingTechMetrics.getClass();
        return new PostingTechMetrics(l6, l7, l8, l9, l10, l11, map2, map3, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingTechMetrics)) {
            return false;
        }
        PostingTechMetrics postingTechMetrics = (PostingTechMetrics) obj;
        return epx.f(this.b, postingTechMetrics.b) && epx.f(this.c, postingTechMetrics.c) && epx.f(this.d, postingTechMetrics.d) && epx.f(this.e, postingTechMetrics.e) && epx.f(this.f, postingTechMetrics.f) && epx.f(this.g, postingTechMetrics.g) && epx.f(this.h, postingTechMetrics.h) && epx.f(this.i, postingTechMetrics.i) && epx.f(this.j, postingTechMetrics.j);
    }

    public final int hashCode() {
        Long l = this.b;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.c;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.e;
        int hashCode4 = (hashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.f;
        int hashCode5 = (hashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.g;
        return this.j.hashCode() + v11.a(v11.a((hashCode5 + (l6 != null ? l6.hashCode() : 0)) * 31, 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingTechMetrics(startScreenTime=");
        sb.append(this.b);
        sb.append(", startScreenElapsedTime=");
        sb.append(this.c);
        sb.append(", createElapsedTime=");
        sb.append(this.d);
        sb.append(", interactElapsedTime=");
        sb.append(this.e);
        sb.append(", startPublishingElapsedTime=");
        sb.append(this.f);
        sb.append(", startPickerElapsedTime=");
        sb.append(this.g);
        sb.append(", pickersStarts=");
        sb.append(this.h);
        sb.append(", uploadingAttachments=");
        sb.append(this.i);
        sb.append(", events=");
        return ms9.a(')', sb, this.j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.b;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.f(parcel, 1, l);
        }
        Long l2 = this.c;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.f(parcel, 1, l2);
        }
        Long l3 = this.d;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.f(parcel, 1, l3);
        }
        Long l4 = this.e;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.f(parcel, 1, l4);
        }
        Long l5 = this.f;
        if (l5 == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.f(parcel, 1, l5);
        }
        Long l6 = this.g;
        if (l6 == null) {
            parcel.writeInt(0);
        } else {
            io.reactivex.rxjava3.subjects.b.f(parcel, 1, l6);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PostingTechMetrics(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Map map, Map map2, List list, int i, zcl zclVar) {
        this(l, l2, l3, l4, l5, l6, r12 != 0 ? r0 : map, (i & 128) != 0 ? r0 : map2, (i & 256) != 0 ? EmptyList.b : list);
        int i2 = i & 64;
        jgp jgpVar = jgp.b;
    }
}

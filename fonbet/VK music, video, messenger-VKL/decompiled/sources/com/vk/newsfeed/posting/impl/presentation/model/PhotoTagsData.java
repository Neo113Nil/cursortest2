package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;
import defpackage.q0;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.epx;
import xsna.fw3;
import xsna.j5g;
import xsna.jgp;
import xsna.zcl;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class PhotoTagsData implements Serializer.StreamParcelable {
    public static final Serializer.c<PhotoTagsData> CREATOR = new a();
    public final Map<Integer, List<PhotoTag>> b;
    public final Set<Integer> c;
    public final boolean d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PhotoTagsData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PhotoTagsData a(Serializer serializer) {
            Map map;
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u = serializer.u();
                if (u >= 0) {
                    map = new LinkedHashMap();
                    for (int i = 0; i < u; i++) {
                        map.put(Integer.valueOf(serializer.u()), serializer.B(PhotoTag.class.getClassLoader()));
                    }
                } else {
                    map = jgp.b;
                }
                return new PhotoTagsData(map, null, false, 6, null);
            } finally {
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PhotoTagsData[i];
        }
    }

    public PhotoTagsData(Map map, Set set, boolean z, int i, zcl zclVar) {
        this(map, (i & 2) != 0 ? EmptySet.b : set, (i & 4) != 0 ? false : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PhotoTagsData a(PhotoTagsData photoTagsData, LinkedHashMap linkedHashMap, Set set, int i) {
        Map map = linkedHashMap;
        if ((i & 1) != 0) {
            map = photoTagsData.b;
        }
        if ((i & 2) != 0) {
            set = photoTagsData.c;
        }
        boolean z = (i & 4) != 0 ? photoTagsData.d : true;
        photoTagsData.getClass();
        return new PhotoTagsData(map, set, z);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        Map<Integer, List<PhotoTag>> map = this.b;
        if (map == null) {
            serializer.S(-1);
            return;
        }
        Iterator c = n.c(serializer, map);
        while (c.hasNext()) {
            Map.Entry entry = (Map.Entry) c.next();
            serializer.S(((Number) entry.getKey()).intValue());
            serializer.f0(j5g.O0((List) entry.getValue()));
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoTagsData)) {
            return false;
        }
        PhotoTagsData photoTagsData = (PhotoTagsData) obj;
        return epx.f(this.b, photoTagsData.b) && epx.f(this.c, photoTagsData.c) && this.d == photoTagsData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + fw3.b(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoTagsData(map=");
        sb.append(this.b);
        sb.append(", pendingPhotoIds=");
        sb.append(this.c);
        sb.append(", isTagsLoaded=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PhotoTagsData(Map<Integer, ? extends List<PhotoTag>> map, Set<Integer> set, boolean z) {
        this.b = map;
        this.c = set;
        this.d = z;
    }
}

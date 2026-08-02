package com.vk.story.viewer.stat.data.cache.viewers.replies;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.model.StoriesContainer;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.cjl0;
import xsna.epx;
import xsna.jgp;
import xsna.zcl;

/* compiled from: RepliesCachedData.kt */
/* loaded from: classes6.dex */
public final class RepliesCachedData implements Serializer.StreamParcelable {
    public static final Serializer.c<RepliesCachedData> CREATOR = new a();
    public final Map<RepliesKey, List<StoriesContainer>> b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<RepliesCachedData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RepliesCachedData a(Serializer serializer) {
            return new RepliesCachedData(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RepliesCachedData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RepliesCachedData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        Map<RepliesKey, List<StoriesContainer>> map = this.b;
        if (map == null) {
            serializer.S(-1);
            return;
        }
        Iterator c = n.c(serializer, map);
        while (c.hasNext()) {
            Map.Entry entry = (Map.Entry) c.next();
            serializer.e0((RepliesKey) entry.getKey());
            serializer.W((List) entry.getValue());
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
        return (obj instanceof RepliesCachedData) && epx.f(this.b, ((RepliesCachedData) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return cjl0.a(new StringBuilder("RepliesCachedData(items="), this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RepliesCachedData(Map<RepliesKey, ? extends List<? extends StoriesContainer>> map) {
        this.b = map;
    }

    public /* synthetic */ RepliesCachedData(Map map, int i, zcl zclVar) {
        this((Map<RepliesKey, ? extends List<? extends StoriesContainer>>) ((i & 1) != 0 ? jgp.b : map));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RepliesCachedData(Serializer serializer) {
        this((Map<RepliesKey, ? extends List<? extends StoriesContainer>>) r1);
        Map map;
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        try {
            int u = serializer.u();
            if (u >= 0) {
                map = new LinkedHashMap();
                for (int i = 0; i < u; i++) {
                    RepliesKey repliesKey = (RepliesKey) serializer.A(RepliesKey.class.getClassLoader());
                    ArrayList k = serializer.k(StoriesContainer.class);
                    if (repliesKey != null && k != null) {
                        map.put(repliesKey, k);
                    }
                }
            } else {
                map = jgp.b;
            }
        } finally {
        }
    }
}

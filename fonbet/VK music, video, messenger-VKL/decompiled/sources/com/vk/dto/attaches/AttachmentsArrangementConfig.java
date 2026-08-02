package com.vk.dto.attaches;

import android.os.Parcel;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.fw3;
import xsna.j5g;
import xsna.jgp;
import xsna.v11;
import xsna.zcl;

/* compiled from: AttachmentsArrangementModels.kt */
/* loaded from: classes18.dex */
public final class AttachmentsArrangementConfig implements Serializer.StreamParcelable {
    public static final Serializer.c<AttachmentsArrangementConfig> CREATOR = new a();
    public final long b;
    public final List<List<AttachDisplayConfig>> c;
    public final Map<String, AttachDisplayConfig> d;
    public final List<AttachDisplayConfig> e;
    public final CarouselRatio f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachmentsArrangementConfig> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachmentsArrangementConfig a(Serializer serializer) {
            List list;
            Map map;
            List list2;
            long w = serializer.w();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            zcl zclVar = null;
            ?? r3 = 0;
            try {
                int u = serializer.u();
                if (u >= 0) {
                    list = new ArrayList();
                    for (int i = 0; i < u; i++) {
                        ArrayList k = serializer.k(AttachDisplayConfig.class);
                        if (k != null) {
                            list.add(k);
                        }
                    }
                } else {
                    list = 0;
                }
                if (list == 0) {
                    list = EmptyList.b;
                }
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                try {
                    int u2 = serializer.u();
                    if (u2 >= 0) {
                        map = new LinkedHashMap();
                        for (int i2 = 0; i2 < u2; i2++) {
                            String H = serializer.H();
                            AttachDisplayConfig attachDisplayConfig = (AttachDisplayConfig) serializer.G(AttachDisplayConfig.class.getClassLoader());
                            if (H != null && attachDisplayConfig != null) {
                                map.put(H, attachDisplayConfig);
                            }
                        }
                    } else {
                        map = jgp.b;
                    }
                    Map map2 = map;
                    ArrayList k2 = serializer.k(AttachDisplayConfig.class);
                    if (k2 == null || (list2 = j5g.O0(k2)) == null) {
                        list2 = EmptyList.b;
                    }
                    List list3 = list2;
                    CarouselRatio carouselRatio = (CarouselRatio) serializer.G(CarouselRatio.class.getClassLoader());
                    if (carouselRatio == null) {
                        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        carouselRatio = new CarouselRatio(f, f, 3, zclVar);
                    }
                    return new AttachmentsArrangementConfig(w, list, map2, list3, carouselRatio);
                } finally {
                }
            } finally {
                if (th instanceof Serializer.DeserializationError) {
                    throw th;
                }
                Serializer.DeserializationError deserializationError = new Serializer.DeserializationError(null, th);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachmentsArrangementConfig[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachmentsArrangementConfig(long j, List<? extends List<AttachDisplayConfig>> list, Map<String, AttachDisplayConfig> map, List<AttachDisplayConfig> list2, CarouselRatio carouselRatio) {
        this.b = j;
        this.c = list;
        this.d = map;
        this.e = list2;
        this.f = carouselRatio;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.X(this.c);
        Iterator c = n.c(serializer, this.d);
        while (c.hasNext()) {
            Map.Entry entry = (Map.Entry) c.next();
            serializer.j0((String) entry.getKey());
            serializer.i0((Serializer.StreamParcelable) entry.getValue());
        }
        serializer.W(this.e);
        serializer.i0(this.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachmentsArrangementConfig)) {
            return false;
        }
        AttachmentsArrangementConfig attachmentsArrangementConfig = (AttachmentsArrangementConfig) obj;
        return this.b == attachmentsArrangementConfig.b && epx.f(this.c, attachmentsArrangementConfig.c) && epx.f(this.d, attachmentsArrangementConfig.d) && epx.f(this.e, attachmentsArrangementConfig.e) && epx.f(this.f, attachmentsArrangementConfig.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + fw3.a(v11.a(fw3.a(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "AttachmentsArrangementConfig(lastModifiedAt=" + this.b + ", exceptionListList=" + this.c + ", gridMap=" + this.d + ", defaultMap=" + this.e + ", carouselRatio=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}

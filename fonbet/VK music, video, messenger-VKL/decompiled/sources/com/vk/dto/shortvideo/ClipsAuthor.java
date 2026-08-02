package com.vk.dto.shortvideo;

import android.os.Parcel;
import com.android.billingclient.api.BillingClient;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.deactivation.Deactivation;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import xsna.jgp;
import xsna.zcl;

/* compiled from: ClipsAuthor.kt */
/* loaded from: classes18.dex */
public final class ClipsAuthor implements Serializer.StreamParcelable {
    public static final Serializer.c<ClipsAuthor> CREATOR = new b();
    public final Owner b;
    public final Map<String, Long> c;
    public final int d;
    public final String e;
    public int f;
    public final int g;
    public final int h;
    public final String i;
    public final Deactivation j;

    /* compiled from: ClipsAuthor.kt */
    public static final class a {
        public static HashMap a(JSONObject jSONObject) {
            HashMap hashMap = new HashMap();
            JSONObject optJSONObject = jSONObject.optJSONObject("counters");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, Long.valueOf(optJSONObject.optLong(next)));
                }
            }
            return hashMap;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipsAuthor> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsAuthor a(Serializer serializer) {
            Map map;
            Owner owner = (Owner) serializer.G(Owner.class.getClassLoader());
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u = serializer.u();
                if (u >= 0) {
                    map = new LinkedHashMap();
                    for (int i = 0; i < u; i++) {
                        String H = serializer.H();
                        Long valueOf = Long.valueOf(serializer.w());
                        if (H != null) {
                            map.put(H, valueOf);
                        }
                    }
                } else {
                    map = jgp.b;
                }
                return new ClipsAuthor(owner, new LinkedHashMap(map), serializer.u(), serializer.H(), serializer.u(), serializer.u(), serializer.u(), serializer.H(), null, 256, null);
            } finally {
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsAuthor[i];
        }
    }

    public ClipsAuthor(Owner owner, Map<String, Long> map, int i, String str, int i2, int i3, int i4, String str2, Deactivation deactivation) {
        this.b = owner;
        this.c = map;
        this.d = i;
        this.e = str;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = str2;
        this.j = deactivation;
    }

    public static ClipsAuthor e(ClipsAuthor clipsAuthor, Map map, String str, int i) {
        Owner d = clipsAuthor.b.d();
        if ((i & 2) != 0) {
            map = clipsAuthor.c;
        }
        int i2 = clipsAuthor.d;
        String str2 = clipsAuthor.e;
        int i3 = clipsAuthor.f;
        int i4 = clipsAuthor.g;
        int i5 = clipsAuthor.h;
        clipsAuthor.getClass();
        return new ClipsAuthor(d, map, i2, str2, i3, i4, i5, str, null, 256, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        Map<String, Long> map = this.c;
        if (map == null) {
            serializer.S(-1);
        } else {
            Iterator c = n.c(serializer, map);
            while (c.hasNext()) {
                Map.Entry entry = (Map.Entry) c.next();
                serializer.j0((String) entry.getKey());
                serializer.Y(((Number) entry.getValue()).longValue());
            }
        }
        serializer.S(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
        serializer.S(this.g);
        serializer.S(this.h);
        serializer.j0(this.i);
    }

    public final boolean U() {
        return this.b.i(4);
    }

    public final boolean d() {
        return this.h == 3 || this.g != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long f() {
        Long l = this.c.get("clips_likes");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final long g() {
        Map<String, Long> map = this.c;
        Long l = map.get(BillingClient.FeatureType.SUBSCRIPTIONS);
        long longValue = l != null ? l.longValue() : 0L;
        Long l2 = map.get("pages");
        return longValue + (l2 != null ? l2.longValue() : 0L);
    }

    public final long i() {
        Long l = this.c.get("clips_views");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final long j() {
        Long l = this.c.get("clips");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final Long k() {
        return this.c.get("clips_followers");
    }

    public final void k3(boolean z) {
        this.b.g(4, z);
    }

    public final UserId l() {
        return this.b.b;
    }

    public final void n(Long l) {
        this.c.put("clips_followers", Long.valueOf(l != null ? l.longValue() : 0L));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ ClipsAuthor(Owner owner, Map map, int i, String str, int i2, int i3, int i4, String str2, Deactivation deactivation, int i5, zcl zclVar) {
        this(owner, (i5 & 2) != 0 ? new HashMap() : map, i, str, i2, i3, i4, str2, (i5 & 256) != 0 ? null : deactivation);
    }
}

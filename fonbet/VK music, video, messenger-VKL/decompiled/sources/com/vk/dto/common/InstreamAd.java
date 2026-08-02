package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.f370;
import xsna.fw3;
import xsna.j5g;
import xsna.jgp;
import xsna.on00;
import xsna.shy;
import xsna.v11;

/* compiled from: InstreamAd.kt */
/* loaded from: classes18.dex */
public final class InstreamAd extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<InstreamAd> CREATOR = new c();
    public static final b i = new b();
    public final boolean b;
    public final List<Float> c;
    public final Map<String, String> d;
    public final Set<AdSection> e;
    public final int f;
    public final int g;
    public final boolean h;

    /* compiled from: InstreamAd.kt */
    public static final class a {
        public static b a() {
            return InstreamAd.i;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<InstreamAd> {
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
        
            if (r5 == null) goto L28;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r8v3 */
        @Override // xsna.aay
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InstreamAd a(JSONObject jSONObject) {
            int i;
            ?? r4;
            Map map;
            Set set;
            try {
                int optInt = jSONObject.optInt("slot_id");
                int optInt2 = jSONObject.optInt("timeout");
                boolean z = true;
                if (jSONObject.optInt("can_play") == 1) {
                    i = 1;
                } else {
                    i = 1;
                    z = false;
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("midroll_percents");
                if (optJSONArray != null) {
                    r4 = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        r4.add(Float.valueOf(Float.parseFloat(optJSONArray.getString(i2))));
                    }
                } else {
                    r4 = EmptyList.b;
                }
                List list = r4;
                JSONObject optJSONObject = jSONObject.optJSONObject("params");
                if (optJSONObject != null) {
                    HashMap M = f370.M(optJSONObject);
                    map = new LinkedHashMap(on00.e(M.size()));
                    for (Object obj : M.entrySet()) {
                        map.put(((Map.Entry) obj).getKey(), ((Map.Entry) obj).getValue().toString());
                    }
                } else {
                    map = jgp.b;
                }
                Map map2 = map;
                JSONArray optJSONArray2 = jSONObject.optJSONArray("sections");
                if (optJSONArray2 != null) {
                    ArrayList arrayList = new ArrayList(optJSONArray2.length());
                    int length2 = optJSONArray2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        arrayList.add(AdSection.valueOf(optJSONArray2.getString(i3).toUpperCase(Locale.ROOT)));
                    }
                    set = j5g.S0(arrayList);
                }
                set = EmptySet.b;
                return new InstreamAd(z, list, map2, set, optInt, optInt2, jSONObject.optInt("autoplay_preroll") == i ? i : 0);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<InstreamAd> {
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
        
            if (r3 == 0) goto L14;
         */
        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
        @Override // com.vk.core.serialize.Serializer.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InstreamAd a(Serializer serializer) {
            List list;
            Map map;
            Set set;
            boolean m = serializer.m();
            float[] b = serializer.b();
            if (b != null) {
                int length = b.length;
                if (length == 0) {
                    list = EmptyList.b;
                } else if (length != 1) {
                    list = new ArrayList(b.length);
                    for (float f : b) {
                        list.add(Float.valueOf(f));
                    }
                } else {
                    list = Collections.singletonList(Float.valueOf(b[0]));
                }
            }
            list = EmptyList.b;
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u = serializer.u();
                if (u >= 0) {
                    map = new LinkedHashMap();
                    for (int i = 0; i < u; i++) {
                        String H = serializer.H();
                        String H2 = serializer.H();
                        if (H != null && H2 != null) {
                            map.put(H, H2);
                        }
                    }
                } else {
                    map = jgp.b;
                }
                try {
                    int u2 = serializer.u();
                    if (u2 >= 0) {
                        set = new LinkedHashSet();
                        for (int i2 = 0; i2 < u2; i2++) {
                            Serializable C = serializer.C();
                            if (C != null) {
                                set.add(C);
                            }
                        }
                    } else {
                        set = EmptySet.b;
                    }
                    return new InstreamAd(m, list, map, set, serializer.u(), serializer.u(), serializer.m());
                } finally {
                    if (th instanceof Serializer.DeserializationError) {
                        throw th;
                    }
                    Serializer.DeserializationError deserializationError = new Serializer.DeserializationError(null, th);
                }
            } catch (Throwable th) {
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstreamAd[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InstreamAd(boolean z, List<Float> list, Map<String, String> map, Set<? extends AdSection> set, int i2, int i3, boolean z2) {
        this.b = z;
        this.c = list;
        this.d = map;
        this.e = set;
        this.f = i2;
        this.g = i3;
        this.h = z2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.Q(this.c);
        Map<String, String> map = this.d;
        if (map == null) {
            serializer.S(-1);
        } else {
            Iterator c2 = n.c(serializer, map);
            while (c2.hasNext()) {
                Map.Entry entry = (Map.Entry) c2.next();
                serializer.j0((String) entry.getKey());
                serializer.j0((String) entry.getValue());
            }
        }
        Set<AdSection> set = this.e;
        if (set == null) {
            serializer.S(-1);
        } else {
            serializer.S(set.size());
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                serializer.g0((Serializable) it.next());
            }
        }
        serializer.S(this.f);
        serializer.S(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstreamAd)) {
            return false;
        }
        InstreamAd instreamAd = (InstreamAd) obj;
        return this.b == instreamAd.b && epx.f(this.c, instreamAd.c) && epx.f(this.d, instreamAd.d) && epx.f(this.e, instreamAd.e) && this.f == instreamAd.f && this.g == instreamAd.g && this.h == instreamAd.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + shy.a(this.g, shy.a(this.f, fw3.b(v11.a(fw3.a(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstreamAd(canPlay=");
        sb.append(this.b);
        sb.append(", midrollPercents=");
        sb.append(this.c);
        sb.append(", params=");
        sb.append(this.d);
        sb.append(", sections=");
        sb.append(this.e);
        sb.append(", slotId=");
        sb.append(this.f);
        sb.append(", timeout=");
        sb.append(this.g);
        sb.append(", autoplayPreroll=");
        return q0.a(sb, this.h, ')');
    }
}

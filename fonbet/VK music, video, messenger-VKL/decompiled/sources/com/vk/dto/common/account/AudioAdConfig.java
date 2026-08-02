package com.vk.dto.common.account;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.asp;
import xsna.bxx;
import xsna.c5g;
import xsna.epx;
import xsna.f370;
import xsna.fw3;
import xsna.shy;
import xsna.wq;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AudioAdConfig.kt */
/* loaded from: classes18.dex */
public final class AudioAdConfig extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<AudioAdConfig> CREATOR = new b();
    public final int b;
    public final int c;
    public final List<Type> d;
    public final List<String> e;
    public final boolean f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioAdConfig.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final a Companion;
        public static final Type MIDROLL;
        public static final Type POSTROLL;
        public static final Type PREROLL;
        private static final Type[] VALUES;
        private final String id;

        /* compiled from: AudioAdConfig.kt */
        public static final class a {
            public static Type a(String str) {
                for (Type type : Type.VALUES) {
                    if (epx.f(type.getId(), str)) {
                        return type;
                    }
                }
                return null;
            }
        }

        static {
            Type type = new Type("PREROLL", 0, "preroll");
            PREROLL = type;
            Type type2 = new Type("MIDROLL", 1, "midroll");
            MIDROLL = type2;
            Type type3 = new Type("POSTROLL", 2, "postroll");
            POSTROLL = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new a();
            VALUES = values();
        }

        public Type(String str, int i, String str2) {
            this.id = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: AudioAdConfig.kt */
    public static final class a {
        public static AudioAdConfig a(JSONObject jSONObject) {
            return jSONObject == null ? new AudioAdConfig(0, 0, null, null, false, 31, null) : new AudioAdConfig(jSONObject, (zcl) null);
        }

        public static String b(AudioAdConfig audioAdConfig, Type type, String str, boolean z) {
            if (!z) {
                return "section_not_allowed";
            }
            if ((audioAdConfig != null ? audioAdConfig.d : null) == null) {
                return "unknown";
            }
            if (!audioAdConfig.d.contains(type)) {
                return "type_not_allowed";
            }
            if (str.equals("im")) {
                return "section_not_allowed";
            }
            return null;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AudioAdConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioAdConfig a(Serializer serializer) {
            return new AudioAdConfig(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioAdConfig[i];
        }
    }

    public AudioAdConfig() {
        this(0, 0, null, null, false, 31, null);
    }

    public static AudioAdConfig zb(AudioAdConfig audioAdConfig, boolean z) {
        int i = audioAdConfig.b;
        int i2 = audioAdConfig.c;
        List<Type> list = audioAdConfig.d;
        List<String> list2 = audioAdConfig.e;
        audioAdConfig.getClass();
        return new AudioAdConfig(i, i2, list, list2, z);
    }

    public final boolean Ab() {
        return this.f;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        List<Type> list = this.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Type) it.next()).getId());
        }
        serializer.l0(arrayList);
        serializer.l0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("day_limit", this.b);
        jSONObject.put("track_limit", this.c);
        List<Type> list = this.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((Type) it.next());
        }
        jSONObject.put("types_allowed", new JSONArray((Collection) arrayList));
        jSONObject.put("sections", new JSONArray((Collection) this.e));
        jSONObject.put("available", this.f);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAdConfig)) {
            return false;
        }
        AudioAdConfig audioAdConfig = (AudioAdConfig) obj;
        return this.b == audioAdConfig.b && this.c == audioAdConfig.c && epx.f(this.d, audioAdConfig.d) && epx.f(this.e, audioAdConfig.e) && this.f == audioAdConfig.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + fw3.a(fw3.a(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAdConfig(dayLimit=");
        sb.append(this.b);
        sb.append(", trackLimit=");
        sb.append(this.c);
        sb.append(", typesAllowed=");
        sb.append(this.d);
        sb.append(", sections=");
        sb.append(this.e);
        sb.append(", isAudioAdAvailable=");
        return q0.a(sb, this.f, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioAdConfig(int i, int i2, List<? extends Type> list, List<String> list2, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = list2;
        this.f = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioAdConfig(Serializer serializer, zcl zclVar) {
        this(r1, r2, r4, r5, serializer.m());
        List list;
        List list2;
        int u = serializer.u();
        int u2 = serializer.u();
        ArrayList<String> h = serializer.h();
        if (h != null) {
            list = new ArrayList(c5g.u(h, 10));
            Iterator<String> it = h.iterator();
            while (it.hasNext()) {
                String next = it.next();
                Type.a aVar = Type.Companion;
                next = next == null ? "" : next;
                aVar.getClass();
                Type a2 = Type.a.a(next);
                if (a2 != null) {
                    list.add(a2);
                } else {
                    throw new IllegalArgumentException("Illegal id value: ".concat(next));
                }
            }
        } else {
            list = EmptyList.b;
        }
        ArrayList<String> h2 = serializer.h();
        if (h2 != null) {
            list2 = new ArrayList(c5g.u(h2, 10));
            Iterator<String> it2 = h2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2 == null) {
                    next2 = "";
                }
                list2.add(next2);
            }
        } else {
            list2 = EmptyList.b;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AudioAdConfig(JSONObject jSONObject, zcl zclVar) {
        this(r2, r3, r4, r1, jSONObject.optBoolean("available"));
        ?? r1;
        List list;
        int w = f370.w(jSONObject, -1, "day_limit");
        int i = jSONObject.has("track_limit") ? jSONObject.getInt("track_limit") : -1;
        JSONArray optJSONArray = jSONObject.optJSONArray("types_allowed");
        if (optJSONArray != null) {
            r1 = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String string = optJSONArray.getString(i2);
                Type.Companion.getClass();
                Type a2 = Type.a.a(string);
                if (a2 == null) {
                    a2 = Type.PREROLL;
                }
                r1.add(a2);
            }
        } else {
            r1 = EmptyList.b;
        }
        List list2 = r1;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("sections");
        if (optJSONArray2 != null) {
            list = new ArrayList(optJSONArray2.length());
            int length2 = optJSONArray2.length();
            for (int i3 = 0; i3 < length2; i3 = wq.b(optJSONArray2, i3, list, i3, 1)) {
            }
        } else {
            list = EmptyList.b;
        }
    }

    public AudioAdConfig(int i, int i2, List list, List list2, boolean z, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? EmptyList.b : list, (i3 & 8) != 0 ? EmptyList.b : list2, (i3 & 16) != 0 ? true : z);
    }
}

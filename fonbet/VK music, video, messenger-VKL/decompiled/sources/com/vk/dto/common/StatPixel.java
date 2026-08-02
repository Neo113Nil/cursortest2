package com.vk.dto.common;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.serialize.Serializer;
import defpackage.q0;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.jgp;
import xsna.urd0;
import xsna.v11;
import xsna.zcl;

/* compiled from: StatPixel.kt */
/* loaded from: classes18.dex */
public final class StatPixel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StatPixel> CREATOR = new c();
    public final a b;
    public final String c;
    public final Map<String, String> d;
    public final boolean e;

    /* compiled from: StatPixel.kt */
    public static abstract class a {

        /* compiled from: StatPixel.kt */
        /* renamed from: com.vk.dto.common.StatPixel$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0903a extends a {

            /* compiled from: StatPixel.kt */
            /* renamed from: com.vk.dto.common.StatPixel$a$a$a, reason: collision with other inner class name */
            public static final class C0904a extends AbstractC0903a {
                public static final C0904a a = new C0904a();
                public static final String b = "ad_clip_click";

                @Override // com.vk.dto.common.StatPixel.a
                public final String a() {
                    return b;
                }
            }

            /* compiled from: StatPixel.kt */
            /* renamed from: com.vk.dto.common.StatPixel$a$a$b */
            public static final class b extends AbstractC0903a {
                public static final b a = new b();
                public static final String b = "ad_clip_show";

                @Override // com.vk.dto.common.StatPixel.a
                public final String a() {
                    return b;
                }
            }
        }

        /* compiled from: StatPixel.kt */
        public static final class b {
            public static a a(String str) {
                c.d dVar = c.d.a;
                dVar.getClass();
                if (str.equals(c.d.b)) {
                    return dVar;
                }
                c.g gVar = c.g.a;
                gVar.getClass();
                if (str.equals(c.g.b)) {
                    return gVar;
                }
                c.h hVar = c.h.a;
                hVar.getClass();
                if (str.equals(c.h.b)) {
                    return hVar;
                }
                c.C0905a c0905a = c.C0905a.a;
                c0905a.getClass();
                if (str.equals(c.C0905a.b)) {
                    return c0905a;
                }
                c.e eVar = c.e.a;
                eVar.getClass();
                if (str.equals(c.e.b)) {
                    return eVar;
                }
                c.f fVar = c.f.a;
                fVar.getClass();
                if (str.equals(c.f.b)) {
                    return fVar;
                }
                c.b bVar = c.b.a;
                bVar.getClass();
                if (str.equals(c.b.b)) {
                    return bVar;
                }
                c.C0906c c0906c = c.C0906c.a;
                c0906c.getClass();
                if (str.equals(c.C0906c.b)) {
                    return c0906c;
                }
                AbstractC0903a.b bVar2 = AbstractC0903a.b.a;
                bVar2.getClass();
                if (str.equals(AbstractC0903a.b.b)) {
                    return bVar2;
                }
                AbstractC0903a.C0904a c0904a = AbstractC0903a.C0904a.a;
                c0904a.getClass();
                return str.equals(AbstractC0903a.C0904a.b) ? c0904a : d.a;
            }
        }

        /* compiled from: StatPixel.kt */
        public static abstract class c extends a {

            /* compiled from: StatPixel.kt */
            /* renamed from: com.vk.dto.common.StatPixel$a$c$a, reason: collision with other inner class name */
            public static final class C0905a extends c {
                public static final C0905a a = new C0905a();
                public static final String b = CampaignEx.JSON_NATIVE_VIDEO_COMPLETE;

                @Override // com.vk.dto.common.StatPixel.a
                public final String a() {
                    return b;
                }
            }

            /* compiled from: StatPixel.kt */
            public static final class b extends c {
                public static final b a = new b();
                public static final String b = "first_frame";

                @Override // com.vk.dto.common.StatPixel.a
                public final String a() {
                    return b;
                }
            }

            /* compiled from: StatPixel.kt */
            /* renamed from: com.vk.dto.common.StatPixel$a$c$c, reason: collision with other inner class name */
            public static final class C0906c extends c {
                public static final C0906c a = new C0906c();
                public static final String b = "heartbeat";

                @Override // com.vk.dto.common.StatPixel.a
                public final String a() {
                    return b;
                }
            }

            /* compiled from: StatPixel.kt */
            public static final class d extends c {
                public static final d a = new d();
                public static final String b = "load";

                @Override // com.vk.dto.common.StatPixel.a
                public final String a() {
                    return b;
                }
            }

            /* compiled from: StatPixel.kt */
            public static final class e extends c {
                public static final e a = new e();
                public static final String b = "pause";

                @Override // com.vk.dto.common.StatPixel.a
                public final String a() {
                    return b;
                }
            }

            /* compiled from: StatPixel.kt */
            public static final class f extends c {
                public static final f a = new f();
                public static final String b = CampaignEx.JSON_NATIVE_VIDEO_RESUME;

                @Override // com.vk.dto.common.StatPixel.a
                public final String a() {
                    return b;
                }
            }

            /* compiled from: StatPixel.kt */
            public static final class g extends c {
                public static final g a = new g();
                public static final String b = "start";

                @Override // com.vk.dto.common.StatPixel.a
                public final String a() {
                    return b;
                }
            }

            /* compiled from: StatPixel.kt */
            public static final class h extends c {
                public static final h a = new h();
                public static final String b = "stop";

                @Override // com.vk.dto.common.StatPixel.a
                public final String a() {
                    return b;
                }
            }
        }

        /* compiled from: StatPixel.kt */
        public static final class d extends a {
            public static final d a = new d();
            public static final String b = "";

            @Override // com.vk.dto.common.StatPixel.a
            public final String a() {
                return b;
            }
        }

        public abstract String a();
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<StatPixel> {
        @Override // xsna.aay
        public final StatPixel a(JSONObject jSONObject) {
            return new StatPixel(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<StatPixel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StatPixel a(Serializer serializer) {
            return new StatPixel(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StatPixel[i];
        }
    }

    static {
        new b();
    }

    public StatPixel(a aVar, String str, Map<String, String> map, boolean z) {
        this.b = aVar;
        this.c = str;
        this.d = map;
        this.e = z;
    }

    public final boolean Ab() {
        return this.e;
    }

    public final Map<String, String> Bb() {
        return this.d;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.a());
        serializer.j0(this.c);
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
        serializer.L(this.e ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatPixel)) {
            return false;
        }
        StatPixel statPixel = (StatPixel) obj;
        return epx.f(this.b, statPixel.b) && epx.f(this.c, statPixel.c) && epx.f(this.d, statPixel.d) && this.e == statPixel.e;
    }

    public final String getUrl() {
        return this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + v11.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatPixel(event=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", params=");
        sb.append(this.d);
        sb.append(", intermediate=");
        return q0.a(sb, this.e, ')');
    }

    public final a zb() {
        return this.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [xsna.jgp] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StatPixel(JSONObject jSONObject) {
        this(r0, r1, r3, jSONObject.optInt("is_intermediate_url") > 0);
        ?? r3;
        String str;
        a a2 = a.b.a(jSONObject.optString(NotificationCompat.CATEGORY_EVENT));
        String optString = jSONObject.optString("url");
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        if (optJSONObject != null) {
            r3 = new HashMap();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    str = optJSONObject.get(next).toString();
                } catch (Throwable unused) {
                    str = null;
                }
                if (next != null && str != null) {
                    r3.put(next, str);
                }
            }
        } else {
            r3 = jgp.b;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StatPixel(Serializer serializer, zcl zclVar) {
        this(r9, r0, r3, serializer.p() != 0);
        Map map;
        a a2 = a.b.a(serializer.H());
        String H = serializer.H();
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        try {
            int u = serializer.u();
            if (u >= 0) {
                map = new LinkedHashMap();
                for (int i = 0; i < u; i++) {
                    String H2 = serializer.H();
                    String H3 = serializer.H();
                    if (H2 != null && H3 != null) {
                        map.put(H2, H3);
                    }
                }
            } else {
                map = jgp.b;
            }
        } finally {
        }
    }
}

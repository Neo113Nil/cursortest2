package com.vk.clips.sdk.shared.api.analytics;

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

/* compiled from: SdkStatPixel.kt */
/* loaded from: classes17.dex */
public final class SdkStatPixel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SdkStatPixel> CREATOR = new c();
    public final a b;
    public final String c;
    public final Map<String, String> d;
    public final boolean e;

    /* compiled from: SdkStatPixel.kt */
    public static abstract class a {

        /* compiled from: SdkStatPixel.kt */
        /* renamed from: com.vk.clips.sdk.shared.api.analytics.SdkStatPixel$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0637a extends a {

            /* compiled from: SdkStatPixel.kt */
            /* renamed from: com.vk.clips.sdk.shared.api.analytics.SdkStatPixel$a$a$a, reason: collision with other inner class name */
            public static final class C0638a extends AbstractC0637a {
                public static final C0638a a = new C0638a();
                public static final String b = "ad_clip_click";

                @Override // com.vk.clips.sdk.shared.api.analytics.SdkStatPixel.a
                public final String a() {
                    return b;
                }
            }

            /* compiled from: SdkStatPixel.kt */
            /* renamed from: com.vk.clips.sdk.shared.api.analytics.SdkStatPixel$a$a$b */
            public static final class b extends AbstractC0637a {
                public static final b a = new b();
                public static final String b = "ad_clip_show";

                @Override // com.vk.clips.sdk.shared.api.analytics.SdkStatPixel.a
                public final String a() {
                    return b;
                }
            }
        }

        /* compiled from: SdkStatPixel.kt */
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
                c.C0639a c0639a = c.C0639a.a;
                c0639a.getClass();
                if (str.equals(c.C0639a.b)) {
                    return c0639a;
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
                c.C0640c c0640c = c.C0640c.a;
                c0640c.getClass();
                if (str.equals(c.C0640c.b)) {
                    return c0640c;
                }
                AbstractC0637a.b bVar2 = AbstractC0637a.b.a;
                bVar2.getClass();
                if (str.equals(AbstractC0637a.b.b)) {
                    return bVar2;
                }
                AbstractC0637a.C0638a c0638a = AbstractC0637a.C0638a.a;
                c0638a.getClass();
                return str.equals(AbstractC0637a.C0638a.b) ? c0638a : d.a;
            }
        }

        /* compiled from: SdkStatPixel.kt */
        public static abstract class c extends a {

            /* compiled from: SdkStatPixel.kt */
            /* renamed from: com.vk.clips.sdk.shared.api.analytics.SdkStatPixel$a$c$a, reason: collision with other inner class name */
            public static final class C0639a extends c {
                public static final C0639a a = new C0639a();
                public static final String b = CampaignEx.JSON_NATIVE_VIDEO_COMPLETE;

                @Override // com.vk.clips.sdk.shared.api.analytics.SdkStatPixel.a
                public final String a() {
                    return b;
                }
            }

            /* compiled from: SdkStatPixel.kt */
            public static final class b extends c {
                public static final b a = new b();
                public static final String b = "first_frame";

                @Override // com.vk.clips.sdk.shared.api.analytics.SdkStatPixel.a
                public final String a() {
                    return b;
                }
            }

            /* compiled from: SdkStatPixel.kt */
            /* renamed from: com.vk.clips.sdk.shared.api.analytics.SdkStatPixel$a$c$c, reason: collision with other inner class name */
            public static final class C0640c extends c {
                public static final C0640c a = new C0640c();
                public static final String b = "heartbeat";

                @Override // com.vk.clips.sdk.shared.api.analytics.SdkStatPixel.a
                public final String a() {
                    return b;
                }
            }

            /* compiled from: SdkStatPixel.kt */
            public static final class d extends c {
                public static final d a = new d();
                public static final String b = "load";

                @Override // com.vk.clips.sdk.shared.api.analytics.SdkStatPixel.a
                public final String a() {
                    return b;
                }
            }

            /* compiled from: SdkStatPixel.kt */
            public static final class e extends c {
                public static final e a = new e();
                public static final String b = "pause";

                @Override // com.vk.clips.sdk.shared.api.analytics.SdkStatPixel.a
                public final String a() {
                    return b;
                }
            }

            /* compiled from: SdkStatPixel.kt */
            public static final class f extends c {
                public static final f a = new f();
                public static final String b = CampaignEx.JSON_NATIVE_VIDEO_RESUME;

                @Override // com.vk.clips.sdk.shared.api.analytics.SdkStatPixel.a
                public final String a() {
                    return b;
                }
            }

            /* compiled from: SdkStatPixel.kt */
            public static final class g extends c {
                public static final g a = new g();
                public static final String b = "start";

                @Override // com.vk.clips.sdk.shared.api.analytics.SdkStatPixel.a
                public final String a() {
                    return b;
                }
            }

            /* compiled from: SdkStatPixel.kt */
            public static final class h extends c {
                public static final h a = new h();
                public static final String b = "stop";

                @Override // com.vk.clips.sdk.shared.api.analytics.SdkStatPixel.a
                public final String a() {
                    return b;
                }
            }
        }

        /* compiled from: SdkStatPixel.kt */
        public static final class d extends a {
            public static final d a = new d();
            public static final String b = "";

            @Override // com.vk.clips.sdk.shared.api.analytics.SdkStatPixel.a
            public final String a() {
                return b;
            }
        }

        public abstract String a();
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<SdkStatPixel> {
        @Override // xsna.aay
        public final SdkStatPixel a(JSONObject jSONObject) {
            return new SdkStatPixel(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<SdkStatPixel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SdkStatPixel a(Serializer serializer) {
            return new SdkStatPixel(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SdkStatPixel[i];
        }
    }

    static {
        new b();
    }

    public SdkStatPixel(a aVar, String str, Map<String, String> map, boolean z) {
        this.b = aVar;
        this.c = str;
        this.d = map;
        this.e = z;
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
        if (!(obj instanceof SdkStatPixel)) {
            return false;
        }
        SdkStatPixel sdkStatPixel = (SdkStatPixel) obj;
        return epx.f(this.b, sdkStatPixel.b) && epx.f(this.c, sdkStatPixel.c) && epx.f(this.d, sdkStatPixel.d) && this.e == sdkStatPixel.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + v11.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkStatPixel(event=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", params=");
        sb.append(this.d);
        sb.append(", intermediate=");
        return q0.a(sb, this.e, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [xsna.jgp] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SdkStatPixel(JSONObject jSONObject) {
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
    public SdkStatPixel(Serializer serializer, zcl zclVar) {
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

package com.vk.superapp.multiaccount.api;

import com.vk.superapp.multiaccount.api.ValidationRequiredType;
import com.vk.superapp.multiaccount.api.j;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.axx;
import xsna.bxx;
import xsna.cq;
import xsna.epx;

/* compiled from: MultiAccountSwitcherInfo.kt */
/* loaded from: classes6.dex */
public abstract class f implements bxx {
    public final g b;

    /* compiled from: MultiAccountSwitcherInfo.kt */
    public static abstract class a extends f {
        public final g c;

        /* compiled from: MultiAccountSwitcherInfo.kt */
        /* renamed from: com.vk.superapp.multiaccount.api.f$a$a, reason: collision with other inner class name */
        public static final class C1892a extends a {
            public final g d;

            public C1892a(g gVar) {
                super(gVar);
                this.d = gVar;
            }

            public static C1892a b(g gVar) {
                return new C1892a(gVar);
            }

            @Override // com.vk.superapp.multiaccount.api.f.a, com.vk.superapp.multiaccount.api.f
            public final g a() {
                return this.d;
            }

            @Override // xsna.bxx
            public final JSONObject e5() {
                return new axx("Normal").put("data", this.d.e5());
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1892a) && epx.f(this.d, ((C1892a) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "Normal(data=" + this.d + ')';
            }
        }

        public a(g gVar) {
            super(gVar);
            this.c = gVar;
        }

        @Override // com.vk.superapp.multiaccount.api.f
        public g a() {
            return this.c;
        }
    }

    /* compiled from: MultiAccountSwitcherInfo.kt */
    public static final class b {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static ArrayList a(JSONArray jSONArray) throws IllegalArgumentException, JSONException {
            f c1892a;
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("type");
                if (string != null) {
                    switch (string.hashCode()) {
                        case -1955878649:
                            if (!string.equals("Normal")) {
                                break;
                            } else {
                                c1892a = new a.C1892a(new g(jSONObject.getJSONObject("data")));
                                arrayList.add(c1892a);
                            }
                        case -1079851015:
                            if (!string.equals("Deleted")) {
                                break;
                            } else {
                                c1892a = new c.b(new g(jSONObject.getJSONObject("data")), j.a.a(jSONObject.getJSONObject("availableTime")));
                                arrayList.add(c1892a);
                            }
                        case 1411844952:
                            if (!string.equals("ValidationRequired")) {
                                break;
                            } else {
                                g gVar = new g(jSONObject.getJSONObject("data"));
                                ValidationRequiredType.a aVar = ValidationRequiredType.Companion;
                                JSONObject jSONObject2 = jSONObject.getJSONObject("validationType");
                                aVar.getClass();
                                if (!epx.f(jSONObject2.optString("type"), ValidationRequiredType.TYPE_FULL_AUTH)) {
                                    throw new IllegalArgumentException(cq.c("Cannot deserialize ValidationRequiredType from json ", jSONObject2));
                                }
                                c1892a = new c.C1893c(gVar, ValidationRequiredType.FULL_AUTH);
                                arrayList.add(c1892a);
                            }
                        case 1982491454:
                            if (!string.equals("Banned")) {
                                break;
                            } else {
                                c1892a = new c.a(new g(jSONObject.getJSONObject("data")), j.a.a(jSONObject.getJSONObject("availableTime")));
                                arrayList.add(c1892a);
                            }
                    }
                }
                throw new IllegalArgumentException(cq.c("Cannot deserialize MultiAccountUser from json ", jSONObject));
            }
            return arrayList;
        }
    }

    /* compiled from: MultiAccountSwitcherInfo.kt */
    public static abstract class c extends f {
        public final g c;

        /* compiled from: MultiAccountSwitcherInfo.kt */
        public static final class a extends c {
            public final g d;
            public final j e;

            public a(g gVar, j jVar) {
                super(gVar);
                this.d = gVar;
                this.e = jVar;
            }

            public static a b(a aVar, g gVar) {
                return new a(gVar, aVar.e);
            }

            @Override // com.vk.superapp.multiaccount.api.f.c, com.vk.superapp.multiaccount.api.f
            public final g a() {
                return this.d;
            }

            @Override // xsna.bxx
            public final JSONObject e5() {
                return new axx("Banned").put("data", this.d.e5()).put("availableTime", this.e.e5());
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return "Banned(data=" + this.d + ", availableTime=" + this.e + ')';
            }
        }

        /* compiled from: MultiAccountSwitcherInfo.kt */
        public static final class b extends c {
            public final g d;
            public final j e;

            public b(g gVar, j jVar) {
                super(gVar);
                this.d = gVar;
                this.e = jVar;
            }

            public static b b(b bVar, g gVar) {
                return new b(gVar, bVar.e);
            }

            @Override // com.vk.superapp.multiaccount.api.f.c, com.vk.superapp.multiaccount.api.f
            public final g a() {
                return this.d;
            }

            @Override // xsna.bxx
            public final JSONObject e5() {
                return new axx("Deleted").put("data", this.d.e5()).put("availableTime", this.e.e5());
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return "Deleted(data=" + this.d + ", availableTime=" + this.e + ')';
            }
        }

        /* compiled from: MultiAccountSwitcherInfo.kt */
        /* renamed from: com.vk.superapp.multiaccount.api.f$c$c, reason: collision with other inner class name */
        public static final class C1893c extends c {
            public final g d;
            public final ValidationRequiredType e;

            public C1893c(g gVar, ValidationRequiredType validationRequiredType) {
                super(gVar);
                this.d = gVar;
                this.e = validationRequiredType;
            }

            public static C1893c b(C1893c c1893c, g gVar) {
                return new C1893c(gVar, c1893c.e);
            }

            @Override // com.vk.superapp.multiaccount.api.f.c, com.vk.superapp.multiaccount.api.f
            public final g a() {
                return this.d;
            }

            @Override // xsna.bxx
            public final JSONObject e5() {
                return new axx("ValidationRequired").put("data", this.d.e5()).put("validationType", ((ValidationRequiredType.b) this.e).e5());
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1893c)) {
                    return false;
                }
                C1893c c1893c = (C1893c) obj;
                return epx.f(this.d, c1893c.d) && this.e == c1893c.e;
            }

            public final int hashCode() {
                return this.e.hashCode() + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return "ValidationRequired(data=" + this.d + ", validationType=" + this.e + ')';
            }
        }

        public c(g gVar) {
            super(gVar);
            this.c = gVar;
        }

        @Override // com.vk.superapp.multiaccount.api.f
        public g a() {
            return this.c;
        }
    }

    public f(g gVar) {
        this.b = gVar;
    }

    public g a() {
        return this.b;
    }
}

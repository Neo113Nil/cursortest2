package com.vk.toggle.data;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.axe0;
import xsna.drm0;
import xsna.epx;
import xsna.jgp;
import xsna.ms9;
import xsna.qoy;
import xsna.v11;
import xsna.xwe0;
import xsna.zwe0;

/* compiled from: RateLimiterConfig.kt */
/* loaded from: classes11.dex */
public final class b {
    public static final a e = new a();
    public static final b f = new b(false, false, jgp.b, EmptyList.b);
    public final boolean a;
    public final boolean b;
    public final Map<String, zwe0> c;
    public final List<xwe0> d;

    /* compiled from: RateLimiterConfig.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.Result$Failure] */
        public static axe0 a(JSONObject jSONObject) {
            Regex regex;
            Regex failure;
            Object failure2;
            String optString = jSONObject.optString("domain_regex", "");
            if (drm0.N(optString)) {
                optString = null;
            }
            String optString2 = jSONObject.optString("path_regex", "");
            if (drm0.N(optString2)) {
                optString2 = null;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("request_tags");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                optJSONArray = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString3 = optJSONArray.optString(i);
                    if (!drm0.N(optString3)) {
                        linkedHashSet.add(optString3);
                    }
                }
            }
            if (linkedHashSet.isEmpty()) {
                linkedHashSet = null;
            }
            if (optString != null) {
                a aVar = b.e;
                try {
                    failure2 = new Regex(optString);
                } catch (Throwable th) {
                    failure2 = new Result.Failure(th);
                }
                if (failure2 instanceof Result.Failure) {
                    failure2 = null;
                }
                regex = (Regex) failure2;
            } else {
                regex = null;
            }
            if (optString2 != null) {
                a aVar2 = b.e;
                try {
                    failure = new Regex(optString2);
                } catch (Throwable th2) {
                    failure = new Result.Failure(th2);
                }
                r3 = failure instanceof Result.Failure ? null : failure;
            }
            return new axe0(linkedHashSet, regex, r3);
        }
    }

    public b(boolean z, boolean z2, Map<String, zwe0> map, List<xwe0> list) {
        this.a = z;
        this.b = z2;
        this.c = map;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v11.a(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RateLimiterConfig(enabled=");
        sb.append(this.a);
        sb.append(", verbose=");
        sb.append(this.b);
        sb.append(", rules=");
        sb.append(this.c);
        sb.append(", funnels=");
        return ms9.a(')', sb, this.d);
    }
}

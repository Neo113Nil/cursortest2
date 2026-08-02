package com.vk.im.engine.models;

import com.vk.log.L;
import org.json.JSONObject;
import xsna.bh10;
import xsna.vu5;

/* compiled from: TracerSystraceProfilerConfig.kt */
/* loaded from: classes2.dex */
public final class f {
    public static final f e = new f(0);
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;

    /* compiled from: TracerSystraceProfilerConfig.kt */
    public static final class a {
        public static f a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new f(jSONObject.optLong("sampling", 50L), jSONObject.optLong("maxProfilingDurationMs", 60000L), jSONObject.optLong("thresholdCommitDurationMs", 20000L), jSONObject.optBoolean("isEnabled", false));
            } catch (Exception e) {
                L.i(e);
                return f.e;
            }
        }
    }

    public f() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b && this.c == fVar.c && this.d == fVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + bh10.a(bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TracerSystraceProfilerConfig(enabled=");
        sb.append(this.a);
        sb.append(", sampling=");
        sb.append(this.b);
        sb.append(", maxProfilingDurationMs=");
        sb.append(this.c);
        sb.append(", thresholdCommitDurationMs=");
        return vu5.a(')', this.d, sb);
    }

    public /* synthetic */ f(int i) {
        this(50L, 60000L, 20000L, false);
    }

    public f(long j, long j2, long j3, boolean z) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }
}

package com.ironsource;

import java.util.Map;
import xsna.epx;

/* loaded from: classes13.dex */
public final class Se {
    private final P3 a;
    private final Gd b;
    private final Map<String, C4475o9> c;

    public Se(P3 p3, Gd gd, Map<String, C4475o9> map) {
        this.a = p3;
        this.b = gd;
        this.c = map;
    }

    public final P3 a() {
        return this.a;
    }

    public final Gd b() {
        return this.b;
    }

    public final Map<String, C4475o9> c() {
        return this.c;
    }

    public final P3 d() {
        return this.a;
    }

    public final Gd e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Se)) {
            return false;
        }
        Se se = (Se) obj;
        return epx.f(this.a, se.a) && epx.f(this.b, se.b) && epx.f(this.c, se.c);
    }

    public final Map<String, C4475o9> f() {
        return this.c;
    }

    public int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "ServerResponse2(configurations=" + this.a + ", providerOrder=" + this.b + ", providerSettings=" + this.c + ")";
    }

    public final Se a(P3 p3, Gd gd, Map<String, C4475o9> map) {
        return new Se(p3, gd, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Se a(Se se, P3 p3, Gd gd, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            p3 = se.a;
        }
        if ((i & 2) != 0) {
            gd = se.b;
        }
        if ((i & 4) != 0) {
            map = se.c;
        }
        return se.a(p3, gd, map);
    }
}

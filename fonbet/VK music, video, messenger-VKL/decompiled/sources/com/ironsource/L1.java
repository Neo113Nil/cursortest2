package com.ironsource;

import java.util.Map;
import xsna.epx;
import xsna.jgp;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class L1 {
    private final Map<String, String> a;

    /* JADX WARN: Multi-variable type inference failed */
    public L1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Map<String, String> a() {
        return this.a;
    }

    public final Map<String, String> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L1) && epx.f(this.a, ((L1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.a + ")";
    }

    public L1(Map<String, String> map) {
        this.a = map;
    }

    public final L1 a(Map<String, String> map) {
        return new L1(map);
    }

    public /* synthetic */ L1(Map map, int i, zcl zclVar) {
        this((i & 1) != 0 ? jgp.b : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ L1 a(L1 l1, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = l1.a;
        }
        return l1.a(map);
    }
}

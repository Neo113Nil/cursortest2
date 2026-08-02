package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.u1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3794u1 {
    public final Map a;
    public final C3820v1 b;

    public C3794u1(Map map, C3820v1 c3820v1) {
        this.a = map;
        this.b = c3820v1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3794u1)) {
            return false;
        }
        C3794u1 c3794u1 = (C3794u1) obj;
        return Intrinsics.c(this.a, c3794u1.a) && Intrinsics.c(this.b, c3794u1.b);
    }

    public final int hashCode() {
        Map map = this.a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        C3820v1 c3820v1 = this.b;
        return hashCode + (c3820v1 != null ? c3820v1.hashCode() : 0);
    }

    public final String toString() {
        return "BannerLoadResolution(extras=" + this.a + ", adaptiveSize=" + this.b + ")";
    }
}

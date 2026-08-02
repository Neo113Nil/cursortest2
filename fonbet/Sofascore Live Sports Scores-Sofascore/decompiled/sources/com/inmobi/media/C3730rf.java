package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.rf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3730rf {
    public final Map a;

    public C3730rf(Map map) {
        map.getClass();
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3730rf) && Intrinsics.c(this.a, ((C3730rf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NovatiqAdData(requestParams=" + this.a + ")";
    }
}

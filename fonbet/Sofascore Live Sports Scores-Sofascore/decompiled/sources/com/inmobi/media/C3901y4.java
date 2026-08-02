package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.y4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3901y4 extends AbstractC3875x4 {
    public final int a;
    public final Config b;

    public C3901y4(int i, Config config) {
        config.getClass();
        this.a = i;
        this.b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3901y4)) {
            return false;
        }
        C3901y4 c3901y4 = (C3901y4) obj;
        return this.a == c3901y4.a && Intrinsics.c(this.b, c3901y4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ConfigSuccess(statusCode=" + this.a + ", config=" + this.b + ")";
    }
}

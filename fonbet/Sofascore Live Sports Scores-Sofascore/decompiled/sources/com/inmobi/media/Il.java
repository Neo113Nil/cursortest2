package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Il {
    public final int a;
    public final Config b;

    public Il(int i, Config config) {
        config.getClass();
        this.a = i;
        this.b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Il)) {
            return false;
        }
        Il il = (Il) obj;
        return this.a == il.a && Intrinsics.c(this.b, il.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ValidatedConfigResponseModel(configResponseCode=" + this.a + ", config=" + this.b + ")";
    }
}

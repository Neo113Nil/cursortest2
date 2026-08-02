package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.u4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3797u4 {
    public final String a;
    public final Config b;

    public C3797u4(String str, Config config) {
        str.getClass();
        config.getClass();
        this.a = str;
        this.b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3797u4) && Intrinsics.c(this.b.getType(), ((C3797u4) obj).b.getType());
    }

    public final int hashCode() {
        return this.b.getType().hashCode();
    }
}

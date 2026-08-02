package com.inmobi.media;

import defpackage.vxd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.om, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3660om extends AbstractC3712qm {
    public final long a;

    public C3660om(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3660om) && this.a == ((C3660om) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return vxd.m("VideoComplete(duration=", this.a, ")");
    }
}

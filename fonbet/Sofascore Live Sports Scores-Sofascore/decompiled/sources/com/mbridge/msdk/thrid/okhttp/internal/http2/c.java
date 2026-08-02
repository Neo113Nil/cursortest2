package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c {
    public static final com.mbridge.msdk.thrid.okio.f d = com.mbridge.msdk.thrid.okio.f.c(":");
    public static final com.mbridge.msdk.thrid.okio.f e = com.mbridge.msdk.thrid.okio.f.c(":status");
    public static final com.mbridge.msdk.thrid.okio.f f = com.mbridge.msdk.thrid.okio.f.c(":method");
    public static final com.mbridge.msdk.thrid.okio.f g = com.mbridge.msdk.thrid.okio.f.c(":path");
    public static final com.mbridge.msdk.thrid.okio.f h = com.mbridge.msdk.thrid.okio.f.c(":scheme");
    public static final com.mbridge.msdk.thrid.okio.f i = com.mbridge.msdk.thrid.okio.f.c(":authority");
    public final com.mbridge.msdk.thrid.okio.f a;
    public final com.mbridge.msdk.thrid.okio.f b;
    final int c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface a {
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, com.mbridge.msdk.thrid.okio.f fVar2) {
        this.a = fVar;
        this.b = fVar2;
        this.c = fVar2.j() + fVar.j() + 32;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.a.equals(cVar.a) && this.b.equals(cVar.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    public String toString() {
        return com.mbridge.msdk.thrid.okhttp.internal.c.a("%s: %s", this.a.m(), this.b.m());
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, String str) {
        this(fVar, com.mbridge.msdk.thrid.okio.f.c(str));
    }

    public c(String str, String str2) {
        this(com.mbridge.msdk.thrid.okio.f.c(str), com.mbridge.msdk.thrid.okio.f.c(str2));
    }
}

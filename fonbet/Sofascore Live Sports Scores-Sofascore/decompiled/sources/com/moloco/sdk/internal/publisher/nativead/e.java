package com.moloco.sdk.internal.publisher.nativead;

import com.moloco.sdk.internal.ortb.model.y;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e {
    public final y a;
    public final com.moloco.sdk.internal.publisher.nativead.model.h b;
    public final com.moloco.sdk.internal.publisher.nativead.model.n c;

    public e(y yVar, com.moloco.sdk.internal.publisher.nativead.model.h hVar, com.moloco.sdk.internal.publisher.nativead.model.n nVar) {
        yVar.getClass();
        hVar.getClass();
        nVar.getClass();
        this.a = yVar;
        this.b = hVar;
        this.c = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.c(this.a, eVar.a) && Intrinsics.c(this.b, eVar.b) && Intrinsics.c(this.c, eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadedNativeAd(bid=" + this.a + ", ortbResponse=" + this.b + ", preparedAssets=" + this.c + ')';
    }
}

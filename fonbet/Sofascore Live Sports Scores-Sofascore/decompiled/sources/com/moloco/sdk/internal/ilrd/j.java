package com.moloco.sdk.internal.ilrd;

import com.moloco.sdk.internal.MolocoLogger;
import defpackage.fc6;
import defpackage.me4;
import defpackage.mqi;
import defpackage.xea;
import defpackage.yea;
import defpackage.ypa;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j {
    public final com.moloco.sdk.internal.services.i a;
    public final i b;
    public final mqi c;
    public final long d;
    public final AtomicReference e;
    public boolean f;

    public j(com.moloco.sdk.internal.services.i iVar, String str) {
        long currentTimeMillis;
        g gVar;
        iVar.getClass();
        this.a = iVar;
        i iVar2 = null;
        if (str != null) {
            try {
                xea xeaVar = yea.d;
                xeaVar.getClass();
                iVar2 = (i) xeaVar.b(i.Companion.serializer(), str);
            } catch (Exception e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "IlrdActiveSession", "Error deserializing session data", e, false, 8, null);
            }
        }
        this.b = iVar2;
        this.c = ypa.b(new com.moloco.sdk.acm.services.d(this, 3));
        if (iVar2 != null) {
            currentTimeMillis = iVar2.d;
        } else {
            this.a.getClass();
            currentTimeMillis = System.currentTimeMillis();
        }
        this.d = currentTimeMillis;
        this.e = new AtomicReference((iVar2 == null || (gVar = iVar2.b) == null) ? new g(-1L, 0, 0, 0, 0, 0) : gVar);
        this.f = iVar2 != null ? iVar2.c : false;
    }

    public final void a(String str) {
        g a;
        this.a.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        AtomicReference atomicReference = this.e;
        g gVar = (g) atomicReference.get();
        if (StringsKt.J(str, com.ironsource.mediationsdk.j.a, false)) {
            a = g.a(gVar, currentTimeMillis, gVar.b + 1, 0, 0, 0, 0, 60);
        } else if (StringsKt.J(str, "MREC", false)) {
            a = g.a(gVar, currentTimeMillis, 0, gVar.c + 1, 0, 0, 0, 58);
        } else if (StringsKt.J(str, "NATIVE", false)) {
            a = g.a(gVar, currentTimeMillis, 0, 0, gVar.d + 1, 0, 0, 54);
        } else if (StringsKt.J(str, "INTER", false)) {
            a = g.a(gVar, currentTimeMillis, 0, 0, 0, gVar.e + 1, 0, 46);
        } else {
            if (!StringsKt.J(str, "REWARD", false)) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdActiveSession", "Unknown ad format for Ironsource: ".concat(str), null, false, 12, null);
                return;
            }
            a = g.a(gVar, currentTimeMillis, 0, 0, 0, 0, gVar.f + 1, 30);
        }
        atomicReference.set(a);
    }

    public final g b() {
        Object obj = this.e.get();
        obj.getClass();
        return (g) obj;
    }

    public final String c() {
        return (String) this.c.getValue();
    }

    public final String toString() {
        g b = b();
        int i = b.b;
        int i2 = b.c;
        int i3 = b.d;
        int i4 = b.e;
        int i5 = b.f;
        StringBuilder sb = new StringBuilder("IlrdActiveSession(id=");
        sb.append(c());
        sb.append(", startTs=");
        sb.append(this.d);
        sb.append(", expired=");
        sb.append(this.f);
        sb.append(", impressions=");
        sb.append(i + i2 + i3 + i4 + i5);
        sb.append(" [banner=");
        me4.q(sb, b.b, ", mrec=", i2, ", native=");
        me4.q(sb, i3, ", interstitial=", i4, ", rewarded=");
        return fc6.h(i5, "])", sb);
    }
}

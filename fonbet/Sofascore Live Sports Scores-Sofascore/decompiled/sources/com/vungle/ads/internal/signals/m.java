package com.vungle.ads.internal.signals;

import defpackage.fn0;
import defpackage.oea;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();
    public final Long a;
    public final long b;
    public String c;
    public final long d;
    public String e;
    public long f;
    public int g;
    public long h;
    public long i;

    public /* synthetic */ m(int i, String str, long j, String str2, long j2, int i2) {
        if (2 != (i & 2)) {
            oea.z(i, 2, k.a.getDescriptor());
            throw null;
        }
        this.a = 0L;
        this.b = 0L;
        if ((i & 1) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        this.d = j;
        if ((i & 4) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 8) == 0) {
            this.f = 0L;
        } else {
            this.f = j2;
        }
        if ((i & 16) == 0) {
            this.g = 0;
        } else {
            this.g = i2;
        }
        this.h = 0L;
        this.i = 0L;
        this.d = a(0L, 0L);
    }

    public static final void a(m mVar, wf3 wf3Var, uye uyeVar) {
        mVar.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || mVar.c != null) {
            wf3Var.h(uyeVar, 0, uhi.a, mVar.c);
        }
        wf3Var.E(uyeVar, 1, mVar.d);
        if (wf3Var.o(uyeVar) || mVar.e != null) {
            wf3Var.h(uyeVar, 2, uhi.a, mVar.e);
        }
        if (wf3Var.o(uyeVar) || mVar.f != 0) {
            wf3Var.E(uyeVar, 3, mVar.f);
        }
        if (!wf3Var.o(uyeVar) && mVar.g == 0) {
            return;
        }
        wf3Var.u(4, mVar.g, uyeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.c(this.a, mVar.a) && this.b == mVar.b;
    }

    public final int hashCode() {
        Long l = this.a;
        return Long.hashCode(this.b) + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("SignaledAd(lastAdLoadTime=");
        a.append(this.a);
        a.append(", loadAdTime=");
        return fn0.n(a, this.b, ')');
    }

    public m(Long l, long j) {
        this.a = l;
        this.b = j;
        this.d = a(l, j);
    }

    public final void a(String str) {
        this.e = str;
    }

    public final void a(int i) {
        this.g = i;
    }

    public final void a(long j) {
        this.h = j;
    }

    public static long a(Long l, long j) {
        if (l == null) {
            return -1L;
        }
        long longValue = j - l.longValue();
        if (longValue < 0) {
            return -1L;
        }
        return longValue;
    }
}

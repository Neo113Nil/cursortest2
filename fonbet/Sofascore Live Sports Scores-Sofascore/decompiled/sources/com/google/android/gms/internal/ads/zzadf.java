package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.g68;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzadf {
    public boolean c;
    public int e;
    public long h;
    public final zzadd i;
    public g68 a = new g68(2);
    public g68 b = new g68(2);
    public long d = C.TIME_UNSET;
    public float f = -1.0f;
    public float g = -1.0f;

    public zzadf(zzadd zzaddVar) {
        this.i = zzaddVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if ((r3 == 0 ? false : r0.h[(int) ((r3 - 1) % 15)]) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j) {
        if (j == this.d) {
            return;
        }
        this.h++;
        this.a.f(j);
        if (this.a.e()) {
            this.c = false;
        } else if (this.d != C.TIME_UNSET) {
            if (this.c) {
                g68 g68Var = this.b;
                long j2 = g68Var.e;
            }
            this.b.d();
            this.b.f(this.d);
            this.c = true;
            this.b.f(j);
        }
        if (this.c && this.b.e()) {
            g68 g68Var2 = this.a;
            this.a = this.b;
            this.b = g68Var2;
            this.c = false;
        }
        this.d = j;
        this.e = this.a.e() ? 0 : this.e + 1;
        c();
    }

    public final long b() {
        if (!this.a.e()) {
            return C.TIME_UNSET;
        }
        g68 g68Var = this.a;
        long j = g68Var.f;
        if (j == 0) {
            return 0L;
        }
        return g68Var.g / j;
    }

    public final void c() {
        float f;
        boolean e = this.a.e();
        if (e) {
            f = (float) (1.0E9d / (this.a.f != 0 ? r1.g / r2 : 0L));
        } else {
            f = this.f;
        }
        float f2 = this.g;
        if (f == f2) {
            return;
        }
        if (f != -1.0f && f2 != -1.0f) {
            float f3 = 1.0f;
            if (e && this.a.g >= 5000000000L) {
                f3 = 0.1f;
            }
            if (Math.abs(f - f2) < f3) {
                return;
            }
        } else if (f == -1.0f && this.e < 30) {
            return;
        }
        this.g = f;
        this.i.n(f);
    }
}

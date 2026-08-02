package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzxo {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public zzxo(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final zzxo a(Object obj) {
        return this.a.equals(obj) ? this : new zzxo(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean c(zzxo zzxoVar) {
        if (zzxoVar == null) {
            return false;
        }
        if (this == zzxoVar) {
            return true;
        }
        return this.a.equals(zzxoVar.a) && this.b == zzxoVar.b && this.c == zzxoVar.c && this.d == zzxoVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxo)) {
            return false;
        }
        zzxo zzxoVar = (zzxo) obj;
        return c(zzxoVar) && this.e == zzxoVar.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public zzxo(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public zzxo(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}

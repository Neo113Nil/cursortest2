package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.fn0;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgd implements zzao {
    public final long a;
    public final long b;
    public final long c;

    public zzgd(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgd)) {
            return false;
        }
        zzgd zzgdVar = (zzgd) obj;
        return this.a == zzgdVar.a && this.b == zzgdVar.b && this.c == zzgdVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((Long.hashCode(this.b) + ((Long.hashCode(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public final String toString() {
        long j = this.a;
        int length = String.valueOf(j).length();
        long j2 = this.b;
        int length2 = String.valueOf(j2).length();
        long j3 = this.c;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j3).length());
        fn0.t(j, "Mp4Timestamp: creation time=", ", modification time=", sb);
        sb.append(j2);
        return x5n.m(j3, ", timescale=", sb);
    }
}

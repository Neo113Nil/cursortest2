package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.fn0;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaji implements zzao {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public zzaji(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaji.class == obj.getClass()) {
            zzaji zzajiVar = (zzaji) obj;
            if (this.a == zzajiVar.a && this.b == zzajiVar.b && this.c == zzajiVar.c && this.d == zzajiVar.d && this.e == zzajiVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((Long.hashCode(this.d) + ((Long.hashCode(this.c) + ((Long.hashCode(this.b) + ((Long.hashCode(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        long j = this.a;
        int length = String.valueOf(j).length();
        long j2 = this.b;
        int length2 = String.valueOf(j2).length();
        long j3 = this.c;
        int length3 = String.valueOf(j3).length();
        long j4 = this.d;
        int length4 = String.valueOf(j4).length();
        long j5 = this.e;
        StringBuilder sb = new StringBuilder(fn0.b(length, 54, length2, 31, length3, 21, length4) + 12 + String.valueOf(j5).length());
        fn0.t(j, "Motion photo metadata: photoStartPosition=", ", photoSize=", sb);
        sb.append(j2);
        fn0.t(j3, ", photoPresentationTimestampUs=", ", videoStartPosition=", sb);
        sb.append(j4);
        return x5n.m(j5, ", videoSize=", sb);
    }
}

package com.moloco.sdk.internal.ilrd;

import defpackage.oea;
import defpackage.r5h;
import defpackage.wv8;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class g {

    @NotNull
    public static final a$b$b Companion = new a$b$b();
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public g(int i, long j, int i2, int i3, int i4, int i5, int i6) {
        if (63 != (i & 63)) {
            oea.z(i, 63, f.b);
            throw null;
        }
        this.a = j;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public static g a(g gVar, long j, int i, int i2, int i3, int i4, int i5, int i6) {
        if ((i6 & 2) != 0) {
            i = gVar.b;
        }
        int i7 = i;
        if ((i6 & 4) != 0) {
            i2 = gVar.c;
        }
        int i8 = i2;
        if ((i6 & 8) != 0) {
            i3 = gVar.d;
        }
        return new g(j, i7, i8, i3, (i6 & 16) != 0 ? gVar.e : i4, (i6 & 32) != 0 ? gVar.f : i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b && this.c == gVar.c && this.d == gVar.d && this.e == gVar.e && this.f == gVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + wv8.a(this.e, wv8.a(this.d, wv8.a(this.c, wv8.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImpressionCounts(lastEventReceivedTs=");
        sb.append(this.a);
        sb.append(", banner=");
        sb.append(this.b);
        sb.append(", mrec=");
        sb.append(this.c);
        sb.append(", native=");
        sb.append(this.d);
        sb.append(", interstitial=");
        sb.append(this.e);
        sb.append(", rewarded=");
        return wv8.j(sb, this.f, ')');
    }

    public g(long j, int i, int i2, int i3, int i4, int i5) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }
}

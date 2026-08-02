package com.google.android.gms.internal.ads;

import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzalj implements zzaho {
    public final int a;
    public final long b;
    public final int c;

    public zzalj(int i, long j, int i2) {
        this.a = i;
        this.b = j;
        this.c = i2;
    }

    public final String toString() {
        String a = zzfm.a(this.a);
        int length = a.length();
        long j = this.b;
        int length2 = String.valueOf(j).length();
        int i = this.c;
        StringBuilder sb = new StringBuilder(wt3.h(length, 29, length2, 16, String.valueOf(i).length()) + 1);
        wt3.A("AtomSizeTooSmall{type=", a, sb, ", size=");
        sb.append(j);
        sb.append(", minHeaderSize=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

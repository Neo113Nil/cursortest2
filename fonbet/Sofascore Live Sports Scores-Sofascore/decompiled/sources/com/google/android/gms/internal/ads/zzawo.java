package com.google.android.gms.internal.ads;

import defpackage.x5n;
import java.util.ArrayDeque;
import java.util.Optional;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzawo {
    public final ArrayDeque a = new ArrayDeque();

    public final void a(long j, long j2, long j3) {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        zzawl zzawlVar = new zzawl(j, j2, j3);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.size() >= (x5n.y((i2 & (~i)) | i3, (i & i4) | i5, i6, i7) ^ (i8 % 452867621))) {
            throw new zzawm();
        }
        arrayDeque.push(zzawlVar);
    }

    public final zzawl b() {
        return (zzawl) Optional.ofNullable((zzawl) this.a.peek()).orElseThrow(zzawk.b);
    }
}

package com.google.android.gms.internal.common;

import defpackage.a70;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzad extends zzab {
    public Object[] a = new Object[4];
    public int b = 0;
    public boolean c;

    public final void a(Object obj) {
        int i;
        obj.getClass();
        int length = this.a.length;
        int i2 = this.b;
        int i3 = i2 + 1;
        if (i3 < 0) {
            a70.p("cannot store more than Integer.MAX_VALUE elements");
            return;
        }
        if (i3 <= length) {
            i = length;
        } else {
            i = (length >> 1) + length + 1;
            if (i < i3) {
                int highestOneBit = Integer.highestOneBit(i2);
                i = highestOneBit + highestOneBit;
            }
            if (i < 0) {
                i = Integer.MAX_VALUE;
            }
        }
        if (i > length || this.c) {
            this.a = Arrays.copyOf(this.a, i);
            this.c = false;
        }
        Object[] objArr = this.a;
        int i4 = this.b;
        this.b = i4 + 1;
        objArr[i4] = obj;
    }
}

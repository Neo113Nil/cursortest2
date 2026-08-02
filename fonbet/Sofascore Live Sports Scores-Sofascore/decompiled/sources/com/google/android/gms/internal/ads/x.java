package com.google.android.gms.internal.ads;

import defpackage.aqo;
import defpackage.lpo;
import defpackage.mqo;
import defpackage.v6g;
import defpackage.yhk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x extends zziei {
    public static final int[] h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int c;
    public final zziei d;
    public final zziei e;
    public final int f;
    public final int g;

    public x(zziei zzieiVar, zziei zzieiVar2) {
        this.d = zzieiVar;
        this.e = zzieiVar2;
        int o = zzieiVar.o();
        this.f = o;
        this.c = zzieiVar2.o() + o;
        this.g = Math.max(zzieiVar.y(), zzieiVar2.y()) + 1;
    }

    public static int E(int i) {
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return h[i];
    }

    @Override // com.google.android.gms.internal.ads.zziei
    /* renamed from: A */
    public final zzied iterator() {
        return new mqo(this);
    }

    @Override // com.google.android.gms.internal.ads.zziei, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new mqo(this);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final byte n(int i) {
        int i2 = this.f;
        return i < i2 ? this.d.n(i) : this.e.n(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int o() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei p(int i, int i2) {
        return q(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei q(int i, int i2) {
        int i3 = this.c;
        int e = zziei.e(i, i2, i3);
        if (e == 0) {
            return zziei.b;
        }
        if (e == i3) {
            return this;
        }
        zziei zzieiVar = this.d;
        int i4 = this.f;
        if (i2 <= i4) {
            return zzieiVar.p(i, i2);
        }
        int i5 = i2 - i4;
        zziei zzieiVar2 = this.e;
        return i >= i4 ? zzieiVar2.p(i - i4, i5) : new x(zzieiVar.p(i, zzieiVar.o()), zzieiVar2.p(0, i5));
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final void r(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        zziei zzieiVar = this.d;
        int i5 = this.f;
        if (i4 <= i5) {
            zzieiVar.r(i, i2, i3, bArr);
            return;
        }
        zziei zzieiVar2 = this.e;
        if (i >= i5) {
            zzieiVar2.r(i - i5, i2, i3, bArr);
            return;
        }
        int i6 = i5 - i;
        zzieiVar.r(i, i2, i6, bArr);
        zzieiVar2.r(0, i2 + i6, i3 - i6, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final void t(zzier zzierVar) {
        this.d.t(zzierVar);
        this.e.t(zzierVar);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final boolean u(zziei zzieiVar) {
        v6g v6gVar = new v6g(this);
        lpo c = v6gVar.c();
        v6g v6gVar2 = new v6g(zzieiVar);
        lpo c2 = v6gVar2.c();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int o = c.o() - i;
            int o2 = c2.o() - i2;
            int min = Math.min(o, o2);
            if (!(i == 0 ? c.E(c2, i2, min) : c2.E(c, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.c;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                defpackage.zzl.s();
                return false;
            }
            if (min == o) {
                i = 0;
                c = v6gVar.c();
            } else {
                i += min;
                c = c;
            }
            if (min == o2) {
                c2 = v6gVar2.c();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int w(int i, int i2, int i3) {
        int i4 = i2 + i3;
        zziei zzieiVar = this.d;
        int i5 = this.f;
        if (i4 <= i5) {
            return zzieiVar.w(i, i2, i3);
        }
        zziei zzieiVar2 = this.e;
        if (i2 >= i5) {
            return zzieiVar2.w(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return zzieiVar2.w(zzieiVar.w(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziem x() {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.g);
        arrayDeque.push(this);
        zziei zzieiVar = this.d;
        while (zzieiVar instanceof x) {
            x xVar = (x) zzieiVar;
            arrayDeque.push(xVar);
            zzieiVar = xVar.d;
        }
        lpo lpoVar = (lpo) zzieiVar;
        while (true) {
            if (!(lpoVar != null)) {
                aqo aqoVar = new aqo();
                aqoVar.a = arrayList.iterator();
                aqoVar.c = 0;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    aqoVar.c++;
                }
                aqoVar.d = -1;
                if (!aqoVar.h()) {
                    aqoVar.b = zzifz.b;
                    aqoVar.e = 0;
                }
                return zziem.e(aqoVar);
            }
            lpo lpoVar2 = null;
            if (lpoVar == null) {
                yhk.d();
                return null;
            }
            while (true) {
                if (!arrayDeque.isEmpty()) {
                    zziei zzieiVar2 = ((x) arrayDeque.pop()).e;
                    while (zzieiVar2 instanceof x) {
                        x xVar2 = (x) zzieiVar2;
                        arrayDeque.push(xVar2);
                        zzieiVar2 = xVar2.d;
                    }
                    lpo lpoVar3 = (lpo) zzieiVar2;
                    if (lpoVar3.o() != 0) {
                        lpoVar2 = lpoVar3;
                        break;
                    }
                } else {
                    break;
                }
            }
            arrayList.add(lpoVar.s());
            lpoVar = lpoVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int y() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final boolean z() {
        return this.c >= E(this.g);
    }
}

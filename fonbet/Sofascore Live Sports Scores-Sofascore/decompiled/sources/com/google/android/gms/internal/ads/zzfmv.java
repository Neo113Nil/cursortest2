package com.google.android.gms.internal.ads;

import defpackage.ddb;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfmv {
    public final LinkedBlockingDeque a = new LinkedBlockingDeque();
    public final Callable b;
    public final zzhdi c;

    public zzfmv(zzdvt zzdvtVar, zzhdi zzhdiVar) {
        this.b = zzdvtVar;
        this.c = zzhdiVar;
    }

    public final synchronized void a(int i) {
        LinkedBlockingDeque linkedBlockingDeque = this.a;
        int size = i - linkedBlockingDeque.size();
        for (int i2 = 0; i2 < size; i2++) {
            linkedBlockingDeque.add(this.c.submit(this.b));
        }
    }

    public final synchronized ddb b() {
        a(1);
        return (ddb) this.a.poll();
    }
}

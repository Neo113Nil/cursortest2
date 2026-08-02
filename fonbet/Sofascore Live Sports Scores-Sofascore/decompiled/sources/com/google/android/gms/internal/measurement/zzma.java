package com.google.android.gms.internal.measurement;

import defpackage.ch0;
import defpackage.dh0;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzma {
    public static final dh0 a = new dh0(0);

    public static synchronized void a() {
        synchronized (zzma.class) {
            dh0 dh0Var = a;
            Iterator it = ((ch0) dh0Var.values()).iterator();
            if (it.hasNext()) {
                ((zzma) it.next()).getClass();
                throw null;
            }
            dh0Var.clear();
        }
    }
}

package com.google.android.gms.internal.fido;

import defpackage.n9e;
import defpackage.wo0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaq implements zzbp {
    public final Object a;

    static {
        int i = zzap.a;
    }

    public zzaq(Object obj) {
        this.a = obj;
    }

    public final Object a() {
        int i = zzae.a;
        if (n9e.i == null) {
            n9e.i = new wo0();
        }
        synchronized (n9e.h) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}

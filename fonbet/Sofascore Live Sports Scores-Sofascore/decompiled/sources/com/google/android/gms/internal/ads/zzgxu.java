package com.google.android.gms.internal.ads;

import defpackage.aio;
import java.io.Serializable;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzgxu<K, V> extends aio implements Serializable {
    public final transient zzgxp d;
    public final transient int e;

    public zzgxu(zzgxp zzgxpVar, int i) {
        this.d = zzgxpVar;
        this.e = i;
    }

    @Override // defpackage.zho
    public final Map d() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.zho
    public final boolean e(Object obj) {
        return obj != null && super.e(obj);
    }

    @Override // defpackage.zho, com.google.android.gms.internal.ads.zzgyu
    public /* synthetic */ Map zzu() {
        return this.d;
    }
}

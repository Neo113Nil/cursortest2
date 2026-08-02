package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.internal.Logger;
import defpackage.e5o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzep extends e5o {
    @Override // com.google.android.gms.internal.cast.zzey
    public final void C0(int i) {
        Logger logger = zzet.a;
        zzet.a.a("onError: %d", Integer.valueOf(i));
        throw null;
    }

    @Override // defpackage.e5o, com.google.android.gms.internal.cast.zzey
    public final void D() {
        zzet.a.a("onConnected", new Object[0]);
        throw null;
    }

    @Override // defpackage.e5o, com.google.android.gms.internal.cast.zzey
    public final void d1() {
        zzet.a.a("onConnectedWithDisplay", new Object[0]);
        throw null;
    }
}

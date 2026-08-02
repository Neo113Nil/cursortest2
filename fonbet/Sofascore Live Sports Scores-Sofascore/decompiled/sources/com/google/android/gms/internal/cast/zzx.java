package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.SessionTransferCallback;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzx extends SessionTransferCallback {
    public final /* synthetic */ zzy a;

    public zzx(zzy zzyVar) {
        this.a = zzyVar;
    }

    @Override // com.google.android.gms.cast.framework.SessionTransferCallback
    public final void a(int i, int i2) {
        zzcr zzcrVar = new zzcr(11);
        zzcrVar.a = Integer.valueOf(i2);
        zzy zzyVar = this.a;
        zzcrVar.b = Boolean.valueOf(zzyVar.b.b == 2);
        zzyVar.a(new zzcs(zzcrVar));
    }

    @Override // com.google.android.gms.cast.framework.SessionTransferCallback
    public final void b(int i) {
    }
}

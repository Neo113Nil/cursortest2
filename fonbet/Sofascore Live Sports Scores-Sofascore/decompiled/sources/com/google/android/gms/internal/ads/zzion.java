package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import defpackage.ba4;
import defpackage.fa4;
import defpackage.ga4;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzion extends ga4 {
    public final WeakReference b;

    public zzion(zzbkh zzbkhVar) {
        this.b = new WeakReference(zzbkhVar);
    }

    @Override // defpackage.ga4
    public final void onCustomTabsServiceConnected(ComponentName componentName, ba4 ba4Var) {
        zzbkh zzbkhVar = (zzbkh) this.b.get();
        if (zzbkhVar != null) {
            zzbkhVar.b = (fa4) ba4Var;
            ba4Var.d();
            zzbkg zzbkgVar = zzbkhVar.d;
            if (zzbkgVar != null) {
                zzbkgVar.zza();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbkh zzbkhVar = (zzbkh) this.b.get();
        if (zzbkhVar != null) {
            zzbkhVar.b = null;
            zzbkhVar.a = null;
        }
    }
}

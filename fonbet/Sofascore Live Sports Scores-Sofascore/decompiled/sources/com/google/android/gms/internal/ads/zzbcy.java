package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbcy extends zzbdt {
    public static volatile String h;
    public static final Object i = new Object();

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        if (h == null) {
            synchronized (i) {
                try {
                    if (h == null) {
                        h = (String) this.e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zzaya zzayaVar = this.d;
        synchronized (zzayaVar) {
            String str = h;
            zzayaVar.n();
            ((zzaza) zzayaVar.b).k0(str);
        }
    }
}

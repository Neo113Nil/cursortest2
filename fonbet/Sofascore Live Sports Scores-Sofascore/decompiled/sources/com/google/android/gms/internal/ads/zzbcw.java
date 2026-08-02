package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbcw extends zzbdt {
    public static volatile Long h;
    public static final Object i = new Object();

    public zzbcw(zzbcg zzbcgVar, zzaya zzayaVar, int i2) {
        super(zzbcgVar, "c2tDBlieP1HgAca8BbxZWeFItAa95IUNAJZ8eF9wTfwT8H+oJvTJgvb0TMn4OhPJ", "tm0zp+MQfD9mNSBt0r3mfYhq2ky3SeNyaSrFjHWQaT0=", zzayaVar, i2, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        if (h == null) {
            synchronized (i) {
                try {
                    if (h == null) {
                        h = (Long) this.e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        zzaya zzayaVar = this.d;
        synchronized (zzayaVar) {
            long longValue = h.longValue();
            zzayaVar.n();
            ((zzaza) zzayaVar.b).P(longValue);
        }
    }
}

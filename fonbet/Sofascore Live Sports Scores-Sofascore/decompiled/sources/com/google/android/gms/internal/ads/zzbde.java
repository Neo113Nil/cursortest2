package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbde extends zzbdt {
    public final zzbbj h;
    public final long i;
    public final long j;

    public zzbde(zzbcg zzbcgVar, zzaya zzayaVar, int i, zzbbj zzbbjVar, long j, long j2) {
        super(zzbcgVar, "0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", zzayaVar, i, 11);
        this.h = zzbbjVar;
        this.i = j;
        this.j = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        zzbbj zzbbjVar = this.h;
        if (zzbbjVar != null) {
            String str = (String) this.e.invoke(null, zzbbjVar.a, Long.valueOf(this.i), Long.valueOf(this.j));
            zzbbh zzbbhVar = new zzbbh();
            HashMap b = zzazv.b(str);
            if (b != null) {
                zzbbhVar.a = (Long) b.get(0);
                zzbbhVar.b = (Long) b.get(1);
                zzbbhVar.c = (Long) b.get(2);
            }
            zzaya zzayaVar = this.d;
            synchronized (zzayaVar) {
                try {
                    long longValue = zzbbhVar.a.longValue();
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).N0(longValue);
                    if (zzbbhVar.b.longValue() >= 0) {
                        long longValue2 = zzbbhVar.b.longValue();
                        zzayaVar.n();
                        ((zzaza) zzayaVar.b).l0(longValue2);
                    }
                    if (zzbbhVar.c.longValue() >= 0) {
                        long longValue3 = zzbbhVar.c.longValue();
                        zzayaVar.n();
                        ((zzaza) zzayaVar.b).m0(longValue3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

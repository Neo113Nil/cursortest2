package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbcv extends zzbdt {
    public zzbcv(zzbcg zzbcgVar, zzaya zzayaVar, int i) {
        super(zzbcgVar, "m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", zzayaVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        zzaya zzayaVar = this.d;
        zzayaVar.n();
        ((zzaza) zzayaVar.b).L0(-1L);
        zzayaVar.n();
        ((zzaza) zzayaVar.b).M0(-1L);
        int[] iArr = (int[]) this.e.invoke(null, this.a.a);
        synchronized (zzayaVar) {
            long j = iArr[0];
            zzayaVar.n();
            ((zzaza) zzayaVar.b).L0(j);
            long j2 = iArr[1];
            zzayaVar.n();
            ((zzaza) zzayaVar.b).M0(j2);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                zzayaVar.n();
                ((zzaza) zzayaVar.b).c0(i);
            }
        }
    }
}

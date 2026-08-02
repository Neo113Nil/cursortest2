package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzxo extends zzxz implements zzyi {
    @Override // com.google.android.gms.internal.measurement.zzxz
    public final zzabl c() {
        return zzabl.b;
    }

    @Override // com.google.android.gms.internal.measurement.zzxz
    public final boolean d(zzyd zzydVar) {
        zzzj j = j();
        int a = j.a();
        int i = 0;
        while (true) {
            if (i >= a) {
                break;
            }
            if (j.b(i).a != "eye3tag") {
                i++;
            } else if (j.d(zzxx.a) == null) {
                zzyl zzylVar = zzxx.i;
                if (j.d(zzylVar) == null) {
                    k(zzylVar, zzyv.SMALL);
                }
            }
        }
        return super.d(zzydVar);
    }
}

package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbdd extends zzbdt {
    public final zzbby h;

    public zzbdd(zzbcg zzbcgVar, zzaya zzayaVar, int i, zzbby zzbbyVar) {
        super(zzbcgVar, "/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", zzayaVar, i, 94);
        this.h = zzbbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        Method method = this.e;
        zzbby zzbbyVar = this.h;
        List list = zzbbyVar.a;
        zzbbyVar.a = Collections.EMPTY_LIST;
        int intValue = ((Integer) method.invoke(null, list)).intValue();
        zzaya zzayaVar = this.d;
        synchronized (zzayaVar) {
            int a = zzayo.a(intValue);
            zzayaVar.n();
            ((zzaza) zzayaVar.b).y0(a);
        }
    }
}

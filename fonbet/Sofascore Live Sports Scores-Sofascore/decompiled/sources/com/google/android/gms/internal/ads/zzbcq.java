package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbcq extends zzbdt {
    public final Activity h;
    public final View i;

    public zzbcq(zzbcg zzbcgVar, zzaya zzayaVar, int i, View view, Activity activity) {
        super(zzbcgVar, "9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", zzayaVar, i, 62);
        this.i = view;
        this.h = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        View view = this.i;
        if (view == null) {
            return;
        }
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.D3);
        boolean booleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.e.invoke(null, view, this.h, bool);
        zzaya zzayaVar = this.d;
        synchronized (zzayaVar) {
            try {
                long longValue = ((Long) objArr[0]).longValue();
                zzayaVar.n();
                ((zzaza) zzayaVar.b).h0(longValue);
                long longValue2 = ((Long) objArr[1]).longValue();
                zzayaVar.n();
                ((zzaza) zzayaVar.b).i0(longValue2);
                if (booleanValue) {
                    String str = (String) objArr[2];
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).j0(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

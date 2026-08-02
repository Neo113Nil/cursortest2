package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbcs extends zzbdt {
    public zzbcs(zzbcg zzbcgVar, zzaya zzayaVar, int i) {
        super(zzbcgVar, "2JfLKOCWe20PaEte0oViJ9E/+ELRHfLHNO4trOuu7IQ3kQ71vgp9bwF5/QP32+2T", "LVYC8EvnYnoIGxefzdW+bkgnD7TMgzMx712oMyZcYTg=", zzayaVar, i, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        zzaya zzayaVar = this.d;
        zzayaVar.n();
        ((zzaza) zzayaVar.b).u0(3);
        try {
            int i = 1;
            if (true == ((Boolean) this.e.invoke(null, this.a.a)).booleanValue()) {
                i = 2;
            }
            zzayaVar.n();
            ((zzaza) zzayaVar.b).u0(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}

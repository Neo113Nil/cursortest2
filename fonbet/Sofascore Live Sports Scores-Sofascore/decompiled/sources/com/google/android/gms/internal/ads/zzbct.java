package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbct extends zzbdt {
    public static final zzbdu i = new zzbdu();
    public final Context h;

    public zzbct(zzbcg zzbcgVar, zzaya zzayaVar, int i2, Context context) {
        super(zzbcgVar, "00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", zzayaVar, i2, 29);
        this.h = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    public final void a() {
        zzaya zzayaVar = this.d;
        zzayaVar.n();
        ((zzaza) zzayaVar.b).D("E");
        Context context = this.h;
        AtomicReference a = i.a(context.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                try {
                    if (a.get() == null) {
                        a.set((String) this.e.invoke(null, context));
                    }
                } finally {
                }
            }
        }
        String str = (String) a.get();
        zzaya zzayaVar2 = this.d;
        synchronized (zzayaVar2) {
            String encodeToString = Base64.encodeToString(str.getBytes(), 11);
            zzayaVar2.n();
            ((zzaza) zzayaVar2.b).D(encodeToString);
        }
    }
}

package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfwi implements zzfwl {
    public static final zzfwi e = new zzfwi(new zzfwm());
    public Date a;
    public boolean b;
    public final zzfwm c;
    public boolean d;

    public zzfwi(zzfwm zzfwmVar) {
        this.c = zzfwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final void zzd(boolean z) {
        if (!this.d && z) {
            Date date = new Date();
            Date date2 = this.a;
            if (date2 == null || date.after(date2)) {
                this.a = date;
                if (this.b) {
                    Iterator it = Collections.unmodifiableCollection(zzfwk.c.b).iterator();
                    while (it.hasNext()) {
                        zzfxa zzfxaVar = ((zzfvq) it.next()).d;
                        Date date3 = this.a;
                        zzfxaVar.f(date3 != null ? (Date) date3.clone() : null);
                    }
                }
            }
        }
        this.d = z;
    }
}

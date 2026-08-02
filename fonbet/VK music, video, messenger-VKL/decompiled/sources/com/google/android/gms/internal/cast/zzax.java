package com.google.android.gms.internal.cast;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import xsna.avz0;
import xsna.bq70;
import xsna.o100;
import xsna.vnv;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzax extends avz0 {
    public final Set zza = Collections.synchronizedSet(new HashSet());
    private int zzd = zzb;
    private static final o100 zzc = new o100("AppVisibilityProxy", null);
    static final int zzb = 1;

    @Override // xsna.lvz0
    public final vnv zzb() {
        return new bq70(this);
    }

    @Override // xsna.lvz0
    public final void zzc() {
        zzc.c("onAppEnteredForeground", new Object[0]);
        this.zzd = 1;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzaw) it.next()).zza();
        }
    }

    @Override // xsna.lvz0
    public final void zzd() {
        zzc.c("onAppEnteredBackground", new Object[0]);
        this.zzd = 2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzaw) it.next()).zzb();
        }
    }

    public final boolean zze() {
        return this.zzd == 2;
    }

    public final void zzf(zzaw zzawVar) {
        this.zza.add(zzawVar);
    }
}

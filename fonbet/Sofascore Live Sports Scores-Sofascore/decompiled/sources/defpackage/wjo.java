package defpackage;

import com.google.android.gms.internal.playcore_hsdp.zzg;
import com.google.android.gms.internal.playcore_hsdp.zzk;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class wjo implements Serializable, zzg {
    public final transient zzk a = new zzk();
    public final zzg b;
    public volatile transient boolean c;
    public transient Object d;

    public wjo(zzg zzgVar) {
        this.b = zzgVar;
    }

    public final String toString() {
        return lnb.o("Suppliers.memoize(", (this.c ? lnb.o("<supplier that returned ", String.valueOf(this.d), ">") : this.b).toString(), ")");
    }

    @Override // com.google.android.gms.internal.playcore_hsdp.zzg
    public final Object zza() {
        if (!this.c) {
            synchronized (this.a) {
                try {
                    if (!this.c) {
                        Object zza = this.b.zza();
                        this.d = zza;
                        this.c = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }
}

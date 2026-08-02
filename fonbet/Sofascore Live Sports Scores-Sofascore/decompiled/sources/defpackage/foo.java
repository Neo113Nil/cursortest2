package defpackage;

import com.google.android.gms.internal.playcore_hsdp.zzg;
import com.google.android.gms.internal.playcore_hsdp.zzk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class foo implements zzg {
    public final zzk a = new zzk();
    public volatile zzg b;
    public Object c;

    public foo(zzg zzgVar) {
        this.b = zzgVar;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == null) {
            obj = lnb.o("<supplier that returned ", String.valueOf(this.c), ">");
        }
        return lnb.o("Suppliers.memoize(", obj.toString(), ")");
    }

    @Override // com.google.android.gms.internal.playcore_hsdp.zzg
    public final Object zza() {
        if (this.b != null) {
            synchronized (this.a) {
                try {
                    if (this.b != null) {
                        Object zza = this.b.zza();
                        this.c = zza;
                        this.b = null;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }
}

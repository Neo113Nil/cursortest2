package defpackage;

import com.google.android.gms.internal.ads.zzgvc;
import com.google.android.gms.internal.ads.zzgvi;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lho implements zzgvc {
    public final zzgvi a = new zzgvi();
    public volatile zzgvc b;
    public Object c;

    public lho(zzgvc zzgvcVar) {
        this.b = zzgvcVar;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == null) {
            String valueOf = String.valueOf(this.c);
            obj = wt3.m("<supplier that returned ", valueOf, new StringBuilder(valueOf.length() + 25), ">");
        }
        String obj2 = obj.toString();
        return wt3.m("Suppliers.memoize(", obj2, new StringBuilder(obj2.length() + 19), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgvc, defpackage.fon
    /* renamed from: zza */
    public final Object mo792zza() {
        if (this.b != null) {
            synchronized (this.a) {
                try {
                    if (this.b != null) {
                        Object mo792zza = this.b.mo792zza();
                        this.c = mo792zza;
                        this.b = null;
                        return mo792zza;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }
}

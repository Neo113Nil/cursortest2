package defpackage;

import com.google.android.gms.internal.ads.zzgvc;
import com.google.android.gms.internal.ads.zzgvi;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kho implements Serializable, zzgvc {
    public final transient zzgvi a = new zzgvi();
    public final zzgvc b;
    public volatile transient boolean c;
    public transient Object d;

    public kho(zzgvc zzgvcVar) {
        this.b = zzgvcVar;
    }

    public final String toString() {
        Object obj;
        if (this.c) {
            String valueOf = String.valueOf(this.d);
            obj = wt3.m("<supplier that returned ", valueOf, new StringBuilder(valueOf.length() + 25), ">");
        } else {
            obj = this.b;
        }
        String obj2 = obj.toString();
        return wt3.m("Suppliers.memoize(", obj2, new StringBuilder(obj2.length() + 19), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgvc, defpackage.fon
    /* renamed from: zza */
    public final Object mo792zza() {
        if (!this.c) {
            synchronized (this.a) {
                try {
                    if (!this.c) {
                        Object mo792zza = this.b.mo792zza();
                        this.d = mo792zza;
                        this.c = true;
                        return mo792zza;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }
}

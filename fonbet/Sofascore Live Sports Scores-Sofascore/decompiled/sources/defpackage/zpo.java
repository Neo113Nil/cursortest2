package defpackage;

import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.ads.zzigw;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zpo {
    public final zzigw a;
    public volatile zziei b;
    public volatile zzigw c;

    public zpo(zzigw zzigwVar) {
        this.c = zzigwVar;
        this.a = zzigwVar.g();
        zziew zziewVar = zziew.b;
        int i = dpo.a;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        zzigw zzigwVar;
        try {
            zzigwVar = this.c;
        } catch (zzige unused) {
            zziew zziewVar = zziew.b;
            zzigwVar = this.a;
        }
        return zzigwVar.equals(obj);
    }

    public final int hashCode() {
        zzigw zzigwVar;
        try {
            zzigwVar = this.c;
        } catch (zzige unused) {
            zziew zziewVar = zziew.b;
            zzigwVar = this.a;
        }
        return zzigwVar.hashCode();
    }

    public final String toString() {
        zzigw zzigwVar;
        try {
            zzigwVar = this.c;
        } catch (zzige unused) {
            zziew zziewVar = zziew.b;
            zzigwVar = this.a;
        }
        return zzigwVar.toString();
    }
}

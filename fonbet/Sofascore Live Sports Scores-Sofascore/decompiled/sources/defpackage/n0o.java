package defpackage;

import com.google.android.gms.internal.wearable.zzcg;
import com.google.android.gms.internal.wearable.zzcs;
import com.google.android.gms.internal.wearable.zzdv;
import com.google.android.gms.internal.wearable.zzel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class n0o {
    public final zzel a;
    public final zzcs b;
    public volatile zzcg c;
    public volatile zzel d;
    public volatile boolean e;

    public n0o(zzel zzelVar) {
        this.d = zzelVar;
        this.a = zzelVar.g();
        zzcs zzcsVar = zzcs.b;
        int i = opn.a;
        this.b = zzcs.b;
        this.c = null;
        this.e = false;
    }

    public final zzel a() {
        try {
            if (this.d == null) {
                synchronized (this) {
                    if (this.e) {
                        throw new zzdv("Repeat access to corrupted lazy field");
                    }
                    try {
                        this.d = this.a.zzN().a(this.c, this.b);
                    } catch (zzdv e) {
                        this.e = true;
                        throw e;
                    }
                }
            }
            return this.d;
        } catch (zzdv unused) {
            zzcs zzcsVar = zzcs.b;
            return this.a;
        }
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}

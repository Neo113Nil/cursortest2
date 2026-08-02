package com.google.android.gms.internal.wearable;

import androidx.core.app.NotificationCompat;
import defpackage.i6o;
import defpackage.k2o;
import defpackage.m6o;
import defpackage.txn;
import defpackage.zrn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaa extends zzdg implements zzem {
    private static final zzaa zzt;
    private static volatile zzes zzu;
    private int zzb;
    private double zzg;
    private float zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private zzdp zzm;
    private zzdp zzn;
    private zzdp zzo;
    private zzdo zzp;
    private zzdm zzq;
    private long zzr;
    private byte zzs = 2;
    private zzcg zze = zzcg.b;
    private String zzf = "";

    static {
        zzaa zzaaVar = new zzaa();
        zzt = zzaaVar;
        zzdg.k(zzaa.class, zzaaVar);
    }

    private zzaa() {
        i6o i6oVar = i6o.e;
        this.zzm = i6oVar;
        this.zzn = i6oVar;
        this.zzo = i6oVar;
        this.zzp = k2o.e;
        this.zzq = txn.e;
    }

    public static zzz s() {
        return (zzz) ((zzdb) zzt.d(5, null));
    }

    public final /* synthetic */ void A(boolean z) {
        this.zzb |= 128;
        this.zzl = z;
    }

    public final void B(List list) {
        zzdp zzdpVar = this.zzm;
        if (!zzdpVar.zza()) {
            int size = zzdpVar.size();
            this.zzm = zzdpVar.f(size + size);
        }
        zzbq.h(list, this.zzm);
    }

    @Override // com.google.android.gms.internal.wearable.zzdg
    public final Object d(int i, zzdg zzdgVar) {
        zzes zzesVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzs);
        }
        if (i2 == 2) {
            return new m6o(zzt, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0002\u0001ည\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဏ\u0006\bဇ\u0007\tЛ\nЛ\u000b\u001a\f\u0014\rဂ\b\u000e\u0013", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzac.class, "zzn", zzab.class, "zzo", "zzp", "zzr", "zzq"});
        }
        if (i2 == 3) {
            return new zzaa();
        }
        if (i2 == 4) {
            return new zzz(zzt);
        }
        if (i2 == 5) {
            return zzt;
        }
        if (i2 != 6) {
            this.zzs = zzdgVar == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzes zzesVar2 = zzu;
        if (zzesVar2 != null) {
            return zzesVar2;
        }
        synchronized (zzaa.class) {
            try {
                zzesVar = zzu;
                if (zzesVar == null) {
                    zzesVar = new zzdc(zzt);
                    zzu = zzesVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzesVar;
    }

    public final void n(zzab zzabVar) {
        zzdp zzdpVar = this.zzn;
        if (!zzdpVar.zza()) {
            int size = zzdpVar.size();
            this.zzn = zzdpVar.f(size + size);
        }
        this.zzn.add(zzabVar);
    }

    public final void o(List list) {
        zzdp zzdpVar = this.zzo;
        if (!zzdpVar.zza()) {
            int size = zzdpVar.size();
            this.zzo = zzdpVar.f(size + size);
        }
        zzbq.h(list, this.zzo);
    }

    public final void p(ArrayList arrayList) {
        zzdo zzdoVar = this.zzp;
        if (!zzdoVar.zza()) {
            int size = zzdoVar.size();
            this.zzp = zzdoVar.f(size + size);
        }
        zzbq.h(arrayList, this.zzp);
    }

    public final void q(ArrayList arrayList) {
        zzdm zzdmVar = this.zzq;
        if (!zzdmVar.zza()) {
            int size = zzdmVar.size();
            this.zzq = zzdmVar.f(size + size);
        }
        zzbq.h(arrayList, this.zzq);
    }

    public final /* synthetic */ void r(long j) {
        this.zzb |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.zzr = j;
    }

    public final /* synthetic */ void t(zrn zrnVar) {
        zrnVar.getClass();
        this.zzb |= 1;
        this.zze = zrnVar;
    }

    public final /* synthetic */ void u(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void v(double d) {
        this.zzb |= 4;
        this.zzg = d;
    }

    public final /* synthetic */ void w(float f) {
        this.zzb |= 8;
        this.zzh = f;
    }

    public final /* synthetic */ void x(long j) {
        this.zzb |= 16;
        this.zzi = j;
    }

    public final /* synthetic */ void y(int i) {
        this.zzb |= 32;
        this.zzj = i;
    }

    public final /* synthetic */ void z(int i) {
        this.zzb |= 64;
        this.zzk = i;
    }
}

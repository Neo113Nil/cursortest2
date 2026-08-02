package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaed;
import defpackage.ldn;
import defpackage.ndn;
import defpackage.tan;
import defpackage.w7n;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzni extends zzadu implements zzafd {
    private static final zzaec zzl = new f();
    private static final zzni zzq;
    private static volatile zzafj zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private zzaef zzi;
    private zzaef zzj;
    private zzaeb zzk;
    private zznm zzm;
    private boolean zzn;
    private boolean zzo;
    private zznf zzp;
    private zzacr zze = zzacr.b;
    private String zzg = "";

    static {
        zzni zzniVar = new zzni();
        zzq = zzniVar;
        zzadu.t(zzni.class, zzniVar);
    }

    private zzni() {
        ldn ldnVar = ldn.e;
        this.zzi = ldnVar;
        this.zzj = ldnVar;
        this.zzk = tan.e;
    }

    public static zznh L() {
        return (zznh) zzq.p();
    }

    public static zzni M() {
        return zzq;
    }

    public final boolean A() {
        return this.zzf;
    }

    public final String B() {
        return this.zzg;
    }

    public final long C() {
        return this.zzh;
    }

    public final zzaef D() {
        return this.zzi;
    }

    public final zzaef E() {
        return this.zzj;
    }

    public final List F() {
        return new zzaed.zza(this.zzk, zzl);
    }

    public final boolean G() {
        return (this.zzb & 16) != 0;
    }

    public final zznm H() {
        zznm zznmVar = this.zzm;
        return zznmVar == null ? zznm.A() : zznmVar;
    }

    public final boolean I() {
        return this.zzn;
    }

    public final boolean J() {
        return this.zzo;
    }

    public final zznf K() {
        zznf zznfVar = this.zzp;
        return zznfVar == null ? zznf.z() : zznfVar;
    }

    public final /* synthetic */ void N(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object x(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ndn(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", w7n.b, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new zzni();
        }
        if (i2 == 4) {
            return new zznh(zzq);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzr;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzni.class) {
            try {
                zzafjVar = zzr;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzq);
                    zzr = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final boolean y() {
        return (this.zzb & 1) != 0;
    }

    public final zzacr z() {
        return this.zze;
    }
}

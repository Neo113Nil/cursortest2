package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzaft {
    public final zzafn a;
    public final zzafs b;
    public zzafp c;
    public final int d;

    public zzaft(zzafq zzafqVar, zzafs zzafsVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = zzafsVar;
        this.d = i;
        this.a = new zzafn(zzafqVar, j, j2, j3, j4, j5);
    }

    public static final int c(zzagi zzagiVar, long j, zzahh zzahhVar) {
        if (j == zzagiVar.zzn()) {
            return 0;
        }
        zzahhVar.a = j;
        return 1;
    }

    public final void a(long j) {
        zzafp zzafpVar = this.c;
        if (zzafpVar == null || zzafpVar.a != j) {
            zzafn zzafnVar = this.a;
            this.c = new zzafp(j, zzafnVar.a.c(j), zzafnVar.c, zzafnVar.d, zzafnVar.e, zzafnVar.f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(zzagi zzagiVar, zzahh zzahhVar) {
        while (true) {
            zzafp zzafpVar = this.c;
            zzafpVar.getClass();
            long j = zzafpVar.f;
            long j2 = zzafpVar.g;
            long j3 = zzafpVar.h;
            long j4 = j2 - j;
            long j5 = this.d;
            zzafs zzafsVar = this.b;
            if (j4 <= j5) {
                this.c = null;
                zzafsVar.zzb();
                return c(zzagiVar, j, zzahhVar);
            }
            long zzn = j3 - zzagiVar.zzn();
            if (zzn < 0 || zzn > 262144) {
                break;
            }
            zzagiVar.zzf((int) zzn);
            zzagiVar.zzl();
            zzafr d = zzafsVar.d(zzagiVar, zzafpVar.b);
            int i = d.a;
            long j6 = d.b;
            long j7 = d.c;
            if (i == -3) {
                this.c = null;
                zzafsVar.zzb();
                return c(zzagiVar, j3, zzahhVar);
            }
            if (i == -2) {
                zzafpVar.d = j6;
                zzafpVar.f = j7;
                zzafpVar.h = zzafp.a(zzafpVar.b, j6, zzafpVar.e, j7, zzafpVar.g, zzafpVar.c);
            } else {
                if (i != -1) {
                    long zzn2 = j7 - zzagiVar.zzn();
                    if (zzn2 >= 0 && zzn2 <= 262144) {
                        zzagiVar.zzf((int) zzn2);
                    }
                    this.c = null;
                    zzafsVar.zzb();
                    return c(zzagiVar, j7, zzahhVar);
                }
                zzafpVar.e = j6;
                zzafpVar.g = j7;
                zzafpVar.h = zzafp.a(zzafpVar.b, zzafpVar.d, j6, zzafpVar.f, j7, zzafpVar.c);
            }
        }
    }
}

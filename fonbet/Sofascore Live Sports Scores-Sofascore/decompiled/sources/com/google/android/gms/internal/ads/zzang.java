package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import defpackage.c0l;
import defpackage.c78;
import defpackage.lr4;
import defpackage.qgi;
import defpackage.rhn;
import defpackage.shn;
import defpackage.thn;
import defpackage.u8f;
import defpackage.uhn;
import defpackage.vnd;
import defpackage.wnd;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzang implements zzagh {
    public zzagk a;
    public qgi b;
    public boolean c;

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        qgi qgiVar = this.b;
        if (qgiVar != null) {
            vnd vndVar = (vnd) qgiVar.j;
            wnd wndVar = (wnd) vndVar.e;
            wndVar.a = 0;
            wndVar.b = 0L;
            wndVar.c = 0;
            wndVar.d = 0;
            wndVar.e = 0;
            ((zzeu) vndVar.f).y(0);
            vndVar.b = -1;
            vndVar.d = false;
            if (j == 0) {
                qgiVar.g(!qgiVar.h);
                return;
            }
            if (qgiVar.e != 0) {
                long j3 = (qgiVar.f * j2) / 1000000;
                qgiVar.b = j3;
                shn shnVar = (shn) qgiVar.m;
                String str = zzfm.a;
                shnVar.e(j3);
                qgiVar.e = 2;
            }
        }
    }

    public final boolean b(zzagi zzagiVar) {
        wnd wndVar = new wnd(2);
        if (wndVar.f(zzagiVar, true) && (wndVar.a & 2) == 2) {
            int min = Math.min(wndVar.e, 8);
            zzeu zzeuVar = new zzeu(min);
            zzagiVar.h(0, min, zzeuVar.a);
            zzeuVar.D(0);
            if (zzeuVar.B() >= 5 && zzeuVar.I() == 127 && zzeuVar.N() == 1179402563) {
                this.b = new rhn(2);
                return true;
            }
            zzeuVar.D(0);
            try {
                if (zzhh.c(1, zzeuVar, true)) {
                    this.b = new uhn(2);
                    return true;
                }
            } catch (zzat unused) {
            }
            zzeuVar.D(0);
            if (thn.k(zzeuVar, thn.p)) {
                this.b = new thn(2);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        try {
            return b(zzagiVar);
        } catch (zzat unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        this.a = zzagkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0184  */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        int i;
        byte[] bArr;
        this.a.getClass();
        if (this.b == null) {
            if (!b(zzagiVar)) {
                throw zzat.a(null, "Failed to determine bitstream type");
            }
            zzagiVar.zzl();
        }
        if (!this.c) {
            zzaht b = this.a.b(0, 1);
            this.a.zzv();
            qgi qgiVar = this.b;
            qgiVar.l = this.a;
            qgiVar.k = b;
            qgiVar.g(true);
            this.c = true;
        }
        qgi qgiVar2 = this.b;
        vnd vndVar = (vnd) qgiVar2.j;
        zzeu zzeuVar = (zzeu) vndVar.f;
        ((zzaht) qgiVar2.k).getClass();
        String str = zzfm.a;
        int i2 = qgiVar2.e;
        if (i2 != 0) {
            if (i2 == 1) {
                zzagiVar.zzf((int) qgiVar2.c);
                qgiVar2.e = 2;
                return 0;
            }
            if (i2 != 2) {
                return -1;
            }
            long c = ((shn) qgiVar2.m).c(zzagiVar);
            if (c >= 0) {
                zzahhVar.a = c;
                return 1;
            }
            if (c < -1) {
                qgiVar2.j(-(c + 2));
            }
            if (!qgiVar2.h) {
                zzahk zzc = ((shn) qgiVar2.m).zzc();
                zzc.getClass();
                ((zzagk) qgiVar2.l).c(zzc);
                zzaht zzahtVar = (zzaht) qgiVar2.k;
                zzc.zza();
                zzahtVar.getClass();
                qgiVar2.h = true;
            }
            if (qgiVar2.g <= 0 && !vndVar.d(zzagiVar)) {
                qgiVar2.e = 3;
                return -1;
            }
            qgiVar2.g = 0L;
            long h = qgiVar2.h(zzeuVar);
            if (h >= 0) {
                long j = qgiVar2.d;
                if (j + h >= qgiVar2.b) {
                    ((zzaht) qgiVar2.k).b(zzeuVar.c, zzeuVar);
                    ((zzaht) qgiVar2.k).f((j * 1000000) / qgiVar2.f, 1, zzeuVar.c, 0, null);
                    qgiVar2.b = -1L;
                }
            }
            qgiVar2.d += h;
            return 0;
        }
        while (vndVar.d(zzagiVar)) {
            long zzn = zzagiVar.zzn();
            long j2 = qgiVar2.c;
            qgiVar2.g = zzn - j2;
            if (qgiVar2.i(zzeuVar, j2, (c0l) qgiVar2.n)) {
                qgiVar2.c = zzagiVar.zzn();
            } else {
                zzv zzvVar = (zzv) ((c0l) qgiVar2.n).b;
                qgiVar2.f = zzvVar.J;
                if (!qgiVar2.i) {
                    ((zzaht) qgiVar2.k).e(zzvVar);
                    qgiVar2.i = true;
                }
                c78 c78Var = (c78) ((c0l) qgiVar2.n).c;
                if (c78Var != null) {
                    qgiVar2.m = c78Var;
                } else {
                    if (zzagiVar.zzo() != -1) {
                        wnd wndVar = (wnd) vndVar.e;
                        boolean z = (wndVar.a & 4) != 0;
                        long j3 = qgiVar2.c;
                        long zzo = zzagiVar.zzo();
                        int i3 = wndVar.d + wndVar.e;
                        long j4 = wndVar.b;
                        i = 2;
                        qgiVar2.m = new lr4(qgiVar2, j3, zzo, i3, j4, z, (char) 0);
                        qgiVar2.e = i;
                        bArr = zzeuVar.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        zzeuVar.z(zzeuVar.c, Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, zzeuVar.c)));
                        return 0;
                    }
                    qgiVar2.m = new u8f(7);
                }
                i = 2;
                qgiVar2.e = i;
                bArr = zzeuVar.a;
                if (bArr.length != 65025) {
                }
            }
        }
        qgiVar2.e = 3;
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}

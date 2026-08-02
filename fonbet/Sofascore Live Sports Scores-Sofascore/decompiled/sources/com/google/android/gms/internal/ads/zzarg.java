package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.agn;
import defpackage.c0l;
import defpackage.djn;
import defpackage.ejn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzarg implements zzagh {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public agn i;
    public zzagk j;
    public boolean k;
    public final zzfj a = new zzfj();
    public final zzeu c = new zzeu(4096);
    public final SparseArray b = new SparseArray();
    public final djn d = new djn(0);

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r0 != r7) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035 A[LOOP:0: B:18:0x002d->B:20:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, long j2) {
        long j3;
        agn agnVar;
        int i;
        SparseArray sparseArray;
        zzfj zzfjVar = this.a;
        synchronized (zzfjVar) {
            j3 = zzfjVar.b;
        }
        if (j3 != C.TIME_UNSET) {
            long a = zzfjVar.a();
            if (a != C.TIME_UNSET) {
                if (a != 0) {
                }
            }
            agnVar = this.i;
            if (agnVar != null) {
                agnVar.a(j2);
            }
            i = 0;
            while (true) {
                sparseArray = this.b;
                if (i < sparseArray.size()) {
                    return;
                }
                ejn ejnVar = (ejn) sparseArray.valueAt(i);
                ejnVar.f = false;
                ejnVar.a.zza();
                i++;
            }
        }
        zzfjVar.b(j2);
        agnVar = this.i;
        if (agnVar != null) {
        }
        i = 0;
        while (true) {
            sparseArray = this.b;
            if (i < sparseArray.size()) {
            }
            ejn ejnVar2 = (ejn) sparseArray.valueAt(i);
            ejnVar2.f = false;
            ejnVar2.a.zza();
            i++;
        }
    }

    public final void b() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            ((ejn) sparseArray.valueAt(i)).a.zzn();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        byte[] bArr = new byte[14];
        zzafy zzafyVar = (zzafy) zzagiVar;
        zzafyVar.f(bArr, 0, 14, false);
        if ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            zzafyVar.k(bArr[13] & 7, false);
            zzafyVar.f(bArr, 0, 3, false);
            if ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        this.j = zzagkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0229  */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        zzaqh zzaqjVar;
        long j4;
        zzagk zzagkVar = this.j;
        zzagkVar.getClass();
        long zzo = zzagiVar.zzo();
        long j5 = C.TIME_UNSET;
        djn djnVar = this.d;
        if (zzo != -1) {
            boolean z = djnVar.c;
            zzeu zzeuVar = djnVar.b;
            if (!z) {
                if (!djnVar.e) {
                    long zzo2 = zzagiVar.zzo();
                    int min = (int) Math.min(20000L, zzo2);
                    long j6 = zzo2 - min;
                    if (zzagiVar.zzn() != j6) {
                        zzahhVar.a = j6;
                        return 1;
                    }
                    zzeuVar.y(min);
                    zzagiVar.zzl();
                    zzagiVar.h(0, min, zzeuVar.a);
                    int i3 = zzeuVar.b;
                    int i4 = zzeuVar.c - 4;
                    while (true) {
                        if (i4 < i3) {
                            break;
                        }
                        if (djn.c(i4, zzeuVar.a) == 442) {
                            zzeuVar.D(i4 + 4);
                            long a = djn.a(zzeuVar);
                            if (a != C.TIME_UNSET) {
                                j5 = a;
                                break;
                            }
                        }
                        i4--;
                    }
                    djnVar.g = j5;
                    djnVar.e = true;
                    return 0;
                }
                if (djnVar.g == C.TIME_UNSET) {
                    byte[] bArr = zzfm.b;
                    int length = bArr.length;
                    zzeuVar.z(0, bArr);
                    djnVar.c = true;
                    zzagiVar.zzl();
                    return 0;
                }
                if (djnVar.d) {
                    long j7 = djnVar.f;
                    if (j7 == C.TIME_UNSET) {
                        byte[] bArr2 = zzfm.b;
                        int length2 = bArr2.length;
                        zzeuVar.z(0, bArr2);
                        djnVar.c = true;
                        zzagiVar.zzl();
                        return 0;
                    }
                    zzfj zzfjVar = djnVar.a;
                    djnVar.h = zzfjVar.d(djnVar.g) - zzfjVar.c(j7);
                    byte[] bArr3 = zzfm.b;
                    int length3 = bArr3.length;
                    zzeuVar.z(0, bArr3);
                    djnVar.c = true;
                    zzagiVar.zzl();
                    return 0;
                }
                int min2 = (int) Math.min(20000L, zzagiVar.zzo());
                if (zzagiVar.zzn() != 0) {
                    zzahhVar.a = 0L;
                    return 1;
                }
                zzeuVar.y(min2);
                zzagiVar.zzl();
                zzagiVar.h(0, min2, zzeuVar.a);
                int i5 = zzeuVar.b;
                int i6 = zzeuVar.c;
                while (true) {
                    if (i5 >= i6 - 3) {
                        j4 = -9223372036854775807L;
                        break;
                    }
                    if (djn.c(i5, zzeuVar.a) == 442) {
                        zzeuVar.D(i5 + 4);
                        long a2 = djn.a(zzeuVar);
                        if (a2 != C.TIME_UNSET) {
                            j4 = a2;
                            break;
                        }
                    }
                    i5++;
                }
                djnVar.f = j4;
                djnVar.d = true;
                return 0;
            }
        }
        if (this.k) {
            i = 442;
        } else {
            this.k = true;
            long j8 = djnVar.h;
            if (j8 != C.TIME_UNSET) {
                agn agnVar = new agn(new zzafo(), new c0l(djnVar.a), j8, j8 + 1, 0L, zzo, 188L, 1000);
                this.i = agnVar;
                this.j.c(agnVar.a);
                i = 442;
            } else {
                i = 442;
                zzagkVar.c(new zzahj(j8, 0L));
            }
        }
        agn agnVar2 = this.i;
        if (agnVar2 != null && agnVar2.c != null) {
            return agnVar2.b(zzagiVar, zzahhVar);
        }
        zzagiVar.zzl();
        long zzm = zzo != -1 ? zzo - zzagiVar.zzm() : -1L;
        if (zzm != -1 && zzm < 4) {
            b();
            return -1;
        }
        zzeu zzeuVar2 = this.c;
        if (!zzagiVar.f(zzeuVar2.a, 0, 4, true)) {
            b();
            return -1;
        }
        zzeuVar2.D(0);
        int b = zzeuVar2.b();
        if (b == 441) {
            b();
            return -1;
        }
        if (b == i) {
            zzagiVar.h(0, 10, zzeuVar2.a);
            zzeuVar2.D(9);
            zzagiVar.zzf((zzeuVar2.I() & 7) + 14);
            return 0;
        }
        if (b == 443) {
            zzagiVar.h(0, 2, zzeuVar2.a);
            zzeuVar2.D(0);
            zzagiVar.zzf(zzeuVar2.J() + 6);
            return 0;
        }
        if ((b >> 8) != 1) {
            zzagiVar.zzf(1);
            return 0;
        }
        int i7 = b & 255;
        SparseArray sparseArray = this.b;
        ejn ejnVar = (ejn) sparseArray.get(i7);
        if (!this.e) {
            if (ejnVar == null) {
                zzaqh zzaqhVar = null;
                if (i7 == 189) {
                    zzaqjVar = new zzapx(null, 0, "video/mp2p");
                    this.f = true;
                    this.h = zzagiVar.zzn();
                } else if ((b & 224) == 192) {
                    zzaqjVar = new zzaqt(null, 0, "video/mp2p");
                    this.f = true;
                    this.h = zzagiVar.zzn();
                } else {
                    if ((b & 240) == 224) {
                        zzaqjVar = new zzaqj(null, "video/mp2p");
                        this.g = true;
                        this.h = zzagiVar.zzn();
                    }
                    if (zzaqhVar != null) {
                        zzaqhVar.a(this.j, new zzarv(Integer.MIN_VALUE, i7, NotificationCompat.FLAG_LOCAL_ONLY));
                        ejnVar = new ejn(zzaqhVar, this.a);
                        sparseArray.put(i7, ejnVar);
                    }
                }
                zzaqhVar = zzaqjVar;
                if (zzaqhVar != null) {
                }
            }
            long j9 = 1048576;
            if (this.f && this.g) {
                j9 = 8192 + this.h;
            }
            if (zzagiVar.zzn() > j9) {
                this.e = true;
                this.j.zzv();
            }
        }
        zzagiVar.h(0, 2, zzeuVar2.a);
        zzeuVar2.D(0);
        int J = zzeuVar2.J() + 6;
        if (ejnVar == null) {
            zzagiVar.zzf(J);
            return 0;
        }
        zzeuVar2.y(J);
        zzagiVar.g(0, J, zzeuVar2.a);
        zzeuVar2.D(6);
        zzfj zzfjVar2 = ejnVar.b;
        zzet zzetVar = ejnVar.c;
        zzeuVar2.F(0, 3, zzetVar.a);
        zzetVar.d(0);
        zzetVar.f(8);
        ejnVar.d = zzetVar.g();
        ejnVar.e = zzetVar.g();
        zzetVar.f(6);
        zzeuVar2.F(0, zzetVar.h(8), zzetVar.a);
        zzetVar.d(0);
        if (ejnVar.d) {
            zzetVar.f(4);
            long h = zzetVar.h(3);
            zzetVar.f(1);
            int h2 = zzetVar.h(15) << 15;
            zzetVar.f(1);
            long h3 = zzetVar.h(15);
            zzetVar.f(1);
            if (ejnVar.f || !ejnVar.e) {
                j2 = h;
                i2 = 0;
                j3 = h3;
            } else {
                zzetVar.f(4);
                i2 = 0;
                j3 = h3;
                zzetVar.f(1);
                int h4 = zzetVar.h(15) << 15;
                zzetVar.f(1);
                j2 = h;
                long h5 = zzetVar.h(15);
                zzetVar.f(1);
                zzfjVar2.c(h4 | (zzetVar.h(3) << 30) | h5);
                ejnVar.f = true;
            }
            j = zzfjVar2.c((j2 << 30) | h2 | j3);
        } else {
            i2 = 0;
            j = 0;
        }
        zzaqh zzaqhVar2 = ejnVar.a;
        zzaqhVar2.b(4, j);
        zzaqhVar2.c(zzeuVar2);
        zzaqhVar2.zzf();
        zzeuVar2.C(zzeuVar2.a.length);
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}

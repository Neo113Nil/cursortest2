package defpackage;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.zzaaq;
import com.google.android.gms.internal.ads.zzabc;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzgwz;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzi;
import com.google.android.gms.internal.ads.zzng;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.internal.ads.zzwl;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Comparator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class o6n extends y5n {
    public final boolean e;
    public final zzaaq f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final boolean q;
    public final int r;
    public final int s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final boolean x;
    public final String y;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0115 A[EDGE_INSN: B:151:0x0115->B:82:0x0115 BREAK  A[LOOP:1: B:75:0x00fe->B:149:0x0112], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o6n(int i, zzbg zzbgVar, int i2, zzaaq zzaaqVar, int i3, String str, boolean z) {
        super(i, zzbgVar, i2);
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        String str2;
        int i7;
        int i8;
        int i9;
        boolean z4;
        boolean z5;
        int i10;
        boolean z6;
        zzv zzvVar;
        boolean z7;
        int i11;
        int i12;
        zzv zzvVar2;
        int i13;
        int i14;
        float f;
        int i15;
        zzv zzvVar3;
        int i16;
        int i17;
        int i18;
        this.f = zzaaqVar;
        boolean z8 = zzaaqVar.x;
        zzgxm zzgxmVar = zzaaqVar.i;
        zzgxm zzgxmVar2 = zzaaqVar.k;
        int i19 = 1;
        int i20 = true != z8 ? 16 : 24;
        if (z && (((i16 = (zzvVar3 = this.d).v) == -1 || i16 <= zzaaqVar.a) && ((i17 = zzvVar3.w) == -1 || i17 <= zzaaqVar.b))) {
            float f2 = zzvVar3.z;
            if ((f2 == -1.0f || f2 <= zzaaqVar.c) && ((i18 = zzvVar3.j) == -1 || i18 <= zzaaqVar.d)) {
                z2 = true;
                this.e = z2;
                if (z && (((i13 = (zzvVar2 = this.d).v) == -1 || i13 >= 0) && ((i14 = zzvVar2.w) == -1 || i14 >= 0))) {
                    f = zzvVar2.z;
                    if ((f != -1.0f || f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && ((i15 = zzvVar2.j) == -1 || i15 >= 0)) {
                        z3 = true;
                        this.g = z3;
                        this.h = zzng.d(i3, false);
                        zzv zzvVar4 = this.d;
                        float f3 = zzvVar4.z;
                        this.i = f3 == -1.0f && f3 >= 10.0f;
                        this.j = zzvVar4.j;
                        int i21 = zzvVar4.v;
                        this.k = (i21 != -1 || (i12 = zzvVar4.w) == -1) ? -1 : i21 * i12;
                        i4 = 0;
                        while (true) {
                            i5 = Integer.MAX_VALUE;
                            if (i4 < zzgxmVar2.size()) {
                                i6 = 0;
                                i4 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i6 = zzabc.k(this.d, (String) zzgxmVar2.get(i4), false);
                                if (i6 > 0) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                        this.m = i4;
                        this.n = i6;
                        int i22 = this.d.f;
                        gio gioVar = zzabc.k;
                        this.o = (i22 == 0 && i22 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                        int i23 = this.d.f;
                        this.q = (i23 == 0 && (i23 & 1) == 0) ? false : true;
                        this.r = zzabc.k(this.d, str, zzabc.j(str) != null);
                        zzv zzvVar5 = this.d;
                        str2 = zzvVar5.o;
                        i7 = i3 & 384;
                        i8 = NotificationCompat.FLAG_LOCAL_ONLY;
                        if (i7 == 256) {
                            String d = zzwl.d(zzvVar5);
                            str2 = d != null ? d : str2;
                            i7 = 256;
                        }
                        i9 = 0;
                        while (true) {
                            if (i9 < zzgxmVar.size()) {
                                if (str2 != null && str2.equals(zzgxmVar.get(i9))) {
                                    i5 = i9;
                                    break;
                                }
                                i9++;
                            } else {
                                break;
                            }
                        }
                        this.l = i5;
                        this.p = zzabc.l(this.d, zzaaqVar.j);
                        if (i7 != 128) {
                            i8 = i7;
                        } else if (i7 != 256) {
                            i8 = i7;
                            z4 = false;
                            this.t = z4;
                            z5 = i8 == 128;
                            this.u = z5;
                            this.v = (i3 & 64) == 64;
                            this.y = str2;
                            if (str2 != null) {
                                switch (str2.hashCode()) {
                                    case -1851077871:
                                        if (str2.equals("video/dolby-vision")) {
                                            i10 = 5;
                                            break;
                                        }
                                        break;
                                    case -1662735862:
                                        if (str2.equals(MimeTypes.VIDEO_AV1)) {
                                            i10 = 4;
                                            break;
                                        }
                                        break;
                                    case -1662541442:
                                        if (str2.equals("video/hevc")) {
                                            i10 = 3;
                                            break;
                                        }
                                        break;
                                    case 1331836730:
                                        if (str2.equals("video/avc")) {
                                            i10 = 1;
                                            break;
                                        }
                                        break;
                                    case 1599127257:
                                        if (str2.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9)) {
                                            i10 = 2;
                                            break;
                                        }
                                        break;
                                }
                                this.w = i10;
                                if (z5) {
                                    zzi zziVar = this.d.F;
                                    zzi zziVar2 = zzi.h;
                                    if (zziVar != null && ((i11 = zziVar.c) == 7 || i11 == 6)) {
                                        z6 = true;
                                        this.x = z6;
                                        zzvVar = this.d;
                                        if ((zzvVar.f & 16384) == 0) {
                                            zzaaq zzaaqVar2 = this.f;
                                            if (zzng.d(i3, zzaaqVar2.B) && ((z7 = this.e) || zzaaqVar2.w)) {
                                                if (zzng.d(i3, false) && this.g && z7 && zzvVar.j != -1 && (i20 & i3) != 0) {
                                                    i19 = 2;
                                                }
                                                this.s = i19;
                                            }
                                        }
                                        i19 = 0;
                                        this.s = i19;
                                    }
                                }
                                z6 = false;
                                this.x = z6;
                                zzvVar = this.d;
                                if ((zzvVar.f & 16384) == 0) {
                                }
                                i19 = 0;
                                this.s = i19;
                            }
                            i10 = 0;
                            this.w = i10;
                            if (z5) {
                            }
                            z6 = false;
                            this.x = z6;
                            zzvVar = this.d;
                            if ((zzvVar.f & 16384) == 0) {
                            }
                            i19 = 0;
                            this.s = i19;
                        }
                        z4 = true;
                        this.t = z4;
                        if (i8 == 128) {
                        }
                        this.u = z5;
                        this.v = (i3 & 64) == 64;
                        this.y = str2;
                        if (str2 != null) {
                        }
                        i10 = 0;
                        this.w = i10;
                        if (z5) {
                        }
                        z6 = false;
                        this.x = z6;
                        zzvVar = this.d;
                        if ((zzvVar.f & 16384) == 0) {
                        }
                        i19 = 0;
                        this.s = i19;
                    }
                }
                z3 = false;
                this.g = z3;
                this.h = zzng.d(i3, false);
                zzv zzvVar42 = this.d;
                float f32 = zzvVar42.z;
                this.i = f32 == -1.0f && f32 >= 10.0f;
                this.j = zzvVar42.j;
                int i212 = zzvVar42.v;
                this.k = (i212 != -1 || (i12 = zzvVar42.w) == -1) ? -1 : i212 * i12;
                i4 = 0;
                while (true) {
                    i5 = Integer.MAX_VALUE;
                    if (i4 < zzgxmVar2.size()) {
                    }
                    i4++;
                }
                this.m = i4;
                this.n = i6;
                int i222 = this.d.f;
                gio gioVar2 = zzabc.k;
                this.o = (i222 == 0 && i222 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                int i232 = this.d.f;
                this.q = (i232 == 0 && (i232 & 1) == 0) ? false : true;
                this.r = zzabc.k(this.d, str, zzabc.j(str) != null);
                zzv zzvVar52 = this.d;
                str2 = zzvVar52.o;
                i7 = i3 & 384;
                i8 = NotificationCompat.FLAG_LOCAL_ONLY;
                if (i7 == 256) {
                }
                i9 = 0;
                while (true) {
                    if (i9 < zzgxmVar.size()) {
                    }
                    i9++;
                }
                this.l = i5;
                this.p = zzabc.l(this.d, zzaaqVar.j);
                if (i7 != 128) {
                }
                z4 = true;
                this.t = z4;
                if (i8 == 128) {
                }
                this.u = z5;
                this.v = (i3 & 64) == 64;
                this.y = str2;
                if (str2 != null) {
                }
                i10 = 0;
                this.w = i10;
                if (z5) {
                }
                z6 = false;
                this.x = z6;
                zzvVar = this.d;
                if ((zzvVar.f & 16384) == 0) {
                }
                i19 = 0;
                this.s = i19;
            }
        }
        z2 = false;
        this.e = z2;
        if (z) {
            f = zzvVar2.z;
            if (f != -1.0f) {
            }
            z3 = true;
            this.g = z3;
            this.h = zzng.d(i3, false);
            zzv zzvVar422 = this.d;
            float f322 = zzvVar422.z;
            this.i = f322 == -1.0f && f322 >= 10.0f;
            this.j = zzvVar422.j;
            int i2122 = zzvVar422.v;
            this.k = (i2122 != -1 || (i12 = zzvVar422.w) == -1) ? -1 : i2122 * i12;
            i4 = 0;
            while (true) {
                i5 = Integer.MAX_VALUE;
                if (i4 < zzgxmVar2.size()) {
                }
                i4++;
            }
            this.m = i4;
            this.n = i6;
            int i2222 = this.d.f;
            gio gioVar22 = zzabc.k;
            this.o = (i2222 == 0 && i2222 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
            int i2322 = this.d.f;
            this.q = (i2322 == 0 && (i2322 & 1) == 0) ? false : true;
            this.r = zzabc.k(this.d, str, zzabc.j(str) != null);
            zzv zzvVar522 = this.d;
            str2 = zzvVar522.o;
            i7 = i3 & 384;
            i8 = NotificationCompat.FLAG_LOCAL_ONLY;
            if (i7 == 256) {
            }
            i9 = 0;
            while (true) {
                if (i9 < zzgxmVar.size()) {
                }
                i9++;
            }
            this.l = i5;
            this.p = zzabc.l(this.d, zzaaqVar.j);
            if (i7 != 128) {
            }
            z4 = true;
            this.t = z4;
            if (i8 == 128) {
            }
            this.u = z5;
            this.v = (i3 & 64) == 64;
            this.y = str2;
            if (str2 != null) {
            }
            i10 = 0;
            this.w = i10;
            if (z5) {
            }
            z6 = false;
            this.x = z6;
            zzvVar = this.d;
            if ((zzvVar.f & 16384) == 0) {
            }
            i19 = 0;
            this.s = i19;
        }
        z3 = false;
        this.g = z3;
        this.h = zzng.d(i3, false);
        zzv zzvVar4222 = this.d;
        float f3222 = zzvVar4222.z;
        this.i = f3222 == -1.0f && f3222 >= 10.0f;
        this.j = zzvVar4222.j;
        int i21222 = zzvVar4222.v;
        this.k = (i21222 != -1 || (i12 = zzvVar4222.w) == -1) ? -1 : i21222 * i12;
        i4 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i4 < zzgxmVar2.size()) {
            }
            i4++;
        }
        this.m = i4;
        this.n = i6;
        int i22222 = this.d.f;
        gio gioVar222 = zzabc.k;
        this.o = (i22222 == 0 && i22222 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
        int i23222 = this.d.f;
        this.q = (i23222 == 0 && (i23222 & 1) == 0) ? false : true;
        this.r = zzabc.k(this.d, str, zzabc.j(str) != null);
        zzv zzvVar5222 = this.d;
        str2 = zzvVar5222.o;
        i7 = i3 & 384;
        i8 = NotificationCompat.FLAG_LOCAL_ONLY;
        if (i7 == 256) {
        }
        i9 = 0;
        while (true) {
            if (i9 < zzgxmVar.size()) {
            }
            i9++;
        }
        this.l = i5;
        this.p = zzabc.l(this.d, zzaaqVar.j);
        if (i7 != 128) {
        }
        z4 = true;
        this.t = z4;
        if (i8 == 128) {
        }
        this.u = z5;
        this.v = (i3 & 64) == 64;
        this.y = str2;
        if (str2 != null) {
        }
        i10 = 0;
        this.w = i10;
        if (z5) {
        }
        z6 = false;
        this.x = z6;
        zzvVar = this.d;
        if ((zzvVar.f & 16384) == 0) {
        }
        i19 = 0;
        this.s = i19;
    }

    public static int b(o6n o6nVar, o6n o6nVar2) {
        zzgwz d = zzgwz.a.d(o6nVar.h, o6nVar2.h);
        Integer valueOf = Integer.valueOf(o6nVar.m);
        Integer valueOf2 = Integer.valueOf(o6nVar2.m);
        ijo.a.getClass();
        ojo ojoVar = ojo.a;
        return d.a(valueOf, valueOf2, ojoVar).b(o6nVar.n, o6nVar2.n).b(o6nVar.o, o6nVar2.o).a(Integer.valueOf(o6nVar.p), Integer.valueOf(o6nVar2.p), ojoVar).d(o6nVar.q, o6nVar2.q).b(o6nVar.r, o6nVar2.r).d(o6nVar.i, o6nVar2.i).d(o6nVar.e, o6nVar2.e).d(o6nVar.g, o6nVar2.g).a(Integer.valueOf(o6nVar.l), Integer.valueOf(o6nVar2.l), ojoVar).d(o6nVar.t, o6nVar2.t).d(o6nVar.v, o6nVar2.v).e();
    }

    public static int c(o6n o6nVar, o6n o6nVar2) {
        Comparator pjoVar;
        if (o6nVar.e && o6nVar.h) {
            pjoVar = zzabc.k;
        } else {
            gio gioVar = zzabc.k;
            gioVar.getClass();
            pjoVar = new pjo(gioVar);
        }
        o6nVar.f.getClass();
        zzgwz a = zzgwz.a.d(o6nVar.x, o6nVar2.x).a(Integer.valueOf(o6nVar.k), Integer.valueOf(o6nVar2.k), pjoVar);
        if (o6nVar.t && o6nVar.v) {
            a = a.b(o6nVar.w, o6nVar2.w);
        }
        return a.d(o6nVar.u, o6nVar2.u).a(Integer.valueOf(o6nVar.j), Integer.valueOf(o6nVar2.j), pjoVar).e();
    }

    @Override // defpackage.y5n
    public final /* bridge */ /* synthetic */ boolean a(y5n y5nVar) {
        o6n o6nVar = (o6n) y5nVar;
        if (!Objects.equals(this.y, o6nVar.y)) {
            return false;
        }
        this.f.getClass();
        return this.t == o6nVar.t && this.v == o6nVar.v;
    }

    @Override // defpackage.y5n
    public final int zza() {
        return this.s;
    }
}

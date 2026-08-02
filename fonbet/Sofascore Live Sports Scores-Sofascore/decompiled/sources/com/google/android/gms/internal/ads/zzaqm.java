package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import defpackage.e59;
import defpackage.f59;
import defpackage.l2a;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaqm implements zzaqh {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final l2a a;
    public final zzeu b;
    public final boolean[] c = new boolean[4];
    public final e59 d;
    public final zzaqy e;
    public f59 f;
    public long g;
    public String h;
    public zzaht i;
    public boolean j;
    public long k;

    public zzaqm(l2a l2aVar) {
        this.a = l2aVar;
        e59 e59Var = new e59(2);
        e59Var.f = new byte[128];
        this.d = e59Var;
        this.k = C.TIME_UNSET;
        this.e = new zzaqy(178);
        this.b = new zzeu();
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void a(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.a();
        zzarvVar.b();
        this.h = zzarvVar.e;
        zzarvVar.b();
        zzaht b = zzagkVar.b(zzarvVar.d, 2);
        this.i = b;
        this.f = new f59(b, 2);
        this.a.J(zzagkVar, zzarvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void b(int i, long j) {
        this.k = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013a  */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(zzeu zzeuVar) {
        zzaqy zzaqyVar;
        e59 e59Var;
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        float f;
        this.f.getClass();
        this.i.getClass();
        int i5 = zzeuVar.b;
        int i6 = zzeuVar.c;
        byte[] bArr = zzeuVar.a;
        this.g += zzeuVar.B();
        this.i.b(zzeuVar.B(), zzeuVar);
        while (true) {
            int g = zzgr.g(bArr, i5, i6, this.c);
            zzaqyVar = this.e;
            e59Var = this.d;
            if (g == i6) {
                break;
            }
            int i7 = g + 3;
            byte b = zzeuVar.a[i7];
            int i8 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i9 = g - i5;
            if (this.j) {
                i = i6;
            } else {
                if (i9 > 0) {
                    e59Var.b(i5, g, bArr);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                int i11 = e59Var.c;
                if (i11 == 0) {
                    i = i6;
                    i4 = 0;
                    if (i8 == 176) {
                        e59Var.c = 1;
                        e59Var.b = true;
                    }
                } else if (i11 == 1) {
                    i = i6;
                    i4 = 0;
                    if (i8 != 181) {
                        zzeh.c("Unexpected start code value");
                        e59Var.b = false;
                        e59Var.d = 0;
                        e59Var.c = 0;
                    } else {
                        e59Var.c = 2;
                    }
                } else if (i11 == 2) {
                    i = i6;
                    i4 = 0;
                    if (i8 > 31) {
                        zzeh.c("Unexpected start code value");
                        e59Var.b = false;
                        e59Var.d = 0;
                        e59Var.c = 0;
                    } else {
                        e59Var.c = 3;
                    }
                } else if (i11 == 3) {
                    i = i6;
                    if ((b & 240) != 32) {
                        zzeh.c("Unexpected start code value");
                        i4 = 0;
                        e59Var.b = false;
                        e59Var.d = 0;
                        e59Var.c = 0;
                    } else {
                        i4 = 0;
                        e59Var.e = e59Var.d;
                        e59Var.c = 4;
                    }
                } else if (i8 == 179 || i8 == 181) {
                    e59Var.d -= i10;
                    e59Var.b = false;
                    zzaht zzahtVar = this.i;
                    int i12 = e59Var.e;
                    String str = this.h;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(e59Var.f, e59Var.d);
                    zzet zzetVar = new zzet(copyOf, copyOf.length);
                    zzetVar.l(i12);
                    zzetVar.l(4);
                    zzetVar.e();
                    zzetVar.f(8);
                    if (zzetVar.g()) {
                        zzetVar.f(4);
                        zzetVar.f(3);
                    }
                    int h = zzetVar.h(4);
                    if (h == 15) {
                        int h2 = zzetVar.h(8);
                        int h3 = zzetVar.h(8);
                        if (h3 == 0) {
                            zzeh.c("Invalid aspect ratio");
                            f = 1.0f;
                            if (zzetVar.g()) {
                                zzetVar.f(2);
                                zzetVar.f(1);
                                if (zzetVar.g()) {
                                    zzetVar.f(15);
                                    zzetVar.e();
                                    zzetVar.f(15);
                                    zzetVar.e();
                                    zzetVar.f(15);
                                    zzetVar.e();
                                    zzetVar.f(3);
                                    zzetVar.f(11);
                                    zzetVar.e();
                                    zzetVar.f(15);
                                    zzetVar.e();
                                }
                            }
                            if (zzetVar.h(2) != 0) {
                                zzeh.c("Unhandled video object layer shape");
                            }
                            zzetVar.e();
                            int h4 = zzetVar.h(16);
                            zzetVar.e();
                            if (zzetVar.g()) {
                                if (h4 == 0) {
                                    zzeh.c("Invalid vop_increment_time_resolution");
                                } else {
                                    int i13 = h4 - 1;
                                    i = i6;
                                    int i14 = 0;
                                    while (i13 > 0) {
                                        i13 >>= 1;
                                        i14++;
                                    }
                                    zzetVar.f(i14);
                                    zzetVar.e();
                                    int h5 = zzetVar.h(13);
                                    zzetVar.e();
                                    int h6 = zzetVar.h(13);
                                    zzetVar.e();
                                    zzetVar.e();
                                    zzt zztVar = new zzt();
                                    zztVar.a = str;
                                    zztVar.c("video/mp2t");
                                    zztVar.d(MimeTypes.VIDEO_MP4V);
                                    zztVar.u = h5;
                                    zztVar.v = h6;
                                    zztVar.B = f;
                                    zztVar.q = Collections.singletonList(copyOf);
                                    zzahtVar.e(new zzv(zztVar));
                                    this.j = true;
                                }
                            }
                            i = i6;
                            zzetVar.e();
                            int h52 = zzetVar.h(13);
                            zzetVar.e();
                            int h62 = zzetVar.h(13);
                            zzetVar.e();
                            zzetVar.e();
                            zzt zztVar2 = new zzt();
                            zztVar2.a = str;
                            zztVar2.c("video/mp2t");
                            zztVar2.d(MimeTypes.VIDEO_MP4V);
                            zztVar2.u = h52;
                            zztVar2.v = h62;
                            zztVar2.B = f;
                            zztVar2.q = Collections.singletonList(copyOf);
                            zzahtVar.e(new zzv(zztVar2));
                            this.j = true;
                        } else {
                            f = h2 / h3;
                            if (zzetVar.g()) {
                            }
                            if (zzetVar.h(2) != 0) {
                            }
                            zzetVar.e();
                            int h42 = zzetVar.h(16);
                            zzetVar.e();
                            if (zzetVar.g()) {
                            }
                            i = i6;
                            zzetVar.e();
                            int h522 = zzetVar.h(13);
                            zzetVar.e();
                            int h622 = zzetVar.h(13);
                            zzetVar.e();
                            zzetVar.e();
                            zzt zztVar22 = new zzt();
                            zztVar22.a = str;
                            zztVar22.c("video/mp2t");
                            zztVar22.d(MimeTypes.VIDEO_MP4V);
                            zztVar22.u = h522;
                            zztVar22.v = h622;
                            zztVar22.B = f;
                            zztVar22.q = Collections.singletonList(copyOf);
                            zzahtVar.e(new zzv(zztVar22));
                            this.j = true;
                        }
                    } else if (h < 7) {
                        f = l[h];
                        if (zzetVar.g()) {
                        }
                        if (zzetVar.h(2) != 0) {
                        }
                        zzetVar.e();
                        int h422 = zzetVar.h(16);
                        zzetVar.e();
                        if (zzetVar.g()) {
                        }
                        i = i6;
                        zzetVar.e();
                        int h5222 = zzetVar.h(13);
                        zzetVar.e();
                        int h6222 = zzetVar.h(13);
                        zzetVar.e();
                        zzetVar.e();
                        zzt zztVar222 = new zzt();
                        zztVar222.a = str;
                        zztVar222.c("video/mp2t");
                        zztVar222.d(MimeTypes.VIDEO_MP4V);
                        zztVar222.u = h5222;
                        zztVar222.v = h6222;
                        zztVar222.B = f;
                        zztVar222.q = Collections.singletonList(copyOf);
                        zzahtVar.e(new zzv(zztVar222));
                        this.j = true;
                    } else {
                        zzeh.c("Invalid aspect ratio");
                        f = 1.0f;
                        if (zzetVar.g()) {
                        }
                        if (zzetVar.h(2) != 0) {
                        }
                        zzetVar.e();
                        int h4222 = zzetVar.h(16);
                        zzetVar.e();
                        if (zzetVar.g()) {
                        }
                        i = i6;
                        zzetVar.e();
                        int h52222 = zzetVar.h(13);
                        zzetVar.e();
                        int h62222 = zzetVar.h(13);
                        zzetVar.e();
                        zzetVar.e();
                        zzt zztVar2222 = new zzt();
                        zztVar2222.a = str;
                        zztVar2222.c("video/mp2t");
                        zztVar2222.d(MimeTypes.VIDEO_MP4V);
                        zztVar2222.u = h52222;
                        zztVar2222.v = h62222;
                        zztVar2222.B = f;
                        zztVar2222.q = Collections.singletonList(copyOf);
                        zzahtVar.e(new zzv(zztVar2222));
                        this.j = true;
                    }
                } else {
                    i = i6;
                    i4 = 0;
                }
                e59Var.b(i4, 3, e59.i);
            }
            this.f.c(i5, g, bArr);
            if (i9 > 0) {
                zzaqyVar.c(i5, g, bArr);
                i2 = 0;
            } else {
                i2 = -i9;
            }
            if (zzaqyVar.d(i2)) {
                int a = zzgr.a(zzaqyVar.e, zzaqyVar.d);
                String str2 = zzfm.a;
                byte[] bArr2 = zzaqyVar.d;
                zzeu zzeuVar2 = this.b;
                zzeuVar2.z(a, bArr2);
                this.a.K(this.k, zzeuVar2);
            }
            if (i8 == 178) {
                z = true;
                if (zzeuVar.a[g + 2] == 1) {
                    zzaqyVar.b(178);
                }
                i8 = 178;
            } else {
                z = true;
            }
            int i15 = i - g;
            this.f.d(this.g - i15, i15, this.j);
            f59 f59Var = this.f;
            long j = this.k;
            f59Var.e = i8;
            f59Var.d = false;
            if (i8 == 182) {
                i3 = i8;
                z2 = z;
            } else if (i8 == 179) {
                z2 = z;
                i3 = 179;
            } else {
                i3 = i8;
                z2 = false;
            }
            f59Var.b = z2;
            f59Var.c = i3 == 182 ? z : false;
            f59Var.f = 0;
            f59Var.h = j;
            i5 = i7;
            i6 = i;
        }
        if (!this.j) {
            e59Var.b(i5, i6, bArr);
        }
        this.f.c(i5, i6, bArr);
        zzaqyVar.c(i5, i6, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        zzgr.h(this.c);
        e59 e59Var = this.d;
        e59Var.b = false;
        e59Var.d = 0;
        e59Var.c = 0;
        f59 f59Var = this.f;
        if (f59Var != null) {
            f59Var.b = false;
            f59Var.c = false;
            f59Var.d = false;
            f59Var.e = -1;
        }
        this.e.a();
        this.g = 0L;
        this.k = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzn() {
        f59 f59Var = this.f;
        f59Var.getClass();
        f59Var.d(this.g, 0, this.j);
        f59 f59Var2 = this.f;
        f59Var2.b = false;
        f59Var2.c = false;
        f59Var2.d = false;
        f59Var2.e = -1;
    }
}

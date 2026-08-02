package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.bm2;
import defpackage.kwk;
import defpackage.mio;
import defpackage.x5n;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzapg implements zzanz {
    public static final zzanr e;
    public final zzeu a = new zzeu();
    public final zzeu b = new zzeu();
    public final kwk c;
    public Inflater d;

    static {
        mio mioVar = zzgxm.b;
        e = new zzanr(s.e, C.TIME_UNSET, C.TIME_UNSET);
    }

    public zzapg(List list) {
        int i;
        kwk kwkVar = new kwk(1);
        this.c = kwkVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = zzfm.a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1);
                kwkVar.f = new int[split.length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int[] iArr = kwkVar.f;
                    try {
                        i = Integer.parseInt(split[i2].trim(), 16);
                    } catch (RuntimeException e2) {
                        zzeh.d("Parsing color failed", e2);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length != 2) {
                    StringBuilder sb = new StringBuilder(str2.length() + 36);
                    sb.append("Ignoring malformed IDX size line: '");
                    sb.append(str2);
                    sb.append("'");
                    zzeh.c(sb.toString());
                } else {
                    try {
                        kwkVar.g = Integer.parseInt(split2[0]);
                        kwkVar.h = Integer.parseInt(split2[1]);
                        kwkVar.d = true;
                    } catch (RuntimeException e3) {
                        zzeh.d("Parsing IDX failed", e3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:78:0x00b8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0299  */
    @Override // com.google.android.gms.internal.ads.zzanz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, int i2, bm2 bm2Var, byte[] bArr) {
        zzanr zzanrVar;
        int i3;
        long j;
        int i4;
        long j2;
        zzcy zzcyVar;
        long j3;
        s sVar;
        long j4;
        Rect rect;
        zzeu zzeuVar = this.a;
        zzeuVar.z(i + i2, bArr);
        zzeuVar.D(i);
        Inflater inflater = this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        zzeu zzeuVar2 = this.b;
        if (zzfm.i(zzeuVar, zzeuVar2, inflater)) {
            zzeuVar.z(zzeuVar2.c, zzeuVar2.a);
        }
        kwk kwkVar = this.c;
        long j5 = C.TIME_UNSET;
        kwkVar.b = C.TIME_UNSET;
        kwkVar.c = C.TIME_UNSET;
        int i5 = 0;
        kwkVar.e = false;
        kwkVar.i = null;
        kwkVar.j = -1;
        kwkVar.k = -1;
        int B = zzeuVar.B();
        if (B < 2 || zzeuVar.J() != B) {
            zzanrVar = e;
        } else {
            int[] iArr = kwkVar.a;
            if (kwkVar.f == null) {
                zzeh.c("Skipping SPU (no palette)");
            } else if (kwkVar.d) {
                int i6 = zzeuVar.b - 2;
                zzeuVar.D(zzeuVar.J() + i6);
                while (true) {
                    int i7 = 4;
                    if (zzeuVar.B() < 4) {
                        j = j5;
                        i4 = i5;
                        i3 = i4;
                    } else {
                        int i8 = zzeuVar.b;
                        int J = zzeuVar.J() * 10000;
                        int J2 = zzeuVar.J() + i6;
                        i3 = (J2 == i8 || J2 >= zzeuVar.c) ? i5 : 1;
                        int i9 = i3 != 0 ? J2 : zzeuVar.c;
                        j = j5;
                        int i10 = 1;
                        while (zzeuVar.b < i9 && i10 != 0) {
                            long j6 = J;
                            int I = zzeuVar.I();
                            int i11 = i5;
                            if (I != 255) {
                                switch (I) {
                                    case 0:
                                        i5 = i11;
                                        i10 = 1;
                                        break;
                                    case 1:
                                        kwkVar.b = j6;
                                        i5 = i11;
                                        i10 = 1;
                                        i7 = 4;
                                        break;
                                    case 2:
                                        kwkVar.c = j6;
                                        i5 = i11;
                                        i10 = 1;
                                        i7 = 4;
                                        break;
                                    case 3:
                                        if (zzeuVar.B() < 2) {
                                            zzeh.c("Incomplete color command");
                                            i5 = i11;
                                            i10 = i5;
                                            i7 = 4;
                                            break;
                                        } else {
                                            int I2 = zzeuVar.I();
                                            int I3 = zzeuVar.I();
                                            int[] iArr2 = kwkVar.f;
                                            int i12 = I2 >> 4;
                                            if (i12 >= iArr2.length) {
                                                i12 = i11;
                                            }
                                            iArr[3] = iArr2[i12];
                                            int i13 = I2 & 15;
                                            if (i13 >= iArr2.length) {
                                                i13 = i11;
                                            }
                                            iArr[2] = iArr2[i13];
                                            int i14 = I3 >> 4;
                                            if (i14 >= iArr2.length) {
                                                i14 = i11;
                                            }
                                            iArr[1] = iArr2[i14];
                                            int i15 = I3 & 15;
                                            if (i15 >= iArr2.length) {
                                                i15 = i11;
                                            }
                                            iArr[i11] = iArr2[i15];
                                            kwkVar.e = true;
                                            i5 = i11;
                                            i10 = 1;
                                            i7 = 4;
                                        }
                                    case 4:
                                        if (zzeuVar.B() >= 2) {
                                            if (kwkVar.e) {
                                                int I4 = zzeuVar.I();
                                                int I5 = zzeuVar.I();
                                                iArr[3] = kwk.d(iArr[3], I4 >> 4);
                                                iArr[2] = kwk.d(iArr[2], I4 & 15);
                                                iArr[1] = kwk.d(iArr[1], I5 >> 4);
                                                iArr[i11] = kwk.d(iArr[i11], I5 & 15);
                                                i5 = i11;
                                                i10 = 1;
                                                i7 = 4;
                                                break;
                                            } else {
                                                zzeh.c("Ignoring alpha command before color command");
                                            }
                                        } else {
                                            zzeh.c("Incomplete alpha command");
                                        }
                                        i5 = i11;
                                        i10 = i5;
                                        i7 = 4;
                                    case 5:
                                        if (zzeuVar.B() >= 6) {
                                            int I6 = zzeuVar.I();
                                            int I7 = zzeuVar.I();
                                            int i16 = I7 >> 4;
                                            int I8 = ((I7 & 15) << 8) | zzeuVar.I();
                                            int I9 = zzeuVar.I();
                                            int I10 = zzeuVar.I();
                                            kwkVar.i = new Rect((I6 << i7) | i16, (I9 << i7) | (I10 >> 4), I8 + 1, (((I10 & 15) << 8) | zzeuVar.I()) + 1);
                                            i5 = i11;
                                            i10 = 1;
                                            i7 = 4;
                                            break;
                                        } else {
                                            zzeh.c("Incomplete area command");
                                            break;
                                        }
                                    case 6:
                                        if (zzeuVar.B() >= i7) {
                                            kwkVar.j = zzeuVar.J();
                                            kwkVar.k = zzeuVar.J();
                                            i5 = i11;
                                            i10 = 1;
                                            break;
                                        } else {
                                            zzeh.c("Incomplete offsets command");
                                            break;
                                        }
                                    default:
                                        x5n.p(I, "Unrecognized command: ", new StringBuilder(String.valueOf(I).length() + 22));
                                        break;
                                }
                            }
                            i5 = i11;
                            i10 = i5;
                        }
                        i4 = i5;
                        if (i3 != 0) {
                            zzeuVar.D(J2);
                        }
                    }
                    if (i3 == 0) {
                        j2 = kwkVar.c;
                        if (kwkVar.f != null || !kwkVar.d || !kwkVar.e || (rect = kwkVar.i) == null || kwkVar.j == -1 || kwkVar.k == -1 || rect.width() < 2 || kwkVar.i.height() < 2) {
                            zzcyVar = null;
                        } else {
                            Rect rect2 = kwkVar.i;
                            int[] iArr3 = new int[rect2.height() * rect2.width()];
                            zzet zzetVar = new zzet();
                            zzeuVar.D(kwkVar.j);
                            zzetVar.a(zzeuVar);
                            kwkVar.e(zzetVar, true, rect2, iArr3);
                            zzeuVar.D(kwkVar.k);
                            zzetVar.a(zzeuVar);
                            kwkVar.e(zzetVar, i4, rect2, iArr3);
                            Bitmap createBitmap = Bitmap.createBitmap(iArr3, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
                            zzcx zzcxVar = new zzcx();
                            zzcxVar.b = createBitmap;
                            zzcxVar.a = null;
                            zzcxVar.h = rect2.left / kwkVar.g;
                            zzcxVar.i = 0;
                            zzcxVar.e = rect2.top / kwkVar.h;
                            zzcxVar.f = 0;
                            zzcxVar.g = 0;
                            zzcxVar.l = rect2.width() / kwkVar.g;
                            zzcxVar.m = rect2.height() / kwkVar.h;
                            zzcyVar = zzcxVar.b();
                        }
                        if (j2 == j) {
                            long j7 = kwkVar.b;
                            if (j7 != j) {
                                long j8 = kwkVar.c;
                                if (j8 > j7) {
                                    j4 = j8 - j7;
                                    j3 = j4;
                                }
                            }
                            j4 = kwkVar.c;
                            j3 = j4;
                        } else {
                            j3 = j;
                        }
                        if (zzcyVar == null) {
                            sVar = zzgxm.t(zzcyVar);
                        } else {
                            mio mioVar = zzgxm.b;
                            sVar = s.e;
                        }
                        zzanrVar = new zzanr(sVar, kwkVar.b, j3);
                    } else {
                        j5 = j;
                        i5 = i4;
                    }
                }
            } else {
                zzeh.c("Skipping SPU (no plane)");
            }
            j = -9223372036854775807L;
            i4 = 0;
            j2 = kwkVar.c;
            if (kwkVar.f != null) {
            }
            zzcyVar = null;
            if (j2 == j) {
            }
            if (zzcyVar == null) {
            }
            zzanrVar = new zzanr(sVar, kwkVar.b, j3);
        }
        bm2Var.mo13zza(zzanrVar);
    }
}

package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.ain;
import defpackage.bin;
import defpackage.bm2;
import defpackage.he5;
import defpackage.ke5;
import defpackage.mio;
import defpackage.re5;
import defpackage.xhn;
import defpackage.yhn;
import defpackage.zhn;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaol implements zzanz {
    public static final byte[] h = {0, 7, 8, 15};
    public static final byte[] i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final he5 d;
    public final xhn e;
    public final re5 f;
    public Bitmap g;

    public zzaol(List list) {
        zzeu zzeuVar = new zzeu((byte[]) list.get(0));
        int J = zzeuVar.J();
        int J2 = zzeuVar.J();
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        int i2 = 719;
        this.d = new he5(i2, 575, 0, i2, 0, 575);
        this.e = new xhn(0, new int[]{0, -1, -16777216, -8421505}, d(), e());
        this.f = new re5(J, J2, 2);
    }

    public static xhn b(zzet zzetVar, int i2) {
        int h2;
        int h3;
        int i3;
        int i4;
        int i5 = 8;
        int h4 = zzetVar.h(8);
        zzetVar.f(8);
        int i6 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] d = d();
        int[] e = e();
        int i7 = i2 - 2;
        while (i7 > 0) {
            int h5 = zzetVar.h(i5);
            int h6 = zzetVar.h(i5);
            int[] iArr2 = (h6 & 128) != 0 ? iArr : (h6 & 64) != 0 ? d : e;
            if ((h6 & 1) != 0) {
                i3 = zzetVar.h(i5);
                i4 = zzetVar.h(i5);
                h2 = zzetVar.h(i5);
                h3 = zzetVar.h(i5);
                i7 -= 6;
            } else {
                int h7 = zzetVar.h(6) << 2;
                int h8 = zzetVar.h(4) << 4;
                i7 -= 4;
                h2 = zzetVar.h(4) << 4;
                h3 = zzetVar.h(2) << 6;
                i3 = h7;
                i4 = h8;
            }
            if (i3 == 0) {
                h3 = 255;
            }
            if (i3 == 0) {
                h2 = i6;
            }
            if (i3 == 0) {
                i4 = i6;
            }
            double d2 = i3;
            String str = zzfm.a;
            double d3 = i4 - 128;
            double d4 = h2 - 128;
            iArr2[h5] = f((byte) (255 - (h3 & 255)), Math.max(0, Math.min((int) ((1.402d * d3) + d2), 255)), Math.max(0, Math.min((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d4 * 1.772d) + d2), 255)));
            i6 = 0;
            h4 = h4;
            e = e;
            i5 = 8;
        }
        return new xhn(h4, iArr, d, e);
    }

    public static yhn c(zzet zzetVar) {
        byte[] bArr;
        int h2 = zzetVar.h(16);
        zzetVar.f(4);
        int h3 = zzetVar.h(2);
        boolean g = zzetVar.g();
        zzetVar.f(1);
        byte[] bArr2 = zzfm.b;
        if (h3 == 1) {
            zzetVar.f(zzetVar.h(8) * 16);
        } else if (h3 == 0) {
            int h4 = zzetVar.h(16);
            int h5 = zzetVar.h(16);
            if (h4 > 0) {
                bArr2 = new byte[h4];
                zzguk.f(zzetVar.c == 0);
                System.arraycopy(zzetVar.a, zzetVar.b, bArr2, 0, h4);
                zzetVar.b += h4;
                zzetVar.m();
            }
            if (h5 > 0) {
                bArr = new byte[h5];
                zzguk.f(zzetVar.c == 0);
                System.arraycopy(zzetVar.a, zzetVar.b, bArr, 0, h5);
                zzetVar.b += h5;
                zzetVar.m();
                return new yhn(h2, g, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new yhn(h2, g, bArr2, bArr);
    }

    public static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            int i3 = i2 & 4;
            int i4 = i2 & 2;
            int i5 = i2 & 1;
            if (i2 < 8) {
                iArr[i2] = f(255, 1 != i5 ? 0 : 255, i4 != 0 ? 255 : 0, i3 != 0 ? 255 : 0);
            } else {
                int i6 = Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                int i7 = 1 != i5 ? 0 : 127;
                int i8 = i4 != 0 ? 127 : 0;
                if (i3 == 0) {
                    i6 = 0;
                }
                iArr[i2] = f(255, i7, i8, i6);
            }
        }
        return iArr;
    }

    public static int[] e() {
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = f(63, 1 != (i2 & 1) ? 0 : 255, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                if (i3 == 0) {
                    iArr[i2] = f(255, (1 != (i2 & 1) ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = f(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, (1 != (i2 & 1) ? 0 : 85) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = f(255, (1 != (i2 & 1) ? 0 : 43) + Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = f(255, (1 != (i2 & 1) ? 0 : 43) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int f(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0201 A[LOOP:3: B:85:0x0163->B:98:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i5;
        int h2;
        char c;
        int i6;
        int i7;
        int i8;
        int h3;
        int i9;
        int i10;
        boolean z;
        int h4;
        int h5;
        int i11;
        int i12;
        int i13;
        int h6;
        int i14;
        Paint paint2 = paint;
        zzet zzetVar = new zzet(bArr, bArr.length);
        int i15 = i3;
        int i16 = i4;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (zzetVar.b() != 0) {
            int h7 = zzetVar.h(8);
            if (h7 != 240) {
                int i17 = 4;
                int i18 = 1;
                int i19 = 2;
                switch (h7) {
                    case 16:
                        int i20 = 1;
                        if (i2 != 3) {
                            if (i2 != 2) {
                                bArr2 = null;
                            } else if (bArr6 == null) {
                                bArr3 = h;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr6;
                            }
                            i5 = 0;
                            while (true) {
                                h2 = zzetVar.h(2);
                                if (h2 != 0) {
                                }
                                i6 = i5;
                                c = 4;
                                if (i8 != 0) {
                                }
                                i9 = i15;
                                i15 = i9 + i8;
                                if (i6 != 0) {
                                }
                                paint2 = paint;
                                i5 = i6;
                                i20 = 1;
                            }
                        } else if (bArr4 == null) {
                            bArr3 = i;
                            bArr2 = bArr3;
                            i5 = 0;
                            while (true) {
                                h2 = zzetVar.h(2);
                                if (h2 != 0) {
                                    i8 = i20;
                                    i7 = h2;
                                } else {
                                    if (zzetVar.g()) {
                                        h3 = zzetVar.h(3) + 3;
                                        i7 = zzetVar.h(2);
                                    } else {
                                        if (zzetVar.g()) {
                                            i8 = i20;
                                            i6 = i5;
                                            i7 = 0;
                                        } else {
                                            int h8 = zzetVar.h(2);
                                            if (h8 == 0) {
                                                c = 4;
                                                i6 = i20;
                                                i7 = 0;
                                                i8 = 0;
                                            } else if (h8 == i20) {
                                                c = 4;
                                                i6 = i5;
                                                i8 = 2;
                                                i7 = 0;
                                            } else if (h8 == 2) {
                                                c = 4;
                                                i6 = i5;
                                                i8 = zzetVar.h(4) + 12;
                                                i7 = zzetVar.h(2);
                                            } else if (h8 != 3) {
                                                i6 = i5;
                                                i7 = 0;
                                                i8 = 0;
                                            } else {
                                                h3 = zzetVar.h(8) + 29;
                                                i7 = zzetVar.h(2);
                                            }
                                            if (i8 != 0 || paint2 == null) {
                                                i9 = i15;
                                            } else {
                                                int i21 = i16 + 1;
                                                float f = i16;
                                                if (bArr2 != 0) {
                                                    i7 = bArr2[i7];
                                                }
                                                paint2.setColor(iArr[i7]);
                                                i9 = i15;
                                                canvas.drawRect(i15, f, i15 + i8, i21, paint2);
                                            }
                                            i15 = i9 + i8;
                                            if (i6 != 0) {
                                                zzetVar.k();
                                                break;
                                            } else {
                                                paint2 = paint;
                                                i5 = i6;
                                                i20 = 1;
                                            }
                                        }
                                        c = 4;
                                        if (i8 != 0) {
                                        }
                                        i9 = i15;
                                        i15 = i9 + i8;
                                        if (i6 != 0) {
                                        }
                                    }
                                    i8 = h3;
                                }
                                i6 = i5;
                                c = 4;
                                if (i8 != 0) {
                                }
                                i9 = i15;
                                i15 = i9 + i8;
                                if (i6 != 0) {
                                }
                            }
                        } else {
                            bArr2 = bArr4;
                            i5 = 0;
                            while (true) {
                                h2 = zzetVar.h(2);
                                if (h2 != 0) {
                                }
                                i6 = i5;
                                c = 4;
                                if (i8 != 0) {
                                }
                                i9 = i15;
                                i15 = i9 + i8;
                                if (i6 != 0) {
                                }
                                paint2 = paint;
                                i5 = i6;
                                i20 = 1;
                            }
                        }
                    case 17:
                        byte[] bArr7 = i2 == 3 ? bArr5 == null ? j : bArr5 : null;
                        boolean z2 = false;
                        while (true) {
                            int h9 = zzetVar.h(i17);
                            if (h9 != 0) {
                                i10 = 1;
                                z = z2;
                            } else if (zzetVar.g()) {
                                if (zzetVar.g()) {
                                    int h10 = zzetVar.h(i19);
                                    if (h10 == 0) {
                                        i10 = 1;
                                        z = z2;
                                        h9 = 0;
                                    } else if (h10 == 1) {
                                        z = z2;
                                        i10 = i19;
                                        h9 = 0;
                                    } else if (h10 == i19) {
                                        h4 = zzetVar.h(i17) + 9;
                                        h5 = zzetVar.h(i17);
                                    } else if (h10 != 3) {
                                        z = z2;
                                        h9 = 0;
                                        i10 = 0;
                                    } else {
                                        h4 = zzetVar.h(8) + 25;
                                        h5 = zzetVar.h(i17);
                                    }
                                } else {
                                    h4 = zzetVar.h(i19) + i17;
                                    h5 = zzetVar.h(i17);
                                }
                                i10 = h4;
                                z = z2;
                                h9 = h5;
                            } else {
                                int h11 = zzetVar.h(3);
                                if (h11 != 0) {
                                    i10 = h11 + 2;
                                    z = z2;
                                    h9 = 0;
                                } else {
                                    z = true;
                                    h9 = 0;
                                    i10 = 0;
                                }
                            }
                            if (i10 == 0 || paint2 == null) {
                                i11 = i15;
                                i12 = i19;
                            } else {
                                int i22 = i16 + 1;
                                float f2 = i16;
                                if (bArr7 != 0) {
                                    h9 = bArr7[h9];
                                }
                                paint2.setColor(iArr[h9]);
                                i11 = i15;
                                i12 = 2;
                                canvas.drawRect(i15, f2, i15 + i10, i22, paint2);
                            }
                            i15 = i11 + i10;
                            if (z) {
                                zzetVar.k();
                                continue;
                            } else {
                                i19 = i12;
                                z2 = z;
                                i17 = 4;
                            }
                        }
                    case 18:
                        int i23 = i15;
                        int i24 = 0;
                        while (true) {
                            int h12 = zzetVar.h(8);
                            if (h12 != 0) {
                                i13 = i24;
                                h6 = i18;
                            } else if (zzetVar.g()) {
                                i13 = i24;
                                h6 = zzetVar.h(7);
                                h12 = zzetVar.h(8);
                            } else {
                                int h13 = zzetVar.h(7);
                                if (h13 != 0) {
                                    i13 = i24;
                                    h6 = h13;
                                    h12 = 0;
                                } else {
                                    i13 = i18;
                                    h12 = 0;
                                    h6 = 0;
                                }
                            }
                            if (h6 == 0 || paint2 == null) {
                                i14 = i18;
                            } else {
                                paint2.setColor(iArr[h12]);
                                i14 = i18;
                                canvas.drawRect(i23, i16, i23 + h6, i16 + 1, paint2);
                            }
                            i23 += h6;
                            if (i13 == 0) {
                                i18 = i14;
                                i24 = i13;
                            } else {
                                i15 = i23;
                                continue;
                            }
                        }
                    default:
                        switch (h7) {
                            case 32:
                                bArr6 = h(4, 4, zzetVar);
                                break;
                            case 33:
                                bArr4 = h(4, 8, zzetVar);
                                break;
                            case 34:
                                bArr5 = h(16, 8, zzetVar);
                                break;
                            default:
                                continue;
                        }
                }
            } else {
                i16 += 2;
                i15 = i3;
            }
            paint2 = paint;
        }
    }

    public static byte[] h(int i2, int i3, zzet zzetVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) zzetVar.h(i3);
        }
        return bArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzanz
    public final void a(int i2, int i3, bm2 bm2Var, byte[] bArr) {
        zzanr zzanrVar;
        int[] iArr;
        ain ainVar;
        int i4;
        int[] iArr2;
        int i5;
        int i6;
        int i7;
        int i8;
        ain ainVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        re5 re5Var = this.f;
        SparseArray sparseArray = re5Var.f;
        SparseArray sparseArray2 = re5Var.g;
        int i13 = re5Var.b;
        SparseArray sparseArray3 = re5Var.c;
        SparseArray sparseArray4 = re5Var.d;
        SparseArray sparseArray5 = re5Var.e;
        int i14 = re5Var.a;
        zzet zzetVar = new zzet(bArr, i2 + i3);
        zzetVar.d(i2);
        while (zzetVar.b() >= 48 && zzetVar.h(8) == 15) {
            int h2 = zzetVar.h(8);
            int h3 = zzetVar.h(16);
            int h4 = zzetVar.h(16);
            int c = zzetVar.c() + h4;
            if (h4 * 8 > zzetVar.b()) {
                zzeh.c("Data field length exceeds limit");
                zzetVar.f(zzetVar.b());
            } else {
                switch (h2) {
                    case 16:
                        i7 = i13;
                        if (h3 == i14) {
                            ke5 ke5Var = (ke5) re5Var.i;
                            int i15 = 8;
                            zzetVar.h(8);
                            int h5 = zzetVar.h(4);
                            int h6 = zzetVar.h(2);
                            zzetVar.f(2);
                            int i16 = h4 - 2;
                            SparseArray sparseArray6 = new SparseArray();
                            while (i16 > 0) {
                                int h7 = zzetVar.h(i15);
                                zzetVar.f(i15);
                                sparseArray6.put(h7, new zhn(zzetVar.h(16), zzetVar.h(16)));
                                i16 -= 6;
                                i14 = i14;
                                i15 = 8;
                            }
                            i8 = i14;
                            ke5 ke5Var2 = new ke5(h5, h6, sparseArray6);
                            if (h6 == 0) {
                                if (ke5Var != null && ke5Var.a != h5) {
                                    re5Var.i = ke5Var2;
                                    break;
                                }
                            } else {
                                re5Var.i = ke5Var2;
                                sparseArray3.clear();
                                sparseArray4.clear();
                                sparseArray5.clear();
                                break;
                            }
                        }
                        i8 = i14;
                        break;
                    case 17:
                        ke5 ke5Var3 = (ke5) re5Var.i;
                        if (h3 == i14 && ke5Var3 != null) {
                            int h8 = zzetVar.h(8);
                            zzetVar.f(4);
                            boolean g = zzetVar.g();
                            zzetVar.f(3);
                            int h9 = zzetVar.h(16);
                            int h10 = zzetVar.h(16);
                            zzetVar.h(3);
                            int h11 = zzetVar.h(3);
                            int i17 = 2;
                            zzetVar.f(2);
                            int h12 = zzetVar.h(8);
                            int h13 = zzetVar.h(8);
                            int h14 = zzetVar.h(4);
                            int h15 = zzetVar.h(2);
                            zzetVar.f(2);
                            int i18 = h4 - 10;
                            SparseArray sparseArray7 = new SparseArray();
                            while (i18 > 0) {
                                int h16 = zzetVar.h(16);
                                int h17 = zzetVar.h(i17);
                                zzetVar.h(i17);
                                int i19 = i13;
                                int h18 = zzetVar.h(12);
                                int i20 = i18;
                                zzetVar.f(4);
                                int h19 = zzetVar.h(12);
                                int i21 = i20 - 6;
                                if (h17 == 1 || h17 == 2) {
                                    zzetVar.h(8);
                                    zzetVar.h(8);
                                    i18 = i20 - 8;
                                } else {
                                    i18 = i21;
                                }
                                sparseArray7.put(h16, new bin(h18, h19));
                                i13 = i19;
                                i17 = 2;
                            }
                            i7 = i13;
                            ain ainVar3 = new ain(h8, g, h9, h10, h11, h12, h13, h14, h15, sparseArray7);
                            if (ke5Var3.b == 0 && (ainVar2 = (ain) sparseArray3.get(h8)) != null) {
                                int i22 = 0;
                                while (true) {
                                    SparseArray sparseArray8 = ainVar2.j;
                                    if (i22 < sparseArray8.size()) {
                                        ainVar3.j.put(sparseArray8.keyAt(i22), (bin) sparseArray8.valueAt(i22));
                                        i22++;
                                    }
                                }
                            }
                            sparseArray3.put(ainVar3.a, ainVar3);
                            i8 = i14;
                            break;
                        }
                        i7 = i13;
                        i8 = i14;
                        break;
                    case 18:
                        if (h3 == i14) {
                            xhn b = b(zzetVar, h4);
                            sparseArray4.put(b.a, b);
                        } else if (h3 == i13) {
                            xhn b2 = b(zzetVar, h4);
                            sparseArray.put(b2.a, b2);
                        }
                        i7 = i13;
                        i8 = i14;
                        break;
                    case 19:
                        if (h3 == i14) {
                            yhn c2 = c(zzetVar);
                            sparseArray5.put(c2.a, c2);
                        } else if (h3 == i13) {
                            yhn c3 = c(zzetVar);
                            sparseArray2.put(c3.a, c3);
                        }
                        i7 = i13;
                        i8 = i14;
                        break;
                    case 20:
                        if (h3 == i14) {
                            zzetVar.f(4);
                            boolean g2 = zzetVar.g();
                            zzetVar.f(3);
                            int h20 = zzetVar.h(16);
                            int h21 = zzetVar.h(16);
                            if (g2) {
                                int h22 = zzetVar.h(16);
                                int h23 = zzetVar.h(16);
                                int h24 = zzetVar.h(16);
                                i9 = h23;
                                i10 = zzetVar.h(16);
                                i12 = h24;
                                i11 = h22;
                            } else {
                                i9 = h20;
                                i10 = h21;
                                i11 = 0;
                                i12 = 0;
                            }
                            re5Var.h = new he5(h20, h21, i11, i9, i12, i10);
                        }
                        i7 = i13;
                        i8 = i14;
                        break;
                    default:
                        i7 = i13;
                        i8 = i14;
                        break;
                }
                zzetVar.l(c - zzetVar.c());
                i14 = i8;
                i13 = i7;
            }
        }
        ke5 ke5Var4 = (ke5) re5Var.i;
        if (ke5Var4 == null) {
            mio mioVar = zzgxm.b;
            zzanrVar = new zzanr(s.e, C.TIME_UNSET, C.TIME_UNSET);
        } else {
            he5 he5Var = (he5) re5Var.h;
            if (he5Var == null) {
                he5Var = this.d;
            }
            int i23 = he5Var.b;
            int i24 = he5Var.a;
            Bitmap bitmap = this.g;
            Canvas canvas = this.c;
            if (bitmap == null || i24 + 1 != bitmap.getWidth() || i23 + 1 != this.g.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(i24 + 1, i23 + 1, Bitmap.Config.ARGB_8888);
                this.g = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray9 = ke5Var4.c;
            int i25 = 0;
            while (i25 < sparseArray9.size()) {
                canvas.save();
                zhn zhnVar = (zhn) sparseArray9.valueAt(i25);
                ain ainVar4 = (ain) sparseArray3.get(sparseArray9.keyAt(i25));
                SparseArray sparseArray10 = sparseArray9;
                int i26 = zhnVar.a + he5Var.c;
                int i27 = zhnVar.b + he5Var.e;
                int i28 = ainVar4.c;
                SparseArray sparseArray11 = sparseArray3;
                int i29 = i26 + i28;
                int i30 = i25;
                int min = Math.min(i29, he5Var.d);
                ArrayList arrayList2 = arrayList;
                int i31 = ainVar4.d;
                int i32 = i23;
                int i33 = i27 + i31;
                int i34 = i28;
                canvas.clipRect(i26, i27, min, Math.min(i33, he5Var.f));
                int i35 = ainVar4.f;
                xhn xhnVar = (xhn) sparseArray4.get(i35);
                if (xhnVar == null && (xhnVar = (xhn) sparseArray.get(i35)) == null) {
                    xhnVar = this.e;
                }
                int[] iArr3 = xhnVar.b;
                he5 he5Var2 = he5Var;
                int[] iArr4 = xhnVar.c;
                int[] iArr5 = xhnVar.d;
                SparseArray sparseArray12 = ainVar4.j;
                SparseArray sparseArray13 = sparseArray;
                SparseArray sparseArray14 = sparseArray4;
                int i36 = 0;
                while (true) {
                    int[] iArr6 = iArr3;
                    if (i36 < sparseArray12.size()) {
                        int keyAt = sparseArray12.keyAt(i36);
                        bin binVar = (bin) sparseArray12.valueAt(i36);
                        yhn yhnVar = (yhn) sparseArray5.get(keyAt);
                        if (yhnVar == null) {
                            yhnVar = (yhn) sparseArray2.get(keyAt);
                        }
                        yhn yhnVar2 = yhnVar;
                        SparseArray sparseArray15 = sparseArray12;
                        if (yhnVar2 != null) {
                            Paint paint = yhnVar2.b ? null : this.a;
                            ain ainVar5 = ainVar4;
                            int i37 = ainVar5.e;
                            int i38 = binVar.a + i26;
                            int i39 = binVar.b + i27;
                            if (i37 == 3) {
                                iArr2 = iArr5;
                                i5 = i34;
                                i6 = i38;
                            } else if (i37 == 2) {
                                iArr2 = iArr5;
                                i5 = i34;
                                i6 = i38;
                                iArr5 = iArr4;
                            } else {
                                iArr2 = iArr5;
                                i5 = i34;
                                i6 = i38;
                                iArr5 = iArr6;
                            }
                            Canvas canvas2 = canvas;
                            int i40 = i5;
                            iArr = iArr2;
                            ainVar = ainVar5;
                            i4 = i40;
                            g(yhnVar2.c, iArr5, i37, i6, i39, paint, canvas2);
                            g(yhnVar2.d, iArr5, i37, i6, i39 + 1, paint, canvas2);
                            canvas = canvas2;
                        } else {
                            iArr = iArr5;
                            ainVar = ainVar4;
                            i4 = i34;
                        }
                        i36++;
                        ainVar4 = ainVar;
                        i34 = i4;
                        iArr3 = iArr6;
                        sparseArray12 = sparseArray15;
                        iArr5 = iArr;
                    } else {
                        int[] iArr7 = iArr5;
                        ain ainVar6 = ainVar4;
                        int i41 = i34;
                        float f = i27;
                        float f2 = i26;
                        if (ainVar6.b) {
                            int i42 = ainVar6.e;
                            int i43 = i42 == 3 ? iArr7[ainVar6.g] : i42 == 2 ? iArr4[ainVar6.h] : iArr6[ainVar6.i];
                            Paint paint2 = this.b;
                            paint2.setColor(i43);
                            canvas.drawRect(f2, f, i29, i33, paint2);
                        }
                        zzcx zzcxVar = new zzcx();
                        zzcxVar.b = Bitmap.createBitmap(this.g, i26, i27, i41, i31);
                        zzcxVar.a = null;
                        float f3 = i24;
                        zzcxVar.h = f2 / f3;
                        zzcxVar.i = 0;
                        i23 = i32;
                        float f4 = i23;
                        zzcxVar.e = f / f4;
                        zzcxVar.f = 0;
                        zzcxVar.g = 0;
                        zzcxVar.l = i41 / f3;
                        zzcxVar.m = i31 / f4;
                        arrayList2.add(zzcxVar.b());
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        canvas.restore();
                        i25 = i30 + 1;
                        arrayList = arrayList2;
                        sparseArray9 = sparseArray10;
                        sparseArray3 = sparseArray11;
                        he5Var = he5Var2;
                        sparseArray = sparseArray13;
                        sparseArray4 = sparseArray14;
                    }
                }
            }
            zzanrVar = new zzanr(arrayList, C.TIME_UNSET, C.TIME_UNSET);
        }
        bm2Var.mo13zza(zzanrVar);
    }
}

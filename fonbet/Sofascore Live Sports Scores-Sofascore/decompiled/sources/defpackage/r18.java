package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.text.TextUtils;
import android.util.SparseArray;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.u;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzemf;
import com.google.android.gms.internal.ads.zzemh;
import com.google.android.gms.internal.ads.zzemi;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzfvk;
import com.google.android.gms.internal.ads.zzfvn;
import com.google.android.gms.internal.ads.zzfvo;
import com.google.android.gms.internal.ads.zzfvp;
import com.google.android.gms.internal.ads.zzfvq;
import com.google.android.gms.internal.ads.zzfvr;
import com.google.android.gms.internal.ads.zzfvz;
import com.google.android.gms.internal.ads.zzfwa;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class r18 implements zli, v4o {
    public static final byte[] h = {0, 7, 8, 15};
    public static final byte[] i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;

    public r18(List list) {
        j9e j9eVar = new j9e((byte[]) list.get(0));
        int H = j9eVar.H();
        int H2 = j9eVar.H();
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
        this.d = new he5(719, 575, 0, 719, 0, 575);
        this.e = new ge5(0, new int[]{0, -1, -16777216, -8421505}, f(), g());
        this.f = new re5(H, H2, 1);
    }

    public static byte[] a(int i2, int i3, nm2 nm2Var) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) nm2Var.i(i3);
        }
        return bArr;
    }

    public static int[] f() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = i(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                int i3 = i2 & 1;
                int i4 = Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                int i5 = i3 != 0 ? 127 : 0;
                int i6 = (i2 & 2) != 0 ? 127 : 0;
                if ((i2 & 4) == 0) {
                    i4 = 0;
                }
                iArr[i2] = i(255, i5, i6, i4);
            }
        }
        return iArr;
    }

    public static int[] g() {
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = i(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                if (i3 == 0) {
                    iArr[i2] = i(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = i(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = i(255, ((i2 & 1) != 0 ? 43 : 0) + Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = i(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int i(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f7 A[LOOP:3: B:89:0x0165->B:100:0x01f7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0145 A[LOOP:2: B:42:0x00b2->B:53:0x0145, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cc A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z;
        int i5;
        char c;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        byte[] bArr4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Paint paint2 = paint;
        int i20 = 0;
        nm2 nm2Var = new nm2(bArr, bArr.length, 3, (byte) 0);
        int i21 = i3;
        int i22 = i4;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (nm2Var.b() != 0) {
            int i23 = nm2Var.i(8);
            if (i23 != 240) {
                int i24 = 1;
                int i25 = 2;
                int i26 = 4;
                switch (i23) {
                    case 16:
                        if (i2 == 3) {
                            bArr3 = bArr5 == null ? i : bArr5;
                        } else if (i2 == 2) {
                            bArr3 = bArr7 == null ? h : bArr7;
                        } else {
                            bArr2 = null;
                            z = false;
                            while (true) {
                                i5 = nm2Var.i(2);
                                if (i5 == 0) {
                                    i7 = 1;
                                    i6 = i5;
                                } else {
                                    if (nm2Var.h()) {
                                        i8 = nm2Var.i(3) + 3;
                                        i6 = nm2Var.i(2);
                                    } else {
                                        if (nm2Var.h()) {
                                            i7 = 1;
                                            z2 = z;
                                            c = 4;
                                        } else {
                                            int i27 = nm2Var.i(2);
                                            if (i27 == 0) {
                                                c = 4;
                                                z2 = true;
                                            } else if (i27 == 1) {
                                                c = 4;
                                                z2 = z;
                                                i7 = 2;
                                            } else if (i27 == 2) {
                                                c = 4;
                                                z2 = z;
                                                i7 = nm2Var.i(4) + 12;
                                                i6 = nm2Var.i(2);
                                                if (i7 != 0 || paint2 == null) {
                                                    i9 = i21;
                                                } else {
                                                    if (bArr2 != 0) {
                                                        i6 = bArr2[i6];
                                                    }
                                                    paint2.setColor(iArr[i6]);
                                                    i9 = i21;
                                                    canvas.drawRect(i21, i22, i21 + i7, i22 + 1, paint2);
                                                }
                                                i21 = i9 + i7;
                                                if (z2) {
                                                    nm2Var.c();
                                                    break;
                                                } else {
                                                    paint2 = paint;
                                                    z = z2;
                                                }
                                            } else if (i27 != 3) {
                                                z2 = z;
                                                c = 4;
                                            } else {
                                                i8 = nm2Var.i(8) + 29;
                                                i6 = nm2Var.i(2);
                                            }
                                            i6 = 0;
                                            i7 = 0;
                                            if (i7 != 0) {
                                            }
                                            i9 = i21;
                                            i21 = i9 + i7;
                                            if (z2) {
                                            }
                                        }
                                        i6 = 0;
                                        if (i7 != 0) {
                                        }
                                        i9 = i21;
                                        i21 = i9 + i7;
                                        if (z2) {
                                        }
                                    }
                                    i7 = i8;
                                }
                                z2 = z;
                                c = 4;
                                if (i7 != 0) {
                                }
                                i9 = i21;
                                i21 = i9 + i7;
                                if (z2) {
                                }
                            }
                        }
                        bArr2 = bArr3;
                        z = false;
                        while (true) {
                            i5 = nm2Var.i(2);
                            if (i5 == 0) {
                            }
                            z2 = z;
                            c = 4;
                            if (i7 != 0) {
                            }
                            i9 = i21;
                            i21 = i9 + i7;
                            if (z2) {
                            }
                            paint2 = paint;
                            z = z2;
                        }
                    case 17:
                        if (i2 == 3) {
                            bArr4 = bArr6 == null ? j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        int i28 = i20;
                        while (true) {
                            int i29 = nm2Var.i(i26);
                            if (i29 != 0) {
                                i10 = 1;
                            } else if (nm2Var.h()) {
                                if (nm2Var.h()) {
                                    int i30 = nm2Var.i(i25);
                                    if (i30 == 0) {
                                        i10 = 1;
                                        i11 = i28;
                                        i29 = i20;
                                        if (i10 != 0) {
                                        }
                                        i14 = i21;
                                        i15 = i25;
                                        i21 = i14 + i10;
                                        if (i11 == 0) {
                                        }
                                    } else if (i30 == 1) {
                                        i11 = i28;
                                        i10 = i25;
                                        i29 = i20;
                                        if (i10 != 0) {
                                        }
                                        i14 = i21;
                                        i15 = i25;
                                        i21 = i14 + i10;
                                        if (i11 == 0) {
                                        }
                                    } else if (i30 == i25) {
                                        i12 = nm2Var.i(i26) + 9;
                                        i13 = nm2Var.i(i26);
                                    } else if (i30 != 3) {
                                        i11 = i28;
                                        i29 = i20;
                                        i10 = i29 == true ? 1 : 0;
                                        if (i10 != 0) {
                                        }
                                        i14 = i21;
                                        i15 = i25;
                                        i21 = i14 + i10;
                                        if (i11 == 0) {
                                        }
                                    } else {
                                        i12 = nm2Var.i(8) + 25;
                                        i13 = nm2Var.i(i26);
                                    }
                                } else {
                                    i12 = nm2Var.i(i25) + i26;
                                    i13 = nm2Var.i(i26);
                                }
                                int i31 = i13;
                                i10 = i12;
                                i29 = i31;
                            } else {
                                int i32 = nm2Var.i(3);
                                if (i32 != 0) {
                                    i10 = i32 + 2;
                                    i11 = i28;
                                    i29 = i20;
                                    if (i10 != 0 || paint2 == null) {
                                        i14 = i21;
                                        i15 = i25;
                                    } else {
                                        if (bArr4 != null) {
                                            i29 = bArr4[i29];
                                        }
                                        paint2.setColor(iArr[i29]);
                                        i14 = i21;
                                        i15 = 2;
                                        canvas.drawRect(i21, i22, i21 + i10, i22 + 1, paint2);
                                    }
                                    i21 = i14 + i10;
                                    if (i11 == 0) {
                                        nm2Var.c();
                                        break;
                                    } else {
                                        i25 = i15;
                                        i28 = i11;
                                        i26 = 4;
                                        i20 = 0;
                                    }
                                } else {
                                    i11 = 1;
                                    i29 = i20;
                                    i10 = i29 == true ? 1 : 0;
                                    if (i10 != 0) {
                                    }
                                    i14 = i21;
                                    i15 = i25;
                                    i21 = i14 + i10;
                                    if (i11 == 0) {
                                    }
                                }
                            }
                            i11 = i28;
                            if (i10 != 0) {
                            }
                            i14 = i21;
                            i15 = i25;
                            i21 = i14 + i10;
                            if (i11 == 0) {
                            }
                        }
                    case 18:
                        int i33 = i20;
                        while (true) {
                            int i34 = nm2Var.i(8);
                            if (i34 != 0) {
                                i16 = i33;
                                i17 = i24;
                            } else if (nm2Var.h()) {
                                i16 = i33;
                                i17 = nm2Var.i(7);
                                i34 = nm2Var.i(8);
                            } else {
                                int i35 = nm2Var.i(7);
                                if (i35 != 0) {
                                    i16 = i33;
                                    i17 = i35;
                                    i34 = i20;
                                } else {
                                    i16 = i24;
                                    i34 = i20;
                                    i17 = i34;
                                }
                            }
                            if (i17 == 0 || paint2 == null) {
                                i18 = i21;
                                i19 = i24;
                            } else {
                                paint2.setColor(iArr[i34]);
                                i19 = i24;
                                i18 = i21;
                                canvas.drawRect(i21, i22, i21 + i17, i22 + 1, paint2);
                            }
                            i21 = i18 + i17;
                            if (i16 != 0) {
                                break;
                            }
                            i24 = i19;
                            i33 = i16;
                        }
                        break;
                    default:
                        switch (i23) {
                            case 32:
                                bArr7 = a(4, 4, nm2Var);
                                break;
                            case 33:
                                bArr5 = a(4, 8, nm2Var);
                                break;
                            case 34:
                                bArr6 = a(16, 8, nm2Var);
                                break;
                        }
                }
            } else {
                i22 += 2;
                i21 = i3;
            }
            paint2 = paint;
            i20 = 0;
        }
    }

    public static ge5 o(nm2 nm2Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 8;
        int i9 = nm2Var.i(8);
        nm2Var.t(8);
        int i10 = 2;
        int i11 = i2 - 2;
        int i12 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] f = f();
        int[] g = g();
        while (i11 > 0) {
            int i13 = nm2Var.i(i8);
            int i14 = nm2Var.i(i8);
            int[] iArr2 = (i14 & 128) != 0 ? iArr : (i14 & 64) != 0 ? f : g;
            if ((i14 & 1) != 0) {
                i6 = nm2Var.i(i8);
                i7 = nm2Var.i(i8);
                i3 = nm2Var.i(i8);
                i5 = nm2Var.i(i8);
                i4 = i11 - 6;
            } else {
                int i15 = nm2Var.i(6) << i10;
                int i16 = nm2Var.i(4) << 4;
                i3 = nm2Var.i(4) << 4;
                i4 = i11 - 4;
                i5 = nm2Var.i(i10) << 6;
                i6 = i15;
                i7 = i16;
            }
            if (i6 == 0) {
                i7 = i12;
                i3 = i7;
                i5 = 255;
            }
            double d = i6;
            double d2 = i7 - 128;
            double d3 = i3 - 128;
            iArr2[i13] = i((byte) (255 - (i5 & 255)), nik.j((int) ((1.402d * d2) + d), 0, 255), nik.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), nik.j((int) ((d3 * 1.772d) + d), 0, 255));
            i11 = i4;
            i12 = 0;
            i9 = i9;
            g = g;
            i8 = 8;
            i10 = 2;
        }
        return new ge5(i9, iArr, f, g);
    }

    public static je5 p(nm2 nm2Var) {
        byte[] bArr;
        int i2 = nm2Var.i(16);
        nm2Var.t(4);
        int i3 = nm2Var.i(2);
        boolean h2 = nm2Var.h();
        nm2Var.t(1);
        byte[] bArr2 = nik.b;
        if (i3 == 1) {
            nm2Var.t(nm2Var.i(8) * 16);
        } else if (i3 == 0) {
            int i4 = nm2Var.i(16);
            int i5 = nm2Var.i(16);
            if (i4 > 0) {
                bArr2 = new byte[i4];
                nm2Var.l(i4, bArr2);
            }
            if (i5 > 0) {
                bArr = new byte[i5];
                nm2Var.l(i5, bArr);
                return new je5(i2, h2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new je5(i2, h2, bArr2, bArr);
    }

    public static synchronized void q(File file) {
        synchronized (r18.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    file.toString();
                    file.delete();
                }
                if (!file.mkdirs()) {
                    file.toString();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean r(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                r(file2);
            }
        }
        return file.delete();
    }

    public static List s(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public void b() {
        wqf wqfVar;
        nh3 nh3Var = (nh3) this.a;
        Iterator it = ((ArrayList) this.e).iterator();
        while (true) {
            if (!it.hasNext()) {
                wqfVar = wqf.a;
                break;
            }
            a9d a9dVar = (a9d) it.next();
            wqf stateRestorationPolicy = a9dVar.c.getStateRestorationPolicy();
            wqfVar = wqf.c;
            if (stateRestorationPolicy == wqfVar || (stateRestorationPolicy == wqf.b && a9dVar.e == 0)) {
                break;
            }
        }
        if (wqfVar != nh3Var.getStateRestorationPolicy()) {
            nh3Var.o(wqfVar);
        }
    }

    public void c(String str) {
        File file = new File((File) this.b, str);
        if (file.exists() && r(file)) {
            file.getPath();
        }
    }

    public int d(a9d a9dVar) {
        a9d a9dVar2;
        Iterator it = ((ArrayList) this.e).iterator();
        int i2 = 0;
        while (it.hasNext() && (a9dVar2 = (a9d) it.next()) != a9dVar) {
            i2 += a9dVar2.e;
        }
        return i2;
    }

    public pp4 e(int i2) {
        pp4 pp4Var = (pp4) this.f;
        if (pp4Var.b) {
            pp4Var = new pp4((byte) 0, 4);
        } else {
            pp4Var.b = true;
        }
        Iterator it = ((ArrayList) this.e).iterator();
        int i3 = i2;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a9d a9dVar = (a9d) it.next();
            int i4 = a9dVar.e;
            if (i4 > i3) {
                pp4Var.d = a9dVar;
                pp4Var.c = i3;
                break;
            }
            i3 -= i4;
        }
        if (((a9d) pp4Var.d) != null) {
            return pp4Var;
        }
        a70.p(ljg.j(i2, "Cannot find wrapper for "));
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.zli
    public void h(byte[] bArr, int i2, int i3, yli yliVar, wn3 wn3Var) {
        q74 q74Var;
        ArrayList arrayList;
        int i4;
        SparseArray sparseArray;
        int i5;
        char c;
        int i6;
        Paint paint;
        Canvas canvas;
        SparseArray sparseArray2;
        oe5 oe5Var;
        int i7;
        int[] iArr;
        int i8;
        int[] iArr2;
        SparseArray sparseArray3;
        int i9;
        Paint paint2;
        int i10;
        oe5 oe5Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        nm2 nm2Var = new nm2(bArr, i2 + i3, 3, (byte) 0);
        nm2Var.q(i2);
        Paint paint3 = (Paint) this.b;
        Canvas canvas2 = (Canvas) this.c;
        re5 re5Var = (re5) this.f;
        SparseArray sparseArray4 = re5Var.f;
        SparseArray sparseArray5 = re5Var.g;
        int i15 = re5Var.b;
        SparseArray sparseArray6 = re5Var.c;
        SparseArray sparseArray7 = re5Var.d;
        SparseArray sparseArray8 = re5Var.e;
        int i16 = re5Var.a;
        while (nm2Var.b() >= 48 && nm2Var.i(8) == 15) {
            int i17 = nm2Var.i(8);
            int i18 = nm2Var.i(16);
            int i19 = nm2Var.i(16);
            int f = nm2Var.f() + i19;
            if (i19 * 8 > nm2Var.b()) {
                tgj.d0("Data field length exceeds limit");
                nm2Var.t(nm2Var.b());
                sparseArray3 = sparseArray5;
                i9 = i15;
                paint2 = paint3;
                i10 = i16;
            } else {
                switch (i17) {
                    case 16:
                        sparseArray3 = sparseArray5;
                        i9 = i15;
                        paint2 = paint3;
                        if (i18 == i16) {
                            ke5 ke5Var = (ke5) re5Var.i;
                            int i20 = 8;
                            nm2Var.i(8);
                            int i21 = nm2Var.i(4);
                            int i22 = nm2Var.i(2);
                            nm2Var.t(2);
                            int i23 = i19 - 2;
                            SparseArray sparseArray9 = new SparseArray();
                            while (i23 > 0) {
                                int i24 = nm2Var.i(i20);
                                nm2Var.t(i20);
                                sparseArray9.put(i24, new me5(nm2Var.i(16), nm2Var.i(16)));
                                i16 = i16;
                                i23 -= 6;
                                i20 = 8;
                            }
                            i10 = i16;
                            ke5 ke5Var2 = new ke5(i21, i22, sparseArray9);
                            if (i22 != 0) {
                                re5Var.i = ke5Var2;
                                sparseArray6.clear();
                                sparseArray7.clear();
                                sparseArray8.clear();
                                break;
                            } else if (ke5Var != null && ke5Var.a != i21) {
                                re5Var.i = ke5Var2;
                                break;
                            }
                        }
                        i10 = i16;
                        break;
                    case 17:
                        ke5 ke5Var3 = (ke5) re5Var.i;
                        if (i18 == i16 && ke5Var3 != null) {
                            int i25 = nm2Var.i(8);
                            nm2Var.t(4);
                            boolean h2 = nm2Var.h();
                            nm2Var.t(3);
                            int i26 = nm2Var.i(16);
                            int i27 = nm2Var.i(16);
                            nm2Var.i(3);
                            int i28 = nm2Var.i(3);
                            int i29 = 2;
                            nm2Var.t(2);
                            int i30 = nm2Var.i(8);
                            int i31 = nm2Var.i(8);
                            int i32 = nm2Var.i(4);
                            int i33 = nm2Var.i(2);
                            nm2Var.t(2);
                            int i34 = i19 - 10;
                            SparseArray sparseArray10 = new SparseArray();
                            while (i34 > 0) {
                                int i35 = i34;
                                int i36 = i15;
                                int i37 = nm2Var.i(16);
                                int i38 = nm2Var.i(i29);
                                nm2Var.i(i29);
                                Paint paint4 = paint3;
                                int i39 = nm2Var.i(12);
                                SparseArray sparseArray11 = sparseArray5;
                                nm2Var.t(4);
                                int i40 = nm2Var.i(12);
                                int i41 = i35 - 6;
                                if (i38 == 1 || i38 == 2) {
                                    nm2Var.i(8);
                                    nm2Var.i(8);
                                    i34 = i35 - 8;
                                } else {
                                    i34 = i41;
                                }
                                sparseArray10.put(i37, new qe5(i39, i40));
                                i15 = i36;
                                paint3 = paint4;
                                sparseArray5 = sparseArray11;
                                i29 = 2;
                            }
                            sparseArray3 = sparseArray5;
                            i9 = i15;
                            paint2 = paint3;
                            oe5 oe5Var3 = new oe5(i25, h2, i26, i27, i28, i30, i31, i32, i33, sparseArray10);
                            if (ke5Var3.b == 0 && (oe5Var2 = (oe5) sparseArray6.get(i25)) != null) {
                                SparseArray sparseArray12 = oe5Var2.j;
                                for (int i42 = 0; i42 < sparseArray12.size(); i42++) {
                                    oe5Var3.j.put(sparseArray12.keyAt(i42), (qe5) sparseArray12.valueAt(i42));
                                }
                            }
                            sparseArray6.put(oe5Var3.a, oe5Var3);
                            i10 = i16;
                            break;
                        }
                        sparseArray3 = sparseArray5;
                        i9 = i15;
                        paint2 = paint3;
                        i10 = i16;
                        break;
                    case 18:
                        if (i18 == i16) {
                            ge5 o = o(nm2Var, i19);
                            sparseArray7.put(o.a, o);
                        } else if (i18 == i15) {
                            ge5 o2 = o(nm2Var, i19);
                            sparseArray4.put(o2.a, o2);
                        }
                        sparseArray3 = sparseArray5;
                        i9 = i15;
                        paint2 = paint3;
                        i10 = i16;
                        break;
                    case 19:
                        if (i18 == i16) {
                            je5 p = p(nm2Var);
                            sparseArray8.put(p.a, p);
                        } else if (i18 == i15) {
                            je5 p2 = p(nm2Var);
                            sparseArray5.put(p2.a, p2);
                        }
                        sparseArray3 = sparseArray5;
                        i9 = i15;
                        paint2 = paint3;
                        i10 = i16;
                        break;
                    case 20:
                        if (i18 == i16) {
                            nm2Var.t(4);
                            boolean h3 = nm2Var.h();
                            nm2Var.t(3);
                            int i43 = nm2Var.i(16);
                            int i44 = nm2Var.i(16);
                            if (h3) {
                                int i45 = nm2Var.i(16);
                                int i46 = nm2Var.i(16);
                                int i47 = nm2Var.i(16);
                                i13 = i45;
                                i12 = nm2Var.i(16);
                                i11 = i46;
                                i14 = i47;
                            } else {
                                i11 = i43;
                                i12 = i44;
                                i13 = 0;
                                i14 = 0;
                            }
                            re5Var.h = new he5(i43, i44, i13, i11, i14, i12);
                        }
                        sparseArray3 = sparseArray5;
                        i9 = i15;
                        paint2 = paint3;
                        i10 = i16;
                        break;
                    default:
                        sparseArray3 = sparseArray5;
                        i9 = i15;
                        paint2 = paint3;
                        i10 = i16;
                        break;
                }
                nm2Var.u(f - nm2Var.f());
            }
            i16 = i10;
            i15 = i9;
            paint3 = paint2;
            sparseArray5 = sparseArray3;
        }
        SparseArray sparseArray13 = sparseArray5;
        Paint paint5 = paint3;
        ke5 ke5Var4 = (ke5) re5Var.i;
        if (ke5Var4 == null) {
            av9 av9Var = hv9.b;
            q74Var = new q74(vvf.e, C.TIME_UNSET, C.TIME_UNSET);
        } else {
            he5 he5Var = (he5) re5Var.h;
            if (he5Var == null) {
                he5Var = (he5) this.d;
            }
            int i48 = he5Var.b;
            int i49 = he5Var.a;
            Bitmap bitmap = (Bitmap) this.g;
            if (bitmap == null || i49 + 1 != bitmap.getWidth() || i48 + 1 != ((Bitmap) this.g).getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(i49 + 1, i48 + 1, Bitmap.Config.ARGB_8888);
                this.g = createBitmap;
                canvas2.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray14 = ke5Var4.c;
            int i50 = 0;
            while (i50 < sparseArray14.size()) {
                canvas2.save();
                me5 me5Var = (me5) sparseArray14.valueAt(i50);
                oe5 oe5Var4 = (oe5) sparseArray6.get(sparseArray14.keyAt(i50));
                int i51 = me5Var.a + he5Var.c;
                int i52 = me5Var.b + he5Var.e;
                int i53 = oe5Var4.c;
                SparseArray sparseArray15 = sparseArray14;
                int i54 = oe5Var4.f;
                int i55 = i48;
                int i56 = oe5Var4.d;
                ArrayList arrayList3 = arrayList2;
                int i57 = i51 + i53;
                int i58 = i50;
                SparseArray sparseArray16 = sparseArray6;
                int i59 = i52 + i56;
                int i60 = i53;
                canvas2.clipRect(i51, i52, Math.min(i57, he5Var.d), Math.min(i59, he5Var.f));
                ge5 ge5Var = (ge5) sparseArray7.get(i54);
                if (ge5Var == null && (ge5Var = (ge5) sparseArray4.get(i54)) == null) {
                    ge5Var = (ge5) this.e;
                }
                int[] iArr3 = ge5Var.b;
                int[] iArr4 = ge5Var.c;
                int[] iArr5 = ge5Var.d;
                he5 he5Var2 = he5Var;
                SparseArray sparseArray17 = oe5Var4.j;
                SparseArray sparseArray18 = sparseArray4;
                int i61 = 0;
                while (i61 < sparseArray17.size()) {
                    int keyAt = sparseArray17.keyAt(i61);
                    SparseArray sparseArray19 = sparseArray17;
                    qe5 qe5Var = (qe5) sparseArray17.valueAt(i61);
                    je5 je5Var = (je5) sparseArray8.get(keyAt);
                    int i62 = i61;
                    SparseArray sparseArray20 = sparseArray13;
                    if (je5Var == null) {
                        je5Var = (je5) sparseArray20.get(keyAt);
                    }
                    je5 je5Var2 = je5Var;
                    sparseArray13 = sparseArray20;
                    if (je5Var2 != null) {
                        Paint paint6 = je5Var2.b ? null : (Paint) this.a;
                        int i63 = i51;
                        int i64 = oe5Var4.e;
                        int i65 = i63 + qe5Var.a;
                        int i66 = qe5Var.b + i52;
                        if (i64 == 3) {
                            sparseArray2 = sparseArray8;
                            oe5Var = oe5Var4;
                            iArr2 = iArr5;
                        } else if (i64 == 2) {
                            sparseArray2 = sparseArray8;
                            oe5Var = oe5Var4;
                            iArr2 = iArr4;
                        } else {
                            sparseArray2 = sparseArray8;
                            oe5Var = oe5Var4;
                            iArr2 = iArr3;
                        }
                        i7 = i63;
                        canvas = canvas2;
                        i8 = i60;
                        iArr = iArr4;
                        n(je5Var2.c, iArr2, i64, i65, i66, paint6, canvas);
                        n(je5Var2.d, iArr2, i64, i65, i66 + 1, paint6, canvas);
                    } else {
                        canvas = canvas2;
                        sparseArray2 = sparseArray8;
                        oe5Var = oe5Var4;
                        i7 = i51;
                        iArr = iArr4;
                        i8 = i60;
                    }
                    oe5Var4 = oe5Var;
                    i51 = i7;
                    i60 = i8;
                    i61 = i62 + 1;
                    canvas2 = canvas;
                    sparseArray17 = sparseArray19;
                    iArr4 = iArr;
                    sparseArray8 = sparseArray2;
                }
                Canvas canvas3 = canvas2;
                SparseArray sparseArray21 = sparseArray8;
                oe5 oe5Var5 = oe5Var4;
                int i67 = i51;
                int[] iArr6 = iArr4;
                int i68 = i60;
                if (oe5Var5.b) {
                    int i69 = oe5Var5.e;
                    if (i69 == 3) {
                        i6 = iArr5[oe5Var5.g];
                        paint = paint5;
                        c = 2;
                    } else {
                        c = 2;
                        i6 = i69 == 2 ? iArr6[oe5Var5.h] : iArr3[oe5Var5.i];
                        paint = paint5;
                    }
                    paint.setColor(i6);
                    paint5 = paint;
                    sparseArray = sparseArray7;
                    i4 = i68;
                    i5 = i52;
                    canvas2 = canvas3;
                    arrayList = arrayList3;
                    canvas2.drawRect(i67, i52, i57, i59, paint5);
                } else {
                    arrayList = arrayList3;
                    i4 = i68;
                    sparseArray = sparseArray7;
                    i5 = i52;
                    canvas2 = canvas3;
                }
                float f2 = i49;
                float f3 = i55;
                arrayList.add(new m74(null, null, null, Bitmap.createBitmap((Bitmap) this.g, i67, i5, i4, i56), i5 / f3, 0, 0, i67 / f2, 0, Integer.MIN_VALUE, -3.4028235E38f, i4 / f2, i56 / f3, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas2.restore();
                sparseArray7 = sparseArray;
                i48 = i55;
                arrayList2 = arrayList;
                sparseArray6 = sparseArray16;
                he5Var = he5Var2;
                sparseArray4 = sparseArray18;
                sparseArray8 = sparseArray21;
                i50 = i58 + 1;
                sparseArray14 = sparseArray15;
            }
            q74Var = new q74(arrayList2, C.TIME_UNSET, C.TIME_UNSET);
        }
        wn3Var.accept(q74Var);
    }

    public File k(String str, String str2) {
        File file = new File((File) this.d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    @Override // defpackage.zli
    public int l() {
        return 2;
    }

    public a9d m(u uVar) {
        a9d a9dVar = (a9d) ((IdentityHashMap) this.d).get(uVar);
        if (a9dVar != null) {
            return a9dVar;
        }
        zzl.l("Cannot find wrapper for ", uVar, ", seems like it is not bound by this adapter: ", this);
        return null;
    }

    @Override // defpackage.zli
    public void reset() {
        re5 re5Var = (re5) this.f;
        re5Var.c.clear();
        re5Var.d.clear();
        re5Var.e.clear();
        re5Var.f.clear();
        re5Var.g.clear();
        re5Var.h = null;
        re5Var.i = null;
    }

    @Override // defpackage.v4o
    /* renamed from: zza */
    public Object zzh() {
        String str = (String) this.a;
        String str2 = (String) this.b;
        String str3 = (String) this.c;
        zzemh zzemhVar = (zzemh) this.d;
        WebView webView = (WebView) this.e;
        String str4 = (String) this.f;
        zzemi zzemiVar = (zzemi) this.g;
        if (TextUtils.isEmpty(str)) {
            a70.p("Name is null or empty");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            a70.p("Version is null or empty");
            return null;
        }
        zzfwa zzfwaVar = new zzfwa(str, str2);
        zzfvz j2 = zzemf.j("javascript");
        zzfvz j3 = zzemf.j(str3);
        zzfvr l = zzemf.l(zzemhVar.a);
        zzfvz zzfvzVar = zzfvz.NONE;
        if (j2 == zzfvzVar) {
            int i2 = zze.zza;
            zzo.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (l == null) {
            String valueOf = String.valueOf(zzemhVar);
            int i3 = zze.zza;
            zzo.zzi("Omid js session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        }
        if (l == zzfvr.VIDEO && j3 == zzfvzVar) {
            String valueOf2 = String.valueOf(str3);
            int i4 = zze.zza;
            zzo.zzi("Omid js session error; Video events owner unknown for video creative: ".concat(valueOf2));
            return null;
        }
        zzfvo zzfvoVar = new zzfvo(zzfwaVar, webView, str4, "", zzfvp.JAVASCRIPT);
        zzfvn a = zzfvn.a(l, zzemf.k(zzemiVar.a), j2, j3, true);
        if (zzfvk.a.a) {
            return new zzeml(new zzfvq(a, zzfvoVar, UUID.randomUUID().toString()), zzfvoVar);
        }
        a70.r("Method called before OM SDK activation");
        return null;
    }

    public r18(kw9 kw9Var, igf igfVar, qsg qsgVar, zmf zmfVar, li2 li2Var, wu0 wu0Var, mjc mjcVar, z41 z41Var) {
        this.a = kw9Var;
        this.b = igfVar;
        this.c = qsgVar;
        this.d = zmfVar;
        this.e = wu0Var;
        this.f = mjcVar;
        this.g = z41Var;
    }

    public r18(Context context) {
        String str;
        String replaceAll;
        String str2 = ((qt0) z7f.a.b(context)).a;
        this.a = str2;
        File filesDir = context.getFilesDir();
        this.b = filesDir;
        if (!str2.isEmpty()) {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            if (str2.length() > 40) {
                replaceAll = k53.y0(str2);
            } else {
                replaceAll = str2.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb.append(replaceAll);
            str = sb.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        q(file);
        this.c = file;
        File file2 = new File(file, "open-sessions");
        q(file2);
        this.d = file2;
        File file3 = new File(file, "reports");
        q(file3);
        this.e = file3;
        File file4 = new File(file, "priority-reports");
        q(file4);
        this.f = file4;
        File file5 = new File(file, "native-reports");
        q(file5);
        this.g = file5;
    }

    public r18(nh3 nh3Var) {
        this.c = new ArrayList();
        this.d = new IdentityHashMap();
        this.e = new ArrayList();
        this.f = new pp4((byte) 0, 4);
        this.a = nh3Var;
        hvk hvkVar = new hvk();
        hvkVar.b = new SparseArray();
        hvkVar.a = 0;
        this.b = hvkVar;
        this.g = new e3c(13);
    }

    public r18(String str, r18 r18Var, hcc hccVar) {
        this.d = new en0(this, false);
        this.e = new en0(this, true);
        this.f = new k89(1, false);
        this.g = new AtomicMarkableReference(null, false);
        this.a = str;
        this.b = new hic(r18Var);
        this.c = hccVar;
    }

    public /* synthetic */ r18(WebView webView, zzemh zzemhVar, zzemi zzemiVar, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zzemhVar;
        this.e = webView;
        this.f = str4;
        this.g = zzemiVar;
    }
}

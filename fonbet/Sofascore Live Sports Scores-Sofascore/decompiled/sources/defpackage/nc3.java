package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.zzcwa;
import com.google.android.gms.internal.ads.zzczr;
import com.google.android.gms.internal.ads.zzdbu;
import com.google.android.gms.internal.ads.zzdcw;
import com.google.android.gms.internal.ads.zzdcz;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzdov;
import com.google.android.gms.internal.ads.zzdoz;
import com.google.android.gms.internal.ads.zzeay;
import com.google.android.gms.internal.ads.zzeqk;
import com.google.android.gms.internal.ads.zzfic;
import com.google.android.gms.internal.ads.zzfiy;
import com.google.android.gms.internal.ads.zzfnc;
import com.google.android.gms.internal.ads.zzioe;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nc3 implements ac3, zzdoz {
    public static final kc3 h = new kc3(0);
    public static final byte[] i = {0, 7, 8, 15};
    public static final byte[] j = {0, 119, -120, -1};
    public static final byte[] k = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public static byte[] m(int i2, int i3, nm2 nm2Var) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) nm2Var.i(i3);
        }
        return bArr;
    }

    public static int[] o() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = q(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                int i3 = i2 & 1;
                int i4 = Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                int i5 = i3 != 0 ? 127 : 0;
                int i6 = (i2 & 2) != 0 ? 127 : 0;
                if ((i2 & 4) == 0) {
                    i4 = 0;
                }
                iArr[i2] = q(255, i5, i6, i4);
            }
        }
        return iArr;
    }

    public static int[] p() {
        int[] iArr = new int[NotificationCompat.FLAG_LOCAL_ONLY];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = q(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                if (i3 == 0) {
                    iArr[i2] = q(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = q(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = q(255, ((i2 & 1) != 0 ? 43 : 0) + Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = q(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int q(int i2, int i3, int i4, int i5) {
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
    public static void r(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
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
        nm2 nm2Var = new nm2(bArr, bArr.length, 2, (byte) 0);
        int i21 = i3;
        int i22 = i4;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (nm2Var.b() != 0) {
            int i23 = nm2Var.i(8);
            if (i23 != 240) {
                int i24 = 1;
                int i25 = 3;
                int i26 = 4;
                switch (i23) {
                    case 16:
                        if (i2 == 3) {
                            bArr3 = bArr5 == null ? j : bArr5;
                        } else if (i2 == 2) {
                            bArr3 = bArr7 == null ? i : bArr7;
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
                            bArr4 = bArr6 == null ? k : bArr6;
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
                                    int i30 = nm2Var.i(2);
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
                                        i10 = 2;
                                        i29 = i20;
                                        if (i10 != 0) {
                                        }
                                        i14 = i21;
                                        i15 = i25;
                                        i21 = i14 + i10;
                                        if (i11 == 0) {
                                        }
                                    } else if (i30 == 2) {
                                        i12 = nm2Var.i(i26) + 9;
                                        i13 = nm2Var.i(i26);
                                    } else if (i30 != i25) {
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
                                    i12 = nm2Var.i(2) + i26;
                                    i13 = nm2Var.i(i26);
                                }
                                int i31 = i13;
                                i10 = i12;
                                i29 = i31;
                            } else {
                                int i32 = nm2Var.i(i25);
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
                                        i15 = 3;
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
                                bArr7 = m(4, 4, nm2Var);
                                break;
                            case 33:
                                bArr5 = m(4, 8, nm2Var);
                                break;
                            case 34:
                                bArr6 = m(16, 8, nm2Var);
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

    public static fe5 s(nm2 nm2Var, int i2) {
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
        int[] o = o();
        int[] p = p();
        while (i11 > 0) {
            int i13 = nm2Var.i(i8);
            int i14 = nm2Var.i(i8);
            int[] iArr2 = (i14 & 128) != 0 ? iArr : (i14 & 64) != 0 ? o : p;
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
            iArr2[i13] = q((byte) (255 - (i5 & 255)), lik.h((int) ((1.402d * d2) + d), 0, 255), lik.h((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), lik.h((int) ((d3 * 1.772d) + d), 0, 255));
            i11 = i4;
            i12 = 0;
            i9 = i9;
            p = p;
            i8 = 8;
            i10 = 2;
        }
        return new fe5(i9, iArr, o, p);
    }

    public static ie5 t(nm2 nm2Var) {
        byte[] bArr;
        int i2 = nm2Var.i(16);
        nm2Var.t(4);
        int i3 = nm2Var.i(2);
        boolean h2 = nm2Var.h();
        nm2Var.t(1);
        byte[] bArr2 = lik.e;
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
                return new ie5(i2, h2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new ie5(i2, h2, bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzdoz, com.google.android.gms.internal.ads.zzdcw
    public /* synthetic */ zzdcw a(zzfiy zzfiyVar) {
        this.b = zzfiyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoz, com.google.android.gms.internal.ads.zzdcw
    public /* synthetic */ zzdcw b(zzfic zzficVar) {
        this.c = zzficVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoz
    public /* synthetic */ nc3 c(zzfic zzficVar) {
        this.c = zzficVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoz
    public /* synthetic */ nc3 d(zzfiy zzfiyVar) {
        this.b = zzfiyVar;
        return this;
    }

    @Override // defpackage.ac3
    public synchronized vff f(oif oifVar) {
        usa usaVar = (usa) ((HashMap) this.c).get(oifVar);
        if (usaVar != null) {
            return usaVar;
        }
        return h;
    }

    @Override // defpackage.ac3
    public synchronized vff g(oif oifVar) {
        d2a.r(oifVar, "Null interface requested.");
        return (vff) ((HashMap) this.b).get(oifVar);
    }

    @Override // defpackage.ac3
    public nvd k(oif oifVar) {
        vff g = g(oifVar);
        return g == null ? new nvd(nvd.c, nvd.d) : g instanceof nvd ? (nvd) g : new nvd(null, g);
    }

    public void n(HashMap hashMap, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            kb3 kb3Var = (kb3) entry.getKey();
            vff vffVar = (vff) entry.getValue();
            int i2 = kb3Var.d;
            if (i2 == 1 || (i2 == 2 && z)) {
                vffVar.get();
            }
        }
        rv5 rv5Var = (rv5) this.e;
        synchronized (rv5Var) {
            try {
                arrayDeque = rv5Var.b;
                if (arrayDeque != null) {
                    rv5Var.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw lnb.i(it);
            }
        }
    }

    public void u() {
        HashMap hashMap = (HashMap) this.b;
        HashMap hashMap2 = (HashMap) this.c;
        for (kb3 kb3Var : ((HashMap) this.a).keySet()) {
            for (qx4 qx4Var : kb3Var.c) {
                boolean z = qx4Var.b == 2;
                oif oifVar = qx4Var.a;
                if (z && !hashMap2.containsKey(oifVar)) {
                    Set set = Collections.EMPTY_SET;
                    usa usaVar = new usa();
                    usaVar.b = null;
                    usaVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    usaVar.a.addAll(set);
                    hashMap2.put(oifVar, usaVar);
                } else if (hashMap.containsKey(oifVar)) {
                    continue;
                } else {
                    int i2 = qx4Var.b;
                    if (i2 == 1) {
                        throw new sx4("Unsatisfied dependency for component " + kb3Var + ": " + oifVar, 3);
                    }
                    if (i2 != 2) {
                        hashMap.put(oifVar, new nvd(nvd.c, nvd.d));
                    }
                }
            }
        }
    }

    public ArrayList v(ArrayList arrayList) {
        HashMap hashMap = (HashMap) this.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kb3 kb3Var = (kb3) it.next();
            if (kb3Var.e == 0) {
                vff vffVar = (vff) ((HashMap) this.a).get(kb3Var);
                for (oif oifVar : kb3Var.b) {
                    if (hashMap.containsKey(oifVar)) {
                        arrayList2.add(new r0(29, (nvd) ((vff) hashMap.get(oifVar)), vffVar));
                    } else {
                        hashMap.put(oifVar, vffVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public ArrayList w() {
        HashMap hashMap = (HashMap) this.c;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            kb3 kb3Var = (kb3) entry.getKey();
            if (kb3Var.e != 0) {
                vff vffVar = (vff) entry.getValue();
                for (oif oifVar : kb3Var.b) {
                    if (!hashMap2.containsKey(oifVar)) {
                        hashMap2.put(oifVar, new HashSet());
                    }
                    ((Set) hashMap2.get(oifVar)).add(vffVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (hashMap.containsKey(entry2.getKey())) {
                usa usaVar = (usa) hashMap.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new mc3(0, usaVar, (vff) it.next()));
                }
            } else {
                oif oifVar2 = (oif) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                usa usaVar2 = new usa();
                usaVar2.b = null;
                usaVar2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                usaVar2.a.addAll(set);
                hashMap.put(oifVar2, usaVar2);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzdoz, com.google.android.gms.internal.ads.zzdcw
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public sun zzh() {
        zzioe.b(zzdjp.class, (zzdjp) this.d);
        zzioe.b(zzdcz.class, (zzdcz) this.e);
        zzioe.b(zzdov.class, (zzdov) this.f);
        zzioe.b(zzcwa.class, (zzcwa) this.g);
        zzcwa zzcwaVar = (zzcwa) this.g;
        zzdov zzdovVar = (zzdov) this.f;
        new zzczr();
        new zzfnc();
        new zzdbu();
        return new sun((uun) this.a, zzcwaVar, zzdovVar, new zzeay(), (zzdjp) this.d, (zzdcz) this.e, new zzeqk(), (zzfiy) this.b, (zzfic) this.c);
    }
}

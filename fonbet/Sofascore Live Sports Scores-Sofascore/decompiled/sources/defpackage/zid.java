package defpackage;

import android.graphics.Color;
import android.os.HandlerThread;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.internal.ads.zzba;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzgvc;
import com.google.android.gms.internal.ads.zznr;
import com.google.android.gms.internal.ads.zznt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zid implements lkk, xid, pmk, zzdjm, zzeb, zzgvc {
    public static final float[] c = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    public static final float[] d = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};
    public static final zid e;
    public static final zid f;
    public static final zid g;
    public final /* synthetic */ int a;
    public int b;

    static {
        int i = 1;
        e = new zid(0, i);
        f = new zid(i, i);
        g = new zid(2, i);
    }

    public zid() {
        this.a = 14;
        this.b = bl6.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x008a A[EDGE_INSN: B:117:0x008a->B:47:0x008a BREAK  A[LOOP:0: B:10:0x0034->B:17:0x0083], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float a(int i, int i2, String str) {
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        float f2;
        char charAt;
        int i8;
        boolean z3;
        boolean z4;
        char charAt2;
        this.b = i;
        if (i >= i2) {
            return Float.NaN;
        }
        char charAt3 = str.charAt(i);
        if (charAt3 == '+') {
            z = false;
        } else {
            if (charAt3 != '-') {
                z = false;
                int i9 = this.b;
                long j = 0;
                i3 = 0;
                i4 = 0;
                int i10 = 0;
                z2 = false;
                int i11 = 0;
                while (true) {
                    i5 = this.b;
                    if (i5 >= i2) {
                        break;
                    }
                    char charAt4 = str.charAt(i5);
                    if (charAt4 == '0') {
                        if (i3 == 0) {
                            i10++;
                        } else {
                            i4++;
                        }
                    } else if (charAt4 >= '1' && charAt4 <= '9') {
                        int i12 = i3 + i4;
                        while (i4 > 0) {
                            if (j > 922337203685477580L) {
                                return Float.NaN;
                            }
                            j *= 10;
                            i4--;
                        }
                        if (j > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j = (j * 10) + (charAt4 - '0');
                        i3 = i12 + 1;
                        if (j < 0) {
                            return Float.NaN;
                        }
                    } else {
                        if (charAt4 != '.' || z2) {
                            break;
                        }
                        i11 = this.b - i9;
                        z2 = true;
                    }
                    this.b++;
                }
                if (!z2 && this.b == i11 + 1) {
                    return Float.NaN;
                }
                if (i3 == 0) {
                    if (i10 == 0) {
                        return Float.NaN;
                    }
                    i3 = 1;
                }
                if (z2) {
                    i4 = (i11 - i10) - i3;
                }
                i6 = this.b;
                if (i6 < i2 && ((charAt = str.charAt(i6)) == 'E' || charAt == 'e')) {
                    i8 = this.b + 1;
                    this.b = i8;
                    if (i8 != i2) {
                        return Float.NaN;
                    }
                    char charAt5 = str.charAt(i8);
                    if (charAt5 == '+') {
                        z3 = false;
                    } else if (charAt5 != '-') {
                        switch (charAt5) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                z3 = false;
                                z4 = false;
                                break;
                            default:
                                this.b--;
                                z4 = true;
                                z3 = false;
                                break;
                        }
                        if (!z4) {
                            int i13 = this.b;
                            int i14 = 0;
                            while (true) {
                                int i15 = this.b;
                                if (i15 < i2 && (charAt2 = str.charAt(i15)) >= '0' && charAt2 <= '9') {
                                    if (i14 > 922337203685477580L) {
                                        return Float.NaN;
                                    }
                                    i14 = (i14 * 10) + (charAt2 - '0');
                                    this.b++;
                                }
                            }
                            if (this.b == i13) {
                                return Float.NaN;
                            }
                            i4 = z3 ? i4 - i14 : i4 + i14;
                        }
                    } else {
                        z3 = true;
                    }
                    this.b++;
                    z4 = false;
                    if (!z4) {
                    }
                }
                i7 = i3 + i4;
                if (i7 <= 39 || i7 < -44) {
                    return Float.NaN;
                }
                float f3 = j;
                if (j != 0) {
                    if (i4 > 0) {
                        f2 = c[i4];
                    } else if (i4 < 0) {
                        if (i4 < -38) {
                            f3 = (float) (f3 * 1.0E-20d);
                            i4 += 20;
                        }
                        f2 = d[-i4];
                    }
                    f3 *= f2;
                }
                return z ? -f3 : f3;
            }
            z = true;
        }
        this.b++;
        int i92 = this.b;
        long j2 = 0;
        i3 = 0;
        i4 = 0;
        int i102 = 0;
        z2 = false;
        int i112 = 0;
        while (true) {
            i5 = this.b;
            if (i5 >= i2) {
            }
            this.b++;
        }
        if (!z2) {
        }
        if (i3 == 0) {
        }
        if (z2) {
        }
        i6 = this.b;
        if (i6 < i2) {
            i8 = this.b + 1;
            this.b = i8;
            if (i8 != i2) {
            }
        }
        i7 = i3 + i4;
        if (i7 <= 39) {
        }
        return Float.NaN;
    }

    public int c() {
        int i = this.b;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    @Override // defpackage.xid
    public String e() {
        switch (this.a) {
            case 8:
                return fc6.h(this.b, " digits", new StringBuilder("expected at least "));
            default:
                return fc6.h(this.b, " digits", new StringBuilder("expected at most "));
        }
    }

    @Override // defpackage.lkk
    public Object i(wga wgaVar, float f2) {
        int i;
        int i2;
        int argb;
        float f3;
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        int i4 = 0;
        boolean z = wgaVar.Z() == 1;
        if (z) {
            wgaVar.h();
        }
        while (wgaVar.t()) {
            arrayList.add(Float.valueOf((float) wgaVar.H()));
        }
        int i5 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.b = 2;
        }
        if (z) {
            wgaVar.m();
        }
        int i6 = this.b;
        if (i6 == -1) {
            i6 = arrayList.size() / 4;
            this.b = i6;
        }
        float[] fArr = new float[i6];
        int[] iArr = new int[i6];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i = this.b * 4;
            if (i7 >= i) {
                break;
            }
            int i10 = i7 / 4;
            double floatValue = ((Float) arrayList.get(i7)).floatValue();
            int i11 = i4;
            int i12 = i7 % 4;
            if (i12 == 0) {
                if (i10 > 0) {
                    float f4 = (float) floatValue;
                    if (fArr[i10 - 1] >= f4) {
                        fArr[i10] = f4 + 0.01f;
                    }
                }
                fArr[i10] = (float) floatValue;
            } else if (i12 == i3) {
                i8 = (int) (floatValue * 255.0d);
            } else if (i12 == 2) {
                i9 = (int) (floatValue * 255.0d);
            } else if (i12 == 3) {
                iArr[i10] = Color.argb(255, i8, i9, (int) (floatValue * 255.0d));
            }
            i7++;
            i4 = i11;
            i3 = 1;
        }
        int i13 = i4;
        x19 x19Var = new x19(fArr, iArr);
        if (arrayList.size() <= i) {
            return x19Var;
        }
        int size = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i14 = i13;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i14] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i14] = ((Float) arrayList.get(i)).floatValue();
                i14++;
            }
            i++;
        }
        float[] fArr4 = x19Var.a;
        if (fArr4.length == 0) {
            fArr4 = fArr2;
        } else if (size != 0) {
            int length = fArr4.length + size;
            float[] fArr5 = new float[length];
            int i15 = i13;
            int i16 = i15;
            int i17 = i16;
            int i18 = i17;
            while (i15 < length) {
                float f5 = i17 < fArr4.length ? fArr4[i17] : Float.NaN;
                float f6 = i18 < size ? fArr2[i18] : Float.NaN;
                if (Float.isNaN(f6) || f5 < f6) {
                    fArr5[i15] = f5;
                    i17++;
                } else if (Float.isNaN(f5) || f6 < f5) {
                    fArr5[i15] = f6;
                    i18++;
                } else {
                    fArr5[i15] = f5;
                    i17++;
                    i18++;
                    i16++;
                }
                i15++;
            }
            fArr4 = i16 == 0 ? fArr5 : Arrays.copyOf(fArr5, length - i16);
        }
        int length2 = fArr4.length;
        int[] iArr2 = new int[length2];
        int i19 = i13;
        while (i19 < length2) {
            float f7 = fArr4[i19];
            int binarySearch = Arrays.binarySearch(fArr, f7);
            int binarySearch2 = Arrays.binarySearch(fArr2, f7);
            if (binarySearch < 0 || binarySearch2 > 0) {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                float f8 = fArr3[binarySearch2];
                if (i6 >= i5 && f7 != fArr[i13]) {
                    for (int i20 = 1; i20 < i6; i20++) {
                        float f9 = fArr[i20];
                        if (f9 >= f7 || i20 == i6 - 1) {
                            if (i20 != i6 - 1 || f7 < f9) {
                                int i21 = i20 - 1;
                                float f10 = fArr[i21];
                                int s = dy0.s((f7 - f10) / (f9 - f10), iArr[i21], iArr[i20]);
                                i2 = Color.argb((int) (f8 * 255.0f), Color.red(s), Color.green(s), Color.blue(s));
                            } else {
                                i2 = Color.argb((int) (f8 * 255.0f), Color.red(iArr[i20]), Color.green(iArr[i20]), Color.blue(iArr[i20]));
                            }
                        }
                    }
                    a70.p("Unreachable code.");
                    return null;
                }
                i2 = iArr[i13];
                iArr2[i19] = i2;
            } else {
                int i22 = iArr[binarySearch];
                if (size >= i5 && f7 > fArr2[i13]) {
                    for (int i23 = 1; i23 < size; i23++) {
                        float f11 = fArr2[i23];
                        if (f11 >= f7 || i23 == size - 1) {
                            if (f11 <= f7) {
                                f3 = fArr3[i23];
                            } else {
                                int i24 = i23 - 1;
                                float f12 = fArr2[i24];
                                f3 = pkc.f(fArr3[i24], fArr3[i23], (f7 - f12) / (f11 - f12));
                            }
                            argb = Color.argb((int) (f3 * 255.0f), Color.red(i22), Color.green(i22), Color.blue(i22));
                        }
                    }
                    a70.p("Unreachable code.");
                    return null;
                }
                argb = Color.argb((int) (fArr3[i13] * 255.0f), Color.red(i22), Color.green(i22), Color.blue(i22));
                iArr2[i19] = argb;
            }
            i19++;
            i5 = 2;
        }
        return new x19(fArr4, iArr2);
    }

    @Override // defpackage.pmk
    public int l() {
        return this.b;
    }

    @Override // defpackage.pmk
    public int m() {
        return 0;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                int i = this.b;
                return i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "SplitSupportStatus: ERROR_SPLIT_PROPERTY_NOT_DECLARED" : "SplitSupportStatus: UNAVAILABLE" : "SplitSupportStatus: AVAILABLE";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.nmk
    public j80 z(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        return j < ((long) this.b) * 1000000 ? j80Var : j80Var2;
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        switch (this.a) {
            case 16:
                ((zzr) obj).zzdW(this.b);
                break;
            case 17:
                ((zznt) obj).d(this.b);
                break;
            case 18:
                ((zznt) obj).j(this.b);
                break;
            default:
                ((zznt) obj).c(this.b);
                break;
        }
    }

    public /* synthetic */ zid(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public /* synthetic */ zid(zznr zznrVar, int i) {
        this.a = 18;
        this.b = i;
    }

    public /* synthetic */ zid(zznr zznrVar, int i, long j) {
        this.a = 17;
        this.b = i;
    }

    public /* synthetic */ zid(zznr zznrVar, int i, zzba zzbaVar, zzba zzbaVar2) {
        this.a = 19;
        this.b = i;
    }

    public /* synthetic */ zid(int i) {
        this.a = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgvc, defpackage.fon
    /* renamed from: zza */
    public /* synthetic */ Object mo792zza() {
        switch (this.a) {
            case 20:
                return new HandlerThread(fl0.H(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
            default:
                return new HandlerThread(fl0.H(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
        }
    }

    @Override // defpackage.nmk
    public j80 u(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        return j80Var3;
    }
}

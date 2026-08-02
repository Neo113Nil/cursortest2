package defpackage;

import android.graphics.Bitmap;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tfe extends qhh {
    public final nkk m = new nkk(4, false);
    public final nkk n = new nkk(4, false);
    public final sfe o = new sfe(0);
    public Inflater p;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.qhh
    public final kli b(byte[] bArr, int i, boolean z) {
        char c;
        l74 l74Var;
        int i2;
        int i3;
        int i4;
        int u;
        nkk nkkVar = this.m;
        nkkVar.C(bArr, i);
        char c2 = 255;
        if (nkkVar.c() > 0 && (nkkVar.a[nkkVar.b] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 120) {
            Inflater inflater = this.p;
            if (inflater == null) {
                inflater = new Inflater();
                this.p = inflater;
            }
            nkk nkkVar2 = this.n;
            if (lik.v(nkkVar, nkkVar2, inflater)) {
                nkkVar.C(nkkVar2.a, nkkVar2.c);
            }
        }
        sfe sfeVar = this.o;
        int i5 = 0;
        sfeVar.c = 0;
        int[] iArr = sfeVar.a;
        nkk nkkVar3 = (nkk) sfeVar.i;
        sfeVar.d = 0;
        sfeVar.e = 0;
        sfeVar.f = 0;
        sfeVar.g = 0;
        sfeVar.h = 0;
        nkkVar3.B(0);
        sfeVar.b = false;
        ArrayList arrayList = new ArrayList();
        while (nkkVar.c() >= 3) {
            int i6 = nkkVar.c;
            int s = nkkVar.s();
            int x = nkkVar.x();
            int i7 = nkkVar.b + x;
            if (i7 > i6) {
                nkkVar.E(i6);
                i2 = i5;
                c = c2;
                l74Var = null;
            } else {
                char c3 = 128;
                if (s != 128) {
                    switch (s) {
                        case 20:
                            if (x % 5 == 2) {
                                nkkVar.F(2);
                                Arrays.fill(iArr, i5);
                                int i8 = i5;
                                for (int i9 = x / 5; i8 < i9; i9 = i9) {
                                    int s2 = nkkVar.s();
                                    char c4 = c3;
                                    double s3 = nkkVar.s();
                                    double s4 = nkkVar.s() - 128;
                                    double s5 = nkkVar.s() - 128;
                                    iArr[s2] = (lik.h((int) ((1.402d * s4) + s3), 0, 255) << 16) | (nkkVar.s() << 24) | (lik.h((int) ((s3 - (0.34414d * s5)) - (s4 * 0.71414d)), 0, 255) << 8) | lik.h((int) ((s5 * 1.772d) + s3), 0, 255);
                                    i8++;
                                    c3 = c4;
                                    c2 = 255;
                                }
                                c = c2;
                                sfeVar.b = true;
                                break;
                            }
                            c = c2;
                            break;
                        case 21:
                            if (x >= 4) {
                                nkkVar.F(3);
                                int i10 = x - 4;
                                if (((128 & nkkVar.s()) != 0 ? 1 : i5) != 0) {
                                    if (i10 >= 7 && (u = nkkVar.u()) >= 4) {
                                        sfeVar.g = nkkVar.x();
                                        sfeVar.h = nkkVar.x();
                                        nkkVar3.B(u - 4);
                                        i10 = x - 11;
                                    }
                                }
                                int i11 = nkkVar3.b;
                                int i12 = nkkVar3.c;
                                if (i11 < i12 && i10 > 0) {
                                    int min = Math.min(i10, i12 - i11);
                                    nkkVar.e(nkkVar3.a, i11, min);
                                    nkkVar3.E(i11 + min);
                                }
                            }
                            c = c2;
                            break;
                        case 22:
                            if (x >= 19) {
                                sfeVar.c = nkkVar.x();
                                sfeVar.d = nkkVar.x();
                                nkkVar.F(11);
                                sfeVar.e = nkkVar.x();
                                sfeVar.f = nkkVar.x();
                            }
                            c = c2;
                            break;
                        default:
                            c = c2;
                            break;
                    }
                    l74Var = null;
                    i2 = 0;
                } else {
                    c = c2;
                    if (sfeVar.c == 0 || sfeVar.d == 0 || sfeVar.g == 0 || sfeVar.h == 0 || (i3 = nkkVar3.c) == 0 || nkkVar3.b != i3 || !sfeVar.b) {
                        l74Var = null;
                    } else {
                        nkkVar3.E(0);
                        int i13 = sfeVar.g * sfeVar.h;
                        int[] iArr2 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int s6 = nkkVar3.s();
                            if (s6 != 0) {
                                i4 = i14 + 1;
                                iArr2[i14] = iArr[s6];
                            } else {
                                int s7 = nkkVar3.s();
                                if (s7 != 0) {
                                    i4 = ((s7 & 64) == 0 ? s7 & 63 : ((s7 & 63) << 8) | nkkVar3.s()) + i14;
                                    Arrays.fill(iArr2, i14, i4, (s7 & 128) == 0 ? 0 : iArr[nkkVar3.s()]);
                                }
                            }
                            i14 = i4;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, sfeVar.g, sfeVar.h, Bitmap.Config.ARGB_8888);
                        float f = sfeVar.e;
                        float f2 = sfeVar.c;
                        float f3 = f / f2;
                        float f4 = sfeVar.f;
                        float f5 = sfeVar.d;
                        l74Var = new l74(null, null, null, createBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, sfeVar.g / f2, sfeVar.h / f5, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    i2 = 0;
                    sfeVar.c = 0;
                    sfeVar.d = 0;
                    sfeVar.e = 0;
                    sfeVar.f = 0;
                    sfeVar.g = 0;
                    sfeVar.h = 0;
                    nkkVar3.B(0);
                    sfeVar.b = false;
                }
                nkkVar.E(i7);
            }
            if (l74Var != null) {
                arrayList.add(l74Var);
            }
            c2 = c;
            i5 = i2;
        }
        return new se5(Collections.unmodifiableList(arrayList), 2);
    }
}

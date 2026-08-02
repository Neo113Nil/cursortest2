package defpackage;

import androidx.media3.common.b;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tzk implements uzk, vzk, ijn {
    public static final int[] n = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] o = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, Sdk.SDKError.Reason.AD_EXPIRED_ON_PLAY_VALUE, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public static final int[] p = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] q = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, Sdk.SDKError.Reason.AD_EXPIRED_ON_PLAY_VALUE, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public static final int[] r = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] s = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, Sdk.SDKError.Reason.AD_EXPIRED_ON_PLAY_VALUE, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final /* synthetic */ int a = 2;
    public final int b;
    public final byte[] c;
    public final int d;
    public int e;
    public long f;
    public int g;
    public long h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public tzk(zzagk zzagkVar, zzaht zzahtVar, jjn jjnVar) {
        this.i = zzagkVar;
        this.j = zzahtVar;
        this.k = jjnVar;
        int i = jjnVar.b;
        int max = Math.max(1, i / 10);
        this.d = max;
        zzeu zzeuVar = new zzeu((byte[]) jjnVar.f);
        zzeuVar.K();
        int K = zzeuVar.K();
        this.b = K;
        int i2 = jjnVar.a;
        int i3 = jjnVar.c;
        int c = vxd.c(i3 - (i2 * 4), 8, jjnVar.d * i2, 1);
        if (K != c) {
            throw zzat.a(null, x5n.n(new StringBuilder(String.valueOf(c).length() + 34 + String.valueOf(K).length()), c, "Expected frames per block: ", K, "; got: "));
        }
        String str = zzfm.a;
        int i4 = ((max + K) - 1) / K;
        this.c = new byte[i4 * i3];
        this.l = new zzeu((K + K) * i2 * i4);
        int i5 = ((i3 * i) * 8) / K;
        zzt zztVar = new zzt();
        zztVar.d(MimeTypes.AUDIO_RAW);
        zztVar.h = i5;
        zztVar.i = i5;
        zztVar.o = (max + max) * i2;
        zztVar.G = i2;
        int i6 = jjnVar.e;
        zztVar.H = i6 != 0 ? i6 << 2 : -1;
        zztVar.I = i;
        zztVar.J = 2;
        this.m = new zzv(zztVar);
    }

    @Override // defpackage.uzk, defpackage.vzk
    public void a(int i, long j) {
        int i2 = this.a;
        Object obj = this.m;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.k;
        switch (i2) {
            case 0:
                ((ol6) obj3).d(new zzk((k9e) obj4, this.b, i, j));
                ((usj) obj2).a((sm8) obj);
                break;
            default:
                a0l a0lVar = new a0l((k9e) obj4, this.b, i, j);
                ((pl6) obj3).m(a0lVar);
                vsj vsjVar = (vsj) obj2;
                vsjVar.d((b) obj);
                vsjVar.f(a0lVar.e);
                break;
        }
    }

    @Override // defpackage.uzk, defpackage.vzk
    public void b(long j) {
        switch (this.a) {
            case 0:
                this.e = 0;
                this.f = j;
                this.g = 0;
                this.h = 0L;
                break;
            default:
                this.e = 0;
                this.f = j;
                this.g = 0;
                this.h = 0L;
                break;
        }
    }

    @Override // defpackage.ijn
    public void c(long j) {
        this.e = 0;
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.ijn
    public void d(int i, long j) {
        ((zzagk) this.i).c(new kjn((jjn) this.k, this.b, i, j));
        ((zzaht) this.j).e((zzv) this.m);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0047 A[ADDED_TO_REGION, EDGE_INSN: B:48:0x0047->B:14:0x0047 BREAK  A[LOOP:0: B:5:0x0026->B:11:0x0041], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003e -> B:3:0x0023). Please report as a decompilation issue!!! */
    @Override // defpackage.ijn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(com.google.android.gms.internal.ads.zzagi r25, long r26) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tzk.e(com.google.android.gms.internal.ads.zzagi, long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0042 -> B:3:0x0026). Please report as a decompilation issue!!! */
    @Override // defpackage.vzk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean f(nl6 nl6Var, long j) {
        boolean z;
        byte[] bArr;
        int i;
        int i2;
        int i3;
        int read;
        j9e j9eVar = (j9e) this.l;
        int i4 = this.g;
        k9e k9eVar = (k9e) this.k;
        int i5 = i4 / (k9eVar.a * 2);
        int i6 = this.d;
        int i7 = this.b;
        int g = nik.g(i6 - i5, i7);
        int i8 = k9eVar.c;
        int i9 = g * i8;
        if (j != 0) {
            z = false;
            while (true) {
                bArr = this.c;
                if (!!z || (i3 = this.e) >= i9) {
                    break;
                }
                read = nl6Var.read(bArr, this.e, (int) Math.min(i9 - i3, j));
                if (read == -1) {
                    break;
                }
                this.e += read;
            }
            i = this.e / i8;
            if (i > 0) {
                int i10 = 0;
                while (i10 < i) {
                    int i11 = 0;
                    while (true) {
                        int i12 = k9eVar.a;
                        if (i11 < i12) {
                            byte[] bArr2 = j9eVar.a;
                            int i13 = (i11 * 4) + (i10 * i8);
                            int i14 = (i12 * 4) + i13;
                            int i15 = (i8 / i12) - 4;
                            int i16 = (short) ((bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i13 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
                            int i17 = i;
                            int min = Math.min(bArr[i13 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, 88);
                            int[] iArr = q;
                            int i18 = iArr[min];
                            int i19 = ((i10 * i7 * i12) + i11) * 2;
                            bArr2[i19] = (byte) (i16 & 255);
                            bArr2[i19 + 1] = (byte) (i16 >> 8);
                            int i20 = i10;
                            int i21 = 0;
                            while (i21 < i15 * 2) {
                                byte b = bArr[((i21 / 8) * i12 * 4) + i14 + ((i21 / 2) % 4)];
                                int i22 = i21;
                                int i23 = i22 % 2 == 0 ? b & 15 : (b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
                                int i24 = ((((i23 & 7) * 2) + 1) * i18) >> 3;
                                if ((i23 & 8) != 0) {
                                    i24 = -i24;
                                }
                                i16 = nik.j(i16 + i24, -32768, 32767);
                                i19 = (i12 * 2) + i19;
                                bArr2[i19] = (byte) (i16 & 255);
                                bArr2[i19 + 1] = (byte) (i16 >> 8);
                                min = nik.j(min + p[i23], 0, 88);
                                i18 = iArr[min];
                                i21 = i22 + 1;
                            }
                            i11++;
                            i = i17;
                            i10 = i20;
                        }
                    }
                    i10++;
                }
                int i25 = i;
                int i26 = i7 * i25 * 2 * k9eVar.a;
                j9eVar.N(0);
                j9eVar.M(i26);
                this.e -= i25 * i8;
                int i27 = j9eVar.c;
                ((vsj) this.j).g(i27, j9eVar);
                int i28 = this.g + i27;
                this.g = i28;
                if (i28 / (k9eVar.a * 2) >= i6) {
                    h(i6);
                }
            }
            if (z && (i2 = this.g / (k9eVar.a * 2)) > 0) {
                h(i2);
            }
            return z;
        }
        z = true;
        while (true) {
            bArr = this.c;
            if (!z) {
                break;
            }
            break;
            this.e += read;
        }
        i = this.e / i8;
        if (i > 0) {
        }
        if (z) {
            h(i2);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0042 -> B:3:0x0026). Please report as a decompilation issue!!! */
    @Override // defpackage.uzk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g(ml6 ml6Var, long j) {
        boolean z;
        byte[] bArr;
        int i;
        int i2;
        int i3;
        int read;
        nkk nkkVar = (nkk) this.l;
        int i4 = this.g;
        k9e k9eVar = (k9e) this.k;
        int i5 = i4 / (k9eVar.a * 2);
        int i6 = this.d;
        int i7 = this.b;
        int f = lik.f(i6 - i5, i7);
        int i8 = k9eVar.c;
        int i9 = f * i8;
        if (j != 0) {
            z = false;
            while (true) {
                bArr = this.c;
                if (!!z || (i3 = this.e) >= i9) {
                    break;
                }
                read = ml6Var.read(bArr, this.e, (int) Math.min(i9 - i3, j));
                if (read == -1) {
                    break;
                }
                this.e += read;
            }
            i = this.e / i8;
            if (i > 0) {
                int i10 = 0;
                while (i10 < i) {
                    int i11 = 0;
                    while (true) {
                        int i12 = k9eVar.a;
                        if (i11 < i12) {
                            byte[] bArr2 = nkkVar.a;
                            int i13 = (i11 * 4) + (i10 * i8);
                            int i14 = (i12 * 4) + i13;
                            int i15 = (i8 / i12) - 4;
                            int i16 = (short) ((bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i13 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
                            int i17 = i;
                            int min = Math.min(bArr[i13 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, 88);
                            int[] iArr = o;
                            int i18 = iArr[min];
                            int i19 = ((i10 * i7 * i12) + i11) * 2;
                            bArr2[i19] = (byte) (i16 & 255);
                            bArr2[i19 + 1] = (byte) (i16 >> 8);
                            int i20 = i10;
                            int i21 = 0;
                            while (i21 < i15 * 2) {
                                byte b = bArr[((i21 / 8) * i12 * 4) + i14 + ((i21 / 2) % 4)];
                                int i22 = i21;
                                int i23 = i22 % 2 == 0 ? b & 15 : (b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
                                int i24 = ((((i23 & 7) * 2) + 1) * i18) >> 3;
                                if ((i23 & 8) != 0) {
                                    i24 = -i24;
                                }
                                i16 = lik.h(i16 + i24, -32768, 32767);
                                i19 = (i12 * 2) + i19;
                                bArr2[i19] = (byte) (i16 & 255);
                                bArr2[i19 + 1] = (byte) (i16 >> 8);
                                min = lik.h(min + n[i23], 0, 88);
                                i18 = iArr[min];
                                i21 = i22 + 1;
                            }
                            i11++;
                            i = i17;
                            i10 = i20;
                        }
                    }
                    i10++;
                }
                int i25 = i;
                int i26 = i7 * i25 * 2 * k9eVar.a;
                nkkVar.E(0);
                nkkVar.D(i26);
                this.e -= i25 * i8;
                int i27 = nkkVar.c;
                ((usj) this.j).d(i27, nkkVar);
                int i28 = this.g + i27;
                this.g = i28;
                if (i28 / (k9eVar.a * 2) >= i6) {
                    h(i6);
                }
            }
            if (z && (i2 = this.g / (k9eVar.a * 2)) > 0) {
                h(i2);
            }
            return z;
        }
        z = true;
        while (true) {
            bArr = this.c;
            if (!z) {
                break;
            }
            break;
            this.e += read;
        }
        i = this.e / i8;
        if (i > 0) {
        }
        if (z) {
            h(i2);
        }
        return z;
    }

    public void h(int i) {
        int i2 = this.a;
        Object obj = this.j;
        Object obj2 = this.k;
        switch (i2) {
            case 0:
                long D = this.f + lik.D(this.h, 1000000L, r2.b);
                int i3 = i * 2 * ((k9e) obj2).a;
                ((usj) obj).c(D, 1, i3, this.g - i3, null);
                this.h += i;
                this.g -= i3;
                break;
            default:
                long j = this.f;
                long j2 = this.h;
                k9e k9eVar = (k9e) obj2;
                long j3 = k9eVar.b;
                String str = nik.a;
                long b0 = j + nik.b0(j2, 1000000L, j3, RoundingMode.DOWN);
                int i4 = i * 2 * k9eVar.a;
                ((vsj) obj).a(b0, 1, i4, this.g - i4, null);
                this.h += i;
                this.g -= i4;
                break;
        }
    }

    public void i(int i) {
        jjn jjnVar = (jjn) this.k;
        long w = this.f + zzfm.w(this.h, 1000000L, jjnVar.b, RoundingMode.DOWN);
        int i2 = (i + i) * jjnVar.a;
        ((zzaht) this.j).f(w, 1, i2, this.g - i2, null);
        this.h += i;
        this.g -= i2;
    }

    public tzk(ol6 ol6Var, usj usjVar, k9e k9eVar) {
        this.i = ol6Var;
        this.j = usjVar;
        this.k = k9eVar;
        int i = k9eVar.b;
        int max = Math.max(1, i / 10);
        this.d = max;
        byte[] bArr = k9eVar.e;
        int length = bArr.length;
        byte b = bArr[0];
        byte b2 = bArr[1];
        int i2 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
        this.b = i2;
        int i3 = k9eVar.a;
        int i4 = k9eVar.c;
        int i5 = (((i4 - (i3 * 4)) * 8) / (k9eVar.d * i3)) + 1;
        if (i2 == i5) {
            int f = lik.f(max, i2);
            this.c = new byte[f * i4];
            this.l = new nkk(i2 * 2 * i3 * f);
            int i6 = ((i4 * i) * 8) / i2;
            pm8 pm8Var = new pm8();
            pm8Var.k = MimeTypes.AUDIO_RAW;
            pm8Var.f = i6;
            pm8Var.g = i6;
            pm8Var.l = max * 2 * i3;
            pm8Var.x = i3;
            pm8Var.y = i;
            pm8Var.z = 2;
            this.m = new sm8(pm8Var);
            return;
        }
        throw r9e.a("Expected frames per block: " + i5 + "; got: " + i2, null);
    }

    public tzk(pl6 pl6Var, vsj vsjVar, k9e k9eVar) {
        this.i = pl6Var;
        this.j = vsjVar;
        this.k = k9eVar;
        int i = k9eVar.b;
        int max = Math.max(1, i / 10);
        this.d = max;
        j9e j9eVar = new j9e(k9eVar.e);
        j9eVar.t();
        int t = j9eVar.t();
        this.b = t;
        int i2 = k9eVar.a;
        int i3 = k9eVar.c;
        int i4 = (((i3 - (i2 * 4)) * 8) / (k9eVar.d * i2)) + 1;
        if (t == i4) {
            int g = nik.g(max, t);
            this.c = new byte[g * i3];
            this.l = new j9e(t * 2 * i2 * g);
            int i5 = ((i3 * i) * 8) / t;
            qm8 qm8Var = new qm8();
            qm8Var.n = sjc.p(MimeTypes.AUDIO_RAW);
            qm8Var.h = i5;
            qm8Var.i = i5;
            qm8Var.o = max * 2 * i2;
            qm8Var.F = i2;
            qm8Var.G = i;
            qm8Var.H = 2;
            this.m = new b(qm8Var);
            return;
        }
        throw s9e.a(null, "Expected frames per block: " + i4 + "; got: " + t);
    }
}

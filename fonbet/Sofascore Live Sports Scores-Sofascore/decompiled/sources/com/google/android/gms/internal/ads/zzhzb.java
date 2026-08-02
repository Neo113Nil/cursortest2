package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.math.BigInteger;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhzb implements zzhfo {
    public static final byte[] g = new byte[0];
    public static final byte[] h = {0};
    public static final zzhmo i;
    public static final zzhmo j;
    public static final zzhmo k;
    public final ECPublicKey a;
    public final String b;
    public final zziba c;
    public final byte[] d;
    public final byte[] e;
    public final Provider f;

    static {
        zzhmn a = zzhmo.a();
        a.a(zzibq.a, zzhvu.b);
        a.a(zzibq.b, zzhvu.c);
        a.a(zzibq.c, zzhvu.d);
        i = a.b();
        zzhmn a2 = zzhmo.a();
        a2.a(zziba.a, zzhvv.b);
        a2.a(zziba.b, zzhvv.c);
        j = a2.b();
        zzhmn a3 = zzhmo.a();
        a3.a(zziaz.a, zzhvt.c);
        a3.a(zziaz.b, zzhvt.d);
        a3.a(zziaz.c, zzhvt.e);
        k = a3.b();
    }

    public zzhzb(ECPublicKey eCPublicKey, zzibq zzibqVar, zziba zzibaVar, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!zzhlx.a(2)) {
            defpackage.zzl.x("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
            throw null;
        }
        zzicf.b(zzibqVar);
        this.b = zzibqVar.toString().concat("withECDSA");
        this.a = eCPublicKey;
        this.c = zzibaVar;
        this.d = bArr;
        this.e = bArr2;
        this.f = provider;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(byte[] bArr, byte[] bArr2) {
        int i2;
        byte[] bArr3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte b;
        int i8;
        byte b2;
        Signature signature;
        byte[] bArr4;
        int i9;
        zziba zzibaVar = this.c;
        zziba zzibaVar2 = zziba.a;
        ECPublicKey eCPublicKey = this.a;
        if (zzibaVar == zzibaVar2) {
            EllipticCurve curve = eCPublicKey.getParams().getCurve();
            int length = bArr.length;
            int bitLength = (zzhmm.c(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
            if (length != bitLength + bitLength) {
                defpackage.zzl.x("Invalid signature");
                return;
            }
            int length2 = bArr.length;
            if ((length2 & 1) != 0 || length2 == 0 || length2 > 132) {
                defpackage.zzl.x("Invalid IEEE_P1363 encoding");
                return;
            }
            int i10 = length2 >> 1;
            byte[] b3 = zzibb.b(Arrays.copyOf(bArr, i10));
            byte[] b4 = zzibb.b(Arrays.copyOfRange(bArr, i10, length2));
            int length3 = b3.length;
            int length4 = b4.length;
            int i11 = length3 + 4 + length4;
            if (i11 >= 128) {
                bArr3 = new byte[i11 + 3];
                bArr3[0] = 48;
                bArr3[1] = -127;
                bArr3[2] = (byte) i11;
                i9 = 3;
            } else {
                bArr3 = new byte[i11 + 2];
                bArr3[0] = 48;
                bArr3[1] = (byte) i11;
                i9 = 2;
            }
            int i12 = i9 + 1;
            bArr3[i9] = 2;
            int i13 = i9 + 2;
            i2 = 1;
            bArr3[i12] = (byte) length3;
            System.arraycopy(b3, 0, bArr3, i13, length3);
            int i14 = i13 + length3;
            bArr3[i14] = 2;
            bArr3[i14 + 1] = (byte) length4;
            System.arraycopy(b4, 0, bArr3, i14 + 2, length4);
        } else {
            i2 = 1;
            bArr3 = bArr;
        }
        int length5 = bArr3.length;
        if (length5 >= 8 && bArr3[0] == 48) {
            int i15 = bArr3[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i15 == 129) {
                i15 = bArr3[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (i15 >= 128) {
                    i3 = 2;
                    if (i15 == (length5 - 1) - i3 && bArr3[i3 + 1] == 2 && (i7 = (i6 = (i5 = i3 + 3) + (i4 = bArr3[i3 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + 1) < length5 && i4 != 0) {
                        b = bArr3[i5];
                        if ((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 128 && ((i4 <= i2 || b != 0 || (bArr3[i3 + 4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >= 128) && bArr3[i6] == 2)) {
                            i8 = bArr3[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                            if (i6 + 2 + i8 == length5 && i8 != 0) {
                                b2 = bArr3[i3 + 5 + i4];
                                if ((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 128 && (i8 <= 1 || b2 != 0 || (bArr3[i3 + 6 + i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >= 128)) {
                                    String str = this.b;
                                    Provider provider = this.f;
                                    signature = provider == null ? Signature.getInstance(str, provider) : (Signature) zzibh.d.a.zza(str);
                                    signature.initVerify(eCPublicKey);
                                    signature.update(bArr2);
                                    bArr4 = this.e;
                                    if (bArr4.length > 0) {
                                        signature.update(bArr4);
                                    }
                                    try {
                                        if (signature.verify(bArr3)) {
                                            return;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    defpackage.zzl.x("Invalid signature");
                                    return;
                                }
                            }
                        }
                    }
                }
            } else if (i15 != 128 && i15 <= 129) {
                i3 = i2;
                if (i15 == (length5 - 1) - i3) {
                    b = bArr3[i5];
                    if ((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 128) {
                        i8 = bArr3[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (i6 + 2 + i8 == length5) {
                            b2 = bArr3[i3 + 5 + i4];
                            if ((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 128) {
                                String str2 = this.b;
                                Provider provider2 = this.f;
                                if (provider2 == null) {
                                }
                                signature.initVerify(eCPublicKey);
                                signature.update(bArr2);
                                bArr4 = this.e;
                                if (bArr4.length > 0) {
                                }
                                if (signature.verify(bArr3)) {
                                }
                                defpackage.zzl.x("Invalid signature");
                                return;
                            }
                        }
                    }
                }
            }
        }
        defpackage.zzl.x("Invalid signature");
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.d;
        int length = bArr3.length;
        if (length == 0) {
            a(bArr, bArr2);
        } else if (zzhpd.c(bArr3, bArr)) {
            a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        } else {
            defpackage.zzl.x("Invalid signature (output prefix mismatch)");
        }
    }
}

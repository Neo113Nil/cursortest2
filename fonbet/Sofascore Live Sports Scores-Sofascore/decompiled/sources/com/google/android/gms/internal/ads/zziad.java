package com.google.android.gms.internal.ads;

import android.os.Build;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zziad implements zzhfn {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zziad a(zzhye zzhyeVar) {
        Provider a;
        int i = zzhpd.a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            if ((!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).intValue() <= 23) {
                a = null;
                if (a != null) {
                    throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
                }
                KeyFactory keyFactory = KeyFactory.getInstance("RSA", a);
                zzhyg zzhygVar = zzhyeVar.a;
                zzhyc zzhycVar = zzhygVar.a;
                BigInteger bigInteger = zzhygVar.b;
                BigInteger bigInteger2 = zzhycVar.b;
                zzici zziciVar = zzhyeVar.b;
                zzhfr zzhfrVar = zzhfr.a;
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, bigInteger2, zziciVar.a, zzhyeVar.c.a, zzhyeVar.d.a, zzhyeVar.e.a, zzhyeVar.f.a, zzhyeVar.g.a));
                zzhya zzhyaVar = zzhycVar.d;
                zzhya zzhyaVar2 = zzhycVar.e;
                int i2 = zzhycVar.f;
                zzhygVar.c.b();
                zzhycVar.c.getClass();
                zziad zziadVar = new zziad();
                if (!zzhlx.a(2)) {
                    defpackage.zzl.x("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
                    return null;
                }
                zzicf.c(rSAPrivateCrtKey.getModulus().bitLength());
                zzicf.d(rSAPrivateCrtKey.getPublicExponent());
                zziae.a(zzhyaVar);
                zziae.b(zzhyaVar, zzhyaVar2, i2);
                return zziadVar;
            }
        }
        a = zzhmb.a();
        if (a != null) {
        }
    }
}

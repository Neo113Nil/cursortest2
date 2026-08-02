package com.google.android.gms.internal.ads;

import defpackage.wt3;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhor {
    public static zzich a(zzhfm zzhfmVar, Integer num) {
        String str = zzhfmVar.a;
        if (zzhfmVar == zzhfm.e) {
            if (num == null) {
                return zzhnx.a;
            }
            defpackage.zzl.x("RAW output prefix type cannot have an id requirement");
            return null;
        }
        if (num == null) {
            throw new GeneralSecurityException(wt3.m("idRequirement must be non-null for ", str, new StringBuilder(str.length() + 40), " type"));
        }
        if (zzhfmVar == zzhfm.c) {
            return zzhnx.b(num.intValue());
        }
        if (zzhfmVar == zzhfm.d || zzhfmVar == zzhfm.f) {
            return zzhnx.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(str));
    }

    public static int b(zzhfl zzhflVar) {
        if (zzhflVar == zzhfl.b) {
            return 2;
        }
        if (zzhflVar == zzhfl.c) {
            return 3;
        }
        if (zzhflVar == zzhfl.d) {
            return 4;
        }
        if (zzhflVar == zzhfl.e) {
            return 5;
        }
        if (zzhflVar == zzhfl.f) {
            return 6;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(zzhflVar.a));
    }

    public static zzhfl c(int i) {
        int i2 = i - 2;
        if (i2 == 0) {
            return zzhfl.b;
        }
        if (i2 == 1) {
            return zzhfl.c;
        }
        if (i2 == 2) {
            return zzhfl.d;
        }
        if (i2 == 3) {
            return zzhfl.e;
        }
        if (i2 == 4) {
            return zzhfl.f;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(Integer.toString(i2)));
    }

    public static zzhfm d(int i) {
        int i2 = i - 2;
        if (i2 == 0) {
            return zzhfm.b;
        }
        if (i2 == 1) {
            return zzhfm.c;
        }
        if (i2 == 2) {
            return zzhfm.d;
        }
        if (i2 == 3) {
            return zzhfm.e;
        }
        if (i2 == 4) {
            return zzhfm.f;
        }
        if (i2 == 5) {
            return zzhfm.g;
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(Integer.toString(i2)));
    }

    public static int e(zzhfm zzhfmVar) {
        if (zzhfmVar == zzhfm.b) {
            return 2;
        }
        if (zzhfmVar == zzhfm.c) {
            return 3;
        }
        if (zzhfmVar == zzhfm.d) {
            return 4;
        }
        if (zzhfmVar == zzhfm.e) {
            return 5;
        }
        if (zzhfmVar == zzhfm.f) {
            return 6;
        }
        if (zzhfmVar == zzhfm.g) {
            return 7;
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(zzhfmVar.a));
    }
}

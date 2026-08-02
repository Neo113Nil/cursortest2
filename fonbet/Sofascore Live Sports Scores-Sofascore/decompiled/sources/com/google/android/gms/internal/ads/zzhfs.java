package com.google.android.gms.internal.ads;

import defpackage.dpo;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhfs {
    public static zzhfd a(String str) {
        try {
            try {
                byte[] d = new zzher(new ByteArrayInputStream(str.getBytes(zzher.b))).a().d();
                try {
                    zziew zziewVar = zziew.b;
                    int i = dpo.a;
                    zzhuc H = zzhuc.H(d, zziew.c);
                    for (zzhub zzhubVar : H.E()) {
                        if (zzhubVar.E().J() == 2 || zzhubVar.E().J() == 3 || zzhubVar.E().J() == 4) {
                            int J = zzhubVar.E().J();
                            throw new GeneralSecurityException("keyset contains key material of type " + (J != 2 ? J != 3 ? J != 4 ? J != 5 ? J != 6 ? "UNRECOGNIZED" : "REMOTE" : "ASYMMETRIC_PUBLIC" : "ASYMMETRIC_PRIVATE" : "SYMMETRIC" : "UNKNOWN_KEYMATERIAL") + " for type url " + zzhubVar.E().D());
                        }
                    }
                    return zzhfd.a(H);
                } catch (zzige unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (zzige unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            defpackage.zzl.x("Parse keyset failed");
            return null;
        }
    }
}

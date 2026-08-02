package com.google.android.gms.internal.fido;

import defpackage.f6a;
import defpackage.fc6;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzhp implements Comparable {
    public static int c(byte b) {
        return (b >> 5) & 7;
    }

    public static void d(String str) {
        new zzhn(str);
    }

    public static zzhp e(byte... bArr) {
        bArr.getClass();
        zzhs zzhsVar = new zzhs(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return f6a.P(zzhsVar);
        } finally {
            try {
                zzhsVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public int a() {
        return 0;
    }

    public final zzhp b(Class cls) {
        if (cls.isInstance(this)) {
            return (zzhp) cls.cast(this);
        }
        throw new zzho(fc6.n("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public abstract int zza();
}

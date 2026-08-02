package com.google.android.gms.internal.pal;

import defpackage.e3c;
import defpackage.kcn;
import defpackage.sdn;
import defpackage.wdn;
import defpackage.xdn;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzach extends zzabo {
    public static final Logger b = Logger.getLogger(zzach.class.getName());
    public static final boolean c = sdn.e;
    public e3c a;

    private zzach() {
    }

    public static int a(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int b(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int c(int i, zzaef zzaefVar, kcn kcnVar) {
        int a = a(i << 3);
        int i2 = a + a;
        zzabi zzabiVar = (zzabi) zzaefVar;
        int b2 = zzabiVar.b();
        if (b2 == -1) {
            b2 = kcnVar.zza(zzabiVar);
            zzabiVar.c(b2);
        }
        return i2 + b2;
    }

    public static int d(int i) {
        if (i >= 0) {
            return a(i);
        }
        return 10;
    }

    public static int e(String str) {
        int length;
        try {
            length = xdn.c(str);
        } catch (wdn unused) {
            length = str.getBytes(zzadg.a).length;
        }
        return a(length) + length;
    }

    public static int f(int i) {
        return a(i << 3);
    }
}

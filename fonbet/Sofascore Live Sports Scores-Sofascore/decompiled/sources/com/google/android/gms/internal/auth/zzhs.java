package com.google.android.gms.internal.auth;

import defpackage.bdo;
import defpackage.bm2;
import defpackage.ido;
import defpackage.nco;
import defpackage.uco;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhs extends zzev implements zzfy {
    private static final zzhs zzb;
    private zzez zzd = uco.d;

    static {
        zzhs zzhsVar = new zzhs();
        zzb = zzhsVar;
        zzev.d(zzhsVar);
    }

    private zzhs() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        if (r7 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzhs i(byte[] bArr) {
        zzhs zzhsVar = zzb;
        int length = bArr.length;
        zzel zzelVar = zzel.a;
        zzev zzevVar = (zzev) zzhsVar.g(4);
        try {
            nco ncoVar = nco.c;
            ido a = ncoVar.a(zzevVar.getClass());
            bm2 bm2Var = new bm2(6);
            zzelVar.getClass();
            a.b(zzevVar, bArr, 0, length, bm2Var);
            a.a(zzevVar);
            byte byteValue = ((Byte) zzevVar.g(1)).byteValue();
            if (byteValue != 1) {
                if (byteValue != 0) {
                    boolean f = ncoVar.a(zzevVar.getClass()).f(zzevVar);
                    zzevVar.g(2);
                }
                throw new zzfb(new zzgy("Message was missing required fields.  (Lite runtime could not determine which fields were missing).").getMessage());
            }
            return (zzhs) zzevVar;
        } catch (zzfb e) {
            throw e;
        } catch (zzgy e2) {
            throw new zzfb(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzfb) {
                throw ((zzfb) e3.getCause());
            }
            throw new zzfb(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw zzfb.h();
        }
    }

    @Override // com.google.android.gms.internal.auth.zzev
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new bdo(zzb, new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzhs();
        }
        if (i2 == 4) {
            return new zzhr(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}

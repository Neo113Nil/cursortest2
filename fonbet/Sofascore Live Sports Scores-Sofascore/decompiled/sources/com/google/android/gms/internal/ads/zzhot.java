package com.google.android.gms.internal.ads;

import defpackage.mpo;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhot implements zzhow {
    public final zzich a;
    public final zzhtw b;
    public final zzhfm c;

    public zzhot(zzhtw zzhtwVar, zzich zzichVar, zzhfm zzhfmVar) {
        this.b = zzhtwVar;
        this.a = zzichVar;
        this.c = zzhfmVar;
    }

    public static zzhot a(String str, zzhfm zzhfmVar, mpo mpoVar) {
        int i;
        zzhtv G = zzhtw.G();
        G.n();
        ((zzhtw) G.b).J(str);
        if (zzhfmVar == zzhfm.b) {
            i = 2;
        } else if (zzhfmVar == zzhfm.c) {
            i = 3;
        } else if (zzhfmVar == zzhfm.d) {
            i = 4;
        } else if (zzhfmVar == zzhfm.e) {
            i = 5;
        } else if (zzhfmVar == zzhfm.f) {
            i = 6;
        } else {
            if (zzhfmVar != zzhfm.g) {
                throw new GeneralSecurityException("Unknown OutputPrefixType ".concat(zzhfmVar.a));
            }
            i = 7;
        }
        G.n();
        ((zzhtw) G.b).M(i);
        G.n();
        ((zzhtw) G.b).K(mpoVar);
        return b((zzhtw) G.o());
    }

    public static zzhot b(zzhtw zzhtwVar) {
        zzhfm zzhfmVar;
        zzich b = zzhpd.b(zzhtwVar.D());
        int L = zzhtwVar.L() - 2;
        if (L == 0) {
            zzhfmVar = zzhfm.b;
        } else if (L == 1) {
            zzhfmVar = zzhfm.c;
        } else if (L == 2) {
            zzhfmVar = zzhfm.d;
        } else if (L == 3) {
            zzhfmVar = zzhfm.e;
        } else if (L == 4) {
            zzhfmVar = zzhfm.f;
        } else {
            if (L != 5) {
                throw new GeneralSecurityException("Unknown OutputPrefixType ".concat(Integer.toString(L)));
            }
            zzhfmVar = zzhfm.g;
        }
        return new zzhot(zzhtwVar, b, zzhfmVar);
    }
}

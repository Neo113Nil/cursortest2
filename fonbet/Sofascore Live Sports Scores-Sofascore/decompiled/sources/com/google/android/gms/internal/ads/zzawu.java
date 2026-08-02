package com.google.android.gms.internal.ads;

import defpackage.dio;
import defpackage.fio;
import defpackage.kio;
import defpackage.qio;
import defpackage.x5n;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzawu {
    public static final HashMap a;

    static {
        zzgxz zzgxzVar;
        zzgxx zzgxxVar = new zzgxx();
        int i = 0;
        zzgxxVar.a(zzawf.a, -42L, -64L);
        zzgxxVar.a(zzawf.b, -6L, -53L);
        zzgxxVar.a(zzawf.c, -41L, -31L);
        zzgxxVar.a(zzawf.d, -40L, -28L);
        zzgxxVar.a(zzawf.e, -29L, -37L);
        zzgxxVar.a(zzawf.f, -80L, -32L);
        zzgxxVar.a(zzawf.g, -17L, -36L);
        zzgxxVar.a(zzawf.h, -82L, -35L);
        zzgxxVar.a(zzawf.i, -63L, -52L);
        zzgxxVar.a(zzawf.j, -23L, -11L);
        zzgxxVar.a(zzawf.k, -69L, -68L);
        zzgxxVar.a(zzawf.l, -62L, -55L);
        zzgxxVar.a(zzawf.m, -78L, -25L);
        zzgxxVar.a(zzawf.n, -71L, -3L);
        zzgxxVar.a(zzawf.o, -18L, -4L);
        zzgxxVar.a(zzawf.p, -67L, -19L);
        zzgxxVar.a(zzawf.q, -58L);
        zzgxxVar.a(zzawf.r, -2L);
        zzgxxVar.a(zzawf.s, -34L);
        zzgxxVar.a(zzawf.t, -30L);
        zzgxxVar.a(zzawf.u, -56L);
        zzgxxVar.a(zzawf.w, -57L);
        zzgxxVar.a(zzawf.x, -66L);
        zzgxxVar.a(zzawf.y, -60L);
        zzgxxVar.a(zzawf.z, -27L);
        zzgxxVar.a(zzawf.A, -26L);
        zzgxxVar.a(zzawf.B, -74L);
        zzgxxVar.a(zzawf.C, -77L);
        zzgxxVar.a(zzawf.E, -38L);
        zzgxxVar.a(zzawf.G, -79L);
        zzgxxVar.a(zzawf.H, -7L);
        zzgxxVar.a(zzawf.I, -51L);
        zzgxxVar.a(zzawf.J, -9L);
        zzgxxVar.a(zzawf.K, -47L);
        zzgxxVar.a(zzawf.L, -70L);
        zzgxxVar.a(zzawf.M, -14L);
        zzgxxVar.a(zzawf.N, -5L);
        zzgxxVar.a(zzawf.O, -39L);
        zzgxxVar.a(zzawf.P, -8L);
        zzgxxVar.a(zzawf.Q, -54L);
        zzgxxVar.a(zzawf.R, -15L);
        zzgxxVar.a(zzawf.S, -12L);
        zzgxxVar.a(zzawf.T, -21L);
        zzgxxVar.a(zzawf.U, -43L);
        zzgxxVar.a(zzawf.F, -20L);
        zzgxxVar.a(zzawf.D, -81L);
        zzgxxVar.a(zzawf.V, -46L);
        zzgxxVar.a(zzawf.W, -61L);
        zzgxxVar.a(zzawf.X, -44L);
        zzgxxVar.a(zzawf.v, -59L);
        zzgxxVar.a(zzawf.Y, -49L);
        zzgxxVar.a(zzawf.Z, -75L);
        zzgxxVar.a(zzawf.a0, -24L);
        zzgxxVar.a(zzawf.f0, -13L);
        zzgxxVar.a(zzawf.g0, -1L);
        zzgxxVar.a(zzawf.b0, -33L);
        zzgxxVar.a(zzawf.c0, -45L);
        zzgxxVar.a(zzawf.d0, -50L);
        zzgxxVar.a(zzawf.e0, -65L);
        zzgxxVar.a(zzawf.h0, -16L);
        zzgxxVar.a(zzawf.i0, -73L);
        zzgxxVar.a(zzawf.j0, -10L);
        zzgxxVar.a(zzawf.k0, -48L);
        zzgxxVar.a(zzawf.l0, -22L);
        zzgxxVar.a(zzawf.m0, -76L);
        zzgxxVar.a(zzawf.n0, -72L);
        fio fioVar = zzgxxVar.a;
        if (fioVar == null) {
            zzgxzVar = kio.g;
        } else {
            Collection entrySet = fioVar.entrySet();
            if (((AbstractCollection) entrySet).isEmpty()) {
                zzgxzVar = kio.g;
            } else {
                dio dioVar = (dio) entrySet;
                zzgxo zzgxoVar = new zzgxo(dioVar.b.size());
                Iterator it = dioVar.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    zzgxw u = zzgxw.u(((zzgxv) entry.getValue()).h());
                    if (!u.isEmpty()) {
                        zzgxoVar.a(key, u);
                        i += u.size();
                    }
                }
                zzgxzVar = new zzgxz(zzgxoVar.d(true), i);
            }
        }
        qio qioVar = zzgxzVar.f;
        if (qioVar == null) {
            qioVar = new qio(zzgxzVar);
            zzgxzVar.f = qioVar;
        }
        zzhaa it2 = qioVar.iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            if (((Long) entry2.getValue()).longValue() > -1 || ((Long) entry2.getValue()).longValue() < -82) {
                throw new zzawt(zzawc.a("DkWkogARIjm8VAqEzyEdNWdUqAjIW8EtmA==").concat(String.valueOf(entry2.getValue())));
            }
        }
        HashMap hashMap = new HashMap();
        qio qioVar2 = zzgxzVar.f;
        if (qioVar2 == null) {
            qioVar2 = new qio(zzgxzVar);
            zzgxzVar.f = qioVar2;
        }
        zzhaa it3 = qioVar2.iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            zzawf zzawfVar = (zzawf) entry3.getKey();
            Long l = (Long) entry3.getValue();
            long longValue = l.longValue();
            if (hashMap.containsKey(l)) {
                String valueOf = String.valueOf(hashMap.get(l));
                String valueOf2 = String.valueOf(zzawfVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + x5n.f(27, longValue) + 5 + valueOf2.length());
                String a2 = zzawc.a("H16u7wATM3S4Tl6egTYIeX5f+xfdXtsmmA==");
                String a3 = zzawc.a("cQk=");
                String a4 = zzawc.a("a0ivq0U=");
                sb.append(a2);
                sb.append(longValue);
                sb.append(a3);
                sb.append(valueOf);
                sb.append(a4);
                sb.append(valueOf2);
                throw new zzawt(sb.toString());
            }
            hashMap.put(l, zzawfVar);
        }
        a = hashMap;
    }
}

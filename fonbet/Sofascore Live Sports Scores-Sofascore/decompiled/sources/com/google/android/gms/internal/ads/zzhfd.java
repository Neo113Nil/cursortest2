package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.fn0;
import defpackage.hbo;
import defpackage.hmo;
import defpackage.kif;
import defpackage.mno;
import defpackage.ug5;
import defpackage.wkf;
import defpackage.x5n;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhfd implements zzhfe {
    public final List a;
    public final Map b;
    public final zzhfd c;

    public zzhfd(List list, Map map) {
        this.a = list;
        this.b = map;
        if (((AtomicBoolean) zzhlv.a.b).get()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                zzhfb zzhfbVar = (zzhfb) it.next();
                int i = zzhfbVar.c;
                if (hashSet.contains(Integer.valueOf(i))) {
                    throw new GeneralSecurityException(fn0.k(i, "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.", new StringBuilder(String.valueOf(i).length() + Sdk.SDKError.Reason.TPAT_ERROR_VALUE)));
                }
                hashSet.add(Integer.valueOf(i));
                z |= zzhfbVar.d;
            }
            if (!z) {
                defpackage.zzl.x("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                throw null;
            }
        }
        this.c = null;
    }

    public static final zzhfd a(zzhuc zzhucVar) {
        zzhes zzhneVar;
        boolean z;
        if (zzhucVar == null || zzhucVar.F() <= 0) {
            defpackage.zzl.x("empty keyset");
            return null;
        }
        ArrayList arrayList = new ArrayList(zzhucVar.F());
        for (zzhub zzhubVar : zzhucVar.E()) {
            int F = zzhubVar.F();
            try {
                zzhos g = g(zzhubVar);
                zzhnw zzhnwVar = zzhnw.b;
                zzhfr zzhfrVar = zzhfr.a;
                zzhpa zzhpaVar = (zzhpa) zzhnwVar.a.get();
                zzhpaVar.getClass();
                zzhneVar = !zzhpaVar.b.containsKey(new mno(zzhos.class, g.b)) ? new zzhne(g) : zzhnwVar.e(g, zzhfrVar);
                z = false;
            } catch (GeneralSecurityException e) {
                if (((AtomicBoolean) zzhlv.a.b).get()) {
                    throw e;
                }
                zzhos g2 = g(zzhubVar);
                zzhfr zzhfrVar2 = zzhfr.a;
                zzhneVar = new zzhne(g2);
                z = true;
            }
            if (((AtomicBoolean) zzhlv.a.b).get() && !h(zzhubVar.J())) {
                defpackage.zzl.x("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                return null;
            }
            boolean z2 = true;
            int J = zzhubVar.J();
            if (F != zzhucVar.D()) {
                z2 = false;
            }
            arrayList.add(new zzhfb(zzhneVar, J, F, z2, z, kif.m));
        }
        return new zzhfd(Collections.unmodifiableList(arrayList), new HashMap());
    }

    public static final zzhfd e(zzhfj zzhfjVar) {
        int i;
        zzhey zzheyVar = new zzhey();
        zzhew zzhewVar = new zzhew(zzhfjVar);
        ug5 ug5Var = ug5.g;
        zzhewVar.c = ug5Var;
        zzhewVar.a = true;
        ArrayList arrayList = zzheyVar.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zzhew) it.next()).a = false;
        }
        arrayList.add(zzhewVar);
        if (zzheyVar.c) {
            defpackage.zzl.x("KeysetHandle.Builder#build must only be called once");
            return null;
        }
        zzheyVar.c = true;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i2 = 0;
        while (i2 < arrayList.size() - 1) {
            int i3 = i2 + 1;
            if (((zzhew) arrayList.get(i2)).c == ug5Var && ((zzhew) arrayList.get(i3)).c != ug5Var) {
                defpackage.zzl.x("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                return null;
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = arrayList.iterator();
        Integer num = null;
        while (it2.hasNext()) {
            zzhew zzhewVar2 = (zzhew) it2.next();
            zzhewVar2.getClass();
            zzhfj zzhfjVar2 = zzhewVar2.b;
            ug5 ug5Var2 = zzhewVar2.c;
            if (ug5Var2 == null) {
                defpackage.zzl.x("No ID was set (with withFixedId or withRandomId)");
                return null;
            }
            if (ug5Var2 == ug5Var) {
                int i4 = 0;
                while (true) {
                    if (i4 != 0 && !hashSet.contains(Integer.valueOf(i4))) {
                        break;
                    }
                    int i5 = zzhpd.a;
                    i4 = 0;
                    while (i4 == 0) {
                        byte[] a = zzhov.a(4);
                        i4 = (a[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((a[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((a[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((a[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
                    }
                }
                i = i4;
            } else {
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf)) {
                throw new GeneralSecurityException(fn0.k(i, "Id ", " is used twice in the keyset", new StringBuilder(String.valueOf(i).length() + 31)));
            }
            hashSet.add(valueOf);
            zzhes b = zzhnn.b.b(zzhfjVar2, true != zzhfjVar2.a() ? null : valueOf);
            boolean z = zzhewVar2.a;
            zzhfb zzhfbVar = new zzhfb(b, 3, i, z, false, kif.m);
            if (z) {
                if (num != null) {
                    defpackage.zzl.x("Two primaries were set");
                    return null;
                }
                num = valueOf;
            }
            arrayList2.add(zzhfbVar);
        }
        if (num == null) {
            defpackage.zzl.x("No primary was set");
            return null;
        }
        zzhfd zzhfdVar = new zzhfd(arrayList2, zzheyVar.b);
        zzhnh zzhnhVar = (zzhnh) zzhfdVar.zzf();
        if (zzhnhVar == null) {
            return zzhfdVar;
        }
        wkf wkfVar = new wkf(zzhfdVar, zzhnhVar);
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            zzhfb zzhfbVar2 = (zzhfb) it3.next();
            arrayList3.add(new zzhfb(zzhfbVar2.a, zzhfbVar2.g, zzhfbVar2.c, zzhfbVar2.d, zzhfbVar2.e, wkfVar));
        }
        return new zzhfd(arrayList3, zzhfdVar.b, zzhfdVar);
    }

    public static zzhos g(zzhub zzhubVar) {
        return zzhos.a(zzhubVar.E().D(), zzhubVar.E().E(), zzhor.c(zzhubVar.E().J()), zzhor.d(zzhubVar.K()), zzhubVar.K() == 5 ? null : Integer.valueOf(zzhubVar.F()));
    }

    public static boolean h(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public final zzhuc b() {
        try {
            zzhtz J = zzhuc.J();
            for (zzhfb zzhfbVar : this.a) {
                zzhes a = zzhfbVar.a();
                int i = zzhfbVar.c;
                int i2 = zzhfbVar.g;
                zzhos zzhosVar = (zzhos) zzhnw.b.f(a, zzhfr.a);
                Integer b = a.b();
                if (b != null && b.intValue() != i) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzhua G = zzhub.G();
                zzhts F = zzhtt.F();
                String str = zzhosVar.a;
                F.n();
                ((zzhtt) F.b).H(str);
                zziei zzieiVar = zzhosVar.c;
                F.n();
                ((zzhtt) F.b).I(zzieiVar);
                int b2 = zzhor.b(zzhosVar.d);
                F.n();
                ((zzhtt) F.b).K(b2);
                G.n();
                ((zzhub) G.b).H((zzhtt) F.o());
                G.n();
                ((zzhub) G.b).L(i2);
                G.n();
                ((zzhub) G.b).I(i);
                int e = zzhor.e(zzhosVar.e);
                G.n();
                ((zzhub) G.b).M(e);
                zzhub zzhubVar = (zzhub) G.o();
                J.n();
                ((zzhuc) J.b).L(zzhubVar);
                if (zzhfbVar.d) {
                    J.n();
                    ((zzhuc) J.b).K(i);
                }
            }
            return (zzhuc) J.o();
        } catch (GeneralSecurityException e2) {
            hbo.j(e2);
            return null;
        }
    }

    public final zzhfb c() {
        for (zzhfb zzhfbVar : this.a) {
            if (zzhfbVar != null && zzhfbVar.d) {
                if (zzhfbVar.b == zzheu.b) {
                    return zzhfbVar;
                }
                a70.r("Keyset has primary which isn't enabled");
                return null;
            }
        }
        a70.r("Keyset has no valid primary");
        return null;
    }

    public final zzhfb d(int i) {
        List list = this.a;
        if (i < 0 || i >= list.size()) {
            int size = list.size();
            defpackage.zzl.r(x5n.n(new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(size).length()), i, "Invalid index ", size, " for keyset of size "));
            return null;
        }
        zzhfb zzhfbVar = (zzhfb) list.get(i);
        if (!h(zzhfbVar.g)) {
            a70.r(fn0.k(i, "Keyset-Entry at position ", " has wrong status", new StringBuilder(String.valueOf(i).length() + 42)));
            return null;
        }
        if (!zzhfbVar.e) {
            return (zzhfb) list.get(i);
        }
        a70.r(fn0.k(i, "Keyset-Entry at position ", " didn't parse correctly", new StringBuilder(String.valueOf(i).length() + 48)));
        return null;
    }

    public final Object f(zzhep zzhepVar, Class cls) {
        zzhfd zzhfdVar = this.c;
        zzhuc b = (zzhfdVar == null ? this : zzhfdVar).b();
        int i = hmo.a;
        int D = b.D();
        int i2 = 0;
        boolean z = true;
        int i3 = 0;
        boolean z2 = false;
        for (zzhub zzhubVar : b.E()) {
            if (zzhubVar.J() == 3) {
                if (!zzhubVar.D()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhubVar.F())));
                }
                if (zzhubVar.K() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhubVar.F())));
                }
                if (zzhubVar.J() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhubVar.F())));
                }
                if (zzhubVar.F() == D) {
                    if (z2) {
                        defpackage.zzl.x("keyset contains multiple primary keys");
                        return null;
                    }
                    z2 = true;
                }
                z &= zzhubVar.E().J() == 5;
                i3++;
            }
        }
        if (i3 == 0) {
            defpackage.zzl.x("keyset must contain at least one ENABLED key");
            return null;
        }
        if (!z2 && !z) {
            defpackage.zzl.x("keyset doesn't contain a valid primary key");
            return null;
        }
        while (true) {
            List list = this.a;
            if (i2 >= list.size()) {
                if (zzhfdVar != null) {
                    this = zzhfdVar;
                }
                return zzhepVar.c(this, cls);
            }
            if (((zzhfb) list.get(i2)).e || !h(((zzhfb) list.get(i2)).g)) {
                break;
            }
            i2++;
        }
        String D2 = b.G(i2).E().D();
        StringBuilder sb = new StringBuilder(String.valueOf(D2).length() + String.valueOf(i2).length() + 44 + 32);
        fn0.s(i2, "Key parsing of key with index ", " and type_url ", D2, sb);
        sb.append(" failed, unable to get primitive");
        throw new GeneralSecurityException(sb.toString());
    }

    public final String toString() {
        zzhuc b = b();
        int i = hmo.a;
        zzhud D = zzhug.D();
        int D2 = b.D();
        D.n();
        ((zzhug) D.b).E(D2);
        for (zzhub zzhubVar : b.E()) {
            zzhue D3 = zzhuf.D();
            String D4 = zzhubVar.E().D();
            D3.n();
            ((zzhuf) D3.b).E(D4);
            int J = zzhubVar.J();
            D3.n();
            ((zzhuf) D3.b).G(J);
            int K = zzhubVar.K();
            D3.n();
            ((zzhuf) D3.b).H(K);
            int F = zzhubVar.F();
            D3.n();
            ((zzhuf) D3.b).F(F);
            zzhuf zzhufVar = (zzhuf) D3.o();
            D.n();
            ((zzhug) D.b).F(zzhufVar);
        }
        return ((zzhug) D.o()).toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfe
    public final int zzd() {
        return this.a.size();
    }

    @Override // com.google.android.gms.internal.ads.zzhfe
    public final zzhel zzf() {
        return (zzhel) this.b.get(zzhnh.class);
    }

    public zzhfd(ArrayList arrayList, Map map, zzhfd zzhfdVar) {
        this.a = arrayList;
        this.b = map;
        this.c = zzhfdVar;
    }
}

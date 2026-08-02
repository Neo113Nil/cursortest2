package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcbx;
import com.google.android.gms.internal.ads.zzejb;
import com.google.android.gms.internal.ads.zzejg;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfqw;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.c4o;
import defpackage.d1l;
import defpackage.ddb;
import defpackage.een;
import defpackage.f0o;
import defpackage.fff;
import defpackage.g4o;
import defpackage.hlo;
import defpackage.hsn;
import defpackage.igf;
import defpackage.pff;
import defpackage.pyh;
import defpackage.r0o;
import defpackage.sgo;
import defpackage.spn;
import defpackage.t3n;
import defpackage.tun;
import defpackage.uun;
import defpackage.vlo;
import defpackage.x7o;
import defpackage.xlo;
import defpackage.yvn;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzejg extends zzcbh {
    public final Context a;
    public final zzhdi b;
    public final zzejo c;
    public final zzcob d;
    public final ArrayDeque e;
    public final zzfrj f;
    public final zzcny g;

    public zzejg(Context context, zzhdi zzhdiVar, zzccd zzccdVar, zzcob zzcobVar, zzejo zzejoVar, ArrayDeque arrayDeque, zzfrj zzfrjVar, zzcny zzcnyVar) {
        zzbjg.a(context);
        this.a = context;
        this.b = zzhdiVar;
        this.c = zzejoVar;
        this.d = zzcobVar;
        this.e = arrayDeque;
        this.f = zzfrjVar;
        this.g = zzcnyVar;
    }

    public static zzfpp I4(zzfpp zzfppVar, zzfqi zzfqiVar, zzbva zzbvaVar, zzfrg zzfrgVar, zzfqw zzfqwVar) {
        zzbve a = zzbvaVar.a("AFMA_getAdDictionary", zzbux.a, igf.h);
        zzfrf.a(zzfppVar, zzfqwVar);
        zzfpp d = zzfqiVar.a(zzfppVar, zzfqc.BUILD_URL).b(a).d();
        if (!((Boolean) zzbla.c.c()).booleanValue()) {
            return d;
        }
        zzhcq r = zzhcq.r(d);
        f0o f0oVar = new f0o(17, zzfrgVar, zzfqwVar);
        r.addListener(new vlo(0, r, f0oVar), zzcgj.h);
        return d;
    }

    public final zzfpp E4(zzcbv zzcbvVar, int i) {
        zzejb K4;
        boolean z;
        zzfpp d;
        zzbur zzr = com.google.android.gms.ads.internal.zzt.zzr();
        VersionInfoParcel forPackage = VersionInfoParcel.forPackage();
        zzfrj zzfrjVar = this.f;
        Context context = this.a;
        zzbva a = zzr.a(context, forPackage, zzfrjVar);
        zzfek s = this.d.s(zzcbvVar, i);
        zzbve a2 = a.a("google.afma.response.normalize", zzejd.d, fff.d);
        if (((Boolean) zzblo.a.c()).booleanValue()) {
            K4 = K4(zzcbvVar.h);
            if (K4 == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzcbvVar.j;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
            K4 = null;
        }
        zzfqw e = K4 == null ? zzfqw.e(9, context) : K4.d;
        zzfrg c = s.c();
        c.b(zzcbvVar.a.getStringArrayList("ad_types"));
        zzejn zzejnVar = new zzejn(zzcbvVar.g, c, e, this.g);
        zzejk zzejkVar = new zzejk(context, zzcbvVar.b.afmaVersion, null);
        zzfqi b = s.b();
        zzfqw e2 = zzfqw.e(11, context);
        zzfqc zzfqcVar = zzfqc.PRE_PROCESS;
        zzfqc zzfqcVar2 = zzfqc.HTTP;
        if (K4 == null) {
            zzfpp d2 = b.a(zzhcy.a(zzcbvVar.a), zzfqc.GMS_SIGNALS).b(new spn(8, s, zzcbvVar)).a(pff.i).d();
            zzfpp I4 = I4(d2, b, a, c, e);
            zzfqw e3 = zzfqw.e(10, context);
            zzfpp d3 = new zzfpr(b, zzfqcVar2, Arrays.asList(I4, d2)).a(new t3n(5, I4, zzcbvVar, d2)).a(zzejnVar).a(new d1l(e3, 22)).a(zzejkVar).d();
            zzfrf.c(d3, c, e3, false);
            zzfrf.a(d3, e2);
            d = new zzfpr(b, zzfqcVar, Arrays.asList(d2, I4, d3)).a(new r0o(zzcbvVar, d3, d2, I4, 1)).b(a2).d();
            z = false;
        } else {
            zzejm zzejmVar = new zzejm(K4.b, K4.a);
            zzfqw e4 = zzfqw.e(10, context);
            zzfpp d4 = b.a(zzhcy.a(zzejmVar), zzfqcVar2).a(zzejnVar).a(new d1l(e4, 22)).a(zzejkVar).d();
            z = false;
            zzfrf.c(d4, c, e4, false);
            xlo a3 = zzhcy.a(K4);
            zzfrf.a(d4, e2);
            d = new zzfpr(b, zzfqcVar, Arrays.asList(d4, a3)).a(new een(9, d4, a3)).b(a2).d();
        }
        zzfrf.c(d, c, e2, z);
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void F0(zzcbv zzcbvVar, zzcbm zzcbmVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S2)).booleanValue() && (bundle = zzcbvVar.m) != null) {
            bundle.putLong("service-connected", com.google.android.gms.ads.internal.zzt.zzk().a());
        }
        zzfpp E4 = E4(zzcbvVar, Binder.getCallingUid());
        J4(E4, zzcbmVar, zzcbvVar);
        if (((Boolean) zzblh.i.c()).booleanValue()) {
            zzejo zzejoVar = this.c;
            Objects.requireNonNull(zzejoVar);
            E4.addListener(new g4o(zzejoVar, 1), this.b);
        }
    }

    public final ddb F4(final zzcbv zzcbvVar, int i) {
        if (!((Boolean) zzblo.a.c()).booleanValue()) {
            return zzhcy.b(new Exception("Split request is disabled."));
        }
        zzfns zzfnsVar = zzcbvVar.i;
        if (zzfnsVar == null) {
            return zzhcy.b(new Exception("Pool configuration missing from request."));
        }
        if (zzfnsVar.d == 0 || zzfnsVar.e == 0) {
            return zzhcy.b(new Exception("Caching is disabled."));
        }
        zzbur zzr = com.google.android.gms.ads.internal.zzt.zzr();
        VersionInfoParcel forPackage = VersionInfoParcel.forPackage();
        Context context = this.a;
        zzbva a = zzr.a(context, forPackage, this.f);
        zzfek s = this.d.s(zzcbvVar, i);
        zzfqi b = s.b();
        final zzfpp d = b.a(zzhcy.a(zzcbvVar.a), zzfqc.GMS_SIGNALS).b(new spn(8, s, zzcbvVar)).a(pff.i).d();
        zzfrg c = s.c();
        final zzfqw e = zzfqw.e(9, context);
        final zzfpp I4 = I4(d, b, a, c, e);
        return new zzfpr(b, zzfqc.GET_URL_AND_CACHE_KEY, Arrays.asList(d, I4)).a(new Callable() { // from class: d4o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzejg zzejgVar = zzejg.this;
                zzfpp zzfppVar = I4;
                zzfpp zzfppVar2 = d;
                zzcbv zzcbvVar2 = zzcbvVar;
                zzfqw zzfqwVar = e;
                String str = ((zzcbx) zzfppVar.c.get()).i;
                zzejb zzejbVar = new zzejb((zzcbx) zzfppVar.c.get(), (JSONObject) zzfppVar2.c.get(), zzcbvVar2.h, zzfqwVar);
                synchronized (zzejgVar) {
                    synchronized (zzejgVar) {
                        int intValue = ((Long) zzblo.b.c()).intValue();
                        while (true) {
                            ArrayDeque arrayDeque = zzejgVar.e;
                            if (arrayDeque.size() >= intValue) {
                                arrayDeque.removeFirst();
                            }
                        }
                    }
                    return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
                }
                zzejgVar.e.addLast(zzejbVar);
                return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            }
        }).d();
    }

    public final ddb G4(String str) {
        if (((Boolean) zzblo.a.c()).booleanValue()) {
            return K4(str) == null ? zzhcy.b(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzhcy.a(new c4o());
        }
        return zzhcy.b(new Exception("Split request is disabled."));
    }

    public final ddb H4(zzcbv zzcbvVar, int i) {
        zzbur zzr = com.google.android.gms.ads.internal.zzt.zzr();
        VersionInfoParcel forPackage = VersionInfoParcel.forPackage();
        zzfrj zzfrjVar = this.f;
        Context context = this.a;
        zzbva a = zzr.a(context, forPackage, zzfrjVar);
        if (!((Boolean) zzblu.a.c()).booleanValue()) {
            return zzhcy.b(new Exception("Signal collection disabled."));
        }
        zzfek s = this.d.s(zzcbvVar, i);
        tun tunVar = (tun) s;
        zzinv zzinvVar = tunVar.j;
        zzfet zzfetVar = tunVar.h;
        zzffz zzffzVar = tunVar.i;
        zzfgd zzfgdVar = tunVar.f;
        zzffm zzffmVar = tunVar.d;
        zzfff zzfffVar = tunVar.c;
        zzfex zzfexVar = tunVar.g;
        zzfej zzfejVar = tunVar.e;
        uun uunVar = tunVar.b;
        zzinv zzinvVar2 = uunVar.S0;
        Context context2 = uunVar.b.b;
        zzioe.a(context2);
        new zzcfk();
        new zzcfl();
        Object zzb = zzinvVar2.zzb();
        zzfen d = tunVar.d();
        zzffn zzffnVar = tunVar.a;
        new zzbiq();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        List list = zzffnVar.a.e;
        zzioe.a(list);
        zzffh zzffhVar = new zzffh(hsnVar, list);
        zzinq b = zzinv.b(zzfejVar);
        zzinq b2 = zzinv.b(zzfexVar);
        zzinv.b(zzfffVar);
        zzinq b3 = zzinv.b(zzffmVar);
        zzinq b4 = zzinv.b(zzfgdVar);
        zzinv.b(zzffzVar);
        zzinq b5 = zzinv.b(zzfetVar);
        zzfrg zzfrgVar = (zzfrg) zzinvVar.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add((x7o) zzb);
        hashSet.add(d);
        hashSet.add(zzffhVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S6)).booleanValue()) {
            hashSet.add((zzfdi) b.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.T6)).booleanValue()) {
            hashSet.add((zzfdi) b2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.V6)).booleanValue()) {
            hashSet.add((zzfdi) b3.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.W6)).booleanValue()) {
            hashSet.add((zzfdi) b4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.c4)).booleanValue()) {
            hashSet.add((zzfdi) b5.zzb());
        }
        zzfdl zzfdlVar = new zzfdl(context2, hsnVar, hashSet, zzfrgVar);
        zzbve a2 = a.a("google.afma.request.getSignals", zzbux.a, fff.d);
        zzfqw e = zzfqw.e(22, context);
        zzfqi b6 = s.b();
        Bundle bundle = zzcbvVar.a;
        zzfpz b7 = b6.a(zzhcy.a(bundle), zzfqc.GET_SIGNALS).a(new d1l(e, 22)).b(new spn(9, zzfdlVar, zzcbvVar));
        zzfpp d2 = b7.f.a(b7.d(), zzfqc.JS_SIGNALS).b(a2).d();
        zzfrg c = s.c();
        c.b(bundle.getStringArrayList("ad_types"));
        c.d(bundle.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS));
        zzfrf.c(d2, c, e, true);
        if (((Boolean) zzblh.j.c()).booleanValue()) {
            zzejo zzejoVar = this.c;
            Objects.requireNonNull(zzejoVar);
            d2.addListener(new g4o(zzejoVar, 0), this.b);
        }
        return d2;
    }

    public final void J4(ddb ddbVar, zzcbm zzcbmVar, zzcbv zzcbvVar) {
        hlo h = zzhcy.h(ddbVar, new yvn(7), zzcgj.a);
        f0o f0oVar = new f0o(this, zzcbvVar, zzcbmVar);
        h.addListener(new vlo(0, h, f0oVar), zzcgj.h);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void K3(zzcbv zzcbvVar, zzcbm zzcbmVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S2)).booleanValue() && (bundle = zzcbvVar.m) != null) {
            bundle.putLong("service-connected", com.google.android.gms.ads.internal.zzt.zzk().a());
        }
        J4(H4(zzcbvVar, Binder.getCallingUid()), zzcbmVar, zzcbvVar);
    }

    public final synchronized zzejb K4(String str) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            zzejb zzejbVar = (zzejb) it.next();
            if (zzejbVar.c.equals(str)) {
                it.remove();
                return zzejbVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void e3(String str, zzcbm zzcbmVar) {
        J4(G4(str), zzcbmVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void o3(zzcbv zzcbvVar, zzcbm zzcbmVar) {
        J4(F4(zzcbvVar, Binder.getCallingUid()), zzcbmVar, zzcbvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzi(String str) {
        zzejj zza;
        Binder.getCallingUid();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Sf)).booleanValue()) {
            String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Tf);
            if (str2.isEmpty()) {
                return;
            }
            zzguz a = zzguz.a(new sgo(','));
            com.google.android.gms.ads.internal.util.zze.zza("AdRequestServiceImpl: Preconnecting");
            Iterator i = a.c.i(a, str2);
            do {
                pyh pyhVar = (pyh) i;
                if (!pyhVar.hasNext()) {
                    return;
                }
                String str3 = (String) pyhVar.next();
                Context context = this.a;
                zzejk zzejkVar = new zzejk(context, str, "HEAD");
                HashMap hashMap = new HashMap();
                hashMap.put(Command.HTTP_HEADER_USER_AGENT, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
                try {
                    zza = zzejkVar.zza(new zzeji(str3, 30000, hashMap, new byte[0], ""));
                } catch (Exception e) {
                    throw new RemoteException(e.getMessage());
                }
            } while (zza.a == 200);
            int i2 = zza.a;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 32);
            sb.append("Unexpected preconnect response: ");
            sb.append(i2);
            throw new RemoteException(sb.toString());
        }
    }
}

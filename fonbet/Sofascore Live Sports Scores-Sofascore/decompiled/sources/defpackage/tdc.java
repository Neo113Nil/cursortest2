package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzabu;
import com.google.android.gms.internal.ads.zzak;
import com.google.android.gms.internal.ads.zzbf;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbqk;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcmb;
import com.google.android.gms.internal.ads.zzdec;
import com.google.android.gms.internal.ads.zzdob;
import com.google.android.gms.internal.ads.zzdom;
import com.google.android.gms.internal.ads.zzdwl;
import com.google.android.gms.internal.ads.zzdxg;
import com.google.android.gms.internal.ads.zzdxk;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzeae;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzelp;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzfli;
import com.google.android.gms.internal.ads.zzflw;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zznq;
import com.google.android.gms.internal.ads.zzqj;
import com.google.android.gms.internal.ads.zzwp;
import com.google.android.gms.internal.ads.zzxj;
import com.google.android.gms.internal.ads.zzxp;
import com.google.android.gms.internal.ads.zzxq;
import com.google.android.gms.internal.ads.zzzj;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tdc implements zzdom {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public boolean g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public Object l;
    public Object m;

    public tdc(hh6 hh6Var, bn4 bn4Var, Handler handler, bse bseVar) {
        this.a = 0;
        this.h = bseVar;
        this.i = hh6Var;
        this.l = new xfh();
        this.c = new IdentityHashMap();
        this.d = new HashMap();
        this.b = new ArrayList();
        bc5 bc5Var = new bc5(1);
        this.j = bc5Var;
        bc5 bc5Var2 = new bc5(0);
        this.k = bc5Var2;
        this.e = new HashMap();
        this.f = new HashSet();
        bn4Var.getClass();
        bdc bdcVar = new bdc();
        bdcVar.a = handler;
        bdcVar.b = bn4Var;
        bc5Var.c.add(bdcVar);
        zb5 zb5Var = new zb5();
        zb5Var.a = bn4Var;
        bc5Var2.c.add(zb5Var);
    }

    public lij a(int i, ArrayList arrayList, xfh xfhVar) {
        ArrayList arrayList2 = (ArrayList) this.b;
        if (!arrayList.isEmpty()) {
            this.l = xfhVar;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                rdc rdcVar = (rdc) arrayList.get(i2 - i);
                if (i2 > 0) {
                    rdc rdcVar2 = (rdc) arrayList2.get(i2 - 1);
                    rdcVar.d = rdcVar2.a.o.b.o() + rdcVar2.d;
                    rdcVar.e = false;
                    rdcVar.c.clear();
                } else {
                    rdcVar.d = 0;
                    rdcVar.e = false;
                    rdcVar.c.clear();
                }
                int o = rdcVar.a.o.b.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((rdc) arrayList2.get(i3)).d += o;
                }
                arrayList2.add(i2, rdcVar);
                ((HashMap) this.d).put(rdcVar.b, rdcVar);
                if (this.g) {
                    i(rdcVar);
                    if (((IdentityHashMap) this.c).isEmpty()) {
                        ((HashSet) this.f).add(rdcVar);
                    } else {
                        pdc pdcVar = (pdc) ((HashMap) this.e).get(rdcVar);
                        if (pdcVar != null) {
                            pdcVar.a.b(pdcVar.b);
                        }
                    }
                }
            }
        }
        return d();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    @Override // com.google.android.gms.internal.ads.zzdom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(boolean z, Context context, zzdec zzdecVar) {
        boolean z2;
        float f;
        boolean z3;
        boolean z4 = this.g;
        zzflw zzflwVar = (zzflw) this.c;
        zzfld zzfldVar = (zzfld) this.e;
        zzbqk zzbqkVar = (zzbqk) this.k;
        zzdwl zzdwlVar = (zzdwl) zzhcy.k((zzcgo) this.i);
        try {
            zzclm zzclmVar = (zzclm) this.j;
            if (zzclmVar.x()) {
                if (((Boolean) zzba.zzc().a(zzbjg.D1)).booleanValue()) {
                    zzclmVar = ((zzdxg) this.b).a(zzflwVar.f, null, null);
                    zzclmVar.T("/reward", new zzbrb(zzdwlVar.f()));
                    new zzdxk();
                    zzdwlVar.g().a(zzclmVar, true, z4 ? zzbqkVar : null, (zzeae) this.l);
                    zzclmVar.zzP().g = new sa0(zzclmVar, 10);
                    zzclmVar.zzP().h = new mxn(zzclmVar, 7);
                    zzfli zzfliVar = zzfldVar.s;
                    zzclmVar.G(zzfliVar.b, zzfliVar.a);
                }
            }
            zzclm zzclmVar2 = zzclmVar;
            zzclmVar2.V(true);
            boolean z5 = false;
            boolean a = z4 ? zzbqkVar.a(false) : false;
            zzt.zzc();
            boolean zzL = zzs.zzL((Context) this.h);
            if (z4) {
                synchronized (zzbqkVar) {
                    z3 = zzbqkVar.b;
                }
                if (!z3) {
                    z2 = false;
                    z5 = true;
                    if (z5) {
                        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    } else {
                        synchronized (zzbqkVar) {
                            f = zzbqkVar.c;
                        }
                    }
                    zzl zzlVar = new zzl(a, zzL, z2, f, -1, z, zzfldVar.O, zzfldVar.P);
                    if (zzdecVar != null) {
                        zzdecVar.q0();
                    }
                    zzt.zzb();
                    zzdob e = zzdwlVar.e();
                    int i = zzfldVar.Q;
                    VersionInfoParcel versionInfoParcel = (VersionInfoParcel) this.d;
                    String str = zzfldVar.B;
                    zzfli zzfliVar2 = zzfldVar.s;
                    zzn.zza(context, new AdOverlayInfoParcel(null, e, null, zzclmVar2, i, versionInfoParcel, str, zzlVar, zzfliVar2.b, zzfliVar2.a, zzflwVar.g, zzdecVar, zzfldVar.b() ? (zzelp) this.f : null, zzclmVar2.zzn()), true, (zzeaj) this.m);
                }
                z5 = true;
            }
            z2 = z5;
            if (z5) {
            }
            zzl zzlVar2 = new zzl(a, zzL, z2, f, -1, z, zzfldVar.O, zzfldVar.P);
            if (zzdecVar != null) {
            }
            zzt.zzb();
            zzdob e2 = zzdwlVar.e();
            int i2 = zzfldVar.Q;
            VersionInfoParcel versionInfoParcel2 = (VersionInfoParcel) this.d;
            String str2 = zzfldVar.B;
            zzfli zzfliVar22 = zzfldVar.s;
            if (zzfldVar.b()) {
            }
            zzn.zza(context, new AdOverlayInfoParcel(null, e2, null, zzclmVar2, i2, versionInfoParcel2, str2, zzlVar2, zzfliVar22.b, zzfliVar22.a, zzflwVar.g, zzdecVar, zzfldVar.b() ? (zzelp) this.f : null, zzclmVar2.zzn()), true, (zzeaj) this.m);
        } catch (zzcmb e3) {
            int i3 = zze.zza;
            zzo.zzg("", e3);
        }
    }

    public mij c(int i, ArrayList arrayList, yfh yfhVar) {
        ArrayList arrayList2 = (ArrayList) this.b;
        if (!arrayList.isEmpty()) {
            this.l = yfhVar;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                sdc sdcVar = (sdc) arrayList.get(i2 - i);
                if (i2 > 0) {
                    sdc sdcVar2 = (sdc) arrayList2.get(i2 - 1);
                    sdcVar.d = sdcVar2.a.o.b.o() + sdcVar2.d;
                    sdcVar.e = false;
                    sdcVar.c.clear();
                } else {
                    sdcVar.d = 0;
                    sdcVar.e = false;
                    sdcVar.c.clear();
                }
                int o = sdcVar.a.o.b.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((sdc) arrayList2.get(i3)).d += o;
                }
                arrayList2.add(i2, sdcVar);
                ((HashMap) this.d).put(sdcVar.b, sdcVar);
                if (this.g) {
                    j(sdcVar);
                    if (((IdentityHashMap) this.c).isEmpty()) {
                        ((HashSet) this.f).add(sdcVar);
                    } else {
                        qdc qdcVar = (qdc) ((HashMap) this.e).get(sdcVar);
                        if (qdcVar != null) {
                            ((b51) qdcVar.a).h(qdcVar.b);
                        }
                    }
                }
            }
        }
        return e();
    }

    public lij d() {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return lij.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            rdc rdcVar = (rdc) arrayList.get(i2);
            rdcVar.d = i;
            i += rdcVar.a.o.b.o();
        }
        return new rye(arrayList, (xfh) this.l);
    }

    public mij e() {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return mij.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sdc sdcVar = (sdc) arrayList.get(i2);
            sdcVar.d = i;
            i += sdcVar.a.o.b.o();
        }
        return new sye(arrayList, (yfh) this.l);
    }

    public void f() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                Iterator it = ((HashSet) obj2).iterator();
                while (it.hasNext()) {
                    rdc rdcVar = (rdc) it.next();
                    if (rdcVar.c.isEmpty()) {
                        pdc pdcVar = (pdc) ((HashMap) obj).get(rdcVar);
                        if (pdcVar != null) {
                            pdcVar.a.b(pdcVar.b);
                        }
                        it.remove();
                    }
                }
                break;
            default:
                Iterator it2 = ((HashSet) obj2).iterator();
                while (it2.hasNext()) {
                    sdc sdcVar = (sdc) it2.next();
                    if (sdcVar.c.isEmpty()) {
                        qdc qdcVar = (qdc) ((HashMap) obj).get(sdcVar);
                        if (qdcVar != null) {
                            ((b51) qdcVar.a).h(qdcVar.b);
                        }
                        it2.remove();
                    }
                }
                break;
        }
    }

    public void g(rdc rdcVar) {
        if (rdcVar.e && rdcVar.c.isEmpty()) {
            pdc pdcVar = (pdc) ((HashMap) this.e).remove(rdcVar);
            pdcVar.getClass();
            ujg ujgVar = pdcVar.c;
            a51 a51Var = pdcVar.a;
            a51Var.n(pdcVar.b);
            a51Var.q(ujgVar);
            a51Var.p(ujgVar);
            ((HashSet) this.f).remove(rdcVar);
        }
    }

    public void h(sdc sdcVar) {
        if (sdcVar.e && sdcVar.c.isEmpty()) {
            qdc qdcVar = (qdc) ((HashMap) this.e).remove(sdcVar);
            qdcVar.getClass();
            odc odcVar = qdcVar.c;
            b51 b51Var = (b51) qdcVar.a;
            b51Var.o(qdcVar.b);
            b51Var.r(odcVar);
            b51Var.q(odcVar);
            ((HashSet) this.f).remove(sdcVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [hdc, tcc] */
    public void i(rdc rdcVar) {
        qvb qvbVar = rdcVar.a;
        ?? r1 = new tcc() { // from class: hdc
            @Override // defpackage.tcc
            public final void a(a51 a51Var, lij lijVar) {
                ((hh6) tdc.this.i).h.c(22);
            }
        };
        ujg ujgVar = new ujg(this, rdcVar);
        ((HashMap) this.e).put(rdcVar, new pdc(qvbVar, r1, ujgVar));
        int i = lik.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        CopyOnWriteArrayList copyOnWriteArrayList = qvbVar.c.c;
        bdc bdcVar = new bdc();
        bdcVar.a = handler;
        bdcVar.b = ujgVar;
        copyOnWriteArrayList.add(bdcVar);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        CopyOnWriteArrayList copyOnWriteArrayList2 = qvbVar.d.c;
        zb5 zb5Var = new zb5();
        zb5Var.a = ujgVar;
        copyOnWriteArrayList2.add(zb5Var);
        qvbVar.j(r1, (sn4) this.m, (bse) this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [idc, ucc] */
    public void j(sdc sdcVar) {
        rvb rvbVar = sdcVar.a;
        ?? r1 = new ucc() { // from class: idc
            @Override // defpackage.ucc
            public final void a(b51 b51Var, mij mijVar) {
                zqi zqiVar = ((ih6) tdc.this.i).h;
                zqiVar.f(2);
                zqiVar.g(22);
            }
        };
        odc odcVar = new odc(this, sdcVar);
        ((HashMap) this.e).put(sdcVar, new qdc(rvbVar, r1, odcVar));
        String str = nik.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) rvbVar.c.d;
        cdc cdcVar = new cdc();
        cdcVar.a = handler;
        cdcVar.b = odcVar;
        copyOnWriteArrayList.add(cdcVar);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        CopyOnWriteArrayList copyOnWriteArrayList2 = rvbVar.d.c;
        ac5 ac5Var = new ac5();
        ac5Var.a = handler2;
        ac5Var.b = odcVar;
        copyOnWriteArrayList2.add(ac5Var);
        rvbVar.l(r1, (tn4) this.m, (cse) this.h);
    }

    public void k(v6c v6cVar) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.c;
        rdc rdcVar = (rdc) identityHashMap.remove(v6cVar);
        rdcVar.getClass();
        rdcVar.a.m(v6cVar);
        rdcVar.c.remove(((kvb) v6cVar).a);
        if (!identityHashMap.isEmpty()) {
            f();
        }
        g(rdcVar);
    }

    public void l(w6c w6cVar) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.c;
        sdc sdcVar = (sdc) identityHashMap.remove(w6cVar);
        sdcVar.getClass();
        sdcVar.a.f(w6cVar);
        sdcVar.c.remove(((lvb) w6cVar).a);
        if (!identityHashMap.isEmpty()) {
            f();
        }
        h(sdcVar);
    }

    public void m(int i, int i2) {
        int i3 = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                for (int i4 = i2 - 1; i4 >= i; i4--) {
                    rdc rdcVar = (rdc) arrayList.remove(i4);
                    ((HashMap) obj).remove(rdcVar.b);
                    int i5 = -rdcVar.a.o.b.o();
                    for (int i6 = i4; i6 < arrayList.size(); i6++) {
                        ((rdc) arrayList.get(i6)).d += i5;
                    }
                    rdcVar.e = true;
                    if (this.g) {
                        g(rdcVar);
                    }
                }
                break;
            default:
                ArrayList arrayList2 = (ArrayList) obj2;
                for (int i7 = i2 - 1; i7 >= i; i7--) {
                    sdc sdcVar = (sdc) arrayList2.remove(i7);
                    ((HashMap) obj).remove(sdcVar.b);
                    int i8 = -sdcVar.a.o.b.o();
                    for (int i9 = i7; i9 < arrayList2.size(); i9++) {
                        ((sdc) arrayList2.get(i9)).d += i8;
                    }
                    sdcVar.e = true;
                    if (this.g) {
                        h(sdcVar);
                    }
                }
                break;
        }
    }

    public zzbf n(int i, int i2, List list) {
        ArrayList arrayList = (ArrayList) this.b;
        zzguk.a(i >= 0 && i <= i2 && i2 <= arrayList.size());
        zzguk.a(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((ayo) arrayList.get(i3)).a.g((zzak) list.get(i3 - i));
        }
        return p();
    }

    public void o() {
        zzguk.f(!this.g);
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.b;
            if (i >= arrayList.size()) {
                this.g = true;
                return;
            }
            ayo ayoVar = (ayo) arrayList.get(i);
            w(ayoVar);
            ((HashSet) this.f).add(ayoVar);
            i++;
        }
    }

    public zzbf p() {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return zzbf.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ayo ayoVar = (ayo) arrayList.get(i2);
            ayoVar.d = i;
            i += ayoVar.a.o.b.a();
        }
        return new tyo(arrayList, (zzzj) this.m);
    }

    public zzbf q(ArrayList arrayList, zzzj zzzjVar) {
        ArrayList arrayList2 = (ArrayList) this.b;
        v(0, arrayList2.size());
        return r(arrayList2.size(), arrayList, zzzjVar);
    }

    public zzbf r(int i, ArrayList arrayList, zzzj zzzjVar) {
        ArrayList arrayList2 = (ArrayList) this.b;
        if (!arrayList.isEmpty()) {
            this.m = zzzjVar;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                ayo ayoVar = (ayo) arrayList.get(i2 - i);
                if (i2 > 0) {
                    ayo ayoVar2 = (ayo) arrayList2.get(i2 - 1);
                    ayoVar.d = ayoVar2.a.o.b.a() + ayoVar2.d;
                    ayoVar.e = false;
                    ayoVar.c.clear();
                } else {
                    ayoVar.d = 0;
                    ayoVar.e = false;
                    ayoVar.c.clear();
                }
                int a = ayoVar.a.o.b.a();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((ayo) arrayList2.get(i3)).d += a;
                }
                arrayList2.add(i2, ayoVar);
                ((HashMap) this.d).put(ayoVar.b, ayoVar);
                if (this.g) {
                    w(ayoVar);
                    if (((IdentityHashMap) this.c).isEmpty()) {
                        ((HashSet) this.f).add(ayoVar);
                    } else {
                        yxo yxoVar = (yxo) ((HashMap) this.e).get(ayoVar);
                        if (yxoVar != null) {
                            yxoVar.a.j(yxoVar.b);
                        }
                    }
                }
            }
        }
        return p();
    }

    public zzbf s(int i, int i2, zzzj zzzjVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= ((ArrayList) this.b).size()) {
            z = true;
        }
        zzguk.a(z);
        this.m = zzzjVar;
        v(i, i2);
        return p();
    }

    public zzbf t(zzzj zzzjVar) {
        int size = ((ArrayList) this.b).size();
        if (zzzjVar.b.length != size) {
            zzzjVar = new zzzj(new Random(zzzjVar.a.nextLong())).a(size);
        }
        this.m = zzzjVar;
        return p();
    }

    public void u() {
        Iterator it = ((HashSet) this.f).iterator();
        while (it.hasNext()) {
            ayo ayoVar = (ayo) it.next();
            if (ayoVar.c.isEmpty()) {
                yxo yxoVar = (yxo) ((HashMap) this.e).get(ayoVar);
                if (yxoVar != null) {
                    yxoVar.a.j(yxoVar.b);
                }
                it.remove();
            }
        }
    }

    public void v(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.b;
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            ayo ayoVar = (ayo) arrayList.remove(i2);
            ((HashMap) this.d).remove(ayoVar.b);
            int i3 = -ayoVar.a.o.b.a();
            for (int i4 = i2; i4 < arrayList.size(); i4++) {
                ((ayo) arrayList.get(i4)).d += i3;
            }
            ayoVar.e = true;
            if (this.g) {
                x(ayoVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [byo, com.google.android.gms.internal.ads.zzxp] */
    public void w(ayo ayoVar) {
        zzxj zzxjVar = ayoVar.a;
        ?? r1 = new zzxp() { // from class: byo
            @Override // com.google.android.gms.internal.ads.zzxp
            public final void a(zzwp zzwpVar, zzbf zzbfVar) {
                zzea zzeaVar = ((xwo) tdc.this.j).g;
                zzeaVar.d(2);
                zzeaVar.g(22);
            }
        };
        wxo wxoVar = new wxo(this, ayoVar);
        ((HashMap) this.e).put(ayoVar, new yxo(zzxjVar, r1, wxoVar));
        String str = zzfm.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        zzxjVar.a(new Handler(myLooper, null), wxoVar);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        zzxjVar.m(new Handler(myLooper2, null), wxoVar);
        zzxjVar.f(r1, (zzqj) this.h, (zzabu) this.i);
    }

    public void x(ayo ayoVar) {
        if (ayoVar.e && ayoVar.c.isEmpty()) {
            yxo yxoVar = (yxo) ((HashMap) this.e).remove(ayoVar);
            yxoVar.getClass();
            zzxq zzxqVar = yxoVar.a;
            zzxqVar.h(yxoVar.b);
            wxo wxoVar = yxoVar.c;
            zzxqVar.e(wxoVar);
            zzxqVar.d(wxoVar);
            ((HashSet) this.f).remove(ayoVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public zzfld zzb() {
        return (zzfld) this.e;
    }

    public tdc(xwo xwoVar, zznq zznqVar, zzea zzeaVar, zzqj zzqjVar, zzabu zzabuVar) {
        this.a = 3;
        this.h = zzqjVar;
        this.i = zzabuVar;
        this.j = xwoVar;
        this.m = new zzzj();
        this.c = new IdentityHashMap();
        this.d = new HashMap();
        this.b = new ArrayList();
        this.k = zznqVar;
        this.l = zzeaVar;
        this.e = new HashMap();
        this.f = new HashSet();
    }

    public tdc(Context context, zzdxg zzdxgVar, zzflw zzflwVar, VersionInfoParcel versionInfoParcel, zzfld zzfldVar, zzcgo zzcgoVar, zzclm zzclmVar, zzbqk zzbqkVar, boolean z, zzelp zzelpVar, zzeae zzeaeVar, zzeaj zzeajVar) {
        this.a = 2;
        this.h = context;
        this.b = zzdxgVar;
        this.c = zzflwVar;
        this.d = versionInfoParcel;
        this.e = zzfldVar;
        this.i = zzcgoVar;
        this.j = zzclmVar;
        this.k = zzbqkVar;
        this.g = z;
        this.f = zzelpVar;
        this.l = zzeaeVar;
        this.m = zzeajVar;
    }

    public tdc(ih6 ih6Var, cn4 cn4Var, zqi zqiVar, cse cseVar) {
        this.a = 1;
        this.h = cseVar;
        this.i = ih6Var;
        this.l = new yfh();
        this.c = new IdentityHashMap();
        this.d = new HashMap();
        this.b = new ArrayList();
        this.j = cn4Var;
        this.k = zqiVar;
        this.e = new HashMap();
        this.f = new HashSet();
    }
}

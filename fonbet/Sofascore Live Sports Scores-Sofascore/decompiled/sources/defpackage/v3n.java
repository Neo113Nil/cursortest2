package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzmb;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzpp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class v3n extends pqn {
    public final zzic a;
    public final zzlj b;

    public v3n(zzic zzicVar) {
        Preconditions.i(zzicVar);
        this.a = zzicVar;
        zzlj zzljVar = zzicVar.m;
        zzic.l(zzljVar);
        this.b = zzljVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final int a(String str) {
        zzlj zzljVar = this.b;
        zzljVar.getClass();
        Preconditions.f(str);
        zzal zzalVar = ((zzic) zzljVar.b).d;
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void b(Bundle bundle) {
        zzlj zzljVar = this.b;
        ((zzic) zzljVar.b).k.getClass();
        zzljVar.d0(bundle, System.currentTimeMillis());
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void c(String str) {
        zzic zzicVar = this.a;
        zzd zzdVar = zzicVar.n;
        zzic.j(zzdVar);
        zzicVar.k.getClass();
        zzdVar.R(SystemClock.elapsedRealtime(), str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void d(String str, Bundle bundle, String str2) {
        this.b.U(str, bundle, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Map e(String str, String str2, boolean z) {
        zzlj zzljVar = this.b;
        zzic zzicVar = (zzic) zzljVar.b;
        zzhz zzhzVar = zzicVar.g;
        zzgu zzguVar = zzicVar.f;
        zzic.m(zzhzVar);
        if (zzhzVar.W()) {
            zzic.m(zzguVar);
            zzguVar.g.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (zzae.a()) {
            zzic.m(zzguVar);
            zzguVar.g.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        zzhz zzhzVar2 = zzicVar.g;
        zzic.m(zzhzVar2);
        zzhzVar2.a0(atomicReference, 5000L, "get user properties", new dbo(zzljVar, atomicReference, str, str2, z));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            zzic.m(zzguVar);
            zzguVar.g.b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        dh0 dh0Var = new dh0(list.size());
        for (zzpl zzplVar : list) {
            Object zza = zzplVar.zza();
            if (zza != null) {
                dh0Var.put(zzplVar.b, zza);
            }
        }
        return dh0Var;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void f(String str, Bundle bundle, String str2) {
        zzlj zzljVar = this.a.m;
        zzic.l(zzljVar);
        zzljVar.e0(str, bundle, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final List g(String str, String str2) {
        zzlj zzljVar = this.b;
        zzic zzicVar = (zzic) zzljVar.b;
        zzhz zzhzVar = zzicVar.g;
        zzgu zzguVar = zzicVar.f;
        zzic.m(zzhzVar);
        if (zzhzVar.W()) {
            zzic.m(zzguVar);
            zzguVar.g.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (zzae.a()) {
            zzic.m(zzguVar);
            zzguVar.g.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        zzhz zzhzVar2 = zzicVar.g;
        zzic.m(zzhzVar2);
        zzhzVar2.a0(atomicReference, 5000L, "get conditional user properties", new n2(zzljVar, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzpp.K0(list);
        }
        zzic.m(zzguVar);
        zzguVar.g.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzh() {
        zzmb zzmbVar = ((zzic) this.b.b).l;
        zzic.l(zzmbVar);
        zzlu zzluVar = zzmbVar.d;
        if (zzluVar != null) {
            return zzluVar.a;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzi() {
        zzmb zzmbVar = ((zzic) this.b.b).l;
        zzic.l(zzmbVar);
        zzlu zzluVar = zzmbVar.d;
        if (zzluVar != null) {
            return zzluVar.b;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzj() {
        return (String) this.b.h.get();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzk() {
        return this.b.f0();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final long zzl() {
        zzpp zzppVar = this.a.i;
        zzic.k(zzppVar);
        return zzppVar.O0();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzn(String str) {
        zzic zzicVar = this.a;
        zzd zzdVar = zzicVar.n;
        zzic.j(zzdVar);
        zzicVar.k.getClass();
        zzdVar.S(SystemClock.elapsedRealtime(), str);
    }
}

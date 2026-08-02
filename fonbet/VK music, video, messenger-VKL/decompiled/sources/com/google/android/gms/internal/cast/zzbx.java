package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.mediarouter.media.MediaTransferReceiver;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import xsna.cm01;
import xsna.ex10;
import xsna.exc0;
import xsna.fx10;
import xsna.h1u;
import xsna.h1u.c;
import xsna.o100;
import xsna.pxi0;
import xsna.rx10;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzbx extends zzbd {
    private static final o100 zza = new o100("MediaRouterProxy", null);
    private final fx10 zzb;
    private final CastOptions zzc;
    private final Map zzd = new HashMap();

    @Nullable
    private zzce zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    @Nullable
    private rx10 zzj;

    public zzbx(Context context, fx10 fx10Var, CastOptions castOptions, cm01 cm01Var) {
        this.zzb = fx10Var;
        this.zzc = castOptions;
        if (Build.VERSION.SDK_INT >= 33) {
            zza.a("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
            this.zze = new zzce(castOptions);
            new Intent(context, (Class<?>) MediaTransferReceiver.class).setPackage(context.getPackageName());
            this.zzf = !context.getPackageManager().queryBroadcastReceivers(r5, 0).isEmpty();
            this.zzg = true;
            this.zzh = true;
            cm01Var.a(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED", "com.google.android.gms.cast.FLAG_SHOW_SYSTEM_OUTPUT_SWITCHER_ON_CAST_ICON_CLICK"}).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.cast.zzbw
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final /* synthetic */ void onComplete(Task task) {
                    zzbx.this.zzw(task);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final void zzy(@Nullable ex10 ex10Var) {
        Set set = (Set) this.zzd.get(ex10Var);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.zzb.h((fx10.a) it.next());
        }
    }

    private final void zzz(@Nullable ex10 ex10Var, int i) {
        Set set = (Set) this.zzd.get(ex10Var);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.zzb.a(ex10Var, (fx10.a) it.next(), i);
        }
    }

    @Override // com.google.android.gms.internal.cast.zzbe
    public final void zzb(@Nullable Bundle bundle, zzbg zzbgVar) {
        ex10 b = ex10.b(bundle);
        if (b == null) {
            return;
        }
        Map map = this.zzd;
        if (!map.containsKey(b)) {
            map.put(b, new HashSet());
        }
        ((Set) map.get(b)).add(new zzbl(zzbgVar, this, this.zze));
    }

    @Override // com.google.android.gms.internal.cast.zzbe
    public final void zzc(@Nullable Bundle bundle, final int i) {
        final ex10 b = ex10.b(bundle);
        if (b == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzz(b, i);
        } else {
            new zzfk(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzbu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzbx.this.zzx(b, i);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.cast.zzbe
    public final void zzd(@Nullable Bundle bundle) {
        final ex10 b = ex10.b(bundle);
        if (b == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzy(b);
        } else {
            new zzfk(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzbv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzbx.this.zzy(b);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.cast.zzbe
    public final boolean zze(@Nullable Bundle bundle, int i) {
        ex10 b = ex10.b(bundle);
        if (b == null) {
            return false;
        }
        this.zzb.getClass();
        fx10.b();
        h1u c = fx10.c();
        ArrayList<fx10.h> arrayList = c.j;
        if (!b.d()) {
            if ((i & 2) != 0 || !c.q) {
                rx10 rx10Var = c.v;
                boolean z = rx10Var != null && rx10Var.b && c.i();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    fx10.h hVar = arrayList.get(i2);
                    if (((i & 1) != 0 && hVar.d()) || ((z && !hVar.d() && hVar.c() != c.s) || !hVar.h(b))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.zzbe
    public final void zzf(String str) {
        o100 o100Var = zza;
        o100Var.a("select route with routeId = %s", str);
        this.zzb.getClass();
        fx10.b();
        Iterator<fx10.h> it = fx10.c().j.iterator();
        while (it.hasNext()) {
            fx10.h next = it.next();
            if (next.c.equals(str)) {
                o100Var.a("media route is found and selected", new Object[0]);
                next.l(true);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.zzbe
    public final void zzg() {
        this.zzb.getClass();
        fx10.b();
        fx10.h hVar = fx10.c().w;
        if (hVar == null) {
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }
        hVar.l(true);
    }

    @Override // com.google.android.gms.internal.cast.zzbe
    public final boolean zzh() {
        this.zzb.getClass();
        fx10.b();
        fx10.h hVar = fx10.c().w;
        if (hVar != null) {
            return fx10.f().c.equals(hVar.c);
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    @Override // com.google.android.gms.internal.cast.zzbe
    @Nullable
    public final Bundle zzi(String str) {
        this.zzb.getClass();
        fx10.b();
        Iterator<fx10.h> it = fx10.c().j.iterator();
        while (it.hasNext()) {
            fx10.h next = it.next();
            if (next.c.equals(str)) {
                return next.s;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.cast.zzbe
    public final String zzj() {
        this.zzb.getClass();
        return fx10.f().c;
    }

    @Override // com.google.android.gms.internal.cast.zzbe
    public final void zzk() {
        Map map = this.zzd;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Set) it.next()).iterator();
            while (it2.hasNext()) {
                this.zzb.h((fx10.a) it2.next());
            }
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.cast.zzbe
    public final boolean zzl() {
        this.zzb.getClass();
        fx10.b();
        fx10.h hVar = fx10.c().x;
        return hVar != null && fx10.f().c.equals(hVar.c);
    }

    @Override // com.google.android.gms.internal.cast.zzbe
    public final void zzm(int i) {
        this.zzb.getClass();
        fx10.k(i);
    }

    @Override // com.google.android.gms.internal.cast.zzbe
    public final void zzn(String str) {
        this.zzb.getClass();
        fx10.b();
        Iterator it = fx10.c().e().iterator();
        while (it.hasNext()) {
            fx10.d dVar = (fx10.d) it.next();
            if (dVar.c.equals(str)) {
                zza.a("clean up the connectedGroupRoute = %s", dVar);
                fx10.b();
                if (((h1u.g) fx10.c().k.get(dVar.c)) != null) {
                    throw null;
                }
            }
        }
        fx10.h f = fx10.f();
        if (f == null || f.h || !f.c.equals(str)) {
            return;
        }
        zza.a("clean up the selected route = %s", f);
        fx10.k(0);
    }

    public final boolean zzo() {
        CastOptions castOptions;
        return this.zzf && this.zzg && (castOptions = this.zzc) != null && castOptions.n;
    }

    public final void zzp(boolean z) {
        this.zzi = z;
    }

    public final boolean zzq() {
        return this.zzi;
    }

    public final void zzr(@Nullable Boolean bool, @Nullable Boolean bool2) {
        rx10 rx10Var;
        rx10 rx10Var2;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i < 33) {
            zza.c("updateMediaRouterParams - not allowed on Android S and below", new Object[0]);
            return;
        }
        fx10 fx10Var = this.zzb;
        if (fx10Var == null || (rx10Var = this.zzj) == null) {
            o100 o100Var = zza;
            Log.e(o100Var.a, o100Var.c("updateMediaRouterParams - %s must not be null", fx10Var == null ? "mediaRouter" : "routerParams"));
            return;
        }
        rx10.a aVar = new rx10.a();
        Bundle bundle = rx10Var.e;
        aVar.b = rx10Var.b;
        aVar.c = rx10Var.c;
        aVar.a = rx10Var.a;
        aVar.d = rx10Var.d;
        aVar.e = bundle == null ? null : new Bundle(bundle);
        boolean z2 = true;
        if (bool != null) {
            boolean z3 = this.zzh && bool.booleanValue();
            if (this.zzj.b != z3) {
                if (i >= 30) {
                    aVar.b = z3;
                }
                z = true;
            }
        }
        if (bool2 == null || (rx10Var2 = this.zzj) == null || rx10Var2.c == bool2.booleanValue()) {
            z2 = z;
        } else {
            boolean booleanValue = bool2.booleanValue();
            if (i >= 30) {
                aVar.c = booleanValue;
            }
        }
        if (z2) {
            rx10 rx10Var3 = new rx10(aVar);
            this.zzj = rx10Var3;
            fx10.j(rx10Var3);
        }
    }

    public final void zzs(pxi0 pxi0Var) {
        zzce zzceVar = this.zze;
        if (zzceVar != null) {
            zzceVar.zzc(pxi0Var);
            fx10 fx10Var = this.zzb;
            zzce zzceVar2 = this.zze;
            exc0.i(zzceVar2);
            zzbt zzbtVar = new zzbt(zzceVar2);
            fx10Var.getClass();
            fx10.b();
            fx10.c().f = zzbtVar;
        }
    }

    public final void zzt(pxi0 pxi0Var) {
        zzce zzceVar = this.zze;
        if (zzceVar != null) {
            zzceVar.zzd(pxi0Var);
            this.zzb.getClass();
            fx10.b();
            fx10.c().f = null;
        }
    }

    @Nullable
    public final zzce zzu() {
        return this.zze;
    }

    public final void zzv(@Nullable MediaSessionCompat mediaSessionCompat) {
        this.zzb.getClass();
        fx10.b();
        h1u c = fx10.c();
        c.E = mediaSessionCompat;
        h1u.c cVar = mediaSessionCompat != null ? c.new c(mediaSessionCompat) : null;
        h1u.c cVar2 = c.D;
        if (cVar2 != null) {
            cVar2.a();
        }
        c.D = cVar;
        if (cVar != null) {
            c.o();
        }
    }

    public final void zzw(Task task) {
        CastOptions castOptions;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED")) {
                boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                this.zzg = z;
                zza.a("The module-to-client output switcher flag value is %b", Boolean.valueOf(z));
            }
            if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_SHOW_SYSTEM_OUTPUT_SWITCHER_ON_CAST_ICON_CLICK")) {
                boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_SHOW_SYSTEM_OUTPUT_SWITCHER_ON_CAST_ICON_CLICK");
                this.zzh = z2;
                zza.a("The module-to-client show system output switcher on cast icon click flag value is %b", Boolean.valueOf(z2));
            }
        }
        boolean z3 = this.zzg;
        boolean z4 = this.zzh;
        if (this.zzb == null || (castOptions = this.zzc) == null) {
            return;
        }
        boolean z5 = castOptions.l;
        boolean z6 = z4 && castOptions.k;
        boolean z7 = z3 && castOptions.n;
        rx10.a aVar = new rx10.a();
        int i = Build.VERSION.SDK_INT;
        aVar.a = i >= 30;
        if (i >= 30) {
            aVar.a = z7;
        }
        if (i >= 30) {
            aVar.c = z5;
        }
        if (i >= 30) {
            aVar.b = z6;
        }
        boolean z8 = castOptions.s;
        if (i >= 30) {
            aVar.d = z8;
        }
        rx10 rx10Var = new rx10(aVar);
        this.zzj = rx10Var;
        fx10.j(rx10Var);
        zza.c("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(this.zzf), Boolean.valueOf(z7), Boolean.valueOf(z5), Boolean.valueOf(z6));
        zzce zzceVar = this.zze;
        if (zzceVar != null) {
            zzceVar.zzb(this.zzf && z7);
        }
        if (this.zzf && z7) {
            zzr.zzb(zzpm.CAST_OUTPUT_SWITCHER_ENABLED);
        }
        if (z5) {
            zzr.zzb(zzpm.CAST_TRANSFER_TO_LOCAL_ENABLED);
        }
    }

    public final /* synthetic */ void zzx(ex10 ex10Var, int i) {
        synchronized (this.zzd) {
            zzz(ex10Var, i);
        }
    }
}

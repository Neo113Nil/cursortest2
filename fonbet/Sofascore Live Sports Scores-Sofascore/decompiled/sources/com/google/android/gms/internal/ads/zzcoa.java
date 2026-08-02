package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.ahn;
import defpackage.ewn;
import defpackage.hsn;
import defpackage.ilo;
import defpackage.olo;
import defpackage.slo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcoa implements zzbay {
    public final Context a;
    public final zzged b;

    public zzcoa(Context context, VersionInfoParcel versionInfoParcel) {
        int i;
        zzged zzgedVar;
        this.a = context;
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I3)).intValue();
        if (intValue != 1) {
            i = 3;
            if (intValue != 2 && intValue == 3) {
                i = 4;
            }
        } else {
            i = 2;
        }
        zzgez H = zzgfa.H();
        float floatValue = ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.O3)).floatValue();
        H.n();
        ((zzgfa) H.b).J(floatValue);
        zzgfa zzgfaVar = (zzgfa) H.o();
        zzgfb K = zzgfc.K();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.P3)).booleanValue();
        K.n();
        ((zzgfc) K.b).M(booleanValue);
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.R3)).longValue();
        K.n();
        ((zzgfc) K.b).N(longValue);
        zzgfc zzgfcVar = (zzgfc) K.o();
        zzgeg o0 = zzgei.o0();
        o0.n();
        ((zzgei) o0.b).P(i);
        String str = versionInfoParcel.afmaVersion;
        o0.n();
        ((zzgei) o0.b).E(str);
        o0.n();
        ((zzgei) o0.b).Q();
        boolean booleanValue2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.p3)).booleanValue();
        o0.n();
        ((zzgei) o0.b).p0(booleanValue2);
        boolean booleanValue3 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S3)).booleanValue();
        o0.n();
        ((zzgei) o0.b).q0(booleanValue3);
        boolean booleanValue4 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.T3)).booleanValue();
        o0.n();
        ((zzgei) o0.b).D(booleanValue4);
        boolean z = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.F3)).intValue() == -1;
        o0.n();
        ((zzgei) o0.b).K(z);
        long intValue2 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.H3)).intValue();
        o0.n();
        ((zzgei) o0.b).J(intValue2);
        long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Q3)).longValue();
        o0.n();
        ((zzgei) o0.b).H(longValue2);
        long intValue3 = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G3)).intValue();
        o0.n();
        ((zzgei) o0.b).G(intValue3);
        o0.n();
        ((zzgei) o0.b).F(zzgfaVar);
        o0.n();
        ((zzgei) o0.b).I(zzgfcVar);
        boolean booleanValue5 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.w4)).booleanValue();
        o0.n();
        ((zzgei) o0.b).L(booleanValue5);
        zzgei zzgeiVar = (zzgei) o0.o();
        hsn hsnVar = zzcgj.a;
        synchronized (zzged.b) {
            try {
                zzgedVar = zzged.c;
                if (zzgedVar == null) {
                    zzgedVar = new zzged(context, hsnVar, zzgeiVar);
                    zzged.c = zzgedVar;
                }
            } finally {
            }
        }
        this.b = zzgedVar;
        zzggi zzggiVar = zzgedVar.a.a;
        synchronized (zzggiVar) {
            try {
                if (zzggiVar.e != null) {
                    return;
                }
                Set set = (Set) zzggiVar.b.zzb();
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzggg) it.next()).zza());
                }
                zzgrh zzgrhVar = (zzgrh) zzggiVar.d.zzb();
                ilo i2 = zzhcy.i(new olo(zzgxm.x(arrayList), true), ahn.t, zzggiVar.c);
                zzgrhVar.e(2, i2);
                zzggiVar.e = i2;
                Iterator it2 = ((Set) zzggiVar.a.zzb()).iterator();
                while (it2.hasNext()) {
                    ((zzggg) it2.next()).zza();
                }
                if (zzggiVar.e != null) {
                } else {
                    throw null;
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzd(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.b.c(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zze(int i, int i2, int i3) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        Context context = this.a;
        float zzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        long j = i3;
        MotionEvent obtain = MotionEvent.obtain(0L, j, 0, zzE, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2), 0);
        zzged zzgedVar = this.b;
        zzgedVar.c(obtain);
        obtain.recycle();
        com.google.android.gms.ads.internal.client.zzay.zza();
        float zzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        MotionEvent obtain2 = MotionEvent.obtain(0L, j, 2, zzE2, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2), 0);
        zzgedVar.c(obtain2);
        obtain2.recycle();
        com.google.android.gms.ads.internal.client.zzay.zza();
        float zzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i);
        com.google.android.gms.ads.internal.client.zzay.zza();
        MotionEvent obtain3 = MotionEvent.obtain(0L, j, 1, zzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(context, i2), 0);
        zzgedVar.c(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzf(Context context, String str, View view, Activity activity) {
        return this.b.b(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzg(Context context, String str, View view) {
        return this.b.b(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzged zzgedVar = this.b;
        List asList = Arrays.asList(stackTraceElementArr);
        zzgqt zzgqtVar = zzgedVar.a.c.b;
        synchronized (zzgqtVar) {
            ArrayList arrayList = zzgqtVar.a;
            arrayList.clear();
            arrayList.addAll(asList);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzj(Context context, View view, Activity activity) {
        String str;
        ilo iloVar;
        zzgeb zzgebVar = this.b.a;
        zzgfo zzgfoVar = zzgebVar.e;
        zzgrh zzgrhVar = zzgebVar.d;
        zzgrf a = zzgrhVar.a(4);
        try {
            try {
                try {
                    try {
                        a.a();
                        zzggi zzggiVar = zzgebVar.a;
                        synchronized (zzggiVar) {
                            iloVar = zzggiVar.e;
                            if (iloVar == null) {
                                throw null;
                            }
                        }
                        str = (String) zzhcy.h(iloVar, new ewn(zzgebVar, context, view, activity, 5), slo.a).get(zzgebVar.f, TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        zzgrhVar.b(57);
                        str = Integer.toString(17);
                    }
                } catch (ExecutionException e) {
                    Throwable th = e;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    a.b(th);
                    str = Integer.toString(3);
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                a.b(e2);
                str = "";
            } catch (Throwable th2) {
                a.b(th2);
                throw th2;
            }
            a.c();
            zzgfoVar.zzb();
            return str;
        } catch (Throwable th3) {
            a.c();
            zzgfoVar.zzb();
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzk(Context context) {
        return this.b.a(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzl(Context context) {
        return this.b.a(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzh(View view) {
    }
}

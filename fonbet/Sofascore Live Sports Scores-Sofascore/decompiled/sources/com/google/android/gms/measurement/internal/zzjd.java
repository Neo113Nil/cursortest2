package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.UidVerifier;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.Ua;
import defpackage.dro;
import defpackage.een;
import defpackage.g3g;
import defpackage.gpo;
import defpackage.jgo;
import defpackage.kqj;
import defpackage.n2;
import defpackage.q7o;
import defpackage.tpo;
import defpackage.uqo;
import defpackage.z1p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjd extends zzga {
    public final zzpg a;
    public Boolean b;
    public String c;

    public zzjd(zzpg zzpgVar) {
        Preconditions.i(zzpgVar);
        this.a = zzpgVar;
        this.c = null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List A0(String str, String str2, String str3) {
        l2(str, true);
        zzpg zzpgVar = this.a;
        try {
            return (List) zzpgVar.d().X(new uqo(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            zzpgVar.b().g.b(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void B2(zzr zzrVar) {
        String str = zzrVar.a;
        Preconditions.f(str);
        l2(str, false);
        D4(new tpo(this, zzrVar, 1));
    }

    public final void D4(Runnable runnable) {
        zzpg zzpgVar = this.a;
        if (zzpgVar.d().W()) {
            runnable.run();
        } else {
            zzpgVar.d().Z(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final byte[] H0(zzbh zzbhVar, String str) {
        Preconditions.f(str);
        Preconditions.i(zzbhVar);
        l2(str, true);
        zzpg zzpgVar = this.a;
        zzgs zzgsVar = zzpgVar.b().n;
        zzic zzicVar = zzpgVar.l;
        zzgn zzgnVar = zzicVar.j;
        String str2 = zzbhVar.a;
        zzgsVar.b(zzgnVar.a(str2), "Log and bundle. event");
        ((DefaultClock) zzpgVar.f()).getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) zzpgVar.d().Y(new q7o(this, zzbhVar, str)).get();
            if (bArr == null) {
                zzpgVar.b().g.b(zzgu.U(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((DefaultClock) zzpgVar.f()).getClass();
            zzpgVar.b().n.d("Log and bundle processed. event, size, time_ms", zzicVar.j.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            zzpgVar.b().g.d("Failed to log and bundle. appId, event, error", zzgu.U(str), zzicVar.j.a(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            zzpgVar.b().g.d("Failed to log and bundle. appId, event, error", zzgu.U(str), zzicVar.j.a(str2), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void K0(zzr zzrVar) {
        Preconditions.f(zzrVar.a);
        Preconditions.i(zzrVar.s);
        S1(new dro(this, zzrVar, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void L(zzr zzrVar, zzoo zzooVar, zzgh zzghVar) {
        Z1(zzrVar);
        String str = zzrVar.a;
        Preconditions.i(str);
        this.a.d().Z(new n2(8, this, str, zzooVar, zzghVar, false));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void L3(zzr zzrVar) {
        Z1(zzrVar);
        D4(new gpo(this, zzrVar, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List O(String str, String str2, String str3, boolean z) {
        l2(str, true);
        zzpg zzpgVar = this.a;
        try {
            List<z1p> list = (List) zzpgVar.d().X(new uqo(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (z1p z1pVar : list) {
                if (!z && zzpp.u0(z1pVar.c)) {
                }
                arrayList.add(new zzpl(z1pVar));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            zzpgVar.b().g.c(zzgu.U(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            zzpgVar.b().g.c(zzgu.U(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final String O1(zzr zzrVar) {
        Z1(zzrVar);
        zzpg zzpgVar = this.a;
        try {
            return (String) zzpgVar.d().X(new een(zzpgVar, zzrVar)).get(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzpgVar.b().g.c(zzgu.U(zzrVar.a), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void P(zzah zzahVar, zzr zzrVar) {
        Preconditions.i(zzahVar);
        Preconditions.i(zzahVar.c);
        Z1(zzrVar);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.a = zzrVar.a;
        D4(new jgo(this, zzahVar2, zzrVar, 3));
    }

    public final void S1(Runnable runnable) {
        zzpg zzpgVar = this.a;
        if (zzpgVar.d().W()) {
            runnable.run();
        } else {
            zzpgVar.d().b0(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void U0(zzr zzrVar) {
        Z1(zzrVar);
        D4(new gpo(this, zzrVar, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void X0(zzr zzrVar) {
        Preconditions.f(zzrVar.a);
        Preconditions.i(zzrVar.s);
        S1(new gpo(this, zzrVar, 2));
    }

    public final void Z1(zzr zzrVar) {
        Preconditions.i(zzrVar);
        String str = zzrVar.a;
        Preconditions.f(str);
        l2(str, false);
        this.a.l0().W(zzrVar.b);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void b4(zzr zzrVar) {
        Z1(zzrVar);
        D4(new tpo(this, zzrVar, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void c3(zzr zzrVar, Bundle bundle, zzge zzgeVar) {
        Z1(zzrVar);
        String str = zzrVar.a;
        Preconditions.i(str);
        this.a.d().Z(new g3g(this, zzrVar, bundle, zzgeVar, str, 7, false));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List i4(String str, String str2, boolean z, zzr zzrVar) {
        Z1(zzrVar);
        String str3 = zzrVar.a;
        Preconditions.i(str3);
        zzpg zzpgVar = this.a;
        try {
            List<z1p> list = (List) zzpgVar.d().X(new uqo(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (z1p z1pVar : list) {
                if (!z && zzpp.u0(z1pVar.c)) {
                }
                arrayList.add(new zzpl(z1pVar));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            zzpgVar.b().g.c(zzgu.U(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            zzpgVar.b().g.c(zzgu.U(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void j1(zzpl zzplVar, zzr zzrVar) {
        Preconditions.i(zzplVar);
        Z1(zzrVar);
        D4(new jgo(this, zzplVar, zzrVar, 6));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void k3(zzr zzrVar, zzaf zzafVar) {
        Z1(zzrVar);
        D4(new jgo(7, this, zzrVar, zzafVar));
    }

    public final void l2(String str, boolean z) {
        boolean isEmpty = TextUtils.isEmpty(str);
        zzpg zzpgVar = this.a;
        if (isEmpty) {
            zzpgVar.b().g.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                Boolean bool = this.b;
                if (bool == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.c)) {
                        if (!UidVerifier.a(Binder.getCallingUid(), zzpgVar.l.a) && !GoogleSignatureVerifier.a(zzpgVar.l.a).b(Binder.getCallingUid())) {
                            z2 = false;
                        }
                    }
                    bool = Boolean.valueOf(z2);
                    this.b = bool;
                }
                if (bool.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                zzpgVar.b().g.b(zzgu.U(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.c == null) {
            Context context = zzpgVar.l.a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.a;
            if (UidVerifier.b(context, callingUid, str)) {
                this.c = str;
            }
        }
        if (str.equals(this.c)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void o4(zzbh zzbhVar, zzr zzrVar) {
        Preconditions.i(zzbhVar);
        Z1(zzrVar);
        D4(new jgo(this, zzbhVar, zzrVar, 4));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List r4(String str, String str2, zzr zzrVar) {
        Z1(zzrVar);
        String str3 = zzrVar.a;
        Preconditions.i(str3);
        zzpg zzpgVar = this.a;
        try {
            return (List) zzpgVar.d().X(new uqo(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            zzpgVar.b().g.b(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final zzao w3(zzr zzrVar) {
        Z1(zzrVar);
        String str = zzrVar.a;
        Preconditions.f(str);
        zzpg zzpgVar = this.a;
        try {
            return (zzao) zzpgVar.d().Y(new een(this, zzrVar, false, 18)).get(Ua.s, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzpgVar.b().g.c(zzgu.U(str), e, "Failed to get consent. appId");
            return new zzao(null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void x3(Bundle bundle, zzr zzrVar) {
        Z1(zzrVar);
        String str = zzrVar.a;
        Preconditions.i(str);
        D4(new n2(10, this, bundle, str, zzrVar, false));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void y2(long j, String str, String str2, String str3) {
        D4(new kqj(this, str2, str3, str, j, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void y4(zzr zzrVar) {
        Preconditions.f(zzrVar.a);
        Preconditions.i(zzrVar.s);
        S1(new dro(this, zzrVar, 0));
    }
}

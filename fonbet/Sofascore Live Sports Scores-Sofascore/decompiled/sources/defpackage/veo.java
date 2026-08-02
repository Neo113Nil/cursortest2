package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzavj;
import com.google.android.gms.internal.ads.zzavn;
import com.google.android.gms.internal.ads.zzavp;
import com.google.android.gms.internal.ads.zzaza;
import com.google.android.gms.internal.ads.zzgei;
import com.google.android.gms.internal.ads.zzggt;
import com.google.android.gms.internal.ads.zzggv;
import com.google.android.gms.internal.ads.zzgmf;
import com.google.android.gms.internal.ads.zzgmg;
import com.google.android.gms.internal.ads.zzgpi;
import com.google.android.gms.internal.ads.zzgpx;
import com.google.android.gms.internal.ads.zzgqc;
import com.google.android.gms.internal.ads.zzgrf;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzhah;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcq;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zzifu;
import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class veo implements zzgmf {
    public final zzggv a;
    public final zzgpx b;
    public final zzgpi c;
    public final ExecutorService d;
    public final zzgqc e;
    public final zzgrh f;
    public final Object g = new Object();
    public final String h;
    public final long i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public c78 m;

    public veo(zzggv zzggvVar, zzgpx zzgpxVar, zzgpi zzgpiVar, zzgqc zzgqcVar, zzgrh zzgrhVar, zzgei zzgeiVar, ExecutorService executorService) {
        this.a = zzggvVar;
        this.b = zzgpxVar;
        this.c = zzgpiVar;
        this.d = executorService;
        this.e = zzgqcVar;
        this.f = zzgrhVar;
        this.h = zzgeiVar.V();
        this.i = zzgeiVar.d0();
        this.j = zzgeiVar.c0();
        this.k = zzgeiVar.S();
        this.l = zzgeiVar.U();
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final emo a(Context context, View view, Activity activity) {
        return zzhcy.c(this.d, new r0o(this, context, view, activity, 5));
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final emo b(Context context, String str, View view) {
        return zzhcy.c(this.d, new r0o(this, context, str, view, 6));
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final emo c(Context context) {
        return zzhcy.c(this.d, new een(14, this, context));
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final void d(InputEvent inputEvent) {
        try {
            synchronized (this.g) {
                try {
                    c78 c78Var = this.m;
                    if (c78Var != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("evt", inputEvent);
                        ((zzavp) c78Var.d).c(c78Var.c, Optional.of(hashMap));
                    } else {
                        this.f.b(20105);
                    }
                } finally {
                }
            }
        } catch (zzavj | zzavn e) {
            this.f.d(20104, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(HashMap hashMap) {
        String str;
        zzgrf a;
        String str2;
        hashMap.put("v", this.h);
        ddb ddbVar = (ddb) hashMap.get("gs");
        ddb ddbVar2 = (ddb) hashMap.get("ai");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zzgrh zzgrhVar = this.f;
        byte[] bArr = null;
        long j = -1;
        if (ddbVar != null) {
            a = zzgrhVar.a(20107);
            try {
                try {
                    a.a();
                    zzaza zzazaVar = (zzaza) ddbVar.get(this.j, timeUnit);
                    if (zzazaVar != null) {
                        bArr = zzazaVar.E0().d();
                        str = zzazaVar.z0().length() > 1 ? zzazaVar.z0() : "E";
                        try {
                            if (zzazaVar.A0()) {
                                j = zzazaVar.B0();
                            }
                        } catch (ClassCastException e) {
                            e = e;
                            a.b(e);
                            a.c();
                            if (str.equals("E")) {
                            }
                            hashMap.put("int", str);
                            if (bArr != null) {
                            }
                            hashMap.put("gv", Long.valueOf(j));
                        } catch (InterruptedException e2) {
                            e = e2;
                            a.b(e);
                            a.c();
                            if (str.equals("E")) {
                            }
                            hashMap.put("int", str);
                            if (bArr != null) {
                            }
                            hashMap.put("gv", Long.valueOf(j));
                        } catch (ExecutionException e3) {
                            e = e3;
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            a.b(e);
                            a.c();
                            if (str.equals("E")) {
                            }
                            hashMap.put("int", str);
                            if (bArr != null) {
                            }
                            hashMap.put("gv", Long.valueOf(j));
                        } catch (TimeoutException e4) {
                            e = e4;
                            a.b(e);
                            a.c();
                            if (str.equals("E")) {
                            }
                            hashMap.put("int", str);
                            if (bArr != null) {
                            }
                            hashMap.put("gv", Long.valueOf(j));
                        }
                    } else {
                        str = "E";
                    }
                } finally {
                }
            } catch (ClassCastException e5) {
                e = e5;
                str = "E";
                a.b(e);
                a.c();
                if (str.equals("E")) {
                    a = zzgrhVar.a(20108);
                    try {
                        try {
                            a.a();
                            str2 = (String) ddbVar2.get(this.i, timeUnit);
                            if (true != b0a.U(str2)) {
                            }
                        } finally {
                        }
                    } catch (ClassCastException e6) {
                        e = e6;
                        a.b(e);
                    } catch (InterruptedException e7) {
                        e = e7;
                        a.b(e);
                    } catch (ExecutionException e8) {
                        e = e8;
                        Throwable cause2 = e.getCause();
                        if (cause2 != null) {
                            e = cause2;
                        }
                        a.b(e);
                    } catch (TimeoutException e9) {
                        e = e9;
                        a.b(e);
                    }
                }
                hashMap.put("int", str);
                if (bArr != null) {
                }
                hashMap.put("gv", Long.valueOf(j));
            } catch (InterruptedException e10) {
                e = e10;
                str = "E";
                a.b(e);
                a.c();
                if (str.equals("E")) {
                }
                hashMap.put("int", str);
                if (bArr != null) {
                }
                hashMap.put("gv", Long.valueOf(j));
            } catch (ExecutionException e11) {
                e = e11;
                str = "E";
            } catch (TimeoutException e12) {
                e = e12;
                str = "E";
                a.b(e);
                a.c();
                if (str.equals("E")) {
                }
                hashMap.put("int", str);
                if (bArr != null) {
                }
                hashMap.put("gv", Long.valueOf(j));
            }
            a.c();
        } else {
            str = "E";
        }
        if (str.equals("E") && ddbVar2 != null) {
            a = zzgrhVar.a(20108);
            a.a();
            str2 = (String) ddbVar2.get(this.i, timeUnit);
            if (true != b0a.U(str2)) {
                str = str2;
            }
        }
        hashMap.put("int", str);
        if (bArr != null) {
            hashMap.put("att", bArr);
        }
        hashMap.put("gv", Long.valueOf(j));
    }

    public final void f(zzavp zzavpVar, byte[] bArr, boolean z) {
        zzgrf a = this.f.a(20102);
        try {
            try {
                a.a();
                synchronized (this.g) {
                    this.m = c78.p(zzavpVar, bArr, z);
                }
                a.c();
            } catch (zzavj e) {
                e = e;
                a.b(e);
                throw new zzgmg("r: 2", e);
            } catch (zzavn e2) {
                e = e2;
                a.b(e);
                throw new zzgmg("r: 2", e);
            } catch (Throwable th) {
                a.b(th);
                throw th;
            }
        } catch (Throwable th2) {
            a.c();
            throw th2;
        }
    }

    public final String g(HashMap hashMap) {
        String f;
        zzgrh zzgrhVar = this.f;
        try {
            zzgrhVar.a(20110).a();
            synchronized (this.g) {
                try {
                    c78 c78Var = this.m;
                    if (c78Var == null) {
                        zzgrhVar.b(20109);
                        f = "";
                    } else {
                        byte[] bArr = (byte[]) ((zzavp) c78Var.d).c(c78Var.b, Optional.of(hashMap));
                        iko ikoVar = zzhah.b;
                        f = (ikoVar.e == null ? ikoVar : ikoVar.h(ikoVar.d, null)).f(bArr.length, bArr);
                    }
                } finally {
                }
            }
            return f;
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final String zza() {
        synchronized (this.g) {
            try {
                c78 c78Var = this.m;
                if (c78Var == null) {
                    return "3.904631200.-1";
                }
                return (String) c78Var.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final zzhcq zzb() {
        final int i = 1;
        slo sloVar = slo.a;
        boolean z = this.l;
        zzgpi zzgpiVar = this.c;
        if (z) {
            return zzhcy.i(zzgpiVar.zzf(), new seo(this, 1), sloVar);
        }
        zzhcq r = zzhcq.r(zzgpiVar.zzb());
        ueo ueoVar = ueo.b;
        ExecutorService executorService = this.d;
        final int i2 = 0;
        return zzhcy.f(zzhcy.h(zzhcy.e(r, Throwable.class, ueoVar, executorService), new zzhcg(this) { // from class: reo
            public final /* synthetic */ veo b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzhcg
            public final ddb zza(Object obj) {
                int i3 = i2;
                slo sloVar2 = slo.a;
                veo veoVar = this.b;
                switch (i3) {
                    case 0:
                        zzggt zzggtVar = (zzggt) obj;
                        if (zzggtVar != null) {
                            veoVar.a.b((zzifu) zzggtVar.G());
                        }
                        if (veoVar.b.a(zzggtVar)) {
                            return zzhcy.i(veoVar.c.zze(), new seo(veoVar, 0), sloVar2);
                        }
                        veoVar.f.b(20103);
                        throw new zzgmg(1);
                    default:
                        return veoVar.k ? zzhcy.i(veoVar.c.zzf(), new seo(veoVar, 1), sloVar2) : zzhcy.b((Throwable) obj);
                }
            }
        }, executorService), Throwable.class, new zzhcg(this) { // from class: reo
            public final /* synthetic */ veo b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzhcg
            public final ddb zza(Object obj) {
                int i3 = i;
                slo sloVar2 = slo.a;
                veo veoVar = this.b;
                switch (i3) {
                    case 0:
                        zzggt zzggtVar = (zzggt) obj;
                        if (zzggtVar != null) {
                            veoVar.a.b((zzifu) zzggtVar.G());
                        }
                        if (veoVar.b.a(zzggtVar)) {
                            return zzhcy.i(veoVar.c.zze(), new seo(veoVar, 0), sloVar2);
                        }
                        veoVar.f.b(20103);
                        throw new zzgmg(1);
                    default:
                        return veoVar.k ? zzhcy.i(veoVar.c.zzf(), new seo(veoVar, 1), sloVar2) : zzhcy.b((Throwable) obj);
                }
            }
        }, sloVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgmf
    public final int zzg() {
        return 4;
    }
}

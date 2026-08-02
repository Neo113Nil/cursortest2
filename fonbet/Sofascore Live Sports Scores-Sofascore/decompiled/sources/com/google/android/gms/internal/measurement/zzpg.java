package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.measurement.zzky;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zzmb;
import com.google.android.gms.internal.measurement.zzmc;
import com.google.android.gms.internal.measurement.zzmd;
import com.google.android.gms.internal.measurement.zzme;
import com.google.android.gms.internal.measurement.zzmj;
import com.google.android.gms.internal.measurement.zzmk;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzqe;
import com.google.android.gms.internal.measurement.zzqm;
import com.google.android.gms.internal.measurement.zzqn;
import defpackage.b1;
import defpackage.ewf;
import defpackage.f8;
import defpackage.g8;
import defpackage.i0p;
import defpackage.lvc;
import defpackage.n72;
import defpackage.o0p;
import defpackage.oea;
import defpackage.uif;
import defpackage.vv9;
import defpackage.xen;
import defpackage.yuo;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzpg {
    public static final zzpe h = new zzpe(0);
    public static final i0p i;
    public volatile n72 a;
    public final zzlk b;
    public final String c;
    public final boolean d;
    public final vv9 e;
    public final zzps f;
    public final zzqt g;

    static {
        xen xenVar = xen.c;
        int i2 = vv9.c;
        i = new i0p(xenVar, false, ewf.j);
    }

    public zzpg(zzlk zzlkVar, i0p i0pVar) {
        this.b = zzlkVar;
        Context context = zzlkVar.b;
        String str = i0pVar.d;
        if (str == null) {
            str = (String) i0pVar.a.apply(context);
            i0pVar.d = str;
        }
        this.c = str;
        this.d = i0pVar.b;
        this.e = i0pVar.c;
        this.a = null;
        this.f = new zzps();
        this.g = new zzqt(zzlkVar, str);
    }

    public final n72 a() {
        n72 n72Var;
        n72 n72Var2 = this.a;
        if (n72Var2 != null) {
            return n72Var2;
        }
        synchronized (this) {
            try {
                n72Var = this.a;
                if (n72Var == null) {
                    StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        n72 a = this.g.a();
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        int i2 = ((uif) a.e).c - 2;
                        if (i2 != 15 && i2 != 16) {
                            zzlk zzlkVar = this.b;
                            zzlkVar.g.a();
                            if (this.d || this.g.b() || !((String) a.b).isEmpty()) {
                                final int i3 = 2;
                                zzlkVar.a().execute(new Runnable(this) { // from class: l0p
                                    public final /* synthetic */ zzpg b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ddb a2;
                                        b1 zzb;
                                        int i4 = i3;
                                        zzpg zzpgVar = this.b;
                                        switch (i4) {
                                            case 0:
                                                zzpgVar.b();
                                                return;
                                            case 1:
                                                final zzqe zzqeVar = zzpgVar.b.i;
                                                boolean z = zzpgVar.d;
                                                s0p s0pVar = s0p.a;
                                                final zzqm zzqmVar = (zzqm) zzqeVar.c.get();
                                                if (zzqmVar == null && !z) {
                                                    ru9 ru9Var = ru9.b;
                                                    return;
                                                }
                                                if ((zzqeVar.e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = zzqeVar.f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i5 = zzqeVar.e;
                                                            if ((i5 & 64) == 0) {
                                                                copyOnWriteArrayList.add(s0pVar);
                                                                zzqeVar.e = i5 | 64;
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                }
                                                if (zzqeVar.h == null) {
                                                    synchronized (zzqeVar.g) {
                                                        try {
                                                            if (zzqeVar.h == null) {
                                                                if (zzqmVar == null) {
                                                                    zzqmVar = t2p.a;
                                                                }
                                                                Context context = zzqeVar.a;
                                                                if (zzky.b(context)) {
                                                                    a2 = ((zzmj) zzqeVar.d.get()).a(new w2p(zzqeVar, zzqmVar));
                                                                    zzqeVar.h = a2;
                                                                } else {
                                                                    gl5 gl5Var = gl5.d;
                                                                    tmi tmiVar = zzqeVar.b;
                                                                    a2 = g8.q(zzky.a(context, Executors.callable(gl5Var, null), (Executor) tmiVar.get()), new fj0() { // from class: r2p
                                                                        @Override // defpackage.fj0
                                                                        public final ddb apply(Object obj) {
                                                                            zzqe zzqeVar2 = zzqe.this;
                                                                            return ((zzmj) zzqeVar2.d.get()).a(new w2p(zzqeVar2, zzqmVar));
                                                                        }
                                                                    }, (Executor) tmiVar.get());
                                                                    zzqeVar.h = a2;
                                                                }
                                                                a2.addListener(new f2p(1, a2), (Executor) zzqeVar.b.get());
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                n72 a3 = zzpgVar.a();
                                                String str = (String) a3.b;
                                                zzlk zzlkVar2 = zzpgVar.b;
                                                tmi tmiVar2 = zzlkVar2.d;
                                                zzqn b = zzlkVar2.g.b();
                                                boolean z2 = b.i;
                                                if (b.j) {
                                                    if (vha.M(str) && !z2) {
                                                        ru9 ru9Var2 = ru9.b;
                                                        return;
                                                    }
                                                    zzmb z3 = zzme.z();
                                                    uif uifVar = (uif) a3.e;
                                                    int i6 = uifVar.b;
                                                    zzmc y = zzmd.y();
                                                    y.k();
                                                    ((zzmd) y.b).z(i6);
                                                    int i7 = uifVar.c;
                                                    y.k();
                                                    ((zzmd) y.b).A(i7);
                                                    zzmd zzmdVar = (zzmd) y.m();
                                                    z3.k();
                                                    ((zzme) z3.b).B(zzmdVar);
                                                    if (!vha.M(str)) {
                                                        z3.k();
                                                        ((zzme) z3.b).A(str);
                                                    }
                                                    if (z2) {
                                                        String str2 = zzpgVar.c;
                                                        z3.k();
                                                        ((zzme) z3.b).C(str2);
                                                    }
                                                    zzb = ((zzmj) tmiVar2.get()).b((zzme) z3.m());
                                                } else {
                                                    if (vha.M(str)) {
                                                        ru9 ru9Var3 = ru9.b;
                                                        return;
                                                    }
                                                    zzb = ((zzmj) tmiVar2.get()).zzb(str);
                                                }
                                                o0p o0pVar = new o0p(zzpgVar, 0);
                                                lvc a4 = zzlkVar2.a();
                                                int i8 = d1.l;
                                                b1 b1Var = new b1(zzb, zzmk.class, o0pVar);
                                                zzb.addListener(b1Var, oea.u(a4, b1Var));
                                                return;
                                        }
                                    }
                                });
                                zzlkVar.a.a((zzacr) a.c, this.e, this.c);
                                if (this.g.b()) {
                                    final int i4 = 1;
                                    zzlkVar.a().execute(new Runnable(this) { // from class: l0p
                                        public final /* synthetic */ zzpg b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ddb a2;
                                            b1 zzb;
                                            int i42 = i4;
                                            zzpg zzpgVar = this.b;
                                            switch (i42) {
                                                case 0:
                                                    zzpgVar.b();
                                                    return;
                                                case 1:
                                                    final zzqe zzqeVar = zzpgVar.b.i;
                                                    boolean z = zzpgVar.d;
                                                    s0p s0pVar = s0p.a;
                                                    final zzqm zzqmVar = (zzqm) zzqeVar.c.get();
                                                    if (zzqmVar == null && !z) {
                                                        ru9 ru9Var = ru9.b;
                                                        return;
                                                    }
                                                    if ((zzqeVar.e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = zzqeVar.f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i5 = zzqeVar.e;
                                                                if ((i5 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(s0pVar);
                                                                    zzqeVar.e = i5 | 64;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    if (zzqeVar.h == null) {
                                                        synchronized (zzqeVar.g) {
                                                            try {
                                                                if (zzqeVar.h == null) {
                                                                    if (zzqmVar == null) {
                                                                        zzqmVar = t2p.a;
                                                                    }
                                                                    Context context = zzqeVar.a;
                                                                    if (zzky.b(context)) {
                                                                        a2 = ((zzmj) zzqeVar.d.get()).a(new w2p(zzqeVar, zzqmVar));
                                                                        zzqeVar.h = a2;
                                                                    } else {
                                                                        gl5 gl5Var = gl5.d;
                                                                        tmi tmiVar = zzqeVar.b;
                                                                        a2 = g8.q(zzky.a(context, Executors.callable(gl5Var, null), (Executor) tmiVar.get()), new fj0() { // from class: r2p
                                                                            @Override // defpackage.fj0
                                                                            public final ddb apply(Object obj) {
                                                                                zzqe zzqeVar2 = zzqe.this;
                                                                                return ((zzmj) zzqeVar2.d.get()).a(new w2p(zzqeVar2, zzqmVar));
                                                                            }
                                                                        }, (Executor) tmiVar.get());
                                                                        zzqeVar.h = a2;
                                                                    }
                                                                    a2.addListener(new f2p(1, a2), (Executor) zzqeVar.b.get());
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    n72 a3 = zzpgVar.a();
                                                    String str = (String) a3.b;
                                                    zzlk zzlkVar2 = zzpgVar.b;
                                                    tmi tmiVar2 = zzlkVar2.d;
                                                    zzqn b = zzlkVar2.g.b();
                                                    boolean z2 = b.i;
                                                    if (b.j) {
                                                        if (vha.M(str) && !z2) {
                                                            ru9 ru9Var2 = ru9.b;
                                                            return;
                                                        }
                                                        zzmb z3 = zzme.z();
                                                        uif uifVar = (uif) a3.e;
                                                        int i6 = uifVar.b;
                                                        zzmc y = zzmd.y();
                                                        y.k();
                                                        ((zzmd) y.b).z(i6);
                                                        int i7 = uifVar.c;
                                                        y.k();
                                                        ((zzmd) y.b).A(i7);
                                                        zzmd zzmdVar = (zzmd) y.m();
                                                        z3.k();
                                                        ((zzme) z3.b).B(zzmdVar);
                                                        if (!vha.M(str)) {
                                                            z3.k();
                                                            ((zzme) z3.b).A(str);
                                                        }
                                                        if (z2) {
                                                            String str2 = zzpgVar.c;
                                                            z3.k();
                                                            ((zzme) z3.b).C(str2);
                                                        }
                                                        zzb = ((zzmj) tmiVar2.get()).b((zzme) z3.m());
                                                    } else {
                                                        if (vha.M(str)) {
                                                            ru9 ru9Var3 = ru9.b;
                                                            return;
                                                        }
                                                        zzb = ((zzmj) tmiVar2.get()).zzb(str);
                                                    }
                                                    o0p o0pVar = new o0p(zzpgVar, 0);
                                                    lvc a4 = zzlkVar2.a();
                                                    int i8 = d1.l;
                                                    b1 b1Var = new b1(zzb, zzmk.class, o0pVar);
                                                    zzb.addListener(b1Var, oea.u(a4, b1Var));
                                                    return;
                                            }
                                        }
                                    });
                                }
                            } else {
                                final int i5 = 0;
                                zzlkVar.a().execute(new Runnable(this) { // from class: l0p
                                    public final /* synthetic */ zzpg b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ddb a2;
                                        b1 zzb;
                                        int i42 = i5;
                                        zzpg zzpgVar = this.b;
                                        switch (i42) {
                                            case 0:
                                                zzpgVar.b();
                                                return;
                                            case 1:
                                                final zzqe zzqeVar = zzpgVar.b.i;
                                                boolean z = zzpgVar.d;
                                                s0p s0pVar = s0p.a;
                                                final zzqm zzqmVar = (zzqm) zzqeVar.c.get();
                                                if (zzqmVar == null && !z) {
                                                    ru9 ru9Var = ru9.b;
                                                    return;
                                                }
                                                if ((zzqeVar.e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = zzqeVar.f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i52 = zzqeVar.e;
                                                            if ((i52 & 64) == 0) {
                                                                copyOnWriteArrayList.add(s0pVar);
                                                                zzqeVar.e = i52 | 64;
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                }
                                                if (zzqeVar.h == null) {
                                                    synchronized (zzqeVar.g) {
                                                        try {
                                                            if (zzqeVar.h == null) {
                                                                if (zzqmVar == null) {
                                                                    zzqmVar = t2p.a;
                                                                }
                                                                Context context = zzqeVar.a;
                                                                if (zzky.b(context)) {
                                                                    a2 = ((zzmj) zzqeVar.d.get()).a(new w2p(zzqeVar, zzqmVar));
                                                                    zzqeVar.h = a2;
                                                                } else {
                                                                    gl5 gl5Var = gl5.d;
                                                                    tmi tmiVar = zzqeVar.b;
                                                                    a2 = g8.q(zzky.a(context, Executors.callable(gl5Var, null), (Executor) tmiVar.get()), new fj0() { // from class: r2p
                                                                        @Override // defpackage.fj0
                                                                        public final ddb apply(Object obj) {
                                                                            zzqe zzqeVar2 = zzqe.this;
                                                                            return ((zzmj) zzqeVar2.d.get()).a(new w2p(zzqeVar2, zzqmVar));
                                                                        }
                                                                    }, (Executor) tmiVar.get());
                                                                    zzqeVar.h = a2;
                                                                }
                                                                a2.addListener(new f2p(1, a2), (Executor) zzqeVar.b.get());
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                n72 a3 = zzpgVar.a();
                                                String str = (String) a3.b;
                                                zzlk zzlkVar2 = zzpgVar.b;
                                                tmi tmiVar2 = zzlkVar2.d;
                                                zzqn b = zzlkVar2.g.b();
                                                boolean z2 = b.i;
                                                if (b.j) {
                                                    if (vha.M(str) && !z2) {
                                                        ru9 ru9Var2 = ru9.b;
                                                        return;
                                                    }
                                                    zzmb z3 = zzme.z();
                                                    uif uifVar = (uif) a3.e;
                                                    int i6 = uifVar.b;
                                                    zzmc y = zzmd.y();
                                                    y.k();
                                                    ((zzmd) y.b).z(i6);
                                                    int i7 = uifVar.c;
                                                    y.k();
                                                    ((zzmd) y.b).A(i7);
                                                    zzmd zzmdVar = (zzmd) y.m();
                                                    z3.k();
                                                    ((zzme) z3.b).B(zzmdVar);
                                                    if (!vha.M(str)) {
                                                        z3.k();
                                                        ((zzme) z3.b).A(str);
                                                    }
                                                    if (z2) {
                                                        String str2 = zzpgVar.c;
                                                        z3.k();
                                                        ((zzme) z3.b).C(str2);
                                                    }
                                                    zzb = ((zzmj) tmiVar2.get()).b((zzme) z3.m());
                                                } else {
                                                    if (vha.M(str)) {
                                                        ru9 ru9Var3 = ru9.b;
                                                        return;
                                                    }
                                                    zzb = ((zzmj) tmiVar2.get()).zzb(str);
                                                }
                                                o0p o0pVar = new o0p(zzpgVar, 0);
                                                lvc a4 = zzlkVar2.a();
                                                int i8 = d1.l;
                                                b1 b1Var = new b1(zzb, zzmk.class, o0pVar);
                                                zzb.addListener(b1Var, oea.u(a4, b1Var));
                                                return;
                                        }
                                    }
                                });
                                n72Var = new n72(zzqv.F(), (uif) a.e);
                                if (this.d || ((uif) n72Var.e).c != 17) {
                                    this.a = n72Var;
                                }
                            }
                        }
                        n72Var = a;
                        if (this.d) {
                        }
                        this.a = n72Var;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        throw th;
                    }
                }
            } finally {
            }
        }
        return n72Var;
    }

    public final void b() {
        zzqt zzqtVar = this.g;
        zzlk zzlkVar = zzqtVar.a;
        b1 zza = ((zzmj) zzlkVar.d.get()).zza(zzqtVar.c);
        xen xenVar = xen.d;
        lvc a = zzlkVar.a();
        int i2 = g8.k;
        f8 f8Var = new f8(zza, xenVar);
        zza.addListener(f8Var, oea.u(a, f8Var));
        o0p o0pVar = new o0p(zzqtVar, 1);
        zzlk zzlkVar2 = this.b;
        g8.q(f8Var, o0pVar, zzlkVar2.a()).addListener(new yuo(6, this, f8Var), zzlkVar2.a());
    }
}

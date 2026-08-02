package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.appsflyer.internal.w;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.c0;
import com.facebook.d0;
import com.facebook.g0;
import com.facebook.internal.a0;
import com.facebook.internal.x;
import com.facebook.v;
import com.moloco.sdk.internal.publisher.h0;
import defpackage.cw3;
import defpackage.rd0;
import defpackage.xd0;
import defpackage.y2;
import defpackage.yz1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class i {
    public static ScheduledFuture c;
    public static volatile c0 a = new c0(2);
    public static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public static final w d = new w(3);

    public static final d0 a(b bVar, t tVar, boolean z, yz1 yz1Var) {
        Set set = cw3.a;
        if (!set.contains(i.class)) {
            try {
                String str = bVar.a;
                com.facebook.internal.u k = x.k(str, false);
                String str2 = d0.j;
                d0 C = h0.C(null, String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1)), null, null);
                C.i = true;
                Bundle bundle = C.d;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                String str3 = bVar.b;
                if (str3 == null) {
                    Date date = AccessToken.l;
                    AccessToken p = g.p();
                    str3 = p != null ? p.e : null;
                }
                if (str3 != null) {
                    bundle.putString("access_token", str3);
                }
                synchronized (l.c()) {
                    set.contains(l.class);
                }
                String r = j.r();
                if (r != null) {
                    bundle.putString("install_referrer", r);
                }
                C.d = bundle;
                int d2 = tVar.d(C, com.facebook.w.a(), k != null ? k.a : false, z);
                if (d2 != 0) {
                    yz1Var.b += d2;
                    C.j(new com.facebook.d(bVar, C, tVar, yz1Var, 1));
                    return C;
                }
            } catch (Throwable th) {
                cw3.a(i.class, th);
                return null;
            }
        }
        return null;
    }

    public static final ArrayList b(c0 c0Var, yz1 yz1Var) {
        t tVar;
        if (cw3.a.contains(i.class)) {
            return null;
        }
        try {
            c0Var.getClass();
            boolean f = com.facebook.w.f(com.facebook.w.a());
            ArrayList arrayList = new ArrayList();
            for (b bVar : c0Var.l()) {
                synchronized (c0Var) {
                    bVar.getClass();
                    tVar = (t) ((HashMap) c0Var.b).get(bVar);
                }
                if (tVar == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                d0 a2 = a(bVar, tVar, f, yz1Var);
                if (a2 != null) {
                    arrayList.add(a2);
                    if (rd0.a) {
                        HashSet hashSet = xd0.a;
                        try {
                            com.facebook.w.c().execute(new y2(a2, 13));
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            cw3.a(i.class, th);
            return null;
        }
    }

    public static final void c(final int i) {
        if (cw3.a.contains(i.class)) {
            return;
        }
        try {
            if (i == 0) {
                throw null;
            }
            b.execute(new Runnable() { // from class: com.facebook.appevents.h
                @Override // java.lang.Runnable
                public final void run() {
                    if (cw3.a.contains(i.class)) {
                        return;
                    }
                    int i2 = i;
                    try {
                        if (i2 == 0) {
                            throw null;
                        }
                        i.d(i2);
                    } catch (Throwable th) {
                        cw3.a(i.class, th);
                    }
                }
            });
        } catch (Throwable th) {
            cw3.a(i.class, th);
        }
    }

    public static final void d(int i) {
        if (cw3.a.contains(i.class)) {
            return;
        }
        try {
            if (i == 0) {
                throw null;
            }
            a.g(g.r());
            try {
                yz1 f = f(i, a);
                if (f != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", f.b);
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", (o) f.c);
                    LocalBroadcastManager.getInstance(com.facebook.w.a()).sendBroadcast(intent);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            cw3.a(i.class, th);
        }
    }

    public static final void e(b bVar, d0 d0Var, g0 g0Var, t tVar, yz1 yz1Var) {
        o oVar;
        if (cw3.a.contains(i.class)) {
            return;
        }
        try {
            g0Var.getClass();
            FacebookRequestError facebookRequestError = g0Var.c;
            o oVar2 = o.a;
            if (facebookRequestError == null) {
                oVar = oVar2;
            } else if (facebookRequestError.b == -1) {
                oVar = o.c;
            } else {
                String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{g0Var.toString(), facebookRequestError.toString()}, 2));
                oVar = o.b;
            }
            synchronized (com.facebook.w.b) {
            }
            tVar.b(facebookRequestError != null);
            o oVar3 = o.c;
            if (oVar == oVar3) {
                com.facebook.w.c().execute(new v(3, bVar, tVar));
            }
            if (oVar == oVar2 || ((o) yz1Var.c) == oVar3) {
                return;
            }
            yz1Var.c = oVar;
        } catch (Throwable th) {
            cw3.a(i.class, th);
        }
    }

    public static final yz1 f(int i, c0 c0Var) {
        if (!cw3.a.contains(i.class)) {
            try {
                if (i == 0) {
                    throw null;
                }
                c0Var.getClass();
                yz1 yz1Var = new yz1(18, false);
                yz1Var.c = o.a;
                ArrayList b2 = b(c0Var, yz1Var);
                if (!b2.isEmpty()) {
                    com.facebook.b bVar = a0.a;
                    switch (i) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            synchronized (com.facebook.w.b) {
                            }
                            Iterator it = b2.iterator();
                            while (it.hasNext()) {
                                ((d0) it.next()).c();
                            }
                            return yz1Var;
                        default:
                            throw null;
                    }
                }
            } catch (Throwable th) {
                cw3.a(i.class, th);
                return null;
            }
        }
        return null;
    }
}

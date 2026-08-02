package com.facebook;

import android.view.View;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoBidTokenListener;
import defpackage.bzd;
import defpackage.cw3;
import defpackage.de6;
import defpackage.ffi;
import defpackage.fx5;
import defpackage.inb;
import defpackage.jz0;
import defpackage.kpd;
import defpackage.mx9;
import defpackage.nx9;
import defpackage.o2g;
import defpackage.o4h;
import defpackage.py1;
import defpackage.q19;
import defpackage.qd0;
import defpackage.qv0;
import defpackage.r19;
import defpackage.rd0;
import defpackage.s19;
import defpackage.stc;
import defpackage.sw9;
import defpackage.tef;
import defpackage.u4a;
import defpackage.uic;
import defpackage.x9l;
import defpackage.xjk;
import defpackage.xrf;
import defpackage.yjk;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class t implements com.facebook.internal.n, MolocoBidTokenListener, kpd {
    public final /* synthetic */ int a;

    public /* synthetic */ t(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a(String str) {
        throw new q(str);
    }

    @Override // defpackage.kpd
    public x9l L(View view, x9l x9lVar) {
        view.getClass();
        u4a i = x9lVar.a.i(128);
        i.getClass();
        view.setPadding(i.a, i.b, i.c, i.d);
        return x9lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.internal.n
    public void d(boolean z) {
        HashSet hashSet;
        HashSet e;
        HashSet hashSet2 = null;
        r1 = null;
        xjk xjkVar = null;
        hashSet2 = null;
        hashSet2 = null;
        hashSet2 = null;
        boolean z2 = false;
        Object[] objArr = 0;
        switch (this.a) {
            case 2:
                w wVar = w.a;
                if (z && k0.c()) {
                    com.facebook.internal.q.a(new sw9(3), com.facebook.internal.o.CrashReport);
                    com.facebook.internal.q.a(new sw9(4), com.facebook.internal.o.ErrorReport);
                    com.facebook.internal.q.a(new sw9(5), com.facebook.internal.o.AnrReport);
                    break;
                }
                break;
            case 3:
                w wVar2 = w.a;
                if (z && !cw3.a.contains(com.facebook.appevents.n.class)) {
                    try {
                        com.facebook.internal.x.e.add(new com.facebook.appevents.m());
                        com.facebook.internal.x.d();
                        break;
                    } catch (Throwable th) {
                        cw3.a(com.facebook.appevents.n.class, th);
                        return;
                    }
                }
                break;
            case 4:
                if (!z) {
                    w wVar3 = w.a;
                    break;
                } else {
                    w.n = true;
                    break;
                }
            case 5:
                if (!z) {
                    w wVar4 = w.a;
                    break;
                } else {
                    w.o = true;
                    break;
                }
            case 6:
                if (!z) {
                    w wVar5 = w.a;
                    break;
                } else {
                    w.p = true;
                    break;
                }
            case 7:
            default:
                if (z) {
                    stc stcVar = stc.a;
                    if (!cw3.a.contains(stc.class)) {
                        try {
                            try {
                                w.c().execute(new defpackage.x(19));
                                break;
                            } catch (Exception unused) {
                                return;
                            }
                        } catch (Throwable th2) {
                            cw3.a(stc.class, th2);
                        }
                    }
                }
                break;
            case 8:
                if (z) {
                    uic uicVar = uic.b;
                    Object obj = uic.class;
                    try {
                        if (!cw3.a.contains(obj)) {
                            try {
                                w.c().execute(new defpackage.x(18));
                            } catch (Exception unused2) {
                                obj = w.a;
                            }
                            break;
                        }
                    } catch (Throwable th3) {
                        cw3.a(obj, th3);
                        return;
                    }
                }
                break;
            case 9:
                if (z) {
                    fx5 fx5Var = fx5.a;
                    if (!cw3.a.contains(fx5.class)) {
                        try {
                            fx5.b = true;
                            fx5.a.a();
                            break;
                        } catch (Throwable th4) {
                            cw3.a(fx5.class, th4);
                            return;
                        }
                    }
                }
                break;
            case 10:
                if (z) {
                    jz0 jz0Var = jz0.a;
                    Set set = cw3.a;
                    if (!set.contains(jz0.class)) {
                        try {
                            if (!jz0.b) {
                                jz0 jz0Var2 = jz0.a;
                                if (!set.contains(jz0Var2)) {
                                    try {
                                        com.facebook.internal.u k = com.facebook.internal.x.k(w.b(), false);
                                        if (k != null) {
                                            JSONArray jSONArray = k.s;
                                            try {
                                                if (!set.contains(jz0Var2)) {
                                                    try {
                                                        hashSet = com.facebook.internal.k0.e(jSONArray);
                                                        if (hashSet == null) {
                                                            hashSet = new HashSet();
                                                        }
                                                    } catch (Exception unused3) {
                                                        hashSet = new HashSet();
                                                    }
                                                    hashSet2 = hashSet;
                                                }
                                            } catch (Throwable th5) {
                                                cw3.a(jz0Var2, th5);
                                            }
                                            jz0.c = hashSet2;
                                        }
                                    } catch (Throwable th6) {
                                        cw3.a(jz0Var2, th6);
                                    }
                                }
                                jz0.b = !jz0.c.isEmpty();
                                break;
                            } else {
                                break;
                            }
                        } catch (Throwable th7) {
                            cw3.a(jz0.class, th7);
                            return;
                        }
                    }
                }
                break;
            case 11:
                if (z) {
                    nx9 nx9Var = nx9.a;
                    if (!cw3.a.contains(nx9.class)) {
                        try {
                            if (qv0.c()) {
                                nx9.e.set(true);
                                nx9.d();
                            } else {
                                mx9.A();
                            }
                            break;
                        } catch (Throwable th8) {
                            cw3.a(nx9.class, th8);
                            return;
                        }
                    }
                }
                break;
            case 12:
                if (z) {
                    ffi ffiVar = ffi.a;
                    Set set2 = cw3.a;
                    if (!set2.contains(ffi.class)) {
                        try {
                            if (ffi.b) {
                                break;
                            } else {
                                ffi ffiVar2 = ffi.a;
                                if (!set2.contains(ffiVar2)) {
                                    try {
                                        com.facebook.internal.u k2 = com.facebook.internal.x.k(w.b(), false);
                                        if (k2 != null) {
                                            ffiVar2.a(k2.r);
                                        }
                                    } catch (Throwable th9) {
                                        cw3.a(ffiVar2, th9);
                                    }
                                }
                                if (ffi.c.isEmpty()) {
                                    if (!ffi.d.isEmpty()) {
                                    }
                                    ffi.b = z2;
                                    break;
                                }
                                z2 = true;
                                ffi.b = z2;
                            }
                        } catch (Throwable th10) {
                            cw3.a(ffi.class, th10);
                            return;
                        }
                    }
                }
                break;
            case 13:
                if (z) {
                    tef tefVar = tef.a;
                    if (!cw3.a.contains(tef.class)) {
                        try {
                            tef.b = true;
                            tef.a.a();
                            break;
                        } catch (Throwable th11) {
                            cw3.a(tef.class, th11);
                            return;
                        }
                    }
                }
                break;
            case 14:
                if (z) {
                    Set set3 = cw3.a;
                    if (!set3.contains(inb.class)) {
                        try {
                            inb inbVar = inb.b;
                            if (!set3.contains(inbVar)) {
                                try {
                                    com.facebook.internal.u k3 = com.facebook.internal.x.k(w.b(), false);
                                    if (k3 != null) {
                                        inb.d = k3.n;
                                    }
                                } catch (Throwable th12) {
                                    cw3.a(inbVar, th12);
                                }
                            }
                            if (inb.d != null) {
                                inb.c = true;
                                break;
                            }
                        } catch (Throwable th13) {
                            cw3.a(inb.class, th13);
                            return;
                        }
                    }
                }
                break;
            case 15:
                if (z) {
                    py1 py1Var = py1.a;
                    Set set4 = cw3.a;
                    if (!set4.contains(py1.class)) {
                        try {
                            py1 py1Var2 = py1.a;
                            if (!set4.contains(py1Var2)) {
                                try {
                                    com.facebook.internal.u k4 = com.facebook.internal.x.k(w.b(), false);
                                    if (k4 != null && (e = com.facebook.internal.k0.e(k4.o)) != null) {
                                        py1.c = e;
                                    }
                                } catch (Throwable th14) {
                                    cw3.a(py1Var2, th14);
                                }
                            }
                            HashSet hashSet3 = py1.c;
                            if (hashSet3 != null && !hashSet3.isEmpty()) {
                                py1.b = true;
                                break;
                            }
                        } catch (Throwable th15) {
                            cw3.a(py1.class, th15);
                            return;
                        }
                    }
                }
                break;
            case 16:
                if (z) {
                    xrf xrfVar = xrf.a;
                    if (!cw3.a.contains(xrf.class)) {
                        try {
                            xrf.a.a();
                            if (!xrf.c.isEmpty()) {
                                xrf.b = true;
                                break;
                            }
                        } catch (Throwable th16) {
                            cw3.a(xrf.class, th16);
                            return;
                        }
                    }
                }
                break;
            case 17:
                if (z) {
                    o4h o4hVar = o4h.a;
                    if (!cw3.a.contains(o4h.class)) {
                        try {
                            o4h.a.a();
                            if (o4h.c.isEmpty() && o4h.d.isEmpty()) {
                                o4h.b = false;
                            } else {
                                o4h.b = true;
                            }
                            break;
                        } catch (Throwable th17) {
                            cw3.a(o4h.class, th17);
                            return;
                        }
                    }
                }
                break;
            case 18:
                if (z) {
                    int i = rd0.m;
                    try {
                        d0 d0Var = new d0(null, w.b().concat("/cloudbridge_settings"), null, h0.a, new qd0(objArr == true ? 1 : 0));
                        b bVar = com.facebook.internal.a0.a;
                        synchronized (w.b) {
                        }
                        d0Var.d();
                        break;
                    } catch (JSONException e2) {
                        b bVar2 = com.facebook.internal.a0.a;
                        de6.b(e2);
                        synchronized (w.b) {
                            return;
                        }
                    }
                }
                break;
            case 19:
                if (z) {
                    q19 q19Var = q19.a;
                    if (!cw3.a.contains(q19.class)) {
                        try {
                            q19.b = true;
                            q19.c = new r19(w.a());
                            q19.d = "https://www." + w.s + "/privacy_sandbox/mobile/register/trigger";
                            break;
                        } catch (Throwable th18) {
                            cw3.a(q19.class, th18);
                            return;
                        }
                    }
                }
                break;
            case 20:
                if (z) {
                    bzd.a();
                    break;
                }
                break;
            case 21:
                if (z) {
                    AtomicBoolean atomicBoolean = s19.a;
                    if (!cw3.a.contains(s19.class)) {
                        try {
                            s19.a.set(true);
                            break;
                        } catch (Throwable th19) {
                            cw3.a(s19.class, th19);
                            return;
                        }
                    }
                }
                break;
            case 22:
                if (z) {
                    yjk yjkVar = yjk.a;
                    Set set5 = cw3.a;
                    if (!set5.contains(yjk.class)) {
                        try {
                            yjk.c = true;
                            yjk yjkVar2 = yjk.a;
                            if (!set5.contains(yjkVar2)) {
                                try {
                                    com.facebook.internal.u k5 = com.facebook.internal.x.k(w.b(), false);
                                    String str = k5 != null ? k5.t : null;
                                    if (str != null && str.length() != 0) {
                                        xjkVar = yjkVar2.b(str);
                                    }
                                    yjk.d = xjkVar;
                                } catch (Throwable th20) {
                                    cw3.a(yjkVar2, th20);
                                    return;
                                }
                            }
                        } catch (Throwable th21) {
                            cw3.a(yjk.class, th21);
                            return;
                        }
                    }
                }
                break;
            case 23:
                if (z) {
                    o2g o2gVar = o2g.a;
                    if (!cw3.a.contains(o2g.class)) {
                        try {
                            o2g.b = true;
                            o2g.a.b();
                            break;
                        } catch (Throwable th22) {
                            cw3.a(o2g.class, th22);
                            return;
                        }
                    }
                }
                break;
        }
    }

    @Override // com.moloco.sdk.publisher.MolocoBidTokenListener
    public void onBidTokenResult(String str, MolocoAdError.ErrorType errorType) {
        str.getClass();
    }
}

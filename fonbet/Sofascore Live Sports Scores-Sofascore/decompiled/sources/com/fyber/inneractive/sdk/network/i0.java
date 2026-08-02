package com.fyber.inneractive.sdk.network;

import android.os.Process;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i0 implements Runnable {
    public final /* synthetic */ l0 a;

    public i0(l0 l0Var) {
        this.a = l0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:11|12|(1:16)|17|(2:19|(1:21)(1:121))|122|(19:124|24|(1:26)|27|28|(13:32|(1:38)|39|40|41|42|43|44|45|46|(1:48)|51|52)|115|(3:34|36|38)|39|40|41|42|43|44|45|46|(0)|51|52)|23|24|(0)|27|28|(14:30|32|(0)|39|40|41|42|43|44|45|46|(0)|51|52)|115|(0)|39|40|41|42|43|44|45|46|(0)|51|52) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0161, code lost:
    
        if (r2 == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0167, code lost:
    
        r2.a("sdkRequestEndedButWillBeRetried");
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x016a, code lost:
    
        r10.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x016d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0116, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0117, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0113, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0114, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00c5, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00c6, code lost:
    
        com.fyber.inneractive.sdk.util.IAlog.a("failed fetching cache data for url: %s msg: %s", r1.r(), r2.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00d9, code lost:
    
        if (r1.a == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00db, code lost:
    
        r1.a((java.lang.Object) null, r2, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if ((r2 != null ? r2.booleanValue() : true) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0109, code lost:
    
        if (r0 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0180, code lost:
    
        r0.a("sdkRequestEndedButWillBeRetried");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0111, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016e, code lost:
    
        com.fyber.inneractive.sdk.network.l0.a(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0171, code lost:
    
        r1.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0174, code lost:
    
        r0 = com.fyber.inneractive.sdk.network.i1.DONE;
        r1.f = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017a, code lost:
    
        if (r0 == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017c, code lost:
    
        r0 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017e, code lost:
    
        if (r0 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010f, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013d, code lost:
    
        if (r1.a == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013f, code lost:
    
        r1.a((java.lang.Object) null, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0142, code lost:
    
        com.fyber.inneractive.sdk.network.l0.a(r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0145, code lost:
    
        r1.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0148, code lost:
    
        r0 = com.fyber.inneractive.sdk.network.i1.DONE;
        r1.f = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014e, code lost:
    
        if (r0 == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0150, code lost:
    
        r0 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0152, code lost:
    
        if (r0 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010d, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x011b, code lost:
    
        if (r1.a == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x011d, code lost:
    
        r1.a((java.lang.Object) null, new java.lang.Exception(r2), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0128, code lost:
    
        com.fyber.inneractive.sdk.network.l0.a(r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x012b, code lost:
    
        r1.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x012e, code lost:
    
        r0 = com.fyber.inneractive.sdk.network.i1.DONE;
        r1.f = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0134, code lost:
    
        if (r0 == com.fyber.inneractive.sdk.network.i1.QUEUED_FOR_RETRY) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0136, code lost:
    
        r0 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0138, code lost:
    
        if (r0 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0126, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0155, code lost:
    
        com.fyber.inneractive.sdk.network.l0.a(r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0158, code lost:
    
        r1.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x015b, code lost:
    
        r2 = com.fyber.inneractive.sdk.network.i1.DONE;
        r1.f = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        t0 t0Var;
        boolean z;
        a aVar;
        i1 i1Var;
        p0 p0Var;
        l0 l0Var = this.a;
        l0Var.getClass();
        Process.setThreadPriority(10);
        while (l0Var.b) {
            o0 o0Var = null;
            try {
                t0Var = (t0) l0Var.a.take();
            } catch (InterruptedException unused) {
                if (!l0Var.b) {
                    Thread.currentThread().interrupt();
                }
                t0Var = null;
            }
            if (t0Var != null && !t0Var.a) {
                i1 i1Var2 = i1.RUNNING;
                t0Var.f = i1Var2;
                if (i1Var2 == i1.QUEUED_FOR_RETRY && (p0Var = t0Var.d) != null) {
                    p0Var.a("sdkRequestEndedButWillBeRetried");
                }
                if (t0Var.o) {
                    Boolean c = ((com.fyber.inneractive.sdk.config.global.features.l) IAConfigManager.N.L.a(com.fyber.inneractive.sdk.config.global.features.l.class)).c("should_manage_request_watchdog");
                }
                if (!t0Var.v()) {
                    z = false;
                    IAlog.a("%s : NetworkExecutorImpl : should enabled watchdog : %s", IAlog.a(l0Var), Boolean.valueOf(z));
                    if (z) {
                        j1 j1Var = l0Var.f;
                        Thread currentThread = Thread.currentThread();
                        j1Var.getClass();
                        IAlog.a("%s : NetworkRequestWatchdog : register request: %s", IAlog.a(j1Var), t0Var.g);
                        int s = t0Var.s();
                        l1 p = t0Var.p();
                        n1 n1Var = new n1(t0Var, currentThread, p.a + p.b + s);
                        j1Var.a.putIfAbsent(t0Var.g, n1Var);
                        com.fyber.inneractive.sdk.util.r.b.postDelayed(n1Var.d, n1Var.c);
                    }
                    if (!t0Var.a && t0Var.h() != null) {
                        aVar = t0Var.i();
                        if (aVar != null && aVar.b != null && !t0Var.a) {
                            t0Var.a(aVar.b, (Exception) null, true);
                        }
                        l a = l0Var.a(t0Var, aVar);
                        o0 o0Var2 = l0Var.a(t0Var, a);
                        l0.a(t0Var, a, o0Var2);
                        l0.a(t0Var, o0Var2);
                        t0Var.e();
                        i1Var = i1.DONE;
                        t0Var.f = i1Var;
                        if (i1Var == i1.QUEUED_FOR_RETRY) {
                            p0 p0Var2 = t0Var.d;
                        }
                        l0Var.b(t0Var);
                    }
                    aVar = null;
                    if (aVar != null) {
                        t0Var.a(aVar.b, (Exception) null, true);
                    }
                    l a2 = l0Var.a(t0Var, aVar);
                    o0 o0Var22 = l0Var.a(t0Var, a2);
                    l0.a(t0Var, a2, o0Var22);
                    l0.a(t0Var, o0Var22);
                    t0Var.e();
                    i1Var = i1.DONE;
                    t0Var.f = i1Var;
                    if (i1Var == i1.QUEUED_FOR_RETRY) {
                    }
                    l0Var.b(t0Var);
                }
                z = true;
                IAlog.a("%s : NetworkExecutorImpl : should enabled watchdog : %s", IAlog.a(l0Var), Boolean.valueOf(z));
                if (z) {
                }
                if (!t0Var.a) {
                    aVar = t0Var.i();
                    if (aVar != null) {
                    }
                    l a22 = l0Var.a(t0Var, aVar);
                    o0 o0Var222 = l0Var.a(t0Var, a22);
                    l0.a(t0Var, a22, o0Var222);
                    l0.a(t0Var, o0Var222);
                    t0Var.e();
                    i1Var = i1.DONE;
                    t0Var.f = i1Var;
                    if (i1Var == i1.QUEUED_FOR_RETRY) {
                    }
                    l0Var.b(t0Var);
                }
                aVar = null;
                if (aVar != null) {
                }
                l a222 = l0Var.a(t0Var, aVar);
                o0 o0Var2222 = l0Var.a(t0Var, a222);
                l0.a(t0Var, a222, o0Var2222);
                l0.a(t0Var, o0Var2222);
                t0Var.e();
                i1Var = i1.DONE;
                t0Var.f = i1Var;
                if (i1Var == i1.QUEUED_FOR_RETRY) {
                }
                l0Var.b(t0Var);
            }
        }
    }
}

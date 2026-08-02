package com.vungle.ads.internal.task;

import android.os.Bundle;
import android.os.Process;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g extends j {
    public static final String e = "g";
    public final f a;
    public final e b;
    public final h c;
    public final n d;

    public g(f fVar, e eVar, h hVar, n nVar) {
        fVar.getClass();
        eVar.getClass();
        hVar.getClass();
        this.a = fVar;
        this.b = eVar;
        this.c = hVar;
        this.d = nVar;
    }

    @Override // com.vungle.ads.internal.task.j
    public final int a() {
        return this.a.e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.d;
        if (nVar != null) {
            try {
                int a = ((i) nVar).a(this.a);
                Process.setThreadPriority(a);
                boolean z = u.a;
                String str = e;
                str.getClass();
                t.a(str, "Setting process thread prio = " + a + " for " + this.a.d());
            } catch (Throwable unused) {
                boolean z2 = u.a;
                String str2 = e;
                str2.getClass();
                t.b(str2, "Error on setting process thread priority");
            }
        }
        try {
            String d = this.a.d();
            Bundle c = this.a.c();
            boolean z3 = u.a;
            String str3 = e;
            str3.getClass();
            t.a(str3, "Start job " + d + "Thread " + Thread.currentThread().getName());
            int a2 = ((p) this.b).a(d).a(c, this.c);
            str3.getClass();
            t.a(str3, "On job finished " + d + " with result " + a2);
            if (a2 == 2) {
                this.a.getClass();
            }
        } catch (Exception e2) {
            boolean z4 = u.a;
            String str4 = e;
            str4.getClass();
            t.b(str4, "Cannot create job" + e2.getLocalizedMessage());
        }
    }
}

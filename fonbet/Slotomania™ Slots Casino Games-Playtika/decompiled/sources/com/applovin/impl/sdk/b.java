package com.applovin.impl.sdk;

import com.applovin.impl.j7;
import com.applovin.impl.sdk.a;
import com.applovin.impl.u1;
import com.applovin.impl.z4;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class b {
    private final l a;
    private final WeakReference b;
    private final WeakReference c;
    private j7 d;

    private b(u1 u1Var, a.InterfaceC0108a interfaceC0108a, l lVar) {
        this.b = new WeakReference(u1Var);
        this.c = new WeakReference(interfaceC0108a);
        this.a = lVar;
    }

    public static b a(u1 u1Var, a.InterfaceC0108a interfaceC0108a, l lVar) {
        b bVar = new b(u1Var, interfaceC0108a, lVar);
        bVar.a(u1Var.getTimeToLiveMillis());
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.a.f().a(this);
    }

    public u1 b() {
        return (u1) this.b.get();
    }

    public void d() {
        a();
        u1 b = b();
        if (b == null) {
            return;
        }
        b.setExpired();
        a.InterfaceC0108a interfaceC0108a = (a.InterfaceC0108a) this.c.get();
        if (interfaceC0108a == null) {
            return;
        }
        interfaceC0108a.onAdExpired(b);
    }

    public void a(long j) {
        a();
        if (((Boolean) this.a.a(z4.f1)).booleanValue() || !this.a.o0().isApplicationPaused()) {
            this.d = j7.a(j, this.a, new Runnable() { // from class: com.applovin.impl.sdk.b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.c();
                }
            });
        }
    }

    public void a() {
        j7 j7Var = this.d;
        if (j7Var != null) {
            j7Var.a();
            this.d = null;
        }
    }
}

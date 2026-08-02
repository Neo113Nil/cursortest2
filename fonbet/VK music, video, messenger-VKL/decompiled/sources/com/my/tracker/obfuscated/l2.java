package com.my.tracker.obfuscated;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.my.tracker.MyTrackerParams;
import java.util.Objects;
import xsna.km;

/* loaded from: classes.dex */
public final class l2 implements u2, t2 {
    private static volatile l2 g;
    final i2 a = new i2(h2.a, new km(this));
    private y2 b;
    private Context c;
    o2 d;
    m2 e;
    k2 f;

    private l2() {
    }

    public static l2 c() {
        l2 l2Var;
        l2 l2Var2 = g;
        if (l2Var2 != null) {
            return l2Var2;
        }
        synchronized (l2.class) {
            try {
                l2Var = g;
                if (l2Var == null) {
                    l2Var = new l2();
                    g = l2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return l2Var;
    }

    public static t2 d() {
        return c();
    }

    public static u2 e() {
        return c();
    }

    @Override // com.my.tracker.obfuscated.t2
    public synchronized void b() {
        x2.a("TimeSpentModule: onAppGoingBackground");
        if (this.d == null) {
            x2.a("TimeSpentModule: An error occurred during initialization, TimeSpent functionality is not available");
        } else {
            this.a.d();
        }
    }

    @Override // com.my.tracker.obfuscated.t2
    public void a(y2 y2Var, Context context) {
        p2 a = p2.a(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, y2Var, context);
        this.d = a;
        this.e = m2.a(10, y2Var, a);
        final i2 i2Var = this.a;
        Objects.requireNonNull(i2Var);
        s sVar = new s() { // from class: xsna.g4z0
            @Override // com.my.tracker.obfuscated.s
            public final void a(Object obj) {
                com.my.tracker.obfuscated.i2.this.a((Boolean) obj);
            }
        };
        final i2 i2Var2 = this.a;
        Objects.requireNonNull(i2Var2);
        y2Var.a(sVar, new s() { // from class: xsna.h4z0
            @Override // com.my.tracker.obfuscated.s
            public final void a(Object obj) {
                com.my.tracker.obfuscated.i2.this.b((Boolean) obj);
            }
        });
        MyTrackerParams m = y2Var.m();
        final i2 i2Var3 = this.a;
        Objects.requireNonNull(i2Var3);
        s sVar2 = new s() { // from class: xsna.j4z0
            @Override // com.my.tracker.obfuscated.s
            public final void a(Object obj) {
                com.my.tracker.obfuscated.i2.this.b((com.my.tracker.obfuscated.b3) obj);
            }
        };
        final i2 i2Var4 = this.a;
        Objects.requireNonNull(i2Var4);
        m.a(sVar2, new s() { // from class: xsna.k4z0
            @Override // com.my.tracker.obfuscated.s
            public final void a(Object obj) {
                com.my.tracker.obfuscated.i2.this.a((com.my.tracker.obfuscated.b3) obj);
            }
        });
        this.a.a();
        this.f = new k2();
        this.c = context;
        this.b = y2Var;
        x2.a("TimeSpentModule: TimeSpentModule initialized");
    }

    @Override // com.my.tracker.obfuscated.u2
    public synchronized void b(int i, boolean z) {
        x2.a("TimeSpentModule: stopTimeSpent id = " + i + ", canUseInBackground = " + z);
        if (this.d == null) {
            x2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called stopTimeSpent id = " + i + ")");
            return;
        }
        this.a.b(i, z);
    }

    public void b(final q2 q2Var, final Boolean bool, final b3 b3Var) {
        x2.a("TimeSpentModule: core tick DTO collected, sending to repository...");
        if (this.d == null) {
            x2.b("TimeSpentModule: repository was not created, can't store and send this packet, drop");
            return;
        }
        if (this.f == null) {
            x2.a("TimeSpentModule: packetGenerator was not initialized, drop");
        } else if (this.b == null) {
            x2.a("TimeSpentModule: config is not specified, drop");
        } else {
            m.d(new Runnable() { // from class: xsna.l4z0
                @Override // java.lang.Runnable
                public final void run() {
                    com.my.tracker.obfuscated.l2.this.a(q2Var, bool, b3Var);
                }
            });
        }
    }

    @Override // com.my.tracker.obfuscated.t2
    public synchronized void a() {
        x2.a("TimeSpentModule: onAppGoingForeground");
        if (this.d == null) {
            x2.a("TimeSpentModule: An error occurred during initialization, TimeSpent functionality is not available");
        } else {
            this.a.e();
        }
    }

    @Override // com.my.tracker.obfuscated.u2
    public synchronized void a(int i, boolean z) {
        x2.a("TimeSpentModule: startTimeSpent id = " + i + ", canUseInBackground = " + z);
        if (this.d == null) {
            x2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called startTimeSpent id = " + i + ")");
            return;
        }
        this.a.a(i, z);
    }

    @Override // com.my.tracker.obfuscated.u2
    public synchronized void a(int i) {
        x2.a("TimeSpentModule: incrementEventTimeSpent id = " + i);
        if (this.d == null) {
            x2.c("TimeSpent: An error occurred during initialization, TimeSpent functionality is not available (called incrementEventTimeSpent id = " + i + ")");
            return;
        }
        this.a.a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(q2 q2Var, Boolean bool, b3 b3Var) {
        if (!r2.a(q2Var)) {
            x2.a("TimeSpentModule: collected dto data is empty, no need to send");
            return;
        }
        if (!r2.c(q2Var)) {
            x2.a("TimeSpentModule: collected dto data is corrupted, sending anyway");
        }
        try {
            this.d.a(q2Var.c(), this.f.a(bool.booleanValue(), this.b.o(), b3Var, q2Var, this.b.h(), this.b.n(), this.c));
            x2.a("TimeSpentModule: successfully stored new time spent tick in repository, notifying sender...");
            this.e.c();
        } catch (Exception unused) {
            x2.b("TimeSpentModule: something went wrong while storing new timeSpentTick in repository, this tick didn't stored and wouldn't be sent");
        }
    }
}

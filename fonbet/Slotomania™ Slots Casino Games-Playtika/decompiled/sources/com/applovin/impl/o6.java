package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.f6;
import com.applovin.impl.r0;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class o6 extends k5 implements r0.e {
    private final com.applovin.impl.sdk.network.a g;
    private final r0.e h;
    private f6.b i;
    private z4 j;
    private z4 k;
    private String l;
    protected r0.b m;

    public o6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
        this(aVar, lVar, false);
    }

    public abstract void a(String str, int i, String str2, Object obj);

    public abstract void a(String str, Object obj, int i);

    @Override // java.lang.Runnable
    public void run() {
        r0 x = b().x();
        if (!b().G0() && !b().D0()) {
            com.applovin.impl.sdk.p.h("AppLovinSdk", "AppLovin SDK is disabled");
            a(this.g.f(), -22, null, null);
            return;
        }
        e();
        if (!StringUtils.isValidString(this.g.f()) || this.g.f().length() < 4) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Task has an invalid or null request endpoint.");
            }
            a(this.g.f(), AppLovinErrorCodes.INVALID_URL, null, null);
        } else {
            if (TextUtils.isEmpty(this.g.h())) {
                this.g.c(this.g.b() != null ? "POST" : "GET");
            }
            x.a(this.g, this.m, this.h);
        }
    }

    public o6(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, boolean z) {
        super("TaskRepeatRequest", lVar, z);
        this.i = f6.b.OTHER;
        if (aVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        a(aVar.f());
        this.g = aVar;
        this.m = new r0.b();
        this.h = new a(lVar);
    }

    private void e() {
        if (((Boolean) this.a.a(z4.z3)).booleanValue() && b().x().a(StringUtils.getHostAndPath(this.g.f()))) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.d(this.b, "Swapping primary endpoint with backup endpoint " + this.g.a());
            }
            String f = this.g.f();
            com.applovin.impl.sdk.network.a aVar = this.g;
            aVar.b(aVar.a());
            this.g.a(f);
        }
    }

    public void b(z4 z4Var) {
        this.k = z4Var;
    }

    public void c(z4 z4Var) {
        this.j = z4Var;
    }

    public void a(f6.b bVar) {
        this.i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(z4 z4Var) {
        if (z4Var != null) {
            b().q0().a(z4Var, z4Var.a());
        }
    }

    class a implements r0.e {
        final /* synthetic */ com.applovin.impl.sdk.l a;

        a(com.applovin.impl.sdk.l lVar) {
            this.a = lVar;
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, Object obj, int i) {
            o6.this.b().x().b(o6.this.l);
            o6.this.g.a(0);
            o6.this.a(str, obj, i);
        }

        @Override // com.applovin.impl.r0.e
        public void a(String str, int i, String str2, Object obj) {
            long millis;
            boolean z = false;
            boolean z2 = i < 200 || i >= 500;
            boolean z3 = i == 429;
            boolean z4 = i != -1009 || o6.this.g.q();
            boolean z5 = (i == -900 || i == -1000) ? false : true;
            if (z4 && z5 && (z2 || z3 || o6.this.g.p())) {
                String a = o6.this.g.a();
                if (o6.this.g.j() <= 0) {
                    if (a != null && a.equals(o6.this.g.f())) {
                        o6 o6Var = o6.this;
                        o6Var.a(o6Var.k);
                    } else {
                        o6 o6Var2 = o6.this;
                        o6Var2.a(o6Var2.j);
                    }
                    o6 o6Var3 = o6.this;
                    o6Var3.a(o6Var3.g.f(), i, str2, obj);
                    return;
                }
                com.applovin.impl.sdk.p pVar = o6.this.c;
                if (com.applovin.impl.sdk.p.a()) {
                    o6 o6Var4 = o6.this;
                    o6Var4.c.k(o6Var4.b, "Unable to send request due to server failure (code " + i + "). " + o6.this.g.j() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds(o6.this.g.k()) + " seconds...");
                }
                int j = o6.this.g.j() - 1;
                o6.this.g.a(j);
                if (j == 0) {
                    o6 o6Var5 = o6.this;
                    o6Var5.a(o6Var5.j);
                    if (StringUtils.isValidString(a) && a.length() >= 4) {
                        com.applovin.impl.sdk.p pVar2 = o6.this.c;
                        if (com.applovin.impl.sdk.p.a()) {
                            o6 o6Var6 = o6.this;
                            o6Var6.c.d(o6Var6.b, "Switching to backup endpoint " + a);
                        }
                        o6 o6Var7 = o6.this;
                        o6Var7.l = o6Var7.g.f();
                        o6.this.g.b(a);
                        z = true;
                    }
                }
                if (((Boolean) this.a.a(z4.l3)).booleanValue() && z) {
                    millis = 0;
                } else {
                    millis = o6.this.g.n() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, o6.this.g.c())) : o6.this.g.k();
                }
                f6 s0 = this.a.s0();
                o6 o6Var8 = o6.this;
                s0.a(o6Var8, o6Var8.i, millis);
                return;
            }
            o6 o6Var9 = o6.this;
            o6Var9.a(o6Var9.g.f(), i, str2, obj);
        }
    }
}

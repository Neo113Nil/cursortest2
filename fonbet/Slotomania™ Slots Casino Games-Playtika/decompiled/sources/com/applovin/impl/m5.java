package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.f6;
import java.util.List;

/* loaded from: classes.dex */
public class m5 extends k5 {
    private final List g;
    private final Activity h;

    public m5(List list, Activity activity, com.applovin.impl.sdk.l lVar) {
        super("TaskAutoInitAdapters", lVar, true);
        this.g = list;
        this.h = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(m3 m3Var) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Auto-initing adapter: " + m3Var);
        }
        this.a.U().a(m3Var, this.h);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.g.size() > 0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Auto-initing " + this.g.size() + " adapters" + (this.a.u0().c() ? " in test mode" : "") + "...");
            }
            if (TextUtils.isEmpty(this.a.X())) {
                this.a.Q0();
            } else if (!this.a.I0()) {
                com.applovin.impl.sdk.p.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.a.X());
            }
            if (this.h == null) {
                com.applovin.impl.sdk.p.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (final m3 m3Var : this.g) {
                if (m3Var.s()) {
                    this.a.s0().a(new Runnable() { // from class: com.applovin.impl.m5$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            m5.this.a(m3Var);
                        }
                    }, f6.b.MEDIATION);
                } else {
                    this.a.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        this.a.Q().a(this.b, "Skipping eager auto-init for adapter " + m3Var);
                    }
                }
            }
        }
    }
}

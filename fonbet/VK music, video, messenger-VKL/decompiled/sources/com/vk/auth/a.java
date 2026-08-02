package com.vk.auth;

import com.vk.auth.main.SignUpRouter;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import java.util.List;
import xsna.c2r0;
import xsna.frf0;
import xsna.hg1;
import xsna.izs;
import xsna.par0;
import xsna.s3q0;

/* compiled from: AuthScreenOpenerDelegate.kt */
/* loaded from: classes.dex */
public final class a {
    public final DefaultAuthActivity a;
    public final com.vk.auth.main.a b;

    public a(DefaultAuthActivity defaultAuthActivity, com.vk.auth.main.a aVar) {
        this.a = defaultAuthActivity;
        this.b = aVar;
    }

    public static final void b(SignUpRouter signUpRouter, String str) {
        par0.a.getClass();
        par0.a("[AuthScreenOpenerDelegate] open landing from MultiAccount");
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        frf0.h();
        RegistrationElementsTracker.b.clear();
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.START, null, null, null, 30);
        signUpRouter.U0(str, true, true);
    }

    public final void a(c2r0 c2r0Var, boolean z, final izs<? super List<c2r0.b>, s3q0> izsVar) {
        DefaultAuthActivity defaultAuthActivity = this.a;
        hg1.a(hg1.i(c2r0Var.c(defaultAuthActivity, z).m(io.reactivex.rxjava3.android.schedulers.a.b()).q(io.reactivex.rxjava3.schedulers.a.b()), new izs() { // from class: xsna.e65
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                izs.this.invoke((List) obj);
                return s3q0.a;
            }
        }), defaultAuthActivity);
    }
}

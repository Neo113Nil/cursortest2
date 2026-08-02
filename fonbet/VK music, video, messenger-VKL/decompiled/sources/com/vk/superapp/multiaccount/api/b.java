package com.vk.superapp.multiaccount.api;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.multiaccount.api.d;
import com.vk.superapp.multiaccount.api.e;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import xsna.c8m;
import xsna.g8m;
import xsna.lsf0;
import xsna.pwj0;
import xsna.u240;

/* compiled from: MultiAccountComponent.kt */
/* loaded from: classes11.dex */
public final class b implements c8m<MultiAccountComponent, pwj0> {
    @Override // xsna.c8m
    public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
        return new MultiAccountComponent() { // from class: com.vk.superapp.multiaccount.api.MultiAccountComponent$Companion$STUB$1
            public final e a = e.a.a.getSTUB();
            public final d b = d.a.a.getSTUB();
            public final com.vk.superapp.multiaccount.api.a c = com.vk.superapp.multiaccount.api.a.a.getSTUB();

            /* compiled from: MultiAccountComponent.kt */
            public static final class a implements u240 {
                @Override // xsna.u240
                public final q<lsf0> a() {
                    return g0.b;
                }
            }

            @Override // com.vk.superapp.multiaccount.api.MultiAccountComponent
            public final e a() {
                return this.a;
            }

            @Override // com.vk.superapp.multiaccount.api.MultiAccountComponent
            public final d c() {
                return this.b;
            }

            @Override // com.vk.superapp.multiaccount.api.MultiAccountComponent
            public final com.vk.superapp.multiaccount.api.a d() {
                return this.c;
            }

            @Override // com.vk.superapp.multiaccount.api.MultiAccountComponent
            public final u240 q2() {
                return new a();
            }
        };
    }
}

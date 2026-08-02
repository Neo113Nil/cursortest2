package com.vk.superapp.analytics.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.analytics.MaxMessengerAnalytics;
import xsna.d2a0;
import xsna.ej80;
import xsna.nbp;
import xsna.pc00;
import xsna.pwj0;
import xsna.sdk;
import xsna.tdk;

/* compiled from: SakAnalyticsComponent.kt */
/* loaded from: classes11.dex */
public interface SakAnalyticsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: SakAnalyticsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final SakAnalyticsComponent getSTUB() {
            return new SakAnalyticsComponent() { // from class: com.vk.superapp.analytics.di.SakAnalyticsComponent$Companion$STUB$1
                public final ej80 a = ej80.a.a.getSTUB();
                public final MaxMessengerAnalytics b = MaxMessengerAnalytics.a.a.getSTUB();
                public final sdk c = new sdk();
                public final d2a0 d;
                public final nbp e;

                {
                    pc00.a.a.getSTUB();
                    this.d = d2a0.a.a.getSTUB();
                    this.e = nbp.a.a.getSTUB();
                }

                @Override // com.vk.superapp.analytics.di.SakAnalyticsComponent
                public final tdk Oe() {
                    return this.c;
                }

                @Override // com.vk.superapp.analytics.di.SakAnalyticsComponent
                public final MaxMessengerAnalytics Q9() {
                    return this.b;
                }

                @Override // com.vk.superapp.analytics.di.SakAnalyticsComponent
                public final ej80 Qc() {
                    return this.a;
                }

                @Override // com.vk.superapp.analytics.di.SakAnalyticsComponent
                public final d2a0 kd() {
                    return this.d;
                }

                @Override // com.vk.superapp.analytics.di.SakAnalyticsComponent
                public final nbp y5() {
                    return this.e;
                }
            };
        }
    }

    tdk Oe();

    MaxMessengerAnalytics Q9();

    ej80 Qc();

    d2a0 kd();

    nbp y5();
}

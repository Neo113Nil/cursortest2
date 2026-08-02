package com.vk.music.player.analytics.api.di;

import com.vk.di.component.DiScopedComponent;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ax1;
import xsna.ca50;
import xsna.cs4;
import xsna.dv40;
import xsna.ex40;
import xsna.iwa0;
import xsna.nn40;
import xsna.pwj0;
import xsna.px40;
import xsna.qx40;
import xsna.r05;
import xsna.s940;
import xsna.t940;
import xsna.ub4;
import xsna.uw1;
import xsna.x2b0;

/* compiled from: PlayerAnalyticsComponent.kt */
/* loaded from: classes3.dex */
public interface PlayerAnalyticsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: PlayerAnalyticsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final PlayerAnalyticsComponent STUB = new PlayerAnalyticsComponent() { // from class: com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent$Companion$STUB$1
            public final dv40 a = dv40.a.a.getSTUB();
            public final ca50 b = ca50.a.a.getSTUB();
            public final nn40 c = nn40.a.a.getSTUB();
            public final r05 d = r05.a.a.getSTUB();
            public final cs4 e = cs4.a.a.getSTUB();
            public final b f = new b();
            public final x2b0 g = x2b0.a.a.getSTUB();

            /* compiled from: PlayerAnalyticsComponent.kt */
            public static final class a implements qx40 {
                @Override // xsna.qx40
                public final px40 a(px40 px40Var) {
                    return null;
                }
            }

            @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
            public final qx40 D0(boolean z, ex40 ex40Var, uw1 uw1Var) {
                return new a();
            }

            @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
            public final dv40 Ec(boolean z) {
                return dv40.a.a.getSTUB();
            }

            @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
            public final nn40 Ia() {
                return this.c;
            }

            @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
            public final cs4 Xe() {
                return this.e;
            }

            @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
            public final ca50 a1() {
                return this.b;
            }

            @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
            public final r05 c2() {
                return this.d;
            }

            @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
            public final uw1<iwa0> he() {
                return this.f;
            }

            @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
            public final dv40 mb() {
                return this.a;
            }

            @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
            public final x2b0 z7() {
                return this.g;
            }

            /* compiled from: PlayerAnalyticsComponent.kt */
            public static final class b implements uw1<iwa0> {
                @Override // xsna.uw1
                public final /* bridge */ /* synthetic */ void c(t940 t940Var) {
                }

                @Override // xsna.u940
                public final List<ax1> e(s940 s940Var) {
                    return EmptyList.b;
                }

                @Override // xsna.u940
                public final List<ax1> f(s940 s940Var) {
                    return EmptyList.b;
                }

                @Override // xsna.bhz
                public final void d(ub4 ub4Var) {
                }
            }
        };

        public final PlayerAnalyticsComponent getSTUB() {
            return STUB;
        }
    }

    qx40 D0(boolean z, ex40 ex40Var, uw1 uw1Var);

    dv40 Ec(boolean z);

    nn40 Ia();

    cs4 Xe();

    ca50 a1();

    r05 c2();

    uw1<iwa0> he();

    dv40 mb();

    x2b0 z7();
}

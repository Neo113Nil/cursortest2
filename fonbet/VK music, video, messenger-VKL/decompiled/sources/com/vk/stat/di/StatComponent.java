package com.vk.stat.di;

import com.vk.di.component.DiScopedComponent;
import xsna.c8m;
import xsna.fdh0;
import xsna.g8m;
import xsna.pwj0;

/* compiled from: StatComponent.kt */
/* loaded from: classes11.dex */
public interface StatComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: StatComponent.kt */
    /* loaded from: classes5.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final StatComponent STUB = new StatComponent() { // from class: com.vk.stat.di.StatComponent$Companion$STUB$1
            public final a a = new a();

            @Override // com.vk.stat.di.StatComponent
            public final fdh0 z4() {
                return this.a;
            }

            /* compiled from: StatComponent.kt */
            public static final class a implements fdh0 {
                @Override // xsna.fdh0
                public final void a() {
                }

                @Override // xsna.fdh0
                public final void b() {
                }

                @Override // xsna.fdh0
                public final void c() {
                }
            }
        };

        public final StatComponent getSTUB() {
            return STUB;
        }
    }

    /* compiled from: StatComponent.kt */
    /* loaded from: classes5.dex */
    public static final class a implements c8m<StatComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return StatComponent.Companion.getSTUB();
        }
    }

    fdh0 z4();
}

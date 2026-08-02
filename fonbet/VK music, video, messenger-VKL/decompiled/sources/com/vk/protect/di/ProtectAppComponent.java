package com.vk.protect.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.dto.hints.Hint;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.completable.i;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import xsna.a8e0;
import xsna.e8e0;
import xsna.ewt;
import xsna.g8e0;
import xsna.j8e0;
import xsna.pwj0;
import xsna.v7e0;

/* compiled from: ProtectAppComponent.kt */
/* loaded from: classes.dex */
public interface ProtectAppComponent extends DiScopedComponent<pwj0> {
    public static final /* synthetic */ Companion Companion = Companion.a;

    /* compiled from: ProtectAppComponent.kt */
    /* loaded from: classes5.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ProtectAppComponent STUB = new ProtectAppComponent() { // from class: com.vk.protect.di.ProtectAppComponent$Companion$STUB$1
            public final c a = new c();
            public final d b = new d();
            public final b c = new b();

            /* compiled from: ProtectAppComponent.kt */
            public static final class a implements v7e0 {
                @Override // xsna.v7e0
                public final io.reactivex.rxjava3.core.a b() {
                    return i.b;
                }
            }

            @Override // com.vk.protect.di.ProtectAppComponent
            public final j8e0 I9() {
                return this.b;
            }

            @Override // com.vk.protect.di.ProtectAppComponent
            public final a8e0 N6() {
                return this.c;
            }

            @Override // com.vk.protect.di.ProtectAppComponent
            public final e8e0 u8() {
                return this.a;
            }

            @Override // com.vk.protect.di.ProtectAppComponent
            public final v7e0 vb() {
                return new a();
            }

            /* compiled from: ProtectAppComponent.kt */
            public static final class b implements a8e0 {
                @Override // xsna.a8e0
                public final boolean b() {
                    return false;
                }

                @Override // xsna.a8e0
                public final void dismiss() {
                }

                @Override // xsna.a8e0
                public final void a(g8e0 g8e0Var, ewt ewtVar) {
                }
            }

            /* compiled from: ProtectAppComponent.kt */
            public static final class c implements e8e0 {
                @Override // xsna.e8e0
                public final q<Hint> b() {
                    return g0.b;
                }

                @Override // xsna.e8e0
                public final void c() {
                }
            }

            /* compiled from: ProtectAppComponent.kt */
            public static final class d implements j8e0 {
                @Override // xsna.j8e0
                public final void a() {
                }
            }
        };

        public final ProtectAppComponent getSTUB() {
            return STUB;
        }
    }

    j8e0 I9();

    a8e0 N6();

    e8e0 u8();

    v7e0 vb();
}

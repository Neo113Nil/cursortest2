package com.vk.menu.di;

import android.content.Context;
import com.vk.di.component.DiScopedComponent;
import com.vk.dto.menu.a;
import com.vk.superapp.SuperAppFeatures;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.byz;
import xsna.ez50;
import xsna.k820;
import xsna.pwj0;

/* compiled from: MenuComponent.kt */
/* loaded from: classes.dex */
public interface MenuComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: MenuComponent.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MenuComponent$Companion$STUB$1 STUB = new MenuComponent() { // from class: com.vk.menu.di.MenuComponent$Companion$STUB$1
            public final c a = new c();
            public final a b = new a();
            public final d c = new d();

            /* compiled from: MenuComponent.kt */
            public static final class a implements byz {
                @Override // xsna.byz
                public final q a(Context context) {
                    return g0.b;
                }
            }

            /* compiled from: MenuComponent.kt */
            public static final class b {
            }

            /* compiled from: MenuComponent.kt */
            public static final class c implements k820 {
                @Override // xsna.k820
                public final List<String> a(SuperAppFeatures.RequestName requestName) {
                    return EmptyList.b;
                }

                @Override // xsna.k820
                public final boolean b(int i) {
                    return false;
                }

                @Override // xsna.k820
                public final int c(int i) {
                    return 0;
                }

                @Override // xsna.k820
                public final List<Integer> d() {
                    return EmptyList.b;
                }

                @Override // xsna.k820
                public final Integer e(String str) {
                    return null;
                }

                @Override // xsna.k820
                public final int f(int i) {
                    return 0;
                }
            }

            @Override // com.vk.menu.di.MenuComponent
            public final ez50 S2() {
                return this.c;
            }

            @Override // com.vk.menu.di.MenuComponent
            public final byz Sa() {
                return this.b;
            }

            @Override // com.vk.menu.di.MenuComponent
            public final k820 md() {
                return this.a;
            }

            /* compiled from: MenuComponent.kt */
            public static final class d implements ez50 {
                @Override // xsna.ez50
                public final com.vk.dto.menu.a a() {
                    return new com.vk.dto.menu.a((a.d) null, 3);
                }

                @Override // xsna.ez50
                public final void b(com.vk.dto.menu.a aVar) {
                }
            }
        };
    }

    ez50 S2();

    byz Sa();

    k820 md();
}

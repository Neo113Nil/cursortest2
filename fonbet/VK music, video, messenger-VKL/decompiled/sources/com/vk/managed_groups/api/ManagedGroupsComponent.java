package com.vk.managed_groups.api;

import androidx.fragment.app.Fragment;
import com.vk.di.component.DiScopedComponent;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import xsna.ei00;
import xsna.gi00;
import xsna.pwj0;
import xsna.vi00;

/* compiled from: ManagedGroupsComponent.kt */
/* loaded from: classes3.dex */
public interface ManagedGroupsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ManagedGroupsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ManagedGroupsComponent STUB = new ManagedGroupsComponent() { // from class: com.vk.managed_groups.api.ManagedGroupsComponent$Companion$STUB$1

            /* compiled from: ManagedGroupsComponent.kt */
            public static final class b implements vi00 {
                @Override // xsna.vi00
                public final Fragment a() {
                    return new Fragment();
                }
            }

            @Override // com.vk.managed_groups.api.ManagedGroupsComponent
            public final gi00 Ge() {
                return new a();
            }

            @Override // com.vk.managed_groups.api.ManagedGroupsComponent
            public final vi00 g1() {
                return new b();
            }

            /* compiled from: ManagedGroupsComponent.kt */
            public static final class a implements gi00 {
                public final g0 a = g0.b;

                @Override // xsna.gi00
                public final q<ei00> H() {
                    return this.a;
                }

                @Override // xsna.gi00
                public final void a() {
                }

                @Override // xsna.gi00
                public final void c() {
                }
            }
        };

        public final ManagedGroupsComponent getSTUB() {
            return STUB;
        }
    }

    gi00 Ge();

    vi00 g1();
}

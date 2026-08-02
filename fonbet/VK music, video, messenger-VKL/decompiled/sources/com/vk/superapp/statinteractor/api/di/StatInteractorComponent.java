package com.vk.superapp.statinteractor.api.di;

import com.vk.di.component.DiScopedComponent;
import java.util.Map;
import xsna.mxi0;
import xsna.pwj0;

/* compiled from: StatInteractorComponent.kt */
/* loaded from: classes11.dex */
public interface StatInteractorComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: StatInteractorComponent.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final StatInteractorComponent STUB = new StatInteractorComponent() { // from class: com.vk.superapp.statinteractor.api.di.StatInteractorComponent$Companion$STUB$1
            @Override // com.vk.superapp.statinteractor.api.di.StatInteractorComponent
            public final mxi0 ie() {
                return new a();
            }

            /* compiled from: StatInteractorComponent.kt */
            public static final class a implements mxi0 {
                @Override // xsna.mxi0
                public final void a(Map<String, String> map) {
                }

                @Override // xsna.mxi0
                public final void c(Map<String, String> map) {
                }

                @Override // xsna.mxi0
                public final void b(String str, Map<String, String> map) {
                }
            }
        };

        public final StatInteractorComponent getSTUB() {
            return STUB;
        }
    }

    mxi0 ie();
}

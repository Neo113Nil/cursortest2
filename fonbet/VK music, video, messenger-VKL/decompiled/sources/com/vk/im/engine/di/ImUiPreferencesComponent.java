package com.vk.im.engine.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;
import xsna.yzp0;

/* compiled from: ImUiPreferencesComponent.kt */
/* loaded from: classes2.dex */
public interface ImUiPreferencesComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ImUiPreferencesComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ImUiPreferencesComponent$Companion$STUB$1 STUB = new ImUiPreferencesComponent() { // from class: com.vk.im.engine.di.ImUiPreferencesComponent$Companion$STUB$1
            public final a a = new a();

            /* compiled from: ImUiPreferencesComponent.kt */
            public static final class a implements yzp0 {
                @Override // xsna.yzp0
                public final boolean b() {
                    return false;
                }
            }

            @Override // com.vk.im.engine.di.ImUiPreferencesComponent
            public final yzp0 Z6() {
                return this.a;
            }
        };
    }

    yzp0 Z6();
}

package com.vk.method.selector.api;

import com.vk.di.component.DiUnscopedComponent;
import xsna.ek20;
import xsna.gk20;

/* compiled from: MethodSelectorComponent.kt */
/* loaded from: classes.dex */
public interface MethodSelectorComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: MethodSelectorComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final MethodSelectorComponent getSTUB() {
            return new MethodSelectorComponent() { // from class: com.vk.method.selector.api.MethodSelectorComponent$Companion$STUB$1
                public final gk20 a = new gk20();

                @Override // com.vk.method.selector.api.MethodSelectorComponent
                public final ek20 a() {
                    return this.a;
                }
            };
        }
    }

    ek20 a();
}

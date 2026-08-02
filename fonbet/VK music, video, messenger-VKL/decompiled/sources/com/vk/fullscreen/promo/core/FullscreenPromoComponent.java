package com.vk.fullscreen.promo.core;

import com.vk.di.component.DiScopedComponent;
import xsna.bpn0;
import xsna.l35;
import xsna.pwj0;
import xsna.zys;

/* compiled from: FullscreenPromoComponent.kt */
/* loaded from: classes.dex */
public interface FullscreenPromoComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: FullscreenPromoComponent.kt */
    /* loaded from: classes16.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final FullscreenPromoComponent STUB = new FullscreenPromoComponent() { // from class: com.vk.fullscreen.promo.core.FullscreenPromoComponent$Companion$STUB$1
            public final bpn0 a = new bpn0(new l35(11));

            @Override // com.vk.fullscreen.promo.core.FullscreenPromoComponent
            public final zys n() {
                return (zys) this.a.getValue();
            }
        };

        public final FullscreenPromoComponent getSTUB() {
            return STUB;
        }
    }

    zys n();
}

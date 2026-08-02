package com.vk.clips.sdk.stats.pixels.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.ak80;
import xsna.ki0;
import xsna.pwj0;
import xsna.zi0;

/* compiled from: AdStatPixelsComponent.kt */
/* loaded from: classes17.dex */
public interface AdStatPixelsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: AdStatPixelsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final AdStatPixelsComponent STUB = new AdStatPixelsComponent() { // from class: com.vk.clips.sdk.stats.pixels.api.di.AdStatPixelsComponent$Companion$STUB$1
            @Override // com.vk.clips.sdk.stats.pixels.api.di.AdStatPixelsComponent
            public final ak80 A3(zi0 zi0Var) {
                throw new UnsupportedOperationException("Tried to call createVideoTracker on STUB instance");
            }

            @Override // com.vk.clips.sdk.stats.pixels.api.di.AdStatPixelsComponent
            public final ki0 R1() {
                return ki0.a.a.getSTUB();
            }
        };

        public final AdStatPixelsComponent getSTUB() {
            return STUB;
        }
    }

    ak80 A3(zi0 zi0Var);

    ki0 R1();
}

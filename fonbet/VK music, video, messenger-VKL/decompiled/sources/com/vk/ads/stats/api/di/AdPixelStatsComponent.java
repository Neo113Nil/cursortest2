package com.vk.ads.stats.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.hqa0;
import xsna.pwj0;

/* compiled from: AdPixelStatsComponent.kt */
/* loaded from: classes14.dex */
public interface AdPixelStatsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: AdPixelStatsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final AdPixelStatsComponent STUB = new AdPixelStatsComponent() { // from class: com.vk.ads.stats.api.di.AdPixelStatsComponent$Companion$STUB$1
            @Override // com.vk.ads.stats.api.di.AdPixelStatsComponent
            public final hqa0 Ed() {
                return hqa0.a.getSTUB();
            }
        };

        public final AdPixelStatsComponent getSTUB() {
            return STUB;
        }
    }

    hqa0 Ed();
}

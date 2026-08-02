package com.vk.ads.externalsdkstat.api.di;

import com.vk.ads.externalsdkstat.api.ExternalSdk;
import com.vk.di.component.DiScopedComponent;
import xsna.m11;
import xsna.pwj0;

/* compiled from: AdsSdkStatTrackerComponent.kt */
/* loaded from: classes14.dex */
public interface AdsSdkStatTrackerComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: AdsSdkStatTrackerComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final AdsSdkStatTrackerComponent STUB = new AdsSdkStatTrackerComponent() { // from class: com.vk.ads.externalsdkstat.api.di.AdsSdkStatTrackerComponent$Companion$STUB$1
            @Override // com.vk.ads.externalsdkstat.api.di.AdsSdkStatTrackerComponent
            public final m11 J8(ExternalSdk externalSdk) {
                return m11.a.a.getSTUB();
            }
        };

        public final AdsSdkStatTrackerComponent getSTUB() {
            return STUB;
        }
    }

    m11 J8(ExternalSdk externalSdk);
}

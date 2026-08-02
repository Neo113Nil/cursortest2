package com.vk.ads.externalsdkstat.impl.di;

import com.vk.ads.externalsdkstat.api.ExternalSdk;
import com.vk.ads.externalsdkstat.api.di.AdsSdkStatTrackerComponent;
import com.vk.di.component.DiScopedComponent;
import xsna.c8m;
import xsna.g8m;
import xsna.l11;
import xsna.m11;
import xsna.pwj0;

/* compiled from: AdsSdkStatTrackerComponentImpl.kt */
/* loaded from: classes14.dex */
public final class AdsSdkStatTrackerComponentImpl implements AdsSdkStatTrackerComponent {

    /* compiled from: AdsSdkStatTrackerComponentImpl.kt */
    public static final class a implements c8m<AdsSdkStatTrackerComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new AdsSdkStatTrackerComponentImpl();
        }
    }

    @Override // com.vk.ads.externalsdkstat.api.di.AdsSdkStatTrackerComponent
    public final m11 J8(ExternalSdk externalSdk) {
        return new l11(externalSdk);
    }
}

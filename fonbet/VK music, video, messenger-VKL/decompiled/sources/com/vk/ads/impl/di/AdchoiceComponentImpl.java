package com.vk.ads.impl.di;

import com.vk.ads.adchoice.api.di.AdChoiceComponent;
import com.vk.di.component.DiScopedComponent;
import xsna.c8m;
import xsna.g8m;
import xsna.kd0;
import xsna.pwj0;

/* compiled from: AdchoiceComponentImpl.kt */
/* loaded from: classes14.dex */
public final class AdchoiceComponentImpl implements AdChoiceComponent {

    /* compiled from: AdchoiceComponentImpl.kt */
    public static final class a implements c8m<AdChoiceComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new AdchoiceComponentImpl();
        }
    }

    @Override // com.vk.ads.adchoice.api.di.AdChoiceComponent
    public final kd0 M3() {
        return new kd0();
    }
}

package com.vk.voip.stereo.stub.notifications.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.voip.stereo.api.notifications.di.VoipStereoNotificationsComponent;
import xsna.c8m;
import xsna.g8m;
import xsna.m2x0;
import xsna.pwj0;

/* compiled from: VoipStereoNotificationsComponentStub.kt */
/* loaded from: classes7.dex */
public final class VoipStereoNotificationsComponentStub implements VoipStereoNotificationsComponent {

    /* compiled from: VoipStereoNotificationsComponentStub.kt */
    public static final class a implements c8m<VoipStereoNotificationsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VoipStereoNotificationsComponentStub();
        }
    }

    @Override // com.vk.voip.stereo.api.notifications.di.VoipStereoNotificationsComponent
    public final m2x0 Rb() {
        return new m2x0();
    }
}

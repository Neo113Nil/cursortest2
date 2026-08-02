package com.vk.superapp.miniappsads.optionalformats.impl.di;

import android.app.Activity;
import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.advertisement.formats.api.AdvertisementOptionalFormatsComponent;
import com.vk.unitylevelplay.api.di.UnityLevelPlayAdsSdkComponent;
import xsna.bxs;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.hax;
import xsna.m2z;
import xsna.pwj0;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: AdvertisementOptionalFormatsComponentImpl.kt */
/* loaded from: classes6.dex */
public final class AdvertisementOptionalFormatsComponentImpl implements AdvertisementOptionalFormatsComponent {
    public final UnityLevelPlayAdsSdkComponent a;

    /* compiled from: AdvertisementOptionalFormatsComponentImpl.kt */
    public static final class a implements c8m<AdvertisementOptionalFormatsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new AdvertisementOptionalFormatsComponentImpl((UnityLevelPlayAdsSdkComponent) g8mVar.a(fpf0.a(UnityLevelPlayAdsSdkComponent.class)));
        }
    }

    public AdvertisementOptionalFormatsComponentImpl(UnityLevelPlayAdsSdkComponent unityLevelPlayAdsSdkComponent) {
        this.a = unityLevelPlayAdsSdkComponent;
    }

    @Override // com.vk.superapp.advertisement.formats.api.AdvertisementOptionalFormatsComponent
    public final void Tc(Activity activity, wzs<? super Integer, ? super String, s3q0> wzsVar) {
        UnityLevelPlayAdsSdkComponent unityLevelPlayAdsSdkComponent = this.a;
        unityLevelPlayAdsSdkComponent.T7().b(activity.getApplication());
        unityLevelPlayAdsSdkComponent.T7().c(activity, wzsVar);
    }

    @Override // com.vk.superapp.advertisement.formats.api.AdvertisementOptionalFormatsComponent
    public final boolean ia() {
        return this.a.T7().isInitialized();
    }

    @Override // com.vk.superapp.advertisement.formats.api.AdvertisementOptionalFormatsComponent
    public final void me(hax haxVar) {
        this.a.T7().a(haxVar.a, haxVar.b);
    }

    @Override // com.vk.superapp.advertisement.formats.api.AdvertisementOptionalFormatsComponent
    public final bxs x5() {
        return new m2z(this.a.T7());
    }
}

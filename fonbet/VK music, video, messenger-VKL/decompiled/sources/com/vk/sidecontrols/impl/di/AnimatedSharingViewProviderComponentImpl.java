package com.vk.sidecontrols.impl.di;

import android.content.Context;
import com.vk.clips.sdk.shared.api.di.ClipsViewersSdkComponent;
import com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent;
import com.vk.clips.viewer.vk.ClipsViewerEventsComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.im.engine.di.ImExperimentsComponent;
import com.vk.movika.sdk.base.logic.interactor.h;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.sidecontrols.api.AnimatedSharingController;
import com.vk.sidecontrols.api.di.AnimatedSharingViewProviderComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.ml2;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.tl2;

/* compiled from: AnimatedSharingViewProviderComponentImpl.kt */
/* loaded from: classes5.dex */
public final class AnimatedSharingViewProviderComponentImpl implements AnimatedSharingViewProviderComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final SharingComponent a;
    public final ClipsViewerEventsComponent b;
    public final ClipsViewersSdkComponent c;
    public final ImExperimentsComponent d;
    public final ClipsViewerAdapterComponent e;
    public final nwy f = new nwy(new h(this, 5));

    /* compiled from: AnimatedSharingViewProviderComponentImpl.kt */
    public static final class a implements c8m<AnimatedSharingViewProviderComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new AnimatedSharingViewProviderComponentImpl((SharingComponent) g8mVar.a(fpf0.a(SharingComponent.class)), (ClipsViewerEventsComponent) g8mVar.a(fpf0.a(ClipsViewerEventsComponent.class)), (ClipsViewersSdkComponent) g8mVar.a(fpf0.a(ClipsViewersSdkComponent.class)), (ImExperimentsComponent) g8mVar.a(fpf0.a(ImExperimentsComponent.class)), (ClipsViewerAdapterComponent) g8mVar.a(fpf0.a(ClipsViewerAdapterComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AnimatedSharingViewProviderComponentImpl.class, "animatedSharingController", "getAnimatedSharingController()Lcom/vk/sidecontrols/api/AnimatedSharingController;", 0);
        fpf0.a.getClass();
        g = new qcy[]{propertyReference1Impl};
    }

    public AnimatedSharingViewProviderComponentImpl(SharingComponent sharingComponent, ClipsViewerEventsComponent clipsViewerEventsComponent, ClipsViewersSdkComponent clipsViewersSdkComponent, ImExperimentsComponent imExperimentsComponent, ClipsViewerAdapterComponent clipsViewerAdapterComponent) {
        this.a = sharingComponent;
        this.b = clipsViewerEventsComponent;
        this.c = clipsViewersSdkComponent;
        this.d = imExperimentsComponent;
        this.e = clipsViewerAdapterComponent;
    }

    @Override // com.vk.sidecontrols.api.di.AnimatedSharingViewProviderComponent
    public final tl2 o0(Context context) {
        qcy<Object> qcyVar = g[0];
        return new ml2(context, (AnimatedSharingController) this.f.c());
    }
}

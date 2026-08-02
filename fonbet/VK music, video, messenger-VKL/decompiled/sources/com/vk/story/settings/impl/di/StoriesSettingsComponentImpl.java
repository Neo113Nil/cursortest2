package com.vk.story.settings.impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.story.settings.api.di.StoriesSettingsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.evl0;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.r30;

/* compiled from: StoriesSettingsComponentImpl.kt */
/* loaded from: classes11.dex */
public final class StoriesSettingsComponentImpl implements StoriesSettingsComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final AuthBridgeComponent a;
    public final nwy b = new nwy(new r30(this, 7));

    /* compiled from: StoriesSettingsComponentImpl.kt */
    public static final class a implements c8m<StoriesSettingsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new StoriesSettingsComponentImpl((AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StoriesSettingsComponentImpl.class, "settingsController", "getSettingsController()Lcom/vk/story/settings/api/StoriesSettingsController;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public StoriesSettingsComponentImpl(AuthBridgeComponent authBridgeComponent) {
        this.a = authBridgeComponent;
    }

    @Override // com.vk.story.settings.api.di.StoriesSettingsComponent
    public final evl0 B7() {
        qcy<Object> qcyVar = c[0];
        return (evl0) this.b.c();
    }
}

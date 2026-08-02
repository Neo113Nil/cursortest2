package com.vk.camera.clips.drafts.sync.impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.camera.clips.drafts.sync.api.di.ClipsDraftSyncComponent;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.sdk.drafts.api.ClipsDraftComponent;
import com.vk.di.component.DiScopedWithParamsComponent;
import com.vk.di.component.app.AppContextDiComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.fp;
import xsna.fpf0;
import xsna.fvr;
import xsna.g8m;
import xsna.htd;
import xsna.in0;
import xsna.l9i;
import xsna.nsd;
import xsna.nwy;
import xsna.o8m;
import xsna.odo;
import xsna.pwj0;
import xsna.qcy;
import xsna.rfc;
import xsna.std;
import xsna.z4;

/* compiled from: ClipsDraftSyncComponentImpl.kt */
/* loaded from: classes14.dex */
public final class ClipsDraftSyncComponentImpl implements ClipsDraftSyncComponent {
    public static final /* synthetic */ qcy<Object>[] f = {new PropertyReference1Impl(ClipsDraftSyncComponentImpl.class, "syncCoordinator", "getSyncCoordinator()Lcom/vk/camera/clips/drafts/sync/api/ClipsDraftSyncCoordinator;", 0), fp.c(0, ClipsDraftSyncComponentImpl.class, "workManagerSync", "getWorkManagerSync()Lcom/vk/camera/clips/drafts/sync/api/ClipsDraftWorkManagerSync;", fpf0.a)};
    public final ClipsConfigAuthorsComponent a;
    public final ClipsDraftComponent b;
    public final AppContextDiComponent c;
    public final AuthBridgeComponent d;
    public final nwy e = new nwy(new in0(this, 22));

    /* compiled from: ClipsDraftSyncComponentImpl.kt */
    public static final class a implements o8m<ClipsDraftSyncComponent, pwj0, odo> {
        @Override // xsna.o8m
        public final DiScopedWithParamsComponent a(l9i l9iVar, g8m g8mVar, pwj0 pwj0Var) {
            AuthBridgeComponent authBridgeComponent = (AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class));
            long j = ((odo) l9iVar).a;
            ClipsConfigAuthorsComponent clipsConfigAuthorsComponent = (ClipsConfigAuthorsComponent) g8mVar.a(fpf0.a(ClipsConfigAuthorsComponent.class));
            rfc a = fpf0.a(ClipsDraftComponent.class);
            ClipsDraftSyncComponent.Companion.getClass();
            return new ClipsDraftSyncComponentImpl(clipsConfigAuthorsComponent, (ClipsDraftComponent) g8mVar.b(a, new htd("drafts_" + j)), (AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)), authBridgeComponent);
        }
    }

    public ClipsDraftSyncComponentImpl(ClipsConfigAuthorsComponent clipsConfigAuthorsComponent, ClipsDraftComponent clipsDraftComponent, AppContextDiComponent appContextDiComponent, AuthBridgeComponent authBridgeComponent) {
        this.a = clipsConfigAuthorsComponent;
        this.b = clipsDraftComponent;
        this.c = appContextDiComponent;
        this.d = authBridgeComponent;
        new nwy(new z4(this, 26));
        fvr.c = new nsd(w1());
    }

    @Override // com.vk.camera.clips.drafts.sync.api.di.ClipsDraftSyncComponent
    public final std w1() {
        qcy<Object> qcyVar = f[0];
        return (std) this.e.c();
    }
}

package com.vk.im.sync.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.im.engine.di.ImExperimentsComponent;
import com.vk.im.engine.event.observer.coroutines.di.ImCoroutinesEventObserverComponent;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.im.sync.api.di.ImSynchronizationComponent;
import com.vk.im.sync.api.di.ImSynchronizationHelpersComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.dr6;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gb3;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.r2w;

/* compiled from: ImSynchronizationHelpersComponentImpl.kt */
/* loaded from: classes.dex */
public final class ImSynchronizationHelpersComponentImpl implements ImSynchronizationHelpersComponent {
    public static final /* synthetic */ qcy<Object>[] h = {new PropertyReference1Impl(ImSynchronizationHelpersComponentImpl.class, "messagesHistorySynchronizer", "getMessagesHistorySynchronizer()Lcom/vk/im/sync/api/ImMessagesHistorySynchronizer;", 0), fp.c(0, ImSynchronizationHelpersComponentImpl.class, "syncHelper", "getSyncHelper()Lcom/vk/im/sync/api/ImEngineSyncHelper;", fpf0.a)};
    public final AppContextDiComponent a;
    public final ImExperimentsComponent b;
    public final ImSynchronizationComponent c;
    public final ImCoroutinesEventObserverComponent d;
    public final ImReportersComponent e;
    public final nwy f = new nwy(new dr6(2));
    public final nwy g = new nwy(new gb3(this, 4));

    /* compiled from: ImSynchronizationHelpersComponentImpl.kt */
    public static final class a implements c8m<ImSynchronizationHelpersComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImSynchronizationHelpersComponentImpl((AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)), (ImExperimentsComponent) g8mVar.a(fpf0.a(ImExperimentsComponent.class)), (ImSynchronizationComponent) g8mVar.a(fpf0.a(ImSynchronizationComponent.class)), (ImCoroutinesEventObserverComponent) g8mVar.a(fpf0.a(ImCoroutinesEventObserverComponent.class)), (ImReportersComponent) g8mVar.a(fpf0.a(ImReportersComponent.class)));
        }
    }

    public ImSynchronizationHelpersComponentImpl(AppContextDiComponent appContextDiComponent, ImExperimentsComponent imExperimentsComponent, ImSynchronizationComponent imSynchronizationComponent, ImCoroutinesEventObserverComponent imCoroutinesEventObserverComponent, ImReportersComponent imReportersComponent) {
        this.a = appContextDiComponent;
        this.b = imExperimentsComponent;
        this.c = imSynchronizationComponent;
        this.d = imCoroutinesEventObserverComponent;
        this.e = imReportersComponent;
    }

    @Override // com.vk.im.sync.api.di.ImSynchronizationHelpersComponent
    public final r2w x3() {
        qcy<Object> qcyVar = h[1];
        return (r2w) this.g.c();
    }
}

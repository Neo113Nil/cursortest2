package com.vk.im.engine.di.sync;

import com.vk.di.component.DiScopedComponent;
import com.vk.im.sync.api.di.ImSynchronizationComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.cd3;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.jxv;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.w0i0;
import xsna.z58;

/* compiled from: VkAppSynchronizationComponentImpl.kt */
/* loaded from: classes.dex */
public final class VkAppSynchronizationComponentImpl implements ImSynchronizationComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(VkAppSynchronizationComponentImpl.class, "bgSyncWorker", "getBgSyncWorker()Lcom/vk/im/sync/api/ImBgSyncWorker;", 0), fp.c(0, VkAppSynchronizationComponentImpl.class, "secondaryMessagesSynchronizer", "getSecondaryMessagesSynchronizer()Lcom/vk/im/sync/api/SecondaryMessagesSynchronizer;", fpf0.a)};
    public final nwy a = new nwy(new cd3(15));
    public final nwy b = new nwy(new z58(17));

    /* compiled from: VkAppSynchronizationComponentImpl.kt */
    public static final class a implements c8m<ImSynchronizationComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VkAppSynchronizationComponentImpl();
        }
    }

    @Override // com.vk.im.sync.api.di.ImSynchronizationComponent
    public final jxv Ea() {
        qcy<Object> qcyVar = c[0];
        return (jxv) this.a.c();
    }

    @Override // com.vk.im.sync.api.di.ImSynchronizationComponent
    public final w0i0 V4() {
        qcy<Object> qcyVar = c[1];
        return (w0i0) this.b.c();
    }
}

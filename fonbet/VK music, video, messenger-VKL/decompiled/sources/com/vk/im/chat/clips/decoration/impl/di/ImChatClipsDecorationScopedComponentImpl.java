package com.vk.im.chat.clips.decoration.impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.im.chat.clips.decoration.api.di.ImChatClipsDecorationScopedComponent;
import com.vk.im.engine.di.ImCmdRxExecutorScopedComponent;
import com.vk.im.engine.di.ImConfigurationScopedComponent;
import com.vk.im.engine.di.ImExperimentsScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.acw;
import xsna.c48;
import xsna.c8m;
import xsna.cob;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.kpe;
import xsna.l7p0;
import xsna.mpb;
import xsna.nob;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.s1m;
import xsna.tbh;
import xsna.vob;
import xsna.wob;
import xsna.x8l;
import xsna.xob;
import xsna.zod;

/* compiled from: ImChatClipsDecorationScopedComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImChatClipsDecorationScopedComponentImpl implements ImChatClipsDecorationScopedComponent {
    public static final /* synthetic */ qcy<Object>[] h = {new PropertyReference1Impl(ImChatClipsDecorationScopedComponentImpl.class, "chatClipsDecorationRepository", "getChatClipsDecorationRepository()Lcom/vk/im/chat/clips/decoration/impl/data/ChatClipsDecorationRepositoryImpl;", 0), fp.c(0, ImChatClipsDecorationScopedComponentImpl.class, "clipsDecorationDependenciesProvider", "getClipsDecorationDependenciesProvider()Lcom/vk/clips/sdk/screens/feed/decorator/api/di/ClipsDecorationDependenciesProvider;", fpf0.a)};
    public final AuthBridgeComponent a;
    public final ClipsViewerAdapterComponent b;
    public final ImExperimentsScopedComponent c;
    public final ImCmdRxExecutorScopedComponent d;
    public final ImConfigurationScopedComponent e;
    public final nwy f = new nwy(new tbh(this, 23));
    public final nwy g = new nwy(new s1m(this, 16));

    /* compiled from: ImChatClipsDecorationScopedComponentImpl.kt */
    public static final class a implements c8m<ImChatClipsDecorationScopedComponent, acw> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ImChatClipsDecorationScopedComponentImpl((AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)), (ClipsViewerAdapterComponent) g8mVar.a(fpf0.a(ClipsViewerAdapterComponent.class)), (ImExperimentsScopedComponent) g8mVar.a(fpf0.a(ImExperimentsScopedComponent.class)), (ImCmdRxExecutorScopedComponent) g8mVar.a(fpf0.a(ImCmdRxExecutorScopedComponent.class)), (ImConfigurationScopedComponent) g8mVar.a(fpf0.a(ImConfigurationScopedComponent.class)));
        }
    }

    /* compiled from: ImChatClipsDecorationScopedComponentImpl.kt */
    public static final class b implements zod {
        public final wob b = new wob();

        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.zod
        public final l7p0 a() {
            nwy nwyVar = ImChatClipsDecorationScopedComponentImpl.this.f;
            qcy<Object> qcyVar = ImChatClipsDecorationScopedComponentImpl.h[0];
            return new mpb((nob) nwyVar.c());
        }

        @Override // xsna.zod
        public final x8l b() {
            return new vob(this.b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.zod
        public final kpe c() {
            ImChatClipsDecorationScopedComponentImpl imChatClipsDecorationScopedComponentImpl = ImChatClipsDecorationScopedComponentImpl.this;
            if (!imChatClipsDecorationScopedComponentImpl.c.getExperiments().m()) {
                return xob.b.getSTUB();
            }
            nwy nwyVar = imChatClipsDecorationScopedComponentImpl.f;
            qcy<Object> qcyVar = ImChatClipsDecorationScopedComponentImpl.h[0];
            return new xob((nob) nwyVar.c());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.zod
        public final c48 d() {
            ImChatClipsDecorationScopedComponentImpl imChatClipsDecorationScopedComponentImpl = ImChatClipsDecorationScopedComponentImpl.this;
            nwy nwyVar = imChatClipsDecorationScopedComponentImpl.f;
            qcy<Object> qcyVar = ImChatClipsDecorationScopedComponentImpl.h[0];
            return new cob((nob) nwyVar.c(), imChatClipsDecorationScopedComponentImpl.c.getExperiments(), imChatClipsDecorationScopedComponentImpl.e.b0().a());
        }
    }

    public ImChatClipsDecorationScopedComponentImpl(AuthBridgeComponent authBridgeComponent, ClipsViewerAdapterComponent clipsViewerAdapterComponent, ImExperimentsScopedComponent imExperimentsScopedComponent, ImCmdRxExecutorScopedComponent imCmdRxExecutorScopedComponent, ImConfigurationScopedComponent imConfigurationScopedComponent) {
        this.a = authBridgeComponent;
        this.b = clipsViewerAdapterComponent;
        this.c = imExperimentsScopedComponent;
        this.d = imCmdRxExecutorScopedComponent;
        this.e = imConfigurationScopedComponent;
    }

    @Override // com.vk.im.chat.clips.decoration.api.di.ImChatClipsDecorationScopedComponent
    public final zod Rc() {
        qcy<Object> qcyVar = h[1];
        return (zod) this.g.c();
    }
}

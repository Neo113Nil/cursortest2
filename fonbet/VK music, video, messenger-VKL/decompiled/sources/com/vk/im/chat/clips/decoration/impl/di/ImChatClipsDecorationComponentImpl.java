package com.vk.im.chat.clips.decoration.impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.im.engine.di.ImCmdRxExecutorComponent;
import com.vk.im.engine.di.ImConfigurationComponent;
import com.vk.im.engine.di.ImExperimentsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.btm;
import xsna.c48;
import xsna.cob;
import xsna.e7m;
import xsna.fp;
import xsna.fpf0;
import xsna.kpe;
import xsna.l7p0;
import xsna.m1o;
import xsna.mpb;
import xsna.nob;
import xsna.nwy;
import xsna.qcy;
import xsna.vob;
import xsna.wob;
import xsna.x8l;
import xsna.xob;
import xsna.zod;

/* compiled from: ImChatClipsDecorationComponentImpl.kt */
/* loaded from: classes2.dex */
public final class ImChatClipsDecorationComponentImpl implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] g = {new PropertyReference1Impl(ImChatClipsDecorationComponentImpl.class, "chatClipsDecorationRepository", "getChatClipsDecorationRepository()Lcom/vk/im/chat/clips/decoration/impl/data/ChatClipsDecorationRepositoryImpl;", 0), fp.c(0, ImChatClipsDecorationComponentImpl.class, "clipsDecorationDependenciesProvider", "getClipsDecorationDependenciesProvider()Lcom/vk/clips/sdk/screens/feed/decorator/api/di/ClipsDecorationDependenciesProvider;", fpf0.a)};
    public final AuthBridgeComponent a;
    public final ClipsViewerAdapterComponent b;
    public final ImExperimentsComponent c;
    public final ImCmdRxExecutorComponent d;
    public final ImConfigurationComponent e;
    public final nwy f = new nwy(new m1o(this, 13));

    /* compiled from: ImChatClipsDecorationComponentImpl.kt */
    public static final class a implements b7m<Object> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ImChatClipsDecorationComponentImpl((AuthBridgeComponent) e7mVar.a(fpf0.a(AuthBridgeComponent.class)), (ClipsViewerAdapterComponent) e7mVar.a(fpf0.a(ClipsViewerAdapterComponent.class)), (ImExperimentsComponent) e7mVar.a(fpf0.a(ImExperimentsComponent.class)), (ImCmdRxExecutorComponent) e7mVar.a(fpf0.a(ImCmdRxExecutorComponent.class)), (ImConfigurationComponent) e7mVar.a(fpf0.a(ImConfigurationComponent.class)));
        }
    }

    /* compiled from: ImChatClipsDecorationComponentImpl.kt */
    public static final class b implements zod {
        public final wob b = new wob();

        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.zod
        public final l7p0 a() {
            nwy nwyVar = ImChatClipsDecorationComponentImpl.this.f;
            qcy<Object> qcyVar = ImChatClipsDecorationComponentImpl.g[0];
            return new mpb((nob) nwyVar.c());
        }

        @Override // xsna.zod
        public final x8l b() {
            return new vob(this.b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.zod
        public final kpe c() {
            ImChatClipsDecorationComponentImpl imChatClipsDecorationComponentImpl = ImChatClipsDecorationComponentImpl.this;
            if (!imChatClipsDecorationComponentImpl.c.getExperiments().m()) {
                return xob.b.getSTUB();
            }
            nwy nwyVar = imChatClipsDecorationComponentImpl.f;
            qcy<Object> qcyVar = ImChatClipsDecorationComponentImpl.g[0];
            return new xob((nob) nwyVar.c());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.zod
        public final c48 d() {
            ImChatClipsDecorationComponentImpl imChatClipsDecorationComponentImpl = ImChatClipsDecorationComponentImpl.this;
            nwy nwyVar = imChatClipsDecorationComponentImpl.f;
            qcy<Object> qcyVar = ImChatClipsDecorationComponentImpl.g[0];
            return new cob((nob) nwyVar.c(), imChatClipsDecorationComponentImpl.c.getExperiments(), imChatClipsDecorationComponentImpl.e.b0().a());
        }
    }

    public ImChatClipsDecorationComponentImpl(AuthBridgeComponent authBridgeComponent, ClipsViewerAdapterComponent clipsViewerAdapterComponent, ImExperimentsComponent imExperimentsComponent, ImCmdRxExecutorComponent imCmdRxExecutorComponent, ImConfigurationComponent imConfigurationComponent) {
        this.a = authBridgeComponent;
        this.b = clipsViewerAdapterComponent;
        this.c = imExperimentsComponent;
        this.d = imCmdRxExecutorComponent;
        this.e = imConfigurationComponent;
        new nwy(new btm(this, 12));
    }
}

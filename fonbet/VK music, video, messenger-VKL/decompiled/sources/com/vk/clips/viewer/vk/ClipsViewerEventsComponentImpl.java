package com.vk.clips.viewer.vk;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.d1q;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.vi0;

/* compiled from: ClipsViewerEventsComponentImpl.kt */
/* loaded from: classes17.dex */
public final class ClipsViewerEventsComponentImpl implements ClipsViewerEventsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new vi0(10));

    /* compiled from: ClipsViewerEventsComponentImpl.kt */
    public static final class a implements c8m<ClipsViewerEventsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipsViewerEventsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsViewerEventsComponentImpl.class, "eventsHandler", "getEventsHandler()Lcom/vk/clips/viewer/vk/EventsHandlerImpl;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.clips.viewer.vk.ClipsViewerEventsComponent
    public final com.vk.clips.viewer.vk.a y0() {
        qcy<Object> qcyVar = b[0];
        return (d1q) this.a.c();
    }
}

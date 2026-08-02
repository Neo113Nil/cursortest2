package com.vk.restriction.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.donut.video.api.di.DonutVideoComponent;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fat;
import xsna.fpf0;
import xsna.g8m;
import xsna.gzs;
import xsna.hdt0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.xuo0;

/* compiled from: VideoRestrictionManagerComponentImpl.kt */
/* loaded from: classes11.dex */
public final class VideoRestrictionManagerComponentImpl implements VideoRestrictionManagerComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final DonutVideoComponent a;
    public final nwy b = new nwy(new fat(this, 10));

    /* compiled from: VideoRestrictionManagerComponentImpl.kt */
    public static final class a implements c8m<VideoRestrictionManagerComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VideoRestrictionManagerComponentImpl((DonutVideoComponent) g8mVar.a(fpf0.a(DonutVideoComponent.class)));
        }
    }

    /* compiled from: VideoRestrictionManagerComponentImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<Long> {
        @Override // xsna.gzs
        public final Long invoke() {
            ((xuo0) this.receiver).getClass();
            return Long.valueOf(xuo0.c());
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VideoRestrictionManagerComponentImpl.class, "videoRestrictionManager", "getVideoRestrictionManager()Lcom/vk/restriction/domain/VideoRestrictionManager;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public VideoRestrictionManagerComponentImpl(DonutVideoComponent donutVideoComponent) {
        this.a = donutVideoComponent;
    }

    @Override // com.vk.restriction.di.VideoRestrictionManagerComponent
    public final hdt0 n2() {
        qcy<Object> qcyVar = c[0];
        return (hdt0) this.b.c();
    }
}

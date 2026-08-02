package com.vk.comments.impl.di;

import com.vk.comments.api.di.CommentsComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.ca;
import xsna.d14;
import xsna.d2;
import xsna.e7m;
import xsna.ep;
import xsna.ewy;
import xsna.f110;
import xsna.feg;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.k11;
import xsna.msy;
import xsna.neg;
import xsna.o6;
import xsna.qcy;
import xsna.sk4;
import xsna.ueg;
import xsna.zfg;

/* compiled from: CommentsComponentImpl.kt */
/* loaded from: classes17.dex */
public final class CommentsComponentImpl implements CommentsComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final Object a;
    public final ewy b = new ewy(new sk4(5));
    public final ewy c = new ewy(new o6(9));
    public final ewy d = new ewy(new ca(this, 26));
    public final ewy e = new ewy(new d14(9));
    public final ewy f = new ewy(new d2(9));

    /* compiled from: CommentsComponentImpl.kt */
    public static final class a implements b7m<CommentsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new CommentsComponentImpl(msy.a(LazyThreadSafetyMode.NONE, new k11(e7mVar, 1)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CommentsComponentImpl.class, "commentsFeatureRouter", "getCommentsFeatureRouter()Lcom/vk/comments/api/router/CommentsFeatureRouter;", 0);
        hpf0 hpf0Var = fpf0.a;
        g = new qcy[]{propertyReference1Impl, fp.c(0, CommentsComponentImpl.class, "commentsProvider", "getCommentsProvider()Lcom/vk/comments/api/provider/CommentsProvider;", hpf0Var), ep.a(0, CommentsComponentImpl.class, "commentsRepository", "getCommentsRepository()Lcom/vk/comments/api/MarketItemCommentsRepository;", hpf0Var), ep.a(0, CommentsComponentImpl.class, "commentsInteractorFactory", "getCommentsInteractorFactory()Lcom/vk/comments/api/CommentsInteractorFactory;", hpf0Var), ep.a(0, CommentsComponentImpl.class, "commentsControllerFactory", "getCommentsControllerFactory()Lcom/vk/comments/api/CommentsControllerFactory;", hpf0Var)};
    }

    public CommentsComponentImpl(Lazy<? extends AttachmentMappersComponent> lazy) {
        this.a = lazy;
    }

    @Override // com.vk.comments.api.di.CommentsComponent
    public final zfg I3() {
        qcy<Object> qcyVar = g[1];
        return (zfg) this.c.c();
    }

    @Override // com.vk.comments.api.di.CommentsComponent
    public final ueg U6() {
        qcy<Object> qcyVar = g[3];
        return (ueg) this.e.c();
    }

    @Override // com.vk.comments.api.di.CommentsComponent
    public final neg jd() {
        qcy<Object> qcyVar = g[0];
        return (neg) this.b.c();
    }

    @Override // com.vk.comments.api.di.CommentsComponent
    public final feg wf() {
        qcy<Object> qcyVar = g[4];
        return (feg) this.f.c();
    }

    @Override // com.vk.comments.api.di.CommentsComponent
    public final f110 y6() {
        qcy<Object> qcyVar = g[2];
        return (f110) this.d.c();
    }
}

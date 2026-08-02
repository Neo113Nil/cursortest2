package com.vk.clips.attachments.impl.di;

import com.vk.clips.attachments.api.di.ClipsAttachmentsComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.dv2;
import xsna.dze;
import xsna.e20;
import xsna.ep;
import xsna.f20;
import xsna.f84;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.imf;
import xsna.jg0;
import xsna.nkq0;
import xsna.nwy;
import xsna.pkq0;
import xsna.pne;
import xsna.pwj0;
import xsna.qcy;
import xsna.wb1;

/* compiled from: ClipsAttachmentsComponentImpl.kt */
/* loaded from: classes16.dex */
public final class ClipsAttachmentsComponentImpl implements ClipsAttachmentsComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final nwy a = new nwy(new f84(4));
    public final nwy b = new nwy(new e20(6));
    public final nwy c = new nwy(new f20(5));
    public final nwy d;
    public final nwy e;

    /* compiled from: ClipsAttachmentsComponentImpl.kt */
    public static final class a implements c8m<ClipsAttachmentsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipsAttachmentsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsAttachmentsComponentImpl.class, "userLinksViewerRenderer", "getUserLinksViewerRenderer()Lcom/vk/clips/attachments/api/main/UserLinksViewerRenderer;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, ClipsAttachmentsComponentImpl.class, "userLinksClickController", "getUserLinksClickController()Lcom/vk/clips/attachments/api/main/UserLinksClickController;", hpf0Var), ep.a(0, ClipsAttachmentsComponentImpl.class, "ordMiniAppHandlerFactory", "getOrdMiniAppHandlerFactory()Lcom/vk/clips/attachments/api/main/ord/ClipsOrdMiniAppHandlerFactory;", hpf0Var), ep.a(0, ClipsAttachmentsComponentImpl.class, "clipsOrdUtils", "getClipsOrdUtils()Lcom/vk/clips/attachments/api/main/ord/ClipsOrdUtils;", hpf0Var), ep.a(0, ClipsAttachmentsComponentImpl.class, "clipsVideoAttachmentFactory", "getClipsVideoAttachmentFactory()Lcom/vk/clips/attachments/api/main/video/ClipsVideoAttachmentFactory;", hpf0Var), ep.a(0, ClipsAttachmentsComponentImpl.class, "clipsPublishAttachesInteractor", "getClipsPublishAttachesInteractor()Lcom/vk/clips/attachments/api/publish/ClipsPublishAttachesInteractor;", hpf0Var)};
    }

    public ClipsAttachmentsComponentImpl() {
        new nwy(new wb1(3));
        this.d = new nwy(new dv2(3));
        this.e = new nwy(new jg0(4));
    }

    @Override // com.vk.clips.attachments.api.di.ClipsAttachmentsComponent
    public final dze C8() {
        qcy<Object> qcyVar = f[5];
        return (dze) this.e.c();
    }

    @Override // com.vk.clips.attachments.api.di.ClipsAttachmentsComponent
    public final nkq0 H1() {
        qcy<Object> qcyVar = f[1];
        return (nkq0) this.b.c();
    }

    @Override // com.vk.clips.attachments.api.di.ClipsAttachmentsComponent
    public final imf Hd() {
        qcy<Object> qcyVar = f[4];
        return (imf) this.d.c();
    }

    @Override // com.vk.clips.attachments.api.di.ClipsAttachmentsComponent
    public final pne i2() {
        qcy<Object> qcyVar = f[2];
        return (pne) this.c.c();
    }

    @Override // com.vk.clips.attachments.api.di.ClipsAttachmentsComponent
    public final pkq0 oe() {
        qcy<Object> qcyVar = f[0];
        return (pkq0) this.a.c();
    }
}

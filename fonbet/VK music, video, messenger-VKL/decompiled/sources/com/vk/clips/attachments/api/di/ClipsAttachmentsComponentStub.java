package com.vk.clips.attachments.api.di;

import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.dze;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.i21;
import xsna.ig;
import xsna.imf;
import xsna.kk1;
import xsna.lg;
import xsna.lz2;
import xsna.nkq0;
import xsna.nm0;
import xsna.nwy;
import xsna.pkq0;
import xsna.pne;
import xsna.qcy;

/* compiled from: ClipsAttachmentsComponentStub.kt */
/* loaded from: classes16.dex */
public final class ClipsAttachmentsComponentStub implements ClipsAttachmentsComponent {
    public static final a f;
    public static final /* synthetic */ qcy<Object>[] g;
    public final nwy a = new nwy(new nm0(3));
    public final nwy b = new nwy(new kk1(2));
    public final nwy c = new nwy(new ig(5));
    public final nwy d;
    public final nwy e;

    /* compiled from: ClipsAttachmentsComponentStub.kt */
    public static final class a {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsAttachmentsComponentStub.class, "userLinksViewerRenderer", "getUserLinksViewerRenderer()Lcom/vk/clips/attachments/api/main/UserLinksViewerRenderer;", 0);
        hpf0 hpf0Var = fpf0.a;
        g = new qcy[]{propertyReference1Impl, fp.c(0, ClipsAttachmentsComponentStub.class, "userLinksClickController", "getUserLinksClickController()Lcom/vk/clips/attachments/api/main/UserLinksClickController;", hpf0Var), ep.a(0, ClipsAttachmentsComponentStub.class, "ordMiniAppHandlerFactory", "getOrdMiniAppHandlerFactory()Lcom/vk/clips/attachments/api/main/ord/ClipsOrdMiniAppHandlerFactory;", hpf0Var), ep.a(0, ClipsAttachmentsComponentStub.class, "clipsOrdUtils", "getClipsOrdUtils()Lcom/vk/clips/attachments/api/main/ord/ClipsOrdUtils;", hpf0Var), ep.a(0, ClipsAttachmentsComponentStub.class, "clipsVideoAttachmentFactory", "getClipsVideoAttachmentFactory()Lcom/vk/clips/attachments/api/main/video/ClipsVideoAttachmentFactory;", hpf0Var), ep.a(0, ClipsAttachmentsComponentStub.class, "clipsPublishAttachesInteractor", "getClipsPublishAttachesInteractor()Lcom/vk/clips/attachments/api/publish/ClipsPublishAttachesInteractor;", hpf0Var)};
        f = new a();
    }

    public ClipsAttachmentsComponentStub() {
        new nwy(new i21(4));
        this.d = new nwy(new lz2(4));
        this.e = new nwy(new lg(8));
    }

    @Override // com.vk.clips.attachments.api.di.ClipsAttachmentsComponent
    public final dze C8() {
        qcy<Object> qcyVar = g[5];
        return (dze) this.e.c();
    }

    @Override // com.vk.clips.attachments.api.di.ClipsAttachmentsComponent
    public final nkq0 H1() {
        qcy<Object> qcyVar = g[1];
        return (nkq0) this.b.c();
    }

    @Override // com.vk.clips.attachments.api.di.ClipsAttachmentsComponent
    public final imf Hd() {
        qcy<Object> qcyVar = g[4];
        return (imf) this.d.c();
    }

    @Override // com.vk.clips.attachments.api.di.ClipsAttachmentsComponent
    public final pne i2() {
        qcy<Object> qcyVar = g[2];
        return (pne) this.c.c();
    }

    @Override // com.vk.clips.attachments.api.di.ClipsAttachmentsComponent
    public final pkq0 oe() {
        qcy<Object> qcyVar = g[0];
        return (pkq0) this.a.c();
    }
}

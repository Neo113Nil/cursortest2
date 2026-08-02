package com.vk.common.links.generator.impl.di;

import com.vk.clips.clipchecker.api.di.ClipCheckerComponent;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.common.links.generator.api.di.LinksGeneratorComponent;
import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a44;
import xsna.b7m;
import xsna.de4;
import xsna.e7m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.gss0;
import xsna.hpf0;
import xsna.n1;
import xsna.n4c0;
import xsna.nwy;
import xsna.pde;
import xsna.qcy;
import xsna.xsw;

/* compiled from: LinksGeneratorComponentImpl.kt */
/* loaded from: classes17.dex */
public final class LinksGeneratorComponentImpl implements LinksGeneratorComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final ClipCheckerComponent a;
    public final ClipsConfigViewersComponent b;
    public final nwy c = new nwy(new xsw(this, 3));
    public final nwy d = new nwy(new n1(21));
    public final nwy e = new nwy(new a44(22));

    /* compiled from: LinksGeneratorComponentImpl.kt */
    public static final class a implements b7m<LinksGeneratorComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new LinksGeneratorComponentImpl((ClipCheckerComponent) e7mVar.a(fpf0.a(ClipCheckerComponent.class)), (ClipsConfigViewersComponent) e7mVar.a(fpf0.a(ClipsConfigViewersComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(LinksGeneratorComponentImpl.class, "videoLinkGenerator", "getVideoLinkGenerator()Lcom/vk/common/links/generator/api/VideoLinkGenerator;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, LinksGeneratorComponentImpl.class, "clipsGridLinkGenerator", "getClipsGridLinkGenerator()Lcom/vk/common/links/generator/api/ClipsGridLinkGenerator;", hpf0Var), ep.a(0, LinksGeneratorComponentImpl.class, "postLinkGenerator", "getPostLinkGenerator()Lcom/vk/common/links/generator/api/PostLinkGenerator;", hpf0Var), ep.a(0, LinksGeneratorComponentImpl.class, "attachLinkGenerator", "getAttachLinkGenerator()Lcom/vk/common/links/generator/api/AttachLinkGenerator;", hpf0Var)};
    }

    public LinksGeneratorComponentImpl(ClipCheckerComponent clipCheckerComponent, ClipsConfigViewersComponent clipsConfigViewersComponent) {
        this.a = clipCheckerComponent;
        this.b = clipsConfigViewersComponent;
        new nwy(new de4(18));
    }

    @Override // com.vk.common.links.generator.api.di.LinksGeneratorComponent
    public final n4c0 N7() {
        qcy<Object> qcyVar = f[2];
        return (n4c0) this.e.c();
    }

    @Override // com.vk.common.links.generator.api.di.LinksGeneratorComponent
    public final pde T5() {
        qcy<Object> qcyVar = f[1];
        return (pde) this.d.c();
    }

    @Override // com.vk.common.links.generator.api.di.LinksGeneratorComponent
    public final gss0 Za() {
        qcy<Object> qcyVar = f[0];
        return (gss0) this.c.c();
    }
}

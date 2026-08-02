package com.vk.camera.editor.common.di;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.cng0;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hhw;
import xsna.hpf0;
import xsna.kz8;
import xsna.l35;
import xsna.l3n0;
import xsna.l9;
import xsna.m2g;
import xsna.ml7;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.re0;
import xsna.rkc;
import xsna.uw3;
import xsna.v3l0;
import xsna.w3l0;
import xsna.x5;

/* compiled from: CommonEditorComponentImpl.kt */
/* loaded from: classes16.dex */
public final class CommonEditorComponentImpl implements CommonEditorComponent {
    public static final /* synthetic */ qcy<Object>[] h;
    public final nwy a = new nwy(new ml7(3));
    public final nwy b = new nwy(new m2g(this, 1));
    public final nwy c = new nwy(new uw3(10));
    public final nwy d = new nwy(new l9(8));
    public final nwy e = new nwy(new l35(8));
    public final nwy f = new nwy(new x5(10));
    public final nwy g = new nwy(new re0(7));

    /* compiled from: CommonEditorComponentImpl.kt */
    public static final class a implements c8m<CommonEditorComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new CommonEditorComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CommonEditorComponentImpl.class, "stickerDialogUtil", "getStickerDialogUtil()Lcom/vk/camera/editor/common/utils/StickerDialogUtilImpl;", 0);
        hpf0 hpf0Var = fpf0.a;
        h = new qcy[]{propertyReference1Impl, fp.c(0, CommonEditorComponentImpl.class, "stickerDialogProvider", "getStickerDialogProvider()Lcom/vk/camera/editor/common/stickers/StickerDialogsProvider;", hpf0Var), ep.a(0, CommonEditorComponentImpl.class, "suggestProvider", "getSuggestProvider()Lcom/vk/camera/editor/common/suggest/SuggestProvider;", hpf0Var), ep.a(0, CommonEditorComponentImpl.class, "cadreUtil", "getCadreUtil()Lcom/vk/camera/editor/common/cadre/CadreUtil;", hpf0Var), ep.a(0, CommonEditorComponentImpl.class, "rotationGuidesDrawerFactory", "getRotationGuidesDrawerFactory()Lcom/vk/stickers/common/guides/rotation/RotationGuidesDrawerFactory;", hpf0Var), ep.a(0, CommonEditorComponentImpl.class, "clipboardInsertionInteractor", "getClipboardInsertionInteractor()Lcom/vk/camera/editor/common/text/ImageClipboardBufferInteractor;", hpf0Var), ep.a(0, CommonEditorComponentImpl.class, "clickableStickerUtil", "getClickableStickerUtil()Lcom/vk/camera/editor/common/stickers/ClickableStickerUtils;", hpf0Var)};
    }

    @Override // com.vk.camera.editor.common.di.CommonEditorComponent
    public final kz8 Ha() {
        qcy<Object> qcyVar = h[3];
        return (kz8) this.d.c();
    }

    @Override // com.vk.camera.editor.common.di.CommonEditorComponent
    public final l3n0 Oc() {
        qcy<Object> qcyVar = h[2];
        return (l3n0) this.c.c();
    }

    @Override // com.vk.camera.editor.common.di.CommonEditorComponent
    public final cng0 W3() {
        qcy<Object> qcyVar = h[4];
        return (cng0) this.e.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.camera.editor.common.di.CommonEditorComponent
    public final v3l0 Wc() {
        qcy<Object> qcyVar = h[0];
        return (v3l0) this.a.c();
    }

    @Override // com.vk.camera.editor.common.di.CommonEditorComponent
    public final hhw X7() {
        qcy<Object> qcyVar = h[5];
        return (hhw) this.f.c();
    }

    @Override // com.vk.camera.editor.common.di.CommonEditorComponent
    public final rkc Z1() {
        qcy<Object> qcyVar = h[6];
        return (rkc) this.g.c();
    }

    @Override // com.vk.camera.editor.common.di.CommonEditorComponent
    public final w3l0 Zc() {
        qcy<Object> qcyVar = h[1];
        return (w3l0) this.b.c();
    }
}

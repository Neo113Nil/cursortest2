package com.vk.camera.clips.api.stub;

import com.vk.camera.clips.api.di.CameraClipsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a44;
import xsna.af0;
import xsna.de4;
import xsna.ee4;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.l63;
import xsna.lbk;
import xsna.lkt0;
import xsna.n1;
import xsna.nwy;
import xsna.qcy;
import xsna.qhd;
import xsna.qtd;
import xsna.rhd;
import xsna.vyd;
import xsna.w9;
import xsna.xke;

/* compiled from: CameraClipsComponentStub.kt */
/* loaded from: classes14.dex */
public final class CameraClipsComponentStub implements CameraClipsComponent {
    public static final /* synthetic */ qcy<Object>[] h;
    public final nwy a = new nwy(new n1(8));
    public final nwy b = new nwy(new a44(3));
    public final nwy c = new nwy(new de4(3));
    public final nwy d = new nwy(new ee4(1));
    public final nwy e = new nwy(new l63(4));
    public final nwy f = new nwy(new af0(5));
    public final nwy g = new nwy(new w9(4));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CameraClipsComponentStub.class, "pickerConfig", "getPickerConfig()Lcom/vk/camera/clips/api/config/ClipsAuthorsPickerConfig;", 0);
        hpf0 hpf0Var = fpf0.a;
        h = new qcy[]{propertyReference1Impl, fp.c(0, CameraClipsComponentStub.class, "clipsAuthorsPickerInteractor", "getClipsAuthorsPickerInteractor()Lcom/vk/camera/clips/api/main/ClipsAuthorsPickerInteractor;", hpf0Var), ep.a(0, CameraClipsComponentStub.class, "vtcProvider", "getVtcProvider()Lcom/vk/camera/clips/api/di/VideoToClipsProvider;", hpf0Var), ep.a(0, CameraClipsComponentStub.class, "creationContextStatProvider", "getCreationContextStatProvider()Lcom/vk/camera/clips/api/main/CreationContextStatProvider;", hpf0Var), ep.a(0, CameraClipsComponentStub.class, "editorNavigator", "getEditorNavigator()Lcom/vk/camera/clips/api/di/ClipsEditorNavigator;", hpf0Var), ep.a(0, CameraClipsComponentStub.class, "clipsDraftStore", "getClipsDraftStore()Lcom/vk/camera/clips/api/main/ClipsDraftStore;", hpf0Var), ep.a(0, CameraClipsComponentStub.class, "logger", "getLogger()Lcom/vk/clips/sdk/common/provider/logger/ClipsLogger;", hpf0Var)};
    }

    @Override // com.vk.camera.clips.api.di.CameraClipsComponent
    public final qhd X9() {
        qcy<Object> qcyVar = h[0];
        return (qhd) this.a.c();
    }

    @Override // com.vk.camera.clips.api.di.CameraClipsComponent
    public final lkt0 a5() {
        qcy<Object> qcyVar = h[2];
        return (lkt0) this.c.c();
    }

    @Override // com.vk.camera.clips.api.di.CameraClipsComponent
    public final lbk c4() {
        qcy<Object> qcyVar = h[3];
        return (lbk) this.d.c();
    }

    @Override // com.vk.camera.clips.api.di.CameraClipsComponent
    public final qtd e1() {
        qcy<Object> qcyVar = h[5];
        return (qtd) this.f.c();
    }

    @Override // com.vk.camera.clips.api.di.CameraClipsComponent
    public final xke getLogger() {
        qcy<Object> qcyVar = h[6];
        return (xke) this.g.c();
    }

    @Override // com.vk.camera.clips.api.di.CameraClipsComponent
    public final rhd p9() {
        qcy<Object> qcyVar = h[1];
        return (rhd) this.b.c();
    }

    @Override // com.vk.camera.clips.api.di.CameraClipsComponent
    public final vyd sf() {
        qcy<Object> qcyVar = h[4];
        return (vyd) this.e.c();
    }
}

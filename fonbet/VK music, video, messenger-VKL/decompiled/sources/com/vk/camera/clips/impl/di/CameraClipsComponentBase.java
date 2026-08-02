package com.vk.camera.clips.impl.di;

import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.camera.clips.impl.di.CameraClipsComponentBase;
import com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b63;
import xsna.c8m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gzs;
import xsna.hpf0;
import xsna.lbk;
import xsna.lkt0;
import xsna.nwy;
import xsna.ps0;
import xsna.pwj0;
import xsna.qcy;
import xsna.qhd;
import xsna.qtd;
import xsna.rhd;
import xsna.ug9;
import xsna.vg9;
import xsna.vyd;
import xsna.wg9;
import xsna.xke;
import xsna.yg9;
import xsna.zg9;

/* compiled from: CameraClipsComponentBase.kt */
/* loaded from: classes.dex */
public class CameraClipsComponentBase implements CameraClipsComponent {
    public static final /* synthetic */ qcy<Object>[] i;
    public final nwy d;
    public final nwy a = new nwy(new ug9(0));
    public final nwy b = new nwy(new vg9(0));
    public final nwy c = new nwy(new wg9(this, 0));
    public final nwy e = new nwy(new ps0(1));
    public final nwy f = new nwy(new yg9(this, 0));
    public final nwy g = new nwy(new zg9(0));
    public final nwy h = new nwy(new b63(1));

    /* compiled from: CameraClipsComponentBase.kt */
    public static final class a implements c8m<CameraClipsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new CameraClipsComponentBase((ClipsConfigAuthorsComponent) g8mVar.a(fpf0.a(ClipsConfigAuthorsComponent.class)), (ClipsBlacklistsComponent) g8mVar.a(fpf0.a(ClipsBlacklistsComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CameraClipsComponentBase.class, "pickerConfig", "getPickerConfig()Lcom/vk/camera/clips/api/config/ClipsAuthorsPickerConfig;", 0);
        hpf0 hpf0Var = fpf0.a;
        i = new qcy[]{propertyReference1Impl, fp.c(0, CameraClipsComponentBase.class, "authorsRepository", "getAuthorsRepository()Lcom/vk/camera/clips/impl/authors/selector/ClipsAuthorsSelectorRepositoryImpl;", hpf0Var), ep.a(0, CameraClipsComponentBase.class, "clipsAuthorsPickerInteractor", "getClipsAuthorsPickerInteractor()Lcom/vk/camera/clips/api/main/ClipsAuthorsPickerInteractor;", hpf0Var), ep.a(0, CameraClipsComponentBase.class, "vtcProvider", "getVtcProvider()Lcom/vk/camera/clips/api/di/VideoToClipsProvider;", hpf0Var), ep.a(0, CameraClipsComponentBase.class, "creationContextStatProvider", "getCreationContextStatProvider()Lcom/vk/camera/clips/api/main/CreationContextStatProvider;", hpf0Var), ep.a(0, CameraClipsComponentBase.class, "editorNavigator", "getEditorNavigator()Lcom/vk/camera/clips/api/di/ClipsEditorNavigator;", hpf0Var), ep.a(0, CameraClipsComponentBase.class, "clipsDraftStore", "getClipsDraftStore()Lcom/vk/camera/clips/api/main/ClipsDraftStore;", hpf0Var), ep.a(0, CameraClipsComponentBase.class, "logger", "getLogger()Lcom/vk/clips/sdk/common/provider/logger/ClipsLogger;", hpf0Var)};
    }

    public CameraClipsComponentBase(final ClipsConfigAuthorsComponent clipsConfigAuthorsComponent, final ClipsBlacklistsComponent clipsBlacklistsComponent) {
        this.d = new nwy(new gzs() { // from class: xsna.xg9
            @Override // xsna.gzs
            public final Object invoke() {
                qcy<Object>[] qcyVarArr = CameraClipsComponentBase.i;
                return new mkt0(ClipsConfigAuthorsComponent.this.getExperiments(), new bpn0(new m1(clipsBlacklistsComponent, 11)));
            }
        });
    }

    @Override // com.vk.camera.clips.api.di.CameraClipsComponent
    public final qhd X9() {
        qcy<Object> qcyVar = i[0];
        return (qhd) this.a.c();
    }

    @Override // com.vk.camera.clips.api.di.CameraClipsComponent
    public final lkt0 a5() {
        qcy<Object> qcyVar = i[3];
        return (lkt0) this.d.c();
    }

    @Override // com.vk.camera.clips.api.di.CameraClipsComponent
    public final lbk c4() {
        qcy<Object> qcyVar = i[4];
        return (lbk) this.e.c();
    }

    @Override // com.vk.camera.clips.api.di.CameraClipsComponent
    public final qtd e1() {
        qcy<Object> qcyVar = i[6];
        return (qtd) this.g.c();
    }

    @Override // com.vk.camera.clips.api.di.CameraClipsComponent
    public final xke getLogger() {
        qcy<Object> qcyVar = i[7];
        return (xke) this.h.c();
    }

    @Override // com.vk.camera.clips.api.di.CameraClipsComponent
    public final rhd p9() {
        qcy<Object> qcyVar = i[2];
        return (rhd) this.c.c();
    }

    @Override // com.vk.camera.clips.api.di.CameraClipsComponent
    public final vyd sf() {
        qcy<Object> qcyVar = i[5];
        return (vyd) this.f.c();
    }
}

package com.vk.folders.impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.folders.api.di.FoldersComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a2s;
import xsna.byr;
import xsna.c8m;
import xsna.ep;
import xsna.ewy;
import xsna.fp;
import xsna.fpf0;
import xsna.fr6;
import xsna.g8m;
import xsna.gb3;
import xsna.hpf0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.qo;
import xsna.rxr;

/* compiled from: FoldersComponentImpl.kt */
/* loaded from: classes.dex */
public final class FoldersComponentImpl implements FoldersComponent {
    public static final /* synthetic */ qcy<Object>[] e;
    public final AuthBridgeComponent a;
    public final ewy b = new ewy(new gb3(this, 2));
    public final ewy c = new ewy(new fr6(3));
    public final nwy d = new nwy(new qo(3));

    /* compiled from: FoldersComponentImpl.kt */
    public static final class a implements c8m<FoldersComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new FoldersComponentImpl((AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(FoldersComponentImpl.class, "folderCounterSettingsInteractor", "getFolderCounterSettingsInteractor()Lcom/vk/folders/api/domain/interactor/FolderCounterSettingsInteractor;", 0);
        hpf0 hpf0Var = fpf0.a;
        e = new qcy[]{propertyReference1Impl, fp.c(0, FoldersComponentImpl.class, "folderActionInteractor", "getFolderActionInteractor()Lcom/vk/folders/api/domain/interactor/FolderActionInteractor;", hpf0Var), ep.a(0, FoldersComponentImpl.class, "folderRouter", "getFolderRouter()Lcom/vk/folders/api/FoldersRouter;", hpf0Var)};
    }

    public FoldersComponentImpl(AuthBridgeComponent authBridgeComponent) {
        this.a = authBridgeComponent;
    }

    @Override // com.vk.folders.api.di.FoldersComponent
    public final byr D3() {
        qcy<Object> qcyVar = e[0];
        return (byr) this.b.c();
    }

    @Override // com.vk.folders.api.di.FoldersComponent
    public final a2s R2() {
        qcy<Object> qcyVar = e[2];
        return (a2s) this.d.c();
    }

    @Override // com.vk.folders.api.di.FoldersComponent
    public final rxr r3() {
        qcy<Object> qcyVar = e[1];
        return (rxr) this.c.c();
    }
}

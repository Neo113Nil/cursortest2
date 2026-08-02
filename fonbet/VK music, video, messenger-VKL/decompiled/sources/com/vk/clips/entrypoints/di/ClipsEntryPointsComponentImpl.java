package com.vk.clips.entrypoints.di;

import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.di.component.DiUnscopedComponent;
import com.vk.movika.sdk.base.flow.binding.l;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.c6;
import xsna.e7m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.l1;
import xsna.m1e;
import xsna.nud;
import xsna.nwy;
import xsna.p1e;
import xsna.qcy;

/* compiled from: ClipsEntryPointsComponentImpl.kt */
/* loaded from: classes16.dex */
public final class ClipsEntryPointsComponentImpl implements ClipsEntryPointsComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final CameraClipsComponent a;
    public final ClipsConfigAuthorsComponent b;
    public final nwy c = new nwy(new l1(this, 28));
    public final nwy d = new nwy(new c6(4));
    public final nwy e;

    /* compiled from: ClipsEntryPointsComponentImpl.kt */
    public static final class a implements b7m<ClipsEntryPointsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new ClipsEntryPointsComponentImpl((CameraClipsComponent) e7mVar.a(fpf0.a(CameraClipsComponent.class)), (ClipsConfigAuthorsComponent) e7mVar.a(fpf0.a(ClipsConfigAuthorsComponent.class)), (ClipsBlacklistsComponent) e7mVar.a(fpf0.a(ClipsBlacklistsComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsEntryPointsComponentImpl.class, "launcher", "getLauncher()Lcom/vk/clips/entrypoints/ClipsEntryPointsLauncher;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, ClipsEntryPointsComponentImpl.class, "draftsInteractor", "getDraftsInteractor()Lcom/vk/clips/entrypoints/ClipsDraftsInteractor;", hpf0Var), ep.a(0, ClipsEntryPointsComponentImpl.class, "repository", "getRepository$impl_release()Lcom/vk/clips/entrypoints/data/ClipsEntryPointRepository;", hpf0Var)};
    }

    public ClipsEntryPointsComponentImpl(CameraClipsComponent cameraClipsComponent, ClipsConfigAuthorsComponent clipsConfigAuthorsComponent, ClipsBlacklistsComponent clipsBlacklistsComponent) {
        this.a = cameraClipsComponent;
        this.b = clipsConfigAuthorsComponent;
        this.e = new nwy(new l(6, this, clipsBlacklistsComponent));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m1e Df() {
        qcy<Object> qcyVar = f[2];
        return (m1e) this.e.c();
    }

    @Override // com.vk.clips.entrypoints.di.ClipsEntryPointsComponent
    public final nud E6() {
        qcy<Object> qcyVar = f[1];
        return (nud) this.d.c();
    }

    @Override // com.vk.clips.entrypoints.di.ClipsEntryPointsComponent
    public final p1e e() {
        qcy<Object> qcyVar = f[0];
        return (p1e) this.c.c();
    }
}

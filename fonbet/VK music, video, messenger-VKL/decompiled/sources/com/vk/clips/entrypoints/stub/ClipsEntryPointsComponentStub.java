package com.vk.clips.entrypoints.stub;

import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ee4;
import xsna.fp;
import xsna.fpf0;
import xsna.l63;
import xsna.nud;
import xsna.nwy;
import xsna.p1e;
import xsna.qcy;
import xsna.r1e;
import xsna.sud;

/* compiled from: ClipsEntryPointsComponentStub.kt */
/* loaded from: classes16.dex */
public final class ClipsEntryPointsComponentStub implements ClipsEntryPointsComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(ClipsEntryPointsComponentStub.class, "launcher", "getLauncher()Lcom/vk/clips/entrypoints/stub/ClipsEntryPointsLauncherStub;", 0), fp.c(0, ClipsEntryPointsComponentStub.class, "draftsInteractor", "getDraftsInteractor()Lcom/vk/clips/entrypoints/stub/ClipsDraftsInteractorStub;", fpf0.a)};
    public final nwy a = new nwy(new ee4(6));
    public final nwy b = new nwy(new l63(7));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.clips.entrypoints.di.ClipsEntryPointsComponent
    public final nud E6() {
        qcy<Object> qcyVar = c[1];
        return (sud) this.b.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.clips.entrypoints.di.ClipsEntryPointsComponent
    public final p1e e() {
        qcy<Object> qcyVar = c[0];
        return (r1e) this.a.c();
    }
}

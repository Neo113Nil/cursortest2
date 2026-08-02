package com.vk.clips.playlists.folders.root;

import com.vk.clips.playlists.ClipsPlaylistNamingLaunchParams;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.clips.playlists.folders.root.f;
import com.vk.clips.playlists.folders.root.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;

/* compiled from: ClipsPlaylistsFoldersRootReducer.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class d extends FunctionReferenceImpl implements izs<f, g.a.InterfaceC0628a> {
    @Override // xsna.izs
    public final g.a.InterfaceC0628a invoke(f fVar) {
        f fVar2 = fVar;
        ((e) this.receiver).getClass();
        if (!(fVar2 instanceof f.c)) {
            if (fVar2 instanceof f.a) {
                f.a aVar = (f.a) fVar2;
                f.a.InterfaceC0626a interfaceC0626a = aVar.b;
                ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams = aVar.c;
                if (interfaceC0626a.equals(f.a.InterfaceC0626a.C0627a.a)) {
                    return new g.a.InterfaceC0628a.b(clipsPlaylistsFolderLaunchParams);
                }
                if (interfaceC0626a instanceof f.a.InterfaceC0626a.b) {
                    return new g.a.InterfaceC0628a.c(new ClipsPlaylistNamingLaunchParams(((f.a.InterfaceC0626a.b) interfaceC0626a).a, "", clipsPlaylistsFolderLaunchParams.c, clipsPlaylistsFolderLaunchParams.d, 0, null, 48, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!(fVar2 instanceof f.b)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return g.a.InterfaceC0628a.C0629a.a;
    }
}

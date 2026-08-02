package com.vk.clips.playlists.folders.root;

import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.clips.playlists.folders.root.b;
import com.vk.clips.playlists.folders.root.f;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.g9e;
import xsna.lbe;
import xsna.wk50;

/* compiled from: ClipsPlaylistsFoldersRootFeature.kt */
/* loaded from: classes16.dex */
public final class c extends wk50<g, f, b, f> {
    public final ClipsPlaylistsFolderLaunchParams f;

    public c(ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams) {
        super(b.a.b, new e());
        this.f = clipsPlaylistsFolderLaunchParams;
    }

    @Override // xsna.wk50
    public final void N(f fVar, b bVar) {
        f fVar2 = fVar;
        b bVar2 = bVar;
        boolean z = bVar2 instanceof b.a;
        ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams = this.f;
        f.a.InterfaceC0626a.C0627a c0627a = f.a.InterfaceC0626a.C0627a.a;
        if (z) {
            a7f0.a.e(this, g9e.a, null, new lbe(this, 2), null, null, 13);
            T(new f.a(c0627a, clipsPlaylistsFolderLaunchParams));
            return;
        }
        boolean z2 = bVar2 instanceof b.c;
        f.b bVar3 = f.b.b;
        if (!z2) {
            if (bVar2 instanceof b.d) {
                T(bVar3);
                return;
            } else {
                if (!(bVar2 instanceof b.C0625b)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(new f.a(new f.a.InterfaceC0626a.b(((b.C0625b) bVar2).b), clipsPlaylistsFolderLaunchParams));
                return;
            }
        }
        if (!(fVar2 instanceof f.a)) {
            if (!fVar2.equals(f.c.b) && !fVar2.equals(bVar3)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            f.a.InterfaceC0626a interfaceC0626a = ((f.a) fVar2).b;
            if (interfaceC0626a.equals(c0627a)) {
                T(bVar3);
            } else if (!(interfaceC0626a instanceof f.a.InterfaceC0626a.b)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

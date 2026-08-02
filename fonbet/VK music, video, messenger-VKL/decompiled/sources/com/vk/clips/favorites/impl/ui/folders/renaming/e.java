package com.vk.clips.favorites.impl.ui.folders.renaming;

import com.vk.clips.favorites.impl.ui.folders.renaming.ClipsFavoritesFolderRenamingState;
import com.vk.clips.favorites.impl.ui.folders.renaming.d;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.j4e;
import xsna.o1e;

/* compiled from: ClipsFavoritesFolderRenamingReducer.kt */
/* loaded from: classes16.dex */
public final class e extends dm50<f, d, ClipsFavoritesFolderRenamingState> {
    public final j4e d;

    public e() {
        super(new ClipsFavoritesFolderRenamingState("", ClipsFavoritesFolderRenamingState.SaveState.None));
        this.d = new j4e();
    }

    @Override // xsna.dm50
    public final ClipsFavoritesFolderRenamingState c(ClipsFavoritesFolderRenamingState clipsFavoritesFolderRenamingState, d dVar) {
        ClipsFavoritesFolderRenamingState clipsFavoritesFolderRenamingState2 = clipsFavoritesFolderRenamingState;
        d dVar2 = dVar;
        if (dVar2 instanceof d.a) {
            String str = ((d.a) dVar2).b;
            if (str == null) {
                str = "";
            }
            return ClipsFavoritesFolderRenamingState.a(clipsFavoritesFolderRenamingState2, str, null, 6);
        }
        if (dVar2 instanceof d.c) {
            return ClipsFavoritesFolderRenamingState.a(clipsFavoritesFolderRenamingState2, ((d.c) dVar2).b, null, 6);
        }
        if (!(dVar2 instanceof d.b)) {
            throw new NoWhenBranchMatchedException();
        }
        d.b bVar = (d.b) dVar2;
        if (bVar instanceof d.b.C0618d) {
            return ClipsFavoritesFolderRenamingState.a(clipsFavoritesFolderRenamingState2, null, ClipsFavoritesFolderRenamingState.SaveState.Loading, 5);
        }
        if (bVar instanceof d.b.e) {
            return ClipsFavoritesFolderRenamingState.a(clipsFavoritesFolderRenamingState2, null, ClipsFavoritesFolderRenamingState.SaveState.Success, 5);
        }
        if (bVar instanceof d.b.C0617b) {
            return ClipsFavoritesFolderRenamingState.a(clipsFavoritesFolderRenamingState2, null, ClipsFavoritesFolderRenamingState.SaveState.Error, 5);
        }
        if (bVar instanceof d.b.c) {
            return ClipsFavoritesFolderRenamingState.a(clipsFavoritesFolderRenamingState2, null, ClipsFavoritesFolderRenamingState.SaveState.None, 5);
        }
        if (bVar instanceof d.b.a) {
            return ClipsFavoritesFolderRenamingState.a(clipsFavoritesFolderRenamingState2, null, ClipsFavoritesFolderRenamingState.SaveState.None, 5);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final f d() {
        return new f(e(new o1e(this, 1)));
    }

    @Override // xsna.dm50
    public final void h(ClipsFavoritesFolderRenamingState clipsFavoritesFolderRenamingState, f fVar) {
        f(fVar.a, clipsFavoritesFolderRenamingState);
    }
}

package com.vk.clips.favorites.impl.ui.folders.renaming;

import com.vk.clips.favorites.api.params.ClipsFavoritesFolderRenamingParams;
import com.vk.clips.favorites.impl.ui.folders.renaming.ClipsFavoritesFolderRenamingState;
import com.vk.clips.favorites.impl.ui.folders.renaming.a;
import com.vk.clips.favorites.impl.ui.folders.renaming.d;
import io.reactivex.rxjava3.core.x;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.c5e;
import xsna.epx;
import xsna.f4z;
import xsna.k4e;
import xsna.sf1;
import xsna.wk50;

/* compiled from: ClipsFavoritesFolderRenamingFeature.kt */
/* loaded from: classes16.dex */
public final class c extends wk50<f, ClipsFavoritesFolderRenamingState, a, d> {
    public final ClipsFavoritesFolderRenamingParams f;
    public final c5e g;
    public final f4z<k4e> h;

    public c(e eVar, ClipsFavoritesFolderRenamingParams clipsFavoritesFolderRenamingParams, c5e c5eVar) {
        super(a.C0613a.b, eVar);
        this.f = clipsFavoritesFolderRenamingParams;
        this.g = c5eVar;
        this.h = new f4z<>();
    }

    @Override // xsna.wk50
    public final void N(ClipsFavoritesFolderRenamingState clipsFavoritesFolderRenamingState, a aVar) {
        x h;
        String str;
        ClipsFavoritesFolderRenamingState clipsFavoritesFolderRenamingState2 = clipsFavoritesFolderRenamingState;
        a aVar2 = aVar;
        String str2 = clipsFavoritesFolderRenamingState2.b;
        boolean z = aVar2 instanceof a.C0613a;
        ClipsFavoritesFolderRenamingParams clipsFavoritesFolderRenamingParams = this.f;
        if (z) {
            if (clipsFavoritesFolderRenamingParams instanceof ClipsFavoritesFolderRenamingParams.CreateFolder) {
                str = null;
            } else {
                if (!(clipsFavoritesFolderRenamingParams instanceof ClipsFavoritesFolderRenamingParams.RenameFolder)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((ClipsFavoritesFolderRenamingParams.RenameFolder) clipsFavoritesFolderRenamingParams).e;
            }
            T(new d.a(str));
            return;
        }
        if (aVar2 instanceof a.d) {
            T(new d.c(((a.d) aVar2).b));
            return;
        }
        if (aVar2 instanceof a.b) {
            T(d.b.C0618d.b);
            boolean z2 = clipsFavoritesFolderRenamingParams instanceof ClipsFavoritesFolderRenamingParams.RenameFolder;
            c5e c5eVar = this.g;
            if (z2) {
                ClipsFavoritesFolderRenamingParams.RenameFolder renameFolder = (ClipsFavoritesFolderRenamingParams.RenameFolder) clipsFavoritesFolderRenamingParams;
                h = c5eVar.i(renameFolder.c, renameFolder.d, str2);
            } else {
                if (!(clipsFavoritesFolderRenamingParams instanceof ClipsFavoritesFolderRenamingParams.CreateFolder)) {
                    throw new NoWhenBranchMatchedException();
                }
                ClipsFavoritesFolderRenamingParams.CreateFolder createFolder = (ClipsFavoritesFolderRenamingParams.CreateFolder) clipsFavoritesFolderRenamingParams;
                h = c5eVar.h(createFolder.c, str2, createFolder.d);
            }
            a7f0.a.f(this, h, new com.vk.im.engine.internal.api_commands.messages.a(this, 20), new sf1(this, 26), 1);
            return;
        }
        if (!(aVar2 instanceof a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        a.c cVar = (a.c) aVar2;
        if (epx.f(cVar, a.c.C0614a.b)) {
            T(d.b.a.b);
        } else {
            if (!epx.f(cVar, a.c.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            T(d.b.c.b);
            if (clipsFavoritesFolderRenamingState2.c == ClipsFavoritesFolderRenamingState.SaveState.Success) {
                this.h.b(k4e.a.a);
            }
        }
    }
}

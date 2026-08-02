package com.vk.clips.favorites.impl.ui.folders.list;

import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListState;
import com.vk.clips.favorites.impl.ui.folders.list.c;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.b4e;
import xsna.c5g;
import xsna.dm50;
import xsna.epx;
import xsna.j5g;
import xsna.pl2;
import xsna.tl0;
import xsna.u2e;
import xsna.z3e;
import xsna.zj;

/* compiled from: ClipsFavoriteFoldersListReducer.kt */
/* loaded from: classes16.dex */
public final class d extends dm50<e, c, ClipsFavoriteFoldersListState> {
    public final z3e d;
    public final boolean e;

    public d(z3e z3eVar, boolean z) {
        super(ClipsFavoriteFoldersListState.b.b);
        this.d = z3eVar;
        this.e = z;
    }

    @Override // xsna.dm50
    public final ClipsFavoriteFoldersListState c(ClipsFavoriteFoldersListState clipsFavoriteFoldersListState, c cVar) {
        ClipsFavoriteFoldersListState clipsFavoriteFoldersListState2 = clipsFavoriteFoldersListState;
        c cVar2 = cVar;
        if (cVar2 instanceof c.b) {
            c.b bVar = (c.b) cVar2;
            if (!(clipsFavoriteFoldersListState2 instanceof ClipsFavoriteFoldersListState.Content)) {
                return clipsFavoriteFoldersListState2;
            }
            ClipsFavoriteFoldersListState.Content content = (ClipsFavoriteFoldersListState.Content) clipsFavoriteFoldersListState2;
            List<u2e> list = content.c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!epx.f(((u2e) obj).a, bVar.b)) {
                    arrayList.add(obj);
                }
            }
            return ClipsFavoriteFoldersListState.Content.a(content, null, arrayList, null, null, content.f - 1, 0, 45);
        }
        if (cVar2 instanceof c.a) {
            c.a aVar = (c.a) cVar2;
            if (!(clipsFavoriteFoldersListState2 instanceof ClipsFavoriteFoldersListState.Content)) {
                return clipsFavoriteFoldersListState2;
            }
            ClipsFavoriteFoldersListState.Content content2 = (ClipsFavoriteFoldersListState.Content) clipsFavoriteFoldersListState2;
            return ClipsFavoriteFoldersListState.Content.a(content2, null, j5g.u0(content2.c, Collections.singletonList(aVar.b)), null, null, content2.f + 1, 0, 45);
        }
        if (cVar2 instanceof c.C0600c) {
            c.C0600c c0600c = (c.C0600c) cVar2;
            if (!(clipsFavoriteFoldersListState2 instanceof ClipsFavoriteFoldersListState.Content)) {
                return clipsFavoriteFoldersListState2;
            }
            ClipsFavoriteFoldersListState.Content content3 = (ClipsFavoriteFoldersListState.Content) clipsFavoriteFoldersListState2;
            u2e u2eVar = content3.b;
            FavoriteFolderId favoriteFolderId = u2eVar.a;
            u2e u2eVar2 = c0600c.b;
            u2e u2eVar3 = epx.f(favoriteFolderId, u2eVar2.a) ? u2eVar2 : u2eVar;
            List<u2e> list2 = content3.c;
            ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
            for (u2e u2eVar4 : list2) {
                if (epx.f(u2eVar4.a, u2eVar2.a)) {
                    u2eVar4 = u2eVar2;
                }
                arrayList2.add(u2eVar4);
            }
            return ClipsFavoriteFoldersListState.Content.a(content3, u2eVar3, arrayList2, null, null, 0, 0, 60);
        }
        if (!(cVar2 instanceof c.d)) {
            throw new NoWhenBranchMatchedException();
        }
        c.d dVar = (c.d) cVar2;
        if (dVar instanceof c.d.f) {
            return ClipsFavoriteFoldersListState.b.b;
        }
        if (dVar instanceof c.d.C0601c) {
            return clipsFavoriteFoldersListState2 instanceof ClipsFavoriteFoldersListState.Content ? ClipsFavoriteFoldersListState.Content.a((ClipsFavoriteFoldersListState.Content) clipsFavoriteFoldersListState2, null, null, null, ClipsFavoriteFoldersListState.Content.LoadingState.LOADING_NEXT, 0, 0, 55) : clipsFavoriteFoldersListState2;
        }
        if (dVar instanceof c.d.e) {
            return clipsFavoriteFoldersListState2 instanceof ClipsFavoriteFoldersListState.Content ? ClipsFavoriteFoldersListState.Content.a((ClipsFavoriteFoldersListState.Content) clipsFavoriteFoldersListState2, null, null, null, ClipsFavoriteFoldersListState.Content.LoadingState.REFRESHING, 0, 0, 55) : clipsFavoriteFoldersListState2;
        }
        boolean z = dVar instanceof c.d.g;
        ClipsFavoriteFoldersListState.Content.a aVar2 = ClipsFavoriteFoldersListState.Content.a.C0595a.a;
        if (z) {
            c.d.g gVar = (c.d.g) dVar;
            u2e u2eVar5 = gVar.b;
            b4e b4eVar = gVar.c;
            ArrayList arrayList3 = b4eVar.a;
            String str = b4eVar.b;
            if (str != null) {
                aVar2 = new ClipsFavoriteFoldersListState.Content.a.b(str);
            }
            return new ClipsFavoriteFoldersListState.Content(u2eVar5, arrayList3, aVar2, ClipsFavoriteFoldersListState.Content.LoadingState.NONE, b4eVar.c, b4eVar.d);
        }
        if (!(dVar instanceof c.d.C0602d)) {
            if (dVar instanceof c.d.a) {
                return ClipsFavoriteFoldersListState.a.b;
            }
            if (dVar instanceof c.d.b) {
                return clipsFavoriteFoldersListState2 instanceof ClipsFavoriteFoldersListState.Content ? ClipsFavoriteFoldersListState.Content.a((ClipsFavoriteFoldersListState.Content) clipsFavoriteFoldersListState2, null, null, null, ClipsFavoriteFoldersListState.Content.LoadingState.ERROR_NEXT, 0, 0, 55) : clipsFavoriteFoldersListState2;
            }
            throw new NoWhenBranchMatchedException();
        }
        b4e b4eVar2 = ((c.d.C0602d) dVar).b;
        if (!(clipsFavoriteFoldersListState2 instanceof ClipsFavoriteFoldersListState.Content)) {
            return clipsFavoriteFoldersListState2;
        }
        ClipsFavoriteFoldersListState.Content content4 = (ClipsFavoriteFoldersListState.Content) clipsFavoriteFoldersListState2;
        ArrayList u0 = j5g.u0(b4eVar2.a, content4.c);
        String str2 = b4eVar2.b;
        if (str2 != null) {
            aVar2 = new ClipsFavoriteFoldersListState.Content.a.b(str2);
        }
        return ClipsFavoriteFoldersListState.Content.a(content4, null, u0, aVar2, ClipsFavoriteFoldersListState.Content.LoadingState.NONE, b4eVar2.c, b4eVar2.d, 1);
    }

    @Override // xsna.dm50
    public final e d() {
        return new e(e(new pl2(11)), e(new tl0(this, 29)), e(new zj(12)));
    }

    @Override // xsna.dm50
    public final void h(ClipsFavoriteFoldersListState clipsFavoriteFoldersListState, e eVar) {
        ClipsFavoriteFoldersListState clipsFavoriteFoldersListState2 = clipsFavoriteFoldersListState;
        e eVar2 = eVar;
        if (clipsFavoriteFoldersListState2 instanceof ClipsFavoriteFoldersListState.b) {
            f(eVar2.a, clipsFavoriteFoldersListState2);
        } else if (clipsFavoriteFoldersListState2 instanceof ClipsFavoriteFoldersListState.Content) {
            f(eVar2.b, clipsFavoriteFoldersListState2);
        } else if (clipsFavoriteFoldersListState2 instanceof ClipsFavoriteFoldersListState.a) {
            f(eVar2.c, clipsFavoriteFoldersListState2);
        }
    }
}

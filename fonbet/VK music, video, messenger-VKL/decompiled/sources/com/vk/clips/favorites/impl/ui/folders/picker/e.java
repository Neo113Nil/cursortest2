package com.vk.clips.favorites.impl.ui.folders.picker;

import com.vk.clips.favorites.api.params.ClipsFavoritesFoldersPickerParams;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerState;
import com.vk.clips.favorites.impl.ui.folders.picker.c;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.b4e;
import xsna.c5g;
import xsna.dm50;
import xsna.epx;
import xsna.izi0;
import xsna.j5g;
import xsna.l5;
import xsna.n4e;
import xsna.u2e;

/* compiled from: ClipsFavoritesFoldersPickerReducer.kt */
/* loaded from: classes16.dex */
public final class e extends dm50<f, c, ClipsFavoritesFoldersPickerState> {
    public final ClipsFavoritesFoldersPickerParams d;
    public final n4e e;

    public e(ClipsFavoritesFoldersPickerParams clipsFavoritesFoldersPickerParams, n4e n4eVar) {
        super(ClipsFavoritesFoldersPickerState.b.b);
        this.d = clipsFavoritesFoldersPickerParams;
        this.e = n4eVar;
    }

    @Override // xsna.dm50
    public final ClipsFavoritesFoldersPickerState c(ClipsFavoritesFoldersPickerState clipsFavoritesFoldersPickerState, c cVar) {
        LinkedHashSet f;
        ClipsFavoritesFoldersPickerState clipsFavoritesFoldersPickerState2 = clipsFavoritesFoldersPickerState;
        c cVar2 = cVar;
        boolean z = cVar2 instanceof c.d;
        ClipsFavoritesFoldersPickerState.Content.a aVar = ClipsFavoritesFoldersPickerState.Content.a.C0603a.a;
        if (z) {
            c.d dVar = (c.d) cVar2;
            if (dVar instanceof c.d.b) {
                return ClipsFavoritesFoldersPickerState.b.b;
            }
            if (dVar instanceof c.d.a) {
                return ClipsFavoritesFoldersPickerState.a.b;
            }
            if (!(dVar instanceof c.d.C0610c)) {
                throw new NoWhenBranchMatchedException();
            }
            ClipsFavoritesFoldersPickerState.BottomSheetVisibility bottomSheetVisibility = ClipsFavoritesFoldersPickerState.BottomSheetVisibility.VISIBLE;
            c.d.C0610c c0610c = (c.d.C0610c) dVar;
            b4e b4eVar = c0610c.d;
            u2e u2eVar = c0610c.b;
            List<u2e> list = c0610c.c;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((u2e) it.next()).a);
            }
            Set S0 = j5g.S0(arrayList);
            ArrayList i = i(b4eVar.a);
            String str = b4eVar.b;
            if (str != null) {
                aVar = new ClipsFavoritesFoldersPickerState.Content.a.b(str);
            }
            return new ClipsFavoritesFoldersPickerState.Content(bottomSheetVisibility, u2eVar, S0, i, aVar, ClipsFavoritesFoldersPickerState.Content.ListLoadingState.NONE, b4eVar.c, b4eVar.d, b4eVar.e);
        }
        if (cVar2 instanceof c.e) {
            c.e eVar = (c.e) cVar2;
            if (!(clipsFavoritesFoldersPickerState2 instanceof ClipsFavoritesFoldersPickerState.Content)) {
                return clipsFavoritesFoldersPickerState2;
            }
            if (eVar instanceof c.e.b) {
                return ClipsFavoritesFoldersPickerState.Content.a((ClipsFavoritesFoldersPickerState.Content) clipsFavoritesFoldersPickerState2, null, null, null, null, ClipsFavoritesFoldersPickerState.Content.ListLoadingState.LOADING, 0, 0, 0, 479);
            }
            if (!(eVar instanceof c.e.C0611c)) {
                if (eVar instanceof c.e.a) {
                    return ClipsFavoritesFoldersPickerState.Content.a((ClipsFavoritesFoldersPickerState.Content) clipsFavoritesFoldersPickerState2, null, null, null, null, ClipsFavoritesFoldersPickerState.Content.ListLoadingState.ERROR, 0, 0, 0, 479);
                }
                throw new NoWhenBranchMatchedException();
            }
            ClipsFavoritesFoldersPickerState.Content content = (ClipsFavoritesFoldersPickerState.Content) clipsFavoritesFoldersPickerState2;
            List<u2e> list2 = content.e;
            b4e b4eVar2 = ((c.e.C0611c) eVar).b;
            ArrayList u0 = j5g.u0(i(b4eVar2.a), list2);
            String str2 = b4eVar2.b;
            if (str2 != null) {
                aVar = new ClipsFavoritesFoldersPickerState.Content.a.b(str2);
            }
            return ClipsFavoritesFoldersPickerState.Content.a(content, null, null, u0, aVar, ClipsFavoritesFoldersPickerState.Content.ListLoadingState.NONE, b4eVar2.c, b4eVar2.d, b4eVar2.e, 7);
        }
        if (!(cVar2 instanceof c.b)) {
            if (cVar2 instanceof c.a) {
                c.a aVar2 = (c.a) cVar2;
                if (!(clipsFavoritesFoldersPickerState2 instanceof ClipsFavoritesFoldersPickerState.Content)) {
                    return clipsFavoritesFoldersPickerState2;
                }
                if (epx.f(aVar2, c.a.b.b)) {
                    return ClipsFavoritesFoldersPickerState.Content.a((ClipsFavoritesFoldersPickerState.Content) clipsFavoritesFoldersPickerState2, ClipsFavoritesFoldersPickerState.BottomSheetVisibility.VISIBLE, null, null, null, null, 0, 0, 0, 510);
                }
                if (epx.f(aVar2, c.a.C0607a.b)) {
                    return ClipsFavoritesFoldersPickerState.Content.a((ClipsFavoritesFoldersPickerState.Content) clipsFavoritesFoldersPickerState2, ClipsFavoritesFoldersPickerState.BottomSheetVisibility.HIDDEN, null, null, null, null, 0, 0, 0, 510);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!(cVar2 instanceof c.C0609c)) {
                throw new NoWhenBranchMatchedException();
            }
            c.C0609c c0609c = (c.C0609c) cVar2;
            if (!(clipsFavoritesFoldersPickerState2 instanceof ClipsFavoritesFoldersPickerState.Content)) {
                return clipsFavoritesFoldersPickerState2;
            }
            ClipsFavoritesFoldersPickerState.Content content2 = (ClipsFavoritesFoldersPickerState.Content) clipsFavoritesFoldersPickerState2;
            return ClipsFavoritesFoldersPickerState.Content.a(content2, null, null, j5g.u0(content2.e, Collections.singletonList(c0609c.b)), null, null, content2.h + 1, 0, 0, 439);
        }
        c.b bVar = (c.b) cVar2;
        if (!(clipsFavoritesFoldersPickerState2 instanceof ClipsFavoritesFoldersPickerState.Content)) {
            return clipsFavoritesFoldersPickerState2;
        }
        if (bVar instanceof c.b.a) {
            return ClipsFavoritesFoldersPickerState.Content.a((ClipsFavoritesFoldersPickerState.Content) clipsFavoritesFoldersPickerState2, null, EmptySet.b, null, null, null, 0, 0, 0, 507);
        }
        if (!(bVar instanceof c.b.C0608b)) {
            throw new NoWhenBranchMatchedException();
        }
        ClipsFavoritesFoldersPickerState.Content content3 = (ClipsFavoritesFoldersPickerState.Content) clipsFavoritesFoldersPickerState2;
        Set<FavoriteFolderId> set = content3.d;
        Set<FavoriteFolderId> set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            for (FavoriteFolderId favoriteFolderId : set2) {
                FavoriteFolderId favoriteFolderId2 = ((c.b.C0608b) bVar).c;
                if (epx.f(favoriteFolderId, favoriteFolderId2)) {
                    f = izi0.f(set, favoriteFolderId2);
                    break;
                }
            }
        }
        f = izi0.k(set, ((c.b.C0608b) bVar).c);
        return ClipsFavoritesFoldersPickerState.Content.a(content3, null, f, null, null, null, 0, 0, 0, 507);
    }

    @Override // xsna.dm50
    public final f d() {
        return new f(e(new l5(this, 24)));
    }

    @Override // xsna.dm50
    public final void h(ClipsFavoritesFoldersPickerState clipsFavoritesFoldersPickerState, f fVar) {
        f(fVar.a, clipsFavoritesFoldersPickerState);
    }

    public final ArrayList i(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            u2e u2eVar = (u2e) obj;
            boolean f = epx.f(u2eVar.a, FavoriteFolderId.Alias.AllClips.c);
            ClipsFavoritesFoldersPickerParams clipsFavoritesFoldersPickerParams = this.d;
            boolean z = (clipsFavoritesFoldersPickerParams instanceof ClipsFavoritesFoldersPickerParams.PickFolderToMoveVideos) && epx.f(u2eVar.a, ((ClipsFavoritesFoldersPickerParams.PickFolderToMoveVideos) clipsFavoritesFoldersPickerParams).d);
            if (!f && !z) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}

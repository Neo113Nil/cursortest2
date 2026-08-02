package com.vk.clips.favorites.impl.ui.folders.content.recycler;

import android.view.ViewGroup;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.recycler.ClipsFavoriteFolderContentListItemCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.c3e;
import xsna.g5g;
import xsna.hfz;
import xsna.p1u0;
import xsna.vfz;

/* compiled from: ClipsFavoriteFolderContentListClipDelegate.kt */
/* loaded from: classes16.dex */
public final class a extends p1u0<c3e> {
    public final ClipsFavoriteFolderContentListFragment.d a;
    public final int b = 3;

    public a(ClipsFavoriteFolderContentListFragment.d dVar) {
        this.a = dVar;
    }

    @Override // xsna.p1u0
    public final void a(vfz<c3e> vfzVar, c3e c3eVar, List list) {
        c3e c3eVar2 = c3eVar;
        if (list == null || !(!list.isEmpty())) {
            vfzVar.W5(c3eVar2);
            return;
        }
        b bVar = (b) vfzVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof Iterable)) {
                next = Collections.singletonList(next);
            }
            g5g.y((Iterable) next, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof ClipsFavoriteFolderContentListItemCallback.Payload) {
                arrayList2.add(next2);
            }
        }
        if (arrayList2.contains(ClipsFavoriteFolderContentListItemCallback.Payload.MULTI_SELECT_CHECKBOX_STATE)) {
            bVar.h6(c3eVar2.b);
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends c3e> b(ViewGroup viewGroup) {
        return new b(this.a, this.b, viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof c3e;
    }
}

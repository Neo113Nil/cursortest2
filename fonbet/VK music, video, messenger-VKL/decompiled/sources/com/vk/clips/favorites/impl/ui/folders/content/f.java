package com.vk.clips.favorites.impl.ui.folders.content;

import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState;
import com.vk.clips.favorites.impl.ui.folders.content.d;
import com.vk.dto.common.VideoFile;
import com.vk.movika.sdk.base.observable.k;
import com.vk.movika.sdk.base.observable.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.dm50;
import xsna.g3e;
import xsna.i3e;
import xsna.izi0;
import xsna.j3e;
import xsna.j5g;
import xsna.k3e;
import xsna.lb;
import xsna.mb;
import xsna.u2e;

/* compiled from: ClipsFavoriteFolderContentListReducer.kt */
/* loaded from: classes16.dex */
public final class f extends dm50<ClipsFavoriteFolderContentListViewState, d, ClipsFavoriteFolderContentListState> {
    public final c d;
    public final g3e e;
    public final k3e f;
    public final i3e g;

    public f(c cVar, g3e g3eVar, k3e k3eVar, i3e i3eVar) {
        super(new ClipsFavoriteFolderContentListState.b(cVar.a(), ClipsFavoriteFolderContentListState.c.a.a));
        this.d = cVar;
        this.e = g3eVar;
        this.f = k3eVar;
        this.g = i3eVar;
    }

    @Override // xsna.dm50
    public final ClipsFavoriteFolderContentListState c(ClipsFavoriteFolderContentListState clipsFavoriteFolderContentListState, d dVar) {
        ClipsFavoriteFolderContentListState.c bVar;
        ClipsFavoriteFolderContentListState clipsFavoriteFolderContentListState2 = clipsFavoriteFolderContentListState;
        d dVar2 = dVar;
        if (dVar2 instanceof d.c) {
            d.c cVar = (d.c) dVar2;
            if (cVar instanceof d.c.f) {
                return new ClipsFavoriteFolderContentListState.b(clipsFavoriteFolderContentListState2.getTitle(), clipsFavoriteFolderContentListState2.g());
            }
            if (cVar instanceof d.c.C0591c) {
                return clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.Content ? ClipsFavoriteFolderContentListState.Content.a((ClipsFavoriteFolderContentListState.Content) clipsFavoriteFolderContentListState2, null, null, null, null, ClipsFavoriteFolderContentListState.Content.LoadingState.LOADING_NEXT, 15) : clipsFavoriteFolderContentListState2;
            }
            if (cVar instanceof d.c.e) {
                return clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.Content ? ClipsFavoriteFolderContentListState.Content.a((ClipsFavoriteFolderContentListState.Content) clipsFavoriteFolderContentListState2, null, null, null, null, ClipsFavoriteFolderContentListState.Content.LoadingState.REFRESHING, 15) : clipsFavoriteFolderContentListState2;
            }
            boolean z = cVar instanceof d.c.g;
            ClipsFavoriteFolderContentListState.Content.a aVar = ClipsFavoriteFolderContentListState.Content.a.C0585a.a;
            if (z) {
                j3e j3eVar = ((d.c.g) cVar).b;
                List<VideoFile> list = j3eVar.a;
                String str = j3eVar.b;
                if (str != null) {
                    aVar = new ClipsFavoriteFolderContentListState.Content.a.b(str);
                }
                return new ClipsFavoriteFolderContentListState.Content(clipsFavoriteFolderContentListState2.getTitle(), clipsFavoriteFolderContentListState2.g(), list, aVar, ClipsFavoriteFolderContentListState.Content.LoadingState.NONE);
            }
            if (!(cVar instanceof d.c.C0592d)) {
                if (cVar instanceof d.c.a) {
                    return new ClipsFavoriteFolderContentListState.a(clipsFavoriteFolderContentListState2.getTitle(), clipsFavoriteFolderContentListState2.g());
                }
                if (cVar instanceof d.c.b) {
                    return clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.Content ? ClipsFavoriteFolderContentListState.Content.a((ClipsFavoriteFolderContentListState.Content) clipsFavoriteFolderContentListState2, null, null, null, null, ClipsFavoriteFolderContentListState.Content.LoadingState.ERROR_NEXT, 15) : clipsFavoriteFolderContentListState2;
                }
                throw new NoWhenBranchMatchedException();
            }
            j3e j3eVar2 = ((d.c.C0592d) cVar).b;
            if (!(clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.Content)) {
                return clipsFavoriteFolderContentListState2;
            }
            ClipsFavoriteFolderContentListState.Content content = (ClipsFavoriteFolderContentListState.Content) clipsFavoriteFolderContentListState2;
            ArrayList u0 = j5g.u0(j3eVar2.a, content.d);
            String str2 = j3eVar2.b;
            if (str2 != null) {
                aVar = new ClipsFavoriteFolderContentListState.Content.a.b(str2);
            }
            return ClipsFavoriteFolderContentListState.Content.a(content, null, null, u0, aVar, ClipsFavoriteFolderContentListState.Content.LoadingState.NONE, 3);
        }
        if (dVar2 instanceof d.InterfaceC0593d) {
            d.InterfaceC0593d interfaceC0593d = (d.InterfaceC0593d) dVar2;
            if ((interfaceC0593d instanceof d.InterfaceC0593d.C0594d) || (interfaceC0593d instanceof d.InterfaceC0593d.b)) {
                bVar = new ClipsFavoriteFolderContentListState.c.b(EmptySet.b);
            } else if (interfaceC0593d instanceof d.InterfaceC0593d.a) {
                bVar = ClipsFavoriteFolderContentListState.c.a.a;
            } else {
                if (!(interfaceC0593d instanceof d.InterfaceC0593d.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                d.InterfaceC0593d.c cVar2 = (d.InterfaceC0593d.c) interfaceC0593d;
                ClipsFavoriteFolderContentListState.c g = clipsFavoriteFolderContentListState2.g();
                if (g instanceof ClipsFavoriteFolderContentListState.c.b) {
                    Set<String> set = ((ClipsFavoriteFolderContentListState.c.b) g).a;
                    String str3 = cVar2.b;
                    bVar = set.contains(str3) ? new ClipsFavoriteFolderContentListState.c.b(izi0.f(set, str3)) : new ClipsFavoriteFolderContentListState.c.b(izi0.k(set, str3));
                } else {
                    bVar = clipsFavoriteFolderContentListState2.g();
                }
            }
            ClipsFavoriteFolderContentListState.c cVar3 = bVar;
            if (clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.b) {
                ClipsFavoriteFolderContentListState.b bVar2 = (ClipsFavoriteFolderContentListState.b) clipsFavoriteFolderContentListState2;
                String str4 = bVar2.b;
                bVar2.getClass();
                return new ClipsFavoriteFolderContentListState.b(str4, cVar3);
            }
            if (clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.Content) {
                return ClipsFavoriteFolderContentListState.Content.a((ClipsFavoriteFolderContentListState.Content) clipsFavoriteFolderContentListState2, null, cVar3, null, null, null, 29);
            }
            if (!(clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ClipsFavoriteFolderContentListState.a aVar2 = (ClipsFavoriteFolderContentListState.a) clipsFavoriteFolderContentListState2;
            String str5 = aVar2.b;
            aVar2.getClass();
            return new ClipsFavoriteFolderContentListState.a(str5, cVar3);
        }
        if (dVar2 instanceof d.b) {
            d.b bVar3 = (d.b) dVar2;
            if (!(clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.Content)) {
                return clipsFavoriteFolderContentListState2;
            }
            ClipsFavoriteFolderContentListState.Content content2 = (ClipsFavoriteFolderContentListState.Content) clipsFavoriteFolderContentListState2;
            List<VideoFile> list2 = content2.d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (!bVar3.b.contains(((VideoFile) obj).r1())) {
                    arrayList.add(obj);
                }
            }
            return ClipsFavoriteFolderContentListState.Content.a(content2, null, null, arrayList, null, null, 27);
        }
        if (!(dVar2 instanceof d.a)) {
            throw new NoWhenBranchMatchedException();
        }
        u2e u2eVar = ((d.a) dVar2).b;
        if (clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.b) {
            ClipsFavoriteFolderContentListState.b bVar4 = (ClipsFavoriteFolderContentListState.b) clipsFavoriteFolderContentListState2;
            String str6 = u2eVar.d;
            ClipsFavoriteFolderContentListState.c cVar4 = bVar4.c;
            bVar4.getClass();
            return new ClipsFavoriteFolderContentListState.b(str6, cVar4);
        }
        if (clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.Content) {
            return ClipsFavoriteFolderContentListState.Content.a((ClipsFavoriteFolderContentListState.Content) clipsFavoriteFolderContentListState2, u2eVar.d, null, null, null, null, 30);
        }
        if (!(clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ClipsFavoriteFolderContentListState.a aVar3 = (ClipsFavoriteFolderContentListState.a) clipsFavoriteFolderContentListState2;
        String str7 = u2eVar.d;
        ClipsFavoriteFolderContentListState.c cVar5 = aVar3.c;
        aVar3.getClass();
        return new ClipsFavoriteFolderContentListState.a(str7, cVar5);
    }

    @Override // xsna.dm50
    public final ClipsFavoriteFolderContentListViewState d() {
        return new ClipsFavoriteFolderContentListViewState(e(new com.vk.movika.sdk.base.observable.e(this, 25)), e(new lb(this, 23)), e(new k(this, 20)), e(new mb(this, 28)), e(new m(this, 26)));
    }

    @Override // xsna.dm50
    public final void h(ClipsFavoriteFolderContentListState clipsFavoriteFolderContentListState, ClipsFavoriteFolderContentListViewState clipsFavoriteFolderContentListViewState) {
        ClipsFavoriteFolderContentListState clipsFavoriteFolderContentListState2 = clipsFavoriteFolderContentListState;
        ClipsFavoriteFolderContentListViewState clipsFavoriteFolderContentListViewState2 = clipsFavoriteFolderContentListViewState;
        f(clipsFavoriteFolderContentListViewState2.a, clipsFavoriteFolderContentListState2);
        if (clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.b) {
            f(clipsFavoriteFolderContentListViewState2.b, clipsFavoriteFolderContentListState2);
            return;
        }
        if (!(clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.Content)) {
            if (!(clipsFavoriteFolderContentListState2 instanceof ClipsFavoriteFolderContentListState.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f(clipsFavoriteFolderContentListViewState2.e, clipsFavoriteFolderContentListState2);
        } else if (((ClipsFavoriteFolderContentListState.Content) clipsFavoriteFolderContentListState2).d.isEmpty()) {
            f(clipsFavoriteFolderContentListViewState2.d, clipsFavoriteFolderContentListState2);
        } else {
            f(clipsFavoriteFolderContentListViewState2.c, clipsFavoriteFolderContentListState2);
        }
    }
}

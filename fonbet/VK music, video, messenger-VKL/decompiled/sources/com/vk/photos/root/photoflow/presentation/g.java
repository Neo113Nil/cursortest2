package com.vk.photos.root.photoflow.presentation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.photos.root.photoflow.presentation.d;
import com.vk.photos.root.photoflow.presentation.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.cww;
import xsna.dm50;
import xsna.epx;
import xsna.izi0;
import xsna.s0e0;

/* compiled from: PhotoFlowReducer.kt */
/* loaded from: classes4.dex */
public final class g extends dm50<l, d, h> {
    public final UserId d;
    public final s0e0 e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(UserId userId, s0e0 s0e0Var) {
        super(new h(userId, true, true, new h.a(null, false, r6, null), false, r6, null, false, null, false));
        EmptySet emptySet = EmptySet.b;
        this.d = userId;
        this.e = s0e0Var;
    }

    @Override // xsna.dm50
    public final h c(h hVar, d dVar) {
        int i;
        h hVar2 = hVar;
        d dVar2 = dVar;
        Set<Integer> set = hVar2.g;
        h.a aVar = hVar2.e;
        if (dVar2 instanceof d.n) {
            return h.a(hVar2, ((d.n) dVar2).b, false, null, false, null, null, false, null, false, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT);
        }
        if (dVar2 instanceof d.c) {
            VKList<Photo> vKList = aVar.a;
            if (vKList == null) {
                vKList = new VKList<>();
            }
            d.c cVar = (d.c) dVar2;
            VKList<Photo> vKList2 = cVar.b;
            vKList.addAll(vKList2);
            vKList.o(vKList2.i());
            vKList.n(vKList2.j());
            return h.a(hVar2, false, !vKList2.isEmpty(), new h.a(vKList, cVar.c, aVar.c, null), false, null, null, false, null, false, 1009);
        }
        if (dVar2 instanceof d.h) {
            d.h hVar3 = (d.h) dVar2;
            return h.a(hVar2, false, !hVar3.b.isEmpty(), new h.a(hVar3.b, hVar3.c, EmptySet.b, null), false, null, null, false, null, false, 1009);
        }
        if (dVar2 instanceof d.k) {
            return h.a(hVar2, false, false, null, false, null, ((d.k) dVar2).b, false, null, false, 959);
        }
        if (dVar2 instanceof d.C1508d) {
            d.C1508d c1508d = (d.C1508d) dVar2;
            return h.a(hVar2, false, false, c1508d.b ? new h.a(null, false, aVar.c, c1508d.c) : aVar, false, null, null, false, null, false, 1009);
        }
        if (dVar2 instanceof d.e) {
            VKList vKList3 = new VKList();
            VKList<Photo> vKList4 = aVar.a;
            if (vKList4 != null) {
                ArrayList arrayList = new ArrayList();
                for (Photo photo : vKList4) {
                    if (!((d.e) dVar2).b.contains(Integer.valueOf(photo.c))) {
                        arrayList.add(photo);
                    }
                }
                vKList3.addAll(arrayList);
                vKList3.o(vKList4.i() - (vKList4.size() - vKList3.size()));
                vKList3.n(vKList4.j());
            }
            h.a a = h.a.a(aVar, vKList3, null, 14);
            Set g = izi0.g(set, ((d.e) dVar2).b);
            VKList<Photo> vKList5 = a.a;
            return h.a(hVar2, false, (vKList5 == null || vKList5.isEmpty()) ? false : true, a, false, g, null, false, null, false, 979);
        }
        if (dVar2 instanceof d.p) {
            return h.a(hVar2, false, false, null, false, null, null, false, Integer.valueOf(((d.p) dVar2).b), false, 767);
        }
        if (dVar2 instanceof d.o) {
            return h.a(hVar2, false, false, null, false, null, null, false, null, false, 767);
        }
        if (dVar2 instanceof d.a) {
            return h.a(hVar2, false, false, null, true, Collections.singleton(Integer.valueOf(((d.a) dVar2).b.c)), null, false, null, false, 975);
        }
        if (dVar2.equals(d.b.b)) {
            return h.a(hVar2, false, false, null, false, EmptySet.b, null, false, null, false, 975);
        }
        if (dVar2 instanceof d.j) {
            return h.a(hVar2, false, false, null, false, izi0.k(set, Integer.valueOf(((d.j) dVar2).b.c)), null, false, null, false, 991);
        }
        if (dVar2 instanceof d.l) {
            return h.a(hVar2, false, false, null, false, izi0.f(set, Integer.valueOf(((d.l) dVar2).b.c)), null, false, null, false, 991);
        }
        if (dVar2 instanceof d.m) {
            return h.a(hVar2, false, false, null, false, null, null, ((d.m) dVar2).b, null, false, 895);
        }
        if (dVar2 instanceof d.f) {
            return h.a(hVar2, false, false, h.a.a(aVar, null, izi0.j(aVar.c, ((d.f) dVar2).b), 11), false, null, null, false, null, false, 1015);
        }
        if (!(dVar2 instanceof d.g)) {
            if (dVar2 instanceof d.i) {
                return h.a(hVar2, false, false, null, false, null, null, false, null, ((d.i) dVar2).b, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            }
            throw new NoWhenBranchMatchedException();
        }
        Photo photo2 = ((d.g) dVar2).b;
        VKList<Photo> vKList6 = aVar.a;
        if (vKList6 == null || vKList6.isEmpty()) {
            return hVar2;
        }
        ListIterator<Photo> listIterator = vKList6.listIterator(vKList6.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            if (epx.f(listIterator.previous().O, Boolean.TRUE)) {
                i = listIterator.nextIndex();
                break;
            }
        }
        vKList6.remove(photo2);
        photo2.O = Boolean.TRUE;
        vKList6.add(i + 1, photo2);
        return h.a(hVar2, false, false, h.a.a(aVar, vKList6, null, 14), false, null, null, false, null, false, 1015);
    }

    @Override // xsna.dm50
    public final l d() {
        return new l(e(new cww(this, 28)));
    }

    @Override // xsna.dm50
    public final void h(h hVar, l lVar) {
        f(lVar.a, hVar);
    }
}

package com.vk.newsfeed.posting.geo_picker.presentation;

import android.location.Location;
import com.vk.core.util.NoLocation;
import com.vk.newsfeed.posting.geo_picker.presentation.PlacePickerState;
import com.vk.newsfeed.posting.geo_picker.presentation.g;
import com.vk.newsfeed.posting.geo_picker.presentation.i;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ara0;
import xsna.dm50;
import xsna.epx;
import xsna.ira0;
import xsna.lra0;
import xsna.qey;
import xsna.s3q0;
import xsna.xl50;
import xsna.yqa0;

/* compiled from: PlacePickerReducer.kt */
/* loaded from: classes4.dex */
public final class h extends dm50<j, g, PlacePickerState> {
    public final e d;

    public h(e eVar, PlacePickerState placePickerState) {
        super(placePickerState);
        this.d = eVar;
    }

    @Override // xsna.dm50, xsna.cm50
    public final void a(xl50 xl50Var) {
        i cVar;
        g gVar = (g) xl50Var;
        super.a(gVar);
        if (gVar instanceof g.e) {
            g.e eVar = (g.e) gVar;
            cVar = new i.b.a(eVar.c, eVar.d);
        } else if (gVar instanceof g.i) {
            g.i iVar = (g.i) gVar;
            cVar = new i.b.a(iVar.e, iVar.f);
        } else if (gVar instanceof g.C1416g) {
            g.C1416g c1416g = (g.C1416g) gVar;
            cVar = new i.b.a(c1416g.e, c1416g.f);
        } else if (!(gVar instanceof g.d)) {
            return;
        } else {
            cVar = new i.b.c(((g.d) gVar).b);
        }
        this.d.o1.b(cVar);
    }

    @Override // xsna.dm50
    public final PlacePickerState c(PlacePickerState placePickerState, g gVar) {
        PlacePickerState placePickerState2 = placePickerState;
        g gVar2 = gVar;
        Location location = placePickerState2.j;
        List<yqa0> list = placePickerState2.b;
        if (gVar2 instanceof g.C1416g) {
            g.C1416g c1416g = (g.C1416g) gVar2;
            List<yqa0> list2 = c1416g.d;
            lra0 lra0Var = new lra0();
            ArrayList arrayList = new ArrayList();
            arrayList.add(lra0Var);
            arrayList.addAll(list2);
            return PlacePickerState.a(placePickerState2, c1416g.d, arrayList, c1416g.e, c1416g.b, c1416g.g ? PlacePickerState.LoadingState.NEED_PERMISSION : PlacePickerState.LoadingState.IDLE, list2.isEmpty(), c1416g.c, false, false, true, null, 11272);
        }
        if (gVar2 instanceof g.i) {
            g.i iVar = (g.i) gVar2;
            ArrayList arrayList2 = iVar.d;
            lra0 lra0Var2 = new lra0();
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(lra0Var2);
            arrayList3.addAll(arrayList2);
            return PlacePickerState.a(placePickerState2, iVar.d, arrayList3, iVar.e, iVar.b, PlacePickerState.LoadingState.IDLE, arrayList2.isEmpty(), iVar.c, false, false, true, null, 11272);
        }
        if (gVar2 instanceof g.j) {
            lra0 lra0Var3 = new lra0();
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(lra0Var3);
            arrayList4.addAll(list);
            arrayList4.add(new ara0());
            return PlacePickerState.a(placePickerState2, null, arrayList4, 0, null, null, false, null, false, false, false, null, 12285);
        }
        if (gVar2 instanceof g.b) {
            lra0 lra0Var4 = new lra0();
            ArrayList arrayList5 = new ArrayList();
            arrayList5.add(lra0Var4);
            arrayList5.addAll(list);
            return PlacePickerState.a(placePickerState2, null, arrayList5, 0, null, null, false, null, false, false, false, null, 16381);
        }
        if (gVar2 instanceof g.k) {
            lra0 lra0Var5 = new lra0();
            ArrayList arrayList6 = new ArrayList();
            arrayList6.add(lra0Var5);
            arrayList6.addAll(list);
            arrayList6.add(new ira0());
            return PlacePickerState.a(placePickerState2, null, arrayList6, 0, null, null, false, null, false, false, false, null, 16381);
        }
        if (gVar2 instanceof g.e) {
            g.e eVar = (g.e) gVar2;
            ArrayList arrayList7 = eVar.b;
            ArrayList arrayList8 = new ArrayList(list);
            arrayList8.addAll(arrayList7);
            ArrayList arrayList9 = new ArrayList(placePickerState2.c);
            arrayList9.addAll(arrayList7);
            s3q0 s3q0Var = s3q0.a;
            return PlacePickerState.a(placePickerState2, arrayList8, arrayList9, eVar.c, null, PlacePickerState.LoadingState.IDLE, false, null, false, false, false, null, 12248);
        }
        if (gVar2 instanceof g.d) {
            return PlacePickerState.a(placePickerState2, null, null, 0, null, ((g.d) gVar2).b, false, null, false, false, false, null, 12255);
        }
        if (gVar2 instanceof g.c) {
            return PlacePickerState.a(placePickerState2, null, null, 0, null, PlacePickerState.LoadingState.LOADING, false, null, false, false, false, null, 12255);
        }
        if (gVar2 instanceof g.a) {
            return PlacePickerState.a(placePickerState2, EmptyList.b, null, 0, null, PlacePickerState.LoadingState.ERROR, false, null, false, false, false, null, 12254);
        }
        if (gVar2 instanceof g.f) {
            g.f fVar = (g.f) gVar2;
            boolean z = fVar.b;
            boolean z2 = fVar.c;
            if (epx.f(location, NoLocation.b)) {
                location = null;
            }
            return PlacePickerState.a(placePickerState2, null, null, 0, null, null, false, location, z, z2, false, null, 12799);
        }
        if (gVar2 instanceof g.h) {
            return PlacePickerState.a(placePickerState2, null, null, 0, null, null, false, null, false, false, false, null, 16367);
        }
        if (!(gVar2 instanceof g.l)) {
            throw new NoWhenBranchMatchedException();
        }
        g.l lVar = (g.l) gVar2;
        if (lVar instanceof g.l.a) {
            return PlacePickerState.a(placePickerState2, null, null, 0, null, null, false, null, false, false, false, PickerTechMetrics.a(placePickerState2.n, 0L, Long.valueOf(((g.l.a) lVar).b), null, 5), 8191);
        }
        if (lVar instanceof g.l.c) {
            return PlacePickerState.a(placePickerState2, null, null, 0, null, null, false, null, false, false, false, PickerTechMetrics.a(placePickerState2.n, ((g.l.c) lVar).b, null, null, 6), 8191);
        }
        if (lVar instanceof g.l.b) {
            return PlacePickerState.a(placePickerState2, null, null, 0, null, null, false, null, false, false, false, PickerTechMetrics.a(placePickerState2.n, 0L, null, Long.valueOf(((g.l.b) lVar).b), 3), 8191);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final j d() {
        return new j(e(new qey(22)));
    }

    @Override // xsna.dm50
    public final void h(PlacePickerState placePickerState, j jVar) {
        f(jVar.a, placePickerState);
    }
}

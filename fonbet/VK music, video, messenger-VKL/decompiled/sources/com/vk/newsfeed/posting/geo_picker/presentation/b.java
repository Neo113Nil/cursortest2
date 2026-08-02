package com.vk.newsfeed.posting.geo_picker.presentation;

import com.vk.newsfeed.posting.geo_picker.presentation.a;
import com.vk.newsfeed.posting.geo_picker.presentation.g;
import com.vk.newsfeed.posting.geo_picker.presentation.i;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import kotlin.NoWhenBranchMatchedException;
import xsna.dra0;
import xsna.epx;
import xsna.f4z;
import xsna.izs;
import xsna.juq;
import xsna.mra0;
import xsna.nra0;
import xsna.ora0;
import xsna.pra0;
import xsna.qra0;
import xsna.rqa0;
import xsna.s3q0;
import xsna.sqa0;
import xsna.tqa0;
import xsna.wj50;
import xsna.wk50;
import xsna.xd40;
import xsna.xqa0;

/* compiled from: PlacePickerFeature.kt */
/* loaded from: classes4.dex */
public final class b extends wk50<j, PlacePickerState, com.vk.newsfeed.posting.geo_picker.presentation.a, g> implements tqa0 {
    public final izs<Boolean, s3q0> f;
    public final wj50<i> g;
    public final a h;
    public final dra0 i;
    public final k j;

    /* compiled from: PlacePickerFeature.kt */
    public static final class a extends juq<g, com.vk.newsfeed.posting.geo_picker.presentation.a, i> {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // xsna.juq
        public final void a(g gVar) {
            this.a.T(gVar);
        }

        public final void b(Object obj) {
            this.a.U((i) obj);
        }
    }

    public b(xqa0 xqa0Var, h hVar, a.InterfaceC1406a.C1407a c1407a, xd40 xd40Var, f4z f4zVar) {
        super(c1407a, hVar);
        this.f = xd40Var;
        this.g = f4zVar;
        a aVar = new a(this);
        this.h = aVar;
        this.i = new dra0(aVar, xqa0Var);
        this.j = new k(aVar);
    }

    @Override // xsna.wk50
    public final void N(PlacePickerState placePickerState, com.vk.newsfeed.posting.geo_picker.presentation.a aVar) {
        PlacePickerState placePickerState2 = placePickerState;
        com.vk.newsfeed.posting.geo_picker.presentation.a aVar2 = aVar;
        PickerTechMetrics pickerTechMetrics = placePickerState2.n;
        boolean z = aVar2 instanceof a.InterfaceC1406a;
        dra0 dra0Var = this.i;
        if (z) {
            dra0Var.a(placePickerState2, (a.InterfaceC1406a) aVar2);
            return;
        }
        if (aVar2 instanceof a.b) {
            a.b bVar = (a.b) aVar2;
            if (!(bVar instanceof a.b.C1409b)) {
                if (!(bVar instanceof a.b.C1408a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.g.b(nra0.a);
                return;
            }
            a.b.C1409b c1409b = (a.b.C1409b) bVar;
            boolean z2 = c1409b.c;
            boolean z3 = c1409b.b;
            boolean z4 = false;
            boolean z5 = (z3 || z2) ? false : true;
            if (!placePickerState2.b() && z5) {
                z4 = true;
            }
            T(new g.f(z3, z2));
            izs<Boolean, s3q0> izsVar = this.f;
            if (izsVar != null) {
                izsVar.invoke(Boolean.valueOf(z5));
            }
            if (z4) {
                yi(a.InterfaceC1406a.c.b);
                return;
            }
            return;
        }
        if (aVar2 instanceof a.c) {
            a.c cVar = (a.c) aVar2;
            if (cVar instanceof a.c.C1410a) {
                String str = placePickerState2.e;
                String str2 = ((a.c.C1410a) cVar).b;
                if (epx.f(str, str2)) {
                    return;
                }
                dra0Var.a(placePickerState2, new a.InterfaceC1406a.f(str2));
                return;
            }
            if (epx.f(cVar, a.c.b.b)) {
                U(mra0.a);
                return;
            } else {
                if (!(cVar instanceof a.c.C1411c)) {
                    throw new NoWhenBranchMatchedException();
                }
                U(new ora0());
                return;
            }
        }
        if (!(aVar2 instanceof a.d)) {
            if (aVar2 instanceof rqa0) {
                U(new i.a.C1417a(pickerTechMetrics));
                return;
            } else {
                if (!(aVar2 instanceof sqa0)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.h.a.U(new i.a.b(((sqa0) aVar2).b, pickerTechMetrics));
                return;
            }
        }
        a.d dVar = (a.d) aVar2;
        a aVar3 = this.j.a;
        if (dVar instanceof a.d.C1413d) {
            aVar3.b(pra0.a);
            return;
        }
        if (dVar instanceof a.d.C1412a) {
            aVar3.a(new g.l.a(((a.d.C1412a) dVar).b));
        } else if (dVar instanceof a.d.b) {
            aVar3.a(new g.l.b(((a.d.b) dVar).b));
        } else {
            if (!(dVar instanceof a.d.c)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar3.b(new qra0(pickerTechMetrics));
        }
    }

    public final void U(i iVar) {
        this.g.b(iVar);
    }

    @Override // xsna.tqa0
    public final void yi(com.vk.newsfeed.posting.geo_picker.presentation.a aVar) {
        C(aVar);
    }
}

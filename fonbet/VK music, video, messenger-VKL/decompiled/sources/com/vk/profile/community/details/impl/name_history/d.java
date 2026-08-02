package com.vk.profile.community.details.impl.name_history;

import com.vk.movika.sdk.base.observable.i;
import com.vk.profile.community.details.impl.name_history.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.c5g;
import xsna.dm50;
import xsna.epx;
import xsna.i8;
import xsna.j5g;
import xsna.j60;
import xsna.pah;
import xsna.rah;
import xsna.uah;
import xsna.wah;

/* compiled from: CommunityNameHistoryReducer.kt */
/* loaded from: classes5.dex */
public final class d extends dm50<e, c, wah> {
    @Override // xsna.dm50
    public final wah c(wah wahVar, c cVar) {
        wah wahVar2 = wahVar;
        c cVar2 = cVar;
        List<uah> list = wahVar2.f;
        if (cVar2 instanceof c.a) {
            c.a aVar = (c.a) cVar2;
            if (aVar instanceof c.a.C1556a) {
                return wah.a(wahVar2, false, null, ((c.a.C1556a) aVar).b, false, null, 26);
            }
            if (epx.f(aVar, c.a.b.b)) {
                return wah.a(wahVar2, true, null, null, false, null, 26);
            }
            if (!(aVar instanceof c.a.C1557c)) {
                throw new NoWhenBranchMatchedException();
            }
            pah pahVar = ((c.a.C1557c) aVar).b;
            String str = pahVar.a;
            List<uah> list2 = list;
            ArrayList<rah> arrayList = pahVar.b;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            for (rah rahVar : arrayList) {
                arrayList2.add(new uah(rahVar.b, rahVar.c, rahVar.a));
            }
            return wah.a(wahVar2, false, str, null, false, j5g.u0(arrayList2, list2), 12);
        }
        if (cVar2 instanceof c.b) {
            c.b bVar = (c.b) cVar2;
            if (bVar instanceof c.b.a) {
                ((c.b.a) bVar).getClass();
                return wah.a(wahVar2, false, null, null, false, null, 26);
            }
            if (epx.f(bVar, c.b.C1558b.b)) {
                return wah.a(wahVar2, true, null, null, false, null, 26);
            }
            if (!(bVar instanceof c.b.C1559c)) {
                throw new NoWhenBranchMatchedException();
            }
            ((c.b.C1559c) bVar).getClass();
            throw null;
        }
        if (!(cVar2 instanceof c.AbstractC1560c)) {
            throw new NoWhenBranchMatchedException();
        }
        c.AbstractC1560c abstractC1560c = (c.AbstractC1560c) cVar2;
        if (abstractC1560c instanceof c.AbstractC1560c.a) {
            return wah.a(wahVar2, false, null, ((c.AbstractC1560c.a) abstractC1560c).b, false, null, 19);
        }
        if (epx.f(abstractC1560c, c.AbstractC1560c.b.b)) {
            return wah.a(wahVar2, false, null, null, true, null, 19);
        }
        if (!(abstractC1560c instanceof c.AbstractC1560c.C1561c)) {
            throw new NoWhenBranchMatchedException();
        }
        pah pahVar2 = ((c.AbstractC1560c.C1561c) abstractC1560c).b;
        ArrayList<rah> arrayList3 = pahVar2.b;
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        for (rah rahVar2 : arrayList3) {
            arrayList4.add(new uah(rahVar2.b, rahVar2.c, rahVar2.a));
        }
        return wah.a(wahVar2, false, pahVar2.a, null, false, arrayList4, 5);
    }

    @Override // xsna.dm50
    public final e d() {
        return new e(e(new i8(25)), e(new i(19)), e(new j60(14)));
    }

    @Override // xsna.dm50
    public final void h(wah wahVar, e eVar) {
        wah wahVar2 = wahVar;
        e eVar2 = eVar;
        if (wahVar2.b) {
            f(eVar2.a, wahVar2);
        } else if (wahVar2.d != null) {
            f(eVar2.c, wahVar2);
        } else {
            f(eVar2.b, wahVar2);
        }
    }
}

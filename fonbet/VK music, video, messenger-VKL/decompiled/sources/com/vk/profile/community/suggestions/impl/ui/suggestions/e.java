package com.vk.profile.community.suggestions.impl.ui.suggestions;

import com.vk.profile.community.suggestions.impl.ui.suggestions.d;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.i3i;
import xsna.j5g;
import xsna.rdi;
import xsna.xx0;
import xsna.ztg;

/* compiled from: CommunitySuggestionsReducer.kt */
/* loaded from: classes5.dex */
public final class e extends dm50<CommunitySuggestionsViewState, d, ztg> {
    @Override // xsna.dm50
    public final ztg c(ztg ztgVar, d dVar) {
        ztg ztgVar2 = ztgVar;
        d dVar2 = dVar;
        List<i3i> list = ztgVar2.d;
        if (dVar2 instanceof d.a) {
            d.a aVar = (d.a) dVar2;
            return ztg.a(ztgVar2, false, j5g.u0(aVar.b, list), aVar.c, null, null, 0, 113);
        }
        if (dVar2 instanceof d.c) {
            d.c cVar = (d.c) dVar2;
            return ztg.a(ztgVar2, false, cVar.b, cVar.c, null, cVar.d, cVar.e, 17);
        }
        if (dVar2.equals(d.C1637d.b)) {
            return ztg.a(ztgVar2, true, null, null, null, null, 0, 109);
        }
        if (dVar2 instanceof d.e) {
            d.e eVar = (d.e) dVar2;
            return ztg.a(ztgVar2, false, rdi.I(eVar.c, eVar.b, list), null, null, null, 0, 123);
        }
        if (dVar2 instanceof d.b) {
            return ztg.a(ztgVar2, false, null, null, ((d.b) dVar2).b, null, 0, 109);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final CommunitySuggestionsViewState d() {
        return new CommunitySuggestionsViewState(e(new xx0(21)));
    }

    @Override // xsna.dm50
    public final void h(ztg ztgVar, CommunitySuggestionsViewState communitySuggestionsViewState) {
        f(communitySuggestionsViewState.a, ztgVar);
    }
}

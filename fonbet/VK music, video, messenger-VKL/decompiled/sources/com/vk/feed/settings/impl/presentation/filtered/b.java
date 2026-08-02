package com.vk.feed.settings.impl.presentation.filtered;

import com.vk.feed.settings.api.domain.model.FilteredSourceType;
import com.vk.feed.settings.impl.presentation.filtered.a;
import com.vk.feed.settings.impl.presentation.filtered.c;
import com.vk.feed.settings.impl.presentation.filtered.e;
import java.util.EnumMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.af50;
import xsna.bqs;
import xsna.cj60;
import xsna.f4z;
import xsna.fz60;
import xsna.o7y;
import xsna.ut30;
import xsna.wk50;

/* compiled from: NewsfeedFilteredSourcesFeature.kt */
/* loaded from: classes18.dex */
public final class b extends wk50<f, cj60, a, c> {
    public final fz60 f;
    public final f4z g;

    public b(fz60 fz60Var, d dVar) {
        super(a.C1057a.b, dVar);
        this.f = fz60Var;
        this.g = new f4z();
    }

    @Override // xsna.wk50
    public final void N(cj60 cj60Var, a aVar) {
        a aVar2 = aVar;
        Map<FilteredSourceType, Integer> map = cj60Var.b;
        if (aVar2.equals(a.C1057a.b)) {
            T(c.b.b);
            this.g.b(e.a.b.a);
            this.e.b(this.f.d().subscribe(new bqs(new af50(this, 4), 11), new o7y(new ut30(this, 6), 6)));
            return;
        }
        if (!(aVar2 instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a.b bVar = (a.b) aVar2;
        FilteredSourceType filteredSourceType = bVar.b;
        if (map.containsKey(filteredSourceType)) {
            EnumMap enumMap = new EnumMap(map);
            enumMap.put((EnumMap) filteredSourceType, (FilteredSourceType) Integer.valueOf(bVar.c));
            T(new c.C1058c(enumMap));
        }
    }
}

package com.vk.superapp.api.dto.geo.matrix.serializers;

import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.internal.bind.TreeTypeAdapter;
import java.util.Iterator;
import xsna.b9y;
import xsna.cze0;
import xsna.tay;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;

/* compiled from: ReachabilityMatrixSerializer.kt */
/* loaded from: classes6.dex */
public final class ReachabilityMatrixSerializer implements uay<cze0> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.uay
    public final b9y b(Object obj, tay tayVar) {
        x9y x9yVar = new x9y();
        TreeTypeAdapter.a aVar = (TreeTypeAdapter.a) tayVar;
        x9y h = aVar.b(null).h();
        b9y b = aVar.b(null);
        Iterator it = ((LinkedTreeMap.c) h.b.keySet()).iterator();
        while (((LinkedTreeMap.d) it).hasNext()) {
            String str = (String) ((LinkedTreeMap.c.a) it).a().g;
            x9yVar.l(h.q(str), str);
        }
        b.getClass();
        if (!(b instanceof u9y)) {
            x9y h2 = b.h();
            Iterator it2 = ((LinkedTreeMap.c) h2.h().b.keySet()).iterator();
            while (((LinkedTreeMap.d) it2).hasNext()) {
                String str2 = (String) ((LinkedTreeMap.c.a) it2).a().g;
                x9yVar.l(h2.q(str2), str2);
            }
        }
        return x9yVar;
    }
}

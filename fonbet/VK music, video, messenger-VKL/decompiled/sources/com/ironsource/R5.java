package com.ironsource;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import xsna.c5g;
import xsna.go9;
import xsna.j5g;
import xsna.jgp;
import xsna.on00;

/* loaded from: classes13.dex */
public final class R5 {
    public static final R5 a = new R5();
    public static final String b = "ext_";

    private R5() {
    }

    public final Map<String, String> a(Bundle bundle) {
        Set<String> keySet = bundle != null ? bundle.keySet() : null;
        if (keySet == null) {
            return jgp.b;
        }
        int e = on00.e(c5g.u(keySet, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (String str : keySet) {
            String b2 = go9.b(b, str);
            Object obj = bundle.get(str);
            Pair pair = new Pair(b2, obj instanceof Iterable ? j5g.g0((Iterable) obj, ", ", null, null, 0, null, 62) : obj == null ? null : obj.toString());
            linkedHashMap.put(pair.i(), pair.j());
        }
        return linkedHashMap;
    }
}

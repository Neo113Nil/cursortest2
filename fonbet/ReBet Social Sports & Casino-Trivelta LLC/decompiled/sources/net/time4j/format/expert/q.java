package net.time4j.format.expert;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class q extends HashMap {
    private static final long serialVersionUID = 1245025551222311435L;

    public q(Map map) {
        super(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object put(oi.p pVar, Object obj) {
        Object put = super.put(pVar, obj);
        if (pVar == null || put == null || put.equals(obj)) {
            return put;
        }
        throw new C5707a(pVar);
    }
}

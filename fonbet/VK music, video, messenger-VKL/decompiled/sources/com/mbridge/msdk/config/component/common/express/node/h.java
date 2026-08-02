package com.mbridge.msdk.config.component.common.express.node;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MapNode.java */
/* loaded from: classes13.dex */
public class h extends d {
    List<d> a;

    public h(List<d> list) {
        this.a = list;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        HashMap hashMap = new HashMap();
        Iterator<d> it = this.a.iterator();
        while (it.hasNext()) {
            Object a = it.next().a(dVar, eVar, aVar);
            hashMap.putAll(a instanceof Map ? (HashMap) a : new HashMap());
        }
        return hashMap;
    }
}

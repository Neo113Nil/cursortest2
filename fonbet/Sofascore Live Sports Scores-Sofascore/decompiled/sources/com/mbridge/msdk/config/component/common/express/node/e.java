package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class e extends d {
    d a;
    String b;
    List<d> c;

    public e(d dVar, String str, List<d> list) {
        this.a = dVar;
        this.b = str;
        this.c = list;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (this.c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean contains = Arrays.asList(com.mbridge.msdk.config.component.common.util.c.c("876"), com.mbridge.msdk.config.component.common.util.c.c("877"), com.mbridge.msdk.config.component.common.util.c.c("878")).contains(this.b);
        List<d> list = this.c;
        if (contains) {
            arrayList.add(new com.mbridge.msdk.config.component.common.express.operator.parts.b(dVar, eVar, list.get(0), aVar));
            for (int i = 1; i < this.c.size(); i++) {
                arrayList.add(this.c.get(i).a(dVar, eVar, aVar));
            }
        } else {
            Iterator<d> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(dVar, eVar, aVar));
            }
        }
        return dVar.a(this.a.a(dVar, eVar, aVar), arrayList, this.b, aVar);
    }
}

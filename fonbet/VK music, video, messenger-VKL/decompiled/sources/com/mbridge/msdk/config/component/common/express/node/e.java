package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: FunctionCallNode.java */
/* loaded from: classes13.dex */
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
        if (Arrays.asList(com.mbridge.msdk.config.component.common.util.c.c("876"), com.mbridge.msdk.config.component.common.util.c.c("877"), com.mbridge.msdk.config.component.common.util.c.c("878")).contains(this.b)) {
            arrayList.add(new com.mbridge.msdk.config.component.common.express.operator.parts.b(dVar, eVar, this.c.get(0), aVar));
            for (int i = 1; i < this.c.size(); i++) {
                arrayList.add(this.c.get(i).a(dVar, eVar, aVar));
            }
        } else {
            Iterator<d> it = this.c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(dVar, eVar, aVar));
            }
        }
        return dVar.a(this.a.a(dVar, eVar, aVar), arrayList, this.b, aVar);
    }
}

package com.mbridge.msdk.config.component.common.express.node;

import xsna.y57;

/* compiled from: BinaryOpNode.java */
/* loaded from: classes13.dex */
public class c extends d {
    String a;
    d b;
    d c;

    public c(String str, d dVar, d dVar2) {
        this.a = str;
        this.b = dVar;
        this.c = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object a = this.b.a(dVar, eVar, aVar);
        Object a2 = this.c.a(dVar, eVar, aVar);
        if (eVar != com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            return dVar.a(a, y57.b(a2), this.a, aVar);
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
        if (!(a instanceof com.mbridge.msdk.config.component.common.express.entities.a)) {
            return null;
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar3 = (com.mbridge.msdk.config.component.common.express.entities.a) a;
        String a3 = aVar3.a();
        Object a4 = dVar.a(aVar3, y57.b(a2), this.a, aVar);
        aVar2.a(a3);
        aVar2.a(a4);
        return aVar2;
    }
}

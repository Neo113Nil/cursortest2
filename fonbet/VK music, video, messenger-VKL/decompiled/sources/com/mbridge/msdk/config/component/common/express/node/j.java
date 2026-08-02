package com.mbridge.msdk.config.component.common.express.node;

import java.util.Map;

/* compiled from: propertiesNode.java */
/* loaded from: classes13.dex */
public class j extends d {
    d a;
    String b;

    public j(d dVar, String str) {
        this.a = dVar;
        this.b = str;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (eVar == com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
            com.mbridge.msdk.config.component.common.express.entities.a aVar3 = (com.mbridge.msdk.config.component.common.express.entities.a) this.a.a(dVar, eVar, aVar);
            aVar2.a(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) aVar3.b()).b((Object) aVar3.a()));
            aVar2.a(this.b);
            return aVar2;
        }
        Object a = this.a.a(dVar, eVar, aVar);
        if (a instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            return ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) a).b((Object) this.b);
        }
        if (a instanceof Map) {
            return ((Map) a).get(this.b);
        }
        return null;
    }
}

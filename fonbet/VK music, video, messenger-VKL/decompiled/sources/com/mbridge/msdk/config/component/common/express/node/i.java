package com.mbridge.msdk.config.component.common.express.node;

import xsna.qoy;

/* compiled from: ValueNode.java */
/* loaded from: classes13.dex */
public class i extends d {
    String a;

    public i(String str) {
        this.a = str;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object c;
        if (this.a.startsWith("$")) {
            c = com.mbridge.msdk.config.component.common.express.c.a(this.a, aVar);
        } else if (this.a.startsWith("\\") && this.a.endsWith("\\\"")) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a.substring(1, r2.length() - 2));
            sb.append("\"");
            c = sb.toString();
        } else {
            c = (this.a.startsWith("\"") && this.a.endsWith("\"")) ? qoy.c(1, 1, this.a) : this.a;
        }
        if (eVar != com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            return c;
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
        aVar2.a(aVar);
        aVar2.a(this.a.substring(1));
        return aVar2;
    }
}

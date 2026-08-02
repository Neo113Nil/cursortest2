package com.mbridge.msdk.config.component.common.express.node;

import defpackage.wv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class i extends d {
    String a;

    public i(String str) {
        this.a = str;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object h;
        boolean startsWith = this.a.startsWith("$");
        String str = this.a;
        if (startsWith) {
            h = com.mbridge.msdk.config.component.common.express.c.a(str, aVar);
        } else if (str.startsWith("\\") && this.a.endsWith("\\\"")) {
            h = this.a.substring(1, r4.length() - 2).concat("\"");
        } else {
            h = (this.a.startsWith("\"") && this.a.endsWith("\"")) ? wv8.h(1, 1, this.a) : this.a;
        }
        if (eVar != com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            return h;
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
        aVar2.a(aVar);
        aVar2.a(this.a.substring(1));
        return aVar2;
    }
}

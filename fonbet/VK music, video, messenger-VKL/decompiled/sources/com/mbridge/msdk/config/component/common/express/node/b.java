package com.mbridge.msdk.config.component.common.express.node;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import xsna.cqi;
import xsna.y57;

/* compiled from: AssignmentNode.java */
/* loaded from: classes13.dex */
public class b extends d {
    private static final Set<String> d;
    String a;
    d b;
    d c;

    static {
        Object[] objArr = {"=", "+=", "-=", "*=", "/=", "%="};
        HashSet hashSet = new HashSet(6);
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(cqi.c(obj, "duplicate element: "));
            }
        }
        d = Collections.unmodifiableSet(hashSet);
    }

    public b(String str, d dVar, d dVar2) {
        this.a = str;
        this.b = dVar;
        this.c = dVar2;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        return dVar.a(this.b.a(dVar, com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT, aVar), y57.b(this.c.a(dVar, eVar, aVar)), this.a, aVar);
    }
}

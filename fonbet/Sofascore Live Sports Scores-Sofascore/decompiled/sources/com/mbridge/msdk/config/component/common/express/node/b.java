package com.mbridge.msdk.config.component.common.express.node;

import com.ironsource.U3;
import defpackage.a70;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b extends d {
    private static final Set<String> d;
    String a;
    d b;
    d c;

    static {
        Object[] objArr = {U3.j.b, "+=", "-=", "*=", "/=", "%="};
        HashSet hashSet = new HashSet(6);
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                a70.p(mz1.m(obj, "duplicate element: "));
                return;
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
        Object a = this.b.a(dVar, com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT, aVar);
        Object a2 = this.c.a(dVar, eVar, aVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a2);
        return dVar.a(a, arrayList, this.a, aVar);
    }
}

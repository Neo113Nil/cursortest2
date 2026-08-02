package com.vungle.ads.internal.model;

import defpackage.l98;
import defpackage.phi;
import defpackage.qfa;
import defpackage.uhi;
import defpackage.xg0;
import defpackage.zga;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class w extends zga {
    public static final w a = new w();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w() {
        super(l98.x(r0, new xg0(r0, 0)));
        l98.h0(phi.a);
        uhi uhiVar = uhi.a;
    }

    @Override // defpackage.zga
    public final kotlinx.serialization.json.b transformDeserialize(kotlinx.serialization.json.b bVar) {
        bVar.getClass();
        kotlinx.serialization.json.c g = qfa.g(bVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : g.a.entrySet()) {
            if (!Intrinsics.c((String) entry.getKey(), "moat")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new kotlinx.serialization.json.c(linkedHashMap);
    }
}

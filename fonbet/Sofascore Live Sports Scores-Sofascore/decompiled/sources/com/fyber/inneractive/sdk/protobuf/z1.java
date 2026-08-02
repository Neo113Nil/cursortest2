package com.fyber.inneractive.sdk.protobuf;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class z1 {
    public static y1 a(Object obj, Object obj2) {
        y1 y1Var = (y1) obj;
        y1 y1Var2 = (y1) obj2;
        if (y1Var2.isEmpty()) {
            return y1Var;
        }
        if (!y1Var.a) {
            y1Var = y1Var.isEmpty() ? new y1() : new y1(y1Var);
        }
        if (!y1Var.a) {
            a70.i();
            return null;
        }
        if (!y1Var2.isEmpty()) {
            y1Var.putAll(y1Var2);
        }
        return y1Var;
    }
}

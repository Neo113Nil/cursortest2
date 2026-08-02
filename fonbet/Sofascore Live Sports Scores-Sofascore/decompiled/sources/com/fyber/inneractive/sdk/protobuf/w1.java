package com.fyber.inneractive.sdk.protobuf;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class w1 implements b2 {
    public final b2[] a;

    public w1(b2... b2VarArr) {
        this.a = b2VarArr;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final boolean a(Class cls) {
        for (b2 b2Var : this.a) {
            if (b2Var.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final r2 b(Class cls) {
        for (b2 b2Var : this.a) {
            if (b2Var.a(cls)) {
                return b2Var.b(cls);
            }
        }
        a70.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}

package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.w1;
import org.w3c.dom.Node;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a0 extends g {
    public String i;

    public a0() {
        this.f = 1;
    }

    public static a0 c(Node node) {
        a0 a0Var = new a0();
        super.b(node);
        a0Var.i = w1.a(w1.d(node, "VASTAdTagURI"));
        return a0Var;
    }
}

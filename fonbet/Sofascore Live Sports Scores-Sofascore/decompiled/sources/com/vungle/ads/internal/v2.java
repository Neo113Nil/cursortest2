package com.vungle.ads.internal;

import com.vungle.ads.InitializationListener;
import defpackage.xka;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v2 extends xka implements Function0 {
    public final /* synthetic */ w2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(w2 w2Var) {
        super(0);
        this.a = w2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            ((InitializationListener) it.next()).onSuccess();
        }
        this.a.c.clear();
        return Unit.a;
    }
}

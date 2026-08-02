package com.vungle.ads.internal;

import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleError;
import defpackage.xka;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u2 extends xka implements Function0 {
    public final /* synthetic */ w2 a;
    public final /* synthetic */ VungleError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(w2 w2Var, VungleError vungleError) {
        super(0);
        this.a = w2Var;
        this.b = vungleError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("VungleInitializer", "onError");
        CopyOnWriteArrayList copyOnWriteArrayList = this.a.c;
        VungleError vungleError = this.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((InitializationListener) it.next()).onError(vungleError);
        }
        this.a.c.clear();
        return Unit.a;
    }
}

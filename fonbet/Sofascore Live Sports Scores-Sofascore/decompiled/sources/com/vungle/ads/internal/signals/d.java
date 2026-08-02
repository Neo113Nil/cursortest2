package com.vungle.ads.internal.signals;

import com.vungle.ads.internal.model.r3;
import defpackage.duf;
import defpackage.sha;
import defpackage.xka;
import defpackage.yea;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KTypeProjection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d extends xka implements Function0 {
    public final /* synthetic */ j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar) {
        super(0);
        this.a = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        yea yeaVar;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("unclosedad: ");
        yeaVar = this.a.b;
        a.append(yeaVar.c(sha.Q(yeaVar.b, duf.c(List.class, KTypeProjection.INSTANCE.invariant(duf.b(r3.class)))), this.a.b().c()));
        return a.toString();
    }
}

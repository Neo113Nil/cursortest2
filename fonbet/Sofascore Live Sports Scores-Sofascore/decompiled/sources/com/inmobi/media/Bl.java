package com.inmobi.media;

import defpackage.ah2;
import defpackage.pof;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Bl implements Function1 {
    public final /* synthetic */ ah2 a;

    public Bl(ah2 ah2Var) {
        this.a = ah2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((pof) this.a).cancel();
        return Unit.a;
    }
}

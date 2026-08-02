package com.inmobi.media;

import defpackage.b98;
import defpackage.ku3;
import defpackage.rq3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Qe implements b98 {
    public final /* synthetic */ Function1 a;

    public Qe(ku3 ku3Var, Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        this.a.invoke(bool);
        return Unit.a;
    }
}

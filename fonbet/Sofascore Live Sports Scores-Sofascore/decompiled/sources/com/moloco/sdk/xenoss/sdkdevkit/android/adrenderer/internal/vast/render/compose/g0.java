package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import defpackage.e1d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o oVar, Function0 function0, Function1 function1, boolean z) {
        this.d = oVar;
        this.e = function0;
        this.b = function1;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        boolean z = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) obj2) instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) {
                    function0.invoke();
                } else {
                    function1.invoke(Boolean.valueOf(!z));
                }
                break;
            default:
                Function2 function2 = (Function2) obj2;
                e1d e1dVar = (e1d) obj;
                function1.invoke(Boolean.valueOf(!z));
                e1dVar.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d(z ? com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.d : com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.e, ((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) e1dVar.getValue()).b, ((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) e1dVar.getValue()).c));
                function2.invoke((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) e1dVar.getValue(), z ? com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.e : com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ g0(Function1 function1, boolean z, Function2 function2, e1d e1dVar) {
        this.b = function1;
        this.c = z;
        this.d = function2;
        this.e = e1dVar;
    }
}

package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u;
import defpackage.c7a;
import defpackage.e1d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;

    public /* synthetic */ c(int i, e1d e1dVar) {
        this.a = i;
        this.b = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        e1d e1dVar = this.b;
        switch (i) {
            case 0:
                c7a c7aVar = (c7a) obj;
                long j = c7aVar.a;
                e1dVar.setValue(c7aVar);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                e1dVar.setValue(new u(bool));
                break;
        }
        return Unit.a;
    }
}

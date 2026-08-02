package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import defpackage.ug6;
import defpackage.vke;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ug6 b;
    public final /* synthetic */ vke c;

    public /* synthetic */ a(ug6 ug6Var, vke vkeVar, int i) {
        this.a = i;
        this.b = ug6Var;
        this.c = vkeVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        vke vkeVar = this.c;
        ug6 ug6Var = this.b;
        switch (i) {
            case 0:
                ug6Var.A((b) vkeVar);
                break;
            default:
                ug6Var.A((b) vkeVar);
                break;
        }
        return Unit.a;
    }
}

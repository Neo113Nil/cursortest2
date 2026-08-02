package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.b98;
import defpackage.rq3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.facebook.internal.t b;

    public /* synthetic */ i(com.facebook.internal.t tVar, int i) {
        this.a = i;
        this.b = tVar;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        com.facebook.internal.t tVar = this.b;
        switch (i) {
            case 0:
                tVar.b();
                break;
            case 1:
                tVar.a();
                break;
            default:
                tVar.a();
                break;
        }
        return Unit.a;
    }
}

package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import defpackage.b98;
import defpackage.e1d;
import defpackage.rq3;
import defpackage.y7k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class k implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;

    public /* synthetic */ k(int i, e1d e1dVar) {
        this.a = i;
        this.b = e1dVar;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        e1d e1dVar = this.b;
        switch (i) {
            case 0:
                e1dVar.setValue(Integer.valueOf(((Number) obj).intValue()));
                break;
            default:
                int i2 = ((y7k) obj).a;
                ((Function0) e1dVar.getValue()).invoke();
                break;
        }
        return Unit.a;
    }
}

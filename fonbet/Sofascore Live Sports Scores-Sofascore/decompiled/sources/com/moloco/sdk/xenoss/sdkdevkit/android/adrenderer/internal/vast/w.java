package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.dsf;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dsf b;
    public final /* synthetic */ dsf c;

    public /* synthetic */ w(dsf dsfVar, dsf dsfVar2, int i) {
        this.a = i;
        this.b = dsfVar;
        this.c = dsfVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        dsf dsfVar = this.c;
        dsf dsfVar2 = this.b;
        Pair pair = (Pair) obj;
        switch (i) {
            case 0:
                pair.getClass();
                boolean booleanValue = ((Boolean) pair.a).booleanValue();
                boolean booleanValue2 = ((Boolean) pair.b).booleanValue();
                if (booleanValue) {
                    dsfVar2.a++;
                }
                if (booleanValue2) {
                    dsfVar.a++;
                }
                break;
            default:
                pair.getClass();
                boolean booleanValue3 = ((Boolean) pair.a).booleanValue();
                boolean booleanValue4 = ((Boolean) pair.b).booleanValue();
                if (booleanValue3) {
                    dsfVar2.a++;
                }
                if (booleanValue4) {
                    dsfVar.a++;
                }
                break;
        }
        return Unit.a;
    }
}

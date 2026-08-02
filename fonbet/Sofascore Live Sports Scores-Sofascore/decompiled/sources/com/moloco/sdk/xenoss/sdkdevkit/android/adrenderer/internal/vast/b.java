package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.dsf;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b implements Comparator {
    public final double a;
    public final Long b;
    public final Integer c;
    public final Integer d;

    public b(double d, Long l, Integer num, Integer num2) {
        this.a = d;
        this.b = l;
        this.c = num;
        this.d = num2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v vVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v) obj;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v vVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v) obj2;
        vVar.getClass();
        vVar2.getClass();
        dsf dsfVar = new dsf();
        dsf dsfVar2 = new dsf();
        w wVar = new w(dsfVar, dsfVar2, 1);
        Integer num = vVar.d;
        Integer num2 = vVar.e;
        Integer num3 = this.c;
        Integer num4 = this.d;
        Double d = x.d(num, num2, num3, num4);
        Integer num5 = vVar2.d;
        Integer num6 = vVar2.e;
        wVar.invoke(x.g(d, x.d(num5, num6, num3, num4)));
        wVar.invoke(x.g(x.m(num, num2, num3, num4), x.m(num5, num6, num3, num4)));
        double d2 = this.a;
        Long l = this.b;
        wVar.invoke(x.g(x.c(vVar, d2, l), x.c(vVar2, d2, l)));
        return Intrinsics.d(dsfVar2.a, dsfVar.a);
    }
}

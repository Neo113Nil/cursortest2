package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import defpackage.dsf;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a implements Comparator {
    public final Integer a;
    public final Integer b;

    public a(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i iVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i) obj;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i iVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i) obj2;
        iVar.getClass();
        iVar2.getClass();
        dsf dsfVar = new dsf();
        dsf dsfVar2 = new dsf();
        w wVar = new w(dsfVar, dsfVar2, 0);
        Integer num = iVar.a;
        Integer num2 = iVar.b;
        Integer num3 = this.a;
        Integer num4 = this.b;
        Double d = x.d(num, num2, num3, num4);
        Integer num5 = iVar2.a;
        Integer num6 = iVar2.b;
        wVar.invoke(x.g(d, x.d(num5, num6, num3, num4)));
        wVar.invoke(x.g(x.m(num, num2, num3, num4), x.m(num5, num6, num3, num4)));
        Iterator it = iVar.f.iterator();
        while (true) {
            obj3 = null;
            if (!it.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it.next();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0 i0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0) obj4;
            i0Var.getClass();
            if (i0Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h0) {
                break;
            }
        }
        boolean z = obj4 != null;
        Iterator it2 = iVar2.f.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0 i0Var2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0) next;
            i0Var2.getClass();
            if (i0Var2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h0) {
                obj3 = next;
                break;
            }
        }
        wVar.invoke(new Pair(Boolean.valueOf(z), Boolean.valueOf(obj3 != null)));
        return Intrinsics.d(dsfVar2.a, dsfVar.a);
    }
}

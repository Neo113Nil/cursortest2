package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.hoi;
import defpackage.k13;
import defpackage.km5;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.m6k;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Um extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ double d;
    public final /* synthetic */ AdConfig.VastVideoConfig e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Um(ArrayList arrayList, double d, AdConfig.VastVideoConfig vastVideoConfig, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = arrayList;
        this.d = d;
        this.e = vastVideoConfig;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        Um um = new Um(this.c, this.d, this.e, rq3Var);
        um.b = obj;
        return um;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Um) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.b;
            if (this.c.isEmpty()) {
                return km5.a;
            }
            int a = G5.a();
            EnumC3369df a2 = G4.a();
            ArrayList arrayList = this.c;
            double d = this.d;
            AdConfig.VastVideoConfig vastVideoConfig = this.e;
            ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(xw3.t(ku3Var, null, new Sm((Ol) it.next(), d, a2, a, vastVideoConfig, null), 3));
            }
            this.a = 1;
            obj = m6k.u(arrayList2, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        List H0 = CollectionsKt.H0((Iterable) obj, new Tm());
        ArrayList arrayList3 = new ArrayList(k13.r(H0, 10));
        Iterator it2 = H0.iterator();
        while (it2.hasNext()) {
            arrayList3.add((Ol) ((Pair) it2.next()).a);
        }
        return arrayList3;
    }
}

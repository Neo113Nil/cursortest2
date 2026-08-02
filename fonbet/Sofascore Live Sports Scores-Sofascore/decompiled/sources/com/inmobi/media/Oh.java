package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import defpackage.hoi;
import defpackage.k8f;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.wv8;
import defpackage.xw3;
import defpackage.y6a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Oh extends hoi implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Sh c;
    public final /* synthetic */ String d;
    public final /* synthetic */ RootConfig e;
    public final /* synthetic */ k8f f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oh(List list, Sh sh, String str, RootConfig rootConfig, k8f k8fVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = list;
        this.c = sh;
        this.d = str;
        this.e = rootConfig;
        this.f = k8fVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        Oh oh = new Oh(this.b, this.c, this.d, this.e, this.f, rq3Var);
        oh.a = obj;
        return oh;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Oh) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        ku3 ku3Var = (ku3) this.a;
        List list = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            String str = ((C3797u4) obj2).a;
            Object obj3 = linkedHashMap.get(str);
            if (obj3 == null) {
                obj3 = wv8.n(linkedHashMap, str);
            }
            ((List) obj3).add(obj2);
        }
        Sh sh = this.c;
        String str2 = this.d;
        RootConfig rootConfig = this.e;
        k8f k8fVar = this.f;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            xw3.L(ku3Var, null, null, new Nh(sh, (String) entry.getKey(), str2, rootConfig, (List) entry.getValue(), k8fVar, null), 3);
        }
        return Unit.a;
    }
}

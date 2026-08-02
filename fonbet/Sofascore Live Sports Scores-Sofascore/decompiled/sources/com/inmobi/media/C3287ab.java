package com.inmobi.media;

import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ab, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3287ab extends hoi implements Function2 {
    public final /* synthetic */ LinkedHashMap a;
    public final /* synthetic */ Za b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3287ab(LinkedHashMap linkedHashMap, Za za, rq3 rq3Var) {
        super(2, rq3Var);
        this.a = linkedHashMap;
        this.b = za;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3287ab(this.a, this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3287ab(this.a, this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        this.a.put("networkType", F5.o());
        String str = this.b.a;
        LinkedHashMap linkedHashMap = this.a;
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b(str, linkedHashMap, EnumC3943zk.SDK);
        return Unit.a;
    }
}

package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Hf extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ Xe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hf(Xe xe, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = xe;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Hf(this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Hf(this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            F9 f9 = (F9) Ve.c.getValue();
            Xe xe = this.b;
            this.a = 1;
            obj = f9.a.a(xe, this);
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
        InterfaceC3317bf interfaceC3317bf = (InterfaceC3317bf) obj;
        if (!Fl.a(interfaceC3317bf)) {
            throw new IOException();
        }
        IntRange intRange = AbstractC3446gf.a;
        interfaceC3317bf.getClass();
        return interfaceC3317bf.d().r(Charsets.UTF_8);
    }
}

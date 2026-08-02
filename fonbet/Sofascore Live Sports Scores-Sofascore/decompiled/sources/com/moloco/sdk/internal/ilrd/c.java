package com.moloco.sdk.internal.ilrd;

import android.util.Base64;
import com.moloco.sdk.f1;
import com.moloco.sdk.g1;
import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ e t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = eVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        e eVar = this.t;
        switch (i) {
            case 0:
                return new c(eVar, rq3Var, 0);
            default:
                return new c(eVar, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((c) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r0.a("ilrd_events_store", r8) == r5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r0.b("ilrd_events_store", r9, r8) == r5) goto L19;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        e eVar = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    if (eVar.d(this) == lu3Var) {
                        break;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                }
                break;
            default:
                com.moloco.sdk.internal.services.e eVar2 = eVar.l;
                ArrayList arrayList = eVar.r;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    if (!arrayList.isEmpty()) {
                        f1 j = g1.j();
                        j.d(arrayList);
                        String encodeToString = Base64.encodeToString(((g1) j.build()).toByteArray(), 2);
                        this.s = 2;
                        break;
                    } else {
                        this.s = 1;
                        break;
                    }
                    break;
                } else if (i3 == 1) {
                    y6a.M(obj);
                    break;
                } else if (i3 != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    break;
                }
        }
        return Unit.a;
    }
}

package com.unity3d.ads.core.utils;

import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.n4o;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1", f = "CommonCoroutineTimer.kt", l = {21, 24}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CommonCoroutineTimer$start$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $action;
    final /* synthetic */ long $delayStartMillis;
    final /* synthetic */ long $repeatMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonCoroutineTimer$start$1(long j, Function0<Unit> function0, long j2, rq3<? super CommonCoroutineTimer$start$1> rq3Var) {
        super(2, rq3Var);
        this.$delayStartMillis = j;
        this.$action = function0;
        this.$repeatMillis = j2;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        CommonCoroutineTimer$start$1 commonCoroutineTimer$start$1 = new CommonCoroutineTimer$start$1(this.$delayStartMillis, this.$action, this.$repeatMillis, rq3Var);
        commonCoroutineTimer$start$1.L$0 = obj;
        return commonCoroutineTimer$start$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((CommonCoroutineTimer$start$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (defpackage.n4o.y(r4, r6) == r0) goto L17;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ku3 ku3Var;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            ku3Var = (ku3) this.L$0;
            long j = this.$delayStartMillis;
            this.L$0 = ku3Var;
            this.label = 1;
        } else {
            if (i != 1 && i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ku3Var = (ku3) this.L$0;
            y6a.M(obj);
        }
        while (s9a.w(ku3Var)) {
            this.$action.invoke();
            long j2 = this.$repeatMillis;
            this.L$0 = ku3Var;
            this.label = 2;
            if (n4o.y(j2, this) == lu3Var) {
                return lu3Var;
            }
        }
        return Unit.a;
    }
}

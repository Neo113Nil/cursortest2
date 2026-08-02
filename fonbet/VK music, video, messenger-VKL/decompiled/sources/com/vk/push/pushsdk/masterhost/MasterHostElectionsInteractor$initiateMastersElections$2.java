package com.vk.push.pushsdk.masterhost;

import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.domain.model.CallingAppIds;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.nj10;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* compiled from: MasterHostElectionsInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.masterhost.MasterHostElectionsInteractor$initiateMastersElections$2", f = "MasterHostElectionsInteractor.kt", l = {372}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MasterHostElectionsInteractor$initiateMastersElections$2 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends AppInfo>>, Object> {
    final /* synthetic */ CallingAppIds $callingAppIds;
    int label;
    final /* synthetic */ nj10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterHostElectionsInteractor$initiateMastersElections$2(CallingAppIds callingAppIds, spj spjVar, nj10 nj10Var) {
        super(2, spjVar);
        this.this$0 = nj10Var;
        this.$callingAppIds = callingAppIds;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new MasterHostElectionsInteractor$initiateMastersElections$2(this.$callingAppIds, spjVar, this.this$0);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends AppInfo>> spjVar) {
        return ((MasterHostElectionsInteractor$initiateMastersElections$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            Logger.DefaultImpls.info$default(this.this$0.o, "Elections is starting", null, 2, null);
            nj10 nj10Var = this.this$0;
            MasterHostElectionsInteractor$initiateMastersElections$2$invokeSuspend$$inlined$invoke$1 masterHostElectionsInteractor$initiateMastersElections$2$invokeSuspend$$inlined$invoke$1 = new MasterHostElectionsInteractor$initiateMastersElections$2$invokeSuspend$$inlined$invoke$1(nj10Var.l, null, nj10Var, this.$callingAppIds);
            this.label = 1;
            obj = zvj.d(masterHostElectionsInteractor$initiateMastersElections$2$invokeSuspend$$inlined$invoke$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
        }
        return new Result(((Result) obj).d());
    }
}

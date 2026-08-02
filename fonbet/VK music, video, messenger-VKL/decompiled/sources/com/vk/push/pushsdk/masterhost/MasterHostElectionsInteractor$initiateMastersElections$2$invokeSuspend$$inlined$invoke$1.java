package com.vk.push.pushsdk.masterhost;

import com.vk.push.core.domain.model.CallingAppIds;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.asl;
import xsna.b6l;
import xsna.myc0;
import xsna.nj10;
import xsna.s3q0;
import xsna.smy;
import xsna.spj;
import xsna.ui50;
import xsna.wzs;
import xsna.yvj;

/* compiled from: LaunchOrAwaitUseCase.kt */
@b6l(c = "com.vk.push.pushsdk.masterhost.MasterHostElectionsInteractor$initiateMastersElections$2$invokeSuspend$$inlined$invoke$1", f = "MasterHostElectionsInteractor.kt", l = {44, 29}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MasterHostElectionsInteractor$initiateMastersElections$2$invokeSuspend$$inlined$invoke$1 extends SuspendLambda implements wzs {
    final /* synthetic */ CallingAppIds $callingAppIds$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ nj10 this$0;
    final /* synthetic */ smy this$0$inline_fun;

    /* compiled from: LaunchOrAwaitUseCase.kt */
    @b6l(c = "com.vk.push.pushsdk.masterhost.MasterHostElectionsInteractor$initiateMastersElections$2$invokeSuspend$$inlined$invoke$1$1", f = "MasterHostElectionsInteractor.kt", l = {38}, m = "invokeSuspend")
    /* renamed from: com.vk.push.pushsdk.masterhost.MasterHostElectionsInteractor$initiateMastersElections$2$invokeSuspend$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wzs {
        final /* synthetic */ CallingAppIds $callingAppIds$inlined;
        int label;
        final /* synthetic */ nj10 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CallingAppIds callingAppIds, spj spjVar, nj10 nj10Var) {
            super(2, spjVar);
            this.this$0 = nj10Var;
            this.$callingAppIds$inlined = callingAppIds;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new AnonymousClass1(this.$callingAppIds$inlined, spjVar, this.this$0);
        }

        @Override // xsna.wzs
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                a.a(obj);
                nj10 nj10Var = this.this$0;
                CallingAppIds callingAppIds = this.$callingAppIds$inlined;
                this.label = 1;
                a = nj10.a(nj10Var, callingAppIds, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
                a = ((Result) obj).d();
            }
            return new Result(a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterHostElectionsInteractor$initiateMastersElections$2$invokeSuspend$$inlined$invoke$1(smy smyVar, spj spjVar, nj10 nj10Var, CallingAppIds callingAppIds) {
        super(2, spjVar);
        this.this$0$inline_fun = smyVar;
        this.this$0 = nj10Var;
        this.$callingAppIds$inlined = callingAppIds;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        MasterHostElectionsInteractor$initiateMastersElections$2$invokeSuspend$$inlined$invoke$1 masterHostElectionsInteractor$initiateMastersElections$2$invokeSuspend$$inlined$invoke$1 = new MasterHostElectionsInteractor$initiateMastersElections$2$invokeSuspend$$inlined$invoke$1(this.this$0$inline_fun, spjVar, this.this$0, this.$callingAppIds$inlined);
        masterHostElectionsInteractor$initiateMastersElections$2$invokeSuspend$$inlined$invoke$1.L$0 = obj;
        return masterHostElectionsInteractor$initiateMastersElections$2$invokeSuspend$$inlined$invoke$1;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        return ((MasterHostElectionsInteractor$initiateMastersElections$2$invokeSuspend$$inlined$invoke$1) create((yvj) obj, (spj) obj2)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x005c, code lost:
    
        if (r6.b(r8) == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar;
        smy smyVar;
        ui50 ui50Var;
        asl aslVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                a.a(obj);
                yvjVar = (yvj) this.L$0;
                asl aslVar2 = this.this$0$inline_fun.a;
                if (aslVar2 != null && aslVar2.isActive()) {
                    aslVar = this.this$0$inline_fun.a;
                    if (aslVar == null) {
                        throw new IllegalStateException("Something went wrong, deferred is null");
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    Object J = aslVar.J(this);
                    return J != coroutineSingletons ? coroutineSingletons : J;
                }
                smyVar = this.this$0$inline_fun;
                ui50Var = smyVar.b;
                this.L$0 = yvjVar;
                this.L$1 = ui50Var;
                this.L$2 = smyVar;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                    return obj;
                }
                smyVar = (smy) this.L$2;
                ui50Var = (ui50) this.L$1;
                yvjVar = (yvj) this.L$0;
                a.a(obj);
            }
            asl aslVar3 = smyVar.a;
            if (aslVar3 == null || !aslVar3.isActive()) {
                z = false;
            }
            if (z) {
                aslVar = smyVar.a;
                if (aslVar == null) {
                    throw new IllegalStateException("Something went wrong, deferred is null");
                }
            } else {
                aslVar = myc0.b(yvjVar, null, null, new AnonymousClass1(this.$callingAppIds$inlined, null, this.this$0), 3);
                smyVar.a = aslVar;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            Object J2 = aslVar.J(this);
            if (J2 != coroutineSingletons) {
            }
        } finally {
            ui50Var.c(null);
        }
    }
}

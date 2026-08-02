package com.vk.push.core.filedatastore.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;
import xsna.wzs;

/* compiled from: FlowableFileDataStoreImpl.kt */
@b6l(c = "com.vk.push.core.filedatastore.flow.FlowableFileDataStoreImpl$valueFlow$2$1$2", f = "FlowableFileDataStoreImpl.kt", l = {23, 23}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class a extends SuspendLambda implements wzs<Boolean, spj<? super s3q0>, Object> {
    final /* synthetic */ sh50<Object> $this_apply;
    Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ FlowableFileDataStoreImpl<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sh50<Object> sh50Var, FlowableFileDataStoreImpl<Object> flowableFileDataStoreImpl, spj<? super a> spjVar) {
        super(2, spjVar);
        this.$this_apply = sh50Var;
        this.this$0 = flowableFileDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        a aVar = new a(this.$this_apply, this.this$0, spjVar);
        aVar.Z$0 = ((Boolean) obj).booleanValue();
        return aVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Boolean bool, spj<? super s3q0> spjVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((a) create(bool2, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        sh50<Object> sh50Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.Z$0) {
                sh50Var = this.$this_apply;
                FlowableFileDataStoreImpl<Object> flowableFileDataStoreImpl = this.this$0;
                this.L$0 = sh50Var;
                this.label = 1;
                obj = flowableFileDataStoreImpl.read(this);
            }
            return s3q0.a;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return s3q0.a;
        }
        sh50Var = (sh50) this.L$0;
        kotlin.a.a(obj);
        this.L$0 = null;
        this.label = 2;
    }
}

package com.vk.profile.community.members.impl.ui;

import com.vk.profile.community.members.impl.ui.k;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.a220;
import xsna.b6l;
import xsna.on50;
import xsna.s3q0;
import xsna.spj;
import xsna.uvj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: MembersStore.kt */
@b6l(c = "com.vk.profile.community.members.impl.ui.MembersStoreKt$MembersStoreRecipe$4$1$1", f = "MembersStore.kt", l = {Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, 108}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class f extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ a220 $deps;
    final /* synthetic */ k $task;
    final /* synthetic */ uvj<MembersState, on50, k, k, c, b> $this_execute;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, uvj<MembersState, on50, k, k, c, b> uvjVar, a220 a220Var, spj<? super f> spjVar) {
        super(2, spjVar);
        this.$task = kVar;
        this.$this_execute = uvjVar;
        this.$deps = a220Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new f(this.$task, this.$this_execute, this.$deps, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((f) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (com.vk.profile.community.members.impl.ui.j.c(r5.$this_execute, r5.$deps, (com.vk.profile.community.members.impl.ui.k.b) r6, r5) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (com.vk.profile.community.members.impl.ui.j.b(r5.$this_execute, r5.$deps, (com.vk.profile.community.members.impl.ui.k.c) r6, r5) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (com.vk.profile.community.members.impl.ui.j.a(r5.$deps, (com.vk.profile.community.members.impl.ui.k.a) r6, r5) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            k kVar = this.$task;
            if (kVar instanceof k.b) {
                this.label = 1;
            } else if (kVar instanceof k.c) {
                this.label = 2;
            } else {
                if (!(kVar instanceof k.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.label = 3;
            }
        } else {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}

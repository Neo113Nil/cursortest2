package com.unity3d.ads.core.data.datasource;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.gzg0;
import xsna.izs;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidFIdDataSource.kt */
@b6l(c = "com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1", f = "AndroidFIdDataSource.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidFIdDataSource$invoke$1$1 extends SuspendLambda implements wzs<yvj, spj<? super String>, Object> {
    final /* synthetic */ Task<String> $task;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFIdDataSource$invoke$1$1(Task<String> task, spj<? super AndroidFIdDataSource$invoke$1$1> spjVar) {
        super(2, spjVar);
        this.$task = task;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidFIdDataSource$invoke$1$1(this.$task, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        Task<String> task = this.$task;
        this.L$0 = task;
        this.label = 1;
        final gzg0 gzg0Var = new gzg0(s7s0.c(this));
        final izs<String, s3q0> izsVar = new izs<String, s3q0>() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$1
            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(String str) {
                invoke2(str);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                gzg0Var.resumeWith(str);
            }
        };
        task.addOnSuccessListener(new OnSuccessListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$sam$com_google_android_gms_tasks_OnSuccessListener$0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final /* synthetic */ void onSuccess(Object obj2) {
                izs.this.invoke(obj2);
            }
        });
        task.addOnFailureListener(new OnFailureListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                gzg0Var.resumeWith(new Result.Failure(exc));
            }
        });
        Object a = gzg0Var.a();
        return a == coroutineSingletons ? coroutineSingletons : a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super String> spjVar) {
        return ((AndroidFIdDataSource$invoke$1$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}

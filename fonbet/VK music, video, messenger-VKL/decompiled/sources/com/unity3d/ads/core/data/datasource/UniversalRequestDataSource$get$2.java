package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.CorruptionException;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.yzs;

/* compiled from: UniversalRequestDataSource.kt */
@b6l(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2", f = "UniversalRequestDataSource.kt", l = {15}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class UniversalRequestDataSource$get$2 extends SuspendLambda implements yzs<lsr<? super UniversalRequestStoreOuterClass.UniversalRequestStore>, Throwable, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public UniversalRequestDataSource$get$2(spj<? super UniversalRequestDataSource$get$2> spjVar) {
        super(3, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            lsr lsrVar = (lsr) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (!(th instanceof CorruptionException)) {
                throw th;
            }
            UniversalRequestStoreOuterClass.UniversalRequestStore defaultInstance = UniversalRequestStoreOuterClass.UniversalRequestStore.getDefaultInstance();
            this.L$0 = null;
            this.label = 1;
            if (lsrVar.emit(defaultInstance, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }

    @Override // xsna.yzs
    public final Object invoke(lsr<? super UniversalRequestStoreOuterClass.UniversalRequestStore> lsrVar, Throwable th, spj<? super s3q0> spjVar) {
        UniversalRequestDataSource$get$2 universalRequestDataSource$get$2 = new UniversalRequestDataSource$get$2(spjVar);
        universalRequestDataSource$get$2.L$0 = lsrVar;
        universalRequestDataSource$get$2.L$1 = th;
        return universalRequestDataSource$get$2.invokeSuspend(s3q0.a);
    }
}

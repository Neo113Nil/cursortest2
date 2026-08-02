package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.CorruptionException;
import com.google.protobuf.ByteString;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.yzs;

/* compiled from: AndroidByteStringDataSource.kt */
@b6l(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$get$2", f = "AndroidByteStringDataSource.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidByteStringDataSource$get$2 extends SuspendLambda implements yzs<lsr<? super ByteStringStoreOuterClass.ByteStringStore>, Throwable, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public AndroidByteStringDataSource$get$2(spj<? super AndroidByteStringDataSource$get$2> spjVar) {
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
            ByteStringStoreKt.Dsl _create = ByteStringStoreKt.Dsl.Companion._create(ByteStringStoreOuterClass.ByteStringStore.newBuilder());
            _create.setData(ByteString.EMPTY);
            ByteStringStoreOuterClass.ByteStringStore _build = _create._build();
            this.L$0 = null;
            this.label = 1;
            if (lsrVar.emit(_build, this) == coroutineSingletons) {
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
    public final Object invoke(lsr<? super ByteStringStoreOuterClass.ByteStringStore> lsrVar, Throwable th, spj<? super s3q0> spjVar) {
        AndroidByteStringDataSource$get$2 androidByteStringDataSource$get$2 = new AndroidByteStringDataSource$get$2(spjVar);
        androidByteStringDataSource$get$2.L$0 = lsrVar;
        androidByteStringDataSource$get$2.L$1 = th;
        return androidByteStringDataSource$get$2.invokeSuspend(s3q0.a);
    }
}

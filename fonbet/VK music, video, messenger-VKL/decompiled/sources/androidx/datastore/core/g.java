package androidx.datastore.core;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.ksr;
import xsna.lsr;
import xsna.qgr;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: DataStoreImpl.kt */
@b6l(c = "androidx.datastore.core.DataStoreImpl$incrementCollector$2$1", f = "DataStoreImpl.kt", l = {134, 135}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ DataStoreImpl<Object> this$0;

    /* compiled from: DataStoreImpl.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ DataStoreImpl<T> b;

        public a(DataStoreImpl<T> dataStoreImpl) {
            this.b = dataStoreImpl;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            DataStoreImpl<T> dataStoreImpl = this.b;
            if (dataStoreImpl.h.a() instanceof qgr) {
                return s3q0.a;
            }
            Object e = DataStoreImpl.e(dataStoreImpl, true, spjVar);
            return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DataStoreImpl<Object> dataStoreImpl, spj<? super g> spjVar) {
        super(2, spjVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new g(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((g) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r5.collect(r1, r4) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r5 == r0) goto L18;
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
            DataStoreImpl<Object>.a aVar = this.this$0.i;
            this.label = 1;
            Object J = aVar.b.J(this);
            if (J != coroutineSingletons) {
                J = s3q0.a;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        ksr h = rsr.h(this.this$0.g().b(), -1);
        a aVar2 = new a(this.this$0);
        this.label = 2;
    }
}

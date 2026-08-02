package androidx.room;

import android.database.SQLException;
import androidx.room.Transactor;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.sqp0;
import xsna.wzs;
import xsna.zip0;

/* compiled from: InvalidationTracker.kt */
@b6l(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", f = "InvalidationTracker.kt", l = {413, 420}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r extends SuspendLambda implements wzs<Transactor, spj<? super Set<? extends Integer>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sqp0 this$0;

    /* compiled from: InvalidationTracker.kt */
    @b6l(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", f = "InvalidationTracker.kt", l = {421}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<zip0<Set<? extends Integer>>, spj<? super Set<? extends Integer>>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ sqp0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sqp0 sqp0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = sqp0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(zip0<Set<? extends Integer>> zip0Var, spj<? super Set<? extends Integer>> spjVar) {
            return ((a) create(zip0Var, spjVar)).invokeSuspend(s3q0.a);
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
            zip0 zip0Var = (zip0) this.L$0;
            sqp0 sqp0Var = this.this$0;
            this.label = 1;
            Object a = sqp0.a(sqp0Var, zip0Var, this);
            return a == coroutineSingletons ? coroutineSingletons : a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(sqp0 sqp0Var, spj<? super r> spjVar) {
        super(2, spjVar);
        this.this$0 = sqp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        r rVar = new r(this.this$0, spjVar);
        rVar.L$0 = obj;
        return rVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Transactor transactor, spj<? super Set<? extends Integer>> spjVar) {
        return ((r) create(transactor, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r7 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r7 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Transactor transactor;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                transactor = (Transactor) this.L$0;
                this.L$0 = transactor;
                this.label = 1;
                obj = transactor.c(this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return (Set) obj;
                }
                transactor = (Transactor) this.L$0;
                kotlin.a.a(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                return EmptySet.b;
            }
            Transactor.SQLiteTransactionType sQLiteTransactionType = Transactor.SQLiteTransactionType.IMMEDIATE;
            a aVar = new a(this.this$0, null);
            this.L$0 = null;
            this.label = 2;
            obj = transactor.d(sQLiteTransactionType, aVar, this);
        } catch (SQLException unused) {
            return EmptySet.b;
        }
    }
}

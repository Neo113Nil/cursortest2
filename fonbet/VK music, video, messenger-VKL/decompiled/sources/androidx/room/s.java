package androidx.room;

import androidx.room.ObservedTableStates;
import androidx.room.Transactor;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.sqp0;
import xsna.wzs;
import xsna.zip0;

/* compiled from: InvalidationTracker.kt */
@b6l(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", f = "InvalidationTracker.kt", l = {301, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class s extends SuspendLambda implements wzs<Transactor, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sqp0 this$0;

    /* compiled from: InvalidationTracker.kt */
    @b6l(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1", f = "InvalidationTracker.kt", l = {Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE, Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<zip0<s3q0>, spj<? super s3q0>, Object> {
        final /* synthetic */ Transactor $connection;
        final /* synthetic */ ObservedTableStates.ObserveOp[] $tablesToSync;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ sqp0 this$0;

        /* compiled from: InvalidationTracker.kt */
        /* renamed from: androidx.room.s$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0090a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ObservedTableStates.ObserveOp.values().length];
                try {
                    iArr[ObservedTableStates.ObserveOp.NO_OP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ObservedTableStates.ObserveOp.ADD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ObservedTableStates.ObserveOp.REMOVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ObservedTableStates.ObserveOp[] observeOpArr, sqp0 sqp0Var, Transactor transactor, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$tablesToSync = observeOpArr;
            this.this$0 = sqp0Var;
            this.$connection = transactor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$tablesToSync, this.this$0, this.$connection, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(zip0<s3q0> zip0Var, spj<? super s3q0> spjVar) {
            return ((a) create(zip0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
        
            if (xsna.sqp0.c(r7, r12, r6, r11) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
        
            r6 = r12;
            r5 = r9;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0084 -> B:10:0x0085). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            ObservedTableStates.ObserveOp[] observeOpArr;
            sqp0 sqp0Var;
            Transactor transactor;
            int i2;
            int i3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.label;
            if (i4 == 0) {
                kotlin.a.a(obj);
                ObservedTableStates.ObserveOp[] observeOpArr2 = this.$tablesToSync;
                sqp0 sqp0Var2 = this.this$0;
                Transactor transactor2 = this.$connection;
                int length = observeOpArr2.length;
                i = 0;
                observeOpArr = observeOpArr2;
                sqp0Var = sqp0Var2;
                transactor = transactor2;
                i2 = length;
                i3 = 0;
                if (i3 >= i2) {
                }
            } else {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.I$2;
                i3 = this.I$1;
                int i5 = this.I$0;
                Transactor transactor3 = (Transactor) this.L$2;
                sqp0Var = (sqp0) this.L$1;
                observeOpArr = (ObservedTableStates.ObserveOp[]) this.L$0;
                kotlin.a.a(obj);
                transactor = transactor3;
                i = i5;
                i3++;
                if (i3 >= i2) {
                    int i6 = i + 1;
                    int i7 = C0090a.$EnumSwitchMapping$0[observeOpArr[i3].ordinal()];
                    if (i7 == 1) {
                        i = i6;
                        i3++;
                        if (i3 >= i2) {
                            return s3q0.a;
                        }
                    } else {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.L$0 = observeOpArr;
                            this.L$1 = sqp0Var;
                            this.L$2 = transactor;
                            this.I$0 = i6;
                            this.I$1 = i3;
                            this.I$2 = i2;
                            this.label = 2;
                            if (sqp0.d(sqp0Var, transactor, i, this) != coroutineSingletons) {
                                transactor3 = transactor;
                                i5 = i6;
                                transactor = transactor3;
                                i = i5;
                            }
                            return coroutineSingletons;
                        }
                        this.L$0 = observeOpArr;
                        this.L$1 = sqp0Var;
                        this.L$2 = transactor;
                        this.I$0 = i6;
                        this.I$1 = i3;
                        this.I$2 = i2;
                        this.label = 1;
                        i3++;
                        if (i3 >= i2) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(sqp0 sqp0Var, spj<? super s> spjVar) {
        super(2, spjVar);
        this.this$0 = sqp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        s sVar = new s(this.this$0, spjVar);
        sVar.L$0 = obj;
        return sVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Transactor transactor, spj<? super s3q0> spjVar) {
        return ((s) create(transactor, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r2.d(r4, r5, r18) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0034, code lost:
    
        if (r5 == r0) goto L48;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Transactor transactor;
        Object c;
        ObservedTableStates.ObserveOp[] observeOpArr;
        ObservedTableStates.ObserveOp observeOp;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            kotlin.a.a(obj);
            transactor = (Transactor) this.L$0;
            this.L$0 = transactor;
            this.label = 1;
            c = transactor.c(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            transactor = (Transactor) this.L$0;
            kotlin.a.a(obj);
            c = obj;
        }
        if (((Boolean) c).booleanValue()) {
            return s3q0.a;
        }
        ObservedTableStates observedTableStates = this.this$0.h;
        long[] jArr = observedTableStates.b;
        ReentrantLock reentrantLock = observedTableStates.a;
        reentrantLock.lock();
        try {
            if (observedTableStates.d) {
                observedTableStates.d = false;
                int length = jArr.length;
                observeOpArr = new ObservedTableStates.ObserveOp[length];
                int i2 = 0;
                boolean z2 = false;
                while (i2 < length) {
                    boolean z3 = jArr[i2] > 0 ? z : false;
                    boolean[] zArr = observedTableStates.c;
                    if (z3 != zArr[i2]) {
                        zArr[i2] = z3;
                        observeOp = z3 ? ObservedTableStates.ObserveOp.ADD : ObservedTableStates.ObserveOp.REMOVE;
                        z2 = true;
                    } else {
                        observeOp = ObservedTableStates.ObserveOp.NO_OP;
                    }
                    observeOpArr[i2] = observeOp;
                    i2++;
                    z = true;
                }
                if (!z2) {
                    observeOpArr = null;
                }
                reentrantLock.unlock();
            } else {
                reentrantLock.unlock();
                observeOpArr = null;
            }
            if (observeOpArr != null) {
                Transactor.SQLiteTransactionType sQLiteTransactionType = Transactor.SQLiteTransactionType.IMMEDIATE;
                a aVar = new a(observeOpArr, this.this$0, transactor, null);
                this.L$0 = null;
                this.label = 2;
            }
            return s3q0.a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

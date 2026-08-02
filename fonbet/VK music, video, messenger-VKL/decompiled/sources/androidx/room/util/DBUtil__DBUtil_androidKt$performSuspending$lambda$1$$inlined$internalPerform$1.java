package androidx.room.util;

import androidx.room.RoomDatabase;
import androidx.room.Transactor;
import androidx.room.e;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.hye0;
import xsna.izs;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.zip0;

/* compiled from: DBUtil.kt */
@b6l(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 extends SuspendLambda implements wzs<Transactor, spj<Object>, Object> {
    final /* synthetic */ izs $block$inlined;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    final /* synthetic */ RoomDatabase $this_internalPerform;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* compiled from: DBUtil.kt */
    @b6l(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements wzs<zip0<Object>, spj<Object>, Object> {
        final /* synthetic */ izs $block$inlined;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(izs izsVar, spj spjVar) {
            super(2, spjVar);
            this.$block$inlined = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block$inlined, spjVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // xsna.wzs
        public final Object invoke(zip0<Object> zip0Var, spj<Object> spjVar) {
            return ((AnonymousClass1) create(zip0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
            return this.$block$inlined.invoke(((hye0) ((zip0) this.L$0)).a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(RoomDatabase roomDatabase, spj spjVar, izs izsVar, boolean z, boolean z2) {
        super(2, spjVar);
        this.$inTransaction = z;
        this.$isReadOnly = z2;
        this.$this_internalPerform = roomDatabase;
        this.$block$inlined = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(this.$this_internalPerform, spjVar, this.$block$inlined, this.$inTransaction, this.$isReadOnly);
        dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1.L$0 = obj;
        return dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1;
    }

    @Override // xsna.wzs
    public final Object invoke(Transactor transactor, spj<Object> spjVar) {
        return ((DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1) create(transactor, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        if (r9 != r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ba  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Transactor.SQLiteTransactionType sQLiteTransactionType;
        Transactor transactor;
        Transactor transactor2;
        Transactor.SQLiteTransactionType sQLiteTransactionType2;
        Transactor transactor3;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            Transactor transactor4 = (Transactor) this.L$0;
            if (!this.$inTransaction) {
                return this.$block$inlined.invoke(((hye0) transactor4).a());
            }
            boolean z = this.$isReadOnly;
            sQLiteTransactionType = z ? Transactor.SQLiteTransactionType.DEFERRED : Transactor.SQLiteTransactionType.IMMEDIATE;
            if (!z) {
                this.L$0 = transactor4;
                this.L$1 = sQLiteTransactionType;
                this.label = 1;
                Object c = transactor4.c(this);
                if (c != coroutineSingletons) {
                    transactor2 = transactor4;
                    obj = c;
                    sQLiteTransactionType2 = sQLiteTransactionType;
                }
                return coroutineSingletons;
            }
            transactor = transactor4;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block$inlined, null);
            this.L$0 = transactor;
            this.L$1 = null;
            this.label = 3;
            obj = transactor.d(sQLiteTransactionType, anonymousClass1, this);
        } else if (i == 1) {
            sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) this.L$1;
            transactor2 = (Transactor) this.L$0;
            a.a(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.L$0;
                    a.a(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        e eVar = this.$this_internalPerform.g;
                        e eVar2 = eVar != null ? eVar : null;
                        eVar2.c.e(eVar2.f, eVar2.g);
                    }
                    return obj2;
                }
                transactor = (Transactor) this.L$0;
                a.a(obj);
                if (this.$isReadOnly) {
                    return obj;
                }
                this.L$0 = obj;
                this.label = 4;
                Object c2 = transactor.c(this);
                if (c2 != coroutineSingletons) {
                    obj2 = obj;
                    obj = c2;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    return obj2;
                }
                return coroutineSingletons;
            }
            sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) this.L$1;
            transactor3 = (Transactor) this.L$0;
            a.a(obj);
            sQLiteTransactionType = sQLiteTransactionType2;
            transactor = transactor3;
            AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.$block$inlined, null);
            this.L$0 = transactor;
            this.L$1 = null;
            this.label = 3;
            obj = transactor.d(sQLiteTransactionType, anonymousClass12, this);
        }
        if (!((Boolean) obj).booleanValue()) {
            e eVar3 = this.$this_internalPerform.g;
            if (eVar3 == null) {
                eVar3 = null;
            }
            this.L$0 = transactor2;
            this.L$1 = sQLiteTransactionType2;
            this.label = 2;
            if (eVar3.c(this) != coroutineSingletons) {
                transactor3 = transactor2;
                sQLiteTransactionType = sQLiteTransactionType2;
                transactor = transactor3;
                AnonymousClass1 anonymousClass122 = new AnonymousClass1(this.$block$inlined, null);
                this.L$0 = transactor;
                this.L$1 = null;
                this.label = 3;
                obj = transactor.d(sQLiteTransactionType, anonymousClass122, this);
            }
            return coroutineSingletons;
        }
        sQLiteTransactionType = sQLiteTransactionType2;
        transactor = transactor2;
        AnonymousClass1 anonymousClass1222 = new AnonymousClass1(this.$block$inlined, null);
        this.L$0 = transactor;
        this.L$1 = null;
        this.label = 3;
        obj = transactor.d(sQLiteTransactionType, anonymousClass1222, this);
    }
}

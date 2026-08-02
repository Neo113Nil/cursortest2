package androidx.room.coroutines;

import android.database.SQLException;
import androidx.room.Transactor;
import androidx.room.coroutines.ConnectionPool;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ero0;
import xsna.g5g;
import xsna.hye0;
import xsna.hyg0;
import xsna.izs;
import xsna.mnh0;
import xsna.p4j;
import xsna.p7i;
import xsna.qyg0;
import xsna.s3q0;
import xsna.sk3;
import xsna.ui50;
import xsna.wzs;
import xsna.yfb;
import xsna.zip0;

/* compiled from: ConnectionPoolImpl.kt */
/* loaded from: classes12.dex */
public final class d implements Transactor, hye0 {
    public final p4j a;
    public final boolean b;
    public final sk3<c> c = new sk3<>();
    public final AtomicBoolean d = new AtomicBoolean(false);

    /* compiled from: ConnectionPoolImpl.kt */
    public final class a implements qyg0 {
        public final qyg0 b;
        public final long c = ero0.a();

        public a(qyg0 qyg0Var) {
            this.b = qyg0Var;
        }

        @Override // xsna.qyg0
        public final void D3(int i, String str) {
            if (d.this.d.get()) {
                p7i.g(21, "Statement is recycled");
                throw null;
            }
            if (this.c == ero0.a()) {
                this.b.D3(i, str);
            } else {
                p7i.g(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // xsna.qyg0
        public final void bindLong(int i, long j) {
            if (d.this.d.get()) {
                p7i.g(21, "Statement is recycled");
                throw null;
            }
            if (this.c == ero0.a()) {
                this.b.bindLong(i, j);
            } else {
                p7i.g(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // xsna.qyg0
        public final void bindNull(int i) {
            if (d.this.d.get()) {
                p7i.g(21, "Statement is recycled");
                throw null;
            }
            if (this.c == ero0.a()) {
                this.b.bindNull(i);
            } else {
                p7i.g(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (d.this.d.get()) {
                p7i.g(21, "Statement is recycled");
                throw null;
            }
            if (this.c == ero0.a()) {
                this.b.close();
            } else {
                p7i.g(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // xsna.qyg0
        public final int getColumnCount() {
            if (d.this.d.get()) {
                p7i.g(21, "Statement is recycled");
                throw null;
            }
            if (this.c == ero0.a()) {
                return this.b.getColumnCount();
            }
            p7i.g(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // xsna.qyg0
        public final String getColumnName(int i) {
            if (d.this.d.get()) {
                p7i.g(21, "Statement is recycled");
                throw null;
            }
            if (this.c == ero0.a()) {
                return this.b.getColumnName(i);
            }
            p7i.g(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // xsna.qyg0
        public final long getLong(int i) {
            if (d.this.d.get()) {
                p7i.g(21, "Statement is recycled");
                throw null;
            }
            if (this.c == ero0.a()) {
                return this.b.getLong(i);
            }
            p7i.g(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // xsna.qyg0
        public final boolean isNull(int i) {
            if (d.this.d.get()) {
                p7i.g(21, "Statement is recycled");
                throw null;
            }
            if (this.c == ero0.a()) {
                return this.b.isNull(i);
            }
            p7i.g(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // xsna.qyg0
        public final String l2(int i) {
            if (d.this.d.get()) {
                p7i.g(21, "Statement is recycled");
                throw null;
            }
            if (this.c == ero0.a()) {
                return this.b.l2(i);
            }
            p7i.g(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // xsna.qyg0
        public final void reset() {
            if (d.this.d.get()) {
                p7i.g(21, "Statement is recycled");
                throw null;
            }
            if (this.c == ero0.a()) {
                this.b.reset();
            } else {
                p7i.g(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // xsna.qyg0
        public final boolean step() {
            if (d.this.d.get()) {
                p7i.g(21, "Statement is recycled");
                throw null;
            }
            if (this.c == ero0.a()) {
                return this.b.step();
            }
            p7i.g(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    /* compiled from: ConnectionPoolImpl.kt */
    public final class b<T> implements zip0<T>, hye0 {
        public b() {
        }

        @Override // xsna.hye0
        public final hyg0 a() {
            return d.this.a;
        }

        @Override // xsna.nvb0
        public final Object b(String str, izs izsVar, ContinuationImpl continuationImpl) {
            return d.this.b(str, izsVar, continuationImpl);
        }
    }

    /* compiled from: ConnectionPoolImpl.kt */
    public static final class c {
        public final int a;

        public c(int i) {
            this.a = i;
        }
    }

    /* compiled from: ConnectionPoolImpl.kt */
    /* renamed from: androidx.room.coroutines.d$d, reason: collision with other inner class name */
    public /* synthetic */ class C0087d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Transactor.SQLiteTransactionType.values().length];
            try {
                iArr[Transactor.SQLiteTransactionType.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d(p4j p4jVar, boolean z) {
        this.a = p4jVar;
        this.b = z;
    }

    @Override // xsna.hye0
    public final hyg0 a() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v10, types: [xsna.ui50] */
    @Override // xsna.nvb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, izs izsVar, ContinuationImpl continuationImpl) {
        h hVar;
        int i;
        p4j p4jVar;
        d dVar;
        try {
            try {
                if (continuationImpl instanceof h) {
                    hVar = (h) continuationImpl;
                    int i2 = hVar.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        hVar.label = i2 - Integer.MIN_VALUE;
                        Object obj = hVar.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = hVar.label;
                        if (i != 0) {
                            kotlin.a.a(obj);
                            if (this.d.get()) {
                                p7i.g(21, "Connection is recycled");
                                throw null;
                            }
                            androidx.room.coroutines.a aVar = (androidx.room.coroutines.a) hVar.getContext().get(androidx.room.coroutines.a.c);
                            if (aVar == null || aVar.b != this) {
                                p7i.g(21, "Attempted to use connection on a different coroutine");
                                throw null;
                            }
                            hVar.L$0 = this;
                            hVar.L$1 = str;
                            hVar.L$2 = izsVar;
                            p4jVar = this.a;
                            hVar.L$3 = p4jVar;
                            hVar.label = 1;
                            if (p4jVar.c.b(hVar) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            dVar = this;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ?? r7 = (ui50) hVar.L$3;
                            izsVar = (izs) hVar.L$2;
                            String str2 = (String) hVar.L$1;
                            dVar = (d) hVar.L$0;
                            kotlin.a.a(obj);
                            p4jVar = r7;
                            str = str2;
                        }
                        a aVar2 = dVar.new a(dVar.a.b.V0(str));
                        Object invoke = izsVar.invoke(aVar2);
                        yfb.d(aVar2, null);
                        return invoke;
                    }
                }
                Object invoke2 = izsVar.invoke(aVar2);
                yfb.d(aVar2, null);
                return invoke2;
            } finally {
            }
            a aVar22 = dVar.new a(dVar.a.b.V0(str));
        } finally {
            p4jVar.c(null);
        }
        hVar = new h(this, continuationImpl);
        Object obj2 = hVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hVar.label;
        if (i != 0) {
        }
    }

    @Override // androidx.room.Transactor
    public final Object c(SuspendLambda suspendLambda) {
        if (this.d.get()) {
            p7i.g(21, "Connection is recycled");
            throw null;
        }
        androidx.room.coroutines.a aVar = (androidx.room.coroutines.a) suspendLambda.getContext().get(androidx.room.coroutines.a.c);
        if (aVar != null && aVar.b == this) {
            return Boolean.valueOf(!this.c.isEmpty());
        }
        p7i.g(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // androidx.room.Transactor
    public final Object d(Transactor.SQLiteTransactionType sQLiteTransactionType, wzs wzsVar, SuspendLambda suspendLambda) {
        if (this.d.get()) {
            p7i.g(21, "Connection is recycled");
            throw null;
        }
        androidx.room.coroutines.a aVar = (androidx.room.coroutines.a) suspendLambda.getContext().get(androidx.room.coroutines.a.c);
        if (aVar != null && aVar.b == this) {
            return g(sQLiteTransactionType, wzsVar, suspendLambda);
        }
        p7i.g(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:12:0x0057, B:14:0x0065, B:20:0x0075, B:21:0x00a3, B:25:0x007d, B:26:0x0082, B:27:0x0083, B:28:0x0089, B:29:0x008f), top: B:11:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:12:0x0057, B:14:0x0065, B:20:0x0075, B:21:0x00a3, B:25:0x007d, B:26:0x0082, B:27:0x0083, B:28:0x0089, B:29:0x008f), top: B:11:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v15, types: [xsna.ui50] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Transactor.SQLiteTransactionType sQLiteTransactionType, ContinuationImpl continuationImpl) {
        e eVar;
        int i;
        p4j p4jVar;
        d dVar;
        sk3<c> sk3Var;
        try {
            if (continuationImpl instanceof e) {
                eVar = (e) continuationImpl;
                int i2 = eVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = eVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = eVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        eVar.L$0 = this;
                        eVar.L$1 = sQLiteTransactionType;
                        p4jVar = this.a;
                        eVar.L$2 = p4jVar;
                        eVar.label = 1;
                        if (p4jVar.c.b(eVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        dVar = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r8 = (ui50) eVar.L$2;
                        Transactor.SQLiteTransactionType sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) eVar.L$1;
                        dVar = (d) eVar.L$0;
                        kotlin.a.a(obj);
                        p4jVar = r8;
                        sQLiteTransactionType = sQLiteTransactionType2;
                    }
                    sk3Var = dVar.c;
                    p4j p4jVar2 = dVar.a;
                    int size = sk3Var.size();
                    if (sk3Var.isEmpty()) {
                        p7i.e(p4jVar2, "SAVEPOINT '" + size + '\'');
                    } else {
                        int i3 = C0087d.$EnumSwitchMapping$0[sQLiteTransactionType.ordinal()];
                        if (i3 == 1) {
                            p7i.e(p4jVar2, "BEGIN DEFERRED TRANSACTION");
                        } else if (i3 == 2) {
                            p7i.e(p4jVar2, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (i3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            p7i.e(p4jVar2, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                    }
                    sk3Var.addLast(new c(size));
                    s3q0 s3q0Var = s3q0.a;
                    p4jVar.c(null);
                    return s3q0Var;
                }
            }
            sk3Var = dVar.c;
            p4j p4jVar22 = dVar.a;
            int size2 = sk3Var.size();
            if (sk3Var.isEmpty()) {
            }
            sk3Var.addLast(new c(size2));
            s3q0 s3q0Var2 = s3q0.a;
            p4jVar.c(null);
            return s3q0Var2;
        } catch (Throwable th) {
            p4jVar.c(null);
            throw th;
        }
        eVar = new e(this, continuationImpl);
        Object obj2 = eVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eVar.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:12:0x0056, B:14:0x0060, B:16:0x006a, B:18:0x0073, B:19:0x00b0, B:23:0x007b, B:24:0x0090, B:26:0x0096, B:27:0x009c, B:28:0x00b6, B:29:0x00bd), top: B:11:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6 A[Catch: all -> 0x0079, TRY_ENTER, TryCatch #0 {all -> 0x0079, blocks: (B:12:0x0056, B:14:0x0060, B:16:0x006a, B:18:0x0073, B:19:0x00b0, B:23:0x007b, B:24:0x0090, B:26:0x0096, B:27:0x009c, B:28:0x00b6, B:29:0x00bd), top: B:11:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z, ContinuationImpl continuationImpl) {
        f fVar;
        int i;
        d dVar;
        ui50 ui50Var;
        sk3<c> sk3Var;
        try {
            if (continuationImpl instanceof f) {
                fVar = (f) continuationImpl;
                int i2 = fVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = fVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = fVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        fVar.L$0 = this;
                        p4j p4jVar = this.a;
                        fVar.L$1 = p4jVar;
                        fVar.Z$0 = z;
                        fVar.label = 1;
                        if (p4jVar.c.b(fVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        dVar = this;
                        ui50Var = p4jVar;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = fVar.Z$0;
                        ui50Var = (ui50) fVar.L$1;
                        dVar = (d) fVar.L$0;
                        kotlin.a.a(obj);
                    }
                    sk3Var = dVar.c;
                    p4j p4jVar2 = dVar.a;
                    if (!sk3Var.isEmpty()) {
                        throw new IllegalStateException("Not in a transaction");
                    }
                    c cVar = (c) g5g.I(sk3Var);
                    if (z) {
                        cVar.getClass();
                        if (sk3Var.isEmpty()) {
                            p7i.e(p4jVar2, "END TRANSACTION");
                        } else {
                            p7i.e(p4jVar2, "RELEASE SAVEPOINT '" + cVar.a + '\'');
                        }
                    } else if (sk3Var.isEmpty()) {
                        p7i.e(p4jVar2, "ROLLBACK TRANSACTION");
                    } else {
                        p7i.e(p4jVar2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + cVar.a + '\'');
                    }
                    s3q0 s3q0Var = s3q0.a;
                    ui50Var.c(null);
                    return s3q0Var;
                }
            }
            sk3Var = dVar.c;
            p4j p4jVar22 = dVar.a;
            if (!sk3Var.isEmpty()) {
            }
        } catch (Throwable th) {
            ui50Var.c(null);
            throw th;
        }
        fVar = new f(this, continuationImpl);
        Object obj2 = fVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fVar.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|(1:(1:(1:(2:25|26)(1:(2:13|14)(4:16|17|18|19)))(6:27|28|29|(1:31)|32|(1:35)(1:34)))(1:58))(5:66|(1:68)|69|(1:71)|35)|59|60|(4:62|(0)|32|(0))|35))|72|6|(0)(0)|59|60|(0)|35|(2:(1:54)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        r12 = r12.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        r0.L$0 = r12;
        r0.L$1 = null;
        r0.label = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
    
        if (r13.f(false, r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c0, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c1, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c2, code lost:
    
        r9 = r12;
        r12 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
    
        r0.L$0 = r9;
        r0.L$1 = r12;
        r0.label = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ce, code lost:
    
        if (r13.f(false, r0) != r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d1, code lost:
    
        r14 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d2, code lost:
    
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a2, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a3, code lost:
    
        r13 = r12;
        r12 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #5 {all -> 0x00be, blocks: (B:39:0x00a6, B:41:0x00aa), top: B:38:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Transactor.SQLiteTransactionType sQLiteTransactionType, wzs wzsVar, ContinuationImpl continuationImpl) {
        g gVar;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        d dVar;
        d dVar2;
        int i2;
        boolean z;
        if (continuationImpl instanceof g) {
            gVar = (g) continuationImpl;
            int i3 = gVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.label = i3 - Integer.MIN_VALUE;
                obj = gVar.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gVar.label;
                ConnectionPool.RollbackException rollbackException = null;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (sQLiteTransactionType == null) {
                        sQLiteTransactionType = Transactor.SQLiteTransactionType.DEFERRED;
                    }
                    gVar.L$0 = this;
                    gVar.L$1 = wzsVar;
                    gVar.label = 1;
                    if (e(sQLiteTransactionType, gVar) != coroutineSingletons) {
                        dVar = this;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        i2 = gVar.I$0;
                        dVar2 = (d) gVar.L$0;
                        try {
                            kotlin.a.a(obj);
                            z = i2 != 0;
                            gVar.L$0 = obj;
                            gVar.label = 3;
                        } catch (Throwable th) {
                            ConnectionPool.RollbackException th2 = th;
                            try {
                                if (!(th2 instanceof ConnectionPool.RollbackException)) {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        return dVar2.f(z, gVar) != coroutineSingletons ? coroutineSingletons : obj;
                    }
                    if (i == 3 || i == 4) {
                        Object obj2 = gVar.L$0;
                        kotlin.a.a(obj);
                        return obj2;
                    }
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) gVar.L$1;
                    Throwable th4 = (Throwable) gVar.L$0;
                    try {
                        kotlin.a.a(obj);
                    } catch (SQLException e) {
                        e = e;
                        if (th4 != null) {
                            throw e;
                        }
                        mnh0.d(th4, e);
                        throw th;
                    }
                    throw th;
                }
                wzsVar = (wzs) gVar.L$1;
                dVar = (d) gVar.L$0;
                kotlin.a.a(obj);
                b bVar = dVar.new b();
                gVar.L$0 = dVar;
                gVar.L$1 = null;
                gVar.I$0 = 1;
                gVar.label = 2;
                obj = wzsVar.invoke(bVar, gVar);
                if (obj != coroutineSingletons) {
                    dVar2 = dVar;
                    i2 = 1;
                    if (i2 != 0) {
                    }
                    gVar.L$0 = obj;
                    gVar.label = 3;
                    if (dVar2.f(z, gVar) != coroutineSingletons) {
                    }
                }
            }
        }
        gVar = new g(this, continuationImpl);
        obj = gVar.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gVar.label;
        ConnectionPool.RollbackException rollbackException2 = null;
        if (i != 0) {
        }
        b bVar2 = dVar.new b();
        gVar.L$0 = dVar;
        gVar.L$1 = null;
        gVar.I$0 = 1;
        gVar.label = 2;
        obj = wzsVar.invoke(bVar2, gVar);
        if (obj != coroutineSingletons) {
        }
    }
}

package m2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 implements k2.c0, e0 {

    /* renamed from: a, reason: collision with root package name */
    public final y8.d f20202a;

    /* renamed from: b, reason: collision with root package name */
    public final j f20203b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20204c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.collections.l f20205d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f20206e;

    public d0(y8.d connectionElementKey, j delegate, boolean z5) {
        Intrinsics.checkNotNullParameter(connectionElementKey, "connectionElementKey");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f20202a = connectionElementKey;
        this.f20203b = delegate;
        this.f20204c = z5;
        this.f20205d = new kotlin.collections.l();
    }

    @Override // k2.c0
    public final Boolean a(Continuation continuation) {
        if (this.f20206e) {
            h8.b.C(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) ((mf.c) continuation).getContext().r(this.f20202a);
        if (aVar != null && aVar.f20179b == this) {
            return Boolean.valueOf(!this.f20205d.isEmpty() || this.f20203b.f20234a.j());
        }
        h8.b.C(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // k2.c0
    public final Object b(k2.b0 b0Var, Function2 function2, mf.i iVar) {
        if (this.f20206e) {
            h8.b.C(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) iVar.getContext().r(this.f20202a);
        if (aVar != null && aVar.f20179b == this) {
            return g(b0Var, function2, iVar);
        }
        h8.b.C(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // k2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Function1 function1, mf.c cVar) {
        c0 c0Var;
        int i5;
        j jVar;
        try {
            try {
                if (cVar instanceof c0) {
                    c0Var = (c0) cVar;
                    int i10 = c0Var.f20199f;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0Var.f20199f = i10 - Integer.MIN_VALUE;
                        Object obj = c0Var.f20197d;
                        lf.a aVar = lf.a.f20034a;
                        i5 = c0Var.f20199f;
                        if (i5 != 0) {
                            h8.b.B(obj);
                            if (this.f20206e) {
                                h8.b.C(21, "Connection is recycled");
                                throw null;
                            }
                            a aVar2 = (a) c0Var.getContext().r(this.f20202a);
                            if (aVar2 == null || aVar2.f20179b != this) {
                                h8.b.C(21, "Attempted to use connection on a different coroutine");
                                throw null;
                            }
                            jVar = this.f20203b;
                            c0Var.f20194a = str;
                            c0Var.f20195b = function1;
                            c0Var.f20196c = jVar;
                            c0Var.f20199f = 1;
                            if (jVar.f20235b.c(c0Var) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j jVar2 = c0Var.f20196c;
                            function1 = c0Var.f20195b;
                            String str2 = c0Var.f20194a;
                            h8.b.B(obj);
                            jVar = jVar2;
                            str = str2;
                        }
                        x xVar = new x(this, this.f20203b.r0(str));
                        Object invoke = function1.invoke(xVar);
                        u6.h.g(xVar, null);
                        return invoke;
                    }
                }
                Object invoke2 = function1.invoke(xVar);
                u6.h.g(xVar, null);
                return invoke2;
            } finally {
            }
            x xVar2 = new x(this, this.f20203b.r0(str));
        } finally {
            jVar.k(null);
        }
        c0Var = new c0(this, cVar);
        Object obj2 = c0Var.f20197d;
        lf.a aVar3 = lf.a.f20034a;
        i5 = c0Var.f20199f;
        if (i5 != 0) {
        }
    }

    @Override // m2.e0
    public final s2.a d() {
        return this.f20203b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:12:0x004f, B:14:0x0057, B:19:0x0062, B:20:0x0090, B:24:0x006a, B:25:0x006f, B:26:0x0070, B:27:0x0076, B:28:0x007c), top: B:11:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:12:0x004f, B:14:0x0057, B:19:0x0062, B:20:0x0090, B:24:0x006a, B:25:0x006f, B:26:0x0070, B:27:0x0076, B:28:0x007c), top: B:11:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(k2.b0 b0Var, mf.c cVar) {
        z zVar;
        int i5;
        j jVar;
        kotlin.collections.l lVar = this.f20205d;
        try {
            if (cVar instanceof z) {
                zVar = (z) cVar;
                int i10 = zVar.f20300e;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    zVar.f20300e = i10 - Integer.MIN_VALUE;
                    Object obj = zVar.f20298c;
                    lf.a aVar = lf.a.f20034a;
                    i5 = zVar.f20300e;
                    j jVar2 = this.f20203b;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        zVar.f20296a = b0Var;
                        zVar.f20297b = jVar2;
                        zVar.f20300e = 1;
                        if (jVar2.f20235b.c(zVar) == aVar) {
                            return aVar;
                        }
                        jVar = jVar2;
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j jVar3 = zVar.f20297b;
                        k2.b0 b0Var2 = zVar.f20296a;
                        h8.b.B(obj);
                        jVar = jVar3;
                        b0Var = b0Var2;
                    }
                    int i11 = lVar.f19213c;
                    if (lVar.isEmpty()) {
                        h8.b.l(jVar2, "SAVEPOINT '" + i11 + '\'');
                    } else {
                        int ordinal = b0Var.ordinal();
                        if (ordinal == 0) {
                            h8.b.l(jVar2, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            h8.b.l(jVar2, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                throw new gf.m();
                            }
                            h8.b.l(jVar2, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                    }
                    lVar.addLast(new y(i11));
                    Unit unit = Unit.f19194a;
                    jVar.k(null);
                    return unit;
                }
            }
            int i112 = lVar.f19213c;
            if (lVar.isEmpty()) {
            }
            lVar.addLast(new y(i112));
            Unit unit2 = Unit.f19194a;
            jVar.k(null);
            return unit2;
        } catch (Throwable th2) {
            jVar.k(null);
            throw th2;
        }
        zVar = new z(this, cVar);
        Object obj2 = zVar.f20298c;
        lf.a aVar2 = lf.a.f20034a;
        i5 = zVar.f20300e;
        j jVar22 = this.f20203b;
        if (i5 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:12:0x004f, B:14:0x0055, B:16:0x005f, B:18:0x0068, B:19:0x00a5, B:23:0x0070, B:24:0x0085, B:26:0x008b, B:27:0x0091, B:28:0x00ab, B:29:0x00b2), top: B:11:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab A[Catch: all -> 0x006e, TRY_ENTER, TryCatch #0 {all -> 0x006e, blocks: (B:12:0x004f, B:14:0x0055, B:16:0x005f, B:18:0x0068, B:19:0x00a5, B:23:0x0070, B:24:0x0085, B:26:0x008b, B:27:0x0091, B:28:0x00ab, B:29:0x00b2), top: B:11:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z5, mf.c cVar) {
        a0 a0Var;
        int i5;
        j jVar;
        kotlin.collections.l lVar = this.f20205d;
        try {
            if (cVar instanceof a0) {
                a0Var = (a0) cVar;
                int i10 = a0Var.f20184e;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    a0Var.f20184e = i10 - Integer.MIN_VALUE;
                    Object obj = a0Var.f20182c;
                    lf.a aVar = lf.a.f20034a;
                    i5 = a0Var.f20184e;
                    j jVar2 = this.f20203b;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        a0Var.f20181b = jVar2;
                        a0Var.f20180a = z5;
                        a0Var.f20184e = 1;
                        if (jVar2.f20235b.c(a0Var) == aVar) {
                            return aVar;
                        }
                        jVar = jVar2;
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z5 = a0Var.f20180a;
                        jVar = a0Var.f20181b;
                        h8.b.B(obj);
                    }
                    if (!lVar.isEmpty()) {
                        throw new IllegalStateException("Not in a transaction");
                    }
                    y yVar = (y) kotlin.collections.z.s(lVar);
                    if (z5) {
                        yVar.getClass();
                        if (lVar.isEmpty()) {
                            h8.b.l(jVar2, "END TRANSACTION");
                        } else {
                            h8.b.l(jVar2, "RELEASE SAVEPOINT '" + yVar.f20295a + '\'');
                        }
                    } else if (lVar.isEmpty()) {
                        h8.b.l(jVar2, "ROLLBACK TRANSACTION");
                    } else {
                        h8.b.l(jVar2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + yVar.f20295a + '\'');
                    }
                    Unit unit = Unit.f19194a;
                    jVar.k(null);
                    return unit;
                }
            }
            if (!lVar.isEmpty()) {
            }
        } catch (Throwable th2) {
            jVar.k(null);
            throw th2;
        }
        a0Var = new a0(this, cVar);
        Object obj2 = a0Var.f20182c;
        lf.a aVar2 = lf.a.f20034a;
        i5 = a0Var.f20184e;
        j jVar22 = this.f20203b;
        if (i5 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(1:(2:21|22)(1:(2:15|16)(3:18|19|20)))(5:23|24|(1:26)|27|(1:30)(1:29)))(1:32))(3:36|(1:38)|39)|33|(4:35|(0)|27|(0))|30))|53|6|7|(0)(0)|33|(0)|30|(3:(0)|(1:49)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006c, code lost:
    
        if (e(r9, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0043, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        if (r10 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        gf.d.a(r10, r11);
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009f, code lost:
    
        if (f(false, r0) != r1) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, m2.d0] */
    /* JADX WARN: Type inference failed for: r9v13, types: [int] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(k2.b0 th2, Function2 function2, mf.c cVar) {
        b0 b0Var;
        Object obj;
        lf.a aVar;
        int i5;
        ?? r92;
        Function2 function22;
        try {
            if (cVar instanceof b0) {
                b0Var = (b0) cVar;
                int i10 = b0Var.f20190f;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    b0Var.f20190f = i10 - Integer.MIN_VALUE;
                    obj = b0Var.f20188d;
                    aVar = lf.a.f20034a;
                    i5 = b0Var.f20190f;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        k2.b0 b0Var2 = th2;
                        if (th2 == null) {
                            b0Var2 = k2.b0.f18650a;
                        }
                        b0Var.f20185a = function2;
                        b0Var.f20190f = 1;
                        function22 = function2;
                    } else {
                        if (i5 != 1) {
                            if (i5 == 2) {
                                ?? r93 = b0Var.f20187c;
                                h8.b.B(obj);
                                th2 = r93;
                                function2 = function2;
                                boolean z5 = th2 != null;
                                b0Var.f20185a = obj;
                                b0Var.f20190f = 3;
                                return f(z5, b0Var) != aVar ? aVar : obj;
                            }
                            if (i5 == 3 || i5 == 4) {
                                Object obj2 = b0Var.f20185a;
                                h8.b.B(obj);
                                return obj2;
                            }
                            if (i5 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th3 = b0Var.f20186b;
                            h8.b.B(obj);
                            r92 = th3;
                            throw r92;
                        }
                        Function2 function23 = (Function2) b0Var.f20185a;
                        h8.b.B(obj);
                        function22 = function23;
                    }
                    l lVar = new l(1, this);
                    b0Var.f20185a = null;
                    b0Var.f20187c = 1;
                    b0Var.f20190f = 2;
                    obj = function22.invoke(lVar, b0Var);
                    if (obj != aVar) {
                        th2 = 1;
                        function2 = function22;
                        if (th2 != null) {
                        }
                        b0Var.f20185a = obj;
                        b0Var.f20190f = 3;
                        if (f(z5, b0Var) != aVar) {
                        }
                    }
                }
            }
            if (i5 != 0) {
            }
            l lVar2 = new l(1, this);
            b0Var.f20185a = null;
            b0Var.f20187c = 1;
            b0Var.f20190f = 2;
            obj = function22.invoke(lVar2, b0Var);
            if (obj != aVar) {
            }
        } catch (Throwable th4) {
            th2 = th4;
            function2 = th2;
            try {
                throw function2;
            } catch (Throwable th5) {
                b0Var.f20185a = function2;
                b0Var.f20186b = th5;
                b0Var.f20190f = 5;
                r92 = th5;
            }
        }
        b0Var = new b0(this, cVar);
        obj = b0Var.f20188d;
        aVar = lf.a.f20034a;
        i5 = b0Var.f20190f;
    }
}

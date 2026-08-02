package I0;

import Wh.a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p implements F {

    /* renamed from: a, reason: collision with root package name */
    public final File f5272a;

    /* renamed from: b, reason: collision with root package name */
    public final A f5273b;

    /* renamed from: c, reason: collision with root package name */
    public final t f5274c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f5275d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f5276e;

    /* renamed from: f, reason: collision with root package name */
    public final Wh.a f5277f;

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f5278n;

        /* renamed from: o, reason: collision with root package name */
        public Object f5279o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f5280p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f5281q;

        /* renamed from: s, reason: collision with root package name */
        public int f5283s;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5281q = obj;
            this.f5283s |= Integer.MIN_VALUE;
            return p.this.d(null, this);
        }
    }

    public static final class b extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f5284n;

        /* renamed from: o, reason: collision with root package name */
        public Object f5285o;

        /* renamed from: p, reason: collision with root package name */
        public Object f5286p;

        /* renamed from: q, reason: collision with root package name */
        public Object f5287q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f5288r;

        /* renamed from: t, reason: collision with root package name */
        public int f5290t;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5288r = obj;
            this.f5290t |= Integer.MIN_VALUE;
            return p.this.b(null, this);
        }
    }

    public p(File file, A serializer, t coordinator, Function0 onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.f5272a = file;
        this.f5273b = serializer;
        this.f5274c = coordinator;
        this.f5275d = onClose;
        this.f5276e = new AtomicBoolean(false);
        this.f5277f = Wh.g.b(false, 1, null);
    }

    private final void f() {
        if (this.f5276e.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(7:(2:3|(11:5|6|7|(1:(1:(8:11|12|13|14|15|16|17|(5:19|(2:24|25)|27|28|29)(1:30))(2:41|42))(1:43))(3:61|(1:63)|50)|44|45|46|47|48|(6:51|14|15|16|17|(0)(0))|50))|45|46|47|48|(0)|50)|69|6|7|(0)(0)|44|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f2, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f3, code lost:
    
        r11 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:19:0x00bb, B:21:0x00c1, B:24:0x00ca, B:25:0x00ef, B:27:0x00f5, B:30:0x00fd, B:57:0x010c, B:59:0x0112, B:60:0x0115, B:37:0x010a, B:40:0x0107, B:44:0x007a, B:46:0x0096), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:19:0x00bb, B:21:0x00c1, B:24:0x00ca, B:25:0x00ef, B:27:0x00f5, B:30:0x00fd, B:57:0x010c, B:59:0x0112, B:60:0x0115, B:37:0x010a, B:40:0x0107, B:44:0x007a, B:46:0x0096), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [Wh.a, int] */
    @Override // I0.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(Function2 function2, Continuation continuation) {
        b bVar;
        Object coroutine_suspended;
        ?? r22;
        File file;
        p pVar;
        Wh.a aVar;
        q qVar;
        Throwable th2;
        InterfaceC1338c interfaceC1338c;
        File file2;
        p pVar2;
        try {
            try {
                try {
                    if (continuation instanceof b) {
                        bVar = (b) continuation;
                        int i10 = bVar.f5290t;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            bVar.f5290t = i10 - Integer.MIN_VALUE;
                            Object obj = bVar.f5288r;
                            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            r22 = bVar.f5290t;
                            if (r22 != 0) {
                                ResultKt.throwOnFailure(obj);
                                f();
                                g(this.f5272a);
                                Wh.a aVar2 = this.f5277f;
                                bVar.f5284n = this;
                                bVar.f5285o = function2;
                                bVar.f5286p = aVar2;
                                bVar.f5290t = 1;
                                if (aVar2.f(null, bVar) != coroutine_suspended) {
                                    pVar = this;
                                    aVar = aVar2;
                                }
                                return coroutine_suspended;
                            }
                            if (r22 != 1) {
                                if (r22 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                interfaceC1338c = (InterfaceC1338c) bVar.f5287q;
                                file2 = (File) bVar.f5286p;
                                aVar = (Wh.a) bVar.f5285o;
                                pVar2 = (p) bVar.f5284n;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    Unit unit = Unit.INSTANCE;
                                    try {
                                        interfaceC1338c.close();
                                        th = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (file2.exists() && !m.a(file2, pVar2.f5272a)) {
                                        throw new IOException("Unable to rename " + file2 + " to " + pVar2.f5272a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                    aVar.g(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    try {
                                        interfaceC1338c.close();
                                    } catch (Throwable th5) {
                                        ExceptionsKt.addSuppressed(th2, th5);
                                    }
                                    throw th2;
                                }
                            }
                            Wh.a aVar3 = (Wh.a) bVar.f5286p;
                            Function2 function22 = (Function2) bVar.f5285o;
                            pVar = (p) bVar.f5284n;
                            ResultKt.throwOnFailure(obj);
                            aVar = aVar3;
                            function2 = function22;
                            file = new File(pVar.f5272a.getAbsolutePath() + ".tmp");
                            qVar = new q(file, pVar.f5273b);
                            bVar.f5284n = pVar;
                            bVar.f5285o = aVar;
                            bVar.f5286p = file;
                            bVar.f5287q = qVar;
                            bVar.f5290t = 2;
                            if (function2.invoke(qVar, bVar) != coroutine_suspended) {
                                file2 = file;
                                pVar2 = pVar;
                                interfaceC1338c = qVar;
                                Unit unit3 = Unit.INSTANCE;
                                interfaceC1338c.close();
                                th = null;
                                if (th == null) {
                                }
                            }
                            return coroutine_suspended;
                        }
                    }
                    bVar.f5284n = pVar;
                    bVar.f5285o = aVar;
                    bVar.f5286p = file;
                    bVar.f5287q = qVar;
                    bVar.f5290t = 2;
                    if (function2.invoke(qVar, bVar) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (Throwable th6) {
                    th2 = th6;
                    interfaceC1338c = qVar;
                    interfaceC1338c.close();
                    throw th2;
                }
                qVar = new q(file, pVar.f5273b);
            } catch (IOException e10) {
                e = e10;
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
            if (r22 != 0) {
            }
            file = new File(pVar.f5272a.getAbsolutePath() + ".tmp");
        } catch (Throwable th7) {
            r22.g(null);
            throw th7;
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f5288r;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r22 = bVar.f5290t;
    }

    @Override // I0.InterfaceC1338c
    public void close() {
        this.f5276e.set(true);
        this.f5275d.invoke();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(6:34|35|36|38|39|(1:41)(1:42))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:21:0x007b, B:28:0x008c, B:31:0x0089, B:27:0x0084), top: B:7:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14, types: [I0.p] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [I0.p$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [I0.p] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // I0.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(Function3 function3, Continuation continuation) {
        ?? r02;
        int i10;
        Throwable th2;
        InterfaceC1338c interfaceC1338c;
        boolean z10;
        p pVar;
        try {
            if (continuation instanceof a) {
                a aVar = (a) continuation;
                int i11 = aVar.f5283s;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f5283s = i11 - Integer.MIN_VALUE;
                    r02 = aVar;
                    Object obj = r02.f5281q;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = r02.f5283s;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        f();
                        boolean a10 = a.C0274a.a(this.f5277f, null, 1, null);
                        try {
                            n nVar = new n(this.f5272a, this.f5273b);
                            try {
                                Boolean boxBoolean = Boxing.boxBoolean(a10);
                                r02.f5278n = this;
                                r02.f5279o = nVar;
                                r02.f5280p = a10;
                                r02.f5283s = 1;
                                Object invoke = function3.invoke(nVar, boxBoolean, r02);
                                if (invoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj = invoke;
                                z10 = a10;
                                pVar = this;
                                interfaceC1338c = nVar;
                            } catch (Throwable th3) {
                                th2 = th3;
                                function3 = a10;
                                r02 = this;
                                interfaceC1338c = nVar;
                                interfaceC1338c.close();
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            function3 = a10;
                            r02 = this;
                            if (function3 != 0) {
                            }
                            throw th;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function3 = r02.f5280p;
                        interfaceC1338c = (InterfaceC1338c) r02.f5279o;
                        r02 = (p) r02.f5278n;
                        try {
                            ResultKt.throwOnFailure(obj);
                            pVar = r02;
                            z10 = function3;
                        } catch (Throwable th5) {
                            th2 = th5;
                            try {
                                interfaceC1338c.close();
                            } catch (Throwable th6) {
                                ExceptionsKt.addSuppressed(th2, th6);
                            }
                            throw th2;
                        }
                    }
                    interfaceC1338c.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z10) {
                        a.C0274a.b(pVar.f5277f, null, 1, null);
                    }
                    return obj;
                }
            }
            if (i10 != 0) {
            }
            interfaceC1338c.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th7) {
            th = th7;
            if (function3 != 0) {
                a.C0274a.b(r02.f5277f, null, 1, null);
            }
            throw th;
        }
        r02 = new a(continuation);
        Object obj2 = r02.f5281q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = r02.f5283s;
    }

    @Override // I0.F
    public t e() {
        return this.f5274c;
    }

    public final void g(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }
}

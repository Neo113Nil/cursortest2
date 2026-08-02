package I0;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class n implements y {

    /* renamed from: a, reason: collision with root package name */
    public final File f5256a;

    /* renamed from: b, reason: collision with root package name */
    public final A f5257b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f5258c;

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f5259n;

        /* renamed from: o, reason: collision with root package name */
        public Object f5260o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f5261p;

        /* renamed from: r, reason: collision with root package name */
        public int f5263r;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5261p = obj;
            this.f5263r |= Integer.MIN_VALUE;
            return n.i(n.this, this);
        }
    }

    public n(File file, A serializer) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f5256a = file;
        this.f5257b = serializer;
        this.f5258c = new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(7:40|41|42|43|44|(1:46)|47)|30|31))|66|6|7|(0)(0)|30|31|(3:(1:36)|(1:21)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x006f, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [I0.n] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object i(n nVar, Continuation continuation) {
        a aVar;
        ?? r22;
        Throwable th2;
        Closeable closeable;
        Closeable closeable2;
        Throwable th3;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f5263r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f5263r = i10 - Integer.MIN_VALUE;
                Object obj = aVar.f5261p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r22 = aVar.f5263r;
                if (r22 != 0) {
                    ResultKt.throwOnFailure(obj);
                    nVar.f();
                    try {
                        FileInputStream fileInputStream = new FileInputStream(nVar.f5256a);
                        try {
                            A a10 = nVar.f5257b;
                            aVar.f5259n = nVar;
                            aVar.f5260o = fileInputStream;
                            aVar.f5263r = 1;
                            Object b10 = a10.b(fileInputStream, aVar);
                            if (b10 != coroutine_suspended) {
                                closeable2 = fileInputStream;
                                obj = b10;
                            }
                        } catch (Throwable th4) {
                            r22 = nVar;
                            closeable2 = fileInputStream;
                            th3 = th4;
                            throw th2;
                        }
                    } catch (FileNotFoundException unused) {
                        if (!nVar.f5256a.exists()) {
                            return nVar.f5257b.getDefaultValue();
                        }
                        FileInputStream fileInputStream2 = new FileInputStream(nVar.f5256a);
                        try {
                            A a11 = nVar.f5257b;
                            aVar.f5259n = fileInputStream2;
                            aVar.f5260o = null;
                            aVar.f5263r = 2;
                            Object b11 = a11.b(fileInputStream2, aVar);
                            if (b11 != coroutine_suspended) {
                                obj = b11;
                                closeable = fileInputStream2;
                                CloseableKt.closeFinally(closeable, null);
                                return obj;
                            }
                            return coroutine_suspended;
                        } catch (Throwable th5) {
                            th2 = th5;
                            closeable = fileInputStream2;
                            throw th2;
                        }
                    }
                    return coroutine_suspended;
                }
                if (r22 != 1) {
                    if (r22 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable = (Closeable) aVar.f5259n;
                    try {
                        ResultKt.throwOnFailure(obj);
                        CloseableKt.closeFinally(closeable, null);
                        return obj;
                    } catch (Throwable th6) {
                        th2 = th6;
                        try {
                            throw th2;
                        } finally {
                        }
                    }
                }
                closeable2 = (Closeable) aVar.f5260o;
                r22 = (n) aVar.f5259n;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th7) {
                    th3 = th7;
                    try {
                        throw th2;
                    } finally {
                    }
                }
                CloseableKt.closeFinally(closeable2, null);
                return obj;
            }
        }
        aVar = nVar.new a(continuation);
        Object obj2 = aVar.f5261p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r22 = aVar.f5263r;
        if (r22 != 0) {
        }
        CloseableKt.closeFinally(closeable2, null);
        return obj2;
    }

    @Override // I0.y
    public Object c(Continuation continuation) {
        return i(this, continuation);
    }

    @Override // I0.InterfaceC1338c
    public void close() {
        this.f5258c.set(true);
    }

    public final void f() {
        if (this.f5258c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    public final File g() {
        return this.f5256a;
    }

    public final A h() {
        return this.f5257b;
    }
}

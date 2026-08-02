package I0;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q extends n implements K {

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f5291n;

        /* renamed from: o, reason: collision with root package name */
        public Object f5292o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f5293p;

        /* renamed from: r, reason: collision with root package name */
        public int f5295r;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5293p = obj;
            this.f5295r |= Integer.MIN_VALUE;
            return q.this.a(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(File file, A serializer) {
        super(file, serializer);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // I0.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Object obj, Continuation continuation) {
        a aVar;
        int i10;
        Closeable closeable;
        FileOutputStream fileOutputStream;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f5295r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f5295r = i11 - Integer.MIN_VALUE;
                Object obj2 = aVar.f5293p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar.f5295r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    f();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(g());
                    try {
                        A h10 = h();
                        I i12 = new I(fileOutputStream2);
                        aVar.f5291n = fileOutputStream2;
                        aVar.f5292o = fileOutputStream2;
                        aVar.f5295r = 1;
                        if (h10.a(obj, i12, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        fileOutputStream = fileOutputStream2;
                        closeable = fileOutputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = fileOutputStream2;
                        throw th;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream = (FileOutputStream) aVar.f5292o;
                    closeable = (Closeable) aVar.f5291n;
                    try {
                        ResultKt.throwOnFailure(obj2);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            CloseableKt.closeFinally(closeable, th);
                            throw th4;
                        }
                    }
                }
                fileOutputStream.getFD().sync();
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(closeable, null);
                return Unit.INSTANCE;
            }
        }
        aVar = new a(continuation);
        Object obj22 = aVar.f5293p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f5295r;
        if (i10 != 0) {
        }
        fileOutputStream.getFD().sync();
        Unit unit2 = Unit.INSTANCE;
        CloseableKt.closeFinally(closeable, null);
        return Unit.INSTANCE;
    }
}

package xd;

import android.util.Log;
import com.zoho.livechat.android.utils.LiveChatUtil;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import qd.c;

/* renamed from: xd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6821a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6821a f68119a = new C6821a();

    /* renamed from: xd.a$a, reason: collision with other inner class name */
    public static final class C0970a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f68120n;

        /* renamed from: p, reason: collision with root package name */
        public int f68122p;

        public C0970a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f68120n = obj;
            this.f68122p |= Integer.MIN_VALUE;
            return C6821a.this.a(this);
        }
    }

    /* renamed from: xd.a$b */
    public static final class b extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Continuation f68123d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation) {
            super(1);
            this.f68123d = continuation;
        }

        public final void a(Boolean bool) {
            LiveChatUtil.log("WmsConnection, awaitForWmsConnection, connected: " + bool);
            this.f68123d.resumeWith(Result.m147constructorimpl(bool));
            LiveChatUtil.log("WmsConnection, awaitForWmsConnection, resume");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Boolean) obj);
            return Unit.INSTANCE;
        }
    }

    public static final Object b(Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        rd.b.n(new b(safeContinuation));
        LiveChatUtil.log("WmsConnection, awaitForWmsConnection, not connected, connectToWMS");
        rd.b.b();
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        C0970a c0970a;
        int i10;
        boolean z10;
        if (continuation instanceof C0970a) {
            c0970a = (C0970a) continuation;
            int i11 = c0970a.f68122p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0970a.f68122p = i11 - Integer.MIN_VALUE;
                Object obj = c0970a.f68120n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0970a.f68122p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    LiveChatUtil.log("WmsConnection, awaitForWmsConnection " + Log.getStackTraceString(new Throwable()));
                    if (c.k()) {
                        z10 = false;
                        return Boxing.boxBoolean(z10);
                    }
                    c0970a.f68122p = 1;
                    obj = b(c0970a);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        z10 = ((Boolean) obj).booleanValue();
                        return Boxing.boxBoolean(z10);
                    }
                    ResultKt.throwOnFailure(obj);
                }
                z10 = ((Boolean) obj).booleanValue();
                if (!z10) {
                    LiveChatUtil.log("WmsConnection, awaitForWmsConnectionStatus, not connected - fallback, connectToWMS");
                    c0970a.f68122p = 2;
                    obj = b(c0970a);
                }
                return Boxing.boxBoolean(z10);
            }
        }
        c0970a = new C0970a(continuation);
        Object obj2 = c0970a.f68120n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c0970a.f68122p;
        if (i10 != 0) {
        }
        z10 = ((Boolean) obj2).booleanValue();
        if (!z10) {
        }
        return Boxing.boxBoolean(z10);
    }
}

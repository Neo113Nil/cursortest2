package ai.verisoul.sdk;

import Ph.AbstractC1455i;
import Ph.C0;
import Ph.C1452g0;
import Ph.M0;
import Ph.P;
import Ph.Q;
import Ph.f1;
import Ph.h1;
import ai.verisoul.sdk.helpers.webview.VerisoulSessionCallback;
import ai.verisoul.sdk.logger.Logger;
import com.plaid.internal.EnumC3631g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.Core$getSessionId$1", f = "Core.kt", i = {0}, l = {130, 215, 218, EnumC3631g.SDK_ASSET_ICON_SUBMIT_VALUE}, m = "invokeSuspend", n = {"lastError"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class Core$getSessionId$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ VerisoulSessionCallback $callback;
    final /* synthetic */ int $maxAttempts;
    Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "ai.verisoul.sdk.Core$getSessionId$1$1", f = "Core.kt", i = {0, 1, 1, 2, 2, 5, 5}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, EnumC3631g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, 206, EnumC3631g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m = "invokeSuspend", n = {"$this$withTimeout", "$this$withTimeout", "attempt", "$this$withTimeout", "attempt", "$this$withTimeout", "attempt"}, s = {"L$0", "L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    /* renamed from: ai.verisoul.sdk.Core$getSessionId$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
        final /* synthetic */ VerisoulSessionCallback $callback;
        final /* synthetic */ Ref.ObjectRef<Throwable> $lastError;
        final /* synthetic */ int $maxAttempts;
        int I$0;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "ai.verisoul.sdk.Core$getSessionId$1$1$1", f = "Core.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ai.verisoul.sdk.Core$getSessionId$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03351 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
            final /* synthetic */ VerisoulSessionCallback $callback;
            final /* synthetic */ String $sessionId;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03351(VerisoulSessionCallback verisoulSessionCallback, String str, Continuation<? super C03351> continuation) {
                super(2, continuation);
                this.$callback = verisoulSessionCallback;
                this.$sessionId = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C03351(this.$callback, this.$sessionId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
                return ((C03351) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$callback.onSuccess(this.$sessionId);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "ai.verisoul.sdk.Core$getSessionId$1$1$2", f = "Core.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ai.verisoul.sdk.Core$getSessionId$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
            final /* synthetic */ VerisoulSessionCallback $callback;
            final /* synthetic */ VerisoulException $e;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(VerisoulSessionCallback verisoulSessionCallback, VerisoulException verisoulException, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$callback = verisoulSessionCallback;
                this.$e = verisoulException;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.$callback, this.$e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$callback.onFailure(this.$e);
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "ai.verisoul.sdk.Core$getSessionId$1$1$3", f = "Core.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ai.verisoul.sdk.Core$getSessionId$1$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
            final /* synthetic */ VerisoulSessionCallback $callback;
            final /* synthetic */ VerisoulException $verisoulCause;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(VerisoulSessionCallback verisoulSessionCallback, VerisoulException verisoulException, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$callback = verisoulSessionCallback;
                this.$verisoulCause = verisoulException;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass3(this.$callback, this.$verisoulCause, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$callback.onFailure(this.$verisoulCause);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i10, Ref.ObjectRef<Throwable> objectRef, VerisoulSessionCallback verisoulSessionCallback, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$maxAttempts = i10;
            this.$lastError = objectRef;
            this.$callback = verisoulSessionCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$maxAttempts, this.$lastError, this.$callback, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x021a, code lost:
        
            if (Ph.AbstractC1440a0.a(1000, r12) == r0) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0236, code lost:
        
            if (r13 == r0) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0075, code lost:
        
            if (r13.join(r12) == r0) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x018b, code lost:
        
            if (Ph.AbstractC1455i.g(r1, r2, r12) == r0) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0139, code lost:
        
            if (Ph.AbstractC1455i.g(r13, r1, r12) == r0) goto L86;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x009a A[Catch: all -> 0x003c, VerisoulException -> 0x003f, CancellationException -> 0x0042, f1 -> 0x0045, TRY_ENTER, TryCatch #3 {f1 -> 0x0045, VerisoulException -> 0x003f, CancellationException -> 0x0042, all -> 0x003c, blocks: (B:14:0x009a, B:18:0x00b0, B:20:0x00b4, B:23:0x00ce, B:26:0x00d1, B:40:0x0037, B:42:0x004e), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00b4 A[Catch: all -> 0x003c, VerisoulException -> 0x003f, CancellationException -> 0x0042, f1 -> 0x0045, TryCatch #3 {f1 -> 0x0045, VerisoulException -> 0x003f, CancellationException -> 0x0042, all -> 0x003c, blocks: (B:14:0x009a, B:18:0x00b0, B:20:0x00b4, B:23:0x00ce, B:26:0x00d1, B:40:0x0037, B:42:0x004e), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00d1 A[Catch: all -> 0x003c, VerisoulException -> 0x003f, CancellationException -> 0x0042, f1 -> 0x0045, TRY_LEAVE, TryCatch #3 {f1 -> 0x0045, VerisoulException -> 0x003f, CancellationException -> 0x0042, all -> 0x003c, blocks: (B:14:0x009a, B:18:0x00b0, B:20:0x00b4, B:23:0x00ce, B:26:0x00d1, B:40:0x0037, B:42:0x004e), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0221  */
        /* JADX WARN: Type inference failed for: r13v1, types: [T, java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r13v5, types: [T, java.lang.Throwable, java.util.concurrent.CancellationException] */
        /* JADX WARN: Type inference failed for: r13v6, types: [T, ai.verisoul.sdk.VerisoulException, java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v34 */
        /* JADX WARN: Type inference failed for: r1v35 */
        /* JADX WARN: Type inference failed for: r1v41 */
        /* JADX WARN: Type inference failed for: r1v42 */
        /* JADX WARN: Type inference failed for: r1v43 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r7v18, types: [T, java.lang.Exception] */
        /* JADX WARN: Type inference failed for: r8v10, types: [T, java.lang.Exception] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x020b -> B:11:0x021d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x021a -> B:11:0x021d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            VerisoulException findVerisoulException;
            P p10;
            int i10;
            int i11;
            int i12;
            String str;
            Object failCallback;
            int i13;
            C0 c02;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r12 = this.label;
            try {
                try {
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Exception e11) {
                    Logger.INSTANCE.info("Verisoul-[Core]", "Init completed with error, will retry: " + e11.getMessage());
                }
            } catch (f1 e12) {
                Logger.INSTANCE.error("Verisoul-[Core]", "Timeout waiting for session: " + e12.getMessage());
                this.$lastError.element = new Exception("Timeout: " + e12.getMessage());
                i11 = r12;
                if (!Q.i(p10)) {
                    throw e12;
                }
            } catch (VerisoulException e13) {
                if (Intrinsics.areEqual(e13.getCode(), VerisoulErrorCodes.WEBVIEW_UNAVAILABLE)) {
                    Logger.INSTANCE.error("Verisoul-[Core]", "WebView unavailable, not retrying: " + e13.getMessage());
                    M0 c10 = C1452g0.c();
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$callback, e13, null);
                    this.L$0 = null;
                    this.label = 4;
                } else {
                    Logger.INSTANCE.error("Verisoul-[Core]", String.valueOf(e13.getMessage()));
                    this.$lastError.element = e13;
                    i11 = r12;
                }
            } catch (CancellationException e14) {
                if (!Q.i(p10)) {
                    throw e14;
                }
                Logger.INSTANCE.info("Verisoul-[Core]", "Session fetch cancelled, will retry: " + e14.getMessage());
                this.$lastError.element = e14;
                i11 = r12;
            } catch (Throwable th2) {
                findVerisoulException = Core.INSTANCE.findVerisoulException(th2);
                if (findVerisoulException == null || !Intrinsics.areEqual(findVerisoulException.getCode(), VerisoulErrorCodes.WEBVIEW_UNAVAILABLE)) {
                    Logger.INSTANCE.error("Verisoul-[Core]", String.valueOf(th2.getMessage()));
                    this.$lastError.element = th2;
                    i11 = r12;
                } else {
                    Logger.INSTANCE.error("Verisoul-[Core]", "WebView unavailable (wrapped), not retrying: " + findVerisoulException.getMessage());
                    M0 c11 = C1452g0.c();
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$callback, findVerisoulException, null);
                    this.L$0 = null;
                    this.label = 5;
                }
            }
            switch (r12) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    P p11 = (P) this.L$0;
                    c02 = Core.initializationJob;
                    r12 = p11;
                    if (c02 != null) {
                        this.L$0 = p11;
                        this.label = 1;
                        r12 = p11;
                        break;
                    }
                    p10 = r12;
                    i10 = 0;
                    if (i10 >= this.$maxAttempts) {
                        Core$getSessionId$1$1$sessionId$1 core$getSessionId$1$1$sessionId$1 = new Core$getSessionId$1$1$sessionId$1(null);
                        this.L$0 = p10;
                        this.I$0 = i10;
                        this.label = 2;
                        obj = h1.c(30000L, core$getSessionId$1$1$sessionId$1, this);
                        i12 = i10;
                        if (obj == coroutine_suspended) {
                        }
                        str = (String) obj;
                        if (str == null) {
                            M0 c12 = C1452g0.c();
                            C03351 c03351 = new C03351(this.$callback, str, null);
                            this.L$0 = p10;
                            this.I$0 = i12;
                            this.label = 3;
                            r12 = i12;
                            if (AbstractC1455i.g(c12, c03351, this) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        }
                        Logger.INSTANCE.info("Verisoul-[Core]", "Session ID is null (attempt " + i12 + ")");
                        this.$lastError.element = new Exception("Session ID was null");
                        i11 = i12;
                        i13 = i11;
                        if (i11 < this.$maxAttempts - 1) {
                            this.L$0 = p10;
                            this.I$0 = i11;
                            this.label = 6;
                            i13 = i11;
                            break;
                        }
                        i10 = i13 + 1;
                        if (i10 >= this.$maxAttempts) {
                            Core core = Core.INSTANCE;
                            VerisoulSessionCallback verisoulSessionCallback = this.$callback;
                            Throwable th3 = this.$lastError.element;
                            this.L$0 = null;
                            this.label = 7;
                            failCallback = core.failCallback(verisoulSessionCallback, "Failed to obtain a valid session ID", th3, this);
                            break;
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    P p12 = (P) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    r12 = p12;
                    p10 = r12;
                    i10 = 0;
                    if (i10 >= this.$maxAttempts) {
                    }
                    return coroutine_suspended;
                case 2:
                    int i14 = this.I$0;
                    p10 = (P) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    i12 = i14;
                    str = (String) obj;
                    if (str == null) {
                    }
                    break;
                case 3:
                    int i15 = this.I$0;
                    p10 = (P) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    r12 = i15;
                    return Unit.INSTANCE;
                case 4:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 5:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 6:
                    int i16 = this.I$0;
                    p10 = (P) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    i13 = i16;
                    i10 = i13 + 1;
                    if (i10 >= this.$maxAttempts) {
                    }
                    return coroutine_suspended;
                case 7:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Core$getSessionId$1(VerisoulSessionCallback verisoulSessionCallback, int i10, Continuation<? super Core$getSessionId$1> continuation) {
        super(2, continuation);
        this.$callback = verisoulSessionCallback;
        this.$maxAttempts = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Core$getSessionId$1(this.$callback, this.$maxAttempts, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((Core$getSessionId$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (Ph.h1.c(ai.verisoul.sdk.helpers.webview.VerisoulWebViewImplKt.WEBVIEW_TIMEOUT, r11, r10) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d2, code lost:
    
        if (r11 != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
    
        if (r11 != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        if (r11 != r0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Object failCallback;
        Object failCallback2;
        Object failCallback3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Ref.ObjectRef objectRef = this.label;
        try {
        } catch (f1 unused) {
            Logger.INSTANCE.error("Verisoul-[Core]", "getSessionId() timed out after 20 seconds");
            Core core = Core.INSTANCE;
            VerisoulSessionCallback verisoulSessionCallback = this.$callback;
            Throwable th2 = (Throwable) objectRef.element;
            this.L$0 = null;
            this.label = 2;
            failCallback3 = core.failCallback(verisoulSessionCallback, "Failed to obtain session ID: timeout after 20 seconds", th2, this);
        } catch (CancellationException e10) {
            Logger.INSTANCE.error("Verisoul-[Core]", "getSessionId() was cancelled: " + e10.getMessage());
            Core core2 = Core.INSTANCE;
            VerisoulSessionCallback verisoulSessionCallback2 = this.$callback;
            this.L$0 = null;
            this.label = 3;
            failCallback2 = core2.failCallback(verisoulSessionCallback2, "Failed to obtain session ID: cancelled", e10, this);
        } catch (Exception e11) {
            Logger.INSTANCE.error("Verisoul-[Core]", "Unexpected error in getSessionId: " + e11.getMessage());
            Core core3 = Core.INSTANCE;
            VerisoulSessionCallback verisoulSessionCallback3 = this.$callback;
            String str = "Failed to obtain session ID: " + e11.getMessage();
            this.L$0 = null;
            this.label = 4;
            failCallback = core3.failCallback(verisoulSessionCallback3, str, e11, this);
        }
        if (objectRef == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$maxAttempts, objectRef2, this.$callback, null);
            this.L$0 = objectRef2;
            this.label = 1;
            objectRef = objectRef2;
        } else {
            if (objectRef != 1) {
                if (objectRef != 2 && objectRef != 3 && objectRef != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            Ref.ObjectRef objectRef3 = (Ref.ObjectRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            objectRef = objectRef3;
        }
        return Unit.INSTANCE;
    }
}

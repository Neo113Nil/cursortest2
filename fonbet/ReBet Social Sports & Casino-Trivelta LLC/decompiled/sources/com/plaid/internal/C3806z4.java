package com.plaid.internal;

import Ph.AbstractC1459k;
import Ph.C0;
import com.plaid.internal.C3556a6;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkResult;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.z4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3806z4 extends androidx.lifecycle.Q {

    /* renamed from: a, reason: collision with root package name */
    @Inject
    public final InterfaceC3759u2 f41231a;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public final C6 f41232b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public final InterfaceC3781w6 f41233c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public final B6 f41234d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public final InterfaceC3808z6 f41235e;

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public final z8 f41236f;

    /* renamed from: g, reason: collision with root package name */
    @Inject
    public final i8 f41237g;

    /* renamed from: h, reason: collision with root package name */
    @Inject
    public final I7 f41238h;

    /* renamed from: i, reason: collision with root package name */
    @Inject
    public final F f41239i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public Ph.C0 f41240j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public final C3797y4 f41241k;

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$onOutOfProcessClosed$1", f = "OutOfProcessWebviewViewModel.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.z4$a */
    public static final class a extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f41242a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return C3806z4.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return C3806z4.this.new a(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f41242a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                I7 b10 = C3806z4.this.b();
                this.f41242a = 1;
                if (b10.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$onOutOfProcessClosed$3$1", f = "OutOfProcessWebviewViewModel.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.z4$b */
    public static final class b extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f41244a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return C3806z4.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return C3806z4.this.new b(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f41244a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C3806z4 c3806z4 = C3806z4.this;
                this.f41244a = 1;
                if (C3806z4.a(c3806z4, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            F f10 = C3806z4.this.f41239i;
            if (f10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("channelPolling");
                f10 = null;
            }
            f10.f39237c = true;
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$onOutOfProcessOpened$1", f = "OutOfProcessWebviewViewModel.kt", i = {}, l = {EnumC3631g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, EnumC3631g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.z4$c */
    public static final class c extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f41246a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return C3806z4.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return C3806z4.this.new c(continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            if (com.plaid.internal.C3806z4.a(r5, r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        
            if (r5.c(r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f41246a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                I7 b10 = C3806z4.this.b();
                this.f41246a = 1;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            C3806z4 c3806z4 = C3806z4.this;
            this.f41246a = 2;
        }
    }

    public C3806z4(@NotNull H1 outOfProcessComponent) {
        Intrinsics.checkNotNullParameter(outOfProcessComponent, "outOfProcessComponent");
        C3695n0 c3695n0 = (C3695n0) outOfProcessComponent;
        this.f41231a = c3695n0.f40826n.get();
        this.f41232b = c3695n0.f40827o.get();
        this.f41233c = c3695n0.f40832t.get();
        this.f41234d = c3695n0.f40829q.get();
        this.f41235e = c3695n0.f40838z.get();
        this.f41236f = c3695n0.f40811A.get();
        C3704o0 c3704o0 = c3695n0.f40814b;
        E5 retrofitFactory = c3704o0.f40882a.f40943l.get();
        C3691m5 plaidEnvironmentStore = c3704o0.f40882a.f40944m.get();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(plaidEnvironmentStore, "plaidEnvironmentStore");
        EnumC3664j5 env = plaidEnvironmentStore.b();
        Intrinsics.checkNotNullParameter(env, "env");
        int i10 = C3673k5.f40731a[env.ordinal()];
        String str = "https://production.plaid.com/";
        if (i10 != 1) {
            if (i10 == 2) {
                str = "https://development.plaid.com/";
            } else if (i10 == 3) {
                str = "https://sandbox.plaid.com/";
            }
        }
        Object create = retrofitFactory.a(str, new G5(null, 3)).create(i8.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        this.f41237g = (i8) Gg.d.d((i8) create);
        this.f41238h = c3695n0.f40831s.get();
        this.f41239i = c3695n0.f40833u.get();
        this.f41241k = new C3797y4(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C3806z4 c3806z4, ContinuationImpl continuationImpl) {
        A4 a42;
        int i10;
        A channelInfo;
        Ph.C0 d10;
        c3806z4.getClass();
        if (continuationImpl instanceof A4) {
            a42 = (A4) continuationImpl;
            int i11 = a42.f39153d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                a42.f39153d = i11 - Integer.MIN_VALUE;
                Object obj = a42.f39151b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = a42.f39153d;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC3781w6 interfaceC3781w6 = c3806z4.f41233c;
                    if (interfaceC3781w6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("readChannelInfo");
                        interfaceC3781w6 = null;
                    }
                    a42.f39150a = c3806z4;
                    a42.f39153d = 1;
                    obj = interfaceC3781w6.b(a42);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3806z4 = a42.f39150a;
                    ResultKt.throwOnFailure(obj);
                }
                channelInfo = (A) obj;
                if (channelInfo != null) {
                    C3556a6.a.e(C3556a6.f39823a, "No Out Of Process Polling Info Available");
                    InterfaceC3759u2 interfaceC3759u2 = c3806z4.f41231a;
                    if (interfaceC3759u2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("linkController");
                        interfaceC3759u2 = null;
                    }
                    interfaceC3759u2.a(new LinkExit(null, null, 3, null));
                    return Unit.INSTANCE;
                }
                F f10 = c3806z4.f41239i;
                if (f10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("channelPolling");
                    f10 = null;
                }
                Ph.P coroutineScope = androidx.lifecycle.S.a(c3806z4);
                C3797y4 pollingCallback = c3806z4.f41241k;
                f10.getClass();
                Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
                Intrinsics.checkNotNullParameter(channelInfo, "channelInfo");
                Intrinsics.checkNotNullParameter(pollingCallback, "pollingCallback");
                d10 = AbstractC1459k.d(coroutineScope, null, null, new D(f10, channelInfo, pollingCallback, null), 3, null);
                c3806z4.f41240j = d10;
                return Unit.INSTANCE;
            }
        }
        a42 = new A4(c3806z4, continuationImpl);
        Object obj2 = a42.f39151b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = a42.f39153d;
        if (i10 != 0) {
        }
        channelInfo = (A) obj2;
        if (channelInfo != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C3806z4 c3806z4, ContinuationImpl continuationImpl) {
        B4 b42;
        int i10;
        InterfaceC3808z6 interfaceC3808z6;
        c3806z4.getClass();
        if (continuationImpl instanceof B4) {
            b42 = (B4) continuationImpl;
            int i11 = b42.f39178d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b42.f39178d = i11 - Integer.MIN_VALUE;
                Object obj = b42.f39176b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = b42.f39178d;
                InterfaceC3808z6 interfaceC3808z62 = null;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC3808z6 interfaceC3808z63 = c3806z4.f41235e;
                    if (interfaceC3808z63 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("readPreCompletionResult");
                        interfaceC3808z63 = null;
                    }
                    b42.f39175a = c3806z4;
                    b42.f39178d = 1;
                    obj = interfaceC3808z63.a(b42);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        LinkResult linkResult = (LinkResult) b42.f39175a;
                        ResultKt.throwOnFailure(obj);
                        return linkResult;
                    }
                    c3806z4 = (C3806z4) b42.f39175a;
                    ResultKt.throwOnFailure(obj);
                }
                Channel$Message.SDKResult sDKResult = (Channel$Message.SDKResult) obj;
                LinkResult a10 = sDKResult == null ? T6.a(sDKResult) : null;
                interfaceC3808z6 = c3806z4.f41235e;
                if (interfaceC3808z6 == null) {
                    interfaceC3808z62 = interfaceC3808z6;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("readPreCompletionResult");
                }
                b42.f39175a = a10;
                b42.f39178d = 2;
                return interfaceC3808z62.b(b42) != coroutine_suspended ? coroutine_suspended : a10;
            }
        }
        b42 = new B4(c3806z4, continuationImpl);
        Object obj2 = b42.f39176b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = b42.f39178d;
        InterfaceC3808z6 interfaceC3808z622 = null;
        if (i10 != 0) {
        }
        Channel$Message.SDKResult sDKResult2 = (Channel$Message.SDKResult) obj2;
        if (sDKResult2 == null) {
        }
        interfaceC3808z6 = c3806z4.f41235e;
        if (interfaceC3808z6 == null) {
        }
        b42.f39175a = a10;
        b42.f39178d = 2;
        if (interfaceC3808z622.b(b42) != coroutine_suspended2) {
        }
    }

    public final void c() {
        Ph.C0 c02 = this.f41240j;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new c(null), 3, null);
    }

    @NotNull
    public final I7 b() {
        I7 i72 = this.f41238h;
        if (i72 != null) {
            return i72;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webviewFallbackAnalytics");
        return null;
    }

    public static final void a(C3806z4 c3806z4, LinkResult linkResult) {
        c3806z4.getClass();
        InterfaceC3759u2 interfaceC3759u2 = null;
        AbstractC1459k.d(androidx.lifecycle.S.a(c3806z4), null, null, new C3779w4(c3806z4, null), 3, null);
        InterfaceC3759u2 interfaceC3759u22 = c3806z4.f41231a;
        if (interfaceC3759u22 != null) {
            interfaceC3759u2 = interfaceC3759u22;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("linkController");
        }
        interfaceC3759u2.a(linkResult);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ContinuationImpl continuationImpl) {
        C3788x4 c3788x4;
        int i10;
        String str;
        if (continuationImpl instanceof C3788x4) {
            c3788x4 = (C3788x4) continuationImpl;
            int i11 = c3788x4.f41191c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3788x4.f41191c = i11 - Integer.MIN_VALUE;
                Object obj = c3788x4.f41189a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3788x4.f41191c;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C6 c62 = this.f41232b;
                    if (c62 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("readWebviewFallbackUri");
                        c62 = null;
                    }
                    c3788x4.f41191c = 1;
                    obj = c62.a(c3788x4);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str != null || str.length() == 0) {
                    return null;
                }
                return str;
            }
        }
        c3788x4 = new C3788x4(this, continuationImpl);
        Object obj2 = c3788x4.f41189a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3788x4.f41191c;
        if (i10 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        return null;
    }

    public final void a(boolean z10) {
        F f10 = null;
        if (z10) {
            AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new a(null), 3, null);
        }
        if (this.f41240j == null) {
            AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new b(null), 3, null);
            return;
        }
        F f11 = this.f41239i;
        if (f11 != null) {
            f10 = f11;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("channelPolling");
        }
        f10.f39237c = true;
    }

    public final void a() {
        InterfaceC3759u2 interfaceC3759u2 = null;
        LinkExit linkExit = new LinkExit(null, null, 3, null);
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new C3779w4(this, null), 3, null);
        InterfaceC3759u2 interfaceC3759u22 = this.f41231a;
        if (interfaceC3759u22 != null) {
            interfaceC3759u2 = interfaceC3759u22;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("linkController");
        }
        interfaceC3759u2.a(linkExit);
    }
}

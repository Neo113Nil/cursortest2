package com.plaid.internal;

import Ph.AbstractC1459k;
import com.plaid.internal.C3556a6;
import com.plaid.internal.C3717p4;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuthPaneOuterClass$HeadlessOAuthPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
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

/* renamed from: com.plaid.internal.l1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3678l1 extends u8 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f40742k = 0;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.flow.x f40743f;

    /* renamed from: g, reason: collision with root package name */
    @Inject
    public final InterfaceC3790x6 f40744g;

    /* renamed from: h, reason: collision with root package name */
    @Inject
    public final T3 f40745h;

    /* renamed from: i, reason: collision with root package name */
    @Inject
    public final i8 f40746i;

    /* renamed from: j, reason: collision with root package name */
    public C3708o4 f40747j;

    @DebugMetadata(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel$1", f = "HeadlessOAuthViewModel.kt", i = {}, l = {50, 62}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.l1$a */
    public static final class a extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f40748a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r8 f40750c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r8 r8Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f40750c = r8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return C3678l1.this.new a(this.f40750c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
            return C3678l1.this.new a(this.f40750c, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
        
            if (r11 == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f40748a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                C3678l1 c3678l1 = C3678l1.this;
                r8 r8Var = this.f40750c;
                this.f40748a = 1;
                obj = c3678l1.a(r8Var, this);
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
            Pane$PaneRendering pane$PaneRendering = (Pane$PaneRendering) obj;
            if (!pane$PaneRendering.hasHeadlessOAuth()) {
                String str = "Pane rendering must be headless oauth. was " + pane$PaneRendering.getRenderingCase();
                pane$PaneRendering.getId();
                pane$PaneRendering.getPaneNodeId();
                throw new D2(str);
            }
            HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering headlessOAuth = pane$PaneRendering.getHeadlessOAuth();
            C3678l1 c3678l12 = C3678l1.this;
            headlessOAuth.getEvents();
            c3678l12.getClass();
            C3678l1 c3678l13 = C3678l1.this;
            i8 c10 = c3678l13.c();
            C3787x3 a10 = C3678l1.this.a();
            C3678l1 c3678l14 = C3678l1.this;
            Intrinsics.checkNotNull(headlessOAuth);
            C3717p4 a11 = C3678l1.a(c3678l14, headlessOAuth);
            String oauthStateId = headlessOAuth.getOauthStateId();
            Intrinsics.checkNotNullExpressionValue(oauthStateId, "getOauthStateId(...)");
            c3678l13.a(new C3708o4(c10, a10, a11, oauthStateId, this.f40750c));
            kotlinx.coroutines.flow.x xVar = C3678l1.this.f40743f;
            this.f40748a = 2;
        }
    }

    /* renamed from: com.plaid.internal.l1$b */
    public static abstract class b {

        /* renamed from: com.plaid.internal.l1$b$a */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f40751a;

            public a(@NotNull String oautStateId) {
                Intrinsics.checkNotNullParameter(oautStateId, "oautStateId");
                this.f40751a = oautStateId;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f40751a, ((a) obj).f40751a);
            }

            public final int hashCode() {
                return this.f40751a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "PollOAuthResult(oautStateId=" + this.f40751a + ")";
            }
        }

        /* renamed from: com.plaid.internal.l1$b$b, reason: collision with other inner class name */
        public static final class C0587b extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f40752a;

            public C0587b(@NotNull String loginUrl) {
                Intrinsics.checkNotNullParameter(loginUrl, "loginUrl");
                this.f40752a = loginUrl;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0587b) && Intrinsics.areEqual(this.f40752a, ((C0587b) obj).f40752a);
            }

            public final int hashCode() {
                return this.f40752a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "ShowLogin(loginUrl=" + this.f40752a + ")";
            }
        }

        /* renamed from: com.plaid.internal.l1$b$c */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f40753a;

            public c(@NotNull String redirectUri) {
                Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
                this.f40753a = redirectUri;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.areEqual(this.f40753a, ((c) obj).f40753a);
            }

            public final int hashCode() {
                return this.f40753a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "SubmitRedirectUri(redirectUri=" + this.f40753a + ")";
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3678l1(@NotNull r8 paneId, @NotNull J4 paneHostComponent) {
        super(paneId, paneHostComponent);
        Intrinsics.checkNotNullParameter(paneId, "paneId");
        Intrinsics.checkNotNullParameter(paneHostComponent, "paneHostComponent");
        this.f40743f = kotlinx.coroutines.flow.E.b(1, 0, null, 6, null);
        C3686m0 a10 = paneHostComponent.a();
        C3704o0 c3704o0 = a10.f40787a;
        C3695n0 c3695n0 = a10.f40788b;
        this.f41127c = c3695n0.f40826n.get();
        this.f41128d = c3695n0.f40825m.get();
        this.f41129e = c3704o0.f40885d.get();
        this.f40744g = c3695n0.f40812B.get();
        this.f40745h = c3704o0.f40891j.get();
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
        this.f40746i = (i8) Gg.d.d((i8) create);
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new a(paneId, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C3678l1 c3678l1, Pane$PaneRendering pane$PaneRendering, ContinuationImpl continuationImpl) {
        C3705o1 c3705o1;
        int i10;
        String str;
        Pane$PaneRendering pane$PaneRendering2;
        String str2;
        c3678l1.getClass();
        if (continuationImpl instanceof C3705o1) {
            c3705o1 = (C3705o1) continuationImpl;
            int i11 = c3705o1.f40903e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3705o1.f40903e = i11 - Integer.MIN_VALUE;
                Object obj = c3705o1.f40901c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3705o1.f40903e;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    T3 t32 = c3678l1.f40745h;
                    if (t32 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("localPaneStateStore");
                        t32 = null;
                    }
                    String str3 = c3678l1.f41125a.f41038b;
                    c3705o1.f40899a = c3678l1;
                    c3705o1.f40900b = pane$PaneRendering;
                    c3705o1.f40903e = 1;
                    obj = t32.a(str3, "login_url", c3705o1);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pane$PaneRendering2 = (Pane$PaneRendering) c3705o1.f40899a;
                        ResultKt.throwOnFailure(obj);
                        str2 = (String) obj;
                        if (str2 == null && str2.length() != 0) {
                            return new b.c(str2);
                        }
                        String oauthStateId = pane$PaneRendering2.getHeadlessOAuth().getOauthStateId();
                        Intrinsics.checkNotNullExpressionValue(oauthStateId, "getOauthStateId(...)");
                        return new b.a(oauthStateId);
                    }
                    pane$PaneRendering = c3705o1.f40900b;
                    c3678l1 = (C3678l1) c3705o1.f40899a;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str != null || str.length() == 0) {
                    String loginUri = pane$PaneRendering.getHeadlessOAuth().getLoginUri();
                    Intrinsics.checkNotNullExpressionValue(loginUri, "getLoginUri(...)");
                    return new b.C0587b(loginUri);
                }
                InterfaceC3790x6 interfaceC3790x6 = c3678l1.f40744g;
                if (interfaceC3790x6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("readOAuthRedirectUri");
                    interfaceC3790x6 = null;
                }
                c3705o1.f40899a = pane$PaneRendering;
                c3705o1.f40900b = null;
                c3705o1.f40903e = 2;
                obj = interfaceC3790x6.a(c3705o1);
                if (obj != coroutine_suspended) {
                    pane$PaneRendering2 = pane$PaneRendering;
                    str2 = (String) obj;
                    if (str2 == null) {
                    }
                    String oauthStateId2 = pane$PaneRendering2.getHeadlessOAuth().getOauthStateId();
                    Intrinsics.checkNotNullExpressionValue(oauthStateId2, "getOauthStateId(...)");
                    return new b.a(oauthStateId2);
                }
                return coroutine_suspended;
            }
        }
        c3705o1 = new C3705o1(c3678l1, continuationImpl);
        Object obj2 = c3705o1.f40901c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3705o1.f40903e;
        if (i10 != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        String loginUri2 = pane$PaneRendering.getHeadlessOAuth().getLoginUri();
        Intrinsics.checkNotNullExpressionValue(loginUri2, "getLoginUri(...)");
        return new b.C0587b(loginUri2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C3678l1 c3678l1, String oauthStateId, ContinuationImpl continuationImpl) {
        C3723q1 c3723q1;
        int i10;
        c3678l1.getClass();
        if (continuationImpl instanceof C3723q1) {
            c3723q1 = (C3723q1) continuationImpl;
            int i11 = c3723q1.f40991e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3723q1.f40991e = i11 - Integer.MIN_VALUE;
                Object obj = c3723q1.f40989c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3723q1.f40991e;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C3556a6.f39823a.getClass();
                    C3556a6.a.a("Poll for oAuth result", true);
                    C3708o4 c3708o4 = c3678l1.f40747j;
                    if (c3708o4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("oAuthPolling");
                        c3708o4 = null;
                    }
                    c3723q1.f40987a = c3678l1;
                    c3723q1.f40988b = oauthStateId;
                    c3723q1.f40991e = 1;
                    if (c3708o4.a(c3723q1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oauthStateId = c3723q1.f40988b;
                    c3678l1 = c3723q1.f40987a;
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNullParameter(oauthStateId, "oauthStateId");
                HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.b a10 = HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.newBuilder().a(HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.SubmitAction.newBuilder().a(oauthStateId));
                Intrinsics.checkNotNullExpressionValue(a10, "submitStateId(...)");
                a(c3678l1, a10);
                return Unit.INSTANCE;
            }
        }
        c3723q1 = new C3723q1(c3678l1, continuationImpl);
        Object obj2 = c3723q1.f40989c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3723q1.f40991e;
        if (i10 != 0) {
        }
        Intrinsics.checkNotNullParameter(oauthStateId, "oauthStateId");
        HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.b a102 = HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.newBuilder().a(HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.SubmitAction.newBuilder().a(oauthStateId));
        Intrinsics.checkNotNullExpressionValue(a102, "submitStateId(...)");
        a(c3678l1, a102);
        return Unit.INSTANCE;
    }

    @NotNull
    public final i8 c() {
        i8 i8Var = this.f40746i;
        if (i8Var != null) {
            return i8Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("workflowApi");
        return null;
    }

    public static final C3717p4 a(C3678l1 c3678l1, HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Rendering rendering) {
        c3678l1.getClass();
        Common$PollingOptions polling = rendering.getPolling();
        Intrinsics.checkNotNullExpressionValue(polling, "getPolling(...)");
        return C3717p4.a.a(polling);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C3678l1 c3678l1, String str, ContinuationImpl continuationImpl) {
        C3714p1 c3714p1;
        int i10;
        InterfaceC3759u2 interfaceC3759u2;
        c3678l1.getClass();
        if (continuationImpl instanceof C3714p1) {
            c3714p1 = (C3714p1) continuationImpl;
            int i11 = c3714p1.f40952e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3714p1.f40952e = i11 - Integer.MIN_VALUE;
                Object obj = c3714p1.f40950c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3714p1.f40952e;
                InterfaceC3759u2 interfaceC3759u22 = null;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C3556a6.f39823a.getClass();
                    C3556a6.a.a("Opening login URL", true);
                    T3 t32 = c3678l1.f40745h;
                    if (t32 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("localPaneStateStore");
                        t32 = null;
                    }
                    String str2 = c3678l1.f41125a.f41038b;
                    c3714p1.f40948a = c3678l1;
                    c3714p1.f40949b = str;
                    c3714p1.f40952e = 1;
                    if (t32.a(str2, "login_url", str, c3714p1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = c3714p1.f40949b;
                    c3678l1 = c3714p1.f40948a;
                    ResultKt.throwOnFailure(obj);
                }
                interfaceC3759u2 = c3678l1.f41127c;
                if (interfaceC3759u2 == null) {
                    interfaceC3759u22 = interfaceC3759u2;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("linkController");
                }
                interfaceC3759u22.a(str);
                return Unit.INSTANCE;
            }
        }
        c3714p1 = new C3714p1(c3678l1, continuationImpl);
        Object obj2 = c3714p1.f40950c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3714p1.f40952e;
        InterfaceC3759u2 interfaceC3759u222 = null;
        if (i10 != 0) {
        }
        interfaceC3759u2 = c3678l1.f41127c;
        if (interfaceC3759u2 == null) {
        }
        interfaceC3759u222.a(str);
        return Unit.INSTANCE;
    }

    public static void a(C3678l1 c3678l1, HeadlessOAuthPaneOuterClass$HeadlessOAuthPane.Actions.b bVar) {
        String paneNodeId = c3678l1.f41125a.f41039c;
        Pane$PaneOutput.a actionsOutput = Pane$PaneOutput.newBuilder().a(bVar);
        Intrinsics.checkNotNullExpressionValue(actionsOutput, "setHeadlessOAuth(...)");
        Intrinsics.checkNotNullParameter(paneNodeId, "paneNodeId");
        Intrinsics.checkNotNullParameter(actionsOutput, "actionsOutput");
        AbstractC1459k.d(androidx.lifecycle.S.a(c3678l1), null, null, new t8(null, c3678l1, actionsOutput, paneNodeId, null), 3, null);
    }

    public final void a(@NotNull C3708o4 c3708o4) {
        Intrinsics.checkNotNullParameter(c3708o4, "<set-?>");
        this.f40747j = c3708o4;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ContinuationImpl continuationImpl) {
        C3687m1 c3687m1;
        int i10;
        if (continuationImpl instanceof C3687m1) {
            c3687m1 = (C3687m1) continuationImpl;
            int i11 = c3687m1.f40791c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3687m1.f40791c = i11 - Integer.MIN_VALUE;
                Object obj = c3687m1.f40789a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3687m1.f40791c;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.x xVar = this.f40743f;
                    C3696n1 c3696n1 = new C3696n1(this);
                    c3687m1.f40791c = 1;
                    if (xVar.collect(c3696n1, c3687m1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
        c3687m1 = new C3687m1(this, continuationImpl);
        Object obj2 = c3687m1.f40789a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3687m1.f40791c;
        if (i10 != 0) {
        }
        throw new KotlinNothingValueException();
    }
}

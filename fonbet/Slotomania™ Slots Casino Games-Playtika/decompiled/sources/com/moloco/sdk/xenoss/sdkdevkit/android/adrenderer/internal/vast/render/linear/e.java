package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import android.content.Context;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes.dex */
public final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c {
    public static final int D = 8;
    public final g A;
    public boolean B;
    public int C;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f a;
    public final boolean b;
    public final boolean c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a d;
    public final r e;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l f;
    public final CoroutineScope g;
    public final MutableSharedFlow<d> h;
    public final Flow<d> i;
    public final String j;
    public final MutableStateFlow<Boolean> k;
    public final StateFlow<Boolean> l;
    public final MutableStateFlow<m<Long>> m;
    public final StateFlow<m<Long>> n;
    public final MutableStateFlow<Boolean> o;
    public int p;
    public final boolean q;
    public final String r;
    public final boolean s;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b t;
    public final n u;
    public final MutableStateFlow<Boolean> v;
    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> w;
    public final MutableStateFlow<Boolean> x;
    public final StateFlow<Boolean> y;
    public final j z;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearControllerImpl$1", f = "LinearControllerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ boolean b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z, Continuation<? super Unit> continuation) {
            return ((a) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.b = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.b) {
                e.this.z.d(Boxing.boxInt(e.this.R()), e.this.j);
            } else {
                e.this.z.c(Boxing.boxInt(e.this.R()), e.this.j);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearControllerImpl$onEvent$1", f = "LinearControllerImpl.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = e.this.h;
                d dVar = this.c;
                this.a = 1;
                if (mutableSharedFlow.emit(dVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearControllerImpl$vastPrivacyIcon$1", f = "LinearControllerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function3<Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j>, Object> {
        public int a;
        public /* synthetic */ boolean b;
        public /* synthetic */ Object c;

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        public final Object a(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> continuation) {
            c cVar = new c(continuation);
            cVar.b = z;
            cVar.c = jVar;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> continuation) {
            return a(bool.booleanValue(), jVar, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = this.b;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) this.c;
            if (z) {
                return jVar;
            }
            return null;
        }
    }

    public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f linear, int i, boolean z, Boolean bool, int i2, boolean z2, boolean z3, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l linkHandler) {
        String absolutePath;
        Intrinsics.checkNotNullParameter(linear, "linear");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        this.a = linear;
        this.b = z2;
        this.c = z3;
        this.d = customUserEventBuilderService;
        this.e = externalLinkHandler;
        this.f = linkHandler;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.g = CoroutineScope;
        MutableSharedFlow<d> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.h = MutableSharedFlow$default;
        this.i = MutableSharedFlow$default;
        this.j = linear.l();
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(z));
        this.k = MutableStateFlow;
        this.l = MutableStateFlow;
        MutableStateFlow<m<Long>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new m(Long.valueOf(i)));
        this.m = MutableStateFlow2;
        this.n = FlowKt.asStateFlow(MutableStateFlow2);
        Boolean bool2 = Boolean.FALSE;
        this.o = StateFlowKt.MutableStateFlow(bool2);
        this.q = a.g.a.b().h();
        if (L()) {
            absolutePath = linear.l();
        } else {
            absolutePath = linear.j().getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        }
        this.r = absolutePath;
        this.s = linear.h() != null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i3 = linear.i();
        List<String> b2 = i3 != null ? i3.b() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i4 = linear.i();
        this.t = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b(b2, i4 != null ? i4.g() : null, null, 4, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i5 = linear.i();
        y f = i5 != null ? i5.f() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i6 = linear.i();
        Integer valueOf = i6 != null ? Integer.valueOf(i6.h()) : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i7 = linear.i();
        Integer valueOf2 = i7 != null ? Integer.valueOf(i7.d()) : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i8 = linear.i();
        n a2 = p.a(f, valueOf, valueOf2, i8 != null ? i8.a() : null, CoroutineScope, context, customUserEventBuilderService, externalLinkHandler, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.e(e.this);
            }
        }, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.f(e.this);
            }
        });
        this.u = a2;
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool2);
        this.v = MutableStateFlow3;
        this.w = FlowKt.stateIn(FlowKt.combine(MutableStateFlow3, a2.O(), new c(null)), CoroutineScope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), null);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool2);
        this.x = MutableStateFlow4;
        this.y = MutableStateFlow4;
        this.z = j.p.a(linear.n(), customUserEventBuilderService);
        FlowKt.launchIn(FlowKt.onEach(isPlaying(), new a(null)), CoroutineScope);
        this.A = i.a(bool, i2, linear.m());
    }

    public static final Unit e(e eVar) {
        eVar.t.a(Integer.valueOf(eVar.R()), eVar.j);
        return Unit.INSTANCE;
    }

    public static final Unit f(e eVar) {
        eVar.t.b(Integer.valueOf(eVar.R()), eVar.j);
        return Unit.INSTANCE;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void D() {
        this.A.s();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void F() {
        int i;
        this.A.pause();
        this.m.setValue(new m<>(Long.valueOf((!this.o.getValue().booleanValue() || (i = this.p) <= 0) ? R() : i - 10)));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public String G() {
        return this.r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean J() {
        return this.s;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public boolean L() {
        return this.q;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> O() {
        return this.w;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public StateFlow<m<Long>> Q() {
        return this.n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public int R() {
        return this.C;
    }

    public final void S() {
        this.v.setValue(Boolean.FALSE);
    }

    public final void T() {
        if (this.c) {
            a(false, f.a());
        }
    }

    public final void U() {
        if (this.b) {
            a(false, f.a());
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void d(boolean z) {
        this.x.setValue(Boolean.valueOf(z));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.g, null, 1, null);
        this.u.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void h() {
        this.B = true;
        this.z.f(Integer.valueOf(R()), this.j);
        String h = this.a.h();
        if (h != null) {
            this.f.c(h);
        }
        a(d.e.b);
        U();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    public void i() {
        this.u.i();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public StateFlow<Boolean> isPlaying() {
        return this.y;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    public StateFlow<d.a> l() {
        return this.A.l();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public StateFlow<Boolean> q() {
        return this.l;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public void r() {
        if (!isPlaying().getValue().booleanValue() && this.m.getValue().a().longValue() == 0 && R() == 0) {
            return;
        }
        this.m.setValue(new m<>(0L));
        this.o.setValue(Boolean.FALSE);
        this.z.e(Integer.valueOf(R()), this.j);
        this.B = false;
        this.C = 0;
        this.A.I();
        S();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    public void u() {
        this.u.u();
    }

    public static Object d(e eVar) {
        return Reflection.property0(new PropertyReference0Impl(eVar.A, g.class, "goNextAction", "getGoNextAction()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public Flow<d> a() {
        return this.i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void b(a.AbstractC0383a.f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        a(true, position);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void c(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
        j jVar = this.z;
        if (z) {
            jVar.b(Integer.valueOf(R()), this.j);
        } else {
            jVar.g(Integer.valueOf(R()), this.j);
        }
    }

    public final Job a(d dVar) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.g, null, null, new b(dVar, null), 3, null);
        return launch$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void b() {
        a(d.c.b);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(a.AbstractC0383a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.z.a(button);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r9 >= r10) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r9 <= r6) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2) {
        int b2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e i3 = this.a.i();
        if (i3 == null) {
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r e = i3.e();
        Long c2 = i3.c();
        boolean z = false;
        if (e instanceof r.a) {
            b2 = (i2 / 100) * ((r.a) e).b();
        } else {
            b2 = e instanceof r.b ? (int) ((r.b) e).b() : 0;
        }
        int coerceIn = RangesKt.coerceIn(b2, (ClosedRange<Integer>) new IntRange(0, i2));
        MutableStateFlow<Boolean> mutableStateFlow = this.v;
        if (c2 != null) {
            long j = coerceIn;
            long longValue = c2.longValue() + j;
            long j2 = i;
            if (j <= j2) {
            }
        }
        mutableStateFlow.setValue(Boolean.valueOf(z));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(a.AbstractC0383a.c.EnumC0385a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.z.a(buttonType);
    }

    public final void a(boolean z, a.AbstractC0383a.f fVar) {
        String h = this.a.h();
        if (h != null) {
            if (z) {
                this.z.a(fVar, Integer.valueOf(R()), this.j);
            }
            this.f.a(h);
            a(d.a.b);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l error) {
        Intrinsics.checkNotNullParameter(error, "error");
        a(new d.C0371d(error));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i progress) {
        Pair pair;
        Intrinsics.checkNotNullParameter(progress, "progress");
        boolean z = progress instanceof i.a;
        if (z) {
            int a2 = (int) ((i.a) progress).a();
            pair = TuplesKt.to(Integer.valueOf(a2), Integer.valueOf(a2));
        } else if (progress instanceof i.c) {
            i.c cVar = (i.c) progress;
            pair = TuplesKt.to(Integer.valueOf((int) cVar.c()), Integer.valueOf((int) cVar.d()));
        } else if (progress instanceof i.d) {
            pair = TuplesKt.to(Integer.valueOf(R()), Integer.valueOf((int) ((i.d) progress).b()));
        } else {
            if (!Intrinsics.areEqual(progress, i.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        int intValue = ((Number) pair.component1()).intValue();
        int intValue2 = ((Number) pair.component2()).intValue();
        this.C = intValue;
        if (!this.B && !(progress instanceof i.d)) {
            this.z.a(this.j, intValue, intValue2);
        }
        if (z) {
            this.p = intValue2;
            boolean booleanValue = this.o.getValue().booleanValue();
            this.o.setValue(Boolean.TRUE);
            if (!this.B && !booleanValue) {
                a(d.b.b);
                String h = this.a.h();
                if (h != null) {
                    this.f.b(h);
                }
                T();
            }
            this.B = false;
        }
        this.A.a(intValue, intValue2);
        b(intValue, intValue2);
    }
}

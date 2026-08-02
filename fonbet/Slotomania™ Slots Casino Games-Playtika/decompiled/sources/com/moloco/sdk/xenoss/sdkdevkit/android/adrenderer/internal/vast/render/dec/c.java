package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2829i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2837q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes7.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a {
    public static final int m = 8;
    public final C2829i a;
    public final r b;
    public final l c;
    public final CoroutineScope d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d e;
    public final d f;
    public final MutableSharedFlow<b> g;
    public final Flow<b> h;
    public final boolean i;
    public final String j;
    public final C2837q k;
    public final n l;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.DECControllerImpl$onEvent$1", f = "DECControllerImpl.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow mutableSharedFlow = c.this.g;
                b bVar = this.c;
                this.a = 1;
                if (mutableSharedFlow.emit(bVar, this) == coroutine_suspended) {
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

    public /* synthetic */ c(C2829i c2829i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVar, int i, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, r rVar, l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2829i, eVar, i, context, aVar, rVar, lVar);
    }

    public static Object b(c cVar) {
        return Reflection.property0(new PropertyReference0Impl(cVar.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d.class, "goNextAction", "getGoNextAction()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    public static Object c(c cVar) {
        return Reflection.property0(new PropertyReference0Impl(cVar.l, n.class, "vastPrivacyIcon", "getVastPrivacyIcon()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean J() {
        return this.i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e
    public C2837q M() {
        return this.k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    public StateFlow<j> O() {
        return this.l.O();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.d, null, 1, null);
        this.l.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e
    public String g() {
        return this.j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    public void i() {
        this.l.i();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    public StateFlow<d.a> l() {
        return this.e.l();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d
    public void reset() {
        this.e.reset();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a
    public void t() {
        this.f.b();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n
    public void u() {
        this.l.u();
    }

    public c(C2829i dec, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVar, int i, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, r externalLinkHandler, l linkHandler) {
        Intrinsics.checkNotNullParameter(dec, "dec");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        this.a = dec;
        this.b = externalLinkHandler;
        this.c = linkHandler;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.d = CoroutineScope;
        this.e = f.a(i, CoroutineScope);
        this.f = new d(customUserEventBuilderService, CollectionsKt.listOfNotNull(dec.l()), CollectionsKt.listOfNotNull(dec.q()), CollectionsKt.listOfNotNull(dec.r()), null, null, 48, null);
        MutableSharedFlow<b> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.g = MutableSharedFlow$default;
        this.h = MutableSharedFlow$default;
        this.i = dec.m() != null;
        this.j = dec.j();
        this.k = new C2837q(dec.k(), dec.o(), dec.n(), dec.p());
        this.l = p.a(eVar != null ? eVar.f() : null, eVar != null ? Integer.valueOf(eVar.h()) : null, eVar != null ? Integer.valueOf(eVar.d()) : null, eVar != null ? eVar.a() : null, CoroutineScope, context, customUserEventBuilderService, externalLinkHandler, null, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a
    public Flow<b> a() {
        return this.h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e
    public void b() {
        this.f.a();
        a(b.a);
    }

    public final Job a(b bVar) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new a(bVar, null), 3, null);
        return launch$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(a.AbstractC0383a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f.a(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void b(a.AbstractC0383a.f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        String m2 = this.a.m();
        if (m2 != null) {
            this.f.a(position);
            this.c.a(m2);
            a(b.b);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g
    public void a(a.AbstractC0383a.c.EnumC0385a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.f.a(buttonType);
    }
}

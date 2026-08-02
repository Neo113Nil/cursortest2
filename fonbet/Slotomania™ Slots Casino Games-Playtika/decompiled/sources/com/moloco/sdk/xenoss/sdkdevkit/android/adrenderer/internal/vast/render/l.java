package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import android.content.Context;
import com.moloco.sdk.internal.services.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2823d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2828h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.U;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes5.dex */
public final class l {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt", f = "PreparedVastResource.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {Base64.mimeLineLength, 140}, m = "prepareVastResource", n = {"$this$prepareVastResource", "context", "customUserEventBuilderService", "externalLinkHandler", "onWebViewClick", "onWebViewError", "linkHandler", "mraidHtml", "startMuted", "mraidInline", "staticWebView", "staticWebViewListenerScope"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0", "L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public boolean i;
        public /* synthetic */ Object j;
        public int k;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.k |= Integer.MIN_VALUE;
            return l.a(null, null, null, null, 0, 0, null, null, false, null, this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt$prepareVastResource$2", f = "PreparedVastResource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Ref.ObjectRef<String> b;
        public final /* synthetic */ y c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.ObjectRef<String> objectRef, y yVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = objectRef;
            this.c = yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.b, this.c, continuation);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.element = l.a(this.c);
            return Unit.INSTANCE;
        }
    }

    public static final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k {
        public final /* synthetic */ Integer a;
        public final /* synthetic */ Ref.ObjectRef<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m> b;
        public final /* synthetic */ Ref.ObjectRef<C2823d> c;
        public final /* synthetic */ Ref.ObjectRef<CoroutineScope> d;

        public c(Integer num, Ref.ObjectRef<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m> objectRef, Ref.ObjectRef<C2823d> objectRef2, Ref.ObjectRef<CoroutineScope> objectRef3) {
            this.a = num;
            this.b = objectRef;
            this.c = objectRef2;
            this.d = objectRef3;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
        public void destroy() {
            Integer num = this.a;
            if (num != null) {
                U.a.b(num.intValue());
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m mVar = this.b.element;
            if (mVar != null) {
                mVar.destroy();
            }
            this.b.element = null;
            C2823d c2823d = this.c.element;
            if (c2823d != null) {
                c2823d.destroy();
            }
            this.c.element = null;
            CoroutineScope coroutineScope = this.d.element;
            if (coroutineScope != null) {
                CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
            }
            this.d.element = null;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt$prepareVastResource$webView$1$1", f = "PreparedVastResource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0<Unit> function0, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((d) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.invoke();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt$prepareVastResource$webView$1$2", f = "PreparedVastResource.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a b;
        public final /* synthetic */ Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, Unit> c;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.PreparedVastResourceKt$prepareVastResource$webView$1$2$1", f = "PreparedVastResource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g, Continuation<? super Boolean>, Object> {
            public int a;
            public /* synthetic */ Object b;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, Continuation<? super Boolean> continuation) {
                return ((a) create(gVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.b) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar, Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, Unit> function1, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = aVar;
            this.c = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g> unrecoverableError = this.b.getUnrecoverableError();
                a aVar = new a(null);
                this.a = 1;
                obj = FlowKt.first(unrecoverableError, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj;
            if (gVar != null) {
                this.c.invoke(gVar);
            }
            return Unit.INSTANCE;
        }
    }

    public static final j a(y yVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        if (!(yVar instanceof y.c)) {
            return null;
        }
        y.c cVar = (y.c) yVar;
        if (cVar.a().a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.a) {
            return new j.b(cVar.a().b(), i, i2);
        }
        return null;
    }

    public static final Unit b() {
        return Unit.INSTANCE;
    }

    public static final String a(y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        if (yVar instanceof y.a) {
            y.a aVar = (y.a) yVar;
            if (C2828h.a.a(aVar.a().a())) {
                return aVar.a().a();
            }
            return null;
        }
        if (yVar instanceof y.b) {
            y.b bVar = (y.b) yVar;
            if (C2828h.a.a(bVar.a().a())) {
                return bVar.a().a();
            }
            return null;
        }
        if (yVar instanceof y.c) {
            y.c cVar = (y.c) yVar;
            if (cVar.a().a() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.b && C2828h.a.a(cVar.a().b())) {
                return cVar.a().b();
            }
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a] */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m] */
    /* JADX WARN: Type inference failed for: r2v7, types: [T, kotlinx.coroutines.CoroutineScope] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(y yVar, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, int i, int i2, Function0<Unit> function0, Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, Unit> function1, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar, Continuation<? super k> continuation) {
        a aVar2;
        int i3;
        Ref.ObjectRef objectRef;
        com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar3;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar2;
        Function1<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c, Unit> function12;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar2;
        y yVar2;
        boolean z2;
        Context context2;
        Function0<Unit> function02;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        String str;
        Ref.ObjectRef objectRef5;
        Ref.ObjectRef objectRef6;
        Ref.ObjectRef objectRef7;
        C2823d c2823d;
        Integer boxInt;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i4 = aVar2.k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar2.k = i4 - Integer.MIN_VALUE;
                Object obj = aVar2.j;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = aVar2.k;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj);
                    j a2 = a(yVar, i, i2);
                    if (a2 != null) {
                        return new k(a2, null);
                    }
                    objectRef = new Ref.ObjectRef();
                    CoroutineContext coroutineContext = com.moloco.sdk.internal.scheduling.b.a().getDefault();
                    b bVar = new b(objectRef, yVar, null);
                    aVar2.a = yVar;
                    aVar2.b = context;
                    aVar3 = aVar;
                    aVar2.c = aVar3;
                    rVar2 = rVar;
                    aVar2.d = rVar2;
                    aVar2.e = function0;
                    aVar2.f = function1;
                    aVar2.g = lVar;
                    aVar2.h = objectRef;
                    aVar2.i = z;
                    aVar2.k = 1;
                    if (BuildersKt.withContext(coroutineContext, bVar, aVar2) != coroutine_suspended) {
                        function12 = function1;
                        lVar2 = lVar;
                        yVar2 = yVar;
                        z2 = z;
                        context2 = context;
                        function02 = function0;
                    }
                    return coroutine_suspended;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef7 = (Ref.ObjectRef) aVar2.c;
                    objectRef6 = (Ref.ObjectRef) aVar2.b;
                    objectRef5 = (Ref.ObjectRef) aVar2.a;
                    ResultKt.throwOnFailure(obj);
                    if (obj instanceof C2823d) {
                        objectRef4 = objectRef7;
                        objectRef2 = objectRef5;
                        objectRef3 = objectRef6;
                        c2823d = null;
                    } else {
                        objectRef4 = objectRef7;
                        c2823d = (C2823d) obj;
                        objectRef2 = objectRef5;
                        objectRef3 = objectRef6;
                    }
                    boxInt = c2823d != null ? Boxing.boxInt(U.a.a(c2823d)) : null;
                    c cVar = new c(boxInt, objectRef2, objectRef3, objectRef4);
                    if (boxInt != null) {
                        return new k(new j.a(boxInt.intValue()), cVar);
                    }
                    return null;
                }
                z2 = aVar2.i;
                objectRef = (Ref.ObjectRef) aVar2.h;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l lVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l) aVar2.g;
                function12 = (Function1) aVar2.f;
                function02 = (Function0) aVar2.e;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r) aVar2.d;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar4 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a) aVar2.c;
                Context context3 = (Context) aVar2.b;
                yVar2 = (y) aVar2.a;
                ResultKt.throwOnFailure(obj);
                rVar2 = rVar3;
                aVar3 = aVar4;
                lVar2 = lVar3;
                context2 = context3;
                objectRef2 = new Ref.ObjectRef();
                objectRef3 = new Ref.ObjectRef();
                objectRef4 = new Ref.ObjectRef();
                str = (String) objectRef.element;
                if (str != null) {
                    Context applicationContext = context2.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    ?? aVar5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a(applicationContext, null, new t(rVar2, aVar3), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j.a(), false, null, 50, null);
                    objectRef3.element = aVar5;
                    ?? CoroutineScope = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
                    objectRef4.element = CoroutineScope;
                    FlowKt.launchIn(FlowKt.onEach(aVar5.getClickthroughEvent(), new d(function02, null)), CoroutineScope);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new e(aVar5, function12, null), 3, null);
                    q.a(aVar5, yVar2);
                    c2823d = aVar5;
                    if (c2823d != null) {
                    }
                    c cVar2 = new c(boxInt, objectRef2, objectRef3, objectRef4);
                    if (boxInt != null) {
                    }
                } else {
                    ?? mVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.m(context2, str, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return l.a();
                        }
                    }, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return l.b();
                        }
                    }, function02, function12, true, rVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h.a(context2, CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain()), z2), lVar2, null, 1024, null);
                    objectRef2.element = mVar;
                    aVar2.a = objectRef2;
                    aVar2.b = objectRef3;
                    aVar2.c = objectRef4;
                    aVar2.d = null;
                    aVar2.e = null;
                    aVar2.f = null;
                    aVar2.g = null;
                    aVar2.h = null;
                    aVar2.k = 2;
                    Object c2 = mVar.c(aVar2);
                    if (c2 != coroutine_suspended) {
                        objectRef5 = objectRef2;
                        objectRef6 = objectRef3;
                        obj = c2;
                        objectRef7 = objectRef4;
                        if (obj instanceof C2823d) {
                        }
                        if (c2823d != null) {
                        }
                        c cVar22 = new c(boxInt, objectRef2, objectRef3, objectRef4);
                        if (boxInt != null) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
        }
        aVar2 = new a(continuation);
        Object obj2 = aVar2.j;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = aVar2.k;
        if (i3 != 0) {
        }
        objectRef2 = new Ref.ObjectRef();
        objectRef3 = new Ref.ObjectRef();
        objectRef4 = new Ref.ObjectRef();
        str = (String) objectRef.element;
        if (str != null) {
        }
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }
}

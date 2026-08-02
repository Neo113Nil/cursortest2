package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.google.android.exoplayer2.RendererCapabilities;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes2.dex */
public final class e {

    public static final class a implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ BoxScope a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i b;
        public final /* synthetic */ Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> c;
        public final /* synthetic */ boolean d;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0326a extends FunctionReferenceImpl implements Function0<Unit> {
            public C0326a(Object obj) {
                super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "goNextAdPartOrDismissAd", "goNextAdPartOrDismissAd()V", 0);
            }

            public final void a() {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).x();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<a.AbstractC0383a.c, Unit> {
            public b(Object obj) {
                super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
            }

            public final void a(a.AbstractC0383a.c p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).a(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(a.AbstractC0383a.c cVar) {
                a(cVar);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function11, boolean z) {
            this.a = boxScope;
            this.b = iVar;
            this.c = function11;
            this.d = z;
        }

        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-880292845, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdGoNextButton.<anonymous>.<anonymous> (AdGoNextButton.kt:54)");
            }
            BoxScope boxScope = this.a;
            StateFlow<d.a> l = this.b.l();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar = this.b;
            composer.startReplaceableGroup(328190741);
            boolean changedInstance = composer.changedInstance(iVar);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new C0326a(iVar);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Function0 function0 = (Function0) ((KFunction) rememberedValue);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar2 = this.b;
            composer.startReplaceableGroup(328192462);
            boolean changedInstance2 = composer.changedInstance(iVar2);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new b(iVar2);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            e.a(boxScope, l, function0, (Function1) ((KFunction) rememberedValue2), this.c, this.d, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdGoNextButtonKt$GoNextButton$1$1", f = "AdGoNextButton.kt", i = {}, l = {com.safedk.android.analytics.brandsafety.creatives.discoveries.l.e}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ State<d.a> b;
        public final /* synthetic */ MutableState<Integer> c;

        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ MutableState<Integer> a;

            public a(MutableState<Integer> mutableState) {
                this.a = mutableState;
            }

            public final Object a(int i, Continuation<? super Unit> continuation) {
                e.a(this.a, i);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Number) obj).intValue(), continuation);
            }
        }

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$b$b, reason: collision with other inner class name */
        public static final class C0327b implements Flow<Integer> {
            public final /* synthetic */ Flow a;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$b$b$a */
            public static final class a<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector a;

                @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdGoNextButtonKt$GoNextButton$1$1$invokeSuspend$$inlined$filter$1$2", f = "AdGoNextButton.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$b$b$a$a, reason: collision with other inner class name */
                public static final class C0328a extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;
                    public Object d;

                    public C0328a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C0328a c0328a;
                    int i;
                    if (continuation instanceof C0328a) {
                        c0328a = (C0328a) continuation;
                        int i2 = c0328a.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0328a.b = i2 - Integer.MIN_VALUE;
                            Object obj2 = c0328a.a;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c0328a.b;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.a;
                                if (((Number) obj).intValue() > 0) {
                                    c0328a.b = 1;
                                    if (flowCollector.emit(obj, c0328a) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c0328a = new C0328a(continuation);
                    Object obj22 = c0328a.a;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c0328a.b;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            public C0327b(Flow flow) {
                this.a = flow;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                Object collect = this.a.collect(new a(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(State<? extends d.a> state, MutableState<Integer> mutableState, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = state;
            this.c = mutableState;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final State<d.a> state = this.b;
                Flow take = FlowKt.take(new C0327b(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$b$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(e.b.a(State.this));
                    }
                })), 1);
                a aVar = new a(this.c);
                this.a = 1;
                if (take.collect(aVar, this) == coroutine_suspended) {
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

        public static final int a(State state) {
            d.a a2 = e.a((State<? extends d.a>) state);
            d.a.b bVar = a2 instanceof d.a.b ? (d.a.b) a2 : null;
            if (bVar != null) {
                return bVar.b();
            }
            return 0;
        }
    }

    public static final Unit a(BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, i.a aVar, Function11 function11, Function11 function112, Function11 function113, int i, int i2, Composer composer, int i3) {
        a(boxScope, iVar, aVar, (Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>) function11, (Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>) function112, (Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>) function113, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit a(BoxScope boxScope, StateFlow stateFlow, Function0 function0, Function1 function1, Function11 function11, boolean z, int i, Composer composer, int i2) {
        a(boxScope, stateFlow, function0, function1, function11, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final BoxScope boxScope, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel, final i.a aVar, final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function11, final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function112, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function113, Composer composer, final int i, final int i2) {
        int i3;
        Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function114;
        Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function115;
        Boolean valueOf;
        final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function116;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        Composer startRestartGroup = composer.startRestartGroup(-449567267);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(adViewModel) : startRestartGroup.changedInstance(adViewModel) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(aVar) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function11) ? 2048 : 1024;
        }
        if ((i2 & 8) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function112) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ((i2 & 16) == 0 && startRestartGroup.changedInstance(function113)) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            function116 = function113;
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i3 &= -458753;
                }
            } else if ((i2 & 16) != 0) {
                i3 &= -458753;
                function114 = function11;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-449567267, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdGoNextButton (AdGoNextButton.kt:28)");
                }
                function115 = null;
                valueOf = aVar == null ? Boolean.valueOf(aVar.a()) : null;
                if (!Intrinsics.areEqual(valueOf, Boolean.TRUE)) {
                    function115 = function112;
                } else if (Intrinsics.areEqual(valueOf, Boolean.FALSE)) {
                    if (aVar instanceof i.a.c) {
                        function115 = function11;
                    } else {
                        if (!(aVar instanceof i.a.C0352a) && !(aVar instanceof i.a.b) && !(aVar instanceof i.a.d) && aVar != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        function115 = function114;
                    }
                } else if (valueOf != null) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean z = aVar instanceof i.a.C0352a;
                boolean z2 = (z || (aVar instanceof i.a.b) || !(aVar instanceof i.a.c)) ? false : true;
                if (function115 != null) {
                    ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -880292845, true, new a(boxScope, adViewModel, function115, z2));
                    if (z) {
                        startRestartGroup.startReplaceableGroup(-1024203648);
                        composableLambda.invoke(startRestartGroup, 6);
                        startRestartGroup.endReplaceableGroup();
                    } else if (aVar instanceof i.a.b) {
                        startRestartGroup.startReplaceableGroup(-1024201856);
                        composableLambda.invoke(startRestartGroup, 6);
                        startRestartGroup.endReplaceableGroup();
                    } else if (aVar instanceof i.a.c) {
                        startRestartGroup.startReplaceableGroup(-1024199968);
                        composableLambda.invoke(startRestartGroup, 6);
                        startRestartGroup.endReplaceableGroup();
                    } else {
                        startRestartGroup.startReplaceableGroup(-1685393183);
                        startRestartGroup.endReplaceableGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function116 = function114;
            }
            function114 = function113;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            function115 = null;
            if (aVar == null) {
            }
            if (!Intrinsics.areEqual(valueOf, Boolean.TRUE)) {
            }
            boolean z3 = aVar instanceof i.a.C0352a;
            if (z3) {
                if (function115 != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                function116 = function114;
            }
            if (function115 != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            function116 = function114;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e.a(BoxScope.this, adViewModel, aVar, function11, function112, function116, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void a(final BoxScope boxScope, final StateFlow<? extends d.a> stateFlow, final Function0<Unit> function0, final Function1<? super a.AbstractC0383a.c, Unit> function1, final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function11, final boolean z, Composer composer, final int i) {
        BoxScope boxScope2;
        int i2;
        Function0<Unit> function02;
        Function1<? super a.AbstractC0383a.c, Unit> function12;
        Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function112;
        Composer startRestartGroup = composer.startRestartGroup(706979519);
        if ((i & 6) == 0) {
            boxScope2 = boxScope;
            i2 = (startRestartGroup.changed(boxScope2) ? 4 : 2) | i;
        } else {
            boxScope2 = boxScope;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(stateFlow) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            function02 = function0;
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        if ((i & 3072) == 0) {
            function12 = function1;
            i2 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        } else {
            function12 = function1;
        }
        if ((i & 24576) == 0) {
            function112 = function11;
            i2 |= startRestartGroup.changedInstance(function112) ? 16384 : 8192;
        } else {
            function112 = function11;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(706979519, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.GoNextButton (AdGoNextButton.kt:83)");
            }
            State collectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(stateFlow, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, (i2 >> 3) & 14, 7);
            startRestartGroup.startReplaceableGroup(-2101080690);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            Unit unit = Unit.INSTANCE;
            startRestartGroup.startReplaceableGroup(-2101078598);
            boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new b(collectAsStateWithLifecycle, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
            int m11277constructorimpl = UInt.m11277constructorimpl(a((MutableState<Integer>) mutableState));
            d.a a2 = a((State<? extends d.a>) collectAsStateWithLifecycle);
            d.a.b bVar = a2 instanceof d.a.b ? (d.a.b) a2 : null;
            int m11277constructorimpl2 = UInt.m11277constructorimpl(bVar != null ? bVar.b() : 0);
            Boolean valueOf = Boolean.valueOf(a((State<? extends d.a>) collectAsStateWithLifecycle) instanceof d.a.C0370a);
            Boolean valueOf2 = Boolean.valueOf(!(a((State<? extends d.a>) collectAsStateWithLifecycle) instanceof d.a.c));
            Boolean valueOf3 = Boolean.valueOf(z);
            UInt m11271boximpl = UInt.m11271boximpl(m11277constructorimpl);
            UInt m11271boximpl2 = UInt.m11271boximpl(m11277constructorimpl2);
            startRestartGroup.startReplaceableGroup(-2101047518);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return e.a();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            int i3 = i2 << 3;
            function112.invoke(boxScope2, valueOf, valueOf2, function02, function12, valueOf3, m11271boximpl, m11271boximpl2, (Function0) rememberedValue3, startRestartGroup, Integer.valueOf((i2 & 14) | 100663296 | (i3 & 7168) | (i3 & 57344) | (458752 & i2) | ((i2 << 15) & 1879048192)));
            startRestartGroup = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e.a(BoxScope.this, stateFlow, function0, function1, function11, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void a(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public static final d.a a(State<? extends d.a> state) {
        return state.getValue();
    }

    public static final int a(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }
}

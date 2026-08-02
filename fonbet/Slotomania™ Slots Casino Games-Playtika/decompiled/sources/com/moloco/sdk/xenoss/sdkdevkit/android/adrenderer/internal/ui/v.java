package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2826g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.ResultKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes2.dex */
public final class v {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.LifecycleAwareAdCountdownButtonKt$LifecycleAwareAdCountdownButton$1$1", f = "LifecycleAwareAdCountdownButton.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ State<UInt> b;
        public final /* synthetic */ State<Function0<Unit>> c;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v$a$a, reason: collision with other inner class name */
        public static final class C0332a<T> implements FlowCollector {
            public final /* synthetic */ State<Function0<Unit>> a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0332a(State<? extends Function0<Unit>> state) {
                this.a = state;
            }

            public final Object a(int i, Continuation<? super Unit> continuation) {
                v.b(this.a).invoke();
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((UInt) obj).getData(), continuation);
            }
        }

        public static final class b implements Flow<UInt> {
            public final /* synthetic */ Flow a;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v$a$b$a, reason: collision with other inner class name */
            public static final class C0333a<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector a;

                @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.LifecycleAwareAdCountdownButtonKt$LifecycleAwareAdCountdownButton$1$1$invokeSuspend$$inlined$filter$1$2", f = "LifecycleAwareAdCountdownButton.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v$a$b$a$a, reason: collision with other inner class name */
                public static final class C0334a extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;
                    public Object d;

                    public C0334a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0333a.this.emit(null, this);
                    }
                }

                public C0333a(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C0334a c0334a;
                    int i;
                    if (continuation instanceof C0334a) {
                        c0334a = (C0334a) continuation;
                        int i2 = c0334a.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0334a.b = i2 - Integer.MIN_VALUE;
                            Object obj2 = c0334a.a;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = c0334a.b;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.a;
                                if (((UInt) obj).getData() == 0) {
                                    c0334a.b = 1;
                                    if (flowCollector.emit(obj, c0334a) == coroutine_suspended) {
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
                    c0334a = new C0334a(continuation);
                    Object obj22 = c0334a.a;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c0334a.b;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            public b(Flow flow) {
                this.a = flow;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UInt> flowCollector, Continuation continuation) {
                Object collect = this.a.collect(new C0333a(flowCollector), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(State<UInt> state, State<? extends Function0<Unit>> state2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = state;
            this.c = state2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final State<UInt> state = this.b;
                b bVar = new b(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v$a$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return v.a.a(State.this);
                    }
                }));
                C0332a c0332a = new C0332a(this.c);
                this.a = 1;
                if (bVar.collect(c0332a, this) == coroutine_suspended) {
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

        public static final UInt a(State state) {
            return UInt.m11271boximpl(v.a(state));
        }
    }

    public static final Unit a(BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m mVar, boolean z, boolean z2, Function0 function0, Function0 function02, Function1 function1, Function11 function11, boolean z3, Flow flow, int i, int i2, Composer composer, int i3) {
        a(boxScope, mVar, z, z2, function0, function02, function1, function11, z3, flow, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Function0<Unit> b(State<? extends Function0<Unit>> state) {
        return state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final BoxScope boxScope, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<UInt> initialSecondsLeft, final boolean z, final boolean z2, final Function0<Unit> onCountdownFinished, final Function0<Unit> onClick, final Function1<? super a.AbstractC0383a.c, Unit> onButtonRendered, final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> basedOnAdCountdownButton, final boolean z3, Flow<Boolean> flow, Composer composer, final int i, final int i2) {
        int i3;
        boolean z4;
        boolean z5;
        int i4;
        Flow<Boolean> flow2;
        Flow<Boolean> flow3;
        Object rememberedValue;
        Composer.Companion companion;
        boolean changed;
        Object rememberedValue2;
        boolean changed2;
        Object rememberedValue3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Intrinsics.checkNotNullParameter(initialSecondsLeft, "initialSecondsLeft");
        Intrinsics.checkNotNullParameter(onCountdownFinished, "onCountdownFinished");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(basedOnAdCountdownButton, "basedOnAdCountdownButton");
        Composer startRestartGroup = composer.startRestartGroup(1211286303);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(initialSecondsLeft) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
            if ((i2 & 4) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                if ((i2 & 8) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(onCountdownFinished) ? 16384 : 8192;
                }
                if ((i2 & 16) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changedInstance(onClick) ? 131072 : 65536;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(onButtonRendered) ? 1048576 : 524288;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(basedOnAdCountdownButton) ? 8388608 : 4194304;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    z5 = z3;
                    i3 |= startRestartGroup.changed(z5) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    i4 = i2 & 256;
                    if (i4 == 0) {
                        i3 |= C.ENCODING_PCM_32BIT;
                        flow2 = flow;
                    } else {
                        flow2 = flow;
                        if ((i & C.ENCODING_PCM_32BIT) == 0) {
                            i3 |= startRestartGroup.changedInstance(flow2) ? 536870912 : 268435456;
                        }
                    }
                    if ((i3 & 306783379) == 306783378 || !startRestartGroup.getSkipping()) {
                        flow3 = i4 == 0 ? null : flow2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1211286303, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.LifecycleAwareAdCountdownButton (LifecycleAwareAdCountdownButton.kt:35)");
                        }
                        startRestartGroup.startReplaceableGroup(773894976);
                        startRestartGroup.startReplaceableGroup(-492369756);
                        rememberedValue = startRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (rememberedValue == companion.getEmpty()) {
                            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                            startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            rememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        startRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.startReplaceableGroup(1117957914);
                        changed = ((i3 & 112) != 32) | startRestartGroup.changed(flow3);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue2 == companion.getEmpty()) {
                            rememberedValue2 = C2826g.a(initialSecondsLeft.a().getData(), coroutineScope, flow3);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceableGroup();
                        State collectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle((StateFlow) rememberedValue2, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 0, 7);
                        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onCountdownFinished, startRestartGroup, (i3 >> 12) & 14);
                        Unit unit = Unit.INSTANCE;
                        Flow<Boolean> flow4 = flow3;
                        startRestartGroup.startReplaceableGroup(1117966956);
                        changed2 = startRestartGroup.changed(collectAsStateWithLifecycle) | startRestartGroup.changed(rememberUpdatedState);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed2 || rememberedValue3 == companion.getEmpty()) {
                            rememberedValue3 = new a(collectAsStateWithLifecycle, rememberUpdatedState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 6);
                        int i5 = i3 >> 6;
                        basedOnAdCountdownButton.invoke(boxScope, Boolean.valueOf(z4), Boolean.valueOf(z), onClick, onButtonRendered, Boolean.valueOf(z5), initialSecondsLeft.a(), UInt.m11271boximpl(a(collectAsStateWithLifecycle)), b(rememberUpdatedState), startRestartGroup, Integer.valueOf((i5 & 57344) | (i3 & 14) | (i5 & 112) | (i3 & 896) | (i5 & 7168) | ((i3 >> 9) & 458752) | ((i3 << 6) & 1879048192)));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        flow2 = flow4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Flow<Boolean> flow5 = flow2;
                        endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return v.a(BoxScope.this, initialSecondsLeft, z, z2, onCountdownFinished, onClick, onButtonRendered, basedOnAdCountdownButton, z3, flow5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                z5 = z3;
                i4 = i2 & 256;
                if (i4 == 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(773894976);
                startRestartGroup.startReplaceableGroup(-492369756);
                rememberedValue = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1117957914);
                changed = ((i3 & 112) != 32) | startRestartGroup.changed(flow3);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = C2826g.a(initialSecondsLeft.a().getData(), coroutineScope2, flow3);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                State collectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle((StateFlow) rememberedValue2, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 0, 7);
                State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(onCountdownFinished, startRestartGroup, (i3 >> 12) & 14);
                Unit unit2 = Unit.INSTANCE;
                Flow<Boolean> flow42 = flow3;
                startRestartGroup.startReplaceableGroup(1117966956);
                changed2 = startRestartGroup.changed(collectAsStateWithLifecycle2) | startRestartGroup.changed(rememberUpdatedState2);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue3 = new a(collectAsStateWithLifecycle2, rememberUpdatedState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 6);
                int i52 = i3 >> 6;
                basedOnAdCountdownButton.invoke(boxScope, Boolean.valueOf(z4), Boolean.valueOf(z), onClick, onButtonRendered, Boolean.valueOf(z5), initialSecondsLeft.a(), UInt.m11271boximpl(a(collectAsStateWithLifecycle2)), b(rememberUpdatedState2), startRestartGroup, Integer.valueOf((i52 & 57344) | (i3 & 14) | (i52 & 112) | (i3 & 896) | (i52 & 7168) | ((i3 >> 9) & 458752) | ((i3 << 6) & 1879048192)));
                if (ComposerKt.isTraceInProgress()) {
                }
                flow2 = flow42;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z2;
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            z5 = z3;
            i4 = i2 & 256;
            if (i4 == 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            rememberedValue = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1117957914);
            changed = ((i3 & 112) != 32) | startRestartGroup.changed(flow3);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = C2826g.a(initialSecondsLeft.a().getData(), coroutineScope22, flow3);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            State collectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle((StateFlow) rememberedValue2, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 0, 7);
            State rememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(onCountdownFinished, startRestartGroup, (i3 >> 12) & 14);
            Unit unit22 = Unit.INSTANCE;
            Flow<Boolean> flow422 = flow3;
            startRestartGroup.startReplaceableGroup(1117966956);
            changed2 = startRestartGroup.changed(collectAsStateWithLifecycle22) | startRestartGroup.changed(rememberUpdatedState22);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue3 = new a(collectAsStateWithLifecycle22, rememberUpdatedState22, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 6);
            int i522 = i3 >> 6;
            basedOnAdCountdownButton.invoke(boxScope, Boolean.valueOf(z4), Boolean.valueOf(z), onClick, onButtonRendered, Boolean.valueOf(z5), initialSecondsLeft.a(), UInt.m11271boximpl(a(collectAsStateWithLifecycle22)), b(rememberUpdatedState22), startRestartGroup, Integer.valueOf((i522 & 57344) | (i3 & 14) | (i522 & 112) | (i3 & 896) | (i522 & 7168) | ((i3 >> 9) & 458752) | ((i3 << 6) & 1879048192)));
            if (ComposerKt.isTraceInProgress()) {
            }
            flow2 = flow422;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        z4 = z2;
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        z5 = z3;
        i4 = i2 & 256;
        if (i4 == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(773894976);
        startRestartGroup.startReplaceableGroup(-492369756);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1117957914);
        changed = ((i3 & 112) != 32) | startRestartGroup.changed(flow3);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = C2826g.a(initialSecondsLeft.a().getData(), coroutineScope222, flow3);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        State collectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle((StateFlow) rememberedValue2, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, startRestartGroup, 0, 7);
        State rememberUpdatedState222 = SnapshotStateKt.rememberUpdatedState(onCountdownFinished, startRestartGroup, (i3 >> 12) & 14);
        Unit unit222 = Unit.INSTANCE;
        Flow<Boolean> flow4222 = flow3;
        startRestartGroup.startReplaceableGroup(1117966956);
        changed2 = startRestartGroup.changed(collectAsStateWithLifecycle222) | startRestartGroup.changed(rememberUpdatedState222);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue3 = new a(collectAsStateWithLifecycle222, rememberUpdatedState222, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(unit222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 6);
        int i5222 = i3 >> 6;
        basedOnAdCountdownButton.invoke(boxScope, Boolean.valueOf(z4), Boolean.valueOf(z), onClick, onButtonRendered, Boolean.valueOf(z5), initialSecondsLeft.a(), UInt.m11271boximpl(a(collectAsStateWithLifecycle222)), b(rememberUpdatedState222), startRestartGroup, Integer.valueOf((i5222 & 57344) | (i3 & 14) | (i5222 & 112) | (i3 & 896) | (i5222 & 7168) | ((i3 >> 9) & 458752) | ((i3 << 6) & 1879048192)));
        if (ComposerKt.isTraceInProgress()) {
        }
        flow2 = flow4222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final int a(State<UInt> state) {
        return state.getValue().getData();
    }
}

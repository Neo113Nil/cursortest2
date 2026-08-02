package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.RendererCapabilities;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class h {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearKt$Linear$1$1", f = "Linear.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k b;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearKt$Linear$1$1$1", f = "Linear.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$a$a, reason: collision with other inner class name */
        public static final class C0361a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0361a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, Continuation<? super C0361a> continuation) {
                super(2, continuation);
                this.b = kVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0361a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0361a(this.b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.b();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext main = com.moloco.sdk.internal.scheduling.b.a().getMain();
                C0361a c0361a = new C0361a(this.b, null);
                this.a = 1;
                if (BuildersKt.withContext(main, c0361a, this) == coroutine_suspended) {
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

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l, Unit> {
        public b(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/VastAdShowError;)V", 0);
        }

        public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar) {
            a(lVar);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.LinearKt$Linear$2$5$1", f = "Linear.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = function0;
            this.d = kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((c) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.c, this.d, continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.b;
                final Function0<Unit> function0 = this.c;
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar = this.d;
                Function2 function2 = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$c$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return h.c.a(Function0.this, kVar, (Offset) obj2, (Offset) obj3);
                    }
                };
                this.a = 1;
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a(pointerInputScope, function2, this) == coroutine_suspended) {
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

        public static final Unit a(Function0 function0, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, Offset offset, Offset offset2) {
            if (function0 != null) {
                function0.invoke();
            } else {
                kVar.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.a.a(offset.getPackedValue()));
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public d(Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onMuteChange", "onMuteChange(Z)V", 0);
        }

        public final void a(boolean z) {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).c(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function0<Unit> {
        public e(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onVastPrivacyIconDisplayed", "onVastPrivacyIconDisplayed()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class f extends FunctionReferenceImpl implements Function0<Unit> {
        public f(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.class, "onVastPrivacyIconClick", "onVastPrivacyIconClick()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k) this.receiver).u();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final class g implements Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<? extends Unit>, Function0<? extends Unit>, Composer, Integer, Unit> {
        public final /* synthetic */ Alignment a;
        public final /* synthetic */ PaddingValues b;

        public static final class a implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j a;
            public final /* synthetic */ Function0<Unit> b;
            public final /* synthetic */ Function0<Unit> c;

            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Function0<Unit> function0, Function0<Unit> function02) {
                this.a = jVar;
                this.b = function0;
                this.c = function02;
            }

            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(989733896, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon.<anonymous>.<anonymous> (Linear.kt:155)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar = this.a;
                if (jVar != null) {
                    l.a(jVar, this.b, this.c, null, composer, 0, 8);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                a(animatedVisibilityScope, composer, num.intValue());
                return Unit.INSTANCE;
            }
        }

        public g(Alignment alignment, PaddingValues paddingValues) {
            this.a = alignment;
            this.b = paddingValues;
        }

        public final void a(BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Function0<Unit> onDisplayed, Function0<Unit> onClick, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onDisplayed, "onDisplayed");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            if ((i & 6) == 0) {
                i2 = (composer.changed(boxScope) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(jVar) ? 32 : 16;
            }
            if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
                i2 |= composer.changedInstance(onDisplayed) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= composer.changedInstance(onClick) ? 2048 : 1024;
            }
            if ((i2 & 9363) == 9362 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-903645392, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon.<anonymous> (Linear.kt:149)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(jVar != null, PaddingKt.padding(boxScope.align(Modifier.INSTANCE, this.a), this.b), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 989733896, true, new a(jVar, onDisplayed, onClick)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Function0<? extends Unit> function0, Function0<? extends Unit> function02, Composer composer, Integer num) {
            a(boxScope, jVar, function0, function02, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, Function0 function0, Modifier modifier, Function7 function7, Function5 function5, Function6 function6, Function7 function72, Q q, Function0 function02, int i, int i2, Composer composer, int i3) {
        a(kVar, function0, modifier, function7, function5, function6, function72, q, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void b(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i c(MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k viewModel, final Function0<Unit> function0, Modifier modifier, final Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit>, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit> function7, final Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function5, final Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function6, final Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function72, final Q viewVisibilityTracker, final Function0<Unit> onShouldReplay, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object rememberedValue;
        int currentCompositeKeyHash;
        Composer m1642constructorimpl;
        Object rememberedValue2;
        Composer.Companion companion;
        final MutableState mutableState;
        Object rememberedValue3;
        State state;
        final MutableState mutableState2;
        Object rememberedValue4;
        boolean z2;
        Object rememberedValue5;
        boolean z3;
        Object rememberedValue6;
        boolean z4;
        Object rememberedValue7;
        boolean z5;
        Object rememberedValue8;
        boolean z6;
        Object rememberedValue9;
        Composer composer2;
        MutableState mutableState3;
        int i4;
        int i5;
        int i6;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(onShouldReplay, "onShouldReplay");
        Composer startRestartGroup = composer.startRestartGroup(-1913678167);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(viewModel) : startRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function7) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function5) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= startRestartGroup.changedInstance(function6) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= startRestartGroup.changedInstance(function72) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= (16777216 & i) == 0 ? startRestartGroup.changed(viewVisibilityTracker) : startRestartGroup.changedInstance(viewVisibilityTracker) ? 8388608 : 4194304;
            }
            if ((i2 & 256) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changedInstance(onShouldReplay) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            if ((38347923 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1913678167, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.Linear (Linear.kt:40)");
                }
                Unit unit = Unit.INSTANCE;
                startRestartGroup.startReplaceableGroup(1664827545);
                int i8 = i3 & 14;
                z = i8 != 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(viewModel));
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new a(viewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier4);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.useNode();
                } else {
                    startRestartGroup.createNode(constructor);
                }
                m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
                Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!m1642constructorimpl.getInserting() || !Intrinsics.areEqual(m1642constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                State collectAsState = SnapshotStateKt.collectAsState(viewModel.Q(), null, startRestartGroup, 0, 1);
                State collectAsState2 = SnapshotStateKt.collectAsState(viewModel.q(), null, startRestartGroup, 0, 1);
                startRestartGroup.startReplaceableGroup(1087103523);
                rememberedValue2 = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                mutableState = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1087106315);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 != companion.getEmpty()) {
                    state = collectAsState2;
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(i.b.b, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                } else {
                    state = collectAsState2;
                }
                mutableState2 = (MutableState) rememberedValue3;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1087112304);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m(Boolean.TRUE), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                final MutableState mutableState4 = (MutableState) rememberedValue4;
                startRestartGroup.endReplaceableGroup();
                int i9 = i3;
                String G = viewModel.G();
                boolean L = viewModel.L();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> a2 = a((MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean>>) mutableState4);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> a3 = a((State<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long>>) collectAsState);
                boolean b2 = b((State<Boolean>) state);
                startRestartGroup.startReplaceableGroup(1087122634);
                z2 = i8 != 4 || ((i9 & 8) != 0 && startRestartGroup.changedInstance(viewModel));
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!z2 || rememberedValue5 == companion.getEmpty()) {
                    rememberedValue5 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, mutableState, ((Boolean) obj).booleanValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                Function1 function1 = (Function1) rememberedValue5;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1087126542);
                z3 = i8 != 4 || ((i9 & 8) != 0 && startRestartGroup.changedInstance(viewModel));
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!z3 || rememberedValue6 == companion.getEmpty()) {
                    rememberedValue6 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, ((Boolean) obj).booleanValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                Function1 function12 = (Function1) rememberedValue6;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1087134824);
                z4 = i8 != 4 || ((i9 & 8) != 0 && startRestartGroup.changedInstance(viewModel));
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!z4 || rememberedValue7 == companion.getEmpty()) {
                    rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, mutableState2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                Function1 function13 = (Function1) rememberedValue7;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1087138431);
                z5 = i8 != 4 || ((i9 & 8) != 0 && startRestartGroup.changedInstance(viewModel));
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!z5 || rememberedValue8 == companion.getEmpty()) {
                    rememberedValue8 = new b(viewModel);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                startRestartGroup.endReplaceableGroup();
                Function1 function14 = (Function1) ((KFunction) rememberedValue8);
                Modifier matchParentSize = boxScopeInstance.matchParentSize(Modifier.INSTANCE);
                startRestartGroup.startReplaceableGroup(1087142612);
                z6 = ((i9 & 112) != 32) | (i8 != 4 || ((i9 & 8) != 0 && startRestartGroup.changedInstance(viewModel)));
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (!z6 || rememberedValue9 == companion.getEmpty()) {
                    rememberedValue9 = new c(function0, viewModel, null);
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                startRestartGroup.endReplaceableGroup();
                q.a(G, L, a2, a3, b2, function1, function12, viewVisibilityTracker, function13, function14, SuspendingPointerInputFilterKt.pointerInput(matchParentSize, unit, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue9), startRestartGroup, i9 & 29360128, 0, 0);
                composer2 = startRestartGroup;
                composer2.startReplaceableGroup(1087152169);
                if (function72 != null) {
                    composer2.startReplaceableGroup(1376164556);
                    Object rememberedValue10 = composer2.rememberedValue();
                    if (rememberedValue10 == companion.getEmpty()) {
                        rememberedValue10 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return h.a(MutableState.this, ((Boolean) obj).booleanValue());
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue10);
                    }
                    composer2.endReplaceableGroup();
                    function72.invoke(boxScopeInstance, Boolean.valueOf(b((MutableState<Boolean>) mutableState)), c((MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>) mutableState2), (Function1) rememberedValue10, onShouldReplay, composer2, Integer.valueOf(((i9 >> 12) & 57344) | 3078));
                }
                composer2.endReplaceableGroup();
                boolean z7 = (b((MutableState<Boolean>) mutableState) && (c((MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>) mutableState2) instanceof i.a)) ? false : true;
                composer2.startReplaceableGroup(1087171337);
                if (function7 != null) {
                    mutableState3 = mutableState;
                    i6 = i8;
                    i4 = 4;
                    i5 = 1;
                } else {
                    Boolean valueOf = Boolean.valueOf(z7);
                    Boolean valueOf2 = Boolean.valueOf(b((State<Boolean>) state));
                    composer2.startReplaceableGroup(1376183992);
                    boolean z8 = i8 == 4 || ((i9 & 8) != 0 && composer2.changedInstance(viewModel));
                    Object rememberedValue11 = composer2.rememberedValue();
                    if (z8 || rememberedValue11 == companion.getEmpty()) {
                        rememberedValue11 = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, (a.AbstractC0383a.c) obj, (a.AbstractC0383a.c.EnumC0385a) obj2);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue11);
                    }
                    Function2 function2 = (Function2) rememberedValue11;
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(1376189411);
                    boolean z9 = i8 == 4 || ((i9 & 8) != 0 && composer2.changedInstance(viewModel));
                    Object rememberedValue12 = composer2.rememberedValue();
                    if (z9 || rememberedValue12 == companion.getEmpty()) {
                        rememberedValue12 = new d(viewModel);
                        composer2.updateRememberedValue(rememberedValue12);
                    }
                    KFunction kFunction = (KFunction) rememberedValue12;
                    composer2.endReplaceableGroup();
                    mutableState3 = mutableState;
                    i4 = 4;
                    i5 = 1;
                    i6 = i8;
                    function7.invoke(boxScopeInstance, valueOf, valueOf2, function2, kFunction, composer2, 6);
                    composer2 = composer2;
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(1087179946);
                if (function5 != null) {
                    Composer composer3 = composer2;
                    function5.invoke(boxScopeInstance, Boolean.valueOf(b((MutableState<Boolean>) mutableState3)), c((MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>) mutableState2), composer3, 6);
                    composer2 = composer3;
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(1087182738);
                if (function6 != null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j c2 = c((State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j>) SnapshotStateKt.collectAsState(viewModel.O(), null, composer2, 0, i5));
                    composer2.startReplaceableGroup(1376198609);
                    int i10 = (i6 == i4 || ((i9 & 8) != 0 && composer2.changedInstance(viewModel))) ? i5 : 0;
                    Object rememberedValue13 = composer2.rememberedValue();
                    if (i10 != 0 || rememberedValue13 == companion.getEmpty()) {
                        rememberedValue13 = new e(viewModel);
                        composer2.updateRememberedValue(rememberedValue13);
                    }
                    KFunction kFunction2 = (KFunction) rememberedValue13;
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(1376200365);
                    if (i6 != i4 && ((i9 & 8) == 0 || !composer2.changedInstance(viewModel))) {
                        i5 = 0;
                    }
                    Object rememberedValue14 = composer2.rememberedValue();
                    if (i5 != 0 || rememberedValue14 == companion.getEmpty()) {
                        rememberedValue14 = new f(viewModel);
                        composer2.updateRememberedValue(rememberedValue14);
                    }
                    composer2.endReplaceableGroup();
                    function6.invoke(boxScopeInstance, c2, kFunction2, (KFunction) rememberedValue14, composer2, 6);
                }
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
                modifier3 = modifier2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, function0, modifier3, function7, function5, function6, function72, viewVisibilityTracker, onShouldReplay, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Unit unit2 = Unit.INSTANCE;
        startRestartGroup.startReplaceableGroup(1664827545);
        int i82 = i3 & 14;
        if (i82 != 4) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new a(viewModel, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier4);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
        Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
        if (!m1642constructorimpl.getInserting()) {
        }
        m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        modifierMaterializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        State collectAsState3 = SnapshotStateKt.collectAsState(viewModel.Q(), null, startRestartGroup, 0, 1);
        State collectAsState22 = SnapshotStateKt.collectAsState(viewModel.q(), null, startRestartGroup, 0, 1);
        startRestartGroup.startReplaceableGroup(1087103523);
        rememberedValue2 = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue2 == companion.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1087106315);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 != companion.getEmpty()) {
        }
        mutableState2 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1087112304);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
        }
        final MutableState mutableState42 = (MutableState) rememberedValue4;
        startRestartGroup.endReplaceableGroup();
        int i92 = i3;
        String G2 = viewModel.G();
        boolean L2 = viewModel.L();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> a22 = a((MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean>>) mutableState42);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> a32 = a((State<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long>>) collectAsState3);
        boolean b22 = b((State<Boolean>) state);
        startRestartGroup.startReplaceableGroup(1087122634);
        if (i82 != 4) {
        }
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue5 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, mutableState, ((Boolean) obj).booleanValue());
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue5);
        Function1 function15 = (Function1) rememberedValue5;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1087126542);
        if (i82 != 4) {
        }
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue6 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, ((Boolean) obj).booleanValue());
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue6);
        Function1 function122 = (Function1) rememberedValue6;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1087134824);
        if (i82 != 4) {
        }
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k.this, mutableState2, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) obj);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue7);
        Function1 function132 = (Function1) rememberedValue7;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(1087138431);
        if (i82 != 4) {
        }
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (!z5) {
        }
        rememberedValue8 = new b(viewModel);
        startRestartGroup.updateRememberedValue(rememberedValue8);
        startRestartGroup.endReplaceableGroup();
        Function1 function142 = (Function1) ((KFunction) rememberedValue8);
        Modifier matchParentSize2 = boxScopeInstance2.matchParentSize(Modifier.INSTANCE);
        startRestartGroup.startReplaceableGroup(1087142612);
        z6 = ((i92 & 112) != 32) | (i82 != 4 || ((i92 & 8) != 0 && startRestartGroup.changedInstance(viewModel)));
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (!z6) {
        }
        rememberedValue9 = new c(function0, viewModel, null);
        startRestartGroup.updateRememberedValue(rememberedValue9);
        startRestartGroup.endReplaceableGroup();
        q.a(G2, L2, a22, a32, b22, function15, function122, viewVisibilityTracker, function132, function142, SuspendingPointerInputFilterKt.pointerInput(matchParentSize2, unit2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue9), startRestartGroup, i92 & 29360128, 0, 0);
        composer2 = startRestartGroup;
        composer2.startReplaceableGroup(1087152169);
        if (function72 != null) {
        }
        composer2.endReplaceableGroup();
        if (b((MutableState<Boolean>) mutableState)) {
        }
        composer2.startReplaceableGroup(1087171337);
        if (function7 != null) {
        }
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(1087179946);
        if (function5 != null) {
        }
        composer2.endReplaceableGroup();
        composer2.startReplaceableGroup(1087182738);
        if (function6 != null) {
        }
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j c(State<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> state) {
        return state.getValue();
    }

    public static final boolean b(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final boolean b(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, MutableState mutableState, boolean z) {
        kVar.d(z);
        b(mutableState, z);
        return Unit.INSTANCE;
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, boolean z) {
        if (z) {
            kVar.D();
        } else {
            kVar.F();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, MutableState mutableState, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i it) {
        Intrinsics.checkNotNullParameter(it, "it");
        kVar.a(it);
        a((MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i>) mutableState, it);
        return Unit.INSTANCE;
    }

    public static final Unit a(MutableState mutableState, boolean z) {
        a((MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean>>) mutableState, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean>) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m(Boolean.valueOf(z)));
        return Unit.INSTANCE;
    }

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k kVar, a.AbstractC0383a.c button, a.AbstractC0383a.c.EnumC0385a buttonType) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        kVar.a(button);
        kVar.a(buttonType);
        return Unit.INSTANCE;
    }

    public static final Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit> a(Alignment alignment, PaddingValues paddingValues, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1318345093);
        if ((i2 & 1) != 0) {
            alignment = Alignment.INSTANCE.getBottomStart();
        }
        if ((i2 & 2) != 0) {
            paddingValues = PaddingKt.m578PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1318345093, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastIcon (Linear.kt:148)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -903645392, true, new g(alignment, paddingValues));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long> a(State<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Long>> state) {
        return state.getValue();
    }

    public static final void a(MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> mutableState, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        mutableState.setValue(iVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> a(MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean>> mutableState) {
        return mutableState.getValue();
    }

    public static final void a(MutableState<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean>> mutableState, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m<Boolean> mVar) {
        mutableState.setValue(mVar);
    }
}

package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.RendererCapabilities;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class c {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerKt$RewardedCountDownTimer$1$1", f = "RewardedCountDownTimer.kt", i = {0, 1}, l = {90, 98}, m = "invokeSuspend", n = {"currentSeconds", "currentSeconds"}, s = {"I$0", "I$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> e;
        public final /* synthetic */ Function0<Unit> f;
        public final /* synthetic */ MutableState<Integer> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, Animatable<Float, AnimationVector1D> animatable, Function0<Unit> function0, MutableState<Integer> mutableState, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = i2;
            this.e = animatable;
            this.f = function0;
            this.g = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.c, this.d, this.e, this.f, this.g, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
        
            if (r11.c == 0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
        
            r11.f.invoke();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
        
            if (r15.snapTo(r2, r14) == r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
        
            if (r11.c == 0) goto L42;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Throwable th;
            a aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        int b = c.b(this.g);
                        i = this.c;
                        float a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a(i, this.d);
                        if (i < b) {
                            try {
                                int coerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtLeast(b - i, 0) * 1000, 0);
                                Animatable<Float, AnimationVector1D> animatable = this.e;
                                Float boxFloat = Boxing.boxFloat(a);
                                TweenSpec tween$default = AnimationSpecKt.tween$default(coerceAtLeast, 0, EasingKt.getLinearEasing(), 2, null);
                                this.a = i;
                                this.b = 1;
                                aVar = this;
                                if (Animatable.animateTo$default(animatable, boxFloat, tween$default, null, null, aVar, 12, null) == coroutine_suspended) {
                                }
                                c.a(aVar.g, i);
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2 = this;
                                th = th;
                                c.a(aVar2.g, i);
                                if (aVar2.c == 0) {
                                }
                            }
                        } else {
                            aVar = this;
                            Animatable<Float, AnimationVector1D> animatable2 = aVar.e;
                            Float boxFloat2 = Boxing.boxFloat(a);
                            aVar.a = i;
                            aVar.b = 2;
                        }
                        return coroutine_suspended;
                    }
                    try {
                        if (i == 1) {
                            i = this.a;
                            ResultKt.throwOnFailure(obj);
                            aVar = this;
                            c.a(aVar.g, i);
                        } else {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i = this.a;
                            ResultKt.throwOnFailure(obj);
                            aVar = this;
                            Unit unit = Unit.INSTANCE;
                            c.a(aVar.g, i);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        aVar2 = this;
                        c.a(aVar2.g, i);
                        if (aVar2.c == 0) {
                            throw th;
                        }
                        aVar2.f.invoke();
                        throw th;
                    }
                } catch (CancellationException unused) {
                    aVar = this;
                    c.a(aVar.g, i);
                }
            } catch (CancellationException unused2) {
                c.a(aVar.g, i);
            } catch (Throwable th4) {
                th = th4;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerKt$RewardedCountDownTimer$2$1", f = "RewardedCountDownTimer.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> b;
        public final /* synthetic */ MutableState<Boolean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Animatable<Float, AnimationVector1D> animatable, MutableState<Boolean> mutableState, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = animatable;
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
                if (!c.a(this.c)) {
                    Animatable<Float, AnimationVector1D> animatable = this.b;
                    this.a = 1;
                    if (animatable.stop(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$c, reason: collision with other inner class name */
    public static final class C0331c implements DisposableEffectResult {
        public final /* synthetic */ LifecycleOwner a;
        public final /* synthetic */ LifecycleEventObserver b;

        public C0331c(LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver) {
            this.a = lifecycleOwner;
            this.b = lifecycleEventObserver;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.a.getLifecycle().removeObserver(this.b);
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final Unit a(long j, long j2, Modifier modifier, float f, float f2, Function0 function0, LifecycleOwner lifecycleOwner, int i, int i2, int i3, int i4, Composer composer, int i5) {
        a(j, j2, modifier, f, f2, function0, lifecycleOwner, i, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d2, code lost:
    
        if (r6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x034f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final long j, final long j2, Modifier modifier, float f, float f2, final Function0<Unit> onTimerFinish, LifecycleOwner lifecycleOwner, final int i, final int i2, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        float f3;
        int i7;
        float f4;
        int i8;
        LifecycleOwner lifecycleOwner2;
        LifecycleOwner lifecycleOwner3;
        boolean changed;
        Object rememberedValue;
        boolean z;
        LifecycleOwner lifecycleOwner4;
        Object rememberedValue2;
        Composer.Companion companion;
        int i9;
        Animatable animatable;
        UInt m11271boximpl;
        boolean changed2;
        Object rememberedValue3;
        float f5;
        final float f6;
        final Animatable animatable2;
        final LifecycleOwner lifecycleOwner5;
        Continuation continuation;
        UInt uInt;
        int i10;
        boolean changed3;
        Object rememberedValue4;
        boolean changed4;
        Object rememberedValue5;
        Object rememberedValue6;
        int currentCompositeKeyHash;
        Composer m1642constructorimpl;
        boolean changedInstance;
        Object rememberedValue7;
        Composer composer2;
        LifecycleOwner lifecycleOwner6;
        float f7;
        String m11250m;
        Object rememberedValue8;
        Composer composer3;
        final LifecycleOwner lifecycleOwner7;
        final float f8;
        final float f9;
        ScopeUpdateScope endRestartGroup;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        Composer startRestartGroup = composer.startRestartGroup(-562864551);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(j) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        int i13 = i4 & 4;
        if (i13 != 0) {
            i5 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i3 & 3072) == 0) {
                f3 = f;
                i5 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    f4 = f2;
                    i5 |= startRestartGroup.changed(f4) ? 16384 : 8192;
                    i8 = i4 & 32;
                    int i14 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    if (i8 == 0) {
                        if ((196608 & i3) == 0) {
                            i14 = startRestartGroup.changedInstance(onTimerFinish) ? 131072 : 65536;
                        }
                        if ((1572864 & i3) == 0) {
                            if ((i4 & 64) == 0) {
                                lifecycleOwner2 = lifecycleOwner;
                                if (startRestartGroup.changedInstance(lifecycleOwner2)) {
                                    i12 = 1048576;
                                    i5 |= i12;
                                }
                            } else {
                                lifecycleOwner2 = lifecycleOwner;
                            }
                            i12 = 524288;
                            i5 |= i12;
                        } else {
                            lifecycleOwner2 = lifecycleOwner;
                        }
                        if ((i4 & 128) != 0) {
                            i5 |= 12582912;
                        } else if ((i3 & 12582912) == 0) {
                            i5 |= startRestartGroup.changed(i) ? 8388608 : 4194304;
                        }
                        if ((i4 & 256) == 0) {
                            i11 = (i3 & 100663296) == 0 ? startRestartGroup.changed(i2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                            if ((i5 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i13 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i6 != 0) {
                                        f3 = Dp.m4440constructorimpl(7);
                                    }
                                    if (i7 != 0) {
                                        f4 = Dp.m4440constructorimpl(30);
                                    }
                                    if ((i4 & 64) != 0) {
                                        lifecycleOwner3 = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                                        i5 &= -3670017;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-562864551, i5, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimer (RewardedCountDownTimer.kt:66)");
                                        }
                                        startRestartGroup.startReplaceableGroup(1215960328);
                                        changed = startRestartGroup.changed(lifecycleOwner3);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                                            startRestartGroup.updateRememberedValue(mutableStateOf$default);
                                            rememberedValue = mutableStateOf$default;
                                        }
                                        final MutableState mutableState = (MutableState) rememberedValue;
                                        startRestartGroup.endReplaceableGroup();
                                        Object[] objArr = new Object[0];
                                        startRestartGroup.startReplaceableGroup(1215963943);
                                        int i15 = 234881024 & i5;
                                        z = i15 == 67108864;
                                        Object rememberedValue9 = startRestartGroup.rememberedValue();
                                        if (z) {
                                            lifecycleOwner4 = lifecycleOwner3;
                                        } else {
                                            lifecycleOwner4 = lifecycleOwner3;
                                        }
                                        rememberedValue9 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return c.a(i2);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue9);
                                        startRestartGroup.endReplaceableGroup();
                                        MutableState mutableState2 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue9, startRestartGroup, 0, 6);
                                        startRestartGroup.startReplaceableGroup(1215966697);
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        companion = Composer.INSTANCE;
                                        if (rememberedValue2 == companion.getEmpty()) {
                                            i9 = i5;
                                            rememberedValue2 = AnimatableKt.Animatable$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a(i2, i), 0.0f, 2, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        } else {
                                            i9 = i5;
                                        }
                                        animatable = (Animatable) rememberedValue2;
                                        startRestartGroup.endReplaceableGroup();
                                        m11271boximpl = UInt.m11271boximpl(i2);
                                        startRestartGroup.startReplaceableGroup(1215977122);
                                        changed2 = (i15 == 67108864) | startRestartGroup.changed(mutableState2) | ((i9 & 29360128) == 8388608) | startRestartGroup.changedInstance(animatable) | ((i9 & 458752) == 131072);
                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (!changed2 || rememberedValue3 == companion.getEmpty()) {
                                            f5 = f4;
                                            f6 = f3;
                                            animatable2 = animatable;
                                            lifecycleOwner5 = lifecycleOwner4;
                                            continuation = null;
                                            uInt = m11271boximpl;
                                            i10 = i9;
                                            a aVar = new a(i2, i, animatable2, onTimerFinish, mutableState2, null);
                                            startRestartGroup.updateRememberedValue(aVar);
                                            rememberedValue3 = aVar;
                                        } else {
                                            f5 = f4;
                                            animatable2 = animatable;
                                            f6 = f3;
                                            i10 = i9;
                                            lifecycleOwner5 = lifecycleOwner4;
                                            continuation = null;
                                            uInt = m11271boximpl;
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, (i10 >> 24) & 14);
                                        Boolean valueOf = Boolean.valueOf(a((MutableState<Boolean>) mutableState));
                                        startRestartGroup.startReplaceableGroup(1216010844);
                                        changed3 = startRestartGroup.changed(mutableState) | startRestartGroup.changedInstance(animatable2);
                                        rememberedValue4 = startRestartGroup.rememberedValue();
                                        if (!changed3 || rememberedValue4 == companion.getEmpty()) {
                                            rememberedValue4 = new b(animatable2, mutableState, continuation);
                                            startRestartGroup.updateRememberedValue(rememberedValue4);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
                                        startRestartGroup.startReplaceableGroup(1216015257);
                                        changed4 = startRestartGroup.changed(mutableState) | startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(lifecycleOwner5);
                                        rememberedValue5 = startRestartGroup.rememberedValue();
                                        if (!changed4 || rememberedValue5 == companion.getEmpty()) {
                                            rememberedValue5 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return c.a(LifecycleOwner.this, animatable2, mutableState, (DisposableEffectScope) obj);
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue5);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        EffectsKt.DisposableEffect(lifecycleOwner5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, (i10 >> 18) & 14);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Modifier m232backgroundbw27NRU = BackgroundKt.m232backgroundbw27NRU(ClipKt.clip(SizeKt.m634size3ABfNKs(modifier2, f5), RoundedCornerShapeKt.m855RoundedCornerShape0680j_4(Dp.m4440constructorimpl(20))), Color.m2111copywmQWz5c$default(Color.INSTANCE.m2149getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                                        startRestartGroup.startReplaceableGroup(1216045352);
                                        rememberedValue6 = startRestartGroup.rememberedValue();
                                        if (rememberedValue6 == companion.getEmpty()) {
                                            final String str = "timer_container";
                                            rememberedValue6 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return c.a(str, (SemanticsPropertyReceiver) obj);
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue6);
                                        }
                                        startRestartGroup.endReplaceableGroup();
                                        Modifier semantics$default = SemanticsModifierKt.semantics$default(m232backgroundbw27NRU, false, (Function1) rememberedValue6, 1, continuation);
                                        startRestartGroup.startReplaceableGroup(733328855);
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                                        startRestartGroup.startReplaceableGroup(-1323940314);
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(semantics$default);
                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        startRestartGroup.startReusableNode();
                                        if (startRestartGroup.getInserting()) {
                                            startRestartGroup.createNode(constructor);
                                        } else {
                                            startRestartGroup.useNode();
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
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, continuation);
                                        startRestartGroup.startReplaceableGroup(1205651458);
                                        changedInstance = ((i10 & 14) == 4) | ((i10 & 7168) == 2048) | startRestartGroup.changedInstance(animatable2) | ((i10 & 112) == 32);
                                        rememberedValue7 = startRestartGroup.rememberedValue();
                                        if (!changedInstance || rememberedValue7 == companion.getEmpty()) {
                                            final Animatable animatable3 = animatable2;
                                            composer2 = startRestartGroup;
                                            lifecycleOwner6 = lifecycleOwner5;
                                            Function1 function1 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda3
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return c.a(j, f6, animatable3, j2, (DrawScope) obj);
                                                }
                                            };
                                            f7 = f6;
                                            composer2.updateRememberedValue(function1);
                                            rememberedValue7 = function1;
                                        } else {
                                            lifecycleOwner6 = lifecycleOwner5;
                                            composer2 = startRestartGroup;
                                            f7 = f6;
                                        }
                                        composer2.endReplaceableGroup();
                                        CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue7, composer2, 6);
                                        m11250m = UByte$$ExternalSyntheticBackport0.m11250m(i2, 10);
                                        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getButton();
                                        long d2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                                        int m4332getCentere0LSkKk = TextAlign.INSTANCE.m4332getCentere0LSkKk();
                                        composer2.startReplaceableGroup(1205686792);
                                        rememberedValue8 = composer2.rememberedValue();
                                        if (rememberedValue8 == companion.getEmpty()) {
                                            final String str2 = "countdown_timer_text";
                                            rememberedValue8 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return c.b(str2, (SemanticsPropertyReceiver) obj);
                                                }
                                            };
                                            composer2.updateRememberedValue(rememberedValue8);
                                        }
                                        composer2.endReplaceableGroup();
                                        Composer composer4 = composer2;
                                        TextKt.m1591TextfLXpl1I(m11250m, SemanticsModifierKt.semantics$default(companion3, false, (Function1) rememberedValue8, 1, continuation), j2, d2, null, null, null, 0L, null, TextAlign.m4325boximpl(m4332getCentere0LSkKk), 0L, 0, false, 1, null, button, composer4, ((i10 << 3) & 896) | 3072, 3072, 24048);
                                        composer3 = composer4;
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        lifecycleOwner7 = lifecycleOwner6;
                                        f8 = f7;
                                        f9 = f5;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i4 & 64) != 0) {
                                        i5 &= -3670017;
                                    }
                                }
                                lifecycleOwner3 = lifecycleOwner2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.startReplaceableGroup(1215960328);
                                changed = startRestartGroup.changed(lifecycleOwner3);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed) {
                                }
                                MutableState mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                                startRestartGroup.updateRememberedValue(mutableStateOf$default2);
                                rememberedValue = mutableStateOf$default2;
                                final MutableState mutableState3 = (MutableState) rememberedValue;
                                startRestartGroup.endReplaceableGroup();
                                Object[] objArr2 = new Object[0];
                                startRestartGroup.startReplaceableGroup(1215963943);
                                int i152 = 234881024 & i5;
                                if (i152 == 67108864) {
                                }
                                Object rememberedValue92 = startRestartGroup.rememberedValue();
                                if (z) {
                                }
                                rememberedValue92 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return c.a(i2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue92);
                                startRestartGroup.endReplaceableGroup();
                                MutableState mutableState22 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue92, startRestartGroup, 0, 6);
                                startRestartGroup.startReplaceableGroup(1215966697);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (rememberedValue2 == companion.getEmpty()) {
                                }
                                animatable = (Animatable) rememberedValue2;
                                startRestartGroup.endReplaceableGroup();
                                m11271boximpl = UInt.m11271boximpl(i2);
                                startRestartGroup.startReplaceableGroup(1215977122);
                                changed2 = (i152 == 67108864) | startRestartGroup.changed(mutableState22) | ((i9 & 29360128) == 8388608) | startRestartGroup.changedInstance(animatable) | ((i9 & 458752) == 131072);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (changed2) {
                                }
                                f5 = f4;
                                f6 = f3;
                                animatable2 = animatable;
                                lifecycleOwner5 = lifecycleOwner4;
                                continuation = null;
                                uInt = m11271boximpl;
                                i10 = i9;
                                a aVar2 = new a(i2, i, animatable2, onTimerFinish, mutableState22, null);
                                startRestartGroup.updateRememberedValue(aVar2);
                                rememberedValue3 = aVar2;
                                startRestartGroup.endReplaceableGroup();
                                EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, (i10 >> 24) & 14);
                                Boolean valueOf2 = Boolean.valueOf(a((MutableState<Boolean>) mutableState3));
                                startRestartGroup.startReplaceableGroup(1216010844);
                                changed3 = startRestartGroup.changed(mutableState3) | startRestartGroup.changedInstance(animatable2);
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (!changed3) {
                                }
                                rememberedValue4 = new b(animatable2, mutableState3, continuation);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                                startRestartGroup.endReplaceableGroup();
                                EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
                                startRestartGroup.startReplaceableGroup(1216015257);
                                changed4 = startRestartGroup.changed(mutableState3) | startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(lifecycleOwner5);
                                rememberedValue5 = startRestartGroup.rememberedValue();
                                if (!changed4) {
                                }
                                rememberedValue5 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return c.a(LifecycleOwner.this, animatable2, mutableState3, (DisposableEffectScope) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                                startRestartGroup.endReplaceableGroup();
                                EffectsKt.DisposableEffect(lifecycleOwner5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, (i10 >> 18) & 14);
                                Alignment center2 = Alignment.INSTANCE.getCenter();
                                Modifier m232backgroundbw27NRU2 = BackgroundKt.m232backgroundbw27NRU(ClipKt.clip(SizeKt.m634size3ABfNKs(modifier2, f5), RoundedCornerShapeKt.m855RoundedCornerShape0680j_4(Dp.m4440constructorimpl(20))), Color.m2111copywmQWz5c$default(Color.INSTANCE.m2149getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                                startRestartGroup.startReplaceableGroup(1216045352);
                                rememberedValue6 = startRestartGroup.rememberedValue();
                                if (rememberedValue6 == companion.getEmpty()) {
                                }
                                startRestartGroup.endReplaceableGroup();
                                Modifier semantics$default2 = SemanticsModifierKt.semantics$default(m232backgroundbw27NRU2, false, (Function1) rememberedValue6, 1, continuation);
                                startRestartGroup.startReplaceableGroup(733328855);
                                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                                startRestartGroup.startReplaceableGroup(-1323940314);
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(semantics$default2);
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
                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(companion32, 0.0f, 1, continuation);
                                startRestartGroup.startReplaceableGroup(1205651458);
                                changedInstance = ((i10 & 14) == 4) | ((i10 & 7168) == 2048) | startRestartGroup.changedInstance(animatable2) | ((i10 & 112) == 32);
                                rememberedValue7 = startRestartGroup.rememberedValue();
                                if (changedInstance) {
                                }
                                final Animatable animatable32 = animatable2;
                                composer2 = startRestartGroup;
                                lifecycleOwner6 = lifecycleOwner5;
                                Function1 function12 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return c.a(j, f6, animatable32, j2, (DrawScope) obj);
                                    }
                                };
                                f7 = f6;
                                composer2.updateRememberedValue(function12);
                                rememberedValue7 = function12;
                                composer2.endReplaceableGroup();
                                CanvasKt.Canvas(fillMaxSize$default2, (Function1) rememberedValue7, composer2, 6);
                                m11250m = UByte$$ExternalSyntheticBackport0.m11250m(i2, 10);
                                TextStyle button2 = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getButton();
                                long d22 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                                int m4332getCentere0LSkKk2 = TextAlign.INSTANCE.m4332getCentere0LSkKk();
                                composer2.startReplaceableGroup(1205686792);
                                rememberedValue8 = composer2.rememberedValue();
                                if (rememberedValue8 == companion.getEmpty()) {
                                }
                                composer2.endReplaceableGroup();
                                Composer composer42 = composer2;
                                TextKt.m1591TextfLXpl1I(m11250m, SemanticsModifierKt.semantics$default(companion32, false, (Function1) rememberedValue8, 1, continuation), j2, d22, null, null, null, 0L, null, TextAlign.m4325boximpl(m4332getCentere0LSkKk2), 0L, 0, false, 1, null, button2, composer42, ((i10 << 3) & 896) | 3072, 3072, 24048);
                                composer3 = composer42;
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                lifecycleOwner7 = lifecycleOwner6;
                                f8 = f7;
                                f9 = f5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                composer3 = startRestartGroup;
                                f8 = f3;
                                lifecycleOwner7 = lifecycleOwner2;
                                f9 = f4;
                            }
                            final Modifier modifier3 = modifier2;
                            endRestartGroup = composer3.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return c.a(j, j2, modifier3, f8, f9, onTimerFinish, lifecycleOwner7, i, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= i11;
                        if ((i5 & 38347923) == 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i4 & 64) != 0) {
                        }
                        lifecycleOwner3 = lifecycleOwner2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceableGroup(1215960328);
                        changed = startRestartGroup.changed(lifecycleOwner3);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        MutableState mutableStateOf$default22 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        startRestartGroup.updateRememberedValue(mutableStateOf$default22);
                        rememberedValue = mutableStateOf$default22;
                        final MutableState mutableState32 = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceableGroup();
                        Object[] objArr22 = new Object[0];
                        startRestartGroup.startReplaceableGroup(1215963943);
                        int i1522 = 234881024 & i5;
                        if (i1522 == 67108864) {
                        }
                        Object rememberedValue922 = startRestartGroup.rememberedValue();
                        if (z) {
                        }
                        rememberedValue922 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return c.a(i2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue922);
                        startRestartGroup.endReplaceableGroup();
                        MutableState mutableState222 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) rememberedValue922, startRestartGroup, 0, 6);
                        startRestartGroup.startReplaceableGroup(1215966697);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (rememberedValue2 == companion.getEmpty()) {
                        }
                        animatable = (Animatable) rememberedValue2;
                        startRestartGroup.endReplaceableGroup();
                        m11271boximpl = UInt.m11271boximpl(i2);
                        startRestartGroup.startReplaceableGroup(1215977122);
                        changed2 = (i1522 == 67108864) | startRestartGroup.changed(mutableState222) | ((i9 & 29360128) == 8388608) | startRestartGroup.changedInstance(animatable) | ((i9 & 458752) == 131072);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changed2) {
                        }
                        f5 = f4;
                        f6 = f3;
                        animatable2 = animatable;
                        lifecycleOwner5 = lifecycleOwner4;
                        continuation = null;
                        uInt = m11271boximpl;
                        i10 = i9;
                        a aVar22 = new a(i2, i, animatable2, onTimerFinish, mutableState222, null);
                        startRestartGroup.updateRememberedValue(aVar22);
                        rememberedValue3 = aVar22;
                        startRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, (i10 >> 24) & 14);
                        Boolean valueOf22 = Boolean.valueOf(a((MutableState<Boolean>) mutableState32));
                        startRestartGroup.startReplaceableGroup(1216010844);
                        changed3 = startRestartGroup.changed(mutableState32) | startRestartGroup.changedInstance(animatable2);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changed3) {
                        }
                        rememberedValue4 = new b(animatable2, mutableState32, continuation);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        startRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(valueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(1216015257);
                        changed4 = startRestartGroup.changed(mutableState32) | startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(lifecycleOwner5);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changed4) {
                        }
                        rememberedValue5 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return c.a(LifecycleOwner.this, animatable2, mutableState32, (DisposableEffectScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                        startRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(lifecycleOwner5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, (i10 >> 18) & 14);
                        Alignment center22 = Alignment.INSTANCE.getCenter();
                        Modifier m232backgroundbw27NRU22 = BackgroundKt.m232backgroundbw27NRU(ClipKt.clip(SizeKt.m634size3ABfNKs(modifier2, f5), RoundedCornerShapeKt.m855RoundedCornerShape0680j_4(Dp.m4440constructorimpl(20))), Color.m2111copywmQWz5c$default(Color.INSTANCE.m2149getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                        startRestartGroup.startReplaceableGroup(1216045352);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (rememberedValue6 == companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        Modifier semantics$default22 = SemanticsModifierKt.semantics$default(m232backgroundbw27NRU22, false, (Function1) rememberedValue6, 1, continuation);
                        startRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, startRestartGroup, 6);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor22 = companion222.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(semantics$default22);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
                        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy22, companion222.getSetMeasurePolicy());
                        Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap22, companion222.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = companion222.getSetCompositeKeyHash();
                        if (!m1642constructorimpl.getInserting()) {
                        }
                        m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                        modifierMaterializerOf22.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                        Modifier.Companion companion322 = Modifier.INSTANCE;
                        Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(companion322, 0.0f, 1, continuation);
                        startRestartGroup.startReplaceableGroup(1205651458);
                        changedInstance = ((i10 & 14) == 4) | ((i10 & 7168) == 2048) | startRestartGroup.changedInstance(animatable2) | ((i10 & 112) == 32);
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (changedInstance) {
                        }
                        final Animatable animatable322 = animatable2;
                        composer2 = startRestartGroup;
                        lifecycleOwner6 = lifecycleOwner5;
                        Function1 function122 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return c.a(j, f6, animatable322, j2, (DrawScope) obj);
                            }
                        };
                        f7 = f6;
                        composer2.updateRememberedValue(function122);
                        rememberedValue7 = function122;
                        composer2.endReplaceableGroup();
                        CanvasKt.Canvas(fillMaxSize$default22, (Function1) rememberedValue7, composer2, 6);
                        m11250m = UByte$$ExternalSyntheticBackport0.m11250m(i2, 10);
                        TextStyle button22 = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getButton();
                        long d222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                        int m4332getCentere0LSkKk22 = TextAlign.INSTANCE.m4332getCentere0LSkKk();
                        composer2.startReplaceableGroup(1205686792);
                        rememberedValue8 = composer2.rememberedValue();
                        if (rememberedValue8 == companion.getEmpty()) {
                        }
                        composer2.endReplaceableGroup();
                        Composer composer422 = composer2;
                        TextKt.m1591TextfLXpl1I(m11250m, SemanticsModifierKt.semantics$default(companion322, false, (Function1) rememberedValue8, 1, continuation), j2, d222, null, null, null, 0L, null, TextAlign.m4325boximpl(m4332getCentere0LSkKk22), 0L, 0, false, 1, null, button22, composer422, ((i10 << 3) & 896) | 3072, 3072, 24048);
                        composer3 = composer422;
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        lifecycleOwner7 = lifecycleOwner6;
                        f8 = f7;
                        f9 = f5;
                        final Modifier modifier32 = modifier2;
                        endRestartGroup = composer3.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i5 |= i14;
                    if ((1572864 & i3) == 0) {
                    }
                    if ((i4 & 128) != 0) {
                    }
                    if ((i4 & 256) == 0) {
                    }
                    i5 |= i11;
                    if ((i5 & 38347923) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i4 & 64) != 0) {
                    }
                    lifecycleOwner3 = lifecycleOwner2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(1215960328);
                    changed = startRestartGroup.changed(lifecycleOwner3);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    MutableState mutableStateOf$default222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    startRestartGroup.updateRememberedValue(mutableStateOf$default222);
                    rememberedValue = mutableStateOf$default222;
                    final MutableState mutableState322 = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceableGroup();
                    Object[] objArr222 = new Object[0];
                    startRestartGroup.startReplaceableGroup(1215963943);
                    int i15222 = 234881024 & i5;
                    if (i15222 == 67108864) {
                    }
                    Object rememberedValue9222 = startRestartGroup.rememberedValue();
                    if (z) {
                    }
                    rememberedValue9222 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return c.a(i2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9222);
                    startRestartGroup.endReplaceableGroup();
                    MutableState mutableState2222 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr222, (Saver) null, (String) null, (Function0) rememberedValue9222, startRestartGroup, 0, 6);
                    startRestartGroup.startReplaceableGroup(1215966697);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (rememberedValue2 == companion.getEmpty()) {
                    }
                    animatable = (Animatable) rememberedValue2;
                    startRestartGroup.endReplaceableGroup();
                    m11271boximpl = UInt.m11271boximpl(i2);
                    startRestartGroup.startReplaceableGroup(1215977122);
                    changed2 = (i15222 == 67108864) | startRestartGroup.changed(mutableState2222) | ((i9 & 29360128) == 8388608) | startRestartGroup.changedInstance(animatable) | ((i9 & 458752) == 131072);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed2) {
                    }
                    f5 = f4;
                    f6 = f3;
                    animatable2 = animatable;
                    lifecycleOwner5 = lifecycleOwner4;
                    continuation = null;
                    uInt = m11271boximpl;
                    i10 = i9;
                    a aVar222 = new a(i2, i, animatable2, onTimerFinish, mutableState2222, null);
                    startRestartGroup.updateRememberedValue(aVar222);
                    rememberedValue3 = aVar222;
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, (i10 >> 24) & 14);
                    Boolean valueOf222 = Boolean.valueOf(a((MutableState<Boolean>) mutableState322));
                    startRestartGroup.startReplaceableGroup(1216010844);
                    changed3 = startRestartGroup.changed(mutableState322) | startRestartGroup.changedInstance(animatable2);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue4 = new b(animatable2, mutableState322, continuation);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(valueOf222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(1216015257);
                    changed4 = startRestartGroup.changed(mutableState322) | startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(lifecycleOwner5);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changed4) {
                    }
                    rememberedValue5 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return c.a(LifecycleOwner.this, animatable2, mutableState322, (DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(lifecycleOwner5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, (i10 >> 18) & 14);
                    Alignment center222 = Alignment.INSTANCE.getCenter();
                    Modifier m232backgroundbw27NRU222 = BackgroundKt.m232backgroundbw27NRU(ClipKt.clip(SizeKt.m634size3ABfNKs(modifier2, f5), RoundedCornerShapeKt.m855RoundedCornerShape0680j_4(Dp.m4440constructorimpl(20))), Color.m2111copywmQWz5c$default(Color.INSTANCE.m2149getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                    startRestartGroup.startReplaceableGroup(1216045352);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Modifier semantics$default222 = SemanticsModifierKt.semantics$default(m232backgroundbw27NRU222, false, (Function1) rememberedValue6, 1, continuation);
                    startRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2222 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor222 = companion2222.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(semantics$default222);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy222, companion2222.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap222, companion2222.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = companion2222.getSetCompositeKeyHash();
                    if (!m1642constructorimpl.getInserting()) {
                    }
                    m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                    modifierMaterializerOf222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion3222 = Modifier.INSTANCE;
                    Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(companion3222, 0.0f, 1, continuation);
                    startRestartGroup.startReplaceableGroup(1205651458);
                    changedInstance = ((i10 & 14) == 4) | ((i10 & 7168) == 2048) | startRestartGroup.changedInstance(animatable2) | ((i10 & 112) == 32);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (changedInstance) {
                    }
                    final Animatable animatable3222 = animatable2;
                    composer2 = startRestartGroup;
                    lifecycleOwner6 = lifecycleOwner5;
                    Function1 function1222 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return c.a(j, f6, animatable3222, j2, (DrawScope) obj);
                        }
                    };
                    f7 = f6;
                    composer2.updateRememberedValue(function1222);
                    rememberedValue7 = function1222;
                    composer2.endReplaceableGroup();
                    CanvasKt.Canvas(fillMaxSize$default222, (Function1) rememberedValue7, composer2, 6);
                    m11250m = UByte$$ExternalSyntheticBackport0.m11250m(i2, 10);
                    TextStyle button222 = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getButton();
                    long d2222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                    int m4332getCentere0LSkKk222 = TextAlign.INSTANCE.m4332getCentere0LSkKk();
                    composer2.startReplaceableGroup(1205686792);
                    rememberedValue8 = composer2.rememberedValue();
                    if (rememberedValue8 == companion.getEmpty()) {
                    }
                    composer2.endReplaceableGroup();
                    Composer composer4222 = composer2;
                    TextKt.m1591TextfLXpl1I(m11250m, SemanticsModifierKt.semantics$default(companion3222, false, (Function1) rememberedValue8, 1, continuation), j2, d2222, null, null, null, 0L, null, TextAlign.m4325boximpl(m4332getCentere0LSkKk222), 0L, 0, false, 1, null, button222, composer4222, ((i10 << 3) & 896) | 3072, 3072, 24048);
                    composer3 = composer4222;
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    lifecycleOwner7 = lifecycleOwner6;
                    f8 = f7;
                    f9 = f5;
                    final Modifier modifier322 = modifier2;
                    endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                f4 = f2;
                i8 = i4 & 32;
                int i142 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                if (i8 == 0) {
                }
                i5 |= i142;
                if ((1572864 & i3) == 0) {
                }
                if ((i4 & 128) != 0) {
                }
                if ((i4 & 256) == 0) {
                }
                i5 |= i11;
                if ((i5 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i13 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i4 & 64) != 0) {
                }
                lifecycleOwner3 = lifecycleOwner2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(1215960328);
                changed = startRestartGroup.changed(lifecycleOwner3);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                MutableState mutableStateOf$default2222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default2222);
                rememberedValue = mutableStateOf$default2222;
                final MutableState mutableState3222 = (MutableState) rememberedValue;
                startRestartGroup.endReplaceableGroup();
                Object[] objArr2222 = new Object[0];
                startRestartGroup.startReplaceableGroup(1215963943);
                int i152222 = 234881024 & i5;
                if (i152222 == 67108864) {
                }
                Object rememberedValue92222 = startRestartGroup.rememberedValue();
                if (z) {
                }
                rememberedValue92222 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c.a(i2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue92222);
                startRestartGroup.endReplaceableGroup();
                MutableState mutableState22222 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr2222, (Saver) null, (String) null, (Function0) rememberedValue92222, startRestartGroup, 0, 6);
                startRestartGroup.startReplaceableGroup(1215966697);
                rememberedValue2 = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue2 == companion.getEmpty()) {
                }
                animatable = (Animatable) rememberedValue2;
                startRestartGroup.endReplaceableGroup();
                m11271boximpl = UInt.m11271boximpl(i2);
                startRestartGroup.startReplaceableGroup(1215977122);
                changed2 = (i152222 == 67108864) | startRestartGroup.changed(mutableState22222) | ((i9 & 29360128) == 8388608) | startRestartGroup.changedInstance(animatable) | ((i9 & 458752) == 131072);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed2) {
                }
                f5 = f4;
                f6 = f3;
                animatable2 = animatable;
                lifecycleOwner5 = lifecycleOwner4;
                continuation = null;
                uInt = m11271boximpl;
                i10 = i9;
                a aVar2222 = new a(i2, i, animatable2, onTimerFinish, mutableState22222, null);
                startRestartGroup.updateRememberedValue(aVar2222);
                rememberedValue3 = aVar2222;
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, (i10 >> 24) & 14);
                Boolean valueOf2222 = Boolean.valueOf(a((MutableState<Boolean>) mutableState3222));
                startRestartGroup.startReplaceableGroup(1216010844);
                changed3 = startRestartGroup.changed(mutableState3222) | startRestartGroup.changedInstance(animatable2);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue4 = new b(animatable2, mutableState3222, continuation);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(valueOf2222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(1216015257);
                changed4 = startRestartGroup.changed(mutableState3222) | startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(lifecycleOwner5);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed4) {
                }
                rememberedValue5 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return c.a(LifecycleOwner.this, animatable2, mutableState3222, (DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
                startRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(lifecycleOwner5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, (i10 >> 18) & 14);
                Alignment center2222 = Alignment.INSTANCE.getCenter();
                Modifier m232backgroundbw27NRU2222 = BackgroundKt.m232backgroundbw27NRU(ClipKt.clip(SizeKt.m634size3ABfNKs(modifier2, f5), RoundedCornerShapeKt.m855RoundedCornerShape0680j_4(Dp.m4440constructorimpl(20))), Color.m2111copywmQWz5c$default(Color.INSTANCE.m2149getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                startRestartGroup.startReplaceableGroup(1216045352);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                Modifier semantics$default2222 = SemanticsModifierKt.semantics$default(m232backgroundbw27NRU2222, false, (Function1) rememberedValue6, 1, continuation);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2222 = BoxKt.rememberBoxMeasurePolicy(center2222, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion22222 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2222 = companion22222.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2222 = LayoutKt.modifierMaterializerOf(semantics$default2222);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
                Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy2222, companion22222.getSetMeasurePolicy());
                Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap2222, companion22222.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = companion22222.getSetCompositeKeyHash();
                if (!m1642constructorimpl.getInserting()) {
                }
                m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
                modifierMaterializerOf2222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion32222 = Modifier.INSTANCE;
                Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(companion32222, 0.0f, 1, continuation);
                startRestartGroup.startReplaceableGroup(1205651458);
                changedInstance = ((i10 & 14) == 4) | ((i10 & 7168) == 2048) | startRestartGroup.changedInstance(animatable2) | ((i10 & 112) == 32);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (changedInstance) {
                }
                final Animatable animatable32222 = animatable2;
                composer2 = startRestartGroup;
                lifecycleOwner6 = lifecycleOwner5;
                Function1 function12222 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return c.a(j, f6, animatable32222, j2, (DrawScope) obj);
                    }
                };
                f7 = f6;
                composer2.updateRememberedValue(function12222);
                rememberedValue7 = function12222;
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(fillMaxSize$default2222, (Function1) rememberedValue7, composer2, 6);
                m11250m = UByte$$ExternalSyntheticBackport0.m11250m(i2, 10);
                TextStyle button2222 = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getButton();
                long d22222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                int m4332getCentere0LSkKk2222 = TextAlign.INSTANCE.m4332getCentere0LSkKk();
                composer2.startReplaceableGroup(1205686792);
                rememberedValue8 = composer2.rememberedValue();
                if (rememberedValue8 == companion.getEmpty()) {
                }
                composer2.endReplaceableGroup();
                Composer composer42222 = composer2;
                TextKt.m1591TextfLXpl1I(m11250m, SemanticsModifierKt.semantics$default(companion32222, false, (Function1) rememberedValue8, 1, continuation), j2, d22222, null, null, null, 0L, null, TextAlign.m4325boximpl(m4332getCentere0LSkKk2222), 0L, 0, false, 1, null, button2222, composer42222, ((i10 << 3) & 896) | 3072, 3072, 24048);
                composer3 = composer42222;
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                lifecycleOwner7 = lifecycleOwner6;
                f8 = f7;
                f9 = f5;
                final Modifier modifier3222 = modifier2;
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            f4 = f2;
            i8 = i4 & 32;
            int i1422 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            if (i8 == 0) {
            }
            i5 |= i1422;
            if ((1572864 & i3) == 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if ((i4 & 256) == 0) {
            }
            i5 |= i11;
            if ((i5 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i13 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i4 & 64) != 0) {
            }
            lifecycleOwner3 = lifecycleOwner2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(1215960328);
            changed = startRestartGroup.changed(lifecycleOwner3);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            MutableState mutableStateOf$default22222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            startRestartGroup.updateRememberedValue(mutableStateOf$default22222);
            rememberedValue = mutableStateOf$default22222;
            final MutableState mutableState32222 = (MutableState) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            Object[] objArr22222 = new Object[0];
            startRestartGroup.startReplaceableGroup(1215963943);
            int i1522222 = 234881024 & i5;
            if (i1522222 == 67108864) {
            }
            Object rememberedValue922222 = startRestartGroup.rememberedValue();
            if (z) {
            }
            rememberedValue922222 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.a(i2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue922222);
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState222222 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr22222, (Saver) null, (String) null, (Function0) rememberedValue922222, startRestartGroup, 0, 6);
            startRestartGroup.startReplaceableGroup(1215966697);
            rememberedValue2 = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (rememberedValue2 == companion.getEmpty()) {
            }
            animatable = (Animatable) rememberedValue2;
            startRestartGroup.endReplaceableGroup();
            m11271boximpl = UInt.m11271boximpl(i2);
            startRestartGroup.startReplaceableGroup(1215977122);
            changed2 = (i1522222 == 67108864) | startRestartGroup.changed(mutableState222222) | ((i9 & 29360128) == 8388608) | startRestartGroup.changedInstance(animatable) | ((i9 & 458752) == 131072);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2) {
            }
            f5 = f4;
            f6 = f3;
            animatable2 = animatable;
            lifecycleOwner5 = lifecycleOwner4;
            continuation = null;
            uInt = m11271boximpl;
            i10 = i9;
            a aVar22222 = new a(i2, i, animatable2, onTimerFinish, mutableState222222, null);
            startRestartGroup.updateRememberedValue(aVar22222);
            rememberedValue3 = aVar22222;
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, (i10 >> 24) & 14);
            Boolean valueOf22222 = Boolean.valueOf(a((MutableState<Boolean>) mutableState32222));
            startRestartGroup.startReplaceableGroup(1216010844);
            changed3 = startRestartGroup.changed(mutableState32222) | startRestartGroup.changedInstance(animatable2);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue4 = new b(animatable2, mutableState32222, continuation);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(valueOf22222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1216015257);
            changed4 = startRestartGroup.changed(mutableState32222) | startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(lifecycleOwner5);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            rememberedValue5 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return c.a(LifecycleOwner.this, animatable2, mutableState32222, (DisposableEffectScope) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(lifecycleOwner5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, (i10 >> 18) & 14);
            Alignment center22222 = Alignment.INSTANCE.getCenter();
            Modifier m232backgroundbw27NRU22222 = BackgroundKt.m232backgroundbw27NRU(ClipKt.clip(SizeKt.m634size3ABfNKs(modifier2, f5), RoundedCornerShapeKt.m855RoundedCornerShape0680j_4(Dp.m4440constructorimpl(20))), Color.m2111copywmQWz5c$default(Color.INSTANCE.m2149getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            startRestartGroup.startReplaceableGroup(1216045352);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            Modifier semantics$default22222 = SemanticsModifierKt.semantics$default(m232backgroundbw27NRU22222, false, (Function1) rememberedValue6, 1, continuation);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy22222 = BoxKt.rememberBoxMeasurePolicy(center22222, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion222222 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor22222 = companion222222.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22222 = LayoutKt.modifierMaterializerOf(semantics$default22222);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy22222, companion222222.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap22222, companion222222.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = companion222222.getSetCompositeKeyHash();
            if (!m1642constructorimpl.getInserting()) {
            }
            m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
            modifierMaterializerOf22222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion322222 = Modifier.INSTANCE;
            Modifier fillMaxSize$default22222 = SizeKt.fillMaxSize$default(companion322222, 0.0f, 1, continuation);
            startRestartGroup.startReplaceableGroup(1205651458);
            changedInstance = ((i10 & 14) == 4) | ((i10 & 7168) == 2048) | startRestartGroup.changedInstance(animatable2) | ((i10 & 112) == 32);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance) {
            }
            final Animatable animatable322222 = animatable2;
            composer2 = startRestartGroup;
            lifecycleOwner6 = lifecycleOwner5;
            Function1 function122222 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return c.a(j, f6, animatable322222, j2, (DrawScope) obj);
                }
            };
            f7 = f6;
            composer2.updateRememberedValue(function122222);
            rememberedValue7 = function122222;
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(fillMaxSize$default22222, (Function1) rememberedValue7, composer2, 6);
            m11250m = UByte$$ExternalSyntheticBackport0.m11250m(i2, 10);
            TextStyle button22222 = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getButton();
            long d222222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
            int m4332getCentere0LSkKk22222 = TextAlign.INSTANCE.m4332getCentere0LSkKk();
            composer2.startReplaceableGroup(1205686792);
            rememberedValue8 = composer2.rememberedValue();
            if (rememberedValue8 == companion.getEmpty()) {
            }
            composer2.endReplaceableGroup();
            Composer composer422222 = composer2;
            TextKt.m1591TextfLXpl1I(m11250m, SemanticsModifierKt.semantics$default(companion322222, false, (Function1) rememberedValue8, 1, continuation), j2, d222222, null, null, null, 0L, null, TextAlign.m4325boximpl(m4332getCentere0LSkKk22222), 0L, 0, false, 1, null, button22222, composer422222, ((i10 << 3) & 896) | 3072, 3072, 24048);
            composer3 = composer422222;
            composer3.endReplaceableGroup();
            composer3.endNode();
            composer3.endReplaceableGroup();
            composer3.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            lifecycleOwner7 = lifecycleOwner6;
            f8 = f7;
            f9 = f5;
            final Modifier modifier32222 = modifier2;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        f3 = f;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        f4 = f2;
        i8 = i4 & 32;
        int i14222 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        if (i8 == 0) {
        }
        i5 |= i14222;
        if ((1572864 & i3) == 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if ((i4 & 256) == 0) {
        }
        i5 |= i11;
        if ((i5 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i13 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i4 & 64) != 0) {
        }
        lifecycleOwner3 = lifecycleOwner2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(1215960328);
        changed = startRestartGroup.changed(lifecycleOwner3);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        MutableState mutableStateOf$default222222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        startRestartGroup.updateRememberedValue(mutableStateOf$default222222);
        rememberedValue = mutableStateOf$default222222;
        final MutableState mutableState322222 = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        Object[] objArr222222 = new Object[0];
        startRestartGroup.startReplaceableGroup(1215963943);
        int i15222222 = 234881024 & i5;
        if (i15222222 == 67108864) {
        }
        Object rememberedValue9222222 = startRestartGroup.rememberedValue();
        if (z) {
        }
        rememberedValue9222222 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.a(i2);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue9222222);
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState2222222 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr222222, (Saver) null, (String) null, (Function0) rememberedValue9222222, startRestartGroup, 0, 6);
        startRestartGroup.startReplaceableGroup(1215966697);
        rememberedValue2 = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue2 == companion.getEmpty()) {
        }
        animatable = (Animatable) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        m11271boximpl = UInt.m11271boximpl(i2);
        startRestartGroup.startReplaceableGroup(1215977122);
        changed2 = (i15222222 == 67108864) | startRestartGroup.changed(mutableState2222222) | ((i9 & 29360128) == 8388608) | startRestartGroup.changedInstance(animatable) | ((i9 & 458752) == 131072);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed2) {
        }
        f5 = f4;
        f6 = f3;
        animatable2 = animatable;
        lifecycleOwner5 = lifecycleOwner4;
        continuation = null;
        uInt = m11271boximpl;
        i10 = i9;
        a aVar222222 = new a(i2, i, animatable2, onTimerFinish, mutableState2222222, null);
        startRestartGroup.updateRememberedValue(aVar222222);
        rememberedValue3 = aVar222222;
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, (i10 >> 24) & 14);
        Boolean valueOf222222 = Boolean.valueOf(a((MutableState<Boolean>) mutableState322222));
        startRestartGroup.startReplaceableGroup(1216010844);
        changed3 = startRestartGroup.changed(mutableState322222) | startRestartGroup.changedInstance(animatable2);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue4 = new b(animatable2, mutableState322222, continuation);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(valueOf222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(1216015257);
        changed4 = startRestartGroup.changed(mutableState322222) | startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(lifecycleOwner5);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue5 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.a(LifecycleOwner.this, animatable2, mutableState322222, (DisposableEffectScope) obj);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.DisposableEffect(lifecycleOwner5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, startRestartGroup, (i10 >> 18) & 14);
        Alignment center222222 = Alignment.INSTANCE.getCenter();
        Modifier m232backgroundbw27NRU222222 = BackgroundKt.m232backgroundbw27NRU(ClipKt.clip(SizeKt.m634size3ABfNKs(modifier2, f5), RoundedCornerShapeKt.m855RoundedCornerShape0680j_4(Dp.m4440constructorimpl(20))), Color.m2111copywmQWz5c$default(Color.INSTANCE.m2149getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
        startRestartGroup.startReplaceableGroup(1216045352);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        Modifier semantics$default222222 = SemanticsModifierKt.semantics$default(m232backgroundbw27NRU222222, false, (Function1) rememberedValue6, 1, continuation);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy222222 = BoxKt.rememberBoxMeasurePolicy(center222222, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2222222 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor222222 = companion2222222.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222222 = LayoutKt.modifierMaterializerOf(semantics$default222222);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy222222, companion2222222.getSetMeasurePolicy());
        Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap222222, companion2222222.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = companion2222222.getSetCompositeKeyHash();
        if (!m1642constructorimpl.getInserting()) {
        }
        m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222222);
        modifierMaterializerOf222222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion3222222 = Modifier.INSTANCE;
        Modifier fillMaxSize$default222222 = SizeKt.fillMaxSize$default(companion3222222, 0.0f, 1, continuation);
        startRestartGroup.startReplaceableGroup(1205651458);
        changedInstance = ((i10 & 14) == 4) | ((i10 & 7168) == 2048) | startRestartGroup.changedInstance(animatable2) | ((i10 & 112) == 32);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (changedInstance) {
        }
        final Animatable animatable3222222 = animatable2;
        composer2 = startRestartGroup;
        lifecycleOwner6 = lifecycleOwner5;
        Function1 function1222222 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.a(j, f6, animatable3222222, j2, (DrawScope) obj);
            }
        };
        f7 = f6;
        composer2.updateRememberedValue(function1222222);
        rememberedValue7 = function1222222;
        composer2.endReplaceableGroup();
        CanvasKt.Canvas(fillMaxSize$default222222, (Function1) rememberedValue7, composer2, 6);
        m11250m = UByte$$ExternalSyntheticBackport0.m11250m(i2, 10);
        TextStyle button222222 = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getButton();
        long d2222222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
        int m4332getCentere0LSkKk222222 = TextAlign.INSTANCE.m4332getCentere0LSkKk();
        composer2.startReplaceableGroup(1205686792);
        rememberedValue8 = composer2.rememberedValue();
        if (rememberedValue8 == companion.getEmpty()) {
        }
        composer2.endReplaceableGroup();
        Composer composer4222222 = composer2;
        TextKt.m1591TextfLXpl1I(m11250m, SemanticsModifierKt.semantics$default(companion3222222, false, (Function1) rememberedValue8, 1, continuation), j2, d2222222, null, null, null, 0L, null, TextAlign.m4325boximpl(m4332getCentere0LSkKk222222), 0L, 0, false, 1, null, button222222, composer4222222, ((i10 << 3) & 896) | 3072, 3072, 24048);
        composer3 = composer4222222;
        composer3.endReplaceableGroup();
        composer3.endNode();
        composer3.endReplaceableGroup();
        composer3.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        lifecycleOwner7 = lifecycleOwner6;
        f8 = f7;
        f9 = f5;
        final Modifier modifier322222 = modifier2;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final Unit b(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.INSTANCE;
    }

    public static final int b(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    public static final void a(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void a(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    public static final MutableState a(int i) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
    }

    public static final DisposableEffectResult a(LifecycleOwner lifecycleOwner, final Animatable animatable, final MutableState mutableState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c$$ExternalSyntheticLambda6
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                c.a(Animatable.this, mutableState, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new C0331c(lifecycleOwner, lifecycleEventObserver);
    }

    public static final void a(Animatable animatable, MutableState mutableState, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = d.a[event.ordinal()];
        if (i == 1) {
            a((MutableState<Boolean>) mutableState, false);
        } else if (i == 2 && ((Number) animatable.getValue()).floatValue() > 0.0f) {
            a((MutableState<Boolean>) mutableState, true);
        }
    }

    public static final Unit a(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.INSTANCE;
    }

    public static final Unit a(long j, float f, Animatable animatable, long j2, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long Size = androidx.compose.ui.geometry.SizeKt.Size(Size.m1940getWidthimpl(Canvas.mo2662getSizeNHjbRc()), Size.m1937getHeightimpl(Canvas.mo2662getSizeNHjbRc()));
        float f2 = Canvas.mo336toPx0680j_4(f);
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        DrawScope.m2642drawArcyD3GUKo$default(Canvas, j, 360.0f, 360.0f, false, 0L, Size, 0.0f, new Stroke(f2, 0.0f, companion.m2466getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        if (((Number) animatable.getValue()).floatValue() > 0.0f) {
            DrawScope.m2642drawArcyD3GUKo$default(Canvas, j2, 270.0f, RangesKt.coerceAtLeast(((Number) animatable.getValue()).floatValue(), 0.0f) * (-360.0f), false, 0L, androidx.compose.ui.geometry.SizeKt.Size(Size.m1940getWidthimpl(Canvas.mo2662getSizeNHjbRc()), Size.m1937getHeightimpl(Canvas.mo2662getSizeNHjbRc())), 0.0f, new Stroke(Canvas.mo336toPx0680j_4(f), 0.0f, companion.m2466getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        }
        return Unit.INSTANCE;
    }

    public static final boolean a(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }
}

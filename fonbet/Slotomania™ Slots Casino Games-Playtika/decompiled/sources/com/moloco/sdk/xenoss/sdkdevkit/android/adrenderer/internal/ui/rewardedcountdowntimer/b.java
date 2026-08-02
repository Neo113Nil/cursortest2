package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
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

/* loaded from: classes8.dex */
public final class b {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerCustomKt$RewardedCountDownTimerCustom$1$1", f = "RewardedCountDownTimerCustom.kt", i = {0, 1}, l = {96, 104}, m = "invokeSuspend", n = {"currentSeconds", "currentSeconds"}, s = {"I$0", "I$0"})
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
                        int c = b.c(this.g);
                        i = this.c;
                        float a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a(i, this.d);
                        if (i < c) {
                            try {
                                int coerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtLeast(c - i, 0) * 1000, 0);
                                Animatable<Float, AnimationVector1D> animatable = this.e;
                                Float boxFloat = Boxing.boxFloat(a);
                                TweenSpec tween$default = AnimationSpecKt.tween$default(coerceAtLeast, 0, EasingKt.getLinearEasing(), 2, null);
                                this.a = i;
                                this.b = 1;
                                aVar = this;
                                if (Animatable.animateTo$default(animatable, boxFloat, tween$default, null, null, aVar, 12, null) == coroutine_suspended) {
                                }
                                b.a(aVar.g, i);
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2 = this;
                                th = th;
                                b.a(aVar2.g, i);
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
                            b.a(aVar.g, i);
                        } else {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i = this.a;
                            ResultKt.throwOnFailure(obj);
                            aVar = this;
                            Unit unit = Unit.INSTANCE;
                            b.a(aVar.g, i);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        aVar2 = this;
                        b.a(aVar2.g, i);
                        if (aVar2.c == 0) {
                            throw th;
                        }
                        aVar2.f.invoke();
                        throw th;
                    }
                } catch (CancellationException unused) {
                    aVar = this;
                    b.a(aVar.g, i);
                }
            } catch (CancellationException unused2) {
                b.a(aVar.g, i);
            } catch (Throwable th4) {
                th = th4;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerCustomKt$RewardedCountDownTimerCustom$2$1", f = "RewardedCountDownTimerCustom.kt", i = {}, l = {Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$b, reason: collision with other inner class name */
    public static final class C0330b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Animatable<Float, AnimationVector1D> b;
        public final /* synthetic */ MutableState<Boolean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0330b(Animatable<Float, AnimationVector1D> animatable, MutableState<Boolean> mutableState, Continuation<? super C0330b> continuation) {
            super(2, continuation);
            this.b = animatable;
            this.c = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0330b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C0330b(this.b, this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!b.b(this.c)) {
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

    public static final class c implements DisposableEffectResult {
        public final /* synthetic */ LifecycleOwner a;
        public final /* synthetic */ LifecycleEventObserver b;

        public c(LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver) {
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

    public static final Unit a(long j, long j2, Modifier modifier, float f, float f2, Function0 function0, String str, LifecycleOwner lifecycleOwner, int i, int i2, int i3, int i4, Composer composer, int i5) {
        a(j, j2, modifier, f, f2, function0, str, lifecycleOwner, i, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    public static final int c(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0308  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final long j, final long j2, Modifier modifier, float f, float f2, final Function0<Unit> onTimerFinish, final String customTimerString, LifecycleOwner lifecycleOwner, final int i, final int i2, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        Modifier modifier2;
        int i7;
        float f3;
        int i8;
        float f4;
        LifecycleOwner lifecycleOwner2;
        int i9;
        LifecycleOwner lifecycleOwner3;
        int i10;
        Object rememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        boolean changed;
        Object rememberedValue2;
        LifecycleOwner lifecycleOwner4;
        boolean z;
        int i11;
        Object rememberedValue3;
        Object rememberedValue4;
        UInt m11271boximpl;
        boolean changed2;
        Object rememberedValue5;
        final MutableState mutableState2;
        float f5;
        Modifier modifier3;
        final LifecycleOwner lifecycleOwner5;
        int i12;
        Continuation continuation;
        UInt uInt;
        int i13;
        boolean changed3;
        Object rememberedValue6;
        boolean changed4;
        Object rememberedValue7;
        int currentCompositeKeyHash;
        Composer m1642constructorimpl;
        Object rememberedValue8;
        Composer composer2;
        Object rememberedValue9;
        Object rememberedValue10;
        int currentCompositeKeyHash2;
        Composer m1642constructorimpl2;
        boolean changedInstance;
        Object rememberedValue11;
        final float f6;
        final Modifier modifier4;
        final float f7;
        final LifecycleOwner lifecycleOwner6;
        final float f8;
        ScopeUpdateScope endRestartGroup;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        Intrinsics.checkNotNullParameter(customTimerString, "customTimerString");
        Composer startRestartGroup = composer.startRestartGroup(1415937460);
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
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= RendererCapabilities.MODE_SUPPORT_MASK;
            } else if ((i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    f3 = f;
                    i5 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        f4 = f2;
                        i5 |= startRestartGroup.changed(f4) ? 16384 : 8192;
                        if ((i4 & 32) != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= startRestartGroup.changedInstance(onTimerFinish) ? 131072 : 65536;
                        }
                        if ((i4 & 64) != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(customTimerString) ? 1048576 : 524288;
                        }
                        if ((i3 & 12582912) == 0) {
                            if ((i4 & 128) == 0) {
                                lifecycleOwner2 = lifecycleOwner;
                                if (startRestartGroup.changedInstance(lifecycleOwner2)) {
                                    i15 = 8388608;
                                    i5 |= i15;
                                }
                            } else {
                                lifecycleOwner2 = lifecycleOwner;
                            }
                            i15 = 4194304;
                            i5 |= i15;
                        } else {
                            lifecycleOwner2 = lifecycleOwner;
                        }
                        if ((i4 & 256) == 0) {
                            i14 = (100663296 & i3) == 0 ? startRestartGroup.changed(i) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                            if ((i4 & 512) != 0) {
                                if ((i3 & C.ENCODING_PCM_32BIT) == 0) {
                                    i9 = startRestartGroup.changed(i2) ? 536870912 : 268435456;
                                }
                                if ((i5 & 306783379) == 306783378 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i6 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i7 != 0) {
                                            f3 = Dp.m4440constructorimpl(5);
                                        }
                                        if (i8 != 0) {
                                            f4 = Dp.m4440constructorimpl(30);
                                        }
                                        if ((i4 & 128) != 0) {
                                            lifecycleOwner3 = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                                            i10 = i5 & (-29360129);
                                            float f9 = f4;
                                            startRestartGroup.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1415937460, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.RewardedCountDownTimerCustom (RewardedCountDownTimerCustom.kt:72)");
                                            }
                                            startRestartGroup.startReplaceableGroup(-1077278555);
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            companion = Composer.INSTANCE;
                                            if (rememberedValue == companion.getEmpty()) {
                                                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m4602boximpl(IntSize.INSTANCE.m4615getZeroYbymL2g()), null, 2, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            mutableState = (MutableState) rememberedValue;
                                            startRestartGroup.endReplaceableGroup();
                                            startRestartGroup.startReplaceableGroup(-1077276327);
                                            changed = startRestartGroup.changed(lifecycleOwner3);
                                            rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (!changed || rememberedValue2 == companion.getEmpty()) {
                                                lifecycleOwner4 = lifecycleOwner3;
                                                MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                                                startRestartGroup.updateRememberedValue(mutableStateOf$default);
                                                rememberedValue2 = mutableStateOf$default;
                                            } else {
                                                lifecycleOwner4 = lifecycleOwner3;
                                            }
                                            final MutableState mutableState3 = (MutableState) rememberedValue2;
                                            startRestartGroup.endReplaceableGroup();
                                            Object[] objArr = new Object[0];
                                            startRestartGroup.startReplaceableGroup(-1077272712);
                                            int i16 = 1879048192 & i10;
                                            z = i16 != 536870912;
                                            i11 = i10;
                                            rememberedValue3 = startRestartGroup.rememberedValue();
                                            if (!z || rememberedValue3 == companion.getEmpty()) {
                                                rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return b.a(i2);
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue3);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            MutableState mutableState4 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 0, 6);
                                            startRestartGroup.startReplaceableGroup(-1077269958);
                                            rememberedValue4 = startRestartGroup.rememberedValue();
                                            if (rememberedValue4 != companion.getEmpty()) {
                                                rememberedValue4 = AnimatableKt.Animatable$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a(i2, i), 0.0f, 2, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue4);
                                            }
                                            final Animatable animatable = (Animatable) rememberedValue4;
                                            startRestartGroup.endReplaceableGroup();
                                            m11271boximpl = UInt.m11271boximpl(i2);
                                            startRestartGroup.startReplaceableGroup(-1077264621);
                                            changed2 = (i16 != 536870912) | startRestartGroup.changed(mutableState4) | ((i11 & 234881024) != 67108864) | startRestartGroup.changedInstance(animatable) | ((i11 & 458752) != 131072);
                                            rememberedValue5 = startRestartGroup.rememberedValue();
                                            if (!changed2 || rememberedValue5 == companion.getEmpty()) {
                                                mutableState2 = mutableState;
                                                f5 = f3;
                                                modifier3 = modifier2;
                                                lifecycleOwner5 = lifecycleOwner4;
                                                i12 = i11;
                                                continuation = null;
                                                uInt = m11271boximpl;
                                                i13 = i2;
                                                a aVar = new a(i13, i, animatable, onTimerFinish, mutableState4, null);
                                                startRestartGroup.updateRememberedValue(aVar);
                                                rememberedValue5 = aVar;
                                            } else {
                                                mutableState2 = mutableState;
                                                f5 = f3;
                                                modifier3 = modifier2;
                                                lifecycleOwner5 = lifecycleOwner4;
                                                i12 = i11;
                                                continuation = null;
                                                uInt = m11271boximpl;
                                                i13 = i2;
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, (i12 >> 27) & 14);
                                            Boolean valueOf = Boolean.valueOf(b(mutableState3));
                                            startRestartGroup.startReplaceableGroup(-1077230899);
                                            changed3 = startRestartGroup.changed(mutableState3) | startRestartGroup.changedInstance(animatable);
                                            rememberedValue6 = startRestartGroup.rememberedValue();
                                            if (!changed3 || rememberedValue6 == companion.getEmpty()) {
                                                rememberedValue6 = new C0330b(animatable, mutableState3, continuation);
                                                startRestartGroup.updateRememberedValue(rememberedValue6);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
                                            startRestartGroup.startReplaceableGroup(-1077226486);
                                            changed4 = startRestartGroup.changed(mutableState3) | startRestartGroup.changedInstance(animatable) | startRestartGroup.changedInstance(lifecycleOwner5);
                                            rememberedValue7 = startRestartGroup.rememberedValue();
                                            if (!changed4 || rememberedValue7 == companion.getEmpty()) {
                                                rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return b.a(LifecycleOwner.this, animatable, mutableState3, (DisposableEffectScope) obj);
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue7);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            EffectsKt.DisposableEffect(lifecycleOwner5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue7, startRestartGroup, (i12 >> 21) & 14);
                                            Alignment.Companion companion2 = Alignment.INSTANCE;
                                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                            Arrangement.HorizontalOrVertical m494spacedBy0680j_4 = Arrangement.INSTANCE.m494spacedBy0680j_4(Dp.m4440constructorimpl(8));
                                            startRestartGroup.startReplaceableGroup(693286680);
                                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m494spacedBy0680j_4, centerVertically, startRestartGroup, 54);
                                            startRestartGroup.startReplaceableGroup(-1323940314);
                                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
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
                                            Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                            if (!m1642constructorimpl.getInserting() || !Intrinsics.areEqual(m1642constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            modifierMaterializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                            startRestartGroup.startReplaceableGroup(2058660585);
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            String a2 = com.moloco.sdk.internal.utils.b.a(customTimerString, i13);
                                            long d2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                                            int m4337getStarte0LSkKk = TextAlign.INSTANCE.m4337getStarte0LSkKk();
                                            Modifier.Companion companion4 = Modifier.INSTANCE;
                                            startRestartGroup.startReplaceableGroup(-447505287);
                                            rememberedValue8 = startRestartGroup.rememberedValue();
                                            if (rememberedValue8 == companion.getEmpty()) {
                                                final String str = "custom_countdown_timer_text";
                                                rememberedValue8 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda2
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return b.a(str, (SemanticsPropertyReceiver) obj);
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue8);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            TextKt.m1591TextfLXpl1I(a2, SemanticsModifierKt.semantics$default(companion4, false, (Function1) rememberedValue8, 1, null), j2, d2, null, null, null, 0L, null, TextAlign.m4325boximpl(m4337getStarte0LSkKk), 0L, 0, false, 2, null, null, startRestartGroup, ((i12 << 3) & 896) | 3072, 3072, 56816);
                                            composer2 = startRestartGroup;
                                            Alignment center = companion2.getCenter();
                                            Modifier m585padding3ABfNKs = PaddingKt.m585padding3ABfNKs(SizeKt.m634size3ABfNKs(companion4, f9), Dp.m4440constructorimpl(2));
                                            composer2.startReplaceableGroup(-447492116);
                                            rememberedValue9 = composer2.rememberedValue();
                                            if (rememberedValue9 == companion.getEmpty()) {
                                                rememberedValue9 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda3
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return b.a(MutableState.this, (IntSize) obj);
                                                    }
                                                };
                                                composer2.updateRememberedValue(rememberedValue9);
                                            }
                                            composer2.endReplaceableGroup();
                                            Modifier m232backgroundbw27NRU = BackgroundKt.m232backgroundbw27NRU(OnRemeasuredModifierKt.onSizeChanged(m585padding3ABfNKs, (Function1) rememberedValue9), Color.m2111copywmQWz5c$default(Color.INSTANCE.m2149getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                                            composer2.startReplaceableGroup(-447486932);
                                            rememberedValue10 = composer2.rememberedValue();
                                            if (rememberedValue10 == companion.getEmpty()) {
                                                final String str2 = "custom_timer_container";
                                                rememberedValue10 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return b.b(str2, (SemanticsPropertyReceiver) obj);
                                                    }
                                                };
                                                composer2.updateRememberedValue(rememberedValue10);
                                            }
                                            composer2.endReplaceableGroup();
                                            Modifier semantics$default = SemanticsModifierKt.semantics$default(m232backgroundbw27NRU, false, (Function1) rememberedValue10, 1, null);
                                            composer2.startReplaceableGroup(733328855);
                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                            composer2.startReplaceableGroup(-1323940314);
                                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(semantics$default);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.useNode();
                                            } else {
                                                composer2.createNode(constructor2);
                                            }
                                            m1642constructorimpl2 = Updater.m1642constructorimpl(composer2);
                                            Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                            Updater.m1649setimpl(m1642constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                            if (!m1642constructorimpl2.getInserting() || !Intrinsics.areEqual(m1642constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                m1642constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                m1642constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            modifierMaterializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                                            composer2.startReplaceableGroup(-1178257690);
                                            changedInstance = ((i12 & 14) != 4) | ((i12 & 7168) != 2048) | composer2.changedInstance(animatable) | ((i12 & 112) == 32);
                                            rememberedValue11 = composer2.rememberedValue();
                                            if (!changedInstance || rememberedValue11 == companion.getEmpty()) {
                                                f6 = f5;
                                                final MutableState mutableState5 = mutableState2;
                                                Function1 function1 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return b.a(j, f6, animatable, j2, mutableState5, (DrawScope) obj);
                                                    }
                                                };
                                                composer2.updateRememberedValue(function1);
                                                rememberedValue11 = function1;
                                            } else {
                                                f6 = f5;
                                            }
                                            composer2.endReplaceableGroup();
                                            CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue11, composer2, 6);
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            modifier4 = modifier3;
                                            f7 = f9;
                                            lifecycleOwner6 = lifecycleOwner5;
                                            f8 = f6;
                                        }
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i4 & 128) != 0) {
                                            i5 &= -29360129;
                                        }
                                    }
                                    i10 = i5;
                                    lifecycleOwner3 = lifecycleOwner2;
                                    float f92 = f4;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    startRestartGroup.startReplaceableGroup(-1077278555);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    companion = Composer.INSTANCE;
                                    if (rememberedValue == companion.getEmpty()) {
                                    }
                                    mutableState = (MutableState) rememberedValue;
                                    startRestartGroup.endReplaceableGroup();
                                    startRestartGroup.startReplaceableGroup(-1077276327);
                                    changed = startRestartGroup.changed(lifecycleOwner3);
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (changed) {
                                    }
                                    lifecycleOwner4 = lifecycleOwner3;
                                    MutableState mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                                    startRestartGroup.updateRememberedValue(mutableStateOf$default2);
                                    rememberedValue2 = mutableStateOf$default2;
                                    final MutableState mutableState32 = (MutableState) rememberedValue2;
                                    startRestartGroup.endReplaceableGroup();
                                    Object[] objArr2 = new Object[0];
                                    startRestartGroup.startReplaceableGroup(-1077272712);
                                    int i162 = 1879048192 & i10;
                                    if (i162 != 536870912) {
                                    }
                                    i11 = i10;
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (!z) {
                                    }
                                    rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return b.a(i2);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                    startRestartGroup.endReplaceableGroup();
                                    MutableState mutableState42 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 0, 6);
                                    startRestartGroup.startReplaceableGroup(-1077269958);
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (rememberedValue4 != companion.getEmpty()) {
                                    }
                                    final Animatable animatable2 = (Animatable) rememberedValue4;
                                    startRestartGroup.endReplaceableGroup();
                                    m11271boximpl = UInt.m11271boximpl(i2);
                                    startRestartGroup.startReplaceableGroup(-1077264621);
                                    changed2 = (i162 != 536870912) | startRestartGroup.changed(mutableState42) | ((i11 & 234881024) != 67108864) | startRestartGroup.changedInstance(animatable2) | ((i11 & 458752) != 131072);
                                    rememberedValue5 = startRestartGroup.rememberedValue();
                                    if (changed2) {
                                    }
                                    mutableState2 = mutableState;
                                    f5 = f3;
                                    modifier3 = modifier2;
                                    lifecycleOwner5 = lifecycleOwner4;
                                    i12 = i11;
                                    continuation = null;
                                    uInt = m11271boximpl;
                                    i13 = i2;
                                    a aVar2 = new a(i13, i, animatable2, onTimerFinish, mutableState42, null);
                                    startRestartGroup.updateRememberedValue(aVar2);
                                    rememberedValue5 = aVar2;
                                    startRestartGroup.endReplaceableGroup();
                                    EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, (i12 >> 27) & 14);
                                    Boolean valueOf2 = Boolean.valueOf(b(mutableState32));
                                    startRestartGroup.startReplaceableGroup(-1077230899);
                                    changed3 = startRestartGroup.changed(mutableState32) | startRestartGroup.changedInstance(animatable2);
                                    rememberedValue6 = startRestartGroup.rememberedValue();
                                    if (!changed3) {
                                    }
                                    rememberedValue6 = new C0330b(animatable2, mutableState32, continuation);
                                    startRestartGroup.updateRememberedValue(rememberedValue6);
                                    startRestartGroup.endReplaceableGroup();
                                    EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
                                    startRestartGroup.startReplaceableGroup(-1077226486);
                                    changed4 = startRestartGroup.changed(mutableState32) | startRestartGroup.changedInstance(animatable2) | startRestartGroup.changedInstance(lifecycleOwner5);
                                    rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (!changed4) {
                                    }
                                    rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return b.a(LifecycleOwner.this, animatable2, mutableState32, (DisposableEffectScope) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue7);
                                    startRestartGroup.endReplaceableGroup();
                                    EffectsKt.DisposableEffect(lifecycleOwner5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue7, startRestartGroup, (i12 >> 21) & 14);
                                    Alignment.Companion companion22 = Alignment.INSTANCE;
                                    Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
                                    Arrangement.HorizontalOrVertical m494spacedBy0680j_42 = Arrangement.INSTANCE.m494spacedBy0680j_4(Dp.m4440constructorimpl(8));
                                    startRestartGroup.startReplaceableGroup(693286680);
                                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m494spacedBy0680j_42, centerVertically2, startRestartGroup, 54);
                                    startRestartGroup.startReplaceableGroup(-1323940314);
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifier3);
                                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                    }
                                    m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
                                    Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy2, companion32.getSetMeasurePolicy());
                                    Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                                    if (!m1642constructorimpl.getInserting()) {
                                    }
                                    m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                                    modifierMaterializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                    startRestartGroup.startReplaceableGroup(2058660585);
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    String a22 = com.moloco.sdk.internal.utils.b.a(customTimerString, i13);
                                    long d22 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                                    int m4337getStarte0LSkKk2 = TextAlign.INSTANCE.m4337getStarte0LSkKk();
                                    Modifier.Companion companion42 = Modifier.INSTANCE;
                                    startRestartGroup.startReplaceableGroup(-447505287);
                                    rememberedValue8 = startRestartGroup.rememberedValue();
                                    if (rememberedValue8 == companion.getEmpty()) {
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    TextKt.m1591TextfLXpl1I(a22, SemanticsModifierKt.semantics$default(companion42, false, (Function1) rememberedValue8, 1, null), j2, d22, null, null, null, 0L, null, TextAlign.m4325boximpl(m4337getStarte0LSkKk2), 0L, 0, false, 2, null, null, startRestartGroup, ((i12 << 3) & 896) | 3072, 3072, 56816);
                                    composer2 = startRestartGroup;
                                    Alignment center2 = companion22.getCenter();
                                    Modifier m585padding3ABfNKs2 = PaddingKt.m585padding3ABfNKs(SizeKt.m634size3ABfNKs(companion42, f92), Dp.m4440constructorimpl(2));
                                    composer2.startReplaceableGroup(-447492116);
                                    rememberedValue9 = composer2.rememberedValue();
                                    if (rememberedValue9 == companion.getEmpty()) {
                                    }
                                    composer2.endReplaceableGroup();
                                    Modifier m232backgroundbw27NRU2 = BackgroundKt.m232backgroundbw27NRU(OnRemeasuredModifierKt.onSizeChanged(m585padding3ABfNKs2, (Function1) rememberedValue9), Color.m2111copywmQWz5c$default(Color.INSTANCE.m2149getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                                    composer2.startReplaceableGroup(-447486932);
                                    rememberedValue10 = composer2.rememberedValue();
                                    if (rememberedValue10 == companion.getEmpty()) {
                                    }
                                    composer2.endReplaceableGroup();
                                    Modifier semantics$default2 = SemanticsModifierKt.semantics$default(m232backgroundbw27NRU2, false, (Function1) rememberedValue10, 1, null);
                                    composer2.startReplaceableGroup(733328855);
                                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                                    composer2.startReplaceableGroup(-1323940314);
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(semantics$default2);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                    }
                                    m1642constructorimpl2 = Updater.m1642constructorimpl(composer2);
                                    Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                                    Updater.m1649setimpl(m1642constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = companion32.getSetCompositeKeyHash();
                                    if (!m1642constructorimpl2.getInserting()) {
                                    }
                                    m1642constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m1642constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                                    modifierMaterializerOf22.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(companion42, 0.0f, 1, null);
                                    composer2.startReplaceableGroup(-1178257690);
                                    changedInstance = ((i12 & 14) != 4) | ((i12 & 7168) != 2048) | composer2.changedInstance(animatable2) | ((i12 & 112) == 32);
                                    rememberedValue11 = composer2.rememberedValue();
                                    if (changedInstance) {
                                    }
                                    f6 = f5;
                                    final MutableState mutableState52 = mutableState2;
                                    Function1 function12 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return b.a(j, f6, animatable2, j2, mutableState52, (DrawScope) obj);
                                        }
                                    };
                                    composer2.updateRememberedValue(function12);
                                    rememberedValue11 = function12;
                                    composer2.endReplaceableGroup();
                                    CanvasKt.Canvas(fillMaxSize$default2, (Function1) rememberedValue11, composer2, 6);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier4 = modifier3;
                                    f7 = f92;
                                    lifecycleOwner6 = lifecycleOwner5;
                                    f8 = f6;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    float f10 = f3;
                                    f7 = f4;
                                    f8 = f10;
                                    composer2 = startRestartGroup;
                                    lifecycleOwner6 = lifecycleOwner2;
                                    modifier4 = modifier2;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return b.a(j, j2, modifier4, f8, f7, onTimerFinish, customTimerString, lifecycleOwner6, i, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i9 = C.ENCODING_PCM_32BIT;
                            i5 |= i9;
                            if ((i5 & 306783379) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i3 & 1) != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if ((i4 & 128) != 0) {
                            }
                            i10 = i5;
                            lifecycleOwner3 = lifecycleOwner2;
                            float f922 = f4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            startRestartGroup.startReplaceableGroup(-1077278555);
                            rememberedValue = startRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (rememberedValue == companion.getEmpty()) {
                            }
                            mutableState = (MutableState) rememberedValue;
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.startReplaceableGroup(-1077276327);
                            changed = startRestartGroup.changed(lifecycleOwner3);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (changed) {
                            }
                            lifecycleOwner4 = lifecycleOwner3;
                            MutableState mutableStateOf$default22 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                            startRestartGroup.updateRememberedValue(mutableStateOf$default22);
                            rememberedValue2 = mutableStateOf$default22;
                            final MutableState mutableState322 = (MutableState) rememberedValue2;
                            startRestartGroup.endReplaceableGroup();
                            Object[] objArr22 = new Object[0];
                            startRestartGroup.startReplaceableGroup(-1077272712);
                            int i1622 = 1879048192 & i10;
                            if (i1622 != 536870912) {
                            }
                            i11 = i10;
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!z) {
                            }
                            rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return b.a(i2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                            startRestartGroup.endReplaceableGroup();
                            MutableState mutableState422 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 0, 6);
                            startRestartGroup.startReplaceableGroup(-1077269958);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 != companion.getEmpty()) {
                            }
                            final Animatable animatable22 = (Animatable) rememberedValue4;
                            startRestartGroup.endReplaceableGroup();
                            m11271boximpl = UInt.m11271boximpl(i2);
                            startRestartGroup.startReplaceableGroup(-1077264621);
                            changed2 = (i1622 != 536870912) | startRestartGroup.changed(mutableState422) | ((i11 & 234881024) != 67108864) | startRestartGroup.changedInstance(animatable22) | ((i11 & 458752) != 131072);
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (changed2) {
                            }
                            mutableState2 = mutableState;
                            f5 = f3;
                            modifier3 = modifier2;
                            lifecycleOwner5 = lifecycleOwner4;
                            i12 = i11;
                            continuation = null;
                            uInt = m11271boximpl;
                            i13 = i2;
                            a aVar22 = new a(i13, i, animatable22, onTimerFinish, mutableState422, null);
                            startRestartGroup.updateRememberedValue(aVar22);
                            rememberedValue5 = aVar22;
                            startRestartGroup.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, (i12 >> 27) & 14);
                            Boolean valueOf22 = Boolean.valueOf(b(mutableState322));
                            startRestartGroup.startReplaceableGroup(-1077230899);
                            changed3 = startRestartGroup.changed(mutableState322) | startRestartGroup.changedInstance(animatable22);
                            rememberedValue6 = startRestartGroup.rememberedValue();
                            if (!changed3) {
                            }
                            rememberedValue6 = new C0330b(animatable22, mutableState322, continuation);
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                            startRestartGroup.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(valueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(-1077226486);
                            changed4 = startRestartGroup.changed(mutableState322) | startRestartGroup.changedInstance(animatable22) | startRestartGroup.changedInstance(lifecycleOwner5);
                            rememberedValue7 = startRestartGroup.rememberedValue();
                            if (!changed4) {
                            }
                            rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return b.a(LifecycleOwner.this, animatable22, mutableState322, (DisposableEffectScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue7);
                            startRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(lifecycleOwner5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue7, startRestartGroup, (i12 >> 21) & 14);
                            Alignment.Companion companion222 = Alignment.INSTANCE;
                            Alignment.Vertical centerVertically22 = companion222.getCenterVertically();
                            Arrangement.HorizontalOrVertical m494spacedBy0680j_422 = Arrangement.INSTANCE.m494spacedBy0680j_4(Dp.m4440constructorimpl(8));
                            startRestartGroup.startReplaceableGroup(693286680);
                            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(m494spacedBy0680j_422, centerVertically22, startRestartGroup, 54);
                            startRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion322 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor32 = companion322.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf32 = LayoutKt.modifierMaterializerOf(modifier3);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                            }
                            m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
                            Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy22, companion322.getSetMeasurePolicy());
                            Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap32, companion322.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = companion322.getSetCompositeKeyHash();
                            if (!m1642constructorimpl.getInserting()) {
                            }
                            m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
                            modifierMaterializerOf32.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(2058660585);
                            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                            String a222 = com.moloco.sdk.internal.utils.b.a(customTimerString, i13);
                            long d222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                            int m4337getStarte0LSkKk22 = TextAlign.INSTANCE.m4337getStarte0LSkKk();
                            Modifier.Companion companion422 = Modifier.INSTANCE;
                            startRestartGroup.startReplaceableGroup(-447505287);
                            rememberedValue8 = startRestartGroup.rememberedValue();
                            if (rememberedValue8 == companion.getEmpty()) {
                            }
                            startRestartGroup.endReplaceableGroup();
                            TextKt.m1591TextfLXpl1I(a222, SemanticsModifierKt.semantics$default(companion422, false, (Function1) rememberedValue8, 1, null), j2, d222, null, null, null, 0L, null, TextAlign.m4325boximpl(m4337getStarte0LSkKk22), 0L, 0, false, 2, null, null, startRestartGroup, ((i12 << 3) & 896) | 3072, 3072, 56816);
                            composer2 = startRestartGroup;
                            Alignment center22 = companion222.getCenter();
                            Modifier m585padding3ABfNKs22 = PaddingKt.m585padding3ABfNKs(SizeKt.m634size3ABfNKs(companion422, f922), Dp.m4440constructorimpl(2));
                            composer2.startReplaceableGroup(-447492116);
                            rememberedValue9 = composer2.rememberedValue();
                            if (rememberedValue9 == companion.getEmpty()) {
                            }
                            composer2.endReplaceableGroup();
                            Modifier m232backgroundbw27NRU22 = BackgroundKt.m232backgroundbw27NRU(OnRemeasuredModifierKt.onSizeChanged(m585padding3ABfNKs22, (Function1) rememberedValue9), Color.m2111copywmQWz5c$default(Color.INSTANCE.m2149getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                            composer2.startReplaceableGroup(-447486932);
                            rememberedValue10 = composer2.rememberedValue();
                            if (rememberedValue10 == companion.getEmpty()) {
                            }
                            composer2.endReplaceableGroup();
                            Modifier semantics$default22 = SemanticsModifierKt.semantics$default(m232backgroundbw27NRU22, false, (Function1) rememberedValue10, 1, null);
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(center22, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap222 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor222 = companion322.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(semantics$default22);
                            if (!(composer2.getApplier() instanceof Applier)) {
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                            }
                            m1642constructorimpl2 = Updater.m1642constructorimpl(composer2);
                            Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy22, companion322.getSetMeasurePolicy());
                            Updater.m1649setimpl(m1642constructorimpl2, currentCompositionLocalMap222, companion322.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = companion322.getSetCompositeKeyHash();
                            if (!m1642constructorimpl2.getInserting()) {
                            }
                            m1642constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m1642constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                            modifierMaterializerOf222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                            Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(companion422, 0.0f, 1, null);
                            composer2.startReplaceableGroup(-1178257690);
                            changedInstance = ((i12 & 14) != 4) | ((i12 & 7168) != 2048) | composer2.changedInstance(animatable22) | ((i12 & 112) == 32);
                            rememberedValue11 = composer2.rememberedValue();
                            if (changedInstance) {
                            }
                            f6 = f5;
                            final MutableState mutableState522 = mutableState2;
                            Function1 function122 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return b.a(j, f6, animatable22, j2, mutableState522, (DrawScope) obj);
                                }
                            };
                            composer2.updateRememberedValue(function122);
                            rememberedValue11 = function122;
                            composer2.endReplaceableGroup();
                            CanvasKt.Canvas(fillMaxSize$default22, (Function1) rememberedValue11, composer2, 6);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            f7 = f922;
                            lifecycleOwner6 = lifecycleOwner5;
                            f8 = f6;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i5 |= i14;
                        if ((i4 & 512) != 0) {
                        }
                        i5 |= i9;
                        if ((i5 & 306783379) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if ((i4 & 128) != 0) {
                        }
                        i10 = i5;
                        lifecycleOwner3 = lifecycleOwner2;
                        float f9222 = f4;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceableGroup(-1077278555);
                        rememberedValue = startRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (rememberedValue == companion.getEmpty()) {
                        }
                        mutableState = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.startReplaceableGroup(-1077276327);
                        changed = startRestartGroup.changed(lifecycleOwner3);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (changed) {
                        }
                        lifecycleOwner4 = lifecycleOwner3;
                        MutableState mutableStateOf$default222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        startRestartGroup.updateRememberedValue(mutableStateOf$default222);
                        rememberedValue2 = mutableStateOf$default222;
                        final MutableState mutableState3222 = (MutableState) rememberedValue2;
                        startRestartGroup.endReplaceableGroup();
                        Object[] objArr222 = new Object[0];
                        startRestartGroup.startReplaceableGroup(-1077272712);
                        int i16222 = 1879048192 & i10;
                        if (i16222 != 536870912) {
                        }
                        i11 = i10;
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!z) {
                        }
                        rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return b.a(i2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        startRestartGroup.endReplaceableGroup();
                        MutableState mutableState4222 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr222, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 0, 6);
                        startRestartGroup.startReplaceableGroup(-1077269958);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 != companion.getEmpty()) {
                        }
                        final Animatable animatable222 = (Animatable) rememberedValue4;
                        startRestartGroup.endReplaceableGroup();
                        m11271boximpl = UInt.m11271boximpl(i2);
                        startRestartGroup.startReplaceableGroup(-1077264621);
                        changed2 = (i16222 != 536870912) | startRestartGroup.changed(mutableState4222) | ((i11 & 234881024) != 67108864) | startRestartGroup.changedInstance(animatable222) | ((i11 & 458752) != 131072);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (changed2) {
                        }
                        mutableState2 = mutableState;
                        f5 = f3;
                        modifier3 = modifier2;
                        lifecycleOwner5 = lifecycleOwner4;
                        i12 = i11;
                        continuation = null;
                        uInt = m11271boximpl;
                        i13 = i2;
                        a aVar222 = new a(i13, i, animatable222, onTimerFinish, mutableState4222, null);
                        startRestartGroup.updateRememberedValue(aVar222);
                        rememberedValue5 = aVar222;
                        startRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, (i12 >> 27) & 14);
                        Boolean valueOf222 = Boolean.valueOf(b(mutableState3222));
                        startRestartGroup.startReplaceableGroup(-1077230899);
                        changed3 = startRestartGroup.changed(mutableState3222) | startRestartGroup.changedInstance(animatable222);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (!changed3) {
                        }
                        rememberedValue6 = new C0330b(animatable222, mutableState3222, continuation);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                        startRestartGroup.endReplaceableGroup();
                        EffectsKt.LaunchedEffect(valueOf222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(-1077226486);
                        changed4 = startRestartGroup.changed(mutableState3222) | startRestartGroup.changedInstance(animatable222) | startRestartGroup.changedInstance(lifecycleOwner5);
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (!changed4) {
                        }
                        rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return b.a(LifecycleOwner.this, animatable222, mutableState3222, (DisposableEffectScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                        startRestartGroup.endReplaceableGroup();
                        EffectsKt.DisposableEffect(lifecycleOwner5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue7, startRestartGroup, (i12 >> 21) & 14);
                        Alignment.Companion companion2222 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically222 = companion2222.getCenterVertically();
                        Arrangement.HorizontalOrVertical m494spacedBy0680j_4222 = Arrangement.INSTANCE.m494spacedBy0680j_4(Dp.m4440constructorimpl(8));
                        startRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(m494spacedBy0680j_4222, centerVertically222, startRestartGroup, 54);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3222 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor322 = companion3222.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf322 = LayoutKt.modifierMaterializerOf(modifier3);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
                        Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy222, companion3222.getSetMeasurePolicy());
                        Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap322, companion3222.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = companion3222.getSetCompositeKeyHash();
                        if (!m1642constructorimpl.getInserting()) {
                        }
                        m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
                        modifierMaterializerOf322.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
                        String a2222 = com.moloco.sdk.internal.utils.b.a(customTimerString, i13);
                        long d2222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                        int m4337getStarte0LSkKk222 = TextAlign.INSTANCE.m4337getStarte0LSkKk();
                        Modifier.Companion companion4222 = Modifier.INSTANCE;
                        startRestartGroup.startReplaceableGroup(-447505287);
                        rememberedValue8 = startRestartGroup.rememberedValue();
                        if (rememberedValue8 == companion.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        TextKt.m1591TextfLXpl1I(a2222, SemanticsModifierKt.semantics$default(companion4222, false, (Function1) rememberedValue8, 1, null), j2, d2222, null, null, null, 0L, null, TextAlign.m4325boximpl(m4337getStarte0LSkKk222), 0L, 0, false, 2, null, null, startRestartGroup, ((i12 << 3) & 896) | 3072, 3072, 56816);
                        composer2 = startRestartGroup;
                        Alignment center222 = companion2222.getCenter();
                        Modifier m585padding3ABfNKs222 = PaddingKt.m585padding3ABfNKs(SizeKt.m634size3ABfNKs(companion4222, f9222), Dp.m4440constructorimpl(2));
                        composer2.startReplaceableGroup(-447492116);
                        rememberedValue9 = composer2.rememberedValue();
                        if (rememberedValue9 == companion.getEmpty()) {
                        }
                        composer2.endReplaceableGroup();
                        Modifier m232backgroundbw27NRU222 = BackgroundKt.m232backgroundbw27NRU(OnRemeasuredModifierKt.onSizeChanged(m585padding3ABfNKs222, (Function1) rememberedValue9), Color.m2111copywmQWz5c$default(Color.INSTANCE.m2149getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                        composer2.startReplaceableGroup(-447486932);
                        rememberedValue10 = composer2.rememberedValue();
                        if (rememberedValue10 == companion.getEmpty()) {
                        }
                        composer2.endReplaceableGroup();
                        Modifier semantics$default222 = SemanticsModifierKt.semantics$default(m232backgroundbw27NRU222, false, (Function1) rememberedValue10, 1, null);
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(center222, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2222 = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2222 = companion3222.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2222 = LayoutKt.modifierMaterializerOf(semantics$default222);
                        if (!(composer2.getApplier() instanceof Applier)) {
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                        }
                        m1642constructorimpl2 = Updater.m1642constructorimpl(composer2);
                        Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy222, companion3222.getSetMeasurePolicy());
                        Updater.m1649setimpl(m1642constructorimpl2, currentCompositionLocalMap2222, companion3222.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = companion3222.getSetCompositeKeyHash();
                        if (!m1642constructorimpl2.getInserting()) {
                        }
                        m1642constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m1642constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                        modifierMaterializerOf2222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                        Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(companion4222, 0.0f, 1, null);
                        composer2.startReplaceableGroup(-1178257690);
                        changedInstance = ((i12 & 14) != 4) | ((i12 & 7168) != 2048) | composer2.changedInstance(animatable222) | ((i12 & 112) == 32);
                        rememberedValue11 = composer2.rememberedValue();
                        if (changedInstance) {
                        }
                        f6 = f5;
                        final MutableState mutableState5222 = mutableState2;
                        Function1 function1222 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return b.a(j, f6, animatable222, j2, mutableState5222, (DrawScope) obj);
                            }
                        };
                        composer2.updateRememberedValue(function1222);
                        rememberedValue11 = function1222;
                        composer2.endReplaceableGroup();
                        CanvasKt.Canvas(fillMaxSize$default222, (Function1) rememberedValue11, composer2, 6);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                        f7 = f9222;
                        lifecycleOwner6 = lifecycleOwner5;
                        f8 = f6;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    f4 = f2;
                    if ((i4 & 32) != 0) {
                    }
                    if ((i4 & 64) != 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    if ((i4 & 256) == 0) {
                    }
                    i5 |= i14;
                    if ((i4 & 512) != 0) {
                    }
                    i5 |= i9;
                    if ((i5 & 306783379) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i3 & 1) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if ((i4 & 128) != 0) {
                    }
                    i10 = i5;
                    lifecycleOwner3 = lifecycleOwner2;
                    float f92222 = f4;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(-1077278555);
                    rememberedValue = startRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (rememberedValue == companion.getEmpty()) {
                    }
                    mutableState = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(-1077276327);
                    changed = startRestartGroup.changed(lifecycleOwner3);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    lifecycleOwner4 = lifecycleOwner3;
                    MutableState mutableStateOf$default2222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    startRestartGroup.updateRememberedValue(mutableStateOf$default2222);
                    rememberedValue2 = mutableStateOf$default2222;
                    final MutableState mutableState32222 = (MutableState) rememberedValue2;
                    startRestartGroup.endReplaceableGroup();
                    Object[] objArr2222 = new Object[0];
                    startRestartGroup.startReplaceableGroup(-1077272712);
                    int i162222 = 1879048192 & i10;
                    if (i162222 != 536870912) {
                    }
                    i11 = i10;
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return b.a(i2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceableGroup();
                    MutableState mutableState42222 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr2222, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 0, 6);
                    startRestartGroup.startReplaceableGroup(-1077269958);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 != companion.getEmpty()) {
                    }
                    final Animatable animatable2222 = (Animatable) rememberedValue4;
                    startRestartGroup.endReplaceableGroup();
                    m11271boximpl = UInt.m11271boximpl(i2);
                    startRestartGroup.startReplaceableGroup(-1077264621);
                    changed2 = (i162222 != 536870912) | startRestartGroup.changed(mutableState42222) | ((i11 & 234881024) != 67108864) | startRestartGroup.changedInstance(animatable2222) | ((i11 & 458752) != 131072);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changed2) {
                    }
                    mutableState2 = mutableState;
                    f5 = f3;
                    modifier3 = modifier2;
                    lifecycleOwner5 = lifecycleOwner4;
                    i12 = i11;
                    continuation = null;
                    uInt = m11271boximpl;
                    i13 = i2;
                    a aVar2222 = new a(i13, i, animatable2222, onTimerFinish, mutableState42222, null);
                    startRestartGroup.updateRememberedValue(aVar2222);
                    rememberedValue5 = aVar2222;
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, (i12 >> 27) & 14);
                    Boolean valueOf2222 = Boolean.valueOf(b(mutableState32222));
                    startRestartGroup.startReplaceableGroup(-1077230899);
                    changed3 = startRestartGroup.changed(mutableState32222) | startRestartGroup.changedInstance(animatable2222);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue6 = new C0330b(animatable2222, mutableState32222, continuation);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(valueOf2222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(-1077226486);
                    changed4 = startRestartGroup.changed(mutableState32222) | startRestartGroup.changedInstance(animatable2222) | startRestartGroup.changedInstance(lifecycleOwner5);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!changed4) {
                    }
                    rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return b.a(LifecycleOwner.this, animatable2222, mutableState32222, (DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.DisposableEffect(lifecycleOwner5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue7, startRestartGroup, (i12 >> 21) & 14);
                    Alignment.Companion companion22222 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically2222 = companion22222.getCenterVertically();
                    Arrangement.HorizontalOrVertical m494spacedBy0680j_42222 = Arrangement.INSTANCE.m494spacedBy0680j_4(Dp.m4440constructorimpl(8));
                    startRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(m494spacedBy0680j_42222, centerVertically2222, startRestartGroup, 54);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion32222 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3222 = companion32222.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3222 = LayoutKt.modifierMaterializerOf(modifier3);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
                    Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy2222, companion32222.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap3222, companion32222.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = companion32222.getSetCompositeKeyHash();
                    if (!m1642constructorimpl.getInserting()) {
                    }
                    m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3222);
                    modifierMaterializerOf3222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
                    String a22222 = com.moloco.sdk.internal.utils.b.a(customTimerString, i13);
                    long d22222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                    int m4337getStarte0LSkKk2222 = TextAlign.INSTANCE.m4337getStarte0LSkKk();
                    Modifier.Companion companion42222 = Modifier.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-447505287);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (rememberedValue8 == companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextKt.m1591TextfLXpl1I(a22222, SemanticsModifierKt.semantics$default(companion42222, false, (Function1) rememberedValue8, 1, null), j2, d22222, null, null, null, 0L, null, TextAlign.m4325boximpl(m4337getStarte0LSkKk2222), 0L, 0, false, 2, null, null, startRestartGroup, ((i12 << 3) & 896) | 3072, 3072, 56816);
                    composer2 = startRestartGroup;
                    Alignment center2222 = companion22222.getCenter();
                    Modifier m585padding3ABfNKs2222 = PaddingKt.m585padding3ABfNKs(SizeKt.m634size3ABfNKs(companion42222, f92222), Dp.m4440constructorimpl(2));
                    composer2.startReplaceableGroup(-447492116);
                    rememberedValue9 = composer2.rememberedValue();
                    if (rememberedValue9 == companion.getEmpty()) {
                    }
                    composer2.endReplaceableGroup();
                    Modifier m232backgroundbw27NRU2222 = BackgroundKt.m232backgroundbw27NRU(OnRemeasuredModifierKt.onSizeChanged(m585padding3ABfNKs2222, (Function1) rememberedValue9), Color.m2111copywmQWz5c$default(Color.INSTANCE.m2149getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                    composer2.startReplaceableGroup(-447486932);
                    rememberedValue10 = composer2.rememberedValue();
                    if (rememberedValue10 == companion.getEmpty()) {
                    }
                    composer2.endReplaceableGroup();
                    Modifier semantics$default2222 = SemanticsModifierKt.semantics$default(m232backgroundbw27NRU2222, false, (Function1) rememberedValue10, 1, null);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy2222 = BoxKt.rememberBoxMeasurePolicy(center2222, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap22222 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor22222 = companion32222.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22222 = LayoutKt.modifierMaterializerOf(semantics$default2222);
                    if (!(composer2.getApplier() instanceof Applier)) {
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                    }
                    m1642constructorimpl2 = Updater.m1642constructorimpl(composer2);
                    Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy2222, companion32222.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl2, currentCompositionLocalMap22222, companion32222.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = companion32222.getSetCompositeKeyHash();
                    if (!m1642constructorimpl2.getInserting()) {
                    }
                    m1642constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m1642constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                    modifierMaterializerOf22222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                    Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(companion42222, 0.0f, 1, null);
                    composer2.startReplaceableGroup(-1178257690);
                    changedInstance = ((i12 & 14) != 4) | ((i12 & 7168) != 2048) | composer2.changedInstance(animatable2222) | ((i12 & 112) == 32);
                    rememberedValue11 = composer2.rememberedValue();
                    if (changedInstance) {
                    }
                    f6 = f5;
                    final MutableState mutableState52222 = mutableState2;
                    Function1 function12222 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return b.a(j, f6, animatable2222, j2, mutableState52222, (DrawScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(function12222);
                    rememberedValue11 = function12222;
                    composer2.endReplaceableGroup();
                    CanvasKt.Canvas(fillMaxSize$default2222, (Function1) rememberedValue11, composer2, 6);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    f7 = f92222;
                    lifecycleOwner6 = lifecycleOwner5;
                    f8 = f6;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f3 = f;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                f4 = f2;
                if ((i4 & 32) != 0) {
                }
                if ((i4 & 64) != 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                if ((i4 & 256) == 0) {
                }
                i5 |= i14;
                if ((i4 & 512) != 0) {
                }
                i5 |= i9;
                if ((i5 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i3 & 1) != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if ((i4 & 128) != 0) {
                }
                i10 = i5;
                lifecycleOwner3 = lifecycleOwner2;
                float f922222 = f4;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-1077278555);
                rememberedValue = startRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (rememberedValue == companion.getEmpty()) {
                }
                mutableState = (MutableState) rememberedValue;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(-1077276327);
                changed = startRestartGroup.changed(lifecycleOwner3);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                lifecycleOwner4 = lifecycleOwner3;
                MutableState mutableStateOf$default22222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default22222);
                rememberedValue2 = mutableStateOf$default22222;
                final MutableState mutableState322222 = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceableGroup();
                Object[] objArr22222 = new Object[0];
                startRestartGroup.startReplaceableGroup(-1077272712);
                int i1622222 = 1879048192 & i10;
                if (i1622222 != 536870912) {
                }
                i11 = i10;
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b.a(i2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                MutableState mutableState422222 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr22222, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 0, 6);
                startRestartGroup.startReplaceableGroup(-1077269958);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 != companion.getEmpty()) {
                }
                final Animatable animatable22222 = (Animatable) rememberedValue4;
                startRestartGroup.endReplaceableGroup();
                m11271boximpl = UInt.m11271boximpl(i2);
                startRestartGroup.startReplaceableGroup(-1077264621);
                changed2 = (i1622222 != 536870912) | startRestartGroup.changed(mutableState422222) | ((i11 & 234881024) != 67108864) | startRestartGroup.changedInstance(animatable22222) | ((i11 & 458752) != 131072);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (changed2) {
                }
                mutableState2 = mutableState;
                f5 = f3;
                modifier3 = modifier2;
                lifecycleOwner5 = lifecycleOwner4;
                i12 = i11;
                continuation = null;
                uInt = m11271boximpl;
                i13 = i2;
                a aVar22222 = new a(i13, i, animatable22222, onTimerFinish, mutableState422222, null);
                startRestartGroup.updateRememberedValue(aVar22222);
                rememberedValue5 = aVar22222;
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, (i12 >> 27) & 14);
                Boolean valueOf22222 = Boolean.valueOf(b(mutableState322222));
                startRestartGroup.startReplaceableGroup(-1077230899);
                changed3 = startRestartGroup.changed(mutableState322222) | startRestartGroup.changedInstance(animatable22222);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue6 = new C0330b(animatable22222, mutableState322222, continuation);
                startRestartGroup.updateRememberedValue(rememberedValue6);
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(valueOf22222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1077226486);
                changed4 = startRestartGroup.changed(mutableState322222) | startRestartGroup.changedInstance(animatable22222) | startRestartGroup.changedInstance(lifecycleOwner5);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!changed4) {
                }
                rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.a(LifecycleOwner.this, animatable22222, mutableState322222, (DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
                startRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(lifecycleOwner5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue7, startRestartGroup, (i12 >> 21) & 14);
                Alignment.Companion companion222222 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically22222 = companion222222.getCenterVertically();
                Arrangement.HorizontalOrVertical m494spacedBy0680j_422222 = Arrangement.INSTANCE.m494spacedBy0680j_4(Dp.m4440constructorimpl(8));
                startRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy rowMeasurePolicy22222 = RowKt.rowMeasurePolicy(m494spacedBy0680j_422222, centerVertically22222, startRestartGroup, 54);
                startRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion322222 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor32222 = companion322222.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf32222 = LayoutKt.modifierMaterializerOf(modifier3);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
                Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy22222, companion322222.getSetMeasurePolicy());
                Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap32222, companion322222.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = companion322222.getSetCompositeKeyHash();
                if (!m1642constructorimpl.getInserting()) {
                }
                m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32222);
                modifierMaterializerOf32222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance22222 = RowScopeInstance.INSTANCE;
                String a222222 = com.moloco.sdk.internal.utils.b.a(customTimerString, i13);
                long d222222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                int m4337getStarte0LSkKk22222 = TextAlign.INSTANCE.m4337getStarte0LSkKk();
                Modifier.Companion companion422222 = Modifier.INSTANCE;
                startRestartGroup.startReplaceableGroup(-447505287);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == companion.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                TextKt.m1591TextfLXpl1I(a222222, SemanticsModifierKt.semantics$default(companion422222, false, (Function1) rememberedValue8, 1, null), j2, d222222, null, null, null, 0L, null, TextAlign.m4325boximpl(m4337getStarte0LSkKk22222), 0L, 0, false, 2, null, null, startRestartGroup, ((i12 << 3) & 896) | 3072, 3072, 56816);
                composer2 = startRestartGroup;
                Alignment center22222 = companion222222.getCenter();
                Modifier m585padding3ABfNKs22222 = PaddingKt.m585padding3ABfNKs(SizeKt.m634size3ABfNKs(companion422222, f922222), Dp.m4440constructorimpl(2));
                composer2.startReplaceableGroup(-447492116);
                rememberedValue9 = composer2.rememberedValue();
                if (rememberedValue9 == companion.getEmpty()) {
                }
                composer2.endReplaceableGroup();
                Modifier m232backgroundbw27NRU22222 = BackgroundKt.m232backgroundbw27NRU(OnRemeasuredModifierKt.onSizeChanged(m585padding3ABfNKs22222, (Function1) rememberedValue9), Color.m2111copywmQWz5c$default(Color.INSTANCE.m2149getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
                composer2.startReplaceableGroup(-447486932);
                rememberedValue10 = composer2.rememberedValue();
                if (rememberedValue10 == companion.getEmpty()) {
                }
                composer2.endReplaceableGroup();
                Modifier semantics$default22222 = SemanticsModifierKt.semantics$default(m232backgroundbw27NRU22222, false, (Function1) rememberedValue10, 1, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy22222 = BoxKt.rememberBoxMeasurePolicy(center22222, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap222222 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor222222 = companion322222.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222222 = LayoutKt.modifierMaterializerOf(semantics$default22222);
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                m1642constructorimpl2 = Updater.m1642constructorimpl(composer2);
                Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy22222, companion322222.getSetMeasurePolicy());
                Updater.m1649setimpl(m1642constructorimpl2, currentCompositionLocalMap222222, companion322222.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = companion322222.getSetCompositeKeyHash();
                if (!m1642constructorimpl2.getInserting()) {
                }
                m1642constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1642constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
                modifierMaterializerOf222222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
                Modifier fillMaxSize$default22222 = SizeKt.fillMaxSize$default(companion422222, 0.0f, 1, null);
                composer2.startReplaceableGroup(-1178257690);
                changedInstance = ((i12 & 14) != 4) | ((i12 & 7168) != 2048) | composer2.changedInstance(animatable22222) | ((i12 & 112) == 32);
                rememberedValue11 = composer2.rememberedValue();
                if (changedInstance) {
                }
                f6 = f5;
                final MutableState mutableState522222 = mutableState2;
                Function1 function122222 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.a(j, f6, animatable22222, j2, mutableState522222, (DrawScope) obj);
                    }
                };
                composer2.updateRememberedValue(function122222);
                rememberedValue11 = function122222;
                composer2.endReplaceableGroup();
                CanvasKt.Canvas(fillMaxSize$default22222, (Function1) rememberedValue11, composer2, 6);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                f7 = f922222;
                lifecycleOwner6 = lifecycleOwner5;
                f8 = f6;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            f3 = f;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            f4 = f2;
            if ((i4 & 32) != 0) {
            }
            if ((i4 & 64) != 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if ((i4 & 256) == 0) {
            }
            i5 |= i14;
            if ((i4 & 512) != 0) {
            }
            i5 |= i9;
            if ((i5 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i3 & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            i10 = i5;
            lifecycleOwner3 = lifecycleOwner2;
            float f9222222 = f4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-1077278555);
            rememberedValue = startRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (rememberedValue == companion.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1077276327);
            changed = startRestartGroup.changed(lifecycleOwner3);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            lifecycleOwner4 = lifecycleOwner3;
            MutableState mutableStateOf$default222222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            startRestartGroup.updateRememberedValue(mutableStateOf$default222222);
            rememberedValue2 = mutableStateOf$default222222;
            final MutableState mutableState3222222 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceableGroup();
            Object[] objArr222222 = new Object[0];
            startRestartGroup.startReplaceableGroup(-1077272712);
            int i16222222 = 1879048192 & i10;
            if (i16222222 != 536870912) {
            }
            i11 = i10;
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b.a(i2);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState4222222 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr222222, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 0, 6);
            startRestartGroup.startReplaceableGroup(-1077269958);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 != companion.getEmpty()) {
            }
            final Animatable animatable222222 = (Animatable) rememberedValue4;
            startRestartGroup.endReplaceableGroup();
            m11271boximpl = UInt.m11271boximpl(i2);
            startRestartGroup.startReplaceableGroup(-1077264621);
            changed2 = (i16222222 != 536870912) | startRestartGroup.changed(mutableState4222222) | ((i11 & 234881024) != 67108864) | startRestartGroup.changedInstance(animatable222222) | ((i11 & 458752) != 131072);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed2) {
            }
            mutableState2 = mutableState;
            f5 = f3;
            modifier3 = modifier2;
            lifecycleOwner5 = lifecycleOwner4;
            i12 = i11;
            continuation = null;
            uInt = m11271boximpl;
            i13 = i2;
            a aVar222222 = new a(i13, i, animatable222222, onTimerFinish, mutableState4222222, null);
            startRestartGroup.updateRememberedValue(aVar222222);
            rememberedValue5 = aVar222222;
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, (i12 >> 27) & 14);
            Boolean valueOf222222 = Boolean.valueOf(b(mutableState3222222));
            startRestartGroup.startReplaceableGroup(-1077230899);
            changed3 = startRestartGroup.changed(mutableState3222222) | startRestartGroup.changedInstance(animatable222222);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue6 = new C0330b(animatable222222, mutableState3222222, continuation);
            startRestartGroup.updateRememberedValue(rememberedValue6);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(valueOf222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1077226486);
            changed4 = startRestartGroup.changed(mutableState3222222) | startRestartGroup.changedInstance(animatable222222) | startRestartGroup.changedInstance(lifecycleOwner5);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b.a(LifecycleOwner.this, animatable222222, mutableState3222222, (DisposableEffectScope) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue7);
            startRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(lifecycleOwner5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue7, startRestartGroup, (i12 >> 21) & 14);
            Alignment.Companion companion2222222 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically222222 = companion2222222.getCenterVertically();
            Arrangement.HorizontalOrVertical m494spacedBy0680j_4222222 = Arrangement.INSTANCE.m494spacedBy0680j_4(Dp.m4440constructorimpl(8));
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy222222 = RowKt.rowMeasurePolicy(m494spacedBy0680j_4222222, centerVertically222222, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap322222 = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3222222 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor322222 = companion3222222.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf322222 = LayoutKt.modifierMaterializerOf(modifier3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy222222, companion3222222.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap322222, companion3222222.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322222 = companion3222222.getSetCompositeKeyHash();
            if (!m1642constructorimpl.getInserting()) {
            }
            m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322222);
            modifierMaterializerOf322222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance222222 = RowScopeInstance.INSTANCE;
            String a2222222 = com.moloco.sdk.internal.utils.b.a(customTimerString, i13);
            long d2222222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
            int m4337getStarte0LSkKk222222 = TextAlign.INSTANCE.m4337getStarte0LSkKk();
            Modifier.Companion companion4222222 = Modifier.INSTANCE;
            startRestartGroup.startReplaceableGroup(-447505287);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            TextKt.m1591TextfLXpl1I(a2222222, SemanticsModifierKt.semantics$default(companion4222222, false, (Function1) rememberedValue8, 1, null), j2, d2222222, null, null, null, 0L, null, TextAlign.m4325boximpl(m4337getStarte0LSkKk222222), 0L, 0, false, 2, null, null, startRestartGroup, ((i12 << 3) & 896) | 3072, 3072, 56816);
            composer2 = startRestartGroup;
            Alignment center222222 = companion2222222.getCenter();
            Modifier m585padding3ABfNKs222222 = PaddingKt.m585padding3ABfNKs(SizeKt.m634size3ABfNKs(companion4222222, f9222222), Dp.m4440constructorimpl(2));
            composer2.startReplaceableGroup(-447492116);
            rememberedValue9 = composer2.rememberedValue();
            if (rememberedValue9 == companion.getEmpty()) {
            }
            composer2.endReplaceableGroup();
            Modifier m232backgroundbw27NRU222222 = BackgroundKt.m232backgroundbw27NRU(OnRemeasuredModifierKt.onSizeChanged(m585padding3ABfNKs222222, (Function1) rememberedValue9), Color.m2111copywmQWz5c$default(Color.INSTANCE.m2149getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
            composer2.startReplaceableGroup(-447486932);
            rememberedValue10 = composer2.rememberedValue();
            if (rememberedValue10 == companion.getEmpty()) {
            }
            composer2.endReplaceableGroup();
            Modifier semantics$default222222 = SemanticsModifierKt.semantics$default(m232backgroundbw27NRU222222, false, (Function1) rememberedValue10, 1, null);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy222222 = BoxKt.rememberBoxMeasurePolicy(center222222, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2222222 = composer2.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2222222 = companion3222222.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2222222 = LayoutKt.modifierMaterializerOf(semantics$default222222);
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
            }
            m1642constructorimpl2 = Updater.m1642constructorimpl(composer2);
            Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy222222, companion3222222.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl2, currentCompositionLocalMap2222222, companion3222222.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = companion3222222.getSetCompositeKeyHash();
            if (!m1642constructorimpl2.getInserting()) {
            }
            m1642constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m1642constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222);
            modifierMaterializerOf2222222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
            Modifier fillMaxSize$default222222 = SizeKt.fillMaxSize$default(companion4222222, 0.0f, 1, null);
            composer2.startReplaceableGroup(-1178257690);
            changedInstance = ((i12 & 14) != 4) | ((i12 & 7168) != 2048) | composer2.changedInstance(animatable222222) | ((i12 & 112) == 32);
            rememberedValue11 = composer2.rememberedValue();
            if (changedInstance) {
            }
            f6 = f5;
            final MutableState mutableState5222222 = mutableState2;
            Function1 function1222222 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b.a(j, f6, animatable222222, j2, mutableState5222222, (DrawScope) obj);
                }
            };
            composer2.updateRememberedValue(function1222222);
            rememberedValue11 = function1222222;
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(fillMaxSize$default222222, (Function1) rememberedValue11, composer2, 6);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            f7 = f9222222;
            lifecycleOwner6 = lifecycleOwner5;
            f8 = f6;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        f3 = f;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        f4 = f2;
        if ((i4 & 32) != 0) {
        }
        if ((i4 & 64) != 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if ((i4 & 256) == 0) {
        }
        i5 |= i14;
        if ((i4 & 512) != 0) {
        }
        i5 |= i9;
        if ((i5 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i3 & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        i10 = i5;
        lifecycleOwner3 = lifecycleOwner2;
        float f92222222 = f4;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-1077278555);
        rememberedValue = startRestartGroup.rememberedValue();
        companion = Composer.INSTANCE;
        if (rememberedValue == companion.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-1077276327);
        changed = startRestartGroup.changed(lifecycleOwner3);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        lifecycleOwner4 = lifecycleOwner3;
        MutableState mutableStateOf$default2222222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        startRestartGroup.updateRememberedValue(mutableStateOf$default2222222);
        rememberedValue2 = mutableStateOf$default2222222;
        final MutableState mutableState32222222 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        Object[] objArr2222222 = new Object[0];
        startRestartGroup.startReplaceableGroup(-1077272712);
        int i162222222 = 1879048192 & i10;
        if (i162222222 != 536870912) {
        }
        i11 = i10;
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.a(i2);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState42222222 = (MutableState) RememberSaveableKt.m1729rememberSaveable(objArr2222222, (Saver) null, (String) null, (Function0) rememberedValue3, startRestartGroup, 0, 6);
        startRestartGroup.startReplaceableGroup(-1077269958);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 != companion.getEmpty()) {
        }
        final Animatable animatable2222222 = (Animatable) rememberedValue4;
        startRestartGroup.endReplaceableGroup();
        m11271boximpl = UInt.m11271boximpl(i2);
        startRestartGroup.startReplaceableGroup(-1077264621);
        changed2 = (i162222222 != 536870912) | startRestartGroup.changed(mutableState42222222) | ((i11 & 234881024) != 67108864) | startRestartGroup.changedInstance(animatable2222222) | ((i11 & 458752) != 131072);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (changed2) {
        }
        mutableState2 = mutableState;
        f5 = f3;
        modifier3 = modifier2;
        lifecycleOwner5 = lifecycleOwner4;
        i12 = i11;
        continuation = null;
        uInt = m11271boximpl;
        i13 = i2;
        a aVar2222222 = new a(i13, i, animatable2222222, onTimerFinish, mutableState42222222, null);
        startRestartGroup.updateRememberedValue(aVar2222222);
        rememberedValue5 = aVar2222222;
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(uInt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, (i12 >> 27) & 14);
        Boolean valueOf2222222 = Boolean.valueOf(b(mutableState32222222));
        startRestartGroup.startReplaceableGroup(-1077230899);
        changed3 = startRestartGroup.changed(mutableState32222222) | startRestartGroup.changedInstance(animatable2222222);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue6 = new C0330b(animatable2222222, mutableState32222222, continuation);
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(valueOf2222222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1077226486);
        changed4 = startRestartGroup.changed(mutableState32222222) | startRestartGroup.changedInstance(animatable2222222) | startRestartGroup.changedInstance(lifecycleOwner5);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue7 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.a(LifecycleOwner.this, animatable2222222, mutableState32222222, (DisposableEffectScope) obj);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue7);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.DisposableEffect(lifecycleOwner5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue7, startRestartGroup, (i12 >> 21) & 14);
        Alignment.Companion companion22222222 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically2222222 = companion22222222.getCenterVertically();
        Arrangement.HorizontalOrVertical m494spacedBy0680j_42222222 = Arrangement.INSTANCE.m494spacedBy0680j_4(Dp.m4440constructorimpl(8));
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy2222222 = RowKt.rowMeasurePolicy(m494spacedBy0680j_42222222, centerVertically2222222, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3222222 = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion32222222 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor3222222 = companion32222222.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf3222222 = LayoutKt.modifierMaterializerOf(modifier3);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
        Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy2222222, companion32222222.getSetMeasurePolicy());
        Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap3222222, companion32222222.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222222 = companion32222222.getSetCompositeKeyHash();
        if (!m1642constructorimpl.getInserting()) {
        }
        m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3222222);
        modifierMaterializerOf3222222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance2222222 = RowScopeInstance.INSTANCE;
        String a22222222 = com.moloco.sdk.internal.utils.b.a(customTimerString, i13);
        long d22222222 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
        int m4337getStarte0LSkKk2222222 = TextAlign.INSTANCE.m4337getStarte0LSkKk();
        Modifier.Companion companion42222222 = Modifier.INSTANCE;
        startRestartGroup.startReplaceableGroup(-447505287);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (rememberedValue8 == companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        TextKt.m1591TextfLXpl1I(a22222222, SemanticsModifierKt.semantics$default(companion42222222, false, (Function1) rememberedValue8, 1, null), j2, d22222222, null, null, null, 0L, null, TextAlign.m4325boximpl(m4337getStarte0LSkKk2222222), 0L, 0, false, 2, null, null, startRestartGroup, ((i12 << 3) & 896) | 3072, 3072, 56816);
        composer2 = startRestartGroup;
        Alignment center2222222 = companion22222222.getCenter();
        Modifier m585padding3ABfNKs2222222 = PaddingKt.m585padding3ABfNKs(SizeKt.m634size3ABfNKs(companion42222222, f92222222), Dp.m4440constructorimpl(2));
        composer2.startReplaceableGroup(-447492116);
        rememberedValue9 = composer2.rememberedValue();
        if (rememberedValue9 == companion.getEmpty()) {
        }
        composer2.endReplaceableGroup();
        Modifier m232backgroundbw27NRU2222222 = BackgroundKt.m232backgroundbw27NRU(OnRemeasuredModifierKt.onSizeChanged(m585padding3ABfNKs2222222, (Function1) rememberedValue9), Color.m2111copywmQWz5c$default(Color.INSTANCE.m2149getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape());
        composer2.startReplaceableGroup(-447486932);
        rememberedValue10 = composer2.rememberedValue();
        if (rememberedValue10 == companion.getEmpty()) {
        }
        composer2.endReplaceableGroup();
        Modifier semantics$default2222222 = SemanticsModifierKt.semantics$default(m232backgroundbw27NRU2222222, false, (Function1) rememberedValue10, 1, null);
        composer2.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2222222 = BoxKt.rememberBoxMeasurePolicy(center2222222, false, composer2, 6);
        composer2.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap22222222 = composer2.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor22222222 = companion32222222.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22222222 = LayoutKt.modifierMaterializerOf(semantics$default2222222);
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        m1642constructorimpl2 = Updater.m1642constructorimpl(composer2);
        Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy2222222, companion32222222.getSetMeasurePolicy());
        Updater.m1649setimpl(m1642constructorimpl2, currentCompositionLocalMap22222222, companion32222222.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222222 = companion32222222.getSetCompositeKeyHash();
        if (!m1642constructorimpl2.getInserting()) {
        }
        m1642constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m1642constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222222);
        modifierMaterializerOf22222222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance2222222 = BoxScopeInstance.INSTANCE;
        Modifier fillMaxSize$default2222222 = SizeKt.fillMaxSize$default(companion42222222, 0.0f, 1, null);
        composer2.startReplaceableGroup(-1178257690);
        changedInstance = ((i12 & 14) != 4) | ((i12 & 7168) != 2048) | composer2.changedInstance(animatable2222222) | ((i12 & 112) == 32);
        rememberedValue11 = composer2.rememberedValue();
        if (changedInstance) {
        }
        f6 = f5;
        final MutableState mutableState52222222 = mutableState2;
        Function1 function12222222 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.a(j, f6, animatable2222222, j2, mutableState52222222, (DrawScope) obj);
            }
        };
        composer2.updateRememberedValue(function12222222);
        rememberedValue11 = function12222222;
        composer2.endReplaceableGroup();
        CanvasKt.Canvas(fillMaxSize$default2222222, (Function1) rememberedValue11, composer2, 6);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        f7 = f92222222;
        lifecycleOwner6 = lifecycleOwner5;
        f8 = f6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final Unit b(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setTestTag(semantics, str);
        return Unit.INSTANCE;
    }

    public static final boolean b(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void a(MutableState<IntSize> mutableState, long j) {
        mutableState.setValue(IntSize.m4602boximpl(j));
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
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b$$ExternalSyntheticLambda7
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                b.a(Animatable.this, mutableState, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new c(lifecycleOwner, lifecycleEventObserver);
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

    public static final Unit a(MutableState mutableState, IntSize intSize) {
        a((MutableState<IntSize>) mutableState, intSize.getPackedValue());
        return Unit.INSTANCE;
    }

    public static final Unit a(long j, float f, Animatable animatable, long j2, MutableState mutableState, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long Size = androidx.compose.ui.geometry.SizeKt.Size(IntSize.m4610getWidthimpl(a((MutableState<IntSize>) mutableState)), IntSize.m4609getHeightimpl(a((MutableState<IntSize>) mutableState)));
        float f2 = Canvas.mo336toPx0680j_4(f);
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        DrawScope.m2642drawArcyD3GUKo$default(Canvas, j, 360.0f, 360.0f, false, 0L, Size, 0.0f, new Stroke(f2, 0.0f, companion.m2466getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        if (((Number) animatable.getValue()).floatValue() > 0.0f) {
            DrawScope.m2642drawArcyD3GUKo$default(Canvas, j2, 270.0f, RangesKt.coerceAtLeast(((Number) animatable.getValue()).floatValue(), 0.0f) * (-360.0f), false, 0L, androidx.compose.ui.geometry.SizeKt.Size(IntSize.m4610getWidthimpl(a((MutableState<IntSize>) mutableState)), IntSize.m4609getHeightimpl(a((MutableState<IntSize>) mutableState))), 0.0f, new Stroke(Canvas.mo336toPx0680j_4(f), 0.0f, companion.m2466getRoundKaPHkGw(), 0, null, 26, null), null, 0, 848, null);
        }
        return Unit.INSTANCE;
    }

    public static final long a(MutableState<IntSize> mutableState) {
        return mutableState.getValue().getPackedValue();
    }
}

package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.audio.WavUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {
    public static final c a = new c();
    public static Function5<BoxScope, Boolean, Function0<Unit>, Composer, Integer, Unit> b = ComposableLambdaKt.composableLambdaInstance(-1970835476, false, a.a);

    public static final class a implements Function5<BoxScope, Boolean, Function0<? extends Unit>, Composer, Integer, Unit> {
        public static final a a = new a();

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c$a$a, reason: collision with other inner class name */
        public static final class C0358a implements Function3<Boolean, Composer, Integer, Unit> {
            public final /* synthetic */ Function0<Unit> a;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c$a$a$a, reason: collision with other inner class name */
            public static final class C0359a implements Function3<RowScope, Composer, Integer, Unit> {
                public final /* synthetic */ boolean a;

                public C0359a(boolean z) {
                    this.a = z;
                }

                public final void a(RowScope TextButton, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1487526992, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous>.<anonymous>.<anonymous> (PlaybackControl.kt:55)");
                    }
                    TextKt.m1591TextfLXpl1I(this.a ? "Pause" : "Play", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
                    a(rowScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }
            }

            public C0358a(Function0<Unit> function0) {
                this.a = function0;
            }

            public final void a(boolean z, Composer composer, int i) {
                int i2;
                if ((i & 6) == 0) {
                    i2 = i | (composer.changed(z) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i2 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-397036979, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous>.<anonymous> (PlaybackControl.kt:54)");
                }
                ButtonKt.TextButton(this.a, null, false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, -1487526992, true, new C0359a(z)), composer, C.ENCODING_PCM_32BIT, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer, Integer num) {
                a(bool.booleanValue(), composer, num.intValue());
                return Unit.INSTANCE;
            }
        }

        public final void a(BoxScope boxScope, boolean z, Function0<Unit> onClick, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            if ((i & 6) == 0) {
                i2 = (composer.changed(boxScope) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(z) ? 32 : 16;
            }
            if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
                i2 |= composer.changedInstance(onClick) ? 256 : 128;
            }
            if ((i2 & 1171) == 1170 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1970835476, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.ComposableSingletons$PlaybackControlKt.lambda-1.<anonymous> (PlaybackControl.kt:48)");
            }
            CrossfadeKt.Crossfade(Boolean.valueOf(z), PaddingKt.m585padding3ABfNKs(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), Dp.m4440constructorimpl(4)), (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambdaKt.composableLambda(composer, -397036979, true, new C0358a(onClick)), composer, ((i2 >> 3) & 14) | 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Boolean bool, Function0<? extends Unit> function0, Composer composer, Integer num) {
            a(boxScope, bool.booleanValue(), function0, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public final Function5<BoxScope, Boolean, Function0<Unit>, Composer, Integer, Unit> a() {
        return b;
    }
}

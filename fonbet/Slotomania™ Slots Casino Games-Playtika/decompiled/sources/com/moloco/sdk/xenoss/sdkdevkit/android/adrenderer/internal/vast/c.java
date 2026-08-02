package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.google.android.exoplayer2.RendererCapabilities;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* loaded from: classes4.dex */
public final class c {

    public static final class a implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Unit a;

        public a(Unit unit) {
            this.a = unit;
        }

        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1040652088, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastView.<anonymous>.<anonymous> (VastActivity.kt:323)");
            }
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

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function0<Unit> {
        public b(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a.class, "goNextAdPartOrDismissAd", "goNextAdPartOrDismissAd()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a) this.receiver).x();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public static final Unit a(Activity activity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, Function2 function2, y yVar, int i, int i2, Composer composer, int i3) {
        a(activity, aVar, function2, yVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        if ((r34 & 2) != 0) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final Activity activity, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, Function2<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends View> function2, final y yVar, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends View> function22;
        final Function2<? super Context, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, ? extends View> function23;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(1851234025);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(activity) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(aVar) : startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            if ((i2 & 2) == 0) {
                function22 = function2;
                if (startRestartGroup.changedInstance(function22)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                function22 = function2;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            function22 = function2;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? startRestartGroup.changed(yVar) : startRestartGroup.changedInstance(yVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            function23 = function22;
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    function22 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n.a(0L, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i) null, (Function2) null, (Function2) null, (Function2) null, (Q) null, false, 4095, (Object) null);
                    i3 &= -897;
                }
                int i5 = i3;
                function23 = function22;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1851234025, i5, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastView (VastActivity.kt:319)");
                }
                startRestartGroup.startReplaceableGroup(1546066198);
                startRestartGroup.startReplaceableGroup(1546064924);
                int i6 = i5 & 112;
                boolean z = ((((i5 & 896) ^ RendererCapabilities.MODE_SUPPORT_MASK) > 256 && startRestartGroup.changed(function23)) || (i5 & RendererCapabilities.MODE_SUPPORT_MASK) == 256) | (i6 == 32 || ((i5 & 64) != 0 && startRestartGroup.changedInstance(aVar)));
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return c.a(Function2.this, aVar, (Context) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) rememberedValue, null, null, startRestartGroup, 0, 6);
                Unit unit = Unit.INSTANCE;
                startRestartGroup.startReplaceableGroup(1546066963);
                if (yVar != null) {
                    yVar.a(ComposableLambdaKt.composableLambda(startRestartGroup, 1040652088, true, new a(unit)), startRestartGroup, ((i5 >> 6) & 112) | 6);
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(1546068887);
                boolean z2 = i6 == 32 || ((i5 & 64) != 0 && startRestartGroup.changedInstance(aVar));
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new b(aVar);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                BackHandlerKt.BackHandler(false, (Function0) ((KFunction) rememberedValue2), startRestartGroup, 0, 1);
                u.a(activity, startRestartGroup, i5 & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.c$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return c.a(activity, aVar, function23, yVar, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final View a(Function2 function2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return (View) function2.invoke(ctx, aVar);
    }
}

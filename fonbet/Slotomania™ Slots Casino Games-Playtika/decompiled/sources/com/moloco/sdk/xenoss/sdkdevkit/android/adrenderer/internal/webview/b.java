package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.ironsource.X2;
import com.moloco.sdk.R;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class b {
    public static final String a = "AdWebViewRenderer";
    public static final float b = Dp.m4440constructorimpl(12);

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$b, reason: collision with other inner class name */
    public static final class C0377b implements Function2<Composer, Integer, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {
        public static final C0377b a = new C0377b();

        public final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(-349315014);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-349315014, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.defaultAdWebViewRenderer.<anonymous> (AdWebViewRenderer.kt:155)");
            }
            Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a2 = s.a(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class c implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ WebView a;
        public final /* synthetic */ MutableStateFlow<Boolean> b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Function1<a.AbstractC0383a.c, Unit> d;
        public final /* synthetic */ Function0<Unit> e;
        public final /* synthetic */ Function0<Unit> f;
        public final /* synthetic */ long g;
        public final /* synthetic */ Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> h;
        public final /* synthetic */ y i;
        public final /* synthetic */ Dp j;
        public final /* synthetic */ boolean k;

        public static final class a implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ WebView a;
            public final /* synthetic */ MutableStateFlow<Boolean> b;
            public final /* synthetic */ int c;
            public final /* synthetic */ Function1<a.AbstractC0383a.c, Unit> d;
            public final /* synthetic */ Function0<Unit> e;
            public final /* synthetic */ Function0<Unit> f;
            public final /* synthetic */ long g;
            public final /* synthetic */ Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> h;
            public final /* synthetic */ y i;
            public final /* synthetic */ Dp j;
            public final /* synthetic */ boolean k;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.AdWebViewRendererKt$defaultAdWebViewRenderer$2$1$1$1$1$1", f = "AdWebViewRenderer.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$c$a$a, reason: collision with other inner class name */
            public static final class C0378a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ MutableState<Boolean> b;
                public final /* synthetic */ MutableStateFlow<Boolean> c;

                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$c$a$a$a, reason: collision with other inner class name */
                public static final class C0379a<T> implements FlowCollector {
                    public final /* synthetic */ MutableStateFlow<Boolean> a;

                    public C0379a(MutableStateFlow<Boolean> mutableStateFlow) {
                        this.a = mutableStateFlow;
                    }

                    public final Object a(boolean z, Continuation<? super Unit> continuation) {
                        this.a.setValue(Boxing.boxBoolean(z));
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                        return a(((Boolean) obj).booleanValue(), continuation);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0378a(MutableState<Boolean> mutableState, MutableStateFlow<Boolean> mutableStateFlow, Continuation<? super C0378a> continuation) {
                    super(2, continuation);
                    this.b = mutableState;
                    this.c = mutableStateFlow;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0378a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0378a(this.b, this.c, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        final MutableState<Boolean> mutableState = this.b;
                        Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$c$a$a$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(b.c.a.C0378a.a(MutableState.this));
                            }
                        });
                        C0379a c0379a = new C0379a(this.c);
                        this.a = 1;
                        if (snapshotFlow.collect(c0379a, this) == coroutine_suspended) {
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

                public static final boolean a(MutableState mutableState) {
                    return ((Boolean) mutableState.getValue()).booleanValue();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(WebView webView, MutableStateFlow<Boolean> mutableStateFlow, int i, Function1<? super a.AbstractC0383a.c, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, long j, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function2, y yVar, Dp dp, boolean z) {
                this.a = webView;
                this.b = mutableStateFlow;
                this.c = i;
                this.d = function1;
                this.e = function0;
                this.f = function02;
                this.g = j;
                this.h = function2;
                this.i = yVar;
                this.j = dp;
                this.k = z;
            }

            public final void a(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-101529568, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.defaultAdWebViewRenderer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdWebViewRenderer.kt:162)");
                }
                composer.startReplaceableGroup(1335699884);
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = a.h.a.k();
                    composer.updateRememberedValue(rememberedValue);
                }
                Q q = (Q) rememberedValue;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(1335704710);
                boolean changed = composer.changed(this.a);
                WebView webView = this.a;
                Object rememberedValue2 = composer.rememberedValue();
                if (changed || rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = q.a(webView);
                    composer.updateRememberedValue(rememberedValue2);
                }
                Flow flow = (Flow) rememberedValue2;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(1335709359);
                MutableStateFlow<Boolean> mutableStateFlow = this.b;
                Object rememberedValue3 = composer.rememberedValue();
                if (rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(mutableStateFlow.getValue(), null, 2, null);
                    composer.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState = (MutableState) rememberedValue3;
                composer.endReplaceableGroup();
                Unit unit = Unit.INSTANCE;
                composer.startReplaceableGroup(1335713196);
                boolean changedInstance = composer.changedInstance(this.b);
                MutableStateFlow<Boolean> mutableStateFlow2 = this.b;
                Object rememberedValue4 = composer.rememberedValue();
                if (changedInstance || rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new C0378a(mutableState, mutableStateFlow2, null);
                    composer.updateRememberedValue(rememberedValue4);
                }
                composer.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, composer, 6);
                b.a(this.a, this.c, mutableState, this.d, this.e, this.f, null, this.g, this.h.invoke(composer, 0), this.i, this.j.m4454unboximpl(), this.k, flow, composer, RendererCapabilities.MODE_SUPPORT_MASK, 0, 64);
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

        /* JADX WARN: Multi-variable type inference failed */
        public c(WebView webView, MutableStateFlow<Boolean> mutableStateFlow, int i, Function1<? super a.AbstractC0383a.c, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, long j, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function2, y yVar, Dp dp, boolean z) {
            this.a = webView;
            this.b = mutableStateFlow;
            this.c = i;
            this.d = function1;
            this.e = function0;
            this.f = function02;
            this.g = j;
            this.h = function2;
            this.i = yVar;
            this.j = dp;
            this.k = z;
        }

        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(553564605, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.defaultAdWebViewRenderer.<anonymous>.<anonymous>.<anonymous> (AdWebViewRenderer.kt:161)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.c.a(false, ComposableLambdaKt.composableLambda(composer, -101529568, true, new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k)), composer, 48, 1);
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

    public static final Unit a(WebView webView, int i, MutableState mutableState, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, long j, Function11 function11, y yVar, float f, boolean z, Flow flow, int i2, int i3, int i4, Composer composer, int i5) {
        a(webView, i, mutableState, function1, function0, function02, modifier, j, function11, yVar, f, z, flow, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    public static final void c(MutableStateFlow<Boolean> mutableStateFlow, Function0<Unit> function0) {
        if (mutableStateFlow.getValue().booleanValue()) {
            function0.invoke();
        }
    }

    public static final Unit d(MutableStateFlow mutableStateFlow, Function0 function0) {
        c(mutableStateFlow, function0);
        return Unit.INSTANCE;
    }

    public static final Unit e(MutableStateFlow mutableStateFlow, Function0 function0) {
        c(mutableStateFlow, function0);
        return Unit.INSTANCE;
    }

    public static final Unit a(Activity activity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, WebView webView, int i, Function1 function1, Function0 function0, Function10 function10, y yVar, Function11 function11, Function11 function112, Function0 function02, int i2, int i3, Composer composer, int i4) {
        a(activity, iVar, webView, i, function1, function0, function10, yVar, function11, function112, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    public static final Unit b(MutableStateFlow mutableStateFlow, Function0 function0) {
        a((MutableStateFlow<Boolean>) mutableStateFlow, (Function0<Unit>) function0);
        return Unit.INSTANCE;
    }

    public static final Unit a(Activity activity, WebView webView, int i, Function1 function1, Function0 function0, Function10 function10, y yVar, Function0 function02, int i2, Composer composer, int i3) {
        a(activity, webView, i, function1, function0, function10, yVar, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final float a() {
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x031a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final WebView webView, final int i, final MutableState<Boolean> mutableState, Function1<? super a.AbstractC0383a.c, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, long j, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function11, final y yVar, float f, final boolean z, Flow<Boolean> flow, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        Modifier modifier2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Modifier modifier3;
        int i13;
        Composer composer2;
        Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function112;
        Flow<Boolean> flow2;
        long j2;
        Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function113;
        int i14;
        int currentCompositeKeyHash;
        Composer m1642constructorimpl;
        boolean z2;
        int i15;
        BoxScopeInstance boxScopeInstance;
        final Function1<? super a.AbstractC0383a.c, Unit> function12;
        Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function114;
        float f2;
        Composer composer3;
        final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function115;
        final long j3;
        final Modifier modifier4;
        final Flow<Boolean> flow3;
        ScopeUpdateScope endRestartGroup;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(-1361070397);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changedInstance(webView) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i17 = i5;
        if ((i4 & 2) != 0) {
            i6 = i17 | 48;
        } else if ((i2 & 48) == 0) {
            i6 = i17 | (startRestartGroup.changed(i) ? 32 : 16);
        } else {
            i6 = i17;
        }
        if ((i4 & 4) != 0) {
            i6 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i6 |= startRestartGroup.changed(mutableState) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i6 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i6 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i6 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i6 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
            if ((i4 & 32) == 0) {
                i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i6 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
            }
            i7 = i4 & 64;
            if (i7 == 0) {
                i6 |= 1572864;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i2 & 1572864) == 0) {
                    i6 |= startRestartGroup.changed(modifier2) ? 1048576 : 524288;
                }
            }
            i8 = i4 & 128;
            if (i8 == 0) {
                i6 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i6 |= startRestartGroup.changed(j) ? 8388608 : 4194304;
            }
            if ((i2 & 100663296) == 0) {
                if ((i4 & 256) == 0 && startRestartGroup.changedInstance(function11)) {
                    i16 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    i6 |= i16;
                }
                i16 = 33554432;
                i6 |= i16;
            }
            if ((i4 & 512) == 0) {
                i6 |= C.ENCODING_PCM_32BIT;
            } else if ((i2 & C.ENCODING_PCM_32BIT) == 0) {
                i6 |= (1073741824 & i2) == 0 ? startRestartGroup.changed(yVar) : startRestartGroup.changedInstance(yVar) ? 536870912 : 268435456;
            }
            int i18 = i6;
            if ((i4 & 1024) == 0) {
                i9 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                i9 = i3 | (startRestartGroup.changed(f) ? 4 : 2);
            } else {
                i9 = i3;
            }
            i10 = i18;
            if ((i4 & 2048) == 0) {
                i9 |= 48;
            } else if ((i3 & 48) == 0) {
                i9 |= startRestartGroup.changed(z) ? 32 : 16;
                i11 = i4 & 4096;
                if (i11 != 0) {
                    i9 |= RendererCapabilities.MODE_SUPPORT_MASK;
                    i12 = i11;
                } else {
                    i12 = i11;
                    if ((i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
                        i9 |= startRestartGroup.changedInstance(flow) ? 256 : 128;
                        if ((i10 & 306783379) != 306783378 && (i9 & 147) == 146 && startRestartGroup.getSkipping()) {
                            startRestartGroup.skipToGroupEnd();
                            function12 = function1;
                            function115 = function11;
                            f2 = f;
                            modifier4 = modifier2;
                            composer3 = startRestartGroup;
                            j3 = j;
                            flow3 = flow;
                        } else {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i4 & 256) != 0) {
                                    j2 = j;
                                    function113 = function11;
                                    flow2 = flow;
                                    i13 = i9;
                                    composer2 = startRestartGroup;
                                    i14 = i10 & (-234881025);
                                    modifier3 = modifier2;
                                    composer2.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1361070397, i14, i13, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.AdWebViewRenderDisplay (AdWebViewRenderer.kt:81)");
                                    }
                                    Modifier m233backgroundbw27NRU$default = BackgroundKt.m233backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), j2, null, 2, null);
                                    composer2.startReplaceableGroup(733328855);
                                    Alignment.Companion companion = Alignment.INSTANCE;
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composer2, 0);
                                    Modifier modifier5 = modifier3;
                                    composer2.startReplaceableGroup(-1323940314);
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m233backgroundbw27NRU$default);
                                    int i19 = i13;
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (!m1642constructorimpl.getInserting() || !Intrinsics.areEqual(m1642constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    modifierMaterializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    Composer composer4 = composer2;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.a(webView, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), yVar, composer4, (i14 & 14) | 48 | ((i14 >> 21) & 896), 0);
                                    composer4.startReplaceableGroup(-1422940341);
                                    if (function113 == null) {
                                        boxScopeInstance = boxScopeInstance2;
                                        i15 = i14;
                                        function12 = function1;
                                        function114 = function113;
                                    } else {
                                        composer4.startReplaceableGroup(1485619765);
                                        boolean z3 = (i14 & 112) == 32;
                                        Object rememberedValue = composer4.rememberedValue();
                                        if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            z2 = false;
                                            rememberedValue = new m(UInt.m11271boximpl(UInt.m11277constructorimpl(RangesKt.coerceAtLeast(i, 0))));
                                            composer4.updateRememberedValue(rememberedValue);
                                        } else {
                                            z2 = false;
                                        }
                                        m mVar = (m) rememberedValue;
                                        composer4.endReplaceableGroup();
                                        boolean booleanValue = mutableState.getValue().booleanValue();
                                        composer4.startReplaceableGroup(1485632684);
                                        boolean z4 = (i14 & 896) == 256 ? true : z2;
                                        if ((458752 & i14) == 131072) {
                                            z2 = true;
                                        }
                                        boolean z5 = z2 | z4;
                                        Object rememberedValue2 = composer4.rememberedValue();
                                        if (z5 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda7
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return b.a(MutableState.this, function02);
                                                }
                                            };
                                            composer4.updateRememberedValue(rememberedValue2);
                                        }
                                        composer4.endReplaceableGroup();
                                        int i20 = i19 << 21;
                                        i15 = i14;
                                        v.a(boxScopeInstance2, mVar, true, booleanValue, (Function0) rememberedValue2, function0, function1, function113, z, flow2, composer4, ((i14 << 3) & 458752) | 390 | ((i14 << 9) & 3670016) | (234881024 & i20) | (i20 & 1879048192), 0);
                                        boxScopeInstance = boxScopeInstance2;
                                        function12 = function1;
                                        composer4 = composer4;
                                        function114 = function113;
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer4.endReplaceableGroup();
                                    f2 = f;
                                    Composer composer5 = composer4;
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.c(PaddingKt.m585padding3ABfNKs(boxScopeInstance.align(companion3, companion.getBottomStart()), f2), null, null, null, composer5, 0, 14).invoke(boxScopeInstance, function12, composer5, Integer.valueOf(((i15 >> 6) & 112) | 6));
                                    composer5.endReplaceableGroup();
                                    composer5.endNode();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer3 = composer5;
                                    function115 = function114;
                                    j3 = j2;
                                    modifier4 = modifier5;
                                    flow3 = flow2;
                                } else {
                                    j2 = j;
                                    function113 = function11;
                                    flow2 = flow;
                                    modifier3 = modifier2;
                                    i13 = i9;
                                    composer2 = startRestartGroup;
                                }
                            } else {
                                modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                long m2138getBlack0d7_KjU = i8 == 0 ? Color.INSTANCE.m2138getBlack0d7_KjU() : j;
                                if ((i4 & 256) == 0) {
                                    i13 = i9;
                                    function112 = s.a(null, null, 0L, 0L, 0L, null, null, null, startRestartGroup, 0, 255);
                                    composer2 = startRestartGroup;
                                    i10 &= -234881025;
                                } else {
                                    i13 = i9;
                                    composer2 = startRestartGroup;
                                    function112 = function11;
                                }
                                flow2 = i12 == 0 ? null : flow;
                                j2 = m2138getBlack0d7_KjU;
                                function113 = function112;
                            }
                            i14 = i10;
                            composer2.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier m233backgroundbw27NRU$default2 = BackgroundKt.m233backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), j2, null, 2, null);
                            composer2.startReplaceableGroup(733328855);
                            Alignment.Companion companion4 = Alignment.INSTANCE;
                            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                            Modifier modifier52 = modifier3;
                            composer2.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m233backgroundbw27NRU$default2);
                            int i192 = i13;
                            if (!(composer2.getApplier() instanceof Applier)) {
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                            }
                            m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                            if (!m1642constructorimpl.getInserting()) {
                            }
                            m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                            modifierMaterializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                            Modifier.Companion companion32 = Modifier.INSTANCE;
                            Composer composer42 = composer2;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.a(webView, SizeKt.fillMaxSize$default(companion32, 0.0f, 1, null), yVar, composer42, (i14 & 14) | 48 | ((i14 >> 21) & 896), 0);
                            composer42.startReplaceableGroup(-1422940341);
                            if (function113 == null) {
                            }
                            composer42.endReplaceableGroup();
                            f2 = f;
                            Composer composer52 = composer42;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.c(PaddingKt.m585padding3ABfNKs(boxScopeInstance.align(companion32, companion4.getBottomStart()), f2), null, null, null, composer52, 0, 14).invoke(boxScopeInstance, function12, composer52, Integer.valueOf(((i15 >> 6) & 112) | 6));
                            composer52.endReplaceableGroup();
                            composer52.endNode();
                            composer52.endReplaceableGroup();
                            composer52.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer3 = composer52;
                            function115 = function114;
                            j3 = j2;
                            modifier4 = modifier52;
                            flow3 = flow2;
                        }
                        endRestartGroup = composer3.endRestartGroup();
                        if (endRestartGroup == null) {
                            final float f3 = f2;
                            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return b.a(webView, i, mutableState, function12, function0, function02, modifier4, j3, function115, yVar, f3, z, flow3, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
                if ((i10 & 306783379) != 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if ((i4 & 256) == 0) {
                }
                if (i12 == 0) {
                }
                j2 = m2138getBlack0d7_KjU;
                function113 = function112;
                i14 = i10;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier m233backgroundbw27NRU$default22 = BackgroundKt.m233backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), j2, null, 2, null);
                composer2.startReplaceableGroup(733328855);
                Alignment.Companion companion42 = Alignment.INSTANCE;
                MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(companion42.getTopStart(), false, composer2, 0);
                Modifier modifier522 = modifier3;
                composer2.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor22 = companion222.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(m233backgroundbw27NRU$default22);
                int i1922 = i13;
                if (!(composer2.getApplier() instanceof Applier)) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy22, companion222.getSetMeasurePolicy());
                Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap22, companion222.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = companion222.getSetCompositeKeyHash();
                if (!m1642constructorimpl.getInserting()) {
                }
                m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                modifierMaterializerOf22.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion322 = Modifier.INSTANCE;
                Composer composer422 = composer2;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.a(webView, SizeKt.fillMaxSize$default(companion322, 0.0f, 1, null), yVar, composer422, (i14 & 14) | 48 | ((i14 >> 21) & 896), 0);
                composer422.startReplaceableGroup(-1422940341);
                if (function113 == null) {
                }
                composer422.endReplaceableGroup();
                f2 = f;
                Composer composer522 = composer422;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.c(PaddingKt.m585padding3ABfNKs(boxScopeInstance.align(companion322, companion42.getBottomStart()), f2), null, null, null, composer522, 0, 14).invoke(boxScopeInstance, function12, composer522, Integer.valueOf(((i15 >> 6) & 112) | 6));
                composer522.endReplaceableGroup();
                composer522.endNode();
                composer522.endReplaceableGroup();
                composer522.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer3 = composer522;
                function115 = function114;
                j3 = j2;
                modifier4 = modifier522;
                flow3 = flow2;
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i11 = i4 & 4096;
            if (i11 != 0) {
            }
            if ((i10 & 306783379) != 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if ((i4 & 256) == 0) {
            }
            if (i12 == 0) {
            }
            j2 = m2138getBlack0d7_KjU;
            function113 = function112;
            i14 = i10;
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier m233backgroundbw27NRU$default222 = BackgroundKt.m233backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), j2, null, 2, null);
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion422 = Alignment.INSTANCE;
            MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(companion422.getTopStart(), false, composer2, 0);
            Modifier modifier5222 = modifier3;
            composer2.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap222 = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2222 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor222 = companion2222.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(m233backgroundbw27NRU$default222);
            int i19222 = i13;
            if (!(composer2.getApplier() instanceof Applier)) {
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
            }
            m1642constructorimpl = Updater.m1642constructorimpl(composer2);
            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy222, companion2222.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap222, companion2222.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = companion2222.getSetCompositeKeyHash();
            if (!m1642constructorimpl.getInserting()) {
            }
            m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
            modifierMaterializerOf222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3222 = Modifier.INSTANCE;
            Composer composer4222 = composer2;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.a(webView, SizeKt.fillMaxSize$default(companion3222, 0.0f, 1, null), yVar, composer4222, (i14 & 14) | 48 | ((i14 >> 21) & 896), 0);
            composer4222.startReplaceableGroup(-1422940341);
            if (function113 == null) {
            }
            composer4222.endReplaceableGroup();
            f2 = f;
            Composer composer5222 = composer4222;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.c(PaddingKt.m585padding3ABfNKs(boxScopeInstance.align(companion3222, companion422.getBottomStart()), f2), null, null, null, composer5222, 0, 14).invoke(boxScopeInstance, function12, composer5222, Integer.valueOf(((i15 >> 6) & 112) | 6));
            composer5222.endReplaceableGroup();
            composer5222.endNode();
            composer5222.endReplaceableGroup();
            composer5222.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            composer3 = composer5222;
            function115 = function114;
            j3 = j2;
            modifier4 = modifier5222;
            flow3 = flow2;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i4 & 32) == 0) {
        }
        i7 = i4 & 64;
        if (i7 == 0) {
        }
        i8 = i4 & 128;
        if (i8 == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i4 & 512) == 0) {
        }
        int i182 = i6;
        if ((i4 & 1024) == 0) {
        }
        i10 = i182;
        if ((i4 & 2048) == 0) {
        }
        i11 = i4 & 4096;
        if (i11 != 0) {
        }
        if ((i10 & 306783379) != 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if ((i4 & 256) == 0) {
        }
        if (i12 == 0) {
        }
        j2 = m2138getBlack0d7_KjU;
        function113 = function112;
        i14 = i10;
        composer2.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m233backgroundbw27NRU$default2222 = BackgroundKt.m233backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), j2, null, 2, null);
        composer2.startReplaceableGroup(733328855);
        Alignment.Companion companion4222 = Alignment.INSTANCE;
        MeasurePolicy rememberBoxMeasurePolicy2222 = BoxKt.rememberBoxMeasurePolicy(companion4222.getTopStart(), false, composer2, 0);
        Modifier modifier52222 = modifier3;
        composer2.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = composer2.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion22222 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor2222 = companion22222.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2222 = LayoutKt.modifierMaterializerOf(m233backgroundbw27NRU$default2222);
        int i192222 = i13;
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        m1642constructorimpl = Updater.m1642constructorimpl(composer2);
        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy2222, companion22222.getSetMeasurePolicy());
        Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap2222, companion22222.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = companion22222.getSetCompositeKeyHash();
        if (!m1642constructorimpl.getInserting()) {
        }
        m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        modifierMaterializerOf2222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
        Modifier.Companion companion32222 = Modifier.INSTANCE;
        Composer composer42222 = composer2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.a(webView, SizeKt.fillMaxSize$default(companion32222, 0.0f, 1, null), yVar, composer42222, (i14 & 14) | 48 | ((i14 >> 21) & 896), 0);
        composer42222.startReplaceableGroup(-1422940341);
        if (function113 == null) {
        }
        composer42222.endReplaceableGroup();
        f2 = f;
        Composer composer52222 = composer42222;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.c(PaddingKt.m585padding3ABfNKs(boxScopeInstance.align(companion32222, companion4222.getBottomStart()), f2), null, null, null, composer52222, 0, 14).invoke(boxScopeInstance, function12, composer52222, Integer.valueOf(((i15 >> 6) & 112) | 6));
        composer52222.endReplaceableGroup();
        composer52222.endNode();
        composer52222.endReplaceableGroup();
        composer52222.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        composer3 = composer52222;
        function115 = function114;
        j3 = j2;
        modifier4 = modifier52222;
        flow3 = flow2;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final class a implements Function3<i.a, Composer, Integer, Unit> {
        public final /* synthetic */ Function10<Context, WebView, Integer, MutableStateFlow<Boolean>, Function1<? super a.AbstractC0383a.c, Unit>, Function0<Unit>, Function0<Unit>, y, Dp, Boolean, View> a;
        public final /* synthetic */ WebView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ MutableStateFlow<Boolean> d;
        public final /* synthetic */ Function1<a.AbstractC0383a.c, Unit> e;
        public final /* synthetic */ Function0<Unit> f;
        public final /* synthetic */ Function0<Unit> g;
        public final /* synthetic */ y h;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function10<? super Context, ? super WebView, ? super Integer, ? super MutableStateFlow<Boolean>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Function0<Unit>, ? super Function0<Unit>, ? super y, ? super Dp, ? super Boolean, ? extends View> function10, WebView webView, int i, MutableStateFlow<Boolean> mutableStateFlow, Function1<? super a.AbstractC0383a.c, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, y yVar) {
            this.a = function10;
            this.b = webView;
            this.c = i;
            this.d = mutableStateFlow;
            this.e = function1;
            this.f = function0;
            this.g = function02;
            this.h = yVar;
        }

        public final void a(i.a aVar, Composer composer, int i) {
            int i2;
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(aVar) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1567067945, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.MraidAdContainerScreen.<anonymous>.<anonymous> (AdWebViewRenderer.kt:241)");
            }
            if (aVar instanceof i.a.C0352a) {
                composer.startReplaceableGroup(1827067735);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.c) {
                composer.startReplaceableGroup(1827130231);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.b) {
                composer.startReplaceableGroup(-1880720211);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f.a(((i.a.b) aVar).d(), null, null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, X2.b.f, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.d) {
                composer.startReplaceableGroup(-1880710707);
                composer.startReplaceableGroup(-1880709272);
                boolean changed = composer.changed(this.a) | composer.changedInstance(this.b) | composer.changed(this.c) | composer.changedInstance(this.d) | composer.changed(this.e) | composer.changed(this.f) | composer.changed(this.g) | composer.changedInstance(this.h);
                final Function10<Context, WebView, Integer, MutableStateFlow<Boolean>, Function1<? super a.AbstractC0383a.c, Unit>, Function0<Unit>, Function0<Unit>, y, Dp, Boolean, View> function10 = this.a;
                final WebView webView = this.b;
                final int i3 = this.c;
                final MutableStateFlow<Boolean> mutableStateFlow = this.d;
                final Function1<a.AbstractC0383a.c, Unit> function1 = this.e;
                final y yVar = this.h;
                final Function0<Unit> function0 = this.f;
                final Function0<Unit> function02 = this.g;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function12 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$a$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return b.a.a(Function10.this, webView, i3, mutableStateFlow, function1, yVar, function0, function02, (Context) obj);
                        }
                    };
                    composer.updateRememberedValue(function12);
                    rememberedValue = function12;
                }
                composer.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) rememberedValue, null, null, composer, 0, 6);
                composer.endReplaceableGroup();
            } else {
                if (aVar != null) {
                    composer.startReplaceableGroup(-1880725732);
                    composer.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceableGroup(1828380771);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(i.a aVar, Composer composer, Integer num) {
            a(aVar, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public static final View a(Function10 function10, WebView webView, int i, final MutableStateFlow mutableStateFlow, Function1 function1, y yVar, final Function0 function0, final Function0 function02, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return (View) function10.invoke(context, webView, Integer.valueOf(i), mutableStateFlow, function1, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$a$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b.a.a(MutableStateFlow.this, function0);
                }
            }, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$a$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return b.a.a(Function0.this);
                }
            }, yVar, Dp.m4438boximpl(b.a()), Boolean.TRUE);
        }

        public static final Unit a(MutableStateFlow mutableStateFlow, Function0 function0) {
            b.a((MutableStateFlow<Boolean>) mutableStateFlow, (Function0<Unit>) function0);
            return Unit.INSTANCE;
        }

        public static final Unit a(Function0 function0) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, b.a, "Skip button shown callback triggered in MraidAdContainerScreen", null, false, 12, null);
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final Unit a(MutableState mutableState, Function0 function0) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, a, "Countdown finished - skip button is now available", null, false, 12, null);
        mutableState.setValue(Boolean.TRUE);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Function10 a(long j, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Color.INSTANCE.m2138getBlack0d7_KjU();
        }
        if ((i & 2) != 0) {
            function2 = C0377b.a;
        }
        return a(j, (Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>>) function2);
    }

    public static final Function10<Context, WebView, Integer, MutableStateFlow<Boolean>, Function1<? super a.AbstractC0383a.c, Unit>, Function0<Unit>, Function0<Unit>, y, Dp, Boolean, View> a(final long j, final Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> adCloseCountdownButton) {
        Intrinsics.checkNotNullParameter(adCloseCountdownButton, "adCloseCountdownButton");
        return new Function10() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function10
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
                return b.a(j, adCloseCountdownButton, (Context) obj, (WebView) obj2, ((Integer) obj3).intValue(), (MutableStateFlow) obj4, (Function1) obj5, (Function0) obj6, (Function0) obj7, (y) obj8, (Dp) obj9, ((Boolean) obj10).booleanValue());
            }
        };
    }

    public static final ComposeView a(long j, Function2 function2, Context context, WebView webView, int i, MutableStateFlow canClose, Function1 onButtonRendered, Function0 onClose, Function0 onCloseOrSkipButtonShown, y yVar, Dp dp, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(canClose, "canClose");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(onCloseOrSkipButtonShown, "onCloseOrSkipButtonShown");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setId(R.id.moloco_fullscreen_ad_view_id);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(553564605, true, new c(webView, canClose, i, onButtonRendered, onClose, onCloseOrSkipButtonShown, j, function2, yVar, dp, z)));
        return composeView;
    }

    public static final void a(final Activity activity, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel, final WebView webView, final int i, final Function1<? super a.AbstractC0383a.c, Unit> onButtonRendered, Function0<Unit> onClose, final Function10<? super Context, ? super WebView, ? super Integer, ? super MutableStateFlow<Boolean>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Function0<Unit>, ? super Function0<Unit>, ? super y, ? super Dp, ? super Boolean, ? extends View> adWebViewRenderer, final y yVar, final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function11, final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function112, final Function0<Unit> onCloseOrSkipButtonShown, Composer composer, final int i2, final int i3) {
        int i4;
        Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function113;
        int i5;
        final Function0<Unit> function0;
        Composer composer2;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(adWebViewRenderer, "adWebViewRenderer");
        Intrinsics.checkNotNullParameter(onCloseOrSkipButtonShown, "onCloseOrSkipButtonShown");
        Composer startRestartGroup = composer.startRestartGroup(772404782);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(activity) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? startRestartGroup.changed(adViewModel) : startRestartGroup.changedInstance(adViewModel) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(webView) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(onButtonRendered) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(onClose) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(adWebViewRenderer) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= (16777216 & i2) == 0 ? startRestartGroup.changed(yVar) : startRestartGroup.changedInstance(yVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            function113 = function11;
            i4 |= startRestartGroup.changedInstance(function113) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            function113 = function11;
        }
        if ((i2 & C.ENCODING_PCM_32BIT) == 0) {
            i4 |= startRestartGroup.changedInstance(function112) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changedInstance(onCloseOrSkipButtonShown) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            function0 = onClose;
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(772404782, i4, i5, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.MraidAdContainerScreen (AdWebViewRenderer.kt:223)");
            }
            Modifier testTag = TestTagKt.testTag(BackgroundKt.m233backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m2138getBlack0d7_KjU(), null, 2, null), "MraidAdContainerScreen");
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(testTag);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1642constructorimpl.getInserting() || !Intrinsics.areEqual(m1642constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1204573178);
            boolean z = (i4 & 7168) == 2048;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = StateFlowKt.MutableStateFlow(Boolean.valueOf(i == 0));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableStateFlow mutableStateFlow = (MutableStateFlow) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            State collectAsState = SnapshotStateKt.collectAsState(adViewModel.k(), null, startRestartGroup, 0, 1);
            int i6 = i4;
            function0 = onClose;
            composer2 = startRestartGroup;
            CrossfadeKt.Crossfade(a(collectAsState), (Modifier) null, (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1567067945, true, new a(adWebViewRenderer, webView, i, mutableStateFlow, onButtonRendered, onClose, onCloseOrSkipButtonShown, yVar)), composer2, 24576, 14);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a(boxScopeInstance, adViewModel, a(collectAsState), function112, function113, (Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>) null, composer2, (i6 & 112) | 6 | ((i6 >> 18) & 7168) | ((i6 >> 12) & 57344), 16);
            composer2.startReplaceableGroup(1204638639);
            boolean changedInstance = composer2.changedInstance(mutableStateFlow) | ((i6 & 458752) == 131072);
            Object rememberedValue2 = composer2.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b.b(MutableStateFlow.this, function0);
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            composer2.endReplaceableGroup();
            BackHandlerKt.BackHandler(false, (Function0) rememberedValue2, composer2, 0, 1);
            u.a(activity, composer2, i6 & 14);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Function0<Unit> function02 = function0;
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b.a(activity, adViewModel, webView, i, onButtonRendered, function02, adWebViewRenderer, yVar, function11, function112, onCloseOrSkipButtonShown, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void a(MutableStateFlow<Boolean> mutableStateFlow, Function0<Unit> function0) {
        if (mutableStateFlow.getValue().booleanValue()) {
            function0.invoke();
        }
    }

    public static final void a(final Activity activity, final WebView webView, final int i, final Function1<? super a.AbstractC0383a.c, Unit> onButtonRendered, final Function0<Unit> onClose, final Function10<? super Context, ? super WebView, ? super Integer, ? super MutableStateFlow<Boolean>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Function0<Unit>, ? super Function0<Unit>, ? super y, ? super Dp, ? super Boolean, ? extends View> adWebViewRenderer, final y yVar, final Function0<Unit> onCloseOrSkipButtonShown, Composer composer, final int i2) {
        int i3;
        final MutableStateFlow mutableStateFlow;
        final Function0<Unit> function0;
        Composer composer2;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(adWebViewRenderer, "adWebViewRenderer");
        Intrinsics.checkNotNullParameter(onCloseOrSkipButtonShown, "onCloseOrSkipButtonShown");
        Composer startRestartGroup = composer.startRestartGroup(-204806360);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(activity) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(webView) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(onButtonRendered) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(onClose) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(adWebViewRenderer) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= (i2 & 2097152) == 0 ? startRestartGroup.changed(yVar) : startRestartGroup.changedInstance(yVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(onCloseOrSkipButtonShown) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if ((4793491 & i4) == 4793490 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-204806360, i4, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.StaticAdWebViewScreen (AdWebViewRenderer.kt:298)");
            }
            Modifier m233backgroundbw27NRU$default = BackgroundKt.m233backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m2138getBlack0d7_KjU(), null, 2, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m233backgroundbw27NRU$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1642constructorimpl.getInserting() || !Intrinsics.areEqual(m1642constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1609940259);
            int i5 = i4 & 896;
            boolean z = i5 == 256;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = StateFlowKt.MutableStateFlow(Boolean.valueOf(i == 0));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableStateFlow mutableStateFlow2 = (MutableStateFlow) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1609947848);
            int i6 = i4 & 57344;
            boolean changedInstance = (i5 == 256) | ((458752 & i4) == 131072) | startRestartGroup.changedInstance(webView) | startRestartGroup.changedInstance(mutableStateFlow2) | ((i4 & 7168) == 2048) | (i6 == 16384) | ((29360128 & i4) == 8388608) | ((3670016 & i4) == 1048576 || ((i4 & 2097152) != 0 && startRestartGroup.changedInstance(yVar)));
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return b.a(Function10.this, webView, i, mutableStateFlow2, onButtonRendered, onCloseOrSkipButtonShown, yVar, onClose, (Context) obj);
                    }
                };
                mutableStateFlow = mutableStateFlow2;
                function0 = onClose;
                startRestartGroup.updateRememberedValue(function1);
                rememberedValue2 = function1;
            } else {
                mutableStateFlow = mutableStateFlow2;
                function0 = onClose;
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            AndroidView_androidKt.AndroidView((Function1) rememberedValue2, null, null, composer2, 0, 6);
            composer2.startReplaceableGroup(1609961816);
            boolean changedInstance2 = composer2.changedInstance(mutableStateFlow) | (i6 == 16384);
            Object rememberedValue3 = composer2.rememberedValue();
            if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b.e(MutableStateFlow.this, function0);
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            }
            composer2.endReplaceableGroup();
            BackHandlerKt.BackHandler(false, (Function0) rememberedValue3, composer2, 0, 1);
            u.a(activity, composer2, i4 & 14);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b.a(activity, webView, i, onButtonRendered, onClose, adWebViewRenderer, yVar, onCloseOrSkipButtonShown, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final View a(Function10 function10, WebView webView, int i, final MutableStateFlow mutableStateFlow, Function1 function1, Function0 function0, y yVar, final Function0 function02, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (View) function10.invoke(it, webView, Integer.valueOf(i), mutableStateFlow, function1, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.d(MutableStateFlow.this, function02);
            }
        }, function0, yVar, Dp.m4438boximpl(b), Boolean.FALSE);
    }

    public static final i.a a(State<? extends i.a> state) {
        return state.getValue();
    }
}

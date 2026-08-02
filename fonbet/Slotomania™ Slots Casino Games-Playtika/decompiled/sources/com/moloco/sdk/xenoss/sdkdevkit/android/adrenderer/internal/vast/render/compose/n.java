package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import android.content.Context;
import android.view.View;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.moloco.sdk.R;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public final class n {

    public static final class a implements Function3<i.a, Composer, Integer, Unit> {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i a;
        public final /* synthetic */ Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit> b;
        public final /* synthetic */ Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit> c;
        public final /* synthetic */ Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit> d;
        public final /* synthetic */ Function7<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Function1<? super Boolean, Unit>, Function0<Unit>, Composer, Integer, Unit> e;
        public final /* synthetic */ Q f;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i g;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0363a extends FunctionReferenceImpl implements Function0<Unit> {
            public C0363a(Object obj) {
                super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onReplay", "onReplay()V", 0);
            }

            public final void a() {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).z();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i iVar, Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit>, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit> function7, Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function5, Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function6, Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function72, Q q, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar2) {
            this.a = iVar;
            this.b = function7;
            this.c = function5;
            this.d = function6;
            this.e = function72;
            this.f = q;
            this.g = iVar2;
        }

        public final void a(i.a aVar, Composer composer, int i) {
            int i2;
            if ((i & 6) == 0) {
                i2 = (composer.changed(aVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(462706589, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastRenderer.<anonymous>.<anonymous> (VastRenderer.kt:90)");
            }
            if (aVar instanceof i.a.C0352a) {
                composer.startReplaceableGroup(1864274575);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h d = ((i.a.C0352a) aVar).d();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i iVar = this.a;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a.a(d, iVar != null ? iVar.a() : null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, RendererCapabilities.MODE_SUPPORT_MASK, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.c) {
                composer.startReplaceableGroup(1864282292);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k d2 = ((i.a.c) aVar).d();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i iVar2 = this.a;
                Function0<Unit> c = iVar2 != null ? iVar2.c() : null;
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit> function7 = this.b;
                Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit> function5 = this.c;
                Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit> function6 = this.d;
                Function7<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Function1<? super Boolean, Unit>, Function0<Unit>, Composer, Integer, Unit> function72 = this.e;
                Q q = this.f;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar3 = this.g;
                composer.startReplaceableGroup(1864293899);
                boolean changedInstance = composer.changedInstance(iVar3);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new C0363a(iVar3);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(d2, c, fillMaxSize$default, function7, function5, function6, function72, q, (Function0) ((KFunction) rememberedValue), composer, RendererCapabilities.MODE_SUPPORT_MASK, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.b) {
                composer.startReplaceableGroup(1864296834);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e d3 = ((i.a.b) aVar).d();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i iVar4 = this.a;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f.a(d3, iVar4 != null ? iVar4.b() : null, this.d, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 3072, 0);
                composer.endReplaceableGroup();
            } else if (aVar instanceof i.a.d) {
                composer.startReplaceableGroup(1958901854);
                composer.endReplaceableGroup();
            } else {
                if (aVar != null) {
                    composer.startReplaceableGroup(1864273346);
                    composer.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceableGroup(1958940170);
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

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        public c(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.class, "onCTA", "onCTA()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) this.receiver).A();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1<a.AbstractC0383a.c, Unit> {
        public d(Object obj) {
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

    public static final class e implements Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC0383a.c, ? extends Unit>, Function0<? extends Unit>, Composer, Integer, Unit> {
        public final /* synthetic */ Alignment a;
        public final /* synthetic */ PaddingValues b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;
        public final /* synthetic */ Function0<Unit> f;

        public e(Alignment alignment, PaddingValues paddingValues, String str, String str2, long j, Function0<Unit> function0) {
            this.a = alignment;
            this.b = paddingValues;
            this.c = str;
            this.d = str2;
            this.e = j;
            this.f = function0;
        }

        public static final i.a b(State<? extends i.a> state) {
            return state.getValue();
        }

        @Override // kotlin.jvm.functions.Function7
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Boolean bool, StateFlow<? extends i.a> stateFlow, Function1<? super a.AbstractC0383a.c, ? extends Unit> function1, Function0<? extends Unit> function0, Composer composer, Integer num) {
            a(boxScope, bool.booleanValue(), stateFlow, function1, function0, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void a(BoxScope boxScope, boolean z, StateFlow<? extends i.a> currentAdPartFlow, Function1<? super a.AbstractC0383a.c, Unit> onButtonRendered, Function0<Unit> onCTA, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(currentAdPartFlow, "currentAdPartFlow");
            Intrinsics.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            Intrinsics.checkNotNullParameter(onCTA, "onCTA");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(432764356, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous> (VastRenderer.kt:304)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.a)), this.b), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 1004334236, true, new a(onButtonRendered, SnapshotStateKt.collectAsState(currentAdPartFlow, null, composer, (i >> 6) & 14, 1), this.c, this.d, this.e, onCTA, this.f)), composer, ((i >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        public static final class a implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
            public final /* synthetic */ Function1<a.AbstractC0383a.c, Unit> a;
            public final /* synthetic */ State<i.a> b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;
            public final /* synthetic */ long e;
            public final /* synthetic */ Function0<Unit> f;
            public final /* synthetic */ Function0<Unit> g;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super a.AbstractC0383a.c, Unit> function1, State<? extends i.a> state, String str, String str2, long j, Function0<Unit> function0, Function0<Unit> function02) {
                this.a = function1;
                this.b = state;
                this.c = str;
                this.d = str2;
                this.e = j;
                this.f = function0;
                this.g = function02;
            }

            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1004334236, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous> (VastRenderer.kt:323)");
                }
                i.a b2 = e.b(this.b);
                if (b2 instanceof i.a.C0352a) {
                    composer.startReplaceableGroup(1204129171);
                    z.a(null, a.AbstractC0383a.c.EnumC0385a.g, this.a, ComposableLambdaKt.composableLambda(composer, -832302220, true, new C0364a(this.c, this.d, this.e, this.f, this.g)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.c) {
                    composer.startReplaceableGroup(1204720403);
                    z.a(null, a.AbstractC0383a.c.EnumC0385a.g, this.a, ComposableLambdaKt.composableLambda(composer, 1517460509, true, new b(this.c, this.d, this.e, this.f, this.g)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.b) {
                    composer.startReplaceableGroup(1205293903);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.d) {
                    composer.startReplaceableGroup(1205379308);
                    composer.endReplaceableGroup();
                } else {
                    if (b2 != null) {
                        composer.startReplaceableGroup(-1485179161);
                        composer.endReplaceableGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceableGroup(1205414059);
                    composer.endReplaceableGroup();
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

            public static final class b implements Function3<Modifier, Composer, Integer, Unit> {
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ Function0<Unit> d;
                public final /* synthetic */ Function0<Unit> e;

                public b(String str, String str2, long j, Function0<Unit> function0, Function0<Unit> function02) {
                    this.a = str;
                    this.b = str2;
                    this.c = j;
                    this.d = function0;
                    this.e = function02;
                }

                public final void a(Modifier it, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i & 6) == 0) {
                        i |= composer.changed(it) ? 4 : 2;
                    }
                    if ((i & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1517460509, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:346)");
                    }
                    String str = this.a;
                    String str2 = this.b;
                    long j = this.c;
                    composer.startReplaceableGroup(-1483961383);
                    boolean changed = composer.changed(this.d) | composer.changed(this.e);
                    final Function0<Unit> function0 = this.d;
                    final Function0<Unit> function02 = this.e;
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n$e$a$b$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return n.e.a.b.a(Function0.this, function02);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k.a(it, str, str2, j, (Function0) rememberedValue, composer, i & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
                    a(modifier, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public static final Unit a(Function0 function0, Function0 function02) {
                    function0.invoke();
                    if (function02 != null) {
                        function02.invoke();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n$e$a$a, reason: collision with other inner class name */
            public static final class C0364a implements Function3<Modifier, Composer, Integer, Unit> {
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ Function0<Unit> d;
                public final /* synthetic */ Function0<Unit> e;

                public C0364a(String str, String str2, long j, Function0<Unit> function0, Function0<Unit> function02) {
                    this.a = str;
                    this.b = str2;
                    this.c = j;
                    this.d = function0;
                    this.e = function02;
                }

                public final void a(Modifier it, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i & 6) == 0) {
                        i |= composer.changed(it) ? 4 : 2;
                    }
                    if ((i & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-832302220, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:329)");
                    }
                    String str = this.a;
                    String str2 = this.b;
                    long j = this.c;
                    composer.startReplaceableGroup(-1483980455);
                    boolean changed = composer.changed(this.d) | composer.changed(this.e);
                    final Function0<Unit> function0 = this.d;
                    final Function0<Unit> function02 = this.e;
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n$e$a$a$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return n.e.a.C0364a.a(Function0.this, function02);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k.a(it, str, str2, j, (Function0) rememberedValue, composer, i & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
                    a(modifier, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public static final Unit a(Function0 function0, Function0 function02) {
                    function0.invoke();
                    if (function02 != null) {
                        function02.invoke();
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public static final class f implements Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, ? extends Unit>, Function1<? super Boolean, ? extends Unit>, Composer, Integer, Unit> {
        public final /* synthetic */ Alignment a;
        public final /* synthetic */ PaddingValues b;
        public final /* synthetic */ Painter c;
        public final /* synthetic */ Painter d;
        public final /* synthetic */ Function0<Unit> e;
        public final /* synthetic */ long f;
        public final /* synthetic */ long g;
        public final /* synthetic */ long h;
        public final /* synthetic */ Shape i;
        public final /* synthetic */ long j;

        public f(Alignment alignment, PaddingValues paddingValues, Painter painter, Painter painter2, Function0<Unit> function0, long j, long j2, long j3, Shape shape, long j4) {
            this.a = alignment;
            this.b = paddingValues;
            this.c = painter;
            this.d = painter2;
            this.e = function0;
            this.f = j;
            this.g = j2;
            this.h = j3;
            this.i = shape;
            this.j = j4;
        }

        public static final a.AbstractC0383a.c b(MutableState<a.AbstractC0383a.c> mutableState) {
            return mutableState.getValue();
        }

        @Override // kotlin.jvm.functions.Function7
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Boolean bool, Boolean bool2, Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, ? extends Unit> function2, Function1<? super Boolean, ? extends Unit> function1, Composer composer, Integer num) {
            a(boxScope, bool.booleanValue(), bool2.booleanValue(), function2, function1, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public static final void b(MutableState<a.AbstractC0383a.c> mutableState, a.AbstractC0383a.c cVar) {
            mutableState.setValue(cVar);
        }

        public final void a(BoxScope boxScope, boolean z, boolean z2, Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit> onButtonReplaced, Function1<? super Boolean, Unit> onMuteChange, Composer composer, int i) {
            int i2;
            boolean z3;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(onButtonReplaced, "onButtonReplaced");
            Intrinsics.checkNotNullParameter(onMuteChange, "onMuteChange");
            if ((i & 6) == 0) {
                i2 = (composer.changed(boxScope) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                z3 = z;
                i2 |= composer.changed(z3) ? 32 : 16;
            } else {
                z3 = z;
            }
            if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
                i2 |= composer.changed(z2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= composer.changedInstance(onButtonReplaced) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i2 |= composer.changedInstance(onMuteChange) ? 16384 : 8192;
            }
            int i3 = i2;
            if ((74899 & i3) == 74898 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-545982054, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultMuteButton.<anonymous> (VastRenderer.kt:240)");
            }
            composer.startReplaceableGroup(-1304236247);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.b.a(a.AbstractC0383a.c.EnumC0385a.e), null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            AnimatedVisibilityKt.AnimatedVisibility(z, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.a)), this.b), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -2071462974, true, new a(z2, this.c, this.d, onButtonReplaced, onMuteChange, this.e, z3, this.f, this.g, this.h, this.i, this.j, (MutableState) rememberedValue)), composer, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        public static final class a implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ Painter b;
            public final /* synthetic */ Painter c;
            public final /* synthetic */ Function2<a.AbstractC0383a.c, a.AbstractC0383a.c.EnumC0385a, Unit> d;
            public final /* synthetic */ Function1<Boolean, Unit> e;
            public final /* synthetic */ Function0<Unit> f;
            public final /* synthetic */ boolean g;
            public final /* synthetic */ long h;
            public final /* synthetic */ long i;
            public final /* synthetic */ long j;
            public final /* synthetic */ Shape k;
            public final /* synthetic */ long l;
            public final /* synthetic */ MutableState<a.AbstractC0383a.c> m;

            /* JADX WARN: Multi-variable type inference failed */
            public a(boolean z, Painter painter, Painter painter2, Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit> function2, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, boolean z2, long j, long j2, long j3, Shape shape, long j4, MutableState<a.AbstractC0383a.c> mutableState) {
                this.a = z;
                this.b = painter;
                this.c = painter2;
                this.d = function2;
                this.e = function1;
                this.f = function0;
                this.g = z2;
                this.h = j;
                this.i = j2;
                this.j = j3;
                this.k = shape;
                this.l = j4;
                this.m = mutableState;
            }

            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2071462974, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultMuteButton.<anonymous>.<anonymous> (VastRenderer.kt:251)");
                }
                Painter painter = this.a ? this.b : this.c;
                Modifier.Companion companion = Modifier.INSTANCE;
                a.AbstractC0383a.c b = f.b(this.m);
                composer.startReplaceableGroup(-133189899);
                boolean changed = composer.changed(this.d) | composer.changed(this.a);
                final Function2<a.AbstractC0383a.c, a.AbstractC0383a.c.EnumC0385a, Unit> function2 = this.d;
                final boolean z = this.a;
                final MutableState<a.AbstractC0383a.c> mutableState = this.m;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n$f$a$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return n.f.a.a(Function2.this, z, mutableState, (a.AbstractC0383a.c) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.a.a(companion, b, (Function1<? super a.AbstractC0383a.c, Unit>) rememberedValue);
                composer.startReplaceableGroup(-133182815);
                Object rememberedValue2 = composer.rememberedValue();
                Composer.Companion companion2 = Composer.INSTANCE;
                if (rememberedValue2 == companion2.getEmpty()) {
                    final String str = "mute_button";
                    rememberedValue2 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n$f$a$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return n.f.a.a(str, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier semantics$default = SemanticsModifierKt.semantics$default(a, false, (Function1) rememberedValue2, 1, null);
                composer.startReplaceableGroup(-133176485);
                boolean changed2 = composer.changed(this.e) | composer.changed(this.a) | composer.changed(this.d) | composer.changed(this.f);
                final Function1<Boolean, Unit> function1 = this.e;
                final boolean z2 = this.a;
                final Function2<a.AbstractC0383a.c, a.AbstractC0383a.c.EnumC0385a, Unit> function22 = this.d;
                final Function0<Unit> function0 = this.f;
                final MutableState<a.AbstractC0383a.c> mutableState2 = this.m;
                Object rememberedValue3 = composer.rememberedValue();
                if (changed2 || rememberedValue3 == companion2.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n$f$a$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return n.f.a.a(Function1.this, z2, function22, function0, mutableState2);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceableGroup();
                t.a(painter, (Function0) rememberedValue3, semantics$default, this.g, "mute/unmute", this.h, this.i, this.j, this.k, this.l, composer, 24576, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                a(animatedVisibilityScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public static final Unit a(Function2 function2, boolean z, MutableState mutableState, a.AbstractC0383a.c it) {
                Intrinsics.checkNotNullParameter(it, "it");
                f.b(mutableState, it);
                function2.invoke(f.b(mutableState), z ? a.AbstractC0383a.c.EnumC0385a.e : a.AbstractC0383a.c.EnumC0385a.f);
                return Unit.INSTANCE;
            }

            public static final Unit a(String str, SemanticsPropertyReceiver semantics) {
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                SemanticsPropertiesKt.setContentDescription(semantics, str);
                SemanticsPropertiesKt.setTestTag(semantics, str);
                return Unit.INSTANCE;
            }

            public static final Unit a(Function1 function1, boolean z, Function2 function2, Function0 function0, MutableState mutableState) {
                function1.invoke(Boolean.valueOf(!z));
                f.b(mutableState, new a.AbstractC0383a.c(z ? a.AbstractC0383a.c.EnumC0385a.e : a.AbstractC0383a.c.EnumC0385a.f, f.b(mutableState).e(), f.b(mutableState).f()));
                function2.invoke(f.b(mutableState), z ? a.AbstractC0383a.c.EnumC0385a.f : a.AbstractC0383a.c.EnumC0385a.e);
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            }
        }
    }

    public static final class g implements Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit> {
        public final /* synthetic */ Alignment a;
        public final /* synthetic */ PaddingValues b;
        public final /* synthetic */ long c;

        public static final class a implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i b;
            public final /* synthetic */ long c;

            public a(boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, long j) {
                this.a = z;
                this.b = iVar;
                this.c = j;
            }

            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1435522410, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar.<anonymous>.<anonymous> (VastRenderer.kt:387)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m.a(this.a, this.b, null, this.c, composer, 0, 4);
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

        public g(Alignment alignment, PaddingValues paddingValues, long j) {
            this.a = alignment;
            this.b = paddingValues;
            this.c = j;
        }

        public final void a(BoxScope boxScope, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i progress, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            Intrinsics.checkNotNullParameter(progress, "progress");
            if ((i & 6) == 0) {
                i2 = (composer.changed(boxScope) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composer.changed(z) ? 32 : 16;
            }
            if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
                i2 |= composer.changed(progress) ? 256 : 128;
            }
            if ((i2 & 1171) == 1170 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1967084142, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar.<anonymous> (VastRenderer.kt:379)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z || ((progress instanceof i.c) && ((i.c) progress).c() > 0), PaddingKt.padding(boxScope.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), this.a), this.b), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -1435522410, true, new a(z, progress, this.c)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Boolean bool, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar, Composer composer, Integer num) {
            a(boxScope, bool.booleanValue(), iVar, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class h implements Function2<Composer, Integer, Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, ? extends Unit>, ? super Function1<? super Boolean, ? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {
        public static final h a = new h();

        public final Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(-1165352185);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1165352185, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:179)");
            }
            Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit> a2 = n.a(0L, 0L, null, 0L, null, null, 0L, null, null, null, composer, 0, 1023);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, ? extends Unit>, ? super Function1<? super Boolean, ? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class i implements Function2<Composer, Integer, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {
        public static final i a = new i();

        public final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(1971947846);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1971947846, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:180)");
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

    public static final class j implements Function2<Composer, Integer, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<? extends Unit>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {
        public static final j a = new j();

        public final Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(489092871);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(489092871, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:181)");
            }
            Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit> a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
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

    public static final class k implements Function2<Composer, Integer, Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {
        public static final k a = new k();

        public final Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC0383a.c, Unit>, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(-462412988);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-462412988, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:183)");
            }
            Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC0383a.c, Unit>, Function0<Unit>, Composer, Integer, Unit> a2 = n.a(null, null, 0L, null, null, null, composer, 0, 63);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC0383a.c, ? extends Unit>, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class l implements Function2<Composer, Integer, Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, ? extends Unit>> {
        public static final l a = new l();

        public final Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(-185458362);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-185458362, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:185)");
            }
            Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit> a2 = n.a(null, null, 0L, composer, 0, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    public static final class m implements Function2<Composer, Integer, Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<? extends Unit>, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit>> {
        public static final m a = new m();

        public final Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit> a(Composer composer, int i) {
            composer.startReplaceableGroup(1409102370);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1409102370, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:186)");
            }
            Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit> a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return a2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<? extends Unit>, ? super Function0<? extends Unit>, ? super Composer, ? super Integer, ? extends Unit> invoke(Composer composer, Integer num) {
            return a(composer, num.intValue());
        }
    }

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n$n, reason: collision with other inner class name */
    public static final class C0365n implements Function2 {
        public static final C0365n a = new C0365n();

        public final Void a(Composer composer, int i) {
            composer.startReplaceableGroup(-1364519647);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1364519647, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:187)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Composer) obj, ((Number) obj2).intValue());
        }
    }

    public static final class o implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i a;
        public final /* synthetic */ long b;
        public final /* synthetic */ Function2<Composer, Integer, Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit>> c;
        public final /* synthetic */ Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> d;
        public final /* synthetic */ Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> e;
        public final /* synthetic */ Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> f;
        public final /* synthetic */ Function2<Composer, Integer, Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC0383a.c, Unit>, Function0<Unit>, Composer, Integer, Unit>> g;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i h;
        public final /* synthetic */ Function2<Composer, Integer, Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit>> i;
        public final /* synthetic */ Function2<Composer, Integer, Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit>> j;
        public final /* synthetic */ Function2<Composer, Integer, Function7<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Function1<? super Boolean, Unit>, Function0<Unit>, Composer, Integer, Unit>> k;
        public final /* synthetic */ Q l;
        public final /* synthetic */ boolean m;

        public static final class a implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i a;
            public final /* synthetic */ long b;
            public final /* synthetic */ Function2<Composer, Integer, Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit>> c;
            public final /* synthetic */ Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> d;
            public final /* synthetic */ Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> e;
            public final /* synthetic */ Function2<Composer, Integer, Function11<BoxScope, Boolean, Boolean, Function0<Unit>, Function1<? super a.AbstractC0383a.c, Unit>, Boolean, UInt, UInt, Function0<Unit>, Composer, Integer, Unit>> f;
            public final /* synthetic */ Function2<Composer, Integer, Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC0383a.c, Unit>, Function0<Unit>, Composer, Integer, Unit>> g;
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i h;
            public final /* synthetic */ Function2<Composer, Integer, Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit>> i;
            public final /* synthetic */ Function2<Composer, Integer, Function6<BoxScope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, Function0<Unit>, Function0<Unit>, Composer, Integer, Unit>> j;
            public final /* synthetic */ Function2<Composer, Integer, Function7<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Function1<? super Boolean, Unit>, Function0<Unit>, Composer, Integer, Unit>> k;
            public final /* synthetic */ Q l;
            public final /* synthetic */ boolean m;

            /* JADX WARN: Multi-variable type inference failed */
            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, long j, Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit>, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit>> function2, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function22, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function23, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function24, Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function25, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i iVar2, Function2<? super Composer, ? super Integer, ? extends Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit>> function26, Function2<? super Composer, ? super Integer, ? extends Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function27, Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function28, Q q, boolean z) {
                this.a = iVar;
                this.b = j;
                this.c = function2;
                this.d = function22;
                this.e = function23;
                this.f = function24;
                this.g = function25;
                this.h = iVar2;
                this.i = function26;
                this.j = function27;
                this.k = function28;
                this.l = q;
                this.m = z;
            }

            public final void a(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2103457343, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:196)");
                }
                n.a(this.a, null, this.b, this.c.invoke(composer, 0), this.d.invoke(composer, 0), this.e.invoke(composer, 0), this.f.invoke(composer, 0), this.g.invoke(composer, 0), this.h, this.i.invoke(composer, 0), this.j.invoke(composer, 0), this.k.invoke(composer, 0), this.l, this.m, composer, 0, 0, 2);
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
        public o(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, long j, Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit>, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit>> function2, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function22, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function23, Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function24, Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function25, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i iVar2, Function2<? super Composer, ? super Integer, ? extends Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit>> function26, Function2<? super Composer, ? super Integer, ? extends Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function27, Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> function28, Q q, boolean z) {
            this.a = iVar;
            this.b = j;
            this.c = function2;
            this.d = function22;
            this.e = function23;
            this.f = function24;
            this.g = function25;
            this.h = iVar2;
            this.i = function26;
            this.j = function27;
            this.k = function28;
            this.l = q;
            this.m = z;
        }

        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1482604196, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:195)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.c.a(false, ComposableLambdaKt.composableLambda(composer, 2103457343, true, new a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m)), composer, 48, 1);
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

    public static final Unit a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar, Modifier modifier, long j2, Function7 function7, Function11 function11, Function11 function112, Function11 function113, Function7 function72, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i iVar2, Function5 function5, Function6 function6, Function7 function73, Q q, boolean z, int i2, int i3, int i4, Composer composer, int i5) {
        a(iVar, modifier, j2, function7, function11, function112, function113, function72, iVar2, function5, function6, function73, q, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    public static final boolean b(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0512, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L270;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel, Modifier modifier, long j2, Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit>, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit> function7, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function11, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function112, Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function113, Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function72, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i iVar, Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function5, Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function6, Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function73, final Q viewVisibilityTracker, boolean z, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        long j3;
        Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit>, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit> function74;
        Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function114;
        Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function115;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long m2138getBlack0d7_KjU;
        Composer composer2;
        int i15;
        int i16;
        int i17;
        Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function116;
        Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function75;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i iVar2;
        Modifier modifier3;
        Composer composer3;
        Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function52;
        Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function62;
        int i18;
        Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function76;
        Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function63;
        int i19;
        Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function53;
        boolean z2;
        Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function77;
        int currentCompositeKeyHash;
        boolean z3;
        Composer m1642constructorimpl;
        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i iVar3;
        int i20;
        Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function117;
        Boolean bool;
        Composer composer4;
        final Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit>, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit> function78;
        final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function118;
        final long j4;
        final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i iVar4;
        final Modifier modifier4;
        final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function119;
        final Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function54;
        final Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function79;
        final Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function64;
        final Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function710;
        final Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function1110;
        final boolean z4;
        ScopeUpdateScope endRestartGroup;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Composer startRestartGroup = composer.startRestartGroup(1488753766);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? startRestartGroup.changed(adViewModel) : startRestartGroup.changedInstance(adViewModel) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i26 = i4 & 2;
        if (i26 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= RendererCapabilities.MODE_SUPPORT_MASK;
                j3 = j2;
            } else {
                j3 = j2;
                if ((i2 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
                    i5 |= startRestartGroup.changed(j3) ? 256 : 128;
                }
            }
            if ((i2 & 3072) != 0) {
                if ((i4 & 8) == 0) {
                    function74 = function7;
                    if (startRestartGroup.changedInstance(function74)) {
                        i25 = 2048;
                        i5 |= i25;
                    }
                } else {
                    function74 = function7;
                }
                i25 = 1024;
                i5 |= i25;
            } else {
                function74 = function7;
            }
            if ((i2 & 24576) == 0) {
                if ((i4 & 16) == 0 && startRestartGroup.changedInstance(function11)) {
                    i24 = 16384;
                    i5 |= i24;
                }
                i24 = 8192;
                i5 |= i24;
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                function114 = function112;
                i5 |= ((i4 & 32) == 0 && startRestartGroup.changedInstance(function114)) ? 131072 : 65536;
            } else {
                function114 = function112;
            }
            if ((i2 & 1572864) != 0) {
                function115 = function113;
                i5 |= ((i4 & 64) == 0 && startRestartGroup.changedInstance(function115)) ? 1048576 : 524288;
            } else {
                function115 = function113;
            }
            if ((i2 & 12582912) == 0) {
                if ((i4 & 128) == 0 && startRestartGroup.changedInstance(function72)) {
                    i23 = 8388608;
                    i5 |= i23;
                }
                i23 = 4194304;
                i5 |= i23;
            }
            i7 = i4 & 256;
            if (i7 == 0) {
                i5 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i8 = i7;
                i5 |= startRestartGroup.changed(iVar) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                if ((i2 & C.ENCODING_PCM_32BIT) == 0) {
                    if ((i4 & 512) == 0 && startRestartGroup.changedInstance(function5)) {
                        i22 = 536870912;
                        i5 |= i22;
                    }
                    i22 = 268435456;
                    i5 |= i22;
                }
                if ((i3 & 6) == 0) {
                    if ((i4 & 1024) == 0 && startRestartGroup.changedInstance(function6)) {
                        i21 = 4;
                        i9 = i3 | i21;
                    }
                    i21 = 2;
                    i9 = i3 | i21;
                } else {
                    i9 = i3;
                }
                i10 = i4 & 2048;
                if (i10 != 0) {
                    i11 = i10;
                    i12 = i9 | 48;
                } else {
                    if ((i3 & 48) == 0) {
                        i11 = i10;
                        i9 |= startRestartGroup.changedInstance(function73) ? 32 : 16;
                    } else {
                        i11 = i10;
                    }
                    i12 = i9;
                }
                if ((i4 & 4096) != 0) {
                    i12 |= RendererCapabilities.MODE_SUPPORT_MASK;
                } else if ((i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
                    i12 |= (i3 & 512) == 0 ? startRestartGroup.changed(viewVisibilityTracker) : startRestartGroup.changedInstance(viewVisibilityTracker) ? 256 : 128;
                }
                i13 = i4 & 8192;
                if (i13 != 0) {
                    i14 = i12 | 3072;
                } else {
                    int i27 = i12;
                    if ((i3 & 3072) == 0) {
                        i27 |= startRestartGroup.changed(z) ? 2048 : 1024;
                    }
                    i14 = i27;
                }
                if ((i5 & 306783379) != 306783378 && (i14 & 1171) == 1170 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                    iVar3 = adViewModel;
                    function119 = function11;
                    function79 = function72;
                    function710 = function73;
                    z4 = z;
                    composer4 = startRestartGroup;
                    function78 = function74;
                    function118 = function114;
                    modifier4 = modifier2;
                    function64 = function6;
                    function1110 = function115;
                    j4 = j3;
                    iVar4 = iVar;
                    function54 = function5;
                } else {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i26 != 0 ? Modifier.INSTANCE : modifier2;
                        m2138getBlack0d7_KjU = i6 != 0 ? Color.INSTANCE.m2138getBlack0d7_KjU() : j3;
                        if ((i4 & 8) != 0) {
                            i16 = i8;
                            i17 = i11;
                            i15 = i14;
                            function74 = a(0L, 0L, null, 0L, null, null, 0L, null, null, null, startRestartGroup, 0, 1023);
                            composer2 = startRestartGroup;
                            i5 &= -7169;
                        } else {
                            composer2 = startRestartGroup;
                            i15 = i14;
                            i16 = i8;
                            i17 = i11;
                        }
                        if ((i4 & 16) != 0) {
                            function116 = s.a(null, null, 0L, 0L, 0L, null, null, null, composer2, 0, 255);
                            i5 &= -57345;
                        } else {
                            function116 = function11;
                        }
                        if ((i4 & 32) != 0) {
                            function114 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.g.a(null, null, 0L, 0L, 0L, null, null, null, composer2, 0, 255);
                            i5 &= -458753;
                        }
                        if ((i4 & 64) != 0) {
                            i5 &= -3670017;
                            function115 = function114;
                        }
                        if ((i4 & 128) != 0) {
                            function75 = a(null, null, 0L, null, null, null, composer2, 0, 63);
                            i5 &= -29360129;
                        } else {
                            function75 = function72;
                        }
                        iVar2 = i16 != 0 ? null : iVar;
                        if ((i4 & 512) != 0) {
                            Composer composer5 = composer2;
                            function52 = a(null, null, 0L, composer5, 0, 7);
                            modifier3 = modifier5;
                            composer3 = composer5;
                            i5 &= -1879048193;
                        } else {
                            modifier3 = modifier5;
                            composer3 = composer2;
                            function52 = function5;
                        }
                        Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function55 = function52;
                        if ((i4 & 1024) != 0) {
                            function62 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(null, null, composer3, 0, 3);
                            i18 = i15 & (-15);
                        } else {
                            function62 = function6;
                            i18 = i15;
                        }
                        function76 = i17 != 0 ? null : function73;
                        int i28 = i18;
                        function63 = function62;
                        i19 = i28;
                        modifier2 = modifier3;
                        function53 = function55;
                        if (i13 != 0) {
                            z2 = true;
                            composer3.endDefaults();
                            Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function65 = function63;
                            if (ComposerKt.isTraceInProgress()) {
                                function77 = function76;
                            } else {
                                function77 = function76;
                                ComposerKt.traceEventStart(1488753766, i5, i19, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastRenderer (VastRenderer.kt:81)");
                            }
                            Modifier m233backgroundbw27NRU$default = BackgroundKt.m233backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), m2138getBlack0d7_KjU, null, 2, null);
                            composer3.startReplaceableGroup(733328855);
                            Alignment.Companion companion = Alignment.INSTANCE;
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composer3, 0);
                            composer3.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function1111 = function115;
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m233backgroundbw27NRU$default);
                            z3 = z2;
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.useNode();
                            } else {
                                composer3.createNode(constructor);
                            }
                            m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (!m1642constructorimpl.getInserting() || !Intrinsics.areEqual(m1642constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            State collectAsState = SnapshotStateKt.collectAsState(adViewModel.k(), null, composer3, 0, 1);
                            i.a a2 = a(collectAsState);
                            Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function56 = function53;
                            Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function711 = function77;
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer3, 462706589, true, new a(iVar2, function74, function56, function65, function711, viewVisibilityTracker, adViewModel));
                            Composer composer6 = composer3;
                            CrossfadeKt.Crossfade(a2, (Modifier) null, (FiniteAnimationSpec<Float>) null, (String) null, composableLambda, composer6, 24576, 14);
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a(boxScopeInstance, adViewModel, a(collectAsState), function114, function116, function1111, composer6, ((i5 << 3) & 112) | 6 | ((i5 >> 6) & 7168) | (57344 & i5) | ((i5 >> 3) & 458752), 0);
                            BoxScopeInstance boxScopeInstance2 = boxScopeInstance;
                            iVar3 = adViewModel;
                            composer6.startReplaceableGroup(-1443718711);
                            if (function75 != null) {
                                i20 = 6;
                                function117 = function1111;
                            } else {
                                i20 = 6;
                                function117 = function1111;
                                Boolean valueOf = Boolean.valueOf(b(SnapshotStateKt.collectAsState(iVar3.n(), null, composer6, 0, 1)));
                                StateFlow<i.a> k2 = iVar3.k();
                                composer6.startReplaceableGroup(1864320883);
                                int i29 = i5 & 14;
                                boolean z5 = i29 == 4 || ((i5 & 8) != 0 && composer6.changedInstance(iVar3));
                                Object rememberedValue = composer6.rememberedValue();
                                if (z5) {
                                    bool = valueOf;
                                } else {
                                    bool = valueOf;
                                }
                                rememberedValue = new b(iVar3);
                                composer6.updateRememberedValue(rememberedValue);
                                KFunction kFunction = (KFunction) rememberedValue;
                                composer6.endReplaceableGroup();
                                composer6.startReplaceableGroup(1864322376);
                                boolean z6 = i29 == 4 || ((i5 & 8) != 0 && composer6.changedInstance(iVar3));
                                Object rememberedValue2 = composer6.rememberedValue();
                                if (z6 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new c(iVar3);
                                    composer6.updateRememberedValue(rememberedValue2);
                                }
                                composer6.endReplaceableGroup();
                                function75.invoke(boxScopeInstance2, bool, k2, kFunction, (KFunction) rememberedValue2, composer6, 6);
                                boxScopeInstance2 = boxScopeInstance2;
                                Unit unit = Unit.INSTANCE;
                            }
                            composer6.endReplaceableGroup();
                            composer6.startReplaceableGroup(-1443709635);
                            if (z3) {
                                composer4 = composer6;
                            } else {
                                Function5<BoxScope, Function1<? super a.AbstractC0383a.c, Unit>, StateFlow<? extends i.a>, Composer, Integer, Unit> b2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a.b(PaddingKt.m585padding3ABfNKs(boxScopeInstance2.align(Modifier.INSTANCE, companion.getBottomStart()), Dp.m4440constructorimpl(12)), null, null, null, composer6, 0, 14);
                                composer6.startReplaceableGroup(-1443703628);
                                boolean z7 = (i5 & 14) == 4 || ((i5 & 8) != 0 && composer6.changedInstance(iVar3));
                                Object rememberedValue3 = composer6.rememberedValue();
                                if (z7 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new d(iVar3);
                                    composer6.updateRememberedValue(rememberedValue3);
                                }
                                composer6.endReplaceableGroup();
                                b2.invoke(boxScopeInstance2, (KFunction) rememberedValue3, iVar3.k(), composer6, Integer.valueOf(i20));
                                composer4 = composer6;
                            }
                            composer4.endReplaceableGroup();
                            composer4.endReplaceableGroup();
                            composer4.endNode();
                            composer4.endReplaceableGroup();
                            composer4.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function78 = function74;
                            function118 = function114;
                            j4 = m2138getBlack0d7_KjU;
                            iVar4 = iVar2;
                            modifier4 = modifier2;
                            function119 = function116;
                            function54 = function56;
                            function79 = function75;
                            function64 = function65;
                            function710 = function711;
                            function1110 = function117;
                            z4 = z3;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i4 & 8) != 0) {
                            i5 &= -7169;
                        }
                        if ((i4 & 16) != 0) {
                            i5 &= -57345;
                        }
                        if ((i4 & 32) != 0) {
                            i5 &= -458753;
                        }
                        if ((i4 & 64) != 0) {
                            i5 &= -3670017;
                        }
                        if ((i4 & 128) != 0) {
                            i5 &= -29360129;
                        }
                        if ((i4 & 512) != 0) {
                            i5 &= -1879048193;
                        }
                        if ((i4 & 1024) != 0) {
                            i14 &= -15;
                        }
                        function116 = function11;
                        function53 = function5;
                        function63 = function6;
                        function76 = function73;
                        composer3 = startRestartGroup;
                        m2138getBlack0d7_KjU = j3;
                        i19 = i14;
                        function75 = function72;
                        iVar2 = iVar;
                    }
                    z2 = z;
                    composer3.endDefaults();
                    Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function652 = function63;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier m233backgroundbw27NRU$default2 = BackgroundKt.m233backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), m2138getBlack0d7_KjU, null, 2, null);
                    composer3.startReplaceableGroup(733328855);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composer3, 0);
                    composer3.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function11112 = function115;
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m233backgroundbw27NRU$default2);
                    z3 = z2;
                    if (!(composer3.getApplier() instanceof Applier)) {
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                    }
                    m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!m1642constructorimpl.getInserting()) {
                    }
                    m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    modifierMaterializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    State collectAsState2 = SnapshotStateKt.collectAsState(adViewModel.k(), null, composer3, 0, 1);
                    i.a a22 = a(collectAsState2);
                    Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function562 = function53;
                    Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function7112 = function77;
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer3, 462706589, true, new a(iVar2, function74, function562, function652, function7112, viewVisibilityTracker, adViewModel));
                    Composer composer62 = composer3;
                    CrossfadeKt.Crossfade(a22, (Modifier) null, (FiniteAnimationSpec<Float>) null, (String) null, composableLambda2, composer62, 24576, 14);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a(boxScopeInstance3, adViewModel, a(collectAsState2), function114, function116, function11112, composer62, ((i5 << 3) & 112) | 6 | ((i5 >> 6) & 7168) | (57344 & i5) | ((i5 >> 3) & 458752), 0);
                    BoxScopeInstance boxScopeInstance22 = boxScopeInstance3;
                    iVar3 = adViewModel;
                    composer62.startReplaceableGroup(-1443718711);
                    if (function75 != null) {
                    }
                    composer62.endReplaceableGroup();
                    composer62.startReplaceableGroup(-1443709635);
                    if (z3) {
                    }
                    composer4.endReplaceableGroup();
                    composer4.endReplaceableGroup();
                    composer4.endNode();
                    composer4.endReplaceableGroup();
                    composer4.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function78 = function74;
                    function118 = function114;
                    j4 = m2138getBlack0d7_KjU;
                    iVar4 = iVar2;
                    modifier4 = modifier2;
                    function119 = function116;
                    function54 = function562;
                    function79 = function75;
                    function64 = function652;
                    function710 = function7112;
                    function1110 = function117;
                    z4 = z3;
                }
                endRestartGroup = composer4.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return n.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.this, modifier4, j4, function78, function119, function118, function1110, function79, iVar4, function54, function64, function710, viewVisibilityTracker, z4, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i8 = i7;
            if ((i2 & C.ENCODING_PCM_32BIT) == 0) {
            }
            if ((i3 & 6) == 0) {
            }
            i10 = i4 & 2048;
            if (i10 != 0) {
            }
            if ((i4 & 4096) != 0) {
            }
            i13 = i4 & 8192;
            if (i13 != 0) {
            }
            if ((i5 & 306783379) != 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i26 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i4 & 8) != 0) {
            }
            if ((i4 & 16) != 0) {
            }
            if ((i4 & 32) != 0) {
            }
            if ((i4 & 64) != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if (i16 != 0) {
            }
            if ((i4 & 512) != 0) {
            }
            Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function552 = function52;
            if ((i4 & 1024) != 0) {
            }
            if (i17 != 0) {
            }
            int i282 = i18;
            function63 = function62;
            i19 = i282;
            modifier2 = modifier3;
            function53 = function552;
            if (i13 != 0) {
            }
            z2 = z;
            composer3.endDefaults();
            Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function6522 = function63;
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier m233backgroundbw27NRU$default22 = BackgroundKt.m233backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), m2138getBlack0d7_KjU, null, 2, null);
            composer3.startReplaceableGroup(733328855);
            Alignment.Companion companion32 = Alignment.INSTANCE;
            MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(companion32.getTopStart(), false, composer3, 0);
            composer3.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor22 = companion222.getConstructor();
            Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function111122 = function115;
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(m233backgroundbw27NRU$default22);
            z3 = z2;
            if (!(composer3.getApplier() instanceof Applier)) {
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
            }
            m1642constructorimpl = Updater.m1642constructorimpl(composer3);
            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy22, companion222.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap22, companion222.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = companion222.getSetCompositeKeyHash();
            if (!m1642constructorimpl.getInserting()) {
            }
            m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            modifierMaterializerOf22.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
            composer3.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
            State collectAsState22 = SnapshotStateKt.collectAsState(adViewModel.k(), null, composer3, 0, 1);
            i.a a222 = a(collectAsState22);
            Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function5622 = function53;
            Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function71122 = function77;
            ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(composer3, 462706589, true, new a(iVar2, function74, function5622, function6522, function71122, viewVisibilityTracker, adViewModel));
            Composer composer622 = composer3;
            CrossfadeKt.Crossfade(a222, (Modifier) null, (FiniteAnimationSpec<Float>) null, (String) null, composableLambda22, composer622, 24576, 14);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a(boxScopeInstance32, adViewModel, a(collectAsState22), function114, function116, function111122, composer622, ((i5 << 3) & 112) | 6 | ((i5 >> 6) & 7168) | (57344 & i5) | ((i5 >> 3) & 458752), 0);
            BoxScopeInstance boxScopeInstance222 = boxScopeInstance32;
            iVar3 = adViewModel;
            composer622.startReplaceableGroup(-1443718711);
            if (function75 != null) {
            }
            composer622.endReplaceableGroup();
            composer622.startReplaceableGroup(-1443709635);
            if (z3) {
            }
            composer4.endReplaceableGroup();
            composer4.endReplaceableGroup();
            composer4.endNode();
            composer4.endReplaceableGroup();
            composer4.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            function78 = function74;
            function118 = function114;
            j4 = m2138getBlack0d7_KjU;
            iVar4 = iVar2;
            modifier4 = modifier2;
            function119 = function116;
            function54 = function5622;
            function79 = function75;
            function64 = function6522;
            function710 = function71122;
            function1110 = function117;
            z4 = z3;
            endRestartGroup = composer4.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        if ((i2 & 1572864) != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i7 = i4 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i2 & C.ENCODING_PCM_32BIT) == 0) {
        }
        if ((i3 & 6) == 0) {
        }
        i10 = i4 & 2048;
        if (i10 != 0) {
        }
        if ((i4 & 4096) != 0) {
        }
        i13 = i4 & 8192;
        if (i13 != 0) {
        }
        if ((i5 & 306783379) != 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i26 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i4 & 8) != 0) {
        }
        if ((i4 & 16) != 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if ((i4 & 64) != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if (i16 != 0) {
        }
        if ((i4 & 512) != 0) {
        }
        Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function5522 = function52;
        if ((i4 & 1024) != 0) {
        }
        if (i17 != 0) {
        }
        int i2822 = i18;
        function63 = function62;
        i19 = i2822;
        modifier2 = modifier3;
        function53 = function5522;
        if (i13 != 0) {
        }
        z2 = z;
        composer3.endDefaults();
        Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function65222 = function63;
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m233backgroundbw27NRU$default222 = BackgroundKt.m233backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), m2138getBlack0d7_KjU, null, 2, null);
        composer3.startReplaceableGroup(733328855);
        Alignment.Companion companion322 = Alignment.INSTANCE;
        MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(companion322.getTopStart(), false, composer3, 0);
        composer3.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap222 = composer3.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2222 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor222 = companion2222.getConstructor();
        Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function1111222 = function115;
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(m233backgroundbw27NRU$default222);
        z3 = z2;
        if (!(composer3.getApplier() instanceof Applier)) {
        }
        composer3.startReusableNode();
        if (composer3.getInserting()) {
        }
        m1642constructorimpl = Updater.m1642constructorimpl(composer3);
        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy222, companion2222.getSetMeasurePolicy());
        Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap222, companion2222.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = companion2222.getSetCompositeKeyHash();
        if (!m1642constructorimpl.getInserting()) {
        }
        m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        modifierMaterializerOf222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
        composer3.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
        State collectAsState222 = SnapshotStateKt.collectAsState(adViewModel.k(), null, composer3, 0, 1);
        i.a a2222 = a(collectAsState222);
        Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit> function56222 = function53;
        Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function711222 = function77;
        ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(composer3, 462706589, true, new a(iVar2, function74, function56222, function65222, function711222, viewVisibilityTracker, adViewModel));
        Composer composer6222 = composer3;
        CrossfadeKt.Crossfade(a2222, (Modifier) null, (FiniteAnimationSpec<Float>) null, (String) null, composableLambda222, composer6222, 24576, 14);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a(boxScopeInstance322, adViewModel, a(collectAsState222), function114, function116, function1111222, composer6222, ((i5 << 3) & 112) | 6 | ((i5 >> 6) & 7168) | (57344 & i5) | ((i5 >> 3) & 458752), 0);
        BoxScopeInstance boxScopeInstance2222 = boxScopeInstance322;
        iVar3 = adViewModel;
        composer6222.startReplaceableGroup(-1443718711);
        if (function75 != null) {
        }
        composer6222.endReplaceableGroup();
        composer6222.startReplaceableGroup(-1443709635);
        if (z3) {
        }
        composer4.endReplaceableGroup();
        composer4.endReplaceableGroup();
        composer4.endNode();
        composer4.endReplaceableGroup();
        composer4.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        function78 = function74;
        function118 = function114;
        j4 = m2138getBlack0d7_KjU;
        iVar4 = iVar2;
        modifier4 = modifier2;
        function119 = function116;
        function54 = function56222;
        function79 = function75;
        function64 = function65222;
        function710 = function711222;
        function1110 = function117;
        z4 = z3;
        endRestartGroup = composer4.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ Function2 a(long j2, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i iVar, Function2 function26, Function2 function27, Function2 function28, Q q, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = Color.INSTANCE.m2138getBlack0d7_KjU();
        }
        if ((i2 & 2) != 0) {
            function2 = h.a;
        }
        if ((i2 & 4) != 0) {
            function22 = i.a;
        }
        if ((i2 & 8) != 0) {
            function23 = j.a;
        }
        if ((i2 & 16) != 0) {
            function24 = function23;
        }
        if ((i2 & 32) != 0) {
            function25 = k.a;
        }
        if ((i2 & 64) != 0) {
            iVar = null;
        }
        if ((i2 & 128) != 0) {
            function26 = l.a;
        }
        if ((i2 & 256) != 0) {
            function27 = m.a;
        }
        if ((i2 & 512) != 0) {
            function28 = C0365n.a;
        }
        if ((i2 & 1024) != 0) {
            q = a.h.a.k();
        }
        if ((i2 & 2048) != 0) {
            z = true;
        }
        Q q2 = q;
        boolean z2 = z;
        Function2 function29 = function27;
        Function2 function210 = function28;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i iVar2 = iVar;
        Function2 function211 = function26;
        Function2 function212 = function25;
        Function2 function213 = function23;
        Function2 function214 = function2;
        return a(j2, function214, function22, function213, function24, function212, iVar2, function211, function29, function210, q2, z2);
    }

    public static final Function2<Context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i, View> a(final long j2, final Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit>, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit>> muteButton, final Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> adCloseCountdownButton, final Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> adSkipCountdownButton, final Function2<? super Composer, ? super Integer, ? extends Function11<? super BoxScope, ? super Boolean, ? super Boolean, ? super Function0<Unit>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> adSkipCountdownButtonForEndcards, final Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super StateFlow<? extends i.a>, ? super Function1<? super a.AbstractC0383a.c, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> ctaButton, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i iVar, final Function2<? super Composer, ? super Integer, ? extends Function5<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Composer, ? super Integer, Unit>> progressBar, final Function2<? super Composer, ? super Integer, ? extends Function6<? super BoxScope, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, ? super Function0<Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> vastIcon, final Function2<? super Composer, ? super Integer, ? extends Function7<? super BoxScope, ? super Boolean, ? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, ? super Function1<? super Boolean, Unit>, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit>> playbackControl, final Q viewVisibilityTracker, final boolean z) {
        Intrinsics.checkNotNullParameter(muteButton, "muteButton");
        Intrinsics.checkNotNullParameter(adCloseCountdownButton, "adCloseCountdownButton");
        Intrinsics.checkNotNullParameter(adSkipCountdownButton, "adSkipCountdownButton");
        Intrinsics.checkNotNullParameter(adSkipCountdownButtonForEndcards, "adSkipCountdownButtonForEndcards");
        Intrinsics.checkNotNullParameter(ctaButton, "ctaButton");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        Intrinsics.checkNotNullParameter(vastIcon, "vastIcon");
        Intrinsics.checkNotNullParameter(playbackControl, "playbackControl");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        return new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return n.a(j2, muteButton, adCloseCountdownButton, adSkipCountdownButton, adSkipCountdownButtonForEndcards, ctaButton, iVar, progressBar, vastIcon, playbackControl, viewVisibilityTracker, z, (Context) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i) obj2);
            }
        };
    }

    public static final ComposeView a(long j2, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i iVar, Function2 function26, Function2 function27, Function2 function28, Q q, boolean z, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i adViewModel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adViewModel, "adViewModel");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setId(R.id.moloco_fullscreen_ad_view_id);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1482604196, true, new o(adViewModel, j2, function2, function22, function23, function24, function25, iVar, function26, function27, function28, q, z)));
        return composeView;
    }

    public static final Function7<BoxScope, Boolean, Boolean, Function2<? super a.AbstractC0383a.c, ? super a.AbstractC0383a.c.EnumC0385a, Unit>, Function1<? super Boolean, Unit>, Composer, Integer, Unit> a(long j2, long j3, Shape shape, long j4, Alignment alignment, PaddingValues paddingValues, long j5, Painter painter, Painter painter2, Function0<Unit> function0, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(447650301);
        long b2 = (i3 & 1) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j2;
        long j6 = (i3 & 2) != 0 ? b2 : j3;
        Shape f2 = (i3 & 4) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f() : shape;
        long e2 = (i3 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e() : j4;
        Alignment topStart = (i3 & 16) != 0 ? Alignment.INSTANCE.getTopStart() : alignment;
        PaddingValues m578PaddingValues0680j_4 = (i3 & 32) != 0 ? PaddingKt.m578PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : paddingValues;
        long m1324getPrimary0d7_KjU = (i3 & 64) != 0 ? MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1324getPrimary0d7_KjU() : j5;
        Painter painterResource = (i3 & 128) != 0 ? PainterResources_androidKt.painterResource(R.drawable.ic_round_volume_off_24, composer, 0) : painter;
        Painter painterResource2 = (i3 & 256) != 0 ? PainterResources_androidKt.painterResource(R.drawable.ic_round_volume_up_24, composer, 0) : painter2;
        Function0<Unit> function02 = (i3 & 512) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(447650301, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultMuteButton (VastRenderer.kt:235)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -545982054, true, new f(topStart, m578PaddingValues0680j_4, painterResource, painterResource2, function02, m1324getPrimary0d7_KjU, b2, j6, f2, e2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC0383a.c, Unit>, Function0<Unit>, Composer, Integer, Unit> a(Alignment alignment, PaddingValues paddingValues, long j2, String str, String str2, Function0<Unit> function0, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-926425258);
        if ((i3 & 1) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        Alignment alignment2 = alignment;
        if ((i3 & 2) != 0) {
            paddingValues = PaddingKt.m578PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a());
        }
        PaddingValues paddingValues2 = paddingValues;
        if ((i3 & 4) != 0) {
            j2 = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1324getPrimary0d7_KjU();
        }
        long j3 = j2;
        String stringResource = (i3 & 8) != 0 ? StringResources_androidKt.stringResource(R.string.com_moloco_sdk_xenoss_player_learn_more, composer, 0) : str;
        String str3 = (i3 & 16) != 0 ? null : str2;
        Function0<Unit> function02 = (i3 & 32) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-926425258, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton (VastRenderer.kt:303)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 432764356, true, new e(alignment2, paddingValues2, str3, stringResource, j3, function02));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final Function5<BoxScope, Boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i, Composer, Integer, Unit> a(Alignment alignment, PaddingValues paddingValues, long j2, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(716005120);
        if ((i3 & 1) != 0) {
            alignment = Alignment.INSTANCE.getBottomCenter();
        }
        if ((i3 & 2) != 0) {
            paddingValues = PaddingKt.m578PaddingValues0680j_4(Dp.m4440constructorimpl(0));
        }
        if ((i3 & 4) != 0) {
            j2 = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1324getPrimary0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(716005120, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar (VastRenderer.kt:378)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 1967084142, true, new g(alignment, paddingValues, j2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    public static final i.a a(State<? extends i.a> state) {
        return state.getValue();
    }
}

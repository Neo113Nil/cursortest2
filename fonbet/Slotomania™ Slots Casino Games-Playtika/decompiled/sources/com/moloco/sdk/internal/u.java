package com.moloco.sdk.internal;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.RendererCapabilities;
import com.moloco.sdk.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes2.dex */
public final class u {
    public static final long a = ColorKt.Color(4278354171L);

    public static final class a implements Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC0383a.c, ? extends Unit>, Function0<? extends Unit>, Composer, Integer, Unit> {
        public final /* synthetic */ Alignment a;
        public final /* synthetic */ PaddingValues b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;

        /* renamed from: com.moloco.sdk.internal.u$a$a, reason: collision with other inner class name */
        public static final class C0265a implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
            public final /* synthetic */ Function1<a.AbstractC0383a.c, Unit> a;
            public final /* synthetic */ State<i.a> b;
            public final /* synthetic */ String c;
            public final /* synthetic */ String d;
            public final /* synthetic */ long e;
            public final /* synthetic */ long f;
            public final /* synthetic */ Function0<Unit> g;

            /* renamed from: com.moloco.sdk.internal.u$a$a$a, reason: collision with other inner class name */
            public static final class C0266a implements Function3<Modifier, Composer, Integer, Unit> {
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ Function0<Unit> e;

                public C0266a(String str, String str2, long j, long j2, Function0<Unit> function0) {
                    this.a = str;
                    this.b = str2;
                    this.c = j;
                    this.d = j2;
                    this.e = function0;
                }

                public final void a(Modifier it, Composer composer, int i) {
                    int i2;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i & 6) == 0) {
                        i2 = (composer.changed(it) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1938502477, i2, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous>.<anonymous> (MolocoVastCTA.kt:73)");
                    }
                    u.a(it, this.a, this.b, this.c, this.d, this.e, composer, i2 & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
                    a(modifier, composer, num.intValue());
                    return Unit.INSTANCE;
                }
            }

            /* renamed from: com.moloco.sdk.internal.u$a$a$b */
            public static final class b implements Function3<Modifier, Composer, Integer, Unit> {
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ Function0<Unit> e;

                public b(String str, String str2, long j, long j2, Function0<Unit> function0) {
                    this.a = str;
                    this.b = str2;
                    this.c = j;
                    this.d = j2;
                    this.e = function0;
                }

                public final void a(Modifier it, Composer composer, int i) {
                    int i2;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i & 6) == 0) {
                        i2 = (composer.changed(it) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-868048676, i2, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous>.<anonymous> (MolocoVastCTA.kt:88)");
                    }
                    u.a(it, this.a, this.b, this.c, this.d, this.e, composer, i2 & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
                    a(modifier, composer, num.intValue());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0265a(Function1<? super a.AbstractC0383a.c, Unit> function1, State<? extends i.a> state, String str, String str2, long j, long j2, Function0<Unit> function0) {
                this.a = function1;
                this.b = state;
                this.c = str;
                this.d = str2;
                this.e = j;
                this.f = j2;
                this.g = function0;
            }

            public final void a(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-657845797, i, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous>.<anonymous> (MolocoVastCTA.kt:67)");
                }
                i.a b2 = a.b(this.b);
                if (b2 instanceof i.a.C0352a) {
                    composer.startReplaceableGroup(-388729961);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z.a(null, a.AbstractC0383a.c.EnumC0385a.g, this.a, ComposableLambdaKt.composableLambda(composer, -1938502477, true, new C0266a(this.c, this.d, this.e, this.f, this.g)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.c) {
                    composer.startReplaceableGroup(-388168489);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.z.a(null, a.AbstractC0383a.c.EnumC0385a.g, this.a, ComposableLambdaKt.composableLambda(composer, -868048676, true, new b(this.c, this.d, this.e, this.f, this.g)), composer, 3120, 1);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.b) {
                    composer.startReplaceableGroup(-387625710);
                    composer.endReplaceableGroup();
                } else if (b2 instanceof i.a.d) {
                    composer.startReplaceableGroup(-387568174);
                    composer.endReplaceableGroup();
                } else {
                    if (b2 != null) {
                        composer.startReplaceableGroup(-843825115);
                        composer.endReplaceableGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceableGroup(-387533485);
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
        }

        public a(Alignment alignment, PaddingValues paddingValues, String str, String str2, long j, long j2) {
            this.a = alignment;
            this.b = paddingValues;
            this.c = str;
            this.d = str2;
            this.e = j;
            this.f = j2;
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
                ComposerKt.traceEventStart(-927135997, i, -1, "com.moloco.sdk.internal.molocoCTAButton.<anonymous> (MolocoVastCTA.kt:49)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, PaddingKt.padding(WindowInsetsPadding_androidKt.displayCutoutPadding(boxScope.align(Modifier.INSTANCE, this.a)), this.b), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, -657845797, true, new C0265a(onButtonRendered, SnapshotStateKt.collectAsState(currentAdPartFlow, null, composer, (i >> 6) & 14, 1), this.c, this.d, this.e, this.f, onCTA)), composer, ((i >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final Unit a(Modifier modifier, String str, String str2, long j, long j2, Function0 function0, int i, int i2, Composer composer, int i3) {
        a(modifier, str, str2, j, j2, (Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Function7<BoxScope, Boolean, StateFlow<? extends i.a>, Function1<? super a.AbstractC0383a.c, Unit>, Function0<Unit>, Composer, Integer, Unit> a(Alignment alignment, PaddingValues paddingValues, String str, long j, long j2, String str2, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(959702933);
        if ((i2 & 1) != 0) {
            alignment = Alignment.INSTANCE.getBottomEnd();
        }
        Alignment alignment2 = alignment;
        if ((i2 & 2) != 0) {
            paddingValues = PaddingKt.m578PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a());
        }
        PaddingValues paddingValues2 = paddingValues;
        if ((i2 & 4) != 0) {
            str = StringResources_androidKt.stringResource(R.string.com_moloco_sdk_xenoss_player_learn_more, composer, 0);
        }
        String str3 = str;
        long m2149getWhite0d7_KjU = (i2 & 8) != 0 ? Color.INSTANCE.m2149getWhite0d7_KjU() : j;
        long j3 = (i2 & 16) != 0 ? a : j2;
        String str4 = (i2 & 32) != 0 ? null : str2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(959702933, i, -1, "com.moloco.sdk.internal.molocoCTAButton (MolocoVastCTA.kt:48)");
        }
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -927135997, true, new a(alignment2, paddingValues2, str4, str3, m2149getWhite0d7_KjU, j3));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return composableLambda;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(Modifier modifier, String str, final String str2, final long j, final long j2, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str3;
        String str4;
        long j3;
        long j4;
        Function0<Unit> function02;
        int currentCompositeKeyHash;
        Composer m1642constructorimpl;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(2035340272);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str3 = str;
            i3 |= startRestartGroup.changed(str3) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
                str4 = str2;
            } else {
                str4 = str2;
                if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
                    i3 |= startRestartGroup.changed(str4) ? 256 : 128;
                }
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
                j3 = j;
            } else {
                j3 = j;
                if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changed(j3) ? 2048 : 1024;
                }
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
                j4 = j2;
            } else {
                j4 = j2;
                if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(j4) ? 16384 : 8192;
                }
            }
            if ((i2 & 32) == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
                if ((74899 & i3) != 74898 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                    composer2 = startRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                    if (i5 != 0) {
                        str3 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2035340272, i3, -1, "com.moloco.sdk.internal.MolocoVastCTA (MolocoVastCTA.kt:114)");
                    }
                    float f = 4;
                    RoundedCornerShape m855RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m855RoundedCornerShape0680j_4(Dp.m4440constructorimpl(f));
                    Modifier m267clickableXHw0xAI$default = ClickableKt.m267clickableXHw0xAI$default(AnimationModifierKt.animateContentSize$default(BackgroundKt.m233backgroundbw27NRU$default(ClipKt.clip(SizeKt.m641widthInVpY3zN4$default(modifier4, 0.0f, Dp.m4440constructorimpl(164), 1, null), m855RoundedCornerShape0680j_4), j4, null, 2, null), null, null, 3, null), false, "CTA", Role.m3760boximpl(Role.INSTANCE.m3767getButtono7Vup1c()), function02, 1, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    startRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m267clickableXHw0xAI$default);
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
                    Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!m1642constructorimpl.getInserting() || !Intrinsics.areEqual(m1642constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-118884691);
                    if (str3 != null) {
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion2, Dp.m4440constructorimpl(f)), startRestartGroup, 6);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.k.a(str3, ContentScale.INSTANCE.getFit(), ClipKt.clip(SizeKt.m634size3ABfNKs(companion2, Dp.m4440constructorimpl(36)), m855RoundedCornerShape0680j_4), startRestartGroup, ((i3 >> 3) & 14) | 48);
                    }
                    startRestartGroup.endReplaceableGroup();
                    composer2 = startRestartGroup;
                    TextKt.m1591TextfLXpl1I(str4, PaddingKt.m586paddingVpY3zN4(Modifier.INSTANCE, Dp.m4440constructorimpl(15), Dp.m4440constructorimpl(12)), j3, 0L, null, FontWeight.INSTANCE.getBold(), FontFamily.INSTANCE.getDefault(), 0L, null, null, 0L, 0, false, 1, null, null, composer2, ((i3 >> 6) & 14) | 196656 | ((i3 >> 3) & 896), 3072, 57240);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                final String str5 = str3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.internal.u$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return u.a(Modifier.this, str5, str2, j, j2, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            if ((74899 & i3) != 74898) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float f2 = 4;
            RoundedCornerShape m855RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m855RoundedCornerShape0680j_4(Dp.m4440constructorimpl(f2));
            Modifier m267clickableXHw0xAI$default2 = ClickableKt.m267clickableXHw0xAI$default(AnimationModifierKt.animateContentSize$default(BackgroundKt.m233backgroundbw27NRU$default(ClipKt.clip(SizeKt.m641widthInVpY3zN4$default(modifier4, 0.0f, Dp.m4440constructorimpl(164), 1, null), m855RoundedCornerShape0680j_42), j4, null, 2, null), null, null, 3, null), false, "CTA", Role.m3760boximpl(Role.INSTANCE.m3767getButtono7Vup1c()), function02, 1, null);
            Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m267clickableXHw0xAI$default2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (!m1642constructorimpl.getInserting()) {
            }
            m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
            modifierMaterializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-118884691);
            if (str3 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            TextKt.m1591TextfLXpl1I(str4, PaddingKt.m586paddingVpY3zN4(Modifier.INSTANCE, Dp.m4440constructorimpl(15), Dp.m4440constructorimpl(12)), j3, 0L, null, FontWeight.INSTANCE.getBold(), FontFamily.INSTANCE.getDefault(), 0L, null, null, 0L, 0, false, 1, null, null, composer2, ((i3 >> 6) & 14) | 196656 | ((i3 >> 3) & 896), 3072, 57240);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
            final String str52 = str3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str3 = str;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        function02 = function0;
        if ((74899 & i3) != 74898) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        float f22 = 4;
        RoundedCornerShape m855RoundedCornerShape0680j_422 = RoundedCornerShapeKt.m855RoundedCornerShape0680j_4(Dp.m4440constructorimpl(f22));
        Modifier m267clickableXHw0xAI$default22 = ClickableKt.m267clickableXHw0xAI$default(AnimationModifierKt.animateContentSize$default(BackgroundKt.m233backgroundbw27NRU$default(ClipKt.clip(SizeKt.m641widthInVpY3zN4$default(modifier4, 0.0f, Dp.m4440constructorimpl(164), 1, null), m855RoundedCornerShape0680j_422), j4, null, 2, null), null, null, 3, null), false, "CTA", Role.m3760boximpl(Role.INSTANCE.m3767getButtono7Vup1c()), function02, 1, null);
        Arrangement.HorizontalOrVertical center22 = Arrangement.INSTANCE.getCenter();
        Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(center22, centerVertically22, startRestartGroup, 54);
        startRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(m267clickableXHw0xAI$default22);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
        Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy22, companion32.getSetMeasurePolicy());
        Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = companion32.getSetCompositeKeyHash();
        if (!m1642constructorimpl.getInserting()) {
        }
        m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        modifierMaterializerOf22.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-118884691);
        if (str3 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        composer2 = startRestartGroup;
        TextKt.m1591TextfLXpl1I(str4, PaddingKt.m586paddingVpY3zN4(Modifier.INSTANCE, Dp.m4440constructorimpl(15), Dp.m4440constructorimpl(12)), j3, 0L, null, FontWeight.INSTANCE.getBold(), FontFamily.INSTANCE.getDefault(), 0L, null, null, 0L, 0, false, 1, null, null, composer2, ((i3 >> 6) & 14) | 196656 | ((i3 >> 3) & 896), 3072, 57240);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4;
        final String str522 = str3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final long a() {
        return a;
    }
}

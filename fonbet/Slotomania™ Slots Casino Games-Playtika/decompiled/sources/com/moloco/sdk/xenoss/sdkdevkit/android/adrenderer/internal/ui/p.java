package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class p {

    public static final class a implements Function3<q, Composer, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p$a$a, reason: collision with other inner class name */
        public static final class C0329a implements Function3<RowScope, Composer, Integer, Unit> {
            public final /* synthetic */ q a;
            public final /* synthetic */ long b;
            public final /* synthetic */ TextStyle c;

            public C0329a(q qVar, long j, TextStyle textStyle) {
                this.a = qVar;
                this.b = j;
                this.c = textStyle;
            }

            public final void a(RowScope TextButton, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(171301213, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CountdownButton.<anonymous>.<anonymous>.<anonymous> (CountdownButton.kt:87)");
                }
                TextKt.m1591TextfLXpl1I(((q.c) this.a).a(), null, 0L, this.b, null, null, null, 0L, null, TextAlign.m4325boximpl(TextAlign.INSTANCE.m4332getCentere0LSkKk()), 0L, 0, false, 1, null, this.c, composer, 0, 3072, 24054);
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

        public a(Function0<Unit> function0, boolean z, long j, long j2, long j3) {
            this.a = function0;
            this.b = z;
            this.c = j;
            this.d = j2;
            this.e = j3;
        }

        public final void a(q buttonPart, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(buttonPart, "buttonPart");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(buttonPart) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1810312736, i2, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CountdownButton.<anonymous>.<anonymous> (CountdownButton.kt:59)");
            }
            TextStyle h6 = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH6();
            if (buttonPart instanceof q.a) {
                composer.startReplaceableGroup(1000266506);
                composer.endReplaceableGroup();
            } else if (buttonPart instanceof q.b) {
                composer.startReplaceableGroup(1000608622);
                q.b bVar = (q.b) buttonPart;
                t.a(bVar.e(), this.a, null, this.b, bVar.c(), this.c, this.d, bVar.d(), bVar.b(), bVar.a(), composer, 0, 4);
                composer.endReplaceableGroup();
            } else if (buttonPart instanceof q.c) {
                composer.startReplaceableGroup(-1491723097);
                Function0<Unit> function0 = this.a;
                boolean z = this.b;
                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                long j = this.c;
                ButtonKt.TextButton(function0, null, z, null, null, null, null, buttonDefaults.m1283textButtonColorsRGew2ao(0L, j, j, composer, ButtonDefaults.$stable << 9, 1), null, ComposableLambdaKt.composableLambda(composer, 171301213, true, new C0329a(buttonPart, this.e, h6)), composer, C.ENCODING_PCM_32BIT, 378);
                composer.endReplaceableGroup();
            } else {
                if (!(buttonPart instanceof q.d)) {
                    composer.startReplaceableGroup(-1491754012);
                    composer.endReplaceableGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceableGroup(1001871283);
                q.d dVar = (q.d) buttonPart;
                long d = TextUnit.m4628equalsimpl0(dVar.d(), TextUnit.INSTANCE.m4642getUnspecifiedXSAIIZE()) ? this.e : dVar.d();
                x.a(dVar.h(), dVar.g(), dVar.c(), dVar.f(), dVar.b(), dVar.a(), DpKt.m4462DpSizeYgX7TsA(Dp.m4440constructorimpl(120), Dp.m4440constructorimpl(20)), dVar.e(), dVar.i(), dVar.j(), d, this.a, composer, 1572864, 0, 0);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(q qVar, Composer composer, Integer num) {
            a(qVar, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    public static final Unit a(q qVar, Modifier modifier, Function0 function0, boolean z, long j, long j2, long j3, com.moloco.sdk.internal.ortb.model.k kVar, Function0 function02, int i, int i2, Composer composer, int i3) {
        a(qVar, modifier, function0, z, j, j2, j3, kVar, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0236 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final q countdownButtonPart, Modifier modifier, final Function0<Unit> onClick, final boolean z, long j, long j2, long j3, final com.moloco.sdk.internal.ortb.model.k kVar, final Function0<Unit> onTimerFinish, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z2;
        long j4;
        int i4;
        int i5;
        long b;
        long d;
        int currentCompositeKeyHash;
        Composer m1642constructorimpl;
        Composer composer2;
        final Modifier modifier3;
        Composer composer3;
        final long j5;
        final long j6;
        final long j7;
        q.a aVar;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Intrinsics.checkNotNullParameter(countdownButtonPart, "countdownButtonPart");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        Composer startRestartGroup = composer.startRestartGroup(1730954989);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(countdownButtonPart) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
                i3 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j4 = j;
                        if (startRestartGroup.changed(j4)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        j4 = j;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    j4 = j;
                }
                i4 = i2 & 32;
                if (i4 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    i3 |= startRestartGroup.changed(j2) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(j3) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(kVar) ? 8388608 : 4194304;
                }
                if ((i2 & 256) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changedInstance(onTimerFinish) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((38347923 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 16) != 0) {
                            j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable).m1324getPrimary0d7_KjU();
                            i3 &= -57345;
                        }
                        b = i4 != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j2;
                        if (i5 != 0) {
                            d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.d();
                            Modifier modifier4 = modifier2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1730954989, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.CountdownButton (CountdownButton.kt:38)");
                            }
                            Modifier m635size6HolHcs = SizeKt.m635size6HolHcs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), b);
                            Alignment topEnd = Alignment.INSTANCE.getTopEnd();
                            startRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topEnd, false, startRestartGroup, 6);
                            startRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            long j8 = b;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m635size6HolHcs);
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
                            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (!m1642constructorimpl.getInserting() || !Intrinsics.areEqual(m1642constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceableGroup(523924163);
                            if ((countdownButtonPart instanceof q.a) && kVar != null) {
                                aVar = (q.a) countdownButtonPart;
                                if (aVar.b()) {
                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a(kVar, aVar.c(), aVar.a(), onTimerFinish, startRestartGroup, ((i3 >> 21) & 14) | ((i3 >> 15) & 7168));
                                    composer2 = startRestartGroup;
                                    composer2.endReplaceableGroup();
                                    int i8 = i3;
                                    long j9 = j4;
                                    Composer composer4 = composer2;
                                    CrossfadeKt.Crossfade(countdownButtonPart, modifier4, (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambdaKt.composableLambda(composer2, 1810312736, true, new a(onClick, z2, j9, j8, d)), composer4, (i8 & 14) | 24576 | (i8 & 112), 12);
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    composer3 = composer4;
                                    j5 = j9;
                                    j6 = d;
                                    j7 = j8;
                                }
                            }
                            composer2 = startRestartGroup;
                            composer2.endReplaceableGroup();
                            int i82 = i3;
                            long j92 = j4;
                            Composer composer42 = composer2;
                            CrossfadeKt.Crossfade(countdownButtonPart, modifier4, (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambdaKt.composableLambda(composer2, 1810312736, true, new a(onClick, z2, j92, j8, d)), composer42, (i82 & 14) | 24576 | (i82 & 112), 12);
                            composer42.endReplaceableGroup();
                            composer42.endNode();
                            composer42.endReplaceableGroup();
                            composer42.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                            composer3 = composer42;
                            j5 = j92;
                            j6 = d;
                            j7 = j8;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        b = j2;
                    }
                    d = j3;
                    Modifier modifier42 = modifier2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier m635size6HolHcs2 = SizeKt.m635size6HolHcs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), b);
                    Alignment topEnd2 = Alignment.INSTANCE.getTopEnd();
                    startRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(topEnd2, false, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    long j82 = b;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m635size6HolHcs2);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!m1642constructorimpl.getInserting()) {
                    }
                    m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    modifierMaterializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceableGroup(523924163);
                    if (countdownButtonPart instanceof q.a) {
                        aVar = (q.a) countdownButtonPart;
                        if (aVar.b()) {
                        }
                    }
                    composer2 = startRestartGroup;
                    composer2.endReplaceableGroup();
                    int i822 = i3;
                    long j922 = j4;
                    Composer composer422 = composer2;
                    CrossfadeKt.Crossfade(countdownButtonPart, modifier42, (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambdaKt.composableLambda(composer2, 1810312736, true, new a(onClick, z2, j922, j82, d)), composer422, (i822 & 14) | 24576 | (i822 & 112), 12);
                    composer422.endReplaceableGroup();
                    composer422.endNode();
                    composer422.endReplaceableGroup();
                    composer422.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier42;
                    composer3 = composer422;
                    j5 = j922;
                    j6 = d;
                    j7 = j82;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    composer3 = startRestartGroup;
                    modifier3 = modifier2;
                    j5 = j4;
                    j7 = j2;
                    j6 = j3;
                }
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return p.a(q.this, modifier3, onClick, z, j5, j7, j6, kVar, onTimerFinish, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            i4 = i2 & 32;
            if (i4 != 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            if ((38347923 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            d = j3;
            Modifier modifier422 = modifier2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier m635size6HolHcs22 = SizeKt.m635size6HolHcs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), b);
            Alignment topEnd22 = Alignment.INSTANCE.getTopEnd();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(topEnd22, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            long j822 = b;
            Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(m635size6HolHcs22);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = companion22.getSetCompositeKeyHash();
            if (!m1642constructorimpl.getInserting()) {
            }
            m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            modifierMaterializerOf22.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(523924163);
            if (countdownButtonPart instanceof q.a) {
            }
            composer2 = startRestartGroup;
            composer2.endReplaceableGroup();
            int i8222 = i3;
            long j9222 = j4;
            Composer composer4222 = composer2;
            CrossfadeKt.Crossfade(countdownButtonPart, modifier422, (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambdaKt.composableLambda(composer2, 1810312736, true, new a(onClick, z2, j9222, j822, d)), composer4222, (i8222 & 14) | 24576 | (i8222 & 112), 12);
            composer4222.endReplaceableGroup();
            composer4222.endNode();
            composer4222.endReplaceableGroup();
            composer4222.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier422;
            composer3 = composer4222;
            j5 = j9222;
            j6 = d;
            j7 = j822;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        if ((38347923 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        d = j3;
        Modifier modifier4222 = modifier2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m635size6HolHcs222 = SizeKt.m635size6HolHcs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), b);
        Alignment topEnd222 = Alignment.INSTANCE.getTopEnd();
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy222 = BoxKt.rememberBoxMeasurePolicy(topEnd222, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
        long j8222 = b;
        Function0<ComposeUiNode> constructor222 = companion222.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(m635size6HolHcs222);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy222, companion222.getSetMeasurePolicy());
        Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap222, companion222.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = companion222.getSetCompositeKeyHash();
        if (!m1642constructorimpl.getInserting()) {
        }
        m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        modifierMaterializerOf222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(523924163);
        if (countdownButtonPart instanceof q.a) {
        }
        composer2 = startRestartGroup;
        composer2.endReplaceableGroup();
        int i82222 = i3;
        long j92222 = j4;
        Composer composer42222 = composer2;
        CrossfadeKt.Crossfade(countdownButtonPart, modifier4222, (FiniteAnimationSpec<Float>) null, (String) null, ComposableLambdaKt.composableLambda(composer2, 1810312736, true, new a(onClick, z2, j92222, j8222, d)), composer42222, (i82222 & 14) | 24576 | (i82222 & 112), 12);
        composer42222.endReplaceableGroup();
        composer42222.endNode();
        composer42222.endReplaceableGroup();
        composer42222.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4222;
        composer3 = composer42222;
        j5 = j92222;
        j6 = d;
        j7 = j8222;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}

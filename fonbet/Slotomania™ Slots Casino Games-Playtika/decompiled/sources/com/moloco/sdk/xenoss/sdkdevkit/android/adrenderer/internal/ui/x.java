package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.moloco.sdk.R;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x {

    public static final class a implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ float a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ String f;
        public final /* synthetic */ long g;
        public final /* synthetic */ long h;
        public final /* synthetic */ long i;
        public final /* synthetic */ Painter j;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x$a$a, reason: collision with other inner class name */
        public static final class C0335a implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ long a;
            public final /* synthetic */ Painter b;
            public final /* synthetic */ String c;
            public final /* synthetic */ long d;

            public C0335a(long j, Painter painter, String str, long j2) {
                this.a = j;
                this.b = painter;
                this.c = str;
                this.d = j2;
            }

            public final void a(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(367056260, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButton.<anonymous>.<anonymous>.<anonymous> (TextIconButton.kt:75)");
                }
                IconKt.m1421Iconww6aTOc(this.b, this.c, SizeKt.m635size6HolHcs(Modifier.INSTANCE, this.a), this.d, composer, 0, 0);
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

        public static final class b implements Function2<Composer, Integer, Unit> {
            public final /* synthetic */ String a;
            public final /* synthetic */ long b;
            public final /* synthetic */ long c;

            public b(String str, long j, long j2) {
                this.a = str;
                this.b = j;
                this.c = j2;
            }

            public final void a(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-618324232, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButton.<anonymous>.<anonymous>.<anonymous> (TextIconButton.kt:67)");
                }
                TextKt.m1591TextfLXpl1I(this.a, OffsetKt.m546offsetVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m4440constructorimpl(-1), 1, null), this.b, this.c, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 48, 0, 65520);
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

        public a(float f, String str, Function0<Unit> function0, boolean z, boolean z2, String str2, long j, long j2, long j3, Painter painter) {
            this.a = f;
            this.b = str;
            this.c = function0;
            this.d = z;
            this.e = z2;
            this.f = str2;
            this.g = j;
            this.h = j2;
            this.i = j3;
            this.j = painter;
        }

        public final void a(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1541935208, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButton.<anonymous> (TextIconButton.kt:52)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier m586paddingVpY3zN4 = PaddingKt.m586paddingVpY3zN4(SizeKt.m622heightInVpY3zN4$default(companion, this.a, 0.0f, 2, null), Dp.m4440constructorimpl(10), Dp.m4440constructorimpl(6));
            Indication m1610rememberRipple9IZ8Weo = RippleKt.m1610rememberRipple9IZ8Weo(true, 0.0f, 0L, composer, 6, 6);
            composer.startReplaceableGroup(1151230561);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier m265clickableO2vRcR0$default = ClickableKt.m265clickableO2vRcR0$default(m586paddingVpY3zN4, (MutableInteractionSource) rememberedValue, m1610rememberRipple9IZ8Weo, false, this.b, Role.m3760boximpl(Role.INSTANCE.m3767getButtono7Vup1c()), this.c, 4, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            boolean z = this.d;
            boolean z2 = this.e;
            String str = this.f;
            long j = this.g;
            long j2 = this.h;
            long j3 = this.i;
            Painter painter = this.j;
            String str2 = this.b;
            composer.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m265clickableO2vRcR0$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer);
            Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1642constructorimpl.getInserting() || !Intrinsics.areEqual(m1642constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, -618324232, true, new b(str, j, j2));
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer, 367056260, true, new C0335a(j3, painter, str2, j));
            if (z) {
                composer.startReplaceableGroup(774006835);
                composableLambda.invoke(composer, 6);
                if (z2) {
                    SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion, Dp.m4440constructorimpl(4)), composer, 6);
                    composableLambda2.invoke(composer, 6);
                }
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(774193331);
                composer.startReplaceableGroup(717711159);
                if (z2) {
                    composableLambda2.invoke(composer, 6);
                    SpacerKt.Spacer(SizeKt.m639width3ABfNKs(companion, Dp.m4440constructorimpl(4)), composer, 6);
                }
                composer.endReplaceableGroup();
                composableLambda.invoke(composer, 6);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
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

    public static final Unit a(int i, Composer composer, int i2) {
        a(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a(String str, Painter painter, String str2, long j, Shape shape, long j2, long j3, long j4, boolean z, boolean z2, long j5, Function0 function0, int i, int i2, int i3, Composer composer, int i4) {
        a(str, painter, str2, j, shape, j2, j3, j4, z, z2, j5, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String text, Painter painter, final String str, final long j, final Shape backgroundShape, final long j2, final long j3, final long j4, boolean z, boolean z2, long j5, final Function0<Unit> onClick, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        String str2;
        long j6;
        long j7;
        long j8;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        Painter painter2;
        boolean z4;
        int i10;
        Composer composer2;
        boolean z5;
        long m4642getUnspecifiedXSAIIZE;
        Painter painter3;
        final Painter painter4;
        Composer composer3;
        final boolean z6;
        final long j9;
        final boolean z7;
        int i11;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(backgroundShape, "backgroundShape");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-2051575724);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            if ((i3 & 2) == 0 && startRestartGroup.changedInstance(painter)) {
                i11 = 32;
                i4 |= i11;
            }
            i11 = 16;
            i4 |= i11;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            str2 = str;
            i4 |= startRestartGroup.changed(str2) ? 256 : 128;
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                j6 = j;
                i4 |= startRestartGroup.changed(j6) ? 2048 : 1024;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changed(backgroundShape) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(j2) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                    j7 = j3;
                } else {
                    j7 = j3;
                    if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(j7) ? 1048576 : 524288;
                    }
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                    j8 = j4;
                } else {
                    j8 = j4;
                    if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(j8) ? 8388608 : 4194304;
                    }
                }
                i5 = i3 & 256;
                if (i5 != 0) {
                    i4 |= 100663296;
                    z3 = z;
                } else {
                    z3 = z;
                    if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                }
                i6 = i3 & 512;
                if (i6 != 0) {
                    i4 |= C.ENCODING_PCM_32BIT;
                } else if ((i & C.ENCODING_PCM_32BIT) == 0) {
                    i4 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
                }
                i7 = i3 & 1024;
                if (i7 != 0) {
                    i9 = i2 | 6;
                    i8 = i7;
                } else {
                    i8 = i7;
                    if ((i2 & 6) == 0) {
                        i9 = i2 | (startRestartGroup.changed(j5) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                }
                if ((i3 & 2048) != 0) {
                    i9 |= 48;
                } else if ((i2 & 48) == 0) {
                    i9 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
                    int i12 = i9;
                    if ((i4 & 306783379) != 306783378 && (i12 & 19) == 18 && startRestartGroup.getSkipping()) {
                        startRestartGroup.skipToGroupEnd();
                        painter4 = painter;
                        z6 = z2;
                        j9 = j5;
                        composer3 = startRestartGroup;
                        z7 = z3;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if ((i3 & 2) == 0) {
                                painter2 = PainterResources_androidKt.painterResource(R.drawable.double_arrow_24, startRestartGroup, 0);
                                i4 &= -113;
                            } else {
                                painter2 = painter;
                            }
                            if (i5 != 0) {
                                z3 = true;
                            }
                            boolean z8 = i6 == 0 ? true : z2;
                            if (i8 == 0) {
                                int i13 = i4;
                                z4 = z8;
                                i10 = i13;
                                composer2 = startRestartGroup;
                                z5 = z3;
                                m4642getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m4642getUnspecifiedXSAIIZE();
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    painter3 = painter2;
                                } else {
                                    painter3 = painter2;
                                    ComposerKt.traceEventStart(-2051575724, i10, i12, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButton (TextIconButton.kt:48)");
                                }
                                Painter painter5 = painter3;
                                Composer composer4 = composer2;
                                a aVar = new a(((Dp) ComparisonsKt.maxOf(Dp.m4438boximpl(DpSize.m4536getHeightD9Ej5fM(j7)), Dp.m4438boximpl(DpSize.m4536getHeightD9Ej5fM(j6)))).m4454unboximpl(), str2, onClick, z5, z4, text, j8, m4642getUnspecifiedXSAIIZE, j6, painter5);
                                boolean z9 = z5;
                                boolean z10 = z4;
                                long j10 = m4642getUnspecifiedXSAIIZE;
                                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer4, -1541935208, true, aVar);
                                int i14 = i10 >> 9;
                                SurfaceKt.m1520SurfaceFjzlyU(null, backgroundShape, j2, 0L, null, 0.0f, composableLambda, composer4, (i14 & 112) | 1572864 | (i14 & 896), 57);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                painter4 = painter5;
                                composer3 = composer4;
                                z6 = z10;
                                j9 = j10;
                                z7 = z9;
                            } else {
                                int i15 = i4;
                                z4 = z8;
                                i10 = i15;
                                composer2 = startRestartGroup;
                                z5 = z3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 2) != 0) {
                                i4 &= -113;
                            }
                            painter2 = painter;
                            composer2 = startRestartGroup;
                            i10 = i4;
                            z5 = z3;
                            z4 = z2;
                        }
                        m4642getUnspecifiedXSAIIZE = j5;
                        composer2.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Painter painter52 = painter3;
                        Composer composer42 = composer2;
                        a aVar2 = new a(((Dp) ComparisonsKt.maxOf(Dp.m4438boximpl(DpSize.m4536getHeightD9Ej5fM(j7)), Dp.m4438boximpl(DpSize.m4536getHeightD9Ej5fM(j6)))).m4454unboximpl(), str2, onClick, z5, z4, text, j8, m4642getUnspecifiedXSAIIZE, j6, painter52);
                        boolean z92 = z5;
                        boolean z102 = z4;
                        long j102 = m4642getUnspecifiedXSAIIZE;
                        ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer42, -1541935208, true, aVar2);
                        int i142 = i10 >> 9;
                        SurfaceKt.m1520SurfaceFjzlyU(null, backgroundShape, j2, 0L, null, 0.0f, composableLambda2, composer42, (i142 & 112) | 1572864 | (i142 & 896), 57);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        painter4 = painter52;
                        composer3 = composer42;
                        z6 = z102;
                        j9 = j102;
                        z7 = z92;
                    }
                    ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return x.a(text, painter4, str, j, backgroundShape, j2, j3, j4, z7, z6, j9, onClick, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                int i122 = i9;
                if ((i4 & 306783379) != 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if ((i3 & 2) == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (i8 == 0) {
                }
            }
            j6 = j;
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            i5 = i3 & 256;
            if (i5 != 0) {
            }
            i6 = i3 & 512;
            if (i6 != 0) {
            }
            i7 = i3 & 1024;
            if (i7 != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            int i1222 = i9;
            if ((i4 & 306783379) != 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if ((i3 & 2) == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if (i8 == 0) {
            }
        }
        str2 = str;
        if ((i3 & 8) == 0) {
        }
        j6 = j;
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        i5 = i3 & 256;
        if (i5 != 0) {
        }
        i6 = i3 & 512;
        if (i6 != 0) {
        }
        i7 = i3 & 1024;
        if (i7 != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        int i12222 = i9;
        if ((i4 & 306783379) != 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if ((i3 & 2) == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if (i8 == 0) {
        }
    }

    public static final void a(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-863217207);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-863217207, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.TextIconButtonPreview (TextIconButton.kt:105)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.c.a(false, o.a.a(), startRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.x$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return x.a(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}

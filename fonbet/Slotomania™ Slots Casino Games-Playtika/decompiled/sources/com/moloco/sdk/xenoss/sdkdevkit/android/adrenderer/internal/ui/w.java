package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: classes6.dex */
public final class w {
    public static final Unit a(float f, long j, long j2, int i, int i2, Composer composer, int i3) {
        a(f, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit a(float f, int i, float f2, long j, long j2, int i2, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        a(f, i, f2, j, j2, i2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0296 A[LOOP:0: B:66:0x01fb->B:70:0x0296, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a2 A[EDGE_INSN: B:71:0x02a2->B:72:0x02a2 BREAK  A[LOOP:0: B:66:0x01fb->B:70:0x0296], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(float f, int i, float f2, long j, long j2, int i2, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        float f3;
        int i8;
        long j3;
        int i9;
        long j4;
        int i10;
        int i11;
        float f4;
        int currentCompositeKeyHash;
        Composer m1642constructorimpl;
        long j5;
        long j6;
        final int i12;
        final int i13;
        final float f5;
        final long j7;
        final Modifier modifier2;
        final long j8;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-293854230);
        int i14 = i4 & 1;
        if (i14 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(f) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 = i;
            i5 |= startRestartGroup.changed(i6) ? 32 : 16;
            i7 = i4 & 4;
            if (i7 == 0) {
                i5 |= RendererCapabilities.MODE_SUPPORT_MASK;
            } else if ((i3 & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
                f3 = f2;
                i5 |= startRestartGroup.changed(f3) ? 256 : 128;
                i8 = i4 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    j3 = j;
                    i5 |= startRestartGroup.changed(j3) ? 2048 : 1024;
                    i9 = i4 & 16;
                    if (i9 == 0) {
                        i5 |= 24576;
                        j4 = j2;
                    } else {
                        j4 = j2;
                        if ((i3 & 24576) == 0) {
                            i5 |= startRestartGroup.changed(j4) ? 16384 : 8192;
                        }
                    }
                    i10 = i4 & 32;
                    if (i10 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i5 |= startRestartGroup.changed(i2) ? 131072 : 65536;
                    }
                    i11 = i4 & 64;
                    if (i11 == 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 1572864) == 0) {
                        i5 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
                    }
                    if ((i5 & 599187) != 599186 && startRestartGroup.getSkipping()) {
                        startRestartGroup.skipToGroupEnd();
                        f4 = f;
                        i12 = i2;
                        i13 = i6;
                        j8 = j4;
                        f5 = f3;
                        j7 = j3;
                        modifier2 = modifier;
                    } else {
                        float f6 = i14 == 0 ? 4.8f : f;
                        if (i15 != 0) {
                            i6 = 5;
                        }
                        if (i7 != 0) {
                            f3 = Dp.m4440constructorimpl(12);
                        }
                        long m2149getWhite0d7_KjU = i8 == 0 ? Color.INSTANCE.m2149getWhite0d7_KjU() : j3;
                        long m2142getGray0d7_KjU = i9 == 0 ? Color.INSTANCE.m2142getGray0d7_KjU() : j4;
                        int i16 = i10 == 0 ? 9 : i2;
                        Modifier modifier3 = i11 == 0 ? Modifier.INSTANCE : modifier;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-293854230, i5, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.RatingBar (RatingBar.kt:32)");
                        }
                        int floor = (int) Math.floor(f6);
                        int roundToInt = MathKt.roundToInt(10.0f * f6) - (floor * 10);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        startRestartGroup.startReplaceableGroup(693286680);
                        f4 = f6;
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        long j9 = m2142getGray0d7_KjU;
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
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
                        startRestartGroup.startReplaceableGroup(1766999607);
                        if (1 > i6) {
                            int i17 = 1;
                            while (true) {
                                if (i17 <= floor) {
                                    startRestartGroup.startReplaceableGroup(-1057509157);
                                    IconKt.m1422Iconww6aTOc(StarKt.getStar(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m634size3ABfNKs(Modifier.INSTANCE, f3), m2149getWhite0d7_KjU, startRestartGroup, (i5 & 7168) | 48, 0);
                                    startRestartGroup.endReplaceableGroup();
                                    j5 = m2149getWhite0d7_KjU;
                                } else if (i17 == floor + 1 && 1 <= roundToInt && roundToInt < 10) {
                                    startRestartGroup.startReplaceableGroup(-1057117069);
                                    long j10 = m2149getWhite0d7_KjU;
                                    a(f3, j10, j9, startRestartGroup, (i5 >> 6) & 1022, 0);
                                    j5 = j10;
                                    startRestartGroup.endReplaceableGroup();
                                } else {
                                    j5 = m2149getWhite0d7_KjU;
                                    startRestartGroup.startReplaceableGroup(-1056869906);
                                    long j11 = j9;
                                    IconKt.m1422Iconww6aTOc(StarKt.getStar(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m634size3ABfNKs(Modifier.INSTANCE, f3), j11, startRestartGroup, ((i5 >> 3) & 7168) | 48, 0);
                                    j6 = j11;
                                    startRestartGroup.endReplaceableGroup();
                                    if (i17 != i6) {
                                        break;
                                    }
                                    i17++;
                                    m2149getWhite0d7_KjU = j5;
                                    j9 = j6;
                                }
                                j6 = j9;
                                if (i17 != i6) {
                                }
                            }
                        } else {
                            j5 = m2149getWhite0d7_KjU;
                            j6 = j9;
                        }
                        startRestartGroup.endReplaceableGroup();
                        SpacerKt.Spacer(SizeKt.m639width3ABfNKs(Modifier.INSTANCE, Dp.m4440constructorimpl(4)), startRestartGroup, 6);
                        TextKt.m1591TextfLXpl1I(String.valueOf(f4), null, Color.INSTANCE.m2149getWhite0d7_KjU(), TextUnitKt.getSp(i16), null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, RendererCapabilities.MODE_SUPPORT_MASK, 3072, 57330);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i12 = i16;
                        i13 = i6;
                        f5 = f3;
                        j7 = j5;
                        modifier2 = modifier3;
                        j8 = j6;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final float f7 = f4;
                        endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return w.a(f7, i13, f5, j7, j8, i12, modifier2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                j3 = j;
                i9 = i4 & 16;
                if (i9 == 0) {
                }
                i10 = i4 & 32;
                if (i10 == 0) {
                }
                i11 = i4 & 64;
                if (i11 == 0) {
                }
                if ((i5 & 599187) != 599186) {
                }
                if (i14 == 0) {
                }
                if (i15 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int floor2 = (int) Math.floor(f6);
                int roundToInt2 = MathKt.roundToInt(10.0f * f6) - (floor2 * 10);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                startRestartGroup.startReplaceableGroup(693286680);
                f4 = f6;
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                startRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                long j92 = m2142getGray0d7_KjU;
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier3);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
                Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!m1642constructorimpl.getInserting()) {
                }
                m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                modifierMaterializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(1766999607);
                if (1 > i6) {
                }
                startRestartGroup.endReplaceableGroup();
                SpacerKt.Spacer(SizeKt.m639width3ABfNKs(Modifier.INSTANCE, Dp.m4440constructorimpl(4)), startRestartGroup, 6);
                TextKt.m1591TextfLXpl1I(String.valueOf(f4), null, Color.INSTANCE.m2149getWhite0d7_KjU(), TextUnitKt.getSp(i16), null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, RendererCapabilities.MODE_SUPPORT_MASK, 3072, 57330);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                i12 = i16;
                i13 = i6;
                f5 = f3;
                j7 = j5;
                modifier2 = modifier3;
                j8 = j6;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f2;
            i8 = i4 & 8;
            if (i8 != 0) {
            }
            j3 = j;
            i9 = i4 & 16;
            if (i9 == 0) {
            }
            i10 = i4 & 32;
            if (i10 == 0) {
            }
            i11 = i4 & 64;
            if (i11 == 0) {
            }
            if ((i5 & 599187) != 599186) {
            }
            if (i14 == 0) {
            }
            if (i15 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int floor22 = (int) Math.floor(f6);
            int roundToInt22 = MathKt.roundToInt(10.0f * f6) - (floor22 * 10);
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            f4 = f6;
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
            long j922 = m2142getGray0d7_KjU;
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf22 = LayoutKt.modifierMaterializerOf(modifier3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy22, companion22.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = companion22.getSetCompositeKeyHash();
            if (!m1642constructorimpl.getInserting()) {
            }
            m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            modifierMaterializerOf22.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1766999607);
            if (1 > i6) {
            }
            startRestartGroup.endReplaceableGroup();
            SpacerKt.Spacer(SizeKt.m639width3ABfNKs(Modifier.INSTANCE, Dp.m4440constructorimpl(4)), startRestartGroup, 6);
            TextKt.m1591TextfLXpl1I(String.valueOf(f4), null, Color.INSTANCE.m2149getWhite0d7_KjU(), TextUnitKt.getSp(i16), null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, RendererCapabilities.MODE_SUPPORT_MASK, 3072, 57330);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            i12 = i16;
            i13 = i6;
            f5 = f3;
            j7 = j5;
            modifier2 = modifier3;
            j8 = j6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i;
        i7 = i4 & 4;
        if (i7 == 0) {
        }
        f3 = f2;
        i8 = i4 & 8;
        if (i8 != 0) {
        }
        j3 = j;
        i9 = i4 & 16;
        if (i9 == 0) {
        }
        i10 = i4 & 32;
        if (i10 == 0) {
        }
        i11 = i4 & 64;
        if (i11 == 0) {
        }
        if ((i5 & 599187) != 599186) {
        }
        if (i14 == 0) {
        }
        if (i15 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int floor222 = (int) Math.floor(f6);
        int roundToInt222 = MathKt.roundToInt(10.0f * f6) - (floor222 * 10);
        Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
        startRestartGroup.startReplaceableGroup(693286680);
        f4 = f6;
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor222 = companion222.getConstructor();
        long j9222 = m2142getGray0d7_KjU;
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf222 = LayoutKt.modifierMaterializerOf(modifier3);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
        Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy222, companion222.getSetMeasurePolicy());
        Updater.m1649setimpl(m1642constructorimpl, currentCompositionLocalMap222, companion222.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = companion222.getSetCompositeKeyHash();
        if (!m1642constructorimpl.getInserting()) {
        }
        m1642constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m1642constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        modifierMaterializerOf222.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1766999607);
        if (1 > i6) {
        }
        startRestartGroup.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m639width3ABfNKs(Modifier.INSTANCE, Dp.m4440constructorimpl(4)), startRestartGroup, 6);
        TextKt.m1591TextfLXpl1I(String.valueOf(f4), null, Color.INSTANCE.m2149getWhite0d7_KjU(), TextUnitKt.getSp(i16), null, null, null, 0L, null, null, 0L, 0, false, 1, null, null, startRestartGroup, RendererCapabilities.MODE_SUPPORT_MASK, 3072, 57330);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        i12 = i16;
        i13 = i6;
        f5 = f3;
        j7 = j5;
        modifier2 = modifier3;
        j8 = j6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(float f, long j, long j2, Composer composer, final int i, final int i2) {
        float f2;
        int i3;
        long j3;
        long j4;
        final float m4440constructorimpl;
        int currentCompositeKeyHash;
        Composer m1642constructorimpl;
        Object rememberedValue;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-2016551008);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            f2 = f;
        } else if ((i & 6) == 0) {
            f2 = f;
            i3 = (startRestartGroup.changed(f2) ? 4 : 2) | i;
        } else {
            f2 = f;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
            j3 = j;
        } else {
            j3 = j;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(j3) ? 32 : 16;
            }
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.MODE_SUPPORT_MASK) == 0) {
            j4 = j2;
            i3 |= startRestartGroup.changed(j4) ? 256 : 128;
            if ((i3 & 147) != 146 && startRestartGroup.getSkipping()) {
                startRestartGroup.skipToGroupEnd();
                m4440constructorimpl = f2;
                j5 = j3;
                j6 = j4;
            } else {
                m4440constructorimpl = i4 == 0 ? Dp.m4440constructorimpl(12) : f2;
                if (i5 != 0) {
                    j3 = Color.INSTANCE.m2149getWhite0d7_KjU();
                }
                long j7 = j3;
                long m2142getGray0d7_KjU = i6 == 0 ? Color.INSTANCE.m2142getGray0d7_KjU() : j4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2016551008, i3, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.HalfStar (RatingBar.kt:82)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier m634size3ABfNKs = SizeKt.m634size3ABfNKs(companion, m4440constructorimpl);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m634size3ABfNKs);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
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
                Icons icons = Icons.INSTANCE;
                IconKt.m1422Iconww6aTOc(StarKt.getStar(icons.getDefault()), (String) null, boxScopeInstance.matchParentSize(companion), m2142getGray0d7_KjU, startRestartGroup, ((i3 << 3) & 7168) | 48, 0);
                long j8 = m2142getGray0d7_KjU;
                ImageVector star = StarKt.getStar(icons.getDefault());
                Modifier matchParentSize = boxScopeInstance.matchParentSize(companion);
                startRestartGroup.startReplaceableGroup(-1749583561);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return w.a((ContentDrawScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                IconKt.m1422Iconww6aTOc(star, (String) null, DrawModifierKt.drawWithContent(matchParentSize, (Function1) rememberedValue), j7, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = j7;
                j6 = j8;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return w.a(m4440constructorimpl, j5, j6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        j4 = j2;
        if ((i3 & 147) != 146) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        long j72 = j3;
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier m634size3ABfNKs2 = SizeKt.m634size3ABfNKs(companion3, m4440constructorimpl);
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m634size3ABfNKs2);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
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
        Icons icons2 = Icons.INSTANCE;
        IconKt.m1422Iconww6aTOc(StarKt.getStar(icons2.getDefault()), (String) null, boxScopeInstance2.matchParentSize(companion3), m2142getGray0d7_KjU, startRestartGroup, ((i3 << 3) & 7168) | 48, 0);
        long j82 = m2142getGray0d7_KjU;
        ImageVector star2 = StarKt.getStar(icons2.getDefault());
        Modifier matchParentSize2 = boxScopeInstance2.matchParentSize(companion3);
        startRestartGroup.startReplaceableGroup(-1749583561);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        IconKt.m1422Iconww6aTOc(star2, (String) null, DrawModifierKt.drawWithContent(matchParentSize2, (Function1) rememberedValue), j72, startRestartGroup, ((i3 << 6) & 7168) | 48, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
        }
        j5 = j72;
        j6 = j82;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final Unit a(ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        float m1940getWidthimpl = Size.m1940getWidthimpl(drawWithContent.mo2662getSizeNHjbRc()) / 2.0f;
        float m1937getHeightimpl = Size.m1937getHeightimpl(drawWithContent.mo2662getSizeNHjbRc());
        int m2101getIntersectrtfAjoo = ClipOp.INSTANCE.m2101getIntersectrtfAjoo();
        DrawContext drawContext = drawWithContent.getDrawContext();
        long mo2587getSizeNHjbRc = drawContext.mo2587getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2590clipRectN_I0leg(0.0f, 0.0f, m1940getWidthimpl, m1937getHeightimpl, m2101getIntersectrtfAjoo);
        drawWithContent.drawContent();
        drawContext.getCanvas().restore();
        drawContext.mo2588setSizeuvyYCjk(mo2587getSizeNHjbRc);
        return Unit.INSTANCE;
    }
}

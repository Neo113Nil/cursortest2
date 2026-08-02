package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.objectweb.asm.Opcodes;

/* compiled from: NumericRatingCell.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0016"}, d2 = {"NumericRatingCell", "", "content", "", "modifier", "Landroidx/compose/ui/Modifier;", "strokeColor", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "Landroidx/compose/ui/unit/Dp;", "backgroundColor", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontColor", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "NumericRatingCell-jWvj134", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JFJLandroidx/compose/ui/text/font/FontWeight;JJLandroidx/compose/runtime/Composer;II)V", "EmptyCell", "(Landroidx/compose/runtime/Composer;I)V", "FilledCell", "DarkFilledCell", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NumericRatingCellKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DarkFilledCell$lambda$4(int i, Composer composer, int i2) {
        DarkFilledCell(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyCell$lambda$2(int i, Composer composer, int i2) {
        EmptyCell(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FilledCell$lambda$3(int i, Composer composer, int i2) {
        FilledCell(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NumericRatingCell_jWvj134$lambda$1(String content, Modifier modifier, long j, float f, long j2, FontWeight fontWeight, long j3, long j4, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(content, "$content");
        m12779NumericRatingCelljWvj134(content, modifier, j, f, j2, fontWeight, j3, j4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00dd  */
    /* renamed from: NumericRatingCell-jWvj134, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12779NumericRatingCelljWvj134(final String content, Modifier modifier, long j, float f, long j2, FontWeight fontWeight, long j3, long j4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long j5;
        int i5;
        float f2;
        int i6;
        long j6;
        int i7;
        int i8;
        FontWeight fontWeight2;
        long m6076getWhite0d7_KjU;
        long j7;
        long j8;
        Modifier modifier3;
        float f3;
        int i9;
        long j9;
        final FontWeight fontWeight3;
        int hashCode;
        Composer m5333constructorimpl;
        Composer composer2;
        final long j10;
        final long j11;
        final long j12;
        final float f4;
        final Modifier modifier4;
        final long j13;
        ScopeUpdateScope endRestartGroup;
        int i10;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-881315304);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                j5 = j;
                i3 |= startRestartGroup.changed(j5) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        j6 = j2;
                        i3 |= startRestartGroup.changed(j6) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            i8 = 57344;
                            fontWeight2 = fontWeight;
                        } else {
                            i8 = 57344;
                            fontWeight2 = fontWeight;
                            if ((i & Opcodes.ASM7) == 0) {
                                i3 |= startRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                            }
                        }
                        if ((i & 3670016) == 0) {
                            i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j3)) ? 1048576 : 524288;
                        }
                        if ((i & 29360128) == 0) {
                            if ((i2 & 128) == 0 && startRestartGroup.changed(j4)) {
                                i10 = 8388608;
                                i3 |= i10;
                            }
                            i10 = 4194304;
                            i3 |= i10;
                        }
                        if ((i3 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i11 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                long m6065getBlack0d7_KjU = i4 != 0 ? Color.INSTANCE.m6065getBlack0d7_KjU() : j5;
                                if (i5 != 0) {
                                    f2 = Dp.m8798constructorimpl(1);
                                }
                                m6076getWhite0d7_KjU = i6 != 0 ? Color.INSTANCE.m6076getWhite0d7_KjU() : j6;
                                if (i7 != 0) {
                                    fontWeight2 = FontWeight.INSTANCE.getNormal();
                                }
                                if ((i2 & 64) != 0) {
                                    j7 = ColorExtensionsKt.m13180generateTextColor8_81llA(m6076getWhite0d7_KjU);
                                    i3 &= -3670017;
                                } else {
                                    j7 = j3;
                                }
                                if ((i2 & 128) != 0) {
                                    j8 = IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04().m8263getFontSizeXSAIIZE();
                                    i3 &= -29360129;
                                } else {
                                    j8 = j4;
                                }
                                modifier3 = modifier2;
                                f3 = f2;
                                i9 = i3;
                                j9 = m6065getBlack0d7_KjU;
                                fontWeight3 = fontWeight2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                j8 = j4;
                                modifier3 = modifier2;
                                f3 = f2;
                                i9 = i3;
                                j9 = j5;
                                fontWeight3 = fontWeight2;
                                m6076getWhite0d7_KjU = j6;
                                j7 = j3;
                            }
                            startRestartGroup.endDefaults();
                            CornerBasedShape small = IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall();
                            long j14 = m6076getWhite0d7_KjU;
                            float f5 = 44;
                            Modifier m1195height3ABfNKs = SizeKt.m1195height3ABfNKs(SizeKt.m1214width3ABfNKs(BackgroundKt.m582backgroundbw27NRU$default(ClipKt.clip(BorderKt.border(modifier3, BorderStrokeKt.m612BorderStrokecXLIe8U(f3, j9), small), small), j14, null, 2, null), Dp.m8798constructorimpl(f5)), Dp.m8798constructorimpl(f5));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1195height3ABfNKs);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Modifier modifier5 = modifier3;
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                            }
                            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                            composer2 = startRestartGroup;
                            long j15 = j7;
                            long j16 = j8;
                            TextKt.m3901TextNvy7gAk(content, BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), j15, null, j16, null, fontWeight3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, (i9 & 14) | ((i9 >> 12) & 896) | ((i9 >> 9) & i8) | ((i9 << 3) & 3670016), 0, 262056);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            j10 = j15;
                            j11 = j16;
                            j12 = j14;
                            f4 = f3;
                            modifier4 = modifier5;
                            j13 = j9;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            composer2 = startRestartGroup;
                            modifier4 = modifier2;
                            j13 = j5;
                            f4 = f2;
                            fontWeight3 = fontWeight2;
                            j12 = j6;
                            j10 = j3;
                            j11 = j4;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingCellKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit NumericRatingCell_jWvj134$lambda$1;
                                    NumericRatingCell_jWvj134$lambda$1 = NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, modifier4, j13, f4, j12, fontWeight3, j10, j11, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return NumericRatingCell_jWvj134$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    j6 = j2;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if ((i & 3670016) == 0) {
                    }
                    if ((i & 29360128) == 0) {
                    }
                    if ((i3 & 23967451) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    modifier3 = modifier2;
                    f3 = f2;
                    i9 = i3;
                    j9 = m6065getBlack0d7_KjU;
                    fontWeight3 = fontWeight2;
                    startRestartGroup.endDefaults();
                    CornerBasedShape small2 = IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall();
                    long j142 = m6076getWhite0d7_KjU;
                    float f52 = 44;
                    Modifier m1195height3ABfNKs2 = SizeKt.m1195height3ABfNKs(SizeKt.m1214width3ABfNKs(BackgroundKt.m582backgroundbw27NRU$default(ClipKt.clip(BorderKt.border(modifier3, BorderStrokeKt.m612BorderStrokecXLIe8U(f3, j9), small2), small2), j142, null, 2, null), Dp.m8798constructorimpl(f52)), Dp.m8798constructorimpl(f52));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1195height3ABfNKs2);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    Modifier modifier52 = modifier3;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                    Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m5333constructorimpl.getInserting()) {
                    }
                    m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2);
                    Updater.m5340setimpl(m5333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    composer2 = startRestartGroup;
                    long j152 = j7;
                    long j162 = j8;
                    TextKt.m3901TextNvy7gAk(content, BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), j152, null, j162, null, fontWeight3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, (i9 & 14) | ((i9 >> 12) & 896) | ((i9 >> 9) & i8) | ((i9 << 3) & 3670016), 0, 262056);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    j10 = j152;
                    j11 = j162;
                    j12 = j142;
                    f4 = f3;
                    modifier4 = modifier52;
                    j13 = j9;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f2 = f;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                j6 = j2;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if ((i & 3670016) == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                if ((i3 & 23967451) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                modifier3 = modifier2;
                f3 = f2;
                i9 = i3;
                j9 = m6065getBlack0d7_KjU;
                fontWeight3 = fontWeight2;
                startRestartGroup.endDefaults();
                CornerBasedShape small22 = IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall();
                long j1422 = m6076getWhite0d7_KjU;
                float f522 = 44;
                Modifier m1195height3ABfNKs22 = SizeKt.m1195height3ABfNKs(SizeKt.m1214width3ABfNKs(BackgroundKt.m582backgroundbw27NRU$default(ClipKt.clip(BorderKt.border(modifier3, BorderStrokeKt.m612BorderStrokecXLIe8U(f3, j9), small22), small22), j1422, null, 2, null), Dp.m8798constructorimpl(f522)), Dp.m8798constructorimpl(f522));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1195height3ABfNKs22);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier522 = modifier3;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m5333constructorimpl.getInserting()) {
                }
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash22);
                Updater.m5340setimpl(m5333constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                composer2 = startRestartGroup;
                long j1522 = j7;
                long j1622 = j8;
                TextKt.m3901TextNvy7gAk(content, BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), j1522, null, j1622, null, fontWeight3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, (i9 & 14) | ((i9 >> 12) & 896) | ((i9 >> 9) & i8) | ((i9 << 3) & 3670016), 0, 262056);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                j10 = j1522;
                j11 = j1622;
                j12 = j1422;
                f4 = f3;
                modifier4 = modifier522;
                j13 = j9;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            j5 = j;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f2 = f;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            j6 = j2;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i3 & 23967451) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            modifier3 = modifier2;
            f3 = f2;
            i9 = i3;
            j9 = m6065getBlack0d7_KjU;
            fontWeight3 = fontWeight2;
            startRestartGroup.endDefaults();
            CornerBasedShape small222 = IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall();
            long j14222 = m6076getWhite0d7_KjU;
            float f5222 = 44;
            Modifier m1195height3ABfNKs222 = SizeKt.m1195height3ABfNKs(SizeKt.m1214width3ABfNKs(BackgroundKt.m582backgroundbw27NRU$default(ClipKt.clip(BorderKt.border(modifier3, BorderStrokeKt.m612BorderStrokecXLIe8U(f3, j9), small222), small222), j14222, null, 2, null), Dp.m8798constructorimpl(f5222)), Dp.m8798constructorimpl(f5222));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1195height3ABfNKs222);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            Modifier modifier5222 = modifier3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m5333constructorimpl.getInserting()) {
            }
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash222);
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            composer2 = startRestartGroup;
            long j15222 = j7;
            long j16222 = j8;
            TextKt.m3901TextNvy7gAk(content, BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), j15222, null, j16222, null, fontWeight3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, (i9 & 14) | ((i9 >> 12) & 896) | ((i9 >> 9) & i8) | ((i9 << 3) & 3670016), 0, 262056);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            j10 = j15222;
            j11 = j16222;
            j12 = j14222;
            f4 = f3;
            modifier4 = modifier5222;
            j13 = j9;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        j5 = j;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f2 = f;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        j6 = j2;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i3 & 23967451) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        modifier3 = modifier2;
        f3 = f2;
        i9 = i3;
        j9 = m6065getBlack0d7_KjU;
        fontWeight3 = fontWeight2;
        startRestartGroup.endDefaults();
        CornerBasedShape small2222 = IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall();
        long j142222 = m6076getWhite0d7_KjU;
        float f52222 = 44;
        Modifier m1195height3ABfNKs2222 = SizeKt.m1195height3ABfNKs(SizeKt.m1214width3ABfNKs(BackgroundKt.m582backgroundbw27NRU$default(ClipKt.clip(BorderKt.border(modifier3, BorderStrokeKt.m612BorderStrokecXLIe8U(f3, j9), small2222), small2222), j142222, null, 2, null), Dp.m8798constructorimpl(f52222)), Dp.m8798constructorimpl(f52222));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1195height3ABfNKs2222);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier52222 = modifier3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl.getInserting()) {
        }
        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2222);
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        composer2 = startRestartGroup;
        long j152222 = j7;
        long j162222 = j8;
        TextKt.m3901TextNvy7gAk(content, BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), j152222, null, j162222, null, fontWeight3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, (i9 & 14) | ((i9 >> 12) & 896) | ((i9 >> 9) & i8) | ((i9 << 3) & 3670016), 0, 262056);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        j10 = j152222;
        j11 = j162222;
        j12 = j142222;
        f4 = f3;
        modifier4 = modifier52222;
        j13 = j9;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void EmptyCell(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1361614452);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            m12779NumericRatingCelljWvj134("1", null, 0L, 0.0f, 0L, null, 0L, 0L, startRestartGroup, 6, 254);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingCellKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit EmptyCell$lambda$2;
                    EmptyCell$lambda$2 = NumericRatingCellKt.EmptyCell$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return EmptyCell$lambda$2;
                }
            });
        }
    }

    private static final void FilledCell(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1860651045);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            m12779NumericRatingCelljWvj134("1", null, 0L, 0.0f, Color.INSTANCE.m6077getYellow0d7_KjU(), null, 0L, 0L, startRestartGroup, 24582, 238);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingCellKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FilledCell$lambda$3;
                    FilledCell$lambda$3 = NumericRatingCellKt.FilledCell$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return FilledCell$lambda$3;
                }
            });
        }
    }

    private static final void DarkFilledCell(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(477358395);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            m12779NumericRatingCelljWvj134("1", null, 0L, 0.0f, Color.INSTANCE.m6065getBlack0d7_KjU(), null, 0L, 0L, startRestartGroup, 24582, 238);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingCellKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DarkFilledCell$lambda$4;
                    DarkFilledCell$lambda$4 = NumericRatingCellKt.DarkFilledCell$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return DarkFilledCell$lambda$4;
                }
            });
        }
    }
}

package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J|\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0013\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00110\u0015¢\u0006\u0002\b\u00162\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00110\u0015¢\u0006\u0002\b\u00162\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015¢\u0006\u0002\b\u00162\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001bR\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\t\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\n\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\r\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000e\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/material/ThreeLine;", "", "()V", "ContentLeftPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ContentRightPadding", "IconLeftPadding", "IconMinPaddedWidth", "IconThreeLineVerticalPadding", "MinHeight", "ThreeLineBaselineFirstOffset", "ThreeLineBaselineSecondOffset", "ThreeLineBaselineThirdOffset", "ThreeLineTrailingTopPadding", "TrailingRightPadding", "ListItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "text", "secondaryText", "overlineText", "trailing", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ThreeLine {
    private static final float ContentLeftPadding;
    private static final float ContentRightPadding;
    private static final float IconLeftPadding;
    private static final float IconThreeLineVerticalPadding;
    private static final float ThreeLineBaselineSecondOffset;
    private static final float ThreeLineBaselineThirdOffset;
    private static final float ThreeLineTrailingTopPadding;
    private static final float TrailingRightPadding;
    public static final ThreeLine INSTANCE = new ThreeLine();
    private static final float MinHeight = Dp.m4440constructorimpl(88);
    private static final float IconMinPaddedWidth = Dp.m4440constructorimpl(40);
    private static final float ThreeLineBaselineFirstOffset = Dp.m4440constructorimpl(28);

    private ThreeLine() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ListItem(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> text, final Function2<? super Composer, ? super Integer, Unit> secondaryText, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        ThreeLine threeLine;
        final int i5;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Composer startRestartGroup = composer.startRestartGroup(1749738797);
        ComposerKt.sourceInformation(startRestartGroup, "C(ListItem)P(1!1,4,3)302@11212L1431:ListItem.kt#jmzs0o");
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(text) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(secondaryText) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= startRestartGroup.changed(function22) ? 16384 : 8192;
        }
        if ((i2 & 32) == 0) {
            if ((458752 & i) == 0) {
                i4 = startRestartGroup.changed(function23) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
                threeLine = this;
            } else {
                threeLine = this;
                if ((3670016 & i) == 0) {
                    i3 |= startRestartGroup.changed(threeLine) ? 1048576 : 524288;
                }
            }
            i5 = i3;
            if ((2995931 & i5) == 599186 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                Modifier m622heightInVpY3zN4$default = SizeKt.m622heightInVpY3zN4$default(companion, MinHeight, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(startRestartGroup, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density = (Density) consume;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localLayoutDirection);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection = (LayoutDirection) consume2;
                Modifier modifier4 = companion;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume3 = startRestartGroup.consume(localViewConfiguration);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m622heightInVpY3zN4$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
                Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-678309503);
                ComposerKt.sourceInformation(startRestartGroup, "C80@3988L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(1483377809);
                ComposerKt.sourceInformation(startRestartGroup, "C316@11836L477,330@12366L253:ListItem.kt#jmzs0o");
                startRestartGroup.startReplaceableGroup(-280382992);
                ComposerKt.sourceInformation(startRestartGroup, "305@11369L440");
                if (function2 != null) {
                    float f = IconLeftPadding;
                    float m4440constructorimpl = Dp.m4440constructorimpl(f + IconMinPaddedWidth);
                    Modifier m638sizeInqDBjuR0$default = SizeKt.m638sizeInqDBjuR0$default(Modifier.INSTANCE, m4440constructorimpl, m4440constructorimpl, 0.0f, 0.0f, 12, null);
                    float f2 = IconThreeLineVerticalPadding;
                    Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(m638sizeInqDBjuR0$default, f, f2, 0.0f, f2, 4, null);
                    Alignment centerStart = Alignment.INSTANCE.getCenterStart();
                    startRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = startRestartGroup.consume(localDensity2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Density density2 = (Density) consume4;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume5 = startRestartGroup.consume(localLayoutDirection2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume6 = startRestartGroup.consume(localViewConfiguration2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m589paddingqDBjuR0$default);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor2);
                    } else {
                        startRestartGroup.useNode();
                    }
                    startRestartGroup.disableReusing();
                    Composer m1642constructorimpl2 = Updater.m1642constructorimpl(startRestartGroup);
                    Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-2137368960);
                    ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceableGroup(2007028978);
                    ComposerKt.sourceInformation(startRestartGroup, "C314@11801L6:ListItem.kt#jmzs0o");
                    function2.invoke(startRestartGroup, Integer.valueOf((i5 >> 3) & 14));
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                }
                startRestartGroup.endReplaceableGroup();
                float f3 = ThreeLineBaselineFirstOffset;
                ListItemKt.BaselinesOffsetColumn(CollectionsKt.listOf((Object[]) new Dp[]{Dp.m4438boximpl(f3), Dp.m4438boximpl(ThreeLineBaselineSecondOffset), Dp.m4438boximpl(ThreeLineBaselineThirdOffset)}), PaddingKt.m589paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null), ComposableLambdaKt.composableLambda(startRestartGroup, -318094245, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ThreeLine$ListItem$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        ComposerKt.sourceInformation(composer2, "C326@12261L6,327@12284L15:ListItem.kt#jmzs0o");
                        if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                            composer2.startReplaceableGroup(-755940677);
                            ComposerKt.sourceInformation(composer2, "325@12230L14");
                            Function2<Composer, Integer, Unit> function24 = function22;
                            if (function24 != null) {
                                function24.invoke(composer2, Integer.valueOf((i5 >> 12) & 14));
                            }
                            composer2.endReplaceableGroup();
                            text.invoke(composer2, Integer.valueOf((i5 >> 6) & 14));
                            secondaryText.invoke(composer2, Integer.valueOf((i5 >> 9) & 14));
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, RendererCapabilities.MODE_SUPPORT_MASK, 0);
                startRestartGroup = startRestartGroup;
                if (function23 != null) {
                    float f4 = ThreeLineTrailingTopPadding;
                    ListItemKt.m1424OffsetToBaselineOrCenterKz89ssw(Dp.m4440constructorimpl(f3 - f4), PaddingKt.m589paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, f4, TrailingRightPadding, 0.0f, 9, null), function23, startRestartGroup, ((i5 >> 9) & 896) | 54, 0);
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            final ThreeLine threeLine2 = threeLine;
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ThreeLine$ListItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    ThreeLine.this.ListItem(modifier3, function2, text, secondaryText, function22, function23, composer2, i | 1, i2);
                }
            });
            return;
        }
        i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i3 |= i4;
        if ((i2 & 64) == 0) {
        }
        i5 = i3;
        if ((2995931 & i5) == 599186) {
        }
        if (i6 == 0) {
        }
        Modifier m622heightInVpY3zN4$default2 = SizeKt.m622heightInVpY3zN4$default(companion, MinHeight, 0.0f, 2, null);
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume7 = startRestartGroup.consume(localDensity3);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density3 = (Density) consume7;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localLayoutDirection3);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection3 = (LayoutDirection) consume22;
        Modifier modifier42 = companion;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume32 = startRestartGroup.consume(localViewConfiguration3);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume32;
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(m622heightInVpY3zN4$default2);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1642constructorimpl3 = Updater.m1642constructorimpl(startRestartGroup);
        Updater.m1649setimpl(m1642constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-678309503);
        ComposerKt.sourceInformation(startRestartGroup, "C80@3988L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1483377809);
        ComposerKt.sourceInformation(startRestartGroup, "C316@11836L477,330@12366L253:ListItem.kt#jmzs0o");
        startRestartGroup.startReplaceableGroup(-280382992);
        ComposerKt.sourceInformation(startRestartGroup, "305@11369L440");
        if (function2 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        float f32 = ThreeLineBaselineFirstOffset;
        ListItemKt.BaselinesOffsetColumn(CollectionsKt.listOf((Object[]) new Dp[]{Dp.m4438boximpl(f32), Dp.m4438boximpl(ThreeLineBaselineSecondOffset), Dp.m4438boximpl(ThreeLineBaselineThirdOffset)}), PaddingKt.m589paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null), ComposableLambdaKt.composableLambda(startRestartGroup, -318094245, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ThreeLine$ListItem$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i7) {
                ComposerKt.sourceInformation(composer2, "C326@12261L6,327@12284L15:ListItem.kt#jmzs0o");
                if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                    composer2.startReplaceableGroup(-755940677);
                    ComposerKt.sourceInformation(composer2, "325@12230L14");
                    Function2<Composer, Integer, Unit> function24 = function22;
                    if (function24 != null) {
                        function24.invoke(composer2, Integer.valueOf((i5 >> 12) & 14));
                    }
                    composer2.endReplaceableGroup();
                    text.invoke(composer2, Integer.valueOf((i5 >> 6) & 14));
                    secondaryText.invoke(composer2, Integer.valueOf((i5 >> 9) & 14));
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, RendererCapabilities.MODE_SUPPORT_MASK, 0);
        startRestartGroup = startRestartGroup;
        if (function23 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        modifier3 = modifier42;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    static {
        float f = 16;
        IconLeftPadding = Dp.m4440constructorimpl(f);
        IconThreeLineVerticalPadding = Dp.m4440constructorimpl(f);
        ContentLeftPadding = Dp.m4440constructorimpl(f);
        ContentRightPadding = Dp.m4440constructorimpl(f);
        float f2 = 20;
        ThreeLineBaselineSecondOffset = Dp.m4440constructorimpl(f2);
        ThreeLineBaselineThirdOffset = Dp.m4440constructorimpl(f2);
        ThreeLineTrailingTopPadding = Dp.m4440constructorimpl(f);
        TrailingRightPadding = Dp.m4440constructorimpl(f);
    }
}

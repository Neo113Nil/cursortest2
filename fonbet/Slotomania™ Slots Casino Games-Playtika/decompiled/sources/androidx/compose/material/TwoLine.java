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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J~\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00140\u0018¢\u0006\u0002\b\u00192\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0013\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u00192\u0013\u0010\u001d\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010\u001eR\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\t\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\n\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\r\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000e\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u000f\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0010\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0011\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0019\u0010\u0012\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/material/TwoLine;", "", "()V", "ContentLeftPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ContentRightPadding", "IconLeftPadding", "IconMinPaddedWidth", "IconVerticalPadding", "MinHeight", "MinHeightWithIcon", "OverlineBaselineOffset", "OverlineToPrimaryBaselineOffset", "PrimaryBaselineOffsetNoIcon", "PrimaryBaselineOffsetWithIcon", "PrimaryToSecondaryBaselineOffsetNoIcon", "PrimaryToSecondaryBaselineOffsetWithIcon", "TrailingRightPadding", "ListItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "text", "secondaryText", "overlineText", "trailing", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
final class TwoLine {
    private static final float ContentLeftPadding;
    private static final float ContentRightPadding;
    private static final float IconLeftPadding;
    private static final float IconVerticalPadding;
    private static final float OverlineToPrimaryBaselineOffset;
    private static final float PrimaryToSecondaryBaselineOffsetNoIcon;
    private static final float PrimaryToSecondaryBaselineOffsetWithIcon;
    private static final float TrailingRightPadding;
    public static final TwoLine INSTANCE = new TwoLine();
    private static final float MinHeight = Dp.m4440constructorimpl(64);
    private static final float MinHeightWithIcon = Dp.m4440constructorimpl(72);
    private static final float IconMinPaddedWidth = Dp.m4440constructorimpl(40);
    private static final float OverlineBaselineOffset = Dp.m4440constructorimpl(24);
    private static final float PrimaryBaselineOffsetNoIcon = Dp.m4440constructorimpl(28);
    private static final float PrimaryBaselineOffsetWithIcon = Dp.m4440constructorimpl(32);

    private TwoLine() {
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0413 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ListItem(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> text, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        final int i3;
        int i4;
        final float f;
        final int i5;
        float f2;
        float f3;
        float f4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer startRestartGroup = composer.startRestartGroup(-1340612993);
        ComposerKt.sourceInformation(startRestartGroup, "C(ListItem)P(1!1,4,3)205@7745L2468:ListItem.kt#jmzs0o");
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
            i3 |= startRestartGroup.changed(function22) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= startRestartGroup.changed(function23) ? 16384 : 8192;
        }
        if ((i2 & 32) == 0) {
            if ((458752 & i) == 0) {
                i4 = startRestartGroup.changed(function24) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                i3 |= startRestartGroup.changed(this) ? 1048576 : 524288;
            }
            if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                float f5 = function2 != null ? MinHeight : MinHeightWithIcon;
                Modifier m622heightInVpY3zN4$default = SizeKt.m622heightInVpY3zN4$default(companion, f5, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(693286680);
                ComposerKt.sourceInformation(startRestartGroup, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                Modifier modifier3 = companion;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density = (Density) consume;
                float f6 = f5;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localLayoutDirection);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection = (LayoutDirection) consume2;
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
                startRestartGroup.startReplaceableGroup(1912737507);
                ComposerKt.sourceInformation(startRestartGroup, "C254@9588L601:ListItem.kt#jmzs0o");
                Modifier m589paddingqDBjuR0$default = PaddingKt.m589paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null);
                startRestartGroup.startReplaceableGroup(-269995367);
                ComposerKt.sourceInformation(startRestartGroup, "210@7969L532");
                if (function2 == null) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    float f7 = IconLeftPadding;
                    Modifier m638sizeInqDBjuR0$default = SizeKt.m638sizeInqDBjuR0$default(companion2, Dp.m4440constructorimpl(f7 + IconMinPaddedWidth), f6, 0.0f, 0.0f, 12, null);
                    f = f6;
                    float f8 = IconVerticalPadding;
                    Modifier m589paddingqDBjuR0$default2 = PaddingKt.m589paddingqDBjuR0$default(m638sizeInqDBjuR0$default, f7, f8, 0.0f, f8, 4, null);
                    Alignment topStart = Alignment.INSTANCE.getTopStart();
                    startRestartGroup.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topStart, false, startRestartGroup, 6);
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
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m589paddingqDBjuR0$default2);
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
                    startRestartGroup.startReplaceableGroup(1698757508);
                    ComposerKt.sourceInformation(startRestartGroup, "C222@8493L6:ListItem.kt#jmzs0o");
                    function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 3) & 14));
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                } else {
                    f = f6;
                }
                startRestartGroup.endReplaceableGroup();
                if (function23 == null) {
                    startRestartGroup.startReplaceableGroup(-269994745);
                    ComposerKt.sourceInformation(startRestartGroup, "226@8573L242");
                    i5 = i3;
                    ListItemKt.BaselinesOffsetColumn(CollectionsKt.listOf((Object[]) new Dp[]{Dp.m4438boximpl(OverlineBaselineOffset), Dp.m4438boximpl(OverlineToPrimaryBaselineOffset)}), m589paddingqDBjuR0$default, ComposableLambdaKt.composableLambda(startRestartGroup, -1675021441, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TwoLine$ListItem$1$2
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
                            ComposerKt.sourceInformation(composer2, "C230@8756L14,231@8791L6:ListItem.kt#jmzs0o");
                            if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                                function23.invoke(composer2, Integer.valueOf((i3 >> 12) & 14));
                                text.invoke(composer2, Integer.valueOf((i3 >> 6) & 14));
                            } else {
                                composer2.skipToGroupEnd();
                            }
                        }
                    }), startRestartGroup, RendererCapabilities.MODE_SUPPORT_MASK, 0);
                    startRestartGroup.endReplaceableGroup();
                } else {
                    i5 = i3;
                    startRestartGroup.startReplaceableGroup(-269994465);
                    ComposerKt.sourceInformation(startRestartGroup, "234@8853L668");
                    Dp[] dpArr = new Dp[2];
                    if (function2 != null) {
                        f2 = PrimaryBaselineOffsetWithIcon;
                    } else {
                        f2 = PrimaryBaselineOffsetNoIcon;
                    }
                    dpArr[0] = Dp.m4438boximpl(f2);
                    if (function2 != null) {
                        f3 = PrimaryToSecondaryBaselineOffsetWithIcon;
                    } else {
                        f3 = PrimaryToSecondaryBaselineOffsetNoIcon;
                    }
                    dpArr[1] = Dp.m4438boximpl(f3);
                    ListItemKt.BaselinesOffsetColumn(CollectionsKt.listOf((Object[]) dpArr), m589paddingqDBjuR0$default, ComposableLambdaKt.composableLambda(startRestartGroup, 993836488, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TwoLine$ListItem$1$3
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
                            ComposerKt.sourceInformation(composer2, "C249@9459L6,250@9486L17:ListItem.kt#jmzs0o");
                            if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                                text.invoke(composer2, Integer.valueOf((i5 >> 6) & 14));
                                Function2<Composer, Integer, Unit> function25 = function22;
                                Intrinsics.checkNotNull(function25);
                                function25.invoke(composer2, 0);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, RendererCapabilities.MODE_SUPPORT_MASK, 0);
                    startRestartGroup.endReplaceableGroup();
                }
                if (function24 != null) {
                    if (function2 != null) {
                        f4 = PrimaryBaselineOffsetWithIcon;
                    } else {
                        f4 = PrimaryBaselineOffsetNoIcon;
                    }
                    ListItemKt.m1424OffsetToBaselineOrCenterKz89ssw(f4, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1696992176, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TwoLine$ListItem$1$4
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
                            float f9;
                            ComposerKt.sourceInformation(composer2, "C261@9851L320:ListItem.kt#jmzs0o");
                            if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                                Modifier m622heightInVpY3zN4$default2 = SizeKt.m622heightInVpY3zN4$default(Modifier.INSTANCE, f, 0.0f, 2, null);
                                f9 = TwoLine.TrailingRightPadding;
                                Modifier m589paddingqDBjuR0$default3 = PaddingKt.m589paddingqDBjuR0$default(m622heightInVpY3zN4$default2, 0.0f, 0.0f, f9, 0.0f, 11, null);
                                Alignment center = Alignment.INSTANCE.getCenter();
                                Function2<Composer, Integer, Unit> function25 = function24;
                                int i8 = i5;
                                composer2.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume7 = composer2.consume(localDensity3);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                Density density3 = (Density) consume7;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume8 = composer2.consume(localLayoutDirection3);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume9 = composer2.consume(localViewConfiguration3);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(m589paddingqDBjuR0$default3);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor3);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer m1642constructorimpl3 = Updater.m1642constructorimpl(composer2);
                                Updater.m1649setimpl(m1642constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer2.enableReusing();
                                materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-2137368960);
                                ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(868648534);
                                ComposerKt.sourceInformation(composer2, "C266@10159L10:ListItem.kt#jmzs0o");
                                function25.invoke(composer2, Integer.valueOf((i8 >> 15) & 14));
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, RendererCapabilities.MODE_SUPPORT_MASK, 2);
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                modifier2 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TwoLine$ListItem$2
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
                    TwoLine.this.ListItem(modifier2, function2, text, function22, function23, function24, composer2, i | 1, i2);
                }
            });
            return;
        }
        i4 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i3 |= i4;
        if ((i2 & 64) == 0) {
        }
        if ((2995931 & i3) == 599186) {
        }
        if (i6 == 0) {
        }
        if (function2 != null) {
        }
        Modifier m622heightInVpY3zN4$default2 = SizeKt.m622heightInVpY3zN4$default(companion, f5, 0.0f, 2, null);
        startRestartGroup.startReplaceableGroup(693286680);
        ComposerKt.sourceInformation(startRestartGroup, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
        Modifier modifier32 = companion;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume7 = startRestartGroup.consume(localDensity3);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density3 = (Density) consume7;
        float f62 = f5;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localLayoutDirection3);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection3 = (LayoutDirection) consume22;
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
        startRestartGroup.startReplaceableGroup(1912737507);
        ComposerKt.sourceInformation(startRestartGroup, "C254@9588L601:ListItem.kt#jmzs0o");
        Modifier m589paddingqDBjuR0$default3 = PaddingKt.m589paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), ContentLeftPadding, 0.0f, ContentRightPadding, 0.0f, 10, null);
        startRestartGroup.startReplaceableGroup(-269995367);
        ComposerKt.sourceInformation(startRestartGroup, "210@7969L532");
        if (function2 == null) {
        }
        startRestartGroup.endReplaceableGroup();
        if (function23 == null) {
        }
        if (function24 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        modifier2 = modifier32;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    static {
        float f = 16;
        IconLeftPadding = Dp.m4440constructorimpl(f);
        IconVerticalPadding = Dp.m4440constructorimpl(f);
        ContentLeftPadding = Dp.m4440constructorimpl(f);
        ContentRightPadding = Dp.m4440constructorimpl(f);
        float f2 = 20;
        OverlineToPrimaryBaselineOffset = Dp.m4440constructorimpl(f2);
        PrimaryToSecondaryBaselineOffsetNoIcon = Dp.m4440constructorimpl(f2);
        PrimaryToSecondaryBaselineOffsetWithIcon = Dp.m4440constructorimpl(f2);
        TrailingRightPadding = Dp.m4440constructorimpl(f);
    }
}

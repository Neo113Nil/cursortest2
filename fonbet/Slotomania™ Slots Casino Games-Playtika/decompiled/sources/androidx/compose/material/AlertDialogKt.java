package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: AlertDialog.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a~\u0010\b\u001a\u00020\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a8\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0002\b\fH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a;\u0010\u001e\u001a\u00020\t*\u00020\u001f2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0002\b\fH\u0001¢\u0006\u0002\u0010 \"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"TextBaselineDistanceFromTitle", "Landroidx/compose/ui/unit/TextUnit;", "J", "TextBaselineDistanceFromTop", "TextPadding", "Landroidx/compose/ui/Modifier;", "TitleBaselineDistanceFromTop", "TitlePadding", "AlertDialogContent", "", "buttons", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "modifier", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "AlertDialogContent-WMdw5o4", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/runtime/Composer;II)V", "AlertDialogFlowRow", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "content", "AlertDialogFlowRow-ixp7dh8", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "AlertDialogBaselineLayout", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlertDialogKt {
    private static final Modifier TextPadding;
    private static final Modifier TitlePadding;
    private static final long TitleBaselineDistanceFromTop = TextUnitKt.getSp(40);
    private static final long TextBaselineDistanceFromTitle = TextUnitKt.getSp(36);
    private static final long TextBaselineDistanceFromTop = TextUnitKt.getSp(38);

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0121, code lost:
    
        if ((r34 & 64) != 0) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x006d  */
    /* renamed from: AlertDialogContent-WMdw5o4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1225AlertDialogContentWMdw5o4(final Function2<? super Composer, ? super Integer, Unit> buttons, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        int i5;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        Shape shape2;
        long j3;
        long j4;
        final int i6;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Modifier modifier3;
        final Shape shape3;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Composer startRestartGroup = composer.startRestartGroup(-453679601);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialogContent)P(1,3,6,5,4,0:c#ui.graphics.Color,2:c#ui.graphics.Color)48@1896L6,49@1954L6,50@1996L32,52@2038L1047:AlertDialog.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(buttons) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
            } else if ((i & 896) == 0) {
                function23 = function2;
                i3 |= startRestartGroup.changed(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    function24 = function22;
                    i3 |= startRestartGroup.changed(function24) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i9 = 16384;
                                i3 |= i9;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i9 = 8192;
                        i3 |= i9;
                    } else {
                        shape2 = shape;
                    }
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            j3 = j;
                            if (startRestartGroup.changed(j3)) {
                                i8 = 131072;
                                i3 |= i8;
                            }
                        } else {
                            j3 = j;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        j3 = j;
                    }
                    if ((3670016 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            j4 = j2;
                            if (startRestartGroup.changed(j4)) {
                                i7 = 1048576;
                                i3 |= i7;
                            }
                        } else {
                            j4 = j2;
                        }
                        i7 = 524288;
                        i3 |= i7;
                    } else {
                        j4 = j2;
                    }
                    int i11 = i3;
                    if ((2995931 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            i6 = (i2 & 16) != 0 ? i11 & (-57345) : i11;
                            if ((i2 & 32) != 0) {
                                i6 &= -458753;
                            }
                        } else {
                            if (i10 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                function23 = null;
                            }
                            if (i5 != 0) {
                                function24 = null;
                            }
                            if ((i2 & 16) == 0) {
                                shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getMedium();
                                i6 = i11 & (-57345);
                            } else {
                                i6 = i11;
                            }
                            if ((i2 & 32) != 0) {
                                j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1328getSurface0d7_KjU();
                                i6 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                j4 = ColorsKt.m1342contentColorForek8zF_U(j3, startRestartGroup, (i6 >> 15) & 14);
                                i6 &= -3670017;
                            }
                            long j7 = j4;
                            long j8 = j3;
                            Modifier modifier4 = modifier2;
                            Shape shape4 = shape2;
                            startRestartGroup.endDefaults();
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 629950291, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i12) {
                                    ComposerKt.sourceInformation(composer3, "C58@2184L895:AlertDialog.kt#jmzs0o");
                                    if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                        final Function2<Composer, Integer, Unit> function27 = function23;
                                        final Function2<Composer, Integer, Unit> function28 = function24;
                                        Function2<Composer, Integer, Unit> function29 = buttons;
                                        final int i13 = i6;
                                        composer3.startReplaceableGroup(-483455358);
                                        ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                        composer3.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume = composer3.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        Density density = (Density) consume;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume2 = composer3.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume3 = composer3.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composer3.disableReusing();
                                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                                        Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-1163856341);
                                        ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                        composer3.startReplaceableGroup(523699273);
                                        ComposerKt.sourceInformation(composer3, "C59@2205L842,79@3060L9:AlertDialog.kt#jmzs0o");
                                        AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function27 != null ? ComposableLambdaKt.composableLambda(composer3, 620104160, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i14) {
                                                ComposerKt.sourceInformation(composer4, "C62@2392L4,62@2327L240:AlertDialog.kt#jmzs0o");
                                                if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer4, 6)))};
                                                    final Function2<Composer, Integer, Unit> function210 = function27;
                                                    final int i15 = i13;
                                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer4, 770166432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                            invoke(composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer5, int i16) {
                                                            ComposerKt.sourceInformation(composer5, "C63@2458L10,64@2507L34:AlertDialog.kt#jmzs0o");
                                                            if ((i16 & 11) != 2 || !composer5.getSkipping()) {
                                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer5, 6).getSubtitle1(), function210, composer5, (i15 >> 3) & 112);
                                                            } else {
                                                                composer5.skipToGroupEnd();
                                                            }
                                                        }
                                                    }), composer4, 56);
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }) : null, function28 != null ? ComposableLambdaKt.composableLambda(composer3, 1965858367, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i14) {
                                                ComposerKt.sourceInformation(composer4, "C71@2796L6,70@2702L291:AlertDialog.kt#jmzs0o");
                                                if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer4, 6)))};
                                                    final Function2<Composer, Integer, Unit> function210 = function28;
                                                    final int i15 = i13;
                                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer4, 2115920639, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                            invoke(composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer5, int i16) {
                                                            ComposerKt.sourceInformation(composer5, "C73@2889L10,74@2934L33:AlertDialog.kt#jmzs0o");
                                                            if ((i16 & 11) != 2 || !composer5.getSkipping()) {
                                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer5, 6).getBody2(), function210, composer5, (i15 >> 6) & 112);
                                                            } else {
                                                                composer5.skipToGroupEnd();
                                                            }
                                                        }
                                                    }), composer4, 56);
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }) : null, composer3, 6);
                                        function29.invoke(composer3, Integer.valueOf(i13 & 14));
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            });
                            int i12 = ((i6 >> 3) & 14) | 1572864;
                            int i13 = i6 >> 9;
                            composer2 = startRestartGroup;
                            SurfaceKt.m1520SurfaceFjzlyU(modifier4, shape4, j8, j7, null, 0.0f, composableLambda, composer2, i12 | (i13 & 112) | (i13 & 896) | (i13 & 7168), 48);
                            function25 = function23;
                            function26 = function24;
                            modifier3 = modifier4;
                            shape3 = shape4;
                            j5 = j8;
                            j6 = j7;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        composer2 = startRestartGroup;
                        modifier3 = modifier2;
                        function25 = function23;
                        function26 = function24;
                        shape3 = shape2;
                        j5 = j3;
                        j6 = j4;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i14) {
                            AlertDialogKt.m1225AlertDialogContentWMdw5o4(buttons, modifier3, function25, function26, shape3, j5, j6, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                function24 = function22;
                if ((57344 & i) != 0) {
                }
                if ((458752 & i) != 0) {
                }
                if ((3670016 & i) != 0) {
                }
                int i112 = i3;
                if ((2995931 & i3) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                }
                if (i10 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                long j72 = j4;
                long j82 = j3;
                Modifier modifier42 = modifier2;
                Shape shape42 = shape2;
                startRestartGroup.endDefaults();
                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 629950291, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i122) {
                        ComposerKt.sourceInformation(composer3, "C58@2184L895:AlertDialog.kt#jmzs0o");
                        if ((i122 & 11) != 2 || !composer3.getSkipping()) {
                            final Function2<? super Composer, ? super Integer, Unit> function27 = function23;
                            final Function2<? super Composer, ? super Integer, Unit> function28 = function24;
                            Function2<Composer, Integer, Unit> function29 = buttons;
                            final int i132 = i6;
                            composer3.startReplaceableGroup(-483455358);
                            ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            composer3.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume = composer3.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Density density = (Density) consume;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2 = composer3.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            LayoutDirection layoutDirection = (LayoutDirection) consume2;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer3.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                            Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-1163856341);
                            ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer3.startReplaceableGroup(523699273);
                            ComposerKt.sourceInformation(composer3, "C59@2205L842,79@3060L9:AlertDialog.kt#jmzs0o");
                            AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function27 != null ? ComposableLambdaKt.composableLambda(composer3, 620104160, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i14) {
                                    ComposerKt.sourceInformation(composer4, "C62@2392L4,62@2327L240:AlertDialog.kt#jmzs0o");
                                    if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer4, 6)))};
                                        final Function2<? super Composer, ? super Integer, Unit> function210 = function27;
                                        final int i15 = i132;
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer4, 770166432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i16) {
                                                ComposerKt.sourceInformation(composer5, "C63@2458L10,64@2507L34:AlertDialog.kt#jmzs0o");
                                                if ((i16 & 11) != 2 || !composer5.getSkipping()) {
                                                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer5, 6).getSubtitle1(), function210, composer5, (i15 >> 3) & 112);
                                                } else {
                                                    composer5.skipToGroupEnd();
                                                }
                                            }
                                        }), composer4, 56);
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }) : null, function28 != null ? ComposableLambdaKt.composableLambda(composer3, 1965858367, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i14) {
                                    ComposerKt.sourceInformation(composer4, "C71@2796L6,70@2702L291:AlertDialog.kt#jmzs0o");
                                    if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                        ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer4, 6)))};
                                        final Function2<? super Composer, ? super Integer, Unit> function210 = function28;
                                        final int i15 = i132;
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer4, 2115920639, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i16) {
                                                ComposerKt.sourceInformation(composer5, "C73@2889L10,74@2934L33:AlertDialog.kt#jmzs0o");
                                                if ((i16 & 11) != 2 || !composer5.getSkipping()) {
                                                    TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer5, 6).getBody2(), function210, composer5, (i15 >> 6) & 112);
                                                } else {
                                                    composer5.skipToGroupEnd();
                                                }
                                            }
                                        }), composer4, 56);
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }) : null, composer3, 6);
                            function29.invoke(composer3, Integer.valueOf(i132 & 14));
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                });
                int i122 = ((i6 >> 3) & 14) | 1572864;
                int i132 = i6 >> 9;
                composer2 = startRestartGroup;
                SurfaceKt.m1520SurfaceFjzlyU(modifier42, shape42, j82, j72, null, 0.0f, composableLambda2, composer2, i122 | (i132 & 112) | (i132 & 896) | (i132 & 7168), 48);
                function25 = function23;
                function26 = function24;
                modifier3 = modifier42;
                shape3 = shape42;
                j5 = j82;
                j6 = j72;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function23 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function24 = function22;
            if ((57344 & i) != 0) {
            }
            if ((458752 & i) != 0) {
            }
            if ((3670016 & i) != 0) {
            }
            int i1122 = i3;
            if ((2995931 & i3) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) == 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            long j722 = j4;
            long j822 = j3;
            Modifier modifier422 = modifier2;
            Shape shape422 = shape2;
            startRestartGroup.endDefaults();
            ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, 629950291, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i1222) {
                    ComposerKt.sourceInformation(composer3, "C58@2184L895:AlertDialog.kt#jmzs0o");
                    if ((i1222 & 11) != 2 || !composer3.getSkipping()) {
                        final Function2<? super Composer, ? super Integer, Unit> function27 = function23;
                        final Function2<? super Composer, ? super Integer, Unit> function28 = function24;
                        Function2<Composer, Integer, Unit> function29 = buttons;
                        final int i1322 = i6;
                        composer3.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume = composer3.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Density density = (Density) consume;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = composer3.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        LayoutDirection layoutDirection = (LayoutDirection) consume2;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer3.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                        Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-1163856341);
                        ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(523699273);
                        ComposerKt.sourceInformation(composer3, "C59@2205L842,79@3060L9:AlertDialog.kt#jmzs0o");
                        AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function27 != null ? ComposableLambdaKt.composableLambda(composer3, 620104160, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i14) {
                                ComposerKt.sourceInformation(composer4, "C62@2392L4,62@2327L240:AlertDialog.kt#jmzs0o");
                                if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer4, 6)))};
                                    final Function2<? super Composer, ? super Integer, Unit> function210 = function27;
                                    final int i15 = i1322;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer4, 770166432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i16) {
                                            ComposerKt.sourceInformation(composer5, "C63@2458L10,64@2507L34:AlertDialog.kt#jmzs0o");
                                            if ((i16 & 11) != 2 || !composer5.getSkipping()) {
                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer5, 6).getSubtitle1(), function210, composer5, (i15 >> 3) & 112);
                                            } else {
                                                composer5.skipToGroupEnd();
                                            }
                                        }
                                    }), composer4, 56);
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }) : null, function28 != null ? ComposableLambdaKt.composableLambda(composer3, 1965858367, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i14) {
                                ComposerKt.sourceInformation(composer4, "C71@2796L6,70@2702L291:AlertDialog.kt#jmzs0o");
                                if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                    ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer4, 6)))};
                                    final Function2<? super Composer, ? super Integer, Unit> function210 = function28;
                                    final int i15 = i1322;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer4, 2115920639, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i16) {
                                            ComposerKt.sourceInformation(composer5, "C73@2889L10,74@2934L33:AlertDialog.kt#jmzs0o");
                                            if ((i16 & 11) != 2 || !composer5.getSkipping()) {
                                                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer5, 6).getBody2(), function210, composer5, (i15 >> 6) & 112);
                                            } else {
                                                composer5.skipToGroupEnd();
                                            }
                                        }
                                    }), composer4, 56);
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }) : null, composer3, 6);
                        function29.invoke(composer3, Integer.valueOf(i1322 & 14));
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            });
            int i1222 = ((i6 >> 3) & 14) | 1572864;
            int i1322 = i6 >> 9;
            composer2 = startRestartGroup;
            SurfaceKt.m1520SurfaceFjzlyU(modifier422, shape422, j822, j722, null, 0.0f, composableLambda22, composer2, i1222 | (i1322 & 112) | (i1322 & 896) | (i1322 & 7168), 48);
            function25 = function23;
            function26 = function24;
            modifier3 = modifier422;
            shape3 = shape422;
            j5 = j822;
            j6 = j722;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function24 = function22;
        if ((57344 & i) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        if ((3670016 & i) != 0) {
        }
        int i11222 = i3;
        if ((2995931 & i3) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        long j7222 = j4;
        long j8222 = j3;
        Modifier modifier4222 = modifier2;
        Shape shape4222 = shape2;
        startRestartGroup.endDefaults();
        ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, 629950291, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i12222) {
                ComposerKt.sourceInformation(composer3, "C58@2184L895:AlertDialog.kt#jmzs0o");
                if ((i12222 & 11) != 2 || !composer3.getSkipping()) {
                    final Function2<? super Composer, ? super Integer, Unit> function27 = function23;
                    final Function2<? super Composer, ? super Integer, Unit> function28 = function24;
                    Function2<Composer, Integer, Unit> function29 = buttons;
                    final int i13222 = i6;
                    composer3.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume = composer3.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Density density = (Density) consume;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2 = composer3.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer3.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                    Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-1163856341);
                    ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(523699273);
                    ComposerKt.sourceInformation(composer3, "C59@2205L842,79@3060L9:AlertDialog.kt#jmzs0o");
                    AlertDialogKt.AlertDialogBaselineLayout(columnScopeInstance, function27 != null ? ComposableLambdaKt.composableLambda(composer3, 620104160, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i14) {
                            ComposerKt.sourceInformation(composer4, "C62@2392L4,62@2327L240:AlertDialog.kt#jmzs0o");
                            if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer4, 6)))};
                                final Function2<? super Composer, ? super Integer, Unit> function210 = function27;
                                final int i15 = i13222;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer4, 770166432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i16) {
                                        ComposerKt.sourceInformation(composer5, "C63@2458L10,64@2507L34:AlertDialog.kt#jmzs0o");
                                        if ((i16 & 11) != 2 || !composer5.getSkipping()) {
                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer5, 6).getSubtitle1(), function210, composer5, (i15 >> 3) & 112);
                                        } else {
                                            composer5.skipToGroupEnd();
                                        }
                                    }
                                }), composer4, 56);
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }) : null, function28 != null ? ComposableLambdaKt.composableLambda(composer3, 1965858367, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i14) {
                            ComposerKt.sourceInformation(composer4, "C71@2796L6,70@2702L291:AlertDialog.kt#jmzs0o");
                            if ((i14 & 11) != 2 || !composer4.getSkipping()) {
                                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer4, 6)))};
                                final Function2<? super Composer, ? super Integer, Unit> function210 = function28;
                                final int i15 = i13222;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer4, 2115920639, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogContent$1$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i16) {
                                        ComposerKt.sourceInformation(composer5, "C73@2889L10,74@2934L33:AlertDialog.kt#jmzs0o");
                                        if ((i16 & 11) != 2 || !composer5.getSkipping()) {
                                            TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer5, 6).getBody2(), function210, composer5, (i15 >> 6) & 112);
                                        } else {
                                            composer5.skipToGroupEnd();
                                        }
                                    }
                                }), composer4, 56);
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }) : null, composer3, 6);
                    function29.invoke(composer3, Integer.valueOf(i13222 & 14));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    return;
                }
                composer3.skipToGroupEnd();
            }
        });
        int i12222 = ((i6 >> 3) & 14) | 1572864;
        int i13222 = i6 >> 9;
        composer2 = startRestartGroup;
        SurfaceKt.m1520SurfaceFjzlyU(modifier4222, shape4222, j8222, j7222, null, 0.0f, composableLambda222, composer2, i12222 | (i13222 & 112) | (i13222 & 896) | (i13222 & 7168), 48);
        function25 = function23;
        function26 = function24;
        modifier3 = modifier4222;
        shape3 = shape4222;
        j5 = j8222;
        j6 = j7222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void AlertDialogBaselineLayout(final ColumnScope columnScope, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        boolean z;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer startRestartGroup = composer.startRestartGroup(-555573207);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialogBaselineLayout)P(1)96@3561L3479:AlertDialog.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(function22) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            Modifier weight = columnScope.weight(Modifier.INSTANCE, 1.0f, false);
            AlertDialogKt$AlertDialogBaselineLayout$2 alertDialogKt$AlertDialogBaselineLayout$2 = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2
                /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0101  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final MeasureResult mo61measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
                    Object obj;
                    long j2;
                    final Placeable placeable;
                    Object obj2;
                    int i3;
                    int i4;
                    long j3;
                    final int i5;
                    int i6;
                    long j4;
                    int i7;
                    final int i8;
                    long j5;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    List<? extends Measurable> list = measurables;
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj), "title")) {
                            break;
                        }
                    }
                    Measurable measurable = (Measurable) obj;
                    if (measurable != null) {
                        j2 = j;
                        placeable = measurable.mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null));
                    } else {
                        j2 = j;
                        placeable = null;
                    }
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj2), "text")) {
                            break;
                        }
                    }
                    Measurable measurable2 = (Measurable) obj2;
                    final Placeable mo3383measureBRTryo0 = measurable2 != null ? measurable2.mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null)) : null;
                    int max = Math.max(placeable != null ? placeable.getWidth() : 0, mo3383measureBRTryo0 != null ? mo3383measureBRTryo0.getWidth() : 0);
                    if (placeable != null) {
                        int i9 = placeable.get(AlignmentLineKt.getFirstBaseline());
                        Integer valueOf = i9 == Integer.MIN_VALUE ? null : Integer.valueOf(i9);
                        if (valueOf != null) {
                            i3 = valueOf.intValue();
                            if (placeable != null) {
                                int i10 = placeable.get(AlignmentLineKt.getLastBaseline());
                                Integer valueOf2 = i10 == Integer.MIN_VALUE ? null : Integer.valueOf(i10);
                                if (valueOf2 != null) {
                                    i4 = valueOf2.intValue();
                                    j3 = AlertDialogKt.TitleBaselineDistanceFromTop;
                                    i5 = Layout.mo329roundToPxR2X_6o(j3) - i3;
                                    if (mo3383measureBRTryo0 != null) {
                                        int i11 = mo3383measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
                                        Integer valueOf3 = i11 != Integer.MIN_VALUE ? Integer.valueOf(i11) : null;
                                        if (valueOf3 != null) {
                                            i6 = valueOf3.intValue();
                                            if (placeable != null) {
                                                j5 = AlertDialogKt.TextBaselineDistanceFromTop;
                                                i7 = Layout.mo329roundToPxR2X_6o(j5);
                                            } else {
                                                j4 = AlertDialogKt.TextBaselineDistanceFromTitle;
                                                i7 = Layout.mo329roundToPxR2X_6o(j4);
                                            }
                                            int height = placeable == null ? placeable.getHeight() + i5 : 0;
                                            if (placeable != null) {
                                                i8 = i7 - i6;
                                            } else {
                                                i8 = (i4 == 0 ? height - i6 : (i5 + i4) - i6) + i7;
                                            }
                                            if (mo3383measureBRTryo0 != null) {
                                                if (i4 == 0) {
                                                    r15 = (mo3383measureBRTryo0.getHeight() + i7) - i6;
                                                } else {
                                                    r15 = ((mo3383measureBRTryo0.getHeight() + i7) - i6) - ((placeable != null ? placeable.getHeight() : 0) - i4);
                                                }
                                            }
                                            return MeasureScope.layout$default(Layout, max, height + r15, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$measure$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                    invoke2(placementScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Placeable.PlacementScope layout) {
                                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                    Placeable placeable2 = Placeable.this;
                                                    if (placeable2 != null) {
                                                        Placeable.PlacementScope.place$default(layout, placeable2, 0, i5, 0.0f, 4, null);
                                                    }
                                                    Placeable placeable3 = mo3383measureBRTryo0;
                                                    if (placeable3 != null) {
                                                        Placeable.PlacementScope.place$default(layout, placeable3, 0, i8, 0.0f, 4, null);
                                                    }
                                                }
                                            }, 4, null);
                                        }
                                    }
                                    i6 = 0;
                                    if (placeable != null) {
                                    }
                                    if (placeable == null) {
                                    }
                                    if (placeable != null) {
                                    }
                                    if (mo3383measureBRTryo0 != null) {
                                    }
                                    return MeasureScope.layout$default(Layout, max, height + r15, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$measure$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Placeable.PlacementScope layout) {
                                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                            Placeable placeable2 = Placeable.this;
                                            if (placeable2 != null) {
                                                Placeable.PlacementScope.place$default(layout, placeable2, 0, i5, 0.0f, 4, null);
                                            }
                                            Placeable placeable3 = mo3383measureBRTryo0;
                                            if (placeable3 != null) {
                                                Placeable.PlacementScope.place$default(layout, placeable3, 0, i8, 0.0f, 4, null);
                                            }
                                        }
                                    }, 4, null);
                                }
                            }
                            i4 = 0;
                            j3 = AlertDialogKt.TitleBaselineDistanceFromTop;
                            i5 = Layout.mo329roundToPxR2X_6o(j3) - i3;
                            if (mo3383measureBRTryo0 != null) {
                            }
                            i6 = 0;
                            if (placeable != null) {
                            }
                            if (placeable == null) {
                            }
                            if (placeable != null) {
                            }
                            if (mo3383measureBRTryo0 != null) {
                            }
                            return MeasureScope.layout$default(Layout, max, height + r15, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$measure$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Placeable.PlacementScope layout) {
                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                    Placeable placeable2 = Placeable.this;
                                    if (placeable2 != null) {
                                        Placeable.PlacementScope.place$default(layout, placeable2, 0, i5, 0.0f, 4, null);
                                    }
                                    Placeable placeable3 = mo3383measureBRTryo0;
                                    if (placeable3 != null) {
                                        Placeable.PlacementScope.place$default(layout, placeable3, 0, i8, 0.0f, 4, null);
                                    }
                                }
                            }, 4, null);
                        }
                    }
                    i3 = 0;
                    if (placeable != null) {
                    }
                    i4 = 0;
                    j3 = AlertDialogKt.TitleBaselineDistanceFromTop;
                    i5 = Layout.mo329roundToPxR2X_6o(j3) - i3;
                    if (mo3383measureBRTryo0 != null) {
                    }
                    i6 = 0;
                    if (placeable != null) {
                    }
                    if (placeable == null) {
                    }
                    if (placeable != null) {
                    }
                    if (mo3383measureBRTryo0 != null) {
                    }
                    return MeasureScope.layout$default(Layout, max, height + r15, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$2$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            Placeable placeable2 = Placeable.this;
                            if (placeable2 != null) {
                                Placeable.PlacementScope.place$default(layout, placeable2, 0, i5, 0.0f, 4, null);
                            }
                            Placeable placeable3 = mo3383measureBRTryo0;
                            if (placeable3 != null) {
                                Placeable.PlacementScope.place$default(layout, placeable3, 0, i8, 0.0f, 4, null);
                            }
                        }
                    }, 4, null);
                }
            };
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
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(weight);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl, alertDialogKt$AlertDialogBaselineLayout$2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(1454034642);
            ComposerKt.sourceInformation(startRestartGroup, "C*104@3798L103:AlertDialog.kt#jmzs0o");
            startRestartGroup.startReplaceableGroup(-1160646206);
            ComposerKt.sourceInformation(startRestartGroup, "*99@3629L106");
            if (function2 == null) {
                z = false;
            } else {
                Modifier align = columnScope.align(LayoutIdKt.layoutId(TitlePadding, "title"), Alignment.INSTANCE.getStart());
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                z = false;
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
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(align);
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
                startRestartGroup.startReplaceableGroup(472489145);
                ComposerKt.sourceInformation(startRestartGroup, "C*100@3710L7:AlertDialog.kt#jmzs0o");
                function2.invoke(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceableGroup();
            if (function22 != null) {
                Modifier align2 = columnScope.align(LayoutIdKt.layoutId(TextPadding, "text"), Alignment.INSTANCE.getStart());
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                boolean z2 = z;
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z2, startRestartGroup, z2 ? 1 : 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume7 = startRestartGroup.consume(localDensity3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density3 = (Density) consume7;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume8 = startRestartGroup.consume(localLayoutDirection3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume9 = startRestartGroup.consume(localViewConfiguration3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(align2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1642constructorimpl3 = Updater.m1642constructorimpl(startRestartGroup);
                Updater.m1649setimpl(m1642constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-272722206);
                ComposerKt.sourceInformation(startRestartGroup, "C*105@3877L6:AlertDialog.kt#jmzs0o");
                function22.invoke(startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Unit unit3 = Unit.INSTANCE;
                Unit unit4 = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogBaselineLayout$3
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

            public final void invoke(Composer composer2, int i3) {
                AlertDialogKt.AlertDialogBaselineLayout(ColumnScope.this, function2, function22, composer2, i | 1);
            }
        });
    }

    /* renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m1226AlertDialogFlowRowixp7dh8(final float f, final float f2, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(73434452);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialogFlowRow)P(2:c#ui.unit.Dp,1:c#ui.unit.Dp)192@7298L3452:AlertDialog.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(content) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo61measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> measurables, long j) {
                    int max;
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    ArrayList arrayList3;
                    Ref.IntRef intRef;
                    Placeable placeable;
                    Ref.IntRef intRef2;
                    Ref.IntRef intRef3;
                    MeasureScope Layout = measureScope;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = arrayList5;
                    Ref.IntRef intRef4 = new Ref.IntRef();
                    Ref.IntRef intRef5 = new Ref.IntRef();
                    ArrayList arrayList8 = new ArrayList();
                    Ref.IntRef intRef6 = new Ref.IntRef();
                    Ref.IntRef intRef7 = new Ref.IntRef();
                    long Constraints$default = ConstraintsKt.Constraints$default(0, Constraints.m4396getMaxWidthimpl(j), 0, 0, 13, null);
                    Iterator<? extends Measurable> it = measurables.iterator();
                    while (it.hasNext()) {
                        Placeable mo3383measureBRTryo0 = it.next().mo3383measureBRTryo0(Constraints$default);
                        ArrayList arrayList9 = arrayList8;
                        arrayList8 = arrayList9;
                        if (measure_3p2s80s$canAddToCurrentSequence(arrayList9, intRef6, Layout, f, j, mo3383measureBRTryo0)) {
                            Layout = measureScope;
                            arrayList = arrayList4;
                            arrayList2 = arrayList6;
                            arrayList3 = arrayList7;
                            intRef = intRef6;
                            placeable = mo3383measureBRTryo0;
                            intRef2 = intRef5;
                            intRef3 = intRef7;
                        } else {
                            Layout = measureScope;
                            arrayList = arrayList4;
                            arrayList2 = arrayList6;
                            arrayList3 = arrayList7;
                            intRef = intRef6;
                            placeable = mo3383measureBRTryo0;
                            intRef2 = intRef5;
                            intRef3 = intRef7;
                            measure_3p2s80s$startNewSequence(arrayList, intRef2, Layout, f2, arrayList8, arrayList3, intRef3, arrayList2, intRef4, intRef);
                        }
                        if (!arrayList8.isEmpty()) {
                            intRef.element += Layout.mo330roundToPx0680j_4(f);
                        }
                        arrayList8.add(placeable);
                        intRef.element += placeable.getWidth();
                        intRef3.element = Math.max(intRef3.element, placeable.getHeight());
                        intRef5 = intRef2;
                        arrayList7 = arrayList3;
                        intRef7 = intRef3;
                        intRef6 = intRef;
                        arrayList6 = arrayList2;
                        arrayList4 = arrayList;
                    }
                    final ArrayList arrayList10 = arrayList4;
                    final ArrayList arrayList11 = arrayList6;
                    ArrayList arrayList12 = arrayList7;
                    Ref.IntRef intRef8 = intRef7;
                    Ref.IntRef intRef9 = intRef6;
                    Ref.IntRef intRef10 = intRef5;
                    if (!arrayList8.isEmpty()) {
                        measure_3p2s80s$startNewSequence(arrayList10, intRef10, Layout, f2, arrayList8, arrayList12, intRef8, arrayList11, intRef4, intRef9);
                    }
                    if (Constraints.m4396getMaxWidthimpl(j) != Integer.MAX_VALUE) {
                        max = Constraints.m4396getMaxWidthimpl(j);
                    } else {
                        max = Math.max(intRef4.element, Constraints.m4398getMinWidthimpl(j));
                    }
                    final int i3 = max;
                    int max2 = Math.max(intRef10.element, Constraints.m4397getMinHeightimpl(j));
                    final float f3 = f;
                    return MeasureScope.layout$default(measureScope, i3, max2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$1$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope placementScope) {
                            Placeable.PlacementScope layout = placementScope;
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            List<List<Placeable>> list = arrayList10;
                            MeasureScope measureScope2 = measureScope;
                            float f4 = f3;
                            int i4 = i3;
                            List<Integer> list2 = arrayList11;
                            int size = list.size();
                            int i5 = 0;
                            while (i5 < size) {
                                List<Placeable> list3 = list.get(i5);
                                int size2 = list3.size();
                                int[] iArr = new int[size2];
                                int i6 = 0;
                                while (i6 < size2) {
                                    iArr[i6] = list3.get(i6).getWidth() + (i6 < CollectionsKt.getLastIndex(list3) ? measureScope2.mo330roundToPx0680j_4(f4) : 0);
                                    i6++;
                                }
                                Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
                                int[] iArr2 = new int[size2];
                                for (int i7 = 0; i7 < size2; i7++) {
                                    iArr2[i7] = 0;
                                }
                                bottom.arrange(measureScope2, i4, iArr, iArr2);
                                int size3 = list3.size();
                                int i8 = 0;
                                while (i8 < size3) {
                                    Placeable.PlacementScope.place$default(layout, list3.get(i8), iArr2[i8], list2.get(i5).intValue(), 0.0f, 4, null);
                                    i8++;
                                    layout = placementScope;
                                    iArr2 = iArr2;
                                    size3 = size3;
                                    list3 = list3;
                                }
                                i5++;
                                layout = placementScope;
                            }
                        }
                    }, 4, null);
                }

                private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, Ref.IntRef intRef, MeasureScope measureScope, float f3, long j, Placeable placeable) {
                    return list.isEmpty() || (intRef.element + measureScope.mo330roundToPx0680j_4(f3)) + placeable.getWidth() <= Constraints.m4396getMaxWidthimpl(j);
                }

                private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, Ref.IntRef intRef, MeasureScope measureScope, float f3, List<Placeable> list2, List<Integer> list3, Ref.IntRef intRef2, List<Integer> list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
                    List<List<Placeable>> list5 = list;
                    if (!list5.isEmpty()) {
                        intRef.element += measureScope.mo330roundToPx0680j_4(f3);
                    }
                    list5.add(CollectionsKt.toList(list2));
                    list3.add(Integer.valueOf(intRef2.element));
                    list4.add(Integer.valueOf(intRef.element));
                    intRef.element += intRef2.element;
                    intRef3.element = Math.max(intRef3.element, intRef4.element);
                    list2.clear();
                    intRef4.element = 0;
                    intRef2.element = 0;
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
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
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
            int i3 = ((((i2 >> 6) & 14) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            content.invoke(startRestartGroup, Integer.valueOf((i3 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogFlowRow$2
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

            public final void invoke(Composer composer2, int i4) {
                AlertDialogKt.m1226AlertDialogFlowRowixp7dh8(f, f2, content, composer2, i | 1);
            }
        });
    }

    static {
        float f = 24;
        TitlePadding = PaddingKt.m589paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m4440constructorimpl(f), 0.0f, Dp.m4440constructorimpl(f), 0.0f, 10, null);
        TextPadding = PaddingKt.m589paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m4440constructorimpl(f), 0.0f, Dp.m4440constructorimpl(f), Dp.m4440constructorimpl(28), 2, null);
    }
}

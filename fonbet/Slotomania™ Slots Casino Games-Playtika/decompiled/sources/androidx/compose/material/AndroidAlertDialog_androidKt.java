package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.braze.models.FeatureFlag;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidAlertDialog.android.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u00ad\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0096\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", FeatureFlag.PROPERTIES, "Landroidx/compose/ui/window/DialogProperties;", "AlertDialog-6oU6zVQ", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "buttons", "AlertDialog-wqdebIU", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidAlertDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x026a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d1  */
    /* renamed from: AlertDialog-6oU6zVQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1227AlertDialog6oU6zVQ(final Function0<Unit> onDismissRequest, final Function2<? super Composer, ? super Integer, Unit> confirmButton, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, long j, long j2, DialogProperties dialogProperties, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i7;
        Shape shape2;
        int i8;
        final int i9;
        CornerBasedShape cornerBasedShape;
        long j3;
        long j4;
        DialogProperties dialogProperties2;
        Modifier modifier3;
        Shape shape3;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        long j5;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        long j6;
        final DialogProperties dialogProperties3;
        Composer composer2;
        final long j7;
        final long j8;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Shape shape4;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        final Function2<? super Composer, ? super Integer, Unit> function212;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        Composer startRestartGroup = composer.startRestartGroup(-606536823);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialog)P(5,1,4,3,9,8,7,0:c#ui.graphics.Color,2:c#ui.graphics.Color)70@3471L6,71@3529L6,72@3571L32,75@3667L735:AndroidAlertDialog.android.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(confirmButton) ? 32 : 16;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                function24 = function2;
                i3 |= startRestartGroup.changed(function24) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    function25 = function22;
                    i3 |= startRestartGroup.changed(function25) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        function26 = function23;
                        i3 |= startRestartGroup.changed(function26) ? 131072 : 65536;
                        if ((i & 3670016) == 0) {
                            i7 = 57344;
                            shape2 = shape;
                            i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(shape2)) ? 1048576 : 524288;
                        } else {
                            i7 = 57344;
                            shape2 = shape;
                        }
                        if ((i & 29360128) == 0) {
                            i8 = 458752;
                            if ((i2 & 128) == 0) {
                                i12 = i3;
                                if (startRestartGroup.changed(j)) {
                                    i13 = 8388608;
                                    i9 = i12 | i13;
                                }
                            } else {
                                i12 = i3;
                            }
                            i13 = 4194304;
                            i9 = i12 | i13;
                        } else {
                            i8 = 458752;
                            i9 = i3;
                        }
                        if ((i & 234881024) == 0) {
                            if ((i2 & 256) == 0 && startRestartGroup.changed(j2)) {
                                i11 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i9 |= i11;
                            }
                            i11 = 33554432;
                            i9 |= i11;
                        }
                        if ((i & 1879048192) == 0) {
                            if ((i2 & 512) == 0 && startRestartGroup.changed(dialogProperties)) {
                                i10 = 536870912;
                                i9 |= i10;
                            }
                            i10 = 268435456;
                            i9 |= i10;
                        }
                        if ((1533916891 & i9) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i14 != 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function24 = null;
                                }
                                if (i5 != 0) {
                                    function25 = null;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function213 = i6 == 0 ? function26 : null;
                                if ((i2 & 64) != 0) {
                                    cornerBasedShape = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getMedium();
                                    i9 &= -3670017;
                                } else {
                                    cornerBasedShape = shape2;
                                }
                                if ((i2 & 128) != 0) {
                                    j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1328getSurface0d7_KjU();
                                    i9 &= -29360129;
                                } else {
                                    j3 = j;
                                }
                                if ((i2 & 256) != 0) {
                                    j4 = ColorsKt.m1342contentColorForek8zF_U(j3, startRestartGroup, (i9 >> 21) & 14);
                                    i9 = (-234881025) & i9;
                                } else {
                                    j4 = j2;
                                }
                                if ((i2 & 512) != 0) {
                                    i9 &= -1879048193;
                                    dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                                    shape3 = cornerBasedShape;
                                    modifier3 = companion;
                                    function28 = function213;
                                    function27 = function24;
                                    j5 = j3;
                                } else {
                                    dialogProperties2 = dialogProperties;
                                    modifier3 = companion;
                                    shape3 = cornerBasedShape;
                                    function27 = function24;
                                    j5 = j3;
                                    function28 = function213;
                                }
                                function29 = function25;
                                j6 = j4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i9 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i9 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i9 &= -234881025;
                                }
                                if ((i2 & 512) != 0) {
                                    i9 &= -1879048193;
                                }
                                dialogProperties2 = dialogProperties;
                                modifier3 = modifier2;
                                function27 = function24;
                                shape3 = shape2;
                                function29 = function25;
                                function28 = function26;
                                j5 = j;
                                j6 = j2;
                            }
                            startRestartGroup.endDefaults();
                            Function2<? super Composer, ? super Integer, Unit> function214 = function27;
                            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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

                                public final void invoke(Composer composer3, int i15) {
                                    ComposerKt.sourceInformation(composer3, "C79@3846L331:AndroidAlertDialog.android.kt#jmzs0o");
                                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                        float f = 8;
                                        Modifier m586paddingVpY3zN4 = PaddingKt.m586paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4440constructorimpl(f), Dp.m4440constructorimpl(2));
                                        final Function2<Composer, Integer, Unit> function215 = function27;
                                        final int i16 = i9;
                                        final Function2<Composer, Integer, Unit> function216 = confirmButton;
                                        composer3.startReplaceableGroup(733328855);
                                        ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
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
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m586paddingVpY3zN4);
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
                                        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-2137368960);
                                        ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer3.startReplaceableGroup(-434861445);
                                        ComposerKt.sourceInformation(composer3, "C80@3937L226:AndroidAlertDialog.android.kt#jmzs0o");
                                        AlertDialogKt.m1226AlertDialogFlowRowixp7dh8(Dp.m4440constructorimpl(f), Dp.m4440constructorimpl(12), ComposableLambdaKt.composableLambda(composer3, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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

                                            public final void invoke(Composer composer4, int i17) {
                                                ComposerKt.sourceInformation(composer4, "C85@4130L15:AndroidAlertDialog.android.kt#jmzs0o");
                                                if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                                    Function2<Composer, Integer, Unit> function217 = function215;
                                                    composer4.startReplaceableGroup(-1046483318);
                                                    ComposerKt.sourceInformation(composer4, "84@4101L8");
                                                    if (function217 != null) {
                                                        function217.invoke(composer4, Integer.valueOf((i16 >> 9) & 14));
                                                        Unit unit = Unit.INSTANCE;
                                                    }
                                                    composer4.endReplaceableGroup();
                                                    function216.invoke(composer4, Integer.valueOf((i16 >> 3) & 14));
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, 438);
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
                            int i15 = (i9 & 14) | 48 | (i9 & 896);
                            int i16 = i9 >> 3;
                            m1228AlertDialogwqdebIU(onDismissRequest, composableLambda, modifier3, function29, function28, shape3, j5, j6, dialogProperties2, startRestartGroup, (i16 & 234881024) | i15 | (i16 & 7168) | (i16 & i7) | (i16 & i8) | (i16 & 3670016) | (i16 & 29360128), 0);
                            dialogProperties3 = dialogProperties2;
                            composer2 = startRestartGroup;
                            j7 = j6;
                            j8 = j5;
                            function210 = function28;
                            shape4 = shape3;
                            function211 = function214;
                            function212 = function29;
                            modifier4 = modifier3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            dialogProperties3 = dialogProperties;
                            modifier4 = modifier2;
                            function211 = function24;
                            shape4 = shape2;
                            function212 = function25;
                            composer2 = startRestartGroup;
                            function210 = function26;
                            j8 = j;
                            j7 = j2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
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

                            public final void invoke(Composer composer3, int i17) {
                                AndroidAlertDialog_androidKt.m1227AlertDialog6oU6zVQ(onDismissRequest, confirmButton, modifier4, function211, function212, function210, shape4, j8, j7, dialogProperties3, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    function26 = function23;
                    if ((i & 3670016) == 0) {
                    }
                    if ((i & 29360128) == 0) {
                    }
                    if ((i & 234881024) == 0) {
                    }
                    if ((i & 1879048192) == 0) {
                    }
                    if ((1533916891 & i9) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    if ((i2 & 512) != 0) {
                    }
                    function29 = function25;
                    j6 = j4;
                    startRestartGroup.endDefaults();
                    Function2<? super Composer, ? super Integer, Unit> function2142 = function27;
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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

                        public final void invoke(Composer composer3, int i152) {
                            ComposerKt.sourceInformation(composer3, "C79@3846L331:AndroidAlertDialog.android.kt#jmzs0o");
                            if ((i152 & 11) != 2 || !composer3.getSkipping()) {
                                float f = 8;
                                Modifier m586paddingVpY3zN4 = PaddingKt.m586paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4440constructorimpl(f), Dp.m4440constructorimpl(2));
                                final Function2<? super Composer, ? super Integer, Unit> function215 = function27;
                                final int i162 = i9;
                                final Function2<? super Composer, ? super Integer, Unit> function216 = confirmButton;
                                composer3.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
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
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m586paddingVpY3zN4);
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
                                Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-2137368960);
                                ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer3.startReplaceableGroup(-434861445);
                                ComposerKt.sourceInformation(composer3, "C80@3937L226:AndroidAlertDialog.android.kt#jmzs0o");
                                AlertDialogKt.m1226AlertDialogFlowRowixp7dh8(Dp.m4440constructorimpl(f), Dp.m4440constructorimpl(12), ComposableLambdaKt.composableLambda(composer3, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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

                                    public final void invoke(Composer composer4, int i17) {
                                        ComposerKt.sourceInformation(composer4, "C85@4130L15:AndroidAlertDialog.android.kt#jmzs0o");
                                        if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                            Function2<Composer, Integer, Unit> function217 = function215;
                                            composer4.startReplaceableGroup(-1046483318);
                                            ComposerKt.sourceInformation(composer4, "84@4101L8");
                                            if (function217 != null) {
                                                function217.invoke(composer4, Integer.valueOf((i162 >> 9) & 14));
                                                Unit unit = Unit.INSTANCE;
                                            }
                                            composer4.endReplaceableGroup();
                                            function216.invoke(composer4, Integer.valueOf((i162 >> 3) & 14));
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }), composer3, 438);
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
                    int i152 = (i9 & 14) | 48 | (i9 & 896);
                    int i162 = i9 >> 3;
                    m1228AlertDialogwqdebIU(onDismissRequest, composableLambda2, modifier3, function29, function28, shape3, j5, j6, dialogProperties2, startRestartGroup, (i162 & 234881024) | i152 | (i162 & 7168) | (i162 & i7) | (i162 & i8) | (i162 & 3670016) | (i162 & 29360128), 0);
                    dialogProperties3 = dialogProperties2;
                    composer2 = startRestartGroup;
                    j7 = j6;
                    j8 = j5;
                    function210 = function28;
                    shape4 = shape3;
                    function211 = function2142;
                    function212 = function29;
                    modifier4 = modifier3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function25 = function22;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function26 = function23;
                if ((i & 3670016) == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                if ((i & 234881024) == 0) {
                }
                if ((i & 1879048192) == 0) {
                }
                if ((1533916891 & i9) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i14 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                if ((i2 & 512) != 0) {
                }
                function29 = function25;
                j6 = j4;
                startRestartGroup.endDefaults();
                Function2<? super Composer, ? super Integer, Unit> function21422 = function27;
                ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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

                    public final void invoke(Composer composer3, int i1522) {
                        ComposerKt.sourceInformation(composer3, "C79@3846L331:AndroidAlertDialog.android.kt#jmzs0o");
                        if ((i1522 & 11) != 2 || !composer3.getSkipping()) {
                            float f = 8;
                            Modifier m586paddingVpY3zN4 = PaddingKt.m586paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4440constructorimpl(f), Dp.m4440constructorimpl(2));
                            final Function2<? super Composer, ? super Integer, Unit> function215 = function27;
                            final int i1622 = i9;
                            final Function2<? super Composer, ? super Integer, Unit> function216 = confirmButton;
                            composer3.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
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
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m586paddingVpY3zN4);
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
                            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-2137368960);
                            ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer3.startReplaceableGroup(-434861445);
                            ComposerKt.sourceInformation(composer3, "C80@3937L226:AndroidAlertDialog.android.kt#jmzs0o");
                            AlertDialogKt.m1226AlertDialogFlowRowixp7dh8(Dp.m4440constructorimpl(f), Dp.m4440constructorimpl(12), ComposableLambdaKt.composableLambda(composer3, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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

                                public final void invoke(Composer composer4, int i17) {
                                    ComposerKt.sourceInformation(composer4, "C85@4130L15:AndroidAlertDialog.android.kt#jmzs0o");
                                    if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                        Function2<Composer, Integer, Unit> function217 = function215;
                                        composer4.startReplaceableGroup(-1046483318);
                                        ComposerKt.sourceInformation(composer4, "84@4101L8");
                                        if (function217 != null) {
                                            function217.invoke(composer4, Integer.valueOf((i1622 >> 9) & 14));
                                            Unit unit = Unit.INSTANCE;
                                        }
                                        composer4.endReplaceableGroup();
                                        function216.invoke(composer4, Integer.valueOf((i1622 >> 3) & 14));
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), composer3, 438);
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
                int i1522 = (i9 & 14) | 48 | (i9 & 896);
                int i1622 = i9 >> 3;
                m1228AlertDialogwqdebIU(onDismissRequest, composableLambda22, modifier3, function29, function28, shape3, j5, j6, dialogProperties2, startRestartGroup, (i1622 & 234881024) | i1522 | (i1622 & 7168) | (i1622 & i7) | (i1622 & i8) | (i1622 & 3670016) | (i1622 & 29360128), 0);
                dialogProperties3 = dialogProperties2;
                composer2 = startRestartGroup;
                j7 = j6;
                j8 = j5;
                function210 = function28;
                shape4 = shape3;
                function211 = function21422;
                function212 = function29;
                modifier4 = modifier3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function24 = function2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function25 = function22;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function26 = function23;
            if ((i & 3670016) == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((i & 1879048192) == 0) {
            }
            if ((1533916891 & i9) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i14 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            if ((i2 & 512) != 0) {
            }
            function29 = function25;
            j6 = j4;
            startRestartGroup.endDefaults();
            Function2<? super Composer, ? super Integer, Unit> function214222 = function27;
            ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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

                public final void invoke(Composer composer3, int i15222) {
                    ComposerKt.sourceInformation(composer3, "C79@3846L331:AndroidAlertDialog.android.kt#jmzs0o");
                    if ((i15222 & 11) != 2 || !composer3.getSkipping()) {
                        float f = 8;
                        Modifier m586paddingVpY3zN4 = PaddingKt.m586paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4440constructorimpl(f), Dp.m4440constructorimpl(2));
                        final Function2<? super Composer, ? super Integer, Unit> function215 = function27;
                        final int i16222 = i9;
                        final Function2<? super Composer, ? super Integer, Unit> function216 = confirmButton;
                        composer3.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
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
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m586paddingVpY3zN4);
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
                        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-2137368960);
                        ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer3.startReplaceableGroup(-434861445);
                        ComposerKt.sourceInformation(composer3, "C80@3937L226:AndroidAlertDialog.android.kt#jmzs0o");
                        AlertDialogKt.m1226AlertDialogFlowRowixp7dh8(Dp.m4440constructorimpl(f), Dp.m4440constructorimpl(12), ComposableLambdaKt.composableLambda(composer3, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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

                            public final void invoke(Composer composer4, int i17) {
                                ComposerKt.sourceInformation(composer4, "C85@4130L15:AndroidAlertDialog.android.kt#jmzs0o");
                                if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                    Function2<Composer, Integer, Unit> function217 = function215;
                                    composer4.startReplaceableGroup(-1046483318);
                                    ComposerKt.sourceInformation(composer4, "84@4101L8");
                                    if (function217 != null) {
                                        function217.invoke(composer4, Integer.valueOf((i16222 >> 9) & 14));
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer4.endReplaceableGroup();
                                    function216.invoke(composer4, Integer.valueOf((i16222 >> 3) & 14));
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer3, 438);
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
            int i15222 = (i9 & 14) | 48 | (i9 & 896);
            int i16222 = i9 >> 3;
            m1228AlertDialogwqdebIU(onDismissRequest, composableLambda222, modifier3, function29, function28, shape3, j5, j6, dialogProperties2, startRestartGroup, (i16222 & 234881024) | i15222 | (i16222 & 7168) | (i16222 & i7) | (i16222 & i8) | (i16222 & 3670016) | (i16222 & 29360128), 0);
            dialogProperties3 = dialogProperties2;
            composer2 = startRestartGroup;
            j7 = j6;
            j8 = j5;
            function210 = function28;
            shape4 = shape3;
            function211 = function214222;
            function212 = function29;
            modifier4 = modifier3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function24 = function2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function25 = function22;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function26 = function23;
        if ((i & 3670016) == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((i & 1879048192) == 0) {
        }
        if ((1533916891 & i9) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i14 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        if ((i2 & 512) != 0) {
        }
        function29 = function25;
        j6 = j4;
        startRestartGroup.endDefaults();
        Function2<? super Composer, ? super Integer, Unit> function2142222 = function27;
        ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(startRestartGroup, -1849673151, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
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

            public final void invoke(Composer composer3, int i152222) {
                ComposerKt.sourceInformation(composer3, "C79@3846L331:AndroidAlertDialog.android.kt#jmzs0o");
                if ((i152222 & 11) != 2 || !composer3.getSkipping()) {
                    float f = 8;
                    Modifier m586paddingVpY3zN4 = PaddingKt.m586paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m4440constructorimpl(f), Dp.m4440constructorimpl(2));
                    final Function2<? super Composer, ? super Integer, Unit> function215 = function27;
                    final int i162222 = i9;
                    final Function2<? super Composer, ? super Integer, Unit> function216 = confirmButton;
                    composer3.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer3, 0);
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
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m586paddingVpY3zN4);
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
                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-2137368960);
                    ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer3.startReplaceableGroup(-434861445);
                    ComposerKt.sourceInformation(composer3, "C80@3937L226:AndroidAlertDialog.android.kt#jmzs0o");
                    AlertDialogKt.m1226AlertDialogFlowRowixp7dh8(Dp.m4440constructorimpl(f), Dp.m4440constructorimpl(12), ComposableLambdaKt.composableLambda(composer3, 1789213604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1$1$1
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

                        public final void invoke(Composer composer4, int i17) {
                            ComposerKt.sourceInformation(composer4, "C85@4130L15:AndroidAlertDialog.android.kt#jmzs0o");
                            if ((i17 & 11) != 2 || !composer4.getSkipping()) {
                                Function2<Composer, Integer, Unit> function217 = function215;
                                composer4.startReplaceableGroup(-1046483318);
                                ComposerKt.sourceInformation(composer4, "84@4101L8");
                                if (function217 != null) {
                                    function217.invoke(composer4, Integer.valueOf((i162222 >> 9) & 14));
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer4.endReplaceableGroup();
                                function216.invoke(composer4, Integer.valueOf((i162222 >> 3) & 14));
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer3, 438);
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
        int i152222 = (i9 & 14) | 48 | (i9 & 896);
        int i162222 = i9 >> 3;
        m1228AlertDialogwqdebIU(onDismissRequest, composableLambda2222, modifier3, function29, function28, shape3, j5, j6, dialogProperties2, startRestartGroup, (i162222 & 234881024) | i152222 | (i162222 & 7168) | (i162222 & i7) | (i162222 & i8) | (i162222 & 3670016) | (i162222 & 29360128), 0);
        dialogProperties3 = dialogProperties2;
        composer2 = startRestartGroup;
        j7 = j6;
        j8 = j5;
        function210 = function28;
        shape4 = shape3;
        function211 = function2142222;
        function212 = function29;
        modifier4 = modifier3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0217 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a7  */
    /* renamed from: AlertDialog-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1228AlertDialogwqdebIU(final Function0<Unit> onDismissRequest, final Function2<? super Composer, ? super Integer, Unit> buttons, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, long j, long j2, DialogProperties dialogProperties, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Shape shape2;
        long j3;
        DialogProperties dialogProperties2;
        long j4;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Shape shape3;
        final long j5;
        final long j6;
        Composer composer2;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Shape shape4;
        final long j7;
        final long j8;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Composer startRestartGroup = composer.startRestartGroup(1035523925);
        ComposerKt.sourceInformation(startRestartGroup, "C(AlertDialog)P(4,1,3,8,7,6,0:c#ui.graphics.Color,2:c#ui.graphics.Color)131@6133L6,132@6191L6,133@6233L32,136@6329L366:AndroidAlertDialog.android.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(buttons) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                function23 = function2;
                i3 |= startRestartGroup.changed(function23) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    function24 = function22;
                    i3 |= startRestartGroup.changed(function24) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i8 = 131072;
                                i3 |= i8;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        shape2 = shape;
                    }
                    if ((3670016 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            j3 = j;
                            if (startRestartGroup.changed(j3)) {
                                i7 = 1048576;
                                i3 |= i7;
                            }
                        } else {
                            j3 = j;
                        }
                        i7 = 524288;
                        i3 |= i7;
                    } else {
                        j3 = j;
                    }
                    if ((29360128 & i) == 0) {
                        i3 |= ((i2 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304;
                    }
                    if ((i & 234881024) != 0) {
                        if ((i2 & 256) == 0) {
                            dialogProperties2 = dialogProperties;
                            if (startRestartGroup.changed(dialogProperties2)) {
                                i6 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i3 |= i6;
                            }
                        } else {
                            dialogProperties2 = dialogProperties;
                        }
                        i6 = 33554432;
                        i3 |= i6;
                    } else {
                        dialogProperties2 = dialogProperties;
                    }
                    if ((i3 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                function23 = null;
                            }
                            if (i5 != 0) {
                                function24 = null;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getMedium();
                            }
                            if ((i2 & 64) != 0) {
                                j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1328getSurface0d7_KjU();
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) == 0) {
                                j4 = ColorsKt.m1342contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 18) & 14);
                                i3 &= -29360129;
                            } else {
                                j4 = j2;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                dialogProperties2 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                            }
                            modifier3 = modifier2;
                            function25 = function23;
                            function26 = function24;
                            shape3 = shape2;
                            j5 = j3;
                            j6 = j4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            modifier3 = modifier2;
                            function25 = function23;
                            function26 = function24;
                            shape3 = shape2;
                            j5 = j3;
                            j6 = j2;
                        }
                        final int i10 = i3;
                        startRestartGroup.endDefaults();
                        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(startRestartGroup, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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

                            public final void invoke(Composer composer3, int i11) {
                                ComposerKt.sourceInformation(composer3, "C140@6430L259:AndroidAlertDialog.android.kt#jmzs0o");
                                if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                                    Function2<Composer, Integer, Unit> function29 = buttons;
                                    Modifier modifier5 = modifier3;
                                    Function2<Composer, Integer, Unit> function210 = function25;
                                    Function2<Composer, Integer, Unit> function211 = function26;
                                    Shape shape5 = shape3;
                                    long j9 = j5;
                                    long j10 = j6;
                                    int i12 = i10;
                                    AlertDialogKt.m1225AlertDialogContentWMdw5o4(function29, modifier5, function210, function211, shape5, j9, j10, composer3, ((i12 >> 3) & 14) | ((i12 >> 3) & 112) | ((i12 >> 3) & 896) | ((i12 >> 3) & 7168) | ((i12 >> 3) & 57344) | ((i12 >> 3) & 458752) | ((i12 >> 3) & 3670016), 0);
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), startRestartGroup, (i10 & 14) | RendererCapabilities.MODE_SUPPORT_MASK | ((i10 >> 21) & 112), 0);
                        composer2 = startRestartGroup;
                        modifier4 = modifier3;
                        function27 = function25;
                        function28 = function26;
                        shape4 = shape3;
                        j7 = j5;
                        j8 = j6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        function27 = function23;
                        function28 = function24;
                        shape4 = shape2;
                        j7 = j3;
                        composer2 = startRestartGroup;
                        j8 = j2;
                    }
                    final DialogProperties dialogProperties3 = dialogProperties2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$4
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

                        public final void invoke(Composer composer3, int i11) {
                            AndroidAlertDialog_androidKt.m1228AlertDialogwqdebIU(onDismissRequest, buttons, modifier4, function27, function28, shape4, j7, j8, dialogProperties3, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                function24 = function22;
                if ((458752 & i) != 0) {
                }
                if ((3670016 & i) != 0) {
                }
                if ((29360128 & i) == 0) {
                }
                if ((i & 234881024) != 0) {
                }
                if ((i3 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) != 0) {
                }
                modifier3 = modifier2;
                function25 = function23;
                function26 = function24;
                shape3 = shape2;
                j5 = j3;
                j6 = j4;
                final int i102 = i3;
                startRestartGroup.endDefaults();
                AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(startRestartGroup, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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

                    public final void invoke(Composer composer3, int i11) {
                        ComposerKt.sourceInformation(composer3, "C140@6430L259:AndroidAlertDialog.android.kt#jmzs0o");
                        if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                            Function2<Composer, Integer, Unit> function29 = buttons;
                            Modifier modifier5 = modifier3;
                            Function2<Composer, Integer, Unit> function210 = function25;
                            Function2<Composer, Integer, Unit> function211 = function26;
                            Shape shape5 = shape3;
                            long j9 = j5;
                            long j10 = j6;
                            int i12 = i102;
                            AlertDialogKt.m1225AlertDialogContentWMdw5o4(function29, modifier5, function210, function211, shape5, j9, j10, composer3, ((i12 >> 3) & 14) | ((i12 >> 3) & 112) | ((i12 >> 3) & 896) | ((i12 >> 3) & 7168) | ((i12 >> 3) & 57344) | ((i12 >> 3) & 458752) | ((i12 >> 3) & 3670016), 0);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), startRestartGroup, (i102 & 14) | RendererCapabilities.MODE_SUPPORT_MASK | ((i102 >> 21) & 112), 0);
                composer2 = startRestartGroup;
                modifier4 = modifier3;
                function27 = function25;
                function28 = function26;
                shape4 = shape3;
                j7 = j5;
                j8 = j6;
                final DialogProperties dialogProperties32 = dialogProperties2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function23 = function2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function24 = function22;
            if ((458752 & i) != 0) {
            }
            if ((3670016 & i) != 0) {
            }
            if ((29360128 & i) == 0) {
            }
            if ((i & 234881024) != 0) {
            }
            if ((i3 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) != 0) {
            }
            modifier3 = modifier2;
            function25 = function23;
            function26 = function24;
            shape3 = shape2;
            j5 = j3;
            j6 = j4;
            final int i1022 = i3;
            startRestartGroup.endDefaults();
            AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(startRestartGroup, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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

                public final void invoke(Composer composer3, int i11) {
                    ComposerKt.sourceInformation(composer3, "C140@6430L259:AndroidAlertDialog.android.kt#jmzs0o");
                    if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                        Function2<Composer, Integer, Unit> function29 = buttons;
                        Modifier modifier5 = modifier3;
                        Function2<Composer, Integer, Unit> function210 = function25;
                        Function2<Composer, Integer, Unit> function211 = function26;
                        Shape shape5 = shape3;
                        long j9 = j5;
                        long j10 = j6;
                        int i12 = i1022;
                        AlertDialogKt.m1225AlertDialogContentWMdw5o4(function29, modifier5, function210, function211, shape5, j9, j10, composer3, ((i12 >> 3) & 14) | ((i12 >> 3) & 112) | ((i12 >> 3) & 896) | ((i12 >> 3) & 7168) | ((i12 >> 3) & 57344) | ((i12 >> 3) & 458752) | ((i12 >> 3) & 3670016), 0);
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), startRestartGroup, (i1022 & 14) | RendererCapabilities.MODE_SUPPORT_MASK | ((i1022 >> 21) & 112), 0);
            composer2 = startRestartGroup;
            modifier4 = modifier3;
            function27 = function25;
            function28 = function26;
            shape4 = shape3;
            j7 = j5;
            j8 = j6;
            final DialogProperties dialogProperties322 = dialogProperties2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function23 = function2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function24 = function22;
        if ((458752 & i) != 0) {
        }
        if ((3670016 & i) != 0) {
        }
        if ((29360128 & i) == 0) {
        }
        if ((i & 234881024) != 0) {
        }
        if ((i3 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) != 0) {
        }
        modifier3 = modifier2;
        function25 = function23;
        function26 = function24;
        shape3 = shape2;
        j5 = j3;
        j6 = j4;
        final int i10222 = i3;
        startRestartGroup.endDefaults();
        AndroidDialog_androidKt.Dialog(onDismissRequest, dialogProperties2, ComposableLambdaKt.composableLambda(startRestartGroup, -1787418772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$3
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

            public final void invoke(Composer composer3, int i11) {
                ComposerKt.sourceInformation(composer3, "C140@6430L259:AndroidAlertDialog.android.kt#jmzs0o");
                if ((i11 & 11) != 2 || !composer3.getSkipping()) {
                    Function2<Composer, Integer, Unit> function29 = buttons;
                    Modifier modifier5 = modifier3;
                    Function2<Composer, Integer, Unit> function210 = function25;
                    Function2<Composer, Integer, Unit> function211 = function26;
                    Shape shape5 = shape3;
                    long j9 = j5;
                    long j10 = j6;
                    int i12 = i10222;
                    AlertDialogKt.m1225AlertDialogContentWMdw5o4(function29, modifier5, function210, function211, shape5, j9, j10, composer3, ((i12 >> 3) & 14) | ((i12 >> 3) & 112) | ((i12 >> 3) & 896) | ((i12 >> 3) & 7168) | ((i12 >> 3) & 57344) | ((i12 >> 3) & 458752) | ((i12 >> 3) & 3670016), 0);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), startRestartGroup, (i10222 & 14) | RendererCapabilities.MODE_SUPPORT_MASK | ((i10222 >> 21) & 112), 0);
        composer2 = startRestartGroup;
        modifier4 = modifier3;
        function27 = function25;
        function28 = function26;
        shape4 = shape3;
        j7 = j5;
        j8 = j6;
        final DialogProperties dialogProperties3222 = dialogProperties2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}

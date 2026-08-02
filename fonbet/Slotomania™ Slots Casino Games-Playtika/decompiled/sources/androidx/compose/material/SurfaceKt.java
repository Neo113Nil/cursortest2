package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Surface.kt */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a¬\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001af\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00142\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001a\u0096\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00142\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010&2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010'\u001a/\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u000eH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a;\u0010.\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"Surface", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "content", "Landroidx/compose/runtime/Composable;", "Surface-9VG74zQ", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Surface-LPr_se0", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Surface-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-Ny5ogXk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surfaceColorAtElevation", "elevationOverlay", "Landroidx/compose/material/ElevationOverlay;", "absoluteElevation", "surfaceColorAtElevation-cq6XJ1M", "(JLandroidx/compose/material/ElevationOverlay;FLandroidx/compose/runtime/Composer;I)J", "surface", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "surface-8ww4TTg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurfaceKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0083  */
    /* renamed from: Surface-F-jzlyU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1520SurfaceFjzlyU(Modifier modifier, Shape shape, long j, long j2, BorderStroke borderStroke, float f, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        long j3;
        long j4;
        int i4;
        BorderStroke borderStroke2;
        int i5;
        Modifier.Companion companion;
        final int i6;
        final long j5;
        final float f2;
        final Shape shape3;
        final BorderStroke borderStroke3;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1412203386);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(5,6,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp)106@5259L6,107@5301L22,*112@5476L7,113@5500L793:Surface.kt#jmzs0o");
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            shape2 = shape;
            i3 |= startRestartGroup.changed(shape2) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i8 = 256;
                        i3 |= i8;
                    }
                } else {
                    j3 = j;
                }
                i8 = 128;
                i3 |= i8;
            } else {
                j3 = j;
            }
            if ((i & 7168) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                borderStroke2 = borderStroke;
                i3 |= startRestartGroup.changed(borderStroke2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    i3 |= startRestartGroup.changed(f) ? 131072 : 65536;
                }
                if ((i2 & 64) == 0) {
                    i7 = (i & 3670016) == 0 ? startRestartGroup.changed(content) ? 1048576 : 524288 : 1572864;
                    if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i9 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i10 != 0) {
                                shape2 = RectangleShapeKt.getRectangleShape();
                            }
                            if ((i2 & 4) != 0) {
                                j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1328getSurface0d7_KjU();
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                j4 = ColorsKt.m1342contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 6) & 14);
                                i3 &= -7169;
                            }
                            if (i4 != 0) {
                                borderStroke2 = null;
                            }
                            if (i5 == 0) {
                                long j6 = j3;
                                i6 = i3;
                                j5 = j6;
                                f2 = Dp.m4440constructorimpl(0);
                            } else {
                                long j7 = j3;
                                i6 = i3;
                                j5 = j7;
                                f2 = f;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            long j8 = j3;
                            i6 = i3;
                            j5 = j8;
                            f2 = f;
                            companion = modifier2;
                        }
                        shape3 = shape2;
                        borderStroke3 = borderStroke2;
                        startRestartGroup.endDefaults();
                        ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localAbsoluteElevation);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final float m4440constructorimpl = Dp.m4440constructorimpl(((Dp) consume).m4454unboximpl() + f2);
                        modifier3 = companion;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j4)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
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

                            public final void invoke(Composer composer2, int i11) {
                                long m1527surfaceColorAtElevationcq6XJ1M;
                                Modifier m1526surface8ww4TTg;
                                ComposerKt.sourceInformation(composer2, "C123@5914L7,121@5785L221,117@5649L638:Surface.kt#jmzs0o");
                                if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                                    Modifier modifier4 = Modifier.this;
                                    Shape shape4 = shape3;
                                    long j9 = j5;
                                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume2 = composer2.consume(localElevationOverlay);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j9, (ElevationOverlay) consume2, m4440constructorimpl, composer2, (i6 >> 6) & 14);
                                    m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(modifier4, shape4, m1527surfaceColorAtElevationcq6XJ1M, borderStroke3, f2);
                                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(m1526surface8ww4TTg, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SemanticsPropertyReceiver semantics) {
                                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }
                                    }), Unit.INSTANCE, new AnonymousClass2(null));
                                    Function2<Composer, Integer, Unit> function2 = content;
                                    int i12 = i6;
                                    composer2.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                    composer2.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume3 = composer2.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    Density density = (Density) consume3;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume4 = composer2.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume5 = composer2.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(pointerInput);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-2137368960);
                                    ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(1539610176);
                                    ComposerKt.sourceInformation(composer2, "C133@6268L9:Surface.kt#jmzs0o");
                                    function2.invoke(composer2, Integer.valueOf((i12 >> 18) & 14));
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

                            /* compiled from: Surface.kt */
                            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                            static final class AnonymousClass2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                                int label;

                                AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                                    super(2, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass2(continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    if (this.label != 0) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                            }
                        }), startRestartGroup, 56);
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        f2 = f;
                        modifier3 = modifier2;
                        shape3 = shape2;
                        j5 = j3;
                        borderStroke3 = borderStroke2;
                    }
                    final long j9 = j4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
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

                        public final void invoke(Composer composer2, int i11) {
                            SurfaceKt.m1520SurfaceFjzlyU(Modifier.this, shape3, j5, j9, borderStroke3, f2, content, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                i3 |= i7;
                if ((i3 & 2995931) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i10 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                shape3 = shape2;
                borderStroke3 = borderStroke2;
                startRestartGroup.endDefaults();
                ProvidableCompositionLocal<Dp> localAbsoluteElevation2 = ElevationOverlayKt.getLocalAbsoluteElevation();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localAbsoluteElevation2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final float m4440constructorimpl2 = Dp.m4440constructorimpl(((Dp) consume2).m4454unboximpl() + f2);
                modifier3 = companion;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j4)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl2))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
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

                    public final void invoke(Composer composer2, int i11) {
                        long m1527surfaceColorAtElevationcq6XJ1M;
                        Modifier m1526surface8ww4TTg;
                        ComposerKt.sourceInformation(composer2, "C123@5914L7,121@5785L221,117@5649L638:Surface.kt#jmzs0o");
                        if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                            Modifier modifier4 = Modifier.this;
                            Shape shape4 = shape3;
                            long j92 = j5;
                            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume22 = composer2.consume(localElevationOverlay);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j92, (ElevationOverlay) consume22, m4440constructorimpl2, composer2, (i6 >> 6) & 14);
                            m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(modifier4, shape4, m1527surfaceColorAtElevationcq6XJ1M, borderStroke3, f2);
                            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(m1526surface8ww4TTg, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semantics) {
                                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }
                            }), Unit.INSTANCE, new AnonymousClass2(null));
                            Function2<Composer, Integer, Unit> function2 = content;
                            int i12 = i6;
                            composer2.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer2.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Density density = (Density) consume3;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer2.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume5 = composer2.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(pointerInput);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-2137368960);
                            ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(1539610176);
                            ComposerKt.sourceInformation(composer2, "C133@6268L9:Surface.kt#jmzs0o");
                            function2.invoke(composer2, Integer.valueOf((i12 >> 18) & 14));
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

                    /* compiled from: Surface.kt */
                    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                    static final class AnonymousClass2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                        int label;

                        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass2(continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                    }
                }), startRestartGroup, 56);
                final long j92 = j4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            borderStroke2 = borderStroke;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            i3 |= i7;
            if ((i3 & 2995931) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i10 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            shape3 = shape2;
            borderStroke3 = borderStroke2;
            startRestartGroup.endDefaults();
            ProvidableCompositionLocal<Dp> localAbsoluteElevation22 = ElevationOverlayKt.getLocalAbsoluteElevation();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localAbsoluteElevation22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float m4440constructorimpl22 = Dp.m4440constructorimpl(((Dp) consume22).m4454unboximpl() + f2);
            modifier3 = companion;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j4)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl22))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
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

                public final void invoke(Composer composer2, int i11) {
                    long m1527surfaceColorAtElevationcq6XJ1M;
                    Modifier m1526surface8ww4TTg;
                    ComposerKt.sourceInformation(composer2, "C123@5914L7,121@5785L221,117@5649L638:Surface.kt#jmzs0o");
                    if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                        Modifier modifier4 = Modifier.this;
                        Shape shape4 = shape3;
                        long j922 = j5;
                        ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume222 = composer2.consume(localElevationOverlay);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j922, (ElevationOverlay) consume222, m4440constructorimpl22, composer2, (i6 >> 6) & 14);
                        m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(modifier4, shape4, m1527surfaceColorAtElevationcq6XJ1M, borderStroke3, f2);
                        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(m1526surface8ww4TTg, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semantics) {
                                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }
                        }), Unit.INSTANCE, new AnonymousClass2(null));
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i12 = i6;
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer2.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density = (Density) consume3;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer2.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume5 = composer2.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(pointerInput);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-2137368960);
                        ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(1539610176);
                        ComposerKt.sourceInformation(composer2, "C133@6268L9:Surface.kt#jmzs0o");
                        function2.invoke(composer2, Integer.valueOf((i12 >> 18) & 14));
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

                /* compiled from: Surface.kt */
                @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                    int label;

                    AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass2(continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                }
            }), startRestartGroup, 56);
            final long j922 = j4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        shape2 = shape;
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        borderStroke2 = borderStroke;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i3 |= i7;
        if ((i3 & 2995931) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i10 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        shape3 = shape2;
        borderStroke3 = borderStroke2;
        startRestartGroup.endDefaults();
        ProvidableCompositionLocal<Dp> localAbsoluteElevation222 = ElevationOverlayKt.getLocalAbsoluteElevation();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localAbsoluteElevation222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float m4440constructorimpl222 = Dp.m4440constructorimpl(((Dp) consume222).m4454unboximpl() + f2);
        modifier3 = companion;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j4)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl222))}, ComposableLambdaKt.composableLambda(startRestartGroup, -1822160838, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
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

            public final void invoke(Composer composer2, int i11) {
                long m1527surfaceColorAtElevationcq6XJ1M;
                Modifier m1526surface8ww4TTg;
                ComposerKt.sourceInformation(composer2, "C123@5914L7,121@5785L221,117@5649L638:Surface.kt#jmzs0o");
                if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                    Modifier modifier4 = Modifier.this;
                    Shape shape4 = shape3;
                    long j9222 = j5;
                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2222 = composer2.consume(localElevationOverlay);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j9222, (ElevationOverlay) consume2222, m4440constructorimpl222, composer2, (i6 >> 6) & 14);
                    m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(modifier4, shape4, m1527surfaceColorAtElevationcq6XJ1M, borderStroke3, f2);
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(m1526surface8ww4TTg, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semantics) {
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    }), Unit.INSTANCE, new AnonymousClass2(null));
                    Function2<Composer, Integer, Unit> function2 = content;
                    int i12 = i6;
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density = (Density) consume3;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = composer2.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume5 = composer2.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(pointerInput);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-2137368960);
                    ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(1539610176);
                    ComposerKt.sourceInformation(composer2, "C133@6268L9:Surface.kt#jmzs0o");
                    function2.invoke(composer2, Integer.valueOf((i12 >> 18) & 14));
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

            /* compiled from: Surface.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                int label;

                AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
            }
        }), startRestartGroup, 56);
        final long j9222 = j4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0140  */
    @ExperimentalMaterialApi
    /* renamed from: Surface-LPr_se0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1521SurfaceLPr_se0(final Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Shape shape2;
        long j3;
        int i6;
        long j4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final BorderStroke borderStroke2;
        int i14;
        long j5;
        final Shape shape3;
        final float f2;
        final MutableInteractionSource mutableInteractionSource2;
        final boolean z3;
        long j6;
        final long j7;
        final MutableInteractionSource mutableInteractionSource3;
        final boolean z4;
        final Shape shape4;
        final BorderStroke borderStroke3;
        final float f3;
        final long j8;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i15;
        int i16;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1560876237);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(8,7,5,9,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp,6)213@10696L6,214@10738L22,217@10872L39,*220@11004L7,221@11028L1013:Surface.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i17 = i2 & 2;
        if (i17 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    shape2 = shape;
                    i3 |= startRestartGroup.changed(shape2) ? 2048 : 1024;
                    if ((57344 & i) != 0) {
                        if ((i2 & 16) == 0) {
                            j3 = j;
                            if (startRestartGroup.changed(j3)) {
                                i16 = 16384;
                                i3 |= i16;
                            }
                        } else {
                            j3 = j;
                        }
                        i16 = 8192;
                        i3 |= i16;
                    } else {
                        j3 = j;
                    }
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            i6 = i17;
                            j4 = j2;
                            if (startRestartGroup.changed(j4)) {
                                i15 = 131072;
                                i3 |= i15;
                            }
                        } else {
                            i6 = i17;
                            j4 = j2;
                        }
                        i15 = 65536;
                        i3 |= i15;
                    } else {
                        i6 = i17;
                        j4 = j2;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i8 = i3 | (startRestartGroup.changed(borderStroke) ? 1048576 : 524288);
                        i9 = i2 & 128;
                        if (i9 != 0) {
                            i8 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            i10 = i9;
                            i8 |= startRestartGroup.changed(f) ? 8388608 : 4194304;
                            i11 = i2 & 256;
                            if (i11 == 0) {
                                i8 |= 100663296;
                            } else if ((i & 234881024) == 0) {
                                i12 = i11;
                                i8 |= startRestartGroup.changed(mutableInteractionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                if ((i2 & 512) == 0) {
                                    if ((1879048192 & i) == 0) {
                                        i13 = startRestartGroup.changed(content) ? 536870912 : 268435456;
                                    }
                                    if ((i8 & 1533916891) == 306783378 || !startRestartGroup.getSkipping()) {
                                        startRestartGroup.startDefaults();
                                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                            if (i6 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if (i4 != 0) {
                                                z2 = true;
                                            }
                                            if (i5 != 0) {
                                                shape2 = RectangleShapeKt.getRectangleShape();
                                            }
                                            if ((i2 & 16) != 0) {
                                                j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1328getSurface0d7_KjU();
                                                i8 &= -57345;
                                            }
                                            if ((i2 & 32) != 0) {
                                                j4 = ColorsKt.m1342contentColorForek8zF_U(j3, startRestartGroup, (i8 >> 12) & 14);
                                                i8 &= -458753;
                                            }
                                            BorderStroke borderStroke4 = i7 == 0 ? null : borderStroke;
                                            float m4440constructorimpl = i10 == 0 ? Dp.m4440constructorimpl(0) : f;
                                            if (i12 == 0) {
                                                startRestartGroup.startReplaceableGroup(-492369756);
                                                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                                Object rememberedValue = startRestartGroup.rememberedValue();
                                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                                }
                                                startRestartGroup.endReplaceableGroup();
                                                MutableInteractionSource mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                                borderStroke2 = borderStroke4;
                                                i14 = i8;
                                                j5 = j4;
                                                shape3 = shape2;
                                                f2 = m4440constructorimpl;
                                                long j9 = j3;
                                                z3 = z2;
                                                mutableInteractionSource2 = mutableInteractionSource4;
                                                j6 = j9;
                                            } else {
                                                borderStroke2 = borderStroke4;
                                                i14 = i8;
                                                j5 = j4;
                                                shape3 = shape2;
                                                f2 = m4440constructorimpl;
                                                long j10 = j3;
                                                mutableInteractionSource2 = mutableInteractionSource;
                                                z3 = z2;
                                                j6 = j10;
                                            }
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i2 & 16) != 0) {
                                                i8 &= -57345;
                                            }
                                            if ((i2 & 32) != 0) {
                                                i8 &= -458753;
                                            }
                                            z3 = z2;
                                            j6 = j3;
                                            borderStroke2 = borderStroke;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            i14 = i8;
                                            j5 = j4;
                                            shape3 = shape2;
                                            f2 = f;
                                        }
                                        startRestartGroup.endDefaults();
                                        ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localAbsoluteElevation);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        final float m4440constructorimpl2 = Dp.m4440constructorimpl(((Dp) consume).m4454unboximpl() + f2);
                                        final int i18 = i14;
                                        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl2))};
                                        final long j11 = j6;
                                        final Modifier modifier4 = modifier2;
                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(startRestartGroup, 2031491085, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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

                                            public final void invoke(Composer composer2, int i19) {
                                                long m1527surfaceColorAtElevationcq6XJ1M;
                                                Modifier m1526surface8ww4TTg;
                                                ComposerKt.sourceInformation(composer2, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                                                if ((i19 & 11) != 2 || !composer2.getSkipping()) {
                                                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                                    Shape shape5 = shape3;
                                                    long j12 = j11;
                                                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume2 = composer2.consume(localElevationOverlay);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j12, (ElevationOverlay) consume2, m4440constructorimpl2, composer2, (i18 >> 12) & 14);
                                                    m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                                                    Modifier m265clickableO2vRcR0$default = ClickableKt.m265clickableO2vRcR0$default(m1526surface8ww4TTg, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z3, null, Role.m3760boximpl(Role.INSTANCE.m3767getButtono7Vup1c()), onClick, 8, null);
                                                    Function2<Composer, Integer, Unit> function2 = content;
                                                    int i20 = i18;
                                                    composer2.startReplaceableGroup(733328855);
                                                    ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                                    composer2.startReplaceableGroup(-1323940314);
                                                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume3 = composer2.consume(localDensity);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    Density density = (Density) consume3;
                                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume4 = composer2.consume(localLayoutDirection);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                    Object consume5 = composer2.consume(localViewConfiguration);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m265clickableO2vRcR0$default);
                                                    if (!(composer2.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer2.startReusableNode();
                                                    if (composer2.getInserting()) {
                                                        composer2.createNode(constructor);
                                                    } else {
                                                        composer2.useNode();
                                                    }
                                                    composer2.disableReusing();
                                                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                                                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                                    composer2.enableReusing();
                                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                                    composer2.startReplaceableGroup(2058660585);
                                                    composer2.startReplaceableGroup(-2137368960);
                                                    ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    composer2.startReplaceableGroup(-390905273);
                                                    ComposerKt.sourceInformation(composer2, "C247@12016L9:Surface.kt#jmzs0o");
                                                    function2.invoke(composer2, Integer.valueOf((i20 >> 27) & 14));
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
                                        }), startRestartGroup, 56);
                                        j7 = j11;
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        z4 = z3;
                                        shape4 = shape3;
                                        borderStroke3 = borderStroke2;
                                        f3 = f2;
                                        j8 = j5;
                                        modifier3 = modifier4;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        long j12 = j4;
                                        modifier3 = modifier2;
                                        shape4 = shape2;
                                        j8 = j12;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        z4 = z2;
                                        j7 = j3;
                                        borderStroke3 = borderStroke;
                                        f3 = f;
                                    }
                                    endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        return;
                                    }
                                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$5
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

                                        public final void invoke(Composer composer2, int i19) {
                                            SurfaceKt.m1521SurfaceLPr_se0(onClick, modifier3, z4, shape4, j7, j8, borderStroke3, f3, mutableInteractionSource3, content, composer2, i | 1, i2);
                                        }
                                    });
                                    return;
                                }
                                i13 = C.ENCODING_PCM_32BIT;
                                i8 |= i13;
                                if ((i8 & 1533916891) == 306783378) {
                                }
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i4 != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if ((i2 & 16) != 0) {
                                }
                                if ((i2 & 32) != 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                startRestartGroup.endDefaults();
                                ProvidableCompositionLocal<Dp> localAbsoluteElevation2 = ElevationOverlayKt.getLocalAbsoluteElevation();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localAbsoluteElevation2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final float m4440constructorimpl22 = Dp.m4440constructorimpl(((Dp) consume2).m4454unboximpl() + f2);
                                final int i182 = i14;
                                ProvidedValue[] providedValueArr2 = {ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl22))};
                                final long j112 = j6;
                                final Modifier modifier42 = modifier2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2, ComposableLambdaKt.composableLambda(startRestartGroup, 2031491085, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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

                                    public final void invoke(Composer composer2, int i19) {
                                        long m1527surfaceColorAtElevationcq6XJ1M;
                                        Modifier m1526surface8ww4TTg;
                                        ComposerKt.sourceInformation(composer2, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                                        if ((i19 & 11) != 2 || !composer2.getSkipping()) {
                                            Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                            Shape shape5 = shape3;
                                            long j122 = j112;
                                            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume22 = composer2.consume(localElevationOverlay);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j122, (ElevationOverlay) consume22, m4440constructorimpl22, composer2, (i182 >> 12) & 14);
                                            m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                                            Modifier m265clickableO2vRcR0$default = ClickableKt.m265clickableO2vRcR0$default(m1526surface8ww4TTg, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z3, null, Role.m3760boximpl(Role.INSTANCE.m3767getButtono7Vup1c()), onClick, 8, null);
                                            Function2<Composer, Integer, Unit> function2 = content;
                                            int i20 = i182;
                                            composer2.startReplaceableGroup(733328855);
                                            ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                            composer2.startReplaceableGroup(-1323940314);
                                            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume3 = composer2.consume(localDensity);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            Density density = (Density) consume3;
                                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume4 = composer2.consume(localLayoutDirection);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            Object consume5 = composer2.consume(localViewConfiguration);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m265clickableO2vRcR0$default);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor);
                                            } else {
                                                composer2.useNode();
                                            }
                                            composer2.disableReusing();
                                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                                            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer2.enableReusing();
                                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            composer2.startReplaceableGroup(-2137368960);
                                            ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            composer2.startReplaceableGroup(-390905273);
                                            ComposerKt.sourceInformation(composer2, "C247@12016L9:Surface.kt#jmzs0o");
                                            function2.invoke(composer2, Integer.valueOf((i20 >> 27) & 14));
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
                                }), startRestartGroup, 56);
                                j7 = j112;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                z4 = z3;
                                shape4 = shape3;
                                borderStroke3 = borderStroke2;
                                f3 = f2;
                                j8 = j5;
                                modifier3 = modifier42;
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            i12 = i11;
                            if ((i2 & 512) == 0) {
                            }
                            i8 |= i13;
                            if ((i8 & 1533916891) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            if ((i2 & 32) != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            startRestartGroup.endDefaults();
                            ProvidableCompositionLocal<Dp> localAbsoluteElevation22 = ElevationOverlayKt.getLocalAbsoluteElevation();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume22 = startRestartGroup.consume(localAbsoluteElevation22);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final float m4440constructorimpl222 = Dp.m4440constructorimpl(((Dp) consume22).m4454unboximpl() + f2);
                            final int i1822 = i14;
                            ProvidedValue[] providedValueArr22 = {ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl222))};
                            final long j1122 = j6;
                            final Modifier modifier422 = modifier2;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr22, ComposableLambdaKt.composableLambda(startRestartGroup, 2031491085, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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

                                public final void invoke(Composer composer2, int i19) {
                                    long m1527surfaceColorAtElevationcq6XJ1M;
                                    Modifier m1526surface8ww4TTg;
                                    ComposerKt.sourceInformation(composer2, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                                    if ((i19 & 11) != 2 || !composer2.getSkipping()) {
                                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                        Shape shape5 = shape3;
                                        long j122 = j1122;
                                        ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume222 = composer2.consume(localElevationOverlay);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j122, (ElevationOverlay) consume222, m4440constructorimpl222, composer2, (i1822 >> 12) & 14);
                                        m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                                        Modifier m265clickableO2vRcR0$default = ClickableKt.m265clickableO2vRcR0$default(m1526surface8ww4TTg, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z3, null, Role.m3760boximpl(Role.INSTANCE.m3767getButtono7Vup1c()), onClick, 8, null);
                                        Function2<Composer, Integer, Unit> function2 = content;
                                        int i20 = i1822;
                                        composer2.startReplaceableGroup(733328855);
                                        ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                        composer2.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume3 = composer2.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        Density density = (Density) consume3;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume4 = composer2.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume5 = composer2.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m265clickableO2vRcR0$default);
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        composer2.disableReusing();
                                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                                        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer2.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                        composer2.startReplaceableGroup(2058660585);
                                        composer2.startReplaceableGroup(-2137368960);
                                        ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composer2.startReplaceableGroup(-390905273);
                                        ComposerKt.sourceInformation(composer2, "C247@12016L9:Surface.kt#jmzs0o");
                                        function2.invoke(composer2, Integer.valueOf((i20 >> 27) & 14));
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
                            }), startRestartGroup, 56);
                            j7 = j1122;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z4 = z3;
                            shape4 = shape3;
                            borderStroke3 = borderStroke2;
                            f3 = f2;
                            j8 = j5;
                            modifier3 = modifier422;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i10 = i9;
                        i11 = i2 & 256;
                        if (i11 == 0) {
                        }
                        i12 = i11;
                        if ((i2 & 512) == 0) {
                        }
                        i8 |= i13;
                        if ((i8 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if ((i2 & 32) != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        startRestartGroup.endDefaults();
                        ProvidableCompositionLocal<Dp> localAbsoluteElevation222 = ElevationOverlayKt.getLocalAbsoluteElevation();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume222 = startRestartGroup.consume(localAbsoluteElevation222);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final float m4440constructorimpl2222 = Dp.m4440constructorimpl(((Dp) consume222).m4454unboximpl() + f2);
                        final int i18222 = i14;
                        ProvidedValue[] providedValueArr222 = {ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl2222))};
                        final long j11222 = j6;
                        final Modifier modifier4222 = modifier2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr222, ComposableLambdaKt.composableLambda(startRestartGroup, 2031491085, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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

                            public final void invoke(Composer composer2, int i19) {
                                long m1527surfaceColorAtElevationcq6XJ1M;
                                Modifier m1526surface8ww4TTg;
                                ComposerKt.sourceInformation(composer2, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                                if ((i19 & 11) != 2 || !composer2.getSkipping()) {
                                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                    Shape shape5 = shape3;
                                    long j122 = j11222;
                                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume2222 = composer2.consume(localElevationOverlay);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j122, (ElevationOverlay) consume2222, m4440constructorimpl2222, composer2, (i18222 >> 12) & 14);
                                    m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                                    Modifier m265clickableO2vRcR0$default = ClickableKt.m265clickableO2vRcR0$default(m1526surface8ww4TTg, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z3, null, Role.m3760boximpl(Role.INSTANCE.m3767getButtono7Vup1c()), onClick, 8, null);
                                    Function2<Composer, Integer, Unit> function2 = content;
                                    int i20 = i18222;
                                    composer2.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                    composer2.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume3 = composer2.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    Density density = (Density) consume3;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume4 = composer2.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume5 = composer2.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m265clickableO2vRcR0$default);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-2137368960);
                                    ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(-390905273);
                                    ComposerKt.sourceInformation(composer2, "C247@12016L9:Surface.kt#jmzs0o");
                                    function2.invoke(composer2, Integer.valueOf((i20 >> 27) & 14));
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
                        }), startRestartGroup, 56);
                        j7 = j11222;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z4 = z3;
                        shape4 = shape3;
                        borderStroke3 = borderStroke2;
                        f3 = f2;
                        j8 = j5;
                        modifier3 = modifier4222;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i8 = i3;
                    i9 = i2 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i2 & 256;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    if ((i2 & 512) == 0) {
                    }
                    i8 |= i13;
                    if ((i8 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    startRestartGroup.endDefaults();
                    ProvidableCompositionLocal<Dp> localAbsoluteElevation2222 = ElevationOverlayKt.getLocalAbsoluteElevation();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2222 = startRestartGroup.consume(localAbsoluteElevation2222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float m4440constructorimpl22222 = Dp.m4440constructorimpl(((Dp) consume2222).m4454unboximpl() + f2);
                    final int i182222 = i14;
                    ProvidedValue[] providedValueArr2222 = {ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl22222))};
                    final long j112222 = j6;
                    final Modifier modifier42222 = modifier2;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2222, ComposableLambdaKt.composableLambda(startRestartGroup, 2031491085, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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

                        public final void invoke(Composer composer2, int i19) {
                            long m1527surfaceColorAtElevationcq6XJ1M;
                            Modifier m1526surface8ww4TTg;
                            ComposerKt.sourceInformation(composer2, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                            if ((i19 & 11) != 2 || !composer2.getSkipping()) {
                                Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                Shape shape5 = shape3;
                                long j122 = j112222;
                                ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume22222 = composer2.consume(localElevationOverlay);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j122, (ElevationOverlay) consume22222, m4440constructorimpl22222, composer2, (i182222 >> 12) & 14);
                                m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                                Modifier m265clickableO2vRcR0$default = ClickableKt.m265clickableO2vRcR0$default(m1526surface8ww4TTg, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z3, null, Role.m3760boximpl(Role.INSTANCE.m3767getButtono7Vup1c()), onClick, 8, null);
                                Function2<Composer, Integer, Unit> function2 = content;
                                int i20 = i182222;
                                composer2.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                composer2.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume3 = composer2.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                Density density = (Density) consume3;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume4 = composer2.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume5 = composer2.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m265clickableO2vRcR0$default);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                composer2.disableReusing();
                                Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                                Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer2.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                composer2.startReplaceableGroup(-2137368960);
                                ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer2.startReplaceableGroup(-390905273);
                                ComposerKt.sourceInformation(composer2, "C247@12016L9:Surface.kt#jmzs0o");
                                function2.invoke(composer2, Integer.valueOf((i20 >> 27) & 14));
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
                    }), startRestartGroup, 56);
                    j7 = j112222;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z4 = z3;
                    shape4 = shape3;
                    borderStroke3 = borderStroke2;
                    f3 = f2;
                    j8 = j5;
                    modifier3 = modifier42222;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                shape2 = shape;
                if ((57344 & i) != 0) {
                }
                if ((458752 & i) != 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i3;
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i2 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                if ((i2 & 512) == 0) {
                }
                i8 |= i13;
                if ((i8 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i6 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i7 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                startRestartGroup.endDefaults();
                ProvidableCompositionLocal<Dp> localAbsoluteElevation22222 = ElevationOverlayKt.getLocalAbsoluteElevation();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume22222 = startRestartGroup.consume(localAbsoluteElevation22222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final float m4440constructorimpl222222 = Dp.m4440constructorimpl(((Dp) consume22222).m4454unboximpl() + f2);
                final int i1822222 = i14;
                ProvidedValue[] providedValueArr22222 = {ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl222222))};
                final long j1122222 = j6;
                final Modifier modifier422222 = modifier2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr22222, ComposableLambdaKt.composableLambda(startRestartGroup, 2031491085, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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

                    public final void invoke(Composer composer2, int i19) {
                        long m1527surfaceColorAtElevationcq6XJ1M;
                        Modifier m1526surface8ww4TTg;
                        ComposerKt.sourceInformation(composer2, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                        if ((i19 & 11) != 2 || !composer2.getSkipping()) {
                            Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                            Shape shape5 = shape3;
                            long j122 = j1122222;
                            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume222222 = composer2.consume(localElevationOverlay);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j122, (ElevationOverlay) consume222222, m4440constructorimpl222222, composer2, (i1822222 >> 12) & 14);
                            m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                            Modifier m265clickableO2vRcR0$default = ClickableKt.m265clickableO2vRcR0$default(m1526surface8ww4TTg, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z3, null, Role.m3760boximpl(Role.INSTANCE.m3767getButtono7Vup1c()), onClick, 8, null);
                            Function2<Composer, Integer, Unit> function2 = content;
                            int i20 = i1822222;
                            composer2.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer2.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Density density = (Density) consume3;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer2.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume5 = composer2.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m265clickableO2vRcR0$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                            Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-2137368960);
                            ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(-390905273);
                            ComposerKt.sourceInformation(composer2, "C247@12016L9:Surface.kt#jmzs0o");
                            function2.invoke(composer2, Integer.valueOf((i20 >> 27) & 14));
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
                }), startRestartGroup, 56);
                j7 = j1122222;
                mutableInteractionSource3 = mutableInteractionSource2;
                z4 = z3;
                shape4 = shape3;
                borderStroke3 = borderStroke2;
                f3 = f2;
                j8 = j5;
                modifier3 = modifier422222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            shape2 = shape;
            if ((57344 & i) != 0) {
            }
            if ((458752 & i) != 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i3;
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i2 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i2 & 512) == 0) {
            }
            i8 |= i13;
            if ((i8 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i7 == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            startRestartGroup.endDefaults();
            ProvidableCompositionLocal<Dp> localAbsoluteElevation222222 = ElevationOverlayKt.getLocalAbsoluteElevation();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume222222 = startRestartGroup.consume(localAbsoluteElevation222222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float m4440constructorimpl2222222 = Dp.m4440constructorimpl(((Dp) consume222222).m4454unboximpl() + f2);
            final int i18222222 = i14;
            ProvidedValue[] providedValueArr222222 = {ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl2222222))};
            final long j11222222 = j6;
            final Modifier modifier4222222 = modifier2;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr222222, ComposableLambdaKt.composableLambda(startRestartGroup, 2031491085, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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

                public final void invoke(Composer composer2, int i19) {
                    long m1527surfaceColorAtElevationcq6XJ1M;
                    Modifier m1526surface8ww4TTg;
                    ComposerKt.sourceInformation(composer2, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                    if ((i19 & 11) != 2 || !composer2.getSkipping()) {
                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                        Shape shape5 = shape3;
                        long j122 = j11222222;
                        ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2222222 = composer2.consume(localElevationOverlay);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j122, (ElevationOverlay) consume2222222, m4440constructorimpl2222222, composer2, (i18222222 >> 12) & 14);
                        m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                        Modifier m265clickableO2vRcR0$default = ClickableKt.m265clickableO2vRcR0$default(m1526surface8ww4TTg, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z3, null, Role.m3760boximpl(Role.INSTANCE.m3767getButtono7Vup1c()), onClick, 8, null);
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i20 = i18222222;
                        composer2.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer2.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density = (Density) consume3;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer2.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume5 = composer2.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m265clickableO2vRcR0$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                        Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-2137368960);
                        ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(-390905273);
                        ComposerKt.sourceInformation(composer2, "C247@12016L9:Surface.kt#jmzs0o");
                        function2.invoke(composer2, Integer.valueOf((i20 >> 27) & 14));
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
            }), startRestartGroup, 56);
            j7 = j11222222;
            mutableInteractionSource3 = mutableInteractionSource2;
            z4 = z3;
            shape4 = shape3;
            borderStroke3 = borderStroke2;
            f3 = f2;
            j8 = j5;
            modifier3 = modifier4222222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        shape2 = shape;
        if ((57344 & i) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i3;
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i2 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i2 & 512) == 0) {
        }
        i8 |= i13;
        if ((i8 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i7 == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        startRestartGroup.endDefaults();
        ProvidableCompositionLocal<Dp> localAbsoluteElevation2222222 = ElevationOverlayKt.getLocalAbsoluteElevation();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume2222222 = startRestartGroup.consume(localAbsoluteElevation2222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float m4440constructorimpl22222222 = Dp.m4440constructorimpl(((Dp) consume2222222).m4454unboximpl() + f2);
        final int i182222222 = i14;
        ProvidedValue[] providedValueArr2222222 = {ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j5)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl22222222))};
        final long j112222222 = j6;
        final Modifier modifier42222222 = modifier2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2222222, ComposableLambdaKt.composableLambda(startRestartGroup, 2031491085, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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

            public final void invoke(Composer composer2, int i19) {
                long m1527surfaceColorAtElevationcq6XJ1M;
                Modifier m1526surface8ww4TTg;
                ComposerKt.sourceInformation(composer2, "C232@11484L7,230@11355L221,240@11795L16,225@11177L858:Surface.kt#jmzs0o");
                if ((i19 & 11) != 2 || !composer2.getSkipping()) {
                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                    Shape shape5 = shape3;
                    long j122 = j112222222;
                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume22222222 = composer2.consume(localElevationOverlay);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j122, (ElevationOverlay) consume22222222, m4440constructorimpl22222222, composer2, (i182222222 >> 12) & 14);
                    m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                    Modifier m265clickableO2vRcR0$default = ClickableKt.m265clickableO2vRcR0$default(m1526surface8ww4TTg, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z3, null, Role.m3760boximpl(Role.INSTANCE.m3767getButtono7Vup1c()), onClick, 8, null);
                    Function2<Composer, Integer, Unit> function2 = content;
                    int i20 = i182222222;
                    composer2.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer2, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density = (Density) consume3;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = composer2.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume5 = composer2.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m265clickableO2vRcR0$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                    Updater.m1649setimpl(m1642constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-2137368960);
                    ComposerKt.sourceInformation(composer2, "C72@3384L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-390905273);
                    ComposerKt.sourceInformation(composer2, "C247@12016L9:Surface.kt#jmzs0o");
                    function2.invoke(composer2, Integer.valueOf((i20 >> 27) & 14));
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
        }), startRestartGroup, 56);
        j7 = j112222222;
        mutableInteractionSource3 = mutableInteractionSource2;
        z4 = z3;
        shape4 = shape3;
        borderStroke3 = borderStroke2;
        f3 = f2;
        j8 = j5;
        modifier3 = modifier42222222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f7  */
    @ExperimentalMaterialApi
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1522SurfaceNy5ogXk(final boolean z, final Function0<Unit> onClick, Modifier modifier, boolean z2, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        final boolean z3;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z4;
        int i6;
        Shape shape2;
        long j3;
        long j4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final int i14;
        Modifier.Companion companion;
        long j5;
        Object[] objArr;
        final Shape shape3;
        final int i15;
        final long j6;
        long j7;
        final BorderStroke borderStroke2;
        final float f2;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Shape shape4;
        final MutableInteractionSource mutableInteractionSource3;
        final BorderStroke borderStroke3;
        final long j8;
        final boolean z6;
        final Modifier modifier3;
        final float f3;
        final long j9;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(262027249);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(9,8,7,5,10,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp,6)329@16529L6,330@16571L22,333@16705L39,*336@16837L7,337@16861L1052:Surface.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 14) == 0) {
                i4 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i4 = i;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                z4 = z2;
                i4 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((57344 & i) == 0) {
                    shape2 = shape;
                    i4 |= startRestartGroup.changed(shape2) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        j3 = j;
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(j3)) ? 131072 : 65536;
                    } else {
                        j3 = j;
                    }
                    if ((i & 3670016) != 0) {
                        j4 = j2;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j4)) ? 1048576 : 524288;
                    } else {
                        j4 = j2;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i8 = i7;
                        i4 |= startRestartGroup.changed(borderStroke) ? 8388608 : 4194304;
                        i9 = i3 & 256;
                        if (i9 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            i10 = i9;
                            i4 |= startRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            i11 = i3 & 512;
                            if (i11 == 0) {
                                i4 |= C.ENCODING_PCM_32BIT;
                            } else if ((i & 1879048192) == 0) {
                                i12 = i11;
                                i4 |= startRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                                if ((i3 & 1024) != 0) {
                                    i13 = i2 | 6;
                                } else if ((i2 & 14) == 0) {
                                    i13 = i2 | (startRestartGroup.changed(content) ? 4 : 2);
                                } else {
                                    i13 = i2;
                                }
                                i14 = i13;
                                if ((i4 & 1533916891) == 306783378 || (i14 & 11) != 2 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        companion = i16 != 0 ? Modifier.INSTANCE : modifier2;
                                        if (i5 != 0) {
                                            z4 = true;
                                        }
                                        Shape rectangleShape = i6 != 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                                        if ((i3 & 32) != 0) {
                                            j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1328getSurface0d7_KjU();
                                            i4 &= -458753;
                                        }
                                        if ((i3 & 64) != 0) {
                                            j5 = ColorsKt.m1342contentColorForek8zF_U(j3, startRestartGroup, (i4 >> 15) & 14);
                                            i4 &= -3670017;
                                        } else {
                                            j5 = j4;
                                        }
                                        BorderStroke borderStroke4 = i8 != 0 ? null : borderStroke;
                                        float m4440constructorimpl = i10 != 0 ? Dp.m4440constructorimpl(0) : f;
                                        if (i12 != 0) {
                                            startRestartGroup.startReplaceableGroup(-492369756);
                                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            objArr = true;
                                            shape3 = rectangleShape;
                                            i15 = i4;
                                            j6 = j3;
                                            j7 = j5;
                                            borderStroke2 = borderStroke4;
                                            f2 = m4440constructorimpl;
                                            z5 = z4;
                                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                        } else {
                                            objArr = true;
                                            shape3 = rectangleShape;
                                            i15 = i4;
                                            j6 = j3;
                                            j7 = j5;
                                            borderStroke2 = borderStroke4;
                                            f2 = m4440constructorimpl;
                                            z5 = z4;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                        }
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 32) != 0) {
                                            i4 &= -458753;
                                        }
                                        if ((i3 & 64) != 0) {
                                            i4 &= -3670017;
                                        }
                                        f2 = f;
                                        i15 = i4;
                                        j6 = j3;
                                        companion = modifier2;
                                        z5 = z4;
                                        j7 = j4;
                                        borderStroke2 = borderStroke;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        objArr = true;
                                        shape3 = shape2;
                                    }
                                    startRestartGroup.endDefaults();
                                    ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localAbsoluteElevation);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final float m4440constructorimpl2 = Dp.m4440constructorimpl(((Dp) consume).m4454unboximpl() + f2);
                                    ProvidedValue[] providedValueArr = new ProvidedValue[2];
                                    providedValueArr[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j7));
                                    providedValueArr[objArr == true ? 1 : 0] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl2));
                                    final Modifier modifier4 = companion;
                                    composer2 = startRestartGroup;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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
                                            long m1527surfaceColorAtElevationcq6XJ1M;
                                            Modifier m1526surface8ww4TTg;
                                            ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                                            if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                                                Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                                Shape shape5 = shape3;
                                                long j10 = j6;
                                                ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume2 = composer3.consume(localElevationOverlay);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume2, m4440constructorimpl2, composer3, (i15 >> 15) & 14);
                                                m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                                                Modifier m826selectableO2vRcR0 = SelectableKt.m826selectableO2vRcR0(m1526surface8ww4TTg, z3, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5, Role.m3760boximpl(Role.INSTANCE.m3773getTabo7Vup1c()), onClick);
                                                Function2<Composer, Integer, Unit> function2 = content;
                                                int i18 = i14;
                                                composer3.startReplaceableGroup(733328855);
                                                ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                                composer3.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume3 = composer3.consume(localDensity);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                Density density = (Density) consume3;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume4 = composer3.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume5 = composer3.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m826selectableO2vRcR0);
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
                                                composer3.startReplaceableGroup(23612267);
                                                ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                                                function2.invoke(composer3, Integer.valueOf(i18 & 14));
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
                                    }), composer2, 56);
                                    shape4 = shape3;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    borderStroke3 = borderStroke2;
                                    j8 = j6;
                                    z6 = z5;
                                    modifier3 = modifier4;
                                    f3 = f2;
                                    j9 = j7;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    f3 = f;
                                    modifier3 = modifier2;
                                    j9 = j4;
                                    composer2 = startRestartGroup;
                                    j8 = j3;
                                    z6 = z4;
                                    shape4 = shape2;
                                    borderStroke3 = borderStroke;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    return;
                                }
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$8
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
                                        SurfaceKt.m1522SurfaceNy5ogXk(z, onClick, modifier3, z6, shape4, j8, j9, borderStroke3, f3, mutableInteractionSource3, content, composer3, i | 1, i2, i3);
                                    }
                                });
                                return;
                            }
                            i12 = i11;
                            if ((i3 & 1024) != 0) {
                            }
                            i14 = i13;
                            if ((i4 & 1533916891) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if ((i3 & 32) != 0) {
                            }
                            if ((i3 & 64) != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            startRestartGroup.endDefaults();
                            ProvidableCompositionLocal<Dp> localAbsoluteElevation2 = ElevationOverlayKt.getLocalAbsoluteElevation();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localAbsoluteElevation2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final float m4440constructorimpl22 = Dp.m4440constructorimpl(((Dp) consume2).m4454unboximpl() + f2);
                            ProvidedValue[] providedValueArr2 = new ProvidedValue[2];
                            providedValueArr2[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j7));
                            providedValueArr2[objArr == true ? 1 : 0] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl22));
                            final Modifier modifier42 = companion;
                            composer2 = startRestartGroup;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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
                                    long m1527surfaceColorAtElevationcq6XJ1M;
                                    Modifier m1526surface8ww4TTg;
                                    ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                                    if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                        Shape shape5 = shape3;
                                        long j10 = j6;
                                        ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume22 = composer3.consume(localElevationOverlay);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume22, m4440constructorimpl22, composer3, (i15 >> 15) & 14);
                                        m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                                        Modifier m826selectableO2vRcR0 = SelectableKt.m826selectableO2vRcR0(m1526surface8ww4TTg, z3, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5, Role.m3760boximpl(Role.INSTANCE.m3773getTabo7Vup1c()), onClick);
                                        Function2<Composer, Integer, Unit> function2 = content;
                                        int i18 = i14;
                                        composer3.startReplaceableGroup(733328855);
                                        ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                        composer3.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume3 = composer3.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        Density density = (Density) consume3;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume4 = composer3.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume5 = composer3.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m826selectableO2vRcR0);
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
                                        composer3.startReplaceableGroup(23612267);
                                        ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                                        function2.invoke(composer3, Integer.valueOf(i18 & 14));
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
                            }), composer2, 56);
                            shape4 = shape3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            borderStroke3 = borderStroke2;
                            j8 = j6;
                            z6 = z5;
                            modifier3 = modifier42;
                            f3 = f2;
                            j9 = j7;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i10 = i9;
                        i11 = i3 & 512;
                        if (i11 == 0) {
                        }
                        i12 = i11;
                        if ((i3 & 1024) != 0) {
                        }
                        i14 = i13;
                        if ((i4 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if ((i3 & 32) != 0) {
                        }
                        if ((i3 & 64) != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        startRestartGroup.endDefaults();
                        ProvidableCompositionLocal<Dp> localAbsoluteElevation22 = ElevationOverlayKt.getLocalAbsoluteElevation();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume22 = startRestartGroup.consume(localAbsoluteElevation22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final float m4440constructorimpl222 = Dp.m4440constructorimpl(((Dp) consume22).m4454unboximpl() + f2);
                        ProvidedValue[] providedValueArr22 = new ProvidedValue[2];
                        providedValueArr22[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j7));
                        providedValueArr22[objArr == true ? 1 : 0] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl222));
                        final Modifier modifier422 = companion;
                        composer2 = startRestartGroup;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr22, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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
                                long m1527surfaceColorAtElevationcq6XJ1M;
                                Modifier m1526surface8ww4TTg;
                                ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                                if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                    Shape shape5 = shape3;
                                    long j10 = j6;
                                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume222 = composer3.consume(localElevationOverlay);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume222, m4440constructorimpl222, composer3, (i15 >> 15) & 14);
                                    m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                                    Modifier m826selectableO2vRcR0 = SelectableKt.m826selectableO2vRcR0(m1526surface8ww4TTg, z3, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5, Role.m3760boximpl(Role.INSTANCE.m3773getTabo7Vup1c()), onClick);
                                    Function2<Composer, Integer, Unit> function2 = content;
                                    int i18 = i14;
                                    composer3.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume3 = composer3.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Density density = (Density) consume3;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume4 = composer3.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume5 = composer3.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m826selectableO2vRcR0);
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
                                    composer3.startReplaceableGroup(23612267);
                                    ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                                    function2.invoke(composer3, Integer.valueOf(i18 & 14));
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
                        }), composer2, 56);
                        shape4 = shape3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        borderStroke3 = borderStroke2;
                        j8 = j6;
                        z6 = z5;
                        modifier3 = modifier422;
                        f3 = f2;
                        j9 = j7;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i8 = i7;
                    i9 = i3 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i3 & 512;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    if ((i3 & 1024) != 0) {
                    }
                    i14 = i13;
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    startRestartGroup.endDefaults();
                    ProvidableCompositionLocal<Dp> localAbsoluteElevation222 = ElevationOverlayKt.getLocalAbsoluteElevation();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume222 = startRestartGroup.consume(localAbsoluteElevation222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float m4440constructorimpl2222 = Dp.m4440constructorimpl(((Dp) consume222).m4454unboximpl() + f2);
                    ProvidedValue[] providedValueArr222 = new ProvidedValue[2];
                    providedValueArr222[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j7));
                    providedValueArr222[objArr == true ? 1 : 0] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl2222));
                    final Modifier modifier4222 = companion;
                    composer2 = startRestartGroup;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr222, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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
                            long m1527surfaceColorAtElevationcq6XJ1M;
                            Modifier m1526surface8ww4TTg;
                            ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                            if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                                Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                Shape shape5 = shape3;
                                long j10 = j6;
                                ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume2222 = composer3.consume(localElevationOverlay);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume2222, m4440constructorimpl2222, composer3, (i15 >> 15) & 14);
                                m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                                Modifier m826selectableO2vRcR0 = SelectableKt.m826selectableO2vRcR0(m1526surface8ww4TTg, z3, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5, Role.m3760boximpl(Role.INSTANCE.m3773getTabo7Vup1c()), onClick);
                                Function2<Composer, Integer, Unit> function2 = content;
                                int i18 = i14;
                                composer3.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume3 = composer3.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Density density = (Density) consume3;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume4 = composer3.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume5 = composer3.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m826selectableO2vRcR0);
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
                                composer3.startReplaceableGroup(23612267);
                                ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                                function2.invoke(composer3, Integer.valueOf(i18 & 14));
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
                    }), composer2, 56);
                    shape4 = shape3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    borderStroke3 = borderStroke2;
                    j8 = j6;
                    z6 = z5;
                    modifier3 = modifier4222;
                    f3 = f2;
                    j9 = j7;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                shape2 = shape;
                if ((458752 & i) != 0) {
                }
                if ((i & 3670016) != 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i7;
                i9 = i3 & 256;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 == 0) {
                }
                i12 = i11;
                if ((i3 & 1024) != 0) {
                }
                i14 = i13;
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i16 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i12 != 0) {
                }
                startRestartGroup.endDefaults();
                ProvidableCompositionLocal<Dp> localAbsoluteElevation2222 = ElevationOverlayKt.getLocalAbsoluteElevation();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume2222 = startRestartGroup.consume(localAbsoluteElevation2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final float m4440constructorimpl22222 = Dp.m4440constructorimpl(((Dp) consume2222).m4454unboximpl() + f2);
                ProvidedValue[] providedValueArr2222 = new ProvidedValue[2];
                providedValueArr2222[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j7));
                providedValueArr2222[objArr == true ? 1 : 0] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl22222));
                final Modifier modifier42222 = companion;
                composer2 = startRestartGroup;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2222, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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
                        long m1527surfaceColorAtElevationcq6XJ1M;
                        Modifier m1526surface8ww4TTg;
                        ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                        if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                            Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                            Shape shape5 = shape3;
                            long j10 = j6;
                            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume22222 = composer3.consume(localElevationOverlay);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume22222, m4440constructorimpl22222, composer3, (i15 >> 15) & 14);
                            m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                            Modifier m826selectableO2vRcR0 = SelectableKt.m826selectableO2vRcR0(m1526surface8ww4TTg, z3, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5, Role.m3760boximpl(Role.INSTANCE.m3773getTabo7Vup1c()), onClick);
                            Function2<Composer, Integer, Unit> function2 = content;
                            int i18 = i14;
                            composer3.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer3.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Density density = (Density) consume3;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer3.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume5 = composer3.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m826selectableO2vRcR0);
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
                            composer3.startReplaceableGroup(23612267);
                            ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                            function2.invoke(composer3, Integer.valueOf(i18 & 14));
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
                }), composer2, 56);
                shape4 = shape3;
                mutableInteractionSource3 = mutableInteractionSource2;
                borderStroke3 = borderStroke2;
                j8 = j6;
                z6 = z5;
                modifier3 = modifier42222;
                f3 = f2;
                j9 = j7;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            shape2 = shape;
            if ((458752 & i) != 0) {
            }
            if ((i & 3670016) != 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i7;
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i3 & 1024) != 0) {
            }
            i14 = i13;
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i16 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i12 != 0) {
            }
            startRestartGroup.endDefaults();
            ProvidableCompositionLocal<Dp> localAbsoluteElevation22222 = ElevationOverlayKt.getLocalAbsoluteElevation();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume22222 = startRestartGroup.consume(localAbsoluteElevation22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float m4440constructorimpl222222 = Dp.m4440constructorimpl(((Dp) consume22222).m4454unboximpl() + f2);
            ProvidedValue[] providedValueArr22222 = new ProvidedValue[2];
            providedValueArr22222[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j7));
            providedValueArr22222[objArr == true ? 1 : 0] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl222222));
            final Modifier modifier422222 = companion;
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr22222, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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
                    long m1527surfaceColorAtElevationcq6XJ1M;
                    Modifier m1526surface8ww4TTg;
                    ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                    if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                        Shape shape5 = shape3;
                        long j10 = j6;
                        ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume222222 = composer3.consume(localElevationOverlay);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume222222, m4440constructorimpl222222, composer3, (i15 >> 15) & 14);
                        m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                        Modifier m826selectableO2vRcR0 = SelectableKt.m826selectableO2vRcR0(m1526surface8ww4TTg, z3, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5, Role.m3760boximpl(Role.INSTANCE.m3773getTabo7Vup1c()), onClick);
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i18 = i14;
                        composer3.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer3.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Density density = (Density) consume3;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer3.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume5 = composer3.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m826selectableO2vRcR0);
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
                        composer3.startReplaceableGroup(23612267);
                        ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                        function2.invoke(composer3, Integer.valueOf(i18 & 14));
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
            }), composer2, 56);
            shape4 = shape3;
            mutableInteractionSource3 = mutableInteractionSource2;
            borderStroke3 = borderStroke2;
            j8 = j6;
            z6 = z5;
            modifier3 = modifier422222;
            f3 = f2;
            j9 = j7;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        shape2 = shape;
        if ((458752 & i) != 0) {
        }
        if ((i & 3670016) != 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i3 & 1024) != 0) {
        }
        i14 = i13;
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i16 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i12 != 0) {
        }
        startRestartGroup.endDefaults();
        ProvidableCompositionLocal<Dp> localAbsoluteElevation222222 = ElevationOverlayKt.getLocalAbsoluteElevation();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume222222 = startRestartGroup.consume(localAbsoluteElevation222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float m4440constructorimpl2222222 = Dp.m4440constructorimpl(((Dp) consume222222).m4454unboximpl() + f2);
        ProvidedValue[] providedValueArr222222 = new ProvidedValue[2];
        providedValueArr222222[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j7));
        providedValueArr222222[objArr == true ? 1 : 0] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl2222222));
        final Modifier modifier4222222 = companion;
        composer2 = startRestartGroup;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr222222, ComposableLambdaKt.composableLambda(composer2, -1391199439, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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
                long m1527surfaceColorAtElevationcq6XJ1M;
                Modifier m1526surface8ww4TTg;
                ComposerKt.sourceInformation(composer3, "C348@17317L7,346@17188L221,357@17670L16,341@17010L897:Surface.kt#jmzs0o");
                if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                    Shape shape5 = shape3;
                    long j10 = j6;
                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2222222 = composer3.consume(localElevationOverlay);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume2222222, m4440constructorimpl2222222, composer3, (i15 >> 15) & 14);
                    m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                    Modifier m826selectableO2vRcR0 = SelectableKt.m826selectableO2vRcR0(m1526surface8ww4TTg, z3, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5, Role.m3760boximpl(Role.INSTANCE.m3773getTabo7Vup1c()), onClick);
                    Function2<Composer, Integer, Unit> function2 = content;
                    int i18 = i14;
                    composer3.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer3.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Density density = (Density) consume3;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = composer3.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume5 = composer3.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m826selectableO2vRcR0);
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
                    composer3.startReplaceableGroup(23612267);
                    ComposerKt.sourceInformation(composer3, "C364@17888L9:Surface.kt#jmzs0o");
                    function2.invoke(composer3, Integer.valueOf(i18 & 14));
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
        }), composer2, 56);
        shape4 = shape3;
        mutableInteractionSource3 = mutableInteractionSource2;
        borderStroke3 = borderStroke2;
        j8 = j6;
        z6 = z5;
        modifier3 = modifier4222222;
        f3 = f2;
        j9 = j7;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f7  */
    @ExperimentalMaterialApi
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1523SurfaceNy5ogXk(final boolean z, final Function1<? super Boolean, Unit> onCheckedChange, Modifier modifier, boolean z2, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        final boolean z3;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z4;
        int i6;
        Shape shape2;
        long j3;
        long j4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final int i14;
        Modifier.Companion companion;
        long j5;
        Object[] objArr;
        final Shape shape3;
        final int i15;
        final long j6;
        long j7;
        final BorderStroke borderStroke2;
        final float f2;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        final Shape shape4;
        final MutableInteractionSource mutableInteractionSource3;
        final BorderStroke borderStroke3;
        final long j8;
        final boolean z6;
        final Modifier modifier3;
        final float f3;
        final long j9;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1341569296);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(1,9,8,6,10,2:c#ui.graphics.Color,4:c#ui.graphics.Color!1,5:c#ui.unit.Dp,7)446@22479L6,447@22521L22,450@22655L39,*453@22787L7,454@22811L1065:Surface.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 14) == 0) {
                i4 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i4 = i;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(onCheckedChange) ? 32 : 16;
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 7168) == 0) {
                z4 = z2;
                i4 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((57344 & i) == 0) {
                    shape2 = shape;
                    i4 |= startRestartGroup.changed(shape2) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        j3 = j;
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(j3)) ? 131072 : 65536;
                    } else {
                        j3 = j;
                    }
                    if ((i & 3670016) != 0) {
                        j4 = j2;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j4)) ? 1048576 : 524288;
                    } else {
                        j4 = j2;
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i8 = i7;
                        i4 |= startRestartGroup.changed(borderStroke) ? 8388608 : 4194304;
                        i9 = i3 & 256;
                        if (i9 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            i10 = i9;
                            i4 |= startRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            i11 = i3 & 512;
                            if (i11 == 0) {
                                i4 |= C.ENCODING_PCM_32BIT;
                            } else if ((i & 1879048192) == 0) {
                                i12 = i11;
                                i4 |= startRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                                if ((i3 & 1024) != 0) {
                                    i13 = i2 | 6;
                                } else if ((i2 & 14) == 0) {
                                    i13 = i2 | (startRestartGroup.changed(content) ? 4 : 2);
                                } else {
                                    i13 = i2;
                                }
                                i14 = i13;
                                if ((i4 & 1533916891) == 306783378 || (i14 & 11) != 2 || !startRestartGroup.getSkipping()) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                        companion = i16 != 0 ? Modifier.INSTANCE : modifier2;
                                        if (i5 != 0) {
                                            z4 = true;
                                        }
                                        Shape rectangleShape = i6 != 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                                        if ((i3 & 32) != 0) {
                                            j3 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1328getSurface0d7_KjU();
                                            i4 &= -458753;
                                        }
                                        if ((i3 & 64) != 0) {
                                            j5 = ColorsKt.m1342contentColorForek8zF_U(j3, startRestartGroup, (i4 >> 15) & 14);
                                            i4 &= -3670017;
                                        } else {
                                            j5 = j4;
                                        }
                                        BorderStroke borderStroke4 = i8 != 0 ? null : borderStroke;
                                        float m4440constructorimpl = i10 != 0 ? Dp.m4440constructorimpl(0) : f;
                                        if (i12 != 0) {
                                            startRestartGroup.startReplaceableGroup(-492369756);
                                            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            startRestartGroup.endReplaceableGroup();
                                            objArr = true;
                                            shape3 = rectangleShape;
                                            i15 = i4;
                                            j6 = j3;
                                            j7 = j5;
                                            borderStroke2 = borderStroke4;
                                            f2 = m4440constructorimpl;
                                            z5 = z4;
                                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                        } else {
                                            objArr = true;
                                            shape3 = rectangleShape;
                                            i15 = i4;
                                            j6 = j3;
                                            j7 = j5;
                                            borderStroke2 = borderStroke4;
                                            f2 = m4440constructorimpl;
                                            z5 = z4;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                        }
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 32) != 0) {
                                            i4 &= -458753;
                                        }
                                        if ((i3 & 64) != 0) {
                                            i4 &= -3670017;
                                        }
                                        f2 = f;
                                        i15 = i4;
                                        j6 = j3;
                                        companion = modifier2;
                                        z5 = z4;
                                        j7 = j4;
                                        borderStroke2 = borderStroke;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        objArr = true;
                                        shape3 = shape2;
                                    }
                                    startRestartGroup.endDefaults();
                                    ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localAbsoluteElevation);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    final float m4440constructorimpl2 = Dp.m4440constructorimpl(((Dp) consume).m4454unboximpl() + f2);
                                    ProvidedValue[] providedValueArr = new ProvidedValue[2];
                                    providedValueArr[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j7));
                                    providedValueArr[objArr == true ? 1 : 0] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl2));
                                    final Modifier modifier4 = companion;
                                    composer2 = startRestartGroup;
                                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, -311657392, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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
                                            long m1527surfaceColorAtElevationcq6XJ1M;
                                            Modifier m1526surface8ww4TTg;
                                            ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                                            if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                                                Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                                Shape shape5 = shape3;
                                                long j10 = j6;
                                                ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume2 = composer3.consume(localElevationOverlay);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume2, m4440constructorimpl2, composer3, (i15 >> 15) & 14);
                                                m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                                                Modifier m830toggleableO2vRcR0 = ToggleableKt.m830toggleableO2vRcR0(m1526surface8ww4TTg, z3, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5, Role.m3760boximpl(Role.INSTANCE.m3772getSwitcho7Vup1c()), onCheckedChange);
                                                Function2<Composer, Integer, Unit> function2 = content;
                                                int i18 = i14;
                                                composer3.startReplaceableGroup(733328855);
                                                ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                                composer3.startReplaceableGroup(-1323940314);
                                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume3 = composer3.consume(localDensity);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                Density density = (Density) consume3;
                                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume4 = composer3.consume(localLayoutDirection);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                                Object consume5 = composer3.consume(localViewConfiguration);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m830toggleableO2vRcR0);
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
                                                composer3.startReplaceableGroup(1103154314);
                                                ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                                                function2.invoke(composer3, Integer.valueOf(i18 & 14));
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
                                    }), composer2, 56);
                                    shape4 = shape3;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    borderStroke3 = borderStroke2;
                                    j8 = j6;
                                    z6 = z5;
                                    modifier3 = modifier4;
                                    f3 = f2;
                                    j9 = j7;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    f3 = f;
                                    modifier3 = modifier2;
                                    j9 = j4;
                                    composer2 = startRestartGroup;
                                    j8 = j3;
                                    z6 = z4;
                                    shape4 = shape2;
                                    borderStroke3 = borderStroke;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    return;
                                }
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$11
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
                                        SurfaceKt.m1523SurfaceNy5ogXk(z, onCheckedChange, modifier3, z6, shape4, j8, j9, borderStroke3, f3, mutableInteractionSource3, content, composer3, i | 1, i2, i3);
                                    }
                                });
                                return;
                            }
                            i12 = i11;
                            if ((i3 & 1024) != 0) {
                            }
                            i14 = i13;
                            if ((i4 & 1533916891) == 306783378) {
                            }
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if ((i3 & 32) != 0) {
                            }
                            if ((i3 & 64) != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i12 != 0) {
                            }
                            startRestartGroup.endDefaults();
                            ProvidableCompositionLocal<Dp> localAbsoluteElevation2 = ElevationOverlayKt.getLocalAbsoluteElevation();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localAbsoluteElevation2);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final float m4440constructorimpl22 = Dp.m4440constructorimpl(((Dp) consume2).m4454unboximpl() + f2);
                            ProvidedValue[] providedValueArr2 = new ProvidedValue[2];
                            providedValueArr2[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j7));
                            providedValueArr2[objArr == true ? 1 : 0] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl22));
                            final Modifier modifier42 = companion;
                            composer2 = startRestartGroup;
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2, ComposableLambdaKt.composableLambda(composer2, -311657392, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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
                                    long m1527surfaceColorAtElevationcq6XJ1M;
                                    Modifier m1526surface8ww4TTg;
                                    ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                                    if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                        Shape shape5 = shape3;
                                        long j10 = j6;
                                        ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume22 = composer3.consume(localElevationOverlay);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume22, m4440constructorimpl22, composer3, (i15 >> 15) & 14);
                                        m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                                        Modifier m830toggleableO2vRcR0 = ToggleableKt.m830toggleableO2vRcR0(m1526surface8ww4TTg, z3, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5, Role.m3760boximpl(Role.INSTANCE.m3772getSwitcho7Vup1c()), onCheckedChange);
                                        Function2<Composer, Integer, Unit> function2 = content;
                                        int i18 = i14;
                                        composer3.startReplaceableGroup(733328855);
                                        ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                        composer3.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume3 = composer3.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        Density density = (Density) consume3;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume4 = composer3.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume5 = composer3.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m830toggleableO2vRcR0);
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
                                        composer3.startReplaceableGroup(1103154314);
                                        ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                                        function2.invoke(composer3, Integer.valueOf(i18 & 14));
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
                            }), composer2, 56);
                            shape4 = shape3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            borderStroke3 = borderStroke2;
                            j8 = j6;
                            z6 = z5;
                            modifier3 = modifier42;
                            f3 = f2;
                            j9 = j7;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i10 = i9;
                        i11 = i3 & 512;
                        if (i11 == 0) {
                        }
                        i12 = i11;
                        if ((i3 & 1024) != 0) {
                        }
                        i14 = i13;
                        if ((i4 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if ((i3 & 32) != 0) {
                        }
                        if ((i3 & 64) != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        startRestartGroup.endDefaults();
                        ProvidableCompositionLocal<Dp> localAbsoluteElevation22 = ElevationOverlayKt.getLocalAbsoluteElevation();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume22 = startRestartGroup.consume(localAbsoluteElevation22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final float m4440constructorimpl222 = Dp.m4440constructorimpl(((Dp) consume22).m4454unboximpl() + f2);
                        ProvidedValue[] providedValueArr22 = new ProvidedValue[2];
                        providedValueArr22[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j7));
                        providedValueArr22[objArr == true ? 1 : 0] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl222));
                        final Modifier modifier422 = companion;
                        composer2 = startRestartGroup;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr22, ComposableLambdaKt.composableLambda(composer2, -311657392, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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
                                long m1527surfaceColorAtElevationcq6XJ1M;
                                Modifier m1526surface8ww4TTg;
                                ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                                if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                    Shape shape5 = shape3;
                                    long j10 = j6;
                                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume222 = composer3.consume(localElevationOverlay);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume222, m4440constructorimpl222, composer3, (i15 >> 15) & 14);
                                    m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                                    Modifier m830toggleableO2vRcR0 = ToggleableKt.m830toggleableO2vRcR0(m1526surface8ww4TTg, z3, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5, Role.m3760boximpl(Role.INSTANCE.m3772getSwitcho7Vup1c()), onCheckedChange);
                                    Function2<Composer, Integer, Unit> function2 = content;
                                    int i18 = i14;
                                    composer3.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume3 = composer3.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Density density = (Density) consume3;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume4 = composer3.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume5 = composer3.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m830toggleableO2vRcR0);
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
                                    composer3.startReplaceableGroup(1103154314);
                                    ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                                    function2.invoke(composer3, Integer.valueOf(i18 & 14));
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
                        }), composer2, 56);
                        shape4 = shape3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        borderStroke3 = borderStroke2;
                        j8 = j6;
                        z6 = z5;
                        modifier3 = modifier422;
                        f3 = f2;
                        j9 = j7;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i8 = i7;
                    i9 = i3 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i3 & 512;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    if ((i3 & 1024) != 0) {
                    }
                    i14 = i13;
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i3 & 32) != 0) {
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    startRestartGroup.endDefaults();
                    ProvidableCompositionLocal<Dp> localAbsoluteElevation222 = ElevationOverlayKt.getLocalAbsoluteElevation();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume222 = startRestartGroup.consume(localAbsoluteElevation222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final float m4440constructorimpl2222 = Dp.m4440constructorimpl(((Dp) consume222).m4454unboximpl() + f2);
                    ProvidedValue[] providedValueArr222 = new ProvidedValue[2];
                    providedValueArr222[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j7));
                    providedValueArr222[objArr == true ? 1 : 0] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl2222));
                    final Modifier modifier4222 = companion;
                    composer2 = startRestartGroup;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr222, ComposableLambdaKt.composableLambda(composer2, -311657392, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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
                            long m1527surfaceColorAtElevationcq6XJ1M;
                            Modifier m1526surface8ww4TTg;
                            ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                            if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                                Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                Shape shape5 = shape3;
                                long j10 = j6;
                                ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume2222 = composer3.consume(localElevationOverlay);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume2222, m4440constructorimpl2222, composer3, (i15 >> 15) & 14);
                                m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                                Modifier m830toggleableO2vRcR0 = ToggleableKt.m830toggleableO2vRcR0(m1526surface8ww4TTg, z3, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5, Role.m3760boximpl(Role.INSTANCE.m3772getSwitcho7Vup1c()), onCheckedChange);
                                Function2<Composer, Integer, Unit> function2 = content;
                                int i18 = i14;
                                composer3.startReplaceableGroup(733328855);
                                ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume3 = composer3.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Density density = (Density) consume3;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume4 = composer3.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                LayoutDirection layoutDirection = (LayoutDirection) consume4;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume5 = composer3.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m830toggleableO2vRcR0);
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
                                composer3.startReplaceableGroup(1103154314);
                                ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                                function2.invoke(composer3, Integer.valueOf(i18 & 14));
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
                    }), composer2, 56);
                    shape4 = shape3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    borderStroke3 = borderStroke2;
                    j8 = j6;
                    z6 = z5;
                    modifier3 = modifier4222;
                    f3 = f2;
                    j9 = j7;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                shape2 = shape;
                if ((458752 & i) != 0) {
                }
                if ((i & 3670016) != 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                i8 = i7;
                i9 = i3 & 256;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 == 0) {
                }
                i12 = i11;
                if ((i3 & 1024) != 0) {
                }
                i14 = i13;
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i16 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i3 & 32) != 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i12 != 0) {
                }
                startRestartGroup.endDefaults();
                ProvidableCompositionLocal<Dp> localAbsoluteElevation2222 = ElevationOverlayKt.getLocalAbsoluteElevation();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume2222 = startRestartGroup.consume(localAbsoluteElevation2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final float m4440constructorimpl22222 = Dp.m4440constructorimpl(((Dp) consume2222).m4454unboximpl() + f2);
                ProvidedValue[] providedValueArr2222 = new ProvidedValue[2];
                providedValueArr2222[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j7));
                providedValueArr2222[objArr == true ? 1 : 0] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl22222));
                final Modifier modifier42222 = companion;
                composer2 = startRestartGroup;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2222, ComposableLambdaKt.composableLambda(composer2, -311657392, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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
                        long m1527surfaceColorAtElevationcq6XJ1M;
                        Modifier m1526surface8ww4TTg;
                        ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                        if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                            Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                            Shape shape5 = shape3;
                            long j10 = j6;
                            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume22222 = composer3.consume(localElevationOverlay);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume22222, m4440constructorimpl22222, composer3, (i15 >> 15) & 14);
                            m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                            Modifier m830toggleableO2vRcR0 = ToggleableKt.m830toggleableO2vRcR0(m1526surface8ww4TTg, z3, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5, Role.m3760boximpl(Role.INSTANCE.m3772getSwitcho7Vup1c()), onCheckedChange);
                            Function2<Composer, Integer, Unit> function2 = content;
                            int i18 = i14;
                            composer3.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer3.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Density density = (Density) consume3;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer3.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            LayoutDirection layoutDirection = (LayoutDirection) consume4;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume5 = composer3.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m830toggleableO2vRcR0);
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
                            composer3.startReplaceableGroup(1103154314);
                            ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                            function2.invoke(composer3, Integer.valueOf(i18 & 14));
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
                }), composer2, 56);
                shape4 = shape3;
                mutableInteractionSource3 = mutableInteractionSource2;
                borderStroke3 = borderStroke2;
                j8 = j6;
                z6 = z5;
                modifier3 = modifier42222;
                f3 = f2;
                j9 = j7;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            shape2 = shape;
            if ((458752 & i) != 0) {
            }
            if ((i & 3670016) != 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            i8 = i7;
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i3 & 1024) != 0) {
            }
            i14 = i13;
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i16 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i12 != 0) {
            }
            startRestartGroup.endDefaults();
            ProvidableCompositionLocal<Dp> localAbsoluteElevation22222 = ElevationOverlayKt.getLocalAbsoluteElevation();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume22222 = startRestartGroup.consume(localAbsoluteElevation22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float m4440constructorimpl222222 = Dp.m4440constructorimpl(((Dp) consume22222).m4454unboximpl() + f2);
            ProvidedValue[] providedValueArr22222 = new ProvidedValue[2];
            providedValueArr22222[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j7));
            providedValueArr22222[objArr == true ? 1 : 0] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl222222));
            final Modifier modifier422222 = companion;
            composer2 = startRestartGroup;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr22222, ComposableLambdaKt.composableLambda(composer2, -311657392, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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
                    long m1527surfaceColorAtElevationcq6XJ1M;
                    Modifier m1526surface8ww4TTg;
                    ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                    if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                        Shape shape5 = shape3;
                        long j10 = j6;
                        ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume222222 = composer3.consume(localElevationOverlay);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume222222, m4440constructorimpl222222, composer3, (i15 >> 15) & 14);
                        m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                        Modifier m830toggleableO2vRcR0 = ToggleableKt.m830toggleableO2vRcR0(m1526surface8ww4TTg, z3, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5, Role.m3760boximpl(Role.INSTANCE.m3772getSwitcho7Vup1c()), onCheckedChange);
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i18 = i14;
                        composer3.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer3.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Density density = (Density) consume3;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer3.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        LayoutDirection layoutDirection = (LayoutDirection) consume4;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume5 = composer3.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m830toggleableO2vRcR0);
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
                        composer3.startReplaceableGroup(1103154314);
                        ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                        function2.invoke(composer3, Integer.valueOf(i18 & 14));
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
            }), composer2, 56);
            shape4 = shape3;
            mutableInteractionSource3 = mutableInteractionSource2;
            borderStroke3 = borderStroke2;
            j8 = j6;
            z6 = z5;
            modifier3 = modifier422222;
            f3 = f2;
            j9 = j7;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        shape2 = shape;
        if ((458752 & i) != 0) {
        }
        if ((i & 3670016) != 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i3 & 1024) != 0) {
        }
        i14 = i13;
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i16 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i12 != 0) {
        }
        startRestartGroup.endDefaults();
        ProvidableCompositionLocal<Dp> localAbsoluteElevation222222 = ElevationOverlayKt.getLocalAbsoluteElevation();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume222222 = startRestartGroup.consume(localAbsoluteElevation222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float m4440constructorimpl2222222 = Dp.m4440constructorimpl(((Dp) consume222222).m4454unboximpl() + f2);
        ProvidedValue[] providedValueArr222222 = new ProvidedValue[2];
        providedValueArr222222[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j7));
        providedValueArr222222[objArr == true ? 1 : 0] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl2222222));
        final Modifier modifier4222222 = companion;
        composer2 = startRestartGroup;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr222222, ComposableLambdaKt.composableLambda(composer2, -311657392, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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
                long m1527surfaceColorAtElevationcq6XJ1M;
                Modifier m1526surface8ww4TTg;
                ComposerKt.sourceInformation(composer3, "C465@23267L7,463@23138L221,474@23616L16,458@22960L910:Surface.kt#jmzs0o");
                if ((i17 & 11) != 2 || !composer3.getSkipping()) {
                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                    Shape shape5 = shape3;
                    long j10 = j6;
                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2222222 = composer3.consume(localElevationOverlay);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume2222222, m4440constructorimpl2222222, composer3, (i15 >> 15) & 14);
                    m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape5, m1527surfaceColorAtElevationcq6XJ1M, borderStroke2, f2);
                    Modifier m830toggleableO2vRcR0 = ToggleableKt.m830toggleableO2vRcR0(m1526surface8ww4TTg, z3, mutableInteractionSource2, RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, composer3, 0, 7), z5, Role.m3760boximpl(Role.INSTANCE.m3772getSwitcho7Vup1c()), onCheckedChange);
                    Function2<Composer, Integer, Unit> function2 = content;
                    int i18 = i14;
                    composer3.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer3.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Density density = (Density) consume3;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = composer3.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    LayoutDirection layoutDirection = (LayoutDirection) consume4;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume5 = composer3.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume5;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m830toggleableO2vRcR0);
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
                    composer3.startReplaceableGroup(1103154314);
                    ComposerKt.sourceInformation(composer3, "C481@23851L9:Surface.kt#jmzs0o");
                    function2.invoke(composer3, Integer.valueOf(i18 & 14));
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
        }), composer2, 56);
        shape4 = shape3;
        mutableInteractionSource3 = mutableInteractionSource2;
        borderStroke3 = borderStroke2;
        j8 = j6;
        z6 = z5;
        modifier3 = modifier4222222;
        f3 = f2;
        j9 = j7;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x034f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0267  */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v8 */
    @Deprecated(level = DeprecationLevel.ERROR, message = "This API is deprecated with the introduction a newer Surface function overload that accepts an onClick().", replaceWith = @ReplaceWith(expression = "Surface(onClick, modifier, enabled, shape, color, contentColor, border, elevation, interactionSource, content)", imports = {}))
    @ExperimentalMaterialApi
    /* renamed from: Surface-9VG74zQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1519Surface9VG74zQ(final Function0<Unit> onClick, Modifier modifier, Shape shape, long j, long j2, BorderStroke borderStroke, float f, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z, String str, Role role, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        long j3;
        int i6;
        BorderStroke borderStroke2;
        int i7;
        float f2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z2;
        Modifier modifier2;
        long j4;
        MutableInteractionSource mutableInteractionSource2;
        final Indication indication2;
        final boolean z3;
        String str2;
        final Shape shape2;
        long j5;
        final float f3;
        final Role role2;
        final MutableInteractionSource mutableInteractionSource3;
        long j6;
        Modifier modifier3;
        ?? r20;
        Composer composer2;
        final long j7;
        final Role role3;
        final Shape shape3;
        final String str3;
        final Modifier modifier4;
        final boolean z4;
        final Indication indication3;
        final MutableInteractionSource mutableInteractionSource4;
        final float f4;
        final BorderStroke borderStroke3;
        final long j8;
        ScopeUpdateScope endRestartGroup;
        int i17;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1585925488);
        ComposerKt.sourceInformation(startRestartGroup, "C(Surface)P(9,8,12,1:c#ui.graphics.Color,3:c#ui.graphics.Color!1,4:c#ui.unit.Dp,7,6,5,10,11:c#ui.semantics.Role)575@29078L6,576@29120L22,579@29254L39,580@29341L7,*586@29528L7,587@29552L1119:Surface.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i18 = i3 & 2;
        if (i18 != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= RendererCapabilities.MODE_SUPPORT_MASK;
            } else if ((i & 896) == 0) {
                i4 |= startRestartGroup.changed(shape) ? 256 : 128;
                if ((i & 7168) == 0) {
                    i4 |= ((i3 & 8) == 0 && startRestartGroup.changed(j)) ? 2048 : 1024;
                }
                if ((i & 57344) == 0) {
                    j3 = j2;
                    i4 |= ((i3 & 16) == 0 && startRestartGroup.changed(j3)) ? 16384 : 8192;
                } else {
                    j3 = j2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    borderStroke2 = borderStroke;
                } else {
                    borderStroke2 = borderStroke;
                    if ((i & 458752) == 0) {
                        i4 |= startRestartGroup.changed(borderStroke2) ? 131072 : 65536;
                    }
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
                    }
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= startRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                }
                if ((i & 234881024) == 0) {
                    if ((i3 & 256) == 0 && startRestartGroup.changed(indication)) {
                        i17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        i4 |= i17;
                    }
                    i17 = 33554432;
                    i4 |= i17;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= C.ENCODING_PCM_32BIT;
                } else if ((i & 1879048192) == 0) {
                    i10 = i9;
                    i4 |= startRestartGroup.changed(z) ? 536870912 : 268435456;
                    i11 = i3 & 1024;
                    if (i11 == 0) {
                        i13 = i2 | 6;
                        i12 = i11;
                    } else if ((i2 & 14) == 0) {
                        i12 = i11;
                        i13 = i2 | (startRestartGroup.changed(str) ? 4 : 2);
                    } else {
                        i12 = i11;
                        i13 = i2;
                    }
                    i14 = i3 & 2048;
                    if (i14 == 0) {
                        i13 |= 48;
                        i15 = i14;
                    } else if ((i2 & 112) == 0) {
                        i15 = i14;
                        i13 |= startRestartGroup.changed(role) ? 32 : 16;
                    } else {
                        i15 = i14;
                    }
                    i16 = i13;
                    if ((i3 & 4096) == 0) {
                        i16 |= RendererCapabilities.MODE_SUPPORT_MASK;
                    } else if ((i2 & 896) == 0) {
                        i16 |= startRestartGroup.changed(content) ? 256 : 128;
                    }
                    if ((1533916891 & i4) == 306783378 || (i16 & 731) != 146 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        final int i19 = i16;
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i18 == 0 ? Modifier.INSTANCE : modifier;
                            Shape rectangleShape = i5 == 0 ? RectangleShapeKt.getRectangleShape() : shape;
                            if ((i3 & 8) == 0) {
                                z2 = true;
                                i4 &= -7169;
                                modifier2 = companion;
                                j4 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1328getSurface0d7_KjU();
                            } else {
                                z2 = true;
                                modifier2 = companion;
                                j4 = j;
                            }
                            if ((i3 & 16) != 0) {
                                j3 = ColorsKt.m1342contentColorForek8zF_U(j4, startRestartGroup, (i4 >> 9) & 14);
                                i4 &= -57345;
                            }
                            if (i6 != 0) {
                                borderStroke2 = null;
                            }
                            if (i7 != 0) {
                                f2 = Dp.m4440constructorimpl(0);
                            }
                            if (i8 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) == 0) {
                                ProvidableCompositionLocal<Indication> localIndication = IndicationKt.getLocalIndication();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localIndication);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                indication2 = (Indication) consume;
                                i4 &= -234881025;
                            } else {
                                indication2 = indication;
                            }
                            z3 = i10 == 0 ? z2 ? 1 : 0 : z;
                            str2 = i12 == 0 ? null : str;
                            shape2 = rectangleShape;
                            j5 = j3;
                            f3 = f2;
                            role2 = i15 == 0 ? null : role;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            j6 = j4;
                            modifier3 = modifier2;
                            r20 = z2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            modifier3 = modifier;
                            shape2 = shape;
                            j6 = j;
                            indication2 = indication;
                            z3 = z;
                            str2 = str;
                            j5 = j3;
                            f3 = f2;
                            r20 = 1;
                            mutableInteractionSource3 = mutableInteractionSource;
                            role2 = role;
                        }
                        startRestartGroup.endDefaults();
                        ProvidableCompositionLocal<Dp> localAbsoluteElevation = ElevationOverlayKt.getLocalAbsoluteElevation();
                        final Modifier modifier5 = modifier3;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localAbsoluteElevation);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final float m4440constructorimpl = Dp.m4440constructorimpl(((Dp) consume2).m4454unboximpl() + f3);
                        ProvidedValue[] providedValueArr = new ProvidedValue[2];
                        providedValueArr[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j5));
                        providedValueArr[r20] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl));
                        composer2 = startRestartGroup;
                        final long j9 = j6;
                        final int i20 = i4;
                        final BorderStroke borderStroke4 = borderStroke2;
                        final String str4 = str2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 149594672, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$13
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

                            public final void invoke(Composer composer3, int i21) {
                                long m1527surfaceColorAtElevationcq6XJ1M;
                                Modifier m1526surface8ww4TTg;
                                ComposerKt.sourceInformation(composer3, "C598@29997L7,596@29868L221,591@29701L964:Surface.kt#jmzs0o");
                                if ((i21 & 11) != 2 || !composer3.getSkipping()) {
                                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                                    Shape shape4 = shape2;
                                    long j10 = j9;
                                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume3 = composer3.consume(localElevationOverlay);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume3, m4440constructorimpl, composer3, (i20 >> 9) & 14);
                                    m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape4, m1527surfaceColorAtElevationcq6XJ1M, borderStroke4, f3);
                                    Modifier then = m1526surface8ww4TTg.then(ClickableKt.m264clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication2, z3, str4, role2, onClick));
                                    Function2<Composer, Integer, Unit> function2 = content;
                                    int i22 = i19;
                                    composer3.startReplaceableGroup(733328855);
                                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                                    composer3.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume4 = composer3.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    Density density = (Density) consume4;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume5 = composer3.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume5;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume6 = composer3.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume6;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
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
                                    composer3.startReplaceableGroup(-1300719946);
                                    ComposerKt.sourceInformation(composer3, "C616@30646L9:Surface.kt#jmzs0o");
                                    function2.invoke(composer3, Integer.valueOf((i22 >> 6) & 14));
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
                        }), composer2, 56);
                        j7 = j9;
                        role3 = role2;
                        shape3 = shape2;
                        str3 = str4;
                        modifier4 = modifier5;
                        z4 = z3;
                        indication3 = indication2;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        f4 = f3;
                        borderStroke3 = borderStroke4;
                        j8 = j5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        j7 = j;
                        mutableInteractionSource4 = mutableInteractionSource;
                        indication3 = indication;
                        role3 = role;
                        composer2 = startRestartGroup;
                        j8 = j3;
                        borderStroke3 = borderStroke2;
                        f4 = f2;
                        shape3 = shape;
                        z4 = z;
                        str3 = str;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$14
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

                        public final void invoke(Composer composer3, int i21) {
                            SurfaceKt.m1519Surface9VG74zQ(onClick, modifier4, shape3, j7, j8, borderStroke3, f4, mutableInteractionSource4, indication3, z4, str3, role3, content, composer3, i | 1, i2, i3);
                        }
                    });
                    return;
                }
                i10 = i9;
                i11 = i3 & 1024;
                if (i11 == 0) {
                }
                i14 = i3 & 2048;
                if (i14 == 0) {
                }
                i16 = i13;
                if ((i3 & 4096) == 0) {
                }
                if ((1533916891 & i4) == 306783378) {
                }
                startRestartGroup.startDefaults();
                final int i192 = i16;
                if ((i & 1) != 0) {
                }
                if (i18 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i3 & 8) == 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 == 0) {
                }
                if ((i3 & 256) == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                shape2 = rectangleShape;
                j5 = j3;
                f3 = f2;
                if (i15 == 0) {
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                j6 = j4;
                modifier3 = modifier2;
                r20 = z2;
                startRestartGroup.endDefaults();
                ProvidableCompositionLocal<Dp> localAbsoluteElevation2 = ElevationOverlayKt.getLocalAbsoluteElevation();
                final Modifier modifier52 = modifier3;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localAbsoluteElevation2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final float m4440constructorimpl2 = Dp.m4440constructorimpl(((Dp) consume22).m4454unboximpl() + f3);
                ProvidedValue[] providedValueArr2 = new ProvidedValue[2];
                providedValueArr2[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j5));
                providedValueArr2[r20] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl2));
                composer2 = startRestartGroup;
                final long j92 = j6;
                final int i202 = i4;
                final BorderStroke borderStroke42 = borderStroke2;
                final String str42 = str2;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr2, ComposableLambdaKt.composableLambda(composer2, 149594672, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$13
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

                    public final void invoke(Composer composer3, int i21) {
                        long m1527surfaceColorAtElevationcq6XJ1M;
                        Modifier m1526surface8ww4TTg;
                        ComposerKt.sourceInformation(composer3, "C598@29997L7,596@29868L221,591@29701L964:Surface.kt#jmzs0o");
                        if ((i21 & 11) != 2 || !composer3.getSkipping()) {
                            Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                            Shape shape4 = shape2;
                            long j10 = j92;
                            ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer3.consume(localElevationOverlay);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume3, m4440constructorimpl2, composer3, (i202 >> 9) & 14);
                            m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape4, m1527surfaceColorAtElevationcq6XJ1M, borderStroke42, f3);
                            Modifier then = m1526surface8ww4TTg.then(ClickableKt.m264clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication2, z3, str42, role2, onClick));
                            Function2<Composer, Integer, Unit> function2 = content;
                            int i22 = i192;
                            composer3.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer3.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Density density = (Density) consume4;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume5 = composer3.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            LayoutDirection layoutDirection = (LayoutDirection) consume5;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume6 = composer3.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume6;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
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
                            composer3.startReplaceableGroup(-1300719946);
                            ComposerKt.sourceInformation(composer3, "C616@30646L9:Surface.kt#jmzs0o");
                            function2.invoke(composer3, Integer.valueOf((i22 >> 6) & 14));
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
                }), composer2, 56);
                j7 = j92;
                role3 = role2;
                shape3 = shape2;
                str3 = str42;
                modifier4 = modifier52;
                z4 = z3;
                indication3 = indication2;
                mutableInteractionSource4 = mutableInteractionSource3;
                f4 = f3;
                borderStroke3 = borderStroke42;
                j8 = j5;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            if ((i & 234881024) == 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 1024;
            if (i11 == 0) {
            }
            i14 = i3 & 2048;
            if (i14 == 0) {
            }
            i16 = i13;
            if ((i3 & 4096) == 0) {
            }
            if ((1533916891 & i4) == 306783378) {
            }
            startRestartGroup.startDefaults();
            final int i1922 = i16;
            if ((i & 1) != 0) {
            }
            if (i18 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i3 & 8) == 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 == 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if (i10 == 0) {
            }
            if (i12 == 0) {
            }
            shape2 = rectangleShape;
            j5 = j3;
            f3 = f2;
            if (i15 == 0) {
            }
            mutableInteractionSource3 = mutableInteractionSource2;
            j6 = j4;
            modifier3 = modifier2;
            r20 = z2;
            startRestartGroup.endDefaults();
            ProvidableCompositionLocal<Dp> localAbsoluteElevation22 = ElevationOverlayKt.getLocalAbsoluteElevation();
            final Modifier modifier522 = modifier3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localAbsoluteElevation22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final float m4440constructorimpl22 = Dp.m4440constructorimpl(((Dp) consume222).m4454unboximpl() + f3);
            ProvidedValue[] providedValueArr22 = new ProvidedValue[2];
            providedValueArr22[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j5));
            providedValueArr22[r20] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl22));
            composer2 = startRestartGroup;
            final long j922 = j6;
            final int i2022 = i4;
            final BorderStroke borderStroke422 = borderStroke2;
            final String str422 = str2;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr22, ComposableLambdaKt.composableLambda(composer2, 149594672, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$13
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

                public final void invoke(Composer composer3, int i21) {
                    long m1527surfaceColorAtElevationcq6XJ1M;
                    Modifier m1526surface8ww4TTg;
                    ComposerKt.sourceInformation(composer3, "C598@29997L7,596@29868L221,591@29701L964:Surface.kt#jmzs0o");
                    if ((i21 & 11) != 2 || !composer3.getSkipping()) {
                        Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                        Shape shape4 = shape2;
                        long j10 = j922;
                        ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer3.consume(localElevationOverlay);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume3, m4440constructorimpl22, composer3, (i2022 >> 9) & 14);
                        m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape4, m1527surfaceColorAtElevationcq6XJ1M, borderStroke422, f3);
                        Modifier then = m1526surface8ww4TTg.then(ClickableKt.m264clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication2, z3, str422, role2, onClick));
                        Function2<Composer, Integer, Unit> function2 = content;
                        int i22 = i1922;
                        composer3.startReplaceableGroup(733328855);
                        ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer3.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Density density = (Density) consume4;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume5 = composer3.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        LayoutDirection layoutDirection = (LayoutDirection) consume5;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume6 = composer3.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume6;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
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
                        composer3.startReplaceableGroup(-1300719946);
                        ComposerKt.sourceInformation(composer3, "C616@30646L9:Surface.kt#jmzs0o");
                        function2.invoke(composer3, Integer.valueOf((i22 >> 6) & 14));
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
            }), composer2, 56);
            j7 = j922;
            role3 = role2;
            shape3 = shape2;
            str3 = str422;
            modifier4 = modifier522;
            z4 = z3;
            indication3 = indication2;
            mutableInteractionSource4 = mutableInteractionSource3;
            f4 = f3;
            borderStroke3 = borderStroke422;
            j8 = j5;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        if ((i & 234881024) == 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 1024;
        if (i11 == 0) {
        }
        i14 = i3 & 2048;
        if (i14 == 0) {
        }
        i16 = i13;
        if ((i3 & 4096) == 0) {
        }
        if ((1533916891 & i4) == 306783378) {
        }
        startRestartGroup.startDefaults();
        final int i19222 = i16;
        if ((i & 1) != 0) {
        }
        if (i18 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if (i10 == 0) {
        }
        if (i12 == 0) {
        }
        shape2 = rectangleShape;
        j5 = j3;
        f3 = f2;
        if (i15 == 0) {
        }
        mutableInteractionSource3 = mutableInteractionSource2;
        j6 = j4;
        modifier3 = modifier2;
        r20 = z2;
        startRestartGroup.endDefaults();
        ProvidableCompositionLocal<Dp> localAbsoluteElevation222 = ElevationOverlayKt.getLocalAbsoluteElevation();
        final Modifier modifier5222 = modifier3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localAbsoluteElevation222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final float m4440constructorimpl222 = Dp.m4440constructorimpl(((Dp) consume2222).m4454unboximpl() + f3);
        ProvidedValue[] providedValueArr222 = new ProvidedValue[2];
        providedValueArr222[0] = ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(j5));
        providedValueArr222[r20] = ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4438boximpl(m4440constructorimpl222));
        composer2 = startRestartGroup;
        final long j9222 = j6;
        final int i20222 = i4;
        final BorderStroke borderStroke4222 = borderStroke2;
        final String str4222 = str2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr222, ComposableLambdaKt.composableLambda(composer2, 149594672, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$13
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

            public final void invoke(Composer composer3, int i21) {
                long m1527surfaceColorAtElevationcq6XJ1M;
                Modifier m1526surface8ww4TTg;
                ComposerKt.sourceInformation(composer3, "C598@29997L7,596@29868L221,591@29701L964:Surface.kt#jmzs0o");
                if ((i21 & 11) != 2 || !composer3.getSkipping()) {
                    Modifier minimumTouchTargetSize = TouchTargetKt.minimumTouchTargetSize(Modifier.this);
                    Shape shape4 = shape2;
                    long j10 = j9222;
                    ProvidableCompositionLocal<ElevationOverlay> localElevationOverlay = ElevationOverlayKt.getLocalElevationOverlay();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer3.consume(localElevationOverlay);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    m1527surfaceColorAtElevationcq6XJ1M = SurfaceKt.m1527surfaceColorAtElevationcq6XJ1M(j10, (ElevationOverlay) consume3, m4440constructorimpl222, composer3, (i20222 >> 9) & 14);
                    m1526surface8ww4TTg = SurfaceKt.m1526surface8ww4TTg(minimumTouchTargetSize, shape4, m1527surfaceColorAtElevationcq6XJ1M, borderStroke4222, f3);
                    Modifier then = m1526surface8ww4TTg.then(ClickableKt.m264clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource3, indication2, z3, str4222, role2, onClick));
                    Function2<Composer, Integer, Unit> function2 = content;
                    int i22 = i19222;
                    composer3.startReplaceableGroup(733328855);
                    ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                    MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer3, 48);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = composer3.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Density density = (Density) consume4;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume5 = composer3.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    LayoutDirection layoutDirection = (LayoutDirection) consume5;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume6 = composer3.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume6;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
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
                    composer3.startReplaceableGroup(-1300719946);
                    ComposerKt.sourceInformation(composer3, "C616@30646L9:Surface.kt#jmzs0o");
                    function2.invoke(composer3, Integer.valueOf((i22 >> 6) & 14));
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
        }), composer2, 56);
        j7 = j9222;
        role3 = role2;
        shape3 = shape2;
        str3 = str4222;
        modifier4 = modifier5222;
        z4 = z3;
        indication3 = indication2;
        mutableInteractionSource4 = mutableInteractionSource3;
        f4 = f3;
        borderStroke3 = borderStroke4222;
        j8 = j5;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surface-8ww4TTg, reason: not valid java name */
    public static final Modifier m1526surface8ww4TTg(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        Modifier m1784shadows4CzXII$default = ShadowKt.m1784shadows4CzXII$default(modifier, f, shape, false, 0L, 0L, 24, null);
        Modifier.Companion companion = Modifier.INSTANCE;
        if (borderStroke != null) {
            companion = BorderKt.border(companion, borderStroke, shape);
        }
        return ClipKt.clip(BackgroundKt.m232backgroundbw27NRU(m1784shadows4CzXII$default.then(companion), j, shape), shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surfaceColorAtElevation-cq6XJ1M, reason: not valid java name */
    public static final long m1527surfaceColorAtElevationcq6XJ1M(long j, ElevationOverlay elevationOverlay, float f, Composer composer, int i) {
        Composer composer2;
        long j2;
        composer.startReplaceableGroup(1561611256);
        ComposerKt.sourceInformation(composer, "C(surfaceColorAtElevation)P(1:c#ui.graphics.Color,2,0:c#ui.unit.Dp)637@31177L6,638@31248L31:Surface.kt#jmzs0o");
        if (!Color.m2113equalsimpl0(j, MaterialTheme.INSTANCE.getColors(composer, 6).m1328getSurface0d7_KjU()) || elevationOverlay == null) {
            composer2 = composer;
            j2 = j;
        } else {
            composer2 = composer;
            j2 = elevationOverlay.mo1358apply7g2Lkgo(j, f, composer2, (i & 14) | ((i >> 3) & 112) | ((i << 3) & 896));
        }
        composer2.endReplaceableGroup();
        return j2;
    }
}

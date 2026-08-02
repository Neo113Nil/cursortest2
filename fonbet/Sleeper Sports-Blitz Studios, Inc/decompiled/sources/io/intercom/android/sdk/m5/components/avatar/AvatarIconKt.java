package io.intercom.android.sdk.m5.components.avatar;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.media3.ui.DefaultTimeBar;
import coil.compose.AsyncImagePainter;
import coil.compose.SubcomposeAsyncImageKt;
import coil.compose.SubcomposeAsyncImageScope;
import com.henninghall.date_picker.props.TextColorProp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.objectweb.asm.Opcodes;
import org.socure.imgcodecs.Imgcodecs;

/* compiled from: AvatarIcon.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\u001aK\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001aK\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a)\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0019\u001a)\u0010\u001a\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0003¢\u0006\u0002\u0010\u001d\u001a)\u0010\u001e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0003¢\u0006\u0002\u0010\u001d\u001a\u001c\u0010\u001f\u001a\u00020\b*\u00020\b2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0017\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\"\u001a9\u0010#\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020%H\u0003¢\u0006\u0004\b)\u0010*\u001a\r\u0010+\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010,\u001a\r\u0010-\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010,\u001a\r\u0010.\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010,\u001a\r\u0010/\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010,\u001a\r\u00100\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010,\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u00061²\u0006\n\u00102\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u00103\u001a\u000204X\u008a\u008e\u0002²\u0006\n\u00105\u001a\u00020\fX\u008a\u008e\u0002"}, d2 = {"composeShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "Lio/intercom/android/sdk/m5/components/avatar/AvatarShape;", "getComposeShape", "(Lio/intercom/android/sdk/m5/components/avatar/AvatarShape;)Landroidx/compose/foundation/shape/RoundedCornerShape;", "AvatarIcon", "", "modifier", "Landroidx/compose/ui/Modifier;", "avatarWrapper", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "shape", "Landroidx/compose/ui/graphics/Shape;", "isActive", "", "placeHolderTextSize", "Landroidx/compose/ui/unit/TextUnit;", "customBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "AvatarIcon-Rd90Nhg", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;Landroidx/compose/ui/graphics/Shape;ZJLandroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)V", "DefaultAvatar", "DefaultAvatar-Rd90Nhg", "(Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;ZJLandroidx/compose/ui/graphics/Color;Landroidx/compose/runtime/Composer;II)V", "FinAvatar", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "FinAvatarPlaceholder", "alpha", "", "(Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V", "BotAvatarPlaceholder", "avatarBorder", "shouldDrawBorder", "AvatarActiveIndicator", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AvatarPlaceholder", "avatarInitials", "", TextColorProp.name, "textSize", "contentDescription", "AvatarPlaceholder-jxWH9Kg", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;JJLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "AvatarIconPreview", "(Landroidx/compose/runtime/Composer;I)V", "AvatarIconActivePreview", "AvatarIconSquirclePreview", "AvatarIconCutPreview", "BotAvatarPreview", "intercom-sdk-base_release", "backgroundColor", "indicatorSize", "Landroidx/compose/ui/unit/Dp;", "cutShape"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AvatarIconKt {

    /* compiled from: AvatarIcon.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarShape.values().length];
            try {
                iArr[AvatarShape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarShape.SQUIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarActiveIndicator$lambda$17(Modifier modifier, int i, int i2, Composer composer, int i3) {
        AvatarActiveIndicator(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarIconActivePreview$lambda$23(int i, Composer composer, int i2) {
        AvatarIconActivePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarIconCutPreview$lambda$25(int i, Composer composer, int i2) {
        AvatarIconCutPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarIconPreview$lambda$22(int i, Composer composer, int i2) {
        AvatarIconPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarIconSquirclePreview$lambda$24(int i, Composer composer, int i2) {
        AvatarIconSquirclePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarIcon_Rd90Nhg$lambda$0(Modifier modifier, AvatarWrapper avatarWrapper, Shape shape, boolean z, long j, Color color, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(avatarWrapper, "$avatarWrapper");
        m12134AvatarIconRd90Nhg(modifier, avatarWrapper, shape, z, j, color, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarPlaceholder_jxWH9Kg$lambda$21(Modifier modifier, String avatarInitials, long j, long j2, String contentDescription, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(avatarInitials, "$avatarInitials");
        Intrinsics.checkNotNullParameter(contentDescription, "$contentDescription");
        m12135AvatarPlaceholderjxWH9Kg(modifier, avatarInitials, j, j2, contentDescription, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotAvatarPlaceholder$lambda$14(AvatarWrapper avatarWrapper, Modifier modifier, float f, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(avatarWrapper, "$avatarWrapper");
        BotAvatarPlaceholder(avatarWrapper, modifier, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotAvatarPreview$lambda$26(int i, Composer composer, int i2) {
        BotAvatarPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultAvatar_Rd90Nhg$lambda$10(AvatarWrapper avatarWrapper, Modifier modifier, Shape shape, boolean z, long j, Color color, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(avatarWrapper, "$avatarWrapper");
        m12136DefaultAvatarRd90Nhg(avatarWrapper, modifier, shape, z, j, color, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinAvatar$lambda$11(Modifier modifier, AvatarWrapper avatarWrapper, Shape shape, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(avatarWrapper, "$avatarWrapper");
        FinAvatar(modifier, avatarWrapper, shape, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinAvatarPlaceholder$lambda$13(AvatarWrapper avatarWrapper, Modifier modifier, float f, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(avatarWrapper, "$avatarWrapper");
        FinAvatarPlaceholder(avatarWrapper, modifier, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final RoundedCornerShape getComposeShape(AvatarShape avatarShape) {
        Intrinsics.checkNotNullParameter(avatarShape, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[avatarShape.ordinal()];
        if (i == 1) {
            return RoundedCornerShapeKt.RoundedCornerShape(50);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return RoundedCornerShapeKt.RoundedCornerShape(16);
    }

    /* renamed from: AvatarIcon-Rd90Nhg, reason: not valid java name */
    public static final void m12134AvatarIconRd90Nhg(Modifier modifier, final AvatarWrapper avatarWrapper, Shape shape, boolean z, long j, Color color, Composer composer, int i, final int i2) {
        int i3;
        Shape shape2;
        int i4;
        final long j2;
        Intrinsics.checkNotNullParameter(avatarWrapper, "avatarWrapper");
        Composer startRestartGroup = composer.startRestartGroup(462320907);
        final Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if ((i2 & 4) != 0) {
            AvatarShape shape3 = avatarWrapper.getAvatar().getShape();
            Intrinsics.checkNotNullExpressionValue(shape3, "getShape(...)");
            i3 = i;
            shape2 = getComposeShape(shape3);
            i4 = i3 & (-897);
        } else {
            i3 = i;
            shape2 = shape;
            i4 = i3;
        }
        boolean z2 = (i2 & 8) != 0 ? false : z;
        if ((i2 & 16) != 0) {
            i4 &= -57345;
            j2 = IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5().m8263getFontSizeXSAIIZE();
        } else {
            j2 = j;
        }
        Color color2 = (i2 & 32) != 0 ? null : color;
        if (Intrinsics.areEqual(shape2, getComposeShape(AvatarShape.SQUIRCLE))) {
            startRestartGroup.startReplaceGroup(1816789334);
            FinAvatar(modifier2, avatarWrapper, shape2, startRestartGroup, (i4 & 896) | (i4 & 14) | 64, 0);
            startRestartGroup.endReplaceGroup();
        } else {
            startRestartGroup.startReplaceGroup(1816937855);
            long j3 = j2;
            Color color3 = color2;
            m12136DefaultAvatarRd90Nhg(avatarWrapper, modifier2, shape2, z2, j3, color3, startRestartGroup, ((i4 << 3) & 112) | 8 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (i4 & Opcodes.ASM7), 0);
            color2 = color3;
            j2 = j3;
            startRestartGroup.endReplaceGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Color color4 = color2;
            final int i5 = i3;
            final boolean z3 = z2;
            final Shape shape4 = shape2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AvatarIcon_Rd90Nhg$lambda$0;
                    AvatarIcon_Rd90Nhg$lambda$0 = AvatarIconKt.AvatarIcon_Rd90Nhg$lambda$0(Modifier.this, avatarWrapper, shape4, z3, j2, color4, i5, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return AvatarIcon_Rd90Nhg$lambda$0;
                }
            });
        }
    }

    /* renamed from: DefaultAvatar-Rd90Nhg, reason: not valid java name */
    private static final void m12136DefaultAvatarRd90Nhg(final AvatarWrapper avatarWrapper, Modifier modifier, Shape shape, boolean z, long j, Color color, Composer composer, int i, final int i2) {
        final int i3;
        Shape shape2;
        int i4;
        final long j2;
        Composer startRestartGroup = composer.startRestartGroup(386725315);
        final Modifier modifier2 = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        if ((i2 & 4) != 0) {
            i3 = i;
            i4 = i3 & (-897);
            shape2 = getComposeShape(AvatarShape.CIRCLE);
        } else {
            i3 = i;
            shape2 = shape;
            i4 = i3;
        }
        final boolean z2 = (i2 & 8) != 0 ? false : z;
        if ((i2 & 16) != 0) {
            j2 = IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5().m8263getFontSizeXSAIIZE();
            i4 &= -57345;
        } else {
            j2 = j;
        }
        final Color color2 = (i2 & 32) != 0 ? null : color;
        long m13089getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13089getAction0d7_KjU();
        startRestartGroup.startReplaceGroup(870365600);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m6029boximpl(color2 != null ? color2.m6049unboximpl() : ColorExtensionsKt.m13179darken8_81llA(m13089getAction0d7_KjU)), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        long m13180generateTextColor8_81llA = ColorExtensionsKt.m13180generateTextColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(mutableState));
        boolean m13186isDarkColor8_81llA = ColorExtensionsKt.m13186isDarkColor8_81llA(DefaultAvatar_Rd90Nhg$lambda$2(mutableState));
        startRestartGroup.startReplaceGroup(870372748);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m8796boximpl(Dp.m8798constructorimpl(8)), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(870374477);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(shape2, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceGroup();
        BoxWithConstraintsKt.BoxWithConstraints(modifier2, null, false, ComposableLambdaKt.rememberComposableLambda(-1891463123, true, new AvatarIconKt$DefaultAvatar$1(z2, shape2, m13186isDarkColor8_81llA, mutableState2, (MutableState) rememberedValue3, mutableState, avatarWrapper, m13089getAction0d7_KjU, color2, m13180generateTextColor8_81llA, j2), startRestartGroup, 54), startRestartGroup, ((i4 >> 3) & 14) | 3072, 6);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Shape shape3 = shape2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DefaultAvatar_Rd90Nhg$lambda$10;
                    DefaultAvatar_Rd90Nhg$lambda$10 = AvatarIconKt.DefaultAvatar_Rd90Nhg$lambda$10(AvatarWrapper.this, modifier2, shape3, z2, j2, color2, i3, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return DefaultAvatar_Rd90Nhg$lambda$10;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long DefaultAvatar_Rd90Nhg$lambda$2(MutableState<Color> mutableState) {
        return mutableState.getValue().m6049unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultAvatar_Rd90Nhg$lambda$3(MutableState<Color> mutableState, long j) {
        mutableState.setValue(Color.m6029boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DefaultAvatar_Rd90Nhg$lambda$5(MutableState<Dp> mutableState) {
        return mutableState.getValue().m8812unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultAvatar_Rd90Nhg$lambda$6(MutableState<Dp> mutableState, float f) {
        mutableState.setValue(Dp.m8796boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shape DefaultAvatar_Rd90Nhg$lambda$8(MutableState<Shape> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultAvatar_Rd90Nhg$Placeholder(AvatarWrapper avatarWrapper, long j, long j2, Modifier modifier, Composer composer, int i, int i2) {
        composer.startReplaceGroup(1593692287);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Modifier modifier2 = modifier;
        if (avatarWrapper.isBot()) {
            composer.startReplaceGroup(-730785003);
            BotAvatarPlaceholder(avatarWrapper, PaddingKt.m1157padding3ABfNKs(modifier2, Dp.m8798constructorimpl(8)), 0.0f, composer, 8, 4);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-730619029);
            m12135AvatarPlaceholderjxWH9Kg(modifier2, avatarWrapper.getInitials(), j, j2, avatarWrapper.getLabel(), composer, i & 14, 0);
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
    }

    private static final void FinAvatar(Modifier modifier, final AvatarWrapper avatarWrapper, Shape shape, Composer composer, final int i, final int i2) {
        Shape shape2;
        Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(-1375245291);
        Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        RoundedCornerShape composeShape = (i2 & 4) != 0 ? getComposeShape(AvatarShape.SQUIRCLE) : shape;
        final Modifier then = companion.then(ClipKt.clip(Modifier.INSTANCE, composeShape));
        String imageUrl = avatarWrapper.getImageUrl(startRestartGroup, 8);
        if (!StringsKt.isBlank(imageUrl)) {
            startRestartGroup.startReplaceGroup(-446445875);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            shape2 = composeShape;
            SubcomposeAsyncImageKt.m10115SubcomposeAsyncImageTCQMD7g(imageUrl, avatarWrapper.getAvatar().getLabel(), IntercomImageLoaderKt.getImageLoader((Context) consume), then, null, ComposableLambdaKt.rememberComposableLambda(-1294140715, true, new Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Loading, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$FinAvatar$1
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(SubcomposeAsyncImageScope subcomposeAsyncImageScope, AsyncImagePainter.State.Loading loading, Composer composer2, Integer num) {
                    invoke(subcomposeAsyncImageScope, loading, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(SubcomposeAsyncImageScope SubcomposeAsyncImage, AsyncImagePainter.State.Loading it, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i3 & Imgcodecs.IMWRITE_JPEGXL_EFFORT) != 128 || !composer2.getSkipping()) {
                        AvatarIconKt.FinAvatarPlaceholder(AvatarWrapper.this, then, 0.0f, composer2, 8, 4);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-818047861, true, new Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Error, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$FinAvatar$2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(SubcomposeAsyncImageScope subcomposeAsyncImageScope, AsyncImagePainter.State.Error error, Composer composer2, Integer num) {
                    invoke(subcomposeAsyncImageScope, error, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(SubcomposeAsyncImageScope SubcomposeAsyncImage, AsyncImagePainter.State.Error it, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i3 & Imgcodecs.IMWRITE_JPEGXL_EFFORT) != 128 || !composer2.getSkipping()) {
                        AvatarIconKt.FinAvatarPlaceholder(AvatarWrapper.this, then, 0.0f, composer2, 8, 4);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, startRestartGroup, 54), null, null, null, null, null, 0.0f, null, 0, false, null, startRestartGroup, 12780032, 0, 261968);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endReplaceGroup();
            modifier2 = companion;
        } else {
            shape2 = composeShape;
            startRestartGroup.startReplaceGroup(-445746825);
            modifier2 = companion;
            FinAvatarPlaceholder(avatarWrapper, then, 0.0f, startRestartGroup, 8, 4);
            startRestartGroup.endReplaceGroup();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            final Shape shape3 = shape2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FinAvatar$lambda$11;
                    FinAvatar$lambda$11 = AvatarIconKt.FinAvatar$lambda$11(Modifier.this, avatarWrapper, shape3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return FinAvatar$lambda$11;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FinAvatarPlaceholder(final AvatarWrapper avatarWrapper, Modifier modifier, float f, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-427803587);
        if ((i2 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        final Modifier modifier2 = modifier;
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        final float f2 = f;
        Modifier m582backgroundbw27NRU$default = BackgroundKt.m582backgroundbw27NRU$default(modifier2, ColorExtensionsKt.m13179darken8_81llA(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13089getAction0d7_KjU()), null, 2, null);
        Alignment center = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m582backgroundbw27NRU$default);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
        Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        BotAvatarPlaceholder(avatarWrapper, PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(4)), f2, startRestartGroup, (i & 896) | 56, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FinAvatarPlaceholder$lambda$13;
                    FinAvatarPlaceholder$lambda$13 = AvatarIconKt.FinAvatarPlaceholder$lambda$13(AvatarWrapper.this, modifier2, f2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return FinAvatarPlaceholder$lambda$13;
                }
            });
        }
    }

    private static final void BotAvatarPlaceholder(final AvatarWrapper avatarWrapper, Modifier modifier, float f, Composer composer, final int i, final int i2) {
        Composer startRestartGroup = composer.startRestartGroup(1859249921);
        if ((i2 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        final Modifier modifier2 = modifier;
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        final float f2 = f;
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.intercom_default_avatar_icon, startRestartGroup, 0), avatarWrapper.getAvatar().getLabel(), modifier2, (Alignment) null, (ContentScale) null, f2, (ColorFilter) null, startRestartGroup, ((i << 3) & 896) | 8 | ((i << 9) & Opcodes.ASM7), 88);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BotAvatarPlaceholder$lambda$14;
                    BotAvatarPlaceholder$lambda$14 = AvatarIconKt.BotAvatarPlaceholder$lambda$14(AvatarWrapper.this, modifier2, f2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BotAvatarPlaceholder$lambda$14;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AvatarActiveIndicator(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1051352444);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            final long m13091getActive0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13091getActive0d7_KjU();
            Modifier m1209size3ABfNKs = SizeKt.m1209size3ABfNKs(modifier, Dp.m8798constructorimpl(8));
            startRestartGroup.startReplaceGroup(821186808);
            boolean changed = startRestartGroup.changed(m13091getActive0d7_KjU);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit AvatarActiveIndicator$lambda$16$lambda$15;
                        AvatarActiveIndicator$lambda$16$lambda$15 = AvatarIconKt.AvatarActiveIndicator$lambda$16$lambda$15(m13091getActive0d7_KjU, (DrawScope) obj);
                        return AvatarActiveIndicator$lambda$16$lambda$15;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(m1209size3ABfNKs, (Function1) rememberedValue, startRestartGroup, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AvatarActiveIndicator$lambda$17;
                    AvatarActiveIndicator$lambda$17 = AvatarIconKt.AvatarActiveIndicator$lambda$17(Modifier.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return AvatarActiveIndicator$lambda$17;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarActiveIndicator$lambda$16$lambda$15(long j, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m6599drawCircleVaOC9Bg$default(Canvas, j, 0.0f, 0L, 0.0f, null, null, 0, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0067  */
    /* renamed from: AvatarPlaceholder-jxWH9Kg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m12135AvatarPlaceholderjxWH9Kg(Modifier modifier, final String str, final long j, final long j2, final String str2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        int hashCode;
        Composer m5333constructorimpl;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-99590848);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(j) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                }
                if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                    Modifier.Companion companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (!StringsKt.isBlank(str)) {
                        startRestartGroup.startReplaceGroup(-2026561893);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        startRestartGroup.startReplaceGroup(-758107778);
                        boolean z = (i3 & 57344) == 16384;
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit AvatarPlaceholder_jxWH9Kg$lambda$20$lambda$19$lambda$18;
                                    AvatarPlaceholder_jxWH9Kg$lambda$20$lambda$19$lambda$18 = AvatarIconKt.AvatarPlaceholder_jxWH9Kg$lambda$20$lambda$19$lambda$18(str2, (SemanticsPropertyReceiver) obj);
                                    return AvatarPlaceholder_jxWH9Kg$lambda$20$lambda$19$lambda$18;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        TextKt.m3901TextNvy7gAk(str, SemanticsModifierKt.semantics$default(companion2, false, (Function1) rememberedValue, 1, null), j, null, j2, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5(), startRestartGroup, ((i3 >> 3) & 14) | (i3 & 896) | ((i3 << 3) & 57344), 0, 131048);
                        startRestartGroup = startRestartGroup;
                        startRestartGroup.endReplaceGroup();
                        modifier3 = companion;
                    } else {
                        startRestartGroup.startReplaceGroup(-2026212151);
                        modifier3 = companion;
                        IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_avatar_person, startRestartGroup, 0), str2, PaddingKt.m1157padding3ABfNKs(modifier3, Dp.m8798constructorimpl(8)), j, startRestartGroup, 8 | ((i3 >> 9) & 112) | ((i3 << 3) & 7168), 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    modifier4 = modifier3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit AvatarPlaceholder_jxWH9Kg$lambda$21;
                            AvatarPlaceholder_jxWH9Kg$lambda$21 = AvatarIconKt.AvatarPlaceholder_jxWH9Kg$lambda$21(Modifier.this, str, j, j2, str2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return AvatarPlaceholder_jxWH9Kg$lambda$21;
                        }
                    });
                    return;
                }
                return;
            }
            if ((i2 & 16) != 0) {
            }
            if ((46811 & i3) == 9362) {
            }
            if (i4 != 0) {
            }
            Alignment center2 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
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
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            if (!StringsKt.isBlank(str)) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            modifier4 = modifier3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((46811 & i3) == 9362) {
        }
        if (i4 != 0) {
        }
        Alignment center22 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
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
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        if (!StringsKt.isBlank(str)) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        modifier4 = modifier3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvatarPlaceholder_jxWH9Kg$lambda$20$lambda$19$lambda$18(String contentDescription, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(contentDescription, "$contentDescription");
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, contentDescription);
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    private static final void AvatarIconPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1461886463);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m12137getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AvatarIconPreview$lambda$22;
                    AvatarIconPreview$lambda$22 = AvatarIconKt.AvatarIconPreview$lambda$22(i, (Composer) obj, ((Integer) obj2).intValue());
                    return AvatarIconPreview$lambda$22;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void AvatarIconActivePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-382759013);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m12138getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AvatarIconActivePreview$lambda$23;
                    AvatarIconActivePreview$lambda$23 = AvatarIconKt.AvatarIconActivePreview$lambda$23(i, (Composer) obj, ((Integer) obj2).intValue());
                    return AvatarIconActivePreview$lambda$23;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void AvatarIconSquirclePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1626854011);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m12139getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AvatarIconSquirclePreview$lambda$24;
                    AvatarIconSquirclePreview$lambda$24 = AvatarIconKt.AvatarIconSquirclePreview$lambda$24(i, (Composer) obj, ((Integer) obj2).intValue());
                    return AvatarIconSquirclePreview$lambda$24;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void AvatarIconCutPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1591864993);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m12140getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AvatarIconCutPreview$lambda$25;
                    AvatarIconCutPreview$lambda$25 = AvatarIconKt.AvatarIconCutPreview$lambda$25(i, (Composer) obj, ((Integer) obj2).intValue());
                    return AvatarIconCutPreview$lambda$25;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void BotAvatarPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1158049743);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AvatarIconKt.INSTANCE.m12141getLambda5$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.avatar.AvatarIconKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BotAvatarPreview$lambda$26;
                    BotAvatarPreview$lambda$26 = AvatarIconKt.BotAvatarPreview$lambda$26(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BotAvatarPreview$lambda$26;
                }
            });
        }
    }

    public static final Modifier avatarBorder(Modifier modifier, boolean z, Shape shape) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return z ? BorderKt.m596borderziNgDLE(modifier, Dp.m8798constructorimpl((float) 0.5d), Brush.Companion.m5987horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6029boximpl(ColorKt.Color(DefaultTimeBar.DEFAULT_UNPLAYED_COLOR)), Color.m6029boximpl(ColorKt.Color(DefaultTimeBar.DEFAULT_UNPLAYED_COLOR))}), 0.0f, 0.0f, 0, 14, (Object) null), shape) : modifier;
    }
}

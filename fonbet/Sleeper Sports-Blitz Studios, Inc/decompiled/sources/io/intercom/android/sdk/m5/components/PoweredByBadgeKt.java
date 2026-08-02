package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PoweredByBadge.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0017\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u001a\"\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014\"\u0010\u0010\u0015\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014\"\u0010\u0010\u0016\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014¨\u0006\u001c"}, d2 = {"PoweredByBadge", "", "text", "", "icon", "Lio/intercom/android/sdk/models/PoweredBy$PoweredByIconType;", ViewProps.ON_CLICK, "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "PoweredByBadge-wBJOh4Y", "(Ljava/lang/String;Lio/intercom/android/sdk/models/PoweredBy$PoweredByIconType;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "getTextStyle", "Landroidx/compose/ui/text/TextStyle;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "VerticalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "HorizontalPadding", "IconSize", "getPoweredByBadgeHeight", "(Landroidx/compose/runtime/Composer;I)F", "PoweredByBadgePreview", "(Landroidx/compose/runtime/Composer;I)V", "TransparentPoweredByBadgePreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PoweredByBadgeKt {
    private static final float HorizontalPadding;
    private static final float IconSize;
    private static final float VerticalPadding = Dp.m8798constructorimpl(6);

    /* compiled from: PoweredByBadge.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PoweredBy.PoweredByIconType.values().length];
            try {
                iArr[PoweredBy.PoweredByIconType.INTERCOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PoweredBy.PoweredByIconType.FIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PoweredByBadgePreview$lambda$2(int i, Composer composer, int i2) {
        PoweredByBadgePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PoweredByBadge_wBJOh4Y$lambda$0(String text, PoweredBy.PoweredByIconType icon, Function0 onClick, Modifier modifier, long j, long j2, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(icon, "$icon");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        m12121PoweredByBadgewBJOh4Y(text, icon, onClick, modifier, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransparentPoweredByBadgePreview$lambda$3(int i, Composer composer, int i2) {
        TransparentPoweredByBadgePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x009e  */
    /* renamed from: PoweredByBadge-wBJOh4Y, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12121PoweredByBadgewBJOh4Y(final String text, final PoweredBy.PoweredByIconType icon, final Function0<Unit> onClick, Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        long j5;
        Modifier modifier3;
        long j6;
        long m13180generateTextColor8_81llA;
        int i4;
        int i5;
        final long j7;
        final Modifier modifier4;
        final long j8;
        ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(546776392);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(icon) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((57344 & i) != 0) {
                if ((i2 & 16) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i7 = 16384;
                        i3 |= i7;
                    }
                } else {
                    j3 = j;
                }
                i7 = 8192;
                i3 |= i7;
            } else {
                j3 = j;
            }
            if ((458752 & i) != 0) {
                if ((i2 & 32) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i6 = 131072;
                        i3 |= i6;
                    }
                } else {
                    j4 = j2;
                }
                i6 = 65536;
                i3 |= i6;
            } else {
                j4 = j2;
            }
            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        j5 = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13114getPoweredByBackgroundColor0d7_KjU();
                        i3 &= -57345;
                    } else {
                        j5 = j3;
                    }
                    if ((i2 & 32) == 0) {
                        if (Color.m6040equalsimpl0(j5, Color.INSTANCE.m6074getTransparent0d7_KjU())) {
                            m13180generateTextColor8_81llA = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13101getDescriptionText0d7_KjU();
                        } else {
                            m13180generateTextColor8_81llA = ColorExtensionsKt.m13180generateTextColor8_81llA(j5);
                        }
                        i3 &= -458753;
                        modifier3 = companion;
                        j6 = j5;
                        j4 = m13180generateTextColor8_81llA;
                    } else {
                        modifier3 = companion;
                        j6 = j5;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    modifier3 = modifier2;
                    j6 = j3;
                }
                startRestartGroup.endDefaults();
                i4 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
                if (i4 != 1) {
                    i5 = R.drawable.intercom_logo;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = R.drawable.intercom_fin_ai_agent;
                }
                int i9 = i3;
                Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                final int i10 = i5;
                final long j9 = j4;
                CardColors m2729cardColorsro_MJ88 = CardDefaults.INSTANCE.m2729cardColorsro_MJ88(j6, 0L, 0L, 0L, startRestartGroup, ((i9 >> 12) & 14) | (CardDefaults.$stable << 12), 14);
                startRestartGroup = startRestartGroup;
                CardKt.Card(onClick, minimumInteractiveComponentSize, false, IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall(), m2729cardColorsro_MJ88, null, null, null, ComposableLambdaKt.rememberComposableLambda(803643315, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.PoweredByBadgeKt$PoweredByBadge$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                        invoke(columnScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Card, Composer composer2, int i11) {
                        float f;
                        float f2;
                        float f3;
                        TextStyle textStyle;
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i11 & 81) != 16 || !composer2.getSkipping()) {
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            f = PoweredByBadgeKt.HorizontalPadding;
                            f2 = PoweredByBadgeKt.VerticalPadding;
                            Modifier m1158paddingVpY3zN4 = PaddingKt.m1158paddingVpY3zN4(companion2, f, f2);
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            int i12 = i10;
                            long j10 = j9;
                            String str = text;
                            ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1158paddingVpY3zN4);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer m5333constructorimpl = Updater.m5333constructorimpl(composer2);
                            Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                            }
                            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            f3 = PoweredByBadgeKt.IconSize;
                            IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(i12, composer2, 0), (String) null, SizeKt.m1209size3ABfNKs(companion3, f3), j10, composer2, 440, 0);
                            SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), composer2, 6);
                            textStyle = PoweredByBadgeKt.getTextStyle(composer2, 0);
                            TextKt.m3901TextNvy7gAk(str, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer2, 0, 0, 131066);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i9 >> 6) & 14) | 100663296, 228);
                j7 = j6;
                modifier4 = modifier3;
                j8 = j9;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                j7 = j3;
                j8 = j4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.PoweredByBadgeKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit PoweredByBadge_wBJOh4Y$lambda$0;
                        PoweredByBadge_wBJOh4Y$lambda$0 = PoweredByBadgeKt.PoweredByBadge_wBJOh4Y$lambda$0(text, icon, onClick, modifier4, j7, j8, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return PoweredByBadge_wBJOh4Y$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((57344 & i) != 0) {
        }
        if ((458752 & i) != 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        startRestartGroup.endDefaults();
        i4 = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
        if (i4 != 1) {
        }
        int i92 = i3;
        Modifier minimumInteractiveComponentSize2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
        final int i102 = i5;
        final long j92 = j4;
        CardColors m2729cardColorsro_MJ882 = CardDefaults.INSTANCE.m2729cardColorsro_MJ88(j6, 0L, 0L, 0L, startRestartGroup, ((i92 >> 12) & 14) | (CardDefaults.$stable << 12), 14);
        startRestartGroup = startRestartGroup;
        CardKt.Card(onClick, minimumInteractiveComponentSize2, false, IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall(), m2729cardColorsro_MJ882, null, null, null, ComposableLambdaKt.rememberComposableLambda(803643315, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.PoweredByBadgeKt$PoweredByBadge$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope Card, Composer composer2, int i11) {
                float f;
                float f2;
                float f3;
                TextStyle textStyle;
                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                if ((i11 & 81) != 16 || !composer2.getSkipping()) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    f = PoweredByBadgeKt.HorizontalPadding;
                    f2 = PoweredByBadgeKt.VerticalPadding;
                    Modifier m1158paddingVpY3zN4 = PaddingKt.m1158paddingVpY3zN4(companion2, f, f2);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    int i12 = i102;
                    long j10 = j92;
                    String str = text;
                    ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1158paddingVpY3zN4);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m5333constructorimpl = Updater.m5333constructorimpl(composer2);
                    Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                    }
                    Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    f3 = PoweredByBadgeKt.IconSize;
                    IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(i12, composer2, 0), (String) null, SizeKt.m1209size3ABfNKs(companion3, f3), j10, composer2, 440, 0);
                    SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), composer2, 6);
                    textStyle = PoweredByBadgeKt.getTextStyle(composer2, 0);
                    TextKt.m3901TextNvy7gAk(str, null, j10, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer2, 0, 0, 131066);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, ((i92 >> 6) & 14) | 100663296, 228);
        j7 = j6;
        modifier4 = modifier3;
        j8 = j92;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle getTextStyle(Composer composer, int i) {
        composer.startReplaceGroup(634566382);
        TextStyle type05 = IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType05();
        composer.endReplaceGroup();
        return type05;
    }

    public static final float getPoweredByBadgeHeight(Composer composer, int i) {
        composer.startReplaceGroup(-1418088879);
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float f = ((Density) consume).mo739toDpGaN1DYA(getTextStyle(composer, 0).m8263getFontSizeXSAIIZE());
        float f2 = VerticalPadding;
        float m8798constructorimpl = Dp.m8798constructorimpl(Dp.m8798constructorimpl(Dp.m8798constructorimpl(Math.max(f, IconSize)) + f2) + f2);
        composer.endReplaceGroup();
        return m8798constructorimpl;
    }

    @IntercomPreviews
    public static final void PoweredByBadgePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(233774014);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PoweredByBadgeKt.INSTANCE.m12080getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.PoweredByBadgeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PoweredByBadgePreview$lambda$2;
                    PoweredByBadgePreview$lambda$2 = PoweredByBadgeKt.PoweredByBadgePreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PoweredByBadgePreview$lambda$2;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TransparentPoweredByBadgePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1988629996);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PoweredByBadgeKt.INSTANCE.m12082getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.PoweredByBadgeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TransparentPoweredByBadgePreview$lambda$3;
                    TransparentPoweredByBadgePreview$lambda$3 = PoweredByBadgeKt.TransparentPoweredByBadgePreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TransparentPoweredByBadgePreview$lambda$3;
                }
            });
        }
    }

    static {
        float f = 16;
        HorizontalPadding = Dp.m8798constructorimpl(f);
        IconSize = Dp.m8798constructorimpl(f);
    }
}

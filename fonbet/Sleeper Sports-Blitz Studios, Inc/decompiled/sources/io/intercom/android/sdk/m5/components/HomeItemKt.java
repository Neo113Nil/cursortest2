package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.m5.home.states.HomeItemBadge;
import io.intercom.android.sdk.m5.shapes.CutIconWithIndicatorShape;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.objectweb.asm.Opcodes;

/* compiled from: HomeItem.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0080\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0017"}, d2 = {"HomeItem", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "", "avatarIcon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "iconModifier", "text", "textString", "", "subtitle", MetricTracker.Object.BADGE, "Lio/intercom/android/sdk/m5/home/states/HomeItemBadge;", ViewProps.ON_CLICK, "(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/m5/home/states/HomeItemBadge;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "HomeSendMessagePreview", "(Landroidx/compose/runtime/Composer;I)V", "HomeMessagesPreview", "HomeTicketsPreview", "HomeTicketsRTLPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HomeItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeItem$lambda$10(Modifier modifier, Integer num, Function2 function2, Modifier modifier2, Integer num2, String str, String str2, HomeItemBadge homeItemBadge, Function0 function0, int i, int i2, Composer composer, int i3) {
        HomeItem(modifier, num, function2, modifier2, num2, str, str2, homeItemBadge, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeMessagesPreview$lambda$12(int i, Composer composer, int i2) {
        HomeMessagesPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeSendMessagePreview$lambda$11(int i, Composer composer, int i2) {
        HomeSendMessagePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeTicketsPreview$lambda$13(int i, Composer composer, int i2) {
        HomeTicketsPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeTicketsRTLPreview$lambda$14(int i, Composer composer, int i2) {
        HomeTicketsRTLPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0466  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeItem(Modifier modifier, Integer num, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier2, Integer num2, String str, String str2, HomeItemBadge homeItemBadge, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier modifier3;
        int i3;
        Integer num3;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i5;
        Modifier modifier4;
        int i6;
        Integer num4;
        int i7;
        int i8;
        String str3;
        int i9;
        int i10;
        int i11;
        final Function0<Unit> function02;
        boolean z;
        Object rememberedValue;
        int hashCode;
        Integer num5;
        Composer m5333constructorimpl;
        int hashCode2;
        String str4;
        Composer m5333constructorimpl2;
        String str5;
        HomeItemBadge homeItemBadge2;
        Composer composer2;
        String str6;
        final Modifier modifier5;
        final Integer num6;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Modifier modifier6;
        final Integer num7;
        final String str7;
        final Function0<Unit> function03;
        final String str8;
        final HomeItemBadge homeItemBadge3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-360748364);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
            modifier3 = modifier;
        } else if ((i & 14) == 0) {
            modifier3 = modifier;
            i3 = (startRestartGroup.changed(modifier3) ? 4 : 2) | i;
        } else {
            modifier3 = modifier;
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            num3 = num;
            i3 |= startRestartGroup.changed(num3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function22 = function2;
                i3 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    modifier4 = modifier2;
                    i3 |= startRestartGroup.changed(modifier4) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        num4 = num2;
                        i3 |= startRestartGroup.changed(num4) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & Opcodes.ASM7) == 0) {
                            i3 |= startRestartGroup.changed(str) ? 131072 : 65536;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                            str3 = str2;
                        } else {
                            str3 = str2;
                            if ((i & 3670016) == 0) {
                                i3 |= startRestartGroup.changed(str3) ? 1048576 : 524288;
                            }
                        }
                        i9 = i2 & 128;
                        if (i9 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            i10 = i9;
                            i3 |= startRestartGroup.changed(homeItemBadge) ? 8388608 : 4194304;
                            i11 = i2 & 256;
                            if (i11 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 234881024) == 0) {
                                i3 |= startRestartGroup.changedInstance(function0) ? 67108864 : 33554432;
                            }
                            if ((i3 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                                Modifier.Companion companion = i12 == 0 ? Modifier.INSTANCE : modifier3;
                                if (i13 != 0) {
                                    num3 = null;
                                }
                                if (i4 != 0) {
                                    function22 = ComposableSingletons$HomeItemKt.INSTANCE.m12065getLambda1$intercom_sdk_base_release();
                                }
                                Modifier m1209size3ABfNKs = i5 == 0 ? SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)) : modifier4;
                                Integer num8 = i6 == 0 ? null : num4;
                                String str9 = i7 == 0 ? null : str;
                                if (i8 != 0) {
                                    str3 = null;
                                }
                                HomeItemBadge.None none = i10 == 0 ? HomeItemBadge.None.INSTANCE : homeItemBadge;
                                function02 = i11 == 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.components.HomeItemKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit unit;
                                        unit = Unit.INSTANCE;
                                        return unit;
                                    }
                                } : function0;
                                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                startRestartGroup.startReplaceGroup(-244013531);
                                z = (i3 & 234881024) != 67108864;
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.components.HomeItemKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit HomeItem$lambda$2$lambda$1;
                                            HomeItem$lambda$2$lambda$1 = HomeItemKt.HomeItem$lambda$2$lambda$1(Function0.this);
                                            return HomeItem$lambda$2$lambda$1;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceGroup();
                                Modifier m1158paddingVpY3zN4 = PaddingKt.m1158paddingVpY3zN4(ClickableKt.m623clickableoSLSa3U$default(fillMaxWidth$default, false, null, null, null, (Function0) rememberedValue, 15, null), Dp.m8798constructorimpl(16), Dp.m8798constructorimpl(12));
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Modifier modifier7 = companion;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                int i14 = i3;
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1158paddingVpY3zN4);
                                num5 = num8;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function0<Unit> function04 = function02;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                                Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                                    m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                                    m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                                }
                                Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 2.0f, false, 2, null);
                                Arrangement.HorizontalOrVertical m1016spacedBy0680j_4 = Arrangement.INSTANCE.m1016spacedBy0680j_4(Dp.m8798constructorimpl(4));
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1016spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                str4 = str3;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor2);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
                                Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                                    m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                                    m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                                }
                                Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                startRestartGroup.startReplaceGroup(-1379228937);
                                if (num5 == null) {
                                    str5 = StringResources_androidKt.stringResource(num5.intValue(), startRestartGroup, (i14 >> 12) & 14);
                                } else {
                                    str5 = str9 == null ? "" : str9;
                                }
                                startRestartGroup.endReplaceGroup();
                                TextStyle type04SemiBold = IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04SemiBold();
                                homeItemBadge2 = none;
                                TextKt.m3901TextNvy7gAk(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8706getEllipsisgIe3tQ8(), false, 2, 0, null, type04SemiBold, startRestartGroup, 0, 24960, 110590);
                                composer2 = startRestartGroup;
                                composer2.startReplaceGroup(-1379221164);
                                if (str4 == null) {
                                    TextKt.m3901TextNvy7gAk(str4, null, ColorKt.Color(4285887861L), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04(), composer2, ((i14 >> 18) & 14) | 384, 0, 131066);
                                    str6 = str4;
                                    composer2 = composer2;
                                } else {
                                    str6 = str4;
                                }
                                composer2.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if (!Intrinsics.areEqual(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                                    composer2.startReplaceGroup(941879891);
                                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                    Arrangement.HorizontalOrVertical m1016spacedBy0680j_42 = Arrangement.INSTANCE.m1016spacedBy0680j_4(Dp.m8798constructorimpl(8));
                                    ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1016spacedBy0680j_42, centerVertically2, composer2, 54);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion2);
                                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor3);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer m5333constructorimpl3 = Updater.m5333constructorimpl(composer2);
                                    Updater.m5340setimpl(m5333constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                                        m5333constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                                        m5333constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
                                    }
                                    Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                    function22.invoke(composer2, Integer.valueOf((i14 >> 6) & 14));
                                    composer2.startReplaceGroup(-1379205196);
                                    if (num3 != null) {
                                        num3.intValue();
                                        IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(num3.intValue(), composer2, (i14 >> 3) & 14), (String) null, TestTagKt.testTag(m1209size3ABfNKs, num3.toString()), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13090getActionContrastWhite0d7_KjU(), composer2, 56, 0);
                                        Unit unit = Unit.INSTANCE;
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                    composer2.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endReplaceGroup();
                                    Unit unit3 = Unit.INSTANCE;
                                } else if (Intrinsics.areEqual(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                    composer2.startReplaceGroup(942534549);
                                    if (num3 != null) {
                                        num3.intValue();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                        int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion3);
                                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor4);
                                        } else {
                                            composer2.useNode();
                                        }
                                        Composer m5333constructorimpl4 = Updater.m5333constructorimpl(composer2);
                                        Updater.m5340setimpl(m5333constructorimpl4, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m5340setimpl(m5333constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m5333constructorimpl4.getInserting() || !Intrinsics.areEqual(m5333constructorimpl4.rememberedValue(), Integer.valueOf(hashCode4))) {
                                            m5333constructorimpl4.updateRememberedValue(Integer.valueOf(hashCode4));
                                            m5333constructorimpl4.apply(Integer.valueOf(hashCode4), setCompositeKeyHash4);
                                        }
                                        Updater.m5340setimpl(m5333constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(num3.intValue(), composer2, (i14 >> 3) & 14), (String) null, TestTagKt.testTag(ClipKt.clip(m1209size3ABfNKs, new CutIconWithIndicatorShape(0.0f, 1, null)), num3.toString()), IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13090getActionContrastWhite0d7_KjU(), composer2, 56, 0);
                                        BoxKt.Box(boxScopeInstance.align(SizeKt.m1209size3ABfNKs(BackgroundKt.m581backgroundbw27NRU(Modifier.INSTANCE, ColorKt.Color(4292544041L), RoundedCornerShapeKt.getCircleShape()), Dp.m8798constructorimpl(7)), Alignment.INSTANCE.getTopEnd()), composer2, 0);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        composer2.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        Unit unit4 = Unit.INSTANCE;
                                        Unit unit5 = Unit.INSTANCE;
                                    }
                                    composer2.endReplaceGroup();
                                } else {
                                    if (!(homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount)) {
                                        composer2.startReplaceGroup(861667097);
                                        composer2.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer2.startReplaceGroup(943331838);
                                    Composer composer3 = composer2;
                                    TextKt.m3901TextNvy7gAk(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), rowScopeInstance.align(DrawModifierKt.drawBehind(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m8798constructorimpl(6), 0.0f, 11, null), new Function1() { // from class: io.intercom.android.sdk.m5.components.HomeItemKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit HomeItem$lambda$9$lambda$8;
                                            HomeItem$lambda$9$lambda$8 = HomeItemKt.HomeItem$lambda$9$lambda$8((DrawScope) obj);
                                            return HomeItem$lambda$9$lambda$8;
                                        }
                                    }), Alignment.INSTANCE.getCenterVertically()), Color.INSTANCE.m6076getWhite0d7_KjU(), null, TextUnitKt.getSp(11), null, FontWeight.INSTANCE.getW800(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 1597824, 0, 262056);
                                    composer2 = composer3;
                                    composer2.endReplaceGroup();
                                    Unit unit6 = Unit.INSTANCE;
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                modifier5 = m1209size3ABfNKs;
                                num6 = num3;
                                function23 = function22;
                                modifier6 = modifier7;
                                num7 = num5;
                                str7 = str6;
                                function03 = function04;
                                str8 = str9;
                                homeItemBadge3 = homeItemBadge2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                homeItemBadge3 = homeItemBadge;
                                composer2 = startRestartGroup;
                                modifier6 = modifier3;
                                num6 = num3;
                                function23 = function22;
                                modifier5 = modifier4;
                                num7 = num4;
                                function03 = function0;
                                str7 = str3;
                                str8 = str;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.HomeItemKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit HomeItem$lambda$10;
                                        HomeItem$lambda$10 = HomeItemKt.HomeItem$lambda$10(Modifier.this, num6, function23, modifier5, num7, str8, str7, homeItemBadge3, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return HomeItem$lambda$10;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i10 = i9;
                        i11 = i2 & 256;
                        if (i11 == 0) {
                        }
                        if ((i3 & 191739611) == 38347922) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        startRestartGroup.startReplaceGroup(-244013531);
                        if ((i3 & 234881024) != 67108864) {
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z) {
                        }
                        rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.components.HomeItemKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit HomeItem$lambda$2$lambda$1;
                                HomeItem$lambda$2$lambda$1 = HomeItemKt.HomeItem$lambda$2$lambda$1(Function0.this);
                                return HomeItem$lambda$2$lambda$1;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceGroup();
                        Modifier m1158paddingVpY3zN42 = PaddingKt.m1158paddingVpY3zN4(ClickableKt.m623clickableoSLSa3U$default(fillMaxWidth$default2, false, null, null, null, (Function0) rememberedValue, 15, null), Dp.m8798constructorimpl(16), Dp.m8798constructorimpl(12));
                        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                        Modifier modifier72 = companion;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        int i142 = i3;
                        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, m1158paddingVpY3zN42);
                        num5 = num8;
                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        Function0<Unit> function042 = function02;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                        Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m5333constructorimpl.getInserting()) {
                        }
                        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash5);
                        Updater.m5340setimpl(m5333constructorimpl, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                        Modifier weight$default2 = RowScope.weight$default(rowScopeInstance3, Modifier.INSTANCE, 2.0f, false, 2, null);
                        Arrangement.HorizontalOrVertical m1016spacedBy0680j_43 = Arrangement.INSTANCE.m1016spacedBy0680j_4(Dp.m8798constructorimpl(4));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m1016spacedBy0680j_43, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2);
                        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                        str4 = str3;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
                        Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m5333constructorimpl2.getInserting()) {
                        }
                        m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                        m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash22);
                        Updater.m5340setimpl(m5333constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(-1379228937);
                        if (num5 == null) {
                        }
                        startRestartGroup.endReplaceGroup();
                        TextStyle type04SemiBold2 = IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04SemiBold();
                        homeItemBadge2 = none;
                        TextKt.m3901TextNvy7gAk(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8706getEllipsisgIe3tQ8(), false, 2, 0, null, type04SemiBold2, startRestartGroup, 0, 24960, 110590);
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(-1379221164);
                        if (str4 == null) {
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (!Intrinsics.areEqual(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        modifier5 = m1209size3ABfNKs;
                        num6 = num3;
                        function23 = function22;
                        modifier6 = modifier72;
                        num7 = num5;
                        str7 = str6;
                        function03 = function042;
                        str8 = str9;
                        homeItemBadge3 = homeItemBadge2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    num4 = num2;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i2 & 256;
                    if (i11 == 0) {
                    }
                    if ((i3 & 191739611) == 38347922) {
                    }
                    if (i12 == 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(-244013531);
                    if ((i3 & 234881024) != 67108864) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z) {
                    }
                    rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.components.HomeItemKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit HomeItem$lambda$2$lambda$1;
                            HomeItem$lambda$2$lambda$1 = HomeItemKt.HomeItem$lambda$2$lambda$1(Function0.this);
                            return HomeItem$lambda$2$lambda$1;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    Modifier m1158paddingVpY3zN422 = PaddingKt.m1158paddingVpY3zN4(ClickableKt.m623clickableoSLSa3U$default(fillMaxWidth$default22, false, null, null, null, (Function0) rememberedValue, 15, null), Dp.m8798constructorimpl(16), Dp.m8798constructorimpl(12));
                    Alignment.Vertical centerVertically32 = Alignment.INSTANCE.getCenterVertically();
                    Modifier modifier722 = companion;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy32 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically32, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    int i1422 = i3;
                    CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(startRestartGroup, m1158paddingVpY3zN422);
                    num5 = num8;
                    Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
                    Function0<Unit> function0422 = function02;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                    Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m5333constructorimpl.getInserting()) {
                    }
                    m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash52);
                    Updater.m5340setimpl(m5333constructorimpl, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
                    Modifier weight$default22 = RowScope.weight$default(rowScopeInstance32, Modifier.INSTANCE, 2.0f, false, 2, null);
                    Arrangement.HorizontalOrVertical m1016spacedBy0680j_432 = Arrangement.INSTANCE.m1016spacedBy0680j_4(Dp.m8798constructorimpl(4));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(m1016spacedBy0680j_432, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default22);
                    Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                    str4 = str3;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
                    Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m5333constructorimpl2.getInserting()) {
                    }
                    m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                    m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash222);
                    Updater.m5340setimpl(m5333constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-1379228937);
                    if (num5 == null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    TextStyle type04SemiBold22 = IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04SemiBold();
                    homeItemBadge2 = none;
                    TextKt.m3901TextNvy7gAk(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8706getEllipsisgIe3tQ8(), false, 2, 0, null, type04SemiBold22, startRestartGroup, 0, 24960, 110590);
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(-1379221164);
                    if (str4 == null) {
                    }
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (!Intrinsics.areEqual(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    modifier5 = m1209size3ABfNKs;
                    num6 = num3;
                    function23 = function22;
                    modifier6 = modifier722;
                    num7 = num5;
                    str7 = str6;
                    function03 = function0422;
                    str8 = str9;
                    homeItemBadge3 = homeItemBadge2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                modifier4 = modifier2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                num4 = num2;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i2 & 256;
                if (i11 == 0) {
                }
                if ((i3 & 191739611) == 38347922) {
                }
                if (i12 == 0) {
                }
                if (i13 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 != 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(-244013531);
                if ((i3 & 234881024) != 67108864) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.components.HomeItemKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit HomeItem$lambda$2$lambda$1;
                        HomeItem$lambda$2$lambda$1 = HomeItemKt.HomeItem$lambda$2$lambda$1(Function0.this);
                        return HomeItem$lambda$2$lambda$1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier m1158paddingVpY3zN4222 = PaddingKt.m1158paddingVpY3zN4(ClickableKt.m623clickableoSLSa3U$default(fillMaxWidth$default222, false, null, null, null, (Function0) rememberedValue, 15, null), Dp.m8798constructorimpl(16), Dp.m8798constructorimpl(12));
                Alignment.Vertical centerVertically322 = Alignment.INSTANCE.getCenterVertically();
                Modifier modifier7222 = companion;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy322 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically322, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                int i14222 = i3;
                CompositionLocalMap currentCompositionLocalMap522 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(startRestartGroup, m1158paddingVpY3zN4222);
                num5 = num8;
                Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
                Function0<Unit> function04222 = function02;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m5333constructorimpl.getInserting()) {
                }
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash522);
                Updater.m5340setimpl(m5333constructorimpl, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance322 = RowScopeInstance.INSTANCE;
                Modifier weight$default222 = RowScope.weight$default(rowScopeInstance322, Modifier.INSTANCE, 2.0f, false, 2, null);
                Arrangement.HorizontalOrVertical m1016spacedBy0680j_4322 = Arrangement.INSTANCE.m1016spacedBy0680j_4(Dp.m8798constructorimpl(4));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(m1016spacedBy0680j_4322, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default222);
                Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                str4 = str3;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m5333constructorimpl2.getInserting()) {
                }
                m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2222);
                Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-1379228937);
                if (num5 == null) {
                }
                startRestartGroup.endReplaceGroup();
                TextStyle type04SemiBold222 = IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04SemiBold();
                homeItemBadge2 = none;
                TextKt.m3901TextNvy7gAk(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8706getEllipsisgIe3tQ8(), false, 2, 0, null, type04SemiBold222, startRestartGroup, 0, 24960, 110590);
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-1379221164);
                if (str4 == null) {
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (!Intrinsics.areEqual(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                modifier5 = m1209size3ABfNKs;
                num6 = num3;
                function23 = function22;
                modifier6 = modifier7222;
                num7 = num5;
                str7 = str6;
                function03 = function04222;
                str8 = str9;
                homeItemBadge3 = homeItemBadge2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function22 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            modifier4 = modifier2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            num4 = num2;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i2 & 256;
            if (i11 == 0) {
            }
            if ((i3 & 191739611) == 38347922) {
            }
            if (i12 == 0) {
            }
            if (i13 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 != 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            Modifier fillMaxWidth$default2222 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-244013531);
            if ((i3 & 234881024) != 67108864) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.components.HomeItemKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit HomeItem$lambda$2$lambda$1;
                    HomeItem$lambda$2$lambda$1 = HomeItemKt.HomeItem$lambda$2$lambda$1(Function0.this);
                    return HomeItem$lambda$2$lambda$1;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier m1158paddingVpY3zN42222 = PaddingKt.m1158paddingVpY3zN4(ClickableKt.m623clickableoSLSa3U$default(fillMaxWidth$default2222, false, null, null, null, (Function0) rememberedValue, 15, null), Dp.m8798constructorimpl(16), Dp.m8798constructorimpl(12));
            Alignment.Vertical centerVertically3222 = Alignment.INSTANCE.getCenterVertically();
            Modifier modifier72222 = companion;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy3222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3222, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            int i142222 = i3;
            CompositionLocalMap currentCompositionLocalMap5222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier5222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1158paddingVpY3zN42222);
            num5 = num8;
            Function0<ComposeUiNode> constructor5222 = ComposeUiNode.INSTANCE.getConstructor();
            Function0<Unit> function042222 = function02;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap5222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m5333constructorimpl.getInserting()) {
            }
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash5222);
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier5222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3222 = RowScopeInstance.INSTANCE;
            Modifier weight$default2222 = RowScope.weight$default(rowScopeInstance3222, Modifier.INSTANCE, 2.0f, false, 2, null);
            Arrangement.HorizontalOrVertical m1016spacedBy0680j_43222 = Arrangement.INSTANCE.m1016spacedBy0680j_4(Dp.m8798constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(m1016spacedBy0680j_43222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2222);
            Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
            str4 = str3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m5333constructorimpl2.getInserting()) {
            }
            m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
            m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash22222);
            Updater.m5340setimpl(m5333constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1379228937);
            if (num5 == null) {
            }
            startRestartGroup.endReplaceGroup();
            TextStyle type04SemiBold2222 = IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04SemiBold();
            homeItemBadge2 = none;
            TextKt.m3901TextNvy7gAk(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8706getEllipsisgIe3tQ8(), false, 2, 0, null, type04SemiBold2222, startRestartGroup, 0, 24960, 110590);
            composer2 = startRestartGroup;
            composer2.startReplaceGroup(-1379221164);
            if (str4 == null) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (!Intrinsics.areEqual(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            modifier5 = m1209size3ABfNKs;
            num6 = num3;
            function23 = function22;
            modifier6 = modifier72222;
            num7 = num5;
            str7 = str6;
            function03 = function042222;
            str8 = str9;
            homeItemBadge3 = homeItemBadge2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        num3 = num;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function22 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        modifier4 = modifier2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        num4 = num2;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i2 & 256;
        if (i11 == 0) {
        }
        if ((i3 & 191739611) == 38347922) {
        }
        if (i12 == 0) {
        }
        if (i13 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 != 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        Modifier fillMaxWidth$default22222 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-244013531);
        if ((i3 & 234881024) != 67108864) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.components.HomeItemKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit HomeItem$lambda$2$lambda$1;
                HomeItem$lambda$2$lambda$1 = HomeItemKt.HomeItem$lambda$2$lambda$1(Function0.this);
                return HomeItem$lambda$2$lambda$1;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier m1158paddingVpY3zN422222 = PaddingKt.m1158paddingVpY3zN4(ClickableKt.m623clickableoSLSa3U$default(fillMaxWidth$default22222, false, null, null, null, (Function0) rememberedValue, 15, null), Dp.m8798constructorimpl(16), Dp.m8798constructorimpl(12));
        Alignment.Vertical centerVertically32222 = Alignment.INSTANCE.getCenterVertically();
        Modifier modifier722222 = companion;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy32222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically32222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        int i1422222 = i3;
        CompositionLocalMap currentCompositionLocalMap52222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier52222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1158paddingVpY3zN422222);
        num5 = num8;
        Function0<ComposeUiNode> constructor52222 = ComposeUiNode.INSTANCE.getConstructor();
        Function0<Unit> function0422222 = function02;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap52222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl.getInserting()) {
        }
        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash52222);
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier52222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance32222 = RowScopeInstance.INSTANCE;
        Modifier weight$default22222 = RowScope.weight$default(rowScopeInstance32222, Modifier.INSTANCE, 2.0f, false, 2, null);
        Arrangement.HorizontalOrVertical m1016spacedBy0680j_432222 = Arrangement.INSTANCE.m1016spacedBy0680j_4(Dp.m8798constructorimpl(4));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(m1016spacedBy0680j_432222, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default22222);
        Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
        str4 = str3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl2.getInserting()) {
        }
        m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
        m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash222222);
        Updater.m5340setimpl(m5333constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1379228937);
        if (num5 == null) {
        }
        startRestartGroup.endReplaceGroup();
        TextStyle type04SemiBold22222 = IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04SemiBold();
        homeItemBadge2 = none;
        TextKt.m3901TextNvy7gAk(str5, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8706getEllipsisgIe3tQ8(), false, 2, 0, null, type04SemiBold22222, startRestartGroup, 0, 24960, 110590);
        composer2 = startRestartGroup;
        composer2.startReplaceGroup(-1379221164);
        if (str4 == null) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (!Intrinsics.areEqual(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        modifier5 = m1209size3ABfNKs;
        num6 = num3;
        function23 = function22;
        modifier6 = modifier722222;
        num7 = num5;
        str7 = str6;
        function03 = function0422222;
        str8 = str9;
        homeItemBadge3 = homeItemBadge2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeItem$lambda$2$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeItem$lambda$9$lambda$8(DrawScope drawBehind) {
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        DrawScope.m6599drawCircleVaOC9Bg$default(drawBehind, ColorKt.Color(4292544041L), 22.0f, 0L, 0.0f, null, null, 0, 124, null);
        return Unit.INSTANCE;
    }

    private static final void HomeSendMessagePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(861055120);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeItemKt.INSTANCE.m12067getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.HomeItemKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeSendMessagePreview$lambda$11;
                    HomeSendMessagePreview$lambda$11 = HomeItemKt.HomeSendMessagePreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeSendMessagePreview$lambda$11;
                }
            });
        }
    }

    private static final void HomeMessagesPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1318695433);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeItemKt.INSTANCE.m12069getLambda5$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.HomeItemKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeMessagesPreview$lambda$12;
                    HomeMessagesPreview$lambda$12 = HomeItemKt.HomeMessagesPreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeMessagesPreview$lambda$12;
                }
            });
        }
    }

    private static final void HomeTicketsPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-279860840);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeItemKt.INSTANCE.m12071getLambda7$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.HomeItemKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeTicketsPreview$lambda$13;
                    HomeTicketsPreview$lambda$13 = HomeItemKt.HomeTicketsPreview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeTicketsPreview$lambda$13;
                }
            });
        }
    }

    private static final void HomeTicketsRTLPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1844314002);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeItemKt.INSTANCE.m12073getLambda9$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.HomeItemKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeTicketsRTLPreview$lambda$14;
                    HomeTicketsRTLPreview$lambda$14 = HomeItemKt.HomeTicketsRTLPreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeTicketsRTLPreview$lambda$14;
                }
            });
        }
    }
}

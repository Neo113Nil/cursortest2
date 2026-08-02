package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.m5.components.IntercomChevronKt;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArticleRowComponent.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a5\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\r"}, d2 = {"ArticleRowComponent", "", "modifier", "Landroidx/compose/ui/Modifier;", "articleRow", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsRow$ArticleRow;", ViewProps.ON_CLICK, "Lkotlin/Function1;", "", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsRow$ArticleRow;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ArticleRowComponentPreview", "(Landroidx/compose/runtime/Composer;I)V", "ArticleRowComponentLongTextPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ArticleRowComponentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleRowComponent$lambda$4(Modifier modifier, CollectionDetailsRow.ArticleRow articleRow, Function1 function1, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(articleRow, "$articleRow");
        ArticleRowComponent(modifier, articleRow, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleRowComponentLongTextPreview$lambda$6(int i, Composer composer, int i2) {
        ArticleRowComponentLongTextPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleRowComponentPreview$lambda$5(int i, Composer composer, int i2) {
        ArticleRowComponentPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleRowComponent$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ArticleRowComponent(Modifier modifier, final CollectionDetailsRow.ArticleRow articleRow, Function1<? super String, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function1<? super String, Unit> function12;
        final Function1<? super String, Unit> function13;
        boolean z;
        Object rememberedValue;
        int hashCode;
        Composer m5333constructorimpl;
        Composer composer2;
        final Function1<? super String, Unit> function14;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(articleRow, "articleRow");
        Composer startRestartGroup = composer.startRestartGroup(1326302174);
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
            i3 |= startRestartGroup.changed(articleRow) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                function13 = i5 == 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit ArticleRowComponent$lambda$0;
                        ArticleRowComponent$lambda$0 = ArticleRowComponentKt.ArticleRowComponent$lambda$0((String) obj);
                        return ArticleRowComponent$lambda$0;
                    }
                } : function12;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(1587298991);
                z = ((i3 & 112) != 32) | ((i3 & 896) != 256);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ArticleRowComponent$lambda$2$lambda$1;
                            ArticleRowComponent$lambda$2$lambda$1 = ArticleRowComponentKt.ArticleRowComponent$lambda$2$lambda$1(Function1.this, articleRow);
                            return ArticleRowComponent$lambda$2$lambda$1;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                Modifier m1159paddingVpY3zN4$default = PaddingKt.m1159paddingVpY3zN4$default(PaddingKt.m1161paddingqDBjuR0$default(ClickableKt.m623clickableoSLSa3U$default(fillMaxWidth$default, false, null, null, null, (Function0) rememberedValue, 15, null), Dp.m8798constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m8798constructorimpl(12), 1, null);
                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1159paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                Function1<? super String, Unit> function15 = function13;
                TextKt.m3901TextNvy7gAk(articleRow.getTitle(), RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5(), startRestartGroup, 0, 0, 131064);
                composer2 = startRestartGroup;
                IntercomChevronKt.IntercomChevron(PaddingKt.m1159paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8798constructorimpl(22), 0.0f, 2, null), composer2, 6, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                function14 = function15;
                modifier3 = companion;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                function14 = function12;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ArticleRowComponent$lambda$4;
                        ArticleRowComponent$lambda$4 = ArticleRowComponentKt.ArticleRowComponent$lambda$4(Modifier.this, articleRow, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ArticleRowComponent$lambda$4;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if ((i3 & 731) == 146) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(1587298991);
        if ((i3 & 896) != 256) {
        }
        z = ((i3 & 112) != 32) | ((i3 & 896) != 256);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit ArticleRowComponent$lambda$2$lambda$1;
                ArticleRowComponent$lambda$2$lambda$1 = ArticleRowComponentKt.ArticleRowComponent$lambda$2$lambda$1(Function1.this, articleRow);
                return ArticleRowComponent$lambda$2$lambda$1;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier m1159paddingVpY3zN4$default2 = PaddingKt.m1159paddingVpY3zN4$default(PaddingKt.m1161paddingqDBjuR0$default(ClickableKt.m623clickableoSLSa3U$default(fillMaxWidth$default2, false, null, null, null, (Function0) rememberedValue, 15, null), Dp.m8798constructorimpl(16), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m8798constructorimpl(12), 1, null);
        Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1159paddingVpY3zN4$default2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl.getInserting()) {
        }
        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2);
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        Function1<? super String, Unit> function152 = function13;
        TextKt.m3901TextNvy7gAk(articleRow.getTitle(), RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04Point5(), startRestartGroup, 0, 0, 131064);
        composer2 = startRestartGroup;
        IntercomChevronKt.IntercomChevron(PaddingKt.m1159paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8798constructorimpl(22), 0.0f, 2, null), composer2, 6, 0);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        function14 = function152;
        modifier3 = companion;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleRowComponent$lambda$2$lambda$1(Function1 function1, CollectionDetailsRow.ArticleRow articleRow) {
        Intrinsics.checkNotNullParameter(articleRow, "$articleRow");
        function1.invoke(articleRow.getId());
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    private static final void ArticleRowComponentPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(761606012);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleRowComponentKt.INSTANCE.m12445getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ArticleRowComponentPreview$lambda$5;
                    ArticleRowComponentPreview$lambda$5 = ArticleRowComponentKt.ArticleRowComponentPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ArticleRowComponentPreview$lambda$5;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void ArticleRowComponentLongTextPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(2014154163);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ArticleRowComponentKt.INSTANCE.m12446getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ArticleRowComponentLongTextPreview$lambda$6;
                    ArticleRowComponentLongTextPreview$lambda$6 = ArticleRowComponentKt.ArticleRowComponentLongTextPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ArticleRowComponentLongTextPreview$lambda$6;
                }
            });
        }
    }
}

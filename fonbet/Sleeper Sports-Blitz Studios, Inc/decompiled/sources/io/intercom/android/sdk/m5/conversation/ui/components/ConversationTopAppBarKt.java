package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.TicketProgressRowState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.tickets.TicketProgressBannerKt;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.objectweb.asm.Opcodes;

/* compiled from: ConversationTopAppBar.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001as\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"ConversationTopAppBar", "", "topAppBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "onBackClick", "Lkotlin/Function0;", "onTitleClicked", "navigateToTicketDetail", "onMenuClicked", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;", "trackMetric", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "(Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConversationTopAppBarKt {

    /* compiled from: ConversationTopAppBar.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationTopAppBar$lambda$6(TopAppBarUiState topAppBarUiState, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(topAppBarUiState, "$topAppBarUiState");
        ConversationTopAppBar(topAppBarUiState, function0, function02, function03, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationTopAppBar$lambda$2(HeaderMenuItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationTopAppBar$lambda$3(MetricData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void ConversationTopAppBar(final TopAppBarUiState topAppBarUiState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super HeaderMenuItem, Unit> function1, Function1<? super MetricData, Unit> function12, Composer composer, final int i, final int i2) {
        boolean z;
        long m13106getHeader0d7_KjU;
        long m13113getOnHeader0d7_KjU;
        long m13101getDescriptionText0d7_KjU;
        Function0<Unit> function04;
        Intrinsics.checkNotNullParameter(topAppBarUiState, "topAppBarUiState");
        Composer startRestartGroup = composer.startRestartGroup(1613129219);
        Function0<Unit> function05 = (i2 & 2) != 0 ? null : function0;
        Function0<Unit> function06 = (i2 & 4) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ConversationTopAppBarKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function02;
        Function0<Unit> function07 = (i2 & 8) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ConversationTopAppBarKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function03;
        Function1<? super HeaderMenuItem, Unit> function13 = (i2 & 16) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ConversationTopAppBarKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ConversationTopAppBar$lambda$2;
                ConversationTopAppBar$lambda$2 = ConversationTopAppBarKt.ConversationTopAppBar$lambda$2((HeaderMenuItem) obj);
                return ConversationTopAppBar$lambda$2;
            }
        } : function1;
        Function1<? super MetricData, Unit> function14 = (i2 & 32) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ConversationTopAppBarKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ConversationTopAppBar$lambda$3;
                ConversationTopAppBar$lambda$3 = ConversationTopAppBarKt.ConversationTopAppBar$lambda$3((MetricData) obj);
                return ConversationTopAppBar$lambda$3;
            }
        } : function12;
        boolean isSystemInDarkTheme = DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0);
        int i3 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        if (i3 == 1) {
            z = true;
        } else if (i3 == 2) {
            z = false;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z = isSystemInDarkTheme;
        }
        startRestartGroup.startReplaceGroup(-287873620);
        if (!z || topAppBarUiState.m12151getBackgroundColorDarkQN2ZGVo() == null) {
            Color m12150getBackgroundColorQN2ZGVo = topAppBarUiState.m12150getBackgroundColorQN2ZGVo();
            m13106getHeader0d7_KjU = m12150getBackgroundColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13106getHeader0d7_KjU() : m12150getBackgroundColorQN2ZGVo.m6049unboximpl();
        } else {
            m13106getHeader0d7_KjU = topAppBarUiState.m12151getBackgroundColorDarkQN2ZGVo().m6049unboximpl();
        }
        startRestartGroup.endReplaceGroup();
        State<Color> m445animateColorAsStateeuL9pac = SingleValueAnimationKt.m445animateColorAsStateeuL9pac(m13106getHeader0d7_KjU, null, "bgColorState", null, startRestartGroup, 384, 10);
        startRestartGroup.startReplaceGroup(-287862139);
        if (!z || topAppBarUiState.m12153getContentColorDarkQN2ZGVo() == null) {
            Color m12152getContentColorQN2ZGVo = topAppBarUiState.m12152getContentColorQN2ZGVo();
            m13113getOnHeader0d7_KjU = m12152getContentColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13113getOnHeader0d7_KjU() : m12152getContentColorQN2ZGVo.m6049unboximpl();
        } else {
            m13113getOnHeader0d7_KjU = topAppBarUiState.m12153getContentColorDarkQN2ZGVo().m6049unboximpl();
        }
        startRestartGroup.endReplaceGroup();
        State<Color> m445animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m445animateColorAsStateeuL9pac(m13113getOnHeader0d7_KjU, null, "contentColorState", null, startRestartGroup, 384, 10);
        startRestartGroup.startReplaceGroup(-287850801);
        if (!z || topAppBarUiState.m12155getSubTitleColorDarkQN2ZGVo() == null) {
            Color m12154getSubTitleColorQN2ZGVo = topAppBarUiState.m12154getSubTitleColorQN2ZGVo();
            m13101getDescriptionText0d7_KjU = m12154getSubTitleColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13101getDescriptionText0d7_KjU() : m12154getSubTitleColorQN2ZGVo.m6049unboximpl();
        } else {
            m13101getDescriptionText0d7_KjU = topAppBarUiState.m12155getSubTitleColorDarkQN2ZGVo().m6049unboximpl();
        }
        startRestartGroup.endReplaceGroup();
        State<Color> m445animateColorAsStateeuL9pac3 = SingleValueAnimationKt.m445animateColorAsStateeuL9pac(m13101getDescriptionText0d7_KjU, null, "subTitleColorState", null, startRestartGroup, 384, 10);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
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
        Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        String text = topAppBarUiState.getTitle().getText(startRestartGroup, StringProvider.$stable);
        StringProvider subTitle = topAppBarUiState.getSubTitle();
        startRestartGroup.startReplaceGroup(603575221);
        String text2 = subTitle != null ? subTitle.getText(startRestartGroup, StringProvider.$stable) : null;
        startRestartGroup.endReplaceGroup();
        final Function1<? super MetricData, Unit> function15 = function14;
        final Function0<Unit> function08 = function05;
        final Function1<? super HeaderMenuItem, Unit> function16 = function13;
        TopActionBarKt.m12131TopActionBarNpQZenA(null, text, text2, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), function08, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), m445animateColorAsStateeuL9pac.getValue().m6049unboximpl(), m445animateColorAsStateeuL9pac2.getValue().m6049unboximpl(), m445animateColorAsStateeuL9pac3.getValue().m6049unboximpl(), function06, ComposableLambdaKt.rememberComposableLambda(-69139937, true, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, function13, m445animateColorAsStateeuL9pac2, function14), startRestartGroup, 54), startRestartGroup, ((i << 12) & Opcodes.ASM7) | 32768, ((i >> 3) & 112) | 384, 1);
        Composer composer2 = startRestartGroup;
        TicketProgressRowState ticketStatusState = topAppBarUiState.getTicketStatusState();
        composer2.startReplaceGroup(603606749);
        if (ticketStatusState == null) {
            function04 = function07;
        } else {
            function04 = function07;
            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), function04, true, null, composer2, ((i >> 6) & 112) | 384, 8);
            composer2 = composer2;
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Function0<Unit> function09 = function04;
            final Function0<Unit> function010 = function06;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ConversationTopAppBarKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ConversationTopAppBar$lambda$6;
                    ConversationTopAppBar$lambda$6 = ConversationTopAppBarKt.ConversationTopAppBar$lambda$6(TopAppBarUiState.this, function08, function010, function09, function16, function15, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ConversationTopAppBar$lambda$6;
                }
            });
        }
    }
}

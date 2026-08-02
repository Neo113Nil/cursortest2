package io.intercom.android.sdk.m5.components;

import android.content.Context;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.SurfaceKt;
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
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.GroupConversationTextFormatter;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationItem.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002\u001a\b\u0010\u0010\u001a\u00020\u0011H\u0002\u001a\b\u0010\u0012\u001a\u00020\u0011H\u0002\u001a\u0017\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0016\u001a\u001e\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\tH\u0002\u001a\u0014\u0010\u001e\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002¨\u0006\u001f"}, d2 = {"ConversationItem", "", "conversation", "Lio/intercom/android/sdk/models/Conversation;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "showUnreadIndicator", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "(Lio/intercom/android/sdk/models/Conversation;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "getActiveAdminsAvatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "getWorkspaceName", "", "getUserIntercomId", "UnreadIndicator", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ReadConversationWithSimpleTicketHeaderPreview", "(Landroidx/compose/runtime/Composer;I)V", "UnreadConversationWithSimpleTicketHeaderPreview", "UnreadConversationCardPreview", "UnreadConversationCardWithBotPreview", "sampleConversation", "ticket", "Lio/intercom/android/sdk/models/Ticket;", "isRead", "sampleConversationWithBot", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConversationItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationItem$lambda$2(Conversation conversation, Modifier modifier, PaddingValues paddingValues, boolean z, Function0 onClick, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(conversation, "$conversation");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        ConversationItem(conversation, modifier, paddingValues, z, onClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReadConversationWithSimpleTicketHeaderPreview$lambda$7(int i, Composer composer, int i2) {
        ReadConversationWithSimpleTicketHeaderPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnreadConversationCardPreview$lambda$9(int i, Composer composer, int i2) {
        UnreadConversationCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnreadConversationCardWithBotPreview$lambda$10(int i, Composer composer, int i2) {
        UnreadConversationCardWithBotPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnreadConversationWithSimpleTicketHeaderPreview$lambda$8(int i, Composer composer, int i2) {
        UnreadConversationWithSimpleTicketHeaderPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnreadIndicator$lambda$6(Modifier modifier, int i, int i2, Composer composer, int i3) {
        UnreadIndicator(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ConversationItem(final Conversation conversation, Modifier modifier, PaddingValues paddingValues, boolean z, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1756864283);
        Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        final PaddingValues m1150PaddingValues0680j_4 = (i2 & 4) != 0 ? PaddingKt.m1150PaddingValues0680j_4(Dp.m8798constructorimpl(0)) : paddingValues;
        boolean z2 = (i2 & 8) != 0 ? !conversation.isRead() : z;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context = (Context) consume;
        startRestartGroup.startReplaceGroup(-437498000);
        boolean z3 = (((57344 & i) ^ 24576) > 16384 && startRestartGroup.changed(onClick)) || (i & 24576) == 16384;
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit ConversationItem$lambda$1$lambda$0;
                    ConversationItem$lambda$1$lambda$0 = ConversationItemKt.ConversationItem$lambda$1$lambda$0(Function0.this);
                    return ConversationItem$lambda$1$lambda$0;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceGroup();
        final boolean z4 = z2;
        final Modifier modifier2 = companion;
        SurfaceKt.m3729SurfaceT9BRK9s(ClickableKt.m623clickableoSLSa3U$default(modifier2, false, null, null, null, (Function0) rememberedValue, 15, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1413097514, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt$ConversationItem$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                List listOf;
                String str;
                Context context2;
                String str2;
                String str3;
                Conversation conversation2;
                boolean z5;
                Context context3;
                String obj;
                String userIntercomId;
                Composer composer3 = composer2;
                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                    Modifier padding = PaddingKt.padding(Modifier.INSTANCE, PaddingValues.this);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Conversation conversation3 = conversation;
                    boolean z6 = z4;
                    Context context4 = context;
                    ComposerKt.sourceInformationMarkerStart(composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, padding);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer m5333constructorimpl = Updater.m5333constructorimpl(composer3);
                    Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                    }
                    Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (LastParticipatingAdmin.isNull(conversation3.lastParticipatingAdmin())) {
                        listOf = ConversationItemKt.getActiveAdminsAvatars();
                    } else {
                        Avatar avatar = conversation3.lastParticipatingAdmin().getAvatar();
                        Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
                        listOf = CollectionsKt.listOf(new AvatarWrapper(avatar, conversation3.lastParticipatingAdmin().isBot()));
                    }
                    AvatarTriangleGroupKt.m12025AvatarTriangleGroupjt2gSs(listOf, rowScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically()), null, Dp.m8798constructorimpl(32), composer3, 3080, 4);
                    SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(12)), composer3, 6);
                    Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 2.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, weight$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer m5333constructorimpl2 = Updater.m5333constructorimpl(composer3);
                    Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                        m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                        m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                    }
                    Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer3.startReplaceGroup(-1283476508);
                    if (conversation3.getTicket() != null) {
                        TicketHeaderKt.TicketHeader(null, new TicketStatusHeaderArgs(conversation3.getTicket().getTitle(), conversation3.isRead() ? FontWeight.INSTANCE.getNormal() : FontWeight.INSTANCE.getSemiBold()), composer3, 0, 1);
                    }
                    composer3.endReplaceGroup();
                    String summary = conversation3.lastPart().getSummary();
                    if (summary.length() == 0) {
                        summary = conversation3.getTicket() != null ? conversation3.getTicket().getCurrentStatus().getStatusDetail() : "";
                    }
                    String str4 = summary;
                    composer3.startReplaceGroup(-1283454258);
                    Intrinsics.checkNotNull(str4);
                    if (str4.length() > 0) {
                        composer3.startReplaceGroup(-1283451787);
                        Participant participant = conversation3.lastPart().getParticipant();
                        userIntercomId = ConversationItemKt.getUserIntercomId();
                        if (participant.isUserWithId(userIntercomId)) {
                            StringBuilder sb = new StringBuilder();
                            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume2 = composer3.consume(localContext2);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            sb.append(((Context) consume2).getString(R.string.intercom_you));
                            sb.append(": ");
                            sb.append(str4);
                            str4 = sb.toString();
                        }
                        composer3.endReplaceGroup();
                        Intrinsics.checkNotNull(str4);
                        conversation2 = conversation3;
                        context2 = context4;
                        str2 = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
                        str3 = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
                        str = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                        z5 = z6;
                        TextKt.m3901TextNvy7gAk(str4, PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m8798constructorimpl(4), 7, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8706getEllipsisgIe3tQ8(), false, 1, 0, null, TextStyle.m8245copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04(), 0L, 0L, conversation3.isRead() ? FontWeight.INSTANCE.getNormal() : FontWeight.INSTANCE.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 48, 24960, 110588);
                        composer3 = composer2;
                    } else {
                        str = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                        context2 = context4;
                        str2 = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
                        str3 = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
                        conversation2 = conversation3;
                        z5 = z6;
                    }
                    composer3.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerStart(composer3, 844473419, str2);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer3, 0);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, str3);
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, companion2);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -553112988, str);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer m5333constructorimpl3 = Updater.m5333constructorimpl(composer3);
                    Updater.m5340setimpl(m5333constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                        m5333constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                        m5333constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
                    }
                    Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                    Intrinsics.checkNotNullExpressionValue(firstName, "getFirstName(...)");
                    if (firstName.length() == 0) {
                        obj = ConversationItemKt.getWorkspaceName();
                        context3 = context2;
                    } else {
                        String firstName2 = conversation2.lastParticipatingAdmin().getFirstName();
                        Intrinsics.checkNotNullExpressionValue(firstName2, "getFirstName(...)");
                        context3 = context2;
                        obj = GroupConversationTextFormatter.groupConversationSubtitle(firstName2, conversation2.groupConversationParticipants().size(), context3).toString();
                    }
                    String str5 = obj;
                    String formattedDateFromLong = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context3);
                    if (formattedDateFromLong.length() == 0) {
                        formattedDateFromLong = conversation2.getTicket() != null ? TimeFormatterExtKt.formattedDateFromLong(conversation2.getTicket().getCurrentStatus().getCreatedDate(), context3) : "";
                    }
                    Composer composer4 = composer3;
                    TextWithSeparatorKt.m12128TextWithSeparatorwV1YYcM(str5, formattedDateFromLong, null, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04(), IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m13101getDescriptionText0d7_KjU(), 0, 0, null, composer4, 0, 460);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer4.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer4.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    if (z5) {
                        composer4.startReplaceGroup(-1055527017);
                        ConversationItemKt.UnreadIndicator(null, composer4, 0, 1);
                        composer4.endReplaceGroup();
                    } else {
                        composer4.startReplaceGroup(-1055471186);
                        IntercomChevronKt.IntercomChevron(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m8798constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), composer4, 6, 0);
                        composer4.endReplaceGroup();
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer4.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, 12582912, 126);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ConversationItem$lambda$2;
                    ConversationItem$lambda$2 = ConversationItemKt.ConversationItem$lambda$2(Conversation.this, modifier2, m1150PaddingValues0680j_4, z4, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ConversationItem$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationItem$lambda$1$lambda$0(Function0 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AvatarWrapper> getActiveAdminsAvatars() {
        List<Participant> take = CollectionsKt.take(Injector.get().getDataLayer().getTeamPresence().getValue().getBuiltActiveAdmins(), 3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(take, 10));
        for (Participant participant : take) {
            Avatar avatar = participant.getAvatar();
            Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
            Boolean isBot = participant.isBot();
            Intrinsics.checkNotNullExpressionValue(isBot, "isBot(...)");
            arrayList.add(new AvatarWrapper(avatar, isBot.booleanValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getWorkspaceName() {
        return Injector.get().getAppConfigProvider().get().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getUserIntercomId() {
        if (Injector.isNotInitialised()) {
            return "";
        }
        String intercomId = Injector.get().getUserIdentity().getIntercomId();
        Intrinsics.checkNotNullExpressionValue(intercomId, "getIntercomId(...)");
        return intercomId;
    }

    public static final void UnreadIndicator(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(481161991);
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
            Modifier m1209size3ABfNKs = SizeKt.m1209size3ABfNKs(modifier, Dp.m8798constructorimpl(16));
            Alignment centerEnd = Alignment.INSTANCE.getCenterEnd();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1209size3ABfNKs);
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
            CanvasKt.Canvas(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), new Function1() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit UnreadIndicator$lambda$5$lambda$4;
                    UnreadIndicator$lambda$5$lambda$4 = ConversationItemKt.UnreadIndicator$lambda$5$lambda$4((DrawScope) obj);
                    return UnreadIndicator$lambda$5$lambda$4;
                }
            }, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UnreadIndicator$lambda$6;
                    UnreadIndicator$lambda$6 = ConversationItemKt.UnreadIndicator$lambda$6(Modifier.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return UnreadIndicator$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnreadIndicator$lambda$5$lambda$4(DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        long Color = ColorKt.Color(4292544041L);
        float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6618getSizeNHjbRc() >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6618getSizeNHjbRc() & 4294967295L)) / 2.0f;
        DrawScope.m6599drawCircleVaOC9Bg$default(Canvas, Color, 0.0f, Offset.m5763constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)), 0.0f, null, null, 0, 122, null);
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    public static final void ReadConversationWithSimpleTicketHeaderPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1446702226);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.m12044getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ReadConversationWithSimpleTicketHeaderPreview$lambda$7;
                    ReadConversationWithSimpleTicketHeaderPreview$lambda$7 = ConversationItemKt.ReadConversationWithSimpleTicketHeaderPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ReadConversationWithSimpleTicketHeaderPreview$lambda$7;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void UnreadConversationWithSimpleTicketHeaderPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1866912491);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.m12045getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UnreadConversationWithSimpleTicketHeaderPreview$lambda$8;
                    UnreadConversationWithSimpleTicketHeaderPreview$lambda$8 = ConversationItemKt.UnreadConversationWithSimpleTicketHeaderPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return UnreadConversationWithSimpleTicketHeaderPreview$lambda$8;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void UnreadConversationCardPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1292079862);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.m12046getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UnreadConversationCardPreview$lambda$9;
                    UnreadConversationCardPreview$lambda$9 = ConversationItemKt.UnreadConversationCardPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                    return UnreadConversationCardPreview$lambda$9;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void UnreadConversationCardWithBotPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-516742229);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.m12047getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UnreadConversationCardWithBotPreview$lambda$10;
                    UnreadConversationCardWithBotPreview$lambda$10 = ConversationItemKt.UnreadConversationCardWithBotPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return UnreadConversationCardWithBotPreview$lambda$10;
                }
            });
        }
    }

    static /* synthetic */ Conversation sampleConversation$default(Ticket ticket, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            ticket = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return sampleConversation(ticket, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Conversation sampleConversation(Ticket ticket, boolean z) {
        LastParticipatingAdmin.Builder withAvatar = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
        Intrinsics.checkNotNullExpressionValue(withAvatar, "withAvatar(...)");
        return new Conversation("123", z, null, CollectionsKt.listOf(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(System.currentTimeMillis())), null, withAvatar, null, false, false, null, null, false, ticket, null, null, null, null, null, null, null, 1044436, null);
    }

    static /* synthetic */ Conversation sampleConversationWithBot$default(Ticket ticket, int i, Object obj) {
        if ((i & 1) != 0) {
            ticket = null;
        }
        return sampleConversationWithBot(ticket);
    }

    private static final Conversation sampleConversationWithBot(Ticket ticket) {
        LastParticipatingAdmin.Builder withIsBot = new LastParticipatingAdmin.Builder().withFirstName("Operator").withAvatar(new Avatar.Builder().withInitials("O")).withIsBot(true);
        Intrinsics.checkNotNullExpressionValue(withIsBot, "withIsBot(...)");
        return new Conversation("123", false, null, CollectionsKt.listOf(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(System.currentTimeMillis())), null, withIsBot, null, false, false, null, null, false, ticket, null, null, null, null, null, null, null, 1044438, null);
    }
}

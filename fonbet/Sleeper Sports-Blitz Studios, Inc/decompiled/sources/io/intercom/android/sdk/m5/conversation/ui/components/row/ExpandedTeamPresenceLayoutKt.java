package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.ExpandedTeamPresenceState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpandedTeamPresenceLayout.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u001f\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a!\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0014\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0012\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0015"}, d2 = {"AvatarSize", "Landroidx/compose/ui/unit/Dp;", "F", "ExpandedTeamPresenceLayout", "", "teamPresenceUiState", "Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getTextStyleFor", "Landroidx/compose/ui/text/TextStyle;", "style", "Lio/intercom/android/sdk/models/Header$Expanded$Style;", "color", "", "(Lio/intercom/android/sdk/models/Header$Expanded$Style;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "ExpandedTeamPresenceLayoutPreviewWithFin", "(Landroidx/compose/runtime/Composer;I)V", "ExpandedTeamPresenceLayoutPreviewWithFinAndHumans", "ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ExpandedTeamPresenceLayoutKt {
    private static final float AvatarSize = Dp.m8798constructorimpl(56);

    /* compiled from: ExpandedTeamPresenceLayout.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AvatarType.values().length];
            try {
                iArr[AvatarType.FACEPILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarType.LAYERED_BUBBLES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvatarType.LOGO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AvatarType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Header.Expanded.Style.values().length];
            try {
                iArr2[Header.Expanded.Style.H1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Header.Expanded.Style.PARAGRAPH.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Header.Expanded.Style.INTRO.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Header.Expanded.Style.GREETING.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedTeamPresenceLayout$lambda$9(ExpandedTeamPresenceState teamPresenceUiState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(teamPresenceUiState, "$teamPresenceUiState");
        ExpandedTeamPresenceLayout(teamPresenceUiState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin$lambda$12(int i, Composer composer, int i2) {
        ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedTeamPresenceLayoutPreviewWithFin$lambda$10(int i, Composer composer, int i2) {
        ExpandedTeamPresenceLayoutPreviewWithFin(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedTeamPresenceLayoutPreviewWithFinAndHumans$lambda$11(int i, Composer composer, int i2) {
        ExpandedTeamPresenceLayoutPreviewWithFinAndHumans(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static final void ExpandedTeamPresenceLayout(final ExpandedTeamPresenceState teamPresenceUiState, Modifier modifier, Composer composer, final int i, final int i2) {
        Object obj;
        String str;
        Context context;
        String str2;
        int i3;
        char c;
        Pair pair;
        int i4;
        String str3;
        int i5;
        boolean z;
        boolean z2;
        String str4;
        char c2;
        int i6;
        Intrinsics.checkNotNullParameter(teamPresenceUiState, "teamPresenceUiState");
        Composer startRestartGroup = composer.startRestartGroup(-1694898660);
        Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context2 = (Context) consume;
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
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
        int i7 = WhenMappings.$EnumSwitchMapping$0[teamPresenceUiState.getAvatarType().ordinal()];
        if (i7 == 1) {
            obj = null;
            str = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            context = context2;
            str2 = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
            i3 = 0;
            c = 2;
            startRestartGroup.startReplaceGroup(-655467756);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Avatar avatar = ((AvatarWrapper) CollectionsKt.first((List) teamPresenceUiState.getAvatars())).getAvatar();
            if (teamPresenceUiState.getAvatars().size() >= 3) {
                pair = TuplesKt.to(teamPresenceUiState.getAvatars().get(1).getAvatar(), teamPresenceUiState.getAvatars().get(2).getAvatar());
            } else if (teamPresenceUiState.getAvatars().size() == 2) {
                pair = TuplesKt.to(teamPresenceUiState.getAvatars().get(1).getAvatar(), null);
            } else {
                pair = TuplesKt.to(null, null);
            }
            BotAndHumansFacePileKt.m12028BotAndHumansFacePilehGBTI10(companion2, avatar, pair, AvatarSize, null, startRestartGroup, 3654, 16);
            startRestartGroup.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
        } else if (i7 == 2) {
            obj = null;
            str = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            context = context2;
            str2 = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
            i3 = 0;
            c = 2;
            startRestartGroup.startReplaceGroup(-654655587);
            if (teamPresenceUiState.getAvatars().size() == 1) {
                startRestartGroup.startReplaceGroup(-654606390);
                AvatarIconKt.m12134AvatarIconRd90Nhg(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, AvatarSize), teamPresenceUiState.getAvatars().get(0), null, teamPresenceUiState.getDisplayActiveIndicator(), TextUnitKt.getSp(24), null, startRestartGroup, 24646, 36);
                startRestartGroup = startRestartGroup;
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-654265855);
                AvatarGroupKt.m12024AvatarGroupJ8mCjc(teamPresenceUiState.getAvatars(), Modifier.INSTANCE, AvatarSize, TextUnitKt.getSp(24), startRestartGroup, 3512, 0);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endReplaceGroup();
            Unit unit2 = Unit.INSTANCE;
        } else if (i7 == 3) {
            startRestartGroup.startReplaceGroup(-653933318);
            obj = null;
            context = context2;
            str = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            c = 2;
            str2 = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
            i3 = 0;
            AvatarIconKt.m12134AvatarIconRd90Nhg(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, AvatarSize), teamPresenceUiState.getAvatars().get(0), null, teamPresenceUiState.getDisplayActiveIndicator(), TextUnitKt.getSp(24), Color.m6029boximpl(Color.INSTANCE.m6074getTransparent0d7_KjU()), startRestartGroup, 221254, 4);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endReplaceGroup();
            Unit unit3 = Unit.INSTANCE;
        } else {
            if (i7 != 4) {
                startRestartGroup.startReplaceGroup(-852429191);
                startRestartGroup.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            startRestartGroup.startReplaceGroup(-653494885);
            startRestartGroup.endReplaceGroup();
            Unit unit4 = Unit.INSTANCE;
            obj = null;
            str = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            context = context2;
            str2 = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
            i3 = 0;
            c = 2;
        }
        float f = 12;
        int i8 = 6;
        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(-852359896);
        for (Header.Expanded.Body body : teamPresenceUiState.getBody()) {
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(4)), startRestartGroup, i8);
            Composer composer2 = startRestartGroup;
            TextKt.m3901TextNvy7gAk(body.getText(), null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m8647boximpl(TextAlign.INSTANCE.m8654getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m8706getEllipsisgIe3tQ8(), false, 2, 0, null, getTextStyleFor(body.getStyle(), body.getColor(), startRestartGroup, i3, i3), composer2, 0, 24960, 109566);
            str2 = str2;
            i8 = i8;
            startRestartGroup = composer2;
            companion = companion;
            f = f;
            c = 2;
            obj = null;
            i3 = 0;
        }
        final Context context3 = context;
        final Modifier modifier2 = companion;
        float f2 = f;
        int i9 = i8;
        String str5 = str2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-852346650);
        String str6 = "C101@5233L9:Row.kt#2w3rfo";
        String str7 = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
        if (teamPresenceUiState.getSocialAccounts().isEmpty()) {
            i4 = 8;
            str3 = str;
            i5 = 0;
        } else {
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f2)), startRestartGroup, i9);
            Arrangement.Horizontal m1017spacedByD5KLDUw = Arrangement.INSTANCE.m1017spacedByD5KLDUw(Dp.m8798constructorimpl(8), Alignment.INSTANCE.getCenterHorizontally());
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m1017spacedByD5KLDUw, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, str5);
            int i10 = 0;
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            str3 = str;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, str3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
            }
            Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-457726390);
            for (final Header.Expanded.SocialAccount socialAccount : teamPresenceUiState.getSocialAccounts()) {
                if (Intrinsics.areEqual(socialAccount.getProvider(), "twitter")) {
                    Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.intercom_twitter, startRestartGroup, i10);
                    String provider = socialAccount.getProvider();
                    long m13090getActionContrastWhite0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13090getActionContrastWhite0d7_KjU();
                    Modifier m1209size3ABfNKs = SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16));
                    startRestartGroup.startReplaceGroup(-144020278);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    i6 = 0;
                    IconKt.m3194Iconww6aTOc(painterResource, provider, ClickableKt.m619clickableO2vRcR0$default(m1209size3ABfNKs, (MutableInteractionSource) rememberedValue, null, false, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ExpandedTeamPresenceLayoutKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ExpandedTeamPresenceLayout$lambda$8$lambda$4$lambda$3$lambda$2;
                            ExpandedTeamPresenceLayout$lambda$8$lambda$4$lambda$3$lambda$2 = ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout$lambda$8$lambda$4$lambda$3$lambda$2(Header.Expanded.SocialAccount.this, context3);
                            return ExpandedTeamPresenceLayout$lambda$8$lambda$4$lambda$3$lambda$2;
                        }
                    }, 28, null), m13090getActionContrastWhite0d7_KjU, startRestartGroup, 8, 0);
                } else {
                    i6 = i10;
                }
                i10 = i6;
            }
            i5 = i10;
            i4 = 8;
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-852298704);
        boolean z3 = i5;
        for (Header.Expanded.Footer footer : teamPresenceUiState.getFooters()) {
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(4)), startRestartGroup, i9);
            Arrangement.HorizontalOrVertical m1016spacedBy0680j_4 = Arrangement.INSTANCE.m1016spacedBy0680j_4(Dp.m8798constructorimpl(i4));
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, str7);
            Modifier.Companion companion4 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m1016spacedBy0680j_4, centerVertically2, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, str5);
            int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, z3));
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion4);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, str3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5333constructorimpl3 = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                m5333constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                m5333constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
            }
            Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, str6);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-143995125);
            if (footer.getAvatarDetails() != null) {
                Modifier.Companion companion5 = Modifier.INSTANCE;
                List<Avatar.Builder> avatars = footer.getAvatarDetails().getAvatars();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(avatars, 10));
                Iterator<T> it = avatars.iterator();
                while (it.hasNext()) {
                    Avatar build = ((Avatar.Builder) it.next()).build();
                    Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                    arrayList.add(new AvatarWrapper(build, z3, 2, null));
                    str6 = str6;
                }
                str4 = str6;
                c2 = 2;
                z = 844473419;
                z2 = 54;
                AvatarGroupKt.m12024AvatarGroupJ8mCjc(arrayList, companion5, Dp.m8798constructorimpl(20), 0L, startRestartGroup, 440, 8);
            } else {
                z = 844473419;
                z2 = 54;
                str4 = str6;
                c2 = 2;
            }
            startRestartGroup.endReplaceGroup();
            Composer composer3 = startRestartGroup;
            TextKt.m3901TextNvy7gAk(footer.getText(), null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m8647boximpl(TextAlign.INSTANCE.m8654getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m8706getEllipsisgIe3tQ8(), false, 2, 0, null, getTextStyleFor(footer.getStyle(), footer.getColor(), startRestartGroup, z3, z3), composer3, 0, 24960, 109566);
            startRestartGroup = composer3;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            str6 = str4;
            i4 = 8;
            z3 = z3;
            str7 = str7;
            str3 = str3;
            i9 = 6;
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ExpandedTeamPresenceLayoutKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit ExpandedTeamPresenceLayout$lambda$9;
                    ExpandedTeamPresenceLayout$lambda$9 = ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayout$lambda$9(ExpandedTeamPresenceState.this, modifier2, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    return ExpandedTeamPresenceLayout$lambda$9;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandedTeamPresenceLayout$lambda$8$lambda$4$lambda$3$lambda$2(Header.Expanded.SocialAccount it, Context context) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(context, "$context");
        LinkOpener.handleUrl(it.getProfileUrl(), context, Injector.get().getApi());
        return Unit.INSTANCE;
    }

    private static final TextStyle getTextStyleFor(Header.Expanded.Style style, String str, Composer composer, int i, int i2) {
        TextStyle type03;
        Color m6029boximpl;
        composer.startReplaceGroup(33871301);
        String str2 = (i2 & 2) != 0 ? null : str;
        int i3 = WhenMappings.$EnumSwitchMapping$1[style.ordinal()];
        if (i3 == 1) {
            composer.startReplaceGroup(1720557014);
            type03 = IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType03();
            composer.endReplaceGroup();
        } else if (i3 == 2) {
            composer.startReplaceGroup(1720559900);
            TextStyle type04 = IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType04();
            m6029boximpl = str2 != null ? Color.m6029boximpl(ColorExtensionsKt.toComposeColor$default(str2, 0.0f, 1, null)) : null;
            type03 = TextStyle.m8245copyp1EtxEg$default(type04, m6029boximpl == null ? IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13101getDescriptionText0d7_KjU() : m6029boximpl.m6049unboximpl(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            composer.endReplaceGroup();
        } else if (i3 == 3) {
            composer.startReplaceGroup(1720565846);
            TextStyle type01 = IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType01();
            m6029boximpl = str2 != null ? Color.m6029boximpl(ColorExtensionsKt.toComposeColor$default(str2, 0.0f, 1, null)) : null;
            type03 = TextStyle.m8245copyp1EtxEg$default(type01, m6029boximpl == null ? IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13109getIntroText0d7_KjU() : m6029boximpl.m6049unboximpl(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            composer.endReplaceGroup();
        } else if (i3 == 4) {
            composer.startReplaceGroup(1720571705);
            TextStyle type012 = IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType01();
            m6029boximpl = str2 != null ? Color.m6029boximpl(ColorExtensionsKt.toComposeColor$default(str2, 0.0f, 1, null)) : null;
            type03 = TextStyle.m8245copyp1EtxEg$default(type012, m6029boximpl == null ? IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13105getGreetingText0d7_KjU() : m6029boximpl.m6049unboximpl(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1720576342);
            type03 = IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType04();
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        return type03;
    }

    @IntercomPreviews
    private static final void ExpandedTeamPresenceLayoutPreviewWithFin(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(467453596);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m12344getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ExpandedTeamPresenceLayoutKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExpandedTeamPresenceLayoutPreviewWithFin$lambda$10;
                    ExpandedTeamPresenceLayoutPreviewWithFin$lambda$10 = ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayoutPreviewWithFin$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ExpandedTeamPresenceLayoutPreviewWithFin$lambda$10;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void ExpandedTeamPresenceLayoutPreviewWithFinAndHumans(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(278476299);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m12346getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ExpandedTeamPresenceLayoutKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExpandedTeamPresenceLayoutPreviewWithFinAndHumans$lambda$11;
                    ExpandedTeamPresenceLayoutPreviewWithFinAndHumans$lambda$11 = ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayoutPreviewWithFinAndHumans$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ExpandedTeamPresenceLayoutPreviewWithFinAndHumans$lambda$11;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1042616954);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ExpandedTeamPresenceLayoutKt.INSTANCE.m12348getLambda6$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ExpandedTeamPresenceLayoutKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin$lambda$12;
                    ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin$lambda$12 = ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin$lambda$12;
                }
            });
        }
    }
}

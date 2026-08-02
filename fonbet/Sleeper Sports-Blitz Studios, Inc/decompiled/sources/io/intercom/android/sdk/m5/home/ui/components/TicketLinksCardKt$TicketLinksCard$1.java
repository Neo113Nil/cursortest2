package io.intercom.android.sdk.m5.home.ui.components;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import coil.compose.AsyncImageKt;
import coil.request.ImageRequest;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.TicketLink;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TicketLinksCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class TicketLinksCardKt$TicketLinksCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ Function1<TicketType, Unit> $onTicketLinkClicked;
    final /* synthetic */ HomeCards.HomeTicketLinksData $ticketLinksData;

    /* JADX WARN: Multi-variable type inference failed */
    TicketLinksCardKt$TicketLinksCard$1(HomeCards.HomeTicketLinksData homeTicketLinksData, Function1<? super TicketType, Unit> function1) {
        this.$ticketLinksData = homeTicketLinksData;
        this.$onTicketLinkClicked = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope IntercomCard, Composer composer, int i) {
        HomeCards.HomeTicketLinksData homeTicketLinksData;
        Function1<TicketType, Unit> function1;
        String str;
        Object obj;
        String str2;
        Object obj2;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
        if ((i & 81) != 16 || !composer2.getSkipping()) {
            HomeCards.HomeTicketLinksData homeTicketLinksData2 = this.$ticketLinksData;
            Function1<TicketType, Unit> function12 = this.$onTicketLinkClicked;
            ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
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
            Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2.startReplaceGroup(466717469);
            String cardTitle = homeTicketLinksData2.getCardTitle();
            if (cardTitle == null || StringsKt.isBlank(cardTitle)) {
                homeTicketLinksData = homeTicketLinksData2;
                function1 = function12;
                str = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
                obj = null;
                str2 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            } else {
                homeTicketLinksData = homeTicketLinksData2;
                function1 = function12;
                str2 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
                str = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
                obj = null;
                TextKt.m3901TextNvy7gAk(homeTicketLinksData2.getCardTitle(), PaddingKt.m1161paddingqDBjuR0$default(PaddingKt.m1159paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8798constructorimpl(16), 0.0f, 2, null), 0.0f, Dp.m8798constructorimpl(12), 0.0f, Dp.m8798constructorimpl(4), 5, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04SemiBold(), composer, 48, 0, 131068);
                composer2 = composer;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(466732020);
            int i2 = 0;
            for (Object obj3 : homeTicketLinksData.getLinks()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final TicketLink ticketLink = (TicketLink) obj3;
                final Function1<TicketType, Unit> function13 = function1;
                float f = 16;
                Modifier m1158paddingVpY3zN4 = PaddingKt.m1158paddingVpY3zN4(ClickableKt.m623clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), false, null, null, null, new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.components.TicketLinksCardKt$TicketLinksCard$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$3$lambda$2$lambda$0;
                        invoke$lambda$3$lambda$2$lambda$0 = TicketLinksCardKt$TicketLinksCard$1.invoke$lambda$3$lambda$2$lambda$0(Function1.this, ticketLink);
                        return invoke$lambda$3$lambda$2$lambda$0;
                    }
                }, 15, null), Dp.m8798constructorimpl(f), Dp.m8798constructorimpl(12));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                String str3 = str;
                ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, str3);
                int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m1158paddingVpY3zN4);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                String str4 = str2;
                ComposerKt.sourceInformationMarkerStart(composer2, -553112988, str4);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer m5333constructorimpl2 = Updater.m5333constructorimpl(composer2);
                Updater.m5340setimpl(m5333constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                    m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                    m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                }
                Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                function1 = function13;
                int i4 = i2;
                str2 = str4;
                TextKt.m3901TextNvy7gAk(ticketLink.getTicketTypeName(), RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, null, 0L, null, FontWeight.INSTANCE.getNormal(), null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8706getEllipsisgIe3tQ8(), false, 1, 0, null, null, composer, 1572864, 24960, 241596);
                composer2 = composer;
                SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), composer2, 6);
                Modifier m1209size3ABfNKs = SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f));
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = composer2.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ImageRequest build = new ImageRequest.Builder((Context) consume).data(ticketLink.getIconUrl()).crossfade(true).build();
                ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2 = composer2.consume(localContext2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                AsyncImageKt.m10070AsyncImageQgsmV_s(build, null, IntercomImageLoaderKt.getImageLoader((Context) consume2), m1209size3ABfNKs, null, null, null, null, 0.0f, ColorFilter.Companion.m6080tintxETnrds$default(ColorFilter.INSTANCE, IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13090getActionContrastWhite0d7_KjU(), 0, 2, null), 0, false, null, composer2, 3640, 0, 7664);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.startReplaceGroup(466773453);
                if (i4 != homeTicketLinksData.getLinks().size() - 1) {
                    obj2 = null;
                    IntercomDividerKt.IntercomDivider(PaddingKt.m1159paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8798constructorimpl(f), 0.0f, 2, null), composer2, 6, 0);
                } else {
                    obj2 = null;
                }
                composer2.endReplaceGroup();
                obj = obj2;
                i2 = i3;
                str = str3;
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            return;
        }
        composer2.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$0(Function1 onTicketLinkClicked, TicketLink item) {
        Intrinsics.checkNotNullParameter(onTicketLinkClicked, "$onTicketLinkClicked");
        Intrinsics.checkNotNullParameter(item, "$item");
        onTicketLinkClicked.invoke(item.getTicketType());
        return Unit.INSTANCE;
    }
}

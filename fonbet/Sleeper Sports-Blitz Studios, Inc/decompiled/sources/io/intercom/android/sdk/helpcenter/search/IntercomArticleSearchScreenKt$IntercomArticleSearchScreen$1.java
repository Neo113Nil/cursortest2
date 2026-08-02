package io.intercom.android.sdk.helpcenter.search;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchState;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterErrorScreenKt;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterLoadingScreenKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleResultRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomArticleSearchScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function1<String, Unit> $onArticleClicked;
    final /* synthetic */ Function0<Unit> $onClearSearchClick;
    final /* synthetic */ ArticleSearchState $state;

    /* JADX WARN: Multi-variable type inference failed */
    IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1(ArticleSearchState articleSearchState, Function1<? super String, Unit> function1, Function0<Unit> function0, Context context) {
        this.$state = articleSearchState;
        this.$onArticleClicked = function1;
        this.$onClearSearchClick = function0;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String searchTerm;
        AnnotatedString noResultsMessage;
        if ((i & 11) != 2 || !composer.getSkipping()) {
            ArticleSearchState articleSearchState = this.$state;
            if (articleSearchState instanceof ArticleSearchState.Content) {
                composer.startReplaceGroup(484447755);
                Modifier m582backgroundbw27NRU$default = BackgroundKt.m582backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13094getBackground0d7_KjU(), null, 2, null);
                composer.startReplaceGroup(154178788);
                boolean changed = composer.changed(this.$state) | composer.changed(this.$onArticleClicked);
                final ArticleSearchState articleSearchState2 = this.$state;
                final Function1<String, Unit> function1 = this.$onArticleClicked;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$1$lambda$0;
                            invoke$lambda$1$lambda$0 = IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1.invoke$lambda$1$lambda$0(ArticleSearchState.this, function1, (LazyListScope) obj);
                            return invoke$lambda$1$lambda$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                LazyDslKt.LazyColumn(m582backgroundbw27NRU$default, null, null, false, null, null, null, false, null, (Function1) rememberedValue, composer, 0, TypedValues.PositionType.TYPE_POSITION_TYPE);
                composer.endReplaceGroup();
                return;
            }
            if (Intrinsics.areEqual(articleSearchState, ArticleSearchState.Error.INSTANCE)) {
                composer.startReplaceGroup(485142124);
                HelpCenterErrorScreenKt.HelpCenterErrorScreen(new ErrorState.WithoutCTA(0, 0, null, 7, null), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 48, 0);
                composer.endReplaceGroup();
                return;
            }
            if (Intrinsics.areEqual(articleSearchState, ArticleSearchState.Initial.INSTANCE)) {
                composer.startReplaceGroup(485341516);
                composer.endReplaceGroup();
                this.$onClearSearchClick.invoke();
                return;
            }
            if (Intrinsics.areEqual(articleSearchState, ArticleSearchState.Loading.INSTANCE)) {
                composer.startReplaceGroup(485420287);
                HelpCenterLoadingScreenKt.HelpCenterLoadingScreen(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6, 0);
                composer.endReplaceGroup();
                return;
            }
            if (!(articleSearchState instanceof ArticleSearchState.NoResults) && !(articleSearchState instanceof ArticleSearchState.NoResultsNoTeamHelp)) {
                composer.startReplaceGroup(154175038);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(485632916);
            ArticleSearchState articleSearchState3 = this.$state;
            if (articleSearchState3 instanceof ArticleSearchState.NoResults) {
                searchTerm = ((ArticleSearchState.NoResults) articleSearchState3).getSearchTerm();
            } else {
                searchTerm = articleSearchState3 instanceof ArticleSearchState.NoResultsNoTeamHelp ? ((ArticleSearchState.NoResultsNoTeamHelp) articleSearchState3).getSearchTerm() : "";
            }
            Context context = this.$context;
            ArticleSearchState articleSearchState4 = this.$state;
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5333constructorimpl = Updater.m5333constructorimpl(composer);
            Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            noResultsMessage = IntercomArticleSearchScreenKt.getNoResultsMessage(context, searchTerm);
            float f = 20;
            TextKt.m3902TextZ58ophY(noResultsMessage, PaddingKt.m1161paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8798constructorimpl(f), Dp.m8798constructorimpl(32), Dp.m8798constructorimpl(f), 0.0f, 8, null), IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), null, TextUnitKt.getSp(16), null, null, null, 0L, null, TextAlign.m8647boximpl(TextAlign.INSTANCE.m8654getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, null, composer, 24576, 0, 523240);
            composer.startReplaceGroup(145075595);
            if (articleSearchState4 instanceof ArticleSearchState.NoResults) {
                TeamPresenceComponentKt.TeamPresenceComponent(((ArticleSearchState.NoResults) articleSearchState4).getTeamPresenceState(), false, null, composer, 0, 6);
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(final ArticleSearchState state, final Function1 onArticleClicked, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(onArticleClicked, "$onArticleClicked");
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.items$default(LazyColumn, ((ArticleSearchState.Content) state).getSearchResults().size(), null, null, ComposableLambdaKt.composableLambdaInstance(1308683973, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchScreenKt$IntercomArticleSearchScreen$1$1$1$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i2 & 112) == 0) {
                    i3 = (composer.changed(i) ? 32 : 16) | i2;
                } else {
                    i3 = i2;
                }
                if ((i3 & 721) != 144 || !composer.getSkipping()) {
                    ArticleSearchResultRow articleSearchResultRow = ((ArticleSearchState.Content) ArticleSearchState.this).getSearchResults().get(i);
                    if (articleSearchResultRow instanceof ArticleSearchResultRow.ArticleResultRow) {
                        composer.startReplaceGroup(-1577698623);
                        ArticleResultRowComponentKt.ArticleResultRowComponent((ArticleSearchResultRow.ArticleResultRow) articleSearchResultRow, onArticleClicked, null, composer, 0, 4);
                        composer.endReplaceGroup();
                        return;
                    } else {
                        if (!(articleSearchResultRow instanceof ArticleSearchResultRow.TeammateHelpRow)) {
                            composer.startReplaceGroup(-1577703168);
                            composer.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer.startReplaceGroup(-1577693088);
                        TeamPresenceComponentKt.TeamPresenceComponent(((ArticleSearchResultRow.TeammateHelpRow) articleSearchResultRow).getTeamPresenceState(), false, null, composer, 0, 6);
                        composer.endReplaceGroup();
                        return;
                    }
                }
                composer.skipToGroupEnd();
            }
        }), 6, null);
        return Unit.INSTANCE;
    }
}

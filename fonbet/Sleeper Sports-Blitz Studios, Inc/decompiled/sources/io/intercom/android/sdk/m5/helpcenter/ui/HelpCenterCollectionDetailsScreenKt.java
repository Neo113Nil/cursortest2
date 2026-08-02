package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionRowComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionSummaryComponentKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelpCenterCollectionDetailsScreen.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\t\u001a<\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0002¨\u0006\u000e"}, d2 = {"HelpCenterCollectionDetailsScreen", "", "viewModel", "Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;", "collectionId", "", "onArticleClicked", "Lkotlin/Function1;", "onCollectionClicked", "(Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "helpCenterSectionItems", "Landroidx/compose/foundation/lazy/LazyListScope;", "state", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState$Content;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HelpCenterCollectionDetailsScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterCollectionDetailsScreen$lambda$3(HelpCenterViewModel viewModel, String collectionId, Function1 function1, Function1 onCollectionClicked, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        Intrinsics.checkNotNullParameter(collectionId, "$collectionId");
        Intrinsics.checkNotNullParameter(onCollectionClicked, "$onCollectionClicked");
        HelpCenterCollectionDetailsScreen(viewModel, collectionId, function1, onCollectionClicked, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterCollectionDetailsScreen$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void HelpCenterCollectionDetailsScreen(final HelpCenterViewModel viewModel, final String collectionId, Function1<? super String, Unit> function1, final Function1<? super String, Unit> onCollectionClicked, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(onCollectionClicked, "onCollectionClicked");
        Composer startRestartGroup = composer.startRestartGroup(-1331499807);
        final Function1<? super String, Unit> function12 = (i2 & 4) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit HelpCenterCollectionDetailsScreen$lambda$0;
                HelpCenterCollectionDetailsScreen$lambda$0 = HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen$lambda$0((String) obj);
                return HelpCenterCollectionDetailsScreen$lambda$0;
            }
        } : function1;
        EffectsKt.LaunchedEffect("", new HelpCenterCollectionDetailsScreenKt$HelpCenterCollectionDetailsScreen$2(viewModel, collectionId, null), startRestartGroup, 70);
        boolean z = true;
        final State collectAsState = SnapshotStateKt.collectAsState(viewModel.getCollectionDetailsState(), null, startRestartGroup, 8, 1);
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-1710791525);
        boolean changed = startRestartGroup.changed(collectAsState) | ((((i & 896) ^ 384) > 256 && startRestartGroup.changed(function12)) || (i & 384) == 256);
        if ((((i & 7168) ^ 3072) <= 2048 || !startRestartGroup.changed(onCollectionClicked)) && (i & 3072) != 2048) {
            z = false;
        }
        boolean z2 = changed | z;
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit HelpCenterCollectionDetailsScreen$lambda$2$lambda$1;
                    HelpCenterCollectionDetailsScreen$lambda$2$lambda$1 = HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen$lambda$2$lambda$1(State.this, function12, onCollectionClicked, (LazyListScope) obj);
                    return HelpCenterCollectionDetailsScreen$lambda$2$lambda$1;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceGroup();
        LazyDslKt.LazyColumn(fillMaxSize$default, null, null, false, null, centerHorizontally, null, false, null, (Function1) rememberedValue, startRestartGroup, 196614, 478);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HelpCenterCollectionDetailsScreen$lambda$3;
                    HelpCenterCollectionDetailsScreen$lambda$3 = HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen$lambda$3(HelpCenterViewModel.this, collectionId, function12, onCollectionClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HelpCenterCollectionDetailsScreen$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterCollectionDetailsScreen$lambda$2$lambda$1(State state, Function1 function1, Function1 onCollectionClicked, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(onCollectionClicked, "$onCollectionClicked");
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final CollectionDetailsUiState collectionDetailsUiState = (CollectionDetailsUiState) state.getValue();
        if (Intrinsics.areEqual(collectionDetailsUiState, CollectionDetailsUiState.Initial.INSTANCE) || Intrinsics.areEqual(collectionDetailsUiState, CollectionDetailsUiState.Loading.INSTANCE)) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$HelpCenterCollectionDetailsScreenKt.INSTANCE.m12414getLambda1$intercom_sdk_base_release(), 3, null);
        } else if (collectionDetailsUiState instanceof CollectionDetailsUiState.Error) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(211733483, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$HelpCenterCollectionDetailsScreen$3$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 14) == 0) {
                        i |= composer.changed(item) ? 4 : 2;
                    }
                    if ((i & 91) != 18 || !composer.getSkipping()) {
                        HelpCenterErrorScreenKt.HelpCenterErrorScreen(((CollectionDetailsUiState.Error) CollectionDetailsUiState.this).getErrorState(), LazyItemScope.fillParentMaxHeight$default(item, Modifier.INSTANCE, 0.0f, 1, null), composer, 0, 0);
                    } else {
                        composer.skipToGroupEnd();
                    }
                }
            }), 3, null);
        } else {
            if (!(collectionDetailsUiState instanceof CollectionDetailsUiState.Content)) {
                throw new NoWhenBranchMatchedException();
            }
            CollectionDetailsUiState.Content content = (CollectionDetailsUiState.Content) collectionDetailsUiState;
            if (content.getCollectionDetailsRows().isEmpty()) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$HelpCenterCollectionDetailsScreenKt.INSTANCE.m12415getLambda2$intercom_sdk_base_release(), 3, null);
            } else {
                helpCenterSectionItems(LazyColumn, content, function1, onCollectionClicked);
            }
        }
        return Unit.INSTANCE;
    }

    private static final void helpCenterSectionItems(LazyListScope lazyListScope, final CollectionDetailsUiState.Content content, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12) {
        LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1491252145, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 81) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                } else {
                    CollectionSummaryComponentKt.CollectionSummaryComponent(CollectionDetailsUiState.Content.this, null, composer, 8, 2);
                }
            }
        }), 3, null);
        final List<CollectionDetailsRow> collectionDetailsRows = content.getCollectionDetailsRows();
        final int i = 0;
        for (Object obj : collectionDetailsRows) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final CollectionDetailsRow collectionDetailsRow = (CollectionDetailsRow) obj;
            if (collectionDetailsRow instanceof CollectionDetailsRow.ArticleRow) {
                LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-103698696, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i3) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i3 & 81) != 16 || !composer.getSkipping()) {
                            composer.startReplaceGroup(153525508);
                            if (i == 0) {
                                SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), composer, 6);
                            }
                            composer.endReplaceGroup();
                            ArticleRowComponentKt.ArticleRowComponent(null, (CollectionDetailsRow.ArticleRow) collectionDetailsRow, function1, composer, 0, 1);
                            if (i == collectionDetailsRows.size() - 1 || !(collectionDetailsRows.get(i + 1) instanceof CollectionDetailsRow.ArticleRow)) {
                                return;
                            }
                            float f = 16;
                            IntercomDividerKt.IntercomDivider(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m8798constructorimpl(f), 0.0f, Dp.m8798constructorimpl(f), 0.0f, 10, null), composer, 6, 0);
                            return;
                        }
                        composer.skipToGroupEnd();
                    }
                }), 3, null);
            } else if (Intrinsics.areEqual(collectionDetailsRow, CollectionDetailsRow.FullHelpCenterRow.INSTANCE)) {
                LazyListScope.item$default(lazyListScope, null, null, ComposableSingletons$HelpCenterCollectionDetailsScreenKt.INSTANCE.m12416getLambda3$intercom_sdk_base_release(), 3, null);
            } else {
                if (collectionDetailsRow instanceof CollectionDetailsRow.CollectionRow) {
                    LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1175818224, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i3) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i3 & 81) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                            } else {
                                CollectionRowComponentKt.CollectionRowComponent(((CollectionDetailsRow.CollectionRow) CollectionDetailsRow.this).getRowData(), function12, null, composer, 0, 4);
                            }
                        }
                    }), 3, null);
                } else {
                    if (!(collectionDetailsRow instanceof CollectionDetailsRow.SendMessageRow)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1352146481, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionDetailsScreenKt$helpCenterSectionItems$2$3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i3) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i3 & 81) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                            } else {
                                TeamPresenceComponentKt.TeamPresenceComponent(((CollectionDetailsRow.SendMessageRow) CollectionDetailsRow.this).getTeamPresenceState(), false, null, composer, 48, 4);
                            }
                        }
                    }), 3, null);
                }
                i = i2;
            }
            i = i2;
        }
    }
}

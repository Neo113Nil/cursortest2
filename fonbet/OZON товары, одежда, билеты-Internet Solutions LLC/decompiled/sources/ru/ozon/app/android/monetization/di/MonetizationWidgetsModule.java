package ru.ozon.app.android.monetization.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.monetization.widgets.achievementDetails.core.AchievementDetailsComposeWidgetKt;
import ru.ozon.app.android.monetization.widgets.achievementsList.core.AchievementsListComposeWidgetKt;
import ru.ozon.app.android.monetization.widgets.bloggerPersonalDataForm.core.BloggerPersonalDataFormWidgetKt;
import ru.ozon.app.android.monetization.widgets.cellHorizontalScroll.core.compose.CellHorizontalScrollWidgetKt;
import ru.ozon.app.android.monetization.widgets.countDownTimer.core.CountDownTimerWidgetKt;
import ru.ozon.app.android.monetization.widgets.inputSubmit.core.InputSubmitConfig;
import ru.ozon.app.android.monetization.widgets.inputSubmit.core.InputSubmitViewMapper;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.core.MatchShoppingCardsWidgetKt;
import ru.ozon.app.android.monetization.widgets.overlayButton.core.compose.OverlayButtonWidgetKt;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.core.PlayerShowcaseComposeWidgetKt;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v2.core.PlayerShowcaseV2WidgetKt;
import ru.ozon.app.android.monetization.widgets.postsList.core.PostsListWidgetKt;
import ru.ozon.app.android.monetization.widgets.progressCellList.core.ProgressCellListComposeWidgetKt;
import ru.ozon.app.android.monetization.widgets.skuListCopy.core.compose.SkuListCopyWidgetKt;
import ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.core.UnreadMessageIndicatorConfig;
import ru.ozon.app.android.monetization.widgets.unreadMessageIndicator.core.UnreadMessageIndicatorViewMapper;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/monetization/di/MonetizationWidgetsModule;", "", "<init>", "()V", "Lru/ozon/app/android/monetization/widgets/inputSubmit/core/InputSubmitConfig;", "inputSubmitConfig", "Lru/ozon/app/android/monetization/widgets/inputSubmit/core/InputSubmitViewMapper;", "inputSubmitViewMapper", "Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/core/UnreadMessageIndicatorConfig;", "unreadMessageIndicatorConfig", "Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/core/UnreadMessageIndicatorViewMapper;", "unreadMessageIndicatorViewMapper", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "provideMonetizationWidgets$monetization_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/monetization/widgets/inputSubmit/core/InputSubmitConfig;Lru/ozon/app/android/monetization/widgets/inputSubmit/core/InputSubmitViewMapper;Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/core/UnreadMessageIndicatorConfig;Lru/ozon/app/android/monetization/widgets/unreadMessageIndicator/core/UnreadMessageIndicatorViewMapper;)Ljava/util/Set;", "provideMonetizationWidgets", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "provideComposeWidgets$monetization_prodGoogleAllVendorsRelease", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ljava/util/Set;", "provideComposeWidgets", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MonetizationWidgetsModule {

    @NotNull
    public static final MonetizationWidgetsModule INSTANCE = new MonetizationWidgetsModule();

    private MonetizationWidgetsModule() {
    }

    @NotNull
    public static final Set<Widget2> provideMonetizationWidgets$monetization_prodGoogleAllVendorsRelease(@NotNull InputSubmitConfig inputSubmitConfig, @NotNull InputSubmitViewMapper inputSubmitViewMapper, @NotNull UnreadMessageIndicatorConfig unreadMessageIndicatorConfig, @NotNull UnreadMessageIndicatorViewMapper unreadMessageIndicatorViewMapper) {
        Intrinsics.checkNotNullParameter(inputSubmitConfig, "inputSubmitConfig");
        Intrinsics.checkNotNullParameter(inputSubmitViewMapper, "inputSubmitViewMapper");
        Intrinsics.checkNotNullParameter(unreadMessageIndicatorConfig, "unreadMessageIndicatorConfig");
        Intrinsics.checkNotNullParameter(unreadMessageIndicatorViewMapper, "unreadMessageIndicatorViewMapper");
        Widget2[] elements = {new Widget2("monetization", "inputSubmit", inputSubmitConfig, new ViewMapper2[]{inputSubmitViewMapper}), new Widget2("monetization", "unreadMessageIndicator", unreadMessageIndicatorConfig, new ViewMapper2[]{unreadMessageIndicatorViewMapper})};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }

    @NotNull
    public final Set<i> provideComposeWidgets$monetization_prodGoogleAllVendorsRelease(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        i[] elements = {CellHorizontalScrollWidgetKt.CellHorizontalScrollWidget(jsonDeserializer), CountDownTimerWidgetKt.CountDownTimerWidget(jsonDeserializer), AchievementsListComposeWidgetKt.AchievementsListWidget(jsonDeserializer), AchievementDetailsComposeWidgetKt.AchievementDetailsWidget(jsonDeserializer), ProgressCellListComposeWidgetKt.ProgressCellListWidget(jsonDeserializer), OverlayButtonWidgetKt.OverlayButtonWidget(jsonDeserializer), SkuListCopyWidgetKt.SkuListCopyWidget(jsonDeserializer), MatchShoppingCardsWidgetKt.MatchShoppingCardsWidget(jsonDeserializer), BloggerPersonalDataFormWidgetKt.BloggerPersonalDataFormWidget(jsonDeserializer), PlayerShowcaseComposeWidgetKt.PlayerShowcaseWidget(jsonDeserializer), PlayerShowcaseV2WidgetKt.PlayerShowcaseV2Widget(jsonDeserializer), PostsListWidgetKt.PostsListWidget(jsonDeserializer)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}

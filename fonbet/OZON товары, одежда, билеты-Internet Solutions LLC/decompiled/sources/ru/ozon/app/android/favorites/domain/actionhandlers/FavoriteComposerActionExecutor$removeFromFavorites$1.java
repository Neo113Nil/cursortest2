package ru.ozon.app.android.favorites.domain.actionhandlers;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.service.ChangeFavoriteAnalyticsData;
import ru.ozon.app.android.favorites.data.utils.AnalyticRefs;
import ru.ozon.app.android.favorites.data.utils.AnalyticUtilsKt;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/favorites/data/service/ChangeFavoriteAnalyticsData;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/favorites/data/service/ChangeFavoriteAnalyticsData;)Ljava/lang/Long;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoriteComposerActionExecutor$removeFromFavorites$1 extends AbstractC7737t implements Function1<ChangeFavoriteAnalyticsData, Long> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ AnalyticRefs $analyticRefs;
    final /* synthetic */ long $sku;
    final /* synthetic */ FavoriteComposerActionExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteComposerActionExecutor$removeFromFavorites$1(AnalyticRefs analyticRefs, AtomAction.ComposerAction composerAction, FavoriteComposerActionExecutor favoriteComposerActionExecutor, long j11) {
        super(1);
        this.$analyticRefs = analyticRefs;
        this.$action = composerAction;
        this.this$0 = favoriteComposerActionExecutor;
        this.$sku = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(ChangeFavoriteAnalyticsData it) {
        FavoriteManager favoriteManager;
        Intrinsics.checkNotNullParameter(it, "it");
        AnalyticUtilsKt.sendAnalytic(this.$analyticRefs, ActionType.UNFAVORITE.INSTANCE.getType(), this.$action.getTrackingInfo());
        favoriteManager = this.this$0.favoriteManager;
        FavoriteManager.DefaultImpls.removeFromFavorites$default(favoriteManager, this.$sku, null, 2, null);
        return Long.valueOf(this.$sku);
    }
}

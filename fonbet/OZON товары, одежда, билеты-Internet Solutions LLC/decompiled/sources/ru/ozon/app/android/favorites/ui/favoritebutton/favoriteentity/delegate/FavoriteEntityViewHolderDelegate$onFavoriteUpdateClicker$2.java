package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.delegate;

import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntityKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.restriction.RestrictionModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/restriction/RestrictionModel;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/restriction/RestrictionModel;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoriteEntityViewHolderDelegate$onFavoriteUpdateClicker$2 extends AbstractC7737t implements Function1<RestrictionModel, Unit> {
    final /* synthetic */ FavoriteEntity $entity;
    final /* synthetic */ FavoriteEntityViewHolderDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteEntityViewHolderDelegate$onFavoriteUpdateClicker$2(FavoriteEntity favoriteEntity, FavoriteEntityViewHolderDelegate favoriteEntityViewHolderDelegate) {
        super(1);
        this.$entity = favoriteEntity;
        this.this$0 = favoriteEntityViewHolderDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RestrictionModel restrictionModel) {
        invoke2(restrictionModel);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RestrictionModel restrictionModel) {
        Long l11;
        ComposerReferences composerReferences;
        Map<String, TokenizedTrackingInfo> buttonTrackingInfo = FavoriteEntityKt.getButtonTrackingInfo(this.$entity);
        if (buttonTrackingInfo != null) {
            l11 = this.this$0.widgetId;
            t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(buttonTrackingInfo, l11, null, 2, null);
            if (mapToTokenizedEvent$default != null) {
                composerReferences = this.this$0.composerReferences;
                TokenizedAnalyticsExtensionsKt.processComposerEvents$default(composerReferences.getTokenizedAnalytics(), mapToTokenizedEvent$default, null, 2, null);
            }
        }
        FavoriteEntityViewHolderDelegate favoriteEntityViewHolderDelegate = this.this$0;
        Intrinsics.f(restrictionModel);
        favoriteEntityViewHolderDelegate.showRestriction(restrictionModel);
    }
}

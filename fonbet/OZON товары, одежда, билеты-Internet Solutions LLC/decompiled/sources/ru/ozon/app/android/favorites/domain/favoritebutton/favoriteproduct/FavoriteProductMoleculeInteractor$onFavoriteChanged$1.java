package ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct;

import WZ.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteChangeResponse;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResponse;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoriteProductMoleculeInteractor$onFavoriteChanged$1 extends AbstractC7737t implements Function1<FavoriteChangeResponse, Unit> {
    final /* synthetic */ AnalyticData $analyticData;
    final /* synthetic */ Function1<Map<String, TokenizedTrackingInfo>, Unit> $fallbackAnalytics;
    final /* synthetic */ FavoriteProductMolecule $molecule;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ FavoriteProductMoleculeInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FavoriteProductMoleculeInteractor$onFavoriteChanged$1(l lVar, FavoriteProductMoleculeInteractor favoriteProductMoleculeInteractor, FavoriteProductMolecule favoriteProductMolecule, AnalyticData analyticData, Function1<? super Map<String, TokenizedTrackingInfo>, Unit> function1) {
        super(1);
        this.$tokenizedAnalytics = lVar;
        this.this$0 = favoriteProductMoleculeInteractor;
        this.$molecule = favoriteProductMolecule;
        this.$analyticData = analyticData;
        this.$fallbackAnalytics = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FavoriteChangeResponse favoriteChangeResponse) {
        invoke2(favoriteChangeResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FavoriteChangeResponse favoriteChangeResponse) {
        l lVar = this.$tokenizedAnalytics;
        if (lVar != null) {
            this.this$0.sendAnalytics(lVar, this.$molecule, this.$analyticData);
            return;
        }
        Function1<Map<String, TokenizedTrackingInfo>, Unit> function1 = this.$fallbackAnalytics;
        if (function1 != null) {
            function1.invoke(FavoriteProductMoleculeKt.getButton(this.$molecule).getTrackingInfo());
        }
    }
}

package ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct;

import Bc.r;
import Bc.u;
import io.reactivex.C;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import qc.o;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteChangeResponse;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteChangeResult;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.FavoriteProductMoleculeInteractor;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/FavoriteProductMoleculeInteractor$FavoriteChangeRequest;", "Lkotlin/jvm/internal/EnhancedNullability;", "request", "Lio/reactivex/C;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResult;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteproduct/FavoriteProductMoleculeInteractor$FavoriteChangeRequest;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class FavoriteProductMoleculeInteractor$observeRequests$1 extends AbstractC7737t implements Function1<FavoriteProductMoleculeInteractor.FavoriteChangeRequest, C<? extends FavoriteChangeResult>> {
    final /* synthetic */ FavoriteProductMoleculeInteractor this$0;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResult;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResponse;)Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/FavoriteChangeResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.FavoriteProductMoleculeInteractor$observeRequests$1$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<FavoriteChangeResponse, FavoriteChangeResult> {
        final /* synthetic */ FavoriteProductMoleculeInteractor.FavoriteChangeRequest $request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FavoriteProductMoleculeInteractor.FavoriteChangeRequest favoriteChangeRequest) {
            super(1);
            this.$request = favoriteChangeRequest;
        }

        @Override // kotlin.jvm.functions.Function1
        public final FavoriteChangeResult invoke(FavoriteChangeResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new FavoriteChangeResult.Success(this.$request.getMolecule().getSku(), it.getMolecule(), it.getNotification(), it.getNotificationPayloads());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteProductMoleculeInteractor$observeRequests$1(FavoriteProductMoleculeInteractor favoriteProductMoleculeInteractor) {
        super(1);
        this.this$0 = favoriteProductMoleculeInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FavoriteChangeResult invoke$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (FavoriteChangeResult) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FavoriteChangeResult invoke$lambda$1(FavoriteProductMoleculeInteractor.FavoriteChangeRequest favoriteChangeRequest, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new FavoriteChangeResult.Failure(favoriteChangeRequest.getMolecule().getSku(), it);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends FavoriteChangeResult> invoke(final FavoriteProductMoleculeInteractor.FavoriteChangeRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        y onFavoriteDefaultChange$default = request.getDefaultChange() ? FavoriteProductMoleculeInteractor.onFavoriteDefaultChange$default(this.this$0, request.getMolecule(), request.getTokenizedAnalytics(), request.getAnalyticData(), null, 8, null) : this.this$0.onFavoriteChanged(request.getMolecule(), request.getTokenizedAnalytics(), request.getAnalyticData(), request.getFallbackAnalytics());
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(request);
        o oVar = new o() { // from class: ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.a
            @Override // qc.o
            public final Object apply(Object obj) {
                FavoriteChangeResult invoke$lambda$0;
                invoke$lambda$0 = FavoriteProductMoleculeInteractor$observeRequests$1.invoke$lambda$0(Function1.this, obj);
                return invoke$lambda$0;
            }
        };
        onFavoriteDefaultChange$default.getClass();
        return new u(new r(onFavoriteDefaultChange$default, oVar), new o() { // from class: ru.ozon.app.android.favorites.domain.favoritebutton.favoriteproduct.b
            @Override // qc.o
            public final Object apply(Object obj) {
                FavoriteChangeResult invoke$lambda$1;
                invoke$lambda$1 = FavoriteProductMoleculeInteractor$observeRequests$1.invoke$lambda$1(FavoriteProductMoleculeInteractor.FavoriteChangeRequest.this, (Throwable) obj);
                return invoke$lambda$1;
            }
        });
    }
}

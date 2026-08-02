package ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller;

import Bc.u;
import io.reactivex.AbstractC7094b;
import io.reactivex.C;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import qc.o;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import vc.s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lkotlin/jvm/internal/EnhancedNullability;", "isFavorite", "Lio/reactivex/C;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class OtherSellerViewHolder$onFavoriteClick$1$1 extends AbstractC7737t implements Function1<Boolean, C<? extends Boolean>> {
    final /* synthetic */ long $productId;
    final /* synthetic */ OtherSellerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OtherSellerViewHolder$onFavoriteClick$1$1(OtherSellerViewHolder otherSellerViewHolder, long j11) {
        super(1);
        this.this$0 = otherSellerViewHolder;
        this.$productId = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean invoke$lambda$0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean invoke$lambda$1(Boolean bool, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C<? extends Boolean> invoke(final Boolean isFavorite) {
        FavoriteInteractor favoriteInteractor;
        Intrinsics.checkNotNullParameter(isFavorite, "isFavorite");
        favoriteInteractor = this.this$0.favoriteInteractor;
        AbstractC7094b addOrRemoveFavorite = favoriteInteractor.addOrRemoveFavorite(this.$productId, isFavorite.booleanValue());
        Callable callable = new Callable() { // from class: ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean invoke$lambda$0;
                invoke$lambda$0 = OtherSellerViewHolder$onFavoriteClick$1$1.invoke$lambda$0(isFavorite);
                return invoke$lambda$0;
            }
        };
        addOrRemoveFavorite.getClass();
        return new u(new s(addOrRemoveFavorite, callable), new o() { // from class: ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.f
            @Override // qc.o
            public final Object apply(Object obj) {
                Boolean invoke$lambda$1;
                invoke$lambda$1 = OtherSellerViewHolder$onFavoriteClick$1$1.invoke$lambda$1(isFavorite, (Throwable) obj);
                return invoke$lambda$1;
            }
        });
    }
}

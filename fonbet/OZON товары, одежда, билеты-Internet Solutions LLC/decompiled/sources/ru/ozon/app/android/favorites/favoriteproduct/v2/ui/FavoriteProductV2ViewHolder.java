package ru.ozon.app.android.favorites.favoriteproduct.v2.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.favoriteproduct.v2.ui.view.FavoriteProductV2View;
import ru.ozon.app.android.favorites.favoriteproduct.v2.ui.vo.FavoriteProductV2VO;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \"2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004:\u0001\"B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0012J*\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/favorites/favoriteproduct/v2/ui/FavoriteProductV2ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/favorites/favoriteproduct/v2/ui/vo/FavoriteProductV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "Lru/ozon/app/android/favorites/favoriteproduct/v2/ui/view/FavoriteProductV2View;", "containerView", "favProductDelegate", "<init>", "(Lru/ozon/app/android/favorites/favoriteproduct/v2/ui/view/FavoriteProductV2View;Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/favorites/favoriteproduct/v2/ui/vo/FavoriteProductV2VO;Ll20/d;)V", "onAttach", "()V", "onDetach", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "view", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;)V", "detachFavButtonView", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "Lru/ozon/app/android/favorites/favoriteproduct/v2/ui/view/FavoriteProductV2View;", "getContainerView", "()Lru/ozon/app/android/favorites/favoriteproduct/v2/ui/view/FavoriteProductV2View;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoriteProductV2ViewHolder extends k<FavoriteProductV2VO> implements FavoriteProductV4Delegate {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final /* synthetic */ FavoriteProductV4Delegate $$delegate_0;

    @NotNull
    private final FavoriteProductV2View containerView;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/favorites/favoriteproduct/v2/ui/FavoriteProductV2ViewHolder$Companion;", "", "<init>", "()V", "DISABLE_COLORING_TAG", "", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteProductV2ViewHolder(@NotNull FavoriteProductV2View containerView, @NotNull FavoriteProductV4Delegate favProductDelegate) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(favProductDelegate, "favProductDelegate");
        this.$$delegate_0 = favProductDelegate;
        this.containerView = containerView;
        containerView.setTag("NavBar disable color filtering");
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeV4ButtonView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.$$delegate_0.attachFavButtonView(view);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void bindFavoriteProductButton(@NotNull ProductFavoriteMoleculeV4ButtonView view, FavoriteProductModel molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.$$delegate_0.bindFavoriteProductButton(view, molecule, analyticData);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate
    public void detachFavButtonView() {
        this.$$delegate_0.detachFavButtonView();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        attachFavButtonView(this.containerView.getMoleculeView());
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        detachFavButtonView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FavoriteProductV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.setMargins(item.getMargins());
        bindFavoriteProductButton(this.containerView.getMoleculeView(), item.getMolecule(), new AnalyticData(getTrackingData(), getViewItem()));
    }
}

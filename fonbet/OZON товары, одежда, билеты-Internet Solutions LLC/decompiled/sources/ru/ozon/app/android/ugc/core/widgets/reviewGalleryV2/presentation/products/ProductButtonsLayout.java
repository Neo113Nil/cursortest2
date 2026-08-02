package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products;

import W10.c;
import WZ.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModelKt;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.delegate.FavoriteProductV4Delegate;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductContainerButtonBinder;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002,-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011Jw\u0010%\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000b\u0018\u00010 2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u000b¢\u0006\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "", "newItems", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout$BindParams;", "params", "", "updateItems", "(Ljava/util/List;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout$BindParams;)V", "item", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout$ProductButtonHolder;", "createHolder", "(Ljava/lang/Object;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout$BindParams;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout$ProductButtonHolder;", "buttons", "Lkotlin/Function0;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "favDelegateFactory", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/l;", "viewItem", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "analytics", "", "widgetId", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;", "cartButtonContainerBinder", "bind", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;LW10/c;Lru/ozon/composer/ui/widget/l;LWZ/l;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;)V", "clear", "()V", "", "holders", "Ljava/util/List;", "ProductButtonHolder", "BindParams", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class ProductButtonsLayout extends LinearLayout {

    @NotNull
    private final List<ProductButtonHolder> holders;

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0082\b\u0018\u00002\u00020\u0001Bc\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout$BindParams;", "", "Lkotlin/Function0;", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "favDelegateFactory", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/l;", "viewItem", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "analytics", "", "widgetId", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;", "cartButtonContainerBinder", "<init>", "(Lkotlin/jvm/functions/Function0;LW10/c;Lru/ozon/composer/ui/widget/l;LWZ/l;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function0;", "getFavDelegateFactory", "()Lkotlin/jvm/functions/Function0;", "LW10/c;", "getTrackingData", "()LW10/c;", "Lru/ozon/composer/ui/widget/l;", "getViewItem", "()Lru/ozon/composer/ui/widget/l;", "LWZ/l;", "getAnalytics", "()LWZ/l;", "Ljava/lang/Long;", "getWidgetId", "()Ljava/lang/Long;", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;", "getCartButtonContainerBinder", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class BindParams {
        private final Function1<AtomAction, Unit> actionHandler;
        private final l analytics;

        @NotNull
        private final ReviewGalleryV2ProductContainerButtonBinder cartButtonContainerBinder;

        @NotNull
        private final Function0<FavoriteProductV4Delegate> favDelegateFactory;

        @NotNull
        private final c trackingData;
        private final ru.ozon.composer.ui.widget.l viewItem;
        private final Long widgetId;

        /* JADX WARN: Multi-variable type inference failed */
        public BindParams(@NotNull Function0<? extends FavoriteProductV4Delegate> favDelegateFactory, @NotNull c trackingData, ru.ozon.composer.ui.widget.l lVar, l lVar2, Long l11, Function1<? super AtomAction, Unit> function1, @NotNull ReviewGalleryV2ProductContainerButtonBinder cartButtonContainerBinder) {
            Intrinsics.checkNotNullParameter(favDelegateFactory, "favDelegateFactory");
            Intrinsics.checkNotNullParameter(trackingData, "trackingData");
            Intrinsics.checkNotNullParameter(cartButtonContainerBinder, "cartButtonContainerBinder");
            this.favDelegateFactory = favDelegateFactory;
            this.trackingData = trackingData;
            this.viewItem = lVar;
            this.analytics = lVar2;
            this.widgetId = l11;
            this.actionHandler = function1;
            this.cartButtonContainerBinder = cartButtonContainerBinder;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BindParams)) {
                return false;
            }
            BindParams bindParams = (BindParams) other;
            return Intrinsics.d(this.favDelegateFactory, bindParams.favDelegateFactory) && Intrinsics.d(this.trackingData, bindParams.trackingData) && Intrinsics.d(this.viewItem, bindParams.viewItem) && Intrinsics.d(this.analytics, bindParams.analytics) && Intrinsics.d(this.widgetId, bindParams.widgetId) && Intrinsics.d(this.actionHandler, bindParams.actionHandler) && Intrinsics.d(this.cartButtonContainerBinder, bindParams.cartButtonContainerBinder);
        }

        public final Function1<AtomAction, Unit> getActionHandler() {
            return this.actionHandler;
        }

        public final l getAnalytics() {
            return this.analytics;
        }

        @NotNull
        public final ReviewGalleryV2ProductContainerButtonBinder getCartButtonContainerBinder() {
            return this.cartButtonContainerBinder;
        }

        @NotNull
        public final Function0<FavoriteProductV4Delegate> getFavDelegateFactory() {
            return this.favDelegateFactory;
        }

        @NotNull
        public final c getTrackingData() {
            return this.trackingData;
        }

        public final ru.ozon.composer.ui.widget.l getViewItem() {
            return this.viewItem;
        }

        public final Long getWidgetId() {
            return this.widgetId;
        }

        public int hashCode() {
            int hashCode = (this.trackingData.hashCode() + (this.favDelegateFactory.hashCode() * 31)) * 31;
            ru.ozon.composer.ui.widget.l lVar = this.viewItem;
            int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
            l lVar2 = this.analytics;
            int hashCode3 = (hashCode2 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
            Long l11 = this.widgetId;
            int hashCode4 = (hashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Function1<AtomAction, Unit> function1 = this.actionHandler;
            return this.cartButtonContainerBinder.hashCode() + ((hashCode4 + (function1 != null ? function1.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "BindParams(favDelegateFactory=" + this.favDelegateFactory + ", trackingData=" + this.trackingData + ", viewItem=" + this.viewItem + ", analytics=" + this.analytics + ", widgetId=" + this.widgetId + ", actionHandler=" + this.actionHandler + ", cartButtonContainerBinder=" + this.cartButtonContainerBinder + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0001H&J\b\u0010\u000f\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout$ProductButtonHolder;", "", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bind", "", "item", "params", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout$BindParams;", "canBind", "", "detach", "ToggleHolder", "FavoriteHolder", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout$ProductButtonHolder$FavoriteHolder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout$ProductButtonHolder$ToggleHolder;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static abstract class ProductButtonHolder {

        @NotNull
        private final View view;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout$ProductButtonHolder$FavoriteHolder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout$ProductButtonHolder;", "view", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "delegate", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;", "<init>", "(Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/delegate/FavoriteProductV4Delegate;)V", "getView", "()Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "bind", "", "item", "", "params", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout$BindParams;", "canBind", "", "detach", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class FavoriteHolder extends ProductButtonHolder {

            @NotNull
            private final FavoriteProductV4Delegate delegate;

            @NotNull
            private final ProductFavoriteMoleculeV4ButtonView view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FavoriteHolder(@NotNull ProductFavoriteMoleculeV4ButtonView view, @NotNull FavoriteProductV4Delegate delegate) {
                super(view, null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                this.view = view;
                this.delegate = delegate;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products.ProductButtonsLayout.ProductButtonHolder
            public void bind(@NotNull Object item, @NotNull BindParams params) {
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(params, "params");
                FavoriteProductModel model = FavoriteProductModelKt.toModel((FavoriteProductMoleculeV4) item);
                AnalyticData analyticData = new AnalyticData(params.getTrackingData(), params.getViewItem());
                this.delegate.attachFavButtonView(getView());
                this.delegate.bindFavoriteProductButton(getView(), model, analyticData);
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products.ProductButtonsLayout.ProductButtonHolder
            public boolean canBind(@NotNull Object item) {
                Intrinsics.checkNotNullParameter(item, "item");
                return item instanceof FavoriteProductMoleculeV4;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products.ProductButtonsLayout.ProductButtonHolder
            public void detach() {
                this.delegate.detachFavButtonView();
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products.ProductButtonsLayout.ProductButtonHolder
            @NotNull
            public ProductFavoriteMoleculeV4ButtonView getView() {
                return this.view;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout$ProductButtonHolder$ToggleHolder;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout$ProductButtonHolder;", "view", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "cartButtonContainerBinder", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;", "<init>", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/ReviewGalleryV2ProductContainerButtonBinder;)V", "getView", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "bind", "", "item", "", "params", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/presentation/products/ProductButtonsLayout$BindParams;", "canBind", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ToggleHolder extends ProductButtonHolder {

            @NotNull
            private final ReviewGalleryV2ProductContainerButtonBinder cartButtonContainerBinder;

            @NotNull
            private final IconButtonV3View view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ToggleHolder(@NotNull IconButtonV3View view, @NotNull ReviewGalleryV2ProductContainerButtonBinder cartButtonContainerBinder) {
                super(view, null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(cartButtonContainerBinder, "cartButtonContainerBinder");
                this.view = view;
                this.cartButtonContainerBinder = cartButtonContainerBinder;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products.ProductButtonsLayout.ProductButtonHolder
            public void bind(@NotNull Object item, @NotNull BindParams params) {
                AtomActionDTO action;
                Intrinsics.checkNotNullParameter(item, "item");
                Intrinsics.checkNotNullParameter(params, "params");
                ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemToggleButton productItemToggleButton = (ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemToggleButton) item;
                l analytics = params.getAnalytics();
                Long widgetId = params.getWidgetId();
                Function1<AtomAction, Unit> actionHandler = params.getActionHandler();
                CommonControlSettings common = productItemToggleButton.getNormal().getCommon();
                if (!Intrinsics.d((common == null || (action = common.getAction()) == null) ? null : action.getId(), "addToCart")) {
                    IconButtonV3HolderKt.bindOrGone(getView(), productItemToggleButton.isSelected() ? productItemToggleButton.getSelected() : productItemToggleButton.getNormal(), actionHandler);
                } else if (analytics != null) {
                    this.cartButtonContainerBinder.bindOrGone(getView(), productItemToggleButton.getNormal(), productItemToggleButton.getSelected(), analytics, widgetId);
                }
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products.ProductButtonsLayout.ProductButtonHolder
            public boolean canBind(@NotNull Object item) {
                Intrinsics.checkNotNullParameter(item, "item");
                return item instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemToggleButton;
            }

            @Override // ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products.ProductButtonsLayout.ProductButtonHolder
            @NotNull
            public IconButtonV3View getView() {
                return this.view;
            }
        }

        public /* synthetic */ ProductButtonHolder(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        public abstract void bind(@NotNull Object item, @NotNull BindParams params);

        public abstract boolean canBind(@NotNull Object item);

        public void detach() {
        }

        @NotNull
        public View getView() {
            return this.view;
        }

        private ProductButtonHolder(View view) {
            this.view = view;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductButtonsLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.holders = new ArrayList();
        setOrientation(0);
    }

    private final ProductButtonHolder createHolder(Object item, BindParams params) {
        if (item instanceof ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemToggleButton) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
            iconButtonV3View.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            iconButtonV3View.setSize(IconButtonV3DTO.Sizes.SIZE_400);
            return new ProductButtonHolder.ToggleHolder(iconButtonV3View, params.getCartButtonContainerBinder());
        }
        if (!(item instanceof FavoriteProductMoleculeV4)) {
            return null;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView = new ProductFavoriteMoleculeV4ButtonView(context2, null, 0, 6, null);
        Dimens dimens = Dimens.INSTANCE;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimens.getDP_32(), dimens.getDP_32());
        layoutParams.setMarginStart(dimens.getDP_8());
        productFavoriteMoleculeV4ButtonView.setLayoutParams(layoutParams);
        return new ProductButtonHolder.FavoriteHolder(productFavoriteMoleculeV4ButtonView, params.getFavDelegateFactory().invoke());
    }

    private final void updateItems(List<? extends Object> newItems, BindParams params) {
        while (this.holders.size() > newItems.size()) {
            ProductButtonHolder productButtonHolder = (ProductButtonHolder) C7714v.x0(this.holders);
            if (productButtonHolder != null) {
                productButtonHolder.detach();
                removeView(productButtonHolder.getView());
            }
        }
        int i11 = 0;
        for (Object obj : newItems) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            if (i11 < this.holders.size()) {
                ProductButtonHolder productButtonHolder2 = this.holders.get(i11);
                if (productButtonHolder2.canBind(obj)) {
                    productButtonHolder2.bind(obj, params);
                } else {
                    productButtonHolder2.detach();
                    removeView(productButtonHolder2.getView());
                    ProductButtonHolder createHolder = createHolder(obj, params);
                    if (createHolder != null) {
                        this.holders.set(i11, createHolder);
                        addView(createHolder.getView(), i11);
                        createHolder.bind(obj, params);
                    }
                }
            } else {
                ProductButtonHolder createHolder2 = createHolder(obj, params);
                if (createHolder2 != null) {
                    this.holders.add(createHolder2);
                    addView(createHolder2.getView());
                    createHolder2.bind(obj, params);
                }
            }
            i11 = i12;
        }
    }

    public final void bind(@NotNull List<? extends Object> buttons, @NotNull Function0<? extends FavoriteProductV4Delegate> favDelegateFactory, @NotNull c trackingData, ru.ozon.composer.ui.widget.l viewItem, l analytics, Long widgetId, Function1<? super AtomAction, Unit> actionHandler, @NotNull ReviewGalleryV2ProductContainerButtonBinder cartButtonContainerBinder) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(favDelegateFactory, "favDelegateFactory");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(cartButtonContainerBinder, "cartButtonContainerBinder");
        if (buttons.isEmpty()) {
            clear();
            ViewExtKt.gone(this);
        } else {
            updateItems(buttons, new BindParams(favDelegateFactory, trackingData, viewItem, analytics, widgetId, actionHandler, cartButtonContainerBinder));
            ViewExtKt.show(this);
        }
    }

    public final void clear() {
        Iterator<T> it = this.holders.iterator();
        while (it.hasNext()) {
            ((ProductButtonHolder) it.next()).detach();
        }
        this.holders.clear();
        removeAllViews();
    }
}

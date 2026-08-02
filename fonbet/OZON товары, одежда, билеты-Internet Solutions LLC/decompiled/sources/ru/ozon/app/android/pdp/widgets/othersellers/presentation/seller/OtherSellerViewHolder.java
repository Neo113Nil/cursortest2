package ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller;

import B90.E;
import Bc.m;
import GZ.g;
import Sc.InterfaceC4008j;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.C;
import io.reactivex.p;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteAdd;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteRemove;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.pdp.R$string;
import ru.ozon.app.android.pdp.databinding.WidgetOtherSellersSellerBinding;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.base.BindingWidgetViewHolder;
import ru.ozon.app.android.pdp.ui.configurators.ugc.info.PdpInfoFragment;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.othersellers.data.OtherSellersDTO;
import ru.ozon.app.android.pdp.widgets.othersellers.presentation.OtherSellersViewModel;
import ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.OtherSellerVO;
import ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.OtherSellerViewHolder;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import uZ.C9992d;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u0016J\u000f\u0010\u001e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u0016J+\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\u00142\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u00020\u00142\b\u0010/\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00142\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00109\u001a\u00020\u00142\u000e\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106H\u0002¢\u0006\u0004\b9\u0010:J\u0019\u0010=\u001a\u00020\u00142\b\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00142\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u00142\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00142\u0006\u0010G\u001a\u00020\u0004H\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0014H\u0002¢\u0006\u0004\bJ\u0010\u0016J\u001b\u0010M\u001a\u00020\u0014*\u00020K2\u0006\u0010L\u001a\u00020#H\u0002¢\u0006\u0004\bM\u0010NR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010RR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010SR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010TR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010UR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010VR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\"\u0010\\\u001a\u0010\u0012\f\u0012\n [*\u0004\u0018\u00010\u00020\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R \u0010`\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020\u00140^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001d\u0010j\u001a\u0004\u0018\u00010e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001d\u0010m\u001a\u0004\u0018\u00010e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010g\u001a\u0004\bl\u0010i¨\u0006n"}, d2 = {"Lru/ozon/app/android/pdp/widgets/othersellers/presentation/seller/OtherSellerViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/base/BindingWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/othersellers/presentation/seller/OtherSellerVO;", "Lru/ozon/app/android/pdp/databinding/WidgetOtherSellersSellerBinding;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "favoriteInteractor", "Lru/ozon/app/android/pdp/widgets/othersellers/presentation/OtherSellersViewModel;", "viewModel", "LGZ/g;", "ozonRouter", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;Lru/ozon/app/android/pdp/widgets/othersellers/presentation/OtherSellersViewModel;LGZ/g;LWZ/l;)V", "", "onViewInVisibleBounds", "()V", "onAttach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/othersellers/presentation/seller/OtherSellerVO;Ll20/d;)V", "onCardClicked", "onLegalInfoClicked", "model", "Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;", "event", "Lkotlin/Pair;", "", "mapFavoriteByEvent", "(Lru/ozon/app/android/pdp/widgets/othersellers/presentation/seller/OtherSellerVO;Lru/ozon/app/android/favorites/domain/favoritemanager/model/FavoriteEvent;)Lkotlin/Pair;", "Lru/ozon/app/android/pdp/widgets/othersellers/presentation/seller/OtherSellerVO$LegalInfo;", "legalInfo", "bindLegalInfo", "(Lru/ozon/app/android/pdp/widgets/othersellers/presentation/seller/OtherSellerVO$LegalInfo;)V", "", "deeplink", "bindClickable", "(Ljava/lang/String;)V", "Lru/ozon/uni/atoms/data/badge/Badge;", "label", "bindLabel", "(Lru/ozon/uni/atoms/data/badge/Badge;)V", "Lru/ozon/uni/atoms/data/price/Price;", "price", "bindPrice", "(Lru/ozon/uni/atoms/data/price/Price;)V", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "cells", "bindCells", "(Ljava/util/List;)V", "Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$Rating;", "rating", "bindRating", "(Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$Rating;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "bindName", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "id", "populateInCartButton", "(J)V", "view", "onFavoriteClick", "(Landroid/view/View;)V", "onAddToCartClick", "Landroid/widget/ImageView;", "isFavorite", "setSelectedFavorite", "(Landroid/widget/ImageView;Z)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "Lru/ozon/app/android/pdp/widgets/othersellers/presentation/OtherSellersViewModel;", "LGZ/g;", "LWZ/l;", "seller", "Lru/ozon/app/android/pdp/widgets/othersellers/presentation/seller/OtherSellerVO;", "LL9/b;", "kotlin.jvm.PlatformType", "sellerListener", "LL9/b;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Landroid/graphics/drawable/Drawable;", "filledDrawable$delegate", "LSc/j;", "getFilledDrawable", "()Landroid/graphics/drawable/Drawable;", "filledDrawable", "nonFilledDrawable$delegate", "getNonFilledDrawable", "nonFilledDrawable", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OtherSellerViewHolder extends BindingWidgetViewHolder<OtherSellerVO, WidgetOtherSellersSellerBinding> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final View containerView;

    @NotNull
    private final FavoriteInteractor favoriteInteractor;

    /* renamed from: filledDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j filledDrawable;

    /* renamed from: nonFilledDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j nonFilledDrawable;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final ComposerReferences refs;
    private OtherSellerVO seller;

    @NotNull
    private final L9.b<OtherSellerVO> sellerListener;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final OtherSellersViewModel viewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.OtherSellerViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetOtherSellersSellerBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetOtherSellersSellerBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/databinding/WidgetOtherSellersSellerBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetOtherSellersSellerBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetOtherSellersSellerBinding.bind(p02);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/databinding/WidgetOtherSellersSellerBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.OtherSellerViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<WidgetOtherSellersSellerBinding, Unit> {

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.OtherSellerViewHolder$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
            final /* synthetic */ OtherSellerViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(OtherSellerViewHolder otherSellerViewHolder) {
                super(1);
                this.this$0 = otherSellerViewHolder;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.f71690a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Map<String, TokenizedTrackingInfo> trackingInfo;
                Intrinsics.checkNotNullParameter(it, "it");
                l lVar = this.this$0.tokenizedAnalytics;
                OtherSellerVO otherSellerVO = this.this$0.seller;
                t tVar = null;
                if (otherSellerVO != null && (trackingInfo = otherSellerVO.getTrackingInfo()) != null) {
                    OtherSellerVO otherSellerVO2 = (OtherSellerVO) this.this$0.getBoundedData();
                    tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, otherSellerVO2 != null ? Long.valueOf(otherSellerVO2.getId()) : null, null, 2, null);
                }
                TokenizedAnalyticsExtKt.processNonViewEvents(lVar, tVar);
                this.this$0.onCardClicked();
            }
        }

        AnonymousClass2() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1(OtherSellerViewHolder otherSellerViewHolder, View view) {
            Intrinsics.f(view);
            otherSellerViewHolder.onFavoriteClick(view);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WidgetOtherSellersSellerBinding widgetOtherSellersSellerBinding) {
            invoke2(widgetOtherSellersSellerBinding);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(WidgetOtherSellersSellerBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "$this$binding");
            binding.atomsVal.setAdapter(OtherSellerViewHolder.this.atomsAdapter);
            CardView otherSellerCv = binding.otherSellerCv;
            Intrinsics.checkNotNullExpressionValue(otherSellerCv, "otherSellerCv");
            ViewExtKt.setOnClickListenerThrottle$default(otherSellerCv, 0L, new AnonymousClass1(OtherSellerViewHolder.this), 1, null);
            ImageView imageView = binding.legalInfoIv;
            final OtherSellerViewHolder otherSellerViewHolder = OtherSellerViewHolder.this;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OtherSellerViewHolder.access$onLegalInfoClicked(OtherSellerViewHolder.this);
                }
            });
            ImageView imageView2 = binding.favoriteIb;
            final OtherSellerViewHolder otherSellerViewHolder2 = OtherSellerViewHolder.this;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OtherSellerViewHolder.AnonymousClass2.invoke$lambda$1(OtherSellerViewHolder.this, view);
                }
            });
            TextView textView = binding.addToCartTv;
            final OtherSellerViewHolder otherSellerViewHolder3 = OtherSellerViewHolder.this;
            textView.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OtherSellerViewHolder.access$onAddToCartClick(OtherSellerViewHolder.this);
                }
            });
            VectorRatingBar vectorRatingBar = binding.sellerRb;
            final OtherSellerViewHolder otherSellerViewHolder4 = OtherSellerViewHolder.this;
            vectorRatingBar.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OtherSellerViewHolder.access$onCardClicked(OtherSellerViewHolder.this);
                }
            });
            binding.sellerNameTa.setTextIsSelectable(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtherSellerViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull CartService cartService, @NotNull FavoriteInteractor favoriteInteractor, @NotNull OtherSellersViewModel viewModel, @NotNull g ozonRouter, @NotNull l tokenizedAnalytics) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(favoriteInteractor, "favoriteInteractor");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.refs = refs;
        this.cartService = cartService;
        this.favoriteInteractor = favoriteInteractor;
        this.viewModel = viewModel;
        this.ozonRouter = ozonRouter;
        this.tokenizedAnalytics = tokenizedAnalytics;
        L9.b<OtherSellerVO> c11 = L9.b.c();
        Intrinsics.checkNotNullExpressionValue(c11, "create(...)");
        this.sellerListener = c11;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(buildHandler);
        this.atomsAdapter = atomsAdapter;
        this.filledDrawable = DelegatesKt.lazyUnsafe(new OtherSellerViewHolder$filledDrawable$2(this));
        this.nonFilledDrawable = DelegatesKt.lazyUnsafe(new OtherSellerViewHolder$nonFilledDrawable$2(this));
        binding(new AnonymousClass2());
        viewModel.attachTokenizedAnalytics(tokenizedAnalytics);
    }

    public static final /* synthetic */ void access$onAddToCartClick(OtherSellerViewHolder otherSellerViewHolder) {
        otherSellerViewHolder.onAddToCartClick();
    }

    public static final /* synthetic */ void access$onCardClicked(OtherSellerViewHolder otherSellerViewHolder) {
        otherSellerViewHolder.onCardClicked();
    }

    public static final /* synthetic */ void access$onLegalInfoClicked(OtherSellerViewHolder otherSellerViewHolder) {
        otherSellerViewHolder.onLegalInfoClicked();
    }

    private final void bindCells(List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> cells) {
        VerticalAtomsLayout verticalAtomsLayout = getBinding().atomsVal;
        if (cells == null) {
            Intrinsics.f(verticalAtomsLayout);
            ViewExtKt.gone(verticalAtomsLayout);
            return;
        }
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        Context context = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, cells);
        ViewExtKt.show(verticalAtomsLayout);
    }

    private final void bindClickable(String deeplink) {
        binding(new OtherSellerViewHolder$bindClickable$1(deeplink));
    }

    private final void bindLabel(Badge label) {
        BadgeView sellerLa = getBinding().sellerLa;
        Intrinsics.checkNotNullExpressionValue(sellerLa, "sellerLa");
        BadgeHolderKt.bindOrGone(sellerLa, label, this.actionHandler);
    }

    private final void bindLegalInfo(OtherSellerVO.LegalInfo legalInfo) {
        ImageView legalInfoIv = getBinding().legalInfoIv;
        Intrinsics.checkNotNullExpressionValue(legalInfoIv, "legalInfoIv");
        ImageViewExtKt.loadImageOrGone(legalInfoIv, legalInfo != null ? legalInfo.getImage() : null);
    }

    private final void bindName(TextDTO name) {
        TextAtomV2View sellerNameTa = getBinding().sellerNameTa;
        Intrinsics.checkNotNullExpressionValue(sellerNameTa, "sellerNameTa");
        TextHolderKt.bind$default(sellerNameTa, name, null, 2, null);
    }

    private final void bindPrice(Price price) {
        PriceView priceView = getBinding().sellerPricePa;
        Intrinsics.f(priceView);
        PriceHolderKt.bind$default(priceView, price, null, 2, null);
        priceView.setContentDescription(String.valueOf(price.getPrice()));
    }

    private final void bindRating(OtherSellersDTO.Seller.Rating rating) {
        binding(new OtherSellerViewHolder$bindRating$1(rating));
    }

    private final Drawable getFilledDrawable() {
        return (Drawable) this.filledDrawable.getValue();
    }

    private final Drawable getNonFilledDrawable() {
        return (Drawable) this.nonFilledDrawable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Boolean, Boolean> mapFavoriteByEvent(OtherSellerVO model, FavoriteEvent event) {
        if (event instanceof FavoriteAdd) {
            return new Pair<>(Boolean.valueOf(((FavoriteAdd) event).getSku() == model.getId()), Boolean.TRUE);
        }
        if (event instanceof FavoriteRemove) {
            return new Pair<>(Boolean.valueOf(((FavoriteRemove) event).getSku() == model.getId()), Boolean.FALSE);
        }
        Boolean bool = Boolean.FALSE;
        return new Pair<>(bool, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAddToCartClick() {
        OtherSellerVO otherSellerVO = this.seller;
        if (otherSellerVO != null) {
            if (CartService.DefaultImpls.isProductInCart$default(this.cartService, otherSellerVO.getProductId(), null, 2, null)) {
                ComposerNavigator navigator = this.refs.getNavigator();
                String uri = LinkGenerator.INSTANCE.cart().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, uri, null, 2, null);
                return;
            }
            this.viewModel.addToCart(otherSellerVO.getId(), otherSellerVO.getProductId(), otherSellerVO.getTrackingInfo(), otherSellerVO.getParams(), otherSellerVO.getSelectedDeliverySchema() != null ? Long.valueOf(r0.intValue()) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttach$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair onAttach$lambda$2(Function2 function2, Object p02, Object p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (Pair) function2.invoke(p02, p12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttach$lambda$3(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean onAttach$lambda$4(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Boolean) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCardClicked() {
        String deeplink;
        OtherSellerVO otherSellerVO = this.seller;
        if (otherSellerVO == null || (deeplink = otherSellerVO.getDeeplink()) == null) {
            return;
        }
        ComposerNavigator.DefaultImpls.openDeeplink$default(this.refs.getNavigator(), deeplink, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFavoriteClick(View view) {
        OtherSellerVO otherSellerVO = this.seller;
        if (otherSellerVO != null) {
            long productId = otherSellerVO.getProductId();
            boolean isSelected = view.isSelected();
            view.setSelected(!isSelected);
            Bc.t g10 = new m(this.favoriteInteractor.isFavorite(productId).j(Mc.a.b()), new DM.f(new OtherSellerViewHolder$onFavoriteClick$1$1(this, productId), 9)).g(C8125a.a());
            Intrinsics.checkNotNullExpressionValue(g10, "observeOn(...)");
            RxExtKt.subscribe(g10, this, new OtherSellerViewHolder$onFavoriteClick$1$2(this, otherSellerVO), new OtherSellerViewHolder$onFavoriteClick$1$3(view, isSelected));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C onFavoriteClick$lambda$12$lambda$11(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onLegalInfoClicked() {
        OtherSellerVO.LegalInfo legalInfo;
        OtherSellerVO otherSellerVO = this.seller;
        if (otherSellerVO == null || (legalInfo = otherSellerVO.getLegalInfo()) == null) {
            return;
        }
        TokenizedAnalyticsExtKt.processClickEvents(this.tokenizedAnalytics, legalInfo.getTokenizedEvent());
        g gVar = this.ozonRouter;
        Intrinsics.checkNotNullExpressionValue("PdpInfoFragment", "getSimpleName(...)");
        gVar.c(new LZ.b(new C9992d(new sZ.c("PdpInfoFragment", PdpInfoFragment.INSTANCE.newInstance(null, legalInfo.getText()), null, false, false, null, false, false, false, 508, null), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0)), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void populateInCartButton(long id2) {
        TextView textView = getBinding().addToCartTv;
        boolean isProductInCart$default = CartService.DefaultImpls.isProductInCart$default(this.cartService, id2, null, 2, null);
        textView.setSelected(isProductInCart$default);
        String string = StringProvider.getString(R$string.common_add_to_cart);
        String string2 = StringProvider.getString(ru.ozon.app.android.uikit.R$string.common_button_go_to_cart);
        if (isProductInCart$default) {
            string = string2;
        }
        textView.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSelectedFavorite(ImageView imageView, boolean z11) {
        imageView.setSelected(z11);
        imageView.setImageDrawable(z11 ? getFilledDrawable() : getNonFilledDrawable());
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        int i11 = 12;
        p observeOn = this.favoriteInteractor.favoriteChangeEvents().subscribeOn(Mc.a.a()).filter(new DM.b(OtherSellerViewHolder$onAttach$1.INSTANCE, 11)).withLatestFrom(this.sellerListener, new E(new OtherSellerViewHolder$onAttach$2(this), 8)).filter(new Fw.b(OtherSellerViewHolder$onAttach$3.INSTANCE, i11)).map(new DM.e(OtherSellerViewHolder$onAttach$4.INSTANCE, i11)).observeOn(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
        RxExtKt.observe$default(observeOn, this, new OtherSellerViewHolder$onAttach$5(this), OtherSellerViewHolder$onAttach$6.INSTANCE, null, 8, null);
        p observeOn2 = CartService.DefaultImpls.observeCartState$default(this.cartService, false, 1, null).observeOn(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "observeOn(...)");
        RxExtKt.observe$default(observeOn2, this, new OtherSellerViewHolder$onAttach$7(this), new OtherSellerViewHolder$onAttach$8(Lm0.a.f17149a), null, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        super.onViewInVisibleBounds();
        l lVar = this.tokenizedAnalytics;
        OtherSellerVO otherSellerVO = this.seller;
        t tVar = null;
        if (otherSellerVO != null && (trackingInfo = otherSellerVO.getTrackingInfo()) != null) {
            OtherSellerVO otherSellerVO2 = (OtherSellerVO) getBoundedData();
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, otherSellerVO2 != null ? Long.valueOf(otherSellerVO2.getId()) : null, null, 2, null);
        }
        TokenizedAnalyticsExtKt.processViewEvents(lVar, tVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OtherSellerVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.seller = item;
        this.sellerListener.accept(item);
        long productId = item.getProductId();
        Bc.t g10 = this.favoriteInteractor.isFavorite(productId).j(Mc.a.b()).g(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(g10, "observeOn(...)");
        RxExtKt.subscribe(g10, this, new OtherSellerViewHolder$bind$1(this), OtherSellerViewHolder$bind$2.INSTANCE);
        populateInCartButton(productId);
        bindLegalInfo(item.getLegalInfo());
        bindClickable(item.getDeeplink());
        bindLabel(item.getLabel());
        bindPrice(item.getPrice());
        bindRating(item.getRating());
        bindCells(item.getCells());
        bindName(item.getName());
    }
}

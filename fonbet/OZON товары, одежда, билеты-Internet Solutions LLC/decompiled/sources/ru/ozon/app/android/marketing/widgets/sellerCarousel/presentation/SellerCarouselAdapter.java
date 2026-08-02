package ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation;

import AJ.d;
import BY.g;
import Lc0.e;
import Lm0.a;
import Ue0.C4066a;
import W10.c;
import WZ.l;
import WZ.t;
import a00.C4911f;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.p;
import io.reactivex.y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.account.adult.ui.AdultListener;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.account.favorites.seller.api.SellerActionResponse;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.v3.holders.ratingbadge.RatingBadgeHolderKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerVO;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.view.SellerCarouselItemAllView;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.view.SellerCarouselItemView;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.R$plurals;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleAdapter;
import ru.ozon.app.android.utils.PriceUtilsKt;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u0093\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007*\u0001L\b\u0001\u0018\u0000 O2\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0003OPQBO\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J#\u0010%\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010(J#\u0010*\u001a\u00020\u001a2\n\u0010)\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u001a¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00103R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00105R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00106R\u0018\u0010\u0015\u001a\u00060\u0013j\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00107R6\u0010:\u001a\b\u0012\u0004\u0012\u00020.082\f\u00109\u001a\b\u0012\u0004\u0012\u00020.088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010B\u001a\n\u0018\u00010@j\u0004\u0018\u0001`A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006R"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleAdapter;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselViewHolder;", "parentViewHolder", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "sellerFavoriteService", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "favoriteEventManager", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "<init>", "(Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselViewHolder;Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;Lru/ozon/app/android/composer/ComposerNavigator;LWZ/l;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;La00/f;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "onAttachedToRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onDetachedFromRecyclerView", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "getItemCount", "()I", "holder", "onBindViewHolder", "(Ljk0/j;I)V", "detachAll", "()V", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerVO;", "getItem", "(I)Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerVO;", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "Lru/ozon/app/android/composer/ComposerNavigator;", "LWZ/l;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "La00/f;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "LW10/c;", "getTrackingData", "()LW10/c;", "setTrackingData", "(LW10/c;)V", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerVO$ProductVO;", "clickedProduct", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerVO$ProductVO;", "ru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselAdapter$adultListener$1", "adultListener", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselAdapter$adultListener$1;", "Companion", "SellerViewHolder", "ShowAllViewHolder", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SellerCarouselAdapter extends LifecycleAdapter<j> {

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final SellerCarouselAdapter$adultListener$1 adultListener;
    private SellerVO.ProductVO clickedProduct;

    @NotNull
    private final C4911f container;

    @NotNull
    private final FavoriteEventManager favoriteEventManager;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private List<SellerVO> items;

    @NotNull
    private final ComposerNavigator navigator;
    private RecyclerView recyclerView;

    @NotNull
    private final SellerFavoriteService sellerFavoriteService;

    @NotNull
    private final l tokenizedAnalytics;
    private c trackingData;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "favorites", "", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/util/Map;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselAdapter$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Map<Long, ? extends Boolean>, Boolean> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Map<Long, ? extends Boolean> map) {
            return invoke2((Map<Long, Boolean>) map);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Map<Long, Boolean> favorites) {
            Intrinsics.checkNotNullParameter(favorites, "favorites");
            List<SellerVO> items = SellerCarouselAdapter.this.getItems();
            ArrayList arrayList = new ArrayList();
            for (Object obj : items) {
                SellerVO sellerVO = (SellerVO) obj;
                if (favorites.containsKey(Long.valueOf(sellerVO.getSellerId())) && !Intrinsics.d(favorites.get(Long.valueOf(sellerVO.getSellerId())), Boolean.valueOf(sellerVO.getIsFavorite()))) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                ((SellerVO) it.next()).setFavorite(!r0.getIsFavorite());
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0001¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselAdapter$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Boolean, Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselAdapter$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<Boolean, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            SellerCarouselAdapter.this.notifyDataSetChanged();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselAdapter$4, reason: invalid class name */
    /* synthetic */ class AnonymousClass4 extends C7735q implements Function1<Throwable, Unit> {
        AnonymousClass4(Object obj) {
            super(1, obj, a.b.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            ((a.b) this.receiver).e(th2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselAdapter$Companion;", "", "<init>", "()V", "SELLER", "", "SHOW_ALL", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u0019J\u0017\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010\u0019J\u0017\u0010$\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b$\u0010\u0019J\u0017\u0010%\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010\u0019J\u0017\u0010'\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010\u0019J#\u0010(\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00162\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b(\u0010)J+\u0010.\u001a\u00020\u00112\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00112\u0006\u00100\u001a\u00020,H\u0002¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\u00020\u00112\f\u00104\u001a\b\u0012\u0004\u0012\u00020\n03H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b7\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00109R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010:R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010;R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010<R\u001c\u0010?\u001a\n >*\u0004\u0018\u00010=0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010&\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010DR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselAdapter$SellerViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/view/SellerCarouselItemView;", "view", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "sellerFavoriteService", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerVO$ProductVO;", "adultListDelegate", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "<init>", "(Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselAdapter;Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/view/SellerCarouselItemView;Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;Lru/ozon/app/android/account/adult/presenter/AdultHandler;Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;La00/f;)V", "", "onDetach", "()V", "onAttach", "onViewInVisibleBounds", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerVO;", "seller", "bind", "(Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerVO;)V", "bindTitle", "bindSubtitle", "bindPremium", "bindRating", "bindLogo", "", "isFavorite", "bindFavorite", "(Z)V", "bindCount", "bindProducts", "trackView", "item", "onSellerClick", "onFavoritesClick", "(Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerVO;La00/f;)V", "", "message", "", "icon", "showMessage", "(Ljava/lang/String;ILa00/f;)V", "position", "onProductClick", "(I)V", "", "items", "bindImages", "(Ljava/util/List;)V", "bindPrice", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/view/SellerCarouselItemView;", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegate;", "La00/f;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerVO;", "Lnc/b;", "disposable", "Lnc/b;", "favoriteDisposable", "", "Landroidx/appcompat/widget/AppCompatTextView;", "prices", "[Landroidx/appcompat/widget/AppCompatTextView;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SellerViewHolder extends j {

        @NotNull
        private final AdultHandler adultHandler;

        @NotNull
        private final AdultListDelegate<SellerVO.ProductVO> adultListDelegate;

        @NotNull
        private final C4911f container;
        private final Context context;
        private InterfaceC8487b disposable;
        private InterfaceC8487b favoriteDisposable;
        private SellerVO item;

        @NotNull
        private final AppCompatTextView[] prices;

        @NotNull
        private final SellerFavoriteService sellerFavoriteService;
        final /* synthetic */ SellerCarouselAdapter this$0;

        @NotNull
        private final SellerCarouselItemView view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SellerViewHolder(@NotNull SellerCarouselAdapter sellerCarouselAdapter, @NotNull SellerCarouselItemView view, @NotNull SellerFavoriteService sellerFavoriteService, @NotNull AdultHandler adultHandler, @NotNull AdultListDelegate<SellerVO.ProductVO> adultListDelegate, C4911f container) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(sellerFavoriteService, "sellerFavoriteService");
            Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
            Intrinsics.checkNotNullParameter(adultListDelegate, "adultListDelegate");
            Intrinsics.checkNotNullParameter(container, "container");
            this.this$0 = sellerCarouselAdapter;
            this.view = view;
            this.sellerFavoriteService = sellerFavoriteService;
            this.adultHandler = adultHandler;
            this.adultListDelegate = adultListDelegate;
            this.container = container;
            this.context = view.getContext();
            this.prices = new AppCompatTextView[]{view.getPriceView1(), view.getPriceView2(), view.getPriceView3()};
            view.setOnClickListener(new e(4, sellerCarouselAdapter, this));
            view.getFavoriteButton().setOnClickListener(new Lk.a(2, sellerCarouselAdapter, this));
            view.getPreview1().setOnClickListener(new Dc0.j(this, 6));
            view.getPreview2().setOnClickListener(new CC.a(this, 7));
            view.getPreview3().setOnClickListener(new CD.a(this, 4));
            ThemeExtKt.setParandjaForDarkTheme(view.getLogo());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(SellerCarouselAdapter sellerCarouselAdapter, SellerViewHolder sellerViewHolder, View view) {
            SellerVO item = sellerCarouselAdapter.getItem(sellerViewHolder.getAdapterPosition());
            if (item == null) {
                return;
            }
            sellerViewHolder.onSellerClick(item);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$1(SellerCarouselAdapter sellerCarouselAdapter, SellerViewHolder sellerViewHolder, View view) {
            SellerVO item = sellerCarouselAdapter.getItem(sellerViewHolder.getAdapterPosition());
            if (item == null) {
                return;
            }
            sellerViewHolder.onFavoritesClick(item, sellerViewHolder.container);
        }

        private final void bindCount(SellerVO seller) {
            AppCompatTextView count = this.view.getCount();
            Integer productsCount = seller.getProductsCount();
            String str = null;
            if (productsCount != null && productsCount.intValue() == 0) {
                productsCount = null;
            }
            if (productsCount != null) {
                int intValue = productsCount.intValue();
                str = StringProvider.getQuantityString(R$plurals.marketing_seller_carousel_product_count_plural, intValue, Integer.valueOf(intValue));
            }
            TextViewExtKt.setTextOrGone(count, str);
        }

        private final void bindFavorite(boolean isFavorite) {
            ImageViewExtKt.setVectorDrawable(this.view.getFavoriteButton(), isFavorite ? R$drawable.ic_m_fav_tiles_active : R$drawable.ic_m_fav_tiles_normal);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void bindImages(List<SellerVO.ProductVO> items) {
            AdultImageView.Image image;
            AdultImageView.Image image2;
            AdultImageView.Image image3;
            SellerVO.ProductVO productVO = (SellerVO.ProductVO) C7714v.Q(0, items);
            if (productVO != null && (image3 = productVO.getImage()) != null) {
                this.view.getPreview1().bind(image3);
            }
            SellerVO.ProductVO productVO2 = (SellerVO.ProductVO) C7714v.Q(1, items);
            if (productVO2 != null && (image2 = productVO2.getImage()) != null) {
                this.view.getPreview2().bind(image2);
            }
            SellerVO.ProductVO productVO3 = (SellerVO.ProductVO) C7714v.Q(2, items);
            if (productVO3 == null || (image = productVO3.getImage()) == null) {
                return;
            }
            this.view.getPreview3().bind(image);
        }

        private final void bindLogo(SellerVO seller) {
            ru.ozon.app.android.pikazon.extensions.ImageViewExtKt.loadWithRoundCorners$default(this.view.getLogo(), seller.getLogoImage(), null, 2, null);
        }

        private final void bindPremium(SellerVO seller) {
            ViewExtKt.showOrGone(this.view.getPremium(), seller.getIsPremium());
        }

        private final void bindPrice(SellerVO item) {
            String obj;
            BigDecimal finalPrice;
            CharSequence formatWithCurrency;
            List<SellerVO.ProductVO> items = item.getItems();
            AppCompatTextView[] appCompatTextViewArr = this.prices;
            int length = appCompatTextViewArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                AppCompatTextView appCompatTextView = appCompatTextViewArr[i11];
                int i13 = i12 + 1;
                SellerVO.ProductVO productVO = (SellerVO.ProductVO) C7714v.Q(i12, items);
                if (productVO == null || !productVO.getIsAdult()) {
                    if (productVO == null || (obj = productVO.getPriceString()) == null) {
                        obj = (productVO == null || (finalPrice = productVO.getFinalPrice()) == null || (formatWithCurrency = PriceUtilsKt.formatWithCurrency(finalPrice)) == null) ? null : formatWithCurrency.toString();
                    }
                    appCompatTextView.setText(obj);
                } else {
                    ViewExtKt.gone(this.prices[i12]);
                }
                i11++;
                i12 = i13;
            }
        }

        private final void bindProducts(SellerVO seller) {
            this.adultListDelegate.bindItems(seller.getItems());
        }

        private final void bindRating(SellerVO seller) {
            RatingBadgeHolderKt.bindOrGone$default(this.view.getRating(), seller.getRatingBadge(), null, 2, null);
        }

        private final void bindSubtitle(SellerVO seller) {
            this.view.getSubtitle().setText(seller.getSubtitle());
        }

        private final void bindTitle(SellerVO seller) {
            this.view.getTitle().setText(seller.getTitle());
        }

        private final void onFavoritesClick(SellerVO item, C4911f container) {
            y<SellerActionResponse> removeSellerFavorite = item.getIsFavorite() ? this.sellerFavoriteService.removeSellerFavorite(item.getSellerId()) : this.sellerFavoriteService.addSellerFavorite(item.getSellerId());
            InterfaceC8487b interfaceC8487b = this.favoriteDisposable;
            if (interfaceC8487b != null) {
                interfaceC8487b.dispose();
            }
            this.favoriteDisposable = removeSellerFavorite.j(Mc.a.b()).g(C8125a.a()).h(new AJ.c(new SellerCarouselAdapter$SellerViewHolder$onFavoritesClick$1(this, container, this.this$0), 4), new d(new SellerCarouselAdapter$SellerViewHolder$onFavoritesClick$2(this, item, container), 5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onProductClick(int position) {
            SellerVO.ProductVO productVO;
            SellerVO item = this.this$0.getItem(getAdapterPosition());
            if (item == null || (productVO = (SellerVO.ProductVO) C7714v.Q(position, item.getItems())) == null) {
                return;
            }
            t tokenizedEvent = item.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.this$0.tokenizedAnalytics, tokenizedEvent, null, 2, null);
            }
            if (!productVO.getShouldBlur()) {
                String deeplink = productVO.getDeeplink();
                if (deeplink != null) {
                    ComposerNavigator.DefaultImpls.openDeeplink$default(this.this$0.navigator, deeplink, null, 2, null);
                    return;
                }
                return;
            }
            this.this$0.clickedProduct = productVO;
            AdultHandler adultHandler = this.adultHandler;
            Context context = this.itemView.getContext();
            Intrinsics.g(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            G supportFragmentManager = ((r) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            AdultHandler.DefaultImpls.showAdultDialog$default(adultHandler, supportFragmentManager, this.this$0.adultListener, null, false, 12, null);
        }

        private final void onSellerClick(SellerVO item) {
            ComposerNavigator.DefaultImpls.openDeeplink$default(this.this$0.navigator, item.getDeeplink(), null, 2, null);
            t tokenizedEvent = item.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.this$0.tokenizedAnalytics, tokenizedEvent, null, 2, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void showMessage(String message, int icon, C4911f container) {
            ViewGroup rootView = ContextExtKt.getRootView(container.i());
            if (rootView != null) {
                FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, Integer.valueOf(icon), null, StyleParser.OzColor.OZ_COLOR_RED.getValue(), null, null, null, null, null, 3000L, null, null, container.f(), 57178, null).show();
            }
        }

        private final void trackView(SellerVO seller) {
            t tokenizedEvent;
            List<SellerVO.ProductVO> items = seller.getItems();
            SellerCarouselAdapter sellerCarouselAdapter = this.this$0;
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                if (((SellerVO.ProductVO) it.next()).getVisible() && (tokenizedEvent = seller.getTokenizedEvent()) != null) {
                    TokenizedAnalyticsExtensionsKt.processViewEvents$default(sellerCarouselAdapter.tokenizedAnalytics, tokenizedEvent, null, 2, null);
                }
            }
        }

        public final void bind(@NotNull SellerVO seller) {
            Intrinsics.checkNotNullParameter(seller, "seller");
            this.item = seller;
            bindTitle(seller);
            bindSubtitle(seller);
            bindPremium(seller);
            bindRating(seller);
            bindLogo(seller);
            bindFavorite(seller.getIsFavorite());
            bindProducts(seller);
            bindPrice(seller);
            bindCount(seller);
        }

        @Override // jk0.j
        public void onAttach() {
            super.onAttach();
            this.disposable = this.adultListDelegate.observeItems().subscribe(new g(new SellerCarouselAdapter$SellerViewHolder$onAttach$1(this), 2));
        }

        @Override // jk0.j
        public void onDetach() {
            super.onDetach();
            InterfaceC8487b interfaceC8487b = this.disposable;
            if (interfaceC8487b != null) {
                interfaceC8487b.dispose();
            }
            InterfaceC8487b interfaceC8487b2 = this.favoriteDisposable;
            if (interfaceC8487b2 != null) {
                interfaceC8487b2.dispose();
            }
        }

        @Override // jk0.j, lk0.b
        public void onViewInVisibleBounds() {
            t tokenizedEvent;
            super.onViewInVisibleBounds();
            SellerVO sellerVO = this.item;
            if (sellerVO != null && (tokenizedEvent = sellerVO.getTokenizedEvent()) != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.this$0.tokenizedAnalytics, tokenizedEvent, null, 2, null);
            }
            SellerVO sellerVO2 = this.item;
            if (sellerVO2 != null) {
                trackView(sellerVO2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselAdapter$ShowAllViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "", "Landroid/view/View;", "containerView", "<init>", "(Lru/ozon/app/android/marketing/widgets/sellerCarousel/presentation/SellerCarouselAdapter;Landroid/view/View;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ShowAllViewHolder extends j {

        @NotNull
        private final View containerView;
        final /* synthetic */ SellerCarouselAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowAllViewHolder(@NotNull SellerCarouselAdapter sellerCarouselAdapter, View containerView) {
            super(containerView);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            this.this$0 = sellerCarouselAdapter;
            this.containerView = containerView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r10v2, types: [ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselAdapter$adultListener$1] */
    public SellerCarouselAdapter(@NotNull SellerCarouselViewHolder parentViewHolder, @NotNull SellerFavoriteService sellerFavoriteService, @NotNull ComposerNavigator navigator, @NotNull l tokenizedAnalytics, @NotNull AdultHandler adultHandler, @NotNull FeatureChecker featureChecker, @NotNull FavoriteEventManager favoriteEventManager, @NotNull C4911f container) {
        super(parentViewHolder, null, 2, null);
        Intrinsics.checkNotNullParameter(parentViewHolder, "parentViewHolder");
        Intrinsics.checkNotNullParameter(sellerFavoriteService, "sellerFavoriteService");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(favoriteEventManager, "favoriteEventManager");
        Intrinsics.checkNotNullParameter(container, "container");
        this.sellerFavoriteService = sellerFavoriteService;
        this.navigator = navigator;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.adultHandler = adultHandler;
        this.featureChecker = featureChecker;
        this.favoriteEventManager = favoriteEventManager;
        this.container = container;
        this.items = K.f71697a;
        this.adultListener = new AdultListener() { // from class: ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselAdapter$adultListener$1
            @Override // ru.ozon.app.android.account.adult.ui.AdultListener
            public void onAdultAccept() {
                SellerVO.ProductVO productVO;
                String deeplink;
                SellerCarouselAdapter.this.notifyDataSetChanged();
                productVO = SellerCarouselAdapter.this.clickedProduct;
                if (productVO == null || (deeplink = productVO.getDeeplink()) == null) {
                    return;
                }
                ComposerNavigator.DefaultImpls.openDeeplink$default(SellerCarouselAdapter.this.navigator, deeplink, null, 2, null);
            }

            @Override // ru.ozon.app.android.account.adult.ui.AdultListener
            public void onAdultReject() {
                AdultListener.DefaultImpls.onAdultReject(this);
            }
        };
        p observeOn = sellerFavoriteService.favoritesChangeEvents().subscribeOn(Mc.a.b()).observeOn(Mc.a.a()).map(new C4066a(new AnonymousClass1(), 1)).filter(new DF.a(AnonymousClass2.INSTANCE, 3)).observeOn(C8125a.a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "observeOn(...)");
        RxExtKt.observe$default(observeOn, parentViewHolder, new AnonymousClass3(), new AnonymousClass4(a.f17149a), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean _init_$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Boolean) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$4$lambda$3(SellerCarouselAdapter sellerCarouselAdapter, View view) {
        ComposerNavigator composerNavigator = sellerCarouselAdapter.navigator;
        String uri = LinkGenerator.INSTANCE.seller().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        ComposerNavigator.DefaultImpls.openDeeplink$default(composerNavigator, uri, null, 2, null);
    }

    public final void detachAll() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            return;
        }
        int shimmersCount = getShimmersCount();
        for (int i11 = 0; i11 < shimmersCount; i11++) {
            RecyclerView.C findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i11);
            if (findViewHolderForAdapterPosition instanceof j) {
                ((j) findViewHolderForAdapterPosition).onDetach();
            }
        }
    }

    public final SellerVO getItem(int position) {
        return (SellerVO) C7714v.Q(position, this.items);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        if (position == this.items.size()) {
            return m.e.DEFAULT_DRAG_ANIMATION_DURATION;
        }
        return 100;
    }

    @NotNull
    public final List<SellerVO> getItems() {
        return this.items;
    }

    @Override // jk0.d, androidx.recyclerview.widget.RecyclerView.g
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // jk0.d, androidx.recyclerview.widget.RecyclerView.g
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.recyclerView = null;
    }

    public final void setItems(@NotNull List<SellerVO> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        notifyDataSetChanged();
    }

    public final void setTrackingData(c cVar) {
        this.trackingData = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof SellerViewHolder) {
            ((SellerViewHolder) holder).bind(this.items.get(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 100) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            SellerCarouselItemView sellerCarouselItemView = new SellerCarouselItemView(context, null, 0, 0, 14, null);
            sellerCarouselItemView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            SellerFavoriteService sellerFavoriteService = this.sellerFavoriteService;
            AdultHandler adultHandler = this.adultHandler;
            return new SellerViewHolder(this, sellerCarouselItemView, sellerFavoriteService, adultHandler, new AdultListDelegate(adultHandler, this.featureChecker), this.container);
        }
        if (viewType != 200) {
            throw new IllegalArgumentException();
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        SellerCarouselItemAllView sellerCarouselItemAllView = new SellerCarouselItemAllView(context2, null, 0, 0, 14, null);
        Context context3 = sellerCarouselItemAllView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        sellerCarouselItemAllView.setLayoutParams(new ViewGroup.LayoutParams(ResourceExtKt.toPx(172, context3), -1));
        sellerCarouselItemAllView.setOnClickListener(new Il.a(this, 6));
        return new ShowAllViewHolder(this, sellerCarouselItemAllView);
    }
}

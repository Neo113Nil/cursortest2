package ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.items;

import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Dy.ViewOnClickListenerC2883a;
import Ge.n;
import Sc.s;
import Ve.C4598rp;
import WZ.l;
import WZ.t;
import Wc.a;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteAdd;
import ru.ozon.app.android.favorites.domain.favoritemanager.model.FavoriteEvent;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.ProductFavoriteMoleculeButtonView;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate;
import ru.ozon.app.android.fresh.geo.databinding.WidgetOrderItemBinding;
import ru.ozon.app.android.fresh.geo.ui.molecules.ProductFavoriteExpressMoleculeView;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 H2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004:\u0001HB3\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\"\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` H\u0014¢\u0006\u0004\b\"\u0010#J3\u0010*\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010&\u001a\u00060$j\u0002`%2\u000e\u0010)\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(H\u0016¢\u0006\u0004\b*\u0010+J\u0018\u0010.\u001a\u00020\u00122\u0006\u0010-\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b0\u00101J*\u00106\u001a\u00020\u00122\u0006\u0010-\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u001b2\u0006\u00105\u001a\u000204H\u0096\u0001¢\u0006\u0004\b6\u00107R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R*\u0010G\u001a\u0010\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u0012\u0018\u00010A8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/presentation/items/OrderItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/presentation/items/OrderItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "favProductMoleculeDelegate", "Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;", "favoriteInteractor", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Landroid/view/View;", "containerView", "<init>", "(LWZ/l;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;Lru/ozon/app/android/favorites/domain/favorite/FavoriteInteractor;Lru/ozon/app/android/composer/ComposerReferences;Landroid/view/View;)V", "item", "", "bindSeparator", "(Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/presentation/items/OrderItemVO;)V", "bindImage", "bindPrice", "bindPriceDetails", "bindName", "bindFavoriteButton", "bindBadge", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "model", "updateFavoriteButtonState", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/presentation/items/OrderItemVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/presentation/items/OrderItemVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;", "button", "attachFavButtonView", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/ProductFavoriteMoleculeButtonView;)V", "detachFavButtonView", "()V", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;", "molecule", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "bindFavoriteProductButton", "(Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "LWZ/l;", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/FavoriteProductDelegate;", "", "imageCornerRadius", "I", "size", "Lru/ozon/app/android/fresh/geo/databinding/WidgetOrderItemBinding;", "binding", "Lru/ozon/app/android/fresh/geo/databinding/WidgetOrderItemBinding;", "Lkotlin/Function1;", "", "getOnFavoriteClick", "()Lkotlin/jvm/functions/Function1;", "setOnFavoriteClick", "(Lkotlin/jvm/functions/Function1;)V", "onFavoriteClick", "Companion", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OrderItemViewHolder extends k<OrderItemVO> implements FavoriteProductDelegate {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final WidgetOrderItemBinding binding;

    @NotNull
    private final FavoriteProductDelegate favProductMoleculeDelegate;
    private final int imageCornerRadius;
    private final int size;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isFav", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.items.OrderItemViewHolder$4", f = "OrderItemViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.items.OrderItemViewHolder$4, reason: invalid class name */
    static final class AnonymousClass4 extends j implements Function2<Boolean, d<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass4(d<? super AnonymousClass4> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass4 anonymousClass4 = OrderItemViewHolder.this.new AnonymousClass4(dVar);
            anonymousClass4.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FavoriteProductMolecule favoriteProduct;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            boolean z11 = this.Z$0;
            OrderItemVO boundData = OrderItemViewHolder.this.getBoundData();
            if (boundData != null && (favoriteProduct = boundData.getFavoriteProduct()) != null) {
                OrderItemViewHolder orderItemViewHolder = OrderItemViewHolder.this;
                favoriteProduct.setFavorite(z11);
                orderItemViewHolder.updateFavoriteButtonState(favoriteProduct);
            }
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, d<? super Unit> dVar) {
            return ((AnonymousClass4) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/presentation/items/OrderItemViewHolder$Companion;", "", "<init>", "()V", "FAVORITE", "", "UNFAVORITE", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderItemViewHolder(@NotNull l tokenizedAnalytics, @NotNull FavoriteProductDelegate favProductMoleculeDelegate, @NotNull FavoriteInteractor favoriteInteractor, @NotNull ComposerReferences composerReferences, @NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(favProductMoleculeDelegate, "favProductMoleculeDelegate");
        Intrinsics.checkNotNullParameter(favoriteInteractor, "favoriteInteractor");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.favProductMoleculeDelegate = favProductMoleculeDelegate;
        this.imageCornerRadius = ResourceExtKt.toPx(8);
        this.size = ResourceExtKt.toPx(84);
        WidgetOrderItemBinding bind = WidgetOrderItemBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        containerView.setOnClickListener(new ViewOnClickListenerC2883a(2, this, new ActionHandler.Builder(composerReferences, this).buildHandler()));
        final InterfaceC2395h a11 = n.a(favoriteInteractor.favoriteChangeEvents());
        final InterfaceC2395h<FavoriteEvent> interfaceC2395h = new InterfaceC2395h<FavoriteEvent>() { // from class: ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.items.OrderItemViewHolder$special$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.items.OrderItemViewHolder$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;
                final /* synthetic */ OrderItemViewHolder this$0;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.items.OrderItemViewHolder$special$$inlined$filter$1$2", f = "OrderItemViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.items.OrderItemViewHolder$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i, OrderItemViewHolder orderItemViewHolder) {
                    this.$this_unsafeFlow = interfaceC2397i;
                    this.this$0 = orderItemViewHolder;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    FavoriteProductMolecule favoriteProduct;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                FavoriteEvent favoriteEvent = (FavoriteEvent) obj;
                                OrderItemVO boundData = this.this$0.getBoundData();
                                if (boundData != null && (favoriteProduct = boundData.getFavoriteProduct()) != null && favoriteEvent.getSku() == favoriteProduct.getSku()) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super FavoriteEvent> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i, this), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
        C4598rp.f(composerReferences, new C2408n0(new InterfaceC2395h<Boolean>() { // from class: ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.items.OrderItemViewHolder$special$$inlined$map$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.items.OrderItemViewHolder$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.items.OrderItemViewHolder$special$$inlined$map$1$2", f = "OrderItemViewHolder.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.items.OrderItemViewHolder$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                Boolean valueOf = Boolean.valueOf(((FavoriteEvent) obj) instanceof FavoriteAdd);
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(valueOf, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Boolean> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new AnonymousClass4(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(OrderItemViewHolder orderItemViewHolder, Function1 function1, View view) {
        AtomAction action;
        OrderItemVO boundData = orderItemViewHolder.getBoundData();
        if (boundData == null || (action = boundData.getAction()) == null) {
            return;
        }
        function1.invoke(action);
    }

    private final void bindBadge(OrderItemVO item) {
        BadgeView badgeV = this.binding.badgeV;
        Intrinsics.checkNotNullExpressionValue(badgeV, "badgeV");
        BadgeHolderKt.bindOrGone$default(badgeV, item.getBadge(), (Function1) null, 2, (Object) null);
    }

    private final void bindFavoriteButton(OrderItemVO item) {
        ProductFavoriteExpressMoleculeView favBtn = this.binding.favBtn;
        Intrinsics.checkNotNullExpressionValue(favBtn, "favBtn");
        bindFavoriteProductButton(favBtn, item.getFavoriteProduct(), new AnalyticData(getTrackingData(), getViewItem()));
        updateFavoriteButtonState(item.getFavoriteProduct());
    }

    private final void bindImage(OrderItemVO item) {
        ImageView itemIv = this.binding.itemIv;
        Intrinsics.checkNotNullExpressionValue(itemIv, "itemIv");
        String image = item.getImage();
        List b02 = C7714v.b0(ImageTransformation.FitCenter.INSTANCE, new ImageTransformation.RoundedCorners(this.imageCornerRadius, null, 2, null));
        int i11 = this.size;
        ImageViewExtKt.load$default(itemIv, image, b02, null, null, new ImageSize(i11, i11), false, null, 108, null);
    }

    private final void bindName(OrderItemVO item) {
        TextAtomView textAtomView = this.binding.nameTAV;
        Intrinsics.f(textAtomView);
        TextAtomHolderKt.bindOrGone$default(textAtomView, item.getName(), null, 2, null);
        textAtomView.setMaxLinesOrDefault(4);
    }

    private final void bindPrice(OrderItemVO item) {
        TextAtomView priceTAV = this.binding.priceTAV;
        Intrinsics.checkNotNullExpressionValue(priceTAV, "priceTAV");
        TextAtomHolderKt.bindOrGone$default(priceTAV, item.getTotalPrice(), null, 2, null);
    }

    private final void bindPriceDetails(OrderItemVO item) {
        TextAtomView priceDetailsTAV = this.binding.priceDetailsTAV;
        Intrinsics.checkNotNullExpressionValue(priceDetailsTAV, "priceDetailsTAV");
        TextAtomHolderKt.bindOrGone$default(priceDetailsTAV, item.getPriceDetails(), null, 2, null);
    }

    private final void bindSeparator(OrderItemVO item) {
        View orderItemBottomSeparator = this.binding.orderItemBottomSeparator;
        Intrinsics.checkNotNullExpressionValue(orderItemBottomSeparator, "orderItemBottomSeparator");
        orderItemBottomSeparator.setVisibility(item.getHasBottomSeparator() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFavoriteButtonState(FavoriteProductMolecule model) {
        ProductFavoriteExpressMoleculeView productFavoriteExpressMoleculeView = this.binding.favBtn;
        productFavoriteExpressMoleculeView.setContentDescription(model.isFavorite() ? "favorite" : "unfavorite");
        productFavoriteExpressMoleculeView.setSelected(model.isFavorite());
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void attachFavButtonView(@NotNull ProductFavoriteMoleculeButtonView button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.favProductMoleculeDelegate.attachFavButtonView(button);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void bindFavoriteProductButton(@NotNull FavoriteButton button, FavoriteProductMolecule molecule, @NotNull AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(analyticData, "analyticData");
        this.favProductMoleculeDelegate.bindFavoriteProductButton(button, molecule, analyticData);
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void detachFavButtonView() {
        this.favProductMoleculeDelegate.detachFavButtonView();
    }

    @Override // ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.FavoriteProductDelegate
    public void setOnFavoriteClick(Function1<? super Boolean, Unit> function1) {
        this.favProductMoleculeDelegate.setOnFavoriteClick(function1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderItemVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindImage(item);
        bindName(item);
        bindPrice(item);
        bindPriceDetails(item);
        bindFavoriteButton(item);
        bindBadge(item);
        bindSeparator(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull OrderItemVO item, @NotNull W10.c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((OrderItemViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}

package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.core;

import Pc.a;
import WZ.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileDelegateV2;
import ru.ozon.app.android.fresh.main.ui.molecules.addToCartButton.presentation.AddToCartButtonBinder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.di.WiseSkuScrollComponent;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.WiseSkuScrollViewHolder;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.view.PullableHorizontalRecyclerView;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class WiseSkuScrollViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, WiseSkuScrollViewHolder> {
    final /* synthetic */ WiseSkuScrollViewMapper this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileDelegateV2;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.core.WiseSkuScrollViewMapper$holderProducer$1$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<FreshTileDelegateV2> {
        final /* synthetic */ WiseSkuScrollViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WiseSkuScrollViewMapper wiseSkuScrollViewMapper) {
            super(0);
            this.this$0 = wiseSkuScrollViewMapper;
        }

        @Override // kotlin.jvm.functions.Function0
        public final FreshTileDelegateV2 invoke() {
            return ((WiseSkuScrollComponent) this.this$0.component()).getFreshTileDelegateV2();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.core.WiseSkuScrollViewMapper$holderProducer$1$2, reason: invalid class name */
    /* loaded from: classes12.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<FeatureChecker> {
        final /* synthetic */ WiseSkuScrollViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(WiseSkuScrollViewMapper wiseSkuScrollViewMapper) {
            super(0);
            this.this$0 = wiseSkuScrollViewMapper;
        }

        @Override // kotlin.jvm.functions.Function0
        public final FeatureChecker invoke() {
            return ((WiseSkuScrollComponent) this.this$0.component()).getFeatureChecker();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WiseSkuScrollViewMapper$holderProducer$1(WiseSkuScrollViewMapper wiseSkuScrollViewMapper) {
        super(2);
        this.this$0 = wiseSkuScrollViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final WiseSkuScrollViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        PullableHorizontalRecyclerView pullableHorizontalRecyclerView = (PullableHorizontalRecyclerView) view;
        l tokenizedAnalytics = ((WiseSkuScrollComponent) this.this$0.component()).getTokenizedAnalytics();
        a<AddToCartButtonBinder> addToCartBinderProvider = ((WiseSkuScrollComponent) this.this$0.component()).getAddToCartBinderProvider();
        ProductFavoriteDelegateProvider productFavoriteDelegateProvider = ((WiseSkuScrollComponent) this.this$0.component()).getProductFavoriteDelegateProvider();
        return new WiseSkuScrollViewHolder(pullableHorizontalRecyclerView, refs, tokenizedAnalytics, ((WiseSkuScrollComponent) this.this$0.component()).getVideoController(), ((WiseSkuScrollComponent) this.this$0.component()).getExoManagerProvider(), new AnonymousClass1(this.this$0), new AnonymousClass2(this.this$0), addToCartBinderProvider, productFavoriteDelegateProvider, ((WiseSkuScrollComponent) this.this$0.component()).getCustomActionHandlersStoreFactory());
    }
}

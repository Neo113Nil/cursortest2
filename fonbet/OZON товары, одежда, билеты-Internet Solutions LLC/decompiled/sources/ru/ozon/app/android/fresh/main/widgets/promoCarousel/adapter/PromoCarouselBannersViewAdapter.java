package ru.ozon.app.android.fresh.main.widgets.promoCarousel.adapter;

import Bl.b;
import WZ.l;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import gk0.q;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.GenericDiffUtil;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselBannerView;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.presentation.PromoCarouselVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B7\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/adapter/PromoCarouselBannersViewAdapter;", "Ljk0/i;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/presentation/PromoCarouselVO$PromoCarouselBannerVO;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/adapter/PromoCarouselBannerCustomViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/adapter/AdapterSpanSize;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "", "isPreCreateWidgetsCategoryMainPageFresh", "<init>", "(Lkotlin/jvm/functions/Function1;LWZ/l;Landroidx/lifecycle/J;Z)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/fresh/main/widgets/promoCarousel/adapter/PromoCarouselBannerCustomViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/fresh/main/widgets/promoCarousel/adapter/PromoCarouselBannerCustomViewHolder;I)V", "getSpanSize", "(I)I", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "Z", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromoCarouselBannersViewAdapter extends i<PromoCarouselVO.PromoCarouselBannerVO, PromoCarouselBannerCustomViewHolder> implements AdapterSpanSize {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final boolean isPreCreateWidgetsCategoryMainPageFresh;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PromoCarouselBannersViewAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics, @NotNull J containerViewLifecycleOwner, boolean z11) {
        super(new GenericDiffUtil(), containerViewLifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.isPreCreateWidgetsCategoryMainPageFresh = z11;
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.promoCarousel.adapter.AdapterSpanSize
    public int getSpanSize(int position) {
        return getItem(position).getBannerType().getSpanSize();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull PromoCarouselBannerCustomViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        PromoCarouselVO.PromoCarouselBannerVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public PromoCarouselBannerCustomViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        PromoCarouselBannerView promoCarouselBannerView = this.isPreCreateWidgetsCategoryMainPageFresh ? (PromoCarouselBannerView) b.a(PromoCarouselBannerView.class, "type", q.f64554a, null) : null;
        if (promoCarouselBannerView == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            promoCarouselBannerView = new PromoCarouselBannerView(context, null, 0, 0, 14, null);
        }
        return new PromoCarouselBannerCustomViewHolder(promoCarouselBannerView, this.actionHandler, this.tokenizedAnalytics);
    }
}

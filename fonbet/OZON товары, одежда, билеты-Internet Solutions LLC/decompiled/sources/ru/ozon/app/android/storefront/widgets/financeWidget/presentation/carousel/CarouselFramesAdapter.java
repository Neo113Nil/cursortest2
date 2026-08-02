package ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel;

import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&BC\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselFramesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselFramesAdapter$FrameViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function0;", "onLongTapDownListener", "onLongTapUpListener", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LWZ/l;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselFramesAdapter$FrameViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselFramesAdapter$FrameViewHolder;I)V", "getItemCount", "()I", "", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardVO$Banner;", "newItems", "setItems", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "LWZ/l;", "", "items", "Ljava/util/List;", "FrameViewHolder", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CarouselFramesAdapter extends RecyclerView.g<FrameViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final List<CarouselCardVO.Banner> items;

    @NotNull
    private final Function0<Unit> onLongTapDownListener;

    @NotNull
    private final Function0<Unit> onLongTapUpListener;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselFramesAdapter$FrameViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/FrameView;", "frameViewNew", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/FrameView;LWZ/l;)V", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardVO$Banner;", "frameVo", "", "bind", "(Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/CarouselCardVO$Banner;)V", "Lru/ozon/app/android/storefront/widgets/financeWidget/presentation/carousel/FrameView;", "LWZ/l;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FrameViewHolder extends RecyclerView.C {

        @NotNull
        private final FrameView frameViewNew;

        @NotNull
        private final l tokenizedAnalytics;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FrameViewHolder(@NotNull FrameView frameViewNew, @NotNull l tokenizedAnalytics) {
            super(frameViewNew);
            Intrinsics.checkNotNullParameter(frameViewNew, "frameViewNew");
            Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
            this.frameViewNew = frameViewNew;
            this.tokenizedAnalytics = tokenizedAnalytics;
        }

        public final void bind(@NotNull CarouselCardVO.Banner frameVo) {
            Intrinsics.checkNotNullParameter(frameVo, "frameVo");
            this.frameViewNew.bind(frameVo);
            t tokenizedEvent = frameVo.getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CarouselFramesAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<Unit> onLongTapDownListener, @NotNull Function0<Unit> onLongTapUpListener, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onLongTapDownListener, "onLongTapDownListener");
        Intrinsics.checkNotNullParameter(onLongTapUpListener, "onLongTapUpListener");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.actionHandler = actionHandler;
        this.onLongTapDownListener = onLongTapDownListener;
        this.onLongTapUpListener = onLongTapUpListener;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.items = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setItems(@NotNull List<CarouselCardVO.Banner> newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        List<CarouselCardVO.Banner> list = this.items;
        list.clear();
        list.addAll(newItems);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull FrameViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public FrameViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FrameView frameView = new FrameView(context, null, 0, 6, null);
        frameView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameView.setOnAction(this.actionHandler);
        frameView.setOnLongTapDown(this.onLongTapDownListener);
        frameView.setOnLongTapUp(this.onLongTapUpListener);
        return new FrameViewHolder(frameView, this.tokenizedAnalytics);
    }
}

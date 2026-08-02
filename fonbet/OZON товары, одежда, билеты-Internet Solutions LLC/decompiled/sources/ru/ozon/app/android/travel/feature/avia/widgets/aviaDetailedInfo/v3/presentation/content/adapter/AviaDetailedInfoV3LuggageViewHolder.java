package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter;

import WZ.l;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3ListItemVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3VO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter.luggage.AviaDetailedInfoV3LuggageAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.view.AviaDetailedInfoV3LuggageView;
import ru.ozon.app.android.travel.utils.utils.OnSnapPositionChangeListener;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\fJ%\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u001c\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/adapter/AviaDetailedInfoV3LuggageViewHolder;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3ListItemVO;", "Landroid/widget/LinearLayout;", "linearLayout", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/widget/LinearLayout;LWZ/l;)V", "", "cancelJob", "()V", "onAttach", "onDetach", "onRecycle", "item", "", "", "payloads", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3ListItemVO;Ljava/util/List;)V", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "notice", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/adapter/luggage/AviaDetailedInfoV3LuggageAdapter;", "luggageAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/adapter/luggage/AviaDetailedInfoV3LuggageAdapter;", "Lxe/M;", "viewHolderScope", "Lxe/M;", "Lxe/B0;", "luggageJob", "Lxe/B0;", "", "dp16", "I", "dp308", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$LuggageContentItemsVO$LuggageItemVO;", "cachedLuggage", "Ljava/util/List;", "Landroidx/recyclerview/widget/s;", "snapHelper", "Landroidx/recyclerview/widget/s;", "Lru/ozon/app/android/travel/utils/utils/OnSnapPositionChangeListener;", "onPositionChangeListener", "Lru/ozon/app/android/travel/utils/utils/OnSnapPositionChangeListener;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaDetailedInfoV3LuggageViewHolder extends BaseViewHolder<AviaDetailedInfoV3ListItemVO> {
    private List<AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO> cachedLuggage;
    private final Context context;
    private final int dp16;
    private final int dp308;

    @NotNull
    private final LinearLayout linearLayout;

    @NotNull
    private final AviaDetailedInfoV3LuggageAdapter luggageAdapter;
    private B0 luggageJob;
    private final TextAtomV2View notice;

    @NotNull
    private final OnSnapPositionChangeListener onPositionChangeListener;
    private final RecyclerView recyclerView;

    @NotNull
    private final s snapHelper;

    @NotNull
    private final M viewHolderScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaDetailedInfoV3LuggageViewHolder(@NotNull LinearLayout linearLayout, @NotNull l tokenizedAnalytics) {
        super(linearLayout);
        Intrinsics.checkNotNullParameter(linearLayout, "linearLayout");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.linearLayout = linearLayout;
        Context context = linearLayout.getContext();
        this.context = context;
        View childAt = linearLayout.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        this.recyclerView = recyclerView;
        View childAt2 = linearLayout.getChildAt(1);
        this.notice = childAt2 instanceof TextAtomV2View ? (TextAtomV2View) childAt2 : null;
        AviaDetailedInfoV3LuggageAdapter aviaDetailedInfoV3LuggageAdapter = new AviaDetailedInfoV3LuggageAdapter(tokenizedAnalytics);
        this.luggageAdapter = aviaDetailedInfoV3LuggageAdapter;
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.viewHolderScope = N.a(CoroutineContext.Element.a.d(De.s.f6650a, (H0) b11));
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.dp16 = UiExtKt.toPx(16, context);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.dp308 = UiExtKt.toPx(308, context);
        s sVar = new s();
        this.snapHelper = sVar;
        this.onPositionChangeListener = new OnSnapPositionChangeListener(sVar, 0, new AviaDetailedInfoV3LuggageViewHolder$onPositionChangeListener$1(this, tokenizedAnalytics), 2, null);
        if (recyclerView != null) {
            recyclerView.setAdapter(aviaDetailedInfoV3LuggageAdapter);
            sVar.attachToRecyclerView(recyclerView);
        }
    }

    private final void cancelJob() {
        B0 b02 = this.luggageJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.luggageJob = null;
    }

    @Override // ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder
    public /* bridge */ /* synthetic */ void bind(AviaDetailedInfoV3ListItemVO aviaDetailedInfoV3ListItemVO, List list) {
        bind2(aviaDetailedInfoV3ListItemVO, (List<? extends Object>) list);
    }

    @Override // jk0.j
    public void onAttach() {
        super.onAttach();
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(this.onPositionChangeListener);
        }
    }

    @Override // jk0.j
    public void onDetach() {
        super.onDetach();
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.onPositionChangeListener);
        }
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        cancelJob();
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull AviaDetailedInfoV3ListItemVO item, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        AviaDetailedInfoV3VO.LuggageContentItemsVO luggageContentItemsVO = item instanceof AviaDetailedInfoV3VO.LuggageContentItemsVO ? (AviaDetailedInfoV3VO.LuggageContentItemsVO) item : null;
        if (luggageContentItemsVO != null) {
            this.cachedLuggage = luggageContentItemsVO.getItems();
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            AviaDetailedInfoV3LuggageView aviaDetailedInfoV3LuggageView = new AviaDetailedInfoV3LuggageView(context, null, 0, 6, null);
            AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO tallestItem = luggageContentItemsVO.getTallestItem();
            boolean isFullScreen = tallestItem != null ? tallestItem.getIsFullScreen() : true;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(isFullScreen ? -1 : this.dp308, -2);
            if (isFullScreen) {
                int i11 = this.dp16;
                layoutParams.setMargins(i11, 0, i11, 0);
            }
            aviaDetailedInfoV3LuggageView.setLayoutParams(layoutParams);
            aviaDetailedInfoV3LuggageView.setVisibility(4);
            this.linearLayout.addView(aviaDetailedInfoV3LuggageView);
            cancelJob();
            this.luggageJob = C10727i.c(this.viewHolderScope, null, null, new AviaDetailedInfoV3LuggageViewHolder$bind$1$1(aviaDetailedInfoV3LuggageView, this, luggageContentItemsVO, null), 3);
            TextAtomV2View textAtomV2View = this.notice;
            if (textAtomV2View != null) {
                TextHolderKt.bind$default(textAtomV2View, luggageContentItemsVO.getNoticeLuggage(), null, 2, null);
            }
        }
    }
}

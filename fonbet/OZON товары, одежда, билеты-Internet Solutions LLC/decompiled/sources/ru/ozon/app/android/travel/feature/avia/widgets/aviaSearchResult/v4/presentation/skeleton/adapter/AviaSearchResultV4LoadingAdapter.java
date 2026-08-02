package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.skeleton.adapter;

import Ej.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.databinding.ItemAviaSearchResultV4FlightShimmerBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4FlightVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4ListItemVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.DirectFlightsSkeleton;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.FlightSkeleton;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.AviaSearchResultV4FlightView;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.AviaSearchResultV4Payload;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.directFlightsShimmer.AviaSearchResultV4DirectFlightsShimmerView;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001:\u00011Bk\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u001e\u0010\u0013\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J%\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J%\u0010(\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b(\u0010)J3\u0010(\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016¢\u0006\u0004\b(\u0010-R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R,\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100R,\u0010\u0013\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010.¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/skeleton/adapter/AviaSearchResultV4LoadingAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4ListItemVO;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lkotlin/Function3;", "Landroid/view/View;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoardingCallback", "Landroidx/recyclerview/widget/RecyclerView$u;", "recycledViewPool", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackViewEvent", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lfd/n;Landroidx/recyclerview/widget/RecyclerView$u;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/AviaSearchResultV4FlightView;", "createFlightView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/AviaSearchResultV4FlightView;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/directFlightsShimmer/AviaSearchResultV4DirectFlightsShimmerView;", "getDirectFlightsShimmerView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/view/directFlightsShimmer/AviaSearchResultV4DirectFlightsShimmerView;", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;I)V", "", "", "payloads", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;ILjava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "Lfd/n;", "Landroidx/recyclerview/widget/RecyclerView$u;", "AviaSearchResultV4LoadingDiffUtil", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4LoadingAdapter extends i<AviaSearchResultV4ListItemVO, BaseViewHolder<? super AviaSearchResultV4ListItemVO>> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final InterfaceC6511n<View, View, OnBoardingDTO, Unit> onBoardingCallback;

    @NotNull
    private final RecyclerView.u recycledViewPool;

    @NotNull
    private final Function1<Map<String, TokenizedTrackingInfo>, Unit> trackViewEvent;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/skeleton/adapter/AviaSearchResultV4LoadingAdapter$AviaSearchResultV4LoadingDiffUtil;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4ListItemVO;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4ListItemVO;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4ListItemVO;)Z", "areContentsTheSame", "", "", "getChangePayload", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4ListItemVO;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4ListItemVO;)Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class AviaSearchResultV4LoadingDiffUtil extends i.d<AviaSearchResultV4ListItemVO> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull AviaSearchResultV4ListItemVO oldItem, @NotNull AviaSearchResultV4ListItemVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull AviaSearchResultV4ListItemVO oldItem, @NotNull AviaSearchResultV4ListItemVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getItemId() == newItem.getItemId();
        }

        @Override // androidx.recyclerview.widget.i.d
        @NotNull
        public List<Object> getChangePayload(@NotNull AviaSearchResultV4ListItemVO oldItem, @NotNull AviaSearchResultV4ListItemVO newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            ArrayList arrayList = new ArrayList();
            if ((newItem instanceof AviaSearchResultV4FlightVO) && (oldItem instanceof AviaSearchResultV4FlightVO)) {
                AviaSearchResultV4FlightVO aviaSearchResultV4FlightVO = (AviaSearchResultV4FlightVO) oldItem;
                AviaSearchResultV4FlightVO aviaSearchResultV4FlightVO2 = (AviaSearchResultV4FlightVO) newItem;
                if (!Intrinsics.d(aviaSearchResultV4FlightVO.getBackgroundColor(), aviaSearchResultV4FlightVO2.getBackgroundColor()) || !Intrinsics.d(aviaSearchResultV4FlightVO.getCardClickAction(), aviaSearchResultV4FlightVO2.getCardClickAction()) || !Intrinsics.d(aviaSearchResultV4FlightVO.getBorderColor(), aviaSearchResultV4FlightVO2.getBorderColor())) {
                    arrayList.add(AviaSearchResultV4Payload.BACKGROUND);
                }
                if (!Intrinsics.d(aviaSearchResultV4FlightVO.getBadges(), aviaSearchResultV4FlightVO2.getBadges()) || aviaSearchResultV4FlightVO.getIsBadgesVisible() != aviaSearchResultV4FlightVO2.getIsBadgesVisible()) {
                    arrayList.add(AviaSearchResultV4Payload.BADGES);
                }
                if (!Intrinsics.d(aviaSearchResultV4FlightVO.getPrice(), aviaSearchResultV4FlightVO2.getPrice()) || !Intrinsics.d(aviaSearchResultV4FlightVO.getPremiumBadge(), aviaSearchResultV4FlightVO2.getPremiumBadge())) {
                    arrayList.add(AviaSearchResultV4Payload.PRICE);
                }
                if (!Intrinsics.d(aviaSearchResultV4FlightVO.getLuggageText(), aviaSearchResultV4FlightVO2.getLuggageText())) {
                    arrayList.add(AviaSearchResultV4Payload.LUGGAGE);
                }
                if (!Intrinsics.d(aviaSearchResultV4FlightVO.getAirlineIcons(), aviaSearchResultV4FlightVO2.getAirlineIcons()) || !Intrinsics.d(aviaSearchResultV4FlightVO.getAirlinesText(), aviaSearchResultV4FlightVO2.getAirlinesText())) {
                    arrayList.add(AviaSearchResultV4Payload.AIRLINE);
                }
                if (!Intrinsics.d(aviaSearchResultV4FlightVO.getWayThereDetails(), aviaSearchResultV4FlightVO2.getWayThereDetails())) {
                    arrayList.add(AviaSearchResultV4Payload.THERE_DETAILS);
                }
                if (!Intrinsics.d(aviaSearchResultV4FlightVO.getWayBackDetails(), aviaSearchResultV4FlightVO2.getWayBackDetails())) {
                    arrayList.add(AviaSearchResultV4Payload.BACK_DETAILS);
                }
                if (!Intrinsics.d(aviaSearchResultV4FlightVO.getAdditionalInfo(), aviaSearchResultV4FlightVO2.getAdditionalInfo())) {
                    arrayList.add(AviaSearchResultV4Payload.ADDITIONAL_INFO);
                }
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AviaSearchResultV4LoadingAdapter(@NotNull J lifecycleOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull InterfaceC6511n<? super View, ? super View, ? super OnBoardingDTO, Unit> onBoardingCallback, @NotNull RecyclerView.u recycledViewPool, @NotNull Function1<? super Map<String, TokenizedTrackingInfo>, Unit> trackViewEvent) {
        super(new AviaSearchResultV4LoadingDiffUtil(), lifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onBoardingCallback, "onBoardingCallback");
        Intrinsics.checkNotNullParameter(recycledViewPool, "recycledViewPool");
        Intrinsics.checkNotNullParameter(trackViewEvent, "trackViewEvent");
        this.actionHandler = actionHandler;
        this.onBoardingCallback = onBoardingCallback;
        this.recycledViewPool = recycledViewPool;
        this.trackViewEvent = trackViewEvent;
    }

    private final AviaSearchResultV4FlightView createFlightView(Context context) {
        AviaSearchResultV4FlightView aviaSearchResultV4FlightView = new AviaSearchResultV4FlightView(context, null, 0, 6, null);
        aviaSearchResultV4FlightView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        aviaSearchResultV4FlightView.setRecycledViewPool(this.recycledViewPool);
        return aviaSearchResultV4FlightView;
    }

    private final AviaSearchResultV4DirectFlightsShimmerView getDirectFlightsShimmerView(Context context) {
        AviaSearchResultV4DirectFlightsShimmerView aviaSearchResultV4DirectFlightsShimmerView = new AviaSearchResultV4DirectFlightsShimmerView(context);
        aviaSearchResultV4DirectFlightsShimmerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return aviaSearchResultV4DirectFlightsShimmerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        AviaSearchResultV4ListItemVO item = getItem(position);
        if (item instanceof AviaSearchResultV4FlightVO) {
            return R$id.aviaSearchResultV4FlightViewType;
        }
        if (item instanceof FlightSkeleton) {
            return R$id.aviaSearchResultV4FlightSkeletonViewType;
        }
        if (item instanceof DirectFlightsSkeleton) {
            return R$id.aviaSearchResultV4DirectFlightsSkeletonViewType;
        }
        throw new IllegalArgumentException("Unknown viewType: $");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((BaseViewHolder<? super AviaSearchResultV4ListItemVO>) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseViewHolder<AviaSearchResultV4ListItemVO> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        if (viewType == R$id.aviaSearchResultV4FlightViewType) {
            Intrinsics.f(context);
            return new AviaSearchResultV4LoadingViewHolder(createFlightView(context), this.actionHandler, this.onBoardingCallback, this.trackViewEvent);
        }
        if (viewType == R$id.aviaSearchResultV4DirectFlightsSkeletonViewType) {
            Intrinsics.f(context);
            return new AviaSearchResultV4LoadingDirectFlightsShimmerViewHolder(getDirectFlightsShimmerView(context));
        }
        if (viewType != R$id.aviaSearchResultV4FlightSkeletonViewType) {
            throw new IllegalArgumentException(b.a(viewType, "Unknown viewType: "));
        }
        ItemAviaSearchResultV4FlightShimmerBinding inflate = ItemAviaSearchResultV4FlightShimmerBinding.inflate(LayoutInflater.from(context), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new AviaSearchResultV4LoadingFlightViewHolder(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseViewHolder<? super AviaSearchResultV4ListItemVO> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AviaSearchResultV4ListItemVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, K.f71697a);
    }

    public void onBindViewHolder(@NotNull BaseViewHolder<? super AviaSearchResultV4ListItemVO> holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        AviaSearchResultV4ListItemVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, payloads);
    }
}

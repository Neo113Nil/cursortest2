package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.v3;

import WZ.t;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fd.InterfaceC6512o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.travel.feature.avia.databinding.ItemAviaSearchResultV3Binding;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool.AviaSearchResultViewPool;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.AviaSearchResultBadgesDecoration;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.app.android.uikit.view.skeleton.SkeletonPlaceholderView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$FlightItemV3;", "Lru/ozon/app/android/travel/feature/avia/databinding/ItemAviaSearchResultV3Binding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultV3AdapterDelegateKt$aviaSearchResultV3AdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3, ItemAviaSearchResultV3Binding>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ AviaSearchResultViewPool $aviaSearchResultViewPool;
    final /* synthetic */ RecyclerView.u $luggageViewPool;
    final /* synthetic */ InterfaceC6512o<Long, AtomActionDTO, t, String, Unit> $onBadgeSelectedListener;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "payloads", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.v3.AviaSearchResultV3AdapterDelegateKt$aviaSearchResultV3AdapterDelegate$2$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
        final /* synthetic */ AtomsAdapter $badgeAtomsAdapter;
        final /* synthetic */ int $defaultBackgroundColor;
        final /* synthetic */ AviaSearchResultV3LuggageAdapter $luggageAdapter;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3, ItemAviaSearchResultV3Binding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3, ItemAviaSearchResultV3Binding> adapterDelegateViewBindingViewHolder, AviaSearchResultV3LuggageAdapter aviaSearchResultV3LuggageAdapter, Function1<? super AtomAction, Unit> function1, AtomsAdapter atomsAdapter, int i11) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$luggageAdapter = aviaSearchResultV3LuggageAdapter;
            this.$actionHandler = function1;
            this.$badgeAtomsAdapter = atomsAdapter;
            this.$defaultBackgroundColor = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> payloads) {
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3 item = this.$this_adapterDelegateViewBinding.getItem();
            AviaSearchResultV3LuggageAdapter aviaSearchResultV3LuggageAdapter = this.$luggageAdapter;
            AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3, ItemAviaSearchResultV3Binding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            Function1<AtomAction, Unit> function1 = this.$actionHandler;
            AtomsAdapter atomsAdapter = this.$badgeAtomsAdapter;
            int i11 = this.$defaultBackgroundColor;
            AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3 flightItemV3 = item;
            List<AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO> luggage = flightItemV3.getLuggage();
            ArrayList arrayList = new ArrayList(C7714v.z(luggage, 10));
            Iterator<T> it = luggage.iterator();
            while (it.hasNext()) {
                arrayList.add(AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO.copy$default((AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO) it.next(), 0L, null, null, null, null, null, null, false, null, false, null, null, null, false, null, null, flightItemV3.getIsProgressVisible(), 0L, 196607, null));
            }
            aviaSearchResultV3LuggageAdapter.setItems(arrayList);
            if (flightItemV3.getIsPremiumBadgeVisible()) {
                Badge premiumBadge = (!flightItemV3.getIsBonusPay() || flightItemV3.getBonusPremiumBadge() == null) ? flightItemV3.getPremiumBadge() : flightItemV3.getBonusPremiumBadge();
                BadgeView aviaSearchPremiumBadgeBv = adapterDelegateViewBindingViewHolder.getBinding().aviaSearchPremiumBadgeBv;
                Intrinsics.checkNotNullExpressionValue(aviaSearchPremiumBadgeBv, "aviaSearchPremiumBadgeBv");
                BadgeHolderKt.bindOrGone(aviaSearchPremiumBadgeBv, premiumBadge, function1);
                BadgeView aviaSearchPremiumBadgeBv2 = adapterDelegateViewBindingViewHolder.getBinding().aviaSearchPremiumBadgeBv;
                Intrinsics.checkNotNullExpressionValue(aviaSearchPremiumBadgeBv2, "aviaSearchPremiumBadgeBv");
                aviaSearchPremiumBadgeBv2.setVisibility(flightItemV3.getIsProgressVisible() ? 4 : 0);
                SkeletonPlaceholderView aviaSearchPremiumBadgeSkeletonSpv = adapterDelegateViewBindingViewHolder.getBinding().aviaSearchPremiumBadgeSkeletonSpv;
                Intrinsics.checkNotNullExpressionValue(aviaSearchPremiumBadgeSkeletonSpv, "aviaSearchPremiumBadgeSkeletonSpv");
                aviaSearchPremiumBadgeSkeletonSpv.setVisibility(flightItemV3.getIsProgressVisible() ? 0 : 8);
            } else {
                BadgeView aviaSearchPremiumBadgeBv3 = adapterDelegateViewBindingViewHolder.getBinding().aviaSearchPremiumBadgeBv;
                Intrinsics.checkNotNullExpressionValue(aviaSearchPremiumBadgeBv3, "aviaSearchPremiumBadgeBv");
                aviaSearchPremiumBadgeBv3.setVisibility(8);
                SkeletonPlaceholderView aviaSearchPremiumBadgeSkeletonSpv2 = adapterDelegateViewBindingViewHolder.getBinding().aviaSearchPremiumBadgeSkeletonSpv;
                Intrinsics.checkNotNullExpressionValue(aviaSearchPremiumBadgeSkeletonSpv2, "aviaSearchPremiumBadgeSkeletonSpv");
                aviaSearchPremiumBadgeSkeletonSpv2.setVisibility(8);
            }
            if (!adapterDelegateViewBindingViewHolder.getItem().getIsBonusPay() || flightItemV3.getBonusPrice() == null) {
                PriceView priceView = adapterDelegateViewBindingViewHolder.getBinding().aviaSearchPricePv;
                Intrinsics.f(priceView);
                PriceHolderKt.bind$default(priceView, flightItemV3.getSimplePrice().getPrice(), null, 2, null);
                priceView.setVisibility(flightItemV3.getIsProgressVisible() ? 4 : 0);
                TextAtomView aviaSearchDiscountTav = adapterDelegateViewBindingViewHolder.getBinding().aviaSearchDiscountTav;
                Intrinsics.checkNotNullExpressionValue(aviaSearchDiscountTav, "aviaSearchDiscountTav");
                aviaSearchDiscountTav.setVisibility(8);
            } else {
                PriceView priceView2 = adapterDelegateViewBindingViewHolder.getBinding().aviaSearchPricePv;
                Intrinsics.f(priceView2);
                PriceHolderKt.bind$default(priceView2, flightItemV3.getBonusPrice().getPrice(), null, 2, null);
                priceView2.setVisibility(adapterDelegateViewBindingViewHolder.getItem().getIsProgressVisible() ? 4 : 0);
                TextAtomView textAtomView = adapterDelegateViewBindingViewHolder.getBinding().aviaSearchDiscountTav;
                Intrinsics.f(textAtomView);
                TextAtomHolderKt.bindOrGone$default(textAtomView, flightItemV3.getBonusPrice().getPercent(), null, 2, null);
                if (flightItemV3.getBonusPrice().getPercent() != null) {
                    textAtomView.setVisibility(adapterDelegateViewBindingViewHolder.getItem().getIsProgressVisible() ? 4 : 0);
                }
            }
            SmallButtonView smallButtonView = adapterDelegateViewBindingViewHolder.getBinding().aviaSearchSmallButtonSbv;
            Intrinsics.f(smallButtonView);
            WrappedButtonHolderKt.bind(smallButtonView, (!flightItemV3.getIsBonusPay() || flightItemV3.getBonusSmallButton() == null) ? flightItemV3.getSmallButton() : flightItemV3.getBonusSmallButton(), function1);
            smallButtonView.setVisibility(flightItemV3.getIsProgressVisible() ? 4 : 0);
            SkeletonPlaceholderView aviaSearchDiscountSkeletonSpv = adapterDelegateViewBindingViewHolder.getBinding().aviaSearchDiscountSkeletonSpv;
            Intrinsics.checkNotNullExpressionValue(aviaSearchDiscountSkeletonSpv, "aviaSearchDiscountSkeletonSpv");
            aviaSearchDiscountSkeletonSpv.setVisibility(flightItemV3.getIsProgressVisible() ? 0 : 8);
            SkeletonPlaceholderView aviaSearchSmallButtonSkeletonSpv = adapterDelegateViewBindingViewHolder.getBinding().aviaSearchSmallButtonSkeletonSpv;
            Intrinsics.checkNotNullExpressionValue(aviaSearchSmallButtonSkeletonSpv, "aviaSearchSmallButtonSkeletonSpv");
            aviaSearchSmallButtonSkeletonSpv.setVisibility(flightItemV3.getIsProgressVisible() ? 0 : 8);
            SkeletonPlaceholderView aviaSearchPriceSkeletonSpv = adapterDelegateViewBindingViewHolder.getBinding().aviaSearchPriceSkeletonSpv;
            Intrinsics.checkNotNullExpressionValue(aviaSearchPriceSkeletonSpv, "aviaSearchPriceSkeletonSpv");
            aviaSearchPriceSkeletonSpv.setVisibility(flightItemV3.getIsProgressVisible() ? 0 : 8);
            if (payloads.contains("AviaSearchResultV3Payload.LuggageChanged")) {
                return;
            }
            StyleParser styleParser = StyleParser.INSTANCE;
            Integer parseColor = styleParser.parseColor(adapterDelegateViewBindingViewHolder.getContext(), flightItemV3.getBorderColor());
            Integer parseColor2 = styleParser.parseColor(adapterDelegateViewBindingViewHolder.getContext(), flightItemV3.getBonusBackgroundColor());
            int px = parseColor == null ? 0 : ResourceExtKt.toPx(2, adapterDelegateViewBindingViewHolder.getContext());
            adapterDelegateViewBindingViewHolder.getBinding().aviaSearchLuggageRv.setPadding(px, 0, px, 0);
            adapterDelegateViewBindingViewHolder.getBinding().getConstraintLayout().setBorderColor(parseColor);
            HorizontalAtomsLayout aviaSearchResultBadgesHal = adapterDelegateViewBindingViewHolder.getBinding().aviaSearchResultBadgesHal;
            Intrinsics.checkNotNullExpressionValue(aviaSearchResultBadgesHal, "aviaSearchResultBadgesHal");
            aviaSearchResultBadgesHal.setVisibility(flightItemV3.getAreRouteBadgesVisible() ? 0 : 8);
            atomsAdapter.bind(adapterDelegateViewBindingViewHolder.getContext(), flightItemV3.getRouteBadges());
            adapterDelegateViewBindingViewHolder.getBinding().aviaSearchRouteGl.bind(flightItemV3.getRouteBlocks(), function1);
            ConstraintLayoutWithBorder constraintLayout = adapterDelegateViewBindingViewHolder.getBinding().getConstraintLayout();
            if (flightItemV3.getIsBonusPay() && parseColor2 != null) {
                i11 = parseColor2.intValue();
            }
            constraintLayout.setBackgroundColor(i11);
            TextAtomView aviaSearchRemainingTicketsTv = adapterDelegateViewBindingViewHolder.getBinding().aviaSearchRemainingTicketsTv;
            Intrinsics.checkNotNullExpressionValue(aviaSearchRemainingTicketsTv, "aviaSearchRemainingTicketsTv");
            TextAtomHolderKt.bindOrGone$default(aviaSearchRemainingTicketsTv, flightItemV3.getRemainingTickets(), null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AviaSearchResultV3AdapterDelegateKt$aviaSearchResultV3AdapterDelegate$2(AviaSearchResultViewPool aviaSearchResultViewPool, InterfaceC6512o<? super Long, ? super AtomActionDTO, ? super t, ? super String, Unit> interfaceC6512o, Function1<? super AtomAction, Unit> function1, RecyclerView.u uVar) {
        super(1);
        this.$aviaSearchResultViewPool = aviaSearchResultViewPool;
        this.$onBadgeSelectedListener = interfaceC6512o;
        this.$actionHandler = function1;
        this.$luggageViewPool = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(AdapterDelegateViewBindingViewHolder adapterDelegateViewBindingViewHolder, Function1 function1, View view) {
        boolean isBonusPay = ((AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3) adapterDelegateViewBindingViewHolder.getItem()).getIsBonusPay();
        AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3 flightItemV3 = (AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3) adapterDelegateViewBindingViewHolder.getItem();
        AtomAction bonusCardClickAction = isBonusPay ? flightItemV3.getBonusCardClickAction() : flightItemV3.getCardClickAction();
        if (bonusCardClickAction != null) {
            function1.invoke(bonusCardClickAction);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3, ItemAviaSearchResultV3Binding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3, ItemAviaSearchResultV3Binding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        adapterDelegateViewBinding.getBinding().aviaSearchRouteGl.setPool(this.$aviaSearchResultViewPool);
        HorizontalAtomsLayout horizontalAtomsLayout = adapterDelegateViewBinding.getBinding().aviaSearchResultBadgesHal;
        horizontalAtomsLayout.setAdapter(atomsAdapter);
        Context context = horizontalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        horizontalAtomsLayout.setDecorator(new AviaSearchResultBadgesDecoration(context));
        ConstraintLayoutWithBorder constraintLayout = adapterDelegateViewBinding.getBinding().getConstraintLayout();
        final Function1<AtomAction, Unit> function1 = this.$actionHandler;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.v3.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AviaSearchResultV3AdapterDelegateKt$aviaSearchResultV3AdapterDelegate$2.invoke$lambda$1(AdapterDelegateViewBindingViewHolder.this, function1, view);
            }
        });
        AviaSearchResultV3LuggageAdapter aviaSearchResultV3LuggageAdapter = new AviaSearchResultV3LuggageAdapter(this.$onBadgeSelectedListener);
        int themeColor = ThemeExtKt.themeColor(adapterDelegateViewBinding.getContext(), R$attr.layerFloor1);
        RecyclerView recyclerView = adapterDelegateViewBinding.getBinding().aviaSearchLuggageRv;
        RecyclerView.u uVar = this.$luggageViewPool;
        recyclerView.setAdapter(aviaSearchResultV3LuggageAdapter);
        Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        recyclerView.addItemDecoration(new AviaSearchResultV3LuggageDecoration(context2));
        recyclerView.setRecycledViewPool(uVar);
        recyclerView.setItemAnimator(null);
        ItemAviaSearchResultV3Binding binding = adapterDelegateViewBinding.getBinding();
        int themeColor2 = ThemeExtKt.themeColor(adapterDelegateViewBinding.getContext(), R$attr.layerSurface);
        binding.aviaSearchDiscountSkeletonSpv.setBackgroundColor(themeColor2);
        binding.aviaSearchPremiumBadgeSkeletonSpv.setBackgroundColor(themeColor2);
        binding.aviaSearchPriceSkeletonSpv.setBackgroundColor(themeColor2);
        binding.aviaSearchSmallButtonSkeletonSpv.setBackgroundColor(themeColor2);
        adapterDelegateViewBinding.bind(new AnonymousClass5(adapterDelegateViewBinding, aviaSearchResultV3LuggageAdapter, this.$actionHandler, atomsAdapter, themeColor));
    }
}

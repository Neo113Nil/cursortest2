package ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.avia.databinding.ItemInsurancePanelSelectorBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.InsurancePanelVO;
import ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.adapter.decoration.InsurancePanelBenefitDecoration;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/presentation/InsurancePanelVO$InsuranceVO;", "Lru/ozon/app/android/travel/feature/avia/databinding/ItemInsurancePanelSelectorBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class InsurancePanelAdapterDelegateKt$insurancePanelAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<InsurancePanelVO.InsuranceVO, ItemInsurancePanelSelectorBinding>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "payloads", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.adapter.InsurancePanelAdapterDelegateKt$insurancePanelAdapterDelegate$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
        final /* synthetic */ InsurancePanelBenefitAdapter $benefitsAdapter;
        final /* synthetic */ int $defaultCardWidth;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<InsurancePanelVO.InsuranceVO, ItemInsurancePanelSelectorBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(AdapterDelegateViewBindingViewHolder<InsurancePanelVO.InsuranceVO, ItemInsurancePanelSelectorBinding> adapterDelegateViewBindingViewHolder, int i11, InsurancePanelBenefitAdapter insurancePanelBenefitAdapter, Function1<? super AtomAction, Unit> function1) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$defaultCardWidth = i11;
            this.$benefitsAdapter = insurancePanelBenefitAdapter;
            this.$actionHandler = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> payloads) {
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            Object M11 = C7714v.M(payloads);
            InsurancePanelVO.InsuranceVO insuranceVO = M11 instanceof InsurancePanelVO.InsuranceVO ? (InsurancePanelVO.InsuranceVO) M11 : null;
            if (insuranceVO != null) {
                this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout().setSelected(insuranceVO.getIsSelected());
                return;
            }
            AdapterDelegateViewBindingViewHolder<InsurancePanelVO.InsuranceVO, ItemInsurancePanelSelectorBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            int i11 = this.$defaultCardWidth;
            InsurancePanelBenefitAdapter insurancePanelBenefitAdapter = this.$benefitsAdapter;
            Function1<AtomAction, Unit> function1 = this.$actionHandler;
            int i12 = adapterDelegateViewBindingViewHolder.getBinding().getConstraintLayout().getLayoutParams().width;
            if (adapterDelegateViewBindingViewHolder.getItem().getIsSingleItem()) {
                i11 = -1;
            }
            if (i12 != i11) {
                ConstraintLayout constraintLayout = adapterDelegateViewBindingViewHolder.getBinding().getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = i11;
                constraintLayout.setLayoutParams(layoutParams);
            }
            InsurancePanelVO.InsuranceVO item = adapterDelegateViewBindingViewHolder.getItem();
            TextAtomView insuranceTitleTAV = adapterDelegateViewBindingViewHolder.getBinding().insuranceTitleTAV;
            Intrinsics.checkNotNullExpressionValue(insuranceTitleTAV, "insuranceTitleTAV");
            TextAtomHolderKt.bind$default(insuranceTitleTAV, item.getTitle(), null, 2, null);
            PriceView insurancePricePV = adapterDelegateViewBindingViewHolder.getBinding().insurancePricePV;
            Intrinsics.checkNotNullExpressionValue(insurancePricePV, "insurancePricePV");
            PriceHolderKt.bind$default(insurancePricePV, item.getPrice(), null, 2, null);
            TextAtomView subTitleTAV = adapterDelegateViewBindingViewHolder.getBinding().subTitleTAV;
            Intrinsics.checkNotNullExpressionValue(subTitleTAV, "subTitleTAV");
            TextAtomHolderKt.bindOrGone$default(subTitleTAV, item.getSubtitle(), null, 2, null);
            ImageView logoIv = adapterDelegateViewBindingViewHolder.getBinding().logoIv;
            Intrinsics.checkNotNullExpressionValue(logoIv, "logoIv");
            ImageViewExtKt.loadImageOrGone(logoIv, item.getLogoLink());
            adapterDelegateViewBindingViewHolder.getBinding().getConstraintLayout().setSelected(item.getIsSelected());
            BadgeView insuranceBV = adapterDelegateViewBindingViewHolder.getBinding().insuranceBV;
            Intrinsics.checkNotNullExpressionValue(insuranceBV, "insuranceBV");
            BadgeHolderKt.bindOrGone$default(insuranceBV, item.getBadge(), (Function1) null, 2, (Object) null);
            insurancePanelBenefitAdapter.setItems(item.getBenefits());
            BadgeView insuranceDetailedConditions = adapterDelegateViewBindingViewHolder.getBinding().insuranceDetailedConditions;
            Intrinsics.checkNotNullExpressionValue(insuranceDetailedConditions, "insuranceDetailedConditions");
            BadgeHolderKt.bindOrGone(insuranceDetailedConditions, item.getDetailedConditionsButton(), function1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InsurancePanelAdapterDelegateKt$insurancePanelAdapterDelegate$2(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$actionHandler = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(AdapterDelegateViewBindingViewHolder adapterDelegateViewBindingViewHolder, View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(adapterDelegateViewBindingViewHolder.getAdapterPosition());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<InsurancePanelVO.InsuranceVO, ItemInsurancePanelSelectorBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<InsurancePanelVO.InsuranceVO, ItemInsurancePanelSelectorBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        int px = UiExtKt.toPx(300, adapterDelegateViewBinding.getContext());
        ConstraintLayout constraintLayout = adapterDelegateViewBinding.getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        InsurancePanelBenefitAdapter insurancePanelBenefitAdapter = new InsurancePanelBenefitAdapter(constraintLayout);
        RecyclerView recyclerView = adapterDelegateViewBinding.getBinding().insuranceBenefitsRV;
        recyclerView.setAdapter(insurancePanelBenefitAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new InsurancePanelBenefitDecoration(context));
        adapterDelegateViewBinding.getBinding().getConstraintLayout().setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.presentation.adapter.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InsurancePanelAdapterDelegateKt$insurancePanelAdapterDelegate$2.invoke$lambda$1(AdapterDelegateViewBindingViewHolder.this, view);
            }
        });
        adapterDelegateViewBinding.bind(new AnonymousClass3(adapterDelegateViewBinding, px, insurancePanelBenefitAdapter, this.$actionHandler));
    }
}

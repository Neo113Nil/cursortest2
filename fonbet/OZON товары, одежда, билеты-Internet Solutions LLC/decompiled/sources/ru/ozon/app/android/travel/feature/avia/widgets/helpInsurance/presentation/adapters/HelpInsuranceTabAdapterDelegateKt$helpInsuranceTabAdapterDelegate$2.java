package ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.avia.databinding.ItemHelpInsuranceTabBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation.HelpInsuranceVO;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$TabVO;", "Lru/ozon/app/android/travel/feature/avia/databinding/ItemHelpInsuranceTabBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class HelpInsuranceTabAdapterDelegateKt$helpInsuranceTabAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<HelpInsuranceVO.TabVO, ItemHelpInsuranceTabBinding>, Unit> {
    final /* synthetic */ Function1<Integer, Unit> $clickHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation.adapters.HelpInsuranceTabAdapterDelegateKt$helpInsuranceTabAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<HelpInsuranceVO.TabVO, ItemHelpInsuranceTabBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<HelpInsuranceVO.TabVO, ItemHelpInsuranceTabBinding> adapterDelegateViewBindingViewHolder) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            HelpInsuranceVO.TabVO item = this.$this_adapterDelegateViewBinding.getItem();
            AdapterDelegateViewBindingViewHolder<HelpInsuranceVO.TabVO, ItemHelpInsuranceTabBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            HelpInsuranceVO.TabVO tabVO = item;
            TextAtom copy$default = tabVO.getIsSelected() ? TextAtom.copy$default(tabVO.getTitle(), null, null, tabVO.getTextSelectedTintColor(), null, null, null, null, 123, null) : tabVO.getTitle();
            TextAtomView tabTitleTAV = adapterDelegateViewBindingViewHolder.getBinding().tabTitleTAV;
            Intrinsics.checkNotNullExpressionValue(tabTitleTAV, "tabTitleTAV");
            Integer num = null;
            TextAtomHolderKt.bind$default(tabTitleTAV, copy$default, null, 2, null);
            adapterDelegateViewBindingViewHolder.getBinding().getConstraintLayout().setSelected(tabVO.getIsSelected());
            ImageView imageView = adapterDelegateViewBindingViewHolder.getBinding().tabIconIV;
            Intrinsics.f(imageView);
            HelpInsuranceVO.IconVO tabIcon = tabVO.getTabIcon();
            ImageViewExtKt.loadImageOrGone(imageView, tabIcon != null ? tabIcon.getImage() : null);
            if (imageView.isSelected()) {
                num = Integer.valueOf(tabVO.getIconSelectedTintColor());
            } else {
                HelpInsuranceVO.IconVO tabIcon2 = tabVO.getTabIcon();
                if (tabIcon2 != null) {
                    num = tabIcon2.getTintColor();
                }
            }
            ThemeExtKt.tint(imageView, num);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HelpInsuranceTabAdapterDelegateKt$helpInsuranceTabAdapterDelegate$2(Function1<? super Integer, Unit> function1) {
        super(1);
        this.$clickHandler = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Function1 function1, AdapterDelegateViewBindingViewHolder adapterDelegateViewBindingViewHolder, View view) {
        function1.invoke(Integer.valueOf(adapterDelegateViewBindingViewHolder.getAdapterPosition()));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<HelpInsuranceVO.TabVO, ItemHelpInsuranceTabBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<HelpInsuranceVO.TabVO, ItemHelpInsuranceTabBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        LinearLayout constraintLayout = adapterDelegateViewBinding.getBinding().getConstraintLayout();
        final Function1<Integer, Unit> function1 = this.$clickHandler;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation.adapters.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HelpInsuranceTabAdapterDelegateKt$helpInsuranceTabAdapterDelegate$2.invoke$lambda$0(Function1.this, adapterDelegateViewBinding, view);
            }
        });
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding));
    }
}

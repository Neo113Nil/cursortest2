package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.trains.delegate;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.DropDownItem;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.view.DropDownView;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/DropDownItem;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainRoute/v2/presentation/view/DropDownView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelTrainRouteDropDownAdapterDelegateKt$travelTrainRouteDropDownAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<DropDownItem, TypedViewBinding<DropDownView>>, Unit> {
    final /* synthetic */ Function0<Unit> $onClick;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.trains.delegate.TravelTrainRouteDropDownAdapterDelegateKt$travelTrainRouteDropDownAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<DropDownItem, TypedViewBinding<DropDownView>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<DropDownItem, TypedViewBinding<DropDownView>> adapterDelegateViewBindingViewHolder) {
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
            this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout().bind(this.$this_adapterDelegateViewBinding.getItem());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelTrainRouteDropDownAdapterDelegateKt$travelTrainRouteDropDownAdapterDelegate$2(Function0<Unit> function0) {
        super(1);
        this.$onClick = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<DropDownItem, TypedViewBinding<DropDownView>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<DropDownItem, TypedViewBinding<DropDownView>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        DropDownView constraintLayout = adapterDelegateViewBinding.getBinding().getConstraintLayout();
        final Function0<Unit> function0 = this.$onClick;
        DropDownView dropDownView = constraintLayout;
        Context context = dropDownView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ColorStateList valueOf = ColorStateList.valueOf(ThemeExtKt.themeColor(context, R$attr.bgActionSecondary));
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        dropDownView.setForeground(new RippleDrawable(valueOf, null, new ColorDrawable(-1)));
        dropDownView.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelTrainRoute.v2.presentation.adapter.trains.delegate.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TravelTrainRouteDropDownAdapterDelegateKt$travelTrainRouteDropDownAdapterDelegate$2.invoke$lambda$1$lambda$0(Function0.this, view);
            }
        });
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding));
    }
}

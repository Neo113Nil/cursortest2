package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.tabs;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.avia.databinding.ItemAdditionalLuggageTabV2Binding;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$PassengerTabVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/adapter/tabs/PassengerVO;", "Lru/ozon/app/android/travel/feature/avia/databinding/ItemAdditionalLuggageTabV2Binding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AdditionalLuggageV2TabAdapterDelegateKt$additionalLuggageV2TabAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.PassengerTabVO, ItemAdditionalLuggageTabV2Binding>, Unit> {
    final /* synthetic */ Function1<Integer, Unit> $onTabClickedListener;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "payloads", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.tabs.AdditionalLuggageV2TabAdapterDelegateKt$additionalLuggageV2TabAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ int $addedIndicatorColor;
        final /* synthetic */ int $defaultBorderColor;
        final /* synthetic */ int $defaultIndicatorColor;
        final /* synthetic */ AccelerateDecelerateInterpolator $interpolator;
        final /* synthetic */ int $selectedBorderColor;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.PassengerTabVO, ItemAdditionalLuggageTabV2Binding> $this_adapterDelegateViewBinding;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.tabs.AdditionalLuggageV2TabAdapterDelegateKt$additionalLuggageV2TabAdapterDelegate$2$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<Integer, Unit> {
            AnonymousClass1(Object obj) {
                super(1, obj, ConstraintLayoutWithBorder.class, "setBorderColor", "setBorderColor(Ljava/lang/Integer;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke2(num);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Integer num) {
                ((ConstraintLayoutWithBorder) this.receiver).setBorderColor(num);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.tabs.AdditionalLuggageV2TabAdapterDelegateKt$additionalLuggageV2TabAdapterDelegate$2$2$2, reason: invalid class name and collision with other inner class name */
        static final class C18842 extends AbstractC7737t implements Function1<Integer, Unit> {
            final /* synthetic */ AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.PassengerTabVO, ItemAdditionalLuggageTabV2Binding> $this_adapterDelegateViewBinding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18842(AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.PassengerTabVO, ItemAdditionalLuggageTabV2Binding> adapterDelegateViewBindingViewHolder) {
                super(1);
                this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(int i11) {
                this.$this_adapterDelegateViewBinding.getBinding().additionalLuggageV2AddedLuggageIndicatorView.setColor(i11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.PassengerTabVO, ItemAdditionalLuggageTabV2Binding> adapterDelegateViewBindingViewHolder, int i11, int i12, AccelerateDecelerateInterpolator accelerateDecelerateInterpolator, int i13, int i14) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$selectedBorderColor = i11;
            this.$defaultBorderColor = i12;
            this.$interpolator = accelerateDecelerateInterpolator;
            this.$addedIndicatorColor = i13;
            this.$defaultIndicatorColor = i14;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> payloads) {
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            if (payloads.size() != 1) {
                this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout().setBorderColor(Integer.valueOf(this.$this_adapterDelegateViewBinding.getItem().getIsSelected() ? this.$selectedBorderColor : this.$defaultBorderColor));
                TextAtomView additionalLuggageV2TabTitleTextView = this.$this_adapterDelegateViewBinding.getBinding().additionalLuggageV2TabTitleTextView;
                Intrinsics.checkNotNullExpressionValue(additionalLuggageV2TabTitleTextView, "additionalLuggageV2TabTitleTextView");
                TextAtomHolderKt.bind$default(additionalLuggageV2TabTitleTextView, this.$this_adapterDelegateViewBinding.getItem().getTitle(), null, 2, null);
                this.$this_adapterDelegateViewBinding.getBinding().additionalLuggageV2AddedLuggageIndicatorView.setColor(this.$this_adapterDelegateViewBinding.getItem().getHasAddedLuggage() ? this.$addedIndicatorColor : this.$defaultIndicatorColor);
                return;
            }
            Object K11 = C7714v.K(payloads);
            if (Intrinsics.d(K11, "PassengerTabPayloadBorder")) {
                AdditionalLuggageV2TabAdapterDelegateKt$additionalLuggageV2TabAdapterDelegate$2.invoke$startArgbAnimation(this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout().getBorderColor(), this.$this_adapterDelegateViewBinding.getItem().getIsSelected() ? this.$selectedBorderColor : this.$defaultBorderColor, this.$interpolator, new AnonymousClass1(this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout()));
            } else if (Intrinsics.d(K11, "PassengerTabPayloadIndicator")) {
                AdditionalLuggageV2TabAdapterDelegateKt$additionalLuggageV2TabAdapterDelegate$2.invoke$startArgbAnimation(this.$this_adapterDelegateViewBinding.getBinding().additionalLuggageV2AddedLuggageIndicatorView.getColor(), this.$this_adapterDelegateViewBinding.getItem().getHasAddedLuggage() ? this.$addedIndicatorColor : this.$defaultIndicatorColor, this.$interpolator, new C18842(this.$this_adapterDelegateViewBinding));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AdditionalLuggageV2TabAdapterDelegateKt$additionalLuggageV2TabAdapterDelegate$2(Function1<? super Integer, Unit> function1) {
        super(1);
        this.$onTabClickedListener = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Function1 function1, AdapterDelegateViewBindingViewHolder adapterDelegateViewBindingViewHolder, View view) {
        function1.invoke(Integer.valueOf(adapterDelegateViewBindingViewHolder.getAdapterPosition()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$startArgbAnimation(int i11, int i12, Interpolator interpolator, final Function1<? super Integer, Unit> function1) {
        ValueAnimator duration = ValueAnimator.ofArgb(i11, i12).setDuration(300L);
        duration.setInterpolator(interpolator);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.tabs.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AdditionalLuggageV2TabAdapterDelegateKt$additionalLuggageV2TabAdapterDelegate$2.invoke$startArgbAnimation$lambda$2$lambda$1(Function1.this, valueAnimator);
            }
        });
        duration.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$startArgbAnimation$lambda$2$lambda$1(Function1 function1, ValueAnimator valueAnimator) {
        function1.invoke((Integer) Bi.a.b(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Int"));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.PassengerTabVO, ItemAdditionalLuggageTabV2Binding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.PassengerTabVO, ItemAdditionalLuggageTabV2Binding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        int themeColor = ThemeExtKt.themeColor(adapterDelegateViewBinding.getContext(), R$attr.textPositive);
        int themeColor2 = ThemeExtKt.themeColor(adapterDelegateViewBinding.getContext(), R$attr.layerFloor0);
        int themeColor3 = ThemeExtKt.themeColor(adapterDelegateViewBinding.getContext(), R$attr.bgActionPrimary);
        int themeColor4 = ThemeExtKt.themeColor(adapterDelegateViewBinding.getContext(), R$attr.layerFloor0);
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        ConstraintLayoutWithBorder constraintLayout = adapterDelegateViewBinding.getBinding().getConstraintLayout();
        final Function1<Integer, Unit> function1 = this.$onTabClickedListener;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.tabs.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdditionalLuggageV2TabAdapterDelegateKt$additionalLuggageV2TabAdapterDelegate$2.invoke$lambda$0(Function1.this, adapterDelegateViewBinding, view);
            }
        });
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding, themeColor3, themeColor4, accelerateDecelerateInterpolator, themeColor, themeColor2));
    }
}
